package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.TokenType;
import java.lang.reflect.Method;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import org.jsoup.parser.Token.Tag;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.Comment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_parser_TokeniserTest {
    ///region Test suites for executable org.jsoup.parser.Tokeniser.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.returnsFrom {@code return emitPending;}
 *  */
    @Test
    public void testRead_ReturnEmitPending() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charBuffer = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        Token actual = tokeniser.read();
        
        assertNull(actual);
        
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.invokes {@link java.lang.StringBuilder#delete(int,int)}
 * @utbot.returnsFrom {@code return new Token.Character(str);}
 *  */
    @Test
    public void testRead_StringBuilderDelete() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charBuffer = new StringBuilder(" ");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        Token.Character actual = ((Token.Character) tokeniser.read());
        
        String string = " ";
        Token.Character expected = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        expected.type = type;
        
        String expectedData = expected.getData();
        String actualData = actual.getData();
        assertEquals(expectedData, actualData);
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:33)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:10)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\f'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:127)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:25)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charBuffer.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:45) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): True}
 * @utbot.invokes org.jsoup.parser.Tokeniser#error(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: error("Self closing flag not acknowledged");
 *  */
    @Test
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:222)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:37) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charBuffer.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException_4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -256);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -256);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CommentStartDash;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:212)
            org.jsoup.parser.TokeniserState$46.read(TokeniserState.java:1164)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charBuffer.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\uFFFF', '\u8000', ' ', ' ', ' ', ' ', ' ', ' ',
            ' '
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:45) */
        tokeniser.read();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method read()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tokeniser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
     */
    @Test
    public void testRead() {
        CharacterReader characterReader = new CharacterReader("10");
        ParseErrorList parseErrorList = new ParseErrorList(0, -1);
        Tokeniser tokeniser = new Tokeniser(characterReader, parseErrorList);
        
        Token.Character actual = ((Token.Character) tokeniser.read());
        
        String string = "10";
        Token.Character expected = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        expected.type = type;
        
        String expectedData = expected.getData();
        String actualData = actual.getData();
        assertEquals(expectedData, actualData);
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method read()
    
    @Test
    public void testRead1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0100', '\u0000', '\u0000'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\u0000\uFFFF");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        TokeniserState initialTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        
        Token.Character actual = ((Token.Character) tokeniser.read());
        
        String string = "\u0000\uFFFF\u0100";
        Token.Character expected = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        expected.type = type;
        
        String expectedData = expected.getData();
        String actualData = actual.getData();
        assertEquals(expectedData, actualData);
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "pos"));
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserState == finalTokeniserState);
        
        assertEquals(1, finalTokeniserReaderPos);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    @Test
    public void testRead2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\uFFFF', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        TokeniserState initialTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        Token.Character actual = ((Token.Character) tokeniser.read());
        
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Token.Character expected = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        expected.type = type;
        
        String expectedData = expected.getData();
        String actualData = actual.getData();
        assertEquals(expectedData, actualData);
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserState == finalTokeniserState);
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read()
    
    @Test
    public void testRead3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[37];
        input[34] = '\t';
        input[35] = '\r';
        input[36] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.BeforeDoctypePublicIdentifier;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:37)
            org.jsoup.parser.TokeniserState$57.read(TokeniserState.java:1478)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[29];
        input[26] = '\f';
        input[27] = '\f';
        input[28] = '\'';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 63);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 26);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.PLAINTEXT;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 29]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:70)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:101)
            org.jsoup.parser.TokeniserState$7.read(TokeniserState.java:131)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[13];
        input[10] = '\t';
        input[11] = '\t';
        input[12] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 47);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 10);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CdataSection;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:88)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:112)
            org.jsoup.parser.TokeniserState$67.read(TokeniserState.java:1787)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0000', ' ', '\r', '\'', '\u0000', '\u0000'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.BogusDoctype;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:37)
            org.jsoup.parser.TokeniserState$66.read(TokeniserState.java:1769)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead7() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[38];
        input[35] = '\r';
        input[36] = ' ';
        input[37] = '\'';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 71);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 35);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Rawtext;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 38]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:127)
            org.jsoup.parser.TokeniserState$5.read(TokeniserState.java:92)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead8() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[26];
        input[24] = '\u8000';
        input[25] = '&';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 59);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 24);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u8000");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:233)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:105)
            org.jsoup.parser.TokeniserState$2.read(TokeniserState.java:34)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead9() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\uFFFF', '\u0800', '\uFFFF', '\uFFFF', '\uFFFF', '\uFFFF', '\uFFFF', '\uFFFF',
            '\uFFFF', '\uFFFF'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:76)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:26)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead10() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:10)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead11() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[37];
        input[34] = ' ';
        input[35] = '\r';
        input[36] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CharacterReferenceInRcdata;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:80)
            org.jsoup.parser.TokeniserState$4.read(TokeniserState.java:71)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead12() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\"', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 4);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CharacterReferenceInRcdata;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:80)
            org.jsoup.parser.TokeniserState$4.read(TokeniserState.java:71)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead13() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[38];
        input[34] = '\f';
        input[35] = '\t';
        input[36] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.BeforeDoctypePublicIdentifier;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207)
            org.jsoup.parser.TokeniserState$57.read(TokeniserState.java:1484)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead14() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[39];
        input[37] = '\r';
        input[38] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 37);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.BeforeDoctypePublicIdentifier;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:212)
            org.jsoup.parser.TokeniserState$57.read(TokeniserState.java:1494)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead15() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[12];
        input[2] = '\n';
        input[3] = '\f';
        input[4] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 7);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 2);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.ScriptDataDoubleEscapeEnd;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$33.read(TokeniserState.java:740)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead16() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[39];
        input[37] = ' ';
        input[38] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 37);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.EndTagOpen;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207)
            org.jsoup.parser.TokeniserState$9.read(TokeniserState.java:176)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead17() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[39];
        input[37] = '\n';
        input[38] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 37);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.AttributeValue_doubleQuoted;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$38.read(TokeniserState.java:935)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead18() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '&', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.AttributeValue_doubleQuoted;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$38.read(TokeniserState.java:947)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead19() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[29];
        input[26] = ' ';
        input[27] = '\f';
        input[28] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 29);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 26);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.RawtextEndTagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$16.anythingElse(TokeniserState.java:347)
            org.jsoup.parser.TokeniserState$16.read(TokeniserState.java:343)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead20() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[14];
        input[7] = ' ';
        input[8] = ' ';
        input[9] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 47);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 7);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.AfterAttributeName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207)
            org.jsoup.parser.TokeniserState$36.read(TokeniserState.java:871)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead21() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[37];
        input[34] = ' ';
        input[35] = '\f';
        input[36] = '\'';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.DoctypeName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207)
            org.jsoup.parser.TokeniserState$54.read(TokeniserState.java:1392)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead22() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[12];
        input[0] = '\t';
        input[1] = '\f';
        input[2] = '\"';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CommentEndBang;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$50.read(TokeniserState.java:1275)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead23() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[35];
        input[26] = '\u8000';
        input[27] = '<';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 31);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 26);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u8000");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207)
            org.jsoup.parser.TokeniserState$8.read(TokeniserState.java:155)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead24() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[0] = '\uFFFF';
        input[1] = '\u0001';
        input[2] = '&';
        input[3] = '\uFFFF';
        input[4] = '\uFFFF';
        input[5] = '\uFFFF';
        input[6] = '\uFFFF';
        input[7] = '\uFFFF';
        input[8] = '\uFFFF';
        input[9] = '\uFFFF';
        input[10] = '\uFFFF';
        input[11] = '\uFFFF';
        input[12] = '\uFFFF';
        input[13] = '\uFFFF';
        input[14] = '\uFFFF';
        input[15] = '\uFFFF';
        input[16] = '\uFFFF';
        input[17] = '\uFFFF';
        input[18] = '\uFFFF';
        input[19] = '\uFFFF';
        input[20] = '\uFFFF';
        input[21] = '\uFFFF';
        input[22] = '\uFFFF';
        input[23] = '\uFFFF';
        input[24] = '\uFFFF';
        input[25] = '\uFFFF';
        input[26] = '\uFFFF';
        input[27] = '\uFFFF';
        input[28] = '\uFFFF';
        input[29] = '\uFFFF';
        input[30] = '\uFFFF';
        input[31] = '\uFFFF';
        input[32] = '\uFFFF';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.ScriptDataEscapedDashDash;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\uFFFF\uFFFF\u0002\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:212)
            org.jsoup.parser.TokeniserState$22.read(TokeniserState.java:444)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead25() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[0] = '\uFFFF';
        input[1] = '\uFFFF';
        input[2] = '\uFFFF';
        input[3] = '\uFFFF';
        input[4] = '\uFFFF';
        input[5] = '\uFFFF';
        input[6] = '\uFFFF';
        input[7] = '\uFFFF';
        input[8] = '\uFFFF';
        input[9] = '\uFFFF';
        input[10] = '\uFFFF';
        input[11] = '\u0001';
        input[12] = '<';
        input[13] = '\uFFFF';
        input[14] = '\uFFFF';
        input[15] = '\uFFFF';
        input[16] = '\uFFFF';
        input[17] = '\uFFFF';
        input[18] = '\uFFFF';
        input[19] = '\uFFFF';
        input[20] = '\uFFFF';
        input[21] = '\uFFFF';
        input[22] = '\uFFFF';
        input[23] = '\uFFFF';
        input[24] = '\uFFFF';
        input[25] = '\uFFFF';
        input[26] = '\uFFFF';
        input[27] = '\uFFFF';
        input[28] = '\uFFFF';
        input[29] = '\uFFFF';
        input[30] = '\uFFFF';
        input[31] = '\uFFFF';
        input[32] = '\uFFFF';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 15);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 11);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.ScriptDataEscaped;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\u0002\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:212)
            org.jsoup.parser.TokeniserState$22.read(TokeniserState.java:444)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead26() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.RawtextEndTagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$16.anythingElse(TokeniserState.java:347)
            org.jsoup.parser.TokeniserState$16.read(TokeniserState.java:343)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    @Test
    public void testRead27() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[0] = '\uFFFF';
        input[1] = '\u0001';
        input[2] = '\uFFFF';
        input[3] = '\uFFFF';
        input[4] = '\uFFFF';
        input[5] = '\uFFFF';
        input[6] = '\uFFFF';
        input[7] = '\uFFFF';
        input[8] = '\uFFFF';
        input[9] = '\uFFFF';
        input[10] = '\uFFFF';
        input[11] = '\uFFFF';
        input[12] = '\uFFFF';
        input[13] = '\uFFFF';
        input[14] = '\uFFFF';
        input[15] = '\uFFFF';
        input[16] = '\uFFFF';
        input[17] = '\uFFFF';
        input[18] = '\uFFFF';
        input[19] = '\uFFFF';
        input[20] = '\uFFFF';
        input[21] = '\uFFFF';
        input[22] = '\uFFFF';
        input[23] = '\uFFFF';
        input[24] = '\uFFFF';
        input[25] = '\uFFFF';
        input[26] = '\uFFFF';
        input[27] = '\uFFFF';
        input[28] = '\uFFFF';
        input[29] = '\uFFFF';
        input[30] = '\uFFFF';
        input[31] = '\uFFFF';
        input[32] = '\uFFFF';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.AfterDoctypePublicKeyword;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charBuffer = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207)
            org.jsoup.parser.TokeniserState$55.read(TokeniserState.java:1433)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.getState
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getState()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#getState()}
 * @utbot.returnsFrom {@code return state;}
 *  */
    @Test
    public void testGetState_ReturnState() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        TokeniserState actual = tokeniser.getState();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.error
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method error(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#canAddError()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: errors.canAddError()
 *  */
    @Test
    public void testError_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:207) */
        tokeniser.error(((TokeniserState) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.error
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method error(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#canAddError()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: errors.canAddError()
 *  */
    @Test
    public void testError_ThrowNullPointerException1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:222) */
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Class stringType = Class.forName("java.lang.String");
        Method errorMethod = tokeniserClazz.getDeclaredMethod("error", stringType);
        errorMethod.setAccessible(true);
        java.lang.Object[] errorMethodArguments = new java.lang.Object[1];
        errorMethodArguments[0] = ((Object) null);
        try {
            errorMethod.invoke(tokeniser, errorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.transition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transition(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#transition(org.jsoup.parser.TokeniserState)}
 *  */
    @Test
    public void testTransition() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        
        tokeniser.transition(null);
        
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        
        assertNull(finalTokeniserState);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emitTagPending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emitTagPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emitTagPending();
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emitTagPending();
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        tagPending.selfClosing = true;
        Token.TokenType type = Token.TokenType.StartTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emitTagPending();
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emitTagPending();
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emitTagPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(tagPending);
 *  */
    @Test
    public void testEmitTagPending_ThrowClassCastException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:67)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:173) */
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(tagPending);
 *  */
    @Test
    public void testEmitTagPending_ThrowClassCastException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:62)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:173) */
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tagPending.finaliseTag();
 *  */
    @Test
    public void testEmitTagPending_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:172) */
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: emit(tagPending);
 *  */
    @Test
    public void testEmitTagPending_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:222)
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:69)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:173) */
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emitTagPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(tagPending);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method emitTagPending()
    
    @Test
    public void testEmitTagPending1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "[[K\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "@\u0000!";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "!\u0000\u0000\u0001\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "[";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "K";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000KKKKKKKK");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emitTagPending()
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.createTagPending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createTagPending(boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTagPending(boolean)}
 * @utbot.executesCondition {@code (start): False}
 * @utbot.returnsFrom {@code return tagPending;}
 *  */
    @Test
    public void testCreateTagPending_NotStart() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Token.EndTag actual = ((Token.EndTag) tokeniser.createTagPending(false));
        
        Token.EndTag expected = new Token.EndTag(null);
        expected.selfClosing = false;
        Token.TokenType type = Token.TokenType.EndTag;
        expected.type = type;
        
        String actualTagName = actual.tagName;
        assertNull(actualTagName);
        
        String actualPendingAttributeName = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        assertNull(actualPendingAttributeName);
        
        StringBuilder actualPendingAttributeValue = ((StringBuilder) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        assertNull(actualPendingAttributeValue);
        
        boolean actualSelfClosing = actual.selfClosing;
        assertFalse(actualSelfClosing);
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTagPending(boolean)}
 * @utbot.executesCondition {@code (start): True}
 * @utbot.returnsFrom {@code return tagPending;}
 *  */
    @Test
    public void testCreateTagPending_Start() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Token.StartTag actual = ((Token.StartTag) tokeniser.createTagPending(true));
        
        Token.StartTag expected = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        expected.attributes = attributes;
        Token.TokenType type = Token.TokenType.StartTag;
        expected.type = type;
        
        String actualTagName = actual.tagName;
        assertNull(actualTagName);
        
        String actualPendingAttributeName = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        assertNull(actualPendingAttributeName);
        
        StringBuilder actualPendingAttributeValue = ((StringBuilder) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        assertNull(actualPendingAttributeValue);
        
        boolean actualSelfClosing = actual.selfClosing;
        assertFalse(actualSelfClosing);
        
        Attributes expectedAttributes = expected.attributes;
        Attributes actualAttributes = actual.attributes;
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.advanceTransition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method advanceTransition(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#advanceTransition(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#advance()}
 *  */
    @Test
    public void testAdvanceTransition_CharacterReaderAdvance() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 2);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.advanceTransition(null);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(3, finalTokeniserReaderPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method advanceTransition(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#advanceTransition(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#advance()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reader.advance();
 *  */
    @Test
    public void testAdvanceTransition_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.advanceTransition] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.advanceTransition(Tokeniser.java:92) */
        tokeniser.advanceTransition(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emit(char)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 *  */
    @Test
    public void testEmit_StringBuilderAppend() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        StringBuilder charBuffer = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        
        tokeniser.emit(' ');
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emit(char)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charBuffer.append(c);
 *  */
    @Test
    public void testEmit_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:80) */
        tokeniser.emit(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emit(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 *  */
    @Test
    public void testEmit_StringBuilderAppend1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        StringBuilder charBuffer = new StringBuilder("                               ");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charBuffer", charBuffer);
        
        tokeniser.emit(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emit(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: charBuffer.append(str);
 *  */
    @Test
    public void testEmit_ThrowNullPointerException1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:76) */
        tokeniser.emit(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emit(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): False}
 *  */
    @Test
    public void testEmit_TokenTypeNotEqualsTokenTokenTypeEndTag() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emit(doctype);
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): True}
 * @utbot.executesCondition {@code (endTag.attributes != null): False}
 *  */
    @Test
    public void testEmit_EndTagAttributesEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endTag = new Token.EndTag(null);
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emit(endTag);
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): True}
 * @utbot.executesCondition {@code (startTag.selfClosing): False}
 *  */
    @Test
    public void testEmit_NotStartTagSelfClosing() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.selfClosing = false;
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emit(startTag);
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): True}
 * @utbot.executesCondition {@code (startTag.selfClosing): True}
 *  */
    @Test
    public void testEmit_StartTagSelfClosing() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.selfClosing = true;
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emit(startTag);
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emit(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Token.StartTag startTag = (Token.StartTag) token;
 *  */
    @Test
    public void testEmit_ThrowClassCastException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.StartTag;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:62) */
        tokeniser.emit(doctype);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Token.EndTag endTag = (Token.EndTag) token;
 *  */
    @Test
    public void testEmit_ThrowClassCastException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Character character = new Token.Character(null);
        Token.TokenType type = Token.TokenType.EndTag;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:67) */
        tokeniser.emit(character);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.type == Token.TokenType.StartTag
 *  */
    @Test
    public void testEmit_ThrowNullPointerException2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:61) */
        tokeniser.emit(null);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): True}
 * @utbot.executesCondition {@code (endTag.attributes != null): True}
 * @utbot.invokes org.jsoup.parser.Tokeniser#error(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: error("Attributes incorrectly present on end tag");
 *  */
    @Test
    public void testEmit_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endTag = new Token.EndTag(null);
        Attributes attributes = new Attributes();
        endTag.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:222)
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:69) */
        tokeniser.emit(endTag);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emit(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isFalse(boolean,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isFalse(isEmitPending, "There is an unread token pending!");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmit_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        
        tokeniser.emit(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emitDoctypePending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emitDoctypePending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitDoctypePending()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 *  */
    @Test
    public void testEmitDoctypePending_TokeniserEmit() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype doctypePending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        tokeniser.doctypePending = doctypePending;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emitDoctypePending();
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emitDoctypePending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitDoctypePending()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(doctypePending);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitDoctypePending_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        
        tokeniser.emitDoctypePending();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emitDoctypePending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitDoctypePending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(doctypePending);
 *  */
    @Test
    public void testEmitDoctypePending_ThrowClassCastException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype doctypePending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.EndTag;
        doctypePending.type = type;
        tokeniser.doctypePending = doctypePending;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitDoctypePending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:67)
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:189) */
        tokeniser.emitDoctypePending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitDoctypePending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(doctypePending);
 *  */
    @Test
    public void testEmitDoctypePending_ThrowClassCastException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype doctypePending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.StartTag;
        doctypePending.type = type;
        tokeniser.doctypePending = doctypePending;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitDoctypePending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:62)
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:189) */
        tokeniser.emitDoctypePending();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.eofError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method eofError(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#eofError(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#canAddError()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: errors.canAddError()
 *  */
    @Test
    public void testEofError_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.eofError] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:212) */
        tokeniser.eofError(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emitCommentPending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emitCommentPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitCommentPending()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 *  */
    @Test
    public void testEmitCommentPending_TokeniserEmit() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment commentPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        tokeniser.commentPending = commentPending;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emitCommentPending();
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emitCommentPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitCommentPending()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(commentPending);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitCommentPending_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        
        tokeniser.emitCommentPending();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emitCommentPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitCommentPending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(commentPending);
 *  */
    @Test
    public void testEmitCommentPending_ThrowClassCastException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment commentPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        Token.TokenType type = Token.TokenType.EndTag;
        commentPending.type = type;
        tokeniser.commentPending = commentPending;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitCommentPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:67)
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:181) */
        tokeniser.emitCommentPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitCommentPending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(commentPending);
 *  */
    @Test
    public void testEmitCommentPending_ThrowClassCastException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment commentPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        Token.TokenType type = Token.TokenType.StartTag;
        commentPending.type = type;
        tokeniser.commentPending = commentPending;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitCommentPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:62)
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:181) */
        tokeniser.emitCommentPending();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.createTempBuffer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createTempBuffer()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTempBuffer()}
 *  */
    @Test
    public void testCreateTempBuffer() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        StringBuilder initialTokeniserDataBuffer = tokeniser.dataBuffer;
        
        tokeniser.createTempBuffer();
        
        StringBuilder finalTokeniserDataBuffer = tokeniser.dataBuffer;
        
        assertFalse(initialTokeniserDataBuffer == finalTokeniserDataBuffer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.acknowledgeSelfClosingFlag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acknowledgeSelfClosingFlag()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#acknowledgeSelfClosingFlag()}
 *  */
    @Test
    public void testAcknowledgeSelfClosingFlag() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        tokeniser.acknowledgeSelfClosingFlag();
        
        boolean finalTokeniserSelfClosingFlagAcknowledged = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged"));
        
        assertTrue(finalTokeniserSelfClosingFlagAcknowledged);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.currentNodeInHtmlNS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentNodeInHtmlNS()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#currentNodeInHtmlNS()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCurrentNodeInHtmlNS_ReturnTrue() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        boolean actual = tokeniser.currentNodeInHtmlNS();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.isAppropriateEndTagToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAppropriateEndTagToken()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.executesCondition {@code (lastStartTag == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsAppropriateEndTagToken_LastStartTagEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        boolean actual = tokeniser.isAppropriateEndTagToken();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.executesCondition {@code (lastStartTag == null): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return tagPending.tagName.equals(lastStartTag.tagName);}
 *  */
    @Test
    public void testIsAppropriateEndTagToken_LastStartTagNotEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = " ";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", tagPending);
        
        boolean actual = tokeniser.isAppropriateEndTagToken();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAppropriateEndTagToken()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tagPending.tagName.equals(lastStartTag.tagName);
 *  */
    @Test
    public void testIsAppropriateEndTagToken_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag lastStartTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.isAppropriateEndTagToken] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.isAppropriateEndTagToken(Tokeniser.java:199) */
        tokeniser.isAppropriateEndTagToken();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tagPending.tagName.equals(lastStartTag.tagName);
 *  */
    @Test
    public void testIsAppropriateEndTagToken_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.isAppropriateEndTagToken] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.isAppropriateEndTagToken(Tokeniser.java:199) */
        tokeniser.isAppropriateEndTagToken();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.consumeCharacterReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumeCharacterReference(java.lang.Character, boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 *  */
    @Test
    public void testConsumeCharacterReference_ReturnNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 *  */
    @Test
    public void testConsumeCharacterReference_AdditionalAllowedCharacterEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\t'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 *  */
    @Test
    public void testConsumeCharacterReference_ReturnNull_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        Character actual = tokeniser.consumeCharacterReference(character, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 *  */
    @Test
    public void testConsumeCharacterReference_AdditionalAllowedCharacterNotEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[32];
        input[0] = '\t';
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
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = 'v';
        
        Character actual = tokeniser.consumeCharacterReference(character, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeCharacterReference(java.lang.Character, boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: additionalAllowedCharacter != null && additionalAllowedCharacter == reader.current()
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:33)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:103) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String nameRef = reader.consumeLetterThenDigitSequence();
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', ' ', ' ', ' ', ' ', 'B'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 8193);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 5);
        setField(reader, "org.jsoup.parser.CharacterReader", "mark", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '=';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:158)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:135) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: reader.matchesAny('\t', '\n', '\r', '\f', ' ', '<', '&')
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0000', '\u0000'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:233)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:105) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String nameRef = reader.consumeLetterThenDigitSequence();
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'#', '9'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 5);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:165)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:135) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: reader.isEmpty()
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:101) */
        tokeniser.consumeCharacterReference(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method consumeCharacterReference(java.lang.Character, boolean)
    
    @Test
    public void testConsumeCharacterReference1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u0000'};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1073741824);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
    }
    
    @Test
    public void testConsumeCharacterReference2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[24];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '|';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1073741833);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 9);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderMark = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "mark"));
        
        assertEquals(9, finalTokeniserReaderMark);
    }
    
    @Test
    public void testConsumeCharacterReference3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[24];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '{';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1073741833);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 9);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        Character actual = tokeniser.consumeCharacterReference(character, false);
        
        assertNull(actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderMark = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "mark"));
        
        assertEquals(9, finalTokeniserReaderMark);
    }
    
    @Test
    public void testConsumeCharacterReference4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[24];
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1073741833);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 9);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        Character actual = tokeniser.consumeCharacterReference(character, false);
        
        assertNull(actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderMark = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "mark"));
        
        assertEquals(9, finalTokeniserReaderMark);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method consumeCharacterReference(java.lang.Character, boolean)
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testConsumeCharacterReference5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[39];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = '#';
        input[35] = '#';
        input[36] = '#';
        input[37] = '0';
        input[38] = '2';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 37);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0010';
        
        tokeniser.consumeCharacterReference(character, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[39];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = 'J';
        input[7] = '0';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = '#';
        input[35] = '#';
        input[36] = '#';
        input[37] = '#';
        input[38] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 11);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 6);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        tokeniser.consumeCharacterReference(character, false);
    }
    
    @Test
    public void testConsumeCharacterReference7() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[37];
        input[34] = 'A';
        input[35] = 'k';
        input[36] = '0';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 38);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:165)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:135) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference8() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[0] = '#';
        input[1] = 'n';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        tokeniser.consumeCharacterReference(character, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference9() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[37];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = 'a';
        input[35] = 'K';
        input[36] = '\u8000';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 38);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        tokeniser.consumeCharacterReference(character, false);
    }
    
    @Test
    public void testConsumeCharacterReference10() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[37];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = 'P';
        input[35] = 'K';
        input[36] = 'k';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 38);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 34);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 37 out of bounds for length 37]
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:158)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:135) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference11() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[21];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = 'k';
        input[13] = 'K';
        input[14] = 'k';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 78);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 12);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.consumeCharacterReference(null, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference12() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = 'P';
        input[32] = 'K';
        input[33] = '{';
        input[34] = '#';
        input[35] = '#';
        input[36] = '#';
        input[37] = '#';
        input[38] = '#';
        input[39] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 43);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 31);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.consumeCharacterReference(null, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference13() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[11];
        input[0] = 'n';
        input[1] = 'K';
        input[2] = 'k';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.consumeCharacterReference(null, false);
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testConsumeCharacterReference14() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = 'p';
        input[8] = '2';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = '#';
        input[35] = '#';
        input[36] = '#';
        input[37] = '#';
        input[38] = '#';
        input[39] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 9);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 7);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.consumeCharacterReference(null, false);
    }
    
    @Test
    public void testConsumeCharacterReference15() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = '#';
        input[35] = '#';
        input[36] = '#';
        input[37] = '#';
        input[38] = '#';
        input[39] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 40);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 39);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = '\u0001';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:217)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:113) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
    @Test
    public void testConsumeCharacterReference16() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = '#';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        input[16] = '#';
        input[17] = '#';
        input[18] = '#';
        input[19] = '#';
        input[20] = '#';
        input[21] = '#';
        input[22] = '#';
        input[23] = '#';
        input[24] = '#';
        input[25] = '#';
        input[26] = '#';
        input[27] = '#';
        input[28] = '#';
        input[29] = '#';
        input[30] = '#';
        input[31] = '#';
        input[32] = '#';
        input[33] = '#';
        input[34] = '#';
        input[35] = '#';
        input[36] = '#';
        input[37] = '#';
        input[38] = '#';
        input[39] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 40);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 39);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:217)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:113) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    @Test
    public void testConsumeCharacterReference17() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[16];
        input[0] = '#';
        input[1] = '#';
        input[2] = '#';
        input[3] = '#';
        input[4] = '#';
        input[5] = '#';
        input[6] = '#';
        input[7] = '#';
        input[8] = '#';
        input[9] = ';';
        input[10] = '#';
        input[11] = '#';
        input[12] = '#';
        input[13] = '#';
        input[14] = '#';
        input[15] = '#';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1073741833);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 9);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:217)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:152) */
        tokeniser.consumeCharacterReference(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.appropriateEndTagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appropriateEndTagName()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#appropriateEndTagName()}
 * @utbot.returnsFrom {@code return lastStartTag.tagName;}
 *  */
    @Test
    public void testAppropriateEndTagName_ReturnLastStartTagTagName() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag lastStartTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        String actual = tokeniser.appropriateEndTagName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appropriateEndTagName()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#appropriateEndTagName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return lastStartTag.tagName;
 *  */
    @Test
    public void testAppropriateEndTagName_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.appropriateEndTagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.appropriateEndTagName(Tokeniser.java:203) */
        tokeniser.appropriateEndTagName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.createCommentPending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCommentPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createCommentPending()}
 *  */
    @Test
    public void testCreateCommentPending() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        Token.Comment initialTokeniserCommentPending = tokeniser.commentPending;
        
        tokeniser.createCommentPending();
        
        Token.Comment finalTokeniserCommentPending = tokeniser.commentPending;
        
        assertFalse(initialTokeniserCommentPending == finalTokeniserCommentPending);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.characterReferenceError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method characterReferenceError(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#characterReferenceError(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#canAddError()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: errors.canAddError()
 *  */
    @Test
    public void testCharacterReferenceError_ThrowNullPointerException() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.characterReferenceError] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:217) */
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Class stringType = Class.forName("java.lang.String");
        Method characterReferenceErrorMethod = tokeniserClazz.getDeclaredMethod("characterReferenceError", stringType);
        characterReferenceErrorMethod.setAccessible(true);
        java.lang.Object[] characterReferenceErrorMethodArguments = new java.lang.Object[1];
        characterReferenceErrorMethodArguments[0] = ((Object) null);
        try {
            characterReferenceErrorMethod.invoke(tokeniser, characterReferenceErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.createDoctypePending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDoctypePending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createDoctypePending()}
 *  */
    @Test
    public void testCreateDoctypePending() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        Token.Doctype initialTokeniserDoctypePending = tokeniser.doctypePending;
        
        tokeniser.createDoctypePending();
        
        Token.Doctype finalTokeniserDoctypePending = tokeniser.doctypePending;
        
        assertFalse(initialTokeniserDoctypePending == finalTokeniserDoctypePending);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields997028835885200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields997028835885200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass997028835889600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields997028835885200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass997028835889600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields997028836334600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields997028836334600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass997028836336500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields997028836334600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass997028836336500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


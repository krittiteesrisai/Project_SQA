package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.TokenType;
import java.io.BufferedReader;
import org.jsoup.parser.Token.EOF;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.StartTag;
import java.io.InputStreamReader;
import sun.nio.cs.StreamDecoder;
import org.jsoup.UncheckedIOException;
import org.jsoup.parser.Token.Comment;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.Tag;
import java.lang.reflect.Method;
import java.io.StringReader;
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
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;

public final class org_jsoup_parser_TokeniserTest {
    ///region Test suites for executable org.jsoup.parser.Tokeniser.read
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method read()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (charsString != null): False}
 * @utbot.returnsFrom {@code return emitPending;}
 *  */
    @Test
    public void testRead_CharsStringEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        Token actual = tokeniser.read();
        
        assertNull(actual);
        
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(finalTokeniserIsEmitPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (charsString != null): True}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#data(java.lang.String)}
 * @utbot.returnsFrom {@code return token;}
 *  */
    @Test
    public void testRead_CharsStringNotEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        Token.Character actual = ((Token.Character) tokeniser.read());
        
        String charPendingData = charPending.getData();
        String actualData = actual.getData();
        assertEquals(charPendingData, actualData);
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:85)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:14)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' ', ' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:86)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:14)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charsBuilder.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:52) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:85)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:14)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (charsString != null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#data(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Token token = charPending.data(charsString);
 *  */
    @Test
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:58) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charsBuilder.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException_4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CommentEnd;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:244)
            org.jsoup.parser.TokeniserState$49.read(TokeniserState.java:1044)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method read()
    
    @Test
    public void testRead1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\uFFFF', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        TokeniserState initialTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        Token.EOF actual = ((Token.EOF) tokeniser.read());
        
        Token.EOF expected = new Token.EOF();
        Token.TokenType type = Token.TokenType.EOF;
        expected.type = type;
        
        Token.TokenType expectedType = expected.type;
        Token.TokenType actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        assertFalse(initialTokeniserState == finalTokeniserState);
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method read()
    
    @Test
    public void testRead2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:56) */
        tokeniser.read();
    }
    
    @Test
    public void testRead3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\u0000', '\u8000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:436)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:233)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:29)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    @Test
    public void testRead4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '\"', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CharacterReferenceInRcdata;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:436)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:292)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:167)
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1688)
            org.jsoup.parser.TokeniserState.access$100(TokeniserState.java:10)
            org.jsoup.parser.TokeniserState$4.read(TokeniserState.java:68)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    @Test
    public void testRead5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[40];
        charBuf[31] = '\'';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 32);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 62);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 31);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "";
        stringCache[38] = string;
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:52) */
        tokeniser.read();
    }
    
    @Test
    public void testRead6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[40];
        charBuf[31] = '\'';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 32);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 62);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 31);
        java.lang.String[] stringCache = new java.lang.String[39];
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:52) */
        tokeniser.read();
    }
    
    @Test
    public void testRead7() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[39];
        charBuf[37] = '\u0001';
        charBuf[38] = '<';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 38);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 37);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:436)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:233)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:29)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    @Test
    public void testRead8() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[39];
        charBuf[37] = '\u0001';
        charBuf[38] = '&';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 38);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 37);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:436)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:233)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:29)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    @Test
    public void testRead9() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader1, "java.io.BufferedReader", "in", reader1);
        char[] cb = new char[40];
        setField(reader1, "java.io.BufferedReader", "cb", cb);
        setField(reader1, "java.io.BufferedReader", "nChars", -2147483636);
        setField(reader1, "java.io.BufferedReader", "nextChar", 9);
        setField(reader1, "java.io.BufferedReader", "markedChar", 4);
        setField(reader1, "java.io.BufferedReader", "readAheadLimit", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147450877);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 32768);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:85)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:14)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    
    @Test
    public void testRead10() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", -2147483647);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.ScriptDataEndTagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1662)
            org.jsoup.parser.TokeniserState.access$500(TokeniserState.java:10)
            org.jsoup.parser.TokeniserState$19.read(TokeniserState.java:300)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:49) */
        tokeniser.read();
    }
    ///endregion
    
    ///region Errors report for read
    
    public void testRead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 20 occurrences of:
        // Concrete execution failed
        
        // 9 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
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
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:239) */
        tokeniser.error(null);
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
    public void testError_ThrowNullPointerException1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:254) */
        tokeniser.error(null);
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
        TokeniserState state = TokeniserState.ScriptDataEscapedEndTagOpen;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        
        tokeniser.transition(null);
        
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        
        assertNull(finalTokeniserState);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emit([C)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(char[])}
 *  */
    @Test
    public void testEmit() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        char[] charArray = {' '};
        
        tokeniser.emit(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(char[])}
 *  */
    @Test
    public void testEmit_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder(" ");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        char[] charArray = {};
        
        tokeniser.emit(charArray);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(char[])}
 *  */
    @Test
    public void testEmit_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        char[] charArray = {};
        
        tokeniser.emit(charArray);
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
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Comment;
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
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): True}
 * @utbot.executesCondition {@code (endTag.attributes != null): False}
 *  */
    @Test
    public void testEmit_EndTagAttributesEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
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
        Token.Character emitPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
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
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
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
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:74) */
        tokeniser.emit(endTag);
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
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.EndTag;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:79) */
        tokeniser.emit(character);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.type == Token.TokenType.StartTag
 *  */
    @Test
    public void testEmit_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:73) */
        tokeniser.emit(null);
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
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emit(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.executesCondition {@code (charsString == null): True}
 *  */
    @Test
    public void testEmit_CharsStringEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        tokeniser.emit(null);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.executesCondition {@code (charsString == null): False}
 * @utbot.executesCondition {@code (charsBuilder.length() == 0): False}
 *  */
    @Test
    public void testEmit_CharsBuilderLengthNotEqualsZero() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("         ");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        
        tokeniser.emit(null);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.executesCondition {@code (charsString == null): False}
 * @utbot.executesCondition {@code (charsBuilder.length() == 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 *  */
    @Test
    public void testEmit_CharsBuilderLengthEqualsZero() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        
        tokeniser.emit(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emit(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.executesCondition {@code (charsString == null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charsBuilder.length() == 0
 *  */
    @Test
    public void testEmit_ThrowNullPointerException1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:92) */
        tokeniser.emit(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emit([I)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(int[])}
 *  */
    @Test
    public void testEmit1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder(" ");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        int[] intArray = {};
        
        tokeniser.emit(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(int[])}
 *  */
    @Test
    public void testEmit_11() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        int[] intArray = {};
        
        tokeniser.emit(intArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method emit([I)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(int[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(new String(codepoints, 0, codepoints.length));
 *  */
    @Test
    public void testEmit_ThrowIllegalArgumentException1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        int[] intArray = {1073741824};
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.IllegalArgumentException: 1073741824]
            java.base/java.lang.StringUTF16.toBytes(StringUTF16.java:220)
            java.base/java.lang.String.<init>(String.java:352)
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:104) */
        tokeniser.emit(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: emit(new String(codepoints, 0, codepoints.length));
 *  */
    @Test
    public void testEmit_ThrowNullPointerException2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:104) */
        tokeniser.emit(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method emit([I)
    
    @Test
    public void testEmit2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        tokeniser.emit(intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emit
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method emit(char)
    
    @Test
    public void testEmit3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        tokeniser.emit('\u0000');
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
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.advanceTransition(null);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderBufPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        
        assertEquals(2, finalTokeniserReaderBufPos);
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
            org.jsoup.parser.Tokeniser.advanceTransition(Tokeniser.java:120) */
        tokeniser.advanceTransition(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.unescapeEntities
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unescapeEntities(boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return builder.toString();}
 *  */
    @Test
    public void testUnescapeEntities_StringBuilderToString() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", -255);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        String actual = tokeniser.unescapeEntities(false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unescapeEntities(boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: builder.append(reader.consumeTo('&'));
 *  */
    @Test
    public void testUnescapeEntities_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:124)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:161)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:273) */
        tokeniser.unescapeEntities(false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: builder.append(reader.consumeTo('&'));
 *  */
    @Test
    public void testUnescapeEntities_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:122)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:161)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:273) */
        tokeniser.unescapeEntities(false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: builder.append(reader.consumeTo('&'));
 *  */
    @Test
    public void testUnescapeEntities_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'&'};
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = {};
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:437)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:163)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:273) */
        tokeniser.unescapeEntities(false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!reader.isEmpty())
 *  */
    @Test
    public void testUnescapeEntities_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:272) */
        tokeniser.unescapeEntities(false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.append(reader.consumeTo('&'));
 *  */
    @Test
    public void testUnescapeEntities_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:436)
            org.jsoup.parser.CharacterReader.consumeToEnd(CharacterReader.java:255)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:167)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:273) */
        tokeniser.unescapeEntities(false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unescapeEntities(boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#unescapeEntities(boolean)}
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} 
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testUnescapeEntities_ThrowUncheckedIOException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader1, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader1, "java.io.BufferedReader", "cb", cb);
        setField(reader1, "java.io.BufferedReader", "nChars", 1);
        setField(reader1, "java.io.BufferedReader", "nextChar", 1);
        setField(reader1, "java.io.BufferedReader", "readAheadLimit", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 255);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.unescapeEntities(false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unescapeEntities(boolean)
    
    @Test
    public void testUnescapeEntities1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[33];
        charBuf[0] = '\uFFD8';
        charBuf[1] = '\uFFD8';
        charBuf[2] = '\uFFD8';
        charBuf[3] = '\uFFD8';
        charBuf[4] = '\uFFD8';
        charBuf[5] = '\uFFD8';
        charBuf[6] = '\uFFD8';
        charBuf[7] = '\uFFD8';
        charBuf[8] = '\uFFD8';
        charBuf[9] = '\uFFD8';
        charBuf[10] = '\uFFD8';
        charBuf[11] = '\uFFD8';
        charBuf[12] = '\uFFD8';
        charBuf[13] = '\uFFD8';
        charBuf[14] = '\uFFD8';
        charBuf[15] = '\uFFD8';
        charBuf[16] = '\uFFD8';
        charBuf[17] = '\uFFD8';
        charBuf[18] = '\uFFD8';
        charBuf[19] = '\uFFD8';
        charBuf[20] = '\uFFD8';
        charBuf[21] = '\uFFD8';
        charBuf[22] = '\uFFD8';
        charBuf[23] = '\uFFD8';
        charBuf[24] = '\uFFD8';
        charBuf[25] = '\uFFD8';
        charBuf[26] = '\uFFD8';
        charBuf[27] = '\uFFD8';
        charBuf[28] = '\uFFD8';
        charBuf[29] = '\uFFD8';
        charBuf[30] = '\uFFD8';
        charBuf[31] = '\'';
        charBuf[32] = '\uFFD8';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 32);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 62);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 31);
        java.lang.String[] stringCache = new java.lang.String[39];
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        String actual = tokeniser.unescapeEntities(false);
        
        String expected = "'";
        
        assertEquals(expected, actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderBufPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        CharacterReader tokeniserReader1 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader1ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader1, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache0 = ((String) get(tokeniserReader1ReaderStringCache, 0));
        CharacterReader tokeniserReader2 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader2ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader2, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache1 = ((String) get(tokeniserReader2ReaderStringCache, 1));
        CharacterReader tokeniserReader3 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader3ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader3, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache2 = ((String) get(tokeniserReader3ReaderStringCache, 2));
        CharacterReader tokeniserReader4 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader4ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader4, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache3 = ((String) get(tokeniserReader4ReaderStringCache, 3));
        CharacterReader tokeniserReader5 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader5ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader5, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache4 = ((String) get(tokeniserReader5ReaderStringCache, 4));
        CharacterReader tokeniserReader6 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader6ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader6, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache5 = ((String) get(tokeniserReader6ReaderStringCache, 5));
        CharacterReader tokeniserReader7 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader7ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader7, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache6 = ((String) get(tokeniserReader7ReaderStringCache, 6));
        CharacterReader tokeniserReader8 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader8ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader8, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache7 = ((String) get(tokeniserReader8ReaderStringCache, 7));
        CharacterReader tokeniserReader9 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader9ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader9, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache8 = ((String) get(tokeniserReader9ReaderStringCache, 8));
        CharacterReader tokeniserReader10 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader10ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader10, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache9 = ((String) get(tokeniserReader10ReaderStringCache, 9));
        CharacterReader tokeniserReader11 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader11ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader11, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache10 = ((String) get(tokeniserReader11ReaderStringCache, 10));
        CharacterReader tokeniserReader12 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader12ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader12, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache11 = ((String) get(tokeniserReader12ReaderStringCache, 11));
        CharacterReader tokeniserReader13 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader13ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader13, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache12 = ((String) get(tokeniserReader13ReaderStringCache, 12));
        CharacterReader tokeniserReader14 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader14ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader14, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache13 = ((String) get(tokeniserReader14ReaderStringCache, 13));
        CharacterReader tokeniserReader15 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader15ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader15, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache14 = ((String) get(tokeniserReader15ReaderStringCache, 14));
        CharacterReader tokeniserReader16 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader16ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader16, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache15 = ((String) get(tokeniserReader16ReaderStringCache, 15));
        CharacterReader tokeniserReader17 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader17ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader17, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache16 = ((String) get(tokeniserReader17ReaderStringCache, 16));
        CharacterReader tokeniserReader18 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader18ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader18, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache17 = ((String) get(tokeniserReader18ReaderStringCache, 17));
        CharacterReader tokeniserReader19 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader19ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader19, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache18 = ((String) get(tokeniserReader19ReaderStringCache, 18));
        CharacterReader tokeniserReader20 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader20ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader20, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache19 = ((String) get(tokeniserReader20ReaderStringCache, 19));
        CharacterReader tokeniserReader21 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader21ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader21, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache20 = ((String) get(tokeniserReader21ReaderStringCache, 20));
        CharacterReader tokeniserReader22 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader22ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader22, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache21 = ((String) get(tokeniserReader22ReaderStringCache, 21));
        CharacterReader tokeniserReader23 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader23ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader23, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache22 = ((String) get(tokeniserReader23ReaderStringCache, 22));
        CharacterReader tokeniserReader24 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader24ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader24, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache23 = ((String) get(tokeniserReader24ReaderStringCache, 23));
        CharacterReader tokeniserReader25 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader25ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader25, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache24 = ((String) get(tokeniserReader25ReaderStringCache, 24));
        CharacterReader tokeniserReader26 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader26ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader26, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache25 = ((String) get(tokeniserReader26ReaderStringCache, 25));
        CharacterReader tokeniserReader27 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader27ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader27, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache26 = ((String) get(tokeniserReader27ReaderStringCache, 26));
        CharacterReader tokeniserReader28 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader28ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader28, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache27 = ((String) get(tokeniserReader28ReaderStringCache, 27));
        CharacterReader tokeniserReader29 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader29ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader29, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache28 = ((String) get(tokeniserReader29ReaderStringCache, 28));
        CharacterReader tokeniserReader30 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader30ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader30, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache29 = ((String) get(tokeniserReader30ReaderStringCache, 29));
        CharacterReader tokeniserReader31 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader31ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader31, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache30 = ((String) get(tokeniserReader31ReaderStringCache, 30));
        CharacterReader tokeniserReader32 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader32ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader32, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache31 = ((String) get(tokeniserReader32ReaderStringCache, 31));
        CharacterReader tokeniserReader33 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader33ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader33, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache32 = ((String) get(tokeniserReader33ReaderStringCache, 32));
        CharacterReader tokeniserReader34 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader34ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader34, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache33 = ((String) get(tokeniserReader34ReaderStringCache, 33));
        CharacterReader tokeniserReader35 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader35ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader35, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache34 = ((String) get(tokeniserReader35ReaderStringCache, 34));
        CharacterReader tokeniserReader36 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader36ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader36, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache35 = ((String) get(tokeniserReader36ReaderStringCache, 35));
        CharacterReader tokeniserReader37 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader37ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader37, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache36 = ((String) get(tokeniserReader37ReaderStringCache, 36));
        CharacterReader tokeniserReader38 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader38ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader38, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache37 = ((String) get(tokeniserReader38ReaderStringCache, 37));
        
        assertEquals(32, finalTokeniserReaderBufPos);
        
        assertNull(finalTokeniserReaderStringCache0);
        
        assertNull(finalTokeniserReaderStringCache1);
        
        assertNull(finalTokeniserReaderStringCache2);
        
        assertNull(finalTokeniserReaderStringCache3);
        
        assertNull(finalTokeniserReaderStringCache4);
        
        assertNull(finalTokeniserReaderStringCache5);
        
        assertNull(finalTokeniserReaderStringCache6);
        
        assertNull(finalTokeniserReaderStringCache7);
        
        assertNull(finalTokeniserReaderStringCache8);
        
        assertNull(finalTokeniserReaderStringCache9);
        
        assertNull(finalTokeniserReaderStringCache10);
        
        assertNull(finalTokeniserReaderStringCache11);
        
        assertNull(finalTokeniserReaderStringCache12);
        
        assertNull(finalTokeniserReaderStringCache13);
        
        assertNull(finalTokeniserReaderStringCache14);
        
        assertNull(finalTokeniserReaderStringCache15);
        
        assertNull(finalTokeniserReaderStringCache16);
        
        assertNull(finalTokeniserReaderStringCache17);
        
        assertNull(finalTokeniserReaderStringCache18);
        
        assertNull(finalTokeniserReaderStringCache19);
        
        assertNull(finalTokeniserReaderStringCache20);
        
        assertNull(finalTokeniserReaderStringCache21);
        
        assertNull(finalTokeniserReaderStringCache22);
        
        assertNull(finalTokeniserReaderStringCache23);
        
        assertNull(finalTokeniserReaderStringCache24);
        
        assertNull(finalTokeniserReaderStringCache25);
        
        assertNull(finalTokeniserReaderStringCache26);
        
        assertNull(finalTokeniserReaderStringCache27);
        
        assertNull(finalTokeniserReaderStringCache28);
        
        assertNull(finalTokeniserReaderStringCache29);
        
        assertNull(finalTokeniserReaderStringCache30);
        
        assertNull(finalTokeniserReaderStringCache31);
        
        assertNull(finalTokeniserReaderStringCache32);
        
        assertNull(finalTokeniserReaderStringCache33);
        
        assertNull(finalTokeniserReaderStringCache34);
        
        assertNull(finalTokeniserReaderStringCache35);
        
        assertNull(finalTokeniserReaderStringCache36);
        
        assertNull(finalTokeniserReaderStringCache37);
    }
    
    @Test
    public void testUnescapeEntities2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {
            '&', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        java.lang.String[] stringCache = new java.lang.String[9];
        String string = "";
        stringCache[0] = string;
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        String actual = tokeniser.unescapeEntities(false);
        
        String expected = "&";
        
        assertEquals(expected, actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderBufPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        CharacterReader tokeniserReader1 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader1ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader1, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache1 = ((String) get(tokeniserReader1ReaderStringCache, 1));
        CharacterReader tokeniserReader2 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader2ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader2, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache2 = ((String) get(tokeniserReader2ReaderStringCache, 2));
        CharacterReader tokeniserReader3 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader3ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader3, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache3 = ((String) get(tokeniserReader3ReaderStringCache, 3));
        CharacterReader tokeniserReader4 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader4ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader4, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache4 = ((String) get(tokeniserReader4ReaderStringCache, 4));
        CharacterReader tokeniserReader5 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader5ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader5, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache5 = ((String) get(tokeniserReader5ReaderStringCache, 5));
        CharacterReader tokeniserReader6 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader6ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader6, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache6 = ((String) get(tokeniserReader6ReaderStringCache, 6));
        CharacterReader tokeniserReader7 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader7ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader7, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache7 = ((String) get(tokeniserReader7ReaderStringCache, 7));
        CharacterReader tokeniserReader8 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader8ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader8, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache8 = ((String) get(tokeniserReader8ReaderStringCache, 8));
        
        assertEquals(1, finalTokeniserReaderBufPos);
        
        assertNull(finalTokeniserReaderStringCache1);
        
        assertNull(finalTokeniserReaderStringCache2);
        
        assertNull(finalTokeniserReaderStringCache3);
        
        assertNull(finalTokeniserReaderStringCache4);
        
        assertNull(finalTokeniserReaderStringCache5);
        
        assertNull(finalTokeniserReaderStringCache6);
        
        assertNull(finalTokeniserReaderStringCache7);
        
        assertNull(finalTokeniserReaderStringCache8);
    }
    
    @Test
    public void testUnescapeEntities3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[40];
        charBuf[33] = '&';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 34);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 34);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 33);
        java.lang.String[] stringCache = {null, null, null, null, null, null, null, null, null};
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        String actual = tokeniser.unescapeEntities(false);
        
        String expected = "&";
        
        assertEquals(expected, actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderBufPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        CharacterReader tokeniserReader1 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader1ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader1, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache1 = ((String) get(tokeniserReader1ReaderStringCache, 1));
        CharacterReader tokeniserReader2 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader2ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader2, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache2 = ((String) get(tokeniserReader2ReaderStringCache, 2));
        CharacterReader tokeniserReader3 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader3ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader3, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache3 = ((String) get(tokeniserReader3ReaderStringCache, 3));
        CharacterReader tokeniserReader4 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader4ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader4, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache4 = ((String) get(tokeniserReader4ReaderStringCache, 4));
        CharacterReader tokeniserReader5 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader5ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader5, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache5 = ((String) get(tokeniserReader5ReaderStringCache, 5));
        CharacterReader tokeniserReader6 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader6ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader6, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache6 = ((String) get(tokeniserReader6ReaderStringCache, 6));
        CharacterReader tokeniserReader7 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader7ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader7, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache7 = ((String) get(tokeniserReader7ReaderStringCache, 7));
        CharacterReader tokeniserReader8 = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        java.lang.String[] tokeniserReader8ReaderStringCache = ((java.lang.String[]) getFieldValue(tokeniserReader8, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalTokeniserReaderStringCache8 = ((String) get(tokeniserReader8ReaderStringCache, 8));
        
        assertEquals(34, finalTokeniserReaderBufPos);
        
        assertNull(finalTokeniserReaderStringCache1);
        
        assertNull(finalTokeniserReaderStringCache2);
        
        assertNull(finalTokeniserReaderStringCache3);
        
        assertNull(finalTokeniserReaderStringCache4);
        
        assertNull(finalTokeniserReaderStringCache5);
        
        assertNull(finalTokeniserReaderStringCache6);
        
        assertNull(finalTokeniserReaderStringCache7);
        
        assertNull(finalTokeniserReaderStringCache8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unescapeEntities(boolean)
    
    @Test
    public void testUnescapeEntities4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[39];
        charBuf[0] = '\uFFD8';
        charBuf[1] = '\uFFD8';
        charBuf[2] = '\uFFD8';
        charBuf[3] = '\uFFD8';
        charBuf[4] = '\uFFD8';
        charBuf[5] = '\uFFD8';
        charBuf[6] = '\uFFD8';
        charBuf[7] = '\uFFD8';
        charBuf[8] = '\uFFD8';
        charBuf[9] = '\uFFD8';
        charBuf[10] = '\uFFD8';
        charBuf[11] = '\uFFD8';
        charBuf[12] = '\uFFD8';
        charBuf[13] = '\uFFD8';
        charBuf[14] = '\uFFD8';
        charBuf[15] = '\uFFD8';
        charBuf[16] = '\uFFD8';
        charBuf[17] = '\uFFD8';
        charBuf[18] = '\uFFD8';
        charBuf[19] = '\uFFD8';
        charBuf[20] = '\uFFD8';
        charBuf[21] = '\uFFD8';
        charBuf[22] = '\uFFD8';
        charBuf[23] = '\uFFD8';
        charBuf[24] = '\uFFD8';
        charBuf[25] = '\uFFD8';
        charBuf[26] = '\uFFD8';
        charBuf[27] = '\uFFD8';
        charBuf[28] = '\uFFD8';
        charBuf[29] = '\uFFD8';
        charBuf[30] = '\uFFD8';
        charBuf[31] = '\uFFD8';
        charBuf[32] = '\uFFD8';
        charBuf[33] = '\uFFD8';
        charBuf[34] = '\uFFD8';
        charBuf[35] = '\uFFD8';
        charBuf[36] = '\uFFD8';
        charBuf[37] = '\'';
        charBuf[38] = '&';
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 38);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 37);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "\u0000";
        stringCache[38] = string;
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.consume(CharacterReader.java:90)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:275) */
        tokeniser.unescapeEntities(false);
    }
    
    @Test
    public void testUnescapeEntities5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader1, "java.io.BufferedReader", "in", reader1);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader1, "java.io.BufferedReader", "cb", cb);
        setField(reader1, "java.io.BufferedReader", "nChars", -2147483645);
        setField(reader1, "java.io.BufferedReader", "nextChar", 2);
        setField(reader1, "java.io.BufferedReader", "readAheadLimit", -2147483645);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1073741825);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483645);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 1073741824);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:122)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:161)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:273) */
        tokeniser.unescapeEntities(false);
    }
    
    @Test
    public void testUnescapeEntities6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in1 = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(in, "java.io.BufferedReader", "in", in1);
        char[] cb = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(in, "java.io.BufferedReader", "cb", cb);
        setField(in, "java.io.BufferedReader", "nChars", 1879048193);
        setField(in, "java.io.BufferedReader", "nextChar", 2013265920);
        setField(in, "java.io.BufferedReader", "markedChar", Integer.MIN_VALUE);
        setField(reader1, "java.io.BufferedReader", "in", in);
        char[] cb1 = new char[24];
        cb1[0] = '\n';
        setField(reader1, "java.io.BufferedReader", "cb", cb1);
        setField(reader1, "java.io.BufferedReader", "nChars", 1073741823);
        setField(reader1, "java.io.BufferedReader", "markedChar", Integer.MIN_VALUE);
        setField(reader1, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader1, "java.io.Reader", "lock", lock);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1073741834);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1073741814);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 1073741833);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.unescapeEntities] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.read(BufferedReader.java:280)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.skip(BufferedReader.java:411)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.nextIndexOf(CharacterReader.java:122)
            org.jsoup.parser.CharacterReader.consumeTo(CharacterReader.java:161)
            org.jsoup.parser.Tokeniser.unescapeEntities(Tokeniser.java:273) */
        tokeniser.unescapeEntities(false);
    }
    ///endregion
    
    ///region Errors report for unescapeEntities
    
    public void testUnescapeEntities_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 38 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 15 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
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
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:244) */
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitCommentPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:79)
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:213) */
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitCommentPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:74)
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:213) */
        tokeniser.emitCommentPending();
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
    public void testEmitTagPending_5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0000";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0000";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Doctype;
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
    public void testEmitTagPending() throws Exception  {
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
    public void testEmitTagPending_1() throws Exception  {
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
    public void testEmitTagPending_2() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        tagPending.selfClosing = true;
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:79)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:205) */
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:74)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:205) */
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: emit(tagPending);
 *  */
    @Test
    public void testEmitTagPending_ThrowClassCastException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.StartTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:74)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:205) */
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
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:204) */
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emitTagPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(tagPending);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(tagPending);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder(" ");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: emit(tagPending);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = " ";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tagPending.finaliseTag();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending_ThrowIllegalArgumentException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "!";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method emitTagPending()
    
    @Test
    public void testEmitTagPending1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue", true);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "!";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "(\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u4000";
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
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000\u8000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u8000\u0001");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending7() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("!");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending8() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "!";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS", pendingAttributeName);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending9() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0000\u0000";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u4000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0000");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending10() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        String pendingAttributeValueS = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS", pendingAttributeValueS);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending11() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
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
    
    @Test
    public void testEmitTagPending12() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
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
    
    @Test
    public void testEmitTagPending13() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        String pendingAttributeValueS = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS", pendingAttributeValueS);
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
    
    ///region OTHER: ERROR SUITE for method emitTagPending()
    
    @Test
    public void testEmitTagPending14() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:79)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:205) */
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending15() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        Token.TokenType type = Token.TokenType.StartTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:74)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:205) */
        tokeniser.emitTagPending();
    }
    
    @Test
    public void testEmitTagPending16() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.EndTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:79)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:205) */
        tokeniser.emitTagPending();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method emitTagPending()
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending17() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue", true);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmitTagPending18() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
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
        
        tokeniser.createTempBuffer();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTempBuffer()}
 *  */
    @Test
    public void testCreateTempBuffer_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        StringBuilder dataBuffer = new StringBuilder("");
        tokeniser.dataBuffer = dataBuffer;
        
        tokeniser.createTempBuffer();
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitDoctypePending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:79)
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:221) */
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitDoctypePending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:74)
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:221) */
        tokeniser.emitDoctypePending();
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
        Token.EndTag endPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        tokeniser.endPending = endPending;
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Token.EndTag actual = ((Token.EndTag) tokeniser.createTagPending(false));
        
        String actualTagName = actual.tagName;
        assertNull(actualTagName);
        
        String actualNormalName = actual.normalName;
        assertNull(actualNormalName);
        
        String actualPendingAttributeName = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        assertNull(actualPendingAttributeName);
        
        StringBuilder actualPendingAttributeValue = ((StringBuilder) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        assertNull(actualPendingAttributeValue);
        
        String actualPendingAttributeValueS = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
        assertNull(actualPendingAttributeValueS);
        
        boolean actualHasEmptyAttributeValue = ((Boolean) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
        assertFalse(actualHasEmptyAttributeValue);
        
        boolean actualHasPendingAttributeValue = ((Boolean) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
        assertFalse(actualHasPendingAttributeValue);
        
        boolean actualSelfClosing = actual.selfClosing;
        assertFalse(actualSelfClosing);
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTagPending(boolean)}
 * @utbot.executesCondition {@code (start): False}
 * @utbot.returnsFrom {@code return tagPending;}
 *  */
    @Test
    public void testCreateTagPending_NotStart_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(endPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        tokeniser.endPending = endPending;
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Token.EndTag actual = ((Token.EndTag) tokeniser.createTagPending(false));
        
        String actualTagName = actual.tagName;
        assertNull(actualTagName);
        
        String actualNormalName = actual.normalName;
        assertNull(actualNormalName);
        
        String actualPendingAttributeName = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        assertNull(actualPendingAttributeName);
        
        StringBuilder endPendingPendingAttributeValue = ((StringBuilder) getFieldValue(endPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualPendingAttributeValue = ((StringBuilder) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        byte[] endPendingPendingAttributeValueValue = ((byte[]) getFieldValue(endPendingPendingAttributeValue, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualPendingAttributeValueValue = ((byte[]) getFieldValue(actualPendingAttributeValue, "java.lang.AbstractStringBuilder", "value"));
        int endPendingPendingAttributeValueValueSize = endPendingPendingAttributeValueValue.length;
        assertEquals(endPendingPendingAttributeValueValueSize, actualPendingAttributeValueValue.length);
        assertArrayEquals(endPendingPendingAttributeValueValue, actualPendingAttributeValueValue);
        
        byte endPendingPendingAttributeValueCoder = ((Byte) getFieldValue(endPendingPendingAttributeValue, "java.lang.AbstractStringBuilder", "coder"));
        byte actualPendingAttributeValueCoder = ((Byte) getFieldValue(actualPendingAttributeValue, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(endPendingPendingAttributeValueCoder, actualPendingAttributeValueCoder);
        
        int endPendingPendingAttributeValueCount = ((Integer) getFieldValue(endPendingPendingAttributeValue, "java.lang.AbstractStringBuilder", "count"));
        int actualPendingAttributeValueCount = ((Integer) getFieldValue(actualPendingAttributeValue, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(endPendingPendingAttributeValueCount, actualPendingAttributeValueCount);
        
        String actualPendingAttributeValueS = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
        assertNull(actualPendingAttributeValueS);
        
        boolean actualHasEmptyAttributeValue = ((Boolean) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
        assertFalse(actualHasEmptyAttributeValue);
        
        boolean actualHasPendingAttributeValue = ((Boolean) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
        assertFalse(actualHasPendingAttributeValue);
        
        boolean actualSelfClosing = actual.selfClosing;
        assertFalse(actualSelfClosing);
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTagPending(boolean)}
 * @utbot.executesCondition {@code (start): True}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#reset()}
 * @utbot.returnsFrom {@code return tagPending;}
 *  */
    @Test
    public void testCreateTagPending_Start() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag startPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        tokeniser.startPending = startPending;
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Token.StartTag actual = ((Token.StartTag) tokeniser.createTagPending(true));
        
        String actualTagName = actual.tagName;
        assertNull(actualTagName);
        
        String actualNormalName = actual.normalName;
        assertNull(actualNormalName);
        
        String actualPendingAttributeName = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        assertNull(actualPendingAttributeName);
        
        StringBuilder actualPendingAttributeValue = ((StringBuilder) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        assertNull(actualPendingAttributeValue);
        
        String actualPendingAttributeValueS = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
        assertNull(actualPendingAttributeValueS);
        
        boolean actualHasEmptyAttributeValue = ((Boolean) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
        assertFalse(actualHasEmptyAttributeValue);
        
        boolean actualHasPendingAttributeValue = ((Boolean) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
        assertFalse(actualHasPendingAttributeValue);
        
        boolean actualSelfClosing = actual.selfClosing;
        assertFalse(actualSelfClosing);
        
        Attributes startPendingAttributes = startPending.attributes;
        Attributes actualAttributes = actual.attributes;
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(startPendingAttributes, actualAttributes));
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTagPending(boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTagPending(boolean)}
 * @utbot.executesCondition {@code (start): False}
 * @utbot.invokes {@link org.jsoup.parser.Token.EndTag#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: endPending.reset()
 *  */
    @Test
    public void testCreateTagPending_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.createTagPending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.createTagPending(Tokeniser.java:199) */
        tokeniser.createTagPending(false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createTagPending(boolean)}
 * @utbot.executesCondition {@code (start): True}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: startPending.reset()
 *  */
    @Test
    public void testCreateTagPending_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.createTagPending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.createTagPending(Tokeniser.java:199) */
        tokeniser.createTagPending(true);
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
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.createCommentPending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCommentPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createCommentPending()}
 *  */
    @Test
    public void testCreateCommentPending() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment commentPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        tokeniser.commentPending = commentPending;
        
        tokeniser.createCommentPending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createCommentPending()}
 *  */
    @Test
    public void testCreateCommentPending_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment commentPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(commentPending, "org.jsoup.parser.Token$Comment", "data", data);
        tokeniser.commentPending = commentPending;
        
        tokeniser.createCommentPending();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCommentPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createCommentPending()}
 * @utbot.invokes {@link org.jsoup.parser.Token.Comment#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: commentPending.reset();
 *  */
    @Test
    public void testCreateCommentPending_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.createCommentPending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.createCommentPending(Tokeniser.java:209) */
        tokeniser.createCommentPending();
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
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:249) */
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
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", -255);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        int[] actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 *  */
    @Test
    public void testConsumeCharacterReference_AdditionalAllowedCharacterNotEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        int[] actual = tokeniser.consumeCharacterReference(character, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeCharacterReference(java.lang.Character, boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: additionalAllowedCharacter != null && additionalAllowedCharacter == reader.current()
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:85)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:132) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
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
        char[] charBuf = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:86)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:132) */
        tokeniser.consumeCharacterReference(character, false);
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
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:130) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader1 = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:85)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:132) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        BufferedReader in = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(reader1, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(reader1, "java.io.BufferedReader", "cb", cb);
        setField(reader1, "java.io.BufferedReader", "nChars", 1);
        setField(reader1, "java.io.BufferedReader", "markedChar", -1);
        setField(reader1, "java.io.BufferedReader", "skipLF", true);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 255);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:52)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:85)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:132) */
        tokeniser.consumeCharacterReference(character, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method consumeCharacterReference(java.lang.Character, boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#isEmpty()}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link org.jsoup.UncheckedIOException} 
 *  */
    @Test(expected = UncheckedIOException.class)
    public void testConsumeCharacterReference_ThrowUncheckedIOException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        StreamDecoder sd = ((StreamDecoder) createInstance("sun.nio.cs.StreamDecoder"));
        setField(sd, "sun.nio.cs.StreamDecoder", "closed", true);
        setField(in, "java.io.InputStreamReader", "sd", sd);
        setField(reader1, "java.io.BufferedReader", "in", in);
        char[] cb = {'\u0000'};
        setField(reader1, "java.io.BufferedReader", "cb", cb);
        setField(reader1, "java.io.BufferedReader", "nChars", 1);
        setField(reader1, "java.io.BufferedReader", "nextChar", 1);
        setField(reader1, "java.io.BufferedReader", "readAheadLimit", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 255);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 255);
        setField(reader, "org.jsoup.parser.CharacterReader", "readerPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        tokeniser.consumeCharacterReference(character, false);
    }
    ///endregion
    
    ///region Errors report for consumeCharacterReference
    
    public void testConsumeCharacterReference_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 37 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 17 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
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
        Token.Doctype doctypePending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        tokeniser.doctypePending = doctypePending;
        
        tokeniser.createDoctypePending();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createDoctypePending()}
 *  */
    @Test
    public void testCreateDoctypePending_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype doctypePending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder(" ");
        setField(doctypePending, "org.jsoup.parser.Token$Doctype", "name", name);
        tokeniser.doctypePending = doctypePending;
        
        tokeniser.createDoctypePending();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createDoctypePending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#createDoctypePending()}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doctypePending.reset();
 *  */
    @Test
    public void testCreateDoctypePending_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.createDoctypePending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.createDoctypePending(Tokeniser.java:217) */
        tokeniser.createDoctypePending();
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
 * @utbot.returnsFrom {@code return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);}
 *  */
    @Test
    public void testIsAppropriateEndTagToken_LastStartTagEqualsNullAndTagPendingNameEqualsIgnoreCase() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        boolean actual = tokeniser.isAppropriateEndTagToken();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.returnsFrom {@code return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);}
 *  */
    @Test
    public void testIsAppropriateEndTagToken_LastStartTagNotEqualsNullAndTagPendingNameEqualsIgnoreCase() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "A";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", tagName);
        
        boolean actual = tokeniser.isAppropriateEndTagToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.returnsFrom {@code return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);}
 *  */
    @Test
    public void testIsAppropriateEndTagToken_LastStartTagEqualsNullAndTagPendingNameEqualsIgnoreCase_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000\u0000";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        String lastStartTag = "\u0000";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        boolean actual = tokeniser.isAppropriateEndTagToken();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAppropriateEndTagToken()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.invokes {@link org.jsoup.parser.Token.Tag#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);
 *  */
    @Test
    public void testIsAppropriateEndTagToken_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String lastStartTag = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.isAppropriateEndTagToken] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.isAppropriateEndTagToken(Tokeniser.java:229) */
        tokeniser.isAppropriateEndTagToken();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isAppropriateEndTagToken()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsAppropriateEndTagToken_ThrowIllegalArgumentException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", tagName);
        
        tokeniser.isAppropriateEndTagToken();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsAppropriateEndTagToken_ThrowIllegalArgumentException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        String lastStartTag = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        tokeniser.isAppropriateEndTagToken();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.appropriateEndTagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appropriateEndTagName()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#appropriateEndTagName()}
 * @utbot.executesCondition {@code (lastStartTag == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testAppropriateEndTagName_LastStartTagEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        String actual = tokeniser.appropriateEndTagName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#appropriateEndTagName()}
 * @utbot.executesCondition {@code (lastStartTag == null): False}
 * @utbot.returnsFrom {@code return lastStartTag;}
 *  */
    @Test
    public void testAppropriateEndTagName_LastStartTagNotEqualsNull() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String lastStartTag = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        String actual = tokeniser.appropriateEndTagName();
        
        assertEquals(lastStartTag, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1004369067530800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1004369067530800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1004369067536200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004369067530800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004369067536200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1004369068341700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004369068341700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004369068343300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004369068341700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004369068343300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


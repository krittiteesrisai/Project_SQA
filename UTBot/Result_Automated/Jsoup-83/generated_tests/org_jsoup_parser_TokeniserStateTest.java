package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.io.BufferedReader;
import jdk.internal.util.xml.impl.ReaderUTF8;
import java.io.StringReader;
import java.io.InputStreamReader;
import org.jsoup.UncheckedIOException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_jsoup_parser_TokeniserStateTest {
    ///region Test suites for executable org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: r.matchesLetter()
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 4);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:383)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: r.matchesLetter()
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[1] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[2] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testHandleDataDoubleEscapeTag1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        TokeniserState tokeniserState = TokeniserState.AfterAttributeValue_quoted;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        
        TokeniserState finalTokeniserState = tokeniserState;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testHandleDataDoubleEscapeTag2() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483645);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1073741822);
        TokeniserState tokeniserState = TokeniserState.ScriptDataEscapeStartDash;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        ReaderUTF8 in = ((ReaderUTF8) createInstance("jdk.internal.util.xml.impl.ReaderUTF8"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[18];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(reader, "java.io.BufferedReader", "nextChar", Integer.MIN_VALUE);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483645);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 18]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:416)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag4() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = new char[16];
        charBuf[0] = 'C';
        charBuf[1] = '\f';
        charBuf[2] = '\f';
        charBuf[3] = '\f';
        charBuf[4] = '\f';
        charBuf[5] = '\f';
        charBuf[6] = '\f';
        charBuf[7] = '\f';
        charBuf[8] = '\f';
        charBuf[9] = '\f';
        charBuf[10] = '\f';
        charBuf[11] = '\f';
        charBuf[12] = '\f';
        charBuf[13] = '\f';
        charBuf[14] = '\f';
        charBuf[15] = '\f';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        TokeniserState tokeniserState = TokeniserState.RawtextEndTagOpen;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:280)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1713) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag5() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'e'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:280)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1713) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag6() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        ReaderUTF8 in = ((ReaderUTF8) createInstance("jdk.internal.util.xml.impl.ReaderUTF8"));
        setField(reader, "java.io.BufferedReader", "in", in);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147481597);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2048);
        TokeniserState tokeniserState = TokeniserState.AttributeName;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.skip(BufferedReader.java:411)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag7() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[16];
        cb[0] = '\n';
        cb[1] = '\f';
        cb[2] = '\f';
        cb[3] = '\f';
        cb[4] = '\f';
        cb[5] = '\f';
        cb[6] = '\f';
        cb[7] = '\f';
        cb[8] = '\f';
        cb[9] = '\f';
        cb[10] = '\f';
        cb[11] = '\f';
        cb[12] = '\f';
        cb[13] = '\f';
        cb[14] = '\f';
        cb[15] = '\f';
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1389265051);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1797848881);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 315523243);
        TokeniserState tokeniserState = TokeniserState.Comment;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            java.base/java.io.Reader.read(Reader.java:250)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:53)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag8() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Object in = createInstance("java.io.Console$LineReader");
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -737894333);
        setField(reader, "java.io.BufferedReader", "nextChar", 340959298);
        setField(reader, "java.io.BufferedReader", "markedChar", 2117956544);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", -1676333941);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483645);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        TokeniserState tokeniserState = TokeniserState.AttributeName;
        TokeniserState tokeniserState1 = TokeniserState.CharacterReferenceInData;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = tokeniserState1;
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag9() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        InputStreamReader in = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", -1593827309);
        setField(reader, "java.io.BufferedReader", "nextChar", -1593761776);
        setField(reader, "java.io.BufferedReader", "markedChar", 2097086062);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", -1543298653);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483643);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 4);
        TokeniserState tokeniserState = TokeniserState.CharacterReferenceInData;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.skip(BufferedReader.java:411)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[3] = tokeniserState;
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag10() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        StringReader in = ((StringReader) createInstance("java.io.StringReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = new char[16];
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 1);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483645);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 2);
        TokeniserState tokeniserState = TokeniserState.Comment;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.read(StringReader.java:96)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.skip(BufferedReader.java:411)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = tokeniser;
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataDoubleEscapeTag11() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1712) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test(expected = UncheckedIOException.class)
    public void testHandleDataDoubleEscapeTag12() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483647);
        TokeniserState tokeniserState = TokeniserState.RawtextEndTagOpen;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = ((Object) null);
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for handleDataDoubleEscapeTag
    
    public void testHandleDataDoubleEscapeTag_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokeniserState.readCharRef
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readCharRef(org.jsoup.parser.Tokeniser, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readCharRef(org.jsoup.parser.Tokeniser,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int[] c = t.consumeCharacterReference(null, false);
 *  */
    @Test
    public void testReadCharRef_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.readCharRef] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1693) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Method readCharRefMethod = tokeniserStateClazz.getDeclaredMethod("readCharRef", tokeniserType, tokeniserStateClazz);
        readCharRefMethod.setAccessible(true);
        java.lang.Object[] readCharRefMethodArguments = new java.lang.Object[2];
        readCharRefMethodArguments[0] = ((Object) null);
        readCharRefMethodArguments[1] = ((Object) null);
        try {
            readCharRefMethod.invoke(null, readCharRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readCharRef(org.jsoup.parser.Tokeniser, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadCharRef1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState tokeniserState = TokeniserState.ScriptDataLessthanSign;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readCharRef] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:377)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:137)
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1693) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Method readCharRefMethod = tokeniserStateClazz.getDeclaredMethod("readCharRef", tokeniserType, tokeniserStateClazz);
        readCharRefMethod.setAccessible(true);
        java.lang.Object[] readCharRefMethodArguments = new java.lang.Object[2];
        readCharRefMethodArguments[0] = tokeniser;
        readCharRefMethodArguments[1] = tokeniserState;
        try {
            readCharRefMethod.invoke(null, readCharRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadCharRef2() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader1 = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Object in = createInstance("java.io.Console$LineReader");
        setField(reader1, "java.io.BufferedReader", "in", in);
        setField(reader1, "java.io.BufferedReader", "nChars", 33554434);
        setField(reader1, "java.io.BufferedReader", "nextChar", -2067791871);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -46137342);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 2101346305);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState tokeniserState = TokeniserState.Rawtext;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readCharRef] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:133)
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1693) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Method readCharRefMethod = tokeniserStateClazz.getDeclaredMethod("readCharRef", tokeniserType, tokeniserStateClazz);
        readCharRefMethod.setAccessible(true);
        java.lang.Object[] readCharRefMethodArguments = new java.lang.Object[2];
        readCharRefMethodArguments[0] = tokeniser;
        readCharRefMethodArguments[1] = tokeniserState;
        try {
            readCharRefMethod.invoke(null, readCharRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReadCharRef3() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        StringReader reader1 = ((StringReader) createInstance("java.io.StringReader"));
        String str = "";
        setField(reader1, "java.io.StringReader", "str", str);
        setField(reader1, "java.io.StringReader", "length", 1086518457);
        setField(reader1, "java.io.StringReader", "next", -16781698);
        setField(reader, "org.jsoup.parser.CharacterReader", "reader", reader1);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1342177279);
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", 553648128);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState tokeniserState = TokeniserState.Data;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readCharRef] produces [java.lang.NullPointerException]
            java.base/java.io.StringReader.skip(StringReader.java:132)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:133)
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1693) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Method readCharRefMethod = tokeniserStateClazz.getDeclaredMethod("readCharRef", tokeniserType, tokeniserStateClazz);
        readCharRefMethod.setAccessible(true);
        java.lang.Object[] readCharRefMethodArguments = new java.lang.Object[2];
        readCharRefMethodArguments[0] = tokeniser;
        readCharRefMethodArguments[1] = tokeniserState;
        try {
            readCharRefMethod.invoke(null, readCharRefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readCharRef
    
    public void testReadCharRef_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokeniserState.readData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#advanceTransition(org.jsoup.parser.TokeniserState)}
 * @utbot.activatesSwitch {@code switch(r.current()) case: '<'}
 *  */
    @Test
    public void testReadData_TokeniserAdvanceTransition() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'<', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = tokeniser;
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        readDataMethod.invoke(null, readDataMethodArguments);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderBufPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "bufPos"));
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        
        assertEquals(-254, finalTokeniserReaderBufPos);
        
        assertNull(finalTokeniserState);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: switch(r.current())
 *  */
    @Test
    public void testReadData_ThrowIllegalArgumentException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -256);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:93)
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1673) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(r.current())
 *  */
    @Test
    public void testReadData_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -128);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -128);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -129);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -129 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:94)
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1673) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(r.current())
 *  */
    @Test
    public void testReadData_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1673) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = ((Object) null);
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#advanceTransition(org.jsoup.parser.TokeniserState)}
 * @utbot.activatesSwitch {@code switch(r.current()) case: '<'}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.advanceTransition(advance);
 *  */
    @Test
    public void testReadData_ThrowNullPointerException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'<', '@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1675) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.activatesSwitch {@code switch(r.current()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.error(current);
 *  */
    @Test
    public void testReadData_ThrowNullPointerException_3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'\u0000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1678) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(r.current())
 *  */
    @Test
    public void testReadData_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 128);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 128);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:93)
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1673) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = ((Object) null);
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokeniserState.readEndTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: r.matchesLetter()
 *  */
    @Test
    public void testReadEndTag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 5);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 4);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:383)
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1702) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = ((Object) null);
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        try {
            readEndTagMethod.invoke(null, readEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (r.matchesLetter()): False}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.emit("</");
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1706) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = ((Object) null);
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        try {
            readEndTagMethod.invoke(null, readEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: r.matchesLetter()
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1702) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = ((Object) null);
        readEndTagMethodArguments[1] = ((Object) null);
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        try {
            readEndTagMethod.invoke(null, readEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (r.matchesLetter()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.createTagPending(false);
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'b', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1703) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = ((Object) null);
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        try {
            readEndTagMethod.invoke(null, readEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (r.matchesLetter()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.createTagPending(false);
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException_3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'B', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1703) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = ((Object) null);
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        try {
            readEndTagMethod.invoke(null, readEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokeniserState.handleDataEndTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleDataEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: r.matchesLetter()
 *  */
    @Test
    public void testHandleDataEndTag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:383)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1633) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = ((Object) null);
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = ((Object) null);
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testHandleDataEndTag_ThrowIllegalArgumentException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.IllegalArgumentException: skip value is negative]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:404)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1633) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = ((Object) null);
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = ((Object) null);
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isAppropriateEndTagToken() && !r.isEmpty()
 *  */
    @Test
    public void testHandleDataEndTag_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1641) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = ((Object) null);
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = ((Object) null);
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: r.matchesLetter()
 *  */
    @Test
    public void testHandleDataEndTag_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1633) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = ((Object) null);
        handleDataEndTagMethodArguments[1] = ((Object) null);
        handleDataEndTagMethodArguments[2] = ((Object) null);
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleDataEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testHandleDataEndTag1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] charBuf = {'K', '\f'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "charBuf", charBuf);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufLength", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", 1);
        TokeniserState tokeniserState = TokeniserState.BogusDoctype;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:447)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:280)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1634) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = tokeniser;
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = tokeniserState;
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataEndTag2() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        ReaderUTF8 in = ((ReaderUTF8) createInstance("jdk.internal.util.xml.impl.ReaderUTF8"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n', '\f'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 45023223);
        setField(reader, "java.io.BufferedReader", "markedChar", 1633681408);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", 40);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1043922940);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1086390273);
        TokeniserState tokeniserState = TokeniserState.CdataSection;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            java.base/java.io.BufferedReader.skip(BufferedReader.java:406)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1633) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = tokeniser;
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = tokeniserState;
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleDataEndTag3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        FileReader in = ((FileReader) createInstance("java.io.FileReader"));
        setField(reader, "java.io.BufferedReader", "in", in);
        char[] cb = {'\n'};
        setField(reader, "java.io.BufferedReader", "cb", cb);
        setField(reader, "java.io.BufferedReader", "nChars", 2);
        setField(reader, "java.io.BufferedReader", "markedChar", 1532875350);
        setField(reader, "java.io.BufferedReader", "readAheadLimit", -1565905394);
        setField(reader, "java.io.BufferedReader", "skipLF", true);
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -1039138814);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 1073741824);
        TokeniserState tokeniserState = TokeniserState.AfterDoctypeSystemIdentifier;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            java.base/java.io.BufferedReader.fill(BufferedReader.java:162)
            java.base/java.io.BufferedReader.skip(BufferedReader.java:411)
            org.jsoup.parser.CharacterReader.bufferUp(CharacterReader.java:51)
            org.jsoup.parser.CharacterReader.isEmpty(CharacterReader.java:80)
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:381)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1633) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = ((Object) null);
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = tokeniserState;
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleDataEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState)
    
    @Test(expected = UncheckedIOException.class)
    public void testHandleDataEndTag4() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        BufferedReader reader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        Object lock = createInstance("java.lang.Object");
        setField(reader, "java.io.Reader", "lock", lock);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "reader", reader);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint", -2147483391);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "bufPos", 256);
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataEndTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataEndTag", tokeniserType, characterReaderType, tokeniserStateClazz);
        handleDataEndTagMethod.setAccessible(true);
        java.lang.Object[] handleDataEndTagMethodArguments = new java.lang.Object[3];
        handleDataEndTagMethodArguments[0] = tokeniser;
        handleDataEndTagMethodArguments[1] = characterReader;
        handleDataEndTagMethodArguments[2] = ((Object) null);
        try {
            handleDataEndTagMethod.invoke(null, handleDataEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for handleDataEndTag
    
    public void testHandleDataEndTag_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1007798285337700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1007798285337700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1007798285344600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007798285337700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007798285344600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1007798285748800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007798285748800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007798285752600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007798285748800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007798285752600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


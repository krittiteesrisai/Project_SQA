package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.Tag;
import org.jsoup.parser.Token.StartTag;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class org_jsoup_parser_TokeniserStateTest {
    ///region Test suites for executable org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (r.matchesLetter()): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#unconsume()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#transition(org.jsoup.parser.TokeniserState)}
 * @utbot.activatesSwitch {@code switch(c) case: default}
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_NotRMatchesLetter() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
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
        handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (r.matchesLetter()): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String name = r.consumeLetterSequence();
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'H'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:196)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1703) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: r.matchesLetter()
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 66);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 65);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:299)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1702) */
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
 * @utbot.executesCondition {@code (r.matchesLetter()): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String name = r.consumeLetterSequence();
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 97 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1703) */
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
 * @utbot.executesCondition {@code (r.matchesLetter()): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consume()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#unconsume()}
 * @utbot.activatesSwitch {@code switch(c) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.transition(fallback);
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowNullPointerException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 3);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1726) */
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
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matchesLetter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: r.matchesLetter()
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1702) */
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
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (r.matchesLetter()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = r.consumeLetterSequence();
 *  */
    @Test
    public void testHandleDataDoubleEscapeTag_ThrowNullPointerException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203)
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1703) */
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
    
    ///region FUZZER: ERROR SUITE for method handleDataDoubleEscapeTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testHandleDataDoubleEscapeTagByFuzzer() throws Throwable  {
        CharacterReader characterReader = new CharacterReader("abc");
        TokeniserState tokeniserState = TokeniserState.AttributeValue_unquoted;
        TokeniserState tokeniserState1 = TokeniserState.CommentEndDash;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataDoubleEscapeTag(TokeniserState.java:1704) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method handleDataDoubleEscapeTagMethod = tokeniserStateClazz.getDeclaredMethod("handleDataDoubleEscapeTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        handleDataDoubleEscapeTagMethod.setAccessible(true);
        java.lang.Object[] handleDataDoubleEscapeTagMethodArguments = new java.lang.Object[4];
        handleDataDoubleEscapeTagMethodArguments[0] = ((Object) null);
        handleDataDoubleEscapeTagMethodArguments[1] = characterReader;
        handleDataDoubleEscapeTagMethodArguments[2] = tokeniserState;
        handleDataDoubleEscapeTagMethodArguments[3] = tokeniserState1;
        try {
            handleDataDoubleEscapeTagMethod.invoke(null, handleDataDoubleEscapeTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1683) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readCharRef(org.jsoup.parser.Tokeniser, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadCharRef1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState tokeniserState = TokeniserState.AfterDoctypeSystemKeyword;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Method readCharRefMethod = tokeniserStateClazz.getDeclaredMethod("readCharRef", tokeniserType, tokeniserStateClazz);
        readCharRefMethod.setAccessible(true);
        java.lang.Object[] readCharRefMethodArguments = new java.lang.Object[2];
        readCharRefMethodArguments[0] = tokeniser;
        readCharRefMethodArguments[1] = tokeniserState;
        readCharRefMethod.invoke(null, readCharRefMethodArguments);
        
        TokeniserState finalTokeniserState = tokeniserState;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readCharRef(org.jsoup.parser.Tokeniser, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadCharRef2() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState tokeniserState = TokeniserState.Rawtext;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readCharRef] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.matchesAnySorted(CharacterReader.java:293)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:136)
            org.jsoup.parser.TokeniserState.readCharRef(TokeniserState.java:1683) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokeniserState.readEndTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 *  */
    @Test
    public void testReadEndTag() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = tokeniser;
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        readEndTagMethod.invoke(null, readEndTagMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 *  */
    @Test
    public void testReadEndTag_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("   ");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = tokeniser;
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        readEndTagMethod.invoke(null, readEndTagMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 *  */
    @Test
    public void testReadEndTag_4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 133);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 133);
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = tokeniser;
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        readEndTagMethod.invoke(null, readEndTagMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 *  */
    @Test
    public void testReadEndTag_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        TokeniserState state = TokeniserState.ScriptDataLessthanSign;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        Token.EndTag endPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endPending.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(endPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        tokeniser.endPending = endPending;
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a', '@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = tokeniser;
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        readEndTagMethod.invoke(null, readEndTagMethodArguments);
        
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
        
        assertNull(finalTokeniserState);
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 *  */
    @Test
    public void testReadEndTag_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endPending.tagName = tagName;
        tokeniser.endPending = endPending;
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'A'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        Token.Tag initialTokeniserTagPending = tokeniser.tagPending;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = tokeniser;
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = ((Object) null);
        readEndTagMethodArguments[3] = ((Object) null);
        readEndTagMethod.invoke(null, readEndTagMethodArguments);
        
        Token.Tag finalTokeniserTagPending = tokeniser.tagPending;
        
        assertFalse(initialTokeniserTagPending == finalTokeniserTagPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: r.matchesLetter()
 *  */
    @Test
    public void testReadEndTag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -254);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:299)
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1692) */
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
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.emit("</");
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException_3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 3);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1696) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.createTagPending(false);
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'D', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1693) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.createTagPending(false);
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1693) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: r.matchesLetter()
 *  */
    @Test
    public void testReadEndTag_ThrowNullPointerException_2() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1692) */
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
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method readEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadEndTagByFuzzer() throws Throwable  {
        CharacterReader characterReader = new CharacterReader("10");
        TokeniserState tokeniserState = TokeniserState.AttributeValue_unquoted;
        TokeniserState tokeniserState1 = TokeniserState.CommentEndDash;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readEndTag(TokeniserState.java:1696) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readEndTagMethod = tokeniserStateClazz.getDeclaredMethod("readEndTag", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readEndTagMethod.setAccessible(true);
        java.lang.Object[] readEndTagMethodArguments = new java.lang.Object[4];
        readEndTagMethodArguments[0] = ((Object) null);
        readEndTagMethodArguments[1] = characterReader;
        readEndTagMethodArguments[2] = tokeniserState;
        readEndTagMethodArguments[3] = tokeniserState1;
        try {
            readEndTagMethod.invoke(null, readEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TokeniserState.readData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#advanceTransition(org.jsoup.parser.TokeniserState)}
 * @utbot.activatesSwitch {@code switch(r.current()) case: '<'}
 *  */
    @Test
    public void testReadData_TokeniserAdvanceTransition() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Rawtext;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'<'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
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
        int finalTokeniserReaderPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "pos"));
        TokeniserState finalTokeniserState = ((TokeniserState) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "state"));
        
        assertEquals(-254, finalTokeniserReaderPos);
        
        assertNull(finalTokeniserState);
    }
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.activatesSwitch {@code switch(r.current()) case: default}
 *  */
    @Test
    public void testReadData_TokeniserEmit() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\u8000', '\uFFFF', ' ', ' ', ' ', ' ', ' ', ' ',
            ' ', ' '
        };
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
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
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: switch(r.current())
 *  */
    @Test
    public void testReadData_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 130);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 129);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:36)
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1663) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.emit(new Token.EOF());
 *  */
    @Test
    public void testReadData_ThrowNullPointerException_5() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -221);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -221);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
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
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1663) */
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
    public void testReadData_ThrowNullPointerException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'@', '<'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1665) */
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
    public void testReadData_ThrowNullPointerException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[32];
        input[0] = '\f';
        input[2] = '@';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = ' ';
        input[6] = ' ';
        input[7] = '@';
        input[8] = '@';
        input[9] = '@';
        input[10] = ' ';
        input[11] = '@';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = '@';
        input[15] = ' ';
        input[16] = '@';
        input[17] = '@';
        input[18] = ' ';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = '@';
        input[23] = ' ';
        input[24] = '@';
        input[25] = ' ';
        input[26] = ' ';
        input[27] = '@';
        input[28] = ' ';
        input[29] = ' ';
        input[30] = ' ';
        input[31] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 64);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1668) */
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
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#consumeToAny(char[])}
 * @utbot.activatesSwitch {@code switch(r.current()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.emit(data);
 *  */
    @Test
    public void testReadData_ThrowNullPointerException_3() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' ', '@'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:138)
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1676) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.emit(new Token.EOF());
 *  */
    @Test
    public void testReadData_ThrowNullPointerException_4() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[32];
        input[0] = '\uFFFF';
        input[1] = '\u8000';
        input[2] = ' ';
        input[3] = ' ';
        input[4] = ' ';
        input[5] = '@';
        input[6] = ' ';
        input[7] = ' ';
        input[8] = ' ';
        input[9] = ' ';
        input[10] = ' ';
        input[11] = '@';
        input[12] = ' ';
        input[13] = ' ';
        input[14] = ' ';
        input[15] = '@';
        input[16] = ' ';
        input[17] = ' ';
        input[18] = '@';
        input[19] = ' ';
        input[20] = ' ';
        input[21] = ' ';
        input[22] = ' ';
        input[23] = '@';
        input[24] = ' ';
        input[25] = ' ';
        input[26] = '@';
        input[27] = ' ';
        input[28] = ' ';
        input[29] = '@';
        input[30] = '@';
        input[31] = ' ';
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#readData(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState,org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.activatesSwitch {@code switch(r.current()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: t.emit(new Token.EOF());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReadData_ThrowIllegalArgumentException() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\uFFFF', '\u4000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 256);
        
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
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadDataByFuzzer() throws Throwable  {
        CharacterReader characterReader = new CharacterReader("");
        TokeniserState tokeniserState = TokeniserState.AttributeValue_unquoted;
        TokeniserState tokeniserState1 = TokeniserState.CommentEndDash;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1673) */
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = ((Object) null);
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = tokeniserState;
        readDataMethodArguments[3] = tokeniserState1;
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadData1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\u2000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null, null, null, null, null, null, null, null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        TokeniserState tokeniserState = TokeniserState.AfterDoctypePublicKeyword;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = tokeniser;
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = ((Object) null);
        readDataMethodArguments[3] = tokeniserState;
        readDataMethod.invoke(null, readDataMethodArguments);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
        java.lang.String[] characterReaderStringCache = ((java.lang.String[]) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "stringCache"));
        String finalCharacterReaderStringCache1 = ((String) get(characterReaderStringCache, 1));
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
        
        TokeniserState finalTokeniserState = tokeniserState;
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache6);
        
        assertNull(finalCharacterReaderStringCache7);
        
    }
    
    @Test
    public void testReadData2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'&', '\uFFFF', '\uFFFF', '\uFFFF'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[16];
        String string = "";
        stringCache[6] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        TokeniserState tokeniserState = TokeniserState.AfterAttributeValue_quoted;
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = tokeniser;
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = tokeniserState;
        readDataMethodArguments[3] = ((Object) null);
        readDataMethod.invoke(null, readDataMethodArguments);
        
        int finalCharacterReaderPos = ((Integer) getFieldValue(characterReader, "org.jsoup.parser.CharacterReader", "pos"));
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
        
        TokeniserState finalTokeniserState = tokeniserState;
        
        assertEquals(1, finalCharacterReaderPos);
        
        assertNull(finalCharacterReaderStringCache0);
        
        assertNull(finalCharacterReaderStringCache1);
        
        assertNull(finalCharacterReaderStringCache2);
        
        assertNull(finalCharacterReaderStringCache3);
        
        assertNull(finalCharacterReaderStringCache4);
        
        assertNull(finalCharacterReaderStringCache5);
        
        assertNull(finalCharacterReaderStringCache7);
        
        assertNull(finalCharacterReaderStringCache8);
        
        assertNull(finalCharacterReaderStringCache9);
        
        assertNull(finalCharacterReaderStringCache10);
        
        assertNull(finalCharacterReaderStringCache11);
        
        assertNull(finalCharacterReaderStringCache12);
        
        assertNull(finalCharacterReaderStringCache13);
        
        assertNull(finalCharacterReaderStringCache14);
        
        assertNull(finalCharacterReaderStringCache15);
        
    }
    
    @Test
    public void testReadData3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1073741824);
        TokeniserState tokeniserState = TokeniserState.ScriptDataEndTagName;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        Class tokeniserStateClazz = Class.forName("org.jsoup.parser.TokeniserState");
        Class tokeniserType = Class.forName("org.jsoup.parser.Tokeniser");
        Class characterReaderType = Class.forName("org.jsoup.parser.CharacterReader");
        Method readDataMethod = tokeniserStateClazz.getDeclaredMethod("readData", tokeniserType, characterReaderType, tokeniserStateClazz, tokeniserStateClazz);
        readDataMethod.setAccessible(true);
        java.lang.Object[] readDataMethodArguments = new java.lang.Object[4];
        readDataMethodArguments[0] = tokeniser;
        readDataMethodArguments[1] = characterReader;
        readDataMethodArguments[2] = tokeniserState;
        readDataMethodArguments[3] = ((Object) null);
        readDataMethod.invoke(null, readDataMethodArguments);
        
        Token finalTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        boolean finalTokeniserIsEmitPending = ((Boolean) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
        
        TokeniserState finalTokeniserState = tokeniserState;
        
        assertFalse(initialTokeniserEmitPending == finalTokeniserEmitPending);
        
        assertTrue(finalTokeniserIsEmitPending);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readData(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testReadData4() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'\f', '\u2000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.readData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeToAny(CharacterReader.java:132)
            org.jsoup.parser.TokeniserState.readData(TokeniserState.java:1676) */
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
        try {
            readDataMethod.invoke(null, readDataMethodArguments);
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
    public void testHandleDataEndTag_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.matchesLetter(CharacterReader.java:299)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1623) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String name = r.consumeLetterSequence();
 *  */
    @Test
    public void testHandleDataEndTag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a', ' '};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 97 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:364)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1624) */
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
    public void testHandleDataEndTag_ThrowNullPointerException_2() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1631) */
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
    public void testHandleDataEndTag_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1623) */
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
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.tagPending.appendTagName(name);
 *  */
    @Test
    public void testHandleDataEndTag_ThrowNullPointerException() throws Throwable  {
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'a'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {null};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1625) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleDataEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: t.isAppropriateEndTagToken() && !r.isEmpty()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleDataEndTag_ThrowIllegalArgumentException() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        String lastStartTag = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", 1);
        
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
    
    /**
    @utbot.classUnderTest {@link TokeniserState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: t.isAppropriateEndTagToken() && !r.isEmpty()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleDataEndTag_ThrowIllegalArgumentException_1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        String lastStartTag = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "pos", -255);
        
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
    
    ///region FUZZER: ERROR SUITE for method handleDataEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TokeniserState}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TokeniserState#handleDataEndTag(org.jsoup.parser.Tokeniser,org.jsoup.parser.CharacterReader,org.jsoup.parser.TokeniserState)}
     */
    @Test
    public void testHandleDataEndTagThrowsNPE() throws Throwable  {
        CharacterReader characterReader = new CharacterReader("10");
        TokeniserState tokeniserState = TokeniserState.AttributeValue_unquoted;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1631) */
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
    
    ///region OTHER: ERROR SUITE for method handleDataEndTag(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader, org.jsoup.parser.TokeniserState)
    
    @Test
    public void testHandleDataEndTag1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'s', '\u8000'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 39);
        TokeniserState tokeniserState = TokeniserState.AfterDoctypeSystemIdentifier;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:196)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1624) */
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
        char[] input = {'p', '\u0000', '\f', '\f', '\f', '\f', '\f', '\f'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 38);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:203)
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1624) */
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
    
    @Test
    public void testHandleDataEndTag3() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'S', '\uFFFF'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[32];
        String string = "";
        stringCache[0] = string;
        stringCache[1] = string;
        stringCache[2] = string;
        stringCache[3] = string;
        stringCache[4] = string;
        stringCache[5] = string;
        stringCache[6] = string;
        stringCache[7] = string;
        stringCache[8] = string;
        stringCache[9] = string;
        stringCache[10] = string;
        stringCache[11] = string;
        stringCache[12] = string;
        stringCache[13] = string;
        stringCache[14] = string;
        stringCache[15] = string;
        stringCache[16] = string;
        stringCache[17] = string;
        stringCache[18] = string;
        String string1 = "";
        stringCache[19] = string1;
        stringCache[20] = string;
        stringCache[21] = string;
        stringCache[22] = string;
        stringCache[23] = string;
        stringCache[24] = string;
        stringCache[25] = string;
        stringCache[26] = string;
        stringCache[27] = string;
        stringCache[28] = string;
        stringCache[29] = string;
        stringCache[30] = string;
        stringCache[31] = string;
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1625) */
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
    
    @Test
    public void testHandleDataEndTag4() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {'p', '\uFFFF'};
        setField(characterReader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = new java.lang.String[16];
        setField(characterReader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        TokeniserState tokeniserState = TokeniserState.AfterAttributeValue_quoted;
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1626) */
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
    public void testHandleDataEndTag5() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1657) */
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
    
    @Test
    public void testHandleDataEndTag6() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        String lastStartTag = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        CharacterReader characterReader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(characterReader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        
        /* This test fails because method [org.jsoup.parser.TokeniserState.handleDataEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState.handleDataEndTag(TokeniserState.java:1657) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1001836136491600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1001836136491600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1001836136499100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001836136491600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001836136499100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1001836136919800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001836136919800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001836136922700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001836136919800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001836136922700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


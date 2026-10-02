package org.jsoup.parser;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import org.jsoup.parser.Token.EOF;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.Token.Tag;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
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
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.executesCondition {@code (charBuffer.length() > 0): False}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.returnsFrom {@code return emitPending;}
 *  */
    @Test
    public void testRead_CharBufferLengthLessOrEqualZero() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method read()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): False}
 * @utbot.iterates iterate the loop {@code while(!isEmitPending)} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: state.read(this, reader);
 *  */
    @Test
    public void testRead_ThrowStringIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:28)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:10)
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charBuffer.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:45) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: error("Self closing flag not acknowledged");
 *  */
    @Test
    public void testRead_ThrowNullPointerException_4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:223)
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
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: error("Self closing flag not acknowledged");
 *  */
    @Test
    public void testRead_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:223)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:37) */
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
    public void testRead_ThrowNullPointerException_5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -255);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.DoctypePublicIdentifier_singleQuoted;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokeniserState$58.read(TokeniserState.java:1509)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:42) */
        tokeniser.read();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#read()}
 * @utbot.executesCondition {@code (!selfClosingFlagAcknowledged): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: charBuffer.length() > 0
 *  */
    @Test
    public void testRead_ThrowNullPointerException_6() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        ArrayList errors = new ArrayList();
        errors.add(null);
        errors.add(null);
        errors.add(null);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "errors", errors);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.read] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:45) */
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method error(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(java.lang.String)}
 * @utbot.executesCondition {@code (trackErrors): False}
 *  */
    @Test
    public void testError_NotTrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Class stringType = Class.forName("java.lang.String");
        Method errorMethod = tokeniserClazz.getDeclaredMethod("error", stringType);
        errorMethod.setAccessible(true);
        java.lang.Object[] errorMethodArguments = new java.lang.Object[1];
        errorMethodArguments[0] = ((Object) null);
        errorMethod.invoke(tokeniser, errorMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(java.lang.String)}
 * @utbot.executesCondition {@code (trackErrors): True}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testError_TrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        ArrayList errors = new ArrayList();
        errors.add(null);
        errors.add(null);
        errors.add(null);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "errors", errors);
        
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Class stringType = Class.forName("java.lang.String");
        Method errorMethod = tokeniserClazz.getDeclaredMethod("error", stringType);
        errorMethod.setAccessible(true);
        java.lang.Object[] errorMethodArguments = new java.lang.Object[1];
        errorMethodArguments[0] = ((Object) null);
        errorMethod.invoke(tokeniser, errorMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method error(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError(errorMsg, reader.pos()));
 *  */
    @Test
    public void testError_ThrowNullPointerException_1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:223) */
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
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError(errorMsg, reader.pos()));
 *  */
    @Test
    public void testError_ThrowNullPointerException() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:223) */
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
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.error
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method error(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (trackErrors): False}
 *  */
    @Test
    public void testError_NotTrackErrors1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        tokeniser.error(((TokeniserState) null));
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (trackErrors): True}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testError_TrackErrors1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        ArrayList errors = new ArrayList();
        errors.add(null);
        errors.add(null);
        errors.add(null);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "errors", errors);
        
        tokeniser.error(((TokeniserState) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method error(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: errors.add(new ParseError("Unexpected character in input", reader.current(), state, reader.pos()));
 *  */
    @Test
    public void testError_ThrowStringIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:28)
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:208) */
        tokeniser.error(((TokeniserState) null));
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Unexpected character in input", reader.current(), state, reader.pos()));
 *  */
    @Test
    public void testError_ThrowNullPointerException_11() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:208) */
        tokeniser.error(((TokeniserState) null));
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Unexpected character in input", reader.current(), state, reader.pos()));
 *  */
    @Test
    public void testError_ThrowNullPointerException1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:208) */
        tokeniser.error(((TokeniserState) null));
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#error(org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Unexpected character in input", reader.current(), state, reader.pos()));
 *  */
    @Test
    public void testError_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 2);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:208) */
        tokeniser.error(((TokeniserState) null));
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
        
        tokeniser.transition(null);
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
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.characterReferenceError
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method characterReferenceError()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#characterReferenceError()}
 * @utbot.executesCondition {@code (trackErrors): False}
 *  */
    @Test
    public void testCharacterReferenceError_NotTrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Method characterReferenceErrorMethod = tokeniserClazz.getDeclaredMethod("characterReferenceError");
        characterReferenceErrorMethod.setAccessible(true);
        java.lang.Object[] characterReferenceErrorMethodArguments = new java.lang.Object[0];
        characterReferenceErrorMethod.invoke(tokeniser, characterReferenceErrorMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#characterReferenceError()}
 * @utbot.executesCondition {@code (trackErrors): True}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testCharacterReferenceError_TrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        ArrayList errors = new ArrayList();
        errors.add(null);
        errors.add(null);
        errors.add(null);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "errors", errors);
        
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Method characterReferenceErrorMethod = tokeniserClazz.getDeclaredMethod("characterReferenceError");
        characterReferenceErrorMethod.setAccessible(true);
        java.lang.Object[] characterReferenceErrorMethodArguments = new java.lang.Object[0];
        characterReferenceErrorMethod.invoke(tokeniser, characterReferenceErrorMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method characterReferenceError()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#characterReferenceError()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Invalid character reference", reader.pos()));
 *  */
    @Test
    public void testCharacterReferenceError_ThrowNullPointerException_1() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.characterReferenceError] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:218) */
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Method characterReferenceErrorMethod = tokeniserClazz.getDeclaredMethod("characterReferenceError");
        characterReferenceErrorMethod.setAccessible(true);
        java.lang.Object[] characterReferenceErrorMethodArguments = new java.lang.Object[0];
        try {
            characterReferenceErrorMethod.invoke(tokeniser, characterReferenceErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#characterReferenceError()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Invalid character reference", reader.pos()));
 *  */
    @Test
    public void testCharacterReferenceError_ThrowNullPointerException() throws Throwable  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.characterReferenceError] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.characterReferenceError(Tokeniser.java:218) */
        Class tokeniserClazz = Class.forName("org.jsoup.parser.Tokeniser");
        Method characterReferenceErrorMethod = tokeniserClazz.getDeclaredMethod("characterReferenceError");
        characterReferenceErrorMethod.setAccessible(true);
        java.lang.Object[] characterReferenceErrorMethodArguments = new java.lang.Object[0];
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
 * @utbot.executesCondition {@code (reader.isEmpty()): True}
 *  */
    @Test
    public void testConsumeCharacterReference_ReaderIsEmpty() throws Exception  {
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
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.executesCondition {@code (reader.matchesAny('\t', '\n', '\f', '<', '&')): True}
 *  */
    @Test
    public void testConsumeCharacterReference_ReaderMatchesAny() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\t";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.executesCondition {@code (reader.matchesAny('\t', '\n', '\f', '<', '&')): False}
 * @utbot.executesCondition {@code (reader.matchConsume("#")): False}
 *  */
    @Test
    public void testConsumeCharacterReference_NotReaderMatchConsume() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 16);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 15);
        setField(reader, "org.jsoup.parser.CharacterReader", "mark", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderMark = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "mark"));
        
        assertEquals(15, finalTokeniserReaderMark);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.executesCondition {@code (reader.matchesAny('\t', '\n', '\f', '<', '&')): False}
 * @utbot.executesCondition {@code (reader.matchConsume("#")): False}
 * @utbot.executesCondition {@code (looksLegit): False}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#matches(char)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#rewindToMark()}
 *  */
    @Test
    public void testConsumeCharacterReference_NotLooksLegit() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "|";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "mark", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        Character actual = tokeniser.consumeCharacterReference(null, false);
        
        assertNull(actual);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderMark = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "mark"));
        
        assertEquals(0, finalTokeniserReaderMark);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.executesCondition {@code (additionalAllowedCharacter == reader.current()): True}
 *  */
    @Test
    public void testConsumeCharacterReference_AdditionalAllowedCharacterEqualsReaderCurrent() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " ";
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
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.executesCondition {@code (additionalAllowedCharacter == reader.current()): False}
 * @utbot.executesCondition {@code (reader.matchesAny('\t', '\n', '\f', '<', '&')): True}
 *  */
    @Test
    public void testConsumeCharacterReference_AdditionalAllowedCharacterNotEqualsReaderCurrent() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\t";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        Character actual = tokeniser.consumeCharacterReference(character, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumeCharacterReference(java.lang.Character, boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: reader.matchesAny('\t', '\n', '\f', '<', '&')
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowStringIndexOutOfBoundsException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "  ";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.matchesAny(CharacterReader.java:152)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:105) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.executesCondition {@code (reader.matchesAny('\t', '\n', '\f', '<', '&')): False}
 * @utbot.executesCondition {@code (reader.matchConsume("#")): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String nameRef = reader.consumeLetterSequence();
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowStringIndexOutOfBoundsException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " B";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "mark", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:101)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:135) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): False}
 * @utbot.executesCondition {@code (reader.matchesAny('\t', '\n', '\f', '<', '&')): False}
 * @utbot.executesCondition {@code (reader.matchConsume("#")): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String nameRef = reader.consumeLetterSequence();
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowStringIndexOutOfBoundsException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = " b";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        setField(reader, "org.jsoup.parser.CharacterReader", "mark", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.consumeLetterSequence(CharacterReader.java:101)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:135) */
        tokeniser.consumeCharacterReference(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.executesCondition {@code (reader.isEmpty()): False}
 * @utbot.executesCondition {@code (additionalAllowedCharacter != null): True}
 * @utbot.invokes {@link java.lang.Character#charValue()}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#current()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: additionalAllowedCharacter != null && additionalAllowedCharacter == reader.current()
 *  */
    @Test
    public void testConsumeCharacterReference_ThrowStringIndexOutOfBoundsException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        String input = "\u0000\u0000";
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 256);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        Character character = ' ';
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.consumeCharacterReference] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 255]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:28)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:103) */
        tokeniser.consumeCharacterReference(character, false);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#consumeCharacterReference(java.lang.Character,boolean)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#isEmpty()}
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.isAppropriateEndTagToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAppropriateEndTagToken()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return tagPending.tagName.equals(lastStartTag.tagName);}
 *  */
    @Test
    public void testIsAppropriateEndTagToken_StringEquals() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = " ";
        tagPending.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        Token.StartTag lastStartTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        lastStartTag.tagName = tagName;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
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
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.isAppropriateEndTagToken] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.isAppropriateEndTagToken(Tokeniser.java:194) */
        tokeniser.isAppropriateEndTagToken();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tagPending.tagName.equals(lastStartTag.tagName);
 *  */
    @Test
    public void testIsAppropriateEndTagToken_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.isAppropriateEndTagToken] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.isAppropriateEndTagToken(Tokeniser.java:194) */
        tokeniser.isAppropriateEndTagToken();
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isAppropriateEndTagToken()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tagPending.tagName.equals(lastStartTag.tagName);
 *  */
    @Test
    public void testIsAppropriateEndTagToken_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        Token.StartTag lastStartTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag", lastStartTag);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.isAppropriateEndTagToken] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.isAppropriateEndTagToken(Tokeniser.java:194) */
        tokeniser.isAppropriateEndTagToken();
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
        
        Token.Comment initialTokeniserCommentPending = tokeniser.commentPending;
        
        tokeniser.createCommentPending();
        
        Token.Comment finalTokeniserCommentPending = tokeniser.commentPending;
        
        assertFalse(initialTokeniserCommentPending == finalTokeniserCommentPending);
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
        StringBuilder charBuffer = new StringBuilder(" ");
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method emit(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): False}
 *  */
    @Test
    public void testEmit_TokenTypeNotEqualsTokenTokenTypeEndTag() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag startTag = new Token.StartTag(null, null);
        Token.TokenType type = Token.TokenType.Doctype;
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method emit(org.jsoup.parser.Token)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (token.type == Token.TokenType.StartTag): False},
    ///     {@code (token.type == Token.TokenType.EndTag): True}
    /// invoke:
    ///     {@link org.jsoup.nodes.Attributes#size()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (endTag.attributes.size() > 0): False}
 *  */
    @Test
    public void testEmit_EndTagAttributesSizeLessOrEqualZero_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype emitPending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        endTag.attributes = attributes;
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
 * @utbot.executesCondition {@code (endTag.attributes.size() > 0): False}
 *  */
    @Test
    public void testEmit_EndTagAttributesSizeLessOrEqualZero() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        endTag.attributes = attributes;
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
 * @utbot.executesCondition {@code (endTag.attributes.size() > 0): True}
 * @utbot.invokes org.jsoup.parser.Tokeniser#error(java.lang.String)
 *  */
    @Test
    public void testEmit_EndTagAttributesSizeGreaterThanZero() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EOF emitPending = ((Token.EOF) createInstance("org.jsoup.parser.Token$EOF"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        endTag.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        Token initialTokeniserEmitPending = ((Token) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
        
        tokeniser.emit(endTag);
        
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
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        Token.TokenType type = Token.TokenType.StartTag;
        comment.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:62) */
        tokeniser.emit(comment);
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
        Token.StartTag startTag = new Token.StartTag(null, null);
        Token.TokenType type = Token.TokenType.EndTag;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:67) */
        tokeniser.emit(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: token.type == Token.TokenType.StartTag
 *  */
    @Test
    public void testEmit_ThrowNullPointerException1() throws Exception  {
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
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: endTag.attributes.size() > 0
 *  */
    @Test
    public void testEmit_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag endTag = new Token.EndTag(null);
        endTag.attributes = null;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:68) */
        tokeniser.emit(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): True}
 * @utbot.executesCondition {@code (endTag.attributes.size() > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: error("Attributes incorrectly present on end tag");
 *  */
    @Test
    public void testEmit_ThrowNullPointerException_2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        tokeniser.setTrackErrors(true);
        Token.EOF emitPending = ((Token.EOF) createInstance("org.jsoup.parser.Token$EOF"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        endTag.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:223)
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:69) */
        tokeniser.emit(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emit(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.StartTag): False}
 * @utbot.executesCondition {@code (token.type == Token.TokenType.EndTag): True}
 * @utbot.executesCondition {@code (endTag.attributes.size() > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: error("Attributes incorrectly present on end tag");
 *  */
    @Test
    public void testEmit_ThrowNullPointerException_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        Token.StartTag emitPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        endTag.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:223)
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
    public void testEmit_ThrowNullPointerException2() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emit] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:76) */
        tokeniser.emit(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.isTrackErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTrackErrors()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#isTrackErrors()}
 * @utbot.returnsFrom {@code return trackErrors;}
 *  */
    @Test
    public void testIsTrackErrors_ReturnTrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        boolean actual = tokeniser.isTrackErrors();
        
        assertFalse(actual);
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
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:186) */
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
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:186) */
        tokeniser.emitDoctypePending();
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
    
    ///region FUZZER: ERROR SUITE for method emitDoctypePending()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tokeniser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitDoctypePending()}
     */
    @Test
    public void testEmitDoctypePendingThrowsNPE() {
        CharacterReader characterReader = new CharacterReader("XZ");
        Tokeniser tokeniser = new Tokeniser(characterReader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitDoctypePending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:61)
            org.jsoup.parser.Tokeniser.emitDoctypePending(Tokeniser.java:186) */
        tokeniser.emitDoctypePending();
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
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:178) */
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
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:178) */
        tokeniser.emitCommentPending();
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
    
    ///region FUZZER: ERROR SUITE for method emitCommentPending()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tokeniser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitCommentPending()}
     */
    @Test
    public void testEmitCommentPendingThrowsNPE() {
        CharacterReader characterReader = new CharacterReader("XZ");
        Tokeniser tokeniser = new Tokeniser(characterReader);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitCommentPending] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:61)
            org.jsoup.parser.Tokeniser.emitCommentPending(Tokeniser.java:178) */
        tokeniser.emitCommentPending();
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
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        expected.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        expected.type = type;
        
        String actualTagName = actual.tagName;
        assertNull(actualTagName);
        
        String actualPendingAttributeName = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        assertNull(actualPendingAttributeName);
        
        String actualPendingAttributeValue = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
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
        
        String actualPendingAttributeValue = ((String) getFieldValue(actual, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
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
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.setTrackErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setTrackErrors(boolean)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#setTrackErrors(boolean)}
 *  */
    @Test
    public void testSetTrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        tokeniser.setTrackErrors(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.eofError
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method eofError(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#eofError(org.jsoup.parser.TokeniserState)}
 * @utbot.executesCondition {@code (trackErrors): False}
 *  */
    @Test
    public void testEofError_NotTrackErrors() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        
        tokeniser.eofError(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method eofError(org.jsoup.parser.TokeniserState)
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#eofError(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Unexpectedly reached end of file (EOF)", state, reader.pos()));
 *  */
    @Test
    public void testEofError_ThrowNullPointerException_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -255);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.eofError] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:213) */
        tokeniser.eofError(null);
    }
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#eofError(org.jsoup.parser.TokeniserState)}
 * @utbot.invokes {@link org.jsoup.parser.CharacterReader#pos()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errors.add(new ParseError("Unexpectedly reached end of file (EOF)", state, reader.pos()));
 *  */
    @Test
    public void testEofError_ThrowNullPointerException() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        tokeniser.setTrackErrors(true);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.eofError] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.eofError(Tokeniser.java:213) */
        tokeniser.eofError(null);
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
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -192);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        
        tokeniser.advanceTransition(null);
        
        CharacterReader tokeniserReader = ((CharacterReader) getFieldValue(tokeniser, "org.jsoup.parser.Tokeniser", "reader"));
        int finalTokeniserReaderPos = ((Integer) getFieldValue(tokeniserReader, "org.jsoup.parser.CharacterReader", "pos"));
        
        assertEquals(-191, finalTokeniserReaderPos);
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
    
    ///region Test suites for executable org.jsoup.parser.Tokeniser.emitTagPending
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method emitTagPending()
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_1() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
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
    public void testEmitTagPending() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method emitTagPending()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.jsoup.nodes.Attributes#size()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Tokeniser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tokeniser#emitTagPending()}
 *  */
    @Test
    public void testEmitTagPending_4() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag emitPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        tagPending.attributes = attributes;
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
    public void testEmitTagPending_3() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        tagPending.attributes = attributes;
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
    public void testEmitTagPending_5() throws Exception  {
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.StartTag emitPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        tagPending.attributes = attributes;
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
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:62)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:170) */
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
        Token.StartTag tagPending = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        tagPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        /* This test fails because method [org.jsoup.parser.Tokeniser.emitTagPending] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:67)
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:170) */
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
            org.jsoup.parser.Tokeniser.emitTagPending(Tokeniser.java:169) */
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
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
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
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeName);
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
        Token.EndTag tagPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(tagPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "tagPending", tagPending);
        
        tokeniser.emitTagPending();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields994532059510500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields994532059510500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass994532059516700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields994532059510500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass994532059516700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields994532059912900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields994532059912900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass994532059915800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields994532059912900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass994532059915800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


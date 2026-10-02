package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.parser.Token.StartTag;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.TokenType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_parser_HtmlTreeBuilderStateTest {
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.handleRcData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.tokeniser.transition(TokeniserState.Rcdata);
 *  */
    @Test
    public void testHandleRcData_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.handleRcData] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.handleRcData(HtmlTreeBuilderState.java:1483) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRcDataMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, htmlTreeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = ((Object) null);
        handleRcDataMethodArguments[1] = ((Object) null);
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#transition(org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.tokeniser.transition(TokeniserState.Rcdata);
 *  */
    @Test
    public void testHandleRcData_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.handleRcData] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.handleRcData(HtmlTreeBuilderState.java:1483) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRcDataMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, htmlTreeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = ((Object) null);
        handleRcDataMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData_ThrowIllegalArgumentException() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRcDataMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, htmlTreeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData_ThrowIllegalArgumentException_1() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        startTag.selfClosing = true;
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRcDataMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, htmlTreeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData_ThrowIllegalArgumentException_2() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRcDataMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, htmlTreeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.handleRawtext
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.tokeniser.transition(TokeniserState.Rawtext);
 *  */
    @Test
    public void testHandleRawtext_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.handleRawtext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.handleRawtext(HtmlTreeBuilderState.java:1490) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRawtextMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, htmlTreeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = ((Object) null);
        handleRawtextMethodArguments[1] = ((Object) null);
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.Tokeniser#transition(org.jsoup.parser.TokeniserState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.tokeniser.transition(TokeniserState.Rawtext);
 *  */
    @Test
    public void testHandleRawtext_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.handleRawtext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.handleRawtext(HtmlTreeBuilderState.java:1490) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRawtextMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, htmlTreeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = ((Object) null);
        handleRawtextMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRawtextMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, htmlTreeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException_1() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        startTag.selfClosing = true;
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRawtextMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, htmlTreeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException_2() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Method handleRawtextMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, htmlTreeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = htmlTreeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext1() throws Throwable  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
            String tagName = "\u0000";
            startTag.tagName = tagName;
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            HtmlTreeBuilderState originalState = HtmlTreeBuilderState.AfterHead;
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "originalState", originalState);
            Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
            htmlTreeBuilder.tokeniser = tokeniser;
            ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
            htmlTreeBuilder.settings = settings;
            
            Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
            Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
            Class htmlTreeBuilderType = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
            Method handleRawtextMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, htmlTreeBuilderType);
            handleRawtextMethod.setAccessible(true);
            java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
            handleRawtextMethodArguments[0] = startTag;
            handleRawtextMethodArguments[1] = htmlTreeBuilder;
            try {
                handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.isWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWhitespace(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsWhitespace_ReturnFalse() throws Exception  {
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Comment;
        endTag.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class endTagType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", endTagType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = endTag;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace_1() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\u0000";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace_2() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\r";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace_3() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\f";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace_4() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\n";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace_5() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\t";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return isWhitespace(data);}
 *  */
    @Test
    public void testIsWhitespace_ReturnIsWhitespace_6() throws Exception  {
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = " ";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isWhitespace(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String data = t.asCharacter().getData();
 *  */
    @Test
    public void testIsWhitespace_ThrowClassCastException() throws Throwable  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asCharacter(Token.java:360)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1466) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", startTagType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = startTag;
        try {
            isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isCharacter()
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1465) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class tokenType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", tokenType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = ((Object) null);
        try {
            isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isWhitespace(data);
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException_1() throws Throwable  {
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1474)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1467) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        try {
            isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.isWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isWhitespace(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 *  */
    @Test
    public void testIsWhitespace_StringUtilIsWhitespace() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "!";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isWhitespace(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} twice,
    ///     {@link org.jsoup.helper.StringUtil#isWhitespace(int)} twice
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} twice
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\f";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} twice
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_IterateForLoop_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\n";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} twice
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_IterateForLoop_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\r";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} twice
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_IterateForLoop_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\t";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} twice
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_IterateForLoop_4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = string;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isWhitespace(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length(); i++)
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException1() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1474) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = ((Object) null);
        try {
            isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isWhitespace(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState}
     * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(java.lang.String)}
     */
    @Test
    public void testIsWhitespaceReturnsFalseWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class stringType = Class.forName("java.lang.String");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", stringType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = "\u0014\n\t\r";
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1004807816551800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1004807816551800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1004807816558500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004807816551800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004807816558500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1004807816950300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004807816950300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004807816954500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004807816950300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004807816954500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1004807817649500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004807817649500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004807817652800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004807817649500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004807817652800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


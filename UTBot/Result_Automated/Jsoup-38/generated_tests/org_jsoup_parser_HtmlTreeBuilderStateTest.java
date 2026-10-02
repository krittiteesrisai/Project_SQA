package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.TokenType;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.parser.Token.EOF;
import org.jsoup.parser.Token.StartTag;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_parser_HtmlTreeBuilderStateTest {
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.isWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWhitespace(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): False}
 *  */
    @Test
    public void testIsWhitespace_NotTIsCharacter() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Token.EndTag endTag = new Token.EndTag(null);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_TIsCharacter() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 *  */
    @Test
    public void testIsWhitespace_NotStringUtilIsWhitespace() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_StringUtilIsWhitespace() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\f";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_StringUtilIsWhitespace_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\n";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_StringUtilIsWhitespace_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\t";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_StringUtilIsWhitespace_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\r";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_StringUtilIsWhitespace_4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        Token.Character character = new Token.Character(string);
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String data = t.asCharacter().getData();
 *  */
    @Test
    public void testIsWhitespace_ThrowClassCastException() throws Throwable  {
        Token.EndTag endTag = new Token.EndTag(null);
        Token.TokenType type = Token.TokenType.Character;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7f30ec61)]
            org.jsoup.parser.Token.asCharacter(Token.java:260)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1450) */
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class endTagType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", endTagType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = endTag;
        try {
            isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#isCharacter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isCharacter()
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1449) */
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
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length(); i++)
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException_1() throws Throwable  {
        Token.Character character = new Token.Character(null);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1452) */
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isWhitespace(org.jsoup.parser.Token)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState}
     * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
     */
    @Test
    public void testIsWhitespaceReturnsFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Token.EOF eof = new Token.EOF();
        
        Class htmlTreeBuilderStateClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class eofType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = htmlTreeBuilderStateClazz.getDeclaredMethod("isWhitespace", eofType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = eof;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.handleRawtext
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.insert(startTag);
 *  */
    @Test
    public void testHandleRawtext_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.handleRawtext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.handleRawtext(HtmlTreeBuilderState.java:1470) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException_1() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = true;
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilderState.handleRcData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.insert(startTag);
 *  */
    @Test
    public void testHandleRcData_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilderState.handleRcData] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.handleRcData(HtmlTreeBuilderState.java:1463) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData_ThrowIllegalArgumentException() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        
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
    public void testHandleRcData_ThrowIllegalArgumentException_1() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = true;
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.HtmlTreeBuilder)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData1() throws Throwable  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "\u0000";
            Token.StartTag startTag = new Token.StartTag(string, null);
            startTag.selfClosing = true;
            HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
            
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
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields998613991823200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields998613991823200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass998613991832500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields998613991823200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass998613991832500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields998613994079900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields998613994079900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass998613994083700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields998613994079900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass998613994083700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    ///endregion
}


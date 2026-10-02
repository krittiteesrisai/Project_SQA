package org.jsoup.parser;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.TokenType;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_parser_TreeBuilderStateTest {
    ///region Test suites for executable org.jsoup.parser.TreeBuilderState.handleRawtext
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.TreeBuilder)
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.TreeBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.TreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.insert(startTag);
 *  */
    @Test
    public void testHandleRawtext_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TreeBuilderState.handleRawtext] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilderState.handleRawtext(TreeBuilderState.java:1477) */
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.TreeBuilder)
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.TreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = treeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#handleRawtext(org.jsoup.parser.Token.StartTag,org.jsoup.parser.TreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext_ThrowIllegalArgumentException_1() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = true;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = treeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRawtext(org.jsoup.parser.Token$StartTag, org.jsoup.parser.TreeBuilder)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext1() throws Throwable  {
        String string = "!\u0001";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = treeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext2() throws Throwable  {
        String string = "\u0001\u0001\u0001\u0000\u0000\u0000\u0000";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = treeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext3() throws Throwable  {
        String string = "A\u0001";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = treeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRawtext4() throws Throwable  {
        String string = "\u0000";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = true;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRawtextMethod = treeBuilderStateClazz.getDeclaredMethod("handleRawtext", startTagType, treeBuilderType);
        handleRawtextMethod.setAccessible(true);
        java.lang.Object[] handleRawtextMethodArguments = new java.lang.Object[2];
        handleRawtextMethodArguments[0] = startTag;
        handleRawtextMethodArguments[1] = treeBuilder;
        try {
            handleRawtextMethod.invoke(null, handleRawtextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilderState.handleRcData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.TreeBuilder)
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.TreeBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.TreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tb.insert(startTag);
 *  */
    @Test
    public void testHandleRcData_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TreeBuilderState.handleRcData] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilderState.handleRcData(TreeBuilderState.java:1470) */
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.TreeBuilder)
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.TreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData_ThrowIllegalArgumentException() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = treeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#handleRcData(org.jsoup.parser.Token.StartTag,org.jsoup.parser.TreeBuilder)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tb.insert(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData_ThrowIllegalArgumentException_1() throws Throwable  {
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = true;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = treeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleRcData(org.jsoup.parser.Token$StartTag, org.jsoup.parser.TreeBuilder)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData1() throws Throwable  {
        String string = "!\u0001";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = treeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData2() throws Throwable  {
        String string = "\u0001\u0001\u0001\u0000\u0000\u0000\u0000";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = treeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData3() throws Throwable  {
        String string = "A\u0001";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = false;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = treeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHandleRcData4() throws Throwable  {
        String string = "\u0000";
        Token.StartTag startTag = new Token.StartTag(string, null);
        startTag.selfClosing = true;
        TreeBuilder treeBuilder = new TreeBuilder();
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token$StartTag");
        Class treeBuilderType = Class.forName("org.jsoup.parser.TreeBuilder");
        Method handleRcDataMethod = treeBuilderStateClazz.getDeclaredMethod("handleRcData", startTagType, treeBuilderType);
        handleRcDataMethod.setAccessible(true);
        java.lang.Object[] handleRcDataMethodArguments = new java.lang.Object[2];
        handleRcDataMethodArguments[0] = startTag;
        handleRcDataMethodArguments[1] = treeBuilder;
        try {
            handleRcDataMethod.invoke(null, handleRcDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilderState.isWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isWhitespace(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): False}
 *  */
    @Test
    public void testIsWhitespace_NotTIsCharacter() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Token.Character character = new Token.Character(null);
        Token.TokenType type = Token.TokenType.Comment;
        character.type = type;
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_TIsCharacter() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        Token.Character character = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 *  */
    @Test
    public void testIsWhitespace_NotCharacterIsWhitespace() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000";
        Token.Character character = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsWhitespace_CharacterIsWhitespace() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\t";
        Token.Character character = new Token.Character(string);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
        isWhitespaceMethod.setAccessible(true);
        java.lang.Object[] isWhitespaceMethodArguments = new java.lang.Object[1];
        isWhitespaceMethodArguments[0] = character;
        boolean actual = ((Boolean) isWhitespaceMethod.invoke(null, isWhitespaceMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isWhitespace(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String data = t.asCharacter().getData();
 *  */
    @Test
    public void testIsWhitespace_ThrowClassCastException() throws Throwable  {
        Token.StartTag startTag = new Token.StartTag(null, null);
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilderState.isWhitespace] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:233)
            org.jsoup.parser.TreeBuilderState.isWhitespace(TreeBuilderState.java:1457) */
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class startTagType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", startTagType);
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
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#isCharacter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isCharacter()
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilderState.isWhitespace(TreeBuilderState.java:1456) */
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class tokenType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", tokenType);
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
    @utbot.classUnderTest {@link TreeBuilderState}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
 * @utbot.executesCondition {@code (t.isCharacter()): True}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < data.length(); i++)
 *  */
    @Test
    public void testIsWhitespace_ThrowNullPointerException_1() throws Throwable  {
        Token.Character character = new Token.Character(null);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilderState.isWhitespace(TreeBuilderState.java:1459) */
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class characterType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", characterType);
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
    
    ///region FUZZER: ERROR SUITE for method isWhitespace(org.jsoup.parser.Token)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.TreeBuilderState}
     * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilderState#isWhitespace(org.jsoup.parser.Token)}
     */
    @Test
    public void testIsWhitespaceThrowsNPE() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.TreeBuilderState.isWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilderState.isWhitespace(TreeBuilderState.java:1456) */
        Class treeBuilderStateClazz = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class tokenType = Class.forName("org.jsoup.parser.Token");
        Method isWhitespaceMethod = treeBuilderStateClazz.getDeclaredMethod("isWhitespace", tokenType);
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
    
    ///endregion
}


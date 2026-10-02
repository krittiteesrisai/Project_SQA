package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.CData;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.Comment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_parser_TokenTest {
    ///region Test suites for executable org.jsoup.parser.Token.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#reset(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (sb != null): False}
 *  */
    @Test
    public void testReset_SbEqualsNull() {
        Token.reset(null);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#reset(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (sb != null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.invokes {@link java.lang.StringBuilder#delete(int,int)}
 *  */
    @Test
    public void testReset_SbNotEqualsNull() {
        StringBuilder stringBuilder = new StringBuilder("");
        
        Token.reset(stringBuilder);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method reset(java.lang.StringBuilder)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Token}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Token#reset(java.lang.StringBuilder)}
     */
    @Test(timeout = 1000L)
    public void testReset() {
        StringBuilder stringBuilder = new StringBuilder(2147483631);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Token.reset(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCharacter()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isCharacter()}
 * @utbot.returnsFrom {@code return type == TokenType.Character;}
 *  */
    @Test
    public void testIsCharacter_TypeEqualsTokenTypeCharacter() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        boolean actual = startTag.isCharacter();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isCharacter()}
 * @utbot.returnsFrom {@code return type == TokenType.Character;}
 *  */
    @Test
    public void testIsCharacter_TypeNotEqualsTokenTypeCharacter() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        boolean actual = startTag.isCharacter();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isStartTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isStartTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isStartTag()}
 * @utbot.returnsFrom {@code return type == TokenType.StartTag;}
 *  */
    @Test
    public void testIsStartTag_TypeEqualsTokenTypeStartTag() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        boolean actual = startTag.isStartTag();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isStartTag()}
 * @utbot.returnsFrom {@code return type == TokenType.StartTag;}
 *  */
    @Test
    public void testIsStartTag_TypeNotEqualsTokenTypeStartTag() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        boolean actual = startTag.isStartTag();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.asStartTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asStartTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.returnsFrom {@code return (StartTag) this;}
 *  */
    @Test
    public void testAsStartTag_ReturnThis() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        Token.StartTag actual = startTag.asStartTag();
        
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
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asStartTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (StartTag) this;
 *  */
    @Test
    public void testAsStartTag_ThrowClassCastException() throws Exception  {
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        
        /* This test fails because method [org.jsoup.parser.Token.asStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @31ed6189)]
            org.jsoup.parser.Token.asStartTag(Token.java:351) */
        endTag.asStartTag();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.asCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asCharacter()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asCharacter()}
 * @utbot.returnsFrom {@code return (Character) this;}
 *  */
    @Test
    public void testAsCharacter_ReturnThis() throws Exception  {
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        
        Token.CData actual = ((Token.CData) cData.asCharacter());
        
        String actualData = actual.getData();
        assertNull(actualData);
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asCharacter()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asCharacter()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Character) this;
 *  */
    @Test
    public void testAsCharacter_ThrowClassCastException() throws Exception  {
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        
        /* This test fails because method [org.jsoup.parser.Token.asCharacter] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @31ed6189)]
            org.jsoup.parser.Token.asCharacter(Token.java:379) */
        endTag.asCharacter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.asDoctype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asDoctype()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asDoctype()}
 * @utbot.returnsFrom {@code return (Doctype) this;}
 *  */
    @Test
    public void testAsDoctype_ReturnThis() throws Exception  {
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        
        Token.Doctype actual = doctype.asDoctype();
        
        StringBuilder actualName = actual.name;
        assertNull(actualName);
        
        String actualPubSysKey = actual.pubSysKey;
        assertNull(actualPubSysKey);
        
        StringBuilder actualPublicIdentifier = actual.publicIdentifier;
        assertNull(actualPublicIdentifier);
        
        StringBuilder actualSystemIdentifier = actual.systemIdentifier;
        assertNull(actualSystemIdentifier);
        
        boolean actualForceQuirks = actual.forceQuirks;
        assertFalse(actualForceQuirks);
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asDoctype()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asDoctype()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Doctype) this;
 *  */
    @Test
    public void testAsDoctype_ThrowClassCastException() throws Exception  {
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        
        /* This test fails because method [org.jsoup.parser.Token.asDoctype] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @31ed6189)]
            org.jsoup.parser.Token.asDoctype(Token.java:343) */
        cData.asDoctype();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.asEndTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asEndTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asEndTag()}
 * @utbot.returnsFrom {@code return (EndTag) this;}
 *  */
    @Test
    public void testAsEndTag_ReturnThis() throws Exception  {
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        
        Token.EndTag actual = endTag.asEndTag();
        
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
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asEndTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asEndTag()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (EndTag) this;
 *  */
    @Test
    public void testAsEndTag_ThrowClassCastException() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        /* This test fails because method [org.jsoup.parser.Token.asEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @31ed6189)]
            org.jsoup.parser.Token.asEndTag(Token.java:359) */
        startTag.asEndTag();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isComment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isComment()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isComment()}
 * @utbot.returnsFrom {@code return type == TokenType.Comment;}
 *  */
    @Test
    public void testIsComment_TypeEqualsTokenTypeComment() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Comment;
        startTag.type = type;
        
        boolean actual = startTag.isComment();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isComment()}
 * @utbot.returnsFrom {@code return type == TokenType.Comment;}
 *  */
    @Test
    public void testIsComment_TypeNotEqualsTokenTypeComment() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        boolean actual = startTag.isComment();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.asComment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asComment()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asComment()}
 * @utbot.returnsFrom {@code return (Comment) this;}
 *  */
    @Test
    public void testAsComment_ReturnThis() throws Exception  {
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        
        Token.Comment actual = comment.asComment();
        
        StringBuilder actualData = actual.data;
        assertNull(actualData);
        
        boolean actualBogus = actual.bogus;
        assertFalse(actualBogus);
        
        Token.TokenType actualType = actual.type;
        assertNull(actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asComment()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asComment()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Comment) this;
 *  */
    @Test
    public void testAsComment_ThrowClassCastException() throws Exception  {
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        
        /* This test fails because method [org.jsoup.parser.Token.asComment] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @31ed6189)]
            org.jsoup.parser.Token.asComment(Token.java:367) */
        cData.asComment();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isCData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCData()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isCData()}
 * @utbot.returnsFrom {@code return this instanceof CData;}
 *  */
    @Test
    public void testIsCData_ReturnThisInstanceOfCData() throws Exception  {
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        
        boolean actual = cData.isCData();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isEOF
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEOF()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isEOF()}
 * @utbot.returnsFrom {@code return type == TokenType.EOF;}
 *  */
    @Test
    public void testIsEOF_TypeEqualsTokenTypeEOF() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EOF;
        startTag.type = type;
        
        boolean actual = startTag.isEOF();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isEOF()}
 * @utbot.returnsFrom {@code return type == TokenType.EOF;}
 *  */
    @Test
    public void testIsEOF_TypeNotEqualsTokenTypeEOF() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        boolean actual = startTag.isEOF();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isEndTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEndTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isEndTag()}
 * @utbot.returnsFrom {@code return type == TokenType.EndTag;}
 *  */
    @Test
    public void testIsEndTag_TypeEqualsTokenTypeEndTag() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        startTag.type = type;
        
        boolean actual = startTag.isEndTag();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isEndTag()}
 * @utbot.returnsFrom {@code return type == TokenType.EndTag;}
 *  */
    @Test
    public void testIsEndTag_TypeNotEqualsTokenTypeEndTag() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        boolean actual = startTag.isEndTag();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.isDoctype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDoctype()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isDoctype()}
 * @utbot.returnsFrom {@code return type == TokenType.Doctype;}
 *  */
    @Test
    public void testIsDoctype_TypeEqualsTokenTypeDoctype() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        startTag.type = type;
        
        boolean actual = startTag.isDoctype();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isDoctype()}
 * @utbot.returnsFrom {@code return type == TokenType.Doctype;}
 *  */
    @Test
    public void testIsDoctype_TypeNotEqualsTokenTypeDoctype() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        boolean actual = startTag.isDoctype();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Token.tokenType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tokenType()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#tokenType()}
 * @utbot.invokes {@link java.lang.Class#getSimpleName()}
 * @utbot.returnsFrom {@code return this.getClass().getSimpleName();}
 *  */
    @Test
    public void testTokenType_ClassGetSimpleName() throws Exception  {
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        String actual = startTag.tokenType();
        
        String expected = "StartTag";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1009850390804000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009850390804000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009850390814300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009850390804000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009850390814300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.EndTag;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token.Comment;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_parser_TokenTest {
    ///region Test suites for executable org.jsoup.parser.Token.isCharacter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCharacter()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isCharacter()}
 * @utbot.returnsFrom {@code return type == TokenType.Character;}
 *  */
    @Test
    public void testIsCharacter_TypeEqualsTokenTypeCharacter() throws Exception  {
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.Character;
        doctype.type = type;
        
        boolean actual = doctype.isCharacter();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isCharacter()}
 * @utbot.returnsFrom {@code return type == TokenType.Character;}
 *  */
    @Test
    public void testIsCharacter_TypeNotEqualsTokenTypeCharacter() {
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.type = null;
        
        boolean actual = startTag.isCharacter();
        
        assertFalse(actual);
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
    public void testAsEndTag_ReturnThis() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Token.EndTag endTag = new Token.EndTag();
        
        Token.EndTag actual = endTag.asEndTag();
        
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
        
        Token.TokenType endTagType = endTag.type;
        Token.TokenType actualType = actual.type;
        assertEquals(endTagType, actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asEndTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asEndTag()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (EndTag) this;
 *  */
    @Test
    public void testAsEndTag_ThrowClassCastException() {
        Token.StartTag startTag = new Token.StartTag();
        
        /* This test fails because method [org.jsoup.parser.Token.asEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            org.jsoup.parser.Token.asEndTag(Token.java:231) */
        startTag.asEndTag();
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
    public void testAsCharacter_ReturnThis() {
        Token.Character character = new Token.Character(null);
        
        Token.Character actual = character.asCharacter();
        
        String actualData = actual.getData();
        assertNull(actualData);
        
        Token.TokenType characterType = character.type;
        Token.TokenType actualType = actual.type;
        assertEquals(characterType, actualType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asCharacter()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asCharacter()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Character) this;
 *  */
    @Test
    public void testAsCharacter_ThrowClassCastException() {
        Token.StartTag startTag = new Token.StartTag();
        
        /* This test fails because method [org.jsoup.parser.Token.asCharacter] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            org.jsoup.parser.Token.asCharacter(Token.java:247) */
        startTag.asCharacter();
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
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        boolean actual = doctype.isDoctype();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isDoctype()}
 * @utbot.returnsFrom {@code return type == TokenType.Doctype;}
 *  */
    @Test
    public void testIsDoctype_TypeNotEqualsTokenTypeDoctype() {
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.type = null;
        
        boolean actual = startTag.isDoctype();
        
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
    public void testAsComment_ThrowClassCastException() {
        Token.StartTag startTag = new Token.StartTag();
        
        /* This test fails because method [org.jsoup.parser.Token.asComment] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            org.jsoup.parser.Token.asComment(Token.java:239) */
        startTag.asComment();
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
        Token.StartTag startTag = new Token.StartTag();
        
        Token.StartTag actual = startTag.asStartTag();
        
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
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asStartTag()
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (StartTag) this;
 *  */
    @Test
    public void testAsStartTag_ThrowClassCastException() {
        Token.EndTag endTag = new Token.EndTag();
        
        /* This test fails because method [org.jsoup.parser.Token.asStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            org.jsoup.parser.Token.asStartTag(Token.java:223) */
        endTag.asStartTag();
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
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.Comment;
        doctype.type = type;
        
        boolean actual = doctype.isComment();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isComment()}
 * @utbot.returnsFrom {@code return type == TokenType.Comment;}
 *  */
    @Test
    public void testIsComment_TypeNotEqualsTokenTypeComment() {
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.type = null;
        
        boolean actual = startTag.isComment();
        
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
 *  */
    @Test
    public void testTokenType_ClassGetSimpleName() throws Exception  {
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        
        String actual = doctype.tokenType();
        
        String expected = "Doctype";
        
        assertEquals(expected, actual);
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
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.StartTag;
        doctype.type = type;
        
        boolean actual = doctype.isStartTag();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isStartTag()}
 * @utbot.returnsFrom {@code return type == TokenType.StartTag;}
 *  */
    @Test
    public void testIsStartTag_TypeNotEqualsTokenTypeStartTag() {
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.type = null;
        
        boolean actual = startTag.isStartTag();
        
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
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.EndTag;
        doctype.type = type;
        
        boolean actual = doctype.isEndTag();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isEndTag()}
 * @utbot.returnsFrom {@code return type == TokenType.EndTag;}
 *  */
    @Test
    public void testIsEndTag_TypeNotEqualsTokenTypeEndTag() {
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.type = null;
        
        boolean actual = startTag.isEndTag();
        
        assertFalse(actual);
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
    public void testAsDoctype_ThrowClassCastException() {
        Token.StartTag startTag = new Token.StartTag();
        
        /* This test fails because method [org.jsoup.parser.Token.asDoctype] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            org.jsoup.parser.Token.asDoctype(Token.java:215) */
        startTag.asDoctype();
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
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.EOF;
        doctype.type = type;
        
        boolean actual = doctype.isEOF();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Token}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Token#isEOF()}
 * @utbot.returnsFrom {@code return type == TokenType.EOF;}
 *  */
    @Test
    public void testIsEOF_TypeNotEqualsTokenTypeEOF() {
        Token.StartTag startTag = new Token.StartTag(null, null);
        startTag.type = null;
        
        boolean actual = startTag.isEOF();
        
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields997390976358700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields997390976358700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass997390976364800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields997390976358700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass997390976364800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


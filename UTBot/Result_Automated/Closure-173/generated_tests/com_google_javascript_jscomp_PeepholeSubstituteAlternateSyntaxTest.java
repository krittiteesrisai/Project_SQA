package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import java.util.ArrayList;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_PeepholeSubstituteAlternateSyntaxTest {
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): True}
 * @utbot.executesCondition {@code (null != flags.getNext()): True}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_NullNotEqualsFlagsGetNext() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", numberNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = numberNode;
        Object actual = tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        org.junit.Assert.assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): False}
 * @utbot.executesCondition {@code (null == pattern): True}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_NullEqualsPattern() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", stringNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): False}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_PatternIsStringAndNotEqualsAndPatternGetStringLengthGreaterOrEqual100AndNullEqualsFlagsOrFlagsIsStringAndIsEcmaScript5OrGreaterOrNotContainsUnicodeEscape() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", stringNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        int stringNodeFirstNextType = stringNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        org.junit.Assert.assertEquals(stringNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): False}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_Equals() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", stringNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String stringNodeFirstNextStr = ((String) getFieldValue(stringNodeFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(stringNodeFirstNextStr, actualFirstNextStr);
        
        int stringNodeFirstNextType = stringNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        org.junit.Assert.assertEquals(stringNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): True}
 * @utbot.executesCondition {@code (null != flags.getNext()): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): True}
 * @utbot.executesCondition {@code ((null == flags || flags.isString())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_NullEqualsFlagsOrFlagsIsString() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(-256);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", nodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        org.junit.Assert.assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double nodeFirstNumber = ((Double) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(nodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String nodeFirstNextStr = ((String) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(nodeFirstNextStr, actualFirstNextStr);
        
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        org.junit.Assert.assertEquals(nodeFirstNextType, actualFirstNextType);
        
        Node nodeFirstNextNext = nodeFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
        assertTrue(deepEquals(nodeFirstNextNext, actualFirstNextNext));
        int nodeFirstNextNextType = nodeFirstNextNext.getType();
        int actualFirstNextNextType = actualFirstNextNext.getType();
        org.junit.Assert.assertEquals(nodeFirstNextNextType, actualFirstNextNextType);
        
        assertTrue(deepEquals(nodeFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int nodeFirstNextNextSourcePosition = nodeFirstNextNext.getSourcePosition();
        int actualFirstNextNextSourcePosition = actualFirstNextNext.getSourcePosition();
        org.junit.Assert.assertEquals(nodeFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertNull(actualFirstNextNextParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(PeepholeSubstituteAlternateSyntax.java:374) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", nodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = ((Object) null);
        try {
            tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node pattern = constructor.getNext();
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(PeepholeSubstituteAlternateSyntax.java:376) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", stringNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pattern.getString().length() < 100
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException_2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(PeepholeSubstituteAlternateSyntax.java:391) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", stringNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException_3() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(PeepholeSubstituteAlternateSyntax.java:422) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", numberNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = numberNode;
        try {
            tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): False}
 * @utbot.executesCondition {@code ((isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): False}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pattern = makeForwardSlashBracketSafe(pattern);
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException_4() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "]";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(PeepholeSubstituteAlternateSyntax.java:422) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", nodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = node;
        try {
            tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.isString() && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.isString()) && (isEcmaScript5OrGreater() || !containsUnicodeEscape(pattern.getString()))): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: !"".equals(pattern.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldRegularExpressionConstructor_ThrowIllegalStateException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldRegularExpressionConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldRegularExpressionConstructor", stringNodeType);
        tryFoldRegularExpressionConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldRegularExpressionConstructorMethodArguments = new java.lang.Object[1];
        tryFoldRegularExpressionConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldRegularExpressionConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldRegularExpressionConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (bind != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#describeFunctionBind(com.google.javascript.rhino.Node,boolean)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldImmediateCallToBoundFunction_BindEqualsNull() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JqueryCodingConvention defaultCodingConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        JqueryCodingConvention nextConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        ClosureCodingConvention nextConvention1 = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object nextConvention2 = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(nextConvention1, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention2);
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldImmediateCallToBoundFunctionMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldImmediateCallToBoundFunction", stringNodeType);
        tryFoldImmediateCallToBoundFunctionMethod.setAccessible(true);
        java.lang.Object[] tryFoldImmediateCallToBoundFunctionMethodArguments = new java.lang.Object[1];
        tryFoldImmediateCallToBoundFunctionMethodArguments[0] = stringNode;
        Object actual = tryFoldImmediateCallToBoundFunctionMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldImmediateCallToBoundFunctionMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.isCall());
 *  */
    @Test
    public void testTryFoldImmediateCallToBoundFunction_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction(PeepholeSubstituteAlternateSyntax.java:136) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldImmediateCallToBoundFunctionMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldImmediateCallToBoundFunction", nodeType);
        tryFoldImmediateCallToBoundFunctionMethod.setAccessible(true);
        java.lang.Object[] tryFoldImmediateCallToBoundFunctionMethodArguments = new java.lang.Object[1];
        tryFoldImmediateCallToBoundFunctionMethodArguments[0] = ((Object) null);
        try {
            tryFoldImmediateCallToBoundFunctionMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldImmediateCallToBoundFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Bind bind = getCodingConvention().describeFunctionBind(callTarget, false);
 *  */
    @Test
    public void testTryFoldImmediateCallToBoundFunction_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction(PeepholeSubstituteAlternateSyntax.java:138) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldImmediateCallToBoundFunctionMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldImmediateCallToBoundFunction", stringNodeType);
        tryFoldImmediateCallToBoundFunctionMethod.setAccessible(true);
        java.lang.Object[] tryFoldImmediateCallToBoundFunctionMethodArguments = new java.lang.Object[1];
        tryFoldImmediateCallToBoundFunctionMethodArguments[0] = stringNode;
        try {
            tryFoldImmediateCallToBoundFunctionMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldImmediateCallToBoundFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.isCall());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldImmediateCallToBoundFunction_ThrowIllegalStateException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldImmediateCallToBoundFunctionMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldImmediateCallToBoundFunction", stringNodeType);
        tryFoldImmediateCallToBoundFunctionMethod.setAccessible(true);
        java.lang.Object[] tryFoldImmediateCallToBoundFunctionMethodArguments = new java.lang.Object[1];
        tryFoldImmediateCallToBoundFunctionMethodArguments[0] = stringNode;
        try {
            tryFoldImmediateCallToBoundFunctionMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldImmediateCallToBoundFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#describeFunctionBind(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Bind bind = getCodingConvention().describeFunctionBind(callTarget, false);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldImmediateCallToBoundFunction_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JqueryCodingConvention defaultCodingConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        JqueryCodingConvention nextConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        ClosureCodingConvention nextConvention1 = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object nextConvention2 = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(nextConvention1, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention2);
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldImmediateCallToBoundFunctionMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldImmediateCallToBoundFunction", stringNodeType);
        tryFoldImmediateCallToBoundFunctionMethod.setAccessible(true);
        java.lang.Object[] tryFoldImmediateCallToBoundFunctionMethodArguments = new java.lang.Object[1];
        tryFoldImmediateCallToBoundFunctionMethodArguments[0] = stringNode;
        try {
            tryFoldImmediateCallToBoundFunctionMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldImmediateCallToBoundFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReplaceUndefined
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryReplaceUndefined(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized() && NodeUtil.isUndefined(n)): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReplaceUndefined_IsASTNormalizedAndNodeUtilIsUndefined() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", nodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = ((Object) null);
        Node actual = ((Node) tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized() && NodeUtil.isUndefined(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isUndefined(n)): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReplaceUndefined_NotNodeUtilIsUndefined() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", stringNodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = stringNode;
        Object actual = tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized() && NodeUtil.isUndefined(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isUndefined(n)): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReplaceUndefined_NotNodeUtilIsUndefined_1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", stringNodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = stringNode;
        Object actual = tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized() && NodeUtil.isUndefined(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isUndefined(n)): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReplaceUndefined_NotNodeUtilIsUndefined_2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", stringNodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = stringNode;
        Object actual = tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments);
        
        String stringNodeStr = ((String) getFieldValue(stringNode, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(stringNodeStr, actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryReplaceUndefined(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized() && NodeUtil.isUndefined(n)): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: NodeUtil.isUndefined(n)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryReplaceUndefined_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", numberNodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = numberNode;
        try {
            tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized() && NodeUtil.isUndefined(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isUndefined(n)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: !NodeUtil.isLValue(n)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryReplaceUndefined_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", stringNodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = stringNode;
        try {
            tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized() && NodeUtil.isUndefined(n) && !NodeUtil.isLValue(n)
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryReplaceUndefined_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReplaceUndefinedMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReplaceUndefined", nodeType);
        tryReplaceUndefinedMethod.setAccessible(true);
        java.lang.Object[] tryReplaceUndefinedMethodArguments = new java.lang.Object[1];
        tryReplaceUndefinedMethodArguments[0] = ((Object) null);
        try {
            tryReplaceUndefinedMethod.invoke(peepholeSubstituteAlternateSyntax, tryReplaceUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldStandardConstructors(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldStandardConstructors_NotIsASTNormalized() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", numberNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = numberNode;
        Object actual = tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldStandardConstructors_NotNGetFirstChildIsName() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", stringNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = stringNode;
        Object actual = tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStandardConstructors(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNew()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.isNew());
 *  */
    @Test
    public void testTryFoldStandardConstructors_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors(PeepholeSubstituteAlternateSyntax.java:262) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", nodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = ((Object) null);
        try {
            tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getFirstChild().isName()
 *  */
    @Test
    public void testTryFoldStandardConstructors_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors(PeepholeSubstituteAlternateSyntax.java:268) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", stringNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = stringNode;
        try {
            tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getFirstChild().isName()
 *  */
    @Test
    public void testTryFoldStandardConstructors_ThrowNullPointerException_2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors(PeepholeSubstituteAlternateSyntax.java:268) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", stringNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = stringNode;
        try {
            tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStandardConstructors(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.isNew());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStandardConstructors_ThrowIllegalStateException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", stringNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = stringNode;
        try {
            tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String className = n.getFirstChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStandardConstructors_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", stringNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = stringNode;
        try {
            tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized()
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldStandardConstructors_ThrowNullPointerException_3() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", stringNodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = stringNode;
        try {
            tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldStandardConstructors(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldStandardConstructors1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", nodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        org.junit.Assert.assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = nodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    @Test
    public void testTryFoldStandardConstructors2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStandardConstructorsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldStandardConstructors", nodeType);
        tryFoldStandardConstructorsMethod.setAccessible(true);
        java.lang.Object[] tryFoldStandardConstructorsMethodArguments = new java.lang.Object[1];
        tryFoldStandardConstructorsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStandardConstructorsMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldStandardConstructorsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        org.junit.Assert.assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = nodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget != null): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldSimpleFunctionCall_CallTargetEqualsNull() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", stringNodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = stringNode;
        Object actual = tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget != null): True}
 * @utbot.executesCondition {@code (callTarget.isName()): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldSimpleFunctionCall_NotCallTargetIsName() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", stringNodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = stringNode;
        Object actual = tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget != null): True}
 * @utbot.executesCondition {@code (callTarget.isName()): True}
 * @utbot.executesCondition {@code (callTarget.getString().equals("String")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldSimpleFunctionCall_NotCallTargetGetStringEquals() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", stringNodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = stringNode;
        Object actual = tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String stringNodeFirstStr = ((String) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(stringNodeFirstStr, actualFirstStr);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.isCall());
 *  */
    @Test
    public void testTryFoldSimpleFunctionCall_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall(PeepholeSubstituteAlternateSyntax.java:110) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", nodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = ((Object) null);
        try {
            tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget != null): True}
 * @utbot.executesCondition {@code (callTarget.isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: callTarget.getString().equals("String")
 *  */
    @Test
    public void testTryFoldSimpleFunctionCall_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall(PeepholeSubstituteAlternateSyntax.java:113) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", stringNodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = stringNode;
        try {
            tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.isCall());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldSimpleFunctionCall_ThrowIllegalStateException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", stringNodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = stringNode;
        try {
            tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget != null): True}
 * @utbot.executesCondition {@code (callTarget.isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: callTarget.getString().equals("String")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldSimpleFunctionCall_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldSimpleFunctionCallMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldSimpleFunctionCall", stringNodeType);
        tryFoldSimpleFunctionCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldSimpleFunctionCallMethodArguments = new java.lang.Object[1];
        tryFoldSimpleFunctionCallMethodArguments[0] = stringNode;
        try {
            tryFoldSimpleFunctionCallMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldSimpleFunctionCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldLiteralConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLiteralConstructor_NotIsASTNormalized() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (Token.NAME == constructorNameNode.getType()): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLiteralConstructor_TokenNAMENotEqualsConstructorNameNodeGetType() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (Token.NAME == constructorNameNode.getType()): True}
 * @utbot.executesCondition {@code ("RegExp".equals(className)): False}
 * @utbot.executesCondition {@code ("Object".equals(className)): False}
 * @utbot.executesCondition {@code ("Array".equals(className)): False}
 * @utbot.executesCondition {@code (newLiteralNode != null): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLiteralConstructor_BooleanConstructorHasArgsInitializedByConstructorNameNodeGetNextEqualsNull() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (Token.NAME == constructorNameNode.getType()): True}
 * @utbot.executesCondition {@code ("RegExp".equals(className)): False}
 * @utbot.executesCondition {@code ("Object".equals(className)): False}
 * @utbot.executesCondition {@code ("Array".equals(className)): False}
 * @utbot.executesCondition {@code (newLiteralNode != null): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLiteralConstructor_BooleanConstructorHasArgsInitializedByConstructorNameNodeGetNextNotEqualsNull() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        double stringNodeFirstNextNumber = ((Double) getFieldValue(stringNodeFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNumber = ((Double) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNextNumber, actualFirstNextNumber, 1.0E-6);
        
        int stringNodeFirstNextType = stringNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        org.junit.Assert.assertEquals(stringNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (Token.NAME == constructorNameNode.getType()): True}
 * @utbot.executesCondition {@code ("RegExp".equals(className)): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return tryFoldRegularExpressionConstructor(n);}
 *  */
    @Test
    public void testTryFoldLiteralConstructor_RegExpEquals() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        Object actual = tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String stringNodeFirstStr = ((String) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(stringNodeFirstStr, actualFirstStr);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        double stringNodeFirstNextNumber = ((Double) getFieldValue(stringNodeFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNumber = ((Double) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNextNumber, actualFirstNextNumber, 1.0E-6);
        
        int stringNodeFirstNextType = stringNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        org.junit.Assert.assertEquals(stringNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldLiteralConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isCall() || n.isNew());
 *  */
    @Test
    public void testTryFoldLiteralConstructor_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor(PeepholeSubstituteAlternateSyntax.java:286) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", nodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = ((Object) null);
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.isCall() || n.isNew());): False}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized() && Token.NAME == constructorNameNode.getType()
 *  */
    @Test
    public void testTryFoldLiteralConstructor_ThrowNullPointerException_2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Node node = new Node(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor(PeepholeSubstituteAlternateSyntax.java:297) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", nodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = node;
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.isCall() || n.isNew());): False}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized() && Token.NAME == constructorNameNode.getType()
 *  */
    @Test
    public void testTryFoldLiteralConstructor_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor(PeepholeSubstituteAlternateSyntax.java:297) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldLiteralConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.isCall() || n.isNew());): True}
 * @utbot.executesCondition {@code (n.isNew()): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isCall() || n.isNew());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldLiteralConstructor_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.isCall() || n.isNew());): False}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (Token.NAME == constructorNameNode.getType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String className = constructorNameNode.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLiteralConstructor_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.isCall() || n.isNew());): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized() && Token.NAME == constructorNameNode.getType()
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldLiteralConstructor_ThrowNullPointerException_3() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.isCall() || n.isNew());): True}
 * @utbot.executesCondition {@code (n.isNew()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized() && Token.NAME == constructorNameNode.getType()
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldLiteralConstructor_ThrowNullPointerException_4() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLiteralConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryFoldLiteralConstructor", stringNodeType);
        tryFoldLiteralConstructorMethod.setAccessible(true);
        java.lang.Object[] tryFoldLiteralConstructorMethodArguments = new java.lang.Object[1];
        tryFoldLiteralConstructorMethodArguments[0] = stringNode;
        try {
            tryFoldLiteralConstructorMethod.invoke(peepholeSubstituteAlternateSyntax, tryFoldLiteralConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isSafeToFoldArrayConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg == null): True}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_ArgEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", nodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = ((Object) null);
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "SAFE_TO_FOLD_WITHOUT_ARGS");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg == null): False}
 * @utbot.executesCondition {@code (arg.getNext() != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_ArgGetNextNotEqualsNull() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", stringNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = stringNode;
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "SAFE_TO_FOLD_WITH_ARGS");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (arg == null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (arg.getNext() != null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(arg.getType()) case: default}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_SwitchArgGetTypeCasedefault() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", stringNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = stringNode;
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "NOT_SAFE_TO_FOLD");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(arg.getType()) case: default}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_SwitchArgGetTypeCasedefault_1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", stringNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = stringNode;
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "SAFE_TO_FOLD_WITH_ARGS");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(arg.getType()) case: default}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_SwitchArgGetTypeCasedefault_2() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", stringNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = stringNode;
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "SAFE_TO_FOLD_WITH_ARGS");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg.getDouble() == 0): False}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_ArgGetDoubleNotEqualsZero() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 4.9E-324);
        (((Node) numberNode)).setType(39);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", numberNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = numberNode;
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "NOT_SAFE_TO_FOLD");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg.getDouble() == 0): True}
 * @utbot.returnsFrom {@code return action;}
 *  */
    @Test
    public void testIsSafeToFoldArrayConstructor_ArgGetDoubleEqualsZero() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", numberNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = numberNode;
        Object actual = isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        
        Class foldArrayActionClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Object expected = getEnumConstantByName(foldArrayActionClazz, "SAFE_TO_FOLD_WITHOUT_ARGS");
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg == null): False}
 * @utbot.executesCondition {@code (arg.getNext() != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.activatesSwitch {@code switch(arg.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: arg.getDouble() == 0
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsSafeToFoldArrayConstructor_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(39);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSafeToFoldArrayConstructorMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("isSafeToFoldArrayConstructor", stringNodeType);
        isSafeToFoldArrayConstructorMethod.setAccessible(true);
        java.lang.Object[] isSafeToFoldArrayConstructorMethodArguments = new java.lang.Object[1];
        isSafeToFoldArrayConstructorMethodArguments[0] = stringNode;
        try {
            isSafeToFoldArrayConstructorMethod.invoke(null, isSafeToFoldArrayConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeStringArrayLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): True}
 *  */
    @Test
    public void testTryMinimizeStringArrayLiteral_NotLate() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", nodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = ((Object) null);
        Node actual = ((Node) tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int numElements = n.getChildCount();
 *  */
    @Test
    public void testTryMinimizeStringArrayLiteral_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeStringArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeStringArrayLiteral(PeepholeSubstituteAlternateSyntax.java:461) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", nodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = ((Object) null);
        try {
            tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryMinimizeStringArrayLiteral1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", stringNodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryMinimizeStringArrayLiteral2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", stringNodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    @Test
    public void testTryMinimizeStringArrayLiteral3() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", stringNodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    @Test
    public void testTryMinimizeStringArrayLiteral4() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", stringNodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node stringNodeFirstNextNext = stringNodeFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
        assertTrue(deepEquals(stringNodeFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(stringNodeFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int stringNodeFirstNextNextSourcePosition = stringNodeFirstNextNext.getSourcePosition();
        int actualFirstNextNextSourcePosition = actualFirstNextNext.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertNull(actualFirstNextNextParent);
        
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryMinimizeStringArrayLiteral5() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeStringArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeStringArrayLiteral", stringNodeType);
        tryMinimizeStringArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeStringArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeStringArrayLiteralMethodArguments[0] = stringNode;
        try {
            tryMinimizeStringArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeStringArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeArrayLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (allStrings): True}
 * @utbot.returnsFrom {@code return tryMinimizeStringArrayLiteral(n);}
 *  */
    @Test
    public void testTryMinimizeArrayLiteral_AllStrings() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", stringNodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (allStrings): False}
 * @utbot.iterates iterate the loop {@code for(Node cur = n.getFirstChild(); cur != null; cur = cur.getNext())} once
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryMinimizeArrayLiteral_NotAllStrings() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", stringNodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (allStrings): True}
 * @utbot.iterates iterate the loop {@code for(Node cur = n.getFirstChild(); cur != null; cur = cur.getNext())} once
 * @utbot.returnsFrom {@code return tryMinimizeStringArrayLiteral(n);}
 *  */
    @Test
    public void testTryMinimizeArrayLiteral_CurIsString() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", stringNodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node cur = n.getFirstChild(); cur != null; cur = cur.getNext())
 *  */
    @Test
    public void testTryMinimizeArrayLiteral_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeArrayLiteral(PeepholeSubstituteAlternateSyntax.java:443) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", nodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = ((Object) null);
        try {
            tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryMinimizeArrayLiteral1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Node node = new Node(0);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", nodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = node;
        Node actual = ((Node) tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryMinimizeArrayLiteral2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", stringNodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = stringNode;
        Object actual = tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryMinimizeArrayLiteral3() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeArrayLiteralMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryMinimizeArrayLiteral", stringNodeType);
        tryMinimizeArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeArrayLiteralMethodArguments = new java.lang.Object[1];
        tryMinimizeArrayLiteralMethodArguments[0] = stringNode;
        try {
            tryMinimizeArrayLiteralMethod.invoke(peepholeSubstituteAlternateSyntax, tryMinimizeArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} once
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_IterateForLoop() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\\";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} twice
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_IterateForLoop_1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\\\\";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} twice
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_NotIsEscaped() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "[/";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} once
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_SwitchChCasedefault() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} once
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_NotIsEscaped_1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "[";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} once
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_NotIsEscaped_2() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "]";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} once
    /// activate {@code switch(ch) case: '\\'}, execute conditions:
    ///     {@code (isEscaped = !isEscaped;): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} twice
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_IsEscaped() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\\/";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} twice
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_IsEscaped_1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\\[";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} twice
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_IsEscaped_2() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\\]";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s = n.getString();
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe(PeepholeSubstituteAlternateSyntax.java:560) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", nodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = ((Object) null);
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < s.length(); ++i)
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe(PeepholeSubstituteAlternateSyntax.java:565) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String s = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMakeForwardSlashBracketSafe_ThrowIllegalStateException() throws Throwable  {
        Node node = new Node(0);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", nodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = node;
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String s = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMakeForwardSlashBracketSafe_ThrowIllegalStateException_1() throws Throwable  {
        Node node = new Node(40);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("makeForwardSlashBracketSafe", nodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = node;
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areValidRegexpFlags
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method areValidRegexpFlags(java.lang.String)
    
    @Test
    public void testAreValidRegexpFlags1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areValidRegexpFlagsMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areValidRegexpFlags", stringType);
        areValidRegexpFlagsMethod.setAccessible(true);
        java.lang.Object[] areValidRegexpFlagsMethodArguments = new java.lang.Object[1];
        areValidRegexpFlagsMethodArguments[0] = string;
        boolean actual = ((Boolean) areValidRegexpFlagsMethod.invoke(null, areValidRegexpFlagsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsUnicodeEscape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#containsUnicodeEscape(java.lang.String)}
     */
    @Test
    public void testContainsUnicodeEscapeReturnsFalseWithNonEmptyString() {
        boolean actual = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("XZb");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containsUnicodeEscape(java.lang.String)
    
    @Test
    public void testContainsUnicodeEscape1() {
        String string = "";
        
        boolean actual = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.returnsFrom {@code return node;}
 *  */
    @Test
    public void testOptimizeSubtree_NodeIsCall() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.returnsFrom {@code return node;}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnNode() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#reduceTrueFalse(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.returnsFrom {@code return reduceTrueFalse(node);}
 *  */
    @Test
    public void testOptimizeSubtree_PeepholeSubstituteAlternateSyntaxReduceTrueFalse() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return trySplitComma(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTrySplitComma() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReplaceUndefined(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.returnsFrom {@code return tryReplaceUndefined(node);}
 *  */
    @Test
    public void testOptimizeSubtree_PeepholeSubstituteAlternateSyntaxTryReplaceUndefined() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryReduceReturn(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryReduceReturn() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryMinimizeArrayLiteral(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryMinimizeArrayLiteral() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryReduceReturn(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryReduceReturn_1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryMinimizeArrayLiteral(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryMinimizeArrayLiteral_1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryMinimizeArrayLiteral(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryMinimizeArrayLiteral_2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return trySplitComma(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTrySplitComma_1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        double stringNodeParentNumber = ((Double) getFieldValue(stringNodeParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualParentNumber = ((Double) getFieldValue(actualParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeParentNumber, actualParentNumber, 1.0E-6);
        
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        org.junit.Assert.assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryReduceReturn(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryReduceReturn_2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(49);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node numberNodeFirstFirst = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        int numberNodeFirstFirstType = numberNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        org.junit.Assert.assertEquals(numberNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int numberNodeFirstFirstSourcePosition = numberNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        org.junit.Assert.assertEquals(numberNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return trySplitComma(node);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTrySplitComma_2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(126);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        double stringNodeParentNumber = ((Double) getFieldValue(stringNodeParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualParentNumber = ((Double) getFieldValue(actualParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeParentNumber, actualParentNumber, 1.0E-6);
        
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        org.junit.Assert.assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node stringNodeParentParent = stringNodeParent.getParent();
        Node actualParentParent = actualParent.getParent();
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        int stringNodeParentParentType = stringNodeParentParent.getType();
        int actualParentParentType = actualParentParent.getType();
        org.junit.Assert.assertEquals(stringNodeParentParentType, actualParentParentType);
        
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        Node actualParentParentParent = actualParentParent.getParent();
        assertNull(actualParentParentParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(node.getType())
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException() {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:68) */
        peepholeSubstituteAlternateSyntax.optimizeSubtree(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node = tryFoldStandardConstructors(node);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_3() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors(PeepholeSubstituteAlternateSyntax.java:268)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:74) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node result = tryFoldLiteralConstructor(node);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_4() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor(PeepholeSubstituteAlternateSyntax.java:297)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:81) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_5() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryReduceReturn(node);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_6() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:236)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return trySplitComma(node);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:181)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:94) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return trySplitComma(node);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:182)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:94) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return tryReduceReturn(node);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testOptimizeSubtree_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return tryReplaceUndefined(node);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testOptimizeSubtree_ThrowUnsupportedOperationException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryReplaceUndefined(node);
 *  */
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree_ThrowNullPointerException_7() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldStandardConstructors(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node = tryFoldStandardConstructors(node);
 *  */
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree_ThrowNullPointerException_8() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryFoldLiteralConstructor(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node result = tryFoldLiteralConstructor(node);
 *  */
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree_ThrowNullPointerException_9() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    @Test
    public void testOptimizeSubtree1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Node node = new Node(63);
        
        Node actual = peepholeSubstituteAlternateSyntax.optimizeSubtree(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(63);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        org.junit.Assert.assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        org.junit.Assert.assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testOptimizeSubtree2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testOptimizeSubtree3() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String stringNodeFirstStr = ((String) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(stringNodeFirstStr, actualFirstStr);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    @Test
    public void testOptimizeSubtree4() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    @Test
    public void testOptimizeSubtree5() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(103);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testOptimizeSubtree6() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testOptimizeSubtree7() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(125);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree8() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.reduceTrueFalse(PeepholeSubstituteAlternateSyntax.java:434)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:71) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree9() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getCodingConvention(Compiler.java:2052)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.getCodingConvention(AbstractPeepholeOptimization.java:147)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction(PeepholeSubstituteAlternateSyntax.java:138)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:85) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree10() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(88);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:882)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree11() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:963)
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:943)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:858)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree12() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall(PeepholeSubstituteAlternateSyntax.java:113)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:83) */
        peepholeSubstituteAlternateSyntax.optimizeSubtree(node);
    }
    
    @Test
    public void testOptimizeSubtree13() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(NodeUtil.java:1019)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:868)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree14() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(108);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:2045)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.reportCodeChange(AbstractPeepholeOptimization.java:63)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:231)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree15() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:554)
            com.google.javascript.rhino.Node.replaceChild(Node.java:727)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:186)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:94) */
        peepholeSubstituteAlternateSyntax.optimizeSubtree(node);
    }
    
    @Test
    public void testOptimizeSubtree16() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:554)
            com.google.javascript.rhino.Node.replaceChild(Node.java:727)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:186)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:94) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeSubtree17() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:2045)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.reportCodeChange(AbstractPeepholeOptimization.java:63)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:231)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(PeepholeSubstituteAlternateSyntax.java:91) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testOptimizeSubtree18() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testOptimizeSubtree19() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 42);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree20() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(130);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree21() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree22() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree23() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testOptimizeSubtree24() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeSubstituteAlternateSyntax, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addParameterAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#addParameterAfter(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parameterList != null): False}
 *  */
    @Test
    public void testAddParameterAfter_ParameterListEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addParameterAfterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("addParameterAfter", nodeType, nodeType);
        addParameterAfterMethod.setAccessible(true);
        java.lang.Object[] addParameterAfterMethodArguments = new java.lang.Object[2];
        addParameterAfterMethodArguments[0] = ((Object) null);
        addParameterAfterMethodArguments[1] = ((Object) null);
        addParameterAfterMethod.invoke(peepholeSubstituteAlternateSyntax, addParameterAfterMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addParameterAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#addParameterAfter(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.triggersRecursion addParameterAfter
 * @utbot.throwsException {@link java.lang.NullPointerException} in: after.getParent().addChildAfter(parameterList.cloneTree(), after);
 *  */
    @Test
    public void testAddParameterAfter_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:169) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addParameterAfterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("addParameterAfter", stringNodeType, stringNodeType);
        addParameterAfterMethod.setAccessible(true);
        java.lang.Object[] addParameterAfterMethodArguments = new java.lang.Object[2];
        addParameterAfterMethodArguments[0] = stringNode;
        addParameterAfterMethodArguments[1] = ((Object) null);
        try {
            addParameterAfterMethod.invoke(peepholeSubstituteAlternateSyntax, addParameterAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#addParameterAfter(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#cloneTree()}
 * @utbot.triggersRecursion addParameterAfter
 * @utbot.throwsException {@link java.lang.NullPointerException} in: after.getParent().addChildAfter(parameterList.cloneTree(), after);
 *  */
    @Test
    public void testAddParameterAfter_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:169) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addParameterAfterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("addParameterAfter", stringNodeType, stringNodeType);
        addParameterAfterMethod.setAccessible(true);
        java.lang.Object[] addParameterAfterMethodArguments = new java.lang.Object[2];
        addParameterAfterMethodArguments[0] = stringNode;
        addParameterAfterMethodArguments[1] = numberNode;
        try {
            addParameterAfterMethod.invoke(peepholeSubstituteAlternateSyntax, addParameterAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addParameterAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameterAfter1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addParameterAfterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("addParameterAfter", stringNodeType, stringNodeType);
        addParameterAfterMethod.setAccessible(true);
        java.lang.Object[] addParameterAfterMethodArguments = new java.lang.Object[2];
        addParameterAfterMethodArguments[0] = stringNode;
        addParameterAfterMethodArguments[1] = ((Object) null);
        try {
            addParameterAfterMethod.invoke(peepholeSubstituteAlternateSyntax, addParameterAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddParameterAfter2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next9 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next10 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next11 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next14 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next15 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next16 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next17 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next19 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next20 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next23 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next24 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next25 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next26 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next27 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next28 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next29 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next30 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next31 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next32 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next33 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next34 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next35 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next36 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next37 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next38 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next39 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next40 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next41 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next42 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next43 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next44 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next45 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next46 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next47 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next48 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next49 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next48, "com.google.javascript.rhino.Node", "next", next49);
        setField(next47, "com.google.javascript.rhino.Node", "next", next48);
        setField(next46, "com.google.javascript.rhino.Node", "next", next47);
        setField(next45, "com.google.javascript.rhino.Node", "next", next46);
        setField(next44, "com.google.javascript.rhino.Node", "next", next45);
        setField(next43, "com.google.javascript.rhino.Node", "next", next44);
        setField(next42, "com.google.javascript.rhino.Node", "next", next43);
        setField(next41, "com.google.javascript.rhino.Node", "next", next42);
        setField(next40, "com.google.javascript.rhino.Node", "next", next41);
        setField(next39, "com.google.javascript.rhino.Node", "next", next40);
        setField(next38, "com.google.javascript.rhino.Node", "next", next39);
        setField(next37, "com.google.javascript.rhino.Node", "next", next38);
        setField(next36, "com.google.javascript.rhino.Node", "next", next37);
        setField(next35, "com.google.javascript.rhino.Node", "next", next36);
        setField(next34, "com.google.javascript.rhino.Node", "next", next35);
        setField(next33, "com.google.javascript.rhino.Node", "next", next34);
        setField(next32, "com.google.javascript.rhino.Node", "next", next33);
        setField(next31, "com.google.javascript.rhino.Node", "next", next32);
        setField(next30, "com.google.javascript.rhino.Node", "next", next31);
        setField(next29, "com.google.javascript.rhino.Node", "next", next30);
        setField(next28, "com.google.javascript.rhino.Node", "next", next29);
        setField(next27, "com.google.javascript.rhino.Node", "next", next28);
        setField(next26, "com.google.javascript.rhino.Node", "next", next27);
        setField(next25, "com.google.javascript.rhino.Node", "next", next26);
        setField(next24, "com.google.javascript.rhino.Node", "next", next25);
        setField(next23, "com.google.javascript.rhino.Node", "next", next24);
        setField(next22, "com.google.javascript.rhino.Node", "next", next23);
        setField(next21, "com.google.javascript.rhino.Node", "next", next22);
        setField(next20, "com.google.javascript.rhino.Node", "next", next21);
        setField(next19, "com.google.javascript.rhino.Node", "next", next20);
        setField(next18, "com.google.javascript.rhino.Node", "next", next19);
        setField(next17, "com.google.javascript.rhino.Node", "next", next18);
        setField(next16, "com.google.javascript.rhino.Node", "next", next17);
        setField(next15, "com.google.javascript.rhino.Node", "next", next16);
        setField(next14, "com.google.javascript.rhino.Node", "next", next15);
        setField(next13, "com.google.javascript.rhino.Node", "next", next14);
        setField(next12, "com.google.javascript.rhino.Node", "next", next13);
        setField(next11, "com.google.javascript.rhino.Node", "next", next12);
        setField(next10, "com.google.javascript.rhino.Node", "next", next11);
        setField(next9, "com.google.javascript.rhino.Node", "next", next10);
        setField(next8, "com.google.javascript.rhino.Node", "next", next9);
        setField(next7, "com.google.javascript.rhino.Node", "next", next8);
        setField(next6, "com.google.javascript.rhino.Node", "next", next7);
        setField(next5, "com.google.javascript.rhino.Node", "next", next6);
        setField(next4, "com.google.javascript.rhino.Node", "next", next5);
        setField(next3, "com.google.javascript.rhino.Node", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:169)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(PeepholeSubstituteAlternateSyntax.java:168) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addParameterAfterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("addParameterAfter", stringNodeType, stringNodeType);
        addParameterAfterMethod.setAccessible(true);
        java.lang.Object[] addParameterAfterMethodArguments = new java.lang.Object[2];
        addParameterAfterMethodArguments[0] = stringNode;
        addParameterAfterMethodArguments[1] = numberNode;
        try {
            addParameterAfterMethod.invoke(peepholeSubstituteAlternateSyntax, addParameterAfterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryReduceReturn(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceReturn_ReturnN() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        Object actual = tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceReturn_SwitchResultGetTypeCasedefault() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        Object actual = tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceReturn_ReturnN_2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(118);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        Object actual = tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceReturn_ReturnN_1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(49);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        Object actual = tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstFirstNumber = ((Double) getFieldValue(stringNodeFirstFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstFirstNumber = ((Double) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstFirstNumber, actualFirstFirstNumber, 1.0E-6);
        
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryReduceReturn(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node result = n.getFirstChild();
 *  */
    @Test
    public void testTryReduceReturn_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:223) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !mayHaveSideEffects(operand)
 *  */
    @Test
    public void testTryReduceReturn_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryReduceReturn(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#tryReduceReturn(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = result.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryReduceReturn_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryReduceReturn(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryReduceReturn1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(98);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", numberNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = numberNode;
        Object actual = tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
        Node finalNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        assertNull(finalNumberNodeFirst);
    }
    
    @Test
    public void testTryReduceReturn2() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(98);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Node initialNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = node;
        Node actual = ((Node) tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        org.junit.Assert.assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = nodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        org.junit.Assert.assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        
        Node finalNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeFirst == finalNodeFirst);
    }
    
    @Test
    public void testTryReduceReturn3() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(139);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        Object actual = tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        org.junit.Assert.assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryReduceReturn(com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryReduceReturn4() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryReduceReturn5() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(16);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn6() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(87);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException] */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn7() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 42);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:963)
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:943)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:858)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn8() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:236) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn9() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(NodeUtil.java:1019)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:868)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:229) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn10() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(154);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:2045)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.reportCodeChange(AbstractPeepholeOptimization.java:63)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:231) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn11() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(154);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:2045)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.reportCodeChange(AbstractPeepholeOptimization.java:63)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(PeepholeSubstituteAlternateSyntax.java:231) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryReduceReturn(com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryReduceReturn12() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 42);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryReduceReturn13() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", numberNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = numberNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTryReduceReturn14() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTryReduceReturn15() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTryReduceReturn16() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(43);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTryReduceReturn17() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTryReduceReturn18() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(21);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testTryReduceReturn19() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("tryReduceReturn", stringNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[1];
        tryReduceReturnMethodArguments[0] = stringNode;
        try {
            tryReduceReturnMethod.invoke(peepholeSubstituteAlternateSyntax, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trySplitComma(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): True}
 *  */
    @Test
    public void testTrySplitComma_Late() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", nodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = ((Object) null);
        Node actual = ((Node) trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): False}
 * @utbot.executesCondition {@code (parent.isExprResult()): False}
 *  */
    @Test
    public void testTrySplitComma_NotParentIsExprResult() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", stringNodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = stringNode;
        Object actual = trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        double stringNodeParentNumber = ((Double) getFieldValue(stringNodeParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualParentNumber = ((Double) getFieldValue(actualParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeParentNumber, actualParentNumber, 1.0E-6);
        
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        org.junit.Assert.assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): False}
 * @utbot.executesCondition {@code (parent.isExprResult()): True}
 * @utbot.executesCondition {@code (!parent.getParent().isLabel()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabel()}
 *  */
    @Test
    public void testTrySplitComma_ParentGetParentIsLabel() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(126);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", stringNodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = stringNode;
        Object actual = trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        double stringNodeParentNumber = ((Double) getFieldValue(stringNodeParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualParentNumber = ((Double) getFieldValue(actualParent, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(stringNodeParentNumber, actualParentNumber, 1.0E-6);
        
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        org.junit.Assert.assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node stringNodeParentParent = stringNodeParent.getParent();
        Node actualParentParent = actualParent.getParent();
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        int stringNodeParentParentType = stringNodeParentParent.getType();
        int actualParentParentType = actualParentParent.getType();
        org.junit.Assert.assertEquals(stringNodeParentParentType, actualParentParentType);
        
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        assertTrue(deepEquals(stringNodeParentParent, actualParentParent));
        Node actualParentParentParent = actualParentParent.getParent();
        assertNull(actualParentParentParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trySplitComma(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testTrySplitComma_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:177) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", nodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = ((Object) null);
        try {
            trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.isExprResult() && !parent.getParent().isLabel()
 *  */
    @Test
    public void testTrySplitComma_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:181) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", stringNodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = stringNode;
        try {
            trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.isExprResult()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !parent.getParent().isLabel()
 *  */
    @Test
    public void testTrySplitComma_ThrowNullPointerException_2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:182) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", stringNodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = stringNode;
        try {
            trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.isExprResult()): True}
 * @utbot.executesCondition {@code (!parent.getParent().isLabel()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabel()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#detachChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#replaceChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#exprResult(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node newStatement = IR.exprResult(right);
 *  */
    @Test
    public void testTrySplitComma_ThrowNullPointerException_3() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue1 = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue1);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "last", last);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(-256);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:550)
            com.google.javascript.rhino.IR.exprResult(IR.java:175)
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(PeepholeSubstituteAlternateSyntax.java:188) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", stringNodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = stringNode;
        try {
            trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method trySplitComma(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: parent.replaceChild(n, left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTrySplitComma_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", nodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = node;
        try {
            trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#trySplitComma(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: parent.replaceChild(n, left);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTrySplitComma_ThrowRuntimeException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(-255);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", next1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySplitCommaMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("trySplitComma", nodeType);
        trySplitCommaMethod.setAccessible(true);
        java.lang.Object[] trySplitCommaMethodArguments = new java.lang.Object[1];
        trySplitCommaMethodArguments[0] = node;
        try {
            trySplitCommaMethod.invoke(peepholeSubstituteAlternateSyntax, trySplitCommaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.reduceTrueFalse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reduceTrueFalse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#reduceTrueFalse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testReduceTrueFalse_NotLate() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method reduceTrueFalseMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("reduceTrueFalse", nodeType);
        reduceTrueFalseMethod.setAccessible(true);
        java.lang.Object[] reduceTrueFalseMethodArguments = new java.lang.Object[1];
        reduceTrueFalseMethodArguments[0] = ((Object) null);
        Node actual = ((Node) reduceTrueFalseMethod.invoke(peepholeSubstituteAlternateSyntax, reduceTrueFalseMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reduceTrueFalse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#reduceTrueFalse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isTrue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.isTrue()
 *  */
    @Test
    public void testReduceTrueFalse_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.reduceTrueFalse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.reduceTrueFalse(PeepholeSubstituteAlternateSyntax.java:432) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method reduceTrueFalseMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("reduceTrueFalse", nodeType);
        reduceTrueFalseMethod.setAccessible(true);
        java.lang.Object[] reduceTrueFalseMethodArguments = new java.lang.Object[1];
        reduceTrueFalseMethodArguments[0] = ((Object) null);
        try {
            reduceTrueFalseMethod.invoke(peepholeSubstituteAlternateSyntax, reduceTrueFalseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reduceTrueFalse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#reduceTrueFalse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isTrue()): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: not.copyInformationFromForTree(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReduceTrueFalse_ThrowUnsupportedOperationException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method reduceTrueFalseMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("reduceTrueFalse", stringNodeType);
        reduceTrueFalseMethod.setAccessible(true);
        java.lang.Object[] reduceTrueFalseMethodArguments = new java.lang.Object[1];
        reduceTrueFalseMethodArguments[0] = stringNode;
        try {
            reduceTrueFalseMethod.invoke(peepholeSubstituteAlternateSyntax, reduceTrueFalseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#reduceTrueFalse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isTrue()): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: not.copyInformationFromForTree(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReduceTrueFalse_ThrowUnsupportedOperationException_2() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method reduceTrueFalseMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("reduceTrueFalse", stringNodeType);
        reduceTrueFalseMethod.setAccessible(true);
        java.lang.Object[] reduceTrueFalseMethodArguments = new java.lang.Object[1];
        reduceTrueFalseMethodArguments[0] = stringNode;
        try {
            reduceTrueFalseMethod.invoke(peepholeSubstituteAlternateSyntax, reduceTrueFalseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#reduceTrueFalse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isTrue()): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: not.copyInformationFromForTree(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReduceTrueFalse_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method reduceTrueFalseMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("reduceTrueFalse", stringNodeType);
        reduceTrueFalseMethod.setAccessible(true);
        java.lang.Object[] reduceTrueFalseMethodArguments = new java.lang.Object[1];
        reduceTrueFalseMethodArguments[0] = stringNode;
        try {
            reduceTrueFalseMethod.invoke(peepholeSubstituteAlternateSyntax, reduceTrueFalseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method areSafeFlagsToFold(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#areSafeFlagsToFold(java.lang.String)}
 * @utbot.returnsFrom {@code return isEcmaScript5OrGreater() || flags.indexOf('g') < 0;}
 *  */
    @Test
    public void testAreSafeFlagsToFold_IsEcmaScript5OrGreaterOrFlagsIndexOfLessThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        String string = "";
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = string;
        boolean actual = ((Boolean) areSafeFlagsToFoldMethod.invoke(peepholeSubstituteAlternateSyntax, areSafeFlagsToFoldMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#areSafeFlagsToFold(java.lang.String)}
 * @utbot.returnsFrom {@code return isEcmaScript5OrGreater() || flags.indexOf('g') < 0;}
 *  */
    @Test
    public void testAreSafeFlagsToFold_IsEcmaScript5OrGreaterOrFlagsIndexOfGreaterOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        String string = "g";
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = string;
        boolean actual = ((Boolean) areSafeFlagsToFoldMethod.invoke(peepholeSubstituteAlternateSyntax, areSafeFlagsToFoldMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#areSafeFlagsToFold(java.lang.String)}
 *  */
    @Test
    public void testAreSafeFlagsToFold() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) areSafeFlagsToFoldMethod.invoke(peepholeSubstituteAlternateSyntax, areSafeFlagsToFoldMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#areSafeFlagsToFold(java.lang.String)}
 * @utbot.returnsFrom {@code return isEcmaScript5OrGreater() || flags.indexOf('g') < 0;}
 *  */
    @Test
    public void testAreSafeFlagsToFold_IsEcmaScript5OrGreaterOrFlagsIndexOfGreaterOrEqualZero_1() throws Exception  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) areSafeFlagsToFoldMethod.invoke(peepholeSubstituteAlternateSyntax, areSafeFlagsToFoldMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areSafeFlagsToFold(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#areSafeFlagsToFold(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEcmaScript5OrGreater() || flags.indexOf('g') < 0;
 *  */
    @Test
    public void testAreSafeFlagsToFold_ThrowNullPointerException() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = new PeepholeSubstituteAlternateSyntax(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold(PeepholeSubstituteAlternateSyntax.java:553) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = ((Object) null);
        try {
            areSafeFlagsToFoldMethod.invoke(peepholeSubstituteAlternateSyntax, areSafeFlagsToFoldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#areSafeFlagsToFold(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEcmaScript5OrGreater() || flags.indexOf('g') < 0;
 *  */
    @Test
    public void testAreSafeFlagsToFold_ThrowNullPointerException_1() throws Throwable  {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax = ((PeepholeSubstituteAlternateSyntax) createInstance("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        setField(peepholeSubstituteAlternateSyntax, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold(PeepholeSubstituteAlternateSyntax.java:553) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = ((Object) null);
        try {
            areSafeFlagsToFoldMethod.invoke(peepholeSubstituteAlternateSyntax, areSafeFlagsToFoldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pickDelimiter([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#pickDelimiter(java.lang.String[])}
 * @utbot.executesCondition {@code (allLength1): False}
 * @utbot.iterates iterate the loop {@code for(String s: strings)} once
 * @utbot.iterates iterate the loop {@code for(; delimiters[i] != null; i++)} once
 * @utbot.returnsFrom {@code return delimiters[i];}
 *  */
    @Test
    public void testPickDelimiter_NotCurContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "\u0000 ";
        stringArray[0] = string;
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method pickDelimiterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("pickDelimiter", stringArrayType);
        pickDelimiterMethod.setAccessible(true);
        java.lang.Object[] pickDelimiterMethodArguments = new java.lang.Object[1];
        pickDelimiterMethodArguments[0] = ((Object) stringArray);
        String actual = ((String) pickDelimiterMethod.invoke(null, pickDelimiterMethodArguments));
        
        String expected = ";";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#pickDelimiter(java.lang.String[])}
 * @utbot.executesCondition {@code (allLength1): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testPickDelimiter_AllLength1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.String[] stringArray = {};
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method pickDelimiterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("pickDelimiter", stringArrayType);
        pickDelimiterMethod.setAccessible(true);
        java.lang.Object[] pickDelimiterMethodArguments = new java.lang.Object[1];
        pickDelimiterMethodArguments[0] = ((Object) stringArray);
        String actual = ((String) pickDelimiterMethod.invoke(null, pickDelimiterMethodArguments));
        
        String expected = "";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#pickDelimiter(java.lang.String[])}
 * @utbot.executesCondition {@code (allLength1): True}
 * @utbot.iterates iterate the loop {@code for(String s: strings)} once
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testPickDelimiter_SLengthEquals1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "\u0000";
        stringArray[0] = string;
        
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method pickDelimiterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("pickDelimiter", stringArrayType);
        pickDelimiterMethod.setAccessible(true);
        java.lang.Object[] pickDelimiterMethodArguments = new java.lang.Object[1];
        pickDelimiterMethodArguments[0] = ((Object) stringArray);
        String actual = ((String) pickDelimiterMethod.invoke(null, pickDelimiterMethodArguments));
        
        String expected = "";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pickDelimiter([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#pickDelimiter(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String s: strings)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: s.length() != 1
 *  */
    @Test
    public void testPickDelimiter_ThrowNullPointerException_1() throws Throwable  {
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter(PeepholeSubstituteAlternateSyntax.java:500) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method pickDelimiterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("pickDelimiter", stringArrayType);
        pickDelimiterMethod.setAccessible(true);
        java.lang.Object[] pickDelimiterMethodArguments = new java.lang.Object[1];
        pickDelimiterMethodArguments[0] = ((Object) stringArray);
        try {
            pickDelimiterMethod.invoke(null, pickDelimiterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#pickDelimiter(java.lang.String[])}
 * @utbot.executesCondition {@code (allLength1): False}
 * @utbot.iterates iterate the loop {@code for(String s: strings)} once
 * @utbot.iterates iterate the loop {@code for(; delimiters[i] != null; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cur.contains(delimiters[i])
 *  */
    @Test
    public void testPickDelimiter_ThrowNullPointerException_2() throws Throwable  {
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter(PeepholeSubstituteAlternateSyntax.java:514) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method pickDelimiterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("pickDelimiter", stringArrayType);
        pickDelimiterMethod.setAccessible(true);
        java.lang.Object[] pickDelimiterMethodArguments = new java.lang.Object[1];
        pickDelimiterMethodArguments[0] = ((Object) stringArray);
        try {
            pickDelimiterMethod.invoke(null, pickDelimiterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeSubstituteAlternateSyntax}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax#pickDelimiter(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String s: strings)
 *  */
    @Test
    public void testPickDelimiter_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter(PeepholeSubstituteAlternateSyntax.java:499) */
        Class peepholeSubstituteAlternateSyntaxClazz = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method pickDelimiterMethod = peepholeSubstituteAlternateSyntaxClazz.getDeclaredMethod("pickDelimiter", stringArrayType);
        pickDelimiterMethod.setAccessible(true);
        java.lang.Object[] pickDelimiterMethodArguments = new java.lang.Object[1];
        pickDelimiterMethodArguments[0] = ((Object) null);
        try {
            pickDelimiterMethod.invoke(null, pickDelimiterMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields920095582409500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields920095582409500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass920095582415000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields920095582409500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass920095582415000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields920095582771400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields920095582771400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass920095582773300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields920095582771400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass920095582773300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


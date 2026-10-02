package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.IfStatement;
import java.util.TreeSet;
import java.util.SortedSet;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import java.util.Map;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.ast.FunctionCall;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.head.ast.ErrorNode;
import java.util.regex.Pattern;
import com.google.javascript.rhino.head.ast.InfixExpression;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.XmlLiteral;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.XmlMemberGet;
import com.google.javascript.rhino.head.ast.XmlPropRef;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.NewExpression;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_parsing_IRFactoryTest {
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.createTemplateNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createTemplateNode()
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createTemplateNode()}
 * @utbot.returnsFrom {@code return templateNode;}
 *  */
    @Test
    public void testCreateTemplateNode_ReturnTemplateNode() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Method createTemplateNodeMethod = iRFactoryClazz.getDeclaredMethod("createTemplateNode");
        createTemplateNodeMethod.setAccessible(true);
        java.lang.Object[] createTemplateNodeMethodArguments = new java.lang.Object[0];
        Node actual = ((Node) createTemplateNodeMethod.invoke(iRFactory, createTemplateNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(132);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
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
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createTemplateNode()}
 * @utbot.returnsFrom {@code return templateNode;}
 *  */
    @Test
    public void testCreateTemplateNode_ReturnTemplateNode_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceFile", sourceFile);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Method createTemplateNodeMethod = iRFactoryClazz.getDeclaredMethod("createTemplateNode");
        createTemplateNodeMethod.setAccessible(true);
        java.lang.Object[] createTemplateNodeMethodArguments = new java.lang.Object[0];
        Node actual = ((Node) createTemplateNodeMethod.invoke(iRFactory, createTemplateNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", sourceFile);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(expected, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object expectedPropListHead = getFieldValue(expected, "com.google.javascript.rhino.Node", "propListHead");
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        Object expectedPropListHeadObjectValue = getFieldValue(expectedPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Object actualPropListHeadObjectValue = getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        SourceFile actualPropListHeadObjectValueReferenced = ((SourceFile) getFieldValue(actualPropListHeadObjectValue, "com.google.javascript.jscomp.JSSourceFile", "referenced"));
        assertNull(actualPropListHeadObjectValueReferenced);
        
        String actualPropListHeadObjectValueFileName = ((String) getFieldValue(actualPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "fileName"));
        assertNull(actualPropListHeadObjectValueFileName);
        
        boolean actualPropListHeadObjectValueIsExternFile = ((Boolean) getFieldValue(actualPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "isExternFile"));
        assertFalse(actualPropListHeadObjectValueIsExternFile);
        
        String actualPropListHeadObjectValueOriginalPath = (((SourceFile) actualPropListHeadObjectValue)).getOriginalPath();
        assertNull(actualPropListHeadObjectValueOriginalPath);
        
        int[] actualPropListHeadObjectValueLineOffsets = ((int[]) getFieldValue(actualPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "lineOffsets"));
        assertNull(actualPropListHeadObjectValueLineOffsets);
        
        int expectedPropListHeadObjectValueLastOffset = ((Integer) getFieldValue(expectedPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        int actualPropListHeadObjectValueLastOffset = ((Integer) getFieldValue(actualPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "lastOffset"));
        assertEquals(expectedPropListHeadObjectValueLastOffset, actualPropListHeadObjectValueLastOffset);
        
        int expectedPropListHeadObjectValueLastLine = ((Integer) getFieldValue(expectedPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        int actualPropListHeadObjectValueLastLine = ((Integer) getFieldValue(actualPropListHeadObjectValue, "com.google.javascript.jscomp.SourceFile", "lastLine"));
        assertEquals(expectedPropListHeadObjectValueLastLine, actualPropListHeadObjectValueLastLine);
        
        String actualPropListHeadObjectValueCode = (((SourceFile) actualPropListHeadObjectValue)).getCode();
        assertNull(actualPropListHeadObjectValueCode);
        
        Object actualPropListHeadNext = getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        assertNull(actualPropListHeadNext);
        
        int expectedPropListHeadPropType = ((Integer) getFieldValue(expectedPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualPropListHeadPropType = ((Integer) getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        assertEquals(expectedPropListHeadPropType, actualPropListHeadPropType);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformTree
    
    ///region Errors report for transformTree
    
    public void testTransformTree_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field target is not declared in class com.google.javascript.rhino.head.ast.Scope
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newStringNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newStringNode(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newStringNode(int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Node.newString(type, value).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewStringNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        String string = "";
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method newStringNodeMethod = iRFactoryClazz.getDeclaredMethod("newStringNode", intType, stringType);
        newStringNodeMethod.setAccessible(true);
        java.lang.Object[] newStringNodeMethodArguments = new java.lang.Object[2];
        newStringNodeMethodArguments[0] = -255;
        newStringNodeMethodArguments[1] = string;
        Object actual = newStringNodeMethod.invoke(iRFactory, newStringNodeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) expected)).setType(-255);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
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
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newStringNode(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newStringNode(int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Node.newString(type, value).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewStringNode_ThrowIllegalArgumentException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method newStringNodeMethod = iRFactoryClazz.getDeclaredMethod("newStringNode", intType, stringType);
        newStringNodeMethod.setAccessible(true);
        java.lang.Object[] newStringNodeMethodArguments = new java.lang.Object[2];
        newStringNodeMethodArguments[0] = -255;
        newStringNodeMethodArguments[1] = ((Object) null);
        try {
            newStringNodeMethod.invoke(iRFactory, newStringNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newStringNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newStringNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newStringNode(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#string(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return IR.string(value).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewStringNode_NodeClonePropsFrom1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        String string = "";
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringType = Class.forName("java.lang.String");
        Method newStringNodeMethod = iRFactoryClazz.getDeclaredMethod("newStringNode", stringType);
        newStringNodeMethod.setAccessible(true);
        java.lang.Object[] newStringNodeMethodArguments = new java.lang.Object[1];
        newStringNodeMethodArguments[0] = string;
        Object actual = newStringNodeMethod.invoke(iRFactory, newStringNodeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) expected)).setType(40);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
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
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newStringNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newStringNode(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#string(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return IR.string(value).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewStringNode_ThrowIllegalArgumentException1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringType = Class.forName("java.lang.String");
        Method newStringNodeMethod = iRFactoryClazz.getDeclaredMethod("newStringNode", stringType);
        newStringNodeMethod.setAccessible(true);
        java.lang.Object[] newStringNodeMethodArguments = new java.lang.Object[1];
        newStringNodeMethodArguments[0] = ((Object) null);
        try {
            newStringNodeMethod.invoke(iRFactory, newStringNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newNumberNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newNumberNode(java.lang.Double)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNumberNode(java.lang.Double)}
 * @utbot.invokes {@link java.lang.Double#doubleValue()}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#number(double)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return IR.number(value).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewNumberNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Double double1 = 0.0;
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class double1Type = Class.forName("java.lang.Double");
        Method newNumberNodeMethod = iRFactoryClazz.getDeclaredMethod("newNumberNode", double1Type);
        newNumberNodeMethod.setAccessible(true);
        java.lang.Object[] newNumberNodeMethodArguments = new java.lang.Object[1];
        newNumberNodeMethodArguments[0] = double1;
        Object actual = newNumberNodeMethod.invoke(iRFactory, newNumberNodeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(expected, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) expected)).setType(39);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        double expectedNumber = ((Double) getFieldValue(expected, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedNumber, actualNumber, 1.0E-6);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
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
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newNumberNode(java.lang.Double)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNumberNode(java.lang.Double)}
 * @utbot.invokes {@link java.lang.Double#doubleValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return IR.number(value).clonePropsFrom(templateNode);
 *  */
    @Test
    public void testNewNumberNode_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.newNumberNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.newNumberNode(IRFactory.java:1309) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class doubleType = Class.forName("java.lang.Double");
        Method newNumberNodeMethod = iRFactoryClazz.getDeclaredMethod("newNumberNode", doubleType);
        newNumberNodeMethod.setAccessible(true);
        java.lang.Object[] newNumberNodeMethodArguments = new java.lang.Object[1];
        newNumberNodeMethodArguments[0] = ((Object) null);
        try {
            newNumberNodeMethod.invoke(iRFactory, newNumberNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeSetLengthFrom(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = new Node(0);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, commentType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = node;
        maybeSetLengthFromMethodArguments[1] = comment;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = new Node(0);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setLength(-255);
        
        Object initialNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, commentType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = node;
        maybeSetLengthFromMethodArguments[1] = comment;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNodePropListHead == finalNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode_2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, commentType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = node;
        maybeSetLengthFromMethodArguments[1] = comment;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): False}
 *  */
    @Test
    public void testMaybeSetLengthFrom_NotConfigIsIdeMode() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, astNodeType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = ((Object) null);
        maybeSetLengthFromMethodArguments[1] = ((Object) null);
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode_3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, ifStatementType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = node;
        maybeSetLengthFromMethodArguments[1] = ifStatement;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertNull(finalNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode_4() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", numberNodeType, ifStatementType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = numberNode;
        maybeSetLengthFromMethodArguments[1] = ifStatement;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode_5() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        
        Object initialNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, commentType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = node;
        maybeSetLengthFromMethodArguments[1] = comment;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNodePropListHead == finalNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 *  */
    @Test
    public void testMaybeSetLengthFrom_ConfigIsIdeMode_6() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        
        Object initialNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, commentType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = node;
        maybeSetLengthFromMethodArguments[1] = comment;
        maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNodePropListHead == finalNodePropListHead);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeSetLengthFrom(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 * @utbot.invokes {@link com.google.javascript.rhino.head.ast.AstNode#getLength()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setLength(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.setLength(source.getLength());
 *  */
    @Test
    public void testMaybeSetLengthFrom_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setLength(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(IRFactory.java:361) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, commentType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = ((Object) null);
        maybeSetLengthFromMethodArguments[1] = comment;
        try {
            maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.executesCondition {@code (config.isIdeMode): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.setLength(source.getLength());
 *  */
    @Test
    public void testMaybeSetLengthFrom_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(IRFactory.java:361) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, astNodeType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = ((Object) null);
        maybeSetLengthFromMethodArguments[1] = ((Object) null);
        try {
            maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#maybeSetLengthFrom(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: config.isIdeMode
 *  */
    @Test
    public void testMaybeSetLengthFrom_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(IRFactory.java:360) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method maybeSetLengthFromMethod = iRFactoryClazz.getDeclaredMethod("maybeSetLengthFrom", nodeType, astNodeType);
        maybeSetLengthFromMethod.setAccessible(true);
        java.lang.Object[] maybeSetLengthFromMethodArguments = new java.lang.Object[2];
        maybeSetLengthFromMethodArguments[0] = ((Object) null);
        maybeSetLengthFromMethodArguments[1] = ((Object) null);
        try {
            maybeSetLengthFromMethod.invoke(iRFactory, maybeSetLengthFromMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.position2charno
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method position2charno(int)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#position2charno(int)}
 * @utbot.executesCondition {@code (lineIndex == -1): True}
 * @utbot.returnsFrom {@code return position;}
 *  */
    @Test
    public void testPosition2charno_LineIndexEqualsNegative1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "  ";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method position2charnoMethod = iRFactoryClazz.getDeclaredMethod("position2charno", intType);
        position2charnoMethod.setAccessible(true);
        java.lang.Object[] position2charnoMethodArguments = new java.lang.Object[1];
        position2charnoMethodArguments[0] = -1;
        int actual = ((Integer) position2charnoMethod.invoke(iRFactory, position2charnoMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#position2charno(int)}
 * @utbot.executesCondition {@code (lineIndex == -1): False}
 * @utbot.returnsFrom {@code return position - lineIndex - 1;}
 *  */
    @Test
    public void testPosition2charno_LineIndexNotEqualsNegative1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method position2charnoMethod = iRFactoryClazz.getDeclaredMethod("position2charno", intType);
        position2charnoMethod.setAccessible(true);
        java.lang.Object[] position2charnoMethodArguments = new java.lang.Object[1];
        position2charnoMethodArguments[0] = 0;
        int actual = ((Integer) position2charnoMethod.invoke(iRFactory, position2charnoMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method position2charno(int)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#position2charno(int)}
 * @utbot.invokes {@link java.lang.String#lastIndexOf(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int lineIndex = sourceString.lastIndexOf('\n', position);
 *  */
    @Test
    public void testPosition2charno_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.position2charno] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method position2charnoMethod = iRFactoryClazz.getDeclaredMethod("position2charno", intType);
        position2charnoMethod.setAccessible(true);
        java.lang.Object[] position2charnoMethodArguments = new java.lang.Object[1];
        position2charnoMethodArguments[0] = -255;
        try {
            position2charnoMethod.invoke(iRFactory, position2charnoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.justTransform
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method justTransform(com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 106);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.UnaryExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ConditionalExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:234)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 23);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.InfixExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 160);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.KeywordLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:215)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.CatchClause (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:189)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.TryStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:262)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.NewExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:244)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.StringLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:256)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ArrayLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 97);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Assignment (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.IfStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Label (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:238)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.FunctionCall (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.NumberLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:246)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ContinueStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:193)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ThrowStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:260)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.AstRoot (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:254)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.BreakStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.WhileLoop (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:276)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ObjectLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:248)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.SwitchCase (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ObjectProperty (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:191)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.WithStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:278)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ElementGet (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:230)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.FunctionNode (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:228)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Name (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:242)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ReturnStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.SwitchStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:258)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_28() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.PropertyGet (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:232)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_29() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ParenthesizedExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:240)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_30() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.EmptyExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:197)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", astNodeType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = ((Object) null);
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method justTransform(com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 119);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.rhino.head.Node", "type", 133);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", ifStatementType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = ifStatement;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 122);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 129);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 154);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", commentType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = comment;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.rhino.head.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", ifStatementType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = ifStatement;
        try {
            justTransformMethod.invoke(iRFactory, justTransformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleBlockComment(com.google.javascript.rhino.head.ast.Comment)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 *  */
    @Test
    public void testHandleBlockComment() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "/* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        LabeledStatement parent = ((LabeledStatement) createInstance("com.google.javascript.rhino.head.ast.LabeledStatement"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 *  */
    @Test
    public void testHandleBlockComment_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        Object chainedReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        setField(errorReporter, "com.google.javascript.rhino.head.DefaultErrorReporter", "chainedReporter", chainedReporter);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = " /* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleBlockComment(com.google.javascript.rhino.head.ast.Comment)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = comment.getValue();
 *  */
    @Test
    public void testHandleBlockComment_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:231) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = ((Object) null);
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.indexOf("/* @") != -1 || value.indexOf("\n * @") != -1
 *  */
    @Test
    public void testHandleBlockComment_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = new Comment(0, 0, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:232) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errorReporter.warning(SUSPICIOUS_COMMENT_WARNING, sourceName, comment.getLineno(), "", 0);
 *  */
    @Test
    public void testHandleBlockComment_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "/* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errorReporter.warning(SUSPICIOUS_COMMENT_WARNING, sourceName, comment.getLineno(), "", 0);
 *  */
    @Test
    public void testHandleBlockComment_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "/* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        LabeledStatement parent = ((LabeledStatement) createInstance("com.google.javascript.rhino.head.ast.LabeledStatement"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleBlockComment(com.google.javascript.rhino.head.ast.Comment)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: errorReporter.warning(SUSPICIOUS_COMMENT_WARNING, sourceName, comment.getLineno(), "", 0);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testHandleBlockComment_ThrowUnsupportedOperationException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ErrorCollector errorReporter = ((ErrorCollector) createInstance("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "/* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleBlockComment(com.google.javascript.rhino.head.ast.Comment)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: errorReporter.warning(SUSPICIOUS_COMMENT_WARNING, sourceName, comment.getLineno(), "", 0);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testHandleBlockComment_ThrowUnsupportedOperationException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        ErrorCollector chainedReporter = ((ErrorCollector) createInstance("com.google.javascript.rhino.head.ast.ErrorCollector"));
        setField(errorReporter, "com.google.javascript.rhino.head.DefaultErrorReporter", "chainedReporter", chainedReporter);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = " /* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleBlockComment(com.google.javascript.rhino.head.ast.Comment)
    
    @Test
    public void testHandleBlockComment1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String string = "\u0000\u0000\u0000\u0000\u0000/\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Comment comment = new Comment(0, 0, null, string);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
    }
    
    @Test
    public void testHandleBlockComment2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000\u0000/* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        FunctionCall parent = ((FunctionCall) createInstance("com.google.javascript.rhino.head.ast.FunctionCall"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleBlockComment(com.google.javascript.rhino.head.ast.Comment)
    
    @Test(expected = StackOverflowError.class)
    public void testHandleBlockComment3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        setField(errorReporter, "com.google.javascript.rhino.head.DefaultErrorReporter", "chainedReporter", errorReporter);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "/* @\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleBlockComment4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000\u0000/* @";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        FunctionCall parent = ((FunctionCall) createInstance("com.google.javascript.rhino.head.ast.FunctionCall"));
        FunctionCall parent1 = ((FunctionCall) createInstance("com.google.javascript.rhino.head.ast.FunctionCall"));
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RhinoErrorReporter.makeError(RhinoErrorReporter.java:128)
            com.google.javascript.jscomp.RhinoErrorReporter.warning(RhinoErrorReporter.java:114)
            com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter.warning(RhinoErrorReporter.java:171)
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleBlockComment5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String string = "\u0000//* @";
        Comment comment = new Comment(0, 0, null, string);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleBlockComment6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        Object chainedReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter");
        LinkedHashMap typeMap = new LinkedHashMap();
        setField(chainedReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap);
        setField(errorReporter, "com.google.javascript.rhino.head.DefaultErrorReporter", "chainedReporter", chainedReporter);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000/* @\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        ForLoop parent = ((ForLoop) createInstance("com.google.javascript.rhino.head.ast.ForLoop"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RhinoErrorReporter.warning(RhinoErrorReporter.java:113)
            com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter.warning(RhinoErrorReporter.java:171)
            com.google.javascript.rhino.head.DefaultErrorReporter.warning(DefaultErrorReporter.java:66)
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleBlockComment7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        Object chainedReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter");
        LinkedHashMap typeMap = new LinkedHashMap();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        typeMap.put(null, diagnosticType);
        setField(chainedReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(chainedReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler", compiler);
        setField(errorReporter, "com.google.javascript.rhino.head.DefaultErrorReporter", "chainedReporter", chainedReporter);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000/* @\u0000";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        ErrorNode parent = ((ErrorNode) createInstance("com.google.javascript.rhino.head.ast.ErrorNode"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RhinoErrorReporter.makeError(RhinoErrorReporter.java:129)
            com.google.javascript.jscomp.RhinoErrorReporter.warning(RhinoErrorReporter.java:114)
            com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter.warning(RhinoErrorReporter.java:171)
            com.google.javascript.rhino.head.DefaultErrorReporter.warning(DefaultErrorReporter.java:66)
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleBlockComment8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object errorReporter = createInstance("com.google.javascript.rhino.head.DefaultErrorReporter");
        Object chainedReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter");
        LinkedHashMap typeMap = new LinkedHashMap();
        Pattern pattern = ((Pattern) createInstance("java.util.regex.Pattern"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        typeMap.put(pattern, diagnosticType);
        setField(chainedReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap);
        setField(errorReporter, "com.google.javascript.rhino.head.DefaultErrorReporter", "chainedReporter", chainedReporter);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000/* @\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        InfixExpression parent = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment] produces [java.lang.NullPointerException]
            java.base/java.util.regex.Pattern.compile(Pattern.java:1749)
            java.base/java.util.regex.Pattern.matcher(Pattern.java:1131)
            com.google.javascript.jscomp.RhinoErrorReporter.makeError(RhinoErrorReporter.java:129)
            com.google.javascript.jscomp.RhinoErrorReporter.warning(RhinoErrorReporter.java:114)
            com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter.warning(RhinoErrorReporter.java:171)
            com.google.javascript.rhino.head.DefaultErrorReporter.warning(DefaultErrorReporter.java:66)
            com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(IRFactory.java:234) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Method handleBlockCommentMethod = iRFactoryClazz.getDeclaredMethod("handleBlockComment", commentType);
        handleBlockCommentMethod.setAccessible(true);
        java.lang.Object[] handleBlockCommentMethodArguments = new java.lang.Object[1];
        handleBlockCommentMethodArguments[0] = comment;
        try {
            handleBlockCommentMethod.invoke(iRFactory, handleBlockCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSourceInfo(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = ((Object) null);
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setLineno(-256);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = ifStatement;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo_2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setPosition(8);
        ifStatement.setLineno(-256);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = ifStatement;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo_4() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setLength(-255);
        ifStatement.setLineno(-256);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", stringNodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = stringNode;
        setSourceInfoMethodArguments[1] = ifStatement;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo_3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setLineno(-256);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", stringNodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = stringNode;
        setSourceInfoMethodArguments[1] = ifStatement;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo_5() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\n";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setPosition(1);
        ifStatement.setLineno(-256);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", stringNodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = stringNode;
        setSourceInfoMethodArguments[1] = ifStatement;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 *  */
    @Test
    public void testSetSourceInfo_6() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "isIdeMode", true);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 52);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setLineno(-256);
        
        Object initialNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", numberNodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = numberNode;
        setSourceInfoMethodArguments[1] = ifStatement;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        
        Object finalNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNumberNodePropListHead == finalNumberNodePropListHead);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSourceInfo(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int lineno = node.getLineno();
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:317) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", numberNodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = numberNode;
        setSourceInfoMethodArguments[1] = ((Object) null);
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: irNode.getLineno() == -1
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:313) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = ((Object) null);
        setSourceInfoMethodArguments[1] = ((Object) null);
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:319) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", numberNodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = numberNode;
        setSourceInfoMethodArguments[1] = ifStatement;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        ifStatement.setPosition(1);
        ifStatement.setLineno(-256);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(IRFactory.java:360)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = ifStatement;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.rhino.head.ast.LabeledStatement"));
        labeledStatement.setPosition(-255);
        LabeledStatement parent = ((LabeledStatement) createInstance("com.google.javascript.rhino.head.ast.LabeledStatement"));
        parent.setPosition(-255);
        labeledStatement.setParent(parent);
        labeledStatement.setLineno(-256);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:319) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class labeledStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, labeledStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = labeledStatement;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        parent.setLineno(-256);
        ifStatement.setParent(parent);
        ifStatement.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:319) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, ifStatementType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = ifStatement;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformTokenType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transformTokenType(int)
    /// Actual number of generated tests (85) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.FOR}
 * @utbot.returnsFrom {@code return Token.FOR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenFOR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 119;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(115, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.EXPR_RESULT}
 * @utbot.returnsFrom {@code return Token.EXPR_RESULT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenEXPR_RESULT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 133;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(130, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.SWITCH}
 * @utbot.returnsFrom {@code return Token.SWITCH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSWITCH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 114;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(110, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ARRAYLIT}
 * @utbot.returnsFrom {@code return Token.ARRAYLIT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenARRAYLIT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 65;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(63, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.NEW}
 * @utbot.returnsFrom {@code return Token.NEW;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenNEW() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 30;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(30, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN_MOD}
 * @utbot.returnsFrom {@code return Token.ASSIGN_MOD;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_MOD() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 101;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(97, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN_MUL}
 * @utbot.returnsFrom {@code return Token.ASSIGN_MUL;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_MUL() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 99;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(95, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.LP}
 * @utbot.returnsFrom {@code return Token.PARAM_LIST;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenPARAM_LIST() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 87;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(83, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.RETURN}
 * @utbot.returnsFrom {@code return Token.RETURN;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenRETURN() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 4;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(4, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.VOID}
 * @utbot.returnsFrom {@code return Token.VOID;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenVOID() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 126;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(122, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.BREAK}
 * @utbot.returnsFrom {@code return Token.BREAK;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenBREAK() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 120;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(116, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.FALSE}
 * @utbot.returnsFrom {@code return Token.FALSE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenFALSE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 44;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(43, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.STRING}
 * @utbot.returnsFrom {@code return Token.STRING;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSTRING() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 41;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(40, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.BLOCK}
 * @utbot.returnsFrom {@code return Token.BLOCK;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenBLOCK() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 129;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(125, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.LE}
 * @utbot.returnsFrom {@code return Token.LE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenLE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 15;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(15, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN_RSH}
 * @utbot.returnsFrom {@code return Token.ASSIGN_RSH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_RSH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 95;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(91, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.SUB}
 * @utbot.returnsFrom {@code return Token.SUB;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSUB() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 22;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(22, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.GE}
 * @utbot.returnsFrom {@code return Token.GE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenGE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 17;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(17, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.SHEQ}
 * @utbot.returnsFrom {@code return Token.SHEQ;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSHEQ() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 46;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(45, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN_BITXOR}
 * @utbot.returnsFrom {@code return Token.ASSIGN_BITXOR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_BITXOR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 92;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(88, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.OBJECTLIT}
 * @utbot.returnsFrom {@code return Token.OBJECTLIT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenOBJECTLIT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 66;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(64, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.BITOR}
 * @utbot.returnsFrom {@code return Token.BITOR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenBITOR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 9;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(9, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.MOD}
 * @utbot.returnsFrom {@code return Token.MOD;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenMOD() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 25;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(25, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.THROW}
 * @utbot.returnsFrom {@code return Token.THROW;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenTHROW() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 50;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(49, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.INC}
 * @utbot.returnsFrom {@code return Token.INC;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenINC() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 106;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(102, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.NEG}
 * @utbot.returnsFrom {@code return Token.NEG;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenNEG() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 29;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(29, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.RSH}
 * @utbot.returnsFrom {@code return Token.RSH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenRSH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 19;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(19, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.DIV}
 * @utbot.returnsFrom {@code return Token.DIV;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenDIV() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 24;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(24, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.NAME}
 * @utbot.returnsFrom {@code return Token.NAME;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenNAME() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 39;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(38, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.URSH}
 * @utbot.returnsFrom {@code return Token.URSH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenURSH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 20;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(20, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN}
 * @utbot.returnsFrom {@code return Token.ASSIGN;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 90;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(86, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.DO}
 * @utbot.returnsFrom {@code return Token.DO;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenDO() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 118;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(114, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.CALL}
 * @utbot.returnsFrom {@code return Token.CALL;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenCALL() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 38;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(37, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.SET}
 * @utbot.returnsFrom {@code return Token.SETTER_DEF;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSETTER_DEF() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 152;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(148, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.LSH}
 * @utbot.returnsFrom {@code return Token.LSH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenLSH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 18;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(18, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.TRY}
 * @utbot.returnsFrom {@code return Token.TRY;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenTRY() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 81;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(77, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.GT}
 * @utbot.returnsFrom {@code return Token.GT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenGT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 16;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(16, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.TRUE}
 * @utbot.returnsFrom {@code return Token.TRUE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenTRUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 45;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(44, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.VAR}
 * @utbot.returnsFrom {@code return Token.VAR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenVAR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 122;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(118, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.EMPTY}
 * @utbot.returnsFrom {@code return Token.EMPTY;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenEMPTY() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 128;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(124, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.EQ}
 * @utbot.returnsFrom {@code return Token.EQ;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenEQ() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 12;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(12, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN_BITAND}
 * @utbot.returnsFrom {@code return Token.ASSIGN_BITAND;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_BITAND() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 93;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(89, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.COMMA}
 * @utbot.returnsFrom {@code return Token.COMMA;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenCOMMA() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 89;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(85, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ADD}
 * @utbot.returnsFrom {@code return Token.ADD;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenADD() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 21;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(21, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.DEC}
 * @utbot.returnsFrom {@code return Token.DEC;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenDEC() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 107;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(103, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.IF}
 * @utbot.returnsFrom {@code return Token.IF;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenIF() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 112;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(108, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.REGEXP}
 * @utbot.returnsFrom {@code return Token.REGEXP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenREGEXP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 48;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(47, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.ASSIGN_BITOR}
 * @utbot.returnsFrom {@code return Token.ASSIGN_BITOR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_BITOR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 91;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(87, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.FUNCTION}
 * @utbot.returnsFrom {@code return Token.FUNCTION;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenFUNCTION() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 109;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(105, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.rhino.head.Token.GET}
 * @utbot.returnsFrom {@code return Token.GETTER_DEF;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenGETTER_DEF() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 151;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(147, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformTokenType(int)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException(String.valueOf(token));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformTokenType_ThrowIllegalStateException() throws Throwable  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 59;
        try {
            transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.getStringValue
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getStringValue(double)
    
    @Test
    public void testGetStringValue1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class doubleType = double.class;
        Method getStringValueMethod = iRFactoryClazz.getDeclaredMethod("getStringValue", doubleType);
        getStringValueMethod.setAccessible(true);
        java.lang.Object[] getStringValueMethodArguments = new java.lang.Object[1];
        getStringValueMethodArguments[0] = 1.39372683615618E-309;
        String actual = ((String) getStringValueMethod.invoke(null, getStringValueMethodArguments));
        
        String expected = "1.39372683615618E-309";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetStringValue2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class doubleType = double.class;
        Method getStringValueMethod = iRFactoryClazz.getDeclaredMethod("getStringValue", doubleType);
        getStringValueMethod.setAccessible(true);
        java.lang.Object[] getStringValueMethodArguments = new java.lang.Object[1];
        getStringValueMethodArguments[0] = 9.223372036854776E18;
        String actual = ((String) getStringValueMethod.invoke(null, getStringValueMethodArguments));
        
        String expected = "9223372036854775807";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleJsDoc(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.rhino.head.ast.AstNode,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.head.ast.AstNode#getJsDocNode()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testHandleJsDoc_AstNodeGetJsDocNode() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = new Comment(0, 0, null, null);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = comment;
        handleJsDocMethodArguments[1] = ((Object) null);
        JSDocInfo actual = ((JSDocInfo) handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleJsDoc(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.rhino.head.ast.AstNode,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comment comment = node.getJsDocNode();
 *  */
    @Test
    public void testHandleJsDoc_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.head.ast.Comment ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.head.ast.Comment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.head.Node.getJsDocNode(Node.java:225)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:260) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = comment;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.rhino.head.ast.AstNode,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = node.getJsDocNode();
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:260) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", astNodeType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = ((Object) null);
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.rhino.head.ast.AstNode,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = comment;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleJsDoc(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)
    
    @Test
    public void testHandleJsDoc1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.head.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", infixExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = infixExpression;
        handleJsDocMethodArguments[1] = ((Object) null);
        JSDocInfo actual = ((JSDocInfo) handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleJsDoc(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)
    
    @Test
    public void testHandleJsDoc2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.head.ast.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "";
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        PropertyGet parent = ((PropertyGet) createInstance("com.google.javascript.rhino.head.ast.PropertyGet"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", functionNodeType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = functionNode;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "";
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        ArrayLiteral parent = ((ArrayLiteral) createInstance("com.google.javascript.rhino.head.ast.ArrayLiteral"));
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", infixExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = infixExpression;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        XmlLiteral xmlLiteral = ((XmlLiteral) createInstance("com.google.javascript.rhino.head.ast.XmlLiteral"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "";
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(xmlLiteral, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlLiteralType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", xmlLiteralType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = xmlLiteral;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ParenthesizedExpression parenthesizedExpression = ((ParenthesizedExpression) createInstance("com.google.javascript.rhino.head.ast.ParenthesizedExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        objectValue.setParent(parent);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(parenthesizedExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class parenthesizedExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", parenthesizedExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = parenthesizedExpression;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        EmptyExpression emptyExpression = ((EmptyExpression) createInstance("com.google.javascript.rhino.head.ast.EmptyExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(emptyExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class emptyExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", emptyExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = emptyExpression;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        EmptyExpression emptyExpression = ((EmptyExpression) createInstance("com.google.javascript.rhino.head.ast.EmptyExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(next2, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(emptyExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class emptyExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", emptyExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = emptyExpression;
        handleJsDocMethodArguments[1] = node;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Label label = ((Label) createInstance("com.google.javascript.rhino.head.ast.Label"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        PropertyGet parent = ((PropertyGet) createInstance("com.google.javascript.rhino.head.ast.PropertyGet"));
        ThrowStatement parent1 = ((ThrowStatement) createInstance("com.google.javascript.rhino.head.ast.ThrowStatement"));
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(label, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labelType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", labelType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = label;
        handleJsDocMethodArguments[1] = node;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Label label = ((Label) createInstance("com.google.javascript.rhino.head.ast.Label"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        PropertyGet parent = ((PropertyGet) createInstance("com.google.javascript.rhino.head.ast.PropertyGet"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(label, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labelType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", labelType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = label;
        handleJsDocMethodArguments[1] = node;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        XmlLiteral xmlLiteral = ((XmlLiteral) createInstance("com.google.javascript.rhino.head.ast.XmlLiteral"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next3, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Assignment parent = ((Assignment) createInstance("com.google.javascript.rhino.head.ast.Assignment"));
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next3, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(next2, "com.google.javascript.rhino.head.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(xmlLiteral, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlLiteralType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", xmlLiteralType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = xmlLiteral;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        XmlMemberGet parent = ((XmlMemberGet) createInstance("com.google.javascript.rhino.head.ast.XmlMemberGet"));
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", infixExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = infixExpression;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        XmlLiteral xmlLiteral = ((XmlLiteral) createInstance("com.google.javascript.rhino.head.ast.XmlLiteral"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(next3, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        objectValue.setLineno(-1);
        setField(next3, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(next2, "com.google.javascript.rhino.head.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.head.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.head.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", next);
        setField(xmlLiteral, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlLiteralType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", xmlLiteralType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = xmlLiteral;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.head.ast.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", sourceString);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser.addParserWarning(JsDocInfoParser.java:68)
            com.google.javascript.jscomp.parsing.JsDocInfoParser.parse(JsDocInfoParser.java:915)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:354)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", functionNodeType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = functionNode;
        handleJsDocMethodArguments[1] = node;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\n\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        XmlPropRef xmlPropRef = ((XmlPropRef) createInstance("com.google.javascript.rhino.head.ast.XmlPropRef"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", sourceString);
        objectValue.setPosition(2);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(xmlPropRef, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:137)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlPropRefType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", xmlPropRefType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = xmlPropRef;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method handleJsDoc(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testHandleJsDoc15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "next", propListHead);
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", infixExpressionType, nodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[2];
        handleJsDocMethodArguments[0] = infixExpression;
        handleJsDocMethodArguments[1] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformBlock
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformBlock(com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = transform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock_ThrowIllegalStateException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.rhino.head.Node", "type", 133);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", ifStatementType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = ifStatement;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = transform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.rhino.head.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", ifStatementType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = ifStatement;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformBlock(com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.AstRoot (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:254)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.BreakStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Label (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:238)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 28);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.UnaryExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 16);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.InfixExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.PropertyGet (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:232)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ParenthesizedExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:240)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 44);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.KeywordLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:215)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.SwitchCase (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 91);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Assignment (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.WithStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:278)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Name (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:242)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ConditionalExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:234)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 48);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.RegExpLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.RegExpLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", commentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = comment;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformBlock(com.google.javascript.rhino.head.ast.AstNode)
    
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        XmlLiteral xmlLiteral = ((XmlLiteral) createInstance("com.google.javascript.rhino.head.ast.XmlLiteral"));
        setField(xmlLiteral, "com.google.javascript.rhino.head.Node", "type", 129);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlLiteralType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", xmlLiteralType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = xmlLiteral;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        PropertyGet propertyGet = ((PropertyGet) createInstance("com.google.javascript.rhino.head.ast.PropertyGet"));
        setField(propertyGet, "com.google.javascript.rhino.head.Node", "type", 122);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class propertyGetType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", propertyGetType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = propertyGet;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.head.ast.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.head.Node", "type", 156);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", functionNodeType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = functionNode;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformBlock4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        RegExpLiteral regExpLiteral = ((RegExpLiteral) createInstance("com.google.javascript.rhino.head.ast.RegExpLiteral"));
        setField(regExpLiteral, "com.google.javascript.rhino.head.Node", "type", 48);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class regExpLiteralType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", regExpLiteralType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = regExpLiteral;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformBlock5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        StringLiteral stringLiteral = ((StringLiteral) createInstance("com.google.javascript.rhino.head.ast.StringLiteral"));
        setField(stringLiteral, "com.google.javascript.rhino.head.Node", "type", 41);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringLiteralType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", stringLiteralType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = stringLiteral;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformBlock6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        setField(name, "com.google.javascript.rhino.head.Node", "type", 39);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", nameType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = name;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method transformBlock(com.google.javascript.rhino.head.ast.AstNode)
    /// Actual number of generated tests (61) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testTransformBlock7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ElementGet (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:230)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.NewExpression (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:244)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.StringLiteral (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:256)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.FunctionCall (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.FunctionNode (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:228)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ObjectLiteral (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:248)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ReturnStatement (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.IfStatement (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ThrowStatement (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:260)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 118);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.DoLoop (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.DoLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:195)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ContinueStatement (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:193)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.SwitchStatement (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:258)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ArrayLiteral (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.TryStatement (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:262)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.EmptyExpression (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:197)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.NumberLiteral (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:246)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.WhileLoop (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:276)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.ObjectProperty (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:191)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.InfixExpression cannot be cast to class com.google.javascript.rhino.head.ast.CatchClause (com.google.javascript.rhino.head.ast.InfixExpression and com.google.javascript.rhino.head.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:189)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        UnaryExpression unaryExpression = ((UnaryExpression) createInstance("com.google.javascript.rhino.head.ast.UnaryExpression"));
        setField(unaryExpression, "com.google.javascript.rhino.head.Node", "type", 32);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:80)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:969)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class unaryExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", unaryExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = unaryExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        UnaryExpression unaryExpression = ((UnaryExpression) createInstance("com.google.javascript.rhino.head.ast.UnaryExpression"));
        setField(unaryExpression, "com.google.javascript.rhino.head.Node", "type", 31);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:80)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:969)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class unaryExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", unaryExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = unaryExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock28() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        UnaryExpression unaryExpression = ((UnaryExpression) createInstance("com.google.javascript.rhino.head.ast.UnaryExpression"));
        setField(unaryExpression, "com.google.javascript.rhino.head.Node", "type", 29);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:80)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:969)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class unaryExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", unaryExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = unaryExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock29() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        NewExpression newExpression = ((NewExpression) createInstance("com.google.javascript.rhino.head.ast.NewExpression"));
        setField(newExpression, "com.google.javascript.rhino.head.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:80)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processFunctionCall(IRFactory.java:591)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processFunctionCall(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class newExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", newExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = newExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock30() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        XmlMemberGet xmlMemberGet = ((XmlMemberGet) createInstance("com.google.javascript.rhino.head.ast.XmlMemberGet"));
        setField(xmlMemberGet, "com.google.javascript.rhino.head.Node", "type", 16);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:80)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:680)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlMemberGetType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", xmlMemberGetType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = xmlMemberGet;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock31() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 61);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock32() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 76);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock33() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 137);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock34() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 84);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock35() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 159);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock36() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 88);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock37() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 51);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock38() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 153);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock39() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 141);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock40() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 37);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock41() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.head.ast.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.head.Node", "type", 77);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", functionNodeType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = functionNode;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock42() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 157);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock43() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.head.ast.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.head.Node", "type", 138);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", functionNodeType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = functionNode;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock44() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 143);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock45() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 62);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock46() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 70);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock47() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 145);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock48() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 110);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock49() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 82);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock50() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 144);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock51() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 161);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock52() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 147);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock53() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 86);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock54() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 113);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock55() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.rhino.head.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.rhino.head.Node", "type", 56);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:1056)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:280)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", infixExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = infixExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock56() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ParenthesizedExpression parenthesizedExpression = ((ParenthesizedExpression) createInstance("com.google.javascript.rhino.head.ast.ParenthesizedExpression"));
        setField(parenthesizedExpression, "com.google.javascript.rhino.head.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:80)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processParenthesizedExpression(IRFactory.java:815)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processParenthesizedExpression(IRFactory.java:379)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:240)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:211) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class parenthesizedExpressionType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", parenthesizedExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = parenthesizedExpression;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformNumberAsString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformNumberAsString(com.google.javascript.rhino.head.ast.NumberLiteral)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNumberAsString(com.google.javascript.rhino.head.ast.NumberLiteral)}
 * @utbot.invokes {@link com.google.javascript.rhino.head.ast.NumberLiteral#getNumber()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = newStringNode(getStringValue(literalNode.getNumber()));
 *  */
    @Test
    public void testTransformNumberAsString_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNumberAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.transformNumberAsString(IRFactory.java:292) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberLiteralType = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Method transformNumberAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNumberAsString", numberLiteralType);
        transformNumberAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNumberAsStringMethodArguments = new java.lang.Object[1];
        transformNumberAsStringMethodArguments[0] = ((Object) null);
        try {
            transformNumberAsStringMethod.invoke(iRFactory, transformNumberAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoNotEqualsNull() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = new Node(0);
        
        JSDocInfo jSDocInfo = iRFactory.fileOverviewInfo;
        Node initialIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object initialNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        JSDocInfo jSDocInfo1 = iRFactory.fileOverviewInfo;
        Node finalIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo1, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryFileOverviewInfoAssociatedNode == finalIRFactoryFileOverviewInfoAssociatedNode);
        
        assertFalse(initialNodePropListHead == finalNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull_2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Node node = iRFactory.rootNodeJsDocHolder;
        Object nodeRootNodeJsDocHolderPropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        Object nodeRootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue = getFieldValue(nodeRootNodeJsDocHolderPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Node initialIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode = ((Node) getFieldValue(nodeRootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Node node1 = iRFactory.rootNodeJsDocHolder;
        Object node1RootNodeJsDocHolderPropListHead = getFieldValue(node1, "com.google.javascript.rhino.Node", "propListHead");
        Object node1RootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue = getFieldValue(node1RootNodeJsDocHolderPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Node finalIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode = ((Node) getFieldValue(node1RootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode == finalIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode);
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull_3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Node node = iRFactory.rootNodeJsDocHolder;
        Object nodeRootNodeJsDocHolderPropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        Object nodeRootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue = getFieldValue(nodeRootNodeJsDocHolderPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Node initialIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode = ((Node) getFieldValue(nodeRootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object initialNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", numberNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = numberNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Node node1 = iRFactory.rootNodeJsDocHolder;
        Object node1RootNodeJsDocHolderPropListHead = getFieldValue(node1, "com.google.javascript.rhino.Node", "propListHead");
        Object node1RootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue = getFieldValue(node1RootNodeJsDocHolderPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Node finalIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode = ((Node) getFieldValue(node1RootNodeJsDocHolderPropListHeadRootNodeJsDocHolderPropListHeadObjectValue, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object finalNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode == finalIRFactoryRootNodeJsDocHolderPropListHeadObjectValueAssociatedNode);
        
        assertFalse(initialNumberNodePropListHead == finalNumberNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoNotEqualsNull_3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        JSDocInfo jSDocInfo = iRFactory.fileOverviewInfo;
        Object initialIRFactoryFileOverviewInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        JSDocInfo jSDocInfo1 = iRFactory.fileOverviewInfo;
        Node initialIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo1, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        JSDocInfo jSDocInfo2 = iRFactory.fileOverviewInfo;
        Object finalIRFactoryFileOverviewInfoInfo = getFieldValue(jSDocInfo2, "com.google.javascript.rhino.JSDocInfo", "info");
        JSDocInfo jSDocInfo3 = iRFactory.fileOverviewInfo;
        Node finalIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo3, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryFileOverviewInfoInfo == finalIRFactoryFileOverviewInfoInfo);
        
        assertFalse(initialIRFactoryFileOverviewInfoAssociatedNode == finalIRFactoryFileOverviewInfoAssociatedNode);
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoNotEqualsNull_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", fileOverviewInfo);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        JSDocInfo jSDocInfo = iRFactory.fileOverviewInfo;
        Node initialIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object initialNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        JSDocInfo jSDocInfo1 = iRFactory.fileOverviewInfo;
        Node finalIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo1, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryFileOverviewInfoAssociatedNode == finalIRFactoryFileOverviewInfoAssociatedNode);
        
        assertFalse(initialNodePropListHead == finalNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoNotEqualsNull_2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(fileOverviewInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info1 = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info1, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info1);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        JSDocInfo jSDocInfo = iRFactory.fileOverviewInfo;
        Node initialIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        JSDocInfo jSDocInfo1 = iRFactory.fileOverviewInfo;
        Node finalIRFactoryFileOverviewInfoAssociatedNode = ((Node) getFieldValue(jSDocInfo1, "com.google.javascript.rhino.JSDocInfo", "associatedNode"));
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryFileOverviewInfoAssociatedNode == finalIRFactoryFileOverviewInfoAssociatedNode);
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo rootNodeJsDoc = rootNodeJsDocHolder.getJSDocInfo();
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1843)
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:194) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo rootNodeJsDoc = rootNodeJsDocHolder.getJSDocInfo();
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:194) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSDocInfo(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.setJSDocInfo(rootNodeJsDoc);
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (irNode.getJSDocInfo() != null) && (irNode.getJSDocInfo().getLicense() != null)
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:201) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo rootNodeJsDoc = rootNodeJsDocHolder.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetFileOverviewJsDoc_ThrowUnsupportedOperationException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: (irNode.getJSDocInfo() != null) && (irNode.getJSDocInfo().getLicense() != null)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testSetFileOverviewJsDoc_ThrowUnsupportedOperationException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    @Test
    public void testSetFileOverviewJsDoc1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next2);
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", numberNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = numberNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNumberNodePropListHead == finalNumberNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", numberNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = numberNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNumberNodePropListHead == finalNumberNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNodePropListHead == finalNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc4() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next2, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", numberNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = numberNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialNumberNodePropListHead == finalNumberNodePropListHead);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testSetFileOverviewJsDoc5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next1, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead1);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", numberNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = numberNode;
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSetFileOverviewJsDoc6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next2, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next2, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead1);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser)}
 * @utbot.executesCondition {@code (jsDocParser.getFileOverviewJSDocInfo() != fileOverviewInfo): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.parsing.JsDocInfoParser#getFileOverviewJSDocInfo()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_JsDocParserGetFileOverviewJSDocInfoNotEqualsFileOverviewInfo() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        JsDocInfoParser jsDocInfoParser = ((JsDocInfoParser) createInstance("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        JSDocInfo fileOverviewJSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        jsDocInfoParser.setFileOverviewJSDocInfo(fileOverviewJSDocInfo);
        
        JSDocInfo initialIRFactoryFileOverviewInfo = iRFactory.fileOverviewInfo;
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class jsDocInfoParserType = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", jsDocInfoParserType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = jsDocInfoParser;
        boolean actual = ((Boolean) handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments));
        
        assertTrue(actual);
        
        JSDocInfo finalIRFactoryFileOverviewInfo = iRFactory.fileOverviewInfo;
        
        assertFalse(initialIRFactoryFileOverviewInfo == finalIRFactoryFileOverviewInfo);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser)}
 * @utbot.executesCondition {@code (jsDocParser.getFileOverviewJSDocInfo() != fileOverviewInfo): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_JsDocParserGetFileOverviewJSDocInfoEqualsFileOverviewInfo() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        JsDocInfoParser jsDocInfoParser = ((JsDocInfoParser) createInstance("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class jsDocInfoParserType = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", jsDocInfoParserType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = jsDocInfoParser;
        boolean actual = ((Boolean) handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser)}
 * @utbot.invokes {@link com.google.javascript.jscomp.parsing.JsDocInfoParser#getFileOverviewJSDocInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: jsDocParser.getFileOverviewJSDocInfo() != fileOverviewInfo
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class jsDocInfoParserType = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", jsDocInfoParserType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "  ";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:337)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = ((Object) null);
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "     ";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "    ";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setPosition(2);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:137)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:254) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType, nodeType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[2];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        handlePossibleFileOverviewJsDocMethodArguments[1] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformNameAsString(com.google.javascript.rhino.head.ast.Name)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo jsDocInfo = handleJsDoc(node, irNode);
 *  */
    @Test
    public void testTransformNameAsString_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.head.ast.Comment ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.head.ast.Comment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.head.Node.getJsDocNode(Node.java:225)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:260)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:283) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: JSDocInfo jsDocInfo = handleJsDoc(node, irNode);
 *  */
    @Test
    public void testTransformNameAsString_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "\u0000\u0000";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", identifier);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:283) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = transformDispatcher.processName(node, true);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:282) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = ((Object) null);
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setSourceInfo(irNode, node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        name.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:319)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:287) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        name.setPosition(30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(IRFactory.java:360)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:287) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDocInfo = handleJsDoc(node, irNode);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        LabeledStatement parent = ((LabeledStatement) createInstance("com.google.javascript.rhino.head.ast.LabeledStatement"));
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:283) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDocInfo = handleJsDoc(node, irNode);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        LabeledStatement parent = ((LabeledStatement) createInstance("com.google.javascript.rhino.head.ast.LabeledStatement"));
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:283) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.rhino.head.ast.Name"));
        String identifier = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.rhino.head.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.rhino.head.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.rhino.head.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:262)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:283) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformNameAsString(com.google.javascript.rhino.head.ast.Name)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.rhino.head.ast.Name)}
 * @utbot.invokes {@link com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher#processName(com.google.javascript.rhino.head.ast.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTransformNameAsString_ThrowIllegalArgumentException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = new Name(0, 0);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        try {
            transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "  ";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = comment;
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String comment = node.getValue();
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:337) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = ((Object) null);
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = comment;
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = comment;
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:345) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = comment;
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: position2charno(position) + numOpeningChars
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "   ";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:366)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = comment;
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: position2charno(position) + numOpeningChars
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        String value = "    ";
        setField(comment, "com.google.javascript.rhino.head.ast.Comment", "value", value);
        comment.setPosition(2);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:137)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:347) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType, nodeType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[2];
        createJsDocInfoParserMethodArguments[0] = comment;
        createJsDocInfoParserMethodArguments[1] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transform
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transform(com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 26);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.UnaryExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 100);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Assignment (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 16);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.InfixExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.PropertyGet (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:232)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.IfStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 43);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.KeywordLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:215)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ContinueStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:193)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.SwitchCase (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.FunctionCall (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.CatchClause (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:189)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.NewExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:244)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.WithStatement (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:278)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.EmptyExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:197)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.FunctionNode (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:228)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ElementGet (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:230)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 48);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.RegExpLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.RegExpLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.AstRoot (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:254)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ConditionalExpression (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:234)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.ObjectProperty (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:191)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.NumberLiteral (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:246)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.rhino.head.ast.Comment cannot be cast to class com.google.javascript.rhino.head.ast.Label (com.google.javascript.rhino.head.ast.Comment and com.google.javascript.rhino.head.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:238)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:376)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", astNodeType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = ((Object) null);
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transform(com.google.javascript.rhino.head.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 122);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 119);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 154);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.rhino.head.ast.Comment"));
        setField(comment, "com.google.javascript.rhino.head.Node", "type", 129);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", commentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = comment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.rhino.head.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.rhino.head.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.rhino.head.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", ifStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = ifStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newNode(int, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return new Node(type, child1).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[2];
        newNodeMethodArguments[0] = 1;
        newNodeMethodArguments[1] = node;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(1);
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", node);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeParent == finalNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[2];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[2];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newNode(int)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return new Node(type).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewNode_NodeClonePropsFrom1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[1];
        newNodeMethodArguments[0] = 0;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
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
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewNode_NodeClonePropsFrom2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Node initialNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialStringNodeNext = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "next"));
        Node initialStringNodeParent = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialStringNode1Parent = ((Node) getFieldValue(stringNode1, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = 2;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = stringNode;
        newNodeMethodArguments[3] = stringNode1;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(2);
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", stringNode1);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstNextStr);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node expectedFirstNextNext = expectedFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int expectedFirstNextNextSourcePosition = expectedFirstNextNext.getSourcePosition();
        int actualFirstNextNextSourcePosition = actualFirstNextNext.getSourcePosition();
        assertEquals(expectedFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node expectedFirstNextNextParent = expectedFirstNextNext.getParent();
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node expectedFirstNextNextParentLast = ((Node) getFieldValue(expectedFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextNextParentLast = ((Node) getFieldValue(actualFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentLast, actualFirstNextNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        int expectedFirstNextNextParentSourcePosition = expectedFirstNextNextParent.getSourcePosition();
        int actualFirstNextNextParentSourcePosition = actualFirstNextNextParent.getSourcePosition();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentSourcePosition, actualFirstNextNextParentSourcePosition));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node actualFirstNextNextParentParent = actualFirstNextNextParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstNextNextParentParent, actualFirstNextNextParentParent));
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalStringNodeNext = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "next"));
        Node finalStringNodeParent = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalStringNode1Parent = ((Node) getFieldValue(stringNode1, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialStringNodeNext == finalStringNodeNext);
        
        assertFalse(initialStringNodeParent == finalStringNodeParent);
        
        assertFalse(initialStringNode1Parent == finalStringNode1Parent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, numberNodeType, numberNodeType, numberNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = numberNode;
        newNodeMethodArguments[2] = ((Object) null);
        newNodeMethodArguments[3] = ((Object) null);
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = ((Object) null);
        newNodeMethodArguments[3] = ((Object) null);
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = stringNode;
        newNodeMethodArguments[3] = ((Object) null);
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = stringNode;
        newNodeMethodArguments[3] = ((Object) null);
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = stringNode;
        newNodeMethodArguments[3] = stringNode1;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = stringNode;
        newNodeMethodArguments[3] = stringNode1;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.newNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return new Node(type, child1, child2).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewNode_NodeClonePropsFrom3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Node initialNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialStringNodeParent = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -248;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = stringNode;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(-248);
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", stringNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstNextStr);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        int expectedFirstNextParentSourcePosition = expectedFirstNextParent.getSourcePosition();
        int actualFirstNextParentSourcePosition = actualFirstNextParent.getSourcePosition();
        assertEquals(expectedFirstNextParentSourcePosition, actualFirstNextParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalStringNodeParent = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialStringNodeParent == finalStringNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = ((Object) null);
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = ((Object) null);
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, stringNodeType, stringNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = stringNode;
        newNodeMethodArguments[2] = stringNode1;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_31() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = numberNode;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields889610447291000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields889610447291000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass889610447296400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields889610447291000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass889610447296400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields889610447715200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields889610447715200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass889610447717400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields889610447715200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass889610447717400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


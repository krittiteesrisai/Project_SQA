package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.jscomp.mozilla.rhino.ast.XmlExpression;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Yield;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_parsing_IRFactoryTest {
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transform
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Comment ([B is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.mozilla.rhino.ast.Comment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.mozilla.rhino.Node.getJsDocNode(Node.java:227)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:236) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Name (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:243)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 17);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 45);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 90);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Assignment (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:259)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:279)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 106);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:192)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:233)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:235)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:190)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:253)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:241)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:229)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:263)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 48);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:251)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:255)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 118);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:196)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:277)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:245)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransform_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:236) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 119);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 129);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 154);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = justTransform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransform_ThrowIllegalStateException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    /// Actual number of generated tests (55) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testTransform1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall (com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ArrayLiteral arrayLiteral = ((ArrayLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral"));
        setField(arrayLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processArrayLiteral(IRFactory.java:364)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processArrayLiteral(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class arrayLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", arrayLiteralType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = arrayLiteral;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 133);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processLabeledStatement(IRFactory.java:644)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processLabeledStatement(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:204)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labeledStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", labeledStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = labeledStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ObjectLiteral objectLiteral = ((ObjectLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral"));
        setField(objectLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processObjectLiteral(IRFactory.java:707)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processObjectLiteral(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class objectLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", objectLiteralType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = objectLiteral;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ContinueStatement continueStatement = ((ContinueStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement"));
        setField(continueStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processContinueStatement(IRFactory.java:472)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processContinueStatement(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class continueStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", continueStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = continueStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(config, "com.google.javascript.jscomp.parsing.Config", "acceptConstKeyword", true);
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        VariableDeclaration variableDeclaration = ((VariableDeclaration) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration"));
        setField(variableDeclaration, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 154);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processVariableDeclaration(IRFactory.java:922)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processVariableDeclaration(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:267)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class variableDeclarationType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", variableDeclarationType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = variableDeclaration;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        NumberLiteral numberLiteral = ((NumberLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral"));
        numberLiteral.setNumber(0.0);
        setField(numberLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$1500(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processNumberLiteral(IRFactory.java:698)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processNumberLiteral(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", numberLiteralType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = numberLiteral;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        VariableDeclaration variableDeclaration = ((VariableDeclaration) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration"));
        setField(variableDeclaration, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processVariableDeclaration(IRFactory.java:922)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processVariableDeclaration(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:267)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class variableDeclarationType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", variableDeclarationType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = variableDeclaration;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 93);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:619)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:374)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", assignmentType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = assignment;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 108);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 127);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 54);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 143);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 138);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 146);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 37);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 132);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 147);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 150);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 84);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        StringLiteral stringLiteral = ((StringLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral"));
        String value = "";
        stringLiteral.setValue(value);
        setField(stringLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newStringNode(IRFactory.java:1333)
            com.google.javascript.jscomp.parsing.IRFactory.access$1700(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processStringLiteral(IRFactory.java:802)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processStringLiteral(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", stringLiteralType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = stringLiteral;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        AstRoot astRoot = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        setField(astRoot, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAstRoot(IRFactory.java:387)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAstRoot(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:255)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astRootType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", astRootType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = astRoot;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        SwitchCase switchCase = ((SwitchCase) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase"));
        setField(switchCase, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 115);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1317)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processSwitchCase(IRFactory.java:810)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processSwitchCase(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class switchCaseType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", switchCaseType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = switchCase;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 85);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 82);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 74);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform28() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 80);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform29() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 79);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform30() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 140);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform31() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 71);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform32() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 59);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform33() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 68);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform34() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 148);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform35() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 58);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform36() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 88);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform37() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        PropertyGet propertyGet = ((PropertyGet) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet"));
        setField(propertyGet, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processPropertyGet(IRFactory.java:766)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processPropertyGet(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:233)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class propertyGetType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", propertyGetType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = propertyGet;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform38() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 76);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform39() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 72);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform40() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 144);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform41() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 157);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform42() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 155);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform43() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 5);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform44() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ElementGet elementGet = ((ElementGet) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet"));
        setField(elementGet, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processElementGet(IRFactory.java:494)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processElementGet(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:231)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class elementGetType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", elementGetType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = elementGet;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform45() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 113);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform46() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 35);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:957)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform47() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ThrowStatement throwStatement = ((ThrowStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement"));
        setField(throwStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processThrowStatement(IRFactory.java:841)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processThrowStatement(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class throwStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", throwStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = throwStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform48() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object templateNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        EmptyExpression emptyExpression = ((EmptyExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression"));
        setField(emptyExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:241) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class emptyExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", emptyExpressionType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = emptyExpression;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform49() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ObjectLiteral objectLiteral = ((ObjectLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral"));
        objectLiteral.setIsDestructuring(true);
        setField(objectLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.reportDestructuringAssign(IRFactory.java:967)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processObjectLiteral(IRFactory.java:704)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processObjectLiteral(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class objectLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", objectLiteralType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = objectLiteral;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransform50() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ObjectLiteral objectLiteral = ((ObjectLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral"));
        objectLiteral.setIsDestructuring(true);
        setField(objectLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        objectLiteral.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.reportDestructuringAssign(IRFactory.java:967)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processObjectLiteral(IRFactory.java:704)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processObjectLiteral(IRFactory.java:324)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class objectLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", objectLiteralType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = objectLiteral;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    @Test(expected = IllegalStateException.class)
    public void testTransform51() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 133);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransform52() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Label label = ((Label) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Label"));
        setField(label, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 130);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labelType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", labelType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = label;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTransform53() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 73);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", tryStatementType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = tryStatement;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransform54() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformMethod = iRFactoryClazz.getDeclaredMethod("transform", nameType);
        transformMethod.setAccessible(true);
        java.lang.Object[] transformMethodArguments = new java.lang.Object[1];
        transformMethodArguments[0] = name;
        try {
            transformMethod.invoke(iRFactory, transformMethodArguments);
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
    public void testNewNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
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
    public void testNewNode_NodeClonePropsFrom1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Node initialNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialScriptOrFnNodeNext = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "next"));
        Node initialScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialFunctionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = 1;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = scriptOrFnNode;
        newNodeMethodArguments[3] = functionNode;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(1);
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", functionNode);
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
        int expectedFirstNextEncodedSourceStart = (((ScriptOrFnNode) expectedFirstNext)).getEncodedSourceStart();
        int actualFirstNextEncodedSourceStart = (((ScriptOrFnNode) actualFirstNext)).getEncodedSourceStart();
        assertEquals(expectedFirstNextEncodedSourceStart, actualFirstNextEncodedSourceStart);
        
        int expectedFirstNextEncodedSourceEnd = (((ScriptOrFnNode) expectedFirstNext)).getEncodedSourceEnd();
        int actualFirstNextEncodedSourceEnd = (((ScriptOrFnNode) actualFirstNext)).getEncodedSourceEnd();
        assertEquals(expectedFirstNextEncodedSourceEnd, actualFirstNextEncodedSourceEnd);
        
        String actualFirstNextSourceName = (((ScriptOrFnNode) actualFirstNext)).getSourceName();
        assertNull(actualFirstNextSourceName);
        
        int expectedFirstNextBaseLineno = (((ScriptOrFnNode) expectedFirstNext)).getBaseLineno();
        int actualFirstNextBaseLineno = (((ScriptOrFnNode) actualFirstNext)).getBaseLineno();
        assertEquals(expectedFirstNextBaseLineno, actualFirstNextBaseLineno);
        
        int expectedFirstNextEndLineno = (((ScriptOrFnNode) expectedFirstNext)).getEndLineno();
        int actualFirstNextEndLineno = (((ScriptOrFnNode) actualFirstNext)).getEndLineno();
        assertEquals(expectedFirstNextEndLineno, actualFirstNextEndLineno);
        
        ObjArray actualFirstNextFunctions = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstNextFunctions);
        
        ObjArray actualFirstNextRegexps = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstNextRegexps);
        
        ObjArray actualFirstNextItsVariables = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstNextItsVariables);
        
        ObjArray actualFirstNextItsConst = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstNextItsConst);
        
        ObjToIntMap actualFirstNextItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstNextItsVariableNames);
        
        int expectedFirstNextVarStart = ((Integer) getFieldValue(expectedFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstNextVarStart = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(expectedFirstNextVarStart, actualFirstNextVarStart);
        
        Object actualFirstNextCompilerData = (((ScriptOrFnNode) actualFirstNext)).getCompilerData();
        assertNull(actualFirstNextCompilerData);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node expectedFirstNextNext = expectedFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
        String actualFirstNextNextFunctionName = (((FunctionNode) actualFirstNextNext)).getFunctionName();
        assertNull(actualFirstNextNextFunctionName);
        
        boolean actualFirstNextNextItsNeedsActivation = ((Boolean) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstNextNextItsNeedsActivation);
        
        int expectedFirstNextNextItsFunctionType = ((Integer) getFieldValue(expectedFirstNextNext, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstNextNextItsFunctionType = ((Integer) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(expectedFirstNextNextItsFunctionType, actualFirstNextNextItsFunctionType);
        
        boolean actualFirstNextNextItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstNextNextItsIgnoreDynamicScope);
        
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int expectedFirstNextNextSourcePosition = ((Integer) getFieldValue(expectedFirstNextNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextNextSourcePosition = ((Integer) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "sourcePosition"));
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
        int expectedFirstNextNextParentSourcePosition = ((Integer) getFieldValue(expectedFirstNextNextParent, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextNextParentSourcePosition = ((Integer) getFieldValue(actualFirstNextNextParent, "com.google.javascript.rhino.Node", "sourcePosition"));
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
        
        Node finalScriptOrFnNodeNext = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "next"));
        Node finalScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalFunctionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialScriptOrFnNodeNext == finalScriptOrFnNodeNext);
        
        assertFalse(initialScriptOrFnNodeParent == finalScriptOrFnNodeParent);
        
        assertFalse(initialFunctionNodeParent == finalFunctionNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2, child3).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = scriptOrFnNode;
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
    public void testNewNode_ThrowIllegalArgumentException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = functionNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = functionNode;
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
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
        newNodeMethodArguments[3] = scriptOrFnNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, functionNodeType, functionNodeType, functionNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = functionNode;
        newNodeMethodArguments[2] = node;
        newNodeMethodArguments[3] = scriptOrFnNode;
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
    public void testNewNode_NodeClonePropsFrom2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Node initialScriptOrFnNodeNext = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "next"));
        Node initialScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialScriptOrFnNode1Parent = ((Node) getFieldValue(scriptOrFnNode1, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = 1;
        newNodeMethodArguments[1] = scriptOrFnNode;
        newNodeMethodArguments[2] = scriptOrFnNode1;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(1);
        setField(expected, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", scriptOrFnNode1);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstEncodedSourceStart = (((ScriptOrFnNode) expectedFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(expectedFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int expectedFirstEncodedSourceEnd = (((ScriptOrFnNode) expectedFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(expectedFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int expectedFirstBaseLineno = (((ScriptOrFnNode) expectedFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(expectedFirstBaseLineno, actualFirstBaseLineno);
        
        int expectedFirstEndLineno = (((ScriptOrFnNode) expectedFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(expectedFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int expectedFirstVarStart = ((Integer) getFieldValue(expectedFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(expectedFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int expectedFirstType = expectedFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = ((Integer) getFieldValue(expectedFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
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
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
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
        int expectedFirstNextParentSourcePosition = ((Integer) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextParentSourcePosition = ((Integer) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "sourcePosition"));
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
        
        Node finalScriptOrFnNodeNext = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "next"));
        Node finalScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalScriptOrFnNode1Parent = ((Node) getFieldValue(scriptOrFnNode1, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialScriptOrFnNodeNext == finalScriptOrFnNodeNext);
        
        assertFalse(initialScriptOrFnNodeParent == finalScriptOrFnNodeParent);
        
        assertFalse(initialScriptOrFnNode1Parent == finalScriptOrFnNode1Parent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
    public void testNewNode_ThrowIllegalArgumentException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = functionNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = functionNode;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
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
    public void testNewNode_NodeClonePropsFrom3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Node initialScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, scriptOrFnNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[2];
        newNodeMethodArguments[0] = -192;
        newNodeMethodArguments[1] = scriptOrFnNode;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(-192);
        setField(expected, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstEncodedSourceStart = (((ScriptOrFnNode) expectedFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(expectedFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int expectedFirstEncodedSourceEnd = (((ScriptOrFnNode) expectedFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(expectedFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int expectedFirstBaseLineno = (((ScriptOrFnNode) expectedFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(expectedFirstBaseLineno, actualFirstBaseLineno);
        
        int expectedFirstEndLineno = (((ScriptOrFnNode) expectedFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(expectedFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int expectedFirstVarStart = ((Integer) getFieldValue(expectedFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(expectedFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
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
        
        int expectedFirstSourcePosition = ((Integer) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
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
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = ((Integer) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstParentSourcePosition = ((Integer) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalScriptOrFnNodeParent = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialScriptOrFnNodeParent == finalScriptOrFnNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
    public void testNewNode_ThrowIllegalArgumentException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformTree
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformTree(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot, java.lang.String, com.google.javascript.jscomp.parsing.Config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTree(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot,java.lang.String,com.google.javascript.jscomp.parsing.Config,com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)}
 * @utbot.invokes {@link com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: IRFactory irFactory = new IRFactory(sourceString, node.getSourceName(), config, errorReporter);
 *  */
    @Test
    public void testTransformTree_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformTree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.transformTree(IRFactory.java:158) */
        IRFactory.transformTree(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method transformTree(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot, java.lang.String, com.google.javascript.jscomp.parsing.Config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)
    
    @Test
    public void testTransformTree1() throws Exception  {
        AstRoot astRoot = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformTree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.<init>(IRFactory.java:128)
            com.google.javascript.jscomp.parsing.IRFactory.transformTree(IRFactory.java:158) */
        IRFactory.transformTree(astRoot, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSourceInfo(com.google.javascript.rhino.Node, com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): False}
 *  */
    @Test
    public void testSetSourceInfo_IrNodeGetLinenoNotEqualsNegative1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = ((Object) null);
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (irNode.getFirstChild().getLineno() != -1): True}
 *  */
    @Test
    public void testSetSourceInfo_IrNodeGetFirstChildGetLinenoNotEqualsNegative1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = ((Object) null);
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        
        int finalNodeSourcePosition = ((Integer) getFieldValue(node, "com.google.javascript.rhino.Node", "sourcePosition"));
        
        assertEquals(0, finalNodeSourcePosition);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (irNode.getFirstChild().getLineno() != -1): True}
 *  */
    @Test
    public void testSetSourceInfo_IrNodeGetFirstChildGetLinenoNotEqualsNegative1_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = ((Object) null);
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 *  */
    @Test
    public void testSetSourceInfo_IrNodeGetLinenoEqualsNegative1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setPosition(1);
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, commentType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = comment;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setCharno(int)}
 *  */
    @Test
    public void testSetSourceInfo_NodeSetCharno() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", nodeType, commentType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = node;
        setSourceInfoMethodArguments[1] = comment;
        setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSourceInfo(com.google.javascript.rhino.Node, com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int lineno = node.getLineno();
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:270) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = ((Object) null);
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: irNode.getType() == Token.FUNCTION && irNode.getFirstChild().getLineno() != -1
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:261) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (irNode.getFirstChild().getLineno() != -1): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLineno()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int lineno = node.getLineno();
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:270) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = ((Object) null);
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.getFirstChild().getLineno() != -1
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:262) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, astNodeType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = ((Object) null);
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setPosition(-255);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, commentType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = comment;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, commentType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = comment;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setSourceInfo(com.google.javascript.rhino.Node,com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.executesCondition {@code (irNode.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (irNode.getLineno() == -1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int charno = position2charno(node.getAbsolutePosition());
 *  */
    @Test
    public void testSetSourceInfo_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method setSourceInfoMethod = iRFactoryClazz.getDeclaredMethod("setSourceInfo", functionNodeType, commentType);
        setSourceInfoMethod.setAccessible(true);
        java.lang.Object[] setSourceInfoMethodArguments = new java.lang.Object[2];
        setSourceInfoMethodArguments[0] = functionNode;
        setSourceInfoMethodArguments[1] = comment;
        try {
            setSourceInfoMethod.invoke(iRFactory, setSourceInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
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
        String sourceName = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceName", sourceName);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Method createTemplateNodeMethod = iRFactoryClazz.getDeclaredMethod("createTemplateNode");
        createTemplateNodeMethod.setAccessible(true);
        java.lang.Object[] createTemplateNodeMethodArguments = new java.lang.Object[0];
        Node actual = ((Node) createTemplateNodeMethod.invoke(iRFactory, createTemplateNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", sourceName);
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
        Object actualPropListHeadNext = getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$PropListItem", "next");
        assertNull(actualPropListHeadNext);
        
        int expectedPropListHeadType = ((Integer) getFieldValue(expectedPropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        int actualPropListHeadType = ((Integer) getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        assertEquals(expectedPropListHeadType, actualPropListHeadType);
        
        int expectedPropListHeadIntValue = ((Integer) getFieldValue(expectedPropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        int actualPropListHeadIntValue = ((Integer) getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        assertEquals(expectedPropListHeadIntValue, actualPropListHeadIntValue);
        
        Object expectedPropListHeadObjectValue = getFieldValue(expectedPropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        Object actualPropListHeadObjectValue = getFieldValue(actualPropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        assertEquals(expectedPropListHeadObjectValue, actualPropListHeadObjectValue);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformBlock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:279)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 105);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 31);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:263)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 92);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Assignment (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:241)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:245)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 42);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:192)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:231)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:229)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:253)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:277)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:190)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:236)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", astNodeType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = ((Object) null);
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = new Comment(0, 0, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:190) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = transform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock_ThrowIllegalStateException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = transform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 129);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = transform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node irNode = transform(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock_ThrowIllegalStateException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 133);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.invokes {@link com.google.javascript.jscomp.mozilla.rhino.ast.AstNode#getJsDocNode()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testHandleJsDoc_AstNodeGetJsDocNode() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = new Comment(0, 0, null, null);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        JSDocInfo actual = ((JSDocInfo) handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Comment comment = node.getJsDocNode();
 *  */
    @Test
    public void testHandleJsDoc_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Comment ([B is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.mozilla.rhino.ast.Comment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.mozilla.rhino.Node.getJsDocNode(Node.java:227)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandleJsDoc_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = node.getJsDocNode();
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", astNodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ((Object) null);
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", commentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = comment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    @Test
    public void testHandleJsDoc1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", tryStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = tryStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        TryStatement parent = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        LabeledStatement parent1 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        LabeledStatement parent2 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        StringLiteral parent3 = ((StringLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral"));
        parent2.setParent(parent3);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labeledStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", labeledStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = labeledStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        LabeledStatement parent1 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        LabeledStatement parent2 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", assignmentType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = assignment;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next3, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(next3, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labeledStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", labeledStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = labeledStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        objectValue.setPosition(33);
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        parent.setPosition(-8);
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labeledStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", labeledStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = labeledStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        XmlExpression xmlExpression = ((XmlExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlExpression"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        LabeledStatement parent = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(xmlExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class xmlExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", xmlExpressionType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = xmlExpression;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    @Test(timeout = 1000L)
    public void testHandleJsDoc7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        TryStatement tryStatement = ((TryStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", propListHead);
        setField(tryStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class tryStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", tryStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = tryStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newNumber(double)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Node.newNumber(value).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewNumberNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Node.newNumber(value).clonePropsFrom(templateNode);
 *  */
    @Test
    public void testNewNumberNode_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.newNumberNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.newNumberNode(IRFactory.java:1341) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.justTransform
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 24);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 31);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 92);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Assignment (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:277)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:241)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 48);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:251)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Name (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:243)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:229)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 160);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:279)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 125);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:190)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:233)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:255)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Label (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:239)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:235)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:259)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:245)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 118);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:196)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:231)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_28() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:192)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_29() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_30() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:253)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_31() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:263)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_32() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Comment cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Comment and com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:321) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class astNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 133);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 119);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 154);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return transformDispatcher.process(node);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testJustTransform_ThrowIllegalStateException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 129);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformTokenType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transformTokenType(int)
    /// Actual number of generated tests (151) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.CONTINUE}
 * @utbot.returnsFrom {@code return Token.CONTINUE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenCONTINUE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 121;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(117, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.WHILE}
 * @utbot.returnsFrom {@code return Token.WHILE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenWHILE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 117;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(113, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.LEAVEWITH}
 * @utbot.returnsFrom {@code return Token.LEAVEWITH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenLEAVEWITH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 3;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(3, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.LOOP}
 * @utbot.returnsFrom {@code return Token.LOOP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenLOOP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 132;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(128, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ARRAYLIT}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ELSE}
 * @utbot.returnsFrom {@code return Token.ELSE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenELSE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 113;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(109, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SETELEM_OP}
 * @utbot.returnsFrom {@code return Token.SETELEM_OP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSETELEM_OP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 140;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(136, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.THISFN}
 * @utbot.returnsFrom {@code return Token.THISFN;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenTHISFN() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 63;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(61, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.XMLEND}
 * @utbot.returnsFrom {@code return Token.XMLEND;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenXMLEND() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 148;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(144, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SETVAR}
 * @utbot.returnsFrom {@code return Token.SETVAR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSETVAR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 56;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(55, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.NEW}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_MOD}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.DOT}
 * @utbot.returnsFrom {@code return Token.DOT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenDOT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 108;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(104, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_DIV}
 * @utbot.returnsFrom {@code return Token.ASSIGN_DIV;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_DIV() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 100;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(96, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.LP}
 * @utbot.returnsFrom {@code return Token.LP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenLP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.IFEQ}
 * @utbot.returnsFrom {@code return Token.IFEQ;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenIFEQ() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 6;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(6, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.RC}
 * @utbot.returnsFrom {@code return Token.RC;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenRC() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 86;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(82, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.VOID}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ESCXMLATTR}
 * @utbot.returnsFrom {@code return Token.ESCXMLATTR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenESCXMLATTR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 75;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(71, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.OBJECTLIT}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SHNE}
 * @utbot.returnsFrom {@code return Token.SHNE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSHNE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 47;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(46, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ENUM_NEXT}
 * @utbot.returnsFrom {@code return Token.ENUM_NEXT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenENUM_NEXT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 61;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(59, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.TRUE}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.BITXOR}
 * @utbot.returnsFrom {@code return Token.BITXOR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenBITXOR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 10;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(10, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.LABEL}
 * @utbot.returnsFrom {@code return Token.LABEL;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenLABEL() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 130;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(126, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.RSH}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_ADD}
 * @utbot.returnsFrom {@code return Token.ASSIGN_ADD;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_ADD() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 97;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(93, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_RESULT}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.IFNE}
 * @utbot.returnsFrom {@code return Token.IFNE;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenIFNE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 7;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(7, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.EMPTY}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.INSTANCEOF}
 * @utbot.returnsFrom {@code return Token.INSTANCEOF;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenINSTANCEOF() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 53;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(52, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.POS}
 * @utbot.returnsFrom {@code return Token.POS;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenPOS() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 28;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(28, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.RETURN_RESULT}
 * @utbot.returnsFrom {@code return Token.RETURN_RESULT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenRETURN_RESULT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 64;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(62, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.DIV}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.IN}
 * @utbot.returnsFrom {@code return Token.IN;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenIN() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 52;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(51, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_URSH}
 * @utbot.returnsFrom {@code return Token.ASSIGN_URSH;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenASSIGN_URSH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 96;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(92, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.LE}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SETPROP_OP}
 * @utbot.returnsFrom {@code return Token.SETPROP_OP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSETPROP_OP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 139;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(135, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.URSH}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SETPROP}
 * @utbot.returnsFrom {@code return Token.SETPROP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSETPROP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 35;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(34, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SHEQ}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.ENUM_INIT_VALUES}
 * @utbot.returnsFrom {@code return Token.ENUM_INIT_VALUES;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenENUM_INIT_VALUES() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 59;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(58, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.COLONCOLON}
 * @utbot.returnsFrom {@code return Token.COLONCOLON;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenCOLONCOLON() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 144;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(140, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.IMPORT}
 * @utbot.returnsFrom {@code return Token.IMPORT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenIMPORT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 111;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(107, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.NAME}
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
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.JSR}
 * @utbot.returnsFrom {@code return Token.JSR;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenJSR() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 135;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(131, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.DEFAULT}
 * @utbot.returnsFrom {@code return Token.DEFAULT;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenDEFAULT() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 116;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(112, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.SEMI}
 * @utbot.returnsFrom {@code return Token.SEMI;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenSEMI() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 82;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(78, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformTokenType(int)}
 * @utbot.activatesSwitch {@code switch(token) case: com.google.javascript.jscomp.mozilla.rhino.Token.GETPROP}
 * @utbot.returnsFrom {@code return Token.GETPROP;}
 *  */
    @Test
    public void testTransformTokenType_ReturnTokenGETPROP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method transformTokenTypeMethod = iRFactoryClazz.getDeclaredMethod("transformTokenType", intType);
        transformTokenTypeMethod.setAccessible(true);
        java.lang.Object[] transformTokenTypeMethodArguments = new java.lang.Object[1];
        transformTokenTypeMethodArguments[0] = 33;
        int actual = ((Integer) transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments));
        
        assertEquals(33, actual);
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
        transformTokenTypeMethodArguments[0] = 73;
        try {
            transformTokenTypeMethod.invoke(null, transformTokenTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#clonePropsFrom(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Node.newString(value).clonePropsFrom(templateNode);}
 *  */
    @Test
    public void testNewStringNode_NodeClonePropsFrom1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Node.newString(value).clonePropsFrom(templateNode);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "  ";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String comment = node.getValue();
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:289) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = ((Object) null);
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new JsDocTokenStream(comment.substring(numOpeningChars), lineno, position2charno(position) + numOpeningChars)
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: position2charno(position) + numOpeningChars
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "     ";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: position2charno(position) + numOpeningChars
 *  */
    @Test
    public void testCreateJsDocInfoParser_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "    ";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(2);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)
    
    @Test
    public void testCreateJsDocInfoParser1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        LabeledStatement parent1 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        ThrowStatement parent = ((ThrowStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement"));
        SwitchCase parent1 = ((SwitchCase) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase"));
        LabeledStatement parent2 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        parent1.setParent(parent2);
        parent.setParent(parent1);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(14);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(1);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\n\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        comment.setPosition(2);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        RegExpLiteral parent = ((RegExpLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral"));
        VariableInitializer parent1 = ((VariableInitializer) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer"));
        ReturnStatement parent2 = ((ReturnStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement"));
        VariableInitializer parent3 = ((VariableInitializer) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer"));
        parent3.setLineno(-2147483646);
        parent2.setParent(parent3);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(2);
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        parent.setPosition(-2);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\n";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        comment.setPosition(Integer.MIN_VALUE);
        WithStatement parent = ((WithStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement"));
        parent.setPosition(-2147483646);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateJsDocInfoParser14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)
    
    @Test(timeout = 1000L)
    public void testCreateJsDocInfoParser15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent1.setParent(parent1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method createJsDocInfoParserMethod = iRFactoryClazz.getDeclaredMethod("createJsDocInfoParser", commentType);
        createJsDocInfoParserMethod.setAccessible(true);
        java.lang.Object[] createJsDocInfoParserMethodArguments = new java.lang.Object[1];
        createJsDocInfoParserMethodArguments[0] = comment;
        try {
            createJsDocInfoParserMethod.invoke(iRFactory, createJsDocInfoParserMethodArguments);
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
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:210) */
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "  ";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:289)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = ((Object) null);
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "   ";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        ThrowStatement parent = ((ThrowStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement"));
        SwitchCase parent1 = ((SwitchCase) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase"));
        LabeledStatement parent2 = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        parent1.setParent(parent2);
        parent.setParent(parent1);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        ThrowStatement parent = ((ThrowStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement"));
        SwitchCase parent1 = ((SwitchCase) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase"));
        AstRoot parent2 = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        parent1.setParent(parent2);
        parent.setParent(parent1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        RegExpLiteral parent = ((RegExpLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral"));
        VariableInitializer parent1 = ((VariableInitializer) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer"));
        ReturnStatement parent2 = ((ReturnStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement"));
        VariableInitializer parent3 = ((VariableInitializer) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer"));
        parent3.setLineno(-1);
        parent2.setParent(parent3);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\n\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceName", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        comment.setPosition(2);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser.addParserWarning(JsDocInfoParser.java:63)
            com.google.javascript.jscomp.parsing.JsDocInfoParser.parse(JsDocInfoParser.java:884)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:306)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceName", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser.addParserWarning(JsDocInfoParser.java:63)
            com.google.javascript.jscomp.parsing.JsDocInfoParser.parse(JsDocInfoParser.java:884)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:306)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandlePossibleFileOverviewJsDoc11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        String sourceName = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceName", sourceName);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser.addParserWarning(JsDocInfoParser.java:63)
            com.google.javascript.jscomp.parsing.JsDocInfoParser.parse(JsDocInfoParser.java:884)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:306)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:218) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class commentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Method handlePossibleFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("handlePossibleFileOverviewJsDoc", commentType);
        handlePossibleFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] handlePossibleFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        handlePossibleFileOverviewJsDocMethodArguments[0] = comment;
        try {
            handlePossibleFileOverviewJsDocMethod.invoke(iRFactory, handlePossibleFileOverviewJsDocMethodArguments);
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
 * @utbot.executesCondition {@code (fileOverviewInfo != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSDocInfo(com.google.javascript.rhino.JSDocInfo)}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoNotEqualsNull() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Object initialFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialFunctionNodePropListHead == finalFunctionNodePropListHead);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalNodePropListHead = getFieldValue(node, "com.google.javascript.rhino.Node", "propListHead");
        
        assertNull(finalNodePropListHead);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.JSDocInfo ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1972)
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:179) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSDocInfo(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: (irNode.getJSDocInfo() != null) && (irNode.getJSDocInfo().getLicense() != null)
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1972)
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:181) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        try {
            setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:179) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:179) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:179) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:179) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setFileOverviewJsDoc(com.google.javascript.rhino.Node)
    
    @Test
    public void testSetFileOverviewJsDoc1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        iRFactory.fileOverviewInfo = objectValue;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
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
    public void testSetFileOverviewJsDoc4() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc5() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", fileOverviewInfo);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc6() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialFunctionNodePropListHead == finalFunctionNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc7() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    public void testSetFileOverviewJsDoc8() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    @Test
    public void testSetFileOverviewJsDoc9() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
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
    public void testSetFileOverviewJsDoc10() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", fileOverviewInfo);
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
    public void testSetFileOverviewJsDoc11() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
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
    public void testSetFileOverviewJsDoc12() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", fileOverviewInfo);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialFunctionNodePropListHead == finalFunctionNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc13() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc14() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialFunctionNodePropListHead == finalFunctionNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc15() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(fileOverviewInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", fileOverviewInfo);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc16() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc17() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next4, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "next", next4);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
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
    public void testSetFileOverviewJsDoc18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object rootNodeJsDocHolder = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.returnsFrom {@code return irNode;}
 *  */
    @Test
    public void testTransformNameAsString_ReturnIrNode() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ScriptOrFnNode templateNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "\u0000\u0000\u0000";
        name.setIdentifier(identifier);
        name.setPosition(1);
        name.setLineno(Integer.MIN_VALUE);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        Object actual = transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", identifier);
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.returnsFrom {@code return irNode;}
 *  */
    @Test
    public void testTransformNameAsString_ReturnIrNode_1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        name.setPosition(-2147483618);
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        Object actual = transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", identifier);
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Comment ([I is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.mozilla.rhino.ast.Comment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.mozilla.rhino.Node.getJsDocNode(Node.java:227)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:224)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = transformDispatcher.processName(node, true);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = new Name(0, 0);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:247) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setSourceInfo(irNode, node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        name.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:251) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setSourceInfo(irNode, node);
 *  */
    @Test
    public void testTransformNameAsString_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:251) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)}
 * @utbot.invokes com.google.javascript.jscomp.parsing.IRFactory#handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
 * @utbot.invokes {@link com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher#processName(com.google.javascript.jscomp.mozilla.rhino.ast.Name,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node irNode = transformDispatcher.processName(node, true);
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
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    @Test
    public void testTransformNameAsString1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        Object actual = transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", identifier);
        (((Node) expected)).setType(40);
        
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTransformNameAsString2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        name.setParent(parent);
        name.setLineno(Integer.MIN_VALUE);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        Object actual = transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", identifier);
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTransformNameAsString3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        name.setLineno(-1);
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
        Method transformNameAsStringMethod = iRFactoryClazz.getDeclaredMethod("transformNameAsString", nameType);
        transformNameAsStringMethod.setAccessible(true);
        java.lang.Object[] transformNameAsStringMethodArguments = new java.lang.Object[1];
        transformNameAsStringMethodArguments[0] = name;
        Object actual = transformNameAsStringMethod.invoke(iRFactory, transformNameAsStringMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", identifier);
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    @Test
    public void testTransformNameAsString4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:247) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$1300(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processName(IRFactory.java:672)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:247) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000 \u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setPosition(1);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Yield parent = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        InfixExpression parent1 = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:297)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        objectValue.setPosition(20);
        Yield parent = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        parent.setPosition(5);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:127)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:299)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:226)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:246) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:757)
            com.google.javascript.jscomp.parsing.IRFactory.newStringNode(IRFactory.java:1337)
            com.google.javascript.jscomp.parsing.IRFactory.access$1300(IRFactory.java:79)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processName(IRFactory.java:672)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:247) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        ExpressionStatement parent = ((ExpressionStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        name.setParent(parent);
        name.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:251) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        name.setLineno(Integer.MIN_VALUE);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:251) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        NumberLiteral parent = ((NumberLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral"));
        ExpressionStatement parent1 = ((ExpressionStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        XmlLiteral parent2 = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        parent2.setLineno(715);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        name.setParent(parent);
        name.setLineno(-1);
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:251) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test
    public void testTransformNameAsString14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        String identifier = "";
        name.setIdentifier(identifier);
        ExpressionStatement parent = ((ExpressionStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        XmlLiteral parent1 = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        name.setParent(parent);
        name.setLineno(-1);
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:311)
            com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(IRFactory.java:272)
            com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(IRFactory.java:251) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformNameAsString15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformNameAsString16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
    
    ///region OTHER: TIMEOUTS for method transformNameAsString(com.google.javascript.jscomp.mozilla.rhino.ast.Name)
    
    @Test(timeout = 1000L)
    public void testTransformNameAsString17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", propListHead);
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Name");
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
        
                java.lang.reflect.Method methodForGetDeclaredFields914273228048600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields914273228048600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass914273228053200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914273228048600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914273228053200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields914273228418900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914273228418900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914273228420900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914273228418900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914273228420900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


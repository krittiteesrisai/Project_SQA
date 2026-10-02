package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Yield;
import com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehension;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Name (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:243)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 31);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:263)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:233)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 44);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 100);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Assignment (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 47);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:255)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:190)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:259)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:241)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:279)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement (com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement and com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Label (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:239)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:229)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:277)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:253)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:245)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:235)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 118);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:196)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_28() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:192)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = justTransform(node);
 *  */
    @Test
    public void testTransform_ThrowClassCastException_29() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDocInfo = handleJsDoc(node);
 *  */
    @Test
    public void testTransform_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:206) */
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 119);
        
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
    public void testTransform_ThrowIllegalStateException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 133);
        
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
    public void testTransform_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 154);
        
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
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
    public void testTransform_ThrowIllegalStateException_4() throws Throwable  {
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
    public void testTransform_ThrowIllegalStateException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 129);
        
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
    public void testNewNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Node initialNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode1Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = 1;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(1);
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", node1);
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
        
        Node finalNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode1Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNode1Parent == finalNode1Parent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#newNode(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(type, child1, child2).clonePropsFrom(templateNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
    public void testNewNode_ThrowIllegalArgumentException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
    public void testNewNode_ThrowIllegalArgumentException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
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
    public void testNewNode_ThrowIllegalArgumentException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, functionNodeType, functionNodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[3];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = functionNode;
        newNodeMethodArguments[2] = functionNode1;
        try {
            newNodeMethod.invoke(iRFactory, newNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Node initialNodeNext = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "next"));
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode1Next = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "next"));
        Node initialNode1Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode2Parent = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = 2;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
        newNodeMethodArguments[3] = node2;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(2);
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", node2);
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
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node expectedFirstNextNext = expectedFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
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
        
        Node finalNode1Next = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "next"));
        Node finalNode1Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode2Parent = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNode1Next == finalNode1Next);
        
        assertFalse(initialNode1Parent == finalNode1Parent);
        
        assertFalse(initialNode2Parent == finalNode2Parent);
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
    public void testNewNode_ThrowIllegalArgumentException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
    public void testNewNode_ThrowIllegalArgumentException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
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
    public void testNewNode_ThrowIllegalArgumentException_31() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node1, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
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
        Node node2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node2, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
        newNodeMethodArguments[3] = node2;
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
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node2, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType, nodeType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[4];
        newNodeMethodArguments[0] = -255;
        newNodeMethodArguments[1] = node;
        newNodeMethodArguments[2] = node1;
        newNodeMethodArguments[3] = node2;
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
    public void testNewNode_NodeClonePropsFrom2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node templateNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[1];
        newNodeMethodArguments[0] = -255;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(-255);
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
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "templateNode", templateNode);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method newNodeMethod = iRFactoryClazz.getDeclaredMethod("newNode", intType, nodeType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[2];
        newNodeMethodArguments[0] = 4;
        newNodeMethodArguments[1] = node;
        Node actual = ((Node) newNodeMethod.invoke(iRFactory, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(4);
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
    public void testNewNode_ThrowIllegalArgumentException2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:180) */
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
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:242)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
    public void testHandlePossibleFileOverviewJsDoc_ThrowNullPointerException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "   ";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
    
    @Test(expected = StackOverflowError.class)
    public void testHandlePossibleFileOverviewJsDoc1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent1.setParent(comment);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
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
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        ErrorNode parent1 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        IfStatement parent2 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent1.setParent(parent2);
        parent.setParent(parent1);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        Comment parent1 = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent2 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(34);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(14);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(IRFactory.java:188) */
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
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = new Node(0);
        
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
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (fileOverviewInfo != null): False}
 *  */
    @Test
    public void testSetFileOverviewJsDoc_FileOverviewInfoEqualsNull() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        Node node = new Node(0);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
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
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
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
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1961)
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:149) */
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1961)
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:151) */
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
    
    /**
    @utbot.classUnderTest {@link IRFactory}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.parsing.IRFactory#setFileOverviewJsDoc(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
 *  */
    @Test
    public void testSetFileOverviewJsDoc_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:149) */
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
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:149) */
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
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:149) */
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
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(IRFactory.java:149) */
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
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        iRFactory.fileOverviewInfo = objectValue;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    public void testSetFileOverviewJsDoc2() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
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
    public void testSetFileOverviewJsDoc3() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        iRFactory.fileOverviewInfo = objectValue;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "propListHead", next1);
        
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
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", numberNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = numberNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    @Test
    public void testSetFileOverviewJsDoc5() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next5 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next5, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next4, "com.google.javascript.rhino.Node$PropListItem", "next", next5);
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", scriptOrFnNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = scriptOrFnNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    @Test
    public void testSetFileOverviewJsDoc6() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialScriptOrFnNodePropListHead = getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", scriptOrFnNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = scriptOrFnNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalScriptOrFnNodePropListHead = getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialScriptOrFnNodePropListHead == finalScriptOrFnNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc7() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ScriptOrFnNode rootNodeJsDocHolder = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    public void testSetFileOverviewJsDoc8() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        JSDocInfo jSDocInfo = iRFactory.fileOverviewInfo;
        Object initialIRFactoryFileOverviewInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        Object initialStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", stringNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = stringNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        JSDocInfo jSDocInfo1 = iRFactory.fileOverviewInfo;
        Object finalIRFactoryFileOverviewInfoInfo = getFieldValue(jSDocInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        
        Object finalStringNodePropListHead = getFieldValue(stringNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryFileOverviewInfoInfo == finalIRFactoryFileOverviewInfoInfo);
        
        assertFalse(initialStringNodePropListHead == finalStringNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc9() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead1);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", fileOverviewInfo);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Object initialScriptOrFnNodePropListHead = getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", scriptOrFnNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = scriptOrFnNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        Object finalScriptOrFnNodePropListHead = getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialScriptOrFnNodePropListHead == finalScriptOrFnNodePropListHead);
    }
    
    @Test
    public void testSetFileOverviewJsDoc10() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ScriptOrFnNode rootNodeJsDocHolder = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next5 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next4, "com.google.javascript.rhino.Node$PropListItem", "next", next5);
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    public void testSetFileOverviewJsDoc11() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", nodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = node;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
    }
    
    @Test
    public void testSetFileOverviewJsDoc12() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", next2);
        
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
    public void testSetFileOverviewJsDoc13() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Node rootNodeJsDocHolder = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        iRFactory.rootNodeJsDocHolder = rootNodeJsDocHolder;
        iRFactory.fileOverviewInfo = objectValue;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    public void testSetFileOverviewJsDoc14() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    public void testSetFileOverviewJsDoc15() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", next);
        
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
    public void testSetFileOverviewJsDoc16() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode rootNodeJsDocHolder = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String license = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "license", license);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(rootNodeJsDocHolder, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "rootNodeJsDocHolder", rootNodeJsDocHolder);
        JSDocInfo fileOverviewInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        iRFactory.fileOverviewInfo = fileOverviewInfo;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        JSDocInfo jSDocInfo = iRFactory.fileOverviewInfo;
        Object initialIRFactoryFileOverviewInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        
        Object initialFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method setFileOverviewJsDocMethod = iRFactoryClazz.getDeclaredMethod("setFileOverviewJsDoc", functionNodeType);
        setFileOverviewJsDocMethod.setAccessible(true);
        java.lang.Object[] setFileOverviewJsDocMethodArguments = new java.lang.Object[1];
        setFileOverviewJsDocMethodArguments[0] = functionNode;
        setFileOverviewJsDocMethod.invoke(iRFactory, setFileOverviewJsDocMethodArguments);
        
        JSDocInfo jSDocInfo1 = iRFactory.fileOverviewInfo;
        Object finalIRFactoryFileOverviewInfoInfo = getFieldValue(jSDocInfo1, "com.google.javascript.rhino.JSDocInfo", "info");
        
        Object finalFunctionNodePropListHead = getFieldValue(functionNode, "com.google.javascript.rhino.Node", "propListHead");
        
        assertFalse(initialIRFactoryFileOverviewInfoInfo == finalIRFactoryFileOverviewInfoInfo);
        
        assertFalse(initialFunctionNodePropListHead == finalFunctionNodePropListHead);
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
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250) */
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
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:242) */
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
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250) */
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
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250) */
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
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
    
    @Test(expected = StackOverflowError.class)
    public void testCreateJsDocInfoParser1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        AstRoot parent = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        ErrorNode parent2 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        parent2.setParent(parent1);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
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
        AstRoot parent = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        ErrorNode parent2 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        IfStatement parent3 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent2.setParent(parent3);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250) */
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
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        comment.setPosition(2);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent.setPosition(-2);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
        String sourceString = "\n\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        comment.setPosition(Integer.MIN_VALUE);
        AstRoot parent = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        parent.setPosition(Integer.MIN_VALUE);
        comment.setParent(parent);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
        String sourceString = "";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        XmlLiteral parent = ((XmlLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral"));
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252) */
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
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Comment parent = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        ErrorNode parent2 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        IfStatement parent3 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent3.setLineno(-1);
        parent2.setParent(parent3);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        comment.setParent(parent);
        comment.setLineno(-1);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250) */
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
            com.google.javascript.jscomp.parsing.IRFactory.transformTree(IRFactory.java:128) */
        IRFactory.transformTree(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method transformTree(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot, java.lang.String, com.google.javascript.jscomp.parsing.Config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter)
    
    @Test
    public void testTransformTree1() throws Exception  {
        AstRoot astRoot = ((AstRoot) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformTree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformTree(IRFactory.java:130) */
        IRFactory.transformTree(astRoot, null, null, null);
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 91);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Assignment (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 105);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 107);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 124);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:190)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:192)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:259)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:277)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:231)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:279)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:245)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement (com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement and com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labeledStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", labeledStatementType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = labeledStatement;
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 44);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:255)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 48);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:251)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:233)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node irNode = transform(node);
 *  */
    @Test
    public void testTransformBlock_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:206)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
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
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 119);
        
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
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
    public void testTransformBlock_ThrowIllegalStateException_2() throws Throwable  {
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
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 129);
        
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
    
    ///region OTHER: ERROR SUITE for method transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    /// Actual number of generated tests (130) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testTransformBlock1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Label (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:239)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:241)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:253)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:229)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:235)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTransformBlock7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:263)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 118);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:196)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.Yield cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Name (com.google.javascript.jscomp.mozilla.rhino.ast.Yield and com.google.javascript.jscomp.mozilla.rhino.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:243)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        KeywordLiteral keywordLiteral = ((KeywordLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral"));
        setField(keywordLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 44);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:758)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1256)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processKeywordLiteral(IRFactory.java:594)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processKeywordLiteral(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class keywordLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", keywordLiteralType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = keywordLiteral;
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
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 97);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:341)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", assignmentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = assignment;
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
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 12);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 9);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 98);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:341)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", assignmentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = assignment;
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
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 13);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
        UnaryExpression unaryExpression = ((UnaryExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression"));
        setField(unaryExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 28);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:819)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processUnaryExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class unaryExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    public void testTransformBlock19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 96);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:341)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", assignmentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = assignment;
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
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 99);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:341)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processAssignment(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", assignmentType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = assignment;
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
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 17);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 11);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 143);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 56);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 139);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        EmptyExpression emptyExpression = ((EmptyExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression"));
        setField(emptyExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:758)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1256)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processEmptyExpression(IRFactory.java:467)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processEmptyExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class emptyExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", emptyExpressionType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = emptyExpression;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 34);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 151);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 145);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 153);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 84);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 62);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 138);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 51);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        ContinueStatement continueStatement = ((ContinueStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement"));
        setField(continueStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:758)
            com.google.javascript.jscomp.parsing.IRFactory.newNode(IRFactory.java:1256)
            com.google.javascript.jscomp.parsing.IRFactory.access$200(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processContinueStatement(IRFactory.java:439)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processContinueStatement(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class continueStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", continueStatementType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = continueStatement;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 57);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 70);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 132);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 71);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 127);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 77);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 35);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 68);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 142);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 5);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 37);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 158);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 6);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:896)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processIllegalToken(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:281)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
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
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        InfixExpression infixExpression = ((InfixExpression) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression"));
        setField(infixExpression, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 22);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.access$300(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:579)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processInfixExpression(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class infixExpressionType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
        Label label = ((Label) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Label"));
        String name = "";
        label.setName(name);
        setField(label, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.transformBlock] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.clonePropsFrom(Node.java:758)
            com.google.javascript.jscomp.parsing.IRFactory.newStringNode(IRFactory.java:1276)
            com.google.javascript.jscomp.parsing.IRFactory.access$1200(IRFactory.java:77)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processLabel(IRFactory.java:599)
            com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher.processLabel(IRFactory.java:277)
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:239)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274)
            com.google.javascript.jscomp.parsing.IRFactory.transform(IRFactory.java:207)
            com.google.javascript.jscomp.parsing.IRFactory.transformBlock(IRFactory.java:160) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labelType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", labelType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = label;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock51() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 134);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformBlock52() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Name name = ((Name) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Name"));
        setField(name, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class nameType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
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
    
    @Test(expected = IllegalStateException.class)
    public void testTransformBlock53() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 73);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", yieldType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = yield;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTransformBlock54() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        IRFactory this$0 = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ErrorCollector errorReporter = ((ErrorCollector) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector"));
        setField(this$0, "com.google.javascript.jscomp.parsing.IRFactory", "errorReporter", errorReporter);
        setField(transformDispatcher, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", "this$0", this$0);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        ArrayLiteral arrayLiteral = ((ArrayLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral"));
        arrayLiteral.setIsDestructuring(true);
        setField(arrayLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        arrayLiteral.setLineno(-1);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class arrayLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method transformBlockMethod = iRFactoryClazz.getDeclaredMethod("transformBlock", arrayLiteralType);
        transformBlockMethod.setAccessible(true);
        java.lang.Object[] transformBlockMethodArguments = new java.lang.Object[1];
        transformBlockMethodArguments[0] = arrayLiteral;
        try {
            transformBlockMethod.invoke(iRFactory, transformBlockMethodArguments);
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
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
            com.google.javascript.jscomp.parsing.IRFactory.newNumberNode(IRFactory.java:1280) */
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
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264) */
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
        IfStatement ifStatement = new IfStatement(0, 0);
        
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", ifStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ifStatement;
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Comment ([B is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.mozilla.rhino.ast.Comment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.mozilla.rhino.Node.getJsDocNode(Node.java:227)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:194) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", ifStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ifStatement;
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
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:194) */
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
 * @utbot.invokes com.google.javascript.jscomp.parsing.IRFactory#createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
 *  */
    @Test
    public void testHandleJsDoc_ThrowNullPointerException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "\u0000\u0000\u0000";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.position2charno(IRFactory.java:264)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", ifStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ifStatement;
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", ifStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ifStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleJsDoc2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        ErrorNode parent1 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        parent1.setParent(parent);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
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
    
    @Test
    public void testHandleJsDoc3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        String value = "";
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", value);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.StringIndexOutOfBoundsException: begin 3, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ExpressionStatement expressionStatement = ((ExpressionStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        ErrorNode parent = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent1.setLineno(-2147483616);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(expressionStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class expressionStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", expressionStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = expressionStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        CatchClause parent = ((CatchClause) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause"));
        parent.setLineno(56);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Assignment assignment = ((Assignment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Assignment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Block parent = ((Block) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Block"));
        IfStatement parent1 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        ErrorNode parent2 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        IfStatement parent3 = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent2.setParent(parent3);
        parent2.setLineno(-1);
        parent1.setParent(parent2);
        parent1.setLineno(-1);
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(assignment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
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
    public void testHandleJsDoc9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        ArrayLiteral arrayLiteral = ((ArrayLiteral) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(arrayLiteral, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class arrayLiteralType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", arrayLiteralType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = arrayLiteral;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
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
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        objectValue.setLineno(-1);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc12() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        ErrorNode parent = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        CatchClause parent1 = ((CatchClause) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause"));
        parent.setParent(parent1);
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", ifStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ifStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        objectValue.setLineno(-1);
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class ifStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", ifStatementType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = ifStatement;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJsDoc14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        ArrayComprehension parent = ((ArrayComprehension) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehension"));
        parent.setLineno(-1);
        objectValue.setParent(parent);
        objectValue.setLineno(-1);
        setField(next2, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next2);
        setField(next, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", next);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:250)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
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
    
    @Test
    public void testHandleJsDoc15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceName", sourceString);
        Config config = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "config", config);
        Comment comment = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        objectValue.setPosition(1);
        objectValue.setLineno(-1);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(comment, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser.addWarning(JsDocInfoParser.java:61)
            com.google.javascript.jscomp.parsing.JsDocInfoParser.parse(JsDocInfoParser.java:861)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:259)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
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
    
    @Test
    public void testHandleJsDoc16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        String sourceString = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "sourceString", sourceString);
        com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode functionNode = ((com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(objectValue, "com.google.javascript.jscomp.mozilla.rhino.ast.Comment", "value", sourceString);
        objectValue.setPosition(-2147483615);
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        parent.setPosition(Integer.MIN_VALUE);
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.JsDocInfoParser.<init>(JsDocInfoParser.java:110)
            com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(IRFactory.java:252)
            com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(IRFactory.java:196) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class functionNodeType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", functionNodeType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = functionNode;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode)
    
    @Test(timeout = 1000L)
    public void testHandleJsDoc17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Yield yield = ((Yield) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Yield"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "next", propListHead);
        setField(yield, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class yieldType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", yieldType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = yield;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testHandleJsDoc18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        VariableDeclaration variableDeclaration = ((VariableDeclaration) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration"));
        Object propListHead = createInstance("com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "type", 24);
        Comment objectValue = ((Comment) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        IfStatement parent = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        ErrorNode parent1 = ((ErrorNode) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode"));
        parent1.setParent(parent);
        parent.setParent(parent1);
        objectValue.setParent(parent);
        setField(propListHead, "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(variableDeclaration, "com.google.javascript.jscomp.mozilla.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class variableDeclarationType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method handleJsDocMethod = iRFactoryClazz.getDeclaredMethod("handleJsDoc", variableDeclarationType);
        handleJsDocMethod.setAccessible(true);
        java.lang.Object[] handleJsDocMethodArguments = new java.lang.Object[1];
        handleJsDocMethodArguments[0] = variableDeclaration;
        try {
            handleJsDocMethod.invoke(iRFactory, handleJsDocMethodArguments);
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 24);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:144)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_1() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 40);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:247)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 31);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:169)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 116);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:187)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_4() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 92);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Assignment (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Assignment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:159)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_5() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 117);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:277)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_6() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 87);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:241)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_7() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 48);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:251)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_8() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 39);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Name (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:243)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_9() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 65);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:146)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_10() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 109);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:229)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_11() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        LabeledStatement labeledStatement = ((LabeledStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement"));
        setField(labeledStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 112);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement (com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement and com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:237)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
        Class iRFactoryClazz = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class labeledStatementType = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Method justTransformMethod = iRFactoryClazz.getDeclaredMethod("justTransform", labeledStatementType);
        justTransformMethod.setAccessible(true);
        java.lang.Object[] justTransformMethodArguments = new java.lang.Object[1];
        justTransformMethodArguments[0] = labeledStatement;
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 136);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:255)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_13() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 102);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:235)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_14() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 125);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:190)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_15() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 160);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:216)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_16() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 81);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:263)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_17() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 33);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:233)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_18() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 130);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.Label (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.Label are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:239)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_19() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 103);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:192)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_20() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 123);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:279)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_21() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 120);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:182)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_22() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 38);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:184)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_23() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 36);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:231)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_24() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 50);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:261)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_25() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 41);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:257)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_26() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 121);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:194)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_27() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 4);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:253)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_28() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 114);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:259)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_29() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 118);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:196)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_30() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 30);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:245)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_31() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 128);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:198)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowClassCastException_32() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 66);
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement cannot be cast to class com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral (com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement and com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7316cc24)]
            com.google.javascript.jscomp.parsing.TypeSafeDispatcher.process(TypeSafeDispatcher.java:249)
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return transformDispatcher.process(node);
 *  */
    @Test
    public void testJustTransform_ThrowNullPointerException() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        
        /* This test fails because method [com.google.javascript.jscomp.parsing.IRFactory.justTransform] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.parsing.IRFactory.justTransform(IRFactory.java:274) */
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
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 119);
        
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
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 129);
        
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
    public void testJustTransform_ThrowIllegalStateException_2() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 122);
        
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
    public void testJustTransform_ThrowIllegalStateException_3() throws Throwable  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        Object transformDispatcher = createInstance("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
        setField(iRFactory, "com.google.javascript.jscomp.parsing.IRFactory", "transformDispatcher", transformDispatcher);
        IfStatement ifStatement = ((IfStatement) createInstance("com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement"));
        setField(ifStatement, "com.google.javascript.jscomp.mozilla.rhino.Node", "type", 154);
        
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
    public void testNewStringNode_NodeClonePropsFrom() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
    public void testNewStringNode_ThrowIllegalArgumentException() throws Throwable  {
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
    public void testNewStringNode_NodeClonePropsFrom1() throws Exception  {
        IRFactory iRFactory = ((IRFactory) createInstance("com.google.javascript.jscomp.parsing.IRFactory"));
        FunctionNode templateNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
    public void testNewStringNode_ThrowIllegalArgumentException1() throws Throwable  {
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
        
                java.lang.reflect.Method methodForGetDeclaredFields898730629747500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields898730629747500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass898730629753300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields898730629747500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass898730629753300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields898730630384400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields898730630384400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass898730630392400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields898730630384400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass898730630392400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.ArrayList;
import com.google.javascript.jscomp.CodingConventions.Proxy;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.collect.ImmutableSetMultimap;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_RemoveUnusedVarsTest {
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:141) */
        removeUnusedVars.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:85)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:149) */
        removeUnusedVars.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (modifyCallSites): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: process(externs, root, defFinder);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:85)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:149) */
        removeUnusedVars.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:141) */
        removeUnusedVars.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.process
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.executesCondition {@code (modifyCallSites): False}
 * @utbot.invokes com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: traverseAndRemoveUnusedReferences(root);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", nodeType, nodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.executesCondition {@code (modifyCallSites): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(defFinder);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "modifyCallSites", true);
        
        removeUnusedVars.process(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseAndRemoveUnusedReferences(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_11() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:85)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        removeUnusedVars.process(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseAndRemoveUnusedReferences(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_31() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:94)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", nodeType, nodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseAndRemoveUnusedReferences(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_21() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:95)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", nodeType, nodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testProcess1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", numberNodeType, numberNodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode1;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testProcess3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    @Test
    public void testProcess4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(111);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns(RemoveUnusedVars.java:729)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:176)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", numberNodeType, numberNodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode1;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:236)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:131)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:117)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", numberNodeType, numberNodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode1;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:178)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", nodeType, nodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    @Test(timeout = 1000L)
    public void testProcess7() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class simpleDefinitionFinderType = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType, simpleDefinitionFinderType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[3];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethodArguments[2] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:335) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = ((Object) null);
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(body.getNext() == null && body.isBlock());
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:339) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:100)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:343) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = new Node(0);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.isFunction());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(body.getNext() == null && body.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", next1);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(body.getNext() == null && body.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", last);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next1);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next1);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_7() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(-255);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException_8() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(83);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTraverseFunction_ThrowIllegalArgumentException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", node);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testTraverseFunction1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(83);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:236)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:109)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:343) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseFunction2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(83);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:347) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseFunction3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(timeout = 1000L)
    public void testTraverseFunction6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", nodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = node;
        traverseFunctionMethodArguments[1] = ((Object) null);
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.traverseNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(type) case: default}
 *  */
    @Test
    public void testTraverseNode_NodeGetType() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:193) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", nodeType, nodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = ((Object) null);
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(type) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codingConvention.getClassesDefinedByCall(n)
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:237) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var = scope.getVar(n.getString());
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:262) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", stringNodeType, stringNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = stringNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.activatesSwitch {@code switch(type) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverseNode(c, n, scope);
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:262)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:303) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var = scope.getVar(n.getFirstChild().getString());
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(126);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:200) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", nodeType, nodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = node;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var = scope.getVar(n.getFirstChild().getString());
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(126);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:200) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(type) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: var = scope.getVar(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseNode_ThrowUnsupportedOperationException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: NodeUtil.isFunctionDeclaration(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseNode_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): False}
 * @utbot.executesCondition {@code (var != null): False}
 * @utbot.invokes com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: traverseFunction(n, scope);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseNode_ThrowIllegalStateException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", stringNodeType, stringNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = stringNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testTraverseNode1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseNode2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = scope;
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseNode3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", codingConvention);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", numberNodeType, numberNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = numberNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseNode4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", stringNodeType, stringNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = stringNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRemovableVar(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): True}
 * @utbot.executesCondition {@code (var.isGlobal()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#isGlobal()}
 *  */
    @Test
    public void testIsRemovableVar_VarIsGlobal() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varClazz);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = var;
        boolean actual = ((Boolean) isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isRemovableVar(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#isGlobal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !removeGlobals && var.isGlobal()
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:309) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varType);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = ((Object) null);
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: referenced.contains(var)
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:314) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varType);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = ((Object) null);
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): False}
 * @utbot.executesCondition {@code (referenced.contains(var)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isExported(var.getName())
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:319) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varType);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = ((Object) null);
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): False}
 * @utbot.executesCondition {@code (referenced.contains(var)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        referenced.add(arguments);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        Scope.Arguments arguments1 = new Scope.Arguments(scope);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:319) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class arguments1Type = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", arguments1Type);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = arguments1;
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): True}
 * @utbot.executesCondition {@code (var.isGlobal()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#isGlobal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: referenced.contains(var)
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:314) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varClazz);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = var;
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): False}
 * @utbot.executesCondition {@code (referenced.contains(var)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isExported(var.getName())
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        String string = "";
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = string;
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:319) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varClazz);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = var;
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#isRemovableVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (!removeGlobals): False}
 * @utbot.executesCondition {@code (referenced.contains(var)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        referenced.add(arguments);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:303)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            java.base/java.util.HashSet.contains(HashSet.java:205)
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:314) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", varClazz);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = var;
        try {
            isRemovableVarMethod.invoke(removeUnusedVars, isRemovableVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAllAssigns(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link com.google.common.collect.Multimap#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.util.Iterator#hasNext()}
 *  */
    @Test
    public void testRemoveAllAssigns_CollectionIterator() throws Exception  {
        Class iteratorsClazz = Class.forName("com.google.common.collect.Iterators");
        UnmodifiableListIterator prevEMPTY_LIST_ITERATOR = ((UnmodifiableListIterator) getStaticFieldValue(iteratorsClazz, "EMPTY_LIST_ITERATOR"));
        try {
            UnmodifiableListIterator emptyListIterator = ((UnmodifiableListIterator) createInstance("com.google.common.collect.Iterators$1"));
            setStaticField(iteratorsClazz, "EMPTY_LIST_ITERATOR", emptyListIterator);
            RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
            ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
            Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
            Object elements = createInstance("com.google.common.collect.EmptyImmutableList");
            setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
            setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
            Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
            setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
            setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
            
            Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
            Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
            Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
            removeAllAssignsMethod.setAccessible(true);
            java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
            removeAllAssignsMethodArguments[0] = ((Object) null);
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } finally {
            setStaticField(com.google.common.collect.Iterators.class, "EMPTY_LIST_ITERATOR", prevEMPTY_LIST_ITERATOR);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAllAssigns(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test
    public void testRemoveAllAssigns_ThrowClassCastException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        byte[] element = {};
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.jscomp.RemoveUnusedVars$Assign ([B is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.RemoveUnusedVars$Assign is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @538862bb)]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:776) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test
    public void testRemoveAllAssigns_ThrowClassCastException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        short[] element = {};
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.jscomp.RemoveUnusedVars$Assign ([S is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.RemoveUnusedVars$Assign is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @538862bb)]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:776) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test
    public void testRemoveAllAssigns_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:776) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assign.remove();
 *  */
    @Test
    public void testRemoveAllAssigns_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:777) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testRemoveAllAssigns_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        assignNode.setType(130);
        setField(assignNode, "com.google.javascript.rhino.Node", "first", assignNode);
        setField(assignNode, "com.google.javascript.rhino.Node", "last", assignNode);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", assignNode);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:778) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testRemoveAllAssigns_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(130);
        setField(next, "com.google.javascript.rhino.Node", "parent", assignNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(assignNode, "com.google.javascript.rhino.Node", "first", first);
        setField(assignNode, "com.google.javascript.rhino.Node", "last", first);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", next);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:778) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAllAssigns(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: assign.remove();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRemoveAllAssigns_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(assignNode, "com.google.javascript.rhino.Node", "last", assignNode);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "mayHaveSecondarySideEffects", true);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: assign.remove();
 *  */
    @Test(expected = RuntimeException.class)
    public void testRemoveAllAssigns_ThrowRuntimeException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(assignNode, "com.google.javascript.rhino.Node", "first", assignNode);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(130);
        setField(parent, "com.google.javascript.rhino.Node", "parent", assignNode);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: assign.remove();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRemoveAllAssigns_ThrowIllegalStateException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(assignNode, "com.google.javascript.rhino.Node", "last", last);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", last);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.RuntimeException} 
 *  */
    @Test(expected = RuntimeException.class)
    public void testRemoveAllAssigns_ThrowRuntimeException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", assignNode);
        setField(assignNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "parent", assignNode);
        setField(assignNode, "com.google.javascript.rhino.Node", "last", last);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "mayHaveSecondarySideEffects", true);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method interpretAssigns()
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.executesCondition {@code (changes): True}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 *  */
    @Test
    public void testInterpretAssigns_Changes() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method interpretAssigns()
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int current = 0; current < maybeUnreferenced.size(); current++)
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns(RemoveUnusedVars.java:729) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: var.getParentNode().isVar() && !NodeUtil.isForIn(var.getParentNode().getParent())
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException] */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: var.getParentNode().isVar() && !NodeUtil.isForIn(var.getParentNode().getParent())
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException] */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: var.getParentNode().isVar() && !NodeUtil.isForIn(var.getParentNode().getParent())
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException] */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException] */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: var.getParentNode().isVar() && !NodeUtil.isForIn(var.getParentNode().getParent())
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        referenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException] */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: var.getParentNode().isVar() && !NodeUtil.isForIn(var.getParentNode().getParent())
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_7() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        referenced.add(arguments);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException] */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#interpretAssigns()}
 * @utbot.iterates iterate the loop {@code for(int current = 0; current < maybeUnreferenced.size(); current++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: referenced.contains(var)
 *  */
    @Test
    public void testInterpretAssigns_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns(RemoveUnusedVars.java:731) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method interpretAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("interpretAssigns");
        interpretAssignsMethod.setAccessible(true);
        java.lang.Object[] interpretAssignsMethodArguments = new java.lang.Object[0];
        try {
            interpretAssignsMethod.invoke(removeUnusedVars, interpretAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method markReferencedVar(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#markReferencedVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link java.util.Set#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: referenced.add(var)
 *  */
    @Test
    public void testMarkReferencedVar_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:788) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method markReferencedVarMethod = removeUnusedVarsClazz.getDeclaredMethod("markReferencedVar", varType);
        markReferencedVarMethod.setAccessible(true);
        java.lang.Object[] markReferencedVarMethodArguments = new java.lang.Object[1];
        markReferencedVarMethodArguments[0] = ((Object) null);
        try {
            markReferencedVarMethod.invoke(removeUnusedVars, markReferencedVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#markReferencedVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (referenced.add(var)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Continuation c: continuations.get(var))
 *  */
    @Test
    public void testMarkReferencedVar_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        referenced.add(arguments);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:789) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method markReferencedVarMethod = removeUnusedVarsClazz.getDeclaredMethod("markReferencedVar", varType);
        markReferencedVarMethod.setAccessible(true);
        java.lang.Object[] markReferencedVarMethodArguments = new java.lang.Object[1];
        markReferencedVarMethodArguments[0] = ((Object) null);
        try {
            markReferencedVarMethod.invoke(removeUnusedVars, markReferencedVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#markReferencedVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (referenced.add(var)): False}
 * @utbot.returnsFrom {@code return false;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testMarkReferencedVar_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        referenced.add(arguments);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        Scope.Arguments arguments1 = new Scope.Arguments(scope);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:789) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class arguments1Type = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method markReferencedVarMethod = removeUnusedVarsClazz.getDeclaredMethod("markReferencedVar", arguments1Type);
        markReferencedVarMethod.setAccessible(true);
        java.lang.Object[] markReferencedVarMethodArguments = new java.lang.Object[1];
        markReferencedVarMethodArguments[0] = arguments1;
        try {
            markReferencedVarMethod.invoke(removeUnusedVars, markReferencedVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#markReferencedVar(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (referenced.add(var)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Continuation c: continuations.get(var))
 *  */
    @Test
    public void testMarkReferencedVar_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:303)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            java.base/java.util.HashSet.add(HashSet.java:221)
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:788) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method markReferencedVarMethod = removeUnusedVarsClazz.getDeclaredMethod("markReferencedVar", varClazz);
        markReferencedVarMethod.setAccessible(true);
        java.lang.Object[] markReferencedVarMethodArguments = new java.lang.Object[1];
        markReferencedVarMethodArguments[0] = var;
        try {
            markReferencedVarMethod.invoke(removeUnusedVars, markReferencedVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionArgList(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#getFunctionArgList(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return function.getFirstChild().getNext();}
 *  */
    @Test
    public void testGetFunctionArgList_NodeGetNext() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionArgListMethod = removeUnusedVarsClazz.getDeclaredMethod("getFunctionArgList", numberNodeType);
        getFunctionArgListMethod.setAccessible(true);
        java.lang.Object[] getFunctionArgListMethodArguments = new java.lang.Object[1];
        getFunctionArgListMethodArguments[0] = numberNode;
        Node actual = ((Node) getFunctionArgListMethod.invoke(null, getFunctionArgListMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFunctionArgList(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#getFunctionArgList(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return function.getFirstChild().getNext();
 *  */
    @Test
    public void testGetFunctionArgList_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(RemoveUnusedVars.java:413) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionArgListMethod = removeUnusedVarsClazz.getDeclaredMethod("getFunctionArgList", nodeType);
        getFunctionArgListMethod.setAccessible(true);
        java.lang.Object[] getFunctionArgListMethodArguments = new java.lang.Object[1];
        getFunctionArgListMethodArguments[0] = ((Object) null);
        try {
            getFunctionArgListMethod.invoke(null, getFunctionArgListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#getFunctionArgList(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return function.getFirstChild().getNext();
 *  */
    @Test
    public void testGetFunctionArgList_ThrowNullPointerException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(RemoveUnusedVars.java:413) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionArgListMethod = removeUnusedVarsClazz.getDeclaredMethod("getFunctionArgList", numberNodeType);
        getFunctionArgListMethod.setAccessible(true);
        java.lang.Object[] getFunctionArgListMethodArguments = new java.lang.Object[1];
        getFunctionArgListMethodArguments[0] = numberNode;
        try {
            getFunctionArgListMethod.invoke(null, getFunctionArgListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test
    public void testTraverseAndRemoveUnusedReferences_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:85)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", nodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = ((Object) null);
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test
    public void testTraverseAndRemoveUnusedReferences_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:94)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", numberNodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = numberNode;
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test
    public void testTraverseAndRemoveUnusedReferences_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:95)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", numberNodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = numberNode;
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseAndRemoveUnusedReferences_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", numberNodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = numberNode;
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseAndRemoveUnusedReferences_ThrowIllegalStateException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", numberNodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = numberNode;
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseAndRemoveUnusedReferences_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", numberNodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = numberNode;
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseAndRemoveUnusedReferences_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", numberNodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = numberNode;
        try {
            traverseAndRemoveUnusedReferencesMethod.invoke(removeUnusedVars, traverseAndRemoveUnusedReferencesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeUnreferencedVars()
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedVars()}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testRemoveUnreferencedVars() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedVars");
        removeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedVarsMethodArguments = new java.lang.Object[0];
        removeUnreferencedVarsMethod.invoke(removeUnusedVars, removeUnreferencedVarsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeUnreferencedVars()
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedVars()}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> it = maybeUnreferenced.iterator(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(Node exprCallNode: classDefiningCalls.get(var))
 *  */
    @Test
    public void testRemoveUnreferencedVars_ThrowClassCastException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap classDefiningCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        byte[] element = {};
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(classDefiningCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(classDefiningCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "classDefiningCalls", classDefiningCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.Node ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @538862bb)]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:809) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedVars");
        removeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedVarsMethodArguments = new java.lang.Object[0];
        try {
            removeUnreferencedVarsMethod.invoke(removeUnusedVars, removeUnreferencedVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedVars()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<Var> it = maybeUnreferenced.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testRemoveUnreferencedVars_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:804) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedVars");
        removeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedVarsMethodArguments = new java.lang.Object[0];
        try {
            removeUnreferencedVarsMethod.invoke(removeUnusedVars, removeUnreferencedVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedVars()}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> it = maybeUnreferenced.iterator(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node exprCallNode: classDefiningCalls.get(var))
 *  */
    @Test
    public void testRemoveUnreferencedVars_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:809) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedVars");
        removeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedVarsMethodArguments = new java.lang.Object[0];
        try {
            removeUnreferencedVarsMethod.invoke(removeUnusedVars, removeUnreferencedVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedVars()}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> it = maybeUnreferenced.iterator(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeUtil.removeChild(exprCallNode.getParent(), exprCallNode);
 *  */
    @Test
    public void testRemoveUnreferencedVars_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap classDefiningCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(classDefiningCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.EmptyImmutableMap");
        setField(classDefiningCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "classDefiningCalls", classDefiningCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:810) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedVars");
        removeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedVarsMethodArguments = new java.lang.Object[0];
        try {
            removeUnreferencedVarsMethod.invoke(removeUnusedVars, removeUnreferencedVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedVars()}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> it = maybeUnreferenced.iterator(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeUtil.removeChild(exprCallNode.getParent(), exprCallNode);
 *  */
    @Test
    public void testRemoveUnreferencedVars_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap classDefiningCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(classDefiningCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(classDefiningCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "classDefiningCalls", classDefiningCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:810) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedVars");
        removeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedVarsMethodArguments = new java.lang.Object[0];
        try {
            removeUnreferencedVarsMethod.invoke(removeUnusedVars, removeUnreferencedVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_NodeUtilIsGetOrSetKey() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(147);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.executesCondition {@code (!modifyCallers): True}
 * @utbot.invokes com.google.javascript.jscomp.RemoveUnusedVars#getFunctionArgList(com.google.javascript.rhino.Node)
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_EqualsNull() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getRootNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node function = fnScope.getRootNode();
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:380) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = ((Object) null);
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(function.isFunction());
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:382) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node argList = getFunctionArgList(function);
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(RemoveUnusedVars.java:413)
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:388) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.executesCondition {@code (!modifyCallers): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((lastArg = argList.getLastChild()) != null)
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:394) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer#canModifyCallers(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: callSiteOptimizer.canModifyCallers(function)
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "modifyCallSites", true);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:390) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.executesCondition {@code (!modifyCallers): True}
 * @utbot.iterates iterate the loop {@code while((lastArg = argList.getLastChild()) != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !referenced.contains(var)
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_ThrowNullPointerException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        rootNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:396) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(function.isFunction());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRemoveUnreferencedFunctionArgs_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) rootNode)).setType(-255);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.executesCondition {@code (!modifyCallers): True}
 * @utbot.iterates iterate the loop {@code while((lastArg = argList.getLastChild()) != null)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Var var = fnScope.getVar(lastArg.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRemoveUnreferencedFunctionArgs_ThrowIllegalStateException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): False}
 * @utbot.executesCondition {@code (!modifyCallers): True}
 * @utbot.iterates iterate the loop {@code while((lastArg = argList.getLastChild()) != null)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Var var = fnScope.getVar(lastArg.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRemoveUnreferencedFunctionArgs_ThrowIllegalStateException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) rootNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeType);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        try {
            removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVars()}
 *  */
    @Test
    public void testCollectMaybeUnreferencedVars() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method collectMaybeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("collectMaybeUnreferencedVars", scopeType);
        collectMaybeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] collectMaybeUnreferencedVarsMethodArguments = new java.lang.Object[1];
        collectMaybeUnreferencedVarsMethodArguments[0] = scope;
        collectMaybeUnreferencedVarsMethod.invoke(removeUnusedVars, collectMaybeUnreferencedVarsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVars()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<Var> it = scope.getVars(); it.hasNext(); )
 *  */
    @Test
    public void testCollectMaybeUnreferencedVars_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars(RemoveUnusedVars.java:355) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method collectMaybeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("collectMaybeUnreferencedVars", scopeType);
        collectMaybeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] collectMaybeUnreferencedVarsMethodArguments = new java.lang.Object[1];
        collectMaybeUnreferencedVarsMethodArguments[0] = ((Object) null);
        try {
            collectMaybeUnreferencedVarsMethod.invoke(removeUnusedVars, collectMaybeUnreferencedVarsMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields879552791198900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields879552791198900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass879552791206200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879552791198900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879552791206200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields879552791557900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields879552791557900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass879552791560400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879552791557900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879552791560400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields879552792183000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields879552792183000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass879552792186400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879552792183000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879552792186400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


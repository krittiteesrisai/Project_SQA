package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.util.ArrayList;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.Scope.Arguments;
import java.lang.reflect.Constructor;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.CodingConventions.Proxy;
import com.google.common.collect.ImmutableListMultimap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_RemoveUnusedVarsTest {
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.process
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.executesCondition {@code (modifyCallSites): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(defFinder);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "modifyCallSites", true);
        
        removeUnusedVars.process(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.executesCondition {@code (modifyCallSites): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: traverseAndRemoveUnusedReferences(root);
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        removeUnusedVars.process(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.SimpleDefinitionFinder)}
 * @utbot.executesCondition {@code (modifyCallSites): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: traverseAndRemoveUnusedReferences(root);
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "modifyCallSites", true);
        Object callSiteOptimizer = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$CallSiteOptimizer");
        setField(callSiteOptimizer, "com.google.javascript.jscomp.RemoveUnusedVars$CallSiteOptimizer", "compiler", compiler);
        SimpleDefinitionFinder defFinder = ((SimpleDefinitionFinder) createInstance("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        setField(callSiteOptimizer, "com.google.javascript.jscomp.RemoveUnusedVars$CallSiteOptimizer", "defFinder", defFinder);
        ArrayList toRemove = new ArrayList();
        setField(callSiteOptimizer, "com.google.javascript.jscomp.RemoveUnusedVars$CallSiteOptimizer", "toRemove", toRemove);
        ArrayList toReplaceWithZero = new ArrayList();
        setField(callSiteOptimizer, "com.google.javascript.jscomp.RemoveUnusedVars$CallSiteOptimizer", "toReplaceWithZero", toReplaceWithZero);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "callSiteOptimizer", callSiteOptimizer);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159) */
        removeUnusedVars.process(null, null, defFinder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (modifyCallSites): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:149) */
        removeUnusedVars.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (modifyCallSites): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testProcess_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
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
    public void testProcess_ThrowNullPointerException1() throws Exception  {
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
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:141) */
        removeUnusedVars.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage#isNormalized()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        removeUnusedVars.process(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "modifyCallSites", true);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getTypeRegistry(Compiler.java:1058)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:149) */
        removeUnusedVars.process(node, node);
    }
    
    @Test
    public void testProcess2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:85)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:169)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:159)
            com.google.javascript.jscomp.RemoveUnusedVars.process(RemoveUnusedVars.java:149) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = removeUnusedVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(removeUnusedVars, processMethodArguments);
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
 * @utbot.invokes {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
 *  */
    @Test
    public void testTraverseAndRemoveUnusedReferences_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)
    
    @Test
    public void testTraverseAndRemoveUnusedReferences1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns(RemoveUnusedVars.java:712)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(RemoveUnusedVars.java:176) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseAndRemoveUnusedReferencesMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseAndRemoveUnusedReferences", nodeType);
        traverseAndRemoveUnusedReferencesMethod.setAccessible(true);
        java.lang.Object[] traverseAndRemoveUnusedReferencesMethodArguments = new java.lang.Object[1];
        traverseAndRemoveUnusedReferencesMethodArguments[0] = node;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<Var> it = maybeUnreferenced.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testRemoveUnreferencedVars_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:783) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node exprCallNode: inheritsCalls.get(var))
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
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:788) */
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
    
    ///region OTHER: ERROR SUITE for method removeUnreferencedVars()
    
    @Test
    public void testRemoveUnreferencedVars1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap inheritsCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", 40);
        java.lang.Object[] array = new java.lang.Object[40];
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:789) */
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
    
    @Test
    public void testRemoveUnreferencedVars2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        maybeUnreferenced.add(var);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap inheritsCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:755)
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:796) */
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
    
    @Test
    public void testRemoveUnreferencedVars3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        maybeUnreferenced.add(var);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        Object inheritsCalls = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars(RemoveUnusedVars.java:789) */
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeUnreferencedVars()
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveUnreferencedVars4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap inheritsCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "offset", 58752978);
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", 1077903407);
        java.lang.Object[] array = {};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveUnreferencedVars5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        ImmutableSetMultimap inheritsCalls = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", Integer.MIN_VALUE);
        java.lang.Object[] array = {null, null, null, null, null, null, null, null, null};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
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
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveUnreferencedVars6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        maybeUnreferenced.add(var);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        Object inheritsCalls = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "offset", Integer.MIN_VALUE);
        java.lang.Object[] array = {null, null, null, null, null, null, null, null, null};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
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
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveUnreferencedVars7() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        maybeUnreferenced.add(var);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        Object inheritsCalls = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "offset", 10518482);
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", 1074757679);
        java.lang.Object[] array = {};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveUnreferencedVars8() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        maybeUnreferenced.add(arguments);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        Object inheritsCalls = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", Integer.MIN_VALUE);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
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
    
    ///region OTHER: TIMEOUTS for method removeUnreferencedVars()
    
    @Test(timeout = 1000L)
    public void testRemoveUnreferencedVars9() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ArrayList maybeUnreferenced = new ArrayList();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        maybeUnreferenced.add(var);
        maybeUnreferenced.add(null);
        maybeUnreferenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "maybeUnreferenced", maybeUnreferenced);
        Object inheritsCalls = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "offset", 1819410387);
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", 696713261);
        java.lang.Object[] array = {null, null, null, null, null, null, null, null, null};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(inheritsCalls, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
        setField(inheritsCalls, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "inheritsCalls", inheritsCalls);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(147);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
        removeUnreferencedFunctionArgsMethod.setAccessible(true);
        java.lang.Object[] removeUnreferencedFunctionArgsMethodArguments = new java.lang.Object[1];
        removeUnreferencedFunctionArgsMethodArguments[0] = scope;
        removeUnreferencedFunctionArgsMethod.invoke(removeUnusedVars, removeUnreferencedFunctionArgsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isGetOrSetKey(function.getParent())): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveUnreferencedFunctionArgs_NodeUtilIsGetOrSetKey_1() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(148);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", first);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:363) */
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
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:365) */
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(RemoveUnusedVars.java:396)
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:371) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", first);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:377) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", first);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:373) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) rootNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(RemoveUnusedVars.java:379) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(numberNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = numberNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(stringNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = stringNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeUnreferencedFunctionArgsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeUnreferencedFunctionArgs", scopeClazz);
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
            com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars(RemoveUnusedVars.java:346) */
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
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> it = scope.getVars(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isRemovableVar(var)
 *  */
    @Test
    public void testCollectMaybeUnreferencedVars_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        vars.put(string, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:300)
            com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars(RemoveUnusedVars.java:348) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method collectMaybeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("collectMaybeUnreferencedVars", scopeType);
        collectMaybeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] collectMaybeUnreferencedVarsMethodArguments = new java.lang.Object[1];
        collectMaybeUnreferencedVarsMethodArguments[0] = scope;
        try {
            collectMaybeUnreferencedVarsMethod.invoke(removeUnusedVars, collectMaybeUnreferencedVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)}
 * @utbot.iterates iterate the loop {@code for(Iterator<Var> it = scope.getVars(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isRemovableVar(var)
 *  */
    @Test
    public void testCollectMaybeUnreferencedVars_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        vars.put(string, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:305)
            com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars(RemoveUnusedVars.java:348) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method collectMaybeUnreferencedVarsMethod = removeUnusedVarsClazz.getDeclaredMethod("collectMaybeUnreferencedVars", scopeType);
        collectMaybeUnreferencedVarsMethod.setAccessible(true);
        java.lang.Object[] collectMaybeUnreferencedVarsMethodArguments = new java.lang.Object[1];
        collectMaybeUnreferencedVarsMethodArguments[0] = scope;
        try {
            collectMaybeUnreferencedVarsMethod.invoke(removeUnusedVars, collectMaybeUnreferencedVarsMethodArguments);
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testTraverseFunction_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:334) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:326) */
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
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:330) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test
    public void testTraverseFunction_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:100)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:76)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(RemoveUnusedVars.java:334) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 3);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseFunction_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(-255);
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
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: new SyntacticScopeCreator(compiler).createScope(n, parentScope)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTraverseFunction_ThrowIllegalArgumentException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", next1);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(numberNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = numberNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeClazz);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
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
    public void testTraverseFunction_ThrowIllegalStateException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
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
    public void testTraverseFunction_ThrowIllegalStateException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseFunctionMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseFunction", numberNodeType, scopeType);
        traverseFunctionMethod.setAccessible(true);
        java.lang.Object[] traverseFunctionMethodArguments = new java.lang.Object[2];
        traverseFunctionMethodArguments[0] = numberNode;
        traverseFunctionMethodArguments[1] = scope;
        try {
            traverseFunctionMethod.invoke(removeUnusedVars, traverseFunctionMethodArguments);
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
            com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns(RemoveUnusedVars.java:712) */
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
            com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns(RemoveUnusedVars.java:714) */
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
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
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
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:300) */
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
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:305) */
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
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:310) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isExported(var.getName())
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        referenced.add(null);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        Scope.Arguments arguments = new Scope.Arguments(null);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:310) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class argumentsType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isRemovableVarMethod = removeUnusedVarsClazz.getDeclaredMethod("isRemovableVar", argumentsType);
        isRemovableVarMethod.setAccessible(true);
        java.lang.Object[] isRemovableVarMethodArguments = new java.lang.Object[1];
        isRemovableVarMethodArguments[0] = arguments;
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
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:305) */
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
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = string;
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:310) */
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
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:328)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            java.base/java.util.HashSet.contains(HashSet.java:205)
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:305) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isExported(var.getName())
 *  */
    @Test
    public void testIsRemovableVar_ThrowNullPointerException_7() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "removeGlobals", true);
        LinkedHashSet referenced = new LinkedHashSet();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        referenced.add(arguments);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "referenced", referenced);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, numberNodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = string;
        varConstructorArguments[2] = numberNode;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(RemoveUnusedVars.java:310) */
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
 *  */
    @Test
    public void testRemoveAllAssigns_CollectionIterator() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        java.lang.Object[] array = {};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varType);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = ((Object) null);
        removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
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
        int[] element = {};
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.jscomp.RemoveUnusedVars$Assign ([I is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.RemoveUnusedVars$Assign is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:755) */
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
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:755) */
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
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:756) */
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
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(130);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent1, "com.google.javascript.rhino.Node", "last", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:757) */
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
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(130);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent1, "com.google.javascript.rhino.Node", "last", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:757) */
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
    public void testRemoveAllAssigns_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(130);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent1, "com.google.javascript.rhino.Node", "last", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(assignNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(RemoveUnusedVars.java:757) */
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllAssigns_ThrowIndexOutOfBoundsException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "offset", 2147483584);
        java.lang.Object[] array = {null, null, null, null, null, null, null, null, null};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllAssigns_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object assignsByVar = createInstance("com.google.common.collect.EmptyImmutableSetMultimap");
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "offset", 1231357123);
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", 1545927485);
        java.lang.Object[] array = {null};
        setField(elements, "com.google.common.collect.RegularImmutableList", "array", array);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Integer singleKey = 0;
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: for(Assign assign: assignsByVar.get(var))
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAllAssigns_ThrowIllegalArgumentException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.RegularImmutableList");
        setField(elements, "com.google.common.collect.RegularImmutableList", "size", -1);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        Object map = createInstance("com.google.common.collect.SingletonImmutableMap");
        Character singleKey = '\u0000';
        setField(map, "com.google.common.collect.SingletonImmutableMap", "singleKey", singleKey);
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
    public void testRemoveAllAssigns_ThrowIllegalStateException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(assignNode, "com.google.javascript.rhino.Node", "last", last);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "mayHaveSecondarySideEffects", true);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
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
    public void testRemoveAllAssigns_ThrowRuntimeException() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableSetMultimap assignsByVar = ((ImmutableSetMultimap) createInstance("com.google.common.collect.ImmutableSetMultimap"));
        Object emptySet = createInstance("com.google.common.collect.RegularImmutableSortedSet");
        Object elements = createInstance("com.google.common.collect.SingletonImmutableList");
        Object element = createInstance("com.google.javascript.jscomp.RemoveUnusedVars$Assign");
        Node assignNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(last, "com.google.javascript.rhino.Node", "parent", parent);
        setField(assignNode, "com.google.javascript.rhino.Node", "last", last);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "assignNode", assignNode);
        setField(element, "com.google.javascript.jscomp.RemoveUnusedVars$Assign", "mayHaveSecondarySideEffects", true);
        setField(elements, "com.google.common.collect.SingletonImmutableList", "element", element);
        setField(emptySet, "com.google.common.collect.RegularImmutableSortedSet", "elements", elements);
        setField(assignsByVar, "com.google.common.collect.ImmutableSetMultimap", "emptySet", emptySet);
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
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
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testRemoveAllAssigns_ThrowNullPointerException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableListMultimap assignsByVar = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varClazz);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = var;
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#removeAllAssigns(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testRemoveAllAssigns_ThrowNullPointerException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ImmutableListMultimap assignsByVar = ((ImmutableListMultimap) createInstance("com.google.common.collect.ImmutableListMultimap"));
        ImmutableSortedMap map = ((ImmutableSortedMap) createInstance("com.google.common.collect.ImmutableSortedMap"));
        Object entries = createInstance("com.google.common.collect.ImmutableAsList");
        setField(map, "com.google.common.collect.ImmutableSortedMap", "entries", entries);
        setField(assignsByVar, "com.google.common.collect.ImmutableMultimap", "map", map);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "assignsByVar", assignsByVar);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Method removeAllAssignsMethod = removeUnusedVarsClazz.getDeclaredMethod("removeAllAssigns", varClazz);
        removeAllAssignsMethod.setAccessible(true);
        java.lang.Object[] removeAllAssignsMethodArguments = new java.lang.Object[1];
        removeAllAssignsMethodArguments[0] = var;
        try {
            removeAllAssignsMethod.invoke(removeUnusedVars, removeAllAssignsMethodArguments);
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
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:767) */
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
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:768) */
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
        Scope scope1 = new Scope(((Node) null), ((ObjectType) null));
        Scope.Arguments arguments1 = new Scope.Arguments(scope1);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:768) */
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
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:328)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            java.base/java.util.HashSet.add(HashSet.java:221)
            com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(RemoveUnusedVars.java:767) */
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
            com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(RemoveUnusedVars.java:396) */
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
            com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(RemoveUnusedVars.java:396) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.RemoveUnusedVars.traverseNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testTraverseNode() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", stringNodeType, stringNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = stringNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = ((Object) null);
        traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 *  */
    @Test
    public void testTraverseNode_RemoveUnusedVarsTraverseNode() throws Exception  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codingConvention.getClassesDefinedByCall(n)
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:235) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var = scope.getVar(n.getString());
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_4() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:253) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codingConvention.getClassesDefinedByCall(n)
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:139)
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:77)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:235) */
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
    public void testTraverseNode_ThrowNullPointerException_7() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:235)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:294) */
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var = scope.getVar(n.getFirstChild().getString());
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_8() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(126);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codingConvention.getClassesDefinedByCall(n)
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:140)
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:77)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:235) */
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var = scope.getVar(n.getFirstChild().getString());
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_9() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:200) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codingConvention.getClassesDefinedByCall(n)
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_10() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        ClosureCodingConvention nextConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.typeofClassDefiningName(ClosureCodingConvention.java:139)
            com.google.javascript.jscomp.ClosureCodingConvention.getClassesDefinedByCall(ClosureCodingConvention.java:77)
            com.google.javascript.jscomp.CodingConventions$Proxy.getClassesDefinedByCall(CodingConventions.java:101)
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:235) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.isVar()
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_5() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:254) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", stringNodeType, stringNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = stringNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = scope;
        try {
            traverseNodeMethod.invoke(removeUnusedVars, traverseNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.isVar()
 *  */
    @Test
    public void testTraverseNode_ThrowNullPointerException_6() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(null, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        /* This test fails because method [com.google.javascript.jscomp.RemoveUnusedVars.traverseNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(RemoveUnusedVars.java:254) */
        Class removeUnusedVarsClazz = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method traverseNodeMethod = removeUnusedVarsClazz.getDeclaredMethod("traverseNode", stringNodeType, stringNodeType, scopeType);
        traverseNodeMethod.setAccessible(true);
        java.lang.Object[] traverseNodeMethodArguments = new java.lang.Object[3];
        traverseNodeMethodArguments[0] = stringNode;
        traverseNodeMethodArguments[1] = ((Object) null);
        traverseNodeMethodArguments[2] = scope;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: var = scope.getVar(n.getFirstChild().getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseNode_ThrowIllegalStateException_1() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
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
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#getClassesDefinedByCall(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(type) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: codingConvention.getClassesDefinedByCall(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseNode_ThrowIllegalStateException_3() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.RemoveUnusedVars", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
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
    
    /**
    @utbot.classUnderTest {@link RemoveUnusedVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RemoveUnusedVars#traverseNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): False}
 * @utbot.executesCondition {@code (var != null): False}
 * @utbot.invokes com.google.javascript.jscomp.RemoveUnusedVars#traverseFunction(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: traverseFunction(n, scope);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseNode_ThrowIllegalStateException_2() throws Throwable  {
        RemoveUnusedVars removeUnusedVars = ((RemoveUnusedVars) createInstance("com.google.javascript.jscomp.RemoveUnusedVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields890267241701700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields890267241701700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass890267241712400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields890267241701700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass890267241712400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


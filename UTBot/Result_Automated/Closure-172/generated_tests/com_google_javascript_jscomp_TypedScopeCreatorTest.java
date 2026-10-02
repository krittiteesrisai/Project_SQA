package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_TypedScopeCreatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createInitialScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInitialScope(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:316) */
        typedScopeCreator.createInitialScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:316) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", stringNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = stringNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:316) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", stringNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = stringNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:316) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", stringNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = stringNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:316) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", stringNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = stringNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method patchGlobalScope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String scriptName = NodeUtil.getSourceName(scriptRoot);
 *  */
    @Test
    public void testPatchGlobalScope_ThrowClassCastException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1108)
            com.google.javascript.rhino.Node.getSourceFileName(Node.java:1102)
            com.google.javascript.jscomp.NodeUtil.getSourceName(NodeUtil.java:2905)
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:275) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(scriptRoot.isScript());
 *  */
    @Test
    public void testPatchGlobalScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:271) */
        typedScopeCreator.patchGlobalScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: ImmutableList.copyOf(functionAnalysisResults.keySet()))
 *  */
    @Test
    public void testPatchGlobalScope_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.OnDisk objectValue = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:277) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: ImmutableList.copyOf(functionAnalysisResults.keySet()))
 *  */
    @Test
    public void testPatchGlobalScope_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        String name = "";
        setField(objectValue, "com.google.javascript.rhino.jstype.SimpleSourceFile", "name", name);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:277) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method patchGlobalScope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(scriptRoot.isScript());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScope_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = ((Object) null);
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(globalScope.isGlobal());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScope_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String scriptName = NodeUtil.getSourceName(scriptRoot);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPatchGlobalScope_ThrowUnsupportedOperationException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(globalScope);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = ((Object) null);
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scriptName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scriptName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_5() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.OnDisk objectValue = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scriptName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_6() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: typeRegistry.getNativeObjectType(JSTypeNative.GLOBAL_THIS)
 *  */
    @Test
    public void testCreateScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:950)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:209) */
        typedScopeCreator.createScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getNativeObjectType(JSTypeNative.GLOBAL_THIS)
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:209) */
        typedScopeCreator.createScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localScopeBuilder.build();
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder.build(TypedScopeCreator.java:1956)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:231) */
        typedScopeCreator.createScope(null, scope);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localScopeBuilder.build();
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder.build(TypedScopeCreator.java:1956)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:231) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", stringNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = stringNode;
        createScopeMethodArguments[1] = scope;
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: newScope = new Scope(parent, root);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateScope_ThrowIllegalArgumentException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        typedScopeCreator.createScope(null, scope);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeRegistry.getNativeType(nativeType);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typedScopeCreator, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return typeRegistry.getNativeType(nativeType);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.URI_ERROR_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 36 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:407) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typedScopeCreator, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeRegistry.getNativeType(nativeType);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:407) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typedScopeCreator, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 *  */
    @Test
    public void testDeclareNativeType_ScopeDeclare() throws Exception  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = " ";
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        declareNativeTypeMethod.invoke(null, declareNativeTypeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test
    public void testDeclareNativeType_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:358) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = ((Object) null);
        declareNativeTypeMethodArguments[1] = ((Object) null);
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(null, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException() throws Throwable  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = ((Object) null);
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(null, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException_1() throws Throwable  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        String string = "";
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(null, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException_2() throws Throwable  {
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = " ";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(string, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(null, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testDeclareNativeTypeThrowsNPEWithNonEmptyString() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:358) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = ((Object) null);
        declareNativeTypeMethodArguments[1] = "X\u001FZ";
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(null, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.SYNTAX_ERROR_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:954)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:346) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowClassCastException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[0] = ((JSType) templateType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:954)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:346) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:347) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NumberType typeOfThis = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) errorFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:347) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) errorFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:358)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:347) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) anonymousFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:358)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:347) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:346) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = ((Object) null);
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) anonymousFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) anonymousFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testDeclareNativeFunctionType1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        String className = "";
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.declare(Scope.java:498)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:358)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:347) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeclareNativeFunctionType2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noResolvedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        nativeTypes[16] = ((JSType) enumElementType);
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        nativeTypes[26] = ((JSType) enumElementType);
        nativeTypes[27] = ((JSType) enumElementType);
        nativeTypes[28] = ((JSType) enumElementType);
        nativeTypes[29] = ((JSType) enumElementType);
        nativeTypes[30] = ((JSType) enumElementType);
        nativeTypes[31] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getInstanceType(FunctionType.java:1080)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:347) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[1];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[8];
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) functionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.U2U_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 48 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:354) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:358)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:354) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:354) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        String string = "";
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testDeclareNativeValueType1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "\u0000";
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "\u0000";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        String string1 = "";
        vars.put(string1, enumElementType);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionAnalysisResults(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getFunctionAnalysisResults(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFunctionAnalysisResults_NEqualsNull() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionAnalysisResultsMethod = typedScopeCreatorClazz.getDeclaredMethod("getFunctionAnalysisResults", nodeType);
        getFunctionAnalysisResultsMethod.setAccessible(true);
        java.lang.Object[] getFunctionAnalysisResultsMethodArguments = new java.lang.Object[1];
        getFunctionAnalysisResultsMethodArguments[0] = ((Object) null);
        FunctionTypeBuilder.AstFunctionContents actual = ((FunctionTypeBuilder.AstFunctionContents) getFunctionAnalysisResultsMethod.invoke(typedScopeCreator, getFunctionAnalysisResultsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getFunctionAnalysisResults(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return functionAnalysisResults.get(n);}
 *  */
    @Test
    public void testGetFunctionAnalysisResults_NNotEqualsNull() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        LinkedHashMap functionAnalysisResults = new LinkedHashMap();
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "functionAnalysisResults", functionAnalysisResults);
        Node node = new Node(0);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionAnalysisResultsMethod = typedScopeCreatorClazz.getDeclaredMethod("getFunctionAnalysisResults", nodeType);
        getFunctionAnalysisResultsMethod.setAccessible(true);
        java.lang.Object[] getFunctionAnalysisResultsMethodArguments = new java.lang.Object[1];
        getFunctionAnalysisResultsMethodArguments[0] = node;
        FunctionTypeBuilder.AstFunctionContents actual = ((FunctionTypeBuilder.AstFunctionContents) getFunctionAnalysisResultsMethod.invoke(typedScopeCreator, getFunctionAnalysisResultsMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFunctionAnalysisResults(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getFunctionAnalysisResults(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return functionAnalysisResults.get(n);
 *  */
    @Test
    public void testGetFunctionAnalysisResults_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(TypedScopeCreator.java:2162) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionAnalysisResultsMethod = typedScopeCreatorClazz.getDeclaredMethod("getFunctionAnalysisResults", stringNodeType);
        getFunctionAnalysisResultsMethod.setAccessible(true);
        java.lang.Object[] getFunctionAnalysisResultsMethodArguments = new java.lang.Object[1];
        getFunctionAnalysisResultsMethodArguments[0] = stringNode;
        try {
            getFunctionAnalysisResultsMethod.invoke(typedScopeCreator, getFunctionAnalysisResultsMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields919641930511400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields919641930511400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass919641930517900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields919641930511400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass919641930517900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields919641931502600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields919641931502600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass919641931506100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields919641931502600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass919641931506100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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


package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.lang.reflect.InvocationTargetException;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_RenamePrototypesTest {
    ///region Test suites for executable com.google.javascript.jscomp.RenamePrototypes.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.process(RenamePrototypes.java:204) */
        renamePrototypes.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage#isNormalized()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.process(RenamePrototypes.java:204) */
        renamePrototypes.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getLifeCycleStage()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage#isNormalized()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        
        renamePrototypes.process(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.process(RenamePrototypes.java:215) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", functionNodeType, functionNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = functionNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.process(RenamePrototypes.java:215) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess3() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.process(RenamePrototypes.java:215) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess4() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess5() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess6() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", functionNodeType, functionNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = functionNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess7() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess8() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        renamePrototypes.process(scriptOrFnNode, functionNode);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess9() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        renamePrototypes.process(scriptOrFnNode, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess10() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        renamePrototypes.process(node, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess11() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess12() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        renamePrototypes.process(scriptOrFnNode, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess13() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        renamePrototypes.process(scriptOrFnNode, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess14() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess15() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess16() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess17() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess18() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        renamePrototypes.process(functionNode, functionNode1);
    }
    
    @Test(timeout = 1000L)
    public void testProcess19() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess20() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        renamePrototypes.process(node, scriptOrFnNode);
    }
    
    @Test(timeout = 1000L)
    public void testProcess21() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        renamePrototypes.process(scriptOrFnNode, scriptOrFnNode1);
    }
    
    @Test(timeout = 1000L)
    public void testProcess22() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess23() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess24() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess25() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renamePrototypesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(renamePrototypes, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenamePrototypes.getPropertyMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyMap()
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#getPropertyMap()}
 * @utbot.returnsFrom {@code return new VariableMap(map);}
 *  */
    @Test
    public void testGetPropertyMap_Return() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "properties", properties);
        
        VariableMap actual = renamePrototypes.getPropertyMap();
        
        VariableMap expected = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        Map map = new LinkedHashMap();
        setField(expected, "com.google.javascript.jscomp.VariableMap", "map", map);
        
        Map expectedMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.VariableMap", "map"));
        Map actualMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "map"));
        assertTrue(deepEquals(expectedMap, actualMap));
        
        Map actualReverseMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "reverseMap"));
        assertNull(actualReverseMap);
        
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#getPropertyMap()}
 * @utbot.iterates iterate the loop {@code for(Property p: properties.values())} once
 * @utbot.returnsFrom {@code return new VariableMap(map);}
 *  */
    @Test
    public void testGetPropertyMap_PNewNameEqualsNull() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        Object property = createInstance("com.google.javascript.jscomp.RenamePrototypes$Property");
        properties.put(string, property);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "properties", properties);
        
        VariableMap actual = renamePrototypes.getPropertyMap();
        
        VariableMap expected = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        Map map = new LinkedHashMap();
        setField(expected, "com.google.javascript.jscomp.VariableMap", "map", map);
        
        Map expectedMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.VariableMap", "map"));
        Map actualMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "map"));
        assertTrue(deepEquals(expectedMap, actualMap));
        
        Map actualReverseMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "reverseMap"));
        assertNull(actualReverseMap);
        
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#getPropertyMap()}
 * @utbot.iterates iterate the loop {@code for(Property p: properties.values())} once
 * @utbot.returnsFrom {@code return new VariableMap(map);}
 *  */
    @Test
    public void testGetPropertyMap_PNewNameNotEqualsNull() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.jscomp.RenamePrototypes$Property");
        String newName = "";
        setField(property, "com.google.javascript.jscomp.RenamePrototypes$Property", "newName", newName);
        properties.put(null, property);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "properties", properties);
        
        VariableMap actual = renamePrototypes.getPropertyMap();
        
        VariableMap expected = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        Map map = new LinkedHashMap();
        map.put(null, newName);
        setField(expected, "com.google.javascript.jscomp.VariableMap", "map", map);
        
        Map expectedMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.VariableMap", "map"));
        Map actualMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "map"));
        assertTrue(deepEquals(expectedMap, actualMap));
        
        Map actualReverseMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "reverseMap"));
        assertNull(actualReverseMap);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyMap()
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#getPropertyMap()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property p: properties.values())
 *  */
    @Test
    public void testGetPropertyMap_ThrowNullPointerException() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.getPropertyMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.getPropertyMap(RenamePrototypes.java:444) */
        renamePrototypes.getPropertyMap();
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#getPropertyMap()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(Property p: properties.values())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.newName != null
 *  */
    @Test
    public void testGetPropertyMap_ThrowNullPointerException_1() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.getPropertyMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.getPropertyMap(RenamePrototypes.java:445) */
        renamePrototypes.getPropertyMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reusePrototypeNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#reusePrototypeNames(java.util.Set)}
 *  */
    @Test
    public void testReusePrototypeNames() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method reusePrototypeNamesMethod = renamePrototypesClazz.getDeclaredMethod("reusePrototypeNames", linkedHashSetType);
        reusePrototypeNamesMethod.setAccessible(true);
        java.lang.Object[] reusePrototypeNamesMethodArguments = new java.lang.Object[1];
        reusePrototypeNamesMethodArguments[0] = linkedHashSet;
        reusePrototypeNamesMethod.invoke(renamePrototypes, reusePrototypeNamesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#reusePrototypeNames(java.util.Set)}
 * @utbot.iterates iterate the loop {@code for(Property prop: properties)} once
 *  */
    @Test
    public void testReusePrototypeNames_PrevNameEqualsNull() throws Exception  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        VariableMap prevUsedRenameMap = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        LinkedHashMap map = new LinkedHashMap();
        map.put(null, null);
        setField(prevUsedRenameMap, "com.google.javascript.jscomp.VariableMap", "map", map);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "prevUsedRenameMap", prevUsedRenameMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object property = createInstance("com.google.javascript.jscomp.RenamePrototypes$Property");
        String oldName = "";
        setField(property, "com.google.javascript.jscomp.RenamePrototypes$Property", "oldName", oldName);
        linkedHashSet.add(property);
        
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method reusePrototypeNamesMethod = renamePrototypesClazz.getDeclaredMethod("reusePrototypeNames", linkedHashSetType);
        reusePrototypeNamesMethod.setAccessible(true);
        java.lang.Object[] reusePrototypeNamesMethodArguments = new java.lang.Object[1];
        reusePrototypeNamesMethodArguments[0] = linkedHashSet;
        reusePrototypeNamesMethod.invoke(renamePrototypes, reusePrototypeNamesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reusePrototypeNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#reusePrototypeNames(java.util.Set)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties)
 *  */
    @Test
    public void testReusePrototypeNames_ThrowNullPointerException() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames(RenamePrototypes.java:273) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class setType = Class.forName("java.util.Set");
        Method reusePrototypeNamesMethod = renamePrototypesClazz.getDeclaredMethod("reusePrototypeNames", setType);
        reusePrototypeNamesMethod.setAccessible(true);
        java.lang.Object[] reusePrototypeNamesMethodArguments = new java.lang.Object[1];
        reusePrototypeNamesMethodArguments[0] = ((Object) null);
        try {
            reusePrototypeNamesMethod.invoke(renamePrototypes, reusePrototypeNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#reusePrototypeNames(java.util.Set)}
 * @utbot.iterates iterate the loop {@code for(Property prop: properties)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prevName = prevUsedRenameMap.lookupNewName(prop.oldName);
 *  */
    @Test
    public void testReusePrototypeNames_ThrowNullPointerException_2() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        VariableMap prevUsedRenameMap = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "prevUsedRenameMap", prevUsedRenameMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames(RenamePrototypes.java:274) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method reusePrototypeNamesMethod = renamePrototypesClazz.getDeclaredMethod("reusePrototypeNames", linkedHashSetType);
        reusePrototypeNamesMethod.setAccessible(true);
        java.lang.Object[] reusePrototypeNamesMethodArguments = new java.lang.Object[1];
        reusePrototypeNamesMethodArguments[0] = linkedHashSet;
        try {
            reusePrototypeNamesMethod.invoke(renamePrototypes, reusePrototypeNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#reusePrototypeNames(java.util.Set)}
 * @utbot.iterates iterate the loop {@code for(Property prop: properties)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prevName = prevUsedRenameMap.lookupNewName(prop.oldName);
 *  */
    @Test
    public void testReusePrototypeNames_ThrowNullPointerException_1() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object property = createInstance("com.google.javascript.jscomp.RenamePrototypes$Property");
        String oldName = "";
        setField(property, "com.google.javascript.jscomp.RenamePrototypes$Property", "oldName", oldName);
        linkedHashSet.add(property);
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames(RenamePrototypes.java:274) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method reusePrototypeNamesMethod = renamePrototypesClazz.getDeclaredMethod("reusePrototypeNames", linkedHashSetType);
        reusePrototypeNamesMethod.setAccessible(true);
        java.lang.Object[] reusePrototypeNamesMethodArguments = new java.lang.Object[1];
        reusePrototypeNamesMethodArguments[0] = linkedHashSet;
        try {
            reusePrototypeNamesMethod.invoke(renamePrototypes, reusePrototypeNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenamePrototypes}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenamePrototypes#reusePrototypeNames(java.util.Set)}
 * @utbot.iterates iterate the loop {@code for(Property prop: properties)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: reservedNames.contains(prevName)
 *  */
    @Test
    public void testReusePrototypeNames_ThrowNullPointerException_3() throws Throwable  {
        RenamePrototypes renamePrototypes = ((RenamePrototypes) createInstance("com.google.javascript.jscomp.RenamePrototypes"));
        VariableMap prevUsedRenameMap = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        LinkedHashMap map = new LinkedHashMap();
        String string = "";
        map.put(string, string);
        setField(prevUsedRenameMap, "com.google.javascript.jscomp.VariableMap", "map", map);
        setField(renamePrototypes, "com.google.javascript.jscomp.RenamePrototypes", "prevUsedRenameMap", prevUsedRenameMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object property = createInstance("com.google.javascript.jscomp.RenamePrototypes$Property");
        setField(property, "com.google.javascript.jscomp.RenamePrototypes$Property", "oldName", string);
        linkedHashSet.add(property);
        
        /* This test fails because method [com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames(RenamePrototypes.java:276) */
        Class renamePrototypesClazz = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class linkedHashSetType = Class.forName("java.util.Set");
        Method reusePrototypeNamesMethod = renamePrototypesClazz.getDeclaredMethod("reusePrototypeNames", linkedHashSetType);
        reusePrototypeNamesMethod.setAccessible(true);
        java.lang.Object[] reusePrototypeNamesMethodArguments = new java.lang.Object[1];
        reusePrototypeNamesMethodArguments[0] = linkedHashSet;
        try {
            reusePrototypeNamesMethod.invoke(renamePrototypes, reusePrototypeNamesMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields914404784259900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields914404784259900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass914404784265500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914404784259900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914404784265500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields914404784692300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914404784692300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914404784695700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914404784692300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914404784695700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


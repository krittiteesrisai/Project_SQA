package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.InputId;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_FunctionRewriterTest {
    ///region Test suites for executable com.google.javascript.jscomp.FunctionRewriter.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.FunctionRewriter.process(FunctionRewriter.java:68) */
        functionRewriter.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.FunctionRewriter.process(FunctionRewriter.java:68) */
        functionRewriter.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.FunctionRewriter.process(FunctionRewriter.java:68) */
        functionRewriter.process(null, functionNode);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = functionRewriterClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = stringNode;
        processMethod.invoke(functionRewriter, processMethodArguments);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        functionRewriter.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Node node = new Node(0);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node1, "com.google.javascript.rhino.Node", "parent", parent);
        
        functionRewriter.process(node, node1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionRewriter.parseHelperCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseHelperCode(com.google.javascript.jscomp.FunctionRewriter$Reducer)
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#parseHelperCode(com.google.javascript.jscomp.FunctionRewriter.Reducer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reducer.getClass().toString() + ":helper"
 *  */
    @Test
    public void testParseHelperCode_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:112) */
        functionRewriter.parseHelperCode(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#parseHelperCode(com.google.javascript.jscomp.FunctionRewriter.Reducer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node root = compiler.parseSyntheticCode(reducer.getClass().toString() + ":helper", reducer.getHelperSource());
 *  */
    @Test
    public void testParseHelperCode_ThrowNullPointerException_1() throws Throwable  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Object getterReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$GetterReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class getterReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", getterReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = getterReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#parseHelperCode(com.google.javascript.jscomp.FunctionRewriter.Reducer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node root = compiler.parseSyntheticCode(reducer.getClass().toString() + ":helper", reducer.getHelperSource());
 *  */
    @Test
    public void testParseHelperCode_ThrowNullPointerException_2() throws Throwable  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Object identityReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$IdentityReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class identityReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", identityReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = identityReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseHelperCode(com.google.javascript.jscomp.FunctionRewriter$Reducer)
    
    @Test
    public void testParseHelperCode1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object setterReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$SetterReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class setterReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", setterReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = setterReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object setterReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$SetterReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class setterReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", setterReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = setterReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object emptyFunctionReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$EmptyFunctionReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class emptyFunctionReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", emptyFunctionReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = emptyFunctionReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode4() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object returnConstantReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$ReturnConstantReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class returnConstantReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", returnConstantReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = returnConstantReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode5() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object identityReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$IdentityReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class identityReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", identityReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = identityReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode6() throws Throwable  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Object setterReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$SetterReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class setterReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", setterReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = setterReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode7() throws Throwable  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Object emptyFunctionReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$EmptyFunctionReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class emptyFunctionReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", emptyFunctionReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = emptyFunctionReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode8() throws Throwable  {
        FunctionRewriter functionRewriter = new FunctionRewriter(null);
        Object returnConstantReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$ReturnConstantReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class returnConstantReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", returnConstantReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = returnConstantReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode9() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object getterReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$GetterReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class getterReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", getterReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = getterReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode10() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object identityReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$IdentityReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class identityReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", identityReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = identityReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode11() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object returnConstantReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$ReturnConstantReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class returnConstantReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", returnConstantReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = returnConstantReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseHelperCode12() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionRewriter functionRewriter = new FunctionRewriter(compiler);
        Object getterReducer = createInstance("com.google.javascript.jscomp.FunctionRewriter$GetterReducer");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionRewriter.parseHelperCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1880)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1293)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1318)
            com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(FunctionRewriter.java:111) */
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class getterReducerType = Class.forName("com.google.javascript.jscomp.FunctionRewriter$Reducer");
        Method parseHelperCodeMethod = functionRewriterClazz.getDeclaredMethod("parseHelperCode", getterReducerType);
        parseHelperCodeMethod.setAccessible(true);
        java.lang.Object[] parseHelperCodeMethodArguments = new java.lang.Object[1];
        parseHelperCodeMethodArguments[0] = getterReducer;
        try {
            parseHelperCodeMethod.invoke(functionRewriter, parseHelperCodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionRewriter.isReduceableFunctionExpression
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isReduceableFunctionExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#isReduceableFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.isFunctionExpression(n);}
 *  */
    @Test
    public void testIsReduceableFunctionExpression_ReturnNodeUtilIsFunctionExpression() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReduceableFunctionExpressionMethod = functionRewriterClazz.getDeclaredMethod("isReduceableFunctionExpression", scriptOrFnNodeType);
        isReduceableFunctionExpressionMethod.setAccessible(true);
        java.lang.Object[] isReduceableFunctionExpressionMethodArguments = new java.lang.Object[1];
        isReduceableFunctionExpressionMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isReduceableFunctionExpressionMethod.invoke(null, isReduceableFunctionExpressionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#isReduceableFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.isFunctionExpression(n);}
 *  */
    @Test
    public void testIsReduceableFunctionExpression_ReturnNodeUtilIsFunctionExpression_1() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(125);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReduceableFunctionExpressionMethod = functionRewriterClazz.getDeclaredMethod("isReduceableFunctionExpression", scriptOrFnNodeType);
        isReduceableFunctionExpressionMethod.setAccessible(true);
        java.lang.Object[] isReduceableFunctionExpressionMethodArguments = new java.lang.Object[1];
        isReduceableFunctionExpressionMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isReduceableFunctionExpressionMethod.invoke(null, isReduceableFunctionExpressionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#isReduceableFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.isFunctionExpression(n);}
 *  */
    @Test
    public void testIsReduceableFunctionExpression_ReturnNodeUtilIsFunctionExpression_2() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReduceableFunctionExpressionMethod = functionRewriterClazz.getDeclaredMethod("isReduceableFunctionExpression", scriptOrFnNodeType);
        isReduceableFunctionExpressionMethod.setAccessible(true);
        java.lang.Object[] isReduceableFunctionExpressionMethodArguments = new java.lang.Object[1];
        isReduceableFunctionExpressionMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isReduceableFunctionExpressionMethod.invoke(null, isReduceableFunctionExpressionMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isReduceableFunctionExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionRewriter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#isReduceableFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsReduceableFunctionExpression_ThrowIllegalStateException() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReduceableFunctionExpressionMethod = functionRewriterClazz.getDeclaredMethod("isReduceableFunctionExpression", scriptOrFnNodeType);
        isReduceableFunctionExpressionMethod.setAccessible(true);
        java.lang.Object[] isReduceableFunctionExpressionMethodArguments = new java.lang.Object[1];
        isReduceableFunctionExpressionMethodArguments[0] = scriptOrFnNode;
        try {
            isReduceableFunctionExpressionMethod.invoke(null, isReduceableFunctionExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isReduceableFunctionExpression(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.FunctionRewriter}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionRewriter#isReduceableFunctionExpression(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testIsReduceableFunctionExpressionReturnsFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(1);
        
        Class functionRewriterClazz = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReduceableFunctionExpressionMethod = functionRewriterClazz.getDeclaredMethod("isReduceableFunctionExpression", nodeType);
        isReduceableFunctionExpressionMethod.setAccessible(true);
        java.lang.Object[] isReduceableFunctionExpressionMethodArguments = new java.lang.Object[1];
        isReduceableFunctionExpressionMethodArguments[0] = node;
        boolean actual = ((Boolean) isReduceableFunctionExpressionMethod.invoke(null, isReduceableFunctionExpressionMethodArguments));
        
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields892912782679300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields892912782679300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass892912782685100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields892912782679300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass892912782685100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


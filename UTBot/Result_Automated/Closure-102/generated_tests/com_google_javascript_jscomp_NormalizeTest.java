package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.ArrayList;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.jstype.JSType;
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_NormalizeTest {
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        normalize.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Node initialFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        normalize.visit(null, functionNode, null);
        
        int finalFunctionNodeType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "type"));
        Node finalFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionNodeFirst == finalFunctionNodeFirst);
        
        assertEquals(115, finalFunctionNodeType);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Node initialFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        normalize.visit(null, functionNode, null);
        
        int finalFunctionNodeType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "type"));
        Node finalFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionNodeFirst == finalFunctionNodeFirst);
        
        assertEquals(115, finalFunctionNodeType);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        Object cache = createInstance("com.google.javascript.jscomp.SymbolTable$MemoizedData");
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "cache", cache);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Node initialFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        normalize.visit(null, functionNode, null);
        
        int finalFunctionNodeType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "type"));
        Node finalFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionNodeFirst == finalFunctionNodeFirst);
        
        assertEquals(115, finalFunctionNodeType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.visit(Normalize.java:235) */
        normalize.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setType(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildBefore(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildAfter(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportCodeChange("WHILE node");
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.visit(Normalize.java:242) */
        normalize.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: n.addChildBefore(new Node(Token.EMPTY), expr);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVisit_ThrowIllegalArgumentException() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        
        normalize.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildAfter(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: reportCodeChange("WHILE node");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Exception  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
        normalize.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:88) */
        normalize.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(126);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:88) */
        normalize.process(null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:88) */
        normalize.process(null, functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_4() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        boolean actual = normalize.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_1() throws Exception  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = normalize.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_5() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(105);
        setField(last, "com.google.javascript.rhino.Node", "parent", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        boolean actual = normalize.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_3() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = normalize.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = normalize.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = normalize.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:252)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:284)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:253)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_6() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:379)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:269)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_7() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:379)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:269)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(125);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(126);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(125);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException] */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_5() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(126);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:320)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_8() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(126);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_9() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.splitVarDeclarations(Normalize.java:367)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:265)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_10() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.splitVarDeclarations(Normalize.java:367)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:265)
            com.google.javascript.jscomp.Normalize.shouldTraverse(Normalize.java:101) */
        normalize.shouldTraverse(null, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "parent", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: doStatementNormalizations(t, n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException() throws Exception  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        normalize.shouldTraverse(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.reportCodeChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportCodeChange(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        Object cache = createInstance("com.google.javascript.jscomp.SymbolTable$MemoizedData");
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "cache", cache);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reportCodeChange(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 * @utbot.executesCondition {@code (assertOnChange): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: assertOnChange
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReportCodeChange_ThrowIllegalStateException() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        try {
            reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportCodeChange(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 * @utbot.executesCondition {@code (assertOnChange): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#reportCodeChange()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testReportCodeChange_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.reportCodeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        try {
            reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.normalizeLabels
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeLabels(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#normalizeLabels(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(last.getType()) case: Token.DO}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testNormalizeLabels_NodeGetType() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeLabels(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#normalizeLabels(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.LABEL);
 *  */
    @Test
    public void testNormalizeLabels_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.normalizeLabels] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:281) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", nodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = ((Object) null);
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#normalizeLabels(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(last.getType())
 *  */
    @Test
    public void testNormalizeLabels_ThrowNullPointerException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.normalizeLabels] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:284) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method normalizeLabels(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#normalizeLabels(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.LABEL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeLabels_ThrowIllegalArgumentException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method normalizeLabels(com.google.javascript.rhino.Node)
    
    @Test
    public void testNormalizeLabels1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(122);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.normalizeLabels] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:293) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNormalizeLabels2() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(123);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.normalizeLabels] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:293) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method normalizeLabels(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels3() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(123);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels4() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels5() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(121);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels6() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(127);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels7() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(117);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels8() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(120);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels9() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(119);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels10() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(124);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels11() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(116);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeLabels12() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(122);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeLabelsMethod = normalizeClazz.getDeclaredMethod("normalizeLabels", scriptOrFnNodeType);
        normalizeLabelsMethod.setAccessible(true);
        java.lang.Object[] normalizeLabelsMethodArguments = new java.lang.Object[1];
        normalizeLabelsMethodArguments[0] = scriptOrFnNode;
        try {
            normalizeLabelsMethod.invoke(normalize, normalizeLabelsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.addToFront
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addToFront(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): True}
 * @utbot.returnsFrom {@code return newChild;}
 *  */
    @Test
    public void testAddToFront_AfterEqualsNull() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = scriptOrFnNode;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) addToFrontMethod.invoke(normalize, addToFrontMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node scriptOrFnNodeFirstLast = ((Node) getFieldValue(scriptOrFnNodeFirst, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        Object actualFirstLastPropListHead = getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstLastPropListHead);
        
        int scriptOrFnNodeFirstLastSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirstLast, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstLastSourcePosition = ((Integer) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstLastSourcePosition, actualFirstLastSourcePosition);
        
        JSType actualFirstLastJsType = ((JSType) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstLastJsType);
        
        Node scriptOrFnNodeFirstLastParent = scriptOrFnNodeFirstLast.getParent();
        Node actualFirstLastParent = actualFirstLast.getParent();
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstLastParent, actualFirstLastParent));
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): False}
 * @utbot.returnsFrom {@code return newChild;}
 *  */
    @Test
    public void testAddToFront_AfterNotEqualsNull() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Node initialScriptOrFnNode1Next = ((Node) getFieldValue(scriptOrFnNode1, "com.google.javascript.rhino.Node", "next"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = scriptOrFnNode;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = scriptOrFnNode1;
        ScriptOrFnNode actual = ((ScriptOrFnNode) addToFrontMethod.invoke(normalize, addToFrontMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        
        Node finalScriptOrFnNode1Next = ((Node) getFieldValue(scriptOrFnNode1, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialScriptOrFnNode1Next == finalScriptOrFnNode1Next);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): False}
 * @utbot.returnsFrom {@code return newChild;}
 *  */
    @Test
    public void testAddToFront_AfterNotEqualsNull_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Node initialNodeLast = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "last"));
        
        Node initialFunctionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialLastNext = ((Node) getFieldValue(last, "com.google.javascript.rhino.Node", "next"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", nodeType, nodeType, nodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = node;
        addToFrontMethodArguments[1] = functionNode;
        addToFrontMethodArguments[2] = last;
        FunctionNode actual = ((FunctionNode) addToFrontMethod.invoke(normalize, addToFrontMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node functionNodeParent = functionNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        Node functionNodeParentLast = ((Node) getFieldValue(functionNodeParent, "com.google.javascript.rhino.Node", "last"));
        Node actualParentLast = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        assertTrue(deepEquals(functionNodeParentLast, actualParentLast));
        
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Node finalNodeLast = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "last"));
        
        Node finalFunctionNodeParent = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalLastNext = ((Node) getFieldValue(last, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialNodeLast == finalNodeLast);
        
        assertFalse(initialFunctionNodeParent == finalFunctionNodeParent);
        
        assertFalse(initialLastNext == finalLastNext);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): True}
 * @utbot.returnsFrom {@code return newChild;}
 *  */
    @Test
    public void testAddToFront_AfterEqualsNull_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = scriptOrFnNode;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) addToFrontMethod.invoke(normalize, addToFrontMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node scriptOrFnNodeFirstLast = ((Node) getFieldValue(scriptOrFnNodeFirst, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        assertTrue(deepEquals(scriptOrFnNodeFirstLast, actualFirstLast));
        Node actualFirstLastFirst = ((Node) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstLastFirst);
        
        Node actualFirstLastLast = ((Node) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLastLast);
        
        Object actualFirstLastPropListHead = getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstLastPropListHead);
        
        int scriptOrFnNodeFirstLastSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirstLast, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstLastSourcePosition = ((Integer) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstLastSourcePosition, actualFirstLastSourcePosition);
        
        JSType actualFirstLastJsType = ((JSType) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstLastJsType);
        
        Node actualFirstLastParent = actualFirstLast.getParent();
        assertNull(actualFirstLastParent);
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node scriptOrFnNodeFirstParent = scriptOrFnNodeFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addToFront(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildAfter(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.addChildAfter(newChild, after);
 *  */
    @Test
    public void testAddToFront_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.addToFront] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.addToFront(Normalize.java:420) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", nodeType, nodeType, nodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = ((Object) null);
        addToFrontMethodArguments[1] = ((Object) null);
        addToFrontMethodArguments[2] = scriptOrFnNode;
        try {
            addToFrontMethod.invoke(normalize, addToFrontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildToFront(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.addChildToFront(newChild);
 *  */
    @Test
    public void testAddToFront_ThrowNullPointerException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.addToFront] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.addToFront(Normalize.java:418) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", nodeType, nodeType, nodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = ((Object) null);
        addToFrontMethodArguments[1] = ((Object) null);
        addToFrontMethodArguments[2] = ((Object) null);
        try {
            addToFrontMethod.invoke(normalize, addToFrontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addToFront(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parent.addChildAfter(newChild, after);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddToFront_ThrowIllegalArgumentException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(0);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", nodeType, nodeType, nodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = node;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = scriptOrFnNode;
        try {
            addToFrontMethod.invoke(normalize, addToFrontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parent.addChildToFront(newChild);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddToFront_ThrowIllegalArgumentException_2() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = scriptOrFnNode;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = ((Object) null);
        try {
            addToFrontMethod.invoke(normalize, addToFrontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parent.addChildToFront(newChild);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddToFront_ThrowIllegalArgumentException_3() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = scriptOrFnNode;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = ((Object) null);
        try {
            addToFrontMethod.invoke(normalize, addToFrontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#addToFront(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (after == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parent.addChildAfter(newChild, after);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddToFront_ThrowIllegalArgumentException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method addToFrontMethod = normalizeClazz.getDeclaredMethod("addToFront", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        addToFrontMethod.setAccessible(true);
        java.lang.Object[] addToFrontMethodArguments = new java.lang.Object[3];
        addToFrontMethodArguments[0] = scriptOrFnNode;
        addToFrontMethodArguments[1] = scriptOrFnNode;
        addToFrontMethodArguments[2] = scriptOrFnNode;
        try {
            addToFrontMethod.invoke(normalize, addToFrontMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.moveNamedFunctions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method moveNamedFunctions(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMoveNamedFunctions() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 *  */
    @Test
    public void testMoveNamedFunctions_CurrentNotEqualsNullAndNodeUtilIsFunctionDeclaration() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(126);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent1.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} once
 *  */
    @Test
    public void testMoveNamedFunctions_CurrentEqualsNullAndNodeUtilIsFunctionDeclaration() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(105);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", functionNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = functionNode;
        moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} twice
 *  */
    @Test
    public void testMoveNamedFunctions_CurrentNotEqualsNullAndNodeUtilIsFunctionDeclaration_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-256);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", next);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(105);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Node initialFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", functionNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = functionNode;
        moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        
        Node finalFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionNodeFirst == finalFunctionNodeFirst);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} twice
 *  */
    @Test
    public void testMoveNamedFunctions_CurrentNotEqualsNullAndNodeUtilIsFunctionDeclaration_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-256);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Node initialScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        
        Node finalScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialScriptOrFnNodeFirst == finalScriptOrFnNodeFirst);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} twice
 *  */
    @Test
    public void testMoveNamedFunctions_CurrentNotEqualsNullAndNodeUtilIsFunctionDeclaration_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        Object cache = createInstance("com.google.javascript.jscomp.SymbolTable$MemoizedData");
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "cache", cache);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-248);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(105);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Node initialFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", functionNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = functionNode;
        moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        
        Node finalFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionNodeFirst == finalFunctionNodeFirst);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method moveNamedFunctions(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: functionBody.getParent().getType() == Token.FUNCTION
 *  */
    @Test
    public void testMoveNamedFunctions_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.moveNamedFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:379) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", nodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = ((Object) null);
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: functionBody.getParent().getType() == Token.FUNCTION
 *  */
    @Test
    public void testMoveNamedFunctions_ThrowNullPointerException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.moveNamedFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:379) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (functionBody.getParent().getType() == Token.FUNCTION): True}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testMoveNamedFunctions_ThrowNullPointerException_2() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-256);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", next);
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent1.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.moveNamedFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:402) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (functionBody.getParent().getType() == Token.FUNCTION): True}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testMoveNamedFunctions_ThrowNullPointerException_3() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-224);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent1.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.moveNamedFunctions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:402) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method moveNamedFunctions(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (functionBody.getParent().getType() == Token.FUNCTION): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(functionBody.getParent().getType() == Token.FUNCTION);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMoveNamedFunctions_ThrowIllegalStateException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (functionBody.getParent().getType() == Token.FUNCTION): True}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: while(current != null && NodeUtil.isFunctionDeclaration(current))
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMoveNamedFunctions_ThrowIllegalStateException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (functionBody.getParent().getType() == Token.FUNCTION): True}
 * @utbot.iterates iterate the loop {@code while(current != null && NodeUtil.isFunctionDeclaration(current))} once
 * @utbot.iterates iterate the loop {@code while(current != null)} twice
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: functionBody.removeChildAfter(previous);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMoveNamedFunctions_ThrowIllegalArgumentException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent1.setType(105);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveNamedFunctionsMethod = normalizeClazz.getDeclaredMethod("moveNamedFunctions", scriptOrFnNodeType);
        moveNamedFunctionsMethod.setAccessible(true);
        java.lang.Object[] moveNamedFunctionsMethodArguments = new java.lang.Object[1];
        moveNamedFunctionsMethodArguments[0] = scriptOrFnNode;
        try {
            moveNamedFunctionsMethod.invoke(normalize, moveNamedFunctionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.doStatementNormalizations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)
 *  */
    @Test
    public void testDoStatementNormalizations_NormalizeMoveNamedFunctions() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(105);
        setField(last, "com.google.javascript.rhino.Node", "parent", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, functionNodeType, functionNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = functionNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDoStatementNormalizations() throws Exception  {
        Normalize normalize = new Normalize(null, true);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, functionNodeType, functionNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = functionNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDoStatementNormalizations_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.LABEL
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:252) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, nodeType, nodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = ((Object) null);
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: normalizeLabels(n);
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:284)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:253) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: moveNamedFunctions(n.getLastChild());
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_6() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:379)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:269) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: moveNamedFunctions(n.getLastChild());
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_7() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.moveNamedFunctions(Normalize.java:379)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:269) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, functionNodeType, functionNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = functionNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: extractForInitializer(n, null, null);
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_4() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(125);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: extractForInitializer(n, null, null);
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_2() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(126);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: extractForInitializer(n, null, null);
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_3() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(114);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: extractForInitializer(n, null, null);
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_5() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(126);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: extractForInitializer(n, null, null);
 *  */
    @Test
    public void testDoStatementNormalizations_ThrowNullPointerException_8() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(126);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.Normalize#moveNamedFunctions(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: moveNamedFunctions(n.getLastChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoStatementNormalizations_ThrowIllegalStateException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "parent", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, functionNodeType, functionNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = functionNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.Normalize#extractForInitializer(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: splitVarDeclarations(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoStatementNormalizations_ThrowIllegalStateException() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.Normalize#normalizeLabels(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.RuntimeException} in: normalizeLabels(n);
 *  */
    @Test(expected = RuntimeException.class)
    public void testDoStatementNormalizations_ThrowRuntimeException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(126);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(124);
        setField(last, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testDoStatementNormalizations1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(126);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, stringNodeType, stringNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = stringNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    
    @Test
    public void testDoStatementNormalizations2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(126);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(115);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first2, "com.google.javascript.rhino.Node", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, nodeType, nodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = node;
        doStatementNormalizationsMethodArguments[2] = functionNode;
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    
    @Test
    public void testDoStatementNormalizations3() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(115);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next3 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(first1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, nodeType, nodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = node;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    
    @Test
    public void testDoStatementNormalizations4() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(115);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(124);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next3 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next4 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next5 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next4, "com.google.javascript.rhino.Node", "next", next5);
        setField(next3, "com.google.javascript.rhino.Node", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, nodeType, nodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = node;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testDoStatementNormalizations5() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(117);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 38);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:293)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:253) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, stringNodeType, stringNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = stringNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoStatementNormalizations6() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:338)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, stringNodeType, stringNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = stringNode;
        doStatementNormalizationsMethodArguments[2] = stringNode1;
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoStatementNormalizations7() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(124);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.Normalize.normalizeLabels(Normalize.java:293)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:253) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, stringNodeType, stringNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = ((Object) null);
        doStatementNormalizationsMethodArguments[1] = stringNode;
        doStatementNormalizationsMethodArguments[2] = stringNode;
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoStatementNormalizations8() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first2.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.doStatementNormalizations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:338)
            com.google.javascript.jscomp.Normalize.doStatementNormalizations(Normalize.java:259) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, stringNodeType, stringNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = stringNode;
        doStatementNormalizationsMethodArguments[2] = functionNode;
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testDoStatementNormalizations9() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, stringNodeType, stringNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = stringNode;
        doStatementNormalizationsMethodArguments[2] = ((Object) null);
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testDoStatementNormalizations10() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next3 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doStatementNormalizationsMethod = normalizeClazz.getDeclaredMethod("doStatementNormalizations", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        doStatementNormalizationsMethod.setAccessible(true);
        java.lang.Object[] doStatementNormalizationsMethodArguments = new java.lang.Object[3];
        doStatementNormalizationsMethodArguments[0] = nodeTraversal;
        doStatementNormalizationsMethodArguments[1] = scriptOrFnNode;
        doStatementNormalizationsMethodArguments[2] = functionNode;
        try {
            doStatementNormalizationsMethod.invoke(normalize, doStatementNormalizationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.extractForInitializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#extractForInitializer(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testExtractForInitializer() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#extractForInitializer(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node next, c = n.getFirstChild(); c != null; c = next)
 *  */
    @Test
    public void testExtractForInitializer_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:314) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", nodeType, nodeType, nodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = ((Object) null);
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#extractForInitializer(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: c.getFirstChild().getType() != Token.EMPTY
 *  */
    @Test
    public void testExtractForInitializer_ThrowNullPointerException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:324) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testExtractForInitializer1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
    }
    
    @Test
    public void testExtractForInitializer2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(126);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(124);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = node;
        extractForInitializerMethodArguments[2] = ((Object) null);
        extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
    }
    
    @Test
    public void testExtractForInitializer3() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(115);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(126);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = stringNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
    }
    
    @Test
    public void testExtractForInitializer4() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first2.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = scriptOrFnNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testExtractForInitializer5() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(126);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = scriptOrFnNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer6() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(124);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next2, "com.google.javascript.rhino.Node", "next", next);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = stringNode1;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer7() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(115);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", nodeType, nodeType, nodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = node;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = functionNode;
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer8() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(126);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.addChildBefore(Node.java:635)
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:337) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = scriptOrFnNode;
        extractForInitializerMethodArguments[2] = stringNode;
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer9() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next1.setType(115);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = scriptOrFnNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer10() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(115);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = stringNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer11() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException] */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = numberNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer12() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:338) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = stringNode1;
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer13() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next3 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:338) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = functionNode;
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExtractForInitializer14() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(next3, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.extractForInitializer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.extractForInitializer(Normalize.java:337) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = stringNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer15() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(126);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = scriptOrFnNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer16() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", nodeType, nodeType, nodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = node;
        extractForInitializerMethodArguments[1] = scriptOrFnNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer17() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = scriptOrFnNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer18() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = functionNode;
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer19() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = functionNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer20() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", nodeType, nodeType, nodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = node;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer21() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer22() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = numberNode;
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer23() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", functionNodeType, functionNodeType, functionNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = functionNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = ((Object) null);
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testExtractForInitializer24() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(115);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(124);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method extractForInitializerMethod = normalizeClazz.getDeclaredMethod("extractForInitializer", stringNodeType, stringNodeType, stringNodeType);
        extractForInitializerMethod.setAccessible(true);
        java.lang.Object[] extractForInitializerMethodArguments = new java.lang.Object[3];
        extractForInitializerMethodArguments[0] = stringNode;
        extractForInitializerMethodArguments[1] = ((Object) null);
        extractForInitializerMethodArguments[2] = stringNode;
        try {
            extractForInitializerMethod.invoke(normalize, extractForInitializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.splitVarDeclarations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method splitVarDeclarations(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations_6() throws Exception  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Node initialScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        
        Node finalScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialScriptOrFnNodeFirst == finalScriptOrFnNodeFirst);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        Node initialFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", functionNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = functionNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        
        Node finalFunctionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionNodeFirst == finalFunctionNodeFirst);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations_5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        Node initialScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        
        Node finalScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialScriptOrFnNodeFirst == finalScriptOrFnNodeFirst);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSplitVarDeclarations_4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        Object cache = createInstance("com.google.javascript.jscomp.SymbolTable$MemoizedData");
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "cache", cache);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        Node initialScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        
        Node finalScriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialScriptOrFnNodeFirst == finalScriptOrFnNodeFirst);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method splitVarDeclarations(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node next, c = n.getFirstChild(); c != null; c = next)
 *  */
    @Test
    public void testSplitVarDeclarations_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.splitVarDeclarations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.splitVarDeclarations(Normalize.java:355) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", nodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = ((Object) null);
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportCodeChange("VAR with multiple children");
 *  */
    @Test
    public void testSplitVarDeclarations_ThrowNullPointerException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.splitVarDeclarations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:83)
            com.google.javascript.jscomp.Normalize.splitVarDeclarations(Normalize.java:367) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method splitVarDeclarations(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: reportCodeChange("VAR with multiple children");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSplitVarDeclarations_ThrowIllegalStateException_2() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", next);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: reportCodeChange("VAR with multiple children");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSplitVarDeclarations_ThrowIllegalStateException_3() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", functionNode);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", functionNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = functionNode;
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: assertOnChange && !c.hasChildren()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSplitVarDeclarations_ThrowIllegalStateException() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n.addChildBefore(newVar, c);
 *  */
    @Test(expected = RuntimeException.class)
    public void testSplitVarDeclarations_ThrowRuntimeException() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", nodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = node;
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#splitVarDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: n.addChildBefore(newVar, c);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSplitVarDeclarations_ThrowIllegalStateException_1() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "parent", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method splitVarDeclarationsMethod = normalizeClazz.getDeclaredMethod("splitVarDeclarations", scriptOrFnNodeType);
        splitVarDeclarationsMethod.setAccessible(true);
        java.lang.Object[] splitVarDeclarationsMethodArguments = new java.lang.Object[1];
        splitVarDeclarationsMethodArguments[0] = scriptOrFnNode;
        try {
            splitVarDeclarationsMethod.invoke(normalize, splitVarDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeDuplicateDeclarations(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#removeDuplicateDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.traverse(root);
 *  */
    @Test
    public void testRemoveDuplicateDeclarations_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations(Normalize.java:433) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDuplicateDeclarationsMethod = normalizeClazz.getDeclaredMethod("removeDuplicateDeclarations", nodeType);
        removeDuplicateDeclarationsMethod.setAccessible(true);
        java.lang.Object[] removeDuplicateDeclarationsMethodArguments = new java.lang.Object[1];
        removeDuplicateDeclarationsMethodArguments[0] = ((Object) null);
        try {
            removeDuplicateDeclarationsMethod.invoke(normalize, removeDuplicateDeclarationsMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields936263635476700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields936263635476700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass936263635481300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936263635476700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936263635481300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields936263635834300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936263635834300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936263635835900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936263635834300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936263635835900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_CheckGlobalThisTest {
    ///region Test suites for executable com.google.javascript.jscomp.CheckGlobalThis.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == assignLhsChild): True}
 *  */
    @Test
    public void testVisit_NEqualsAssignLhsChild() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        ScriptOrFnNode assignLhsChild = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        assignLhsChild.setType(-256);
        setField(checkGlobalThis, "com.google.javascript.jscomp.CheckGlobalThis", "assignLhsChild", assignLhsChild);
        
        checkGlobalThis.visit(null, assignLhsChild, null);
        
        Node finalCheckGlobalThisAssignLhsChild = ((Node) getFieldValue(checkGlobalThis, "com.google.javascript.jscomp.CheckGlobalThis", "assignLhsChild"));
        
        assertNull(finalCheckGlobalThisAssignLhsChild);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == assignLhsChild): False}
 *  */
    @Test
    public void testVisit_NNotEqualsAssignLhsChild() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        checkGlobalThis.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == assignLhsChild): False}
 *  */
    @Test
    public void testVisit_NNotEqualsAssignLhsChild_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        
        checkGlobalThis.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == assignLhsChild): False}
 *  */
    @Test
    public void testVisit_NNotEqualsAssignLhsChild_2() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        Node node = new Node(-255);
        
        checkGlobalThis.visit(null, scriptOrFnNode, node);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.THIS && shouldReportThis(n, parent)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.visit(CheckGlobalThis.java:145) */
        checkGlobalThis.visit(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        Object assignLhsChild = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(checkGlobalThis, "com.google.javascript.jscomp.CheckGlobalThis", "assignLhsChild", assignLhsChild);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.visit(CheckGlobalThis.java:146) */
        checkGlobalThis.visit(nodeTraversal, functionNode, functionNode);
    }
    
    @Test
    public void testVisit2() throws Throwable  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(42);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.visit(CheckGlobalThis.java:146) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkGlobalThisClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkGlobalThis, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit3() throws Throwable  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(42);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.visit(CheckGlobalThis.java:146) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkGlobalThisClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkGlobalThis, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit4() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        Node assignLhsChild = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(checkGlobalThis, "com.google.javascript.jscomp.CheckGlobalThis", "assignLhsChild", assignLhsChild);
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.visit(CheckGlobalThis.java:146) */
        checkGlobalThis.visit(null, node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): True}
 * @utbot.executesCondition {@code (assignLhsChild == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_AssignLhsChildNotEqualsNull() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        Object assignLhsChild = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(checkGlobalThis, "com.google.javascript.jscomp.CheckGlobalThis", "assignLhsChild", assignLhsChild);
        Node node = new Node(0);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, node, functionNode);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ParentEqualsNull() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ParentGetTypeNotEqualsTokenASSIGN() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = new Node(-255);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (llhs.getType() == Token.GETPROP): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_LlhsGetTypeNotEqualsTokenGETPROP() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, node, node1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): False}
 * @utbot.executesCondition {@code (!(pType == Token.BLOCK || pType == Token.SCRIPT || pType == Token.NAME || pType == Token.ASSIGN)): True}
 * @utbot.invokes com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testShouldTraverse_NotPTypeNotEqualsTokenBLOCKOrPTypeNotEqualsTokenSCRIPTOrPTypeNotEqualsTokenNAMEOrPTypeNotEqualsTokenASSIGN() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = new Node(0);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, node, node1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (lhs.getLastChild().getString().equals("prototype")): False}
 * @utbot.executesCondition {@code (llhs.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (llhs.getLastChild().getString().equals("prototype")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NotLlhsGetLastChildGetStringEquals() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, node, functionNode);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (n.getType() == Token.FUNCTION): True}
    /// invoke:
    ///     com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node) once
    /// execute conditions:
    ///     {@code (jsDoc != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.JSDocInfo#isConstructor()} once
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code ((jsDoc.isConstructor() || jsDoc.isInterface() || jsDoc.hasThisType() || jsDoc.isOverride())): False}
 *  */
    @Test
    public void testShouldTraverse_JsDocIsConstructorOrJsDocIsInterfaceOrJsDocHasThisTypeOrJsDocIsOverride() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code ((jsDoc.isConstructor() || jsDoc.isInterface() || jsDoc.hasThisType() || jsDoc.isOverride())): True}
 * @utbot.executesCondition {@code (jsDoc.isInterface()): False}
 *  */
    @Test
    public void testShouldTraverse_NotJsDocIsInterface() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 512);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code ((jsDoc.isConstructor() || jsDoc.isInterface() || jsDoc.hasThisType() || jsDoc.isOverride())): True}
 * @utbot.executesCondition {@code (jsDoc.isInterface()): True}
 * @utbot.executesCondition {@code (jsDoc.hasThisType()): False}
 *  */
    @Test
    public void testShouldTraverse_NotJsDocHasThisType() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code ((jsDoc.isConstructor() || jsDoc.isInterface() || jsDoc.hasThisType() || jsDoc.isOverride())): False}
 *  */
    @Test
    public void testShouldTraverse_JsDocIsConstructorOrJsDocIsInterfaceOrJsDocHasThisTypeOrJsDocIsOverride_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code ((jsDoc.isConstructor() || jsDoc.isInterface() || jsDoc.hasThisType() || jsDoc.isOverride())): True}
 * @utbot.executesCondition {@code (jsDoc.isInterface()): True}
 * @utbot.executesCondition {@code (jsDoc.hasThisType()): True}
 * @utbot.executesCondition {@code (jsDoc.isOverride()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isOverride()}
 *  */
    @Test
    public void testShouldTraverse_JsDocIsOverride() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 64);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (n.getType() == Token.FUNCTION): True}
    /// invoke:
    ///     com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node) once
    /// execute conditions:
    ///     {@code (jsDoc != null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code (parent != null): True},
    ///     {@code (parent.getType() == Token.ASSIGN): False}
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(pType == Token.BLOCK || pType == Token.SCRIPT || pType == Token.NAME || pType == Token.ASSIGN)): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_PTypeEqualsTokenBLOCKOrPTypeEqualsTokenSCRIPTOrPTypeEqualsTokenNAMEOrPTypeEqualsTokenASSIGN() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(125);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(pType == Token.BLOCK || pType == Token.SCRIPT || pType == Token.NAME || pType == Token.ASSIGN)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NotPTypeEqualsTokenBLOCKOrPTypeEqualsTokenSCRIPTOrPTypeEqualsTokenNAMEOrPTypeEqualsTokenASSIGN_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(38);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(pType == Token.BLOCK || pType == Token.SCRIPT || pType == Token.NAME || pType == Token.ASSIGN)): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NotPTypeEqualsTokenBLOCKOrPTypeEqualsTokenSCRIPTOrPTypeEqualsTokenNAMEOrPTypeEqualsTokenASSIGN() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(132);
        
        boolean actual = checkGlobalThis.shouldTraverse(null, scriptOrFnNode, node);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo jsDoc = getFunctionJsDocInfo(n);
 *  */
    @Test
    public void testShouldTraverse_ThrowClassCastException() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.JSDocInfo ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1966)
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:174)
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:89) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo jsDoc = getFunctionJsDocInfo(n);
 *  */
    @Test
    public void testShouldTraverse_ThrowClassCastException_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.JSDocInfo ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1966)
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:179)
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:89) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rhs = lhs.getNext();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = new Node(86);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:115) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, node);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.FUNCTION
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:86) */
        checkGlobalThis.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): False}
 * @utbot.executesCondition {@code (!(pType == Token.BLOCK || pType == Token.SCRIPT || pType == Token.NAME || pType == Token.ASSIGN)): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node rhs = lhs.getNext();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_12() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(86);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:115) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, node);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pType = parent.getType();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:104) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDoc = getFunctionJsDocInfo(n);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:177)
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:89) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lhs.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_5() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:129) */
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): True}
 * @utbot.executesCondition {@code ((jsDoc.isConstructor() || jsDoc.isInterface() || jsDoc.hasThisType() || jsDoc.isOverride())): True}
 * @utbot.executesCondition {@code (jsDoc.isInterface()): True}
 * @utbot.executesCondition {@code (jsDoc.hasThisType()): True}
 * @utbot.executesCondition {@code (jsDoc.isOverride()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasThisType()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isOverride()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pType = parent.getType();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:104) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lhs.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_6() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:129) */
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (lhs.getLastChild().getString().equals("prototype")): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_7() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:133) */
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (llhs.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: llhs.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_8() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:134) */
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pType = parent.getType();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_10() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:104) */
        checkGlobalThis.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pType = parent.getType();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_13() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 1);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:104) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDoc = getFunctionJsDocInfo(n);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_11() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:182)
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:89) */
        checkGlobalThis.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (jsDoc != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pType = parent.getType();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_14() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -254);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(118);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:104) */
        checkGlobalThis.shouldTraverse(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (n == lhs): False}
 * @utbot.executesCondition {@code (NodeUtil.isGet(lhs)): True}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (lhs.getLastChild().getString().equals("prototype")): False}
 * @utbot.executesCondition {@code (llhs.getType() == Token.GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: llhs.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_9() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.shouldTraverse(CheckGlobalThis.java:134) */
        checkGlobalThis.shouldTraverse(null, node, functionNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: lhs.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testShouldTraverse_ThrowUnsupportedOperationException() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: lhs.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lhs.getType() == Token.GETPROP): False}
 * @utbot.executesCondition {@code (llhs.getType() == Token.GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: llhs.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testShouldTraverse_ThrowUnsupportedOperationException_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        Node node = new Node(-255);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(33);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        checkGlobalThis.shouldTraverse(null, node, node1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckGlobalThis.shouldReportThis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method shouldReportThis(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldReportThis(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (assignLhsChild != null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldReportThis_AssignLhsChildNotEqualsNull() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        ScriptOrFnNode assignLhsChild = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(checkGlobalThis, "com.google.javascript.jscomp.CheckGlobalThis", "assignLhsChild", assignLhsChild);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldReportThisMethod = checkGlobalThisClazz.getDeclaredMethod("shouldReportThis", nodeType, nodeType);
        shouldReportThisMethod.setAccessible(true);
        java.lang.Object[] shouldReportThisMethodArguments = new java.lang.Object[2];
        shouldReportThisMethodArguments[0] = ((Object) null);
        shouldReportThisMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) shouldReportThisMethod.invoke(checkGlobalThis, shouldReportThisMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method shouldReportThis(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (assignLhsChild != null): False}
    /// return from: {@code return parent != null && NodeUtil.isGet(parent);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldReportThis(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent != null && NodeUtil.isGet(parent);}
 *  */
    @Test
    public void testShouldReportThis_ParentNotEqualsNullAndNodeUtilIsGet() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldReportThisMethod = checkGlobalThisClazz.getDeclaredMethod("shouldReportThis", nodeType, nodeType);
        shouldReportThisMethod.setAccessible(true);
        java.lang.Object[] shouldReportThisMethodArguments = new java.lang.Object[2];
        shouldReportThisMethodArguments[0] = ((Object) null);
        shouldReportThisMethodArguments[1] = functionNode;
        boolean actual = ((Boolean) shouldReportThisMethod.invoke(checkGlobalThis, shouldReportThisMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldReportThis(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent != null && NodeUtil.isGet(parent);}
 *  */
    @Test
    public void testShouldReportThis_ParentNotEqualsNullAndNodeUtilIsGet_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(35);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldReportThisMethod = checkGlobalThisClazz.getDeclaredMethod("shouldReportThis", nodeType, nodeType);
        shouldReportThisMethod.setAccessible(true);
        java.lang.Object[] shouldReportThisMethodArguments = new java.lang.Object[2];
        shouldReportThisMethodArguments[0] = ((Object) null);
        shouldReportThisMethodArguments[1] = functionNode;
        boolean actual = ((Boolean) shouldReportThisMethod.invoke(checkGlobalThis, shouldReportThisMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldReportThis(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent != null && NodeUtil.isGet(parent);}
 *  */
    @Test
    public void testShouldReportThis_ParentEqualsNullAndNodeUtilIsGet_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldReportThisMethod = checkGlobalThisClazz.getDeclaredMethod("shouldReportThis", nodeType, nodeType);
        shouldReportThisMethod.setAccessible(true);
        java.lang.Object[] shouldReportThisMethodArguments = new java.lang.Object[2];
        shouldReportThisMethodArguments[0] = ((Object) null);
        shouldReportThisMethodArguments[1] = functionNode;
        boolean actual = ((Boolean) shouldReportThisMethod.invoke(checkGlobalThis, shouldReportThisMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#shouldReportThis(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent != null && NodeUtil.isGet(parent);}
 *  */
    @Test
    public void testShouldReportThis_ParentEqualsNullAndNodeUtilIsGet() throws Exception  {
        CheckGlobalThis checkGlobalThis = ((CheckGlobalThis) createInstance("com.google.javascript.jscomp.CheckGlobalThis"));
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldReportThisMethod = checkGlobalThisClazz.getDeclaredMethod("shouldReportThis", nodeType, nodeType);
        shouldReportThisMethod.setAccessible(true);
        java.lang.Object[] shouldReportThisMethodArguments = new java.lang.Object[2];
        shouldReportThisMethodArguments[0] = ((Object) null);
        shouldReportThisMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) shouldReportThisMethod.invoke(checkGlobalThis, shouldReportThisMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionJsDocInfo(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): False}
 * @utbot.executesCondition {@code (parentType == Token.ASSIGN): False}
 * @utbot.returnsFrom {@code return jsDoc;}
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ParentTypeNotEqualsTokenASSIGN() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        JSDocInfo actual = ((JSDocInfo) getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): False}
 * @utbot.executesCondition {@code (parentType == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): False}
 * @utbot.returnsFrom {@code return jsDoc;}
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ParentTypeNotEqualsTokenNAME() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(86);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        JSDocInfo actual = ((JSDocInfo) getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.executesCondition {@code (gramps.getType() == Token.VAR): False}
 * @utbot.returnsFrom {@code return jsDoc;}
 *  */
    @Test
    public void testGetFunctionJsDocInfo_GrampsGetTypeNotEqualsTokenVAR() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(38);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", scriptOrFnNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = scriptOrFnNode;
        JSDocInfo actual = ((JSDocInfo) getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.executesCondition {@code (gramps.getType() == Token.VAR): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.returnsFrom {@code return jsDoc;}
 *  */
    @Test
    public void testGetFunctionJsDocInfo_GrampsGetTypeEqualsTokenVAR() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(38);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(118);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(parent1, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", scriptOrFnNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = scriptOrFnNode;
        JSDocInfo actual = ((JSDocInfo) getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): False}
 * @utbot.returnsFrom {@code return jsDoc;}
 *  */
    @Test
    public void testGetFunctionJsDocInfo_JsDocNotEqualsNull() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", scriptOrFnNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = scriptOrFnNode;
        JSDocInfo actual = ((JSDocInfo) getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments));
        
        Object actualInfo = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "info");
        assertNull(actualInfo);
        
        Object actualDocumentation = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "documentation");
        assertNull(actualDocumentation);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        JSDocInfo.Visibility actualVisibility = actual.getVisibility();
        assertNull(actualVisibility);
        
        int objectValueBitset = ((Integer) getFieldValue(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        int actualBitset = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        assertEquals(objectValueBitset, actualBitset);
        
        JSTypeExpression actualType = actual.getType();
        assertNull(actualType);
        
        JSTypeExpression actualThisType = actual.getThisType();
        assertNull(actualThisType);
        
        boolean actualIncludeDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation"));
        assertFalse(actualIncludeDocumentation);
        
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.executesCondition {@code (jsDoc == null): False}
 * @utbot.returnsFrom {@code return jsDoc;}
 *  */
    @Test
    public void testGetFunctionJsDocInfo_JsDocNotEqualsNull_1() throws Exception  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", scriptOrFnNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = scriptOrFnNode;
        JSDocInfo actual = ((JSDocInfo) getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments));
        
        Object actualInfo = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "info");
        assertNull(actualInfo);
        
        Object actualDocumentation = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "documentation");
        assertNull(actualDocumentation);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        JSDocInfo.Visibility actualVisibility = actual.getVisibility();
        assertNull(actualVisibility);
        
        int objectValueBitset = ((Integer) getFieldValue(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        int actualBitset = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        assertEquals(objectValueBitset, actualBitset);
        
        JSTypeExpression actualType = actual.getType();
        assertNull(actualType);
        
        JSTypeExpression actualThisType = actual.getThisType();
        assertNull(actualThisType);
        
        boolean actualIncludeDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation"));
        assertFalse(actualIncludeDocumentation);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFunctionJsDocInfo(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo jsDoc = n.getJSDocInfo();
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowClassCastException() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1966)
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:174) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: jsDoc = parent.getJSDocInfo();
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowClassCastException_1() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1966)
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:179) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo jsDoc = n.getJSDocInfo();
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowNullPointerException() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:174) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", nodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = ((Object) null);
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int parentType = parent.getType();
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowNullPointerException_3() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:177) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int parentType = parent.getType();
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowNullPointerException_1() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:177) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int parentType = parent.getType();
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowNullPointerException_4() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:177) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckGlobalThis}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckGlobalThis#getFunctionJsDocInfo(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.executesCondition {@code (jsDoc == null): True}
 * @utbot.executesCondition {@code (parentType == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gramps.getType() == Token.VAR
 *  */
    @Test
    public void testGetFunctionJsDocInfo_ThrowNullPointerException_2() throws Throwable  {
        CheckGlobalThis checkGlobalThis = new CheckGlobalThis(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckGlobalThis.getFunctionJsDocInfo(CheckGlobalThis.java:182) */
        Class checkGlobalThisClazz = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionJsDocInfoMethod = checkGlobalThisClazz.getDeclaredMethod("getFunctionJsDocInfo", functionNodeType);
        getFunctionJsDocInfoMethod.setAccessible(true);
        java.lang.Object[] getFunctionJsDocInfoMethodArguments = new java.lang.Object[1];
        getFunctionJsDocInfoMethodArguments[0] = functionNode;
        try {
            getFunctionJsDocInfoMethod.invoke(checkGlobalThis, getFunctionJsDocInfoMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields938820037561800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields938820037561800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass938820037569700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields938820037561800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass938820037569700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields938820037925700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields938820037925700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass938820037930000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields938820037925700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass938820037930000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


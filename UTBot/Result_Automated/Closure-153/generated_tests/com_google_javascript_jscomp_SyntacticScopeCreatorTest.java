package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.jstype.TemplateType;
import java.lang.reflect.Constructor;
import java.util.Map;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.JSDocInfo;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_SyntacticScopeCreatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.SyntacticScopeCreator.scanVars
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testScanVars_Return() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = new Node(118);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testScanVars_NodeUtilIsFunctionExpression() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.executesCondition {@code (fnName.isEmpty()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testScanVars_FnNameIsEmpty() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isControlStructure(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code for(Node child = n.getFirstChild(); child != null; )} once
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testScanVars_NodeUtilIsControlStructureOrNodeUtilIsStatementBlock() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isControlStructure(com.google.javascript.rhino.Node)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)) {
 *     for (Node child = n.getFirstChild(); child != null; ) {
 *         Node next = child.getNext();
 *         scanVars(child, n);
 *         child = next;
 *     }
 * }): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getProp(int)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testScanVars_NodeGetProp() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = new Node(132);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)): False}
 *  */
    @Test
    public void testScanVars_NodeUtilIsControlStructureOrNodeUtilIsStatementBlock_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = new Node(112);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)) {
 *     for (Node child = n.getFirstChild(); child != null; ) {
 *         Node next = child.getNext();
 *         scanVars(child, n);
 *         child = next;
 *     }
 * }): False}
 *  */
    @Test
    public void testScanVars_NodeUtilIsControlStructureOrNodeUtilIsStatementBlock_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = new Node(-255);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)): True}
 * @utbot.executesCondition {@code (if (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)) {
 *     for (Node child = n.getFirstChild(); child != null; ) {
 *         Node next = child.getNext();
 *         scanVars(child, n);
 *         child = next;
 *     }
 * }): True}
 *  */
    @Test
    public void testScanVars_NodeUtilIsControlStructureOrNodeUtilIsStatementBlock_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = new Node(125);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getProp(int)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: sourceName = (String) n.getProp(Node.SOURCENAME_PROP);
 *  */
    @Test
    public void testScanVars_ThrowClassCastException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:158) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:118) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = ((Object) null);
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String fnName = n.getFirstChild().getString();
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:136) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnName.isEmpty()
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:137) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.executesCondition {@code (fnName.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, n.getFirstChild(), n, parent, null, n);
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_5() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.Normalize$DuplicateDeclarationHandler");
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:141) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.executesCondition {@code (fnName.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, n.getFirstChild(), n, parent, null, n);
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_3() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:141) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getChildCount() == 2);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getFirstChild().getType() == Token.NAME);): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(var.getString(), var, n, parent, null, n);
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_7() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:153) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.executesCondition {@code (fnName.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, n.getFirstChild(), n, parent, null, n);
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_4() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:141) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", functionNodeType, functionNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = functionNode;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.executesCondition {@code (fnName.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, n.getFirstChild(), n, parent, null, n);
 *  */
    @Test
    public void testScanVars_ThrowNullPointerException_6() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "\u0000";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", string);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:240)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:141) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", functionNodeType, functionNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = functionNode;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getChildCount() == 2);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 2);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = new Node(120);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: NodeUtil.isFunctionExpression(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String fnName = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException_5() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionExpression(n)): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String fnName = n.getFirstChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanVars_ThrowUnsupportedOperationException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getChildCount() == 2);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getChildCount() == 2);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node child = n.getFirstChild(); child != null; )} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(child.getType() == Token.NAME);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException_4() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node child = n.getFirstChild(); child != null; )} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = child.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanVars_ThrowUnsupportedOperationException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getChildCount() == 2);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getFirstChild().getType() == Token.NAME);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getFirstChild().getType() == Token.NAME);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException_3() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getChildCount() == 2);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getFirstChild().getType() == Token.NAME);): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareVar(var.getString(), var, n, parent, null, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanVars_ThrowUnsupportedOperationException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isControlStructure(n) || NodeUtil.isStatementBlock(n)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isControlStructure(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code for(Node child = n.getFirstChild(); child != null; )} once
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanVars(child, n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanVars_ThrowIllegalStateException_6() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(120);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", scriptOrFnNodeType, scriptOrFnNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = scriptOrFnNode;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testScanVars1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = node;
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    @Test
    public void testScanVars2() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    @Test
    public void testScanVars3() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000aaaaaaaa";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", functionNodeType, functionNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = functionNode;
        scanVarsMethodArguments[1] = ((Object) null);
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    
    @Test
    public void testScanVars4() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = stringNode;
        scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testScanVars5() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:153)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = scriptOrFnNode;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testScanVars6() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(126);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:136)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", numberNodeType, numberNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = numberNode;
        scanVarsMethodArguments[1] = node;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testScanVars7() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:126)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", scriptOrFnNodeType, scriptOrFnNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = scriptOrFnNode;
        scanVarsMethodArguments[1] = stringNode;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testScanVars8() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:137)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = stringNode;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testScanVars9() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:126)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", stringNodeType, stringNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = stringNode;
        scanVarsMethodArguments[1] = ((Object) null);
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testScanVars10() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:136)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", nodeType, nodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = node;
        scanVarsMethodArguments[1] = node;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testScanVars11() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler");
        SyntacticScopeCreator this$0 = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope1 = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(scope1, "com.google.javascript.jscomp.Scope", "vars", vars1);
        setField(this$0, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope1);
        setField(redeclarationHandler, "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler", "this$0", this$0);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", string);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanVars] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler.onRedeclaration(SyntacticScopeCreator.java:194)
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:240)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:141) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", numberNodeType, numberNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = numberNode;
        scanVarsMethodArguments[1] = functionNode;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testScanVars12() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", stringNodeType, stringNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = stringNode;
        scanVarsMethodArguments[1] = functionNode;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testScanVars13() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next3, "com.google.javascript.rhino.Node", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method scanVarsMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanVars", stringNodeType, stringNodeType);
        scanVarsMethod.setAccessible(true);
        java.lang.Object[] scanVarsMethodArguments = new java.lang.Object[2];
        scanVarsMethodArguments[0] = stringNode;
        scanVarsMethodArguments[1] = node;
        try {
            scanVarsMethod.invoke(syntacticScopeCreator, scanVarsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scanRoot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = new Node(118);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot_2() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = new Node(-255);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot_3() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = new Node(125);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot_5() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot_1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot_4() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", scriptOrFnNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = scriptOrFnNode;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 *  */
    @Test
    public void testScanRoot_6() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getProp(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 *  */
    @Test
    public void testScanRoot_SyntacticScopeCreatorScanVars() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(83);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(118);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scanRoot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: scanVars(n, null);
 *  */
    @Test
    public void testScanRoot_ThrowClassCastException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:158)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:110) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: sourceName = (String) n.getProp(Node.SOURCENAME_PROP);
 *  */
    @Test
    public void testScanRoot_ThrowClassCastException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:84) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Node args = fnNameNode.getNext();
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:87) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.FUNCTION
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:83) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = ((Object) null);
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(scope.getParent() == null);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:109) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Node body = args.getNext();
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_3() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:88) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", functionNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = functionNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !fnName.isEmpty() && NodeUtil.isFunctionExpression(n)
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_4() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:93) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", functionNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = functionNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanVars(n, null);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_10() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(126);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:136)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:110) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanVars(n, null);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_11() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:137)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:168)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:110) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(a.getString(), a, args, n, null, n);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_6() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(83);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:102) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.invokes com.google.javascript.jscomp.SyntacticScopeCreator#scanVars(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanVars(body, n);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_5() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(83);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:118)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:106) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, fnNameNode, n, null, null, n);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_8() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:94) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanVars(n, null);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_12() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:153)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:110) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, fnNameNode, n, null, null, n);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_7() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:94) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", scriptOrFnNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = scriptOrFnNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareVar(fnName, fnNameNode, n, null, null, n);
 *  */
    @Test
    public void testScanRoot_ThrowNullPointerException_9() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "\u0000";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", string);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", next);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:240)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:94) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", functionNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = functionNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scanRoot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(scope.getParent() == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = new Node(-255);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanVars(n, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_5() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanVars(n, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_6() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: scanVars(n, null);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanRoot_ThrowUnsupportedOperationException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String fnName = fnNameNode.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String fnName = fnNameNode.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanRoot_ThrowUnsupportedOperationException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", functionNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = functionNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanVars(n, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_7() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: scanVars(n, null);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanRoot_ThrowUnsupportedOperationException_3() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_8() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(args.getType() == Token.LP);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_3() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "\u0000";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(126);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", nodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = node;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareVar(a.getString(), a, args, n, null, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testScanRoot_ThrowUnsupportedOperationException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(83);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", functionNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = functionNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(a.getType() == Token.NAME);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_4() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(83);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", scriptOrFnNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = scriptOrFnNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#scanRoot(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !fnName.isEmpty() && NodeUtil.isFunctionExpression(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testScanRoot_ThrowIllegalStateException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "\u0000";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", sourceName);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method scanRootMethod = syntacticScopeCreatorClazz.getDeclaredMethod("scanRoot", functionNodeType, scopeType);
        scanRootMethod.setAccessible(true);
        java.lang.Object[] scanRootMethodArguments = new java.lang.Object[2];
        scanRootMethodArguments[0] = functionNode;
        scanRootMethodArguments[1] = ((Object) null);
        try {
            scanRootMethod.invoke(syntacticScopeCreator, scanRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SyntacticScopeCreator.declareVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareVar(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDeclareVar() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        vars.put(null, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.Normalize$DuplicateDeclarationHandler");
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        Node node = new Node(-255);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, jSTypeType, scriptOrFnNodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = ((Object) null);
        declareVarMethodArguments[1] = scriptOrFnNode;
        declareVarMethodArguments[2] = node;
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDeclareVar_1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        nameNode.setType(120);
        setField(nameNode, "com.google.javascript.rhino.Node", "parent", nameNode);
        var.nameNode = nameNode;
        vars.put(null, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler");
        SyntacticScopeCreator this$0 = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope1 = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope1, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(this$0, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope1);
        setField(redeclarationHandler, "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler", "this$0", this$0);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        Node node = new Node(120);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = ((Object) null);
        declareVarMethodArguments[1] = ((Object) null);
        declareVarMethodArguments[2] = node;
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareVar(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (scope.isDeclared(name, false)): True}
 * @utbot.executesCondition {@code ((scope.isLocal() && name.equals(ARGUMENTS))): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (scope.isLocal() && name.equals(ARGUMENTS))
 *  */
    @Test
    public void testDeclareVar_ThrowNullPointerException_3() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.declareVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:239) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = ((Object) null);
        declareVarMethodArguments[1] = ((Object) null);
        declareVarMethodArguments[2] = ((Object) null);
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#isDeclared(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: scope.isDeclared(name, false) || (scope.isLocal() && name.equals(ARGUMENTS))
 *  */
    @Test
    public void testDeclareVar_ThrowNullPointerException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.declareVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:238) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = ((Object) null);
        declareVarMethodArguments[1] = ((Object) null);
        declareVarMethodArguments[2] = ((Object) null);
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (scope.isDeclared(name, false)): True}
 * @utbot.executesCondition {@code ((scope.isLocal() && name.equals(ARGUMENTS))): True}
 * @utbot.executesCondition {@code ((scope.isLocal() && name.equals(ARGUMENTS))): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.declare(name, n, declaredType, compiler.getInput(sourceName));
 *  */
    @Test
    public void testDeclareVar_ThrowNullPointerException_4() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.declareVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = string;
        declareVarMethodArguments[1] = ((Object) null);
        declareVarMethodArguments[2] = ((Object) null);
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (scope.isDeclared(name, false)): True}
 * @utbot.executesCondition {@code ((scope.isLocal() && name.equals(ARGUMENTS))): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.declare(name, n, declaredType, compiler.getInput(sourceName));
 *  */
    @Test
    public void testDeclareVar_ThrowNullPointerException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.declareVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = string;
        declareVarMethodArguments[1] = ((Object) null);
        declareVarMethodArguments[2] = ((Object) null);
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (scope.isDeclared(name, false)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler#onRedeclaration(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: redeclarationHandler.onRedeclaration(scope, name, n, parent, gramps, nodeWithLineNumber);
 *  */
    @Test
    public void testDeclareVar_ThrowNullPointerException_2() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.declareVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:240) */
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = string;
        declareVarMethodArguments[1] = ((Object) null);
        declareVarMethodArguments[2] = ((Object) null);
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareVar(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: redeclarationHandler.onRedeclaration(scope, name, n, parent, gramps, nodeWithLineNumber);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareVar_ThrowIllegalStateException() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        vars.put(null, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.Normalize$DuplicateDeclarationHandler");
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        Node node = new Node(-255);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = ((Object) null);
        declareVarMethodArguments[1] = node;
        declareVarMethodArguments[2] = ((Object) null);
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#declareVar(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: redeclarationHandler.onRedeclaration(scope, name, n, parent, gramps, nodeWithLineNumber);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareVar_ThrowIllegalStateException_1() throws Throwable  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        vars.put(null, null);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.Normalize$DuplicateDeclarationHandler");
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        Node node = new Node(38);
        Node node1 = new Node(118);
        
        Class syntacticScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareVarMethod = syntacticScopeCreatorClazz.getDeclaredMethod("declareVar", stringType, nodeType, nodeType, nodeType, jSTypeType, nodeType);
        declareVarMethod.setAccessible(true);
        java.lang.Object[] declareVarMethodArguments = new java.lang.Object[6];
        declareVarMethodArguments[0] = ((Object) null);
        declareVarMethodArguments[1] = node;
        declareVarMethodArguments[2] = node1;
        declareVarMethodArguments[3] = ((Object) null);
        declareVarMethodArguments[4] = ((Object) null);
        declareVarMethodArguments[5] = ((Object) null);
        try {
            declareVarMethod.invoke(syntacticScopeCreator, declareVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.SyntacticScopeCreator.createScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return returnedScope;}
 *  */
    @Test
    public void testCreateScope_ReturnReturnedScope() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next1.setType(118);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -256);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Scope actual = syntacticScopeCreator.createScope(rootNode1, scope1);
        
        Scope expected = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(expected, "com.google.javascript.jscomp.Scope", "vars", vars1);
        setField(expected, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(expected, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        
        Map expectedVars = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(expectedVars, actualVars));
        
        Scope expectedParent = expected.getParent();
        Scope actualParent = actual.getParent();
        Map expectedParentVars = ((Map) getFieldValue(expectedParent, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualParentVars = ((Map) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(expectedParentVars, actualParentVars));
        
        Scope actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Node expectedParentRootNode = expectedParent.getRootNode();
        Node actualParentRootNode = actualParent.getRootNode();
        double expectedParentRootNodeNumber = ((Double) getFieldValue(expectedParentRootNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualParentRootNodeNumber = ((Double) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(expectedParentRootNodeNumber, actualParentRootNodeNumber, 1.0E-6);
        
        int expectedParentRootNodeType = expectedParentRootNode.getType();
        int actualParentRootNodeType = actualParentRootNode.getType();
        org.junit.Assert.assertEquals(expectedParentRootNodeType, actualParentRootNodeType);
        
        Node actualParentRootNodeNext = actualParentRootNode.getNext();
        assertNull(actualParentRootNodeNext);
        
        Node actualParentRootNodeFirst = ((Node) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParentRootNodeFirst);
        
        Node actualParentRootNodeLast = ((Node) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParentRootNodeLast);
        
        Object actualParentRootNodePropListHead = getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParentRootNodePropListHead);
        
        int expectedParentRootNodeSourcePosition = ((Integer) getFieldValue(expectedParentRootNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualParentRootNodeSourcePosition = ((Integer) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        org.junit.Assert.assertEquals(expectedParentRootNodeSourcePosition, actualParentRootNodeSourcePosition);
        
        JSType actualParentRootNodeJsType = ((JSType) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParentRootNodeJsType);
        
        Node actualParentRootNodeParent = actualParentRootNode.getParent();
        assertNull(actualParentRootNodeParent);
        
        ObjectType actualParentThisType = ((ObjectType) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualParentThisType);
        
        boolean actualParentIsBottom = ((Boolean) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertTrue(actualParentIsBottom);
        
        Node expectedRootNode = expected.getRootNode();
        Node actualRootNode = actual.getRootNode();
        String actualRootNodeFunctionName = (((FunctionNode) actualRootNode)).getFunctionName();
        assertNull(actualRootNodeFunctionName);
        
        boolean actualRootNodeItsNeedsActivation = ((Boolean) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualRootNodeItsNeedsActivation);
        
        int expectedRootNodeItsFunctionType = ((Integer) getFieldValue(expectedRootNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualRootNodeItsFunctionType = ((Integer) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        org.junit.Assert.assertEquals(expectedRootNodeItsFunctionType, actualRootNodeItsFunctionType);
        
        boolean actualRootNodeItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualRootNodeItsIgnoreDynamicScope);
        
        int expectedRootNodeEncodedSourceStart = (((ScriptOrFnNode) expectedRootNode)).getEncodedSourceStart();
        int actualRootNodeEncodedSourceStart = (((ScriptOrFnNode) actualRootNode)).getEncodedSourceStart();
        org.junit.Assert.assertEquals(expectedRootNodeEncodedSourceStart, actualRootNodeEncodedSourceStart);
        
        int expectedRootNodeEncodedSourceEnd = (((ScriptOrFnNode) expectedRootNode)).getEncodedSourceEnd();
        int actualRootNodeEncodedSourceEnd = (((ScriptOrFnNode) actualRootNode)).getEncodedSourceEnd();
        org.junit.Assert.assertEquals(expectedRootNodeEncodedSourceEnd, actualRootNodeEncodedSourceEnd);
        
        String actualRootNodeSourceName = (((ScriptOrFnNode) actualRootNode)).getSourceName();
        assertNull(actualRootNodeSourceName);
        
        int expectedRootNodeBaseLineno = (((ScriptOrFnNode) expectedRootNode)).getBaseLineno();
        int actualRootNodeBaseLineno = (((ScriptOrFnNode) actualRootNode)).getBaseLineno();
        org.junit.Assert.assertEquals(expectedRootNodeBaseLineno, actualRootNodeBaseLineno);
        
        int expectedRootNodeEndLineno = (((ScriptOrFnNode) expectedRootNode)).getEndLineno();
        int actualRootNodeEndLineno = (((ScriptOrFnNode) actualRootNode)).getEndLineno();
        org.junit.Assert.assertEquals(expectedRootNodeEndLineno, actualRootNodeEndLineno);
        
        ObjArray actualRootNodeFunctions = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualRootNodeFunctions);
        
        ObjArray actualRootNodeRegexps = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRootNodeRegexps);
        
        ObjArray actualRootNodeItsVariables = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualRootNodeItsVariables);
        
        ObjArray actualRootNodeItsConst = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualRootNodeItsConst);
        
        ObjToIntMap actualRootNodeItsVariableNames = ((ObjToIntMap) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualRootNodeItsVariableNames);
        
        int expectedRootNodeVarStart = ((Integer) getFieldValue(expectedRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualRootNodeVarStart = ((Integer) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        org.junit.Assert.assertEquals(expectedRootNodeVarStart, actualRootNodeVarStart);
        
        Object actualRootNodeCompilerData = (((ScriptOrFnNode) actualRootNode)).getCompilerData();
        assertNull(actualRootNodeCompilerData);
        
        int expectedRootNodeType = expectedRootNode.getType();
        int actualRootNodeType = actualRootNode.getType();
        org.junit.Assert.assertEquals(expectedRootNodeType, actualRootNodeType);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        Node expectedRootNodeFirst = ((Node) getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "first"));
        Node actualRootNodeFirst = ((Node) getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "first"));
        String expectedRootNodeFirstStr = ((String) getFieldValue(expectedRootNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualRootNodeFirstStr = ((String) getFieldValue(actualRootNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedRootNodeFirstStr, actualRootNodeFirstStr);
        
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        Node expectedRootNodeFirstNext = expectedRootNodeFirst.getNext();
        Node actualRootNodeFirstNext = actualRootNodeFirst.getNext();
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        int expectedRootNodeFirstNextType = expectedRootNodeFirstNext.getType();
        int actualRootNodeFirstNextType = actualRootNodeFirstNext.getType();
        org.junit.Assert.assertEquals(expectedRootNodeFirstNextType, actualRootNodeFirstNextType);
        
        Node expectedRootNodeFirstNextNext = expectedRootNodeFirstNext.getNext();
        Node actualRootNodeFirstNextNext = actualRootNodeFirstNext.getNext();
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        int expectedRootNodeFirstNextNextType = expectedRootNodeFirstNextNext.getType();
        int actualRootNodeFirstNextNextType = actualRootNodeFirstNextNext.getType();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRootNodeFirstNextNextType, actualRootNodeFirstNextNextType));
        
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        Object expectedRootNodePropListHead = getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "propListHead");
        Object actualRootNodePropListHead = getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "propListHead");
        Object actualRootNodePropListHeadNext = getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "next");
        assertNull(actualRootNodePropListHeadNext);
        
        int expectedRootNodePropListHeadType = ((Integer) getFieldValue(expectedRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        int actualRootNodePropListHeadType = ((Integer) getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        org.junit.Assert.assertEquals(expectedRootNodePropListHeadType, actualRootNodePropListHeadType);
        
        int expectedRootNodePropListHeadIntValue = ((Integer) getFieldValue(expectedRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        int actualRootNodePropListHeadIntValue = ((Integer) getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        org.junit.Assert.assertEquals(expectedRootNodePropListHeadIntValue, actualRootNodePropListHeadIntValue);
        
        Object actualRootNodePropListHeadObjectValue = getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        assertNull(actualRootNodePropListHeadObjectValue);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        JSType expectedRootNodeJsType = ((JSType) getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "jsType"));
        JSType actualRootNodeJsType = ((JSType) getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "jsType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        org.junit.Assert.assertEquals(expectedRootNodeJsType, actualRootNodeJsType);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        
        assertTrue(deepEquals(expected, actual));
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope finalSyntacticScopeCreatorScope = ((Scope) getFieldValue(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope"));
        
        assertNull(finalSyntacticScopeCreatorScope);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.returnsFrom {@code return returnedScope;}
 *  */
    @Test
    public void testCreateScope_ReturnReturnedScope_1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next1.setType(113);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -256);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        Scope actual = syntacticScopeCreator.createScope(rootNode1, scope1);
        
        Scope expected = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(expected, "com.google.javascript.jscomp.Scope", "vars", vars1);
        setField(expected, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(expected, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        
        Map expectedVars = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(expectedVars, actualVars));
        
        Scope expectedParent = expected.getParent();
        Scope actualParent = actual.getParent();
        Map expectedParentVars = ((Map) getFieldValue(expectedParent, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualParentVars = ((Map) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(expectedParentVars, actualParentVars));
        
        Scope actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Node expectedParentRootNode = expectedParent.getRootNode();
        Node actualParentRootNode = actualParent.getRootNode();
        double expectedParentRootNodeNumber = ((Double) getFieldValue(expectedParentRootNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualParentRootNodeNumber = ((Double) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(expectedParentRootNodeNumber, actualParentRootNodeNumber, 1.0E-6);
        
        int expectedParentRootNodeType = expectedParentRootNode.getType();
        int actualParentRootNodeType = actualParentRootNode.getType();
        org.junit.Assert.assertEquals(expectedParentRootNodeType, actualParentRootNodeType);
        
        Node actualParentRootNodeNext = actualParentRootNode.getNext();
        assertNull(actualParentRootNodeNext);
        
        Node actualParentRootNodeFirst = ((Node) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParentRootNodeFirst);
        
        Node actualParentRootNodeLast = ((Node) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParentRootNodeLast);
        
        Object actualParentRootNodePropListHead = getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParentRootNodePropListHead);
        
        int expectedParentRootNodeSourcePosition = ((Integer) getFieldValue(expectedParentRootNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualParentRootNodeSourcePosition = ((Integer) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        org.junit.Assert.assertEquals(expectedParentRootNodeSourcePosition, actualParentRootNodeSourcePosition);
        
        JSType actualParentRootNodeJsType = ((JSType) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParentRootNodeJsType);
        
        Node actualParentRootNodeParent = actualParentRootNode.getParent();
        assertNull(actualParentRootNodeParent);
        
        ObjectType actualParentThisType = ((ObjectType) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualParentThisType);
        
        boolean actualParentIsBottom = ((Boolean) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertTrue(actualParentIsBottom);
        
        Node expectedRootNode = expected.getRootNode();
        Node actualRootNode = actual.getRootNode();
        String actualRootNodeFunctionName = (((FunctionNode) actualRootNode)).getFunctionName();
        assertNull(actualRootNodeFunctionName);
        
        boolean actualRootNodeItsNeedsActivation = ((Boolean) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualRootNodeItsNeedsActivation);
        
        int expectedRootNodeItsFunctionType = ((Integer) getFieldValue(expectedRootNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualRootNodeItsFunctionType = ((Integer) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        org.junit.Assert.assertEquals(expectedRootNodeItsFunctionType, actualRootNodeItsFunctionType);
        
        boolean actualRootNodeItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualRootNodeItsIgnoreDynamicScope);
        
        int expectedRootNodeEncodedSourceStart = (((ScriptOrFnNode) expectedRootNode)).getEncodedSourceStart();
        int actualRootNodeEncodedSourceStart = (((ScriptOrFnNode) actualRootNode)).getEncodedSourceStart();
        org.junit.Assert.assertEquals(expectedRootNodeEncodedSourceStart, actualRootNodeEncodedSourceStart);
        
        int expectedRootNodeEncodedSourceEnd = (((ScriptOrFnNode) expectedRootNode)).getEncodedSourceEnd();
        int actualRootNodeEncodedSourceEnd = (((ScriptOrFnNode) actualRootNode)).getEncodedSourceEnd();
        org.junit.Assert.assertEquals(expectedRootNodeEncodedSourceEnd, actualRootNodeEncodedSourceEnd);
        
        String actualRootNodeSourceName = (((ScriptOrFnNode) actualRootNode)).getSourceName();
        assertNull(actualRootNodeSourceName);
        
        int expectedRootNodeBaseLineno = (((ScriptOrFnNode) expectedRootNode)).getBaseLineno();
        int actualRootNodeBaseLineno = (((ScriptOrFnNode) actualRootNode)).getBaseLineno();
        org.junit.Assert.assertEquals(expectedRootNodeBaseLineno, actualRootNodeBaseLineno);
        
        int expectedRootNodeEndLineno = (((ScriptOrFnNode) expectedRootNode)).getEndLineno();
        int actualRootNodeEndLineno = (((ScriptOrFnNode) actualRootNode)).getEndLineno();
        org.junit.Assert.assertEquals(expectedRootNodeEndLineno, actualRootNodeEndLineno);
        
        ObjArray actualRootNodeFunctions = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualRootNodeFunctions);
        
        ObjArray actualRootNodeRegexps = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRootNodeRegexps);
        
        ObjArray actualRootNodeItsVariables = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualRootNodeItsVariables);
        
        ObjArray actualRootNodeItsConst = ((ObjArray) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualRootNodeItsConst);
        
        ObjToIntMap actualRootNodeItsVariableNames = ((ObjToIntMap) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualRootNodeItsVariableNames);
        
        int expectedRootNodeVarStart = ((Integer) getFieldValue(expectedRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualRootNodeVarStart = ((Integer) getFieldValue(actualRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        org.junit.Assert.assertEquals(expectedRootNodeVarStart, actualRootNodeVarStart);
        
        Object actualRootNodeCompilerData = (((ScriptOrFnNode) actualRootNode)).getCompilerData();
        assertNull(actualRootNodeCompilerData);
        
        int expectedRootNodeType = expectedRootNode.getType();
        int actualRootNodeType = actualRootNode.getType();
        org.junit.Assert.assertEquals(expectedRootNodeType, actualRootNodeType);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        Node expectedRootNodeFirst = ((Node) getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "first"));
        Node actualRootNodeFirst = ((Node) getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "first"));
        String expectedRootNodeFirstStr = ((String) getFieldValue(expectedRootNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualRootNodeFirstStr = ((String) getFieldValue(actualRootNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedRootNodeFirstStr, actualRootNodeFirstStr);
        
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        Node expectedRootNodeFirstNext = expectedRootNodeFirst.getNext();
        Node actualRootNodeFirstNext = actualRootNodeFirst.getNext();
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        int expectedRootNodeFirstNextType = expectedRootNodeFirstNext.getType();
        int actualRootNodeFirstNextType = actualRootNodeFirstNext.getType();
        org.junit.Assert.assertEquals(expectedRootNodeFirstNextType, actualRootNodeFirstNextType);
        
        Node expectedRootNodeFirstNextNext = expectedRootNodeFirstNext.getNext();
        Node actualRootNodeFirstNextNext = actualRootNodeFirstNext.getNext();
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        int expectedRootNodeFirstNextNextType = expectedRootNodeFirstNextNext.getType();
        int actualRootNodeFirstNextNextType = actualRootNodeFirstNextNext.getType();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRootNodeFirstNextNextType, actualRootNodeFirstNextNextType));
        
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        Object expectedRootNodePropListHead = getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "propListHead");
        Object actualRootNodePropListHead = getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "propListHead");
        Object actualRootNodePropListHeadNext = getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "next");
        assertNull(actualRootNodePropListHeadNext);
        
        int expectedRootNodePropListHeadType = ((Integer) getFieldValue(expectedRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        int actualRootNodePropListHeadType = ((Integer) getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        org.junit.Assert.assertEquals(expectedRootNodePropListHeadType, actualRootNodePropListHeadType);
        
        int expectedRootNodePropListHeadIntValue = ((Integer) getFieldValue(expectedRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        int actualRootNodePropListHeadIntValue = ((Integer) getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        org.junit.Assert.assertEquals(expectedRootNodePropListHeadIntValue, actualRootNodePropListHeadIntValue);
        
        Object actualRootNodePropListHeadObjectValue = getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        assertNull(actualRootNodePropListHeadObjectValue);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        JSType expectedRootNodeJsType = ((JSType) getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "jsType"));
        JSType actualRootNodeJsType = ((JSType) getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "jsType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        org.junit.Assert.assertEquals(expectedRootNodeJsType, actualRootNodeJsType);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        
        assertTrue(deepEquals(expected, actual));
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope finalSyntacticScopeCreatorScope = ((Scope) getFieldValue(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope"));
        
        assertNull(finalSyntacticScopeCreatorScope);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: scope = new Scope(parent, n);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateScope_ThrowIllegalArgumentException() {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        syntacticScopeCreator.createScope(null, scope);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanRoot(n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateScope_ThrowIllegalStateException() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Scope scope = new Scope(((Node) functionNode1), ((ObjectType) null));
        
        syntacticScopeCreator.createScope(functionNode, scope);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanRoot(n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateScope_ThrowIllegalStateException_3() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        Scope scope1 = new Scope(node, ((ObjectType) null));
        
        syntacticScopeCreator.createScope(functionNode, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanRoot(n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateScope_ThrowIllegalStateException_1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(40);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: scanRoot(n, parent);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateScope_ThrowUnsupportedOperationException() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanRoot(n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateScope_ThrowIllegalStateException_2() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(-255);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", str);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateScope_ThrowIllegalStateException_4() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -256);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", str);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scanRoot(n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateScope_ThrowIllegalStateException_5() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next1.setType(120);
        setField(next1, "com.google.javascript.rhino.Node", "first", next1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -256);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCreateScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 45 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:773)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:777)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:311)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:69) */
        syntacticScopeCreator.createScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testCreateScope_ThrowClassCastException_1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @6bf60172)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:777)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:827)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:296)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71) */
        syntacticScopeCreator.createScope(functionNode, scope);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowClassCastException() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = new SyntacticScopeCreator(null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Scope scope = new Scope(((Node) functionNode1), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:84)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(functionNode, scope);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowClassCastException_2() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:84)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_4() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", jsType);
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(scope, "com.google.javascript.jscomp.Scope", "thisType", jsType);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Scope scope1 = new Scope(((Node) rootNode), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:87)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:87)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:88)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_2() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:93)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    /**
    @utbot.classUnderTest {@link SyntacticScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.SyntacticScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scanRoot(n, parent);
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_3() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(SyntacticScopeCreator.java:118)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:106)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testCreateScope1() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        ScriptOrFnNode rootNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        EnumElementType thisType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parent, "com.google.javascript.jscomp.Scope", "thisType", thisType);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode parent1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent1.setType(125);
        setField(rootNode1, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(scope, "com.google.javascript.jscomp.Scope", "thisType", thisType);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        Scope scope1 = new Scope(((Node) rootNode), thisType);
        
        Scope actual = syntacticScopeCreator.createScope(rootNode1, scope1);
        
        Scope expected = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars1 = new LinkedHashMap();
        setField(expected, "com.google.javascript.jscomp.Scope", "vars", vars1);
        setField(expected, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(expected, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(expected, "com.google.javascript.jscomp.Scope", "thisType", thisType);
        
        Map expectedVars = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(expectedVars, actualVars));
        
        Scope expectedParent = expected.getParent();
        Scope actualParent = actual.getParent();
        Map expectedParentVars = ((Map) getFieldValue(expectedParent, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualParentVars = ((Map) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(expectedParentVars, actualParentVars));
        
        Scope actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Node expectedParentRootNode = expectedParent.getRootNode();
        Node actualParentRootNode = actualParent.getRootNode();
        int expectedParentRootNodeEncodedSourceStart = (((ScriptOrFnNode) expectedParentRootNode)).getEncodedSourceStart();
        int actualParentRootNodeEncodedSourceStart = (((ScriptOrFnNode) actualParentRootNode)).getEncodedSourceStart();
        org.junit.Assert.assertEquals(expectedParentRootNodeEncodedSourceStart, actualParentRootNodeEncodedSourceStart);
        
        int expectedParentRootNodeEncodedSourceEnd = (((ScriptOrFnNode) expectedParentRootNode)).getEncodedSourceEnd();
        int actualParentRootNodeEncodedSourceEnd = (((ScriptOrFnNode) actualParentRootNode)).getEncodedSourceEnd();
        org.junit.Assert.assertEquals(expectedParentRootNodeEncodedSourceEnd, actualParentRootNodeEncodedSourceEnd);
        
        String actualParentRootNodeSourceName = (((ScriptOrFnNode) actualParentRootNode)).getSourceName();
        assertNull(actualParentRootNodeSourceName);
        
        int expectedParentRootNodeBaseLineno = (((ScriptOrFnNode) expectedParentRootNode)).getBaseLineno();
        int actualParentRootNodeBaseLineno = (((ScriptOrFnNode) actualParentRootNode)).getBaseLineno();
        org.junit.Assert.assertEquals(expectedParentRootNodeBaseLineno, actualParentRootNodeBaseLineno);
        
        int expectedParentRootNodeEndLineno = (((ScriptOrFnNode) expectedParentRootNode)).getEndLineno();
        int actualParentRootNodeEndLineno = (((ScriptOrFnNode) actualParentRootNode)).getEndLineno();
        org.junit.Assert.assertEquals(expectedParentRootNodeEndLineno, actualParentRootNodeEndLineno);
        
        ObjArray actualParentRootNodeFunctions = ((ObjArray) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualParentRootNodeFunctions);
        
        ObjArray actualParentRootNodeRegexps = ((ObjArray) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualParentRootNodeRegexps);
        
        ObjArray actualParentRootNodeItsVariables = ((ObjArray) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualParentRootNodeItsVariables);
        
        ObjArray actualParentRootNodeItsConst = ((ObjArray) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualParentRootNodeItsConst);
        
        ObjToIntMap actualParentRootNodeItsVariableNames = ((ObjToIntMap) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualParentRootNodeItsVariableNames);
        
        int expectedParentRootNodeVarStart = ((Integer) getFieldValue(expectedParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualParentRootNodeVarStart = ((Integer) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        org.junit.Assert.assertEquals(expectedParentRootNodeVarStart, actualParentRootNodeVarStart);
        
        Object actualParentRootNodeCompilerData = (((ScriptOrFnNode) actualParentRootNode)).getCompilerData();
        assertNull(actualParentRootNodeCompilerData);
        
        int expectedParentRootNodeType = expectedParentRootNode.getType();
        int actualParentRootNodeType = actualParentRootNode.getType();
        org.junit.Assert.assertEquals(expectedParentRootNodeType, actualParentRootNodeType);
        
        Node actualParentRootNodeNext = actualParentRootNode.getNext();
        assertNull(actualParentRootNodeNext);
        
        Node actualParentRootNodeFirst = ((Node) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParentRootNodeFirst);
        
        Node actualParentRootNodeLast = ((Node) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParentRootNodeLast);
        
        Object actualParentRootNodePropListHead = getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParentRootNodePropListHead);
        
        int expectedParentRootNodeSourcePosition = ((Integer) getFieldValue(expectedParentRootNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualParentRootNodeSourcePosition = ((Integer) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        org.junit.Assert.assertEquals(expectedParentRootNodeSourcePosition, actualParentRootNodeSourcePosition);
        
        JSType actualParentRootNodeJsType = ((JSType) getFieldValue(actualParentRootNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParentRootNodeJsType);
        
        Node actualParentRootNodeParent = actualParentRootNode.getParent();
        assertNull(actualParentRootNodeParent);
        
        ObjectType expectedParentThisType = ((ObjectType) getFieldValue(expectedParent, "com.google.javascript.jscomp.Scope", "thisType"));
        ObjectType actualParentThisType = ((ObjectType) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "thisType"));
        JSType actualParentThisTypePrimitiveType = (((EnumElementType) actualParentThisType)).getPrimitiveType();
        assertNull(actualParentThisTypePrimitiveType);
        
        ObjectType actualParentThisTypePrimitiveObjectType = ((ObjectType) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType"));
        assertNull(actualParentThisTypePrimitiveObjectType);
        
        String actualParentThisTypeName = ((String) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.EnumElementType", "name"));
        assertNull(actualParentThisTypeName);
        
        boolean actualParentThisTypeVisited = ((Boolean) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualParentThisTypeVisited);
        
        JSDocInfo actualParentThisTypeDocInfo = ((JSDocInfo) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualParentThisTypeDocInfo);
        
        boolean actualParentThisTypeUnknown = ((Boolean) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualParentThisTypeUnknown);
        
        boolean actualParentThisTypeResolved = ((Boolean) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualParentThisTypeResolved);
        
        JSType actualParentThisTypeResolveResult = ((JSType) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualParentThisTypeResolveResult);
        
        JSTypeRegistry actualParentThisTypeRegistry = ((JSTypeRegistry) getFieldValue(actualParentThisType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualParentThisTypeRegistry);
        
        boolean actualParentIsBottom = ((Boolean) getFieldValue(actualParent, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertTrue(actualParentIsBottom);
        
        Node expectedRootNode = expected.getRootNode();
        Node actualRootNode = actual.getRootNode();
        String actualRootNodeFunctionName = (((FunctionNode) actualRootNode)).getFunctionName();
        assertNull(actualRootNodeFunctionName);
        
        boolean actualRootNodeItsNeedsActivation = ((Boolean) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualRootNodeItsNeedsActivation);
        
        int expectedRootNodeItsFunctionType = ((Integer) getFieldValue(expectedRootNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualRootNodeItsFunctionType = ((Integer) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        org.junit.Assert.assertEquals(expectedRootNodeItsFunctionType, actualRootNodeItsFunctionType);
        
        boolean actualRootNodeItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualRootNode, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualRootNodeItsIgnoreDynamicScope);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        int expectedRootNodeType = expectedRootNode.getType();
        int actualRootNodeType = actualRootNode.getType();
        org.junit.Assert.assertEquals(expectedRootNodeType, actualRootNodeType);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        Node expectedRootNodeFirst = ((Node) getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "first"));
        Node actualRootNodeFirst = ((Node) getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "first"));
        String expectedRootNodeFirstStr = ((String) getFieldValue(expectedRootNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualRootNodeFirstStr = ((String) getFieldValue(actualRootNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        org.junit.Assert.assertEquals(expectedRootNodeFirstStr, actualRootNodeFirstStr);
        
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        Node expectedRootNodeFirstNext = expectedRootNodeFirst.getNext();
        Node actualRootNodeFirstNext = actualRootNodeFirst.getNext();
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        int expectedRootNodeFirstNextType = expectedRootNodeFirstNext.getType();
        int actualRootNodeFirstNextType = actualRootNodeFirstNext.getType();
        org.junit.Assert.assertEquals(expectedRootNodeFirstNextType, actualRootNodeFirstNextType);
        
        Node expectedRootNodeFirstNextNext = expectedRootNodeFirstNext.getNext();
        Node actualRootNodeFirstNextNext = actualRootNodeFirstNext.getNext();
        double expectedRootNodeFirstNextNextNumber = ((Double) getFieldValue(expectedRootNodeFirstNextNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualRootNodeFirstNextNextNumber = ((Double) getFieldValue(actualRootNodeFirstNextNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedRootNodeFirstNextNextNumber, actualRootNodeFirstNextNextNumber));
        
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        assertTrue(deepEquals(expectedRootNodeFirstNextNext, actualRootNodeFirstNextNext));
        
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        assertTrue(deepEquals(expectedRootNodeFirstNext, actualRootNodeFirstNext));
        
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        assertTrue(deepEquals(expectedRootNodeFirst, actualRootNodeFirst));
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        Object expectedRootNodePropListHead = getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "propListHead");
        Object actualRootNodePropListHead = getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "propListHead");
        Object actualRootNodePropListHeadNext = getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "next");
        assertNull(actualRootNodePropListHeadNext);
        
        int expectedRootNodePropListHeadType = ((Integer) getFieldValue(expectedRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        int actualRootNodePropListHeadType = ((Integer) getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        org.junit.Assert.assertEquals(expectedRootNodePropListHeadType, actualRootNodePropListHeadType);
        
        int expectedRootNodePropListHeadIntValue = ((Integer) getFieldValue(expectedRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        int actualRootNodePropListHeadIntValue = ((Integer) getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        org.junit.Assert.assertEquals(expectedRootNodePropListHeadIntValue, actualRootNodePropListHeadIntValue);
        
        Object actualRootNodePropListHeadObjectValue = getFieldValue(actualRootNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        assertNull(actualRootNodePropListHeadObjectValue);
        
        assertTrue(deepEquals(expectedRootNode, actualRootNode));
        JSType expectedRootNodeJsType = ((JSType) getFieldValue(expectedRootNode, "com.google.javascript.rhino.Node", "jsType"));
        JSType actualRootNodeJsType = ((JSType) getFieldValue(actualRootNode, "com.google.javascript.rhino.Node", "jsType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        org.junit.Assert.assertEquals(expectedRootNodeJsType, actualRootNodeJsType);
        
        Node expectedRootNodeParent = expectedRootNode.getParent();
        Node actualRootNodeParent = actualRootNode.getParent();
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        int expectedRootNodeParentType = expectedRootNodeParent.getType();
        int actualRootNodeParentType = actualRootNodeParent.getType();
        org.junit.Assert.assertEquals(expectedRootNodeParentType, actualRootNodeParentType);
        
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        assertTrue(deepEquals(expectedRootNodeParent, actualRootNodeParent));
        
        assertTrue(deepEquals(expected, actual));
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope finalSyntacticScopeCreatorScope = ((Scope) getFieldValue(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope"));
        
        assertNull(finalSyntacticScopeCreatorScope);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(expected = IllegalStateException.class)
    public void testCreateScope2() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode.setType(105);
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(83);
        setField(next, "com.google.javascript.rhino.Node", "next", rootNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", str);
        Scope scope1 = new Scope(((Node) rootNode), ((ObjectType) null));
        
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testCreateScope3() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        ScriptOrFnNode rootNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        String sourceName = "";
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        Scope scope1 = new Scope(((Node) rootNode), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:87)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
    }
    
    @Test
    public void testCreateScope4() throws Exception  {
        SyntacticScopeCreator syntacticScopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        FunctionNode rootNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode1.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(rootNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(rootNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(rootNode1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(rootNode1, "com.google.javascript.rhino.Node", "parent", next);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode1);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope", scope);
        setField(syntacticScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", str);
        Class scopeClazz = Class.forName("com.google.javascript.jscomp.Scope");
        Class rootNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Constructor scopeConstructor = scopeClazz.getDeclaredConstructor(rootNodeType, objectTypeType);
        scopeConstructor.setAccessible(true);
        java.lang.Object[] scopeConstructorArguments = new java.lang.Object[2];
        scopeConstructorArguments[0] = rootNode;
        scopeConstructorArguments[1] = ((Object) null);
        Scope scope1 = ((Scope) scopeConstructor.newInstance(scopeConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.SyntacticScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(SyntacticScopeCreator.java:243)
            com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(SyntacticScopeCreator.java:94)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:74) */
        syntacticScopeCreator.createScope(rootNode1, scope1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields912864450589500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields912864450589500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass912864450595600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields912864450589500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass912864450595600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields912864450807400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields912864450807400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass912864450809100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields912864450807400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass912864450809100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


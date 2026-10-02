package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.LinkedList;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter;
import java.util.HashMap;
import java.util.Map;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer;
import com.google.javascript.jscomp.Normalize.NormalizeStatements;
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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_MakeDeclaredNamesUniqueTest {
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        makeDeclaredNamesUnique.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_DequePop() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        
        makeDeclaredNamesUnique.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_DequePop_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        makeDeclaredNamesUnique.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:158) */
        makeDeclaredNamesUnique.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:163) */
        makeDeclaredNamesUnique.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:142) */
        makeDeclaredNamesUnique.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.MakeDeclaredNamesUnique#getReplacementName(java.lang.String)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String newName = getReplacementName(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName(MakeDeclaredNamesUnique.java:173)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:144) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(makeDeclaredNamesUnique, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String newName = getReplacementName(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        makeDeclaredNamesUnique.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(makeDeclaredNamesUnique, visitMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit2() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:158) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("visit", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = scriptOrFnNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(makeDeclaredNamesUnique, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit3() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:163) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("visit", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = scriptOrFnNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(makeDeclaredNamesUnique, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#getContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.returnsFrom {@code return new ContextualRenameInverter(compiler);}
 *  */
    @Test
    public void testGetContextualRenameInverter_Return() throws Exception  {
        MakeDeclaredNamesUnique.ContextualRenameInverter actual = ((MakeDeclaredNamesUnique.ContextualRenameInverter) MakeDeclaredNamesUnique.getContextualRenameInverter(null));
        
        MakeDeclaredNamesUnique.ContextualRenameInverter expected = ((MakeDeclaredNamesUnique.ContextualRenameInverter) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter"));
        HashMap nameMap = new HashMap();
        setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap", nameMap);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "compiler"));
        assertNull(actualCompiler);
        
        Map expectedNameMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap"));
        Map actualNameMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap"));
        assertTrue(deepEquals(expectedNameMap, actualNameMap));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent.getType() != Token.FUNCTION): False}
 * @utbot.executesCondition {@code (n == parent.getFirstChild()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testFindDeclaredNames_NNotEqualsParentGetFirstChild() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = ((Object) null);
        findDeclaredNamesMethodArguments[1] = scriptOrFnNode;
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isVarDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#addDeclaredName(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testFindDeclaredNames_NodeUtilIsVarDeclaration() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        LinkedHashMap declarations = new LinkedHashMap();
        declarations.put(str, str);
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "declarations", declarations);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class inlineRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, inlineRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = inlineRenamer;
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isVarDeclaration(com.google.javascript.rhino.Node)} once
    /// execute conditions:
    ///     {@code (NodeUtil.isVarDeclaration(n)): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)} once
    /// execute conditions:
    ///     {@code (NodeUtil.isFunctionDeclaration(n)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent.getType() != Token.FUNCTION): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testFindDeclaredNames_ParentGetTypeNotEqualsTokenFUNCTION() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = new Node(0);
        Node node1 = new Node(-255);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = node1;
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 *  */
    @Test
    public void testFindDeclaredNames_ParentEqualsNull() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", functionNodeType, functionNodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = functionNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 *  */
    @Test
    public void testFindDeclaredNames_ParentEqualsNull_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:193) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_2() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:196) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", functionNodeType, functionNodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = functionNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_1() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        LinkedHashMap declarations = new LinkedHashMap();
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "declarations", declarations);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.getUniqueName(MakeDeclaredNamesUnique.java:467)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:462)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:193) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class inlineRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, inlineRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = inlineRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_3() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:196) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent.getType() != Token.FUNCTION): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_8() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(-255);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "global", true);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.reserveName(MakeDeclaredNamesUnique.java:419)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:392)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:193) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
        findDeclaredNamesMethodArguments[1] = node;
        findDeclaredNamesMethodArguments[2] = contextualRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_4() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "global", true);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.reserveName(MakeDeclaredNamesUnique.java:419)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:392)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:196) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", functionNodeType, functionNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = functionNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = contextualRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_7() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        LinkedHashMap declarations = new LinkedHashMap();
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "declarations", declarations);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.getUniqueName(MakeDeclaredNamesUnique.java:467)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:462)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:196) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class inlineRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, inlineRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = inlineRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_5() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object nameUsage = createInstance("com.google.common.collect.Synchronized$SynchronizedMultiset");
        int[] delegate = {};
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "nameUsage", nameUsage);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "global", true);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.common.collect.Synchronized$SynchronizedMultiset.setCount(Synchronized.java:544)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.reserveName(MakeDeclaredNamesUnique.java:419)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:392)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:196) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", functionNodeType, functionNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = functionNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = contextualRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_6() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        LinkedHashMap declarations = new LinkedHashMap();
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "declarations", declarations);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.incrementNameCount(MakeDeclaredNamesUnique.java:423)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:396)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:196) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = contextualRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindDeclaredNames_ThrowUnsupportedOperationException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: NodeUtil.isFunctionDeclaration(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFindDeclaredNames_ThrowIllegalStateException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFindDeclaredNames_ThrowIllegalStateException_1() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#addDeclaredName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test(expected = ClassCastException.class)
    public void testFindDeclaredNames_ThrowClassCastException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object nameUsage = createInstance("com.google.common.collect.Synchronized$SynchronizedMultiset");
        short[] delegate = {};
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        java.lang.Object[] mutex = createArray("java.util.Collections$CheckedSet", 0);
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "mutex", mutex);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "nameUsage", nameUsage);
        LinkedHashMap declarations = new LinkedHashMap();
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "declarations", declarations);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = node;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = contextualRenamer;
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    
    @Test
    public void testFindDeclaredNames1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        LinkedHashMap declarations = new LinkedHashMap();
        String string = "";
        declarations.put(null, string);
        declarations.put(string, null);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "declarations", declarations);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
        findDeclaredNamesMethodArguments[1] = ((Object) null);
        findDeclaredNamesMethodArguments[2] = contextualRenamer;
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReplacementName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#getReplacementName(java.lang.String)}
 * @utbot.invokes {@link java.util.Deque#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Renamer names: nameStack)
 *  */
    @Test
    public void testGetReplacementName_ThrowNullPointerException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName(MakeDeclaredNamesUnique.java:173) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringType = Class.forName("java.lang.String");
        Method getReplacementNameMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("getReplacementName", stringType);
        getReplacementNameMethod.setAccessible(true);
        java.lang.Object[] getReplacementNameMethodArguments = new java.lang.Object[1];
        getReplacementNameMethodArguments[0] = ((Object) null);
        try {
            getReplacementNameMethod.invoke(makeDeclaredNamesUnique, getReplacementNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getReplacementName(java.lang.String)
    
    @Test
    public void testGetReplacementName1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringType = Class.forName("java.lang.String");
        Method getReplacementNameMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("getReplacementName", stringType);
        getReplacementNameMethod.setAccessible(true);
        java.lang.Object[] getReplacementNameMethodArguments = new java.lang.Object[1];
        getReplacementNameMethodArguments[0] = ((Object) null);
        String actual = ((String) getReplacementNameMethod.invoke(makeDeclaredNamesUnique, getReplacementNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node declarationRoot = t.getScopeRoot();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:65) */
        makeDeclaredNamesUnique.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nameStack.isEmpty()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:596)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:65) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node fnParams = declarationRoot.getFirstChild().getNext();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_4() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        MakeDeclaredNamesUnique.InlineRenamer rootRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "rootRenamer", rootRenamer);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:81) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.iterates iterate the loop {@code for(Node c = fnParams.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(name);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_6() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        scopeRoots.add(functionNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:84) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findDeclaredNames(functionBody, null, renamer);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_7() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last)).setType(38);
        setField(last, "com.google.javascript.rhino.Node", "parent", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        scopeRoots.add(scriptOrFnNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:193)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:89) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_3() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:71) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): False}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): False}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.invokes com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findDeclaredNames(declarationRoot, null, renamer);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_5() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(scriptOrFnNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeDepth(NodeTraversal.java:610)
            com.google.javascript.jscomp.NodeTraversal.inGlobalScope(NodeTraversal.java:606)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:73) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nameStack.isEmpty()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        ScriptOrFnNode rootNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:67) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(t.inGlobalScope());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        MakeDeclaredNamesUnique.InlineRenamer rootRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "rootRenamer", rootRenamer);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        scopeRoots.add(scriptOrFnNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(t.inGlobalScope());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException_2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scopeRoots.add(scriptOrFnNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        MakeDeclaredNamesUnique.ContextualRenamer rootRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "rootRenamer", rootRenamer);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
     */
    @Test
    public void testEnterScopeThrowsNPE() {
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(contextualRenamer);
        Normalize.NormalizeStatements normalizeStatements = new Normalize.NormalizeStatements(null, true);
        NodeTraversal nodeTraversal = new NodeTraversal(null, normalizeStatements);
        ArrayDeque cfgs = new ArrayDeque();
        Object object = new Object();
        ControlFlowGraph controlFlowGraph = new ControlFlowGraph(object);
        cfgs.add(controlFlowGraph);
        Object object1 = new Object();
        ControlFlowGraph controlFlowGraph1 = new ControlFlowGraph(object1);
        cfgs.add(controlFlowGraph1);
        Object object2 = new Object();
        ControlFlowGraph controlFlowGraph2 = new ControlFlowGraph(object2);
        cfgs.add(controlFlowGraph2);
        nodeTraversal.cfgs = cfgs;
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:596)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:65) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (!t.inGlobalScope()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link java.util.Deque#pop()}
 *  */
    @Test
    public void testExitScope_NotTInGlobalScope() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        makeDeclaredNamesUnique.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.inGlobalScope()
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope(MakeDeclaredNamesUnique.java:99) */
        makeDeclaredNamesUnique.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (!t.inGlobalScope()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope(MakeDeclaredNamesUnique.java:100) */
        makeDeclaredNamesUnique.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NodeGetType() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// activate {@code switch(n.getType()) case: default}, invoke:
    ///     {@link java.util.Deque#peek()} once,
    ///     {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()} once,
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getString()} once,
    ///     {@link java.util.Deque#push(java.lang.Object)} once
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NameEqualsNull() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NameIsEmpty() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ParentEqualsNull() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!NodeUtil.isFunctionDeclaration(n)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_NodeUtilIsFunctionDeclaration() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(125);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, functionNode);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:112) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:127) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:112) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_6() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:127) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:107) */
        makeDeclaredNamesUnique.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = n.getFirstChild().getString();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:115) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#addDeclaredName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(name);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_5() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.incrementNameCount(MakeDeclaredNamesUnique.java:423)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:396)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:118) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, node);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = n.getFirstChild().getString();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_7() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:129) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#addDeclaredName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(name);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_8() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.getUniqueName(MakeDeclaredNamesUnique.java:467)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:462)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:130) */
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = n.getFirstChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testShouldTraverse_ThrowUnsupportedOperationException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testShouldTraverse_ThrowIllegalArgumentException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = n.getFirstChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testShouldTraverse_ThrowUnsupportedOperationException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: !NodeUtil.isFunctionDeclaration(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: renamer.addDeclaredName(name);
 *  */
    @Test(expected = ClassCastException.class)
    public void testShouldTraverse_ThrowClassCastException_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object nameUsage = createInstance("com.google.common.collect.Synchronized$SynchronizedMultiset");
        short[] delegate = {};
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        java.lang.Object[] mutex = createArray("com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$KeySet", 0);
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "mutex", mutex);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "nameUsage", nameUsage);
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: renamer.addDeclaredName(name);
 *  */
    @Test(expected = ClassCastException.class)
    public void testShouldTraverse_ThrowClassCastException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object nameUsage = createInstance("com.google.common.collect.Synchronized$SynchronizedMultiset");
        LinkedList delegate = new LinkedList();
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        java.lang.Object[] mutex = createArray("com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$KeySet", 0);
        setField(nameUsage, "com.google.common.collect.Synchronized$SynchronizedObject", "mutex", mutex);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "nameUsage", nameUsage);
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        makeDeclaredNamesUnique.shouldTraverse(null, scriptOrFnNode, functionNode);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields937217217474600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields937217217474600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass937217217483100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937217217474600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937217217483100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields937217217877500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields937217217877500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass937217217882200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937217217877500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937217217882200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


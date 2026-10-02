package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import java.util.LinkedList;
import java.util.ArrayDeque;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Deque;
import java.util.Map;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        makeDeclaredNamesUnique.visit(null, functionNode, null);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        makeDeclaredNamesUnique.visit(null, functionNode, null);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        makeDeclaredNamesUnique.visit(null, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: nameStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNoSuchElementException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:183) */
        makeDeclaredNamesUnique.visit(null, functionNode, null);
    }
    
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:174) */
        makeDeclaredNamesUnique.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:183) */
        makeDeclaredNamesUnique.visit(null, functionNode, null);
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:157) */
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName(MakeDeclaredNamesUnique.java:193)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:159) */
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        makeDeclaredNamesUnique.visit(null, functionNode, null);
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
    public void testVisit2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(MakeDeclaredNamesUnique.java:174) */
        makeDeclaredNamesUnique.visit(null, functionNode, null);
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
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            
            MakeDeclaredNamesUnique.ContextualRenameInverter actual = ((MakeDeclaredNamesUnique.ContextualRenameInverter) MakeDeclaredNamesUnique.getContextualRenameInverter(null));
            
            MakeDeclaredNamesUnique.ContextualRenameInverter expected = ((MakeDeclaredNamesUnique.ContextualRenameInverter) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter"));
            Set referencedNames = new LinkedHashSet();
            setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referencedNames", referencedNames);
            ArrayDeque referenceStack = new ArrayDeque();
            setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referenceStack", referenceStack);
            HashMap nameMap = new HashMap();
            setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap", nameMap);
            
            AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "compiler"));
            assertNull(actualCompiler);
            
            Set expectedReferencedNames = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referencedNames"));
            Set actualReferencedNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referencedNames"));
            assertTrue(deepEquals(expectedReferencedNames, actualReferencedNames));
            
            Deque expectedReferenceStack = ((Deque) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referenceStack"));
            Deque actualReferenceStack = ((Deque) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referenceStack"));
            assertTrue(deepEquals(expectedReferenceStack, actualReferenceStack));
            
            Map expectedNameMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap"));
            Map actualNameMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap"));
            assertTrue(deepEquals(expectedNameMap, actualNameMap));
            
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#getContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler)}
     */
    @Test
    public void testGetContextualRenameInverter() throws Exception  {
        MakeDeclaredNamesUnique.ContextualRenameInverter actual = ((MakeDeclaredNamesUnique.ContextualRenameInverter) MakeDeclaredNamesUnique.getContextualRenameInverter(null));
        
        MakeDeclaredNamesUnique.ContextualRenameInverter expected = ((MakeDeclaredNamesUnique.ContextualRenameInverter) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter"));
        Set referencedNames = new LinkedHashSet();
        setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referencedNames", referencedNames);
        ArrayDeque referenceStack = new ArrayDeque();
        setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referenceStack", referenceStack);
        HashMap nameMap = new HashMap();
        setField(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap", nameMap);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "compiler"));
        assertNull(actualCompiler);
        
        Set expectedReferencedNames = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referencedNames"));
        Set actualReferencedNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referencedNames"));
        assertTrue(deepEquals(expectedReferencedNames, actualReferencedNames));
        
        Deque expectedReferenceStack = ((Deque) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referenceStack"));
        Deque actualReferenceStack = ((Deque) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "referenceStack"));
        assertTrue(deepEquals(expectedReferenceStack, actualReferenceStack));
        
        Map expectedNameMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap"));
        Map actualNameMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", "nameMap"));
        assertTrue(deepEquals(expectedNameMap, actualNameMap));
        
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
        
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
        
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", idPrefix);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, node, functionNode);
        
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
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "\u0000";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
        
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:121) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:142) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:121) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_5() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:142) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:116) */
        makeDeclaredNamesUnique.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = n.getFirstChild().getString();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "\u0000";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:124) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Renamer renamer = nameStack.peek().forChildScope();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testShouldTraverse_ThrowIllegalArgumentException_1() throws Exception  {
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException() throws Exception  {
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException_2() throws Exception  {
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (!name.isEmpty()): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: !NodeUtil.isFunctionDeclaration(n)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException_1() throws Exception  {
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, functionNode1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testShouldTraverse1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "\u0000";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) boilerplateRenamer);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        nameStack.add(objectArray);
        nameStack.add(objectArray);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testShouldTraverse2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, functionNode, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testShouldTraverse3() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "\u0000";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, functionNode, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testShouldTraverse4() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "\u0000";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, functionNode, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testShouldTraverse5() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", idPrefix);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testShouldTraverse6() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:124) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    @Test
    public void testShouldTraverse7() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        nameStack.add(contextualRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:144) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    @Test
    public void testShouldTraverse8() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "arg\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.getUniqueName(MakeDeclaredNamesUnique.java:548)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:531)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:145) */
        makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testShouldTraverse9() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "aaaaaaaaa";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", idPrefix);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.getUniqueName(MakeDeclaredNamesUnique.java:548)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:531)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:145) */
        makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testShouldTraverse10() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        String idPrefix = "\u0000";
        setField(inlineRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer", "idPrefix", idPrefix);
        nameStack.add(inlineRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", idPrefix);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.getUniqueName(MakeDeclaredNamesUnique.java:548)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:531)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(MakeDeclaredNamesUnique.java:127) */
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, functionNode1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testShouldTraverse11() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(120);
        
        makeDeclaredNamesUnique.shouldTraverse(null, functionNode, null);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testShouldTraverse12() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer = ((MakeDeclaredNamesUnique.BoilerplateRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer"));
        String idPrefix = "\u0000";
        setField(boilerplateRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$BoilerplateRenamer", "idPrefix", idPrefix);
        nameStack.add(boilerplateRenamer);
        nameStack.add(null);
        nameStack.add(null);
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        makeDeclaredNamesUnique.shouldTraverse(nodeTraversal, functionNode, null);
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName(MakeDeclaredNamesUnique.java:193) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent.getType() != Token.FUNCTION): False}
 * @utbot.executesCondition {@code (n == parent.getFirstChild()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testFindDeclaredNames_NNotEqualsParentGetFirstChild() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", nodeType, nodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = ((Object) null);
        findDeclaredNamesMethodArguments[1] = functionNode;
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 *  */
    @Test
    public void testFindDeclaredNames_ParentGetTypeNotEqualsTokenFUNCTION() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#addDeclaredName(java.lang.String)}
 *  */
    @Test
    public void testFindDeclaredNames_NodeUtilIsVarDeclaration() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        LinkedHashMap declarations = new LinkedHashMap();
        declarations.put(str, str);
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
 *  */
    @Test
    public void testFindDeclaredNames_ParentGetTypeNotEqualsTokenFUNCTION_1() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", functionNodeType, functionNodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = functionNode;
        findDeclaredNamesMethodArguments[1] = functionNode1;
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
        functionNode.setType(-255);
        
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(-255);
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
    public void testFindDeclaredNames_ParentEqualsNull_2() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
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
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent.getType() != Token.FUNCTION): False}
 * @utbot.executesCondition {@code (n == parent.getFirstChild()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testFindDeclaredNames_NEqualsParentGetFirstChild() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(105);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", functionNode);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", functionNodeType, functionNodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = functionNode;
        findDeclaredNamesMethodArguments[1] = functionNode1;
        findDeclaredNamesMethodArguments[2] = ((Object) null);
        findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)}
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_3() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:530)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:213) */
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:213) */
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_4() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:216) */
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_6() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:530)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:216) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class inlineRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", scriptOrFnNodeType, scriptOrFnNodeType, inlineRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_1() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:462)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:213) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_2() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "global", true);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.reserveName(MakeDeclaredNamesUnique.java:487)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:459)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:213) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_5() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:216) */
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class renamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", scriptOrFnNodeType, scriptOrFnNodeType, renamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test
    public void testFindDeclaredNames_ThrowNullPointerException_7() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "global", true);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.reserveName(MakeDeclaredNamesUnique.java:487)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer.addDeclaredName(MakeDeclaredNamesUnique.java:459)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(MakeDeclaredNamesUnique.java:216) */
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
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindDeclaredNames_ThrowUnsupportedOperationException() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: renamer.addDeclaredName(nameNode.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindDeclaredNames_ThrowUnsupportedOperationException_3() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(n)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code for(Node c = n.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: findDeclaredNames(c, n, renamer);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindDeclaredNames_ThrowUnsupportedOperationException_4() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindDeclaredNames_ThrowUnsupportedOperationException_1() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object nameUsage = createInstance("com.google.common.collect.EmptyImmutableMultiset");
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "nameUsage", nameUsage);
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "global", true);
        
        Class makeDeclaredNamesUniqueClazz = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class contextualRenamerType = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Method findDeclaredNamesMethod = makeDeclaredNamesUniqueClazz.getDeclaredMethod("findDeclaredNames", stringNodeType, stringNodeType, contextualRenamerType);
        findDeclaredNamesMethod.setAccessible(true);
        java.lang.Object[] findDeclaredNamesMethodArguments = new java.lang.Object[3];
        findDeclaredNamesMethodArguments[0] = stringNode;
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
 * @utbot.executesCondition {@code (NodeUtil.isVarDeclaration(n)): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: renamer.addDeclaredName(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFindDeclaredNames_ThrowUnsupportedOperationException_2() throws Throwable  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = new MakeDeclaredNamesUnique(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer = ((MakeDeclaredNamesUnique.ContextualRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object nameUsage = createInstance("com.google.common.collect.EmptyImmutableMultiset");
        setField(contextualRenamer, "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer", "nameUsage", nameUsage);
        LinkedHashMap declarations = new LinkedHashMap();
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
        try {
            findDeclaredNamesMethod.invoke(makeDeclaredNamesUnique, findDeclaredNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:77) */
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
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:619)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:77) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node c = declarationRoot.getFirstChild().getNext().getFirstChild(); c != null; c = c.getNext())
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        scopeRoots.add(functionNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:92) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node c = declarationRoot.getFirstChild().getNext().getFirstChild(); c != null; c = c.getNext())
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_5() throws Exception  {
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
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        scopeRoots.add(scriptOrFnNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:92) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameStack.push(renamer);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_8() throws Exception  {
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
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        scopeRoots.add(functionNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:103) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.iterates iterate the loop {@code for(Node c = declarationRoot.getFirstChild().getNext().getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renamer.addDeclaredName(name);
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
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        scopeRoots.add(scriptOrFnNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:94) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(t.inGlobalScope());
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_10() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        LinkedList nameStack = new LinkedList();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:619)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:77) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nameStack.push(renamer);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_9() throws Exception  {
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
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(last, "com.google.javascript.rhino.Node", "parent", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        scopeRoots.add(functionNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:103) */
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:83) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (nameStack.isEmpty()): False}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION): True}
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer#forChildScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: findDeclaredNames(declarationRoot, null, renamer);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_6() throws Exception  {
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
            com.google.javascript.jscomp.NodeTraversal.getScopeDepth(NodeTraversal.java:633)
            com.google.javascript.jscomp.NodeTraversal.inGlobalScope(NodeTraversal.java:629)
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:85) */
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(MakeDeclaredNamesUnique.java:79) */
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link MakeDeclaredNamesUnique}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MakeDeclaredNamesUnique#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() != Token.FUNCTION || !(rootRenamer instanceof ContextualRenamer)): True}
 * @utbot.executesCondition {@code (declarationRoot.getType() == Token.FUNCTION): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.MakeDeclaredNamesUnique#findDeclaredNames(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: findDeclaredNames(functionBody, null, renamer);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnterScope_ThrowUnsupportedOperationException() throws Exception  {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique = ((MakeDeclaredNamesUnique) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        ArrayDeque nameStack = new ArrayDeque();
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "nameStack", nameStack);
        MakeDeclaredNamesUnique.InlineRenamer rootRenamer = ((MakeDeclaredNamesUnique.InlineRenamer) createInstance("com.google.javascript.jscomp.MakeDeclaredNamesUnique$InlineRenamer"));
        setField(makeDeclaredNamesUnique, "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "rootRenamer", rootRenamer);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(last, "com.google.javascript.rhino.Node", "parent", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        scopeRoots.add(functionNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        makeDeclaredNamesUnique.enterScope(nodeTraversal);
    }
    
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
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope(MakeDeclaredNamesUnique.java:108) */
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
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope(MakeDeclaredNamesUnique.java:109) */
        makeDeclaredNamesUnique.exitScope(nodeTraversal);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields891288645996900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields891288645996900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass891288646003400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891288645996900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891288646003400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields891288646605400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields891288646605400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass891288646609500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891288646605400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891288646609500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields891288647216200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields891288647216200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass891288647219500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891288647216200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891288647219500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields891288647779200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields891288647779200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass891288647782800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891288647779200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891288647782800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


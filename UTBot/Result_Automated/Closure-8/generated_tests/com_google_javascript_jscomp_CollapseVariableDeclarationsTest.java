package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_CollapseVariableDeclarationsTest {
    ///region Test suites for executable com.google.javascript.jscomp.CollapseVariableDeclarations.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: collapses.clear();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.process(CollapseVariableDeclarations.java:110) */
        collapseVariableDeclarations.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodesToCollapse.clear();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.process(CollapseVariableDeclarations.java:111) */
        collapseVariableDeclarations.process(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        collapses.add(null);
        collapses.add(null);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[2] = objectArray;
        collapses.add(objectArray);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        LinkedHashSet nodesToCollapse = new LinkedHashSet();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        nodesToCollapse.add(stringNode);
        nodesToCollapse.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "nodesToCollapse", nodesToCollapse);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.CollapseVariableDeclarations.process(CollapseVariableDeclarations.java:113) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(collapseVariableDeclarations, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        LinkedHashSet nodesToCollapse = new LinkedHashSet();
        nodesToCollapse.add(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        nodesToCollapse.add(node);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        nodesToCollapse.add(node1);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "nodesToCollapse", nodesToCollapse);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.CollapseVariableDeclarations.process(CollapseVariableDeclarations.java:113) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(collapseVariableDeclarations, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method applyCollapses()
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 *  */
    @Test
    public void testApplyCollapses() throws Exception  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 *  */
    @Test
    public void testApplyCollapses_NotRedeclaration() throws Exception  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(startNode, "com.google.javascript.rhino.Node", "first", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", startNode);
        collapses.add(collapse);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 *  */
    @Test
    public void testApplyCollapses_NotRedeclaration_1() throws Exception  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Node startNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", startNode);
        setField(first, "com.google.javascript.rhino.Node", "parent", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        setField(startNode, "com.google.javascript.rhino.Node", "last", first);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", startNode);
        collapses.add(collapse);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 *  */
    @Test
    public void testApplyCollapses_NotRedeclaration_2() throws Exception  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", startNode);
        setField(first, "com.google.javascript.rhino.Node", "parent", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        setField(startNode, "com.google.javascript.rhino.Node", "last", startNode);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(startNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", startNode);
        collapses.add(collapse);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method applyCollapses()
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Collapse collapse: collapses)
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:210) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: var.copyInformationFrom(collapse.startNode);
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_1() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:213) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: collapse.parent.addChildBefore(var, collapse.startNode);
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_7() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(startNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:214) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: collapse.parent.addChildBefore(var, collapse.startNode);
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_2() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(startNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:214) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node lhs = assign.getFirstChild();
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_3() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object endNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", endNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:229) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(lhs.isName());
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_4() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object endNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", endNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:230) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lhs.addChildToBack(rhs.detachFromParent());
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_5() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object endNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", endNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:232) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node next = n.getNext();
 *  */
    @Test
    public void testApplyCollapses_ThrowNullPointerException_6() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) startNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        setField(startNode, "com.google.javascript.rhino.Node", "last", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "last", last);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object endNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", endNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:218) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method applyCollapses()
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: var.copyInformationFrom(collapse.startNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testApplyCollapses_ThrowUnsupportedOperationException() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(startNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: collapse.parent.addChildBefore(var, collapse.startNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testApplyCollapses_ThrowIllegalArgumentException() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: collapse.parent.addChildBefore(var, collapse.startNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testApplyCollapses_ThrowIllegalArgumentException_1() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", startNode);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.RuntimeException} in: collapse.parent.addChildBefore(var, collapse.startNode);
 *  */
    @Test(expected = RuntimeException.class)
    public void testApplyCollapses_ThrowRuntimeException() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(lhs.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testApplyCollapses_ThrowIllegalStateException() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Node startNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object endNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", endNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CollapseVariableDeclarations}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CollapseVariableDeclarations#applyCollapses()}
 * @utbot.iterates iterate the loop {@code for(Collapse collapse: collapses)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: var.addChildToBack(lhs.detachFromParent());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testApplyCollapses_ThrowIllegalStateException_1() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "parent", last);
        setField(first2, "com.google.javascript.rhino.Node", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "first", first2);
        setField(last, "com.google.javascript.rhino.Node", "last", next);
        setField(first1, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", next);
        setField(startNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        Object endNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", endNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method applyCollapses()
    
    @Test
    public void testApplyCollapses1() throws Throwable  {
        CollapseVariableDeclarations collapseVariableDeclarations = ((CollapseVariableDeclarations) createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        ArrayList collapses = new ArrayList();
        Object collapse = createInstance("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse");
        Object startNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) startNode)).setType(118);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(startNode, "com.google.javascript.rhino.Node", "next", next);
        setField(startNode, "com.google.javascript.rhino.Node", "first", startNode);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(startNode, "com.google.javascript.rhino.Node", "last", last);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", startNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", startNode);
        setField(startNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "startNode", startNode);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "endNode", next);
        setField(collapse, "com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse", "parent", parent);
        collapses.add(collapse);
        collapses.add(null);
        collapses.add(null);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.CollapseVariableDeclarations", "collapses", collapses);
        
        /* This test fails because method [com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CollapseVariableDeclarations.applyCollapses(CollapseVariableDeclarations.java:213) */
        Class collapseVariableDeclarationsClazz = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Method applyCollapsesMethod = collapseVariableDeclarationsClazz.getDeclaredMethod("applyCollapses");
        applyCollapsesMethod.setAccessible(true);
        java.lang.Object[] applyCollapsesMethodArguments = new java.lang.Object[0];
        try {
            applyCollapsesMethod.invoke(collapseVariableDeclarations, applyCollapsesMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields881336136733500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields881336136733500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass881336136741300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields881336136733500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass881336136741300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


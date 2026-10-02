package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_PeepholeOptimizationsPassTest {
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.getCompiler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCompiler()
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#getCompiler()}
 * @utbot.returnsFrom {@code return compiler;}
 *  */
    @Test
    public void testGetCompiler_ReturnCompiler() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        AbstractCompiler actual = peepholeOptimizationsPass.getCompiler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_16() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        peepholeOptimizationsPass.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_3() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_2() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_12() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = stringNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_13() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} twice
 *  */
    @Test
    public void testVisit_IterateForEachLoop() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_4() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_14() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(86);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_15() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_9() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_5() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(4);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_6() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_7() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(49);
        setField(first1, "com.google.javascript.rhino.Node", "next", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-256);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = stringNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_8() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(38);
        setField(first1, "com.google.javascript.rhino.Node", "next", last);
        setField(first1, "com.google.javascript.rhino.Node", "first", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_10() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(57);
        setField(first1, "com.google.javascript.rhino.Node", "next", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testVisit_CurrentVersionOfNodeNotEqualsNull_11() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(47);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(49);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "first", next);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = stringNode;
        visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {null};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181) */
        peepholeOptimizationsPass.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AbstractPeepholeOptimization optimization: peepholeOptimizations)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:179) */
        peepholeOptimizationsPass.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.StatementFusion.canFuseIntoOneStatement(StatementFusion.java:67)
            com.google.javascript.jscomp.StatementFusion.optimizeSubtree(StatementFusion.java:39)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181) */
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(86);
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first2.setType(33);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.isPropertyAssignmentToName(PeepholeCollectPropertyAssignments.java:123)
            com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.optimizeSubtree(PeepholeCollectPropertyAssignments.java:50)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181) */
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(86);
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first2.setType(35);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.isPropertyAssignmentToName(PeepholeCollectPropertyAssignments.java:123)
            com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.optimizeSubtree(PeepholeCollectPropertyAssignments.java:50)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181) */
        peepholeOptimizationsPass.visit(node);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_3() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(118);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(86);
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first2.setType(33);
        Node first3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first3.setType(38);
        setField(first2, "com.google.javascript.rhino.Node", "first", first3);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first4 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first4);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = stringNode;
        try {
            visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(49);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first1);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("visit", numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = numberNode;
        try {
            visitMethod.invoke(peepholeOptimizationsPass, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(63);
        setField(first1, "com.google.javascript.rhino.Node", "next", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(-256);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        peepholeOptimizationsPass.visit(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#visit(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: optimization.optimizeSubtree(currentVersionOfNode)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_2() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(125);
        setField(first1, "com.google.javascript.rhino.Node", "next", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(-256);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        peepholeOptimizationsPass.visit(node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcess_2() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        peepholeOptimizationsPass.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcess_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcess() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcess_3() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        setField(exploitAssigns, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = new Node(105);
        
        peepholeOptimizationsPass.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcess_4() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcess_5() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        states.add(scopeState);
        states.add(null);
        states.add(null);
        states.add(null);
        states.add(null);
        states.add(null);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowIndexOutOfBoundsException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        setField(exploitAssigns, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        states.add(null);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth", -1);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack.peek(PeepholeOptimizationsPass.java:65)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.addChangeHandler(handler);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:106) */
        peepholeOptimizationsPass.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beginTraversal();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {null};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal(PeepholeOptimizationsPass.java:202)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:107) */
        peepholeOptimizationsPass.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:157)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        peepholeOptimizationsPass.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        setField(exploitAssigns, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:157)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        peepholeOptimizationsPass.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beginTraversal();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal(PeepholeOptimizationsPass.java:201)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:107) */
        peepholeOptimizationsPass.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_5() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        setField(exploitAssigns, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_6() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_7() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:126)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_8() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "compiler", compiler);
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:159)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.process(PeepholeOptimizationsPass.java:108) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(peepholeOptimizationsPass, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!shouldVisit(node)): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTraverse_NotShouldVisit() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: !shouldVisit(node)
 *  */
    @Test
    public void testTraverse_ThrowIndexOutOfBoundsException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        states.add(null);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth", -1);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack.peek(PeepholeOptimizationsPass.java:65)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !shouldVisit(node)
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:157)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = ((Object) null);
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !shouldVisit(node)
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_1() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !shouldVisit(node)
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_3() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!shouldVisit(node)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code while(c != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse(c);
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_4() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:126) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !shouldVisit(node)
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_2() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:159)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:118) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverse(com.google.javascript.rhino.Node)
    
    @Test
    public void testTraverse1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[5];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) statementFusion);
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) statementFusion);
        peepholeOptimizations[3] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[4] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse2() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[3];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse3() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse4() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse5() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse6() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[3];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) exploitAssigns);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse7() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[3];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse8() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse9() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse10() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        states.add(scopeState);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse11() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        states.add(scopeState);
        states.add(peepholeReplaceKnownMethods);
        states.add(peepholeReplaceKnownMethods);
        states.add(null);
        states.add(peepholeReplaceKnownMethods);
        states.add(peepholeReplaceKnownMethods);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    
    @Test
    public void testTraverse12() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        Object scopeState1 = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState1);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverse(com.google.javascript.rhino.Node)
    
    @Test
    public void testTraverse13() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[10];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[3] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:131) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse14() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[9];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) statementFusion);
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) exploitAssigns);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[3] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:131) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse15() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.StatementFusion.optimizeSubtree(StatementFusion.java:39)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:131) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse16() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[9];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) statementFusion);
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) exploitAssigns);
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        peepholeOptimizations[3] = ((AbstractPeepholeOptimization) peepholeReplaceKnownMethods);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:131) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse17() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[9];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) statementFusion);
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[3] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        states.add(scopeState);
        states.add(scopeState);
        states.add(scopeState);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:131) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverse18() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[3];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[2] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        states.add(scopeState);
        states.add(scopeState);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.StatementFusion.optimizeSubtree(StatementFusion.java:39)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(PeepholeOptimizationsPass.java:181)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(PeepholeOptimizationsPass.java:131) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverse(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTraverse19() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTraverse20() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments = ((PeepholeCollectPropertyAssignments) createInstance("com.google.javascript.jscomp.PeepholeCollectPropertyAssignments"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) peepholeCollectPropertyAssignments);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTraverse21() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", nodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = node;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTraverse22() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", numberNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = numberNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTraverse23() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[2];
        StatementFusion statementFusion = ((StatementFusion) createInstance("com.google.javascript.jscomp.StatementFusion"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) statementFusion);
        PeepholeRemoveDeadCode peepholeRemoveDeadCode = ((PeepholeRemoveDeadCode) createInstance("com.google.javascript.jscomp.PeepholeRemoveDeadCode"));
        peepholeOptimizations[1] = ((AbstractPeepholeOptimization) peepholeRemoveDeadCode);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        states.add(scopeState);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        states.add(peepholeRemoveDeadCode);
        states.add(peepholeRemoveDeadCode);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method traverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("traverse", stringNodeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = stringNode;
        try {
            traverseMethod.invoke(peepholeOptimizationsPass, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exitNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#exitNode(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): True}
 * @utbot.executesCondition {@code (if (node.isFunction() || node.isScript()) {
 *     traversalState.pop();
 * }): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isScript()}
 *  */
    @Test
    public void testExitNode_NodeIsFunctionOrNodeIsScript() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method exitNodeMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("exitNode", numberNodeType);
        exitNodeMethod.setAccessible(true);
        java.lang.Object[] exitNodeMethodArguments = new java.lang.Object[1];
        exitNodeMethodArguments[0] = numberNode;
        exitNodeMethod.invoke(peepholeOptimizationsPass, exitNodeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#exitNode(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack#pop()}
 *  */
    @Test
    public void testExitNode_NodeIsFunctionOrNodeIsScript_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth", -255);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method exitNodeMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("exitNode", numberNodeType);
        exitNodeMethod.setAccessible(true);
        java.lang.Object[] exitNodeMethodArguments = new java.lang.Object[1];
        exitNodeMethodArguments[0] = numberNode;
        exitNodeMethod.invoke(peepholeOptimizationsPass, exitNodeMethodArguments);
        
        Object peepholeOptimizationsPassTraversalState = getFieldValue(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState");
        int finalPeepholeOptimizationsPassTraversalStateCurrentDepth = ((Integer) getFieldValue(peepholeOptimizationsPassTraversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth"));
        
        assertEquals(-256, finalPeepholeOptimizationsPassTraversalStateCurrentDepth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#exitNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isFunction()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.isFunction() || node.isScript()
 *  */
    @Test
    public void testExitNode_ThrowNullPointerException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode(PeepholeOptimizationsPass.java:168) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method exitNodeMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("exitNode", nodeType);
        exitNodeMethod.setAccessible(true);
        java.lang.Object[] exitNodeMethodArguments = new java.lang.Object[1];
        exitNodeMethodArguments[0] = ((Object) null);
        try {
            exitNodeMethod.invoke(peepholeOptimizationsPass, exitNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#exitNode(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traversalState.pop();
 *  */
    @Test
    public void testExitNode_ThrowNullPointerException_1() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode(PeepholeOptimizationsPass.java:169) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method exitNodeMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("exitNode", numberNodeType);
        exitNodeMethod.setAccessible(true);
        java.lang.Object[] exitNodeMethodArguments = new java.lang.Object[1];
        exitNodeMethodArguments[0] = numberNode;
        try {
            exitNodeMethod.invoke(peepholeOptimizationsPass, exitNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#exitNode(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): True}
 * @utbot.executesCondition {@code (if (node.isFunction() || node.isScript()) {
 *     traversalState.pop();
 * }): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isScript()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traversalState.pop();
 *  */
    @Test
    public void testExitNode_ThrowNullPointerException_2() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode(PeepholeOptimizationsPass.java:169) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method exitNodeMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("exitNode", numberNodeType);
        exitNodeMethod.setAccessible(true);
        java.lang.Object[] exitNodeMethodArguments = new java.lang.Object[1];
        exitNodeMethodArguments[0] = numberNode;
        try {
            exitNodeMethod.invoke(peepholeOptimizationsPass, exitNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method beginTraversal()
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#beginTraversal()}
 *  */
    @Test
    public void testBeginTraversal() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method beginTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("beginTraversal");
        beginTraversalMethod.setAccessible(true);
        java.lang.Object[] beginTraversalMethodArguments = new java.lang.Object[0];
        beginTraversalMethod.invoke(peepholeOptimizationsPass, beginTraversalMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#beginTraversal()}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testBeginTraversal_AbstractPeepholeOptimizationBeginTraversal() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method beginTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("beginTraversal");
        beginTraversalMethod.setAccessible(true);
        java.lang.Object[] beginTraversalMethodArguments = new java.lang.Object[0];
        beginTraversalMethod.invoke(peepholeOptimizationsPass, beginTraversalMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method beginTraversal()
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#beginTraversal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AbstractPeepholeOptimization optimization: peepholeOptimizations)
 *  */
    @Test
    public void testBeginTraversal_ThrowNullPointerException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal(PeepholeOptimizationsPass.java:201) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method beginTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("beginTraversal");
        beginTraversalMethod.setAccessible(true);
        java.lang.Object[] beginTraversalMethodArguments = new java.lang.Object[0];
        try {
            beginTraversalMethod.invoke(peepholeOptimizationsPass, beginTraversalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#beginTraversal()}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimization.beginTraversal(compiler);
 *  */
    @Test
    public void testBeginTraversal_ThrowNullPointerException_1() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {null};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal(PeepholeOptimizationsPass.java:202) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method beginTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("beginTraversal");
        beginTraversalMethod.setAccessible(true);
        java.lang.Object[] beginTraversalMethodArguments = new java.lang.Object[0];
        try {
            beginTraversalMethod.invoke(peepholeOptimizationsPass, beginTraversalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldVisit(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isScript()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldVisit_NodeIsFunctionOrNodeIsScript() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", numberNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.executesCondition {@code (!previous.traverseChildScopes): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testShouldVisit_NotPreviousTraverseChildScopes() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", numberNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.executesCondition {@code (!previous.traverseChildScopes): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldVisit_PreviousTraverseChildScopes() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", stringNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments));
        
        assertTrue(actual);
        
        Object peepholeOptimizationsPassTraversalState = getFieldValue(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState");
        int finalPeepholeOptimizationsPassTraversalStateCurrentDepth = ((Integer) getFieldValue(peepholeOptimizationsPassTraversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth"));
        
        assertEquals(1, finalPeepholeOptimizationsPassTraversalStateCurrentDepth);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.executesCondition {@code (!previous.traverseChildScopes): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldVisit_PreviousTraverseChildScopes_1() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "traverseChildScopes", true);
        states.add(scopeState);
        Object scopeState1 = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState1);
        Object scopeState2 = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState2);
        states.add(scopeState2);
        states.add(null);
        states.add(scopeState2);
        states.add(scopeState2);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", stringNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments));
        
        assertTrue(actual);
        
        Object peepholeOptimizationsPassTraversalState = getFieldValue(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState");
        int finalPeepholeOptimizationsPassTraversalStateCurrentDepth = ((Integer) getFieldValue(peepholeOptimizationsPassTraversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth"));
        
        assertEquals(1, finalPeepholeOptimizationsPassTraversalStateCurrentDepth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldVisit(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ScopeState previous = traversalState.peek();
 *  */
    @Test
    public void testShouldVisit_ThrowIndexOutOfBoundsException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        states.add(null);
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "currentDepth", -1);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack.peek(PeepholeOptimizationsPass.java:65)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", numberNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = numberNode;
        try {
            shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isFunction()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.isFunction() || node.isScript()
 *  */
    @Test
    public void testShouldVisit_ThrowNullPointerException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:157) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", nodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = ((Object) null);
        try {
            shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ScopeState previous = traversalState.peek();
 *  */
    @Test
    public void testShouldVisit_ThrowNullPointerException_1() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", numberNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = numberNode;
        try {
            shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isScript()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ScopeState previous = traversalState.peek();
 *  */
    @Test
    public void testShouldVisit_ThrowNullPointerException_3() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:158) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", numberNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = numberNode;
        try {
            shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldVisit(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.isFunction() || node.isScript()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !previous.traverseChildScopes
 *  */
    @Test
    public void testShouldVisit_ThrowNullPointerException_2() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(PeepholeOptimizationsPass.java:159) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldVisitMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldVisit", numberNodeType);
        shouldVisitMethod.setAccessible(true);
        java.lang.Object[] shouldVisitMethodArguments = new java.lang.Object[1];
        shouldVisitMethodArguments[0] = numberNode;
        try {
            shouldVisitMethod.invoke(peepholeOptimizationsPass, shouldVisitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method endTraversal()
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#endTraversal()}
 *  */
    @Test
    public void testEndTraversal() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method endTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("endTraversal");
        endTraversalMethod.setAccessible(true);
        java.lang.Object[] endTraversalMethodArguments = new java.lang.Object[0];
        endTraversalMethod.invoke(peepholeOptimizationsPass, endTraversalMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#endTraversal()}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 *  */
    @Test
    public void testEndTraversal_AbstractPeepholeOptimizationEndTraversal() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = new com.google.javascript.jscomp.AbstractPeepholeOptimization[1];
        ExploitAssigns exploitAssigns = ((ExploitAssigns) createInstance("com.google.javascript.jscomp.ExploitAssigns"));
        peepholeOptimizations[0] = ((AbstractPeepholeOptimization) exploitAssigns);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method endTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("endTraversal");
        endTraversalMethod.setAccessible(true);
        java.lang.Object[] endTraversalMethodArguments = new java.lang.Object[0];
        endTraversalMethod.invoke(peepholeOptimizationsPass, endTraversalMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method endTraversal()
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#endTraversal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AbstractPeepholeOptimization optimization: peepholeOptimizations)
 *  */
    @Test
    public void testEndTraversal_ThrowNullPointerException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal(PeepholeOptimizationsPass.java:207) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method endTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("endTraversal");
        endTraversalMethod.setAccessible(true);
        java.lang.Object[] endTraversalMethodArguments = new java.lang.Object[0];
        try {
            endTraversalMethod.invoke(peepholeOptimizationsPass, endTraversalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#endTraversal()}
 * @utbot.iterates iterate the loop {@code for(AbstractPeepholeOptimization optimization: peepholeOptimizations)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optimization.endTraversal(compiler);
 *  */
    @Test
    public void testEndTraversal_ThrowNullPointerException_1() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations = {null};
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "peepholeOptimizations", peepholeOptimizations);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal(PeepholeOptimizationsPass.java:208) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Method endTraversalMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("endTraversal");
        endTraversalMethod.setAccessible(true);
        java.lang.Object[] endTraversalMethodArguments = new java.lang.Object[0];
        try {
            endTraversalMethod.invoke(peepholeOptimizationsPass, endTraversalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldRetraverse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): True}
 * @utbot.executesCondition {@code (node.isFunction()): True}
 * @utbot.executesCondition {@code (node.isScript()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testShouldRetraverse_NodeIsFunction() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", numberNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): False}
 * @utbot.executesCondition {@code (node.isScript()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testShouldRetraverse_NodeGetParentEqualsNull() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", numberNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): True}
 * @utbot.executesCondition {@code (node.isFunction()): False}
 * @utbot.executesCondition {@code (state.changed): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldRetraverse_StateChanged() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        setField(scopeState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState", "changed", true);
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", stringNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): True}
 * @utbot.executesCondition {@code (node.isFunction()): False}
 * @utbot.executesCondition {@code (state.changed): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testShouldRetraverse_NotStateChanged() throws Exception  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        Object scopeState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState");
        states.add(scopeState);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", numberNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldRetraverse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): True}
 * @utbot.executesCondition {@code (node.isFunction()): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: ScopeState state = traversalState.peek();
 *  */
    @Test
    public void testShouldRetraverse_ThrowIndexOutOfBoundsException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack.peek(PeepholeOptimizationsPass.java:65)
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse(PeepholeOptimizationsPass.java:142) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", nodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = node;
        try {
            shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getParent() != null && node.isFunction() || node.isScript()
 *  */
    @Test
    public void testShouldRetraverse_ThrowNullPointerException() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse(PeepholeOptimizationsPass.java:141) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", nodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = ((Object) null);
        try {
            shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): True}
 * @utbot.executesCondition {@code (node.isFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ScopeState state = traversalState.peek();
 *  */
    @Test
    public void testShouldRetraverse_ThrowNullPointerException_1() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse(PeepholeOptimizationsPass.java:142) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", numberNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = numberNode;
        try {
            shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): False}
 * @utbot.executesCondition {@code (node.isScript()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isScript()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ScopeState state = traversalState.peek();
 *  */
    @Test
    public void testShouldRetraverse_ThrowNullPointerException_2() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse(PeepholeOptimizationsPass.java:142) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", numberNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = numberNode;
        try {
            shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeOptimizationsPass}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeOptimizationsPass#shouldRetraverse(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (node.getParent() != null): True}
 * @utbot.executesCondition {@code (node.isFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: state.changed
 *  */
    @Test
    public void testShouldRetraverse_ThrowNullPointerException_3() throws Throwable  {
        PeepholeOptimizationsPass peepholeOptimizationsPass = ((PeepholeOptimizationsPass) createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object traversalState = createInstance("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack");
        ArrayList states = new ArrayList();
        states.add(null);
        setField(traversalState, "com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack", "states", states);
        setField(peepholeOptimizationsPass, "com.google.javascript.jscomp.PeepholeOptimizationsPass", "traversalState", traversalState);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse(PeepholeOptimizationsPass.java:143) */
        Class peepholeOptimizationsPassClazz = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldRetraverseMethod = peepholeOptimizationsPassClazz.getDeclaredMethod("shouldRetraverse", stringNodeType);
        shouldRetraverseMethod.setAccessible(true);
        java.lang.Object[] shouldRetraverseMethodArguments = new java.lang.Object[1];
        shouldRetraverseMethodArguments[0] = stringNode;
        try {
            shouldRetraverseMethod.invoke(peepholeOptimizationsPass, shouldRetraverseMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields882481660758800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields882481660758800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass882481660763300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields882481660758800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass882481660763300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields882481661911900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields882481661911900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass882481661913300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields882481661911900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass882481661913300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


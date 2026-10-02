package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_InlineCostEstimatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.InlineCostEstimator.getCost
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCost(com.google.javascript.rhino.Node)
    
    @Test
    public void testGetCost1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(116);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testGetCost2() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testGetCost3() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetCost4() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(43);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testGetCost5() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(39);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetCost6() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(44);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetCost7() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(41);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetCost8() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetCost9() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(117);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(8, actual);
    }
    
    @Test
    public void testGetCost10() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testGetCost11() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(83);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCost(com.google.javascript.rhino.Node)
    /// Actual number of generated tests (88) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test(expected = Error.class)
    public void testGetCost12() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(17);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost13() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost14() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost15() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(112);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost16() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost17() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost18() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost19() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost20() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost21() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost22() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost23() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost24() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost25() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost26() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(85);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost27() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(45);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost28() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(88);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost29() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost30() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(87);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost31() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost32() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(89);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost33() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost34() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost35() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost36() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost37() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost38() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(103);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost39() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(112);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost40() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost41() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost42() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost43() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost44() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(19);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost45() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(111);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost46() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(24);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost47() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost48() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(117);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost49() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost50() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost51() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(39);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost52() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost53() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(49);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost54() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost55() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost56() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(41);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost57() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(83);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost58() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(31);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost59() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(102);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost60() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost61() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(90);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCost(com.google.javascript.rhino.Node)
    
    @Test
    public void testGetCost62() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLatin(NodeUtil.java:2403)
            com.google.javascript.jscomp.CodeGenerator.identifierEscape(CodeGenerator.java:1107)
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:78)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:197)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost63() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:449)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost64() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(28);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost65() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(9);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost66() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost67() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(45);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost68() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(93);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost69() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(13);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost70() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost71() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(16);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost72() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(46);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost73() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(20);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost74() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost75() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost76() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(14);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost77() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(10);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost78() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(94);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost79() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost80() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(110);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:696)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost81() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:131)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = stringNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost82() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(95);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost83() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost84() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(91);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost85() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost86() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(22);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost87() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost88() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost89() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost90() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(19);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost91() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost92() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(89);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost93() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(88);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost94() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(96);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost95() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(24);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost96() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost97() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(25);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost98() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(90);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost99() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(87);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost100() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(18);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost101() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.isIndirectEval(CodeGenerator.java:788)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:510)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost102() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2583)
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2574)
            com.google.javascript.jscomp.NodeUtil.has(NodeUtil.java:2662)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:2195)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:616)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost103() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(77);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:131)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost104() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:532)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost105() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(97);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost106() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(15);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:39) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getCost(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testGetCost107() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(97);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testGetCost108() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testGetCost109() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(15);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", numberNodeType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[1];
        getCostMethodArguments[0] = numberNode;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.InlineCostEstimator.getCost
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCost(com.google.javascript.rhino.Node, int)
    
    @Test
    public void testGetCost110() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        int actual = InlineCostEstimator.getCost(node, -254);
        
        assertEquals(7, actual);
    }
    
    @Test
    public void testGetCost111() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(83);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testGetCost112() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testGetCost113() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(112);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        int actual = InlineCostEstimator.getCost(node, 0);
        
        assertEquals(8, actual);
    }
    
    @Test
    public void testGetCost114() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(103);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        int actual = InlineCostEstimator.getCost(node, 0);
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testGetCost115() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(116);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testGetCost116() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetCost117() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetCost118() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetCost119() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testGetCost120() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(117);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(8, actual);
    }
    
    @Test
    public void testGetCost121() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(41);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(4, actual);
    }
    
    @Test
    public void testGetCost122() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        int actual = ((Integer) getCostMethod.invoke(null, getCostMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testGetCost123() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(49);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        int actual = InlineCostEstimator.getCost(node, -255);
        
        assertEquals(6, actual);
    }
    
    @Test
    public void testGetCost124() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(31);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        int actual = InlineCostEstimator.getCost(node, 0);
        
        assertEquals(7, actual);
    }
    
    @Test
    public void testGetCost125() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(102);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        int actual = InlineCostEstimator.getCost(node, 0);
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCost(com.google.javascript.rhino.Node, int)
    /// Actual number of generated tests (148) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost126() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost127() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost128() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(117);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost129() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost130() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(44);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost131() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost132() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -254);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost133() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -254);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost134() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(103);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -254);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost135() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(112);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -254);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost136() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(83);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -254);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost137() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(31);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -254);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost138() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost139() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost140() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost141() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(23);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost142() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(10);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost143() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(80);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost144() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(41);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost145() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(39);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost146() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(43);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = Error.class)
    public void testGetCost147() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost148() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(111);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost149() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(42);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost150() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(49);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = Error.class)
    public void testGetCost151() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost152() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost153() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(35);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost154() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost155() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = Error.class)
    public void testGetCost156() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(116);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost157() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost158() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost159() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost160() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost161() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = Error.class)
    public void testGetCost162() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(117);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testGetCost163() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost164() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost165() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(25);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost166() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(19);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost167() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(90);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost168() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(10);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -252;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost169() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = Error.class)
    public void testGetCost170() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test(expected = Error.class)
    public void testGetCost171() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost172() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(25);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost173() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(19);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -252;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testGetCost174() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(90);
        
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -252;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testGetCost175() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        InlineCostEstimator.getCost(node, 0);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getCost(com.google.javascript.rhino.Node, int)
    
    @Test(timeout = 1000L)
    public void testGetCost176() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(timeout = 1000L)
    public void testGetCost177() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(74);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(timeout = 1000L)
    public void testGetCost178() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(99);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(timeout = 1000L)
    public void testGetCost179() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        InlineCostEstimator.getCost(node, -255);
    }
    
    @Test(timeout = 1000L)
    public void testGetCost180() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(17);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", stringNode);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", stringNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCost(com.google.javascript.rhino.Node, int)
    
    @Test
    public void testGetCost181() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:699)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost182() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.jsString(CodeGenerator.java:971)
            com.google.javascript.jscomp.CodeGenerator.addJsString(CodeGenerator.java:960)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:640)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost183() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(28);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost184() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyStatement(CodeGenerator.java:803)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:436)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test
    public void testGetCost185() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyStatement(CodeGenerator.java:803)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:479)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test
    public void testGetCost186() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost187() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(92);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost188() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(87);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost189() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(14);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost190() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(89);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost191() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(22);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost192() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(20);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost193() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(45);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost194() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost195() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(95);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost196() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost197() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost198() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(88);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost199() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost200() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost201() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(15);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost202() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(46);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost203() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(12);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost204() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost205() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(93);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost206() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:542)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost207() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.isIndirectEval(CodeGenerator.java:788)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:510)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost208() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:271)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost209() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLatin(NodeUtil.java:2403)
            com.google.javascript.jscomp.CodeGenerator.identifierEscape(CodeGenerator.java:1107)
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:78)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:194)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost210() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:131)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        InlineCostEstimator.getCost(node, 0);
    }
    
    @Test
    public void testGetCost211() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost212() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(94);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = -255;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost213() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2583)
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2574)
            com.google.javascript.jscomp.NodeUtil.has(NodeUtil.java:2662)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:2195)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:616)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost214() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:131)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost215() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost216() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(17);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getCostMethod = inlineCostEstimatorClazz.getDeclaredMethod("getCost", stringNodeType, intType);
        getCostMethod.setAccessible(true);
        java.lang.Object[] getCostMethodArguments = new java.lang.Object[2];
        getCostMethodArguments[0] = stringNode;
        getCostMethodArguments[1] = 0;
        try {
            getCostMethod.invoke(null, getCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetCost217() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.InlineCostEstimator.getCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.addNonEmptyStatement(CodeGenerator.java:803)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:542)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47) */
        InlineCostEstimator.getCost(node, 0);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields885872051002900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields885872051002900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass885872051008500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields885872051002900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass885872051008500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


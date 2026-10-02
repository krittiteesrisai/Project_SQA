package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_PrepareAstTest {
    ///region Test suites for executable com.google.javascript.jscomp.PrepareAst.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (checkOnly): False}
 * @utbot.executesCondition {@code (externs != null): False}
 * @utbot.executesCondition {@code (root != null): False}
 *  */
    @Test
    public void testProcess_RootEqualsNull() {
        PrepareAst prepareAst = new PrepareAst(null, false);
        
        prepareAst.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (checkOnly): True}
 *  */
    @Test
    public void testProcess_CheckOnly_1() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (checkOnly): True}
 *  */
    @Test
    public void testProcess_CheckOnly_2() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (checkOnly): True}
 *  */
    @Test
    public void testProcess_CheckOnly() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testProcess_ThrowUnsupportedOperationException() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testProcess_ThrowUnsupportedOperationException_1() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: normalizeNodeTypes(root);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: normalizeNodeTypes(root);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException_1() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        prepareAst.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: normalizeNodeTypes(root);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException_2() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        prepareAst.process(null, node);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PrepareAst}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
     */
    @Test
    public void testProcess() {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = new Node(-1);
        node.setType(2);
        Node node1 = new Node(Integer.MIN_VALUE, -1, -1);
        node1.setType(0);
        
        prepareAst.process(node, node1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    @Test
    public void testProcess4() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    @Test
    public void testProcess5() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    
    @Test
    public void testProcess6() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        processMethod.invoke(prepareAst, processMethodArguments);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testProcess7() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess8() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(77);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess9() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(125);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess10() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(111);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess11() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        prepareAst.process(null, node);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess12() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(112);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess13() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(113);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess14() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(objectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess15() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testProcess16() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(112);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess17() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess18() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(125);
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess19() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess20() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(objectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess21() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess22() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess23() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess24() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(119);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = prepareAstClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(prepareAst, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess25() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        prepareAst.process(null, node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PrepareAst.reportChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportChange()
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#reportChange()}
 * @utbot.executesCondition {@code (checkOnly): False}
 *  */
    @Test
    public void testReportChange_NotCheckOnly() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PrepareAst prepareAst = new PrepareAst(null, false);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Method reportChangeMethod = prepareAstClazz.getDeclaredMethod("reportChange");
        reportChangeMethod.setAccessible(true);
        java.lang.Object[] reportChangeMethodArguments = new java.lang.Object[0];
        reportChangeMethod.invoke(prepareAst, reportChangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reportChange()
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#reportChange()}
 * @utbot.executesCondition {@code (checkOnly): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(false, "normalizeNodeType constraints violated");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReportChange_ThrowIllegalStateException() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null, true);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Method reportChangeMethod = prepareAstClazz.getDeclaredMethod("reportChange");
        reportChangeMethod.setAccessible(true);
        java.lang.Object[] reportChangeMethodArguments = new java.lang.Object[0];
        try {
            reportChangeMethod.invoke(prepareAst, reportChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PrepareAst.normalizeBlocks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeBlocks(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks_1() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(126);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks_2() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(110);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks_5() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks_6() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(125);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks_3() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testNormalizeBlocks_4() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method normalizeBlocks(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Node newBlock = IR.block().srcref(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizeBlocks_ThrowUnsupportedOperationException() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(112);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: n.replaceChild(c, newBlock);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizeBlocks_ThrowUnsupportedOperationException_1() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalizeBlocks(com.google.javascript.rhino.Node)
    
    @Test
    public void testNormalizeBlocks1() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(125);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", next1);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node numberNodeFirstFirstNext = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "next"));
        Node initialNumberNodeFirstNextNext = ((Node) getFieldValue(numberNodeFirstFirstNext, "com.google.javascript.rhino.Node", "next"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        
        Node numberNodeFirst1 = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node numberNodeFirst1FirstNext = ((Node) getFieldValue(numberNodeFirst1, "com.google.javascript.rhino.Node", "next"));
        Node finalNumberNodeFirstNextNext = ((Node) getFieldValue(numberNodeFirst1FirstNext, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialNumberNodeFirstNextNext == finalNumberNodeFirstNextNext);
    }
    
    @Test
    public void testNormalizeBlocks2() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(112);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Node initialNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        
        Node finalNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNumberNodeFirst == finalNumberNodeFirst);
    }
    
    @Test
    public void testNormalizeBlocks3() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        NodeUtil objectValue = ((NodeUtil) createInstance("com.google.javascript.jscomp.NodeUtil"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Node initialNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", nodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = node;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        
        Node finalNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeFirst == finalNodeFirst);
    }
    
    @Test
    public void testNormalizeBlocks4() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        NodeUtil objectValue = ((NodeUtil) createInstance("com.google.javascript.jscomp.NodeUtil"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Node initialNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        
        Node finalNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNumberNodeFirst == finalNumberNodeFirst);
    }
    
    @Test
    public void testNormalizeBlocks5() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Node initialNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        
        Node finalNumberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNumberNodeFirst == finalNumberNodeFirst);
    }
    
    @Test
    public void testNormalizeBlocks6() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next2, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next2);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node initialNumberNodeFirstNext = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "next"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        
        Node numberNodeFirst1 = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node finalNumberNodeFirstNext = ((Node) getFieldValue(numberNodeFirst1, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialNumberNodeFirstNext == finalNumberNodeFirstNext);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method normalizeBlocks(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks7() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", stringNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = stringNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks8() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks9() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", nodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = node;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks10() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks11() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(125);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks12() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(119);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks13() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", nodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = node;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks14() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", nodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = node;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks15() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks16() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", next);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", numberNodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = numberNode;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeBlocks17() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(125);
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeBlocksMethod = prepareAstClazz.getDeclaredMethod("normalizeBlocks", nodeType);
        normalizeBlocksMethod.setAccessible(true);
        java.lang.Object[] normalizeBlocksMethodArguments = new java.lang.Object[1];
        normalizeBlocksMethodArguments[0] = node;
        try {
            normalizeBlocksMethod.invoke(prepareAst, normalizeBlocksMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PrepareAst.normalizeNodeTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeNodeTypes(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PrepareAst#normalizeBlocks(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testNormalizeNodeTypes_PrepareAstNormalizeBlocks() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method normalizeNodeTypes(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(child.getParent() == n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes_ThrowIllegalStateException() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: normalizeBlocks(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizeNodeTypes_ThrowUnsupportedOperationException_2() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: normalizeBlocks(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizeNodeTypes_ThrowUnsupportedOperationException() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: normalizeBlocks(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNormalizeNodeTypes_ThrowUnsupportedOperationException_1() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(child.getParent() == n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes_ThrowIllegalStateException_1() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrepareAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PrepareAst#normalizeNodeTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(child.getParent() == n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes_ThrowIllegalStateException_2() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalizeNodeTypes(com.google.javascript.rhino.Node)
    
    @Test
    public void testNormalizeNodeTypes1() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes2() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(111);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes3() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes4() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes5() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes6() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node initialStringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        
        Node stringNodeFirst1 = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node finalStringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst1, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialStringNodeFirstFirst == finalStringNodeFirstFirst);
    }
    
    @Test
    public void testNormalizeNodeTypes7() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(objectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Node initialStringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        
        Node finalStringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialStringNodeFirst == finalStringNodeFirst);
    }
    
    @Test
    public void testNormalizeNodeTypes8() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes9() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
    }
    
    @Test
    public void testNormalizeNodeTypes10() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        
        Node initialNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        
        Node finalNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeFirst == finalNodeFirst);
    }
    
    @Test
    public void testNormalizeNodeTypes11() throws Exception  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Node initialNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        
        Node finalNodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeFirst == finalNodeFirst);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method normalizeNodeTypes(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes12() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(113);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", node);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes13() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes14() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(108);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes15() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testNormalizeNodeTypes16() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(111);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method normalizeNodeTypes(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes17() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", numberNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = numberNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes18() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes19() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes20() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", stringNodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = stringNode;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes21() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(objectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes22() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(110);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(113);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "parent", node);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testNormalizeNodeTypes23() throws Throwable  {
        PrepareAst prepareAst = new PrepareAst(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class prepareAstClazz = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method normalizeNodeTypesMethod = prepareAstClazz.getDeclaredMethod("normalizeNodeTypes", nodeType);
        normalizeNodeTypesMethod.setAccessible(true);
        java.lang.Object[] normalizeNodeTypesMethodArguments = new java.lang.Object[1];
        normalizeNodeTypesMethodArguments[0] = node;
        try {
            normalizeNodeTypesMethod.invoke(prepareAst, normalizeNodeTypesMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields907913182428800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields907913182428800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass907913182433000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields907913182428800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass907913182433000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields907913182831900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields907913182831900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass907913182833800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields907913182831900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass907913182833800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


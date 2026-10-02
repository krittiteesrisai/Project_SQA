package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_ScopedAliasesTest {
    ///region Test suites for executable com.google.javascript.jscomp.ScopedAliases.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        scopedAliases.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-256);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        scopedAliases.process(null, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        scopedAliases.process(null, scriptOrFnNode);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(105);
        
        scopedAliases.process(functionNode, functionNode1);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = functionNode;
        processMethod.invoke(scopedAliases, processMethodArguments);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        scopedAliases.process(scriptOrFnNode, functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ScopedAliases.hotSwapScript
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException() {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
        scopedAliases.hotSwapScript(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_1() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
        scopedAliases.hotSwapScript(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_2() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
        scopedAliases.hotSwapScript(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_3() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:239)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:262)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:437)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
        scopedAliases.hotSwapScript(node, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testHotSwapScript1() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = scopedAliasesClazz.getDeclaredMethod("hotSwapScript", numberNodeType, numberNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = numberNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        hotSwapScriptMethod.invoke(scopedAliases, hotSwapScriptMethodArguments);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testHotSwapScript2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScopedAliases scopedAliases = new ScopedAliases(compiler, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = scopedAliasesClazz.getDeclaredMethod("hotSwapScript", numberNodeType, numberNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = numberNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(scopedAliases, hotSwapScriptMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields915833261443200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields915833261443200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass915833261450300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915833261443200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915833261450300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


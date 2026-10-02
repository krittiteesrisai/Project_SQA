package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
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
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
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
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(scopedAliases, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(scopedAliases, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(scopedAliases, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        processMethod.invoke(scopedAliases, processMethodArguments);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        processMethod.invoke(scopedAliases, processMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess3() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106)
            com.google.javascript.jscomp.ScopedAliases.process(ScopedAliases.java:100) */
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = scopedAliasesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(scopedAliases, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
        scopedAliases.hotSwapScript(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_1() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
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
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_2() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
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
    
    /**
    @utbot.classUnderTest {@link ScopedAliases}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ScopedAliases#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_3() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
        Class scopedAliasesClazz = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = scopedAliasesClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(scopedAliases, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testHotSwapScript1() throws Throwable  {
        ScopedAliases scopedAliases = new ScopedAliases(null, null, null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ScopedAliases.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.ScopedAliases.hotSwapScript(ScopedAliases.java:106) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields884909299504200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields884909299504200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass884909299511300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884909299504200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884909299511300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


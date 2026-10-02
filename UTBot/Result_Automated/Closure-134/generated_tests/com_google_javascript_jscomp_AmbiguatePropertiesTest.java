package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.Map;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.BooleanType;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.List;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.VoidType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_AmbiguatePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.getProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getProperty(java.lang.String)}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void testGetProperty_PropNotEqualsNull() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap propertyMap = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.jscomp.AmbiguateProperties$Property");
        propertyMap.put(null, property);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "propertyMap", propertyMap);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyMethod = ambiguatePropertiesClazz.getDeclaredMethod("getProperty", stringType);
        getPropertyMethod.setAccessible(true);
        java.lang.Object[] getPropertyMethodArguments = new java.lang.Object[1];
        getPropertyMethodArguments[0] = ((Object) null);
        Object actual = getPropertyMethod.invoke(ambiguateProperties, getPropertyMethodArguments);
        
        String actualOldName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.AmbiguateProperties$Property", "oldName"));
        assertNull(actualOldName);
        
        JSType actualType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.AmbiguateProperties$Property", "type"));
        assertNull(actualType);
        
        String actualNewName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.AmbiguateProperties$Property", "newName"));
        assertNull(actualNewName);
        
        int propertyNumOccurrences = ((Integer) getFieldValue(property, "com.google.javascript.jscomp.AmbiguateProperties$Property", "numOccurrences"));
        int actualNumOccurrences = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.AmbiguateProperties$Property", "numOccurrences"));
        assertEquals(propertyNumOccurrences, actualNumOccurrences);
        
        boolean actualSkipAmbiguating = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AmbiguateProperties$Property", "skipAmbiguating"));
        assertFalse(actualSkipAmbiguating);
        
        Object actualTypesSet = getFieldValue(actual, "com.google.javascript.jscomp.AmbiguateProperties$Property", "typesSet");
        assertNull(actualTypesSet);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property prop = propertyMap.get(name);
 *  */
    @Test
    public void testGetProperty_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.getProperty(AmbiguateProperties.java:524) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyMethod = ambiguatePropertiesClazz.getDeclaredMethod("getProperty", stringType);
        getPropertyMethod.setAccessible(true);
        java.lang.Object[] getPropertyMethodArguments = new java.lang.Object[1];
        getPropertyMethodArguments[0] = ((Object) null);
        try {
            getPropertyMethod.invoke(ambiguateProperties, getPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: prop = new Property(name);
 *  */
    @Test(expected = ClassCastException.class)
    public void testGetProperty_ThrowClassCastException_1() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap propertyMap = new LinkedHashMap();
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "propertyMap", propertyMap);
        Object intForType = createInstance("com.google.common.collect.Synchronized$SynchronizedBiMap");
        byte[] delegate = {};
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        java.lang.Object[] mutex = createArray("com.google.javascript.jscomp.mozilla.rhino.InterpretedFunction", 0);
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "mutex", mutex);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        String string = "";
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyMethod = ambiguatePropertiesClazz.getDeclaredMethod("getProperty", stringType);
        getPropertyMethod.setAccessible(true);
        java.lang.Object[] getPropertyMethodArguments = new java.lang.Object[1];
        getPropertyMethodArguments[0] = string;
        try {
            getPropertyMethod.invoke(ambiguateProperties, getPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: prop = new Property(name);
 *  */
    @Test(expected = ClassCastException.class)
    public void testGetProperty_ThrowClassCastException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap propertyMap = new LinkedHashMap();
        propertyMap.put(null, null);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "propertyMap", propertyMap);
        Object intForType = createInstance("com.google.common.collect.Synchronized$SynchronizedBiMap");
        LinkedHashMap delegate = new LinkedHashMap();
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        java.lang.Object[] mutex = createArray("com.google.javascript.jscomp.mozilla.rhino.InterpretedFunction", 0);
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "mutex", mutex);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyMethod = ambiguatePropertiesClazz.getDeclaredMethod("getProperty", stringType);
        getPropertyMethod.setAccessible(true);
        java.lang.Object[] getPropertyMethodArguments = new java.lang.Object[1];
        getPropertyMethodArguments[0] = ((Object) null);
        try {
            getPropertyMethod.invoke(ambiguateProperties, getPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:196) */
        ambiguateProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:196) */
        ambiguateProperties.process(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:196) */
        ambiguateProperties.process(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:196) */
        ambiguateProperties.process(node, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:200) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = ambiguatePropertiesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(ambiguateProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:197) */
        ambiguateProperties.process(node, null);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.process(AmbiguateProperties.java:200) */
        ambiguateProperties.process(functionNode, node);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess4() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = ambiguatePropertiesClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(ambiguateProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess5() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        java.lang.Object[] objectValue = createArray("com.google.javascript.jscomp.RenamePrototypes$ProcessExternedProperties", 0);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = ambiguatePropertiesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(ambiguateProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.getRenamingMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRenamingMap()
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getRenamingMap()}
 * @utbot.returnsFrom {@code return renamingMap;}
 *  */
    @Test
    public void testGetRenamingMap_ReturnRenamingMap() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        Map actual = ambiguateProperties.getRenamingMap();
        
        assertNull(actual);
        
        Map finalAmbiguatePropertiesRenamingMap = ((Map) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "renamingMap"));
        
        assertNull(finalAmbiguatePropertiesRenamingMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.getIntForType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIntForType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getIntForType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: intForType.containsKey(type)
 *  */
    @Test
    public void testGetIntForType_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:187) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", jSTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = ((Object) null);
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getIntForType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.common.collect.BiMap#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: intForType.containsKey(type)
 *  */
    @Test
    public void testGetIntForType_ThrowNullPointerException_1() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Synchronized$SynchronizedBiMap");
        int[] delegate = {};
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.common.collect.Synchronized$SynchronizedMap.containsKey(Synchronized.java:1129)
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:187) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", jSTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = ((Object) null);
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getIntForType(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetIntForType1() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Maps$UnmodifiableBiMap");
        LinkedHashMap unmodifiableMap = new LinkedHashMap();
        setField(intForType, "com.google.common.collect.Maps$UnmodifiableBiMap", "unmodifiableMap", unmodifiableMap);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", jSTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetIntForType2() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Maps$UnmodifiableBiMap");
        LinkedHashMap unmodifiableMap = new LinkedHashMap();
        Integer integer = 0;
        java.lang.Object[] partitionArray = createArray("java.util.stream.Collectors$Partition", 9);
        unmodifiableMap.put(integer, partitionArray);
        setField(intForType, "com.google.common.collect.Maps$UnmodifiableBiMap", "unmodifiableMap", unmodifiableMap);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", noObjectTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = noObjectType;
        int actual = ((Integer) getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getIntForType(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetIntForType3() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.AbstractBiMap$Inverse");
        LinkedHashMap delegate = new LinkedHashMap();
        java.lang.Object[] classValueMapArray = createArray("java.lang.ClassValue$ClassValueMap", 9);
        delegate.put(null, classValueMapArray);
        setField(intForType, "com.google.common.collect.AbstractBiMap", "delegate", delegate);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.ClassCastException: class [Ljava.lang.ClassValue$ClassValueMap; cannot be cast to class java.lang.Integer ([Ljava.lang.ClassValue$ClassValueMap; and java.lang.Integer are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:188) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", jSTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = ((Object) null);
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetIntForType4() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Maps$UnmodifiableBiMap");
        LinkedHashMap unmodifiableMap = new LinkedHashMap();
        Integer integer = 0;
        java.lang.Object[] partitionArray = createArray("java.util.stream.Collectors$Partition", 9);
        unmodifiableMap.put(integer, partitionArray);
        Object object = createInstance("java.lang.Object");
        unmodifiableMap.put(null, object);
        setField(intForType, "com.google.common.collect.Maps$UnmodifiableBiMap", "unmodifiableMap", unmodifiableMap);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:188) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", jSTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = ((Object) null);
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetIntForType5() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.AbstractBiMap$Inverse");
        LinkedHashMap delegate = new LinkedHashMap();
        setField(intForType, "com.google.common.collect.AbstractBiMap", "delegate", delegate);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractBiMap.containsValue(AbstractBiMap.java:88)
            com.google.common.collect.AbstractBiMap.putInBothMaps(AbstractBiMap.java:109)
            com.google.common.collect.AbstractBiMap.put(AbstractBiMap.java:94)
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:191) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class functionPrototypeTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", functionPrototypeTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = functionPrototypeType;
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetIntForType6() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Maps$UnmodifiableBiMap");
        LinkedHashMap unmodifiableMap = new LinkedHashMap();
        setField(intForType, "com.google.common.collect.Maps$UnmodifiableBiMap", "unmodifiableMap", unmodifiableMap);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:632)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.common.collect.ForwardingMap.put(ForwardingMap.java:73)
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:191) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", anonymousFunctionTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = anonymousFunctionType;
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetIntForType7() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.AbstractBiMap$Inverse");
        LinkedHashMap delegate = new LinkedHashMap();
        java.lang.Object[] classValueMapArray = createArray("java.lang.ClassValue$ClassValueMap", 9);
        delegate.put(null, classValueMapArray);
        setField(intForType, "com.google.common.collect.AbstractBiMap", "delegate", delegate);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:632)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            com.google.common.collect.ForwardingMap.containsKey(ForwardingMap.java:61)
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:187) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", anonymousFunctionTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = anonymousFunctionType;
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetIntForType8() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Maps$UnmodifiableBiMap");
        LinkedHashMap unmodifiableMap = new LinkedHashMap();
        Integer integer = 0;
        java.lang.Object[] partitionArray = createArray("java.util.stream.Collectors$Partition", 9);
        unmodifiableMap.put(integer, partitionArray);
        setField(intForType, "com.google.common.collect.Maps$UnmodifiableBiMap", "unmodifiableMap", unmodifiableMap);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:632)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            com.google.common.collect.ForwardingMap.containsKey(ForwardingMap.java:61)
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:187) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", anonymousFunctionTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = anonymousFunctionType;
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetIntForType9() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.AbstractBiMap$Inverse");
        LinkedHashMap delegate = new LinkedHashMap();
        Character character = '\u0000';
        java.lang.Object[] classValueMapArray = createArray("java.lang.ClassValue$ClassValueMap", 9);
        delegate.put(character, classValueMapArray);
        delegate.put(classValueMapArray, null);
        setField(intForType, "com.google.common.collect.AbstractBiMap", "delegate", delegate);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        Object arrowType = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getIntForType] produces [java.lang.NullPointerException]
            com.google.common.collect.AbstractBiMap.containsValue(AbstractBiMap.java:88)
            com.google.common.collect.AbstractBiMap.putInBothMaps(AbstractBiMap.java:109)
            com.google.common.collect.AbstractBiMap.put(AbstractBiMap.java:94)
            com.google.javascript.jscomp.AmbiguateProperties.getIntForType(AmbiguateProperties.java:191) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class arrowTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getIntForTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getIntForType", arrowTypeType);
        getIntForTypeMethod.setAccessible(true);
        java.lang.Object[] getIntForTypeMethodArguments = new java.lang.Object[1];
        getIntForTypeMethodArguments[0] = arrowType;
        try {
            getIntForTypeMethod.invoke(ambiguateProperties, getIntForTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.isInvalidatingType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInvalidatingType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#isInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return objType == null || invalidatingTypes.contains(objType) || !objType.hasReferenceName() || (objType.isNamedType() && objType.isUnknownType()) || objType.isEnumType() || objType.autoboxesTo() != null;}
 *  */
    @Test
    public void testIsInvalidatingType_ReturnObjTypeNotEqualsNullOrInvalidatingTypesContainsOrNotObjTypeHasReferenceNameOrObjTypeIsNamedTypeAndObjTypeIsUnknownTypeOrObjTypeIsEnumTypeOrObjTypeAutoboxesToEqualsNull_1() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class booleanTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("isInvalidatingType", booleanTypeType);
        isInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] isInvalidatingTypeMethodArguments = new java.lang.Object[1];
        isInvalidatingTypeMethodArguments[0] = booleanType;
        boolean actual = ((Boolean) isInvalidatingTypeMethod.invoke(ambiguateProperties, isInvalidatingTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#isInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return objType == null || invalidatingTypes.contains(objType) || !objType.hasReferenceName() || (objType.isNamedType() && objType.isUnknownType()) || objType.isEnumType() || objType.autoboxesTo() != null;}
 *  */
    @Test
    public void testIsInvalidatingType_ReturnObjTypeNotEqualsNullOrInvalidatingTypesContainsOrNotObjTypeHasReferenceNameOrObjTypeIsNamedTypeAndObjTypeIsUnknownTypeOrObjTypeIsEnumTypeOrObjTypeAutoboxesToEqualsNull() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("isInvalidatingType", jSTypeType);
        isInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] isInvalidatingTypeMethodArguments = new java.lang.Object[1];
        isInvalidatingTypeMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isInvalidatingTypeMethod.invoke(ambiguateProperties, isInvalidatingTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#isInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return objType == null || invalidatingTypes.contains(objType) || !objType.hasReferenceName() || (objType.isNamedType() && objType.isUnknownType()) || objType.isEnumType() || objType.autoboxesTo() != null;}
 *  */
    @Test
    public void testIsInvalidatingType_ObjectTypeHasReferenceName() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashSet invalidatingTypes = new LinkedHashSet();
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "invalidatingTypes", invalidatingTypes);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("isInvalidatingType", noTypeType);
        isInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] isInvalidatingTypeMethodArguments = new java.lang.Object[1];
        isInvalidatingTypeMethodArguments[0] = noType;
        boolean actual = ((Boolean) isInvalidatingTypeMethod.invoke(ambiguateProperties, isInvalidatingTypeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInvalidatingType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#isInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: invalidatingTypes.contains(objType)
 *  */
    @Test
    public void testIsInvalidatingType_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.isInvalidatingType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.isInvalidatingType(AmbiguateProperties.java:517) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("isInvalidatingType", functionTypeType);
        isInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] isInvalidatingTypeMethodArguments = new java.lang.Object[1];
        isInvalidatingTypeMethodArguments[0] = functionType;
        try {
            isInvalidatingTypeMethod.invoke(ambiguateProperties, isInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#isInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return objType == null || invalidatingTypes.contains(objType) || !objType.hasReferenceName() || (objType.isNamedType() && objType.isUnknownType()) || objType.isEnumType() || objType.autoboxesTo() != null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return objType == null || invalidatingTypes.contains(objType) || !objType.hasReferenceName() || (objType.isNamedType() && objType.isUnknownType()) || objType.isEnumType() || objType.autoboxesTo() != null;
 *  */
    @Test
    public void testIsInvalidatingType_ThrowNullPointerException_1() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashSet invalidatingTypes = new LinkedHashSet();
        invalidatingTypes.add(null);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "invalidatingTypes", invalidatingTypes);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.isInvalidatingType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:632)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            java.base/java.util.HashSet.contains(HashSet.java:205)
            com.google.javascript.jscomp.AmbiguateProperties.isInvalidatingType(AmbiguateProperties.java:517) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("isInvalidatingType", functionTypeType);
        isInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] isInvalidatingTypeMethodArguments = new java.lang.Object[1];
        isInvalidatingTypeMethodArguments[0] = functionType;
        try {
            isInvalidatingTypeMethod.invoke(ambiguateProperties, isInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getTypeRegistry()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return compiler.getTypeRegistry().getNativeType(JSTypeNative.UNKNOWN_TYPE);}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
        JSType actual = ((JSType) getJSTypeMethod.invoke(ambiguateProperties, getJSTypeMethodArguments));
        
        assertNull(actual);
        
        AbstractCompiler ambiguatePropertiesCompiler = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompilerCompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompilerCompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompilerCompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes0 = ((JSType) get(ambiguatePropertiesCompilerCompilerTypeRegistryCompilerTypeRegistryNativeTypes, 0));
        AbstractCompiler ambiguatePropertiesCompiler1 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler1CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler1, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler1CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler1CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes1 = ((JSType) get(ambiguatePropertiesCompiler1CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 1));
        AbstractCompiler ambiguatePropertiesCompiler2 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler2CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler2, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler2CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler2CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes2 = ((JSType) get(ambiguatePropertiesCompiler2CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 2));
        AbstractCompiler ambiguatePropertiesCompiler3 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler3CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler3, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler3CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler3CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes3 = ((JSType) get(ambiguatePropertiesCompiler3CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 3));
        AbstractCompiler ambiguatePropertiesCompiler4 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler4CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler4, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler4CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler4CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes4 = ((JSType) get(ambiguatePropertiesCompiler4CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 4));
        AbstractCompiler ambiguatePropertiesCompiler5 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler5CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler5, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler5CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler5CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes5 = ((JSType) get(ambiguatePropertiesCompiler5CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 5));
        AbstractCompiler ambiguatePropertiesCompiler6 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler6CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler6, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler6CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler6CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes6 = ((JSType) get(ambiguatePropertiesCompiler6CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 6));
        AbstractCompiler ambiguatePropertiesCompiler7 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler7CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler7, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler7CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler7CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes7 = ((JSType) get(ambiguatePropertiesCompiler7CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 7));
        AbstractCompiler ambiguatePropertiesCompiler8 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler8CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler8, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler8CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler8CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes8 = ((JSType) get(ambiguatePropertiesCompiler8CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 8));
        AbstractCompiler ambiguatePropertiesCompiler9 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler9CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler9, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler9CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler9CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes9 = ((JSType) get(ambiguatePropertiesCompiler9CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 9));
        AbstractCompiler ambiguatePropertiesCompiler10 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler10CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler10, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler10CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler10CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes10 = ((JSType) get(ambiguatePropertiesCompiler10CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 10));
        AbstractCompiler ambiguatePropertiesCompiler11 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler11CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler11, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler11CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler11CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes11 = ((JSType) get(ambiguatePropertiesCompiler11CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 11));
        AbstractCompiler ambiguatePropertiesCompiler12 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler12CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler12, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler12CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler12CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes12 = ((JSType) get(ambiguatePropertiesCompiler12CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 12));
        AbstractCompiler ambiguatePropertiesCompiler13 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler13CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler13, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler13CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler13CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes13 = ((JSType) get(ambiguatePropertiesCompiler13CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 13));
        AbstractCompiler ambiguatePropertiesCompiler14 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler14CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler14, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler14CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler14CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes14 = ((JSType) get(ambiguatePropertiesCompiler14CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 14));
        AbstractCompiler ambiguatePropertiesCompiler15 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler15CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler15, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler15CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler15CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes15 = ((JSType) get(ambiguatePropertiesCompiler15CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 15));
        AbstractCompiler ambiguatePropertiesCompiler16 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler16CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler16, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler16CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler16CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes16 = ((JSType) get(ambiguatePropertiesCompiler16CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 16));
        AbstractCompiler ambiguatePropertiesCompiler17 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler17CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler17, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler17CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler17CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes17 = ((JSType) get(ambiguatePropertiesCompiler17CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 17));
        AbstractCompiler ambiguatePropertiesCompiler18 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler18CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler18, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler18CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler18CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes18 = ((JSType) get(ambiguatePropertiesCompiler18CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 18));
        AbstractCompiler ambiguatePropertiesCompiler19 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler19CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler19, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler19CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler19CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes19 = ((JSType) get(ambiguatePropertiesCompiler19CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 19));
        AbstractCompiler ambiguatePropertiesCompiler20 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler20CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler20, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler20CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler20CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes20 = ((JSType) get(ambiguatePropertiesCompiler20CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 20));
        AbstractCompiler ambiguatePropertiesCompiler21 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler21CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler21, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler21CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler21CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes21 = ((JSType) get(ambiguatePropertiesCompiler21CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 21));
        AbstractCompiler ambiguatePropertiesCompiler22 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler22CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler22, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler22CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler22CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes22 = ((JSType) get(ambiguatePropertiesCompiler22CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 22));
        AbstractCompiler ambiguatePropertiesCompiler23 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler23CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler23, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler23CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler23CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes23 = ((JSType) get(ambiguatePropertiesCompiler23CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 23));
        AbstractCompiler ambiguatePropertiesCompiler24 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler24CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler24, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler24CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler24CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes24 = ((JSType) get(ambiguatePropertiesCompiler24CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 24));
        AbstractCompiler ambiguatePropertiesCompiler25 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler25CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler25, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler25CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler25CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes25 = ((JSType) get(ambiguatePropertiesCompiler25CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 25));
        AbstractCompiler ambiguatePropertiesCompiler26 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler26CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler26, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler26CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler26CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes26 = ((JSType) get(ambiguatePropertiesCompiler26CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 26));
        AbstractCompiler ambiguatePropertiesCompiler27 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler27CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler27, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler27CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler27CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes27 = ((JSType) get(ambiguatePropertiesCompiler27CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 27));
        AbstractCompiler ambiguatePropertiesCompiler28 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler28CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler28, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler28CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler28CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes28 = ((JSType) get(ambiguatePropertiesCompiler28CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 28));
        AbstractCompiler ambiguatePropertiesCompiler29 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler29CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler29, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler29CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler29CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes29 = ((JSType) get(ambiguatePropertiesCompiler29CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 29));
        AbstractCompiler ambiguatePropertiesCompiler30 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler30CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler30, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler30CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler30CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes30 = ((JSType) get(ambiguatePropertiesCompiler30CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 30));
        AbstractCompiler ambiguatePropertiesCompiler31 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler31CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler31, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler31CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler31CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes31 = ((JSType) get(ambiguatePropertiesCompiler31CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 31));
        AbstractCompiler ambiguatePropertiesCompiler32 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler32CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler32, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler32CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler32CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes32 = ((JSType) get(ambiguatePropertiesCompiler32CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 32));
        AbstractCompiler ambiguatePropertiesCompiler33 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler33CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler33, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler33CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler33CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes33 = ((JSType) get(ambiguatePropertiesCompiler33CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 33));
        AbstractCompiler ambiguatePropertiesCompiler34 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler34CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler34, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler34CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler34CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes34 = ((JSType) get(ambiguatePropertiesCompiler34CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 34));
        AbstractCompiler ambiguatePropertiesCompiler35 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler35CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler35, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler35CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler35CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes35 = ((JSType) get(ambiguatePropertiesCompiler35CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 35));
        AbstractCompiler ambiguatePropertiesCompiler36 = ((AbstractCompiler) getFieldValue(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler"));
        JSTypeRegistry ambiguatePropertiesCompiler36CompilerTypeRegistry = ((JSTypeRegistry) getFieldValue(ambiguatePropertiesCompiler36, "com.google.javascript.jscomp.Compiler", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] ambiguatePropertiesCompiler36CompilerTypeRegistryCompilerTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(ambiguatePropertiesCompiler36CompilerTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes36 = ((JSType) get(ambiguatePropertiesCompiler36CompilerTypeRegistryCompilerTypeRegistryNativeTypes, 36));
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes0);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes1);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes2);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes3);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes4);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes5);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes6);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes7);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes8);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes9);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes10);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes11);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes12);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes13);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes14);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes15);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes16);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes17);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes18);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes19);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes20);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes21);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes22);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes23);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes24);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes25);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes26);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes27);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes28);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes29);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes30);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes31);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes32);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes33);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes34);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes35);
        
        assertNull(finalAmbiguatePropertiesCompilerTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        NoType actual = ((NoType) getJSTypeMethod.invoke(ambiguateProperties, getJSTypeMethodArguments));
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        ObjectType actualImplicitPrototype = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype"));
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getTypeRegistry()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return compiler.getTypeRegistry().getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "compiler", compiler);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.jscomp.AmbiguateProperties.getJSType(AmbiguateProperties.java:543) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(ambiguateProperties, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.getJSType(AmbiguateProperties.java:537) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(ambiguateProperties, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getTypeRegistry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compiler.getTypeRegistry().getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException_1() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.getJSType(AmbiguateProperties.java:543) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(ambiguateProperties, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.getRelatedTypesOnNonUnion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelatedTypesOnNonUnion(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getRelatedTypesOnNonUnion(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: relatedBitsets.containsKey(type)
 *  */
    @Test
    public void testGetRelatedTypesOnNonUnion_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.getRelatedTypesOnNonUnion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.getRelatedTypesOnNonUnion(AmbiguateProperties.java:254) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRelatedTypesOnNonUnionMethod = ambiguatePropertiesClazz.getDeclaredMethod("getRelatedTypesOnNonUnion", jSTypeType);
        getRelatedTypesOnNonUnionMethod.setAccessible(true);
        java.lang.Object[] getRelatedTypesOnNonUnionMethodArguments = new java.lang.Object[1];
        getRelatedTypesOnNonUnionMethodArguments[0] = ((Object) null);
        try {
            getRelatedTypesOnNonUnionMethod.invoke(ambiguateProperties, getRelatedTypesOnNonUnionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRelatedTypesOnNonUnion(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#getRelatedTypesOnNonUnion(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (relatedBitsets.containsKey(type)): False}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: relatedBitsets.containsKey(type)
 *  */
    @Test(expected = RuntimeException.class)
    public void testGetRelatedTypesOnNonUnion_ThrowRuntimeException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap relatedBitsets = new LinkedHashMap();
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "relatedBitsets", relatedBitsets);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRelatedTypesOnNonUnionMethod = ambiguatePropertiesClazz.getDeclaredMethod("getRelatedTypesOnNonUnion", jSTypeType);
        getRelatedTypesOnNonUnionMethod.setAccessible(true);
        java.lang.Object[] getRelatedTypesOnNonUnionMethodArguments = new java.lang.Object[1];
        getRelatedTypesOnNonUnionMethodArguments[0] = ((Object) null);
        try {
            getRelatedTypesOnNonUnionMethod.invoke(ambiguateProperties, getRelatedTypesOnNonUnionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type instanceof UnionType): False}
 * @utbot.executesCondition {@code (relatedBitsets.containsKey(type)): True}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testComputeRelatedTypes_RelatedBitsetsContainsKey() throws Exception  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap relatedBitsets = new LinkedHashMap();
        relatedBitsets.put(null, null);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "relatedBitsets", relatedBitsets);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method computeRelatedTypesMethod = ambiguatePropertiesClazz.getDeclaredMethod("computeRelatedTypes", jSTypeType);
        computeRelatedTypesMethod.setAccessible(true);
        java.lang.Object[] computeRelatedTypesMethodArguments = new java.lang.Object[1];
        computeRelatedTypesMethodArguments[0] = ((Object) null);
        computeRelatedTypesMethod.invoke(ambiguateProperties, computeRelatedTypesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: relatedBitsets.containsKey(type)
 *  */
    @Test
    public void testComputeRelatedTypes_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes(AmbiguateProperties.java:274) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method computeRelatedTypesMethod = ambiguatePropertiesClazz.getDeclaredMethod("computeRelatedTypes", jSTypeType);
        computeRelatedTypesMethod.setAccessible(true);
        java.lang.Object[] computeRelatedTypesMethodArguments = new java.lang.Object[1];
        computeRelatedTypesMethodArguments[0] = ((Object) null);
        try {
            computeRelatedTypesMethod.invoke(ambiguateProperties, computeRelatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (relatedBitsets.containsKey(type)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSTypeBitSet related = new JSTypeBitSet(intForType.size());
 *  */
    @Test
    public void testComputeRelatedTypes_ThrowNullPointerException_1() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap relatedBitsets = new LinkedHashMap();
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "relatedBitsets", relatedBitsets);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes(AmbiguateProperties.java:279) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method computeRelatedTypesMethod = ambiguatePropertiesClazz.getDeclaredMethod("computeRelatedTypes", functionTypeType);
        computeRelatedTypesMethod.setAccessible(true);
        java.lang.Object[] computeRelatedTypesMethodArguments = new java.lang.Object[1];
        computeRelatedTypesMethodArguments[0] = functionType;
        try {
            computeRelatedTypesMethod.invoke(ambiguateProperties, computeRelatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (relatedBitsets.containsKey(type)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSTypeBitSet related = new JSTypeBitSet(intForType.size());
 *  */
    @Test
    public void testComputeRelatedTypes_ThrowNullPointerException_2() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        LinkedHashMap relatedBitsets = new LinkedHashMap();
        relatedBitsets.put(null, null);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "relatedBitsets", relatedBitsets);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:632)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.HashMap.containsKey(HashMap.java:594)
            com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes(AmbiguateProperties.java:274) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method computeRelatedTypesMethod = ambiguatePropertiesClazz.getDeclaredMethod("computeRelatedTypes", functionTypeType);
        computeRelatedTypesMethod.setAccessible(true);
        java.lang.Object[] computeRelatedTypesMethodArguments = new java.lang.Object[1];
        computeRelatedTypesMethodArguments[0] = functionType;
        try {
            computeRelatedTypesMethod.invoke(ambiguateProperties, computeRelatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type instanceof UnionType): False}
 * @utbot.executesCondition {@code (relatedBitsets.containsKey(type)): False}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.collect.BiMap#size()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSTypeBitSet related = new JSTypeBitSet(intForType.size());
 *  */
    @Test(expected = ClassCastException.class)
    public void testComputeRelatedTypes_ThrowClassCastException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        Object intForType = createInstance("com.google.common.collect.Synchronized$SynchronizedBiMap");
        byte[] delegate = {};
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "delegate", delegate);
        java.lang.Object[] mutex = createArray("javax.security.auth.SubjectDomainCombiner$WeakKeyValueMap", 0);
        setField(intForType, "com.google.common.collect.Synchronized$SynchronizedObject", "mutex", mutex);
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "intForType", intForType);
        LinkedHashMap relatedBitsets = new LinkedHashMap();
        setField(ambiguateProperties, "com.google.javascript.jscomp.AmbiguateProperties", "relatedBitsets", relatedBitsets);
        
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method computeRelatedTypesMethod = ambiguatePropertiesClazz.getDeclaredMethod("computeRelatedTypes", jSTypeType);
        computeRelatedTypesMethod.setAccessible(true);
        java.lang.Object[] computeRelatedTypesMethodArguments = new java.lang.Object[1];
        computeRelatedTypesMethodArguments[0] = ((Object) null);
        try {
            computeRelatedTypesMethod.invoke(ambiguateProperties, computeRelatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AmbiguateProperties.addInvalidatingType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addInvalidatingType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#addInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: type = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testAddInvalidatingType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.addInvalidatingType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:681)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:60)
            com.google.javascript.jscomp.AmbiguateProperties.addInvalidatingType(AmbiguateProperties.java:167) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class voidTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method addInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("addInvalidatingType", voidTypeType);
        addInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] addInvalidatingTypeMethodArguments = new java.lang.Object[1];
        addInvalidatingTypeMethodArguments[0] = voidType;
        try {
            addInvalidatingTypeMethod.invoke(ambiguateProperties, addInvalidatingTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AmbiguateProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AmbiguateProperties#addInvalidatingType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testAddInvalidatingType_ThrowNullPointerException() throws Throwable  {
        AmbiguateProperties ambiguateProperties = ((AmbiguateProperties) createInstance("com.google.javascript.jscomp.AmbiguateProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AmbiguateProperties.addInvalidatingType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AmbiguateProperties.addInvalidatingType(AmbiguateProperties.java:167) */
        Class ambiguatePropertiesClazz = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method addInvalidatingTypeMethod = ambiguatePropertiesClazz.getDeclaredMethod("addInvalidatingType", jSTypeType);
        addInvalidatingTypeMethod.setAccessible(true);
        java.lang.Object[] addInvalidatingTypeMethodArguments = new java.lang.Object[1];
        addInvalidatingTypeMethodArguments[0] = ((Object) null);
        try {
            addInvalidatingTypeMethod.invoke(ambiguateProperties, addInvalidatingTypeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields936862419357700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields936862419357700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass936862419364600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936862419357700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936862419364600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields936862419773900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936862419773900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936862419777600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936862419773900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936862419777600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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


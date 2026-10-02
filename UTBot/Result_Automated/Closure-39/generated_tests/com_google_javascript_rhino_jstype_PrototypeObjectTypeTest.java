package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import com.google.javascript.rhino.JSDocInfo;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Map;
import com.google.common.collect.Multimap;
import java.util.Collection;
import com.google.common.collect.Multiset;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_rhino_jstype_PrototypeObjectTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasProperty(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasProperty(java.lang.String)}
     */
    @Test
    public void testHasPropertyReturnsFalseWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(Integer.MIN_VALUE, nodeArray, Integer.MIN_VALUE, 1);
        node.setType(0);
        Node node1 = new Node(1, node);
        node1.setType(1);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(0, null, null, null, 0, -1);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(1);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(1, 1, Integer.MIN_VALUE);
        node4.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(0, 1, -1);
        node5.setType(Integer.MAX_VALUE);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        boolean actual = prototypeObjectType1.hasProperty("abc");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstructor()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getConstructor()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetConstructor_ReturnNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        FunctionType actual = prototypeObjectType.getConstructor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getSlot(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.containsKey(name)
 *  */
    @Test
    public void testGetSlot_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129) */
        prototypeObjectType.getSlot(((String) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSlot(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getSlot(java.lang.String)}
     */
    @Test
    public void testGetSlotWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        ObjectType.Property actual = prototypeObjectType1.getSlot("abc");
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyNames()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyNames()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.returnsFrom {@code return properties.keySet();}
 *  */
    @Test
    public void testGetOwnPropertyNames_MapKeySet() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(string, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        Set actual = prototypeObjectType.getOwnPropertyNames();
        
        Set expected = new LinkedHashSet();
        expected.add(string);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOwnPropertyNames()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyNames()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.keySet();
 *  */
    @Test
    public void testGetOwnPropertyNames_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179) */
        prototypeObjectType.getOwnPropertyNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isPropertyTypeInferred(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyTypeInferred(java.lang.String)}
     */
    @Test
    public void testIsPropertyTypeInferredReturnsFalseWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        boolean actual = prototypeObjectType1.isPropertyTypeInferred("abc");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyInExterns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPropertyInExterns(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyInExterns(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPropertyInExterns_PEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyInExterns(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPropertyInExterns(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyInExterns(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property p = properties.get(propertyName);
 *  */
    @Test
    public void testIsPropertyInExterns_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyInExterns] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyInExterns(PrototypeObjectType.java:222) */
        prototypeObjectType.isPropertyInExterns(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isPropertyInExterns(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyInExterns(java.lang.String)}
     */
    @Test
    public void testIsPropertyInExternsReturnsFalseWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        boolean actual = prototypeObjectType1.isPropertyInExterns("abc");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isPropertyInExterns(java.lang.String)
    
    @Test
    public void testIsPropertyInExterns1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = prototypeObjectType.isPropertyInExterns(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyInExterns2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyInExterns(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyInExterns3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties1 = new LinkedHashMap();
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = prototypeObjectType.isPropertyInExterns(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyInExterns4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object propertyNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(property, "com.google.javascript.rhino.jstype.ObjectType$Property", "propertyNode", propertyNode);
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = prototypeObjectType.isPropertyInExterns(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyInExterns5() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = prototypeObjectType.isPropertyInExterns(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isPropertyTypeDeclared(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyTypeDeclared(java.lang.String)}
     */
    @Test
    public void testIsPropertyTypeDeclaredReturnsFalseWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(Integer.MIN_VALUE, nodeArray, Integer.MIN_VALUE, 1);
        node.setType(0);
        Node node1 = new Node(1, node);
        node1.setType(1);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(0, null, null, null, 0, -1);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(1);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(1, 1, Integer.MIN_VALUE);
        node4.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(0, 1, -1);
        node5.setType(Integer.MAX_VALUE);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        boolean actual = prototypeObjectType1.isPropertyTypeDeclared("abc");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isPropertyTypeDeclared(java.lang.String)
    
    @Test
    public void testIsPropertyTypeDeclared1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeDeclared(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isPropertyTypeDeclared(java.lang.String)
    
    @Test
    public void testIsPropertyTypeDeclared2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:139)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared(PrototypeObjectType.java:184) */
        prototypeObjectType.isPropertyTypeDeclared(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collectPropertyNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#collectPropertyNames(java.util.Set)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String prop: properties.keySet())
 *  */
    @Test
    public void testCollectPropertyNames_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames(PrototypeObjectType.java:193) */
        prototypeObjectType.collectPropertyNames(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method collectPropertyNames(java.util.Set)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#collectPropertyNames(java.util.Set)}
     */
    @Test
    public void testCollectPropertyNames() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        TreeSet treeSet = new TreeSet();
        treeSet.add("#$\\\"'");
        treeSet.add("-3");
        treeSet.add("abc");
        
        prototypeObjectType1.collectPropertyNames(treeSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyJSDocInfo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_PEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        JSDocInfo actual = prototypeObjectType.getOwnPropertyJSDocInfo(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType.Property#getJSDocInfo()}
 * @utbot.returnsFrom {@code return p.getJSDocInfo();}
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_PNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(string, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        JSDocInfo actual = prototypeObjectType.getOwnPropertyJSDocInfo(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOwnPropertyJSDocInfo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property p = properties.get(propertyName);
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo(PrototypeObjectType.java:271) */
        prototypeObjectType.getOwnPropertyJSDocInfo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOverridenNativeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOverridenNativeProperty(java.lang.String)}
 * @utbot.executesCondition {@code (isNativeObjectType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNativeObjectType()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasOverridenNativeProperty_IsNativeObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method hasOverridenNativePropertyMethod = prototypeObjectTypeClazz.getDeclaredMethod("hasOverridenNativeProperty", stringType);
        hasOverridenNativePropertyMethod.setAccessible(true);
        java.lang.Object[] hasOverridenNativePropertyMethodArguments = new java.lang.Object[1];
        hasOverridenNativePropertyMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) hasOverridenNativePropertyMethod.invoke(prototypeObjectType, hasOverridenNativePropertyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getImplicitPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImplicitPrototype()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return implicitPrototypeFallback;}
 *  */
    @Test
    public void testGetImplicitPrototype_ReturnImplicitPrototypeFallback() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        ObjectType actual = prototypeObjectType.getImplicitPrototype();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setImplicitPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (checkState(!hasCachedValues());): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 *  */
    @Test
    public void testSetImplicitPrototype_CheckState() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        prototypeObjectType.setImplicitPrototype(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (checkState(!hasCachedValues());): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: checkState(!hasCachedValues());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetImplicitPrototype_ThrowIllegalStateException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setImplicitPrototype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCtorImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ImmutableListOf() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
            
            List actual = ((List) prototypeObjectType.getCtorImplementedInterfaces());
            
            List expected = new ArrayList();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType_3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        NoType type = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        ErrorFunctionType type = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType_2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        FunctionType type = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ErrorFunctionType implicitPrototypeFallback = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCtorImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isFunctionPrototypeType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnerFunction()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ThrowClassCastException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        AllType type = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:319)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:757)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:444)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:528) */
        prototypeObjectType.getCtorImplementedInterfaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesNumberContext()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesNumberContext()}
 * @utbot.executesCondition {@code (isStringObjectType()): True}
 * @utbot.executesCondition {@code (isStringObjectType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNumberObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isDateType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isBooleanObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isStringObjectType()}
 * @utbot.invokes com.google.javascript.rhino.jstype.PrototypeObjectType#hasOverridenNativeProperty(java.lang.String)
 * @utbot.returnsFrom {@code return isNumberObjectType() || isDateType() || isBooleanObjectType() || isStringObjectType() || hasOverridenNativeProperty("valueOf");}
 *  */
    @Test
    public void testMatchesNumberContext_NotIsStringObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        boolean actual = prototypeObjectType.matchesNumberContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesNumberContext()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesNumberContext()}
     */
    @Test
    public void testMatchesNumberContextReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "\n\t\r", null);
        FunctionType functionType = new FunctionType(null, "#$\\\"'", null, null, null, "XZ", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "", prototypeObjectType, false);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(Integer.MIN_VALUE, nodeArray, Integer.MIN_VALUE, 1);
        node.setType(0);
        Node node1 = new Node(1, node);
        node1.setType(1);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(0, null, null, null, 0, -1);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "abc", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "#$\\\"'", node1, arrowType, prototypeObjectType2, "-3", true, false);
        Node node3 = new Node(1);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(1, 1, Integer.MIN_VALUE);
        node4.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "-3", node4, arrowType1, null, "XZ", false, false);
        Node node5 = new Node(0, 1, -1);
        node5.setType(Integer.MAX_VALUE);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "\n\t\r", null, null, null, "-3", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        boolean actual = prototypeObjectType1.matchesNumberContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchesObjectContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesObjectContext()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesObjectContext()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchesObjectContext_ReturnTrue() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.matchesObjectContext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.implicitPrototypeChainIsUnknown
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method implicitPrototypeChainIsUnknown()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_ReturnFalse() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType implicitPrototypeFallback = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NamedType implicitPrototypeFallback = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method implicitPrototypeChainIsUnknown()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
     */
    @Test
    public void testImplicitPrototypeChainIsUnknownReturnsFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, false);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType1, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCtorExtendedInterfaces()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorExtendedInterfaces()}
 * @utbot.executesCondition {@code (isFunctionPrototypeType()): False}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getExtendedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorExtendedInterfaces_NotIsFunctionPrototypeType() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
            
            List actual = ((List) prototypeObjectType.getCtorExtendedInterfaces());
            
            List expected = new ArrayList();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorExtendedInterfaces()}
 * @utbot.executesCondition {@code (isFunctionPrototypeType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnerFunction()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getExtendedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorExtendedInterfaces_IsFunctionPrototypeType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorExtendedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionExtendedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionExtendedInterfaces);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPropertyJSDocInfo(java.lang.String,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 *  */
    @Test
    public void testSetPropertyJSDocInfo_InfoEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setPropertyJSDocInfo(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPropertyJSDocInfo(java.lang.String,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !properties.containsKey(propertyName)
 *  */
    @Test
    public void testSetPropertyJSDocInfo_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        JSDocInfo jSDocInfo = new JSDocInfo();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo(PrototypeObjectType.java:281) */
        prototypeObjectType.setPropertyJSDocInfo(null, jSDocInfo);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPropertyJSDocInfo(java.lang.String,com.google.javascript.rhino.JSDocInfo)}
     */
    @Test
    public void testSetPropertyJSDocInfoWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        JSDocInfo jSDocInfo = new JSDocInfo();
        JSDocInfo.Visibility visibility = JSDocInfo.Visibility.PROTECTED;
        jSDocInfo.setVisibility(visibility);
        Node node6 = new Node(0);
        node6.setType(0);
        jSDocInfo.setAssociatedNode(node6);
        
        prototypeObjectType1.setPropertyJSDocInfo("abc", jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesStringContext()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesStringContext()}
 * @utbot.executesCondition {@code (isRegexpType()): True}
 * @utbot.executesCondition {@code (isRegexpType()): True}
 * @utbot.executesCondition {@code (isRegexpType()): True}
 * @utbot.executesCondition {@code (isBooleanObjectType()): True}
 * @utbot.executesCondition {@code (isBooleanObjectType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isTheObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isStringObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isDateType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isRegexpType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isArrayType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNumberObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isBooleanObjectType()}
 * @utbot.invokes com.google.javascript.rhino.jstype.PrototypeObjectType#hasOverridenNativeProperty(java.lang.String)
 * @utbot.returnsFrom {@code return isTheObjectType() || isStringObjectType() || isDateType() || isRegexpType() || isArrayType() || isNumberObjectType() || isBooleanObjectType() || hasOverridenNativeProperty("toString");}
 *  */
    @Test
    public void testMatchesStringContext_NotIsBooleanObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        boolean actual = prototypeObjectType.matchesStringContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchesStringContext()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesStringContext()}
     */
    @Test
    public void testMatchesStringContextReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "\n\t\r", null);
        FunctionType functionType = new FunctionType(null, "#$\\\"'", null, null, null, "XZ", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "", prototypeObjectType, false);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(Integer.MIN_VALUE, nodeArray, Integer.MIN_VALUE, 1);
        node.setType(0);
        Node node1 = new Node(1, node);
        node1.setType(1);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(0, null, null, null, 0, -1);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "abc", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "#$\\\"'", node1, arrowType, prototypeObjectType2, "-3", true, false);
        Node node3 = new Node(1);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(1, 1, Integer.MIN_VALUE);
        node4.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "-3", node4, arrowType1, null, "XZ", false, false);
        Node node5 = new Node(0, 1, -1);
        node5.setType(Integer.MAX_VALUE);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "\n\t\r", null, null, null, "-3", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        boolean actual = prototypeObjectType1.matchesStringContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPrettyPrint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPrettyPrint()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPrettyPrint()}
 * @utbot.returnsFrom {@code return prettyPrint;}
 *  */
    @Test
    public void testIsPrettyPrint_ReturnPrettyPrint() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.isPrettyPrint();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.toStringHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringHelper(boolean)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#toStringHelper(boolean)}
 * @utbot.executesCondition {@code (hasReferenceName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.returnsFrom {@code return getReferenceName();}
 *  */
    @Test
    public void testToStringHelper_HasReferenceName() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = prototypeObjectType.toStringHelper(false);
        
        assertEquals(className, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#toStringHelper(boolean)}
 * @utbot.executesCondition {@code (hasReferenceName()): False}
 * @utbot.executesCondition {@code (prettyPrint): False}
 * @utbot.returnsFrom {@code return "{...}";}
 *  */
    @Test
    public void testToStringHelper_NotPrettyPrint() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        String actual = prototypeObjectType.toStringHelper(false);
        
        String expected = "{...}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertyNode(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
 * @utbot.executesCondition {@code (implicitPrototype != null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPropertyNode_ImplicitPrototypeEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        Node actual = prototypeObjectType.getPropertyNode(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertyNode(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property p = properties.get(propertyName);
 *  */
    @Test
    public void testGetPropertyNode_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyNode(PrototypeObjectType.java:258) */
        prototypeObjectType.getPropertyNode(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPropertyNode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertyNode(java.lang.String)}
     */
    @Test
    public void testGetPropertyNodeWithNonEmptyString() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        Node actual = prototypeObjectType1.getPropertyNode("abc");
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertiesCount()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertiesCount()}
 * @utbot.executesCondition {@code (implicitPrototype == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.returnsFrom {@code return this.properties.size();}
 *  */
    @Test
    public void testGetPropertiesCount_ImplicitPrototypeEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        int actual = prototypeObjectType.getPropertiesCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertiesCount()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertiesCount()}
 * @utbot.executesCondition {@code (implicitPrototype == null): False}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: properties.keySet())
 *  */
    @Test
    public void testGetPropertiesCount_ThrowNullPointerException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount(PrototypeObjectType.java:158) */
        prototypeObjectType.getPropertiesCount();
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertiesCount()}
 * @utbot.executesCondition {@code (implicitPrototype == null): True}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.properties.size();
 *  */
    @Test
    public void testGetPropertiesCount_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount(PrototypeObjectType.java:155) */
        prototypeObjectType.getPropertiesCount();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPropertiesCount()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertiesCount()}
     */
    @Test
    public void testGetPropertiesCountReturnsZero() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, false);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(Integer.MIN_VALUE, nodeArray, Integer.MIN_VALUE, 1);
        node.setType(0);
        Node node1 = new Node(1, node);
        node1.setType(1);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(0, null, null, null, 1, -1);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(0);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(1, 0, Integer.MIN_VALUE);
        node4.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(1, 1, -1);
        node5.setType(Integer.MAX_VALUE);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        int actual = prototypeObjectType1.getPropertiesCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.unboxesTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unboxesTo()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#unboxesTo()}
 * @utbot.executesCondition {@code (isStringObjectType()): False}
 * @utbot.executesCondition {@code (isBooleanObjectType()): False}
 * @utbot.executesCondition {@code (isNumberObjectType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isStringObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isBooleanObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNumberObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#unboxesTo()}
 * @utbot.returnsFrom {@code return super.unboxesTo();}
 *  */
    @Test
    public void testUnboxesTo_NotIsNumberObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        JSType actual = prototypeObjectType.unboxesTo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOwnProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOwnProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return properties.get(propertyName) != null;}
 *  */
    @Test
    public void testHasOwnProperty_PropertiesGetEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.hasOwnProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOwnProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOwnProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.get(propertyName) != null;
 *  */
    @Test
    public void testHasOwnProperty_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:174) */
        prototypeObjectType.hasOwnProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPropertyType(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertyType(java.lang.String)}
     */
    @Test
    public void testGetPropertyTypeWithNonEmptyString() throws Exception  {
    /* This block of code is 1280 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {};
        Node node = new Node(0, nodeArray, -1, Integer.MAX_VALUE);
        node.setType(Integer.MIN_VALUE);
        Node node1 = new Node(-1, node);
        node1.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node2 = new Node(Integer.MIN_VALUE, null, null, null, 0, Integer.MAX_VALUE);
        node2.setType(0);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node2, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType2 = new PrototypeObjectType(null, "-3", null, false);
        prototypeObjectType2.setOwnerFunction(null);
        FunctionType functionType1 = new FunctionType(jSTypeRegistry2, "\n\t\r", node1, arrowType, prototypeObjectType2, "abc", true, false);
        Node node3 = new Node(Integer.MAX_VALUE);
        node3.setType(0);
        functionType1.setSource(node3);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        jSTypeRegistry4.setResolveMode(resolveMode1);
        Node node4 = new Node(Integer.MIN_VALUE, -1, -1);
        node4.setType(-1);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType2 = new FunctionType(jSTypeRegistry4, "#$\\\"'", node4, arrowType1, null, "10", false, false);
        Node node5 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node5.setType(-1);
        functionType2.setSource(node5);
        FunctionType functionType3 = new FunctionType(null, "10", null, null, null, "\n\t\r", true, false);
        functionType3.setSource(null);
        functionType3.setOwnerFunction(null);
        functionType2.setOwnerFunction(functionType3);
        functionType1.setOwnerFunction(functionType2);
        prototypeObjectType1.setOwnerFunction(functionType1);
        
        UnknownType actual = ((UnknownType) prototypeObjectType1.getPropertyType("abc"));
        
        UnknownType expected = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[55];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Array.prototype";
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        String className1 = "Array";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties2 = new TreeMap();
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[0] = ((JSType) instanceObjectType);
        nativeTypes[1] = ((JSType) constructor);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Boolean.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        type1.setOwnerFunction(constructor1);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
        List implementedInterfaces1 = new ArrayList();
        constructor1.setImplementedInterfaces(implementedInterfaces1);
        List extendedInterfaces1 = new ArrayList();
        constructor1.setExtendedInterfaces(extendedInterfaces1);
        String className3 = "Boolean";
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties4 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties5 = new TreeMap();
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[3] = ((JSType) instanceObjectType1);
        nativeTypes[4] = ((JSType) constructor1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties6 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        type2.setOwnerFunction(constructor2);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
        List implementedInterfaces2 = new ArrayList();
        constructor2.setImplementedInterfaces(implementedInterfaces2);
        List extendedInterfaces2 = new ArrayList();
        constructor2.setExtendedInterfaces(extendedInterfaces2);
        String className5 = "Date";
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties7 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties8 = new TreeMap();
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[6] = ((JSType) instanceObjectType2);
        nativeTypes[7] = ((JSType) constructor2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first3, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(last3, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
        TreeMap properties9 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        List implementedInterfaces3 = new ArrayList();
        errorFunctionType.setImplementedInterfaces(implementedInterfaces3);
        List extendedInterfaces3 = new ArrayList();
        errorFunctionType.setExtendedInterfaces(extendedInterfaces3);
        ArrayList subTypes = new ArrayList();
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
        TreeMap properties10 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        List implementedInterfaces4 = new ArrayList();
        errorFunctionType1.setImplementedInterfaces(implementedInterfaces4);
        List extendedInterfaces4 = new ArrayList();
        errorFunctionType1.setExtendedInterfaces(extendedInterfaces4);
        String className6 = "EvalError";
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties11 = new TreeMap();
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType1.setPrettyPrint(true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
        TreeMap properties12 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces5 = new ArrayList();
        errorFunctionType2.setImplementedInterfaces(implementedInterfaces5);
        List extendedInterfaces5 = new ArrayList();
        errorFunctionType2.setExtendedInterfaces(extendedInterfaces5);
        String className7 = "RangeError";
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties13 = new TreeMap();
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType2.setPrettyPrint(true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType2);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        List implementedInterfaces6 = new ArrayList();
        errorFunctionType3.setImplementedInterfaces(implementedInterfaces6);
        List extendedInterfaces6 = new ArrayList();
        errorFunctionType3.setExtendedInterfaces(extendedInterfaces6);
        String className8 = "ReferenceError";
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties15 = new TreeMap();
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType3.setPrettyPrint(true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType3);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
        TreeMap properties16 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        List implementedInterfaces7 = new ArrayList();
        errorFunctionType4.setImplementedInterfaces(implementedInterfaces7);
        List extendedInterfaces7 = new ArrayList();
        errorFunctionType4.setExtendedInterfaces(extendedInterfaces7);
        String className9 = "SyntaxError";
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties17 = new TreeMap();
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType4.setPrettyPrint(true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType4);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
        TreeMap properties18 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        List implementedInterfaces8 = new ArrayList();
        errorFunctionType5.setImplementedInterfaces(implementedInterfaces8);
        List extendedInterfaces8 = new ArrayList();
        errorFunctionType5.setExtendedInterfaces(extendedInterfaces8);
        String className10 = "TypeError";
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties19 = new TreeMap();
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType5.setPrettyPrint(true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType5);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
        TreeMap properties20 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        List implementedInterfaces9 = new ArrayList();
        errorFunctionType6.setImplementedInterfaces(implementedInterfaces9);
        List extendedInterfaces9 = new ArrayList();
        errorFunctionType6.setExtendedInterfaces(extendedInterfaces9);
        String className11 = "URIError";
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType6.setPrettyPrint(true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(errorFunctionType6);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        String className12 = "Error";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType.setPrettyPrint(true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[8] = ((JSType) errorFunctionType);
        nativeTypes[9] = ((JSType) returnType1);
        nativeTypes[10] = ((JSType) errorFunctionType1);
        nativeTypes[11] = ((JSType) typeOfThis);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first4, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className13 = "Function.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties23 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties24 = new TreeMap();
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type9.setOwnerFunction(functionType4);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        List implementedInterfaces10 = new ArrayList();
        typeOfThis7.setImplementedInterfaces(implementedInterfaces10);
        List extendedInterfaces10 = new ArrayList();
        typeOfThis7.setExtendedInterfaces(extendedInterfaces10);
        TreeMap properties25 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis7.setPrettyPrint(true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        List implementedInterfaces11 = new ArrayList();
        typeOfThis6.setImplementedInterfaces(implementedInterfaces11);
        List extendedInterfaces11 = new ArrayList();
        typeOfThis6.setExtendedInterfaces(extendedInterfaces11);
        String className14 = "Function";
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties26 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type9);
        typeOfThis6.setPrettyPrint(true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        List implementedInterfaces12 = new ArrayList();
        functionType4.setImplementedInterfaces(implementedInterfaces12);
        List extendedInterfaces12 = new ArrayList();
        functionType4.setExtendedInterfaces(extendedInterfaces12);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties27 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[12] = ((JSType) functionType4);
        nativeTypes[13] = ((JSType) typeOfThis6);
        nativeTypes[14] = ((JSType) type9);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters13.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters13, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className15 = "Number.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
        TreeMap properties28 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type10.setOwnerFunction(constructor4);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
        List implementedInterfaces13 = new ArrayList();
        constructor4.setImplementedInterfaces(implementedInterfaces13);
        List extendedInterfaces13 = new ArrayList();
        constructor4.setExtendedInterfaces(extendedInterfaces13);
        String className16 = "Number";
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className16);
        TreeMap properties29 = new TreeMap();
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor4.setPrettyPrint(true);
        setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties30 = new TreeMap();
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[17] = ((JSType) instanceObjectType3);
        nativeTypes[18] = ((JSType) constructor4);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback3);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters14.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first7)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first7, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(first7, "com.google.javascript.rhino.Node", "parent", parameters14);
        setField(parameters14, "com.google.javascript.rhino.Node", "first", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "last", first7);
        setField(parameters14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties31 = new TreeMap();
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(type11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type11.setOwnerFunction(functionType5);
        setField(type11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback3);
        List implementedInterfaces14 = new ArrayList();
        functionType5.setImplementedInterfaces(implementedInterfaces14);
        List extendedInterfaces14 = new ArrayList();
        functionType5.setExtendedInterfaces(extendedInterfaces14);
        ArrayList subTypes1 = new ArrayList();
        subTypes1.add(functionType4);
        subTypes1.add(constructor);
        subTypes1.add(constructor1);
        subTypes1.add(constructor2);
        subTypes1.add(constructor4);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType6);
        TreeMap properties32 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        List implementedInterfaces15 = new ArrayList();
        functionType6.setImplementedInterfaces(implementedInterfaces15);
        List extendedInterfaces15 = new ArrayList();
        functionType6.setExtendedInterfaces(extendedInterfaces15);
        String className17 = "RegExp";
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className17);
        TreeMap properties33 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType6);
        FunctionType functionType7 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType7);
        TreeMap properties34 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        List implementedInterfaces16 = new ArrayList();
        functionType7.setImplementedInterfaces(implementedInterfaces16);
        List extendedInterfaces16 = new ArrayList();
        functionType7.setExtendedInterfaces(extendedInterfaces16);
        String className18 = "String";
        setField(functionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className18);
        TreeMap properties35 = new TreeMap();
        setField(functionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(functionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType7.setPrettyPrint(true);
        setField(functionType7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes1.add(functionType7);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        String className19 = "Object";
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className19);
        TreeMap properties36 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[20] = ((JSType) functionType5);
        nativeTypes[21] = ((JSType) type11);
        nativeTypes[22] = ((JSType) errorFunctionType2);
        nativeTypes[23] = ((JSType) typeOfThis1);
        nativeTypes[24] = ((JSType) errorFunctionType3);
        nativeTypes[25] = ((JSType) typeOfThis2);
        nativeTypes[26] = ((JSType) typeOfThis8);
        nativeTypes[27] = ((JSType) functionType6);
        nativeTypes[28] = ((JSType) typeOfThis9);
        nativeTypes[29] = ((JSType) functionType7);
        nativeTypes[30] = ((JSType) returnType);
        nativeTypes[31] = ((JSType) errorFunctionType4);
        nativeTypes[32] = ((JSType) typeOfThis3);
        nativeTypes[33] = ((JSType) errorFunctionType5);
        nativeTypes[34] = ((JSType) typeOfThis4);
        nativeTypes[35] = ((JSType) expected);
        nativeTypes[36] = ((JSType) errorFunctionType6);
        nativeTypes[37] = ((JSType) typeOfThis5);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[38] = ((JSType) voidType);
        nativeTypes[39] = ((JSType) type11);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates = new ArrayList();
        alternates.add(typeOfThis9);
        alternates.add(returnType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 474305212);
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[40] = ((JSType) unionType);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(instanceObjectType3);
        alternates1.add(numberType);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1523636315);
        setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[41] = ((JSType) unionType1);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(allType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[42] = ((JSType) allType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters17.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first8, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters17);
        setField(parameters17, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType);
        List implementedInterfaces17 = new ArrayList();
        noType.setImplementedInterfaces(implementedInterfaces17);
        List extendedInterfaces17 = new ArrayList();
        noType.setExtendedInterfaces(extendedInterfaces17);
        TreeMap properties37 = new TreeMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType.setPrettyPrint(true);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) typeOfThis7);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType);
        List implementedInterfaces18 = new ArrayList();
        noResolvedType.setImplementedInterfaces(implementedInterfaces18);
        List extendedInterfaces18 = new ArrayList();
        noResolvedType.setExtendedInterfaces(extendedInterfaces18);
        TreeMap properties38 = new TreeMap();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType.setPrettyPrint(true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first10);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType4);
        List implementedInterfaces19 = new ArrayList();
        constructor5.setImplementedInterfaces(implementedInterfaces19);
        List extendedInterfaces19 = new ArrayList();
        constructor5.setExtendedInterfaces(extendedInterfaces19);
        String className20 = "global this";
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className20);
        TreeMap properties39 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties40 = new TreeMap();
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[46] = ((JSType) instanceObjectType4);
        nativeTypes[47] = ((JSType) typeOfThis6);
        FunctionType functionType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters20.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first11, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first11)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first11, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first11, "com.google.javascript.rhino.Node", "jsType", expected);
        setField(first11, "com.google.javascript.rhino.Node", "parent", parameters20);
        setField(parameters20, "com.google.javascript.rhino.Node", "first", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "last", first11);
        setField(parameters20, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", expected);
        List implementedInterfaces20 = new ArrayList();
        functionType8.setImplementedInterfaces(implementedInterfaces20);
        List extendedInterfaces20 = new ArrayList();
        functionType8.setExtendedInterfaces(extendedInterfaces20);
        TreeMap properties41 = new TreeMap();
        setField(functionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(functionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        functionType8.setPrettyPrint(true);
        setField(functionType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[48] = ((JSType) functionType8);
        FunctionType functionType9 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", allType);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters21);
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", expected);
        List implementedInterfaces21 = new ArrayList();
        functionType9.setImplementedInterfaces(implementedInterfaces21);
        List extendedInterfaces21 = new ArrayList();
        functionType9.setExtendedInterfaces(extendedInterfaces21);
        TreeMap properties42 = new TreeMap();
        setField(functionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        setField(functionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType9.setPrettyPrint(true);
        setField(functionType9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[49] = ((JSType) functionType9);
        FunctionType functionType10 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", noType);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", allType);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType10, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        setField(functionType10, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType10, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", expected);
        List implementedInterfaces22 = new ArrayList();
        functionType10.setImplementedInterfaces(implementedInterfaces22);
        List extendedInterfaces22 = new ArrayList();
        functionType10.setExtendedInterfaces(extendedInterfaces22);
        TreeMap properties43 = new TreeMap();
        setField(functionType10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(functionType10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis6);
        functionType10.setPrettyPrint(true);
        setField(functionType10, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType10, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[50] = ((JSType) functionType10);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(implicitPrototypeFallback3);
        alternates2.add(numberType);
        alternates2.add(returnType);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1638536569);
        setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[51] = ((JSType) unionType2);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(implicitPrototypeFallback3);
        alternates3.add(numberType);
        alternates3.add(returnType);
        alternates3.add(booleanType);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1781799248);
        setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[52] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(numberType);
        alternates4.add(returnType);
        alternates4.add(booleanType);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1997996877);
        setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[53] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(numberType);
        alternates5.add(returnType);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1793702326);
        setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        nativeTypes[54] = ((JSType) unionType5);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        namesToTypes.put(string, voidType);
        String string1 = "Null";
        namesToTypes.put(string1, nullType);
        String string2 = "void";
        namesToTypes.put(string2, voidType);
        String string3 = "string";
        namesToTypes.put(string3, returnType);
        namesToTypes.put(className8, typeOfThis2);
        namesToTypes.put(className17, typeOfThis8);
        namesToTypes.put(className12, returnType1);
        namesToTypes.put(className11, typeOfThis5);
        namesToTypes.put(className6, typeOfThis);
        namesToTypes.put(className18, typeOfThis9);
        namesToTypes.put(className5, instanceObjectType2);
        String string4 = "undefined";
        namesToTypes.put(string4, voidType);
        namesToTypes.put(className1, instanceObjectType);
        String string5 = "number";
        namesToTypes.put(string5, numberType);
        namesToTypes.put(className14, typeOfThis6);
        String string6 = "boolean";
        namesToTypes.put(string6, booleanType);
        String string7 = "null";
        namesToTypes.put(string7, nullType);
        namesToTypes.put(className16, instanceObjectType3);
        namesToTypes.put(className9, typeOfThis3);
        namesToTypes.put(className10, typeOfThis4);
        namesToTypes.put(className7, typeOfThis1);
        namesToTypes.put(className19, implicitPrototypeFallback3);
        namesToTypes.put(className3, instanceObjectType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry);
        ArrayList alternates6 = new ArrayList();
        alternates6.add(functionType5);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates6);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty.put(name, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(className19, functionType5);
        eachRefTypeIndexedByProperty.put(name, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "expectedValuesPerKey", 8);
        LinkedHashSet linkedEntries = new LinkedHashSet();
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "linkedEntries", linkedEntries);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        registry.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        boolean actualIsChecked = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnknownType", "isChecked"));
        assertFalse(actualIsChecked);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "expectedValuesPerKey"));
        int actualRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryInterfaceToImplementorsExpectedValuesPerKey, actualRegistryInterfaceToImplementorsExpectedValuesPerKey);
        
        Collection expectedRegistryInterfaceToImplementorsLinkedEntries = ((Collection) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "linkedEntries"));
        Collection actualRegistryInterfaceToImplementorsLinkedEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "linkedEntries"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsLinkedEntries, actualRegistryInterfaceToImplementorsLinkedEntries));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.canBeCalled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#canBeCalled()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isRegexpType()}
 * @utbot.returnsFrom {@code return isRegexpType();}
 *  */
    @Test
    public void testCanBeCalled_PrototypeObjectTypeIsRegexpType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.canBeCalled();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#removeProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return properties.remove(name) != null;}
 *  */
    @Test
    public void testRemoveProperty_PropertiesRemoveEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.removeProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#removeProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.remove(name) != null;
 *  */
    @Test
    public void testRemoveProperty_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty(PrototypeObjectType.java:253) */
        prototypeObjectType.removeProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setPrettyPrint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrettyPrint(boolean)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPrettyPrint(boolean)}
 *  */
    @Test
    public void testSetPrettyPrint() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setPrettyPrint(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (ObjectType) implicitPrototype.resolve(t, scope)
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        AllType resolveResult = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (ObjectType) implicitPrototype.resolve(t, scope)
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        ParameterizedType resolveResult = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: (ObjectType) implicitPrototype.resolve(t, scope)
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1083)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties.values())
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:548) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties.values())
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        EnumElementType resolveResult = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:548) */
        prototypeObjectType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
     */
    @Test
    public void testResolveInternal() throws Exception  {
    /* This block of code is 1960 lines long and could lead to compilation error
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry1, "XZ", null);
        FunctionType functionType = new FunctionType(null, "10", null, null, null, "-3", false, true);
        functionType.setOwnerFunction(null);
        functionType.setSource(null);
        prototypeObjectType.setOwnerFunction(functionType);
        PrototypeObjectType prototypeObjectType1 = new PrototypeObjectType(jSTypeRegistry, "\n\t\r", prototypeObjectType, true);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        PrototypeObjectType actual = ((PrototypeObjectType) prototypeObjectType1.resolveInternal(simpleErrorReporter1, null));
        
        PrototypeObjectType expected = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "\n\t\r";
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        PrototypeObjectType implicitPrototypeFallback = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className1 = "XZ";
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties1 = new TreeMap();
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        InstanceObjectType implicitPrototypeFallback1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "parent", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(parameters, "com.google.javascript.rhino.Node", "last", first);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[55];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[0] = ((JSType) instanceObjectType);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[1] = ((JSType) functionType1);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[3] = ((JSType) instanceObjectType1);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[4] = ((JSType) functionType2);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[6] = ((JSType) instanceObjectType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[7] = ((JSType) functionType3);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[8] = ((JSType) errorFunctionType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[9] = ((JSType) instanceObjectType3);
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[10] = ((JSType) errorFunctionType1);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[11] = ((JSType) instanceObjectType4);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[12] = ((JSType) functionType4);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[13] = ((JSType) anonymousFunctionType);
        PrototypeObjectType prototypeObjectType2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[14] = ((JSType) prototypeObjectType2);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[17] = ((JSType) instanceObjectType5);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[18] = ((JSType) functionType5);
        nativeTypes[19] = ((JSType) implicitPrototypeFallback1);
        nativeTypes[20] = ((JSType) constructor);
        PrototypeObjectType prototypeObjectType3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[21] = ((JSType) prototypeObjectType3);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[22] = ((JSType) errorFunctionType2);
        InstanceObjectType instanceObjectType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[23] = ((JSType) instanceObjectType6);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[24] = ((JSType) errorFunctionType3);
        InstanceObjectType instanceObjectType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[25] = ((JSType) instanceObjectType7);
        InstanceObjectType instanceObjectType8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[26] = ((JSType) instanceObjectType8);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[27] = ((JSType) functionType6);
        InstanceObjectType instanceObjectType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[28] = ((JSType) instanceObjectType9);
        FunctionType functionType7 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[29] = ((JSType) functionType7);
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        nativeTypes[30] = ((JSType) stringType);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[31] = ((JSType) errorFunctionType4);
        InstanceObjectType instanceObjectType10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[32] = ((JSType) instanceObjectType10);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[33] = ((JSType) errorFunctionType5);
        InstanceObjectType instanceObjectType11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[34] = ((JSType) instanceObjectType11);
        nativeTypes[35] = ((JSType) returnType);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[36] = ((JSType) errorFunctionType6);
        InstanceObjectType instanceObjectType12 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[37] = ((JSType) instanceObjectType12);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        nativeTypes[38] = ((JSType) voidType);
        PrototypeObjectType prototypeObjectType4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[39] = ((JSType) prototypeObjectType4);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[40] = ((JSType) unionType);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[41] = ((JSType) unionType1);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[42] = ((JSType) allType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[43] = ((JSType) noType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[44] = ((JSType) noObjectType);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType13 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[46] = ((JSType) instanceObjectType13);
        FunctionType anonymousFunctionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[47] = ((JSType) anonymousFunctionType1);
        FunctionType functionType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[48] = ((JSType) functionType8);
        FunctionType functionType9 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[49] = ((JSType) functionType9);
        FunctionType functionType10 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[50] = ((JSType) functionType10);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[51] = ((JSType) unionType2);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[52] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[53] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[54] = ((JSType) unionType5);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        VoidType voidType1 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string, voidType1);
        String string1 = "Null";
        NullType nullType1 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        namesToTypes.put(string1, nullType1);
        String string2 = "void";
        VoidType voidType2 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string2, voidType2);
        String string3 = "string";
        StringType stringType1 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        namesToTypes.put(string3, stringType1);
        String string4 = "ReferenceError";
        InstanceObjectType instanceObjectType14 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string4, instanceObjectType14);
        String string5 = "RegExp";
        InstanceObjectType instanceObjectType15 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string5, instanceObjectType15);
        String string6 = "Error";
        InstanceObjectType instanceObjectType16 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string6, instanceObjectType16);
        String string7 = "URIError";
        InstanceObjectType instanceObjectType17 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string7, instanceObjectType17);
        String string8 = "EvalError";
        InstanceObjectType instanceObjectType18 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string8, instanceObjectType18);
        String string9 = "String";
        InstanceObjectType instanceObjectType19 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string9, instanceObjectType19);
        String string10 = "Date";
        InstanceObjectType instanceObjectType20 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string10, instanceObjectType20);
        String string11 = "undefined";
        VoidType voidType3 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string11, voidType3);
        String string12 = "Array";
        InstanceObjectType instanceObjectType21 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string12, instanceObjectType21);
        String string13 = "number";
        NumberType numberType1 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        namesToTypes.put(string13, numberType1);
        String string14 = "Function";
        FunctionType anonymousFunctionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        namesToTypes.put(string14, anonymousFunctionType2);
        String string15 = "boolean";
        BooleanType booleanType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        namesToTypes.put(string15, booleanType1);
        String string16 = "null";
        NullType nullType2 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        namesToTypes.put(string16, nullType2);
        String string17 = "Number";
        InstanceObjectType instanceObjectType22 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string17, instanceObjectType22);
        String string18 = "SyntaxError";
        InstanceObjectType instanceObjectType23 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string18, instanceObjectType23);
        String string19 = "TypeError";
        InstanceObjectType instanceObjectType24 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string19, instanceObjectType24);
        String string20 = "RangeError";
        InstanceObjectType instanceObjectType25 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string20, instanceObjectType25);
        String string21 = "Object";
        namesToTypes.put(string21, implicitPrototypeFallback1);
        String string22 = "Boolean";
        InstanceObjectType instanceObjectType26 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string22, instanceObjectType26);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        String string23 = "prototype";
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        typesIndexedByProperty.put(string23, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        hashMap.put(string21, constructor);
        eachRefTypeIndexedByProperty.put(string23, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        registry.setResolveMode(resolveMode1);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties2 = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolveResult", type);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback1);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        ArrayList subTypes = new ArrayList();
        FunctionType functionType11 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType11, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType11, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(functionType11, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces1 = new ArrayList();
        typeOfThis.setImplementedInterfaces(implementedInterfaces1);
        List extendedInterfaces1 = new ArrayList();
        typeOfThis.setExtendedInterfaces(extendedInterfaces1);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string14);
        TreeMap properties3 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        PrototypeObjectType implicitPrototypeFallback2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        typeOfThis.setPrettyPrint(true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType11, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        List implementedInterfaces2 = new ArrayList();
        functionType11.setImplementedInterfaces(implementedInterfaces2);
        List extendedInterfaces2 = new ArrayList();
        functionType11.setExtendedInterfaces(extendedInterfaces2);
        setField(functionType11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string14);
        TreeMap properties4 = new TreeMap();
        setField(functionType11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(functionType11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType11.setPrettyPrint(true);
        setField(functionType11, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType11, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType11);
        FunctionType functionType12 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType12);
        TreeMap properties5 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        List implementedInterfaces3 = new ArrayList();
        functionType12.setImplementedInterfaces(implementedInterfaces3);
        List extendedInterfaces3 = new ArrayList();
        functionType12.setExtendedInterfaces(extendedInterfaces3);
        setField(functionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string12);
        TreeMap properties6 = new TreeMap();
        setField(functionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(functionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType12.setPrettyPrint(true);
        setField(functionType12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType12);
        FunctionType functionType13 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        BooleanType returnType2 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType13);
        TreeMap properties7 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        List implementedInterfaces4 = new ArrayList();
        functionType13.setImplementedInterfaces(implementedInterfaces4);
        List extendedInterfaces4 = new ArrayList();
        functionType13.setExtendedInterfaces(extendedInterfaces4);
        setField(functionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string22);
        TreeMap properties8 = new TreeMap();
        setField(functionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(functionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType13.setPrettyPrint(true);
        setField(functionType13, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType13);
        FunctionType functionType14 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        StringType returnType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType14);
        TreeMap properties9 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        List implementedInterfaces5 = new ArrayList();
        functionType14.setImplementedInterfaces(implementedInterfaces5);
        List extendedInterfaces5 = new ArrayList();
        functionType14.setExtendedInterfaces(extendedInterfaces5);
        setField(functionType14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string10);
        TreeMap properties10 = new TreeMap();
        setField(functionType14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(functionType14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType14.setPrettyPrint(true);
        setField(functionType14, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType14);
        FunctionType functionType15 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        NumberType returnType4 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType15);
        TreeMap properties11 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        List implementedInterfaces6 = new ArrayList();
        functionType15.setImplementedInterfaces(implementedInterfaces6);
        List extendedInterfaces6 = new ArrayList();
        functionType15.setExtendedInterfaces(extendedInterfaces6);
        setField(functionType15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string17);
        TreeMap properties12 = new TreeMap();
        setField(functionType15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(functionType15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType15.setPrettyPrint(true);
        setField(functionType15, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType15);
        FunctionType functionType16 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType16);
        TreeMap properties13 = new TreeMap();
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        List implementedInterfaces7 = new ArrayList();
        functionType16.setImplementedInterfaces(implementedInterfaces7);
        List extendedInterfaces7 = new ArrayList();
        functionType16.setExtendedInterfaces(extendedInterfaces7);
        setField(functionType16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string5);
        TreeMap properties14 = new TreeMap();
        setField(functionType16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(functionType16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType16.setPrettyPrint(true);
        setField(functionType16, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType16);
        FunctionType functionType17 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        StringType returnType6 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType17);
        TreeMap properties15 = new TreeMap();
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
        List implementedInterfaces8 = new ArrayList();
        functionType17.setImplementedInterfaces(implementedInterfaces8);
        List extendedInterfaces8 = new ArrayList();
        functionType17.setExtendedInterfaces(extendedInterfaces8);
        setField(functionType17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string9);
        TreeMap properties16 = new TreeMap();
        setField(functionType17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(functionType17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType17.setPrettyPrint(true);
        setField(functionType17, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType17);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string21);
        TreeMap properties17 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties18 = new TreeMap();
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.JSType", "resolveResult", implicitPrototypeFallback1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", implicitPrototypeFallback);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult", expected);
        JSTypeRegistry registry1 = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes1 = new com.google.javascript.rhino.jstype.JSType[55];
        InstanceObjectType instanceObjectType27 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters8.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters8, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters8, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType27);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot8 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type8 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Array.prototype";
        setField(type8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties19 = new TreeMap();
        setField(type8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(type8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback3);
        type8.setOwnerFunction(constructor1);
        setField(type8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type8, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        prototypeSlot8.setType(type8);
        setField(prototypeSlot8, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot8);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType27);
        List implementedInterfaces9 = new ArrayList();
        constructor1.setImplementedInterfaces(implementedInterfaces9);
        List extendedInterfaces9 = new ArrayList();
        constructor1.setExtendedInterfaces(extendedInterfaces9);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string12);
        TreeMap properties20 = new TreeMap();
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(constructor1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor1.setPrettyPrint(true);
        setField(constructor1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor1, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(instanceObjectType27, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
        TreeMap properties21 = new TreeMap();
        setField(instanceObjectType27, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(instanceObjectType27, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType27, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType27, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[0] = ((JSType) instanceObjectType27);
        nativeTypes1[1] = ((JSType) constructor1);
        BooleanType booleanType2 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(booleanType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[2] = ((JSType) booleanType2);
        InstanceObjectType instanceObjectType28 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters9.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters9, "com.google.javascript.rhino.Node", "first", first2);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters9, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
        setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType2);
        setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        ObjectType.Property prototypeSlot9 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type9 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className3 = "Boolean.prototype";
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties22 = new TreeMap();
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback4);
        type9.setOwnerFunction(constructor2);
        setField(type9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type9, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        prototypeSlot9.setType(type9);
        setField(prototypeSlot9, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot9);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType28);
        List implementedInterfaces10 = new ArrayList();
        constructor2.setImplementedInterfaces(implementedInterfaces10);
        List extendedInterfaces10 = new ArrayList();
        constructor2.setExtendedInterfaces(extendedInterfaces10);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string22);
        TreeMap properties23 = new TreeMap();
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor2.setPrettyPrint(true);
        setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(instanceObjectType28, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
        TreeMap properties24 = new TreeMap();
        setField(instanceObjectType28, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(instanceObjectType28, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType28, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType28, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[3] = ((JSType) instanceObjectType28);
        nativeTypes1[4] = ((JSType) constructor2);
        UnknownType unknownType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType1, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        setField(unknownType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(unknownType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[5] = ((JSType) unknownType1);
        InstanceObjectType instanceObjectType29 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters10.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters10, "com.google.javascript.rhino.Node", "first", first3);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters10, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
        StringType returnType7 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
        ObjectType.Property prototypeSlot10 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type10 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Date.prototype";
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties25 = new TreeMap();
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        InstanceObjectType implicitPrototypeFallback5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(type10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback5);
        type10.setOwnerFunction(constructor3);
        setField(type10, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type10, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        prototypeSlot10.setType(type10);
        setField(prototypeSlot10, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot10);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType29);
        List implementedInterfaces11 = new ArrayList();
        constructor3.setImplementedInterfaces(implementedInterfaces11);
        List extendedInterfaces11 = new ArrayList();
        constructor3.setExtendedInterfaces(extendedInterfaces11);
        setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string10);
        TreeMap properties26 = new TreeMap();
        setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor3.setPrettyPrint(true);
        setField(constructor3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor3, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(instanceObjectType29, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
        TreeMap properties27 = new TreeMap();
        setField(instanceObjectType29, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
        setField(instanceObjectType29, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType29, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType29, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[6] = ((JSType) instanceObjectType29);
        nativeTypes1[7] = ((JSType) constructor3);
        ErrorFunctionType errorFunctionType7 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters11.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first4)).setType(38);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first4, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first4, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first4, "com.google.javascript.rhino.Node", "parent", parameters11);
        setField(parameters11, "com.google.javascript.rhino.Node", "first", first4);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last3)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(last3, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(last3, "com.google.javascript.rhino.Node", "parent", parameters11);
        setField(parameters11, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
        InstanceObjectType returnType8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType7);
        TreeMap properties28 = new TreeMap();
        setField(returnType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
        setField(returnType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
        setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
        List implementedInterfaces12 = new ArrayList();
        errorFunctionType7.setImplementedInterfaces(implementedInterfaces12);
        List extendedInterfaces12 = new ArrayList();
        errorFunctionType7.setExtendedInterfaces(extendedInterfaces12);
        ArrayList subTypes1 = new ArrayList();
        ErrorFunctionType errorFunctionType8 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call13 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
        InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
        setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
        ObjectType.Property prototypeSlot11 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type11 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot11.setType(type11);
        setField(prototypeSlot11, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot11);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType8);
        TreeMap properties29 = new TreeMap();
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
        List implementedInterfaces13 = new ArrayList();
        errorFunctionType8.setImplementedInterfaces(implementedInterfaces13);
        List extendedInterfaces13 = new ArrayList();
        errorFunctionType8.setExtendedInterfaces(extendedInterfaces13);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string8);
        TreeMap properties30 = new TreeMap();
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType8.setPrettyPrint(true);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes1.add(errorFunctionType8);
        ErrorFunctionType errorFunctionType9 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call14 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
        InstanceObjectType returnType10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType10);
        setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
        ObjectType.Property prototypeSlot12 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type12 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot12.setType(type12);
        setField(prototypeSlot12, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot12);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType9);
        TreeMap properties31 = new TreeMap();
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
        List implementedInterfaces14 = new ArrayList();
        errorFunctionType9.setImplementedInterfaces(implementedInterfaces14);
        List extendedInterfaces14 = new ArrayList();
        errorFunctionType9.setExtendedInterfaces(extendedInterfaces14);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string20);
        TreeMap properties32 = new TreeMap();
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType9.setPrettyPrint(true);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType9, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes1.add(errorFunctionType9);
        ErrorFunctionType errorFunctionType10 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call15 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
        InstanceObjectType returnType11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType11);
        setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
        ObjectType.Property prototypeSlot13 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type13 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot13.setType(type13);
        setField(prototypeSlot13, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot13);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType10);
        TreeMap properties33 = new TreeMap();
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis10, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis10);
        List implementedInterfaces15 = new ArrayList();
        errorFunctionType10.setImplementedInterfaces(implementedInterfaces15);
        List extendedInterfaces15 = new ArrayList();
        errorFunctionType10.setExtendedInterfaces(extendedInterfaces15);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string4);
        TreeMap properties34 = new TreeMap();
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType10.setPrettyPrint(true);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType10, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes1.add(errorFunctionType10);
        ErrorFunctionType errorFunctionType11 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call16 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
        InstanceObjectType returnType12 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType12);
        setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
        ObjectType.Property prototypeSlot14 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot14, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type14 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot14.setType(type14);
        setField(prototypeSlot14, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot14);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType11);
        TreeMap properties35 = new TreeMap();
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis11, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis11);
        List implementedInterfaces16 = new ArrayList();
        errorFunctionType11.setImplementedInterfaces(implementedInterfaces16);
        List extendedInterfaces16 = new ArrayList();
        errorFunctionType11.setExtendedInterfaces(extendedInterfaces16);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string18);
        TreeMap properties36 = new TreeMap();
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType11.setPrettyPrint(true);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType11, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes1.add(errorFunctionType11);
        ErrorFunctionType errorFunctionType12 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
        InstanceObjectType returnType13 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType13);
        setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
        ObjectType.Property prototypeSlot15 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot15, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type15 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot15.setType(type15);
        setField(prototypeSlot15, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot15);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis12 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis12, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType12);
        TreeMap properties37 = new TreeMap();
        setField(typeOfThis12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
        setField(typeOfThis12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis12, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis12);
        List implementedInterfaces17 = new ArrayList();
        errorFunctionType12.setImplementedInterfaces(implementedInterfaces17);
        List extendedInterfaces17 = new ArrayList();
        errorFunctionType12.setExtendedInterfaces(extendedInterfaces17);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string19);
        TreeMap properties38 = new TreeMap();
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType12.setPrettyPrint(true);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType12, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes1.add(errorFunctionType12);
        ErrorFunctionType errorFunctionType13 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call18 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
        InstanceObjectType returnType14 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType14);
        setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
        ObjectType.Property prototypeSlot16 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot16, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type16 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot16.setType(type16);
        setField(prototypeSlot16, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot16);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis13 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis13, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType13);
        TreeMap properties39 = new TreeMap();
        setField(typeOfThis13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
        setField(typeOfThis13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis13, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis13, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis13);
        List implementedInterfaces18 = new ArrayList();
        errorFunctionType13.setImplementedInterfaces(implementedInterfaces18);
        List extendedInterfaces18 = new ArrayList();
        errorFunctionType13.setExtendedInterfaces(extendedInterfaces18);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string7);
        TreeMap properties40 = new TreeMap();
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType13.setPrettyPrint(true);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType13, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes1.add(errorFunctionType13);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string6);
        TreeMap properties41 = new TreeMap();
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        errorFunctionType7.setPrettyPrint(true);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(errorFunctionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[8] = ((JSType) errorFunctionType7);
        nativeTypes1[9] = ((JSType) returnType8);
        nativeTypes1[10] = ((JSType) errorFunctionType8);
        nativeTypes1[11] = ((JSType) typeOfThis8);
        FunctionType functionType18 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call19 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters18.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first5, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first5)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first5, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first5, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first5, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(first5, "com.google.javascript.rhino.Node", "parent", parameters18);
        setField(parameters18, "com.google.javascript.rhino.Node", "first", first5);
        setField(parameters18, "com.google.javascript.rhino.Node", "last", first5);
        setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
        UnknownType returnType15 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType15, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType15, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType15);
        setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType18, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
        ObjectType.Property prototypeSlot17 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot17, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type17 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className5 = "Function.prototype";
        setField(type17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties42 = new TreeMap();
        setField(type17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
        InstanceObjectType implicitPrototypeFallback6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback6, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
        TreeMap properties43 = new TreeMap();
        setField(implicitPrototypeFallback6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
        setField(implicitPrototypeFallback6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback6, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(type17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback6);
        type17.setOwnerFunction(functionType18);
        setField(type17, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type17, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        prototypeSlot17.setType(type17);
        setField(prototypeSlot17, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType18, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot17);
        setField(functionType18, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis14 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry1);
        ArrowType call20 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters19 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters19.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "first", first6);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters19, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters19, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters19);
        setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType15);
        setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis15 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call21 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters20 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters20);
        setField(call21, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis15);
        setField(call21, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.FunctionType", "call", call21);
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis15);
        List implementedInterfaces19 = new ArrayList();
        typeOfThis15.setImplementedInterfaces(implementedInterfaces19);
        List extendedInterfaces19 = new ArrayList();
        typeOfThis15.setExtendedInterfaces(extendedInterfaces19);
        TreeMap properties44 = new TreeMap();
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties44);
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis15.setPrettyPrint(true);
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis15, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis15);
        List implementedInterfaces20 = new ArrayList();
        typeOfThis14.setImplementedInterfaces(implementedInterfaces20);
        List extendedInterfaces20 = new ArrayList();
        typeOfThis14.setExtendedInterfaces(extendedInterfaces20);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string14);
        TreeMap properties45 = new TreeMap();
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties45);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type17);
        typeOfThis14.setPrettyPrint(true);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis14, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType18, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis14);
        List implementedInterfaces21 = new ArrayList();
        functionType18.setImplementedInterfaces(implementedInterfaces21);
        List extendedInterfaces21 = new ArrayList();
        functionType18.setExtendedInterfaces(extendedInterfaces21);
        setField(functionType18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string14);
        TreeMap properties46 = new TreeMap();
        setField(functionType18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties46);
        setField(functionType18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType18.setPrettyPrint(true);
        setField(functionType18, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType18, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[12] = ((JSType) functionType18);
        nativeTypes1[13] = ((JSType) typeOfThis14);
        nativeTypes1[14] = ((JSType) type17);
        NullType nullType3 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(nullType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[15] = ((JSType) nullType3);
        NumberType numberType2 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(numberType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[16] = ((JSType) numberType2);
        InstanceObjectType instanceObjectType30 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call22 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters21 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters21.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters21, "com.google.javascript.rhino.Node", "first", first7);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters21, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters21, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters21);
        setField(call22, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType2);
        setField(call22, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "call", call22);
        ObjectType.Property prototypeSlot18 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot18, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type18 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className6 = "Number.prototype";
        setField(type18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties47 = new TreeMap();
        setField(type18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties47);
        setField(type18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type18, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback6);
        type18.setOwnerFunction(constructor5);
        setField(type18, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        prototypeSlot18.setType(type18);
        setField(prototypeSlot18, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot18);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType30);
        List implementedInterfaces22 = new ArrayList();
        constructor5.setImplementedInterfaces(implementedInterfaces22);
        List extendedInterfaces22 = new ArrayList();
        constructor5.setExtendedInterfaces(extendedInterfaces22);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string17);
        TreeMap properties48 = new TreeMap();
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties48);
        setField(constructor5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor5.setPrettyPrint(true);
        setField(constructor5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor5, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(instanceObjectType30, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor5);
        TreeMap properties49 = new TreeMap();
        setField(instanceObjectType30, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties49);
        setField(instanceObjectType30, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType30, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[17] = ((JSType) instanceObjectType30);
        nativeTypes1[18] = ((JSType) constructor5);
        nativeTypes1[19] = ((JSType) implicitPrototypeFallback6);
        FunctionType functionType19 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call23 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters22 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters22.setType(83);
        Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first8)).setType(38);
        Object propListHead4 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
        setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType4 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first8, "com.google.javascript.rhino.Node", "jsType", jsType4);
        setField(first8, "com.google.javascript.rhino.Node", "parent", parameters22);
        setField(parameters22, "com.google.javascript.rhino.Node", "first", first8);
        setField(parameters22, "com.google.javascript.rhino.Node", "last", first8);
        setField(parameters22, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call23, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters22);
        setField(call23, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType15);
        setField(call23, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType19, "com.google.javascript.rhino.jstype.FunctionType", "call", call23);
        ObjectType.Property prototypeSlot19 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot19, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type19 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties50 = new TreeMap();
        setField(type19, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties50);
        setField(type19, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type19.setOwnerFunction(functionType19);
        setField(type19, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        prototypeSlot19.setType(type19);
        setField(prototypeSlot19, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType19, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot19);
        setField(functionType19, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType19, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback6);
        List implementedInterfaces23 = new ArrayList();
        functionType19.setImplementedInterfaces(implementedInterfaces23);
        List extendedInterfaces23 = new ArrayList();
        functionType19.setExtendedInterfaces(extendedInterfaces23);
        ArrayList subTypes2 = new ArrayList();
        subTypes2.add(functionType18);
        subTypes2.add(constructor1);
        subTypes2.add(constructor2);
        subTypes2.add(constructor3);
        subTypes2.add(constructor5);
        FunctionType functionType20 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call24 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters23 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call24, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters23);
        InstanceObjectType returnType16 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(call24, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType16);
        setField(call24, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType20, "com.google.javascript.rhino.jstype.FunctionType", "call", call24);
        ObjectType.Property prototypeSlot20 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot20, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type20 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot20.setType(type20);
        setField(prototypeSlot20, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType20, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot20);
        setField(functionType20, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis16 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis16, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType20);
        TreeMap properties51 = new TreeMap();
        setField(typeOfThis16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties51);
        setField(typeOfThis16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis16, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis16, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType20, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis16);
        List implementedInterfaces24 = new ArrayList();
        functionType20.setImplementedInterfaces(implementedInterfaces24);
        List extendedInterfaces24 = new ArrayList();
        functionType20.setExtendedInterfaces(extendedInterfaces24);
        setField(functionType20, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string5);
        TreeMap properties52 = new TreeMap();
        setField(functionType20, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties52);
        setField(functionType20, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType20.setPrettyPrint(true);
        setField(functionType20, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType20, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes2.add(functionType20);
        FunctionType functionType21 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call25 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters24 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call25, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters24);
        setField(call25, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
        setField(call25, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType21, "com.google.javascript.rhino.jstype.FunctionType", "call", call25);
        ObjectType.Property prototypeSlot21 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot21, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", string23);
        PrototypeObjectType type21 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        prototypeSlot21.setType(type21);
        setField(prototypeSlot21, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType21, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot21);
        setField(functionType21, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis17 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis17, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType21);
        TreeMap properties53 = new TreeMap();
        setField(typeOfThis17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties53);
        setField(typeOfThis17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis17, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType21, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis17);
        List implementedInterfaces25 = new ArrayList();
        functionType21.setImplementedInterfaces(implementedInterfaces25);
        List extendedInterfaces25 = new ArrayList();
        functionType21.setExtendedInterfaces(extendedInterfaces25);
        setField(functionType21, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string9);
        TreeMap properties54 = new TreeMap();
        setField(functionType21, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties54);
        setField(functionType21, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType21.setPrettyPrint(true);
        setField(functionType21, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType21, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        subTypes2.add(functionType21);
        setField(functionType19, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes2);
        setField(functionType19, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string21);
        TreeMap properties55 = new TreeMap();
        setField(functionType19, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties55);
        setField(functionType19, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType19.setPrettyPrint(true);
        setField(functionType19, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType19, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[20] = ((JSType) functionType19);
        nativeTypes1[21] = ((JSType) type19);
        nativeTypes1[22] = ((JSType) errorFunctionType9);
        nativeTypes1[23] = ((JSType) typeOfThis9);
        nativeTypes1[24] = ((JSType) errorFunctionType10);
        nativeTypes1[25] = ((JSType) typeOfThis10);
        nativeTypes1[26] = ((JSType) typeOfThis16);
        nativeTypes1[27] = ((JSType) functionType20);
        nativeTypes1[28] = ((JSType) typeOfThis17);
        nativeTypes1[29] = ((JSType) functionType21);
        nativeTypes1[30] = ((JSType) returnType7);
        nativeTypes1[31] = ((JSType) errorFunctionType11);
        nativeTypes1[32] = ((JSType) typeOfThis11);
        nativeTypes1[33] = ((JSType) errorFunctionType12);
        nativeTypes1[34] = ((JSType) typeOfThis12);
        nativeTypes1[35] = ((JSType) returnType15);
        nativeTypes1[36] = ((JSType) errorFunctionType13);
        nativeTypes1[37] = ((JSType) typeOfThis13);
        VoidType voidType4 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(voidType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[38] = ((JSType) voidType4);
        nativeTypes1[39] = ((JSType) type19);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates = new ArrayList();
        alternates.add(typeOfThis17);
        alternates.add(returnType7);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(unionType6, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 727405052);
        setField(unionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[40] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates1 = new ArrayList();
        alternates1.add(instanceObjectType30);
        alternates1.add(numberType2);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
        setField(unionType7, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -55048127);
        setField(unionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[41] = ((JSType) unionType7);
        AllType allType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(allType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[42] = ((JSType) allType1);
        NoType noType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call26 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters25 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters25.setType(83);
        Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first9)).setType(38);
        Object propListHead5 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
        setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first9, "com.google.javascript.rhino.Node", "jsType", returnType15);
        setField(first9, "com.google.javascript.rhino.Node", "parent", parameters25);
        setField(parameters25, "com.google.javascript.rhino.Node", "first", first9);
        setField(parameters25, "com.google.javascript.rhino.Node", "last", first9);
        setField(parameters25, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call26, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters25);
        setField(call26, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType1);
        setField(call26, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(noType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call26);
        setField(noType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noType1);
        List implementedInterfaces26 = new ArrayList();
        noType1.setImplementedInterfaces(implementedInterfaces26);
        List extendedInterfaces26 = new ArrayList();
        noType1.setExtendedInterfaces(extendedInterfaces26);
        TreeMap properties56 = new TreeMap();
        setField(noType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties56);
        setField(noType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noType1.setPrettyPrint(true);
        setField(noType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[43] = ((JSType) noType1);
        nativeTypes1[44] = ((JSType) typeOfThis15);
        NoResolvedType noResolvedType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call27 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters26 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters26.setType(83);
        Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first10, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first10)).setType(38);
        Object propListHead6 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first10, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
        setField(first10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first10, "com.google.javascript.rhino.Node", "jsType", returnType15);
        setField(first10, "com.google.javascript.rhino.Node", "parent", parameters26);
        setField(parameters26, "com.google.javascript.rhino.Node", "first", first10);
        setField(parameters26, "com.google.javascript.rhino.Node", "last", first10);
        setField(parameters26, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call27, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters26);
        setField(call27, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noResolvedType1);
        setField(call27, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call27);
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", noResolvedType1);
        List implementedInterfaces27 = new ArrayList();
        noResolvedType1.setImplementedInterfaces(implementedInterfaces27);
        List extendedInterfaces27 = new ArrayList();
        noResolvedType1.setExtendedInterfaces(extendedInterfaces27);
        TreeMap properties57 = new TreeMap();
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties57);
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        noResolvedType1.setPrettyPrint(true);
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noResolvedType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[45] = ((JSType) noResolvedType1);
        InstanceObjectType instanceObjectType31 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call28 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters27 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters27.setType(83);
        Object first11 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters27, "com.google.javascript.rhino.Node", "first", first11);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters27, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters27, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call28, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters27);
        setField(call28, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType2);
        setField(call28, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(constructor6, "com.google.javascript.rhino.jstype.FunctionType", "call", call28);
        setField(constructor6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType31);
        List implementedInterfaces28 = new ArrayList();
        constructor6.setImplementedInterfaces(implementedInterfaces28);
        List extendedInterfaces28 = new ArrayList();
        constructor6.setExtendedInterfaces(extendedInterfaces28);
        String className7 = "global this";
        setField(constructor6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties58 = new TreeMap();
        setField(constructor6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties58);
        setField(constructor6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis14);
        constructor6.setPrettyPrint(true);
        setField(constructor6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor6, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(instanceObjectType31, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor6);
        TreeMap properties59 = new TreeMap();
        setField(instanceObjectType31, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties59);
        setField(instanceObjectType31, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(instanceObjectType31, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(instanceObjectType31, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[46] = ((JSType) instanceObjectType31);
        nativeTypes1[47] = ((JSType) typeOfThis14);
        FunctionType functionType22 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call29 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters28 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters28.setType(83);
        Object first12 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first12, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first12)).setType(38);
        Object propListHead7 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first12, "com.google.javascript.rhino.Node", "propListHead", propListHead7);
        setField(first12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first12, "com.google.javascript.rhino.Node", "jsType", returnType15);
        setField(first12, "com.google.javascript.rhino.Node", "parent", parameters28);
        setField(parameters28, "com.google.javascript.rhino.Node", "first", first12);
        setField(parameters28, "com.google.javascript.rhino.Node", "last", first12);
        setField(parameters28, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call29, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters28);
        setField(call29, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType15);
        setField(call29, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType22, "com.google.javascript.rhino.jstype.FunctionType", "call", call29);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType22, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType22, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType15);
        List implementedInterfaces29 = new ArrayList();
        functionType22.setImplementedInterfaces(implementedInterfaces29);
        List extendedInterfaces29 = new ArrayList();
        functionType22.setExtendedInterfaces(extendedInterfaces29);
        TreeMap properties60 = new TreeMap();
        setField(functionType22, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties60);
        setField(functionType22, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback6);
        functionType22.setPrettyPrint(true);
        setField(functionType22, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType22, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[48] = ((JSType) functionType22);
        FunctionType functionType23 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call30 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters29 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters29.setType(83);
        Object first13 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first13, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first13)).setType(38);
        Object propListHead8 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first13, "com.google.javascript.rhino.Node", "propListHead", propListHead8);
        setField(first13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first13, "com.google.javascript.rhino.Node", "jsType", allType1);
        setField(first13, "com.google.javascript.rhino.Node", "parent", parameters29);
        setField(parameters29, "com.google.javascript.rhino.Node", "first", first13);
        setField(parameters29, "com.google.javascript.rhino.Node", "last", first13);
        setField(parameters29, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call30, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters29);
        setField(call30, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType1);
        setField(call30, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType23, "com.google.javascript.rhino.jstype.FunctionType", "call", call30);
        setField(functionType23, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType23, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType15);
        List implementedInterfaces30 = new ArrayList();
        functionType23.setImplementedInterfaces(implementedInterfaces30);
        List extendedInterfaces30 = new ArrayList();
        functionType23.setExtendedInterfaces(extendedInterfaces30);
        TreeMap properties61 = new TreeMap();
        setField(functionType23, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties61);
        setField(functionType23, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis14);
        functionType23.setPrettyPrint(true);
        setField(functionType23, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType23, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[49] = ((JSType) functionType23);
        FunctionType functionType24 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call31 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters30 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters30.setType(83);
        Object first14 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first14, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first14)).setType(38);
        Object propListHead9 = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(first14, "com.google.javascript.rhino.Node", "propListHead", propListHead9);
        setField(first14, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first14, "com.google.javascript.rhino.Node", "jsType", noType1);
        setField(first14, "com.google.javascript.rhino.Node", "parent", parameters30);
        setField(parameters30, "com.google.javascript.rhino.Node", "first", first14);
        setField(parameters30, "com.google.javascript.rhino.Node", "last", first14);
        setField(parameters30, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call31, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters30);
        setField(call31, "com.google.javascript.rhino.jstype.ArrowType", "returnType", allType1);
        setField(call31, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        setField(functionType24, "com.google.javascript.rhino.jstype.FunctionType", "call", call31);
        setField(functionType24, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType24, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType15);
        List implementedInterfaces31 = new ArrayList();
        functionType24.setImplementedInterfaces(implementedInterfaces31);
        List extendedInterfaces31 = new ArrayList();
        functionType24.setExtendedInterfaces(extendedInterfaces31);
        TreeMap properties62 = new TreeMap();
        setField(functionType24, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties62);
        setField(functionType24, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", typeOfThis14);
        functionType24.setPrettyPrint(true);
        setField(functionType24, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType24, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[50] = ((JSType) functionType24);
        UnionType unionType8 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates2 = new ArrayList();
        alternates2.add(implicitPrototypeFallback6);
        alternates2.add(numberType2);
        alternates2.add(returnType7);
        setField(unionType8, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
        setField(unionType8, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1214953121);
        setField(unionType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[51] = ((JSType) unionType8);
        UnionType unionType9 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates3 = new ArrayList();
        alternates3.add(implicitPrototypeFallback6);
        alternates3.add(numberType2);
        alternates3.add(returnType7);
        alternates3.add(booleanType2);
        setField(unionType9, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
        setField(unionType9, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -111613534);
        setField(unionType9, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[52] = ((JSType) unionType9);
        UnionType unionType10 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates4 = new ArrayList();
        alternates4.add(numberType2);
        alternates4.add(returnType7);
        alternates4.add(booleanType2);
        setField(unionType10, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
        setField(unionType10, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -626784705);
        setField(unionType10, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[53] = ((JSType) unionType10);
        UnionType unionType11 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        List alternates5 = new ArrayList();
        alternates5.add(numberType2);
        alternates5.add(returnType7);
        setField(unionType11, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
        setField(unionType11, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1059787364);
        setField(unionType11, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes1[54] = ((JSType) unionType11);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes1);
        HashMap namesToTypes1 = new HashMap();
        namesToTypes1.put(string, voidType4);
        namesToTypes1.put(string1, nullType3);
        namesToTypes1.put(string2, voidType4);
        namesToTypes1.put(string3, returnType7);
        namesToTypes1.put(string4, typeOfThis10);
        namesToTypes1.put(string5, typeOfThis16);
        namesToTypes1.put(string6, returnType8);
        namesToTypes1.put(string7, typeOfThis13);
        namesToTypes1.put(string8, typeOfThis8);
        namesToTypes1.put(string9, typeOfThis17);
        namesToTypes1.put(string10, instanceObjectType29);
        namesToTypes1.put(string11, voidType4);
        namesToTypes1.put(string12, instanceObjectType27);
        namesToTypes1.put(string13, numberType2);
        namesToTypes1.put(string14, typeOfThis14);
        namesToTypes1.put(string15, booleanType2);
        namesToTypes1.put(string16, nullType3);
        namesToTypes1.put(string17, instanceObjectType30);
        namesToTypes1.put(string18, typeOfThis11);
        namesToTypes1.put(string19, typeOfThis12);
        namesToTypes1.put(string20, typeOfThis9);
        namesToTypes1.put(string21, implicitPrototypeFallback6);
        namesToTypes1.put(string22, instanceObjectType28);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes1);
        HashSet namespaces1 = new HashSet();
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces1);
        HashSet nonNullableTypeNames1 = new HashSet();
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames1);
        HashSet forwardDeclaredTypes1 = new HashSet();
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes1);
        HashMap typesIndexedByProperty1 = new HashMap();
        UnionTypeBuilder unionTypeBuilder1 = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        setField(unionTypeBuilder1, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "registry", registry1);
        ArrayList alternates6 = new ArrayList();
        alternates6.add(functionType19);
        setField(unionTypeBuilder1, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "alternates", alternates6);
        setField(unionTypeBuilder1, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "areAllUnknownsChecked", true);
        setField(unionTypeBuilder1, "com.google.javascript.rhino.jstype.UnionTypeBuilder", "maxUnionSize", 3000);
        typesIndexedByProperty1.put(string23, unionTypeBuilder1);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty1);
        HashMap eachRefTypeIndexedByProperty1 = new HashMap();
        HashMap hashMap1 = new HashMap();
        hashMap1.put(string21, functionType19);
        eachRefTypeIndexedByProperty1.put(string23, hashMap1);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty1);
        HashMap greatestSubtypeByProperty1 = new HashMap();
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty1);
        LinkedHashMultimap interfaceToImplementors1 = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors1, "com.google.common.collect.LinkedHashMultimap", "expectedValuesPerKey", 8);
        LinkedHashSet linkedEntries = new LinkedHashSet();
        setField(interfaceToImplementors1, "com.google.common.collect.LinkedHashMultimap", "linkedEntries", linkedEntries);
        LinkedHashMap map = new LinkedHashMap();
        setField(interfaceToImplementors1, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors1);
        ArrayListMultimap unresolvedNamedTypes1 = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes1, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes1, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes1);
        ArrayListMultimap resolvedNamedTypes1 = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes1, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes1, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes1);
        registry1.setLastGeneration(true);
        registry1.setResolveMode(resolveMode);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        
        String expectedClassName = ((String) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(expectedClassName, actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertTrue(actualNativeType);
        
        ObjectType expectedImplicitPrototypeFallback = ((ObjectType) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        String expectedImplicitPrototypeFallbackClassName = ((String) getFieldValue(expectedImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualImplicitPrototypeFallbackClassName = ((String) getFieldValue(actualImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(expectedImplicitPrototypeFallbackClassName, actualImplicitPrototypeFallbackClassName);
        
        Map expectedImplicitPrototypeFallbackProperties = ((Map) getFieldValue(expectedImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeFallbackProperties = ((Map) getFieldValue(actualImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackProperties, actualImplicitPrototypeFallbackProperties));
        
        boolean actualImplicitPrototypeFallbackNativeType = ((Boolean) getFieldValue(actualImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualImplicitPrototypeFallbackNativeType);
        
        ObjectType expectedImplicitPrototypeFallbackImplicitPrototypeFallback = ((ObjectType) getFieldValue(expectedImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        ObjectType actualImplicitPrototypeFallbackImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        FunctionType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor = (((InstanceObjectType) expectedImplicitPrototypeFallbackImplicitPrototypeFallback)).getConstructor();
        FunctionType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor = (((InstanceObjectType) actualImplicitPrototypeFallbackImplicitPrototypeFallback)).getConstructor();
        ArrowType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall = ((ArrowType) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall = ((ArrowType) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallParameters = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.parameters;
        Node actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallParameters = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.parameters;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallParameters, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallParameters));
        
        JSType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnType = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.returnType;
        JSType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnType = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.returnType;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnType, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnType));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnTypeInferred = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.returnTypeInferred;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnTypeInferred, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallReturnTypeInferred));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallResolved = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallResolved, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallResolved));
        
        JSType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallResolveResult = ((JSType) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallResolveResult, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallResolveResult));
        
        JSTypeRegistry expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallRegistry = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.registry;
        JSTypeRegistry actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallRegistry = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCall.registry;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallRegistry, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorCallRegistry));
        
        ObjectType.Property expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot = ((ObjectType.Property) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        ObjectType.Property actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot = ((ObjectType.Property) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        String expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotName = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot.getName();
        String actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotName = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot.getName();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotName, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotName));
        
        JSType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotType = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot.getType();
        JSType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotType = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot.getType();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotType, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotType));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotInferred = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotInferred, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotInferred));
        
        Node actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotPropertyNode = ((Node) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "propertyNode"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotPropertyNode, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotPropertyNode));
        
        JSDocInfo actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotDocInfo = ((JSDocInfo) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "docInfo"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotDocInfo, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrototypeSlotDocInfo));
        
        Object expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorKind = getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorKind = getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorKind, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorKind);
        
        ObjectType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor.getTypeOfThis();
        ObjectType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor.getTypeOfThis();
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis));
        String actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisClassName = ((String) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisClassName, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisClassName));
        
        Map expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisProperties = ((Map) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisProperties = ((Map) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisProperties, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisProperties));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis));
        ObjectType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback = ((ObjectType) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        ObjectType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback));
        
        FunctionType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisOwnerFunction = (((PrototypeObjectType) actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis)).getOwnerFunction();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisOwnerFunction, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisOwnerFunction));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisPrettyPrint, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisPrettyPrint));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisVisited = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisVisited, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisVisited));
        
        JSDocInfo actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisDocInfo, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisDocInfo));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisUnknown = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisUnknown, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisUnknown));
        
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolved = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolved, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolved));
        
        JSType expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolveResult = ((JSType) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolveResult = ((JSType) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolveResult, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThisResolveResult));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTypeOfThis));
        
        Node actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorSource = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor.getSource();
        assertNull(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorSource);
        
        List expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorImplementedInterfaces = ((List) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorImplementedInterfaces, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorImplementedInterfaces));
        
        List expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorExtendedInterfaces = ((List) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        List actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorExtendedInterfaces = ((List) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorExtendedInterfaces, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorExtendedInterfaces));
        
        List expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorSubTypes = expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor.getSubTypes();
        List actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorSubTypes = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor.getSubTypes();
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorSubTypes, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorSubTypes));
        
        String actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTemplateTypeName = actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor.getTemplateTypeName();
        assertNull(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorTemplateTypeName);
        
        String expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorClassName = ((String) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorClassName = ((String) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorClassName, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorClassName);
        
        Map expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorProperties = ((Map) getFieldValue(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorProperties = ((Map) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorProperties, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorProperties));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        ObjectType actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorImplicitPrototypeFallback);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrettyPrint = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertTrue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorPrettyPrint);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        boolean actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorUnknown = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructorUnknown);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackImplicitPrototypeFallbackConstructor));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackImplicitPrototypeFallback));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        JSType expectedImplicitPrototypeFallbackResolveResult = ((JSType) getFieldValue(expectedImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualImplicitPrototypeFallbackResolveResult = ((JSType) getFieldValue(actualImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedImplicitPrototypeFallbackResolveResult, actualImplicitPrototypeFallbackResolveResult);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        JSType expectedResolveResult = ((JSType) getFieldValue(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedResolveResult, actualResolveResult);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter expectedRegistryReporter = ((ErrorReporter) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualRegistryReporterWarnings = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualRegistryReporterWarnings);
        
        List actualRegistryReporterErrors = ((List) getFieldValue(actualRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualRegistryReporterErrors);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map expectedRegistryNamesToTypes = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedRegistryNamesToTypes, actualRegistryNamesToTypes));
        
        Set expectedRegistryNamespaces = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedRegistryNamespaces, actualRegistryNamespaces));
        
        Set expectedRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedRegistryNonNullableTypeNames, actualRegistryNonNullableTypeNames));
        
        Set expectedRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedRegistryForwardDeclaredTypes, actualRegistryForwardDeclaredTypes));
        
        Map expectedRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryTypesIndexedByProperty, actualRegistryTypesIndexedByProperty));
        
        Map expectedRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedRegistryEachRefTypeIndexedByProperty, actualRegistryEachRefTypeIndexedByProperty));
        
        Map expectedRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedRegistryGreatestSubtypeByProperty, actualRegistryGreatestSubtypeByProperty));
        
        Multimap expectedRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "expectedValuesPerKey"));
        int actualRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryInterfaceToImplementorsExpectedValuesPerKey, actualRegistryInterfaceToImplementorsExpectedValuesPerKey);
        
        Collection expectedRegistryInterfaceToImplementorsLinkedEntries = ((Collection) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "linkedEntries"));
        Collection actualRegistryInterfaceToImplementorsLinkedEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "linkedEntries"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsLinkedEntries, actualRegistryInterfaceToImplementorsLinkedEntries));
        
        Map expectedRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryInterfaceToImplementorsMap, actualRegistryInterfaceToImplementorsMap));
        
        int expectedRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedRegistryInterfaceToImplementorsTotalSize, actualRegistryInterfaceToImplementorsTotalSize);
        
        Set actualRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualRegistryInterfaceToImplementorsMultiset);
        
        Collection actualRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualRegistryInterfaceToImplementorsEntries);
        
        Map actualRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypesMap, actualRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryUnresolvedNamedTypes, actualRegistryUnresolvedNamedTypes));
        
        Multimap expectedRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        Map expectedRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypesMap, actualRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedRegistryResolvedNamedTypes, actualRegistryResolvedNamedTypes));
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedRegistryResolveMode = expectedRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertEquals(expectedRegistryResolveMode, actualRegistryResolveMode);
        
    */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isNativeObjectType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNativeObjectType()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNativeObjectType()}
 * @utbot.returnsFrom {@code return nativeType;}
 *  */
    @Test
    public void testIsNativeObjectType_ReturnNativeType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.isNativeObjectType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasReferenceName()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return className != null || ownerFunction != null;}
 *  */
    @Test
    public void testHasReferenceName_ClassNameNotEqualsNullOrOwnerFunctionNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        boolean actual = prototypeObjectType.hasReferenceName();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return className != null || ownerFunction != null;}
 *  */
    @Test
    public void testHasReferenceName_ClassNameNotEqualsNullOrOwnerFunctionNotEqualsNull_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        boolean actual = prototypeObjectType.hasReferenceName();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return className != null || ownerFunction != null;}
 *  */
    @Test
    public void testHasReferenceName_ClassNameEqualsNullOrOwnerFunctionEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.hasReferenceName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnerFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnerFunction()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnerFunction()}
 * @utbot.returnsFrom {@code return ownerFunction;}
 *  */
    @Test
    public void testGetOwnerFunction_ReturnOwnerFunction() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        FunctionType actual = prototypeObjectType.getOwnerFunction();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        templateType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(templateType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(templateType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        boolean actual = prototypeObjectType.isSubtype(unknownType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCachedValues()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.returnsFrom {@code return super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_ReturnSuperHasCachedValues() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = prototypeObjectType.hasCachedValues();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.returnsFrom {@code return super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_ReturnSuperHasCachedValues_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.hasCachedValues();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferenceName()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (className != null): True}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testGetReferenceName_ClassNameNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = prototypeObjectType.getReferenceName();
        
        assertEquals(className, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (className != null): False}
 * @utbot.executesCondition {@code (ownerFunction != null): True}
 * @utbot.returnsFrom {@code return ownerFunction.getReferenceName() + ".prototype";}
 *  */
    @Test
    public void testGetReferenceName_OwnerFunctionNotEqualsNull_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoResolvedType ownerFunction = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        String actual = prototypeObjectType.getReferenceName();
        
        String expected = "null.prototype";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (className != null): False}
 * @utbot.executesCondition {@code (ownerFunction != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetReferenceName_ReturnNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        String actual = prototypeObjectType.getReferenceName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (ownerFunction != null): True}
 * @utbot.returnsFrom {@code return ownerFunction.getReferenceName() + ".prototype";}
 *  */
    @Test
    public void testGetReferenceName_OwnerFunctionNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        String actual = prototypeObjectType.getReferenceName();
        
        String expected = "null.prototype";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setOwnerFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): True}
 *  */
    @Test
    public void testSetOwnerFunction_PreconditionsCheckState() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        prototypeObjectType.setOwnerFunction(null);
        
        FunctionType finalPrototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunction);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): False}
 *  */
    @Test
    public void testSetOwnerFunction_PreconditionsCheckState_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setOwnerFunction(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(ownerFunction == null || type == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetOwnerFunction_ThrowIllegalStateException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        prototypeObjectType.setOwnerFunction(noType);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields888909335959400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields888909335959400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass888909335965700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields888909335959400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass888909335965700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields888909340234500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields888909340234500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass888909340240400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields888909340234500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass888909340240400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields888909340589000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields888909340589000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass888909340592900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields888909340589000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass888909340592900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields888909341315200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields888909341315200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass888909341318500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields888909341315200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass888909341318500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.collections.map;

import org.junit.Test;
import org.apache.commons.collections.functors.ExceptionFactory;
import java.util.LinkedHashMap;
import org.apache.commons.collections.FunctorException;
import org.apache.commons.collections.functors.ConstantFactory;
import java.util.HashSet;
import java.util.Collection;
import org.apache.commons.collections.iterators.EmptyIterator;
import java.util.ArrayList;
import sun.security.x509.AttributeNameEnumeration;
import org.apache.commons.collections.functors.InstantiateFactory;
import java.util.Map;
import org.apache.commons.collections.Factory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_collections_map_MultiValueMapTest {
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.put
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link org.apache.commons.collections.FunctorException} in: coll = createCollection(1);
 *  */
    @Test(expected = FunctorException.class)
    public void testPut_ThrowFunctorException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        ExceptionFactory collectionFactory = ((ExceptionFactory) createInstance("org.apache.commons.collections.functors.ExceptionFactory"));
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        multiValueMap.put(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: coll = createCollection(1);
 *  */
    @Test
    public void testPut_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections.functors.ConstantFactory"));
        byte[] iConstant = {};
        setField(collectionFactory, "org.apache.commons.collections.functors.ConstantFactory", "iConstant", iConstant);
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.put] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.MultiValueMap.createCollection(MultiValueMap.java:365)
            org.apache.commons.collections.map.MultiValueMap.put(MultiValueMap.java:208) */
        multiValueMap.put(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = coll.add(value);
 *  */
    @Test
    public void testPut_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections.functors.ConstantFactory"));
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.put] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.put(MultiValueMap.java:209) */
        multiValueMap.put(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testPut() {
        MultiValueMap multiValueMap = new MultiValueMap();
        Object object = new Object();
        Object object1 = new Object();
        multiValueMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        multiValueMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        multiValueMap.put(object4, object5);
        Object object6 = new Object();
        Object object7 = new Object();
        
        Object actual = multiValueMap.put(object6, object7);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.values
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method values()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#values()}
 * @utbot.executesCondition {@code (vs != null): True}
 * @utbot.returnsFrom {@code return (vs != null ? vs : (values = new Values()));}
 *  */
    @Test
    public void testValues_VsNotEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        HashSet values = new HashSet();
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "values", values);
        
        HashSet actual = ((HashSet) multiValueMap.values());
        
        assertTrue(deepEquals(values, actual));
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#values()}
 * @utbot.executesCondition {@code (vs != null): False}
 * @utbot.returnsFrom {@code return (vs != null ? vs : (values = new Values()));}
 *  */
    @Test
    public void testValues_VsEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        Collection initialMultiValueMapValues = ((Collection) getFieldValue(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "values"));
        
        Object actual = multiValueMap.values();
        
        Object expected = createInstance("org.apache.commons.collections.map.MultiValueMap$Values");
        setField(expected, "org.apache.commons.collections.map.MultiValueMap$Values", "this$0", multiValueMap);
        
        Collection finalMultiValueMapValues = ((Collection) getFieldValue(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "values"));
        
        assertFalse(initialMultiValueMapValues == finalMultiValueMapValues);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#clear()}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.invokes {@link java.util.Map#clear()}
 *  */
    @Test
    public void testClear_MapClear() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        multiValueMap.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#clear()}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getMap().clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.clear(MultiValueMap.java:139) */
        multiValueMap.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#size(java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSize_CollEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        int actual = multiValueMap.size(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#size(java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.returnsFrom {@code return coll.size();}
 *  */
    @Test
    public void testSize_CollNotEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Object linkVector = createInstance("javax.swing.JEditorPane$JEditorPaneAccessibleHypertextSupport$LinkVector");
        map.put(integer, linkVector);
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        int actual = multiValueMap.size(integer);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#size(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Collection coll = getCollection(key);
 *  */
    @Test
    public void testSize_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.size] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Collection (java.lang.Object and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.MultiValueMap.getCollection(MultiValueMap.java:281)
            org.apache.commons.collections.map.MultiValueMap.size(MultiValueMap.java:291) */
        multiValueMap.size(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.iterator
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#iterator(java.lang.Object)}
     */
    @Test
    public void testIterator() throws Exception  {
        MultiValueMap multiValueMap = new MultiValueMap();
        Object object = new Object();
        Object object1 = new Object();
        multiValueMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        multiValueMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        multiValueMap.put(object4, object5);
        Object object6 = new Object();
        
        EmptyIterator actual = ((EmptyIterator) multiValueMap.iterator(object6));
        
        EmptyIterator expected = ((EmptyIterator) createInstance("org.apache.commons.collections.iterators.EmptyIterator"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(java.lang.Object, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#putAll(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (values == null): False}
 * @utbot.executesCondition {@code (values.size() == 0): True}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPutAll_ValuesSizeEqualsZero() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = multiValueMap.putAll(null, arrayList);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#putAll(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (values == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPutAll_ValuesEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        boolean actual = multiValueMap.putAll(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#putAll(java.util.Map)}
 * @utbot.executesCondition {@code (map instanceof MultiMap): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testPutAll_NotMapNotInstanceOfMultiMap() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        multiValueMap.putAll(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#putAll(java.util.Map)}
 * @utbot.executesCondition {@code (map instanceof MultiMap): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator it = map.entrySet().iterator(); it.hasNext(); )
 *  */
    @Test
    public void testPutAll_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.putAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.putAll(MultiValueMap.java:240) */
        multiValueMap.putAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.containsValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (pairs == null): False}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testContainsValue_PairsIteratorHasNext() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        boolean actual = multiValueMap.containsValue(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#containsValue(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Set pairs = getMap().entrySet();
 *  */
    @Test
    public void testContainsValue_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.containsValue] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.containsValue(MultiValueMap.java:179) */
        multiValueMap.containsValue(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#containsValue(java.lang.Object)}
     */
    @Test
    public void testContainsValueReturnsFalse() {
        MultiValueMap multiValueMap = new MultiValueMap();
        Object object = new Object();
        Object object1 = new Object();
        multiValueMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        multiValueMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        multiValueMap.put(object4, object5);
        Object object6 = new Object();
        
        boolean actual = multiValueMap.containsValue(object6);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.containsValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_CollEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        boolean actual = multiValueMap.containsValue(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsValue(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Collection coll = getCollection(key);
 *  */
    @Test
    public void testContainsValue_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        byte[] byteArray = {};
        map.put(integer, byteArray);
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.containsValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.MultiValueMap.getCollection(MultiValueMap.java:281)
            org.apache.commons.collections.map.MultiValueMap.containsValue(MultiValueMap.java:266) */
        multiValueMap.containsValue(integer, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object, java.lang.Object)
    
    @Test
    public void testContainsValue1() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        AttributeNameEnumeration attributeNameEnumeration = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        map.put(integer, attributeNameEnumeration);
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        Integer integer1 = 0;
        
        boolean actual = multiValueMap.containsValue(integer1, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.removeMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeMapping(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#removeMapping(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (valuesForKey == null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 *  */
    @Test
    public void testRemoveMapping_ValuesForKeyEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        Object actual = multiValueMap.removeMapping(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeMapping(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#removeMapping(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Collection valuesForKey = getCollection(key);
 *  */
    @Test
    public void testRemoveMapping_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        byte[] byteArray = {};
        map.put(integer, byteArray);
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.removeMapping] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.MultiValueMap.getCollection(MultiValueMap.java:281)
            org.apache.commons.collections.map.MultiValueMap.removeMapping(MultiValueMap.java:156) */
        multiValueMap.removeMapping(integer, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.totalSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method totalSize()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#totalSize()}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testTotalSize_MapValues() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        
        int actual = multiValueMap.totalSize();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method totalSize()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#totalSize()}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Collection values = getMap().values();
 *  */
    @Test
    public void testTotalSize_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.totalSize] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.totalSize(MultiValueMap.java:346) */
        multiValueMap.totalSize();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method totalSize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#totalSize()}
     */
    @Test
    public void testTotalSizeReturns3() {
        MultiValueMap multiValueMap = new MultiValueMap();
        Object object = new Object();
        Object object1 = new Object();
        multiValueMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        multiValueMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        multiValueMap.put(object4, object5);
        
        int actual = multiValueMap.totalSize();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.decorate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decorate(java.util.Map, org.apache.commons.collections.Factory)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,org.apache.commons.collections.Factory)}
 * @utbot.returnsFrom {@code return new MultiValueMap(map, collectionFactory);}
 *  */
    @Test
    public void testDecorate_Return() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InstantiateFactory instantiateFactory = ((InstantiateFactory) createInstance("org.apache.commons.collections.functors.InstantiateFactory"));
        
        MultiValueMap actual = MultiValueMap.decorate(((Map) linkedHashMap), instantiateFactory);
        
        MultiValueMap expected = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        setField(expected, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", instantiateFactory);
        setField(expected, "org.apache.commons.collections.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections.map.MultiValueMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method decorate(java.util.Map, org.apache.commons.collections.Factory)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,org.apache.commons.collections.Factory)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new MultiValueMap(map, collectionFactory);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_ThrowIllegalArgumentException() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        MultiValueMap.decorate(((Map) linkedHashMap), ((Factory) null));
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,org.apache.commons.collections.Factory)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new MultiValueMap(map, collectionFactory);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_ThrowIllegalArgumentException_1() {
        MultiValueMap.decorate(((Map) null), ((Factory) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.decorate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decorate(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map)}
 * @utbot.returnsFrom {@code return new MultiValueMap(map, new ReflectionFactory(ArrayList.class));}
 *  */
    @Test
    public void testDecorate_Return1() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        MultiValueMap actual = MultiValueMap.decorate(linkedHashMap);
        
        MultiValueMap expected = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        Object collectionFactory = createInstance("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory");
        Class clazz = ArrayList.class;
        setField(collectionFactory, "org.apache.commons.collections.map.MultiValueMap$ReflectionFactory", "clazz", clazz);
        setField(expected, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        setField(expected, "org.apache.commons.collections.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections.map.MultiValueMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method decorate(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new MultiValueMap(map, new ReflectionFactory(ArrayList.class));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_ThrowIllegalArgumentException1() {
        MultiValueMap.decorate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.decorate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decorate(java.util.Map, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,java.lang.Class)}
 * @utbot.returnsFrom {@code return new MultiValueMap(map, new ReflectionFactory(collectionClass));}
 *  */
    @Test
    public void testDecorate_Return2() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        MultiValueMap actual = MultiValueMap.decorate(((Map) linkedHashMap), ((Class) null));
        
        MultiValueMap expected = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        Object collectionFactory = createInstance("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory");
        setField(expected, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        setField(expected, "org.apache.commons.collections.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections.map.MultiValueMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method decorate(java.util.Map, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#decorate(java.util.Map,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new MultiValueMap(map, new ReflectionFactory(collectionClass));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_ThrowIllegalArgumentException2() {
        MultiValueMap.decorate(((Map) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.createCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCollection(int)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#createCollection(int)}
 * @utbot.invokes {@link org.apache.commons.collections.Factory#create()}
 * @utbot.returnsFrom {@code return (Collection) collectionFactory.create();}
 *  */
    @Test
    public void testCreateCollection_FactoryCreate() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections.functors.ConstantFactory"));
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        
        Collection actual = multiValueMap.createCollection(-255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCollection(int)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Collection) collectionFactory.create();
 *  */
    @Test
    public void testCreateCollection_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections.functors.ConstantFactory"));
        byte[] iConstant = {};
        setField(collectionFactory, "org.apache.commons.collections.functors.ConstantFactory", "iConstant", iConstant);
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.createCollection] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.MultiValueMap.createCollection(MultiValueMap.java:365) */
        multiValueMap.createCollection(4);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Collection) collectionFactory.create();
 *  */
    @Test
    public void testCreateCollection_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.createCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.createCollection(MultiValueMap.java:365) */
        multiValueMap.createCollection(-255);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Collection) collectionFactory.create();
 *  */
    @Test
    public void testCreateCollection_ThrowNullPointerException_1() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        InstantiateFactory collectionFactory = ((InstantiateFactory) createInstance("org.apache.commons.collections.functors.InstantiateFactory"));
        setField(multiValueMap, "org.apache.commons.collections.map.MultiValueMap", "collectionFactory", collectionFactory);
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.createCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.functors.InstantiateFactory.findConstructor(InstantiateFactory.java:109)
            org.apache.commons.collections.functors.InstantiateFactory.create(InstantiateFactory.java:124)
            org.apache.commons.collections.map.MultiValueMap.createCollection(MultiValueMap.java:365) */
        multiValueMap.createCollection(-255);
    }
    ///endregion
    
    ///region Errors report for createCollection
    
    public void testCreateCollection_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Constructor
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.MultiValueMap.getCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCollection(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return (Collection) getMap().get(key);}
 *  */
    @Test
    public void testGetCollection_MapGet() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        Collection actual = multiValueMap.getCollection(byteArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCollection(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.map.MultiValueMap#getMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Collection) getMap().get(key);
 *  */
    @Test
    public void testGetCollection_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections.map.MultiValueMap.getCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.MultiValueMap.getCollection(MultiValueMap.java:281) */
        multiValueMap.getCollection(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields955833499004200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields955833499004200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass955833499037600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields955833499004200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass955833499037600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields955833503106600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields955833503106600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass955833503112700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields955833503106600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass955833503112700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.collections4.map;

import org.junit.Test;
import org.apache.commons.collections4.functors.ConstantFactory;
import java.util.LinkedHashMap;
import sun.security.x509.AttributeNameEnumeration;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Stack;
import org.apache.commons.collections4.iterators.LazyIteratorChain;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import java.util.Set;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.jar.JarInputStream;
import java.io.ObjectStreamClass;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.util.Vector;
import org.apache.commons.collections4.map.AbstractHashedMap.EntrySet;
import org.apache.commons.collections4.functors.ExceptionFactory;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.apache.commons.collections4.FunctorException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_collections4_map_MultiValueMapTest {
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.put
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: coll = createCollection(1);
 *  */
    @Test
    public void testPut_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections4.functors.ConstantFactory"));
        byte[] iConstant = {};
        setField(collectionFactory, "org.apache.commons.collections4.functors.ConstantFactory", "iConstant", iConstant);
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[][] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.put] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.createCollection(MultiValueMap.java:484)
            org.apache.commons.collections4.map.MultiValueMap.put(MultiValueMap.java:265) */
        multiValueMap.put(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: coll.add((V) value);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections4.functors.ConstantFactory"));
        AttributeNameEnumeration iConstant = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        java.lang.Object[] elementData = {null};
        setField(iConstant, "java.util.Vector", "elementData", elementData);
        setField(iConstant, "java.util.Vector", "elementCount", Integer.MIN_VALUE);
        setField(collectionFactory, "org.apache.commons.collections4.functors.ConstantFactory", "iConstant", iConstant);
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            java.base/java.util.Vector.add(Vector.java:783)
            java.base/java.util.Vector.add(Vector.java:796)
            org.apache.commons.collections4.map.MultiValueMap.put(MultiValueMap.java:266) */
        multiValueMap.put(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: coll.add((V) value);
 *  */
    @Test
    public void testPut_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections4.functors.ConstantFactory"));
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[][] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.put] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.put(MultiValueMap.java:266) */
        multiValueMap.put(byteArray, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#put(java.lang.Object,java.lang.Object)}
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
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.values
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method values()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#values()}
 * @utbot.executesCondition {@code (vs != null): True}
 * @utbot.returnsFrom {@code return (Collection<Object>) (vs != null ? vs : (valuesView = new Values()));}
 *  */
    @Test
    public void testValues_VsNotEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedList valuesView = new LinkedList();
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "valuesView", valuesView);
        
        LinkedList actual = ((LinkedList) multiValueMap.values());
        
        assertTrue(deepEquals(valuesView, actual));
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#values()}
 * @utbot.executesCondition {@code (vs != null): False}
 * @utbot.returnsFrom {@code return (Collection<Object>) (vs != null ? vs : (valuesView = new Values()));}
 *  */
    @Test
    public void testValues_VsEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        Collection initialMultiValueMapValuesView = ((Collection) getFieldValue(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "valuesView"));
        
        Object actual = multiValueMap.values();
        
        Object expected = createInstance("org.apache.commons.collections4.map.MultiValueMap$Values");
        setField(expected, "org.apache.commons.collections4.map.MultiValueMap$Values", "this$0", multiValueMap);
        
        Collection finalMultiValueMapValuesView = ((Collection) getFieldValue(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "valuesView"));
        
        assertFalse(initialMultiValueMapValuesView == finalMultiValueMapValuesView);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#clear()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.invokes {@link java.util.Map#clear()}
 *  */
    @Test
    public void testClear_MapClear() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        multiValueMap.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#clear()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: decorated().clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.clear(MultiValueMap.java:195) */
        multiValueMap.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#size(java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSize_CollEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        int actual = multiValueMap.size(byteArray);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#size(java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.returnsFrom {@code return coll.size();}
 *  */
    @Test
    public void testSize_CollNotEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Stack stack = ((Stack) createInstance("java.util.Stack"));
        map.put(integer, stack);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        Integer integer1 = 0;
        
        int actual = multiValueMap.size(integer1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#size(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Collection<V> coll = getCollection(key);
 *  */
    @Test
    public void testSize_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.size] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Collection (java.lang.Object and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355)
            org.apache.commons.collections4.map.MultiValueMap.size(MultiValueMap.java:365) */
        multiValueMap.size(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.iterator
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#iterator()}
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
        
        LazyIteratorChain actual = ((LazyIteratorChain) multiValueMap.iterator());
        
        LazyIteratorChain expected = ((LazyIteratorChain) createInstance("org.apache.commons.collections4.map.MultiValueMap$1"));
        Object val$keyIterator = createInstance("java.util.ArrayList$Itr");
        setField(expected, "org.apache.commons.collections4.map.MultiValueMap$1", "val$keyIterator", val$keyIterator);
        MultiValueMap this$0 = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        Object collectionFactory = createInstance("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory");
        Class clazz = ArrayList.class;
        setField(collectionFactory, "org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory", "clazz", clazz);
        setField(this$0, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        HashMap map = new HashMap();
        Object object6 = createInstance("java.lang.Object");
        ArrayList arrayList = new ArrayList();
        Object object7 = createInstance("java.lang.Object");
        arrayList.add(object7);
        map.put(object6, arrayList);
        Object object8 = createInstance("java.lang.Object");
        ArrayList arrayList1 = new ArrayList();
        Object object9 = createInstance("java.lang.Object");
        arrayList1.add(object9);
        map.put(object8, arrayList1);
        Object object10 = createInstance("java.lang.Object");
        ArrayList arrayList2 = new ArrayList();
        Object object11 = createInstance("java.lang.Object");
        arrayList2.add(object11);
        map.put(object10, arrayList2);
        setField(this$0, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        setField(expected, "org.apache.commons.collections4.map.MultiValueMap$1", "this$0", this$0);
        
        Iterator expectedVal$keyIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.map.MultiValueMap$1", "val$keyIterator"));
        Iterator actualVal$keyIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.map.MultiValueMap$1", "val$keyIterator"));
        
        int expectedCallCounter = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.LazyIteratorChain", "callCounter"));
        int actualCallCounter = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.LazyIteratorChain", "callCounter"));
        assertEquals(expectedCallCounter, actualCallCounter);
        
        boolean actualChainExhausted = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.LazyIteratorChain", "chainExhausted"));
        assertFalse(actualChainExhausted);
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.LazyIteratorChain", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.LazyIteratorChain", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.iterator
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#iterator(java.lang.Object)}
     */
    @Test
    public void testIterator1() throws Exception  {
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
        
        EmptyIterator expected = ((EmptyIterator) createInstance("org.apache.commons.collections4.iterators.EmptyIterator"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.entrySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method entrySet()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#entrySet()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.AbstractMapDecorator#entrySet()}
 * @utbot.returnsFrom {@code return super.entrySet();}
 *  */
    @Test
    public void testEntrySet_AbstractMapDecoratorEntrySet() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Set actual = multiValueMap.entrySet();
        
        Set expected = new LinkedHashSet();
        Object entry = createInstance("java.util.LinkedHashMap$Entry");
        expected.add(entry);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(java.lang.Object, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#putAll(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (values == null): False}
 * @utbot.executesCondition {@code (values.size() == 0): True}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPutAll_ValuesSizeEqualsZero() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = multiValueMap.putAll(null, arrayList);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#putAll(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (values == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPutAll_ValuesEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        boolean actual = multiValueMap.putAll(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(java.lang.Object, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#putAll(java.lang.Object,java.util.Collection)}
 * @utbot.executesCondition {@code (values == null): False}
 * @utbot.executesCondition {@code (values.size() == 0): False}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Collection<V> coll = getCollection(key);
 *  */
    @Test
    public void testPutAll_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.putAll] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Collection (java.lang.Object and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355)
            org.apache.commons.collections4.map.MultiValueMap.putAll(MultiValueMap.java:385) */
        multiValueMap.putAll(null, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#putAll(java.util.Map)}
 * @utbot.executesCondition {@code (map instanceof MultiMap): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testPutAll_NotMapNotInstanceOfMultiMap() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        multiValueMap.putAll(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#putAll(java.util.Map)}
 * @utbot.executesCondition {@code (map instanceof MultiMap): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Map.Entry<? extends K, ?> entry: map.entrySet())
 *  */
    @Test
    public void testPutAll_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.putAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.putAll(MultiValueMap.java:297) */
        multiValueMap.putAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.readObject(MultiValueMap.java:177) */
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiValueMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(multiValueMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiValueMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(multiValueMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiValueMapClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(multiValueMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        Object extObjectInputStream = createInstance("javax.crypto.extObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("java.util.jar.JarFile$JarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", -255L);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(extObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class extObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = multiValueMapClazz.getDeclaredMethod("readObject", extObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = extObjectInputStream;
        try {
            readObjectMethod.invoke(multiValueMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.writeObject
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = multiValueMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(multiValueMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = multiValueMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(multiValueMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.writeObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.writeObject(MultiValueMap.java:163) */
        Class multiValueMapClazz = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = multiValueMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(multiValueMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.containsValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_CollEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        boolean actual = multiValueMap.containsValue(null, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.invokes {@link java.util.Collection#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return coll.contains(value);}
 *  */
    @Test
    public void testContainsValue_CollNotEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        AttributeNameEnumeration attributeNameEnumeration = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        map.put(integer, attributeNameEnumeration);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        Integer integer1 = 0;
        short[] shortArray = {};
        
        boolean actual = multiValueMap.containsValue(integer1, shortArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsValue(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Collection<V> coll = getCollection(key);
 *  */
    @Test
    public void testContainsValue_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        byte[] byteArray = {};
        map.put(integer, byteArray);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.containsValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355)
            org.apache.commons.collections4.map.MultiValueMap.containsValue(MultiValueMap.java:339) */
        multiValueMap.containsValue(integer, null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return coll.contains(value);
 *  */
    @Test
    public void testContainsValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Vector vector = ((Vector) createInstance("java.util.Vector"));
        java.lang.Object[] elementData = {};
        setField(vector, "java.util.Vector", "elementData", elementData);
        setField(vector, "java.util.Vector", "elementCount", 1);
        map.put(integer, vector);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.containsValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Vector.indexOf(Vector.java:400)
            java.base/java.util.Vector.contains(Vector.java:359)
            org.apache.commons.collections4.map.MultiValueMap.containsValue(MultiValueMap.java:343) */
        multiValueMap.containsValue(integer, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return coll.contains(value);
 *  */
    @Test
    public void testContainsValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Vector vector = ((Vector) createInstance("java.util.Vector"));
        java.lang.Object[] elementData = {};
        setField(vector, "java.util.Vector", "elementData", elementData);
        setField(vector, "java.util.Vector", "elementCount", 1);
        map.put(integer, vector);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.containsValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Vector.indexOf(Vector.java:396)
            java.base/java.util.Vector.contains(Vector.java:359)
            org.apache.commons.collections4.map.MultiValueMap.containsValue(MultiValueMap.java:343) */
        multiValueMap.containsValue(integer, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method containsValue(java.lang.Object, java.lang.Object)
    
    @Test
    public void testContainsValue1() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        Integer integer = 0;
        map.put(integer, object);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        AbstractHashedMap.EntrySet entrySet = new AbstractHashedMap.EntrySet(null);
        Object object1 = new Object();
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.containsValue] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.AbstractHashedMap$EntrySet.iterator(AbstractHashedMap.java:876)
            java.base/java.util.AbstractSet.hashCode(AbstractSet.java:120)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355)
            org.apache.commons.collections4.map.MultiValueMap.containsValue(MultiValueMap.java:339) */
        multiValueMap.containsValue(entrySet, object1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.containsValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (pairs != null): True}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_PairsNotEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        boolean actual = multiValueMap.containsValue(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Set<Map.Entry<K, Object>> pairs = decorated().entrySet();
 *  */
    @Test
    public void testContainsValue_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.containsValue] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.containsValue(MultiValueMap.java:238) */
        multiValueMap.containsValue(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#containsValue(java.lang.Object)}
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
    
    ///region OTHER: ERROR SUITE for method containsValue(java.lang.Object)
    
    @Test
    public void testContainsValue2() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        map.put(null, object);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        Object object1 = new Object();
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.containsValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Collection (java.lang.Object and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.containsValue(MultiValueMap.java:241) */
        multiValueMap.containsValue(object1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.removeMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeMapping(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#removeMapping(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (valuesForKey == null): True}
 *  */
    @Test
    public void testRemoveMapping_ValuesForKeyEqualsNull() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        boolean actual = multiValueMap.removeMapping(null, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#removeMapping(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (valuesForKey == null): False}
 * @utbot.executesCondition {@code (removed == false): True}
 * @utbot.invokes {@link java.util.Collection#remove(java.lang.Object)}
 *  */
    @Test
    public void testRemoveMapping_RemovedEqualsFalse() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        AttributeNameEnumeration attributeNameEnumeration = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        map.put(integer, attributeNameEnumeration);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        boolean actual = multiValueMap.removeMapping(integer, byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeMapping(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#removeMapping(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Collection<V> valuesForKey = getCollection(key);
 *  */
    @Test
    public void testRemoveMapping_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        short[] shortArray = {};
        map.put(integer, shortArray);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.removeMapping] produces [java.lang.ClassCastException: class [S cannot be cast to class java.util.Collection ([S and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355)
            org.apache.commons.collections4.map.MultiValueMap.removeMapping(MultiValueMap.java:213) */
        multiValueMap.removeMapping(integer, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeMapping(java.lang.Object, java.lang.Object)
    
    @Test
    public void testRemoveMapping1() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        AttributeNameEnumeration attributeNameEnumeration = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        java.lang.Object[] elementData = new java.lang.Object[9];
        Integer integer1 = 0;
        elementData[0] = ((Object) integer1);
        Object object = createInstance("java.lang.Object");
        elementData[1] = object;
        elementData[2] = object;
        elementData[3] = object;
        elementData[4] = object;
        elementData[5] = object;
        elementData[6] = object;
        elementData[7] = object;
        elementData[8] = object;
        setField(attributeNameEnumeration, "java.util.Vector", "elementData", elementData);
        setField(attributeNameEnumeration, "java.util.Vector", "elementCount", 1);
        map.put(integer, attributeNameEnumeration);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        Integer integer2 = 0;
        
        boolean actual = multiValueMap.removeMapping(integer2, integer);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeMapping(java.lang.Object, java.lang.Object)
    
    @Test
    public void testRemoveMapping2() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        AttributeNameEnumeration attributeNameEnumeration = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        elementData[0] = object;
        setField(attributeNameEnumeration, "java.util.Vector", "elementData", elementData);
        setField(attributeNameEnumeration, "java.util.Vector", "elementCount", 2);
        map.put(integer, attributeNameEnumeration);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        Integer integer1 = 0;
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.removeMapping] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.util.Vector.indexOf(Vector.java:396)
            java.base/java.util.Vector.indexOf(Vector.java:374)
            java.base/java.util.Vector.removeElement(Vector.java:637)
            java.base/java.util.Vector.remove(Vector.java:812)
            org.apache.commons.collections4.map.MultiValueMap.removeMapping(MultiValueMap.java:217) */
        multiValueMap.removeMapping(integer1, null);
    }
    
    @Test
    public void testRemoveMapping3() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        AttributeNameEnumeration attributeNameEnumeration = ((AttributeNameEnumeration) createInstance("sun.security.x509.AttributeNameEnumeration"));
        java.lang.Object[] elementData = {};
        setField(attributeNameEnumeration, "java.util.Vector", "elementData", elementData);
        setField(attributeNameEnumeration, "java.util.Vector", "elementCount", 1);
        map.put(integer, attributeNameEnumeration);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        Integer integer1 = 0;
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.removeMapping] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Vector.indexOf(Vector.java:400)
            java.base/java.util.Vector.indexOf(Vector.java:374)
            java.base/java.util.Vector.removeElement(Vector.java:637)
            java.base/java.util.Vector.remove(Vector.java:812)
            org.apache.commons.collections4.map.MultiValueMap.removeMapping(MultiValueMap.java:217) */
        multiValueMap.removeMapping(integer1, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.totalSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method totalSize()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#totalSize()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testTotalSize_CollectionIterator() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        int actual = multiValueMap.totalSize();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method totalSize()
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#totalSize()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object v: decorated().values())
 *  */
    @Test
    public void testTotalSize_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.totalSize] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.totalSize(MultiValueMap.java:467) */
        multiValueMap.totalSize();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method totalSize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.MultiValueMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#totalSize()}
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
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.multiValueMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiValueMap(java.util.Map, org.apache.commons.collections4.Factory)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,org.apache.commons.collections4.Factory)}
 * @utbot.returnsFrom {@code return new MultiValueMap<K, V>(map, collectionFactory);}
 *  */
    @Test
    public void testMultiValueMap_Return() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ExceptionFactory exceptionFactory = ((ExceptionFactory) createInstance("org.apache.commons.collections4.functors.ExceptionFactory"));
        
        MultiValueMap actual = MultiValueMap.multiValueMap(((Map) linkedHashMap), exceptionFactory);
        
        MultiValueMap expected = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        setField(expected, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", exceptionFactory);
        setField(expected, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections4.map.MultiValueMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiValueMap(java.util.Map, org.apache.commons.collections4.Factory)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,org.apache.commons.collections4.Factory)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new MultiValueMap<K, V>(map, collectionFactory);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiValueMap_ThrowIllegalArgumentException() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        MultiValueMap.multiValueMap(((Map) linkedHashMap), ((Factory) null));
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,org.apache.commons.collections4.Factory)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new MultiValueMap<K, V>(map, collectionFactory);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMultiValueMap_ThrowNullPointerException() {
        MultiValueMap.multiValueMap(((Map) null), ((Factory) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.multiValueMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiValueMap(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,java.lang.Class)}
 * @utbot.returnsFrom {@code return MultiValueMap.<K, V, ArrayList>multiValueMap((Map<K, ? super Collection>) map, ArrayList.class);}
 *  */
    @Test
    public void testMultiValueMap_MultiValueMapMultiValueMap() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        MultiValueMap actual = MultiValueMap.multiValueMap(linkedHashMap);
        
        MultiValueMap expected = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        Object collectionFactory = createInstance("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory");
        Class clazz = ArrayList.class;
        setField(collectionFactory, "org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory", "clazz", clazz);
        setField(expected, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        setField(expected, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections4.map.MultiValueMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiValueMap(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return MultiValueMap.<K, V, ArrayList>multiValueMap((Map<K, ? super Collection>) map, ArrayList.class);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMultiValueMap_ThrowNullPointerException1() {
        MultiValueMap.multiValueMap(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.multiValueMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiValueMap(java.util.Map, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,java.lang.Class)}
 * @utbot.returnsFrom {@code return new MultiValueMap<K, V>(map, new ReflectionFactory<C>(collectionClass));}
 *  */
    @Test
    public void testMultiValueMap_Return1() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        MultiValueMap actual = MultiValueMap.multiValueMap(((Map) linkedHashMap), ((Class) null));
        
        MultiValueMap expected = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        Object collectionFactory = createInstance("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory");
        setField(expected, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        setField(expected, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections4.map.MultiValueMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiValueMap(java.util.Map, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#multiValueMap(java.util.Map,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new MultiValueMap<K, V>(map, new ReflectionFactory<C>(collectionClass));
 *  */
    @Test(expected = NullPointerException.class)
    public void testMultiValueMap_ThrowNullPointerException2() {
        MultiValueMap.multiValueMap(((Map) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.getCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCollection(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.MultiValueMap#decorated()}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return (Collection<V>) decorated().get(key);}
 *  */
    @Test
    public void testGetCollection_MapGet() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        Collection actual = multiValueMap.getCollection(byteArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCollection(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Collection<V>) decorated().get(key);
 *  */
    @Test
    public void testGetCollection_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        Object object1 = createInstance("java.lang.Object");
        map.put(null, object1);
        setField(multiValueMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.getCollection] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Collection (java.lang.Object and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355) */
        multiValueMap.getCollection(null);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#getCollection(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Collection<V>) decorated().get(key);
 *  */
    @Test
    public void testGetCollection_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.getCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.getCollection(MultiValueMap.java:355) */
        multiValueMap.getCollection(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.MultiValueMap.createCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCollection(int)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#createCollection(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.Factory#create()}
 * @utbot.returnsFrom {@code return collectionFactory.create();}
 *  */
    @Test
    public void testCreateCollection_FactoryCreate() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections4.functors.ConstantFactory"));
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        
        Collection actual = multiValueMap.createCollection(-255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCollection(int)
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return collectionFactory.create();
 *  */
    @Test
    public void testCreateCollection_ThrowClassCastException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        ConstantFactory collectionFactory = ((ConstantFactory) createInstance("org.apache.commons.collections4.functors.ConstantFactory"));
        byte[] iConstant = {};
        setField(collectionFactory, "org.apache.commons.collections4.functors.ConstantFactory", "iConstant", iConstant);
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.createCollection] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.Collection ([B and java.util.Collection are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.map.MultiValueMap.createCollection(MultiValueMap.java:484) */
        multiValueMap.createCollection(4);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return collectionFactory.create();
 *  */
    @Test
    public void testCreateCollection_ThrowNullPointerException() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.createCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.MultiValueMap.createCollection(MultiValueMap.java:484) */
        multiValueMap.createCollection(-255);
    }
    
    /**
    @utbot.classUnderTest {@link MultiValueMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.MultiValueMap#createCollection(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return collectionFactory.create();
 *  */
    @Test
    public void testCreateCollection_ThrowNullPointerException_1() throws Exception  {
        MultiValueMap multiValueMap = ((MultiValueMap) createInstance("org.apache.commons.collections4.map.MultiValueMap"));
        InstantiateFactory collectionFactory = ((InstantiateFactory) createInstance("org.apache.commons.collections4.functors.InstantiateFactory"));
        setField(multiValueMap, "org.apache.commons.collections4.map.MultiValueMap", "collectionFactory", collectionFactory);
        
        /* This test fails because method [org.apache.commons.collections4.map.MultiValueMap.createCollection] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.InstantiateFactory.findConstructor(InstantiateFactory.java:111)
            org.apache.commons.collections4.functors.InstantiateFactory.create(InstantiateFactory.java:126)
            org.apache.commons.collections4.map.MultiValueMap.createCollection(MultiValueMap.java:484) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields948728756102400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields948728756102400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass948728756109600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948728756102400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948728756109600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields948728760149900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields948728760149900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass948728760152200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948728760149900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948728760152200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.collections4.map;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.apache.commons.collections4.map.ListOrderedMap.ValuesView;
import org.apache.commons.collections4.map.ListOrderedMap.EntrySetView;
import java.util.List;
import java.util.Set;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.jar.JarInputStream;
import java.io.ObjectStreamClass;
import java.io.EOFException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.io.ObjectOutputStream;
import org.apache.commons.collections4.map.ListOrderedMap.KeySetView;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator;
import java.util.ListIterator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_collections4_map_ListOrderedMapTest {
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.previousKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previousKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#previousKey(java.lang.Object)}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testPreviousKey_IndexLessOrEqualZero() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        byte[] byteArray = {};
        
        Object actual = listOrderedMap.previousKey(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#previousKey(java.lang.Object)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return insertOrder.get(index - 1);}
 *  */
    @Test
    public void testPreviousKey_IndexGreaterThanZero() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        Object object = createInstance("java.lang.Object");
        insertOrder.add(object);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        Object actual = listOrderedMap.previousKey(null);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method previousKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#previousKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int index = insertOrder.indexOf(key);
 *  */
    @Test
    public void testPreviousKey_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.previousKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.previousKey(ListOrderedMap.java:209) */
        listOrderedMap.previousKey(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#remove(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#get(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return remove(get(index));}
 *  */
    @Test
    public void testRemove_ListOrderedMapRemove() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.remove(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#remove(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return remove(get(index));
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.collections4.map.ListOrderedMap.get(ListOrderedMap.java:384)
            org.apache.commons.collections4.map.ListOrderedMap.remove(ListOrderedMap.java:468) */
        listOrderedMap.remove(-1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove(int)
    
    @Test
    public void testRemove1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        Integer integer = 0;
        insertOrder.add(integer);
        Integer integer1 = 0;
        insertOrder.add(integer1);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.remove(1);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (decorated().containsKey(key)): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#decorated()}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_NotDecoratedContainsKey() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.remove(((Object) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#remove(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#decorated()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: decorated().containsKey(key)
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.remove(ListOrderedMap.java:262) */
        listOrderedMap.remove(((Object) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remove(java.lang.Object)
    
    @Test
    public void testRemove2() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        map.put(character, object);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.remove(ListOrderedMap.java:264) */
        listOrderedMap.remove(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return insertOrder.get(index);}
 *  */
    @Test
    public void testGet_ListGet() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        Object actual = listOrderedMap.get(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return insertOrder.get(index);
 *  */
    @Test
    public void testGet_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.get] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.collections4.map.ListOrderedMap.get(ListOrderedMap.java:384) */
        listOrderedMap.get(-1);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return insertOrder.get(index);
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.get(ListOrderedMap.java:384) */
        listOrderedMap.get(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (decorated().containsKey(key)): True}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#decorated()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return decorated().put(key, value);}
 *  */
    @Test
    public void testPut_DecoratedContainsKey() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        map.put(null, null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.put(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (decorated().containsKey(key)): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#decorated()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testPut_NotDecoratedContainsKey() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.put(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: decorated().containsKey(key)
 *  */
    @Test
    public void testPut_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.put] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.put(ListOrderedMap.java:219) */
        listOrderedMap.put(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (decorated().containsKey(key)): False}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#decorated()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertOrder.add(key);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.put] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.put(ListOrderedMap.java:225) */
        listOrderedMap.put(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.put
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(int, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(int,java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (m.containsKey(key)): False}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: insertOrder.add(index, key);
 *  */
    @Test
    public void testPut_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.put] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.apache.commons.collections4.map.ListOrderedMap.put(ListOrderedMap.java:454) */
        listOrderedMap.put(-1, shortArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(int,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: m.containsKey(key)
 *  */
    @Test
    public void testPut_ThrowNullPointerException1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.put] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.put(ListOrderedMap.java:443) */
        listOrderedMap.put(-255, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(int,java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (m.containsKey(key)): False}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertOrder.add(index, key);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_11() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.put] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.put(ListOrderedMap.java:454) */
        listOrderedMap.put(-255, byteArray, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method put(int, java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#put(int,java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testPut() {
        ListOrderedMap listOrderedMap = new ListOrderedMap();
        Object object = new Object();
        Object object1 = new Object();
        listOrderedMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        listOrderedMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        listOrderedMap.put(object4, object5);
        
        Object actual = listOrderedMap.put(1, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#toString()}
 * @utbot.executesCondition {@code (isEmpty()): True}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#isEmpty()}
 * @utbot.returnsFrom {@code return "{}";}
 *  */
    @Test
    public void testToString_IsEmpty() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        String actual = listOrderedMap.toString();
        
        String expected = "{}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#toString()}
     */
    @Test
    public void testToString() {
        ListOrderedMap listOrderedMap = new ListOrderedMap();
        Object object = new Object();
        Object object1 = new Object();
        listOrderedMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        listOrderedMap.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        listOrderedMap.put(object4, object5);
        
        String actual = listOrderedMap.toString();
        
        String expected = "{java.lang.Object@9a2569e=java.lang.Object@7640e40f, java.lang.Object@3dde6a18=java.lang.Object@3880ce75, java.lang.Object@6b3da612=java.lang.Object@3e8bf241}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.values
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method values()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#values()}
 * @utbot.returnsFrom {@code return new ValuesView<V>(this);}
 *  */
    @Test
    public void testValues_Return() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        ListOrderedMap.ValuesView actual = ((ListOrderedMap.ValuesView) listOrderedMap.values());
        
        ListOrderedMap.ValuesView expected = ((ListOrderedMap.ValuesView) createInstance("org.apache.commons.collections4.map.ListOrderedMap$ValuesView"));
        setField(expected, "org.apache.commons.collections4.map.ListOrderedMap$ValuesView", "parent", listOrderedMap);
        
        ListOrderedMap expectedParent = ((ListOrderedMap) getFieldValue(expected, "org.apache.commons.collections4.map.ListOrderedMap$ValuesView", "parent"));
        ListOrderedMap actualParent = ((ListOrderedMap) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$ValuesView", "parent"));
        // org.apache.commons.collections4.map.ListOrderedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return insertOrder.indexOf(key);}
 *  */
    @Test
    public void testIndexOf_ListIndexOf() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        byte[] byteArray = {};
        
        int actual = listOrderedMap.indexOf(byteArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return insertOrder.indexOf(key);
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.indexOf(ListOrderedMap.java:405) */
        listOrderedMap.indexOf(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#clear()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#decorated()}
 * @utbot.invokes {@link java.util.Map#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 *  */
    @Test
    public void testClear_ListClear() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        listOrderedMap.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: decorated().clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.clear(ListOrderedMap.java:271) */
        listOrderedMap.clear();
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#clear()}
 * @utbot.invokes {@link java.util.Map#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertOrder.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.clear(ListOrderedMap.java:272) */
        listOrderedMap.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#getValue(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return get(insertOrder.get(index));}
 *  */
    @Test
    public void testGetValue_ListOrderedMapGet() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.getValue(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#getValue(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return get(insertOrder.get(index));
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.collections4.map.ListOrderedMap.getValue(ListOrderedMap.java:395) */
        listOrderedMap.getValue(-1);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#getValue(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return get(insertOrder.get(index));
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.getValue(ListOrderedMap.java:395) */
        listOrderedMap.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.entrySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method entrySet()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#entrySet()}
 * @utbot.returnsFrom {@code return new EntrySetView<K, V>(this, this.insertOrder);}
 *  */
    @Test
    public void testEntrySet_Return() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        ListOrderedMap.EntrySetView actual = ((ListOrderedMap.EntrySetView) listOrderedMap.entrySet());
        
        ListOrderedMap.EntrySetView expected = new ListOrderedMap.EntrySetView(listOrderedMap, null);
        
        ListOrderedMap expectedParent = ((ListOrderedMap) getFieldValue(expected, "org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", "parent"));
        ListOrderedMap actualParent = ((ListOrderedMap) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", "parent"));
        // org.apache.commons.collections4.map.ListOrderedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        List actualInsertOrder = ((List) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", "insertOrder"));
        assertNull(actualInsertOrder);
        
        Set actualEntrySet = ((Set) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", "entrySet"));
        assertNull(actualEntrySet);
        
        List finalListOrderedMapInsertOrder = ((List) getFieldValue(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder"));
        
        assertNull(finalListOrderedMapInsertOrder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(int, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#putAll(int,java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testPutAll_SetIterator() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        listOrderedMap.putAll(-255, linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(int, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#putAll(int,java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Map.Entry<? extends K, ? extends V> entry: map.entrySet())
 *  */
    @Test
    public void testPutAll_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.putAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.putAll(ListOrderedMap.java:245) */
        listOrderedMap.putAll(-255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#putAll(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testPutAll_SetIterator1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        listOrderedMap.putAll(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#putAll(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Map.Entry<? extends K, ? extends V> entry: map.entrySet())
 *  */
    @Test
    public void testPutAll_ThrowNullPointerException1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.putAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.putAll(ListOrderedMap.java:232) */
        listOrderedMap.putAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.readObject(ListOrderedMap.java:149) */
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = listOrderedMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(listOrderedMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = listOrderedMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(listOrderedMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = listOrderedMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(listOrderedMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.EOFException} in: in.defaultReadObject();
 *  */
    @Test(expected = EOFException.class)
    public void testReadObject_ThrowEOFException() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object first = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        setField(in1, "java.util.jar.JarInputStream", "first", first);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "totalBytesRead", -255L);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = listOrderedMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(listOrderedMap, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testReadObject_ThrowZipException() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        JarInputStream in1 = ((JarInputStream) createInstance("java.util.jar.JarInputStream"));
        Object entry = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(in1, "java.util.zip.ZipInputStream", "entry", entry);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = listOrderedMapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(listOrderedMap, readObjectMethodArguments);
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
        // 6 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.writeObject
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = listOrderedMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(listOrderedMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = listOrderedMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(listOrderedMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.writeObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.writeObject(ListOrderedMap.java:135) */
        Class listOrderedMapClazz = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = listOrderedMapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(listOrderedMap, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.keySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method keySet()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#keySet()}
 * @utbot.returnsFrom {@code return new KeySetView<K>(this);}
 *  */
    @Test
    public void testKeySet_Return() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        ListOrderedMap.KeySetView actual = ((ListOrderedMap.KeySetView) listOrderedMap.keySet());
        
        ListOrderedMap.KeySetView expected = new ListOrderedMap.KeySetView(listOrderedMap);
        
        ListOrderedMap expectedParent = ((ListOrderedMap) getFieldValue(expected, "org.apache.commons.collections4.map.ListOrderedMap$KeySetView", "parent"));
        ListOrderedMap actualParent = ((ListOrderedMap) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$KeySetView", "parent"));
        // org.apache.commons.collections4.map.ListOrderedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#setValue(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return put(key, value);}
 *  */
    @Test
    public void testSetValue_ListOrderedMapPut() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        Object object = createInstance("java.lang.Object");
        insertOrder.add(object);
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.setValue(0, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#setValue(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final K key = insertOrder.get(index);
 *  */
    @Test
    public void testSetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.setValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.collections4.map.ListOrderedMap.setValue(ListOrderedMap.java:418) */
        listOrderedMap.setValue(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#setValue(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final K key = insertOrder.get(index);
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.setValue(ListOrderedMap.java:418) */
        listOrderedMap.setValue(-255, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setValue(int, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#setValue(int,java.lang.Object)}
     */
    @Test
    public void testSetValueWithCornerCase() {
        ListOrderedMap listOrderedMap = new ListOrderedMap();
        Object object = new Object();
        Object object1 = new Object();
        listOrderedMap.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        listOrderedMap.put(object2, object3);
        Object object4 = new Object();
        
        Object actual = listOrderedMap.setValue(0, object4);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.asList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#asList()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#keyList()}
 * @utbot.returnsFrom {@code return keyList();}
 *  */
    @Test
    public void testAsList_ListOrderedMapKeyList() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        List actual = listOrderedMap.asList();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#asList()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#keyList()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return keyList();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsList_ThrowIllegalArgumentException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        listOrderedMap.asList();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.firstKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method firstKey()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#firstKey()}
 * @utbot.executesCondition {@code (size() == 0): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return insertOrder.get(0);}
 *  */
    @Test
    public void testFirstKey_SizeNotEqualsZero() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        map.put(null, null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.firstKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method firstKey()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#firstKey()}
 * @utbot.executesCondition {@code (size() == 0): True}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: size() == 0
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testFirstKey_ThrowNoSuchElementException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        listOrderedMap.firstKey();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method firstKey()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#firstKey()}
 * @utbot.executesCondition {@code (size() == 0): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return insertOrder.get(0);
 *  */
    @Test
    public void testFirstKey_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.firstKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.firstKey(ListOrderedMap.java:170) */
        listOrderedMap.firstKey();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.lastKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastKey()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#lastKey()}
 * @utbot.executesCondition {@code (size() == 0): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return insertOrder.get(size() - 1);}
 *  */
    @Test
    public void testLastKey_SizeNotEqualsZero() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        map.put(null, null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.lastKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method lastKey()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#lastKey()}
 * @utbot.executesCondition {@code (size() == 0): True}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: size() == 0
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testLastKey_ThrowNoSuchElementException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        listOrderedMap.lastKey();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastKey()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#lastKey()}
 * @utbot.executesCondition {@code (size() == 0): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return insertOrder.get(size() - 1);
 *  */
    @Test
    public void testLastKey_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        LinkedHashMap map = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        map.put(integer, object);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.lastKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.lastKey(ListOrderedMap.java:183) */
        listOrderedMap.lastKey();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method listOrderedMap(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#listOrderedMap(java.util.Map)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new ListOrderedMap<K, V>(map);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedMap_ThrowIllegalArgumentException() {
        ListOrderedMap.listOrderedMap(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method listOrderedMap(java.util.Map)
    
    @Test
    public void testListOrderedMap1() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        ListOrderedMap actual = ListOrderedMap.listOrderedMap(linkedHashMap);
        
        ListOrderedMap expected = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        setField(expected, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        setField(expected, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", linkedHashMap);
        
        // org.apache.commons.collections4.map.ListOrderedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.mapIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapIterator()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#mapIterator()}
 * @utbot.returnsFrom {@code return new ListOrderedMapIterator<K, V>(this);}
 *  */
    @Test
    public void testMapIterator_Return() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        ListOrderedMap.ListOrderedMapIterator actual = ((ListOrderedMap.ListOrderedMapIterator) listOrderedMap.mapIterator());
        
        ListOrderedMap.ListOrderedMapIterator expected = ((ListOrderedMap.ListOrderedMapIterator) createInstance("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator"));
        setField(expected, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "parent", listOrderedMap);
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "iterator", iterator);
        
        ListOrderedMap expectedParent = ((ListOrderedMap) getFieldValue(expected, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "parent"));
        ListOrderedMap actualParent = ((ListOrderedMap) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "parent"));
        // org.apache.commons.collections4.map.ListOrderedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        ListIterator expectedIterator = ((ListIterator) getFieldValue(expected, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "iterator"));
        ListIterator actualIterator = ((ListIterator) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "iterator"));
        
        Object actualLast = getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "last");
        assertNull(actualLast);
        
        boolean actualReadable = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", "readable"));
        assertFalse(actualReadable);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.nextKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#nextKey(java.lang.Object)}
 * @utbot.executesCondition {@code (index >= 0): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNextKey_IndexLessThanZero() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        byte[] byteArray = {};
        
        Object actual = listOrderedMap.nextKey(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#nextKey(java.lang.Object)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.executesCondition {@code (index < size() - 1): False}
 * @utbot.invokes {@link org.apache.commons.collections4.map.ListOrderedMap#size()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNextKey_IndexGreaterOrEqualSizeMinus1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        insertOrder.add(null);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.nextKey(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#nextKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int index = insertOrder.indexOf(key);
 *  */
    @Test
    public void testNextKey_ThrowNullPointerException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.nextKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.ListOrderedMap.nextKey(ListOrderedMap.java:194) */
        listOrderedMap.nextKey(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextKey(java.lang.Object)
    
    @Test
    public void testNextKey1() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        insertOrder.add(null);
        Object object = createInstance("java.lang.Object");
        insertOrder.add(object);
        java.lang.Object[] subListArray = createArray("[Ljava.util.ArrayList$SubList;", 10);
        insertOrder.add(subListArray);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        LinkedHashMap map = new LinkedHashMap();
        map.put(null, object);
        map.put(object, subListArray);
        setField(listOrderedMap, "org.apache.commons.collections4.map.AbstractMapDecorator", "map", map);
        
        Object actual = listOrderedMap.nextKey(null);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextKey(java.lang.Object)
    
    @Test
    public void testNextKey2() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        Object object = createInstance("java.lang.Object");
        insertOrder.add(object);
        insertOrder.add(object);
        insertOrder.add(null);
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        /* This test fails because method [org.apache.commons.collections4.map.ListOrderedMap.nextKey] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.map.AbstractMapDecorator.size(AbstractMapDecorator.java:118)
            org.apache.commons.collections4.map.ListOrderedMap.nextKey(ListOrderedMap.java:195) */
        listOrderedMap.nextKey(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.keyList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method keyList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#keyList()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.UnmodifiableList#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return UnmodifiableList.unmodifiableList(insertOrder);}
 *  */
    @Test
    public void testKeyList_UnmodifiableListUnmodifiableList() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        ArrayList insertOrder = new ArrayList();
        setField(listOrderedMap, "org.apache.commons.collections4.map.ListOrderedMap", "insertOrder", insertOrder);
        
        List actual = listOrderedMap.keyList();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method keyList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#keyList()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.UnmodifiableList#unmodifiableList(java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableList.unmodifiableList(insertOrder);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testKeyList_ThrowIllegalArgumentException() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        listOrderedMap.keyList();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.map.ListOrderedMap.valueList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method valueList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedMap}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.map.ListOrderedMap#valueList()}
 * @utbot.returnsFrom {@code return new ValuesView<V>(this);}
 *  */
    @Test
    public void testValueList_Return() throws Exception  {
        ListOrderedMap listOrderedMap = ((ListOrderedMap) createInstance("org.apache.commons.collections4.map.ListOrderedMap"));
        
        ListOrderedMap.ValuesView actual = ((ListOrderedMap.ValuesView) listOrderedMap.valueList());
        
        ListOrderedMap.ValuesView expected = ((ListOrderedMap.ValuesView) createInstance("org.apache.commons.collections4.map.ListOrderedMap$ValuesView"));
        setField(expected, "org.apache.commons.collections4.map.ListOrderedMap$ValuesView", "parent", listOrderedMap);
        
        ListOrderedMap expectedParent = ((ListOrderedMap) getFieldValue(expected, "org.apache.commons.collections4.map.ListOrderedMap$ValuesView", "parent"));
        ListOrderedMap actualParent = ((ListOrderedMap) getFieldValue(actual, "org.apache.commons.collections4.map.ListOrderedMap$ValuesView", "parent"));
        // org.apache.commons.collections4.map.ListOrderedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields958342127322500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields958342127322500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass958342127361100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields958342127322500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass958342127361100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields958342127766700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields958342127766700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass958342127771800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields958342127766700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass958342127771800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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


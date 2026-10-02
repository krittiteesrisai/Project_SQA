package org.apache.commons.collections.set;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.commons.collections.set.ListOrderedSet.OrderedSetIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_collections_set_ListOrderedSetTest {
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(int,java.lang.Object)}
 * @utbot.executesCondition {@code (!contains(object)): False}
 * @utbot.invokes {@link org.apache.commons.collections.set.ListOrderedSet#contains(java.lang.Object)}
 *  */
    @Test
    public void testAdd_Contains() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        LinkedHashSet collection = new LinkedHashSet();
        collection.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        listOrderedSet.add(-255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.set.ListOrderedSet#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !contains(object)
 *  */
    @Test
    public void testAdd_ThrowClassCastException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList collection = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.add] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.util.Set (java.util.ArrayList and java.util.Set are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.set.AbstractSetDecorator.decorated(AbstractSetDecorator.java:63)
            org.apache.commons.collections.set.AbstractSetDecorator.decorated(AbstractSetDecorator.java:32)
            org.apache.commons.collections.collection.AbstractCollectionDecorator.contains(AbstractCollectionDecorator.java:97)
            org.apache.commons.collections.set.ListOrderedSet.add(ListOrderedSet.java:293) */
        listOrderedSet.add(-255, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add(int, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(int,java.lang.Object)}
     */
    @Test
    public void testAddThrowsIOOBE() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        Object object2 = new Object();
        listOrderedSet.add(object2);
        Object object3 = new Object();
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.add] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.apache.commons.collections.set.ListOrderedSet.add(ListOrderedSet.java:295) */
        listOrderedSet.add(-1, object3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(java.lang.Object)}
 * @utbot.executesCondition {@code (collection.add(object)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testAdd_NotCollectionAdd() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        collection.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        boolean actual = listOrderedSet.add(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(java.lang.Object)}
 * @utbot.executesCondition {@code (collection.add(object)): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAdd_CollectionAdd() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setOrder.add(null);
        setOrder.add(null);
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", setOrder);
        
        boolean actual = listOrderedSet.add(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: collection.add(object)
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.add(ListOrderedSet.java:193) */
        listOrderedSet.add(null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#add(java.lang.Object)}
 * @utbot.executesCondition {@code (collection.add(object)): True}
 * @utbot.invokes {@link java.util.Collection#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setOrder.add(object);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.add(ListOrderedSet.java:194) */
        listOrderedSet.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (result): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_NotResult() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList collection = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        byte[] byteArray = {};
        
        boolean actual = listOrderedSet.remove(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (result): True}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_Result() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", setOrder);
        
        boolean actual = listOrderedSet.remove(((Object) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#remove(java.lang.Object)}
 * @utbot.invokes {@link java.util.Collection#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean result = collection.remove(object);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.remove(ListOrderedSet.java:211) */
        listOrderedSet.remove(((Object) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remove(java.lang.Object)
    
    @Test
    public void testRemove1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        Character character = '\u0000';
        collection.add(character);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.remove(ListOrderedSet.java:213) */
        listOrderedSet.remove(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.invokes {@link org.apache.commons.collections.set.ListOrderedSet#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return obj;}
 *  */
    @Test
    public void testRemove_ListOrderedSetRemove() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        Integer integer = 0;
        setOrder.add(integer);
        Integer integer1 = 0;
        setOrder.add(integer1);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", setOrder);
        
        Integer actual = ((Integer) listOrderedSet.remove(0));
        
        assertEquals(integer, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object obj = setOrder.remove(index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setOrder.add(null);
        setOrder.add(null);
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.collections.set.ListOrderedSet.remove(ListOrderedSet.java:339) */
        listOrderedSet.remove(-1);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#remove(int)}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object obj = setOrder.remove(index);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.remove(ListOrderedSet.java:339) */
        listOrderedSet.remove(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove(int)
    
    @Test
    public void testRemove2() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        Object object = createInstance("java.lang.Object");
        setOrder.add(object);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", setOrder);
        
        Object actual = listOrderedSet.remove(0);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return setOrder.get(index);}
 *  */
    @Test
    public void testGet_ListGet() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        Object actual = listOrderedSet.get(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(int)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return setOrder.get(index);
 *  */
    @Test
    public void testGet_ThrowIndexOutOfBoundsException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setOrder.add(null);
        setOrder.add(null);
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.get] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.collections.set.ListOrderedSet.get(ListOrderedSet.java:267) */
        listOrderedSet.get(-1);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setOrder.get(index);
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.get(ListOrderedSet.java:267) */
        listOrderedSet.get(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toString()}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.returnsFrom {@code return setOrder.toString();}
 *  */
    @Test
    public void testToString_ObjectToString() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        String actual = listOrderedSet.toString();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toString()}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setOrder.toString();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.toString(ListOrderedSet.java:354) */
        listOrderedSet.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.returnsFrom {@code return setOrder.indexOf(object);}
 *  */
    @Test
    public void testIndexOf_ListIndexOf() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        byte[] byteArray = {};
        
        int actual = listOrderedSet.indexOf(byteArray);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#indexOf(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setOrder.indexOf(object);
 *  */
    @Test
    public void testIndexOf_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.indexOf] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.indexOf(ListOrderedSet.java:280) */
        listOrderedSet.indexOf(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.clear
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#clear()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: collection.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.clear(ListOrderedSet.java:182) */
        listOrderedSet.clear();
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#clear()}
 * @utbot.invokes {@link java.util.Collection#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setOrder.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.clear(ListOrderedSet.java:183) */
        listOrderedSet.clear();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clear()
    
    @Test
    public void testClear1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        HashSet collection = new HashSet();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        listOrderedSet.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toArray()}
 * @utbot.invokes {@link java.util.List#toArray()}
 * @utbot.returnsFrom {@code return setOrder.toArray();}
 *  */
    @Test
    public void testToArray_ListToArray() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setOrder.add(null);
        setOrder.add(null);
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        java.lang.Object[] actual = listOrderedSet.toArray();
        
        java.lang.Object[] expected = {null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toArray()}
 * @utbot.invokes {@link java.util.List#toArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setOrder.toArray();
 *  */
    @Test
    public void testToArray_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.toArray(ListOrderedSet.java:247) */
        listOrderedSet.toArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toArray(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return setOrder.toArray(a);}
 *  */
    @Test
    public void testToArray_ListToArray1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        java.lang.Object[] objectArray = {};
        
        java.lang.Object[] actual = listOrderedSet.toArray(objectArray);
        
        int objectArraySize = objectArray.length;
        assertEquals(objectArraySize, actual.length);
        assertTrue(deepEquals(objectArray, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toArray(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setOrder.toArray(a);
 *  */
    @Test
    public void testToArray_ThrowNullPointerException1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.toArray(ListOrderedSet.java:252) */
        listOrderedSet.toArray(((java.lang.Object[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#toArray(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return setOrder.toArray(a);
 *  */
    @Test
    public void testToArray_ThrowNullPointerException_1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.toArray] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.toArray(ArrayList.java:398)
            org.apache.commons.collections.set.ListOrderedSet.toArray(ListOrderedSet.java:252) */
        listOrderedSet.toArray(((java.lang.Object[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.iterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#iterator()}
 * @utbot.invokes {@link java.util.List#listIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OrderedSetIterator<E>(setOrder.listIterator(), collection);
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.iterator] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.iterator(ListOrderedSet.java:188) */
        listOrderedSet.iterator();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#iterator()}
     */
    @Test
    public void testIterator() throws Exception  {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        
        ListOrderedSet.OrderedSetIterator actual = ((ListOrderedSet.OrderedSetIterator) listOrderedSet.iterator());
        
        ListOrderedSet.OrderedSetIterator expected = ((ListOrderedSet.OrderedSetIterator) createInstance("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator"));
        HashSet set = new HashSet();
        Object object2 = createInstance("java.lang.Object");
        set.add(object2);
        Object object3 = createInstance("java.lang.Object");
        set.add(object3);
        setField(expected, "org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", "set", set);
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections.iterators.AbstractUntypedIteratorDecorator", "iterator", iterator);
        
        Collection expectedSet = expected.set;
        Collection actualSet = actual.set;
        assertTrue(deepEquals(expectedSet, actualSet));
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections.iterators.AbstractUntypedIteratorDecorator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections.iterators.AbstractUntypedIteratorDecorator", "iterator"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll(int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(int,java.util.Collection)}
 * @utbot.executesCondition {@code (changed): False}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return changed;}
 *  */
    @Test
    public void testAddAll_NotChanged() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = listOrderedSet.addAll(-255, arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(int,java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(E e: coll)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} when: contains(e)
 *  */
    @Test
    public void testAddAll_ThrowClassCastException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList collection = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
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
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.util.Set (java.util.ArrayList and java.util.Set are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.set.AbstractSetDecorator.decorated(AbstractSetDecorator.java:63)
            org.apache.commons.collections.set.AbstractSetDecorator.decorated(AbstractSetDecorator.java:32)
            org.apache.commons.collections.collection.AbstractCollectionDecorator.contains(AbstractCollectionDecorator.java:97)
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:315) */
        listOrderedSet.addAll(-255, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(E e: coll)
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:314) */
        listOrderedSet.addAll(-255, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll(int, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(int,java.util.Collection)}
     */
    @Test
    public void testAddAllReturnsTrue() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        HashSet hashSet = new HashSet();
        Object object2 = new Object();
        hashSet.add(object2);
        Object object3 = new Object();
        hashSet.add(object3);
        
        boolean actual = listOrderedSet.addAll(1, hashSet);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addAll(int, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(int,java.util.Collection)}
     */
    @Test
    public void testAddAllThrowsIOOBEWithCornerCase() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        Object object2 = new Object();
        listOrderedSet.add(object2);
        HashSet hashSet = new HashSet();
        Object object3 = new Object();
        hashSet.add(object3);
        Object object4 = new Object();
        hashSet.add(object4);
        Object object5 = new Object();
        hashSet.add(object5);
        Object object6 = new Object();
        hashSet.add(object6);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.IndexOutOfBoundsException: Index: -2147483648, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.addAll(ArrayList.java:700)
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:324) */
        listOrderedSet.addAll(Integer.MIN_VALUE, hashSet);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        LinkedHashSet collection = new LinkedHashSet();
        collection.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        boolean actual = listOrderedSet.addAll(0, arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll2() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.collection.AbstractCollectionDecorator.contains(AbstractCollectionDecorator.java:97)
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:315) */
        listOrderedSet.addAll(0, hashSet);
    }
    
    @Test
    public void testAddAll3() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        LinkedHashSet collection = new LinkedHashSet();
        Integer integer = 0;
        collection.add(integer);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:324) */
        listOrderedSet.addAll(0, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testAddAll_CollectionIterator() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = listOrderedSet.addAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(E e: coll)
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:203) */
        listOrderedSet.addAll(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#addAll(java.util.Collection)}
     */
    @Test
    public void testAddAllReturnsTrue1() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        Object object2 = new Object();
        listOrderedSet.add(object2);
        ArrayList arrayList = new ArrayList();
        Object object3 = new Object();
        arrayList.add(object3);
        Object object4 = new Object();
        arrayList.add(object4);
        Object object5 = new Object();
        arrayList.add(object5);
        Object object6 = new Object();
        arrayList.add(object6);
        Object object7 = new Object();
        arrayList.add(object7);
        
        boolean actual = listOrderedSet.addAll(arrayList);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection)
    
    @Test
    public void testAddAll4() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        Integer integer = 0;
        collection.add(integer);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        boolean actual = listOrderedSet.addAll(collection);
        
        assertFalse(actual);
    }
    
    @Test
    public void testAddAll5() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        Integer integer = 0;
        setOrder.add(integer);
        setOrder.add(null);
        setOrder.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", setOrder);
        HashSet hashSet = new HashSet();
        hashSet.add(integer);
        
        boolean actual = listOrderedSet.addAll(hashSet);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAll(java.util.Collection)
    
    @Test
    public void testAddAll6() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        collection.add(null);
        collection.add(null);
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.util.ConcurrentModificationException]
            java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
            java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:203) */
        listOrderedSet.addAll(collection);
    }
    
    @Test
    public void testAddAll7() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.add(ListOrderedSet.java:194)
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:204) */
        listOrderedSet.addAll(hashSet);
    }
    
    @Test
    public void testAddAll8() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        Character character = '\u0000';
        hashSet.add(character);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.add(ListOrderedSet.java:193)
            org.apache.commons.collections.set.ListOrderedSet.addAll(ListOrderedSet.java:204) */
        listOrderedSet.addAll(hashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.asList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#asList()}
 * @utbot.invokes {@link org.apache.commons.collections.list.UnmodifiableList#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return UnmodifiableList.unmodifiableList(setOrder);}
 *  */
    @Test
    public void testAsList_UnmodifiableListUnmodifiableList() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        
        List actual = listOrderedSet.asList();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#asList()}
 * @utbot.invokes {@link org.apache.commons.collections.list.UnmodifiableList#unmodifiableList(java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableList.unmodifiableList(setOrder);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsList_ThrowIllegalArgumentException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        listOrderedSet.asList();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.removeAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#removeAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemoveAll_ReturnResult() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = listOrderedSet.removeAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#removeAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Iterator<?> it = coll.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testRemoveAll_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.removeAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.removeAll(ListOrderedSet.java:221) */
        listOrderedSet.removeAll(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method removeAll(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#removeAll(java.util.Collection)}
     */
    @Test
    public void testRemoveAllReturnsFalse() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        HashSet hashSet = new HashSet();
        Object object2 = new Object();
        hashSet.add(object2);
        Object object3 = new Object();
        hashSet.add(object3);
        
        boolean actual = listOrderedSet.removeAll(hashSet);
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#removeAll(java.util.Collection)}
     */
    @Test
    public void testRemoveAllReturnsFalse1() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        Object object2 = new Object();
        listOrderedSet.add(object2);
        ArrayList arrayList = new ArrayList();
        Object object3 = new Object();
        arrayList.add(object3);
        Object object4 = new Object();
        arrayList.add(object4);
        Object object5 = new Object();
        arrayList.add(object5);
        Object object6 = new Object();
        arrayList.add(object6);
        Object object7 = new Object();
        arrayList.add(object7);
        
        boolean actual = listOrderedSet.removeAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.retainAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#retainAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#retainAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRetainAll_CollectionRetainAll() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        HashSet collection = new HashSet();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        
        boolean actual = listOrderedSet.retainAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean result = collection.retainAll(coll);
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.retainAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.set.ListOrderedSet.retainAll(ListOrderedSet.java:229) */
        listOrderedSet.retainAll(null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#retainAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#retainAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return false;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException_1() throws Exception  {
        ListOrderedSet listOrderedSet = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList collection = new ArrayList();
        setField(listOrderedSet, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.set.ListOrderedSet.retainAll] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.ArrayList.batchRemove(ArrayList.java:816)
            java.base/java.util.ArrayList.retainAll(ArrayList.java:811)
            org.apache.commons.collections.set.ListOrderedSet.retainAll(ListOrderedSet.java:229) */
        listOrderedSet.retainAll(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.set.ListOrderedSet}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#retainAll(java.util.Collection)}
     */
    @Test
    public void testRetainAllReturnsTrue() {
        ListOrderedSet listOrderedSet = new ListOrderedSet();
        Object object = new Object();
        listOrderedSet.add(object);
        Object object1 = new Object();
        listOrderedSet.add(object1);
        HashSet hashSet = new HashSet();
        Object object2 = new Object();
        hashSet.add(object2);
        Object object3 = new Object();
        hashSet.add(object3);
        
        boolean actual = listOrderedSet.retainAll(hashSet);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.listOrderedSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listOrderedSet(java.util.Set, java.util.List)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set,java.util.List)}
 * @utbot.executesCondition {@code (set == null): False}
 * @utbot.executesCondition {@code (list == null): False}
 * @utbot.executesCondition {@code (set.size() > 0): False}
 * @utbot.executesCondition {@code (list.size() > 0): False}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return new ListOrderedSet<E>(set, list);}
 *  */
    @Test
    public void testListOrderedSet_ListSizeLessOrEqualZero() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        
        ListOrderedSet actual = ListOrderedSet.listOrderedSet(linkedHashSet, arrayList);
        
        ListOrderedSet expected = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        setField(expected, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", arrayList);
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", linkedHashSet);
        
        // org.apache.commons.collections.set.ListOrderedSet is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method listOrderedSet(java.util.Set, java.util.List)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set,java.util.List)}
 * @utbot.executesCondition {@code (set == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: set == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSet_ThrowIllegalArgumentException_1() {
        ListOrderedSet.listOrderedSet(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set,java.util.List)}
 * @utbot.executesCondition {@code (set == null): False}
 * @utbot.executesCondition {@code (list == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: list == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSet_ThrowIllegalArgumentException_2() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        ListOrderedSet.listOrderedSet(linkedHashSet, null);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set,java.util.List)}
 * @utbot.executesCondition {@code (set == null): False}
 * @utbot.executesCondition {@code (list == null): False}
 * @utbot.executesCondition {@code (set.size() > 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: set.size() > 0 || list.size() > 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSet_ThrowIllegalArgumentException() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        ArrayList arrayList = new ArrayList();
        
        ListOrderedSet.listOrderedSet(linkedHashSet, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set,java.util.List)}
 * @utbot.executesCondition {@code (set == null): False}
 * @utbot.executesCondition {@code (list == null): False}
 * @utbot.executesCondition {@code (set.size() > 0): False}
 * @utbot.executesCondition {@code (list.size() > 0): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: set.size() > 0 || list.size() > 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSet_ThrowIllegalArgumentException_3() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        ListOrderedSet.listOrderedSet(linkedHashSet, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.listOrderedSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listOrderedSet(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set)}
 * @utbot.returnsFrom {@code return new ListOrderedSet<E>(set);}
 *  */
    @Test
    public void testListOrderedSet_Return() throws Exception  {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        ListOrderedSet actual = ListOrderedSet.listOrderedSet(linkedHashSet);
        
        ListOrderedSet expected = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        ArrayList setOrder = new ArrayList();
        setField(expected, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", setOrder);
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", linkedHashSet);
        
        // org.apache.commons.collections.set.ListOrderedSet is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method listOrderedSet(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.Set)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new ListOrderedSet<E>(set);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSet_ThrowIllegalArgumentException1() {
        ListOrderedSet.listOrderedSet(((Set) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.set.ListOrderedSet.listOrderedSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listOrderedSet(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.List)}
 * @utbot.executesCondition {@code (list == null): False}
 * @utbot.invokes {@link java.util.List#retainAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return new ListOrderedSet<E>(set, list);}
 *  */
    @Test
    public void testListOrderedSet_ListNotEqualsNull() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        ListOrderedSet actual = ListOrderedSet.listOrderedSet(arrayList);
        
        ListOrderedSet expected = ((ListOrderedSet) createInstance("org.apache.commons.collections.set.ListOrderedSet"));
        setField(expected, "org.apache.commons.collections.set.ListOrderedSet", "setOrder", arrayList);
        HashSet collection = new HashSet();
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        // org.apache.commons.collections.set.ListOrderedSet is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method listOrderedSet(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ListOrderedSet}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.set.ListOrderedSet#listOrderedSet(java.util.List)}
 * @utbot.executesCondition {@code (list == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: list == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testListOrderedSet_ThrowIllegalArgumentException2() {
        ListOrderedSet.listOrderedSet(((List) null));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields947570053305300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields947570053305300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass947570053309900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields947570053305300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass947570053309900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields947570057458100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields947570057458100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass947570057460800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields947570057458100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass947570057460800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


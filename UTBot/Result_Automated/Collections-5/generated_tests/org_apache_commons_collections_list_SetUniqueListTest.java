package org.apache.commons.collections.list;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import org.apache.commons.collections.set.PredicatedSet;
import java.util.HashSet;
import org.apache.commons.collections.list.SetUniqueList.SetListIterator;
import java.util.Set;
import java.util.Iterator;
import java.lang.reflect.Method;
import org.apache.commons.collections.list.SetUniqueList.SetListListIterator;
import java.util.ListIterator;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_collections_list_SetUniqueListTest {
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#add(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 *  */
    @Test
    public void testAdd_SetContains() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        
        setUniqueList.add(-255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#add(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: set.contains(object) == false
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:151) */
        setUniqueList.add(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    @Test
    public void testAdd1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        setUniqueList.add(0, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(int, java.lang.Object)
    
    @Test
    public void testAdd2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        PredicatedSet collection = ((PredicatedSet) createInstance("org.apache.commons.collections.set.PredicatedSet"));
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.add] produces [java.lang.ClassCastException: class org.apache.commons.collections.set.PredicatedSet cannot be cast to class java.util.List (org.apache.commons.collections.set.PredicatedSet is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f; java.util.List is in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.list.AbstractListDecorator.getList(AbstractListDecorator.java:61)
            org.apache.commons.collections.list.AbstractListDecorator.add(AbstractListDecorator.java:66)
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:152) */
        setUniqueList.add(0, object);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        Integer integer = 0;
        set.add(integer);
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.AbstractListDecorator.add(AbstractListDecorator.java:66)
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:152) */
        setUniqueList.add(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.add
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.lang.Object)
    
    @Test
    public void testAdd4() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        collection.add(collection);
        collection.add(collection);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        boolean actual = setUniqueList.add(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        Object object = new Object();
        
        boolean actual = setUniqueList.add(object);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(java.lang.Object)
    
    @Test
    public void testAdd6() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:151)
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:133) */
        setUniqueList.add(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.remove
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#remove(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#remove(java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.remove(object);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.remove(SetUniqueList.java:232) */
        setUniqueList.remove(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#remove(int)}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#remove(int)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_SetRemove() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        Object actual = setUniqueList.remove(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#remove(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object result = super.remove(index);
 *  */
    @Test
    public void testRemove_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.remove] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.list.AbstractListDecorator.getList(AbstractListDecorator.java:61)
            org.apache.commons.collections.list.AbstractListDecorator.remove(AbstractListDecorator.java:94)
            org.apache.commons.collections.list.SetUniqueList.remove(SetUniqueList.java:237) */
        setUniqueList.remove(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object result = super.remove(index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.collections.list.AbstractListDecorator.remove(AbstractListDecorator.java:94)
            org.apache.commons.collections.list.SetUniqueList.remove(SetUniqueList.java:237) */
        setUniqueList.remove(-1);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#remove(int)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.remove(result);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.remove(SetUniqueList.java:238) */
        setUniqueList.remove(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#clear()}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#clear()}
 * @utbot.invokes {@link java.util.Set#clear()}
 *  */
    @Test
    public void testClear_SetClear() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        setUniqueList.clear();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#clear()}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#clear()}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.clear(SetUniqueList.java:256) */
        setUniqueList.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.subList
    
    ///region OTHER: ERROR SUITE for method subList(int, int)
    
    @Test
    public void testSubList1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        Object collection = createInstance("org.apache.commons.collections.FastTreeMap$EntrySet");
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.subList] produces [java.lang.ClassCastException: class org.apache.commons.collections.FastTreeMap$EntrySet cannot be cast to class java.util.List (org.apache.commons.collections.FastTreeMap$EntrySet is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f; java.util.List is in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.list.AbstractListDecorator.getList(AbstractListDecorator.java:61)
            org.apache.commons.collections.list.AbstractListDecorator.subList(AbstractListDecorator.java:102)
            org.apache.commons.collections.list.SetUniqueList.subList(SetUniqueList.java:280) */
        setUniqueList.subList(0, 0);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subList(int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubList2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        setUniqueList.subList(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#iterator()}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#iterator()}
 * @utbot.returnsFrom {@code return new SetListIterator(super.iterator(), set);}
 *  */
    @Test
    public void testIterator_AbstractSerializableListDecoratorIterator() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        SetUniqueList.SetListIterator actual = ((SetUniqueList.SetListIterator) setUniqueList.iterator());
        
        SetUniqueList.SetListIterator expected = ((SetUniqueList.SetListIterator) createInstance("org.apache.commons.collections.list.SetUniqueList$SetListIterator"));
        Object iterator = createInstance("java.util.ArrayList$Itr");
        setField(expected, "org.apache.commons.collections.iterators.AbstractIteratorDecorator", "iterator", iterator);
        
        Set actualSet = actual.set;
        assertNull(actualSet);
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections.iterators.AbstractIteratorDecorator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections.iterators.AbstractIteratorDecorator", "iterator"));
        
        Set finalSetUniqueListSet = setUniqueList.set;
        
        assertNull(finalSetUniqueListSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#contains(java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return set.contains(object);}
 *  */
    @Test
    public void testContains_SetContains() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        
        boolean actual = setUniqueList.contains(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#contains(java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set.contains(object);
 *  */
    @Test
    public void testContains_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.contains] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.contains(SetUniqueList.java:260) */
        setUniqueList.contains(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.addAll
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Collection)
    
    @Test
    public void testAddAll1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        boolean actual = setUniqueList.addAll(collection);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAll(java.util.Collection)
    
    @Test
    public void testAddAll2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.addAll(SetUniqueList.java:194)
            org.apache.commons.collections.list.SetUniqueList.addAll(SetUniqueList.java:171) */
        setUniqueList.addAll(null);
    }
    
    @Test
    public void testAddAll3() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:151)
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:133)
            org.apache.commons.collections.list.SetUniqueList.addAll(SetUniqueList.java:195)
            org.apache.commons.collections.list.SetUniqueList.addAll(SetUniqueList.java:171) */
        setUniqueList.addAll(collection);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#addAll(int,java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections.list.SetUniqueList#size()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Iterator it = coll.iterator(); it.hasNext(); )
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.addAll(SetUniqueList.java:194) */
        setUniqueList.addAll(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll4() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        
        boolean actual = setUniqueList.addAll(0, arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll5() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:151)
            org.apache.commons.collections.list.SetUniqueList.add(SetUniqueList.java:133)
            org.apache.commons.collections.list.SetUniqueList.addAll(SetUniqueList.java:195) */
        setUniqueList.addAll(0, collection);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#set(int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.list.SetUniqueList#indexOf(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#set(int,java.lang.Object)}
 *  */
    @Test
    public void testSet_AbstractSerializableListDecoratorSet() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        Object actual = setUniqueList.set(0, null);
        
        Object expected = new Object();
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#set(int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.list.SetUniqueList#indexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: int pos = indexOf(object);
 *  */
    @Test
    public void testSet_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.set] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.list.AbstractListDecorator.getList(AbstractListDecorator.java:61)
            org.apache.commons.collections.list.AbstractListDecorator.indexOf(AbstractListDecorator.java:78)
            org.apache.commons.collections.list.SetUniqueList.set(SetUniqueList.java:217) */
        setUniqueList.set(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method set(int, java.lang.Object)
    
    @Test
    public void testSet1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        Integer integer = 0;
        collection.add(integer);
        collection.add(setUniqueList);
        collection.add(setUniqueList);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        Integer actual = ((Integer) setUniqueList.set(0, integer));
        
        assertEquals(integer, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(int, java.lang.Object)
    
    @Test
    public void testSet2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.set] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.apache.commons.collections.list.AbstractListDecorator.set(AbstractListDecorator.java:98)
            org.apache.commons.collections.list.SetUniqueList.set(SetUniqueList.java:218) */
        setUniqueList.set(0, null);
    }
    
    @Test
    public void testSet3() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        collection.add(object);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.set] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.set(SetUniqueList.java:226) */
        setUniqueList.set(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.removeAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#removeAll(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#removeAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean result = super.removeAll(coll);
 *  */
    @Test
    public void testRemoveAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.removeAll] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.AbstractSet.removeAll(AbstractSet.java:167)
            org.apache.commons.collections.collection.AbstractCollectionDecorator.removeAll(AbstractCollectionDecorator.java:124)
            org.apache.commons.collections.list.SetUniqueList.removeAll(SetUniqueList.java:243) */
        setUniqueList.removeAll(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAll(java.util.Collection)
    
    @Test
    public void testRemoveAll1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.removeAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.removeAll(SetUniqueList.java:244) */
        setUniqueList.removeAll(collection);
    }
    
    @Test
    public void testRemoveAll2() throws Throwable  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        Integer integer = 1;
        collection.add(integer);
        Integer integer1 = 0;
        collection.add(integer1);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        Object entrySet = createInstance("org.apache.commons.collections.map.AbstractHashedMap$EntrySet");
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.removeAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.AbstractHashedMap$EntrySet.size(AbstractHashedMap.java:817)
            java.base/java.util.AbstractSet.removeAll(AbstractSet.java:170)
            org.apache.commons.collections.collection.AbstractCollectionDecorator.removeAll(AbstractCollectionDecorator.java:124)
            org.apache.commons.collections.list.SetUniqueList.removeAll(SetUniqueList.java:243) */
        Class setUniqueListClazz = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class entrySetType = Class.forName("java.util.Collection");
        Method removeAllMethod = setUniqueListClazz.getDeclaredMethod("removeAll", entrySetType);
        removeAllMethod.setAccessible(true);
        java.lang.Object[] removeAllMethodArguments = new java.lang.Object[1];
        removeAllMethodArguments[0] = entrySet;
        try {
            removeAllMethod.invoke(setUniqueList, removeAllMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.retainAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.retainAll(coll);
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.retainAll] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.ArrayList.batchRemove(ArrayList.java:816)
            java.base/java.util.ArrayList.retainAll(ArrayList.java:811)
            org.apache.commons.collections.collection.AbstractCollectionDecorator.retainAll(AbstractCollectionDecorator.java:128)
            org.apache.commons.collections.list.SetUniqueList.retainAll(SetUniqueList.java:249) */
        setUniqueList.retainAll(null);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.retainAll(coll);
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException_1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.retainAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.retainAll(SetUniqueList.java:250) */
        setUniqueList.retainAll(collection);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection)
    
    @Test
    public void testRetainAll1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        Object object = createInstance("java.lang.Object");
        set.add(object);
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        
        boolean actual = setUniqueList.retainAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method retainAll(java.util.Collection)
    
    @Test
    public void testRetainAll2() throws Throwable  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        Integer integer = 0;
        set.add(integer);
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        Object subList = createInstance("java.util.ArrayList$SubList");
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.retainAll] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList$SubList.indexOf(ArrayList.java:1264)
            java.base/java.util.ArrayList$SubList.contains(ArrayList.java:1276)
            java.base/java.util.AbstractCollection.retainAll(AbstractCollection.java:403)
            org.apache.commons.collections.list.SetUniqueList.retainAll(SetUniqueList.java:250) */
        Class setUniqueListClazz = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class subListType = Class.forName("java.util.Collection");
        Method retainAllMethod = setUniqueListClazz.getDeclaredMethod("retainAll", subListType);
        retainAllMethod.setAccessible(true);
        java.lang.Object[] retainAllMethodArguments = new java.lang.Object[1];
        retainAllMethodArguments[0] = subList;
        try {
            retainAllMethod.invoke(setUniqueList, retainAllMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for retainAll
    
    public void testRetainAll_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#listIterator(int)}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#listIterator(int)}
 * @utbot.returnsFrom {@code return new SetListListIterator(super.listIterator(index), set);}
 *  */
    @Test
    public void testListIterator_AbstractSerializableListDecoratorListIterator() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        SetUniqueList.SetListListIterator actual = ((SetUniqueList.SetListListIterator) setUniqueList.listIterator(0));
        
        SetUniqueList.SetListListIterator expected = ((SetUniqueList.SetListListIterator) createInstance("org.apache.commons.collections.list.SetUniqueList$SetListListIterator"));
        setField(expected, "org.apache.commons.collections.list.SetUniqueList$SetListListIterator", "set", set);
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections.iterators.AbstractListIteratorDecorator", "iterator", iterator);
        
        Set expectedSet = expected.set;
        Set actualSet = actual.set;
        assertTrue(deepEquals(expectedSet, actualSet));
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        ListIterator expectedIterator = ((ListIterator) getFieldValue(expected, "org.apache.commons.collections.iterators.AbstractListIteratorDecorator", "iterator"));
        ListIterator actualIterator = ((ListIterator) getFieldValue(actual, "org.apache.commons.collections.iterators.AbstractListIteratorDecorator", "iterator"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new SetListListIterator(super.listIterator(index), set);
 *  */
    @Test
    public void testListIterator_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.listIterator] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.list.AbstractListDecorator.getList(AbstractListDecorator.java:61)
            org.apache.commons.collections.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:90)
            org.apache.commons.collections.list.SetUniqueList.listIterator(SetUniqueList.java:276) */
        setUniqueList.listIterator(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testListIterator_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.listIterator] produces [java.lang.IndexOutOfBoundsException: Index: 6, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.listIterator(ArrayList.java:923)
            org.apache.commons.collections.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:90)
            org.apache.commons.collections.list.SetUniqueList.listIterator(SetUniqueList.java:276) */
        setUniqueList.listIterator(6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#listIterator()}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#listIterator()}
 * @utbot.returnsFrom {@code return new SetListListIterator(super.listIterator(), set);}
 *  */
    @Test
    public void testListIterator_AbstractSerializableListDecoratorListIterator1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        SetUniqueList.SetListListIterator actual = ((SetUniqueList.SetListListIterator) setUniqueList.listIterator());
        
        SetUniqueList.SetListListIterator expected = ((SetUniqueList.SetListListIterator) createInstance("org.apache.commons.collections.list.SetUniqueList$SetListListIterator"));
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections.iterators.AbstractListIteratorDecorator", "iterator", iterator);
        
        Set actualSet = actual.set;
        assertNull(actualSet);
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        ListIterator expectedIterator = ((ListIterator) getFieldValue(expected, "org.apache.commons.collections.iterators.AbstractListIteratorDecorator", "iterator"));
        ListIterator actualIterator = ((ListIterator) getFieldValue(actual, "org.apache.commons.collections.iterators.AbstractListIteratorDecorator", "iterator"));
        
        Set finalSetUniqueListSet = setUniqueList.set;
        
        assertNull(finalSetUniqueListSet);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method listIterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#listIterator()}
 * @utbot.invokes {@link org.apache.commons.collections.list.AbstractSerializableListDecorator#listIterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new SetListListIterator(super.listIterator(), set);
 *  */
    @Test
    public void testListIterator_ThrowClassCastException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.listIterator] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.list.AbstractListDecorator.getList(AbstractListDecorator.java:61)
            org.apache.commons.collections.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:86)
            org.apache.commons.collections.list.SetUniqueList.listIterator(SetUniqueList.java:272) */
        setUniqueList.listIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.containsAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#containsAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Set#containsAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return set.containsAll(coll);}
 *  */
    @Test
    public void testContainsAll_SetContainsAll() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        ArrayList arrayList = new ArrayList();
        
        boolean actual = setUniqueList.containsAll(arrayList);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#containsAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Set#containsAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set.containsAll(coll);
 *  */
    @Test
    public void testContainsAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections.list.SetUniqueList.containsAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.SetUniqueList.containsAll(SetUniqueList.java:264) */
        setUniqueList.containsAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.decorate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decorate(java.util.List)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#decorate(java.util.List)}
 * @utbot.executesCondition {@code (list == null): False}
 * @utbot.executesCondition {@code (list.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return new SetUniqueList(list, new HashSet());}
 *  */
    @Test
    public void testDecorate_ListIsEmpty() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        SetUniqueList actual = SetUniqueList.decorate(arrayList);
        
        SetUniqueList expected = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet set = new HashSet();
        setField(expected, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", arrayList);
        
        Set expectedSet = expected.set;
        Set actualSet = actual.set;
        assertTrue(deepEquals(expectedSet, actualSet));
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method decorate(java.util.List)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#decorate(java.util.List)}
 * @utbot.executesCondition {@code (list == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: list == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDecorate_ThrowIllegalArgumentException() {
        SetUniqueList.decorate(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method decorate(java.util.List)
    
    @Test
    public void testDecorate1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[7];
        objectArray[0] = objectArray;
        Object object = new Object();
        objectArray[1] = object;
        objectArray[2] = object;
        objectArray[3] = object;
        objectArray[4] = object;
        objectArray[5] = object;
        objectArray[6] = object;
        arrayList.add(objectArray);
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(object);
        arrayList.add(object);
        
        SetUniqueList actual = SetUniqueList.decorate(arrayList);
        
        SetUniqueList expected = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        HashSet set = new HashSet();
        Object object1 = createInstance("java.lang.Object");
        set.add(object1);
        set.add(objectArray);
        setField(expected, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        setField(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection", arrayList);
        
        Set expectedSet = expected.set;
        Set actualSet = actual.set;
        assertTrue(deepEquals(expectedSet, actualSet));
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections.collection.AbstractCollectionDecorator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.SetUniqueList.asSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asSet()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#asSet()}
 * @utbot.invokes {@link org.apache.commons.collections.set.UnmodifiableSet#decorate(java.util.Set)}
 * @utbot.returnsFrom {@code return UnmodifiableSet.decorate(set);}
 *  */
    @Test
    public void testAsSet_UnmodifiableSetDecorate() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections.list.SetUniqueList", "set", set);
        
        Set actual = setUniqueList.asSet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asSet()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.SetUniqueList#asSet()}
 * @utbot.invokes {@link org.apache.commons.collections.set.UnmodifiableSet#decorate(java.util.Set)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableSet.decorate(set);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsSet_ThrowIllegalArgumentException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections.list.SetUniqueList"));
        
        setUniqueList.asSet();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields956010593441200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields956010593441200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass956010593449500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields956010593441200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass956010593449500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields956010593881800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields956010593881800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass956010593885500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields956010593881800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass956010593885500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


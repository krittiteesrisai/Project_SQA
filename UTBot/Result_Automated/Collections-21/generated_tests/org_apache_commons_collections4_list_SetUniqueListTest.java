package org.apache.commons.collections4.list;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.ArrayList;
import org.apache.commons.collections4.list.SetUniqueList.SetListIterator;
import java.util.Set;
import java.util.Iterator;
import org.apache.commons.collections4.list.SetUniqueList.SetListListIterator;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_collections4_list_SetUniqueListTest {
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#add(int,java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 *  */
    @Test
    public void testAdd_SetContains() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        
        setUniqueList.add(-255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: super.add(index, object);
 *  */
    @Test
    public void testAdd_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.add] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.add(AbstractListDecorator.java:71)
            org.apache.commons.collections4.list.SetUniqueList.add(SetUniqueList.java:160) */
        setUniqueList.add(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.add(index, object);
 *  */
    @Test
    public void testAdd_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.add] produces [java.lang.IndexOutOfBoundsException: Index: 6, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.apache.commons.collections4.list.AbstractListDecorator.add(AbstractListDecorator.java:71)
            org.apache.commons.collections4.list.SetUniqueList.add(SetUniqueList.java:160) */
        setUniqueList.add(6, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: set.contains(object) == false
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.add(SetUniqueList.java:159) */
        setUniqueList.add(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    @Test
    public void testAdd1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        Object object = new Object();
        
        setUniqueList.add(0, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(int, java.lang.Object)
    
    @Test
    public void testAdd2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        Character character = '\u0000';
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.AbstractListDecorator.add(AbstractListDecorator.java:71)
            org.apache.commons.collections4.list.SetUniqueList.add(SetUniqueList.java:160) */
        setUniqueList.add(0, character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#add(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.list.SetUniqueList#size()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final int sizeBefore = size();
 *  */
    @Test
    public void testAdd_ThrowClassCastException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.add] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:34)
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.size(AbstractCollectionDecorator.java:113)
            org.apache.commons.collections4.list.SetUniqueList.add(SetUniqueList.java:134) */
        setUniqueList.add(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(java.lang.Object)
    
    @Test
    public void testAdd3() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        collection.add(setUniqueList);
        collection.add(setUniqueList);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        Character character = '\u0000';
        
        boolean actual = setUniqueList.add(character);
        
        assertTrue(actual);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        collection.add(setUniqueList);
        collection.add(setUniqueList);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        boolean actual = setUniqueList.add(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#remove(int)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_SetRemove() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        Object actual = setUniqueList.remove(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final E result = super.remove(index);
 *  */
    @Test
    public void testRemove_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.remove] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.remove(AbstractListDecorator.java:99)
            org.apache.commons.collections4.list.SetUniqueList.remove(SetUniqueList.java:254) */
        setUniqueList.remove(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final E result = super.remove(index);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.apache.commons.collections4.list.AbstractListDecorator.remove(AbstractListDecorator.java:99)
            org.apache.commons.collections4.list.SetUniqueList.remove(SetUniqueList.java:254) */
        setUniqueList.remove(-1);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(int)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.remove(result);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.remove(SetUniqueList.java:255) */
        setUniqueList.remove(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (result): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_NotResult() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        
        boolean actual = setUniqueList.remove(((Object) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (result): True}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemove_Result() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        Integer integer = 0;
        set.add(integer);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        boolean actual = setUniqueList.remove(((Object) integer));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (result): True}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: super.remove(object);
 *  */
    @Test
    public void testRemove_ThrowClassCastException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        Integer integer = 0;
        set.add(integer);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.remove] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:34)
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.remove(AbstractCollectionDecorator.java:109)
            org.apache.commons.collections4.list.SetUniqueList.remove(SetUniqueList.java:247) */
        setUniqueList.remove(((Object) integer));
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#remove(java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean result = set.remove(object);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.remove(SetUniqueList.java:245) */
        setUniqueList.remove(((Object) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remove(java.lang.Object)
    
    @Test
    public void testRemove1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.remove(AbstractCollectionDecorator.java:109)
            org.apache.commons.collections4.list.SetUniqueList.remove(SetUniqueList.java:247) */
        setUniqueList.remove(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.clear
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#clear()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: super.clear();
 *  */
    @Test
    public void testClear_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.clear] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:34)
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.clear(AbstractCollectionDecorator.java:93)
            org.apache.commons.collections4.list.SetUniqueList.clear(SetUniqueList.java:293) */
        setUniqueList.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#clear()}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.clear] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.clear(SetUniqueList.java:294) */
        setUniqueList.clear();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clear()
    
    @Test
    public void testClear1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList collection = new ArrayList();
        java.lang.Object[] objectArray = {null};
        collection.add(objectArray);
        collection.add(setUniqueList);
        collection.add(setUniqueList);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        setUniqueList.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.subList
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subList(int, int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#subList(int,int)}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#subList(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<E> superSubList = super.subList(fromIndex, toIndex);
 *  */
    @Test
    public void testSubList_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.subList] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.subList(AbstractListDecorator.java:107)
            org.apache.commons.collections4.list.SetUniqueList.subList(SetUniqueList.java:330) */
        setUniqueList.subList(-255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subList(int, int)
    
    @Test
    public void testSubList1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.subList] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList(SetUniqueList.java:349)
            org.apache.commons.collections4.list.SetUniqueList.subList(SetUniqueList.java:331) */
        setUniqueList.subList(0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#iterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#iterator()}
 * @utbot.returnsFrom {@code return new SetListIterator<E>(super.iterator(), set);}
 *  */
    @Test
    public void testIterator_AbstractSerializableListDecoratorIterator() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        SetUniqueList.SetListIterator actual = ((SetUniqueList.SetListIterator) setUniqueList.iterator());
        
        SetUniqueList.SetListIterator expected = ((SetUniqueList.SetListIterator) createInstance("org.apache.commons.collections4.list.SetUniqueList$SetListIterator"));
        Object iterator = createInstance("java.util.ArrayList$Itr");
        setField(expected, "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator", "iterator", iterator);
        
        Set actualSet = actual.set;
        assertNull(actualSet);
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator", "iterator"));
        
        Set finalSetUniqueListSet = setUniqueList.set;
        
        assertNull(finalSetUniqueListSet);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#iterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#iterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new SetListIterator<E>(super.iterator(), set);
 *  */
    @Test
    public void testIterator_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.iterator] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:34)
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.iterator(AbstractCollectionDecorator.java:105)
            org.apache.commons.collections4.list.SetUniqueList.iterator(SetUniqueList.java:309) */
        setUniqueList.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#contains(java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return set.contains(object);}
 *  */
    @Test
    public void testContains_SetContains() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        
        boolean actual = setUniqueList.contains(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#contains(java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set.contains(object);
 *  */
    @Test
    public void testContains_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.contains] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.contains(SetUniqueList.java:299) */
        setUniqueList.contains(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#addAll(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.addAll(index, temp);
 *  */
    @Test
    public void testAddAll_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.addAll(AbstractListDecorator.java:75)
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:209) */
        setUniqueList.addAll(-255, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#addAll(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.addAll(index, temp);
 *  */
    @Test
    public void testAddAll_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 0]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.addAll(ArrayList.java:700)
            org.apache.commons.collections4.list.AbstractListDecorator.addAll(AbstractListDecorator.java:75)
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:209) */
        setUniqueList.addAll(-1, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#addAll(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final E e: coll)
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:204) */
        setUniqueList.addAll(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        HashSet hashSet = new HashSet();
        
        boolean actual = setUniqueList.addAll(0, hashSet);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAll(int, java.util.Collection)
    
    @Test
    public void testAddAll2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet hashSet = new HashSet();
        Integer integer = 0;
        hashSet.add(integer);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:205) */
        setUniqueList.addAll(0, hashSet);
    }
    
    @Test
    public void testAddAll3() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        set.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.AbstractListDecorator.addAll(AbstractListDecorator.java:75)
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:209) */
        setUniqueList.addAll(0, arrayList);
    }
    
    @Test
    public void testAddAll4() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        Integer integer = 0;
        set.add(integer);
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = object;
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.AbstractListDecorator.addAll(AbstractListDecorator.java:75)
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:209) */
        setUniqueList.addAll(0, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#addAll(java.util.Collection)}
 * @utbot.invokes {@link org.apache.commons.collections4.list.SetUniqueList#size()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return addAll(size(), coll);
 *  */
    @Test
    public void testAddAll_ThrowClassCastException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.addAll] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:34)
            org.apache.commons.collections4.collection.AbstractCollectionDecorator.size(AbstractCollectionDecorator.java:113)
            org.apache.commons.collections4.list.SetUniqueList.addAll(SetUniqueList.java:181) */
        setUniqueList.addAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.set
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final int pos = indexOf(object);
 *  */
    @Test
    public void testSet_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.set] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.indexOf(AbstractListDecorator.java:83)
            org.apache.commons.collections4.list.SetUniqueList.set(SetUniqueList.java:228) */
        setUniqueList.set(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: final E removed = super.set(index, object);
 *  */
    @Test
    public void testSet_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        Object object = createInstance("java.lang.Object");
        collection.add(object);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.set] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.apache.commons.collections4.list.AbstractListDecorator.set(AbstractListDecorator.java:103)
            org.apache.commons.collections4.list.SetUniqueList.set(SetUniqueList.java:229) */
        setUniqueList.set(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#set(int,java.lang.Object)}
 * @utbot.executesCondition {@code (pos != -1): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.remove(removed);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.set] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.set(SetUniqueList.java:237) */
        setUniqueList.set(0, integer);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#set(int,java.lang.Object)}
 * @utbot.executesCondition {@code (pos != -1): True}
 * @utbot.executesCondition {@code (pos != index): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: set.remove(removed);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.set] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.set(SetUniqueList.java:237) */
        setUniqueList.set(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.removeAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#removeAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRemoveAll_CollectionIterator() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = setUniqueList.removeAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#removeAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object name: coll)
 *  */
    @Test
    public void testRemoveAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.removeAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.removeAll(SetUniqueList.java:262) */
        setUniqueList.removeAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.retainAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#retainAll(java.util.Collection)}
 * @utbot.executesCondition {@code (setRetainAll.size() == set.size()): True}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRetainAll_SetRetainAllSizeEqualsSetSize() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList arrayList = new ArrayList();
        
        boolean actual = setUniqueList.retainAll(arrayList);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method retainAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#retainAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final Object next: coll)
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.retainAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.retainAll(SetUniqueList.java:271) */
        setUniqueList.retainAll(null);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#retainAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: setRetainAll.size() == set.size()
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException_1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.retainAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.retainAll(SetUniqueList.java:276) */
        setUniqueList.retainAll(arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#retainAll(java.util.Collection)}
 * @utbot.iterates iterate the loop {@code for(final Object next: coll)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: set.contains(next)
 *  */
    @Test
    public void testRetainAll_ThrowNullPointerException_2() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
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
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.retainAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.retainAll(SetUniqueList.java:272) */
        setUniqueList.retainAll(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#listIterator(int)}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#listIterator(int)}
 * @utbot.returnsFrom {@code return new SetListListIterator<E>(super.listIterator(index), set);}
 *  */
    @Test
    public void testListIterator_AbstractSerializableListDecoratorListIterator() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        SetUniqueList.SetListListIterator actual = ((SetUniqueList.SetListListIterator) setUniqueList.listIterator(0));
        
        SetUniqueList.SetListListIterator expected = ((SetUniqueList.SetListListIterator) createInstance("org.apache.commons.collections4.list.SetUniqueList$SetListListIterator"));
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator", "iterator", iterator);
        
        Set actualSet = actual.set;
        assertNull(actualSet);
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        ListIterator expectedIterator = ((ListIterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator", "iterator"));
        ListIterator actualIterator = ((ListIterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator", "iterator"));
        
        Set finalSetUniqueListSet = setUniqueList.set;
        
        assertNull(finalSetUniqueListSet);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new SetListListIterator<E>(super.listIterator(index), set);
 *  */
    @Test
    public void testListIterator_ThrowClassCastException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.listIterator] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:95)
            org.apache.commons.collections4.list.SetUniqueList.listIterator(SetUniqueList.java:319) */
        setUniqueList.listIterator(-255);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testListIterator_ThrowIndexOutOfBoundsException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.listIterator] produces [java.lang.IndexOutOfBoundsException: Index: 6, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.listIterator(ArrayList.java:923)
            org.apache.commons.collections4.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:95)
            org.apache.commons.collections4.list.SetUniqueList.listIterator(SetUniqueList.java:319) */
        setUniqueList.listIterator(6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#listIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#listIterator()}
 * @utbot.returnsFrom {@code return new SetListListIterator<E>(super.listIterator(), set);}
 *  */
    @Test
    public void testListIterator_AbstractSerializableListDecoratorListIterator1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        ArrayList collection = new ArrayList();
        collection.add(null);
        collection.add(null);
        collection.add(null);
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        SetUniqueList.SetListListIterator actual = ((SetUniqueList.SetListListIterator) setUniqueList.listIterator());
        
        SetUniqueList.SetListListIterator expected = ((SetUniqueList.SetListListIterator) createInstance("org.apache.commons.collections4.list.SetUniqueList$SetListListIterator"));
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator", "iterator", iterator);
        
        Set actualSet = actual.set;
        assertNull(actualSet);
        
        Object actualLast = actual.last;
        assertNull(actualLast);
        
        ListIterator expectedIterator = ((ListIterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator", "iterator"));
        ListIterator actualIterator = ((ListIterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator", "iterator"));
        
        Set finalSetUniqueListSet = setUniqueList.set;
        
        assertNull(finalSetUniqueListSet);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method listIterator()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#listIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.AbstractSerializableListDecorator#listIterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new SetListListIterator<E>(super.listIterator(), set);
 *  */
    @Test
    public void testListIterator_ThrowClassCastException1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet collection = new HashSet();
        setField(setUniqueList, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", collection);
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.listIterator] produces [java.lang.ClassCastException: class java.util.HashSet cannot be cast to class java.util.List (java.util.HashSet and java.util.List are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.list.AbstractListDecorator.decorated(AbstractListDecorator.java:65)
            org.apache.commons.collections4.list.AbstractListDecorator.listIterator(AbstractListDecorator.java:91)
            org.apache.commons.collections4.list.SetUniqueList.listIterator(SetUniqueList.java:314) */
        setUniqueList.listIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.containsAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#containsAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Set#containsAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return set.containsAll(coll);}
 *  */
    @Test
    public void testContainsAll_SetContainsAll() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        ArrayList arrayList = new ArrayList();
        
        boolean actual = setUniqueList.containsAll(arrayList);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#containsAll(java.util.Collection)}
 * @utbot.invokes {@link java.util.Set#containsAll(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return set.containsAll(coll);
 *  */
    @Test
    public void testContainsAll_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.containsAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.containsAll(SetUniqueList.java:304) */
        setUniqueList.containsAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.asSet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asSet()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#asSet()}
 * @utbot.invokes {@link org.apache.commons.collections4.set.UnmodifiableSet#unmodifiableSet(java.util.Set)}
 * @utbot.returnsFrom {@code return UnmodifiableSet.unmodifiableSet(set);}
 *  */
    @Test
    public void testAsSet_UnmodifiableSetUnmodifiableSet() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet set = new LinkedHashSet();
        setField(setUniqueList, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        
        Set actual = setUniqueList.asSet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asSet()
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#asSet()}
 * @utbot.invokes {@link org.apache.commons.collections4.set.UnmodifiableSet#unmodifiableSet(java.util.Set)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableSet.unmodifiableSet(set);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsSet_ThrowIllegalArgumentException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        setUniqueList.asSet();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.setUniqueList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUniqueList(java.util.List)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#setUniqueList(java.util.List)}
 * @utbot.executesCondition {@code (list.isEmpty()): True}
 * @utbot.returnsFrom {@code return new SetUniqueList<E>(list, new HashSet<E>());}
 *  */
    @Test
    public void testSetUniqueList_ListIsEmpty() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        SetUniqueList actual = SetUniqueList.setUniqueList(arrayList);
        
        SetUniqueList expected = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet set = new HashSet();
        setField(expected, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        setField(expected, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", arrayList);
        
        Set expectedSet = expected.set;
        Set actualSet = actual.set;
        assertTrue(deepEquals(expectedSet, actualSet));
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#setUniqueList(java.util.List)}
 * @utbot.executesCondition {@code (list.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link org.apache.commons.collections4.list.SetUniqueList#addAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return sl;}
 *  */
    @Test
    public void testSetUniqueList_NotListIsEmpty() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        
        SetUniqueList actual = SetUniqueList.setUniqueList(arrayList);
        
        SetUniqueList expected = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        HashSet set = new HashSet();
        set.add(null);
        setField(expected, "org.apache.commons.collections4.list.SetUniqueList", "set", set);
        setField(expected, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection", arrayList);
        
        Set expectedSet = expected.set;
        Set actualSet = actual.set;
        assertTrue(deepEquals(expectedSet, actualSet));
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections4.collection.AbstractCollectionDecorator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setUniqueList(java.util.List)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#setUniqueList(java.util.List)}
 * @utbot.executesCondition {@code (list == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: list == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetUniqueList_ThrowIllegalArgumentException() {
        SetUniqueList.setUniqueList(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createSetBasedOnList(java.util.Set, java.util.List)
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#createSetBasedOnList(java.util.Set,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: set.getClass().equals(HashSet.class)
 *  */
    @Test
    public void testCreateSetBasedOnList_ThrowNullPointerException() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList(SetUniqueList.java:349) */
        setUniqueList.createSetBasedOnList(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SetUniqueList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.list.SetUniqueList#createSetBasedOnList(java.util.Set,java.util.List)}
 * @utbot.executesCondition {@code (set.getClass().equals(HashSet.class)): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Class#newInstance()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subSet = set.getClass().newInstance();
 *  */
    @Test
    public void testCreateSetBasedOnList_ThrowNullPointerException_1() throws Exception  {
        SetUniqueList setUniqueList = ((SetUniqueList) createInstance("org.apache.commons.collections4.list.SetUniqueList"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList] produces [java.lang.NullPointerException]
            java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:335)
            org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList(SetUniqueList.java:360) */
        setUniqueList.createSetBasedOnList(linkedHashSet, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields948129768329900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields948129768329900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass948129768336500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948129768329900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948129768336500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields948129769144200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields948129769144200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass948129769145900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948129769144200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948129769145900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


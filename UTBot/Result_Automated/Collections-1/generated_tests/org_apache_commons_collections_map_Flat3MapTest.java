package org.apache.commons.collections.map;

import org.junit.Test;
import org.apache.commons.collections.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections.map.IdentityMap.IdentityEntry;
import org.apache.commons.collections.map.AbstractReferenceMap.ReferenceEntry;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import org.apache.commons.collections.map.Flat3Map.Values;
import org.apache.commons.collections.map.AbstractReferenceMap.ReferenceValues;
import java.util.Map;
import java.lang.ref.ReferenceQueue;
import org.apache.commons.collections.map.AbstractLinkedMap.LinkEntry;
import java.lang.ref.SoftReference;
import java.lang.ref.Reference;
import java.util.Set;
import java.util.LinkedHashSet;
import org.apache.commons.collections.map.AbstractHashedMap.EntrySet;
import org.apache.commons.collections.map.AbstractReferenceMap.ReferenceEntrySet;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.io.ObjectStreamClass;
import java.io.ObjectOutputStream;
import org.apache.commons.collections.map.AbstractHashedMap.KeySet;
import org.apache.commons.collections.map.AbstractReferenceMap.ReferenceKeySet;
import java.util.Collection;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.iterators.EmptyMapIterator;
import org.apache.commons.collections.OrderedMapIterator;
import org.apache.commons.collections.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections.map.Flat3Map.FlatMapIterator;
import org.apache.commons.collections.map.AbstractHashedMap.HashMapIterator;
import org.apache.commons.collections.map.AbstractLinkedMap.LinkMapIterator;
import org.apache.commons.collections.map.AbstractReferenceMap.ReferenceMapIterator;
import jdk.internal.ref.CleanerImpl.PhantomCleanableRef;
import jdk.internal.ref.CleanerImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_collections_map_Flat3MapTest {
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): True}
 *  */
    @Test
    public void testRemove_SizeEqualsZero() {
        Flat3Map flat3Map = new Flat3Map();
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 *  */
    @Test
    public void testRemove_Hash1NotEqualsHashCode() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer integer = -1;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 *  */
    @Test
    public void testRemove_SwitchSizeCase1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -248);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): False}
 *  */
    @Test
    public void testRemove_Key1NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key1);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): False}
 *  */
    @Test
    public void testRemove_Key1NotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key1);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key1 == null): False}
 *  */
    @Test
    public void testRemove_Key1NotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return delegateMap.remove(key);}
 *  */
    @Test
    public void testRemove_DelegateMapNotEqualsNull() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
            delegateMap.data = data;
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            Object actual = flat3Map.remove(null);
            
            assertNull(actual);
            
            AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
            
            assertNull(finalFlat3MapDelegateMapData0);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): False}
 *  */
    @Test
    public void testRemove_NotKeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 *  */
    @Test
    public void testRemove_Hash1NotEqualsHashCode_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = -1;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key3)): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_KeyEquals_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer key3 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        short[] value3 = {};
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value3);
        Integer integer = 0;
        
        short[] actual = ((short[]) flat3Map.remove(integer));
        
        assertArrayEquals(value3, actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        Object finalFlat3MapValue3 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3");
        
        assertEquals(2, finalFlat3MapSize);
        
        assertNull(finalFlat3MapValue3);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_KeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        
        assertEquals(0, finalFlat3MapSize);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_KeyEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        
        assertEquals(1, finalFlat3MapSize);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_Key3EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash3 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3"));
        
        assertEquals(2, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash3);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_Key2EqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash2 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2"));
        
        assertEquals(1, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash2);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_Key1EqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash1 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1"));
        
        assertEquals(0, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash1);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_KeyEquals_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        byte[] value2 = {};
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2", value2);
        Integer integer = 0;
        
        Object initialFlat3MapValue1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1");
        
        byte[] actual = ((byte[]) flat3Map.remove(integer));
        
        org.junit.Assert.assertArrayEquals(value2, actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash1 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1"));
        int finalFlat3MapHash2 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2"));
        Object finalFlat3MapValue1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1");
        Object finalFlat3MapValue2 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2");
        
        assertFalse(initialFlat3MapValue1 == finalFlat3MapValue1);
        
        assertEquals(1, finalFlat3MapSize);
        
        assertEquals(-1, finalFlat3MapHash1);
        
        assertEquals(0, finalFlat3MapHash2);
        
        assertNull(finalFlat3MapValue2);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_Key2EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        Object initialFlat3MapKey2 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2");
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        Object finalFlat3MapKey2 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2");
        Object finalFlat3MapKey3 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3");
        
        assertFalse(initialFlat3MapKey2 == finalFlat3MapKey2);
        
        assertEquals(2, finalFlat3MapSize);
        
        assertNull(finalFlat3MapKey3);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_Key1EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key2 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key2);
        
        Object initialFlat3MapKey1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1");
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        Object finalFlat3MapKey1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1");
        
        assertFalse(initialFlat3MapKey1 == finalFlat3MapKey1);
        
        assertEquals(2, finalFlat3MapSize);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_Key1EqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Object key2 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        
        Object initialFlat3MapKey1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1");
        
        Object actual = flat3Map.remove(null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        Object finalFlat3MapKey1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1");
        Object finalFlat3MapKey2 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2");
        
        assertFalse(initialFlat3MapKey1 == finalFlat3MapKey1);
        
        assertEquals(1, finalFlat3MapSize);
        
        assertNull(finalFlat3MapKey2);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_KeyEquals_4() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash2 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2"));
        int finalFlat3MapHash3 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3"));
        
        assertEquals(2, finalFlat3MapSize);
        
        assertEquals(-1, finalFlat3MapHash2);
        
        assertEquals(0, finalFlat3MapHash3);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testRemove_KeyEquals_5() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash1 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1"));
        int finalFlat3MapHash3 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3"));
        
        assertEquals(2, finalFlat3MapSize);
        
        assertEquals(-1, finalFlat3MapHash1);
        
        assertEquals(0, finalFlat3MapHash3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method remove(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (delegateMap != null): False},
    ///     {@code (size == 0): False},
    ///     {@code (key == null): False}
    /// return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): False}
 *  */
    @Test
    public void testRemove_SizeLessOrEqualZero() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -255);
        byte[] byteArray = {};
        
        Object actual = flat3Map.remove(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.activatesSwitch {@code switch(size)}
 *  */
    @Test
    public void testRemove_SwitchSize() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 4);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 *  */
    @Test
    public void testRemove_Hash1NotEqualsHashCode_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", 1);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#remove(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return delegateMap.remove(key);
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
            delegateMap.data = data;
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            /* This test fails because method [org.apache.commons.collections.map.Flat3Map.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1482703799 out of bounds for length 0]
                org.apache.commons.collections.map.AbstractHashedMap.remove(AbstractHashedMap.java:319)
                org.apache.commons.collections.map.Flat3Map.remove(Flat3Map.java:401) */
            flat3Map.remove(null);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove(java.lang.Object)
    
    @Test
    public void testRemove1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Character character = '\u0000';
        
        Object actual = flat3Map.remove(character);
        
        assertNull(actual);
    }
    
    @Test
    public void testRemove2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractHashedMap delegateMap = ((AbstractHashedMap) createInstance("org.apache.commons.collections.map.AbstractHashedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null, null, null, null, null, null, null, null, null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Character character = '\u0000';
        
        Object actual = flat3Map.remove(character);
        
        assertNull(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap1DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData1 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap1DelegateMapData, 1));
        AbstractHashedMap flat3MapDelegateMap2 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap2DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap2, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData2 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap2DelegateMapData, 2));
        AbstractHashedMap flat3MapDelegateMap3 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap3DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap3, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData3 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap3DelegateMapData, 3));
        AbstractHashedMap flat3MapDelegateMap4 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap4DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap4, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData4 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap4DelegateMapData, 4));
        AbstractHashedMap flat3MapDelegateMap5 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap5DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap5, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData5 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap5DelegateMapData, 5));
        AbstractHashedMap flat3MapDelegateMap6 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap6DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap6, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData6 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap6DelegateMapData, 6));
        AbstractHashedMap flat3MapDelegateMap7 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap7DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap7, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData7 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap7DelegateMapData, 7));
        AbstractHashedMap flat3MapDelegateMap8 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap8DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap8, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData8 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap8DelegateMapData, 8));
        
        assertNull(finalFlat3MapDelegateMapData0);
        
        assertNull(finalFlat3MapDelegateMapData1);
        
        assertNull(finalFlat3MapDelegateMapData2);
        
        assertNull(finalFlat3MapDelegateMapData3);
        
        assertNull(finalFlat3MapDelegateMapData4);
        
        assertNull(finalFlat3MapDelegateMapData5);
        
        assertNull(finalFlat3MapDelegateMapData6);
        
        assertNull(finalFlat3MapDelegateMapData7);
        
        assertNull(finalFlat3MapDelegateMapData8);
    }
    
    @Test
    public void testRemove3() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            CaseInsensitiveMap delegateMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null, null, null, null, null, null, null, null, null};
            delegateMap.data = data;
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            Object actual = flat3Map.remove(null);
            
            assertNull(actual);
            
            AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
            AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap1DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData1 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap1DelegateMapData, 1));
            AbstractHashedMap flat3MapDelegateMap2 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap2DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap2, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData2 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap2DelegateMapData, 2));
            AbstractHashedMap flat3MapDelegateMap3 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap3DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap3, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData3 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap3DelegateMapData, 3));
            AbstractHashedMap flat3MapDelegateMap4 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap4DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap4, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData4 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap4DelegateMapData, 4));
            AbstractHashedMap flat3MapDelegateMap5 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap5DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap5, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData5 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap5DelegateMapData, 5));
            AbstractHashedMap flat3MapDelegateMap6 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap6DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap6, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData6 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap6DelegateMapData, 6));
            AbstractHashedMap flat3MapDelegateMap7 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap7DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap7, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData7 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap7DelegateMapData, 7));
            AbstractHashedMap flat3MapDelegateMap8 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap8DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap8, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData8 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap8DelegateMapData, 8));
            
            assertNull(finalFlat3MapDelegateMapData0);
            
            assertNull(finalFlat3MapDelegateMapData1);
            
            assertNull(finalFlat3MapDelegateMapData2);
            
            assertNull(finalFlat3MapDelegateMapData3);
            
            assertNull(finalFlat3MapDelegateMapData4);
            
            assertNull(finalFlat3MapDelegateMapData5);
            
            assertNull(finalFlat3MapDelegateMapData6);
            
            assertNull(finalFlat3MapDelegateMapData7);
            
            assertNull(finalFlat3MapDelegateMapData8);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    
    @Test
    public void testRemove4() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer integer = 0;
        
        Object actual = flat3Map.remove(integer);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remove(java.lang.Object)
    
    @Test
    public void testRemove5() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        CaseInsensitiveMap delegateMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.AbstractHashedMap.remove(AbstractHashedMap.java:318)
            org.apache.commons.collections.map.Flat3Map.remove(Flat3Map.java:401) */
        flat3Map.remove(integer);
    }
    
    @Test
    public void testRemove6() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = 0;
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.AbstractHashedMap.remove(AbstractHashedMap.java:318)
            org.apache.commons.collections.map.Flat3Map.remove(Flat3Map.java:401) */
        flat3Map.remove(integer);
    }
    
    @Test
    public void testRemove7() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.AbstractHashedMap.remove(AbstractHashedMap.java:318)
            org.apache.commons.collections.map.Flat3Map.remove(Flat3Map.java:401) */
        flat3Map.remove(object);
    }
    
    @Test
    public void testRemove8() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            /* This test fails because method [org.apache.commons.collections.map.Flat3Map.remove] produces [java.lang.NullPointerException]
                org.apache.commons.collections.map.AbstractHashedMap.remove(AbstractHashedMap.java:318)
                org.apache.commons.collections.map.Flat3Map.remove(Flat3Map.java:401) */
            flat3Map.remove(null);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method get(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.get(key);}
 *  */
    @Test
    public void testGet_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[10];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        identityEntry.hashCode = 17;
        Integer key = 268960770;
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "key", key);
        int[] value = {};
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[1] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        int[] actual = ((int[]) flat3Map.get(key));
        
        org.junit.Assert.assertArrayEquals(value, actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap1DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData2 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap1DelegateMapData, 2));
        AbstractHashedMap flat3MapDelegateMap2 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap2DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap2, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData3 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap2DelegateMapData, 3));
        AbstractHashedMap flat3MapDelegateMap3 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap3DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap3, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData4 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap3DelegateMapData, 4));
        AbstractHashedMap flat3MapDelegateMap4 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap4DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap4, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData5 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap4DelegateMapData, 5));
        AbstractHashedMap flat3MapDelegateMap5 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap5DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap5, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData6 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap5DelegateMapData, 6));
        AbstractHashedMap flat3MapDelegateMap6 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap6DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap6, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData7 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap6DelegateMapData, 7));
        AbstractHashedMap flat3MapDelegateMap7 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap7DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap7, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData8 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap7DelegateMapData, 8));
        AbstractHashedMap flat3MapDelegateMap8 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap8DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap8, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData9 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap8DelegateMapData, 9));
        
        assertNull(finalFlat3MapDelegateMapData0);
        
        assertNull(finalFlat3MapDelegateMapData2);
        
        assertNull(finalFlat3MapDelegateMapData3);
        
        assertNull(finalFlat3MapDelegateMapData4);
        
        assertNull(finalFlat3MapDelegateMapData5);
        
        assertNull(finalFlat3MapDelegateMapData6);
        
        assertNull(finalFlat3MapDelegateMapData7);
        
        assertNull(finalFlat3MapDelegateMapData8);
        
        assertNull(finalFlat3MapDelegateMapData9);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.get(key);}
 *  */
    @Test
    public void testGet_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        int[] intArray = {};
        
        Object actual = flat3Map.get(intArray);
        
        assertNull(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_SwitchSizeCase1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 8);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.get(key);}
 *  */
    @Test
    public void testGet_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = -841567991;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.get(key);}
 *  */
    @Test
    public void testGet_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[12];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        AbstractReferenceMap.ReferenceEntry next = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        next.hashCode = 8645;
        Integer key = 513;
        setField(next, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "key", key);
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "next", next);
        referenceEntry.hashCode = -4177981;
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = -134480386;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap1DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData2 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap1DelegateMapData, 2));
        AbstractHashedMap flat3MapDelegateMap2 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap2DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap2, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData3 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap2DelegateMapData, 3));
        AbstractHashedMap flat3MapDelegateMap3 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap3DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap3, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData4 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap3DelegateMapData, 4));
        AbstractHashedMap flat3MapDelegateMap4 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap4DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap4, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData5 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap4DelegateMapData, 5));
        AbstractHashedMap flat3MapDelegateMap5 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap5DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap5, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData6 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap5DelegateMapData, 6));
        AbstractHashedMap flat3MapDelegateMap6 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap6DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap6, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData7 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap6DelegateMapData, 7));
        AbstractHashedMap flat3MapDelegateMap7 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap7DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap7, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData8 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap7DelegateMapData, 8));
        AbstractHashedMap flat3MapDelegateMap8 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap8DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap8, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData9 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap8DelegateMapData, 9));
        AbstractHashedMap flat3MapDelegateMap9 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap9DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap9, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData10 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap9DelegateMapData, 10));
        AbstractHashedMap flat3MapDelegateMap10 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap10DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap10, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData11 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap10DelegateMapData, 11));
        
        assertNull(finalFlat3MapDelegateMapData0);
        
        assertNull(finalFlat3MapDelegateMapData2);
        
        assertNull(finalFlat3MapDelegateMapData3);
        
        assertNull(finalFlat3MapDelegateMapData4);
        
        assertNull(finalFlat3MapDelegateMapData5);
        
        assertNull(finalFlat3MapDelegateMapData6);
        
        assertNull(finalFlat3MapDelegateMapData7);
        
        assertNull(finalFlat3MapDelegateMapData8);
        
        assertNull(finalFlat3MapDelegateMapData9);
        
        assertNull(finalFlat3MapDelegateMapData10);
        
        assertNull(finalFlat3MapDelegateMapData11);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_NotKeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -252);
        byte[] key2 = {};
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 1;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.get(key);}
 *  */
    @Test
    public void testGet_DelegateMapNotEqualsNull_4() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
            delegateMap.data = data;
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            Object actual = flat3Map.get(null);
            
            assertNull(actual);
            
            AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
            AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
            
            assertNull(finalFlat3MapDelegateMapData0);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key3)): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_Hash2NotEqualsHashCode() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer integer = -1;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key3)): True}
 * @utbot.returnsFrom {@code return value3;}
 *  */
    @Test
    public void testGet_KeyEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        Integer key3 = -255;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        byte[] value3 = {};
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value3);
        Integer integer = -255;
        
        byte[] actual = ((byte[]) flat3Map.get(integer));
        
        org.junit.Assert.assertArrayEquals(value3, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_Key1NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key1);
        Object key3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): True}
 * @utbot.returnsFrom {@code return value2;}
 *  */
    @Test
    public void testGet_KeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 0;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 2}
 * @utbot.returnsFrom {@code return value2;}
 *  */
    @Test
    public void testGet_SwitchSizeCase2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): True}
 * @utbot.returnsFrom {@code return value3;}
 *  */
    @Test
    public void testGet_Key3EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return value1;}
 *  */
    @Test
    public void testGet_SwitchSizeCase1_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.returnsFrom {@code return value2;}
 *  */
    @Test
    public void testGet_Key2EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.returnsFrom {@code return value1;}
 *  */
    @Test
    public void testGet_Key1EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key2 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Object key3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        Object actual = flat3Map.get(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method get(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (delegateMap != null): False},
    ///     {@code (key == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_SizeLessOrEqualZero() {
        Flat3Map flat3Map = new Flat3Map();
        byte[] byteArray = {};
        
        Object actual = flat3Map.get(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.activatesSwitch {@code switch(size)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_SwitchSize() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 16);
        Integer integer = 0;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_Hash1NotEqualsHashCode() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", 4);
        Integer integer = 1;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_SwitchSizeCase1_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", 1);
        Integer integer = 0;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet_NotKeyEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        Integer integer = 0;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.returnsFrom {@code return value1;}
 *  */
    @Test
    public void testGet_KeyEquals_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        Object actual = flat3Map.get(integer);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#get(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return delegateMap.get(key);
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = -2048893143;
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index 389512972 out of bounds for length 0]
            org.apache.commons.collections.map.AbstractHashedMap.get(AbstractHashedMap.java:182)
            org.apache.commons.collections.map.Flat3Map.get(Flat3Map.java:129) */
        flat3Map.get(integer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 *  */
    @Test
    public void testPut_KeyNotEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Flat3Map flat3Map = new Flat3Map();
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        
        assertEquals(1, finalFlat3MapSize);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_KeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_Hash2NotEqualsHashCode() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_Key2EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_Key3EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_Key1EqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 *  */
    @Test
    public void testPut_KeyEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash1 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1"));
        
        assertEquals(1, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash1);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_KeyEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_KeyEquals_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key3)): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_KeyEquals_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer key3 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_Key2EqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_Key1EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key2 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key2);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key1 == null): False}
 * @utbot.executesCondition {@code (key == null): True}
 *  */
    @Test
    public void testPut_KeyEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash2 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2"));
        
        assertEquals(2, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash2);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 2}
 *  */
    @Test
    public void testPut_KeyEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key1);
        
        Object actual = flat3Map.put(null, null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash3 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3"));
        
        assertEquals(3, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash3);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 * @utbot.returnsFrom {@code return old;}
 *  */
    @Test
    public void testPut_NotKeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 *  */
    @Test
    public void testPut_KeyNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Integer integer = 0;
        
        Object actual = flat3Map.put(integer, null);
        
        assertNull(actual);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        
        assertEquals(2, finalFlat3MapSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegateMap.put(key, value);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPut_ThrowNullPointerException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        short[] shortArray = {};
        
        flat3Map.put(shortArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegateMap.put(key, value);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPut_ThrowNullPointerException_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        flat3Map.put(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return delegateMap.put(key, value);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        short[][] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1732561477 out of bounds for length 0]
            org.apache.commons.collections.map.AbstractHashedMap.put(AbstractHashedMap.java:273)
            org.apache.commons.collections.map.Flat3Map.put(Flat3Map.java:257) */
        flat3Map.put(shortArray, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method put(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.Flat3Map}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#put(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testPut() {
        Flat3Map flat3Map = new Flat3Map();
        Object object = new Object();
        Object object1 = new Object();
        flat3Map.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        flat3Map.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        flat3Map.put(object4, object5);
        Object object6 = new Object();
        Object object7 = new Object();
        
        Object actual = flat3Map.put(object6, object7);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.equals(obj);}
 *  */
    @Test
    public void testEquals_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.equals(delegateMap);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (obj instanceof Map == false): True}
 *  */
    @Test
    public void testEquals_ObjInstanceOfMapEqualsFalse() {
        Flat3Map flat3Map = new Flat3Map();
        
        boolean actual = flat3Map.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() {
        Flat3Map flat3Map = new Flat3Map();
        
        boolean actual = flat3Map.equals(flat3Map);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.equals(obj);}
 *  */
    @Test
    public void testEquals_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (obj instanceof Map == false): False}
 * @utbot.executesCondition {@code (size != other.size()): False}
 * @utbot.executesCondition {@code (size > 0): False}
 *  */
    @Test
    public void testEquals_SizeLessOrEqualZero() {
        Flat3Map flat3Map = new Flat3Map();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        boolean actual = flat3Map.equals(linkedHashMap);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.equals(obj);}
 *  */
    @Test
    public void testEquals_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        delegateMap.size = 1;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        boolean actual = flat3Map.equals(linkedHashMap);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (obj instanceof Map == false): False}
 * @utbot.executesCondition {@code (size != other.size()): True}
 *  */
    @Test
    public void testEquals_SizeNotEqualsOtherSize() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        boolean actual = flat3Map.equals(linkedHashMap);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#toString()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): True}
 * @utbot.returnsFrom {@code return "{}";}
 *  */
    @Test
    public void testToString_SizeEqualsZero() {
        Flat3Map flat3Map = new Flat3Map();
        
        String actual = flat3Map.toString();
        
        String expected = "{}";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#toString()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#toString()}
 * @utbot.returnsFrom {@code return delegateMap.toString();}
 *  */
    @Test
    public void testToString_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        String actual = flat3Map.toString();
        
        String expected = "{}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", flat3Map);
        
        String actual = flat3Map.toString();
        
        String expected = "{(this Map)=null,null=null,null=null}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", flat3Map);
        
        String actual = flat3Map.toString();
        
        String expected = "{(this Map)=null,null=null}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", flat3Map);
        
        String actual = flat3Map.toString();
        
        String expected = "{(this Map)=null}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer key3 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        String actual = flat3Map.toString();
        
        String expected = "{0=null,null=null,null=null}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Character key1 = '\u0100';
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        
        String actual = flat3Map.toString();
        
        String expected = "{\u0100=null}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer key2 = Integer.MIN_VALUE;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        
        String actual = flat3Map.toString();
        
        String expected = "{-2147483648=null,null=null}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString7() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        HashedMap delegateMap = ((HashedMap) createInstance("org.apache.commons.collections.map.HashedMap"));
        delegateMap.size = 1;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.toString] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.AbstractHashedMap$HashIterator.<init>(AbstractHashedMap.java:1096)
            org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator.<init>(AbstractHashedMap.java:743)
            org.apache.commons.collections.map.AbstractHashedMap.mapIterator(AbstractHashedMap.java:734)
            org.apache.commons.collections.map.AbstractHashedMap.toString(AbstractHashedMap.java:1310)
            org.apache.commons.collections.map.Flat3Map.toString(Flat3Map.java:1105) */
        flat3Map.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.values
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method values()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#values()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.returnsFrom {@code return new Values(this);}
 *  */
    @Test
    public void testValues_DelegateMapEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Flat3Map flat3Map = new Flat3Map();
        
        Flat3Map.Values actual = ((Flat3Map.Values) flat3Map.values());
        
        Flat3Map.Values expected = new Flat3Map.Values(flat3Map);
        
        Flat3Map expectedParent = ((Flat3Map) getFieldValue(expected, "org.apache.commons.collections.map.Flat3Map$Values", "parent"));
        Flat3Map actualParent = ((Flat3Map) getFieldValue(actual, "org.apache.commons.collections.map.Flat3Map$Values", "parent"));
        // org.apache.commons.collections.map.Flat3Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#values()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.values();}
 *  */
    @Test
    public void testValues_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.Values values = ((org.apache.commons.collections.map.AbstractHashedMap.Values) createInstance("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        delegateMap.values = values;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        org.apache.commons.collections.map.AbstractHashedMap.Values actual = ((org.apache.commons.collections.map.AbstractHashedMap.Values) flat3Map.values());
        
        org.apache.commons.collections.map.AbstractHashedMap.Values expected = new org.apache.commons.collections.map.AbstractHashedMap.Values(null);
        
        AbstractHashedMap actualParent = actual.parent;
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#values()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.values();}
 *  */
    @Test
    public void testValues_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        org.apache.commons.collections.map.AbstractHashedMap.Values values = ((org.apache.commons.collections.map.AbstractHashedMap.Values) createInstance("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        delegateMap.values = values;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        org.apache.commons.collections.map.AbstractHashedMap.Values actual = ((org.apache.commons.collections.map.AbstractHashedMap.Values) flat3Map.values());
        
        org.apache.commons.collections.map.AbstractHashedMap.Values expected = new org.apache.commons.collections.map.AbstractHashedMap.Values(null);
        
        AbstractHashedMap actualParent = actual.parent;
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#values()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.values();}
 *  */
    @Test
    public void testValues_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.Values initialFlat3MapDelegateMapValues = ((org.apache.commons.collections.map.AbstractHashedMap.Values) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "values"));
        
        org.apache.commons.collections.map.AbstractHashedMap.Values actual = ((org.apache.commons.collections.map.AbstractHashedMap.Values) flat3Map.values());
        
        AbstractLinkedMap abstractLinkedMap = new AbstractLinkedMap();
        org.apache.commons.collections.map.AbstractHashedMap.Values expected = new org.apache.commons.collections.map.AbstractHashedMap.Values(abstractLinkedMap);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.Values finalFlat3MapDelegateMapValues = ((org.apache.commons.collections.map.AbstractHashedMap.Values) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "values"));
        
        assertFalse(initialFlat3MapDelegateMapValues == finalFlat3MapDelegateMapValues);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#values()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.values();}
 *  */
    @Test
    public void testValues_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.Values initialFlat3MapDelegateMapValues = ((org.apache.commons.collections.map.AbstractHashedMap.Values) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "values"));
        
        AbstractReferenceMap.ReferenceValues actual = ((AbstractReferenceMap.ReferenceValues) flat3Map.values());
        
        AbstractReferenceMap.ReferenceValues expected = new AbstractReferenceMap.ReferenceValues(delegateMap);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.Values finalFlat3MapDelegateMapValues = ((org.apache.commons.collections.map.AbstractHashedMap.Values) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "values"));
        
        assertFalse(initialFlat3MapDelegateMapValues == finalFlat3MapDelegateMapValues);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.activatesSwitch {@code switch(size)}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_SwitchSize() {
        Flat3Map flat3Map = new Flat3Map();
        
        int actual = flat3Map.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.executesCondition {@code (value1 == null): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_Value1EqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.executesCondition {@code (value1 == null): False}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_Value1NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        Integer value1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1", value1);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.executesCondition {@code (value2 == null): True}
 * @utbot.executesCondition {@code (value1 == null): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_Value1EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.executesCondition {@code (value2 == null): False}
 * @utbot.executesCondition {@code (value1 == null): True}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_Value2NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        Integer value2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2", value2);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.executesCondition {@code (value3 == null): True}
 * @utbot.executesCondition {@code (value2 == null): True}
 * @utbot.executesCondition {@code (value1 == null): True}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_Value3EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
 * @utbot.executesCondition {@code (value3 == null): False}
 * @utbot.executesCondition {@code (value2 == null): True}
 * @utbot.executesCondition {@code (value1 == null): True}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_Value3NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        Integer value3 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value3);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.Flat3Map}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#hashCode()}
     */
    @Test
    public void testHashCode() {
        Flat3Map flat3Map = new Flat3Map();
        Object object = new Object();
        Object object1 = new Object();
        flat3Map.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        flat3Map.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        flat3Map.put(object4, object5);
        
        int actual = flat3Map.hashCode();
        
        assertEquals(2089019208, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() {
        Flat3Map flat3Map = new Flat3Map();
        
        Map actual = ((Map) flat3Map.clone());
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clear()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 *  */
    @Test
    public void testClear_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        flat3Map.clear();
        
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertNull(finalFlat3MapDelegateMap);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clear()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 *  */
    @Test
    public void testClear_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        flat3Map.clear();
        
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertNull(finalFlat3MapDelegateMap);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clear()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 *  */
    @Test
    public void testClear_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        flat3Map.clear();
        
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertNull(finalFlat3MapDelegateMap);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clear()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 *  */
    @Test
    public void testClear_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        AbstractLinkedMap.LinkEntry header = ((AbstractLinkedMap.LinkEntry) createInstance("org.apache.commons.collections.map.AbstractLinkedMap$LinkEntry"));
        delegateMap.header = header;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        flat3Map.clear();
        
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertNull(finalFlat3MapDelegateMap);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clear()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 *  */
    @Test
    public void testClear_DelegateMapEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -255);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        
        flat3Map.clear();
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash1 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1"));
        int finalFlat3MapHash2 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2"));
        int finalFlat3MapHash3 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3"));
        
        assertEquals(0, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash1);
        
        assertEquals(0, finalFlat3MapHash2);
        
        assertEquals(0, finalFlat3MapHash3);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#clear()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceIdentityMap delegateMap = ((ReferenceIdentityMap) createInstance("org.apache.commons.collections.map.ReferenceIdentityMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        SoftReference head = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.clear] produces [java.lang.NullPointerException] */
        flat3Map.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero_1() {
        Flat3Map flat3Map = new Flat3Map();
        
        boolean actual = flat3Map.isEmpty();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        LinkedMap delegateMap = ((LinkedMap) createInstance("org.apache.commons.collections.map.LinkedMap"));
        delegateMap.size = 1;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.isEmpty();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -255);
        
        boolean actual = flat3Map.isEmpty();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        delegateMap.size = 1;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.isEmpty();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsEmpty_ThrowClassCastException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceIdentityMap delegateMap = ((ReferenceIdentityMap) createInstance("org.apache.commons.collections.map.ReferenceIdentityMap"));
        Object queue = createInstance("java.lang.ref.ReferenceQueue$Null");
        Object lock = createInstance("java.lang.ref.ReferenceQueue$Lock");
        setField(queue, "java.lang.ref.ReferenceQueue", "lock", lock);
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 1);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[12];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.keyType = 1;
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        AbstractHashedMap.HashEntry next = ((AbstractHashedMap.HashEntry) createInstance("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        referenceEntry.next = next;
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.isEmpty] produces [java.lang.ClassCastException: class org.apache.commons.collections.map.AbstractHashedMap$HashEntry cannot be cast to class org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry (org.apache.commons.collections.map.AbstractHashedMap$HashEntry and org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:378)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:359)
            org.apache.commons.collections.map.AbstractReferenceMap.purgeBeforeRead(AbstractReferenceMap.java:336)
            org.apache.commons.collections.map.AbstractReferenceMap.size(AbstractReferenceMap.java:178)
            org.apache.commons.collections.map.Flat3Map.size(Flat3Map.java:165)
            org.apache.commons.collections.map.Flat3Map.isEmpty(Flat3Map.java:176) */
        flat3Map.isEmpty();
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", -1);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.isEmpty] produces [java.lang.NullPointerException]
            java.base/java.lang.ref.ReferenceQueue.poll(ReferenceQueue.java:119)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:357)
            org.apache.commons.collections.map.AbstractReferenceMap.purgeBeforeRead(AbstractReferenceMap.java:336)
            org.apache.commons.collections.map.AbstractReferenceMap.size(AbstractReferenceMap.java:178)
            org.apache.commons.collections.map.Flat3Map.size(Flat3Map.java:165)
            org.apache.commons.collections.map.Flat3Map.isEmpty(Flat3Map.java:176) */
        flat3Map.isEmpty();
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (size() == 0);
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceIdentityMap delegateMap = ((ReferenceIdentityMap) createInstance("org.apache.commons.collections.map.ReferenceIdentityMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 1);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        delegateMap.size = 1;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[12];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.isEmpty] produces [java.lang.NullPointerException] */
        flat3Map.isEmpty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.size();}
 *  */
    @Test
    public void testSize_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        int actual = flat3Map.size();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_DelegateMapEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -255);
        
        int actual = flat3Map.size();
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.size();}
 *  */
    @Test
    public void testSize_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        int actual = flat3Map.size();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.size();}
 *  */
    @Test
    public void testSize_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object lock = createInstance("java.lang.ref.ReferenceQueue$Lock");
        setField(queue, "java.lang.ref.ReferenceQueue", "lock", lock);
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 1);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[12];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", delegateMap);
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        int actual = flat3Map.size();
        
        assertEquals(0, actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        ReferenceQueue flat3MapDelegateMapDelegateMapQueue = ((ReferenceQueue) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue"));
        Reference finalFlat3MapDelegateMapQueueHead = ((Reference) getFieldValue(flat3MapDelegateMapDelegateMapQueue, "java.lang.ref.ReferenceQueue", "head"));
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        ReferenceQueue flat3MapDelegateMap1DelegateMapQueue = ((ReferenceQueue) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractReferenceMap", "queue"));
        long finalFlat3MapDelegateMapQueueQueueLength = ((Long) getFieldValue(flat3MapDelegateMap1DelegateMapQueue, "java.lang.ref.ReferenceQueue", "queueLength"));
        AbstractHashedMap flat3MapDelegateMap2 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap2DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap2, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap2DelegateMapData, 0));
        AbstractHashedMap flat3MapDelegateMap3 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap3DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap3, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData2 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap3DelegateMapData, 2));
        AbstractHashedMap flat3MapDelegateMap4 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap4DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap4, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData3 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap4DelegateMapData, 3));
        AbstractHashedMap flat3MapDelegateMap5 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap5DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap5, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData4 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap5DelegateMapData, 4));
        AbstractHashedMap flat3MapDelegateMap6 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap6DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap6, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData5 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap6DelegateMapData, 5));
        AbstractHashedMap flat3MapDelegateMap7 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap7DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap7, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData6 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap7DelegateMapData, 6));
        AbstractHashedMap flat3MapDelegateMap8 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap8DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap8, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData7 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap8DelegateMapData, 7));
        AbstractHashedMap flat3MapDelegateMap9 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap9DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap9, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData8 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap9DelegateMapData, 8));
        AbstractHashedMap flat3MapDelegateMap10 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap10DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap10, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData9 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap10DelegateMapData, 9));
        AbstractHashedMap flat3MapDelegateMap11 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap11DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap11, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData10 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap11DelegateMapData, 10));
        AbstractHashedMap flat3MapDelegateMap12 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap12DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap12, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData11 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap12DelegateMapData, 11));
        
        assertNull(finalFlat3MapDelegateMapQueueHead);
        
        assertEquals(-1L, finalFlat3MapDelegateMapQueueQueueLength);
        
        assertNull(finalFlat3MapDelegateMapData0);
        
        assertNull(finalFlat3MapDelegateMapData2);
        
        assertNull(finalFlat3MapDelegateMapData3);
        
        assertNull(finalFlat3MapDelegateMapData4);
        
        assertNull(finalFlat3MapDelegateMapData5);
        
        assertNull(finalFlat3MapDelegateMapData6);
        
        assertNull(finalFlat3MapDelegateMapData7);
        
        assertNull(finalFlat3MapDelegateMapData8);
        
        assertNull(finalFlat3MapDelegateMapData9);
        
        assertNull(finalFlat3MapDelegateMapData10);
        
        assertNull(finalFlat3MapDelegateMapData11);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return delegateMap.size();
 *  */
    @Test
    public void testSize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object lock = createInstance("java.lang.ref.ReferenceQueue$Lock");
        setField(queue, "java.lang.ref.ReferenceQueue", "lock", lock);
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 173801449);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.size] produces [java.lang.ArrayIndexOutOfBoundsException: Index 173801449 out of bounds for length 0]
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:376)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:359)
            org.apache.commons.collections.map.AbstractReferenceMap.purgeBeforeRead(AbstractReferenceMap.java:336)
            org.apache.commons.collections.map.AbstractReferenceMap.size(AbstractReferenceMap.java:178)
            org.apache.commons.collections.map.Flat3Map.size(Flat3Map.java:165) */
        flat3Map.size();
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSize_ThrowClassCastException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object lock = createInstance("java.lang.ref.ReferenceQueue$Lock");
        setField(queue, "java.lang.ref.ReferenceQueue", "lock", lock);
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 1);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[10];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.keyType = 1;
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        byte[] key = {};
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "key", key);
        referenceEntry.value = head;
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.size] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.ref.Reference ([B and java.lang.ref.Reference are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry.purge(AbstractReferenceMap.java:683)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:378)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:359)
            org.apache.commons.collections.map.AbstractReferenceMap.purgeBeforeRead(AbstractReferenceMap.java:336)
            org.apache.commons.collections.map.AbstractReferenceMap.size(AbstractReferenceMap.java:178)
            org.apache.commons.collections.map.Flat3Map.size(Flat3Map.java:165) */
        flat3Map.size();
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegateMap.size();
 *  */
    @Test
    public void testSize_ThrowNullPointerException_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 1);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[10];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        IdentityMap.IdentityEntry next = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "next", next);
        Object value = createInstance("java.lang.Object");
        referenceEntry.value = value;
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.size] produces [java.lang.NullPointerException] */
        flat3Map.size();
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return delegateMap.size();
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 1);
        Object next = createInstance("java.lang.Thread$WeakClassKey");
        setField(head, "java.lang.ref.Reference", "next", next);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[12];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        data[1] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.size] produces [java.lang.NullPointerException]
            java.base/java.lang.ref.ReferenceQueue.poll(ReferenceQueue.java:119)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:357)
            org.apache.commons.collections.map.AbstractReferenceMap.purgeBeforeRead(AbstractReferenceMap.java:336)
            org.apache.commons.collections.map.AbstractReferenceMap.size(AbstractReferenceMap.java:178)
            org.apache.commons.collections.map.Flat3Map.size(Flat3Map.java:165) */
        flat3Map.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.entrySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method entrySet()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#entrySet()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.returnsFrom {@code return new EntrySet(this);}
 *  */
    @Test
    public void testEntrySet_DelegateMapEqualsNull() {
        Flat3Map flat3Map = new Flat3Map();
        
        Set actual = flat3Map.entrySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#entrySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.entrySet();}
 *  */
    @Test
    public void testEntrySet_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.EntrySet initialFlat3MapDelegateMapEntrySet = ((AbstractHashedMap.EntrySet) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "entrySet"));
        
        Set actual = flat3Map.entrySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
        
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.EntrySet finalFlat3MapDelegateMapEntrySet = ((AbstractHashedMap.EntrySet) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "entrySet"));
        
        assertFalse(initialFlat3MapDelegateMapEntrySet == finalFlat3MapDelegateMapEntrySet);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#entrySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.entrySet();}
 *  */
    @Test
    public void testEntrySet_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        AbstractHashedMap.EntrySet entrySet = ((AbstractHashedMap.EntrySet) createInstance("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        delegateMap.entrySet = entrySet;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.EntrySet actual = ((AbstractHashedMap.EntrySet) flat3Map.entrySet());
        
        AbstractHashedMap.EntrySet expected = new AbstractHashedMap.EntrySet(null);
        
        AbstractHashedMap actualParent = actual.parent;
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#entrySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.entrySet();}
 *  */
    @Test
    public void testEntrySet_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        AbstractHashedMap.EntrySet entrySet = ((AbstractHashedMap.EntrySet) createInstance("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        delegateMap.entrySet = entrySet;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.EntrySet actual = ((AbstractHashedMap.EntrySet) flat3Map.entrySet());
        
        AbstractHashedMap.EntrySet expected = new AbstractHashedMap.EntrySet(null);
        
        AbstractHashedMap actualParent = actual.parent;
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#entrySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.entrySet();}
 *  */
    @Test
    public void testEntrySet_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.EntrySet initialFlat3MapDelegateMapEntrySet = ((AbstractHashedMap.EntrySet) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "entrySet"));
        
        AbstractReferenceMap.ReferenceEntrySet actual = ((AbstractReferenceMap.ReferenceEntrySet) flat3Map.entrySet());
        
        AbstractReferenceMap.ReferenceEntrySet expected = new AbstractReferenceMap.ReferenceEntrySet(delegateMap);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.EntrySet finalFlat3MapDelegateMapEntrySet = ((AbstractHashedMap.EntrySet) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "entrySet"));
        
        assertFalse(initialFlat3MapDelegateMapEntrySet == finalFlat3MapDelegateMapEntrySet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.putAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#putAll(java.util.Map)}
 * @utbot.executesCondition {@code (size == 0): True}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPutAll_SizeEqualsZero() {
        Flat3Map flat3Map = new Flat3Map();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        flat3Map.putAll(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#putAll(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = map.size();
 *  */
    @Test
    public void testPutAll_ThrowNullPointerException() {
        Flat3Map flat3Map = new Flat3Map();
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.putAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.Flat3Map.putAll(Flat3Map.java:340) */
        flat3Map.putAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.Flat3Map.readObject(Flat3Map.java:996) */
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = flat3MapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(flat3Map, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = flat3MapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(flat3Map, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = flat3MapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(flat3Map, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
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
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = flat3MapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(flat3Map, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        Object in1 = createInstance("java.util.zip.ZipFile$ZipFileInflaterInputStream");
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = flat3MapClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(flat3Map, readObjectMethodArguments);
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
        // 4 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.writeObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections.map.Flat3Map.writeObject(Flat3Map.java:984) */
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = flat3MapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(flat3Map, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = flat3MapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(flat3Map, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        Flat3Map flat3Map = new Flat3Map();
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = flat3MapClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(flat3Map, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeObject
    
    public void testWriteObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.containsKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method containsKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_SwitchSizeCase1() {
        Flat3Map flat3Map = new Flat3Map();
        
        boolean actual = flat3Map.containsKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = 1622126713;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[10];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        AbstractReferenceMap.ReferenceEntry next = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        next.hashCode = 149;
        Integer key = -1598932297;
        setField(next, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "key", key);
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "next", next);
        referenceEntry.hashCode = -1610612736;
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsKey(key);
        
        assertTrue(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap1DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData2 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap1DelegateMapData, 2));
        AbstractHashedMap flat3MapDelegateMap2 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap2DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap2, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData3 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap2DelegateMapData, 3));
        AbstractHashedMap flat3MapDelegateMap3 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap3DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap3, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData4 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap3DelegateMapData, 4));
        AbstractHashedMap flat3MapDelegateMap4 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap4DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap4, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData5 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap4DelegateMapData, 5));
        AbstractHashedMap flat3MapDelegateMap5 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap5DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap5, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData6 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap5DelegateMapData, 6));
        AbstractHashedMap flat3MapDelegateMap6 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap6DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap6, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData7 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap6DelegateMapData, 7));
        AbstractHashedMap flat3MapDelegateMap7 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap7DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap7, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData8 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap7DelegateMapData, 8));
        AbstractHashedMap flat3MapDelegateMap8 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMap8DelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap8, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData9 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMap8DelegateMapData, 9));
        
        assertNull(finalFlat3MapDelegateMapData0);
        
        assertNull(finalFlat3MapDelegateMapData2);
        
        assertNull(finalFlat3MapDelegateMapData3);
        
        assertNull(finalFlat3MapDelegateMapData4);
        
        assertNull(finalFlat3MapDelegateMapData5);
        
        assertNull(finalFlat3MapDelegateMapData6);
        
        assertNull(finalFlat3MapDelegateMapData7);
        
        assertNull(finalFlat3MapDelegateMapData8);
        
        assertNull(finalFlat3MapDelegateMapData9);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_NotKeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -248);
        int[] key2 = {};
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 1;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_Key1NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key1);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key1 == null): False}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_SwitchSizeCase1_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Object key1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key3)): True}
 *  */
    @Test
    public void testContainsKey_KeyEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        Integer key3 = -255;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        Integer integer = -255;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key3)): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_Hash2NotEqualsHashCode() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key3 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        Integer integer = -1;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash3 == hashCode): False}
 * @utbot.executesCondition {@code (hash2 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key2)): True}
 *  */
    @Test
    public void testContainsKey_KeyEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -1);
        Integer key2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key2 == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 2}
 *  */
    @Test
    public void testContainsKey_SwitchSizeCase2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): True}
 *  */
    @Test
    public void testContainsKey_Key3EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsKey(key);}
 *  */
    @Test
    public void testContainsKey_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceIdentityMap delegateMap = ((ReferenceIdentityMap) createInstance("org.apache.commons.collections.map.ReferenceIdentityMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        byte[] byteArray = {};
        
        boolean actual = flat3Map.containsKey(byteArray);
        
        assertFalse(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): True}
 *  */
    @Test
    public void testContainsKey_Key2EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.executesCondition {@code (key3 == null): False}
 * @utbot.executesCondition {@code (key2 == null): False}
 * @utbot.executesCondition {@code (key1 == null): True}
 *  */
    @Test
    public void testContainsKey_Key1EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object key2 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key2);
        
        boolean actual = flat3Map.containsKey(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method containsKey(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (delegateMap != null): False},
    ///     {@code (key == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_SizeLessOrEqualZero() {
        Flat3Map flat3Map = new Flat3Map();
        byte[] byteArray = {};
        
        boolean actual = flat3Map.containsKey(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.activatesSwitch {@code switch(size)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_SwitchSize() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 4);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_Hash1NotEqualsHashCode() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", 1);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_Hash1NotEqualsHashCode_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", 16);
        Integer integer = 1;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_NotKeyEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        Integer integer = -255;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsKey_NotKeyEquals_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", 254);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        Integer key1 = -255;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 254;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.executesCondition {@code (hash2 == hashCode): False}
 * @utbot.executesCondition {@code (hash1 == hashCode): True}
 * @utbot.executesCondition {@code (key.equals(key1)): True}
 *  */
    @Test
    public void testContainsKey_KeyEquals_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -1);
        Integer key1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsKey(integer);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsKey(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return delegateMap.containsKey(key);
 *  */
    @Test
    public void testContainsKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = 1983091730;
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.containsKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.collections.map.AbstractHashedMap.containsKey(AbstractHashedMap.java:220)
            org.apache.commons.collections.map.Flat3Map.containsKey(Flat3Map.java:188) */
        flat3Map.containsKey(integer);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return delegateMap.containsKey(key);
 *  */
    @Test
    public void testContainsKey_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[][] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            LRUMap delegateMap = ((LRUMap) createInstance("org.apache.commons.collections.map.LRUMap"));
            org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
            delegateMap.data = data;
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            /* This test fails because method [org.apache.commons.collections.map.Flat3Map.containsKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1847794754 out of bounds for length 0]
                org.apache.commons.collections.map.AbstractHashedMap.containsKey(AbstractHashedMap.java:220)
                org.apache.commons.collections.map.Flat3Map.containsKey(Flat3Map.java:188) */
            flat3Map.containsKey(null);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.keySet
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method keySet()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#keySet()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.returnsFrom {@code return new KeySet(this);}
 *  */
    @Test
    public void testKeySet_DelegateMapEqualsNull() {
        Flat3Map flat3Map = new Flat3Map();
        
        Set actual = flat3Map.keySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#keySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.keySet();}
 *  */
    @Test
    public void testKeySet_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.KeySet initialFlat3MapDelegateMapKeySet = ((AbstractHashedMap.KeySet) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "keySet"));
        
        Set actual = flat3Map.keySet();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
        
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.KeySet finalFlat3MapDelegateMapKeySet = ((AbstractHashedMap.KeySet) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "keySet"));
        
        assertFalse(initialFlat3MapDelegateMapKeySet == finalFlat3MapDelegateMapKeySet);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#keySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.keySet();}
 *  */
    @Test
    public void testKeySet_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        AbstractHashedMap.KeySet keySet = ((AbstractHashedMap.KeySet) createInstance("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        delegateMap.keySet = keySet;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.KeySet actual = ((AbstractHashedMap.KeySet) flat3Map.keySet());
        
        AbstractHashedMap.KeySet expected = new AbstractHashedMap.KeySet(null);
        
        AbstractHashedMap actualParent = actual.parent;
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#keySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.keySet();}
 *  */
    @Test
    public void testKeySet_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        AbstractHashedMap.KeySet keySet = ((AbstractHashedMap.KeySet) createInstance("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        delegateMap.keySet = keySet;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.KeySet actual = ((AbstractHashedMap.KeySet) flat3Map.keySet());
        
        AbstractHashedMap.KeySet expected = new AbstractHashedMap.KeySet(null);
        
        AbstractHashedMap actualParent = actual.parent;
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#keySet()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.keySet();}
 *  */
    @Test
    public void testKeySet_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.KeySet initialFlat3MapDelegateMapKeySet = ((AbstractHashedMap.KeySet) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "keySet"));
        
        AbstractReferenceMap.ReferenceKeySet actual = ((AbstractReferenceMap.ReferenceKeySet) flat3Map.keySet());
        
        AbstractReferenceMap.ReferenceKeySet expected = new AbstractReferenceMap.ReferenceKeySet(delegateMap);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        AbstractHashedMap flat3MapDelegateMap1 = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        AbstractHashedMap.KeySet finalFlat3MapDelegateMapKeySet = ((AbstractHashedMap.KeySet) getFieldValue(flat3MapDelegateMap1, "org.apache.commons.collections.map.AbstractHashedMap", "keySet"));
        
        assertFalse(initialFlat3MapDelegateMapKeySet == finalFlat3MapDelegateMapKeySet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.containsValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        byte[] byteArray = {};
        
        boolean actual = flat3Map.containsValue(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_4() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        HashedMap delegateMap = ((HashedMap) createInstance("org.apache.commons.collections.map.HashedMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        byte[] value = {};
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[0] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsValue(value);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_6() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        byte[] value = {};
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[0] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsValue(value);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_8() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        Object value = createInstance("java.util.ResourceBundle$BundleReference");
        referenceEntry.value = value;
        data[0] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        byte[] byteArray = {};
        
        boolean actual = flat3Map.containsValue(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_9() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        byte[] byteArray = {};
        
        boolean actual = flat3Map.containsValue(byteArray);
        
        assertFalse(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        short[] value = {};
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[0] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_3() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        AbstractReferenceMap.ReferenceEntry next = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        setField(next, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "next", next);
        byte[] value = {};
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[0] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_5() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        CaseInsensitiveMap delegateMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        Integer value = 0;
        setField(identityEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[0] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_7() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        CaseInsensitiveMap delegateMap = ((CaseInsensitiveMap) createInstance("org.apache.commons.collections.map.CaseInsensitiveMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        IdentityMap.IdentityEntry identityEntry = ((IdentityMap.IdentityEntry) createInstance("org.apache.commons.collections.map.IdentityMap$IdentityEntry"));
        data[0] = ((AbstractHashedMap.HashEntry) identityEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.containsValue(value);}
 *  */
    @Test
    public void testContainsValue_DelegateMapNotEqualsNull_10() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertFalse(actual);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (value3 == null): False}
 * @utbot.executesCondition {@code (value2 == null): False}
 * @utbot.executesCondition {@code (value1 == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_Value1NotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object value1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1", value1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2", value1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value1);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (value3 == null): True}
 *  */
    @Test
    public void testContainsValue_Value3EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (value2 == null): True}
 * @utbot.activatesSwitch {@code switch(size) case: 2}
 *  */
    @Test
    public void testContainsValue_SwitchSizeCase2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(value2)): True}
 * @utbot.activatesSwitch {@code switch(size) case: 2}
 *  */
    @Test
    public void testContainsValue_SwitchSizeCase2_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer value2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2", value2);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(value3)): True}
 *  */
    @Test
    public void testContainsValue_ValueEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer value3 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value3);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.executesCondition {@code (value3 == null): False}
 * @utbot.executesCondition {@code (value2 == null): True}
 *  */
    @Test
    public void testContainsValue_Value2EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Object value3 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value3);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (value.equals(value3)): False}
 * @utbot.executesCondition {@code (value.equals(value2)): True}
 *  */
    @Test
    public void testContainsValue_NotValueEquals() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer value2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2", value2);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method containsValue(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (delegateMap != null): False},
    ///     {@code (value == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.activatesSwitch {@code switch(size)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_SwitchSize() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -247);
        byte[] byteArray = {};
        
        boolean actual = flat3Map.containsValue(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value.equals(value1)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_NotValueEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value.equals(value1)): True}
 *  */
    @Test
    public void testContainsValue_ValueEquals_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Integer value1 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1", value1);
        Integer integer = 0;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value.equals(value2)): False}
 * @utbot.executesCondition {@code (value.equals(value1)): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.activatesSwitch {@code switch(size) case: 2}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_NotValueEquals_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer value2 = 0;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value2", value2);
        Integer integer = -1;
        
        boolean actual = flat3Map.containsValue(integer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method containsValue(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (delegateMap != null): False},
    ///     {@code (value == null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.activatesSwitch {@code switch(size) case: 1}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_SwitchSizeCase1() {
        Flat3Map flat3Map = new Flat3Map();
        
        boolean actual = flat3Map.containsValue(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value1 == null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsValue_Value1NotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Object value1 = createInstance("java.lang.Object");
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1", value1);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value1 == null): True}
 *  */
    @Test
    public void testContainsValue_Value1EqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        
        boolean actual = flat3Map.containsValue(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.invokes {@link org.apache.commons.collections.map.AbstractHashedMap#containsValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return delegateMap.containsValue(value);
 *  */
    @Test
    public void testContainsValue_ThrowClassCastException() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[1];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        byte[] value = {};
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "value", value);
        data[0] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        byte[][] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.containsValue] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.ref.Reference ([B and java.lang.ref.Reference are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry.getValue(AbstractReferenceMap.java:596)
            org.apache.commons.collections.map.AbstractHashedMap.containsValue(AbstractHashedMap.java:251)
            org.apache.commons.collections.map.Flat3Map.containsValue(Flat3Map.java:223) */
        flat3Map.containsValue(byteArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsValue(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.map.Flat3Map}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#containsValue(java.lang.Object)}
     */
    @Test
    public void testContainsValueReturnsFalse() {
        Flat3Map flat3Map = new Flat3Map();
        Object object = new Object();
        Object object1 = new Object();
        flat3Map.put(object, object1);
        Object object2 = new Object();
        Object object3 = new Object();
        flat3Map.put(object2, object3);
        Object object4 = new Object();
        Object object5 = new Object();
        flat3Map.put(object4, object5);
        Object object6 = new Object();
        
        boolean actual = flat3Map.containsValue(object6);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.createDelegateMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDelegateMap()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#createDelegateMap()}
 * @utbot.returnsFrom {@code return new HashedMap();}
 *  */
    @Test
    public void testCreateDelegateMap_Return() throws Exception  {
        Flat3Map flat3Map = new Flat3Map();
        
        HashedMap actual = ((HashedMap) flat3Map.createDelegateMap());
        
        HashedMap expected = ((HashedMap) createInstance("org.apache.commons.collections.map.HashedMap"));
        expected.loadFactor = 0.75f;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[16];
        expected.data = data;
        expected.threshold = 12;
        
        float expectedLoadFactor = expected.loadFactor;
        float actualLoadFactor = actual.loadFactor;
        org.junit.Assert.assertEquals(expectedLoadFactor, actualLoadFactor, 1.0E-6f);
        
        int expectedSize = expected.size;
        int actualSize = actual.size;
        assertEquals(expectedSize, actualSize);
        
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] expectedData = expected.data;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] actualData = actual.data;
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        assertTrue(deepEquals(expectedData, actualData));
        
        int expectedThreshold = expected.threshold;
        int actualThreshold = actual.threshold;
        assertEquals(expectedThreshold, actualThreshold);
        
        int expectedModCount = expected.modCount;
        int actualModCount = actual.modCount;
        assertEquals(expectedModCount, actualModCount);
        
        AbstractHashedMap.EntrySet actualEntrySet = actual.entrySet;
        assertNull(actualEntrySet);
        
        AbstractHashedMap.KeySet actualKeySet = actual.keySet;
        assertNull(actualKeySet);
        
        org.apache.commons.collections.map.AbstractHashedMap.Values actualValues = actual.values;
        assertNull(actualValues);
        
        Set actualKeySet1 = ((Set) getFieldValue(actual, "java.util.AbstractMap", "keySet"));
        assertNull(actualKeySet1);
        
        Collection actualValues1 = ((Collection) getFieldValue(actual, "java.util.AbstractMap", "values"));
        assertNull(actualValues1);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.mapIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapIterator()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_3() throws Exception  {
        MapIterator prevINSTANCE = EmptyMapIterator.INSTANCE;
        try {
            EmptyMapIterator instance = ((EmptyMapIterator) createInstance("org.apache.commons.collections.iterators.EmptyMapIterator"));
            Class emptyMapIteratorClazz = Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator");
            setStaticField(emptyMapIteratorClazz, "INSTANCE", instance);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            EmptyMapIterator actual = ((EmptyMapIterator) flat3Map.mapIterator());
            
        } finally {
            setStaticField(EmptyMapIterator.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): True}
 *  */
    @Test
    public void testMapIterator_SizeEqualsZero() throws Exception  {
        MapIterator prevINSTANCE = EmptyMapIterator.INSTANCE;
        try {
            EmptyMapIterator instance = ((EmptyMapIterator) createInstance("org.apache.commons.collections.iterators.EmptyMapIterator"));
            Class emptyMapIteratorClazz = Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator");
            setStaticField(emptyMapIteratorClazz, "INSTANCE", instance);
            Flat3Map flat3Map = new Flat3Map();
            
            EmptyMapIterator actual = ((EmptyMapIterator) flat3Map.mapIterator());
            
        } finally {
            setStaticField(EmptyMapIterator.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_5() throws Exception  {
        OrderedMapIterator prevINSTANCE = EmptyOrderedMapIterator.INSTANCE;
        try {
            EmptyOrderedMapIterator instance = ((EmptyOrderedMapIterator) createInstance("org.apache.commons.collections.iterators.EmptyOrderedMapIterator"));
            Class emptyOrderedMapIteratorClazz = Class.forName("org.apache.commons.collections.iterators.EmptyOrderedMapIterator");
            setStaticField(emptyOrderedMapIteratorClazz, "INSTANCE", instance);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
            
            EmptyOrderedMapIterator actual = ((EmptyOrderedMapIterator) flat3Map.mapIterator());
            
        } finally {
            setStaticField(EmptyOrderedMapIterator.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): False}
 * @utbot.executesCondition {@code (size == 0): False}
 * @utbot.returnsFrom {@code return new FlatMapIterator(this);}
 *  */
    @Test
    public void testMapIterator_SizeNotEqualsZero() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        
        Flat3Map.FlatMapIterator actual = ((Flat3Map.FlatMapIterator) flat3Map.mapIterator());
        
        Flat3Map.FlatMapIterator expected = ((Flat3Map.FlatMapIterator) createInstance("org.apache.commons.collections.map.Flat3Map$FlatMapIterator"));
        setField(expected, "org.apache.commons.collections.map.Flat3Map$FlatMapIterator", "parent", flat3Map);
        
        Flat3Map expectedParent = ((Flat3Map) getFieldValue(expected, "org.apache.commons.collections.map.Flat3Map$FlatMapIterator", "parent"));
        Flat3Map actualParent = ((Flat3Map) getFieldValue(actual, "org.apache.commons.collections.map.Flat3Map$FlatMapIterator", "parent"));
        // org.apache.commons.collections.map.Flat3Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        int expectedNextIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections.map.Flat3Map$FlatMapIterator", "nextIndex"));
        int actualNextIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections.map.Flat3Map$FlatMapIterator", "nextIndex"));
        assertEquals(expectedNextIndex, actualNextIndex);
        
        boolean actualCanRemove = ((Boolean) getFieldValue(actual, "org.apache.commons.collections.map.Flat3Map$FlatMapIterator", "canRemove"));
        assertFalse(actualCanRemove);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        delegateMap.size = 1;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.HashMapIterator actual = ((AbstractHashedMap.HashMapIterator) flat3Map.mapIterator());
        
        AbstractHashedMap.HashMapIterator expected = ((AbstractHashedMap.HashMapIterator) createInstance("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator"));
        setField(expected, "org.apache.commons.collections.map.AbstractHashedMap$HashIterator", "parent", delegateMap);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        int expectedHashIndex = expected.hashIndex;
        int actualHashIndex = actual.hashIndex;
        assertEquals(expectedHashIndex, actualHashIndex);
        
        AbstractHashedMap.HashEntry actualLast = actual.last;
        assertNull(actualLast);
        
        AbstractHashedMap.HashEntry actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        delegateMap.size = 1;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.HashMapIterator actual = ((AbstractHashedMap.HashMapIterator) flat3Map.mapIterator());
        
        AbstractHashedMap.HashMapIterator expected = ((AbstractHashedMap.HashMapIterator) createInstance("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator"));
        setField(expected, "org.apache.commons.collections.map.AbstractHashedMap$HashIterator", "parent", delegateMap);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        int expectedHashIndex = expected.hashIndex;
        int actualHashIndex = actual.hashIndex;
        assertEquals(expectedHashIndex, actualHashIndex);
        
        AbstractHashedMap.HashEntry actualLast = actual.last;
        assertNull(actualLast);
        
        AbstractHashedMap.HashEntry actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        IdentityMap delegateMap = ((IdentityMap) createInstance("org.apache.commons.collections.map.IdentityMap"));
        delegateMap.size = 1;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[2];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        data[1] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractHashedMap.HashMapIterator actual = ((AbstractHashedMap.HashMapIterator) flat3Map.mapIterator());
        
        AbstractHashedMap.HashMapIterator expected = ((AbstractHashedMap.HashMapIterator) createInstance("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator"));
        setField(expected, "org.apache.commons.collections.map.AbstractHashedMap$HashIterator", "parent", delegateMap);
        expected.hashIndex = 1;
        setField(expected, "org.apache.commons.collections.map.AbstractHashedMap$HashIterator", "next", referenceEntry);
        
        AbstractHashedMap expectedParent = expected.parent;
        AbstractHashedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        int expectedHashIndex = expected.hashIndex;
        int actualHashIndex = actual.hashIndex;
        assertEquals(expectedHashIndex, actualHashIndex);
        
        AbstractHashedMap.HashEntry actualLast = actual.last;
        assertNull(actualLast);
        
        AbstractHashedMap.HashEntry expectedNext = expected.next;
        AbstractHashedMap.HashEntry actualNext = actual.next;
        // org.apache.commons.collections.map.AbstractHashedMap.HashEntry has overridden equals method
        assertEquals(expectedNext, actualNext);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_4() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        AbstractLinkedMap delegateMap = ((AbstractLinkedMap) createInstance("org.apache.commons.collections.map.AbstractLinkedMap"));
        AbstractLinkedMap.LinkEntry header = ((AbstractLinkedMap.LinkEntry) createInstance("org.apache.commons.collections.map.AbstractLinkedMap$LinkEntry"));
        delegateMap.header = header;
        delegateMap.size = 1;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractLinkedMap.LinkMapIterator actual = ((AbstractLinkedMap.LinkMapIterator) flat3Map.mapIterator());
        
        AbstractLinkedMap.LinkMapIterator expected = ((AbstractLinkedMap.LinkMapIterator) createInstance("org.apache.commons.collections.map.AbstractLinkedMap$LinkMapIterator"));
        setField(expected, "org.apache.commons.collections.map.AbstractLinkedMap$LinkIterator", "parent", delegateMap);
        
        AbstractLinkedMap expectedParent = expected.parent;
        AbstractLinkedMap actualParent = actual.parent;
        // org.apache.commons.collections.map.AbstractLinkedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParent, actualParent));
        
        AbstractLinkedMap.LinkEntry actualLast = actual.last;
        assertNull(actualLast);
        
        AbstractLinkedMap.LinkEntry actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_6() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        delegateMap.size = 1;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = {null};
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractReferenceMap.ReferenceMapIterator actual = ((AbstractReferenceMap.ReferenceMapIterator) flat3Map.mapIterator());
        
        AbstractReferenceMap.ReferenceMapIterator expected = ((AbstractReferenceMap.ReferenceMapIterator) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceMapIterator"));
        setField(expected, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntrySetIterator", "parent", delegateMap);
        expected.index = 1;
        
        AbstractReferenceMap expectedParent = expected.parent;
        AbstractReferenceMap actualParent = actual.parent;
        int expectedParentKeyType = expectedParent.keyType;
        int actualParentKeyType = actualParent.keyType;
        assertEquals(expectedParentKeyType, actualParentKeyType);
        
        int expectedParentValueType = expectedParent.valueType;
        int actualParentValueType = actualParent.valueType;
        assertEquals(expectedParentValueType, actualParentValueType);
        
        boolean actualParentPurgeValues = actualParent.purgeValues;
        assertFalse(actualParentPurgeValues);
        
        ReferenceQueue expectedParentQueue = ((ReferenceQueue) getFieldValue(expectedParent, "org.apache.commons.collections.map.AbstractReferenceMap", "queue"));
        ReferenceQueue actualParentQueue = ((ReferenceQueue) getFieldValue(actualParent, "org.apache.commons.collections.map.AbstractReferenceMap", "queue"));
        Object actualParentQueueLock = getFieldValue(actualParentQueue, "java.lang.ref.ReferenceQueue", "lock");
        assertNull(actualParentQueueLock);
        
        Reference actualParentQueueHead = ((Reference) getFieldValue(actualParentQueue, "java.lang.ref.ReferenceQueue", "head"));
        assertNull(actualParentQueueHead);
        
        long expectedParentQueueQueueLength = ((Long) getFieldValue(expectedParentQueue, "java.lang.ref.ReferenceQueue", "queueLength"));
        long actualParentQueueQueueLength = ((Long) getFieldValue(actualParentQueue, "java.lang.ref.ReferenceQueue", "queueLength"));
        assertEquals(expectedParentQueueQueueLength, actualParentQueueQueueLength);
        
        float expectedParentLoadFactor = expectedParent.loadFactor;
        float actualParentLoadFactor = actualParent.loadFactor;
        org.junit.Assert.assertEquals(expectedParentLoadFactor, actualParentLoadFactor, 1.0E-6f);
        
        int expectedParentSize = expectedParent.size;
        int actualParentSize = actualParent.size;
        assertEquals(expectedParentSize, actualParentSize);
        
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] expectedParentData = expectedParent.data;
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] actualParentData = actualParent.data;
        int expectedParentDataSize = expectedParentData.length;
        assertEquals(expectedParentDataSize, actualParentData.length);
        assertTrue(deepEquals(expectedParentData, actualParentData));
        
        int expectedParentThreshold = expectedParent.threshold;
        int actualParentThreshold = actualParent.threshold;
        assertEquals(expectedParentThreshold, actualParentThreshold);
        
        int expectedParentModCount = expectedParent.modCount;
        int actualParentModCount = actualParent.modCount;
        assertEquals(expectedParentModCount, actualParentModCount);
        
        AbstractHashedMap.EntrySet expectedParentEntrySet = expectedParent.entrySet;
        AbstractHashedMap.EntrySet actualParentEntrySet = actualParent.entrySet;
        AbstractHashedMap expectedParentEntrySetParent = expectedParentEntrySet.parent;
        AbstractHashedMap actualParentEntrySetParent = actualParentEntrySet.parent;
        // org.apache.commons.collections.map.AbstractHashedMap is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedParentEntrySetParent, actualParentEntrySetParent));
        
        AbstractHashedMap.KeySet actualParentKeySet = actualParent.keySet;
        assertNull(actualParentKeySet);
        
        org.apache.commons.collections.map.AbstractHashedMap.Values actualParentValues = actualParent.values;
        assertNull(actualParentValues);
        
        Set actualParentKeySet1 = ((Set) getFieldValue(actualParent, "java.util.AbstractMap", "keySet"));
        assertNull(actualParentKeySet1);
        
        Collection actualParentValues1 = ((Collection) getFieldValue(actualParent, "java.util.AbstractMap", "values"));
        assertNull(actualParentValues1);
        
        int expectedIndex = expected.index;
        int actualIndex = actual.index;
        assertEquals(expectedIndex, actualIndex);
        
        AbstractReferenceMap.ReferenceEntry actualEntry = actual.entry;
        assertNull(actualEntry);
        
        AbstractReferenceMap.ReferenceEntry actualPrevious = actual.previous;
        assertNull(actualPrevious);
        
        Object actualNextKey = actual.nextKey;
        assertNull(actualNextKey);
        
        Object actualNextValue = actual.nextValue;
        assertNull(actualNextValue);
        
        Object actualCurrentKey = actual.currentKey;
        assertNull(actualCurrentKey);
        
        Object actualCurrentValue = actual.currentValue;
        assertNull(actualCurrentValue);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
        AbstractHashedMap flat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] flat3MapDelegateMapDelegateMapData = ((org.apache.commons.collections.map.AbstractHashedMap.HashEntry[]) getFieldValue(flat3MapDelegateMap, "org.apache.commons.collections.map.AbstractHashedMap", "data"));
        AbstractHashedMap.HashEntry finalFlat3MapDelegateMapData0 = ((AbstractHashedMap.HashEntry) get(flat3MapDelegateMapDelegateMapData, 0));
        
        assertNull(finalFlat3MapDelegateMapData0);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#mapIterator()}
 * @utbot.executesCondition {@code (delegateMap != null): True}
 * @utbot.returnsFrom {@code return delegateMap.mapIterator();}
 *  */
    @Test
    public void testMapIterator_DelegateMapNotEqualsNull_7() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        AbstractReferenceMap.ReferenceMapIterator actual = ((AbstractReferenceMap.ReferenceMapIterator) flat3Map.mapIterator());
        
        AbstractReferenceMap.ReferenceMapIterator expected = ((AbstractReferenceMap.ReferenceMapIterator) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceMapIterator"));
        setField(expected, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntrySetIterator", "parent", delegateMap);
        
        AbstractReferenceMap expectedParent = expected.parent;
        AbstractReferenceMap actualParent = actual.parent;
        int expectedParentKeyType = expectedParent.keyType;
        int actualParentKeyType = actualParent.keyType;
        assertEquals(expectedParentKeyType, actualParentKeyType);
        
        int expectedParentValueType = expectedParent.valueType;
        int actualParentValueType = actualParent.valueType;
        assertEquals(expectedParentValueType, actualParentValueType);
        
        boolean actualParentPurgeValues = actualParent.purgeValues;
        assertFalse(actualParentPurgeValues);
        
        ReferenceQueue expectedParentQueue = ((ReferenceQueue) getFieldValue(expectedParent, "org.apache.commons.collections.map.AbstractReferenceMap", "queue"));
        ReferenceQueue actualParentQueue = ((ReferenceQueue) getFieldValue(actualParent, "org.apache.commons.collections.map.AbstractReferenceMap", "queue"));
        Object actualParentQueueLock = getFieldValue(actualParentQueue, "java.lang.ref.ReferenceQueue", "lock");
        assertNull(actualParentQueueLock);
        
        Reference actualParentQueueHead = ((Reference) getFieldValue(actualParentQueue, "java.lang.ref.ReferenceQueue", "head"));
        assertNull(actualParentQueueHead);
        
        long expectedParentQueueQueueLength = ((Long) getFieldValue(expectedParentQueue, "java.lang.ref.ReferenceQueue", "queueLength"));
        long actualParentQueueQueueLength = ((Long) getFieldValue(actualParentQueue, "java.lang.ref.ReferenceQueue", "queueLength"));
        assertEquals(expectedParentQueueQueueLength, actualParentQueueQueueLength);
        
        float expectedParentLoadFactor = expectedParent.loadFactor;
        float actualParentLoadFactor = actualParent.loadFactor;
        org.junit.Assert.assertEquals(expectedParentLoadFactor, actualParentLoadFactor, 1.0E-6f);
        
        int expectedParentSize = expectedParent.size;
        int actualParentSize = actualParent.size;
        assertEquals(expectedParentSize, actualParentSize);
        
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] actualParentData = actualParent.data;
        assertNull(actualParentData);
        
        int expectedParentThreshold = expectedParent.threshold;
        int actualParentThreshold = actualParent.threshold;
        assertEquals(expectedParentThreshold, actualParentThreshold);
        
        int expectedParentModCount = expectedParent.modCount;
        int actualParentModCount = actualParent.modCount;
        assertEquals(expectedParentModCount, actualParentModCount);
        
        AbstractHashedMap.EntrySet actualParentEntrySet = actualParent.entrySet;
        assertNull(actualParentEntrySet);
        
        AbstractHashedMap.KeySet actualParentKeySet = actualParent.keySet;
        assertNull(actualParentKeySet);
        
        org.apache.commons.collections.map.AbstractHashedMap.Values actualParentValues = actualParent.values;
        assertNull(actualParentValues);
        
        Set actualParentKeySet1 = ((Set) getFieldValue(actualParent, "java.util.AbstractMap", "keySet"));
        assertNull(actualParentKeySet1);
        
        Collection actualParentValues1 = ((Collection) getFieldValue(actualParent, "java.util.AbstractMap", "values"));
        assertNull(actualParentValues1);
        
        int expectedIndex = expected.index;
        int actualIndex = actual.index;
        assertEquals(expectedIndex, actualIndex);
        
        AbstractReferenceMap.ReferenceEntry actualEntry = actual.entry;
        assertNull(actualEntry);
        
        AbstractReferenceMap.ReferenceEntry actualPrevious = actual.previous;
        assertNull(actualPrevious);
        
        Object actualNextKey = actual.nextKey;
        assertNull(actualNextKey);
        
        Object actualNextValue = actual.nextValue;
        assertNull(actualNextValue);
        
        Object actualCurrentKey = actual.currentKey;
        assertNull(actualCurrentKey);
        
        Object actualCurrentValue = actual.currentValue;
        assertNull(actualCurrentValue);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapIterator()
    
    @Test
    public void testMapIterator1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceMap delegateMap = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object lock = createInstance("java.lang.ref.ReferenceQueue$Lock");
        setField(queue, "java.lang.ref.ReferenceQueue", "lock", lock);
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 38);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[39];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.keyType = 1;
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        CleanerImpl.PhantomCleanableRef key = ((CleanerImpl.PhantomCleanableRef) createInstance("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "key", key);
        referenceEntry.value = head;
        data[38] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.mapIterator] produces [java.lang.UnsupportedOperationException: clear]
            java.base/jdk.internal.ref.CleanerImpl$PhantomCleanableRef.clear(CleanerImpl.java:198)
            org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry.purge(AbstractReferenceMap.java:683)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:378)
            org.apache.commons.collections.map.AbstractReferenceMap.purge(AbstractReferenceMap.java:359)
            org.apache.commons.collections.map.AbstractReferenceMap.purgeBeforeRead(AbstractReferenceMap.java:336)
            org.apache.commons.collections.map.AbstractReferenceMap.size(AbstractReferenceMap.java:178)
            org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntrySetIterator.<init>(AbstractReferenceMap.java:728)
            org.apache.commons.collections.map.AbstractReferenceMap$ReferenceMapIterator.<init>(AbstractReferenceMap.java:839)
            org.apache.commons.collections.map.AbstractReferenceMap.mapIterator(AbstractReferenceMap.java:288)
            org.apache.commons.collections.map.Flat3Map.mapIterator(Flat3Map.java:573) */
        flat3Map.mapIterator();
    }
    
    @Test
    public void testMapIterator2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        ReferenceIdentityMap delegateMap = ((ReferenceIdentityMap) createInstance("org.apache.commons.collections.map.ReferenceIdentityMap"));
        ReferenceQueue queue = ((ReferenceQueue) createInstance("java.lang.ref.ReferenceQueue"));
        Object head = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(head, "java.lang.WeakPairMap$Pair$Weak", "hash", 38);
        setField(head, "java.lang.ref.Reference", "next", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "head", head);
        setField(queue, "java.lang.ref.ReferenceQueue", "queueLength", 0L);
        setField(delegateMap, "org.apache.commons.collections.map.AbstractReferenceMap", "queue", queue);
        org.apache.commons.collections.map.AbstractHashedMap.HashEntry[] data = new org.apache.commons.collections.map.AbstractHashedMap.HashEntry[39];
        AbstractReferenceMap.ReferenceEntry referenceEntry = ((AbstractReferenceMap.ReferenceEntry) createInstance("org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry"));
        ReferenceMap parent = ((ReferenceMap) createInstance("org.apache.commons.collections.map.ReferenceMap"));
        parent.keyType = -2147483647;
        parent.valueType = 1;
        setField(referenceEntry, "org.apache.commons.collections.map.AbstractReferenceMap$ReferenceEntry", "parent", parent);
        referenceEntry.value = head;
        data[38] = ((AbstractHashedMap.HashEntry) referenceEntry);
        delegateMap.data = data;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap", delegateMap);
        
        /* This test fails because method [org.apache.commons.collections.map.Flat3Map.mapIterator] produces [java.lang.NullPointerException] */
        flat3Map.mapIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.map.Flat3Map.convertToMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertToMap()
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#convertToMap()}
 *  */
    @Test
    public void testConvertToMap() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
        Integer key1 = 2134876111;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        short[] value1 = {};
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1", value1);
        
        AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
        convertToMapMethod.setAccessible(true);
        java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
        convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        Object finalFlat3MapValue1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1");
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
        
        assertEquals(0, finalFlat3MapSize);
        
        assertNull(finalFlat3MapValue1);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#convertToMap()}
 * @utbot.activatesSwitch {@code switch(size)}
 *  */
    @Test
    public void testConvertToMap_SwitchSize() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", -246);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1", -255);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2", -255);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3", -255);
        
        AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
        convertToMapMethod.setAccessible(true);
        java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
        convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        int finalFlat3MapHash1 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash1"));
        int finalFlat3MapHash2 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash2"));
        int finalFlat3MapHash3 = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "hash3"));
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
        
        assertEquals(0, finalFlat3MapSize);
        
        assertEquals(0, finalFlat3MapHash1);
        
        assertEquals(0, finalFlat3MapHash2);
        
        assertEquals(0, finalFlat3MapHash3);
    }
    
    /**
    @utbot.classUnderTest {@link Flat3Map}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.map.Flat3Map#convertToMap()}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testConvertToMap_1() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 1);
            int[] value1 = {};
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1", value1);
            
            AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
            Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
            convertToMapMethod.setAccessible(true);
            java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
            convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
            
            int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
            Object finalFlat3MapValue1 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value1");
            AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
            
            assertEquals(0, finalFlat3MapSize);
            
            assertNull(finalFlat3MapValue1);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method convertToMap()
    
    @Test
    public void testConvertToMap1() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
        Integer key2 = 2134876111;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key2);
        
        AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
        convertToMapMethod.setAccessible(true);
        java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
        convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
        
        assertEquals(0, finalFlat3MapSize);
    }
    
    @Test
    public void testConvertToMap2() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Character key1 = '\uFEA8';
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key1);
        
        AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
        convertToMapMethod.setAccessible(true);
        java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
        convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
        
        assertEquals(0, finalFlat3MapSize);
    }
    
    @Test
    public void testConvertToMap3() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 3);
            Character key3 = '\uFEA1';
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key3", key3);
            Object value3 = createInstance("java.lang.Object");
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3", value3);
            
            AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
            Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
            convertToMapMethod.setAccessible(true);
            java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
            convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
            
            int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
            Object finalFlat3MapValue3 = getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "value3");
            AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
            
            assertEquals(0, finalFlat3MapSize);
            
            assertNull(finalFlat3MapValue3);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    
    @Test
    public void testConvertToMap4() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer key1 = 2134876111;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Character key2 = '\uFEF2';
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        
        AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
        convertToMapMethod.setAccessible(true);
        java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
        convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
        
        assertEquals(0, finalFlat3MapSize);
    }
    
    @Test
    public void testConvertToMap5() throws Exception  {
        Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
        Integer key1 = 443982628;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
        Integer key2 = 443982628;
        setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key2", key2);
        
        AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
        convertToMapMethod.setAccessible(true);
        java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
        convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
        
        int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
        AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
        
        assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
        
        assertEquals(0, finalFlat3MapSize);
    }
    
    @Test
    public void testConvertToMap6() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
            Integer key1 = 0;
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "key1", key1);
            
            AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
            Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
            convertToMapMethod.setAccessible(true);
            java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
            convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
            
            int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
            AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
            
            assertEquals(0, finalFlat3MapSize);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
        }
    }
    
    @Test
    public void testConvertToMap7() throws Exception  {
        Object prevNULL = AbstractHashedMap.NULL;
        try {
            java.lang.Object[] null1 = {};
            Class abstractHashedMapClazz = Class.forName("org.apache.commons.collections.map.AbstractHashedMap");
            setStaticField(abstractHashedMapClazz, "NULL", null1);
            Flat3Map flat3Map = ((Flat3Map) createInstance("org.apache.commons.collections.map.Flat3Map"));
            setField(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size", 2);
            
            AbstractHashedMap initialFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            Class flat3MapClazz = Class.forName("org.apache.commons.collections.map.Flat3Map");
            Method convertToMapMethod = flat3MapClazz.getDeclaredMethod("convertToMap");
            convertToMapMethod.setAccessible(true);
            java.lang.Object[] convertToMapMethodArguments = new java.lang.Object[0];
            convertToMapMethod.invoke(flat3Map, convertToMapMethodArguments);
            
            int finalFlat3MapSize = ((Integer) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "size"));
            AbstractHashedMap finalFlat3MapDelegateMap = ((AbstractHashedMap) getFieldValue(flat3Map, "org.apache.commons.collections.map.Flat3Map", "delegateMap"));
            
            assertFalse(initialFlat3MapDelegateMap == finalFlat3MapDelegateMap);
            
            assertEquals(0, finalFlat3MapSize);
        } finally {
            setStaticField(AbstractHashedMap.class, "NULL", prevNULL);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields954906254726500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields954906254726500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass954906254737000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields954906254726500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass954906254737000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields954906255317100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields954906255317100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass954906255321800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields954906255317100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass954906255321800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields954906255898500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields954906255898500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass954906255900900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields954906255898500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass954906255900900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


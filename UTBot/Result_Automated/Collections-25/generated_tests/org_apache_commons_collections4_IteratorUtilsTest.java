package org.apache.commons.collections4;

import org.junit.Test;
import java.util.Iterator;
import org.apache.commons.collections4.iterators.IteratorIterable;
import java.util.ArrayList;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.CloneTransformer;
import org.apache.commons.collections4.functors.WhileClosure;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.MapTransformer;
import java.util.LinkedHashMap;
import org.apache.commons.collections4.functors.NullPredicate;
import java.util.ListIterator;
import org.apache.commons.collections4.functors.NotPredicate;
import java.lang.reflect.Method;
import org.apache.commons.collections4.iterators.EnumerationIterator;
import java.util.Collection;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.HashSet;
import org.apache.commons.collections4.iterators.EmptyIterator;
import java.util.Stack;
import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections4.iterators.SingletonIterator;
import org.apache.commons.collections4.iterators.SingletonListIterator;
import org.apache.commons.collections4.iterators.ObjectGraphIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import java.util.List;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;
import org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.commons.collections4.iterators.ObjectArrayListIterator;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import java.util.Comparator;
import java.util.BitSet;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.apache.commons.collections4.iterators.LazyIteratorChain;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyIterator;

public final class org_apache_commons_collections4_IteratorUtilsTest {
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.asIterable
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asIterable(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterable(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAsIterable_ThrowNullPointerException() {
        IteratorUtils.asIterable(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asIterable(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterable(java.util.Iterator)}
     */
    @Test
    public void testAsIterable() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorIterable actual = ((IteratorIterable) IteratorUtils.asIterable(iterator));
        
        IteratorIterable expected = ((IteratorIterable) createInstance("org.apache.commons.collections4.iterators.IteratorIterable"));
        Object iterator1 = createInstance("java.util.Collections$EmptyIterator");
        setField(expected, "org.apache.commons.collections4.iterators.IteratorIterable", "iterator", iterator1);
        Iterator typeSafeIterator = ((Iterator) createInstance("org.apache.commons.collections4.iterators.IteratorIterable$1"));
        setField(typeSafeIterator, "org.apache.commons.collections4.iterators.IteratorIterable$1", "val$iterator", iterator1);
        setField(expected, "org.apache.commons.collections4.iterators.IteratorIterable", "typeSafeIterator", typeSafeIterator);
        
        // org.apache.commons.collections4.iterators.IteratorIterable is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.util.Iterator, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#get(java.util.Iterator,int)}
 *  */
    @Test
    public void testGet() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        Object actual = IteratorUtils.get(iterator, 0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#get(java.util.Iterator,int)}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 *  */
    @Test
    public void testGet_INotEqualsNegative1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        Object actual = IteratorUtils.get(iterator, 1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.util.Iterator, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#get(java.util.Iterator,int)}
 * @utbot.invokes {@link org.apache.commons.collections4.CollectionUtils#checkIndexBounds(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: CollectionUtils.checkIndexBounds(i);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_ThrowIndexOutOfBoundsException() {
        IteratorUtils.get(null, -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.util.Iterator, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#get(java.util.Iterator,int)}
 * @utbot.invokes {@link org.apache.commons.collections4.CollectionUtils#checkIndexBounds(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(iterator.hasNext())
 *  */
    @Test
    public void testGet_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.IteratorUtils.get(IteratorUtils.java:1379) */
        IteratorUtils.get(null, 0);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.util.Iterator, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#get(java.util.Iterator,int)}
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetThrowsIOOBE() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorUtils.get(iterator, 3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator)}
     */
    @Test
    public void testToString() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        String actual = IteratorUtils.toString(iterator);
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.util.Iterator)
    
    @Test
    public void testToString1() throws Exception  {
        Class stringValueTransformerClazz = Class.forName("org.apache.commons.collections4.functors.StringValueTransformer");
        Transformer prevINSTANCE = ((Transformer) getStaticFieldValue(stringValueTransformerClazz, "INSTANCE"));
        try {
            StringValueTransformer instance = ((StringValueTransformer) createInstance("org.apache.commons.collections4.functors.StringValueTransformer"));
            setStaticField(stringValueTransformerClazz, "INSTANCE", instance);
            
            String actual = IteratorUtils.toString(null);
            
            String expected = "[]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StringValueTransformer.class, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test
    public void testToString2() throws Exception  {
        Class stringValueTransformerClazz = Class.forName("org.apache.commons.collections4.functors.StringValueTransformer");
        Transformer prevINSTANCE = ((Transformer) getStaticFieldValue(stringValueTransformerClazz, "INSTANCE"));
        try {
            StringValueTransformer instance = ((StringValueTransformer) createInstance("org.apache.commons.collections4.functors.StringValueTransformer"));
            setStaticField(stringValueTransformerClazz, "INSTANCE", instance);
            ArrayList arrayList = new ArrayList();
            java.lang.Object[] objectArray = new java.lang.Object[7];
            objectArray[0] = objectArray;
            objectArray[1] = objectArray;
            objectArray[2] = objectArray;
            objectArray[3] = objectArray;
            objectArray[4] = objectArray;
            objectArray[5] = objectArray;
            objectArray[6] = objectArray;
            arrayList.add(objectArray);
            arrayList.add(objectArray);
            arrayList.add(objectArray);
            arrayList.add(objectArray);
            arrayList.add(objectArray);
            arrayList.add(objectArray);
            arrayList.add(objectArray);
            Iterator iterator = arrayList.iterator();
            
            String actual = IteratorUtils.toString(iterator);
            
            String expected = "[[Ljava.lang.Object;@14367101, [Ljava.lang.Object;@14367101, [Ljava.lang.Object;@14367101, [Ljava.lang.Object;@14367101, [Ljava.lang.Object;@14367101, [Ljava.lang.Object;@14367101, [Ljava.lang.Object;@14367101]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(StringValueTransformer.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer)}
 * @utbot.invokes {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testToString_IteratorUtilsToString() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        java.lang.Class[] iParamTypes = {null};
        setField(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iParamTypes", iParamTypes);
        
        String actual = IteratorUtils.toString(iterator, invokerTransformer);
        
        String expected = "[null, null, null, null, null, null, null]";
        
        assertEquals(expected, actual);
        
        java.lang.Class[] invokerTransformerIParamTypes = ((java.lang.Class[]) getFieldValue(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iParamTypes"));
        Class finalInvokerTransformerIParamTypes0 = ((Class) get(invokerTransformerIParamTypes, 0));
        
        assertNull(finalInvokerTransformerIParamTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer)}
 * @utbot.invokes {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toString(iterator, transformer, DEFAULT_TOSTRING_DELIMITER, DEFAULT_TOSTRING_PREFIX, DEFAULT_TOSTRING_SUFFIX);
 *  */
    @Test(expected = NullPointerException.class)
    public void testToString_ThrowNullPointerException() {
        IteratorUtils.toString(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (transformer == null): False}
 * @utbot.executesCondition {@code (delimiter == null): False}
 * @utbot.executesCondition {@code (prefix == null): False}
 * @utbot.executesCondition {@code (suffix == null): False}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 *  */
    @Test
    public void testToString_IteratorHasNext() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        java.lang.Class[] iParamTypes = {null};
        setField(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iParamTypes", iParamTypes);
        String string = "";
        
        String actual = IteratorUtils.toString(iterator, invokerTransformer, string, string, string);
        
        String expected = "nullnullnullnullnullnullnull";
        
        assertEquals(expected, actual);
        
        java.lang.Class[] invokerTransformerIParamTypes = ((java.lang.Class[]) getFieldValue(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iParamTypes"));
        Class finalInvokerTransformerIParamTypes0 = ((Class) get(invokerTransformerIParamTypes, 0));
        
        assertNull(finalInvokerTransformerIParamTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (transformer == null): False}
 * @utbot.executesCondition {@code (delimiter == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: delimiter == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        
        IteratorUtils.toString(null, invokerTransformer, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (transformer == null): False}
 * @utbot.executesCondition {@code (delimiter == null): False}
 * @utbot.executesCondition {@code (prefix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prefix == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToString_ThrowNullPointerException_2() throws Exception  {
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        String string = "";
        
        IteratorUtils.toString(null, invokerTransformer, string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (transformer == null): False}
 * @utbot.executesCondition {@code (delimiter == null): False}
 * @utbot.executesCondition {@code (prefix == null): False}
 * @utbot.executesCondition {@code (suffix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: suffix == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToString_ThrowNullPointerException_3() throws Exception  {
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        String string = "";
        
        IteratorUtils.toString(null, invokerTransformer, string, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toString(java.util.Iterator,org.apache.commons.collections4.Transformer,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (transformer == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: transformer == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToString_ThrowNullPointerException1() {
        IteratorUtils.toString(null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer, java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testToString3() throws Exception  {
        CloneTransformer cloneTransformer = ((CloneTransformer) createInstance("org.apache.commons.collections4.functors.CloneTransformer"));
        String string = "";
        String string1 = "";
        
        String actual = IteratorUtils.toString(null, cloneTransformer, string, string1, string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        CloneTransformer cloneTransformer = ((CloneTransformer) createInstance("org.apache.commons.collections4.functors.CloneTransformer"));
        String string = "";
        
        String actual = IteratorUtils.toString(iterator, cloneTransformer, string, string, string);
        
        String expected = "nullnullnull";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer, java.lang.String, java.lang.String, java.lang.String)
    
    @Test(expected = FunctorException.class)
    public void testToString5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        String string = "";
        arrayList.add(string);
        arrayList.add(string);
        arrayList.add(string);
        Iterator iterator = arrayList.iterator();
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        String iMethodName = "";
        setField(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iMethodName", iMethodName);
        java.lang.Class[] iParamTypes = {null, null, null, null, null, null, null, null, null};
        setField(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iParamTypes", iParamTypes);
        
        IteratorUtils.toString(iterator, invokerTransformer, string, string, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(java.util.Iterator, org.apache.commons.collections4.Transformer, java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testToString6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        String string = "";
        arrayList.add(string);
        arrayList.add(string);
        arrayList.add(string);
        arrayList.add(string);
        arrayList.add(string);
        arrayList.add(string);
        arrayList.add(string);
        Iterator iterator = arrayList.iterator();
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.toString] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.lang.Class.getMethod(Class.java:2219)
            org.apache.commons.collections4.functors.InvokerTransformer.transform(InvokerTransformer.java:128)
            org.apache.commons.collections4.IteratorUtils.toString(IteratorUtils.java:1488) */
        IteratorUtils.toString(iterator, invokerTransformer, string, string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#isEmpty(java.util.Iterator)}
 * @utbot.returnsFrom {@code return iterator == null || !iterator.hasNext();}
 *  */
    @Test
    public void testIsEmpty_IteratorEqualsNullOrNotIteratorHasNext() {
        boolean actual = IteratorUtils.isEmpty(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#isEmpty(java.util.Iterator)}
 * @utbot.invokes {@link java.util.Iterator#hasNext()}
 * @utbot.returnsFrom {@code return iterator == null || !iterator.hasNext();}
 *  */
    @Test
    public void testIsEmpty_IteratorEqualsNullOrNotIteratorHasNext_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        boolean actual = IteratorUtils.isEmpty(iterator);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#isEmpty(java.util.Iterator)}
     */
    @Test
    public void testIsEmptyReturnsTrue() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        boolean actual = IteratorUtils.isEmpty(iterator);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#size(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator != null): False}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_IteratorEqualsNull() {
        int actual = IteratorUtils.size(null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#size(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_IteratorHasNext() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        int actual = IteratorUtils.size(iterator);
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method size(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#size(java.util.Iterator)}
     */
    @Test
    public void testSizeReturnsZero() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        int actual = IteratorUtils.size(iterator);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toArray(java.util.Iterator)}
 * @utbot.returnsFrom {@code return list.toArray();}
 *  */
    @Test
    public void testToArray_ReturnListToArray() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        
        java.lang.Object[] actual = IteratorUtils.toArray(iterator);
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toArray(java.util.Iterator)}
 * @utbot.returnsFrom {@code return list.toArray();}
 *  */
    @Test
    public void testToArray_ReturnListToArray_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        java.lang.Object[] actual = IteratorUtils.toArray(iterator);
        
        java.lang.Object[] expected = {null, null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toArray(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toArray(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToArray_ThrowNullPointerException() {
        IteratorUtils.toArray(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toArray
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toArray(java.util.Iterator, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toArray(java.util.Iterator,java.lang.Class)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToArray_ThrowNullPointerException1() {
        IteratorUtils.toArray(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.apply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method apply(java.util.Iterator, org.apache.commons.collections4.Closure)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#apply(java.util.Iterator,org.apache.commons.collections4.Closure)}
 * @utbot.executesCondition {@code (closure == null): False}
 * @utbot.executesCondition {@code (iterator != null): False}
 *  */
    @Test
    public void testApply_IteratorEqualsNull() {
        WhileClosure whileClosure = new WhileClosure(null, null, false);
        
        IteratorUtils.apply(null, whileClosure);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method apply(java.util.Iterator, org.apache.commons.collections4.Closure)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#apply(java.util.Iterator,org.apache.commons.collections4.Closure)}
 * @utbot.executesCondition {@code (closure == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: closure == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testApply_ThrowNullPointerException() {
        IteratorUtils.apply(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method apply(java.util.Iterator, org.apache.commons.collections4.Closure)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#apply(java.util.Iterator,org.apache.commons.collections4.Closure)}
 * @utbot.executesCondition {@code (closure == null): False}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testApply_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        WhileClosure whileClosure = new WhileClosure(null, null, false);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.WhileClosure.execute(WhileClosure.java:88)
            org.apache.commons.collections4.IteratorUtils.apply(IteratorUtils.java:1243) */
        IteratorUtils.apply(iterator, whileClosure);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method apply(java.util.Iterator, org.apache.commons.collections4.Closure)
    
    @Test
    public void testApply1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        TransformerClosure transformerClosure = new TransformerClosure(invokerTransformer);
        IfClosure ifClosure = new IfClosure(nullIsFalsePredicate, null, transformerClosure);
        
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        TransformerClosure transformerClosure = new TransformerClosure(invokerTransformer);
        IfClosure ifClosure = new IfClosure(orPredicate, null, transformerClosure);
        
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        TransformerClosure transformerClosure = new TransformerClosure(invokerTransformer);
        
        IteratorUtils.apply(iterator, transformerClosure);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method apply(java.util.Iterator, org.apache.commons.collections4.Closure)
    
    @Test(expected = FunctorException.class)
    public void testApply4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object subCursor = createInstance("org.apache.commons.collections4.list.CursorableLinkedList$SubCursor");
        arrayList.add(subCursor);
        arrayList.add(subCursor);
        arrayList.add(subCursor);
        arrayList.add(subCursor);
        arrayList.add(subCursor);
        arrayList.add(subCursor);
        arrayList.add(subCursor);
        Iterator iterator = arrayList.iterator();
        InvokerTransformer invokerTransformer = ((InvokerTransformer) createInstance("org.apache.commons.collections4.functors.InvokerTransformer"));
        String iMethodName = "";
        setField(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iMethodName", iMethodName);
        java.lang.Class[] iParamTypes = {null, null, null, null, null, null, null, null, null};
        setField(invokerTransformer, "org.apache.commons.collections4.functors.InvokerTransformer", "iParamTypes", iParamTypes);
        TransformerClosure transformerClosure = new TransformerClosure(invokerTransformer);
        
        IteratorUtils.apply(iterator, transformerClosure);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method apply(java.util.Iterator, org.apache.commons.collections4.Closure)
    
    @Test(expected = StackOverflowError.class)
    public void testApply5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        IfClosure ifClosure = ((IfClosure) createInstance("org.apache.commons.collections4.functors.IfClosure"));
        NullIsFalsePredicate iPredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(ifClosure, "org.apache.commons.collections4.functors.IfClosure", "iPredicate", iPredicate);
        setField(ifClosure, "org.apache.commons.collections4.functors.IfClosure", "iFalseClosure", ifClosure);
        IfClosure ifClosure1 = new IfClosure(nullIsFalsePredicate, null, ifClosure);
        IfClosure ifClosure2 = new IfClosure(nullIsFalsePredicate, null, ifClosure1);
        
        IteratorUtils.apply(iterator, ifClosure2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testApply6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate2", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        IfClosure ifClosure = new IfClosure(orPredicate2, null, null);
        
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testApply7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        IfClosure ifClosure = new IfClosure(orPredicate1, null, null);
        
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply8() throws Exception  {
        ArrayList arrayList = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[7];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        objectArray[3] = objectArray;
        objectArray[4] = objectArray;
        objectArray[5] = objectArray;
        objectArray[6] = objectArray;
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        arrayList.add(objectArray);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        MapTransformer mapTransformer = ((MapTransformer) createInstance("org.apache.commons.collections4.functors.MapTransformer"));
        LinkedHashMap iMap = new LinkedHashMap();
        setField(mapTransformer, "org.apache.commons.collections4.functors.MapTransformer", "iMap", iMap);
        TransformerClosure transformerClosure = new TransformerClosure(mapTransformer);
        IfClosure ifClosure = new IfClosure(nullIsFalsePredicate, null, transformerClosure);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException] */
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply9() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate1);
        IfClosure ifClosure = new IfClosure(nullIsFalsePredicate, null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.IfClosure.execute(IfClosure.java:122)
            org.apache.commons.collections4.IteratorUtils.apply(IteratorUtils.java:1243) */
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply10() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        IfClosure ifClosure = new IfClosure(orPredicate, null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException] */
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply11() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        IfClosure ifClosure = new IfClosure(nullIsFalsePredicate2, null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException] */
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply12() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        IfClosure ifClosure = new IfClosure(orPredicate1, null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException] */
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply13() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        Object object1 = new Object();
        arrayList.add(object1);
        arrayList.add(object1);
        arrayList.add(object1);
        arrayList.add(object1);
        arrayList.add(object1);
        arrayList.add(object1);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        MapTransformer mapTransformer = ((MapTransformer) createInstance("org.apache.commons.collections4.functors.MapTransformer"));
        LinkedHashMap iMap = new LinkedHashMap();
        Object object2 = createInstance("java.lang.Object");
        iMap.put(null, object2);
        setField(mapTransformer, "org.apache.commons.collections4.functors.MapTransformer", "iMap", iMap);
        TransformerClosure transformerClosure = new TransformerClosure(mapTransformer);
        IfClosure ifClosure = new IfClosure(nullIsFalsePredicate, null, transformerClosure);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.NullIsFalsePredicate.evaluate(NullIsFalsePredicate.java:74)
            org.apache.commons.collections4.functors.IfClosure.execute(IfClosure.java:119)
            org.apache.commons.collections4.IteratorUtils.apply(IteratorUtils.java:1243) */
        IteratorUtils.apply(iterator, ifClosure);
    }
    
    @Test
    public void testApply14() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(null);
        IfClosure ifClosure = new IfClosure(nullIsFalsePredicate1, null, null);
        IfClosure ifClosure1 = new IfClosure(orPredicate, null, ifClosure);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.IfClosure.execute(IfClosure.java:122)
            org.apache.commons.collections4.functors.IfClosure.execute(IfClosure.java:122)
            org.apache.commons.collections4.IteratorUtils.apply(IteratorUtils.java:1243) */
        IteratorUtils.apply(iterator, ifClosure1);
    }
    
    @Test
    public void testApply15() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        IfClosure ifClosure = new IfClosure(orPredicate2, null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.apply] produces [java.lang.NullPointerException] */
        IteratorUtils.apply(iterator, ifClosure);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toList
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toList(java.util.Iterator, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator,int)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToList_ThrowNullPointerException() {
        IteratorUtils.toList(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toList(java.util.Iterator, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator,int)}
     */
    @Test
    public void testToList() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        ArrayList actual = ((ArrayList) IteratorUtils.toList(iterator, 3));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toList(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator)}
 * @utbot.returnsFrom {@code return toList(iterator, 10);}
 *  */
    @Test
    public void testToList_ReturnToList() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        
        ArrayList actual = ((ArrayList) IteratorUtils.toList(iterator));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator)}
 * @utbot.returnsFrom {@code return toList(iterator, 10);}
 *  */
    @Test
    public void testToList_ReturnToList_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        ArrayList actual = ((ArrayList) IteratorUtils.toList(iterator));
        
        ArrayList expected = new ArrayList();
        expected.add(null);
        expected.add(null);
        expected.add(null);
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toList(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator)}
 * @utbot.invokes {@link org.apache.commons.collections4.IteratorUtils#toList(java.util.Iterator,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toList(iterator, 10);
 *  */
    @Test(expected = NullPointerException.class)
    public void testToList_ThrowNullPointerException1() {
        IteratorUtils.toList(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.util.Iterator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator,java.lang.Object)}
 * @utbot.returnsFrom {@code return matchesAny(iterator, EqualPredicate.equalPredicate(object));}
 *  */
    @Test
    public void testContains_ReturnMatchesAny() {
        byte[] byteArray = {};
        
        boolean actual = IteratorUtils.contains(null, byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator,java.lang.Object)}
 * @utbot.returnsFrom {@code return matchesAny(iterator, EqualPredicate.equalPredicate(object));}
 *  */
    @Test
    public void testContains_ReturnMatchesAny_1() throws Exception  {
        Predicate prevINSTANCE = NullPredicate.INSTANCE;
        try {
            NullPredicate instance = ((NullPredicate) createInstance("org.apache.commons.collections4.functors.NullPredicate"));
            Class nullPredicateClazz = Class.forName("org.apache.commons.collections4.functors.NullPredicate");
            setStaticField(nullPredicateClazz, "INSTANCE", instance);
            
            boolean actual = IteratorUtils.contains(null, null);
            
            assertFalse(actual);
        } finally {
            setStaticField(NullPredicate.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains(java.util.Iterator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#contains(java.util.Iterator,java.lang.Object)}
     */
    @Test
    public void testContainsReturnsFalse() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        boolean actual = IteratorUtils.contains(iterator, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contains(java.util.Iterator, java.lang.Object)
    
    @Test
    public void testContains1() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        
        boolean actual = IteratorUtils.contains(iterator, arrayList);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains2() {
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = arrayList.listIterator();
        arrayList.add(listIterator);
        arrayList.add(listIterator);
        arrayList.add(listIterator);
        Iterator iterator = arrayList.iterator();
        ArrayList arrayList1 = new ArrayList();
        
        boolean actual = IteratorUtils.contains(iterator, arrayList1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains3() {
        ArrayList arrayList = new ArrayList();
        Long long1 = 0L;
        arrayList.add(long1);
        arrayList.add(long1);
        arrayList.add(long1);
        arrayList.add(long1);
        arrayList.add(long1);
        arrayList.add(long1);
        arrayList.add(long1);
        Iterator iterator = arrayList.iterator();
        
        boolean actual = IteratorUtils.contains(iterator, long1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testContains4() throws Exception  {
        Predicate prevINSTANCE = NullPredicate.INSTANCE;
        try {
            NullPredicate instance = ((NullPredicate) createInstance("org.apache.commons.collections4.functors.NullPredicate"));
            Class nullPredicateClazz = Class.forName("org.apache.commons.collections4.functors.NullPredicate");
            setStaticField(nullPredicateClazz, "INSTANCE", instance);
            ArrayList arrayList = new ArrayList();
            arrayList.add(null);
            arrayList.add(null);
            arrayList.add(null);
            Iterator iterator = arrayList.iterator();
            
            boolean actual = IteratorUtils.contains(iterator, null);
            
            assertTrue(actual);
        } finally {
            setStaticField(NullPredicate.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.find
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method find(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#find(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (iterator != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFind_IteratorEqualsNull() {
        NotPredicate notPredicate = new NotPredicate(null);
        
        Object actual = IteratorUtils.find(null, notPredicate);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#find(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFind_NotPredicateEvaluate() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        
        Object actual = IteratorUtils.find(iterator, nullIsFalsePredicate);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method find(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#find(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: predicate == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testFind_ThrowNullPointerException() {
        IteratorUtils.find(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method find(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#find(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): False}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testFind_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NotPredicate notPredicate = new NotPredicate(null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.find] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.NotPredicate.evaluate(NotPredicate.java:70)
            org.apache.commons.collections4.IteratorUtils.find(IteratorUtils.java:1268) */
        IteratorUtils.find(iterator, notPredicate);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method find(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    @Test(expected = StackOverflowError.class)
    public void testFind1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object mapNIterator = createInstance("java.util.ImmutableCollections$MapN$MapNIterator");
        arrayList.add(mapNIterator);
        arrayList.add(mapNIterator);
        arrayList.add(mapNIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        NullIsFalsePredicate nullIsFalsePredicate3 = new NullIsFalsePredicate(nullIsFalsePredicate2);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate3, null);
        
        IteratorUtils.find(iterator, orPredicate1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFind2() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object mapNIterator = createInstance("java.util.ImmutableCollections$MapN$MapNIterator");
        arrayList.add(mapNIterator);
        arrayList.add(mapNIterator);
        arrayList.add(mapNIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate2, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        IteratorUtils.find(iterator, orPredicate2);
    }
    
    @Test
    public void testFind3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate2, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.find] produces [java.lang.NullPointerException] */
        IteratorUtils.find(iterator, orPredicate1);
    }
    
    @Test
    public void testFind4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        OrPredicate iPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(iPredicate1, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        setField(iPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", iPredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate2, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.find] produces [java.lang.NullPointerException] */
        IteratorUtils.find(iterator, orPredicate2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.asIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asIterator(java.util.Enumeration)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration)}
 * @utbot.executesCondition {@code (enumeration == null): False}
 * @utbot.returnsFrom {@code return new EnumerationIterator<E>(enumeration);}
 *  */
    @Test
    public void testAsIterator_EnumerationNotEqualsNull() throws Exception  {
        Object permissionsEnumerator = createInstance("java.security.PermissionsEnumerator");
        
        Class iteratorUtilsClazz = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class permissionsEnumeratorType = Class.forName("java.util.Enumeration");
        Method asIteratorMethod = iteratorUtilsClazz.getDeclaredMethod("asIterator", permissionsEnumeratorType);
        asIteratorMethod.setAccessible(true);
        java.lang.Object[] asIteratorMethodArguments = new java.lang.Object[1];
        asIteratorMethodArguments[0] = permissionsEnumerator;
        EnumerationIterator actual = ((EnumerationIterator) asIteratorMethod.invoke(null, asIteratorMethodArguments));
        
        EnumerationIterator expected = ((EnumerationIterator) createInstance("org.apache.commons.collections4.iterators.EnumerationIterator"));
        Class enumerationIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EnumerationIterator");
        Method setEnumerationMethod = enumerationIteratorClazz.getDeclaredMethod("setEnumeration", permissionsEnumeratorType);
        setEnumerationMethod.setAccessible(true);
        java.lang.Object[] setEnumerationMethodArguments = new java.lang.Object[1];
        setEnumerationMethodArguments[0] = permissionsEnumerator;
        setEnumerationMethod.invoke(expected, setEnumerationMethodArguments);
        
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections4.iterators.EnumerationIterator", "collection"));
        assertNull(actualCollection);
        
        Enumeration expectedEnumeration = expected.getEnumeration();
        Enumeration actualEnumeration = actual.getEnumeration();
        Iterator actualEnumerationPerms = ((Iterator) getFieldValue(actualEnumeration, "java.security.PermissionsEnumerator", "perms"));
        assertNull(actualEnumerationPerms);
        
        Enumeration actualEnumerationPermset = ((Enumeration) getFieldValue(actualEnumeration, "java.security.PermissionsEnumerator", "permset"));
        assertNull(actualEnumerationPermset);
        
        Object actualLast = getFieldValue(actual, "org.apache.commons.collections4.iterators.EnumerationIterator", "last");
        assertNull(actualLast);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asIterator(java.util.Enumeration)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration)}
 * @utbot.executesCondition {@code (enumeration == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: enumeration == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAsIterator_ThrowNullPointerException() {
        IteratorUtils.asIterator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.asIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asIterator(java.util.Enumeration, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)}
 * @utbot.executesCondition {@code (enumeration == null): False}
 * @utbot.executesCondition {@code (removeCollection == null): False}
 * @utbot.returnsFrom {@code return new EnumerationIterator<E>(enumeration, removeCollection);}
 *  */
    @Test
    public void testAsIterator_RemoveCollectionNotEqualsNull() throws Exception  {
        StringTokenizer stringTokenizer = ((StringTokenizer) createInstance("java.util.StringTokenizer"));
        HashSet hashSet = new HashSet();
        
        EnumerationIterator actual = ((EnumerationIterator) IteratorUtils.asIterator(stringTokenizer, hashSet));
        
        EnumerationIterator expected = ((EnumerationIterator) createInstance("org.apache.commons.collections4.iterators.EnumerationIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.EnumerationIterator", "collection", hashSet);
        expected.setEnumeration(stringTokenizer);
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections4.iterators.EnumerationIterator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections4.iterators.EnumerationIterator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
        Enumeration expectedEnumeration = expected.getEnumeration();
        Enumeration actualEnumeration = actual.getEnumeration();
        int expectedEnumerationCurrentPosition = ((Integer) getFieldValue(expectedEnumeration, "java.util.StringTokenizer", "currentPosition"));
        int actualEnumerationCurrentPosition = ((Integer) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "currentPosition"));
        assertEquals(expectedEnumerationCurrentPosition, actualEnumerationCurrentPosition);
        
        int expectedEnumerationNewPosition = ((Integer) getFieldValue(expectedEnumeration, "java.util.StringTokenizer", "newPosition"));
        int actualEnumerationNewPosition = ((Integer) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "newPosition"));
        assertEquals(expectedEnumerationNewPosition, actualEnumerationNewPosition);
        
        int expectedEnumerationMaxPosition = ((Integer) getFieldValue(expectedEnumeration, "java.util.StringTokenizer", "maxPosition"));
        int actualEnumerationMaxPosition = ((Integer) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "maxPosition"));
        assertEquals(expectedEnumerationMaxPosition, actualEnumerationMaxPosition);
        
        String actualEnumerationStr = ((String) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "str"));
        assertNull(actualEnumerationStr);
        
        String actualEnumerationDelimiters = ((String) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "delimiters"));
        assertNull(actualEnumerationDelimiters);
        
        boolean actualEnumerationRetDelims = ((Boolean) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "retDelims"));
        assertFalse(actualEnumerationRetDelims);
        
        boolean actualEnumerationDelimsChanged = ((Boolean) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "delimsChanged"));
        assertFalse(actualEnumerationDelimsChanged);
        
        int expectedEnumerationMaxDelimCodePoint = ((Integer) getFieldValue(expectedEnumeration, "java.util.StringTokenizer", "maxDelimCodePoint"));
        int actualEnumerationMaxDelimCodePoint = ((Integer) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "maxDelimCodePoint"));
        assertEquals(expectedEnumerationMaxDelimCodePoint, actualEnumerationMaxDelimCodePoint);
        
        boolean actualEnumerationHasSurrogates = ((Boolean) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "hasSurrogates"));
        assertFalse(actualEnumerationHasSurrogates);
        
        int[] actualEnumerationDelimiterCodePoints = ((int[]) getFieldValue(actualEnumeration, "java.util.StringTokenizer", "delimiterCodePoints"));
        assertNull(actualEnumerationDelimiterCodePoints);
        
        Object actualLast = getFieldValue(actual, "org.apache.commons.collections4.iterators.EnumerationIterator", "last");
        assertNull(actualLast);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asIterator(java.util.Enumeration, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)}
 * @utbot.executesCondition {@code (enumeration == null): False}
 * @utbot.executesCondition {@code (removeCollection == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: removeCollection == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAsIterator_ThrowNullPointerException_1() throws Throwable  {
        Object permissionsEnumerator = createInstance("java.security.PermissionsEnumerator");
        
        Class iteratorUtilsClazz = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class permissionsEnumeratorType = Class.forName("java.util.Enumeration");
        Class collectionType = Class.forName("java.util.Collection");
        Method asIteratorMethod = iteratorUtilsClazz.getDeclaredMethod("asIterator", permissionsEnumeratorType, collectionType);
        asIteratorMethod.setAccessible(true);
        java.lang.Object[] asIteratorMethodArguments = new java.lang.Object[2];
        asIteratorMethodArguments[0] = permissionsEnumerator;
        asIteratorMethodArguments[1] = ((Object) null);
        try {
            asIteratorMethod.invoke(null, asIteratorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asIterator(java.util.Enumeration,java.util.Collection)}
 * @utbot.executesCondition {@code (enumeration == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: enumeration == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAsIterator_ThrowNullPointerException1() {
        IteratorUtils.asIterator(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.emptyIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyIterator()
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#emptyIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.EmptyIterator#resettableEmptyIterator()}
 * @utbot.returnsFrom {@code return EmptyIterator.<E>resettableEmptyIterator();}
 *  */
    @Test
    public void testEmptyIterator_EmptyIteratorResettableEmptyIterator() throws Exception  {
        ResettableIterator prevRESETTABLE_INSTANCE = EmptyIterator.RESETTABLE_INSTANCE;
        try {
            EmptyIterator resettableInstance = ((EmptyIterator) createInstance("org.apache.commons.collections4.iterators.EmptyIterator"));
            Class emptyIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EmptyIterator");
            setStaticField(emptyIteratorClazz, "RESETTABLE_INSTANCE", resettableInstance);
            
            EmptyIterator actual = ((EmptyIterator) IteratorUtils.emptyIterator());
            
        } finally {
            setStaticField(EmptyIterator.class, "RESETTABLE_INSTANCE", prevRESETTABLE_INSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.getIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIterator(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (obj instanceof Iterator): False}
 * @utbot.executesCondition {@code (obj instanceof Iterable): True}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return ((Iterable<?>) obj).iterator();}
 *  */
    @Test
    public void testGetIterator_ObjInstanceOfIterable() throws Exception  {
        Stack stack = ((Stack) createInstance("java.util.Stack"));
        
        Object actual = IteratorUtils.getIterator(stack);
        
        Object expected = createInstance("java.util.Vector$Itr");
        
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (obj instanceof Iterator): False}
 * @utbot.executesCondition {@code (obj instanceof Iterable): False}
 * @utbot.executesCondition {@code (obj instanceof Object[]): True}
 * @utbot.returnsFrom {@code return new ObjectArrayIterator<Object>((Object[]) obj);}
 *  */
    @Test
    public void testGetIterator_ObjInstanceOfObject() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayIterator actual = ((ObjectArrayIterator) IteratorUtils.getIterator(objectArray));
        
        ObjectArrayIterator expected = ((ObjectArrayIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.invokes {@link org.apache.commons.collections4.IteratorUtils#emptyIterator()}
 * @utbot.returnsFrom {@code return emptyIterator();}
 *  */
    @Test
    public void testGetIterator_ObjEqualsNull() throws Exception  {
        ResettableIterator prevRESETTABLE_INSTANCE = EmptyIterator.RESETTABLE_INSTANCE;
        try {
            EmptyIterator resettableInstance = ((EmptyIterator) createInstance("org.apache.commons.collections4.iterators.EmptyIterator"));
            Class emptyIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EmptyIterator");
            setStaticField(emptyIteratorClazz, "RESETTABLE_INSTANCE", resettableInstance);
            
            EmptyIterator actual = ((EmptyIterator) IteratorUtils.getIterator(null));
            
        } finally {
            setStaticField(EmptyIterator.class, "RESETTABLE_INSTANCE", prevRESETTABLE_INSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIterator(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#getIterator(java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (obj instanceof Iterator): False}
 * @utbot.executesCondition {@code (obj instanceof Iterable): True}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Iterable<?>) obj).iterator();
 *  */
    @Test
    public void testGetIterator_ThrowNullPointerException() throws Exception  {
        ConcurrentSkipListSet concurrentSkipListSet = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(concurrentSkipListSet, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.getIterator] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.concurrent.ConcurrentSkipListMap$KeySet.iterator(ConcurrentSkipListMap.java:2196)
            java.base/java.util.concurrent.ConcurrentSkipListSet.iterator(ConcurrentSkipListSet.java:277)
            org.apache.commons.collections4.IteratorUtils.getIterator(IteratorUtils.java:1181) */
        IteratorUtils.getIterator(concurrentSkipListSet);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getIterator(java.lang.Object)
    
    @Test
    public void testGetIterator1() throws Exception  {
        ConcurrentSkipListSet concurrentSkipListSet = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        Object key = createInstance("java.lang.Object");
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "val", key);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "right", head);
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        Object m1 = createInstance("java.util.concurrent.ConcurrentSkipListMap$SubMap");
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "m", m);
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "hi", key);
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "hiInclusive", true);
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "isDescending", true);
        setField(keySet, "java.util.concurrent.ConcurrentSkipListMap$KeySet", "m", m1);
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(concurrentSkipListSet, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.getIterator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Comparable (java.lang.Object and java.lang.Comparable are in module java.base of loader 'bootstrap')]
            java.base/java.util.concurrent.ConcurrentSkipListMap.cpr(ConcurrentSkipListMap.java:393)
            java.base/java.util.concurrent.ConcurrentSkipListMap.findPredecessor(ConcurrentSkipListMap.java:477)
            java.base/java.util.concurrent.ConcurrentSkipListMap.findNear(ConcurrentSkipListMap.java:1019)
            java.base/java.util.concurrent.ConcurrentSkipListMap$SubMap.hiNode(ConcurrentSkipListMap.java:2477)
            java.base/java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapIter.<init>(ConcurrentSkipListMap.java:2890)
            java.base/java.util.concurrent.ConcurrentSkipListMap$SubMap$SubMapKeyIterator.<init>(ConcurrentSkipListMap.java:2994)
            java.base/java.util.concurrent.ConcurrentSkipListMap$KeySet.iterator(ConcurrentSkipListMap.java:2196)
            java.base/java.util.concurrent.ConcurrentSkipListSet.iterator(ConcurrentSkipListSet.java:277)
            org.apache.commons.collections4.IteratorUtils.getIterator(IteratorUtils.java:1181) */
        IteratorUtils.getIterator(concurrentSkipListSet);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getIterator(java.lang.Object)
    
    @Test(timeout = 1000L)
    public void testGetIterator2() throws Exception  {
        ConcurrentSkipListSet concurrentSkipListSet = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "right", head);
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        Object m1 = createInstance("java.util.concurrent.ConcurrentSkipListMap$SubMap");
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "m", m);
        Object lo = createInstance("java.lang.Object");
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "lo", lo);
        setField(keySet, "java.util.concurrent.ConcurrentSkipListMap$KeySet", "m", m1);
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(concurrentSkipListSet, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        IteratorUtils.getIterator(concurrentSkipListSet);
    }
    
    @Test(timeout = 1000L)
    public void testGetIterator3() throws Exception  {
        ConcurrentSkipListSet concurrentSkipListSet = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object head = createInstance("java.util.concurrent.ConcurrentSkipListMap$Index");
        Object node = createInstance("java.util.concurrent.ConcurrentSkipListMap$Node");
        Object key = createInstance("java.lang.Object");
        setField(node, "java.util.concurrent.ConcurrentSkipListMap$Node", "key", key);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "node", node);
        setField(head, "java.util.concurrent.ConcurrentSkipListMap$Index", "right", head);
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "head", head);
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        Object m1 = createInstance("java.util.concurrent.ConcurrentSkipListMap$SubMap");
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "m", m);
        setField(m1, "java.util.concurrent.ConcurrentSkipListMap$SubMap", "lo", key);
        setField(keySet, "java.util.concurrent.ConcurrentSkipListMap$KeySet", "m", m1);
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(concurrentSkipListSet, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        IteratorUtils.getIterator(concurrentSkipListSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.emptyListIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyListIterator()
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#emptyListIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.EmptyListIterator#resettableEmptyListIterator()}
 * @utbot.returnsFrom {@code return EmptyListIterator.<E>resettableEmptyListIterator();}
 *  */
    @Test
    public void testEmptyListIterator_EmptyListIteratorResettableEmptyListIterator() throws Exception  {
        ResettableListIterator prevRESETTABLE_INSTANCE = EmptyListIterator.RESETTABLE_INSTANCE;
        try {
            EmptyListIterator resettableInstance = ((EmptyListIterator) createInstance("org.apache.commons.collections4.iterators.EmptyListIterator"));
            Class emptyListIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EmptyListIterator");
            setStaticField(emptyListIteratorClazz, "RESETTABLE_INSTANCE", resettableInstance);
            
            EmptyListIterator actual = ((EmptyListIterator) IteratorUtils.emptyListIterator());
            
        } finally {
            setStaticField(EmptyListIterator.class, "RESETTABLE_INSTANCE", prevRESETTABLE_INSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.singletonIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method singletonIterator(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#singletonIterator(java.lang.Object)}
 * @utbot.returnsFrom {@code return new SingletonIterator<E>(object);}
 *  */
    @Test
    public void testSingletonIterator_Return() throws Exception  {
        SingletonIterator actual = ((SingletonIterator) IteratorUtils.singletonIterator(null));
        
        SingletonIterator expected = ((SingletonIterator) createInstance("org.apache.commons.collections4.iterators.SingletonIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.SingletonIterator", "removeAllowed", true);
        setField(expected, "org.apache.commons.collections4.iterators.SingletonIterator", "beforeFirst", true);
        
        boolean actualRemoveAllowed = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonIterator", "removeAllowed"));
        assertTrue(actualRemoveAllowed);
        
        boolean actualBeforeFirst = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonIterator", "beforeFirst"));
        assertTrue(actualBeforeFirst);
        
        boolean actualRemoved = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonIterator", "removed"));
        assertFalse(actualRemoved);
        
        Object actualObject = getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonIterator", "object");
        assertNull(actualObject);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.singletonListIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method singletonListIterator(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#singletonListIterator(java.lang.Object)}
 * @utbot.returnsFrom {@code return new SingletonListIterator<E>(object);}
 *  */
    @Test
    public void testSingletonListIterator_Return() throws Exception  {
        SingletonListIterator actual = ((SingletonListIterator) IteratorUtils.singletonListIterator(null));
        
        SingletonListIterator expected = ((SingletonListIterator) createInstance("org.apache.commons.collections4.iterators.SingletonListIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.SingletonListIterator", "beforeFirst", true);
        
        boolean actualBeforeFirst = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonListIterator", "beforeFirst"));
        assertTrue(actualBeforeFirst);
        
        boolean actualNextCalled = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonListIterator", "nextCalled"));
        assertFalse(actualNextCalled);
        
        boolean actualRemoved = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonListIterator", "removed"));
        assertFalse(actualRemoved);
        
        Object actualObject = getFieldValue(actual, "org.apache.commons.collections4.iterators.SingletonListIterator", "object");
        assertNull(actualObject);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.objectGraphIterator
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method objectGraphIterator(java.lang.Object, org.apache.commons.collections4.Transformer)
    
    @Test
    public void testObjectGraphIterator1() throws Exception  {
        ObjectGraphIterator actual = ((ObjectGraphIterator) IteratorUtils.objectGraphIterator(null, null));
        
        ObjectGraphIterator expected = ((ObjectGraphIterator) createInstance("org.apache.commons.collections4.iterators.ObjectGraphIterator"));
        ArrayDeque stack = new ArrayDeque();
        setField(expected, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "stack", stack);
        
        Deque expectedStack = ((Deque) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "stack"));
        Deque actualStack = ((Deque) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "stack"));
        assertTrue(deepEquals(expectedStack, actualStack));
        
        Object actualRoot = getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "root");
        assertNull(actualRoot);
        
        Transformer actualTransformer = ((Transformer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "transformer"));
        assertNull(actualTransformer);
        
        boolean actualHasNext = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "hasNext"));
        assertFalse(actualHasNext);
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Object actualCurrentValue = getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "currentValue");
        assertNull(actualCurrentValue);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectGraphIterator", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.loopingListIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method loopingListIterator(java.util.List)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#loopingListIterator(java.util.List)}
 * @utbot.executesCondition {@code (list == null): False}
 * @utbot.returnsFrom {@code return new LoopingListIterator<E>(list);}
 *  */
    @Test
    public void testLoopingListIterator_ListNotEqualsNull() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        LoopingListIterator actual = ((LoopingListIterator) IteratorUtils.loopingListIterator(arrayList));
        
        LoopingListIterator expected = ((LoopingListIterator) createInstance("org.apache.commons.collections4.iterators.LoopingListIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.LoopingListIterator", "list", arrayList);
        Object iterator = createInstance("java.util.ArrayList$ListItr");
        setField(expected, "org.apache.commons.collections4.iterators.LoopingListIterator", "iterator", iterator);
        
        List expectedList = ((List) getFieldValue(expected, "org.apache.commons.collections4.iterators.LoopingListIterator", "list"));
        List actualList = ((List) getFieldValue(actual, "org.apache.commons.collections4.iterators.LoopingListIterator", "list"));
        assertTrue(deepEquals(expectedList, actualList));
        
        ListIterator expectedIterator = ((ListIterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.LoopingListIterator", "iterator"));
        ListIterator actualIterator = ((ListIterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.LoopingListIterator", "iterator"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method loopingListIterator(java.util.List)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#loopingListIterator(java.util.List)}
 * @utbot.executesCondition {@code (list == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: list == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testLoopingListIterator_ThrowNullPointerException() {
        IteratorUtils.loopingListIterator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyOrderedMapIterator()
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#emptyOrderedMapIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.EmptyOrderedMapIterator#emptyOrderedMapIterator()}
 * @utbot.returnsFrom {@code return EmptyOrderedMapIterator.<K, V>emptyOrderedMapIterator();}
 *  */
    @Test
    public void testEmptyOrderedMapIterator_EmptyOrderedMapIteratorEmptyOrderedMapIterator() throws Exception  {
        OrderedMapIterator prevINSTANCE = EmptyOrderedMapIterator.INSTANCE;
        try {
            EmptyOrderedMapIterator instance = ((EmptyOrderedMapIterator) createInstance("org.apache.commons.collections4.iterators.EmptyOrderedMapIterator"));
            Class emptyOrderedMapIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EmptyOrderedMapIterator");
            setStaticField(emptyOrderedMapIteratorClazz, "INSTANCE", instance);
            
            EmptyOrderedMapIterator actual = ((EmptyOrderedMapIterator) IteratorUtils.emptyOrderedMapIterator());
            
        } finally {
            setStaticField(EmptyOrderedMapIterator.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unmodifiableMapIterator(org.apache.commons.collections4.MapIterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#unmodifiableMapIterator(org.apache.commons.collections4.MapIterator)}
 * @utbot.returnsFrom {@code return UnmodifiableMapIterator.unmodifiableMapIterator(mapIterator);}
 *  */
    @Test
    public void testUnmodifiableMapIterator_ReturnUnmodifiableMapIteratorUnmodifiableMapIterator() throws Exception  {
        UnmodifiableOrderedMapIterator unmodifiableOrderedMapIterator = ((UnmodifiableOrderedMapIterator) createInstance("org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator"));
        
        UnmodifiableOrderedMapIterator actual = ((UnmodifiableOrderedMapIterator) IteratorUtils.unmodifiableMapIterator(unmodifiableOrderedMapIterator));
        
        OrderedMapIterator actualIterator = ((OrderedMapIterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator", "iterator"));
        assertNull(actualIterator);
        
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#unmodifiableMapIterator(org.apache.commons.collections4.MapIterator)}
 * @utbot.returnsFrom {@code return UnmodifiableMapIterator.unmodifiableMapIterator(mapIterator);}
 *  */
    @Test
    public void testUnmodifiableMapIterator_ReturnUnmodifiableMapIteratorUnmodifiableMapIterator_1() throws Exception  {
        AbstractOrderedMapIteratorDecorator abstractOrderedMapIteratorDecorator = ((AbstractOrderedMapIteratorDecorator) createInstance("org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator"));
        
        UnmodifiableMapIterator actual = ((UnmodifiableMapIterator) IteratorUtils.unmodifiableMapIterator(abstractOrderedMapIteratorDecorator));
        
        UnmodifiableMapIterator expected = ((UnmodifiableMapIterator) createInstance("org.apache.commons.collections4.iterators.UnmodifiableMapIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.UnmodifiableMapIterator", "iterator", abstractOrderedMapIteratorDecorator);
        
        MapIterator expectedIterator = ((MapIterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.UnmodifiableMapIterator", "iterator"));
        MapIterator actualIterator = ((MapIterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.UnmodifiableMapIterator", "iterator"));
        OrderedMapIterator actualIteratorIterator = ((OrderedMapIterator) getFieldValue(actualIterator, "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator", "iterator"));
        assertNull(actualIteratorIterator);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableMapIterator(org.apache.commons.collections4.MapIterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#unmodifiableMapIterator(org.apache.commons.collections4.MapIterator)}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.UnmodifiableMapIterator#unmodifiableMapIterator(org.apache.commons.collections4.MapIterator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableMapIterator.unmodifiableMapIterator(mapIterator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableMapIterator_ThrowIllegalArgumentException() {
        IteratorUtils.unmodifiableMapIterator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asMultipleUseIterable(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asMultipleUseIterable(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAsMultipleUseIterable_ThrowNullPointerException() {
        IteratorUtils.asMultipleUseIterable(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asMultipleUseIterable(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asMultipleUseIterable(java.util.Iterator)}
     */
    @Test
    public void testAsMultipleUseIterable() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorIterable actual = ((IteratorIterable) IteratorUtils.asMultipleUseIterable(iterator));
        
        IteratorIterable expected = ((IteratorIterable) createInstance("org.apache.commons.collections4.iterators.IteratorIterable"));
        ListIteratorWrapper iterator1 = ((ListIteratorWrapper) createInstance("org.apache.commons.collections4.iterators.ListIteratorWrapper"));
        Object iterator2 = createInstance("java.util.Collections$EmptyIterator");
        setField(iterator1, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "iterator", iterator2);
        ArrayList list = new ArrayList();
        setField(iterator1, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "list", list);
        setField(expected, "org.apache.commons.collections4.iterators.IteratorIterable", "iterator", iterator1);
        Iterator typeSafeIterator = ((Iterator) createInstance("org.apache.commons.collections4.iterators.IteratorIterable$1"));
        setField(typeSafeIterator, "org.apache.commons.collections4.iterators.IteratorIterable$1", "val$iterator", iterator1);
        setField(expected, "org.apache.commons.collections4.iterators.IteratorIterable", "typeSafeIterator", typeSafeIterator);
        
        // org.apache.commons.collections4.iterators.IteratorIterable is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.unmodifiableIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableIterator(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#unmodifiableIterator(java.util.Iterator)}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.UnmodifiableIterator#unmodifiableIterator(java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableIterator.unmodifiableIterator(iterator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableIterator_ThrowIllegalArgumentException() {
        IteratorUtils.unmodifiableIterator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unmodifiableIterator(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#unmodifiableIterator(java.util.Iterator)}
     */
    @Test
    public void testUnmodifiableIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        UnmodifiableIterator actual = ((UnmodifiableIterator) IteratorUtils.unmodifiableIterator(iterator));
        
        UnmodifiableIterator expected = ((UnmodifiableIterator) createInstance("org.apache.commons.collections4.iterators.UnmodifiableIterator"));
        Object iterator1 = createInstance("java.util.Collections$EmptyIterator");
        setField(expected, "org.apache.commons.collections4.iterators.UnmodifiableIterator", "iterator", iterator1);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.UnmodifiableIterator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.UnmodifiableIterator", "iterator"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyOrderedIterator()
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#emptyOrderedIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.EmptyOrderedIterator#emptyOrderedIterator()}
 * @utbot.returnsFrom {@code return EmptyOrderedIterator.<E>emptyOrderedIterator();}
 *  */
    @Test
    public void testEmptyOrderedIterator_EmptyOrderedIteratorEmptyOrderedIterator() throws Exception  {
        OrderedIterator prevINSTANCE = EmptyOrderedIterator.INSTANCE;
        try {
            EmptyOrderedIterator instance = ((EmptyOrderedIterator) createInstance("org.apache.commons.collections4.iterators.EmptyOrderedIterator"));
            Class emptyOrderedIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EmptyOrderedIterator");
            setStaticField(emptyOrderedIteratorClazz, "INSTANCE", instance);
            
            EmptyOrderedIterator actual = ((EmptyOrderedIterator) IteratorUtils.emptyOrderedIterator());
            
        } finally {
            setStaticField(EmptyOrderedIterator.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unmodifiableListIterator(java.util.ListIterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#unmodifiableListIterator(java.util.ListIterator)}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.UnmodifiableListIterator#umodifiableListIterator(java.util.ListIterator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return UnmodifiableListIterator.umodifiableListIterator(listIterator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableListIterator_ThrowIllegalArgumentException() {
        IteratorUtils.unmodifiableListIterator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.filteredListIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method filteredListIterator(java.util.ListIterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#filteredListIterator(java.util.ListIterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (listIterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: listIterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testFilteredListIterator_ThrowNullPointerException() {
        IteratorUtils.filteredListIterator(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.transformedIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformedIterator(java.util.Iterator, org.apache.commons.collections4.Transformer)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#transformedIterator(java.util.Iterator,org.apache.commons.collections4.Transformer)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testTransformedIterator_ThrowNullPointerException() {
        IteratorUtils.transformedIterator(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transformedIterator(java.util.Iterator, org.apache.commons.collections4.Transformer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#transformedIterator(java.util.Iterator,org.apache.commons.collections4.Transformer)}
     */
    @Test(expected = NullPointerException.class)
    public void testTransformedIteratorThrowsNPE() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorUtils.transformedIterator(iterator, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.emptyMapIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyMapIterator()
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#emptyMapIterator()}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.EmptyMapIterator#emptyMapIterator()}
 * @utbot.returnsFrom {@code return EmptyMapIterator.<K, V>emptyMapIterator();}
 *  */
    @Test
    public void testEmptyMapIterator_EmptyMapIteratorEmptyMapIterator() throws Exception  {
        MapIterator prevINSTANCE = EmptyMapIterator.INSTANCE;
        try {
            EmptyMapIterator instance = ((EmptyMapIterator) createInstance("org.apache.commons.collections4.iterators.EmptyMapIterator"));
            Class emptyMapIteratorClazz = Class.forName("org.apache.commons.collections4.iterators.EmptyMapIterator");
            setStaticField(emptyMapIteratorClazz, "INSTANCE", instance);
            
            EmptyMapIterator actual = ((EmptyMapIterator) IteratorUtils.emptyMapIterator());
            
        } finally {
            setStaticField(EmptyMapIterator.class, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.boundedIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method boundedIterator(java.util.Iterator, long, long)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#boundedIterator(java.util.Iterator,long,long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BoundedIterator<E>(iterator, offset, max);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBoundedIterator_ThrowIllegalArgumentException() {
        IteratorUtils.boundedIterator(null, -255L, -255L);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method boundedIterator(java.util.Iterator, long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#boundedIterator(java.util.Iterator,long,long)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBoundedIteratorThrowsIAE() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorUtils.boundedIterator(iterator, -8193L, -1L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.boundedIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method boundedIterator(java.util.Iterator, long)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#boundedIterator(java.util.Iterator,long)}
 * @utbot.invokes {@link org.apache.commons.collections4.IteratorUtils#boundedIterator(java.util.Iterator,long,long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return boundedIterator(iterator, 0, max);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBoundedIterator_ThrowIllegalArgumentException1() {
        IteratorUtils.boundedIterator(null, -255L);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method boundedIterator(java.util.Iterator, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#boundedIterator(java.util.Iterator,long)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBoundedIteratorThrowsIAE1() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorUtils.boundedIterator(iterator, -9L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.chainedIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chainedIterator(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Collection)}
 * @utbot.returnsFrom {@code return new IteratorChain<E>(iterators);}
 *  */
    @Test
    public void testChainedIterator_Return() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        IteratorChain actual = ((IteratorChain) IteratorUtils.chainedIterator(arrayList));
        
        IteratorChain expected = ((IteratorChain) createInstance("org.apache.commons.collections4.iterators.IteratorChain"));
        LinkedList iteratorChain = new LinkedList();
        setField(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain", iteratorChain);
        
        Queue expectedIteratorChain = ((Queue) getFieldValue(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        Queue actualIteratorChain = ((Queue) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        assertTrue(deepEquals(expectedIteratorChain, actualIteratorChain));
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
        boolean actualIsLocked = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "isLocked"));
        assertFalse(actualIsLocked);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chainedIterator(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new IteratorChain<E>(iterators);
 *  */
    @Test(expected = NullPointerException.class)
    public void testChainedIterator_ThrowNullPointerException() {
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
        
        IteratorUtils.chainedIterator(arrayList);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method chainedIterator(java.util.Collection)
    
    @Test
    public void testChainedIterator1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        SingletonListIterator singletonListIterator = new SingletonListIterator(null);
        arrayList.add(singletonListIterator);
        
        IteratorChain actual = ((IteratorChain) IteratorUtils.chainedIterator(arrayList));
        
        IteratorChain expected = ((IteratorChain) createInstance("org.apache.commons.collections4.iterators.IteratorChain"));
        LinkedList iteratorChain = new LinkedList();
        SingletonListIterator singletonListIterator1 = ((SingletonListIterator) createInstance("org.apache.commons.collections4.iterators.SingletonListIterator"));
        setField(singletonListIterator1, "org.apache.commons.collections4.iterators.SingletonListIterator", "beforeFirst", true);
        iteratorChain.add(singletonListIterator1);
        setField(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain", iteratorChain);
        
        Queue expectedIteratorChain = ((Queue) getFieldValue(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        Queue actualIteratorChain = ((Queue) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        assertTrue(deepEquals(expectedIteratorChain, actualIteratorChain));
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
        boolean actualIsLocked = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "isLocked"));
        assertFalse(actualIsLocked);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chainedIterator(java.util.Collection)
    
    @Test(expected = NullPointerException.class)
    public void testChainedIterator2() {
        ArrayList arrayList = new ArrayList();
        SingletonListIterator singletonListIterator = new SingletonListIterator(null);
        arrayList.add(singletonListIterator);
        arrayList.add(null);
        arrayList.add(null);
        
        IteratorUtils.chainedIterator(arrayList);
    }
    ///endregion
    
    ///region Errors report for chainedIterator
    
    public void testChainedIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: int hashCode()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.chainedIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chainedIterator(java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new IteratorChain<E>(iterator1, iterator2);
 *  */
    @Test(expected = NullPointerException.class)
    public void testChainedIterator_ThrowNullPointerException1() {
        IteratorUtils.chainedIterator(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method chainedIterator(java.util.Iterator, java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator,java.util.Iterator)}
     */
    @Test
    public void testChainedIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        Iterable iterable1 = emptyList();
        Iterator iterator1 = iterable1.iterator();
        
        IteratorChain actual = ((IteratorChain) IteratorUtils.chainedIterator(iterator, iterator1));
        
        IteratorChain expected = ((IteratorChain) createInstance("org.apache.commons.collections4.iterators.IteratorChain"));
        LinkedList iteratorChain = new LinkedList();
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        iteratorChain.add(emptyIterator);
        iteratorChain.add(emptyIterator);
        setField(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain", iteratorChain);
        
        Queue expectedIteratorChain = ((Queue) getFieldValue(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        Queue actualIteratorChain = ((Queue) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        assertTrue(deepEquals(expectedIteratorChain, actualIteratorChain));
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
        boolean actualIsLocked = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "isLocked"));
        assertFalse(actualIsLocked);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.chainedIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method chainedIterator([Ljava.util.Iterator;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator[])}
 * @utbot.returnsFrom {@code return new IteratorChain<E>(iterators);}
 *  */
    @Test
    public void testChainedIterator_Return1() throws Exception  {
        java.util.Iterator[] iteratorArray = {};
        
        IteratorChain actual = ((IteratorChain) IteratorUtils.chainedIterator(iteratorArray));
        
        IteratorChain expected = ((IteratorChain) createInstance("org.apache.commons.collections4.iterators.IteratorChain"));
        LinkedList iteratorChain = new LinkedList();
        setField(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain", iteratorChain);
        
        Queue expectedIteratorChain = ((Queue) getFieldValue(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        Queue actualIteratorChain = ((Queue) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        assertTrue(deepEquals(expectedIteratorChain, actualIteratorChain));
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
        boolean actualIsLocked = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "isLocked"));
        assertFalse(actualIsLocked);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method chainedIterator([Ljava.util.Iterator;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new IteratorChain<E>(iterators);
 *  */
    @Test(expected = NullPointerException.class)
    public void testChainedIterator_ThrowNullPointerException2() {
        java.util.Iterator[] iteratorArray = {null};
        
        IteratorUtils.chainedIterator(iteratorArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method chainedIterator([Ljava.util.Iterator;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#chainedIterator(java.util.Iterator[])}
     */
    @Test
    public void testChainedIteratorWithNonEmptyObjectArray() throws Exception  {
        java.util.Iterator[] iteratorArray = new java.util.Iterator[3];
        Iterator iterator = emptyIterator();
        iteratorArray[0] = iterator;
        Iterable iterable = emptyList();
        Iterator iterator1 = iterable.iterator();
        iteratorArray[1] = iterator1;
        Iterable iterable1 = emptyList();
        Iterator iterator2 = iterable1.iterator();
        iteratorArray[2] = iterator2;
        
        IteratorChain actual = ((IteratorChain) IteratorUtils.chainedIterator(iteratorArray));
        
        IteratorChain expected = ((IteratorChain) createInstance("org.apache.commons.collections4.iterators.IteratorChain"));
        LinkedList iteratorChain = new LinkedList();
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        iteratorChain.add(emptyIterator);
        iteratorChain.add(emptyIterator);
        iteratorChain.add(emptyIterator);
        setField(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain", iteratorChain);
        
        Queue expectedIteratorChain = ((Queue) getFieldValue(expected, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        Queue actualIteratorChain = ((Queue) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "iteratorChain"));
        assertTrue(deepEquals(expectedIteratorChain, actualIteratorChain));
        
        Iterator actualCurrentIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "currentIterator"));
        assertNull(actualCurrentIterator);
        
        Iterator actualLastUsedIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "lastUsedIterator"));
        assertNull(actualLastUsedIterator);
        
        boolean actualIsLocked = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.IteratorChain", "isLocked"));
        assertFalse(actualIsLocked);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayListIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrayListIterator(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayListIterator<E>(array);
 *  */
    @Test
    public void testArrayListIterator_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.arrayListIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:74)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:60)
            org.apache.commons.collections4.iterators.ArrayListIterator.<init>(ArrayListIterator.java:64)
            org.apache.commons.collections4.IteratorUtils.arrayListIterator(IteratorUtils.java:385) */
        IteratorUtils.arrayListIterator(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayListIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrayListIterator(java.lang.Object, int, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayListIterator<E>(array, start, end);
 *  */
    @Test
    public void testArrayListIterator_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.arrayListIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:96)
            org.apache.commons.collections4.iterators.ArrayListIterator.<init>(ArrayListIterator.java:94)
            org.apache.commons.collections4.IteratorUtils.arrayListIterator(IteratorUtils.java:452) */
        IteratorUtils.arrayListIterator(((Object) null), -1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayListIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arrayListIterator([Ljava.lang.Object;, int, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int,int)}
 * @utbot.returnsFrom {@code return new ObjectArrayListIterator<E>(array, start, end);}
 *  */
    @Test
    public void testArrayListIterator_Return() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayListIterator actual = ((ObjectArrayListIterator) IteratorUtils.arrayListIterator(objectArray, 0, 0));
        
        ObjectArrayListIterator expected = ((ObjectArrayListIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayListIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex", -1);
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        int expectedLastItemIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex"));
        int actualLastItemIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex"));
        assertEquals(expectedLastItemIndex, actualLastItemIndex);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrayListIterator([Ljava.lang.Object;, int, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayListIterator<E>(array, start, end);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayListIterator_ThrowArrayIndexOutOfBoundsException_1() {
        java.lang.Object[] objectArray = {};
        
        IteratorUtils.arrayListIterator(objectArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayListIterator<E>(array, start, end);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayListIterator_ThrowArrayIndexOutOfBoundsException_2() {
        java.lang.Object[] objectArray = {null, null};
        
        IteratorUtils.arrayListIterator(objectArray, 3, 2);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new ObjectArrayListIterator<E>(array, start, end);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testArrayListIterator_ThrowIllegalArgumentException() {
        java.lang.Object[] objectArray = {null, null};
        
        IteratorUtils.arrayListIterator(objectArray, 2, -255);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayListIterator<E>(array, start, end);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayListIterator_ThrowArrayIndexOutOfBoundsException() {
        IteratorUtils.arrayListIterator(((java.lang.Object[]) null), -1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayListIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrayListIterator(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayListIterator<E>(array, start);
 *  */
    @Test
    public void testArrayListIterator_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.arrayListIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:74)
            org.apache.commons.collections4.iterators.ArrayListIterator.<init>(ArrayListIterator.java:78)
            org.apache.commons.collections4.IteratorUtils.arrayListIterator(IteratorUtils.java:417) */
        IteratorUtils.arrayListIterator(((Object) null), -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayListIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arrayListIterator([Ljava.lang.Object;, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int)}
 * @utbot.returnsFrom {@code return new ObjectArrayListIterator<E>(array, start);}
 *  */
    @Test
    public void testArrayListIterator_Return1() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayListIterator actual = ((ObjectArrayListIterator) IteratorUtils.arrayListIterator(objectArray, 0));
        
        ObjectArrayListIterator expected = ((ObjectArrayListIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayListIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex", -1);
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        int expectedLastItemIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex"));
        int actualLastItemIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex"));
        assertEquals(expectedLastItemIndex, actualLastItemIndex);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrayListIterator([Ljava.lang.Object;, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayListIterator<E>(array, start);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayListIterator_ThrowArrayIndexOutOfBoundsException1() {
        java.lang.Object[] objectArray = {};
        
        IteratorUtils.arrayListIterator(objectArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayListIterator<E>(array, start);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayListIterator_ThrowArrayIndexOutOfBoundsException_11() {
        java.lang.Object[] objectArray = {null};
        
        IteratorUtils.arrayListIterator(objectArray, -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayListIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arrayListIterator([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayListIterator(java.lang.Object[])}
 * @utbot.returnsFrom {@code return new ObjectArrayListIterator<E>(array);}
 *  */
    @Test
    public void testArrayListIterator_Return2() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayListIterator actual = ((ObjectArrayListIterator) IteratorUtils.arrayListIterator(objectArray));
        
        ObjectArrayListIterator expected = ((ObjectArrayListIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayListIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex", -1);
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        int expectedLastItemIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex"));
        int actualLastItemIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayListIterator", "lastItemIndex"));
        assertEquals(expectedLastItemIndex, actualLastItemIndex);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrayIterator(java.lang.Object, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayIterator<E>(array, start);
 *  */
    @Test
    public void testArrayIterator_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.arrayIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:74)
            org.apache.commons.collections4.IteratorUtils.arrayIterator(IteratorUtils.java:318) */
        IteratorUtils.arrayIterator(((Object) null), -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arrayIterator([Ljava.lang.Object;, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int)}
 * @utbot.returnsFrom {@code return new ObjectArrayIterator<E>(array, start);}
 *  */
    @Test
    public void testArrayIterator_Return() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayIterator actual = ((ObjectArrayIterator) IteratorUtils.arrayIterator(objectArray, 0));
        
        ObjectArrayIterator expected = ((ObjectArrayIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrayIterator([Ljava.lang.Object;, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayIterator<E>(array, start);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIterator_ThrowArrayIndexOutOfBoundsException() {
        java.lang.Object[] objectArray = {};
        
        IteratorUtils.arrayIterator(objectArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayIterator<E>(array, start);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIterator_ThrowArrayIndexOutOfBoundsException_1() {
        java.lang.Object[] objectArray = {null};
        
        IteratorUtils.arrayIterator(objectArray, -1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arrayIterator([Ljava.lang.Object;, int, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int,int)}
 * @utbot.returnsFrom {@code return new ObjectArrayIterator<E>(array, start, end);}
 *  */
    @Test
    public void testArrayIterator_Return1() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayIterator actual = ((ObjectArrayIterator) IteratorUtils.arrayIterator(objectArray, 0, 0));
        
        ObjectArrayIterator expected = ((ObjectArrayIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arrayIterator([Ljava.lang.Object;, int, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayIterator<E>(array, start, end);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIterator_ThrowArrayIndexOutOfBoundsException_11() {
        java.lang.Object[] objectArray = {null, null};
        
        IteratorUtils.arrayIterator(objectArray, 3, 2);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new ObjectArrayIterator<E>(array, start, end);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testArrayIterator_ThrowIllegalArgumentException() {
        java.lang.Object[] objectArray = {null, null};
        
        IteratorUtils.arrayIterator(objectArray, 2, -255);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayIterator<E>(array, start, end);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIterator_ThrowArrayIndexOutOfBoundsException_2() {
        java.lang.Object[] objectArray = {};
        
        IteratorUtils.arrayIterator(objectArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new ObjectArrayIterator<E>(array, start, end);
 *  */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIterator_ThrowArrayIndexOutOfBoundsException1() {
        IteratorUtils.arrayIterator(((java.lang.Object[]) null), -1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arrayIterator([Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object[])}
 * @utbot.returnsFrom {@code return new ObjectArrayIterator<E>(array);}
 *  */
    @Test
    public void testArrayIterator_Return2() throws Exception  {
        java.lang.Object[] objectArray = {};
        
        ObjectArrayIterator actual = ((ObjectArrayIterator) IteratorUtils.arrayIterator(objectArray));
        
        ObjectArrayIterator expected = ((ObjectArrayIterator) createInstance("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "array", objectArray);
        
        java.lang.Object[] expectedArray = expected.getArray();
        java.lang.Object[] actualArray = actual.getArray();
        int expectedArraySize = expectedArray.length;
        assertEquals(expectedArraySize, actualArray.length);
        assertTrue(deepEquals(expectedArray, actualArray));
        
        int expectedStartIndex = expected.getStartIndex();
        int actualStartIndex = actual.getStartIndex();
        assertEquals(expectedStartIndex, actualStartIndex);
        
        int expectedEndIndex = expected.getEndIndex();
        int actualEndIndex = actual.getEndIndex();
        assertEquals(expectedEndIndex, actualEndIndex);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ObjectArrayIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrayIterator(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayIterator<E>(array);
 *  */
    @Test
    public void testArrayIterator_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.arrayIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:74)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:60)
            org.apache.commons.collections4.IteratorUtils.arrayIterator(IteratorUtils.java:281) */
        IteratorUtils.arrayIterator(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.arrayIterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arrayIterator(java.lang.Object, int, int)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#arrayIterator(java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayIterator<E>(array, start, end);
 *  */
    @Test
    public void testArrayIterator_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.arrayIterator] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.getLength(Native Method)
            org.apache.commons.collections4.iterators.ArrayIterator.<init>(ArrayIterator.java:96)
            org.apache.commons.collections4.IteratorUtils.arrayIterator(IteratorUtils.java:356) */
        IteratorUtils.arrayIterator(((Object) null), -1, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.peekingIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method peekingIterator(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#peekingIterator(java.util.Iterator)}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.PeekingIterator#peekingIterator(java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return PeekingIterator.peekingIterator(iterator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPeekingIterator_ThrowIllegalArgumentException() {
        IteratorUtils.peekingIterator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method peekingIterator(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#peekingIterator(java.util.Iterator)}
     */
    @Test
    public void testPeekingIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        PeekingIterator actual = ((PeekingIterator) IteratorUtils.peekingIterator(iterator));
        
        PeekingIterator expected = ((PeekingIterator) createInstance("org.apache.commons.collections4.iterators.PeekingIterator"));
        Object iterator1 = createInstance("java.util.Collections$EmptyIterator");
        setField(expected, "org.apache.commons.collections4.iterators.PeekingIterator", "iterator", iterator1);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.PeekingIterator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.PeekingIterator", "iterator"));
        
        boolean actualExhausted = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.PeekingIterator", "exhausted"));
        assertFalse(actualExhausted);
        
        boolean actualSlotFilled = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.PeekingIterator", "slotFilled"));
        assertFalse(actualSlotFilled);
        
        Object actualSlot = getFieldValue(actual, "org.apache.commons.collections4.iterators.PeekingIterator", "slot");
        assertNull(actualSlot);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.pushbackIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pushbackIterator(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#pushbackIterator(java.util.Iterator)}
 * @utbot.invokes {@link org.apache.commons.collections4.iterators.PushbackIterator#pushbackIterator(java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return PushbackIterator.pushbackIterator(iterator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPushbackIterator_ThrowIllegalArgumentException() {
        IteratorUtils.pushbackIterator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pushbackIterator(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#pushbackIterator(java.util.Iterator)}
     */
    @Test
    public void testPushbackIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        PushbackIterator actual = ((PushbackIterator) IteratorUtils.pushbackIterator(iterator));
        
        PushbackIterator expected = ((PushbackIterator) createInstance("org.apache.commons.collections4.iterators.PushbackIterator"));
        Object iterator1 = createInstance("java.util.Collections$EmptyIterator");
        setField(expected, "org.apache.commons.collections4.iterators.PushbackIterator", "iterator", iterator1);
        ArrayDeque items = new ArrayDeque();
        setField(expected, "org.apache.commons.collections4.iterators.PushbackIterator", "items", items);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.PushbackIterator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.PushbackIterator", "iterator"));
        
        Deque expectedItems = ((Deque) getFieldValue(expected, "org.apache.commons.collections4.iterators.PushbackIterator", "items"));
        Deque actualItems = ((Deque) getFieldValue(actual, "org.apache.commons.collections4.iterators.PushbackIterator", "items"));
        assertTrue(deepEquals(expectedItems, actualItems));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.collatedIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method collatedIterator(java.util.Comparator, java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new CollatingIterator<E>(comparator, iterator1, iterator2);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCollatedIterator_ThrowNullPointerException() {
        IteratorUtils.collatedIterator(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method collatedIterator(java.util.Comparator, java.util.Iterator, java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator,java.util.Iterator)}
     */
    @Test
    public void testCollatedIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        Iterable iterable1 = emptyList();
        Iterator iterator1 = iterable1.iterator();
        
        CollatingIterator actual = ((CollatingIterator) IteratorUtils.collatedIterator(null, iterator, iterator1));
        
        CollatingIterator expected = ((CollatingIterator) createInstance("org.apache.commons.collections4.iterators.CollatingIterator"));
        ArrayList iterators = new ArrayList();
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        iterators.add(emptyIterator);
        iterators.add(emptyIterator);
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "iterators", iterators);
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned", -1);
        
        Comparator actualComparator = actual.getComparator();
        assertNull(actualComparator);
        
        List expectedIterators = expected.getIterators();
        List actualIterators = actual.getIterators();
        assertTrue(deepEquals(expectedIterators, actualIterators));
        
        List actualValues = ((List) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "values"));
        assertNull(actualValues);
        
        BitSet actualValueSet = ((BitSet) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "valueSet"));
        assertNull(actualValueSet);
        
        int expectedLastReturned = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        int actualLastReturned = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        assertEquals(expectedLastReturned, actualLastReturned);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.collatedIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collatedIterator(java.util.Comparator, [Ljava.util.Iterator;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator[])}
 * @utbot.returnsFrom {@code return new CollatingIterator<E>(comparator, iterators);}
 *  */
    @Test
    public void testCollatedIterator_Return() throws Exception  {
        java.util.Iterator[] iteratorArray = {};
        
        CollatingIterator actual = ((CollatingIterator) IteratorUtils.collatedIterator(((Comparator) null), iteratorArray));
        
        CollatingIterator expected = ((CollatingIterator) createInstance("org.apache.commons.collections4.iterators.CollatingIterator"));
        ArrayList iterators = new ArrayList();
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "iterators", iterators);
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned", -1);
        
        Comparator actualComparator = actual.getComparator();
        assertNull(actualComparator);
        
        List expectedIterators = expected.getIterators();
        List actualIterators = actual.getIterators();
        assertTrue(deepEquals(expectedIterators, actualIterators));
        
        List actualValues = ((List) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "values"));
        assertNull(actualValues);
        
        BitSet actualValueSet = ((BitSet) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "valueSet"));
        assertNull(actualValueSet);
        
        int expectedLastReturned = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        int actualLastReturned = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        assertEquals(expectedLastReturned, actualLastReturned);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method collatedIterator(java.util.Comparator, [Ljava.util.Iterator;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new CollatingIterator<E>(comparator, iterators);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCollatedIterator_ThrowNullPointerException1() {
        java.util.Iterator[] iteratorArray = {null};
        
        IteratorUtils.collatedIterator(((Comparator) null), iteratorArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method collatedIterator(java.util.Comparator, [Ljava.util.Iterator;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Iterator[])}
     */
    @Test
    public void testCollatedIteratorWithNonEmptyObjectArray() throws Exception  {
        java.util.Iterator[] iteratorArray = new java.util.Iterator[3];
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        iteratorArray[0] = iterator;
        Iterable iterable1 = emptyList();
        Iterator iterator1 = iterable1.iterator();
        iteratorArray[1] = iterator1;
        Iterator iterator2 = emptyIterator();
        iteratorArray[2] = iterator2;
        
        CollatingIterator actual = ((CollatingIterator) IteratorUtils.collatedIterator(((Comparator) null), iteratorArray));
        
        CollatingIterator expected = ((CollatingIterator) createInstance("org.apache.commons.collections4.iterators.CollatingIterator"));
        ArrayList iterators = new ArrayList();
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        iterators.add(emptyIterator);
        iterators.add(emptyIterator);
        iterators.add(emptyIterator);
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "iterators", iterators);
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned", -1);
        
        Comparator actualComparator = actual.getComparator();
        assertNull(actualComparator);
        
        List expectedIterators = expected.getIterators();
        List actualIterators = actual.getIterators();
        assertTrue(deepEquals(expectedIterators, actualIterators));
        
        List actualValues = ((List) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "values"));
        assertNull(actualValues);
        
        BitSet actualValueSet = ((BitSet) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "valueSet"));
        assertNull(actualValueSet);
        
        int expectedLastReturned = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        int actualLastReturned = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        assertEquals(expectedLastReturned, actualLastReturned);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.collatedIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collatedIterator(java.util.Comparator, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)}
 * @utbot.returnsFrom {@code return new CollatingIterator<E>(comparator, iterators);}
 *  */
    @Test
    public void testCollatedIterator_Return1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        CollatingIterator actual = ((CollatingIterator) IteratorUtils.collatedIterator(((Comparator) null), arrayList));
        
        CollatingIterator expected = ((CollatingIterator) createInstance("org.apache.commons.collections4.iterators.CollatingIterator"));
        ArrayList iterators = new ArrayList();
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "iterators", iterators);
        setField(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned", -1);
        
        Comparator actualComparator = actual.getComparator();
        assertNull(actualComparator);
        
        List expectedIterators = expected.getIterators();
        List actualIterators = actual.getIterators();
        assertTrue(deepEquals(expectedIterators, actualIterators));
        
        List actualValues = ((List) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "values"));
        assertNull(actualValues);
        
        BitSet actualValueSet = ((BitSet) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "valueSet"));
        assertNull(actualValueSet);
        
        int expectedLastReturned = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        int actualLastReturned = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.CollatingIterator", "lastReturned"));
        assertEquals(expectedLastReturned, actualLastReturned);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method collatedIterator(java.util.Comparator, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new CollatingIterator<E>(comparator, iterators);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCollatedIterator_ThrowNullPointerException2() {
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
        
        IteratorUtils.collatedIterator(((Comparator) null), arrayList);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method collatedIterator(java.util.Comparator, java.util.Collection)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#collatedIterator(java.util.Comparator,java.util.Collection)}
     */
    @Test
    public void testCollatedIteratorThrowsCCE() {
        HashSet hashSet = new HashSet();
        Object object = new Object();
        hashSet.add(object);
        Object object1 = new Object();
        hashSet.add(object1);
        Object object2 = new Object();
        hashSet.add(object2);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.collatedIterator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Iterator (java.lang.Object and java.util.Iterator are in module java.base of loader 'bootstrap')]
            org.apache.commons.collections4.iterators.CollatingIterator.<init>(CollatingIterator.java:157)
            org.apache.commons.collections4.IteratorUtils.collatedIterator(IteratorUtils.java:648) */
        IteratorUtils.collatedIterator(((Comparator) null), hashSet);
    }
    ///endregion
    
    ///region Errors report for collatedIterator
    
    public void testCollatedIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: int hashCode()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.nodeListIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nodeListIterator(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#nodeListIterator(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (node == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testNodeListIterator_ThrowNullPointerException() {
        IteratorUtils.nodeListIterator(((Node) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.nodeListIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nodeListIterator(org.w3c.dom.NodeList)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#nodeListIterator(org.w3c.dom.NodeList)}
 * @utbot.executesCondition {@code (nodeList == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: nodeList == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testNodeListIterator_ThrowNullPointerException1() {
        IteratorUtils.nodeListIterator(((NodeList) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.filteredIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method filteredIterator(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#filteredIterator(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testFilteredIterator_ThrowNullPointerException() {
        IteratorUtils.filteredIterator(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method filteredIterator(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#filteredIterator(java.util.Iterator,org.apache.commons.collections4.Predicate)}
     */
    @Test(expected = NullPointerException.class)
    public void testFilteredIteratorThrowsNPE() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorUtils.filteredIterator(iterator, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.skippingIterator
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skippingIterator(java.util.Iterator, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#skippingIterator(java.util.Iterator,long)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSkippingIteratorThrowsIAE() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorUtils.skippingIterator(iterator, -9L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.loopingIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method loopingIterator(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#loopingIterator(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): False}
 * @utbot.returnsFrom {@code return new LoopingIterator<E>(coll);}
 *  */
    @Test
    public void testLoopingIterator_CollNotEqualsNull() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        LoopingIterator actual = ((LoopingIterator) IteratorUtils.loopingIterator(arrayList));
        
        LoopingIterator expected = ((LoopingIterator) createInstance("org.apache.commons.collections4.iterators.LoopingIterator"));
        setField(expected, "org.apache.commons.collections4.iterators.LoopingIterator", "collection", arrayList);
        Object iterator = createInstance("java.util.ArrayList$Itr");
        setField(expected, "org.apache.commons.collections4.iterators.LoopingIterator", "iterator", iterator);
        
        Collection expectedCollection = ((Collection) getFieldValue(expected, "org.apache.commons.collections4.iterators.LoopingIterator", "collection"));
        Collection actualCollection = ((Collection) getFieldValue(actual, "org.apache.commons.collections4.iterators.LoopingIterator", "collection"));
        assertTrue(deepEquals(expectedCollection, actualCollection));
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.LoopingIterator", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.LoopingIterator", "iterator"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method loopingIterator(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#loopingIterator(java.util.Collection)}
 * @utbot.executesCondition {@code (coll == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: coll == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testLoopingIterator_ThrowNullPointerException() {
        IteratorUtils.loopingIterator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.zippingIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method zippingIterator(java.util.Iterator, java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator,java.util.Iterator,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ZippingIterator<E>(a, b, c);
 *  */
    @Test(expected = NullPointerException.class)
    public void testZippingIterator_ThrowNullPointerException() {
        IteratorUtils.zippingIterator(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method zippingIterator(java.util.Iterator, java.util.Iterator, java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator,java.util.Iterator,java.util.Iterator)}
     */
    @Test(expected = NullPointerException.class)
    public void testZippingIteratorThrowsNPE() {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        Iterable iterable1 = emptyList();
        Iterator iterator1 = iterable1.iterator();
        
        IteratorUtils.zippingIterator(iterator, iterator1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.zippingIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method zippingIterator(java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ZippingIterator<E>(a, b);
 *  */
    @Test(expected = NullPointerException.class)
    public void testZippingIterator_ThrowNullPointerException1() {
        IteratorUtils.zippingIterator(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method zippingIterator(java.util.Iterator, java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator,java.util.Iterator)}
     */
    @Test
    public void testZippingIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        Iterable iterable1 = emptyList();
        Iterator iterator1 = iterable1.iterator();
        
        ZippingIterator actual = IteratorUtils.zippingIterator(iterator, iterator1);
        
        ZippingIterator expected = ((ZippingIterator) createInstance("org.apache.commons.collections4.iterators.ZippingIterator"));
        LazyIteratorChain iterators = ((LazyIteratorChain) createInstance("org.apache.commons.collections4.IterableUtils$5$1"));
        FluentIterable this$0 = ((FluentIterable) createInstance("org.apache.commons.collections4.IterableUtils$5"));
        ArrayList val$iterable = new ArrayList();
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        val$iterable.add(emptyIterator);
        val$iterable.add(emptyIterator);
        setField(this$0, "org.apache.commons.collections4.IterableUtils$5", "val$iterable", val$iterable);
        setField(this$0, "org.apache.commons.collections4.FluentIterable", "iterable", this$0);
        setField(iterators, "org.apache.commons.collections4.IterableUtils$5$1", "this$0", this$0);
        setField(expected, "org.apache.commons.collections4.iterators.ZippingIterator", "iterators", iterators);
        
        Iterator expectedIterators = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.ZippingIterator", "iterators"));
        Iterator actualIterators = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ZippingIterator", "iterators"));
        int expectedIteratorsCallCounter = ((Integer) getFieldValue(expectedIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "callCounter"));
        int actualIteratorsCallCounter = ((Integer) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "callCounter"));
        assertEquals(expectedIteratorsCallCounter, actualIteratorsCallCounter);
        
        boolean actualIteratorsChainExhausted = ((Boolean) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "chainExhausted"));
        assertFalse(actualIteratorsChainExhausted);
        
        Iterator actualIteratorsCurrentIterator = ((Iterator) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "currentIterator"));
        assertNull(actualIteratorsCurrentIterator);
        
        Iterator actualIteratorsLastUsedIterator = ((Iterator) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "lastUsedIterator"));
        assertNull(actualIteratorsLastUsedIterator);
        
        Iterator actualNextIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ZippingIterator", "nextIterator"));
        assertNull(actualNextIterator);
        
        Iterator actualLastReturned = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ZippingIterator", "lastReturned"));
        assertNull(actualLastReturned);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.zippingIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method zippingIterator([Ljava.util.Iterator;)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ZippingIterator<E>(iterators);
 *  */
    @Test(expected = NullPointerException.class)
    public void testZippingIterator_ThrowNullPointerException2() {
        java.util.Iterator[] iteratorArray = {null};
        
        IteratorUtils.zippingIterator(iteratorArray);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ZippingIterator<E>(iterators);
 *  */
    @Test(expected = NullPointerException.class)
    public void testZippingIterator_ThrowNullPointerException_1() throws Exception  {
        java.util.Iterator[] iteratorArray = new java.util.Iterator[2];
        ListIteratorWrapper listIteratorWrapper = ((ListIteratorWrapper) createInstance("org.apache.commons.collections4.iterators.ListIteratorWrapper"));
        iteratorArray[0] = ((Iterator) listIteratorWrapper);
        
        IteratorUtils.zippingIterator(iteratorArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method zippingIterator([Ljava.util.Iterator;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#zippingIterator(java.util.Iterator[])}
     */
    @Test
    public void testZippingIteratorWithNonEmptyObjectArray() throws Exception  {
        java.util.Iterator[] iteratorArray = new java.util.Iterator[3];
        Iterator iterator = emptyIterator();
        iteratorArray[0] = iterator;
        Iterable iterable = emptyList();
        Iterator iterator1 = iterable.iterator();
        iteratorArray[1] = iterator1;
        Iterable iterable1 = emptyList();
        Iterator iterator2 = iterable1.iterator();
        iteratorArray[2] = iterator2;
        
        ZippingIterator actual = IteratorUtils.zippingIterator(iteratorArray);
        
        ZippingIterator expected = ((ZippingIterator) createInstance("org.apache.commons.collections4.iterators.ZippingIterator"));
        LazyIteratorChain iterators = ((LazyIteratorChain) createInstance("org.apache.commons.collections4.IterableUtils$5$1"));
        FluentIterable this$0 = ((FluentIterable) createInstance("org.apache.commons.collections4.IterableUtils$5"));
        ArrayList val$iterable = new ArrayList();
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        val$iterable.add(emptyIterator);
        val$iterable.add(emptyIterator);
        val$iterable.add(emptyIterator);
        setField(this$0, "org.apache.commons.collections4.IterableUtils$5", "val$iterable", val$iterable);
        setField(this$0, "org.apache.commons.collections4.FluentIterable", "iterable", this$0);
        setField(iterators, "org.apache.commons.collections4.IterableUtils$5$1", "this$0", this$0);
        setField(expected, "org.apache.commons.collections4.iterators.ZippingIterator", "iterators", iterators);
        
        Iterator expectedIterators = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.ZippingIterator", "iterators"));
        Iterator actualIterators = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ZippingIterator", "iterators"));
        int expectedIteratorsCallCounter = ((Integer) getFieldValue(expectedIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "callCounter"));
        int actualIteratorsCallCounter = ((Integer) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "callCounter"));
        assertEquals(expectedIteratorsCallCounter, actualIteratorsCallCounter);
        
        boolean actualIteratorsChainExhausted = ((Boolean) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "chainExhausted"));
        assertFalse(actualIteratorsChainExhausted);
        
        Iterator actualIteratorsCurrentIterator = ((Iterator) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "currentIterator"));
        assertNull(actualIteratorsCurrentIterator);
        
        Iterator actualIteratorsLastUsedIterator = ((Iterator) getFieldValue(actualIterators, "org.apache.commons.collections4.iterators.LazyIteratorChain", "lastUsedIterator"));
        assertNull(actualIteratorsLastUsedIterator);
        
        Iterator actualNextIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ZippingIterator", "nextIterator"));
        assertNull(actualNextIterator);
        
        Iterator actualLastReturned = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ZippingIterator", "lastReturned"));
        assertNull(actualLastReturned);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.matchesAny
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAny(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAny(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (iterator != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesAny_IteratorEqualsNull() {
        NotPredicate notPredicate = new NotPredicate(null);
        
        boolean actual = IteratorUtils.matchesAny(null, notPredicate);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAny(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} twice
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchesAny_IteratorNotEqualsNull() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        
        boolean actual = IteratorUtils.matchesAny(iterator, nullIsFalsePredicate);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchesAny(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAny(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: predicate == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testMatchesAny_ThrowNullPointerException() {
        IteratorUtils.matchesAny(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAny(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAny(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): False}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.returnsFrom {@code return false;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testMatchesAny_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NotPredicate notPredicate = new NotPredicate(null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.NotPredicate.evaluate(NotPredicate.java:70)
            org.apache.commons.collections4.IteratorUtils.matchesAny(IteratorUtils.java:1296) */
        IteratorUtils.matchesAny(iterator, notPredicate);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchesAny(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    @Test
    public void testMatchesAny1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, orPredicate);
        
        boolean actual = IteratorUtils.matchesAny(iterator, orPredicate1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testMatchesAny2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        
        boolean actual = IteratorUtils.matchesAny(iterator, orPredicate);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchesAny(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object entryIterator = createInstance("java.util.WeakHashMap$EntryIterator");
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        NullIsFalsePredicate nullIsFalsePredicate3 = new NullIsFalsePredicate(nullIsFalsePredicate2);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate3, null);
        
        IteratorUtils.matchesAny(iterator, orPredicate1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object descendingIterator = createInstance("java.util.ArrayDeque$DescendingIterator");
        arrayList.add(descendingIterator);
        arrayList.add(descendingIterator);
        arrayList.add(descendingIterator);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(orPredicate2);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(nullIsFalsePredicate1);
        
        IteratorUtils.matchesAny(iterator, nullIsFalsePredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object deqIterator = createInstance("java.util.ArrayDeque$DeqIterator");
        arrayList.add(deqIterator);
        arrayList.add(deqIterator);
        arrayList.add(deqIterator);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate1);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate2);
        
        IteratorUtils.matchesAny(iterator, nullIsFalsePredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, orPredicate1);
        
        IteratorUtils.matchesAny(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate2", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        IteratorUtils.matchesAny(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny8() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object descendingIterator = createInstance("java.util.ArrayDeque$DescendingIterator");
        arrayList.add(descendingIterator);
        arrayList.add(descendingIterator);
        arrayList.add(descendingIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate2, null);
        
        IteratorUtils.matchesAny(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny9() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object entryIterator = createInstance("java.util.WeakHashMap$EntryIterator");
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate2, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        IteratorUtils.matchesAny(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny10() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, orPredicate1);
        OrPredicate orPredicate3 = new OrPredicate(orPredicate2, null);
        
        IteratorUtils.matchesAny(iterator, orPredicate3);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAny11() throws Exception  {
        ArrayList arrayList = new ArrayList();
        LoopingListIterator loopingListIterator = ((LoopingListIterator) createInstance("org.apache.commons.collections4.iterators.LoopingListIterator"));
        arrayList.add(loopingListIterator);
        arrayList.add(loopingListIterator);
        arrayList.add(loopingListIterator);
        arrayList.add(loopingListIterator);
        arrayList.add(loopingListIterator);
        arrayList.add(loopingListIterator);
        arrayList.add(loopingListIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        OrPredicate orPredicate3 = new OrPredicate(orPredicate2, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate3);
        
        IteratorUtils.matchesAny(iterator, nullIsFalsePredicate2);
    }
    
    @Test
    public void testMatchesAny12() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException] */
        IteratorUtils.matchesAny(iterator, orPredicate2);
    }
    
    @Test
    public void testMatchesAny13() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException] */
        IteratorUtils.matchesAny(iterator, orPredicate1);
    }
    
    @Test
    public void testMatchesAny14() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        OrPredicate iPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(iPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", nullIsFalsePredicate);
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", iPredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAny(IteratorUtils.java:1296) */
        IteratorUtils.matchesAny(iterator, orPredicate1);
    }
    
    @Test
    public void testMatchesAny15() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException] */
        IteratorUtils.matchesAny(iterator, orPredicate1);
    }
    
    @Test
    public void testMatchesAny16() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        NullIsFalsePredicate iPredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(iPredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", orPredicate);
        setField(iPredicate1, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", iPredicate);
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAny(IteratorUtils.java:1296) */
        IteratorUtils.matchesAny(iterator, orPredicate2);
    }
    
    @Test
    public void testMatchesAny17() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object descendingIterator = createInstance("java.util.ArrayDeque$DescendingIterator");
        arrayList.add(descendingIterator);
        arrayList.add(descendingIterator);
        arrayList.add(descendingIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate2);
        NullIsFalsePredicate nullIsFalsePredicate3 = new NullIsFalsePredicate(nullIsFalsePredicate2);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.NullIsFalsePredicate.evaluate(NullIsFalsePredicate.java:74)
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.functors.NullIsFalsePredicate.evaluate(NullIsFalsePredicate.java:74)
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.functors.NullIsFalsePredicate.evaluate(NullIsFalsePredicate.java:74)
            org.apache.commons.collections4.functors.NullIsFalsePredicate.evaluate(NullIsFalsePredicate.java:74)
            org.apache.commons.collections4.IteratorUtils.matchesAny(IteratorUtils.java:1296) */
        IteratorUtils.matchesAny(iterator, nullIsFalsePredicate3);
    }
    
    @Test
    public void testMatchesAny18() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        AndPredicate andPredicate = new AndPredicate(null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAny] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.AndPredicate.evaluate(AndPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAny(IteratorUtils.java:1296) */
        IteratorUtils.matchesAny(iterator, andPredicate);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.matchesAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesAll(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAll(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): False}
 * @utbot.executesCondition {@code (iterator != null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchesAll_IteratorEqualsNull() {
        NotPredicate notPredicate = new NotPredicate(null);
        
        boolean actual = IteratorUtils.matchesAll(null, notPredicate);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchesAll(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAll(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: predicate == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testMatchesAll_ThrowNullPointerException() {
        IteratorUtils.matchesAll(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchesAll(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#matchesAll(java.util.Iterator,org.apache.commons.collections4.Predicate)}
 * @utbot.executesCondition {@code (predicate == null): False}
 * @utbot.executesCondition {@code (iterator != null): True}
 * @utbot.iterates iterate the loop {@code while(iterator.hasNext())} once
 * @utbot.returnsFrom {@code return true;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testMatchesAll_ThrowNullPointerException_1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NotPredicate notPredicate = new NotPredicate(null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.NotPredicate.evaluate(NotPredicate.java:70)
            org.apache.commons.collections4.IteratorUtils.matchesAll(IteratorUtils.java:1325) */
        IteratorUtils.matchesAll(iterator, notPredicate);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchesAll(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    @Test
    public void testMatchesAll1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        
        boolean actual = IteratorUtils.matchesAll(iterator, orPredicate1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testMatchesAll2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, orPredicate);
        
        boolean actual = IteratorUtils.matchesAll(iterator, orPredicate1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testMatchesAll3() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        
        boolean actual = IteratorUtils.matchesAll(iterator, nullIsFalsePredicate2);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchesAll(java.util.Iterator, org.apache.commons.collections4.Predicate)
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll4() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object entryIterator = createInstance("java.util.WeakHashMap$EntryIterator");
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate);
        NullIsFalsePredicate nullIsFalsePredicate3 = new NullIsFalsePredicate(nullIsFalsePredicate2);
        NullIsFalsePredicate nullIsFalsePredicate4 = new NullIsFalsePredicate(nullIsFalsePredicate3);
        
        IteratorUtils.matchesAll(iterator, nullIsFalsePredicate4);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll5() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate2", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, orPredicate1);
        
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll6() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object deqIterator = createInstance("java.util.ArrayDeque$DeqIterator");
        arrayList.add(deqIterator);
        arrayList.add(deqIterator);
        arrayList.add(deqIterator);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate1);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate1, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate2);
        
        IteratorUtils.matchesAll(iterator, nullIsFalsePredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll7() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, orPredicate1);
        
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll8() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate2", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll9() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object deqIterator = createInstance("java.util.ArrayDeque$DeqIterator");
        arrayList.add(deqIterator);
        arrayList.add(deqIterator);
        arrayList.add(deqIterator);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate2 = new NullIsFalsePredicate(orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate2, null);
        
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll10() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate1, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        OrPredicate orPredicate3 = new OrPredicate(orPredicate, orPredicate2);
        
        IteratorUtils.matchesAll(iterator, orPredicate3);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll11() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Object entryIterator = createInstance("java.util.WeakHashMap$EntryIterator");
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        arrayList.add(entryIterator);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(orPredicate1);
        OrPredicate orPredicate2 = new OrPredicate(nullIsFalsePredicate, null);
        OrPredicate orPredicate3 = new OrPredicate(orPredicate2, null);
        OrPredicate orPredicate4 = new OrPredicate(orPredicate3, null);
        
        IteratorUtils.matchesAll(iterator, orPredicate4);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll12() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        NullIsFalsePredicate iPredicate1 = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", iPredicate1);
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate2", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        OrPredicate orPredicate3 = new OrPredicate(orPredicate2, null);
        
        IteratorUtils.matchesAll(iterator, orPredicate3);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testMatchesAll13() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        OrPredicate orPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(orPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test
    public void testMatchesAll14() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException] */
        IteratorUtils.matchesAll(iterator, orPredicate1);
    }
    
    @Test
    public void testMatchesAll15() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        OrPredicate iPredicate = ((OrPredicate) createInstance("org.apache.commons.collections4.functors.OrPredicate"));
        setField(iPredicate, "org.apache.commons.collections4.functors.OrPredicate", "iPredicate1", nullIsFalsePredicate);
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", iPredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, null);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(orPredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAll(IteratorUtils.java:1325) */
        IteratorUtils.matchesAll(iterator, orPredicate1);
    }
    
    @Test
    public void testMatchesAll16() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(nullIsFalsePredicate, orPredicate);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAll(IteratorUtils.java:1325) */
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test
    public void testMatchesAll17() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.functors.OrPredicate.evaluate(OrPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAll(IteratorUtils.java:1325) */
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test
    public void testMatchesAll18() throws Exception  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = ((NullIsFalsePredicate) createInstance("org.apache.commons.collections4.functors.NullIsFalsePredicate"));
        setField(nullIsFalsePredicate, "org.apache.commons.collections4.functors.NullIsFalsePredicate", "iPredicate", nullIsFalsePredicate);
        NullIsFalsePredicate nullIsFalsePredicate1 = new NullIsFalsePredicate(nullIsFalsePredicate);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate1, null);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException] */
        IteratorUtils.matchesAll(iterator, orPredicate2);
    }
    
    @Test
    public void testMatchesAll19() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        NullIsFalsePredicate nullIsFalsePredicate = new NullIsFalsePredicate(null);
        OrPredicate orPredicate = new OrPredicate(nullIsFalsePredicate, nullIsFalsePredicate);
        OrPredicate orPredicate1 = new OrPredicate(orPredicate, null);
        OrPredicate orPredicate2 = new OrPredicate(orPredicate1, null);
        OrPredicate orPredicate3 = new OrPredicate(nullIsFalsePredicate, orPredicate2);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException] */
        IteratorUtils.matchesAll(iterator, orPredicate3);
    }
    
    @Test
    public void testMatchesAll20() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        AndPredicate andPredicate = new AndPredicate(null, null);
        
        /* This test fails because method [org.apache.commons.collections4.IteratorUtils.matchesAll] produces [java.lang.NullPointerException]
            org.apache.commons.collections4.functors.AndPredicate.evaluate(AndPredicate.java:76)
            org.apache.commons.collections4.IteratorUtils.matchesAll(IteratorUtils.java:1325) */
        IteratorUtils.matchesAll(iterator, andPredicate);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.toListIterator
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toListIterator(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toListIterator(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testToListIterator_ThrowNullPointerException() {
        IteratorUtils.toListIterator(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toListIterator(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#toListIterator(java.util.Iterator)}
     */
    @Test
    public void testToListIterator() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        ListIteratorWrapper actual = ((ListIteratorWrapper) IteratorUtils.toListIterator(iterator));
        
        ListIteratorWrapper expected = ((ListIteratorWrapper) createInstance("org.apache.commons.collections4.iterators.ListIteratorWrapper"));
        Object iterator1 = createInstance("java.util.Collections$EmptyIterator");
        setField(expected, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "iterator", iterator1);
        ArrayList list = new ArrayList();
        setField(expected, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "list", list);
        
        Iterator expectedIterator = ((Iterator) getFieldValue(expected, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "iterator"));
        Iterator actualIterator = ((Iterator) getFieldValue(actual, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "iterator"));
        
        List expectedList = ((List) getFieldValue(expected, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "list"));
        List actualList = ((List) getFieldValue(actual, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "list"));
        assertTrue(deepEquals(expectedList, actualList));
        
        int expectedCurrentIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "currentIndex"));
        int actualCurrentIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "currentIndex"));
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedWrappedIteratorIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "wrappedIteratorIndex"));
        int actualWrappedIteratorIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "wrappedIteratorIndex"));
        assertEquals(expectedWrappedIteratorIndex, actualWrappedIteratorIndex);
        
        boolean actualRemoveState = ((Boolean) getFieldValue(actual, "org.apache.commons.collections4.iterators.ListIteratorWrapper", "removeState"));
        assertFalse(actualRemoveState);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections4.IteratorUtils.asEnumeration
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asEnumeration(java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link IteratorUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asEnumeration(java.util.Iterator)}
 * @utbot.executesCondition {@code (iterator == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: iterator == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAsEnumeration_ThrowNullPointerException() {
        IteratorUtils.asEnumeration(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asEnumeration(java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections4.IteratorUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.collections4.IteratorUtils#asEnumeration(java.util.Iterator)}
     */
    @Test
    public void testAsEnumeration() throws Exception  {
        Iterable iterable = emptyList();
        Iterator iterator = iterable.iterator();
        
        IteratorEnumeration actual = ((IteratorEnumeration) IteratorUtils.asEnumeration(iterator));
        
        Object emptyIterator = createInstance("java.util.Collections$EmptyIterator");
        Class iteratorEnumerationClazz = Class.forName("org.apache.commons.collections4.iterators.IteratorEnumeration");
        Class emptyIteratorType = Class.forName("java.util.Iterator");
        Constructor iteratorEnumerationConstructor = iteratorEnumerationClazz.getDeclaredConstructor(emptyIteratorType);
        iteratorEnumerationConstructor.setAccessible(true);
        java.lang.Object[] iteratorEnumerationConstructorArguments = new java.lang.Object[1];
        iteratorEnumerationConstructorArguments[0] = emptyIterator;
        IteratorEnumeration expected = ((IteratorEnumeration) iteratorEnumerationConstructor.newInstance(iteratorEnumerationConstructorArguments));
        
        Iterator expectedIterator = expected.getIterator();
        Iterator actualIterator = actual.getIterator();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields948317880771200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields948317880771200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass948317880776500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948317880771200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948317880776500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields948317884822800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields948317884822800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass948317884825000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948317884822800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948317884825000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields948317885463700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields948317885463700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass948317885465700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948317885463700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948317885465700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields948317886357000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields948317886357000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass948317886358900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields948317886357000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass948317886358900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


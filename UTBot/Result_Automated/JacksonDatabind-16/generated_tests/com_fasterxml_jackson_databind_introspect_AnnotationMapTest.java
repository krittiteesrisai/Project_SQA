package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_introspect_AnnotationMapTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.addIfNotPresent
    
    ///region FUZZER: ERROR SUITE for method addIfNotPresent(java.lang.annotation.Annotation)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#addIfNotPresent(java.lang.annotation.Annotation)}
     */
    @Test
    public void testAddIfNotPresentThrowsNPE() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotationMap.addIfNotPresent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationMap._add(AnnotationMap.java:111)
            com.fasterxml.jackson.databind.introspect.AnnotationMap.addIfNotPresent(AnnotationMap.java:77) */
        annotationMap.addIfNotPresent(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap._add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _add(java.lang.annotation.Annotation)
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#_add(java.lang.annotation.Annotation)}
 * @utbot.executesCondition {@code (_annotations == null): True}
 * @utbot.invokes {@link java.lang.annotation.Annotation#annotationType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Annotation previous = _annotations.put(ann.annotationType(), ann);
 *  */
    @Test
    public void test_add_ThrowNullPointerException() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotationMap._add] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationMap._add(AnnotationMap.java:111) */
        annotationMap._add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.annotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method annotations()
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#annotations()}
 * @utbot.executesCondition {@code (_annotations == null): True}
 * @utbot.invokes {@link java.util.Collections#emptyList()}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testAnnotations__annotationsEqualsNull() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        List actual = ((List) annotationMap.annotations());
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.add
    
    ///region FUZZER: ERROR SUITE for method add(java.lang.annotation.Annotation)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#add(java.lang.annotation.Annotation)}
     */
    @Test
    public void testAddThrowsNPE() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.AnnotationMap.add] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationMap._add(AnnotationMap.java:111)
            com.fasterxml.jackson.databind.introspect.AnnotationMap.add(AnnotationMap.java:90) */
        annotationMap.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#get(java.lang.Class)}
 * @utbot.executesCondition {@code (_annotations == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGet__annotationsEqualsNull() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        Annotation actual = annotationMap.get(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#toString()}
 * @utbot.executesCondition {@code (_annotations == null): True}
 * @utbot.returnsFrom {@code return "[null]";}
 *  */
    @Test
    public void testToString__annotationsEqualsNull() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        String actual = annotationMap.toString();
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#size()}
 * @utbot.executesCondition {@code ((_annotations == null)): True}
 * @utbot.returnsFrom {@code return (_annotations == null) ? 0 : _annotations.size();}
 *  */
    @Test
    public void testSize__annotationsEqualsNull() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        int actual = annotationMap.size();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.AnnotationMap.merge
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method merge(com.fasterxml.jackson.databind.introspect.AnnotationMap, com.fasterxml.jackson.databind.introspect.AnnotationMap)
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#merge(com.fasterxml.jackson.databind.introspect.AnnotationMap,com.fasterxml.jackson.databind.introspect.AnnotationMap)}
 * @utbot.executesCondition {@code (primary == null): True}
 * @utbot.returnsFrom {@code return secondary;}
 *  */
    @Test
    public void testMerge_PrimaryEqualsNull() {
        AnnotationMap actual = AnnotationMap.merge(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AnnotationMap}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.AnnotationMap#merge(com.fasterxml.jackson.databind.introspect.AnnotationMap,com.fasterxml.jackson.databind.introspect.AnnotationMap)}
 * @utbot.executesCondition {@code (primary == null): False}
 * @utbot.executesCondition {@code (primary._annotations == null): True}
 * @utbot.returnsFrom {@code return secondary;}
 *  */
    @Test
    public void testMerge_Primary_annotationsEqualsNull() {
        AnnotationMap annotationMap = new AnnotationMap();
        
        AnnotationMap actual = AnnotationMap.merge(annotationMap, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
    ///endregion
}


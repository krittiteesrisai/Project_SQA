package org.mockito.internal.configuration;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_mockito_internal_configuration_DefaultInjectionEngineTest {
    ///region Test suites for executable org.mockito.internal.configuration.DefaultInjectionEngine.injectMockCandidate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method injectMockCandidate(java.lang.Class, java.util.Set, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultInjectionEngine}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.DefaultInjectionEngine#injectMockCandidate(java.lang.Class,java.util.Set,java.lang.Object)}
 * @utbot.invokes org.mockito.internal.configuration.DefaultInjectionEngine#orderedInstanceFieldsFrom(java.lang.Class)
 *  */
    @Test
    public void testInjectMockCandidate_DefaultInjectionEngineOrderedInstanceFieldsFrom() throws Exception  {
        DefaultInjectionEngine defaultInjectionEngine = ((DefaultInjectionEngine) createInstance("org.mockito.internal.configuration.DefaultInjectionEngine"));
        Class class1 = Object.class;
        
        Class defaultInjectionEngineClazz = Class.forName("org.mockito.internal.configuration.DefaultInjectionEngine");
        Class class1Type = Class.forName("java.lang.Class");
        Class setType = Class.forName("java.util.Set");
        Method injectMockCandidateMethod = defaultInjectionEngineClazz.getDeclaredMethod("injectMockCandidate", class1Type, setType, class1);
        injectMockCandidateMethod.setAccessible(true);
        java.lang.Object[] injectMockCandidateMethodArguments = new java.lang.Object[3];
        injectMockCandidateMethodArguments[0] = class1;
        injectMockCandidateMethodArguments[1] = ((Object) null);
        injectMockCandidateMethodArguments[2] = ((Object) null);
        injectMockCandidateMethod.invoke(defaultInjectionEngine, injectMockCandidateMethodArguments);
    }
    ///endregion
    
    ///region Errors report for injectMockCandidate
    
    public void testInjectMockCandidate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 32 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.configuration.DefaultInjectionEngine.orderedInstanceFieldsFrom
    
    ///region Errors report for orderedInstanceFieldsFrom
    
    public void testOrderedInstanceFieldsFrom_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 31 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field root is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method injectMocksOnFields(java.util.Set, java.util.Set, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultInjectionEngine}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.DefaultInjectionEngine#injectMocksOnFields(java.util.Set,java.util.Set,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: for(Field field: injectMocksFields)
 *  */
    @Test
    public void testInjectMocksOnFields_ThrowIllegalArgumentException() {
        DefaultInjectionEngine defaultInjectionEngine = new DefaultInjectionEngine();
        
        /* This test fails because method [org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields] produces [java.lang.IllegalArgumentException: fieldOwner should not be null]
            org.mockito.internal.util.Checks.checkNotNull(Checks.java:20)
            org.mockito.internal.util.Checks.checkNotNull(Checks.java:11)
            org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection.<init>(MockInjection.java:62)
            org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection.<init>(MockInjection.java:50)
            org.mockito.internal.configuration.injection.MockInjection.onFields(MockInjection.java:44)
            org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields(DefaultInjectionEngine.java:21) */
        defaultInjectionEngine.injectMocksOnFields(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultInjectionEngine}
 * @utbot.methodUnderTest {@link org.mockito.internal.configuration.DefaultInjectionEngine#injectMocksOnFields(java.util.Set,java.util.Set,java.lang.Object)}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testInjectMocksOnFields_ThrowIllegalArgumentException_1() {
        DefaultInjectionEngine defaultInjectionEngine = new DefaultInjectionEngine();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields] produces [java.lang.IllegalArgumentException: fieldOwner should not be null]
            org.mockito.internal.util.Checks.checkNotNull(Checks.java:20)
            org.mockito.internal.util.Checks.checkNotNull(Checks.java:11)
            org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection.<init>(MockInjection.java:62)
            org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection.<init>(MockInjection.java:50)
            org.mockito.internal.configuration.injection.MockInjection.onFields(MockInjection.java:44)
            org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields(DefaultInjectionEngine.java:21) */
        defaultInjectionEngine.injectMocksOnFields(linkedHashSet, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method injectMocksOnFields(java.util.Set, java.util.Set, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.configuration.DefaultInjectionEngine}
     * @utbot.methodUnderTest {@link org.mockito.internal.configuration.DefaultInjectionEngine#injectMocksOnFields(java.util.Set,java.util.Set,java.lang.Object)}
     */
    @Test
    public void testInjectMocksOnFieldsThrowsIAE() {
        DefaultInjectionEngine defaultInjectionEngine = new DefaultInjectionEngine();
        HashSet hashSet = new HashSet();
        Object object = new Object();
        
        /* This test fails because method [org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields] produces [java.lang.IllegalArgumentException: mocks should not be null]
            org.mockito.internal.util.Checks.checkNotNull(Checks.java:20)
            org.mockito.internal.util.Checks.checkNotNull(Checks.java:11)
            org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection.withMocks(MockInjection.java:67)
            org.mockito.internal.configuration.DefaultInjectionEngine.injectMocksOnFields(DefaultInjectionEngine.java:22) */
        defaultInjectionEngine.injectMocksOnFields(hashSet, null, object);
    }
    ///endregion
    
    ///region Errors report for injectMocksOnFields
    
    public void testInjectMocksOnFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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


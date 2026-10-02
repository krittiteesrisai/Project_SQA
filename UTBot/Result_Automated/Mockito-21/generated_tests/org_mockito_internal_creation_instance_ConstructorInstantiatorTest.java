package org.mockito.internal.creation.instance;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_mockito_internal_creation_instance_ConstructorInstantiatorTest {
    ///region Test suites for executable org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newInstance(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#newInstance(java.lang.Class)}
 * @utbot.executesCondition {@code (outerClassInstance == null): True}
 * @utbot.invokes org.mockito.internal.creation.instance.ConstructorInstantiator#noArgConstructor(java.lang.Class)
 * @utbot.returnsFrom {@code return noArgConstructor(cls);}
 *  */
    @Test
    public void testNewInstance_OuterClassInstanceEqualsNull() {
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(null);
        Class class1 = Object.class;
        
        java.lang.Object[] actual = ((java.lang.Object[]) constructorInstantiator.newInstance(class1));
        
        java.lang.Object[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newInstance(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#newInstance(java.lang.Class)}
 * @utbot.executesCondition {@code (outerClassInstance == null): False}
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} 
 *  */
    @Test(expected = InstantationException.class)
    public void testNewInstance_ThrowInstantationException() {
        Object object = new Object();
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(object);
        Class class1 = Object.class;
        
        constructorInstantiator.newInstance(class1);
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#newInstance(java.lang.Class)}
 * @utbot.executesCondition {@code (outerClassInstance == null): False}
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} 
 *  */
    @Test(expected = InstantationException.class)
    public void testNewInstance_ThrowInstantationException_1() {
        Object object = new Object();
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(object);
        Class class1 = Object.class;
        
        constructorInstantiator.newInstance(class1);
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#newInstance(java.lang.Class)}
 * @utbot.executesCondition {@code (outerClassInstance == null): True}
 * @utbot.invokes org.mockito.internal.creation.instance.ConstructorInstantiator#noArgConstructor(java.lang.Class)
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} in: return noArgConstructor(cls);
 *  */
    @Test(expected = InstantationException.class)
    public void testNewInstance_ThrowInstantationException_2() {
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(null);
        
        constructorInstantiator.newInstance(null);
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#newInstance(java.lang.Class)}
 * @utbot.executesCondition {@code (outerClassInstance == null): False}
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} in: return withOuterClass(cls);
 *  */
    @Test(expected = InstantationException.class)
    public void testNewInstance_ThrowInstantationException_3() {
        Object object = new Object();
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(object);
        
        constructorInstantiator.newInstance(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.instance.ConstructorInstantiator.paramsException
    
    ///region Errors report for paramsException
    
    public void testParamsException_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.instance.ConstructorInstantiator.withOuterClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withOuterClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#withOuterClass(java.lang.Class)}
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} in:  catch (Exception e) {
 *     throw paramsException(cls, e);
 * }
 *  */
    @Test(expected = InstantationException.class)
    public void testWithOuterClass_ThrowInstantationException() throws Throwable  {
        Object object = new Object();
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(object);
        Class class1 = Object.class;
        
        Class constructorInstantiatorClazz = Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator");
        Class class1Type = Class.forName("java.lang.Class");
        Method withOuterClassMethod = constructorInstantiatorClazz.getDeclaredMethod("withOuterClass", class1Type);
        withOuterClassMethod.setAccessible(true);
        java.lang.Object[] withOuterClassMethodArguments = new java.lang.Object[1];
        withOuterClassMethodArguments[0] = class1;
        try {
            withOuterClassMethod.invoke(constructorInstantiator, withOuterClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#withOuterClass(java.lang.Class)}
 * @utbot.invokes org.mockito.internal.creation.instance.ConstructorInstantiator#paramsException(java.lang.Class,java.lang.Exception)
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} in:  catch (Exception e) {
 *     throw paramsException(cls, e);
 * }
 *  */
    @Test(expected = InstantationException.class)
    public void testWithOuterClass_ThrowInstantationException_1() throws Throwable  {
        Object object = new Object();
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(object);
        Class class1 = Object.class;
        
        Class constructorInstantiatorClazz = Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator");
        Class class1Type = Class.forName("java.lang.Class");
        Method withOuterClassMethod = constructorInstantiatorClazz.getDeclaredMethod("withOuterClass", class1Type);
        withOuterClassMethod.setAccessible(true);
        java.lang.Object[] withOuterClassMethodArguments = new java.lang.Object[1];
        withOuterClassMethodArguments[0] = class1;
        try {
            withOuterClassMethod.invoke(constructorInstantiator, withOuterClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#withOuterClass(java.lang.Class)}
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} in:  catch (Exception e) {
 *     throw paramsException(cls, e);
 * }
 *  */
    @Test(expected = InstantationException.class)
    public void testWithOuterClass_ThrowInstantationException_2() throws Throwable  {
        Object object = new Object();
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(object);
        Class class1 = Object.class;
        
        Class constructorInstantiatorClazz = Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator");
        Class class1Type = Class.forName("java.lang.Class");
        Method withOuterClassMethod = constructorInstantiatorClazz.getDeclaredMethod("withOuterClass", class1Type);
        withOuterClassMethod.setAccessible(true);
        java.lang.Object[] withOuterClassMethodArguments = new java.lang.Object[1];
        withOuterClassMethodArguments[0] = class1;
        try {
            withOuterClassMethod.invoke(constructorInstantiator, withOuterClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ConstructorInstantiator}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.instance.ConstructorInstantiator#withOuterClass(java.lang.Class)}
 * @utbot.invokes org.mockito.internal.creation.instance.ConstructorInstantiator#paramsException(java.lang.Class,java.lang.Exception)
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link org.mockito.internal.creation.instance.InstantationException} in:  catch (Exception e) {
 *     throw paramsException(cls, e);
 * }
 *  */
    @Test(expected = InstantationException.class)
    public void testWithOuterClass_ThrowInstantationException_3() throws Throwable  {
        ConstructorInstantiator constructorInstantiator = new ConstructorInstantiator(null);
        
        Class constructorInstantiatorClazz = Class.forName("org.mockito.internal.creation.instance.ConstructorInstantiator");
        Class classType = Class.forName("java.lang.Class");
        Method withOuterClassMethod = constructorInstantiatorClazz.getDeclaredMethod("withOuterClass", classType);
        withOuterClassMethod.setAccessible(true);
        java.lang.Object[] withOuterClassMethodArguments = new java.lang.Object[1];
        withOuterClassMethodArguments[0] = ((Object) null);
        try {
            withOuterClassMethod.invoke(constructorInstantiator, withOuterClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.instance.ConstructorInstantiator.noArgConstructor
    
    ///region Errors report for noArgConstructor
    
    public void testNoArgConstructor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
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


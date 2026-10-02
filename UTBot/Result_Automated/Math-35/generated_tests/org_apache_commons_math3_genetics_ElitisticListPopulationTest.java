package org.apache.commons.math3.genetics;

import org.junit.Test;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NotPositiveException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math3_genetics_ElitisticListPopulationTest {
    ///region Test suites for executable org.apache.commons.math3.genetics.ElitisticListPopulation.getElitismRate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getElitismRate()
    
    /**
    @utbot.classUnderTest {@link ElitisticListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#getElitismRate()}
 * @utbot.returnsFrom {@code return this.elitismRate;}
 *  */
    @Test
    public void testGetElitismRate_ReturnThisElitismRate() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        elitisticListPopulation.setElitismRate(0.0);
        
        double actual = elitisticListPopulation.getElitismRate();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ElitisticListPopulation.setElitismRate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setElitismRate(double)
    
    /**
    @utbot.classUnderTest {@link ElitisticListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#setElitismRate(double)}
 * @utbot.executesCondition {@code (elitismRate < 0): False}
 * @utbot.executesCondition {@code (elitismRate > 1): False}
 *  */
    @Test
    public void testSetElitismRate_ElitismRateLessOrEqual1() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        elitisticListPopulation.setElitismRate(0.0);
        
        elitisticListPopulation.setElitismRate(java.lang.Double.NaN);
        
        double finalElitisticListPopulationElitismRate = ((Double) getFieldValue(elitisticListPopulation, "org.apache.commons.math3.genetics.ElitisticListPopulation", "elitismRate"));
        
        assertEquals(java.lang.Double.NaN, finalElitisticListPopulationElitismRate, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setElitismRate(double)
    
    /**
    @utbot.classUnderTest {@link ElitisticListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#setElitismRate(double)}
 * @utbot.executesCondition {@code (elitismRate < 0): False}
 * @utbot.executesCondition {@code (elitismRate > 1): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} when: elitismRate < 0 || elitismRate > 1
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_ThrowOutOfRangeException() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        
        elitisticListPopulation.setElitismRate(2.0000000000004547);
    }
    
    /**
    @utbot.classUnderTest {@link ElitisticListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#setElitismRate(double)}
 * @utbot.executesCondition {@code (elitismRate < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} when: elitismRate < 0 || elitismRate > 1
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_ThrowOutOfRangeException_1() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        
        elitisticListPopulation.setElitismRate(-2.2250738585072034E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ElitisticListPopulation.nextGeneration
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextGeneration()
    
    /**
    @utbot.classUnderTest {@link ElitisticListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#nextGeneration()}
 * @utbot.invokes {@link org.apache.commons.math3.genetics.ElitisticListPopulation#getPopulationLimit()}
 * @utbot.invokes {@link org.apache.commons.math3.genetics.ElitisticListPopulation#getElitismRate()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotPositiveException} in: ElitisticListPopulation nextGeneration = new ElitisticListPopulation(this.getPopulationLimit(), this.getElitismRate());
 *  */
    @Test(expected = NotPositiveException.class)
    public void testNextGeneration_ThrowNotPositiveException() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        elitisticListPopulation.setElitismRate(0.0);
        
        elitisticListPopulation.nextGeneration();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextGeneration()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#nextGeneration()}
     */
    @Test
    public void testNextGeneration() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = new ElitisticListPopulation(1, 1.0);
        
        ElitisticListPopulation actual = ((ElitisticListPopulation) elitisticListPopulation.nextGeneration());
        
        ElitisticListPopulation expected = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        expected.setElitismRate(1.0);
        ArrayList chromosomes = new ArrayList();
        expected.setChromosomes(chromosomes);
        expected.setPopulationLimit(1);
        
        double expectedElitismRate = expected.getElitismRate();
        double actualElitismRate = actual.getElitismRate();
        assertEquals(expectedElitismRate, actualElitismRate, 1.0E-6);
        
        List expectedChromosomes = expected.getChromosomes();
        List actualChromosomes = actual.getChromosomes();
        assertTrue(deepEquals(expectedChromosomes, actualChromosomes));
        
        int expectedPopulationLimit = expected.getPopulationLimit();
        int actualPopulationLimit = actual.getPopulationLimit();
        org.junit.Assert.assertEquals(expectedPopulationLimit, actualPopulationLimit);
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#nextGeneration()}
     */
    @Test
    public void testNextGeneration1() throws Exception  {
        ArrayList arrayList = new ArrayList();
        ElitisticListPopulation elitisticListPopulation = new ElitisticListPopulation(arrayList, 1, 1.0);
        elitisticListPopulation.setElitismRate(java.lang.Double.NaN);
        
        ElitisticListPopulation actual = ((ElitisticListPopulation) elitisticListPopulation.nextGeneration());
        
        ElitisticListPopulation expected = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        expected.setElitismRate(java.lang.Double.NaN);
        ArrayList chromosomes = new ArrayList();
        expected.setChromosomes(chromosomes);
        expected.setPopulationLimit(1);
        
        double expectedElitismRate = expected.getElitismRate();
        double actualElitismRate = actual.getElitismRate();
        assertEquals(expectedElitismRate, actualElitismRate, 1.0E-6);
        
        List expectedChromosomes = expected.getChromosomes();
        List actualChromosomes = actual.getChromosomes();
        assertTrue(deepEquals(expectedChromosomes, actualChromosomes));
        
        int expectedPopulationLimit = expected.getPopulationLimit();
        int actualPopulationLimit = actual.getPopulationLimit();
        org.junit.Assert.assertEquals(expectedPopulationLimit, actualPopulationLimit);
        
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method nextGeneration()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ElitisticListPopulation#nextGeneration()}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testNextGenerationThrowsOOME() {
        ElitisticListPopulation elitisticListPopulation = new ElitisticListPopulation(1, 1.0);
        elitisticListPopulation.setPopulationLimit(Integer.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        elitisticListPopulation.setChromosomes(arrayList);
        elitisticListPopulation.setElitismRate(1.0);
        
        elitisticListPopulation.nextGeneration();
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields725877314393300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields725877314393300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass725877314401200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields725877314393300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass725877314401200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


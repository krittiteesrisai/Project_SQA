package org.apache.commons.math3.genetics;

import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math3_genetics_ListPopulationTest {
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#toString()}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.chromosomes.toString();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.toString] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.toString(ListPopulation.java:199) */
        anonymousListPopulation.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.iterator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#iterator()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return chromosomes.iterator();
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.iterator] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.iterator(ListPopulation.java:209) */
        anonymousListPopulation.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.getPopulationSize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPopulationSize()
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#getPopulationSize()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.chromosomes.size();
 *  */
    @Test
    public void testGetPopulationSize_ThrowNullPointerException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.getPopulationSize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.getPopulationSize(ListPopulation.java:191) */
        anonymousListPopulation.getPopulationSize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.getChromosomeList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChromosomeList()
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#getChromosomeList()}
 * @utbot.returnsFrom {@code return chromosomes;}
 *  */
    @Test
    public void testGetChromosomeList_ReturnChromosomes() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        List actual = anonymousListPopulation.getChromosomeList();
        
        assertNull(actual);
        
        List finalAnonymousListPopulationChromosomes = ((List) getFieldValue(anonymousListPopulation, "org.apache.commons.math3.genetics.ListPopulation", "chromosomes"));
        
        assertNull(finalAnonymousListPopulationChromosomes);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.setPopulationLimit
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPopulationLimit(int)
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#setPopulationLimit(int)}
 * @utbot.executesCondition {@code (populationLimit <= 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotPositiveException} when: populationLimit <= 0
 *  */
    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimit_ThrowNotPositiveException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        anonymousListPopulation.setPopulationLimit(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPopulationLimit(int)
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#setPopulationLimit(int)}
 * @utbot.executesCondition {@code (populationLimit <= 0): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: populationLimit < chromosomes.size()
 *  */
    @Test
    public void testSetPopulationLimit_ThrowNullPointerException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.setPopulationLimit] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.setPopulationLimit(ListPopulation.java:180) */
        anonymousListPopulation.setPopulationLimit(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.getPopulationLimit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPopulationLimit()
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#getPopulationLimit()}
 * @utbot.returnsFrom {@code return this.populationLimit;}
 *  */
    @Test
    public void testGetPopulationLimit_ReturnThisPopulationLimit() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        elitisticListPopulation.setPopulationLimit(-255);
        
        int actual = elitisticListPopulation.getPopulationLimit();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.addChromosome
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChromosome(org.apache.commons.math3.genetics.Chromosome)
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#addChromosome(org.apache.commons.math3.genetics.Chromosome)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: chromosomes.size() >= populationLimit
 *  */
    @Test
    public void testAddChromosome_ThrowNullPointerException() throws Exception  {
        ElitisticListPopulation elitisticListPopulation = ((ElitisticListPopulation) createInstance("org.apache.commons.math3.genetics.ElitisticListPopulation"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.addChromosome] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.addChromosome(ListPopulation.java:138) */
        elitisticListPopulation.addChromosome(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.addChromosomes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChromosomes(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#addChromosomes(java.util.Collection)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: chromosomes.size() + chromosomeColl.size() > populationLimit
 *  */
    @Test
    public void testAddChromosomes_ThrowNullPointerException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.addChromosomes] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.addChromosomes(ListPopulation.java:108) */
        anonymousListPopulation.addChromosomes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.setChromosomes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setChromosomes(java.util.List)
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#setChromosomes(java.util.List)}
 * @utbot.executesCondition {@code (chromosomes == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: chromosomes == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSetChromosomes_ThrowNullArgumentException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        anonymousListPopulation.setChromosomes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.genetics.ListPopulation.getFittestChromosome
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFittestChromosome()
    
    /**
    @utbot.classUnderTest {@link ListPopulation}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#getFittestChromosome()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Chromosome bestChromosome = this.chromosomes.get(0);
 *  */
    @Test
    public void testGetFittestChromosome_ThrowNullPointerException() throws Exception  {
        ListPopulation anonymousListPopulation = ((ListPopulation) createInstance("org.apache.commons.math3.genetics.TournamentSelection$1"));
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.getFittestChromosome] produces [java.lang.NullPointerException]
            org.apache.commons.math3.genetics.ListPopulation.getFittestChromosome(ListPopulation.java:151) */
        anonymousListPopulation.getFittestChromosome();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getFittestChromosome()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.genetics.ListPopulation}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.genetics.ListPopulation#getFittestChromosome()}
     */
    @Test
    public void testGetFittestChromosomeThrowsIOOBE() {
        ArrayList arrayList = new ArrayList();
        ElitisticListPopulation elitisticListPopulation = new ElitisticListPopulation(arrayList, 1, 1.0);
        
        /* This test fails because method [org.apache.commons.math3.genetics.ListPopulation.getFittestChromosome] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.genetics.ListPopulation.getFittestChromosome(ListPopulation.java:151) */
        elitisticListPopulation.getFittestChromosome();
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
        
            java.lang.reflect.Method methodForGetDeclaredFields725636079299300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields725636079299300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass725636079314600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields725636079299300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass725636079314600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


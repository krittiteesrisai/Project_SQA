package org.apache.commons.math3.distribution;

import org.junit.Test;
import java.util.ArrayList;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.SynchronizedRandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well1024a;
import java.util.Random;
import org.apache.commons.math3.util.Pair;
import org.apache.commons.math3.random.ISAACRandom;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;

public final class org_apache_commons_math3_distribution_DiscreteDistributionTest {
    ///region Test suites for executable org.apache.commons.math3.distribution.DiscreteDistribution.probability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method probability(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.returnsFrom {@code return probability;}
 *  */
    @Test
    public void testProbability_IterateForLoop() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        double actual = discreteDistribution.probability(null);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} twice
 * @utbot.returnsFrom {@code return probability;}
 *  */
    @Test
    public void testProbability_XEqualsNull() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        double actual = discreteDistribution.probability(null);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} twice
 * @utbot.returnsFrom {@code return probability;}
 *  */
    @Test
    public void testProbability_SingletonsGetEqualsNull() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        double actual = discreteDistribution.probability(null);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} twice
 * @utbot.returnsFrom {@code return probability;}
 *  */
    @Test
    public void testProbability_XEqualsNullAndXEquals() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        Integer integer = 0;
        singletons.add(integer);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        Integer integer1 = -1;
        
        double actual = discreteDistribution.probability(integer1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} twice
 * @utbot.returnsFrom {@code return probability;}
 *  */
    @Test
    public void testProbability_XNotEqualsNullAndXEquals() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        Integer integer = 0;
        singletons.add(integer);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        Integer integer1 = 0;
        
        double actual = discreteDistribution.probability(integer1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method probability(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: (x != null && x.equals(singletons.get(i)))
 *  */
    @Test
    public void testProbability_ThrowIndexOutOfBoundsException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:127) */
        discreteDistribution.probability(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < probabilities.length; i++)
 *  */
    @Test
    public void testProbability_ThrowNullPointerException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:125) */
        discreteDistribution.probability(null);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (x != null && x.equals(singletons.get(i)))
 *  */
    @Test
    public void testProbability_ThrowNullPointerException_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:127) */
        discreteDistribution.probability(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#probability(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (x == null && singletons.get(i) == null) || (x != null && x.equals(singletons.get(i)))
 *  */
    @Test
    public void testProbability_ThrowNullPointerException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:126) */
        discreteDistribution.probability(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method probability(java.lang.Object)
    
    @Test
    public void testProbability1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:126) */
        discreteDistribution.probability(null);
    }
    
    @Test
    public void testProbability2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        Character character = '\u0000';
        singletons.add(character);
        singletons.add(null);
        singletons.add(character);
        singletons.add(character);
        singletons.add(null);
        singletons.add(null);
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        Character character1 = '\u0000';
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:127) */
        discreteDistribution.probability(character1);
    }
    
    @Test
    public void testProbability3() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        Object object1 = createInstance("java.lang.Object");
        singletons.add(object1);
        singletons.add(null);
        singletons.add(object1);
        singletons.add(null);
        singletons.add(null);
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:126) */
        discreteDistribution.probability(null);
    }
    
    @Test
    public void testProbability4() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        singletons.add(null);
        singletons.add(null);
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        singletons.add(null);
        singletons.add(null);
        singletons.add(null);
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = new double[12];
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.probability] produces [java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.distribution.DiscreteDistribution.probability(DiscreteDistribution.java:126) */
        discreteDistribution.probability(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.DiscreteDistribution.sample
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sample(int)
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testSample_ReturnOut() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextDouble())).thenReturn(-1024.0);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {-4.450147717014404E-308};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        java.lang.Object[] actual = discreteDistribution.sample(1);
        
        java.lang.Object[] expected = new java.lang.Object[1];
        Object object1 = new Object();
        expected[0] = object1;
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 *  */
    @Test
    public void testSample_IterateForLoop() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        java.lang.Object[] actual = discreteDistribution.sample(1);
        
        java.lang.Object[] expected = new java.lang.Object[1];
        Object object1 = new Object();
        expected[0] = object1;
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        RandomGenerator randomGenerator = discreteDistribution.random;
        int finalDiscreteDistributionRandomMti = ((Integer) getFieldValue(randomGenerator, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(2, finalDiscreteDistributionRandomMti);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 *  */
    @Test
    public void testSample_IterateForLoop_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {2034797953, -1449913898};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        int[] i1 = {0, 0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        int[] i2 = {0, 1};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        int[] i3 = {0, 1};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        java.lang.Object[] actual = discreteDistribution.sample(1);
        
        java.lang.Object[] expected = new java.lang.Object[1];
        Object object1 = new Object();
        expected[0] = object1;
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        RandomGenerator randomGenerator = discreteDistribution.random;
        RandomGenerator randomGeneratorRandomWrapped = ((RandomGenerator) getFieldValue(randomGenerator, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped"));
        int finalDiscreteDistributionRandomWrappedIndex = ((Integer) getFieldValue(randomGeneratorRandomWrapped, "org.apache.commons.math3.random.AbstractWell", "index"));
        RandomGenerator randomGenerator1 = discreteDistribution.random;
        RandomGenerator randomGenerator1RandomWrapped = ((RandomGenerator) getFieldValue(randomGenerator1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped"));
        int[] randomGenerator1RandomWrappedRandomWrappedV = ((int[]) getFieldValue(randomGenerator1RandomWrapped, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomWrappedV0 = ((Integer) get(randomGenerator1RandomWrappedRandomWrappedV, 0));
        RandomGenerator randomGenerator2 = discreteDistribution.random;
        RandomGenerator randomGenerator2RandomWrapped = ((RandomGenerator) getFieldValue(randomGenerator2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped"));
        int[] randomGenerator2RandomWrappedRandomWrappedV = ((int[]) getFieldValue(randomGenerator2RandomWrapped, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomWrappedV1 = ((Integer) get(randomGenerator2RandomWrappedRandomWrappedV, 1));
        
        org.junit.Assert.assertEquals(0, finalDiscreteDistributionRandomWrappedIndex);
        
        org.junit.Assert.assertEquals(-989855744, finalDiscreteDistributionRandomWrappedV0);
        
        org.junit.Assert.assertEquals(-1492134528, finalDiscreteDistributionRandomWrappedV1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sample(int)
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.executesCondition {@code (sampleSize <= 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: for(int i = 0; i < sampleSize; i++)
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSample_ThrowNotStrictlyPositiveException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        
        discreteDistribution.sample(0);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.executesCondition {@code (sampleSize <= 0): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link java.lang.reflect.Array#newInstance(java.lang.Class,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSample_ThrowIndexOutOfBoundsException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextDouble())).thenReturn(-3.409296034496527E-308);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {-3.409296034496527E-308, java.lang.Double.POSITIVE_INFINITY};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        discreteDistribution.sample(1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sample(int)
    /// Actual number of generated tests (56) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextDouble())).thenReturn(-2.0547405865423334E208);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {3.1115076389305715E-61};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:91)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {56, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped1 = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(wrapped1, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(wrapped1, "org.apache.commons.math3.random.MersenneTwister", "mti", 623);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 623 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped1 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {268435456};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 268435456 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = sample();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {128, 56};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1, 56};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:91)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped1 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped1 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped1 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped1 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped1, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "index", 536870912);
        int[] iRm1 = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {56, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {536870912};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {33554432, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped2 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {56, 0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped3 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {56, 0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(wrapped3, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "index", 536870912);
        int[] iRm1 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {33554432, 0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {56, 0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped4 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sampleSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped2 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped3 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937a wrapped4 = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0, 0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(wrapped4, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(wrapped3, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped4);
        setField(wrapped2, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        Object object = createInstance("java.lang.Object");
        singletons.add(object);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:91)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:190) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T[] out = (T[]) java.lang.reflect.Array.newInstance(singletons.get(0).getClass(), sampleSize);
 *  */
    @Test
    public void testSample_ThrowNullPointerException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:187) */
        discreteDistribution.sample(1);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final T[] out = (T[]) java.lang.reflect.Array.newInstance(singletons.get(0).getClass(), sampleSize);
 *  */
    @Test
    public void testSample_ThrowNullPointerException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:187) */
        discreteDistribution.sample(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.DiscreteDistribution.sample
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sample()
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.returnsFrom {@code return singletons.get(singletons.size() - 1);}
 *  */
    @Test
    public void testSample_ListGet() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        ArrayList singletons = new ArrayList();
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        Object actual = discreteDistribution.sample();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.invokes {@link org.apache.commons.math3.random.RandomGenerator#nextDouble()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 *  */
    @Test
    public void testSample_RandomValueLessThanSum() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextDouble())).thenReturn(-128.11354064941406);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        ArrayList singletons = new ArrayList();
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {-2.227060577066493E-308};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        Object actual = discreteDistribution.sample();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sample()
    /// Actual number of generated tests (58) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_110() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_210() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_310() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_46() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1073741824);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_101() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_141() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:91)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_51() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_71() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_81() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_151() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_381() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_391() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {536870912};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_61() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {536870912};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_91() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_111() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_121() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_131() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_401() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_161() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped2 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_231() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 536870912);
        int[] iRm1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_241() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_321() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_351() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_171() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped2 = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:91)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_181() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_191() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_201() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_211() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {268435456};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 268435456 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_221() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_251() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_271() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_281() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_291() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_301() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_311() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_331() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_341() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_361() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_371() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_261() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well1024a wrapped2 = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {276824066, 406847488};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        int[] i3 = {0, 1073741824};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 2]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:91)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble(SynchronizedRandomGenerator.java:113)
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double randomValue = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowNullPointerException1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:157) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < probabilities.length; i++)
 *  */
    @Test
    public void testSample_ThrowNullPointerException_11() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException] */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return singletons.get(singletons.size() - 1);
 *  */
    @Test
    public void testSample_ThrowNullPointerException_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException] */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return singletons.get(i);
 *  */
    @Test
    public void testSample_ThrowNullPointerException_3() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextDouble())).thenReturn(-1.617835413613655E-231);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        double[] probabilities = {-2.368486822043799E-308};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException] */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < probabilities.length; i++)
 *  */
    @Test
    public void testSample_ThrowNullPointerException_4() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Random wrappedMock = mock(Random.class);
        (when((((RandomGenerator) wrappedMock)).nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException] */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return singletons.get(singletons.size() - 1);
 *  */
    @Test
    public void testSample_ThrowNullPointerException_5() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextDouble())).thenReturn(8.85264746054111E-221);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        double[] probabilities = {8.85264746054111E-221};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException] */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < probabilities.length; i++)
 *  */
    @Test
    public void testSample_ThrowNullPointerException_7() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:160) */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < probabilities.length; i++)
 *  */
    @Test
    public void testSample_ThrowNullPointerException_6() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException] */
        discreteDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < probabilities.length; i++)
 *  */
    @Test
    public void testSample_ThrowNullPointerException_8() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped1 = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well44497a wrapped2 = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {-759142398, 60819456};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        int[] i1 = {1, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        int[] i2 = {0, 1};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        int[] i3 = {0, 0};
        setField(wrapped2, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(wrapped1, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped2);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped1);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.sample(DiscreteDistribution.java:160) */
        discreteDistribution.sample();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sample()
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#sample()}
 * @utbot.invokes {@link org.apache.commons.math3.random.RandomGenerator#nextDouble()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return singletons.get(singletons.size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSample_ThrowIndexOutOfBoundsException1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        ArrayList singletons = new ArrayList();
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        discreteDistribution.sample();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.DiscreteDistribution.getSamples
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSamples()
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#getSamples()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.returnsFrom {@code return samples;}
 *  */
    @Test
    public void testGetSamples_IterateForLoop() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] probabilities = {};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        ArrayList actual = ((ArrayList) discreteDistribution.getSamples());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#getSamples()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} twice
 * @utbot.returnsFrom {@code return samples;}
 *  */
    @Test
    public void testGetSamples_ListAdd() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        singletons.add(null);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {4.9E-324};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        ArrayList actual = ((ArrayList) discreteDistribution.getSamples());
        
        ArrayList expected = new ArrayList();
        Double double1 = 4.9E-324;
        Pair pair = new Pair(null, double1);
        expected.add(pair);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSamples()
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#getSamples()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: samples.add(new Pair<T, Double>(singletons.get(i), probabilities[i]));
 *  */
    @Test
    public void testGetSamples_ThrowIndexOutOfBoundsException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ArrayList singletons = new ArrayList();
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "singletons", singletons);
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.getSamples] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.math3.distribution.DiscreteDistribution.getSamples(DiscreteDistribution.java:145) */
        discreteDistribution.getSamples();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#getSamples()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Pair<T, Double>> samples = new ArrayList<Pair<T, Double>>(probabilities.length);
 *  */
    @Test
    public void testGetSamples_ThrowNullPointerException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.getSamples] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.getSamples(DiscreteDistribution.java:142) */
        discreteDistribution.getSamples();
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#getSamples()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < probabilities.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: samples.add(new Pair<T, Double>(singletons.get(i), probabilities[i]));
 *  */
    @Test
    public void testGetSamples_ThrowNullPointerException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] probabilities = {0.0};
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "probabilities", probabilities);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.getSamples] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.getSamples(DiscreteDistribution.java:145) */
        discreteDistribution.getSamples();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reseedRandomGenerator(long)
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 *  */
    @Test
    public void testReseedRandomGenerator() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (((RandomGenerator) (doNothing()).when(randomMock))).setSeed(anyLong());
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", randomMock);
        
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 *  */
    @Test
    public void testReseedRandomGenerator_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", 0.0);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        discreteDistribution.reseedRandomGenerator(-255L);
        
        RandomGenerator randomGenerator = discreteDistribution.random;
        double finalDiscreteDistributionRandomNextGaussian = ((Double) getFieldValue(randomGenerator, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        assertEquals(java.lang.Double.NaN, finalDiscreteDistributionRandomNextGaussian, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 *  */
    @Test
    public void testReseedRandomGenerator_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", 0.0);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        discreteDistribution.reseedRandomGenerator(-255L);
        
        RandomGenerator randomGenerator = discreteDistribution.random;
        int[] randomGeneratorRandomV = ((int[]) getFieldValue(randomGenerator, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV0 = ((Integer) get(randomGeneratorRandomV, 0));
        RandomGenerator randomGenerator1 = discreteDistribution.random;
        int[] randomGenerator1RandomV = ((int[]) getFieldValue(randomGenerator1, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV1 = ((Integer) get(randomGenerator1RandomV, 1));
        RandomGenerator randomGenerator2 = discreteDistribution.random;
        int[] randomGenerator2RandomV = ((int[]) getFieldValue(randomGenerator2, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV2 = ((Integer) get(randomGenerator2RandomV, 2));
        RandomGenerator randomGenerator3 = discreteDistribution.random;
        double finalDiscreteDistributionRandomNextGaussian = ((Double) getFieldValue(randomGenerator3, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        org.junit.Assert.assertEquals(-1, finalDiscreteDistributionRandomV0);
        
        org.junit.Assert.assertEquals(-255, finalDiscreteDistributionRandomV1);
        
        org.junit.Assert.assertEquals(2, finalDiscreteDistributionRandomV2);
        
        assertEquals(java.lang.Double.NaN, finalDiscreteDistributionRandomNextGaussian, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reseedRandomGenerator(long)
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:146)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:172)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:216)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:151)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:172)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:216)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:151)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:172)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:216)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:232)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:236)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:245)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:232)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:233)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowNullPointerException() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowNullPointerException_1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.NullPointerException]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:193)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link DiscreteDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.DiscreteDistribution#reseedRandomGenerator(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: random.setSeed(seed);
 *  */
    @Test
    public void testReseedRandomGenerator_ThrowNullPointerException_2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.NullPointerException]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:193)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reseedRandomGenerator(long)
    
    @Test
    public void testReseedRandomGenerator1() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = new int[33];
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        discreteDistribution.reseedRandomGenerator(0L);
        
        RandomGenerator randomGenerator = discreteDistribution.random;
        int[] randomGeneratorRandomV = ((int[]) getFieldValue(randomGenerator, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV2 = ((Integer) get(randomGeneratorRandomV, 2));
        RandomGenerator randomGenerator1 = discreteDistribution.random;
        int[] randomGenerator1RandomV = ((int[]) getFieldValue(randomGenerator1, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV3 = ((Integer) get(randomGenerator1RandomV, 3));
        RandomGenerator randomGenerator2 = discreteDistribution.random;
        int[] randomGenerator2RandomV = ((int[]) getFieldValue(randomGenerator2, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV4 = ((Integer) get(randomGenerator2RandomV, 4));
        RandomGenerator randomGenerator3 = discreteDistribution.random;
        int[] randomGenerator3RandomV = ((int[]) getFieldValue(randomGenerator3, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV5 = ((Integer) get(randomGenerator3RandomV, 5));
        RandomGenerator randomGenerator4 = discreteDistribution.random;
        int[] randomGenerator4RandomV = ((int[]) getFieldValue(randomGenerator4, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV6 = ((Integer) get(randomGenerator4RandomV, 6));
        RandomGenerator randomGenerator5 = discreteDistribution.random;
        int[] randomGenerator5RandomV = ((int[]) getFieldValue(randomGenerator5, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV7 = ((Integer) get(randomGenerator5RandomV, 7));
        RandomGenerator randomGenerator6 = discreteDistribution.random;
        int[] randomGenerator6RandomV = ((int[]) getFieldValue(randomGenerator6, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV8 = ((Integer) get(randomGenerator6RandomV, 8));
        RandomGenerator randomGenerator7 = discreteDistribution.random;
        int[] randomGenerator7RandomV = ((int[]) getFieldValue(randomGenerator7, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV9 = ((Integer) get(randomGenerator7RandomV, 9));
        RandomGenerator randomGenerator8 = discreteDistribution.random;
        int[] randomGenerator8RandomV = ((int[]) getFieldValue(randomGenerator8, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV10 = ((Integer) get(randomGenerator8RandomV, 10));
        RandomGenerator randomGenerator9 = discreteDistribution.random;
        int[] randomGenerator9RandomV = ((int[]) getFieldValue(randomGenerator9, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV11 = ((Integer) get(randomGenerator9RandomV, 11));
        RandomGenerator randomGenerator10 = discreteDistribution.random;
        int[] randomGenerator10RandomV = ((int[]) getFieldValue(randomGenerator10, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV12 = ((Integer) get(randomGenerator10RandomV, 12));
        RandomGenerator randomGenerator11 = discreteDistribution.random;
        int[] randomGenerator11RandomV = ((int[]) getFieldValue(randomGenerator11, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV13 = ((Integer) get(randomGenerator11RandomV, 13));
        RandomGenerator randomGenerator12 = discreteDistribution.random;
        int[] randomGenerator12RandomV = ((int[]) getFieldValue(randomGenerator12, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV14 = ((Integer) get(randomGenerator12RandomV, 14));
        RandomGenerator randomGenerator13 = discreteDistribution.random;
        int[] randomGenerator13RandomV = ((int[]) getFieldValue(randomGenerator13, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV15 = ((Integer) get(randomGenerator13RandomV, 15));
        RandomGenerator randomGenerator14 = discreteDistribution.random;
        int[] randomGenerator14RandomV = ((int[]) getFieldValue(randomGenerator14, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV16 = ((Integer) get(randomGenerator14RandomV, 16));
        RandomGenerator randomGenerator15 = discreteDistribution.random;
        int[] randomGenerator15RandomV = ((int[]) getFieldValue(randomGenerator15, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV17 = ((Integer) get(randomGenerator15RandomV, 17));
        RandomGenerator randomGenerator16 = discreteDistribution.random;
        int[] randomGenerator16RandomV = ((int[]) getFieldValue(randomGenerator16, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV18 = ((Integer) get(randomGenerator16RandomV, 18));
        RandomGenerator randomGenerator17 = discreteDistribution.random;
        int[] randomGenerator17RandomV = ((int[]) getFieldValue(randomGenerator17, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV19 = ((Integer) get(randomGenerator17RandomV, 19));
        RandomGenerator randomGenerator18 = discreteDistribution.random;
        int[] randomGenerator18RandomV = ((int[]) getFieldValue(randomGenerator18, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV20 = ((Integer) get(randomGenerator18RandomV, 20));
        RandomGenerator randomGenerator19 = discreteDistribution.random;
        int[] randomGenerator19RandomV = ((int[]) getFieldValue(randomGenerator19, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV21 = ((Integer) get(randomGenerator19RandomV, 21));
        RandomGenerator randomGenerator20 = discreteDistribution.random;
        int[] randomGenerator20RandomV = ((int[]) getFieldValue(randomGenerator20, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV22 = ((Integer) get(randomGenerator20RandomV, 22));
        RandomGenerator randomGenerator21 = discreteDistribution.random;
        int[] randomGenerator21RandomV = ((int[]) getFieldValue(randomGenerator21, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV23 = ((Integer) get(randomGenerator21RandomV, 23));
        RandomGenerator randomGenerator22 = discreteDistribution.random;
        int[] randomGenerator22RandomV = ((int[]) getFieldValue(randomGenerator22, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV24 = ((Integer) get(randomGenerator22RandomV, 24));
        RandomGenerator randomGenerator23 = discreteDistribution.random;
        int[] randomGenerator23RandomV = ((int[]) getFieldValue(randomGenerator23, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV25 = ((Integer) get(randomGenerator23RandomV, 25));
        RandomGenerator randomGenerator24 = discreteDistribution.random;
        int[] randomGenerator24RandomV = ((int[]) getFieldValue(randomGenerator24, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV26 = ((Integer) get(randomGenerator24RandomV, 26));
        RandomGenerator randomGenerator25 = discreteDistribution.random;
        int[] randomGenerator25RandomV = ((int[]) getFieldValue(randomGenerator25, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV27 = ((Integer) get(randomGenerator25RandomV, 27));
        RandomGenerator randomGenerator26 = discreteDistribution.random;
        int[] randomGenerator26RandomV = ((int[]) getFieldValue(randomGenerator26, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV28 = ((Integer) get(randomGenerator26RandomV, 28));
        RandomGenerator randomGenerator27 = discreteDistribution.random;
        int[] randomGenerator27RandomV = ((int[]) getFieldValue(randomGenerator27, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV29 = ((Integer) get(randomGenerator27RandomV, 29));
        RandomGenerator randomGenerator28 = discreteDistribution.random;
        int[] randomGenerator28RandomV = ((int[]) getFieldValue(randomGenerator28, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV30 = ((Integer) get(randomGenerator28RandomV, 30));
        RandomGenerator randomGenerator29 = discreteDistribution.random;
        int[] randomGenerator29RandomV = ((int[]) getFieldValue(randomGenerator29, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV31 = ((Integer) get(randomGenerator29RandomV, 31));
        RandomGenerator randomGenerator30 = discreteDistribution.random;
        int[] randomGenerator30RandomV = ((int[]) getFieldValue(randomGenerator30, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalDiscreteDistributionRandomV32 = ((Integer) get(randomGenerator30RandomV, 32));
        
        org.junit.Assert.assertEquals(2, finalDiscreteDistributionRandomV2);
        
        org.junit.Assert.assertEquals(3, finalDiscreteDistributionRandomV3);
        
        org.junit.Assert.assertEquals(-670100786, finalDiscreteDistributionRandomV4);
        
        org.junit.Assert.assertEquals(1142332468, finalDiscreteDistributionRandomV5);
        
        org.junit.Assert.assertEquals(-648819365, finalDiscreteDistributionRandomV6);
        
        org.junit.Assert.assertEquals(-1745420816, finalDiscreteDistributionRandomV7);
        
        org.junit.Assert.assertEquals(-75120964, finalDiscreteDistributionRandomV8);
        
        org.junit.Assert.assertEquals(-737587825, finalDiscreteDistributionRandomV9);
        
        org.junit.Assert.assertEquals(1040030329, finalDiscreteDistributionRandomV10);
        
        org.junit.Assert.assertEquals(2128762427, finalDiscreteDistributionRandomV11);
        
        org.junit.Assert.assertEquals(1913107145, finalDiscreteDistributionRandomV12);
        
        org.junit.Assert.assertEquals(50794223, finalDiscreteDistributionRandomV13);
        
        org.junit.Assert.assertEquals(1596887286, finalDiscreteDistributionRandomV14);
        
        org.junit.Assert.assertEquals(894421850, finalDiscreteDistributionRandomV15);
        
        org.junit.Assert.assertEquals(-1548459901, finalDiscreteDistributionRandomV16);
        
        org.junit.Assert.assertEquals(1136944275, finalDiscreteDistributionRandomV17);
        
        org.junit.Assert.assertEquals(-90517149, finalDiscreteDistributionRandomV18);
        
        org.junit.Assert.assertEquals(776720301, finalDiscreteDistributionRandomV19);
        
        org.junit.Assert.assertEquals(1562435488, finalDiscreteDistributionRandomV20);
        
        org.junit.Assert.assertEquals(2143781974, finalDiscreteDistributionRandomV21);
        
        org.junit.Assert.assertEquals(1594647451, finalDiscreteDistributionRandomV22);
        
        org.junit.Assert.assertEquals(-2115320470, finalDiscreteDistributionRandomV23);
        
        org.junit.Assert.assertEquals(-765020710, finalDiscreteDistributionRandomV24);
        
        org.junit.Assert.assertEquals(616910973, finalDiscreteDistributionRandomV25);
        
        org.junit.Assert.assertEquals(-1456796237, finalDiscreteDistributionRandomV26);
        
        org.junit.Assert.assertEquals(156673644, finalDiscreteDistributionRandomV27);
        
        org.junit.Assert.assertEquals(1405734269, finalDiscreteDistributionRandomV28);
        
        org.junit.Assert.assertEquals(724792505, finalDiscreteDistributionRandomV29);
        
        org.junit.Assert.assertEquals(-67539446, finalDiscreteDistributionRandomV30);
        
        org.junit.Assert.assertEquals(-774697444, finalDiscreteDistributionRandomV31);
        
        org.junit.Assert.assertEquals(1952887497, finalDiscreteDistributionRandomV32);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reseedRandomGenerator(long)
    
    @Test
    public void testReseedRandomGenerator2() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = new int[14];
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:151)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:172)
            org.apache.commons.math3.random.MersenneTwister.setSeed(MersenneTwister.java:216)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(-255L);
    }
    
    @Test
    public void testReseedRandomGenerator3() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[31];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:204)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator4() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:239)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator5() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:242)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator6() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[20];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:201)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator7() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[31];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:203)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator8() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:242)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator9() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:239)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator10() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:245)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator11() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = new int[16];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:233)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator12() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[20];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:206)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator13() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = new int[16];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:232)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator14() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[31];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:208)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator15() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[31];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:207)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator16() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[31];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:205)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator17() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:239)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator18() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:245)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator19() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = {0, 0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:242)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator20() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = new int[15];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0, 0, 0, 0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:236)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator21() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = new int[16];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = {0};
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.ISAACRandom.shuffle(ISAACRandom.java:232)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:197)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator22() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = new int[33];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.NullPointerException]
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:193)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
    }
    
    @Test
    public void testReseedRandomGenerator23() throws Exception  {
        DiscreteDistribution discreteDistribution = ((DiscreteDistribution) createInstance("org.apache.commons.math3.distribution.DiscreteDistribution"));
        ISAACRandom random = ((ISAACRandom) createInstance("org.apache.commons.math3.random.ISAACRandom"));
        int[] rsl = new int[12];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "rsl", rsl);
        int[] arr = new int[13];
        setField(random, "org.apache.commons.math3.random.ISAACRandom", "arr", arr);
        setField(discreteDistribution, "org.apache.commons.math3.distribution.DiscreteDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator] produces [java.lang.NullPointerException]
            org.apache.commons.math3.random.ISAACRandom.setState(ISAACRandom.java:263)
            org.apache.commons.math3.random.ISAACRandom.initState(ISAACRandom.java:210)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:134)
            org.apache.commons.math3.random.ISAACRandom.setSeed(ISAACRandom.java:115)
            org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(DiscreteDistribution.java:110) */
        discreteDistribution.reseedRandomGenerator(0L);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields716607973749200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields716607973749200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass716607973753000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716607973749200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716607973753000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        if (hasCustomEquals(firstClass) && !org.mockito.Mockito.mockingDetails(o1).isMock()) {
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
        
            java.lang.reflect.Method methodForGetDeclaredFields716607976809600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields716607976809600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass716607976811900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716607976809600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716607976811900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


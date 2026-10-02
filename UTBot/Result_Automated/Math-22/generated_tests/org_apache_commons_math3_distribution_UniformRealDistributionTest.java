package org.apache.commons.math3.distribution;

import org.junit.Test;
import java.util.Random;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_math3_distribution_UniformRealDistributionTest {
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.getSolverAbsoluteAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolverAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#getSolverAbsoluteAccuracy()}
 * @utbot.returnsFrom {@code return solverAbsoluteAccuracy;}
 *  */
    @Test
    public void testGetSolverAbsoluteAccuracy_ReturnSolverAbsoluteAccuracy() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "solverAbsoluteAccuracy", 0.0);
        
        double actual = uniformRealDistribution.getSolverAbsoluteAccuracy();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumericalVariance()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#getNumericalVariance()}
 * @utbot.returnsFrom {@code return ul * ul / 12;}
 *  */
    @Test
    public void testGetNumericalVariance_ReturnUlMultiplyUlDivide12() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 0.0);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 0.0);
        
        double actual = uniformRealDistribution.getNumericalVariance();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.getSupportLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSupportLowerBound()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#getSupportLowerBound()}
 * @utbot.returnsFrom {@code return lower;}
 *  */
    @Test
    public void testGetSupportLowerBound_ReturnLower() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 0.0);
        
        double actual = uniformRealDistribution.getSupportLowerBound();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.cumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#cumulativeProbability(double)}
 * @utbot.executesCondition {@code (x <= lower): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testCumulativeProbability_XLessOrEqualLower() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 3.801480320755705E-270);
        
        double actual = uniformRealDistribution.cumulativeProbability(3.801480320755705E-270);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#cumulativeProbability(double)}
 * @utbot.executesCondition {@code (x <= lower): False}
 * @utbot.executesCondition {@code (x >= upper): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCumulativeProbability_XGreaterOrEqualUpper() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", -1.491670991371241E-154);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", -2.2250782351235202E-308);
        
        double actual = uniformRealDistribution.cumulativeProbability(-2.2250782351235202E-308);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#cumulativeProbability(double)}
 * @utbot.executesCondition {@code (x <= lower): False}
 * @utbot.executesCondition {@code (x >= upper): False}
 * @utbot.returnsFrom {@code return (x - lower) / (upper - lower);}
 *  */
    @Test
    public void testCumulativeProbability_XLessThanUpper() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 4.1921226380245574E-135);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 4.4735159337033826E20);
        
        double actual = uniformRealDistribution.cumulativeProbability(1.6940805386342483E-134);
        
        assertEquals(2.8498127506978562E-155, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.isSupportLowerBoundInclusive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportLowerBoundInclusive()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#isSupportLowerBoundInclusive()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportLowerBoundInclusive_ReturnTrue() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        
        boolean actual = uniformRealDistribution.isSupportLowerBoundInclusive();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.isSupportUpperBoundInclusive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportUpperBoundInclusive()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#isSupportUpperBoundInclusive()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSupportUpperBoundInclusive_ReturnFalse() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        
        boolean actual = uniformRealDistribution.isSupportUpperBoundInclusive();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.getSupportUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSupportUpperBound()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#getSupportUpperBound()}
 * @utbot.returnsFrom {@code return upper;}
 *  */
    @Test
    public void testGetSupportUpperBound_ReturnUpper() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 0.0);
        
        double actual = uniformRealDistribution.getSupportUpperBound();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.sample
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sample()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.returnsFrom {@code return u * upper + (1 - u) * lower;}
 *  */
    @Test
    public void testSample_ReturnUMultiplyUpperPlus1MinusUMultiplyLower() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", java.lang.Double.NaN);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", java.lang.Double.NaN);
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextDouble())).thenReturn(java.lang.Double.NaN);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", randomMock);
        
        double actual = uniformRealDistribution.sample();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.returnsFrom {@code return u * upper + (1 - u) * lower;}
 *  */
    @Test
    public void testSample_ReturnUMultiplyUpperPlus1MinusUMultiplyLower_1() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 0.0);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 0.0);
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        double actual = uniformRealDistribution.sample();
        
        assertEquals(0.0, actual, 1.0E-6);
        
        RandomGenerator randomGenerator = uniformRealDistribution.random;
        int finalUniformRealDistributionRandomMti = ((Integer) getFieldValue(randomGenerator, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(2, finalUniformRealDistributionRandomMti);
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.returnsFrom {@code return u * upper + (1 - u) * lower;}
 *  */
    @Test
    public void testSample_ReturnUMultiplyUpperPlus1MinusUMultiplyLower_2() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 0.0);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 0.0);
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {-1597965398, -458441718};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {3, 1};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", iRm1);
        int[] i2 = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        double actual = uniformRealDistribution.sample();
        
        assertEquals(0.0, actual, 1.0E-6);
        
        RandomGenerator randomGenerator = uniformRealDistribution.random;
        int[] randomGeneratorRandomV = ((int[]) getFieldValue(randomGenerator, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalUniformRealDistributionRandomV0 = ((Integer) get(randomGeneratorRandomV, 0));
        RandomGenerator randomGenerator1 = uniformRealDistribution.random;
        int[] randomGenerator1RandomV = ((int[]) getFieldValue(randomGenerator1, "org.apache.commons.math3.random.AbstractWell", "v"));
        int finalUniformRealDistributionRandomV1 = ((Integer) get(randomGenerator1RandomV, 1));
        
        org.junit.Assert.assertEquals(-1597997056, finalUniformRealDistributionRandomV0);
        
        org.junit.Assert.assertEquals(600605925, finalUniformRealDistributionRandomV1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sample()
    /// Actual number of generated tests (51) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1, 3};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_46() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
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
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
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
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", i1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
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
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well19937a random = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_47() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_48() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Well44497a random = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
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
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.AbstractRealDistribution", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double u = random.nextDouble();
 *  */
    @Test
    public void testSample_ThrowNullPointerException() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.UniformRealDistribution.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.UniformRealDistribution.sample(UniformRealDistribution.java:201) */
        uniformRealDistribution.sample();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sample()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#sample()}
     */
    @Test
    public void testSample() {
        UniformRealDistribution uniformRealDistribution = new UniformRealDistribution(4.450147717014403E-308, 1.0);
        
        double actual = uniformRealDistribution.sample();
        
        assertEquals(0.6265098716589559, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.density
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method density(double)
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#density(double)}
 * @utbot.executesCondition {@code (x < lower): True}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testDensity_XLessThanLower() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 1.1906270700354956E-286);
        
        double actual = uniformRealDistribution.density(-5.69554563554582E161);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#density(double)}
 * @utbot.executesCondition {@code (x < lower): False}
 * @utbot.executesCondition {@code (x > upper): True}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testDensity_XGreaterThanUpper() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", -1.9872231581449074E233);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", -3.382116824524382E271);
        
        double actual = uniformRealDistribution.density(-1.9872231581449074E233);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#density(double)}
 * @utbot.executesCondition {@code (x < lower): False}
 * @utbot.executesCondition {@code (x > upper): False}
 * @utbot.returnsFrom {@code return 1 / (upper - lower);}
 *  */
    @Test
    public void testDensity_XLessOrEqualUpper() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 2.649934767E-315);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 2.649934767E-315);
        
        double actual = uniformRealDistribution.density(2.649934767E-315);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumericalMean()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#getNumericalMean()}
 * @utbot.returnsFrom {@code return 0.5 * (lower + upper);}
 *  */
    @Test
    public void testGetNumericalMean_Return0dMultiplyLowerPlusUpper() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "lower", 0.0);
        setField(uniformRealDistribution, "org.apache.commons.math3.distribution.UniformRealDistribution", "upper", 0.0);
        
        double actual = uniformRealDistribution.getNumericalMean();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.UniformRealDistribution.isSupportConnected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportConnected()
    
    /**
    @utbot.classUnderTest {@link UniformRealDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.UniformRealDistribution#isSupportConnected()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportConnected_ReturnTrue() throws Exception  {
        UniformRealDistribution uniformRealDistribution = ((UniformRealDistribution) createInstance("org.apache.commons.math3.distribution.UniformRealDistribution"));
        
        boolean actual = uniformRealDistribution.isSupportConnected();
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields721679423134800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields721679423134800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass721679423140900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields721679423134800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass721679423140900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields721679424087900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields721679424087900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass721679424091800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields721679424087900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass721679424091800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.math.distribution;

import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.MathUserException;
import org.apache.commons.math.random.RandomDataImpl;
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomGenerator;
import org.mockito.MockedConstruction.Context;
import org.mockito.MockedConstruction;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.Well1024a;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockConstruction;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_distribution_NormalDistributionImplTest {
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStandardDeviation()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getStandardDeviation()}
 * @utbot.returnsFrom {@code return standardDeviation;}
 *  */
    @Test
    public void testGetStandardDeviation_ReturnStandardDeviation() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 0.0);
        
        double actual = normalDistributionImpl.getStandardDeviation();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#cumulativeProbability(double)}
     */
    @Test
    public void testCumulativeProbability() throws MathException  {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        
        double actual = normalDistributionImpl.cumulativeProbability(1.0);
        
        assertEquals(0.841344746068543, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#cumulativeProbability(double)}
     */
    @Test
    public void testCumulativeProbability1() throws MathException  {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        
        double actual = normalDistributionImpl.cumulativeProbability(1.0000000000000002);
        
        assertEquals(0.841344746068543, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainLowerBound(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainLowerBound(double)}
 * @utbot.executesCondition {@code (p < 0.5): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainLowerBound_PGreaterOrEqual0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        
        double actual = normalDistributionImpl.getDomainLowerBound(0.5);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainLowerBound(double)}
 * @utbot.executesCondition {@code (p < 0.5): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainLowerBound_PLessThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.getDomainLowerBound(4.9E-324);
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getSolverAbsoluteAccuracy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSolverAbsoluteAccuracy()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getSolverAbsoluteAccuracy()}
 * @utbot.returnsFrom {@code return solverAbsoluteAccuracy;}
 *  */
    @Test
    public void testGetSolverAbsoluteAccuracy_ReturnSolverAbsoluteAccuracy() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "solverAbsoluteAccuracy", 0.0);
        
        double actual = normalDistributionImpl.getSolverAbsoluteAccuracy();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inverseCumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.executesCondition {@code (p == 0): True}
 * @utbot.returnsFrom {@code return Double.NEGATIVE_INFINITY;}
 *  */
    @Test
    public void testInverseCumulativeProbability_PEqualsZero() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.inverseCumulativeProbability(0.0);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.executesCondition {@code (p == 0): False}
 * @utbot.executesCondition {@code (p == 1): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testInverseCumulativeProbability_PEquals1() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.inverseCumulativeProbability(1.0);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverseCumulativeProbability(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbability_ThrowOutOfRangeException() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        normalDistributionImpl.inverseCumulativeProbability(2.0000000000000004);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: return super.inverseCumulativeProbability(p);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbability_ThrowOutOfRangeException_1() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        normalDistributionImpl.inverseCumulativeProbability(-2.225073858507202E-308);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverseCumulativeProbability(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#inverseCumulativeProbability(double)}
     */
    @Test(expected = OutOfRangeException.class)
    public void testInverseCumulativeProbabilityThrowsOORE() throws MathException  {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        
        normalDistributionImpl.inverseCumulativeProbability(2.0);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverseCumulativeProbability(double)
    
    @Test(expected = MathUserException.class)
    public void testInverseCumulativeProbability1() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", -1.5000000000109583);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", -1.000000000005457);
        
        normalDistributionImpl.inverseCumulativeProbability(0.500030517578125);
    }
    
    @Test(expected = MathUserException.class)
    public void testInverseCumulativeProbability2() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", java.lang.Double.NaN);
        
        normalDistributionImpl.inverseCumulativeProbability(java.lang.Double.NaN);
    }
    
    @Test(expected = MathUserException.class)
    public void testInverseCumulativeProbability3() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 1.0E-323);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 4.9E-324);
        
        normalDistributionImpl.inverseCumulativeProbability(3.785766995733679E-270);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method inverseCumulativeProbability(double)
    
    @Test(expected = MathException.class)
    public void testInverseCumulativeProbability4() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 1.7696056504430788E308);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 2.808919967012471E306);
        
        normalDistributionImpl.inverseCumulativeProbability(0.5000009536743164);
    }
    
    @Test(expected = MathException.class)
    public void testInverseCumulativeProbability5() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", -5.698419504889039E154);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", -6.66448140044843E154);
        
        normalDistributionImpl.inverseCumulativeProbability(3.2379E-319);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomainUpperBound(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainUpperBound(double)}
 * @utbot.executesCondition {@code (p < 0.5): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainUpperBound_PGreaterOrEqual0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        
        double actual = normalDistributionImpl.getDomainUpperBound(0.5);
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getDomainUpperBound(double)}
 * @utbot.executesCondition {@code (p < 0.5): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetDomainUpperBound_PLessThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        
        double actual = normalDistributionImpl.getDomainUpperBound(4.9E-324);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMean()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getMean()}
 * @utbot.returnsFrom {@code return mean;}
 *  */
    @Test
    public void testGetMean_ReturnMean() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        
        double actual = normalDistributionImpl.getMean();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.density
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method density(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#density(double)}
     */
    @Test
    public void testDensity() {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        
        double actual = normalDistributionImpl.density(2.0);
        
        assertEquals(0.05399096651318806, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.sample
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sample()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.returnsFrom {@code return randomData.nextGaussian(mean, standardDeviation);}
 *  */
    @Test
    public void testSample_ReturnRandomDataNextGaussian() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        RandomAdaptor randMock = mock(RandomAdaptor.class);
        (when(randMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", randMock);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        double actual = normalDistributionImpl.sample();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.returnsFrom {@code return randomData.nextGaussian(mean, standardDeviation);}
 *  */
    @Test
    public void testSample_ReturnRandomDataNextGaussian_2() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 4.778309726736482E-299);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", -2.0000000000000004);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        double actual = normalDistributionImpl.sample();
        
        assertEquals(-9.556619453472966E-299, actual, 1.0E-6);
        
        RandomDataImpl randomDataImpl = normalDistributionImpl.randomData;
        RandomGenerator randomDataImplRandomDataRand = ((RandomGenerator) getFieldValue(randomDataImpl, "org.apache.commons.math.random.RandomDataImpl", "rand"));
        double finalNormalDistributionImplRandomDataRandNextGaussian = ((Double) getFieldValue(randomDataImplRandomDataRand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian"));
        
        assertEquals(java.lang.Double.NaN, finalNormalDistributionImplRandomDataRandNextGaussian, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.returnsFrom {@code return randomData.nextGaussian(mean, standardDeviation);}
 *  */
    @Test
    public void testSample_ReturnRandomDataNextGaussian_1() throws Exception  {
        MockedConstruction mockedConstruction = null;
        try {
            mockedConstruction = mockConstruction(JDKRandomGenerator.class, (JDKRandomGenerator jDKRandomGeneratorMock, Context context) -> (when(jDKRandomGeneratorMock.nextGaussian())).thenReturn(java.lang.Double.NaN));
            NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
            setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
            setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
            RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
            setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
            
            RandomDataImpl randomDataImpl = normalDistributionImpl.randomData;
            RandomGenerator initialNormalDistributionImplRandomDataRand = ((RandomGenerator) getFieldValue(randomDataImpl, "org.apache.commons.math.random.RandomDataImpl", "rand"));
            
            double actual = normalDistributionImpl.sample();
            
            assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
            
            RandomDataImpl randomDataImpl1 = normalDistributionImpl.randomData;
            RandomGenerator finalNormalDistributionImplRandomDataRand = ((RandomGenerator) getFieldValue(randomDataImpl1, "org.apache.commons.math.random.RandomDataImpl", "rand"));
            
            assertFalse(initialNormalDistributionImplRandomDataRand == finalNormalDistributionImplRandomDataRand);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sample()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 2.2250738585072014E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mt", mt);
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mti", 8);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.math.random.MersenneTwister.next(MersenneTwister.java:247)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:102)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", java.lang.Double.NaN);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        int[] mt = {};
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mt", mt);
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mti", 624);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.random.MersenneTwister.next(MersenneTwister.java:228)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        int[] mt = {0};
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mt", mt);
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mti", 624);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.random.MersenneTwister.next(MersenneTwister.java:231)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        MersenneTwister rand = ((MersenneTwister) createInstance("org.apache.commons.math.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mt", mt);
        setField(rand, "org.apache.commons.math.random.MersenneTwister", "mti", 624);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math.random.MersenneTwister.next(MersenneTwister.java:233)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", v);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        setField(rand, "org.apache.commons.math.random.AbstractWell", "index", 1073741824);
        int[] iRm1 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", iRm1);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        int[] v = {1073741824};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", i1);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i2", i1);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i3", v);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", java.lang.Double.NaN);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        setField(rand, "org.apache.commons.math.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i3", i3);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", java.lang.Double.NaN);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        setField(rand, "org.apache.commons.math.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i2", i2);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", java.lang.Double.NaN);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", i1);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i2", v);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        setField(rand, "org.apache.commons.math.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", i1);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        setField(rand, "org.apache.commons.math.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", iRm1);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", java.lang.Double.NaN);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        int[] v = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", iRm1);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i2", v);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i3", v);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 3.337610787760802E-308);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        Well1024a rand = ((Well1024a) createInstance("org.apache.commons.math.random.Well1024a"));
        int[] v = {0, 0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i1", i1);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i2", i1);
        setField(rand, "org.apache.commons.math.random.AbstractWell", "i3", i1);
        setField(rand, "org.apache.commons.math.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(randomData, "org.apache.commons.math.random.RandomDataImpl", "rand", rand);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math.random.RandomDataImpl.nextGaussian(RandomDataImpl.java:465)
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test
    public void testSample_ThrowNullPointerException() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 0.0);
        
        /* This test fails because method [org.apache.commons.math.distribution.NormalDistributionImpl.sample] produces [java.lang.NullPointerException]
            org.apache.commons.math.distribution.NormalDistributionImpl.sample(NormalDistributionImpl.java:186) */
        normalDistributionImpl.sample();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sample()
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
 * @utbot.invokes {@link org.apache.commons.math.random.RandomDataImpl#nextGaussian(double,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return randomData.nextGaussian(mean, standardDeviation);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSample_ThrowNotStrictlyPositiveException() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", -0.0);
        RandomDataImpl randomData = ((RandomDataImpl) createInstance("org.apache.commons.math.random.RandomDataImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.AbstractContinuousDistribution", "randomData", randomData);
        
        normalDistributionImpl.sample();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method sample()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#sample()}
     */
    @Test(expected = VerifyError.class)
    public void testSampleThrowsVE() throws MathException  {
        NormalDistributionImpl normalDistributionImpl = new NormalDistributionImpl();
        
        normalDistributionImpl.sample();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInitialDomain(double)
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getInitialDomain(double)}
 * @utbot.executesCondition {@code (p < 0.5): False}
 * @utbot.executesCondition {@code (p > 0.5): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_PGreaterThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 0.0);
        
        double actual = normalDistributionImpl.getInitialDomain(2.0000000000000004);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getInitialDomain(double)}
 * @utbot.executesCondition {@code (p < 0.5): False}
 * @utbot.executesCondition {@code (p > 0.5): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_PLessOrEqual0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        
        double actual = normalDistributionImpl.getInitialDomain(0.5);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NormalDistributionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.distribution.NormalDistributionImpl#getInitialDomain(double)}
 * @utbot.executesCondition {@code (p < 0.5): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testGetInitialDomain_PLessThan0d() throws Exception  {
        NormalDistributionImpl normalDistributionImpl = ((NormalDistributionImpl) createInstance("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "mean", 0.0);
        setField(normalDistributionImpl, "org.apache.commons.math.distribution.NormalDistributionImpl", "standardDeviation", 0.0);
        
        double actual = normalDistributionImpl.getInitialDomain(-4.9E-324);
        
        assertEquals(0.0, actual, 1.0E-6);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields735982433686300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields735982433686300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass735982433692900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields735982433686300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass735982433692900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields735982434097300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields735982434097300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass735982434101300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields735982434097300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass735982434101300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


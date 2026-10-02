package org.apache.commons.math3.distribution;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math3_distribution_HypergeometricDistributionTest {
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getDomain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDomain(int, int, int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getDomain(int,int,int)}
 * @utbot.returnsFrom {@code return new int[] { getLowerDomain(n, m, k), getUpperDomain(m, k) };}
 *  */
    @Test
    public void testGetDomain_ReturnNewArrayOfInt() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getDomain", intType, intType, intType);
        getDomainMethod.setAccessible(true);
        java.lang.Object[] getDomainMethodArguments = new java.lang.Object[3];
        getDomainMethodArguments[0] = 0;
        getDomainMethodArguments[1] = 0;
        getDomainMethodArguments[2] = 0;
        int[] actual = ((int[]) getDomainMethod.invoke(hypergeometricDistribution, getDomainMethodArguments));
        
        int[] expected = {0, 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getDomain(int,int,int)}
 * @utbot.returnsFrom {@code return new int[] { getLowerDomain(n, m, k), getUpperDomain(m, k) };}
 *  */
    @Test
    public void testGetDomain_ReturnNewArrayOfInt_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getDomain", intType, intType, intType);
        getDomainMethod.setAccessible(true);
        java.lang.Object[] getDomainMethodArguments = new java.lang.Object[3];
        getDomainMethodArguments[0] = 1;
        getDomainMethodArguments[1] = 0;
        getDomainMethodArguments[2] = 0;
        int[] actual = ((int[]) getDomainMethod.invoke(hypergeometricDistribution, getDomainMethodArguments));
        
        int[] expected = {0, 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getDomain(int,int,int)}
 * @utbot.returnsFrom {@code return new int[] { getLowerDomain(n, m, k), getUpperDomain(m, k) };}
 *  */
    @Test
    public void testGetDomain_ReturnNewArrayOfInt_2() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getDomain", intType, intType, intType);
        getDomainMethod.setAccessible(true);
        java.lang.Object[] getDomainMethodArguments = new java.lang.Object[3];
        getDomainMethodArguments[0] = -4;
        getDomainMethodArguments[1] = -3;
        getDomainMethodArguments[2] = -2;
        int[] actual = ((int[]) getDomainMethod.invoke(hypergeometricDistribution, getDomainMethodArguments));
        
        int[] expected = {0, -3};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getNumberOfSuccesses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumberOfSuccesses()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getNumberOfSuccesses()}
 * @utbot.returnsFrom {@code return numberOfSuccesses;}
 *  */
    @Test
    public void testGetNumberOfSuccesses_ReturnNumberOfSuccesses() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -255);
        
        int actual = hypergeometricDistribution.getNumberOfSuccesses();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.cumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cumulativeProbability(int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testCumulativeProbability_XLessThan0OfDomain() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 127);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 127);
        
        double actual = hypergeometricDistribution.cumulativeProbability(-1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): False}
 * @utbot.executesCondition {@code (x >= domain[1]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testCumulativeProbability_XGreaterOrEqual1OfDomain() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 1);
        
        double actual = hypergeometricDistribution.cumulativeProbability(0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testCumulativeProbability_XLessThan0OfDomain_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 4);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 8);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 4);
        
        double actual = hypergeometricDistribution.cumulativeProbability(-1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#cumulativeProbability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testCumulativeProbability_XLessThan0OfDomain_2() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -3);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -4);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2);
        
        double actual = hypergeometricDistribution.cumulativeProbability(-1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getSupportLowerBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSupportLowerBound()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSupportLowerBound()}
 * @utbot.returnsFrom {@code return FastMath.max(0, getSampleSize() + getNumberOfSuccesses() - getPopulationSize());}
 *  */
    @Test
    public void testGetSupportLowerBound_ReturnFastMathMax() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 12);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 140);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 127);
        
        int actual = hypergeometricDistribution.getSupportLowerBound();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSupportLowerBound()}
 * @utbot.returnsFrom {@code return FastMath.max(0, getSampleSize() + getNumberOfSuccesses() - getPopulationSize());}
 *  */
    @Test
    public void testGetSupportLowerBound_ReturnFastMathMax_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -1);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 2);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 3);
        
        int actual = hypergeometricDistribution.getSupportLowerBound();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.upperCumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method upperCumulativeProbability(int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#upperCumulativeProbability(int)}
 * @utbot.executesCondition {@code (x <= domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testUpperCumulativeProbability_XLessOrEqual0OfDomain() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 127);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 127);
        
        double actual = hypergeometricDistribution.upperCumulativeProbability(0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#upperCumulativeProbability(int)}
 * @utbot.executesCondition {@code (x <= domain[0]): False}
 * @utbot.executesCondition {@code (x > domain[1]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testUpperCumulativeProbability_XGreaterThan1OfDomain() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 1);
        
        double actual = hypergeometricDistribution.upperCumulativeProbability(1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#upperCumulativeProbability(int)}
 * @utbot.executesCondition {@code (x <= domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testUpperCumulativeProbability_XLessOrEqual0OfDomain_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        double actual = hypergeometricDistribution.upperCumulativeProbability(0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#upperCumulativeProbability(int)}
 * @utbot.executesCondition {@code (x <= domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testUpperCumulativeProbability_XLessOrEqual0OfDomain_2() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -3);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -4);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2);
        
        double actual = hypergeometricDistribution.upperCumulativeProbability(0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method innerCumulativeProbability(int, int, int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#innerCumulativeProbability(int,int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testInnerCumulativeProbability_ReturnRet() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 127);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 127);
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = -1;
        innerCumulativeProbabilityMethodArguments[1] = -1;
        innerCumulativeProbabilityMethodArguments[2] = -255;
        double actual = ((Double) innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#innerCumulativeProbability(int,int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testInnerCumulativeProbability_ReturnRet_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -1);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -1);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -1);
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = 0;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = -255;
        double actual = ((Double) innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#innerCumulativeProbability(int,int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testInnerCumulativeProbability_ReturnRet_2() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -3);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -4);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2);
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = -1;
        innerCumulativeProbabilityMethodArguments[1] = -1;
        innerCumulativeProbabilityMethodArguments[2] = -255;
        double actual = ((Double) innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#innerCumulativeProbability(int,int,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testInnerCumulativeProbability_ReturnRet_3() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 72);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 145);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 73);
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = -1;
        innerCumulativeProbabilityMethodArguments[1] = -1;
        innerCumulativeProbabilityMethodArguments[2] = 4;
        double actual = ((Double) innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method innerCumulativeProbability(int, int, int)
    
    @Test
    public void testInnerCumulativeProbability1() throws Throwable  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 2);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -1610614785);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 536910303);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 31]
            org.apache.commons.math3.distribution.SaddlePointExpansion.getStirlingError(SaddlePointExpansion.java:112)
            org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(SaddlePointExpansion.java:193)
            org.apache.commons.math3.distribution.HypergeometricDistribution.probability(HypergeometricDistribution.java:207)
            org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability(HypergeometricDistribution.java:253) */
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = 1;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = 0;
        try {
            innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInnerCumulativeProbability2() throws Throwable  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 1610612736);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -1073741827);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 1610612736);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 31]
            org.apache.commons.math3.distribution.SaddlePointExpansion.getStirlingError(SaddlePointExpansion.java:112)
            org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(SaddlePointExpansion.java:193)
            org.apache.commons.math3.distribution.HypergeometricDistribution.probability(HypergeometricDistribution.java:210)
            org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability(HypergeometricDistribution.java:253) */
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = 1073741825;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = 0;
        try {
            innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInnerCumulativeProbability3() throws Throwable  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 1073741824);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -536870914);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 1610612737);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 31]
            org.apache.commons.math3.distribution.SaddlePointExpansion.getStirlingError(SaddlePointExpansion.java:112)
            org.apache.commons.math3.distribution.SaddlePointExpansion.logBinomialProbability(SaddlePointExpansion.java:193)
            org.apache.commons.math3.distribution.HypergeometricDistribution.probability(HypergeometricDistribution.java:207)
            org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability(HypergeometricDistribution.java:253) */
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = 1;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = 0;
        try {
            innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method innerCumulativeProbability(int, int, int)
    
    @Test(timeout = 1000L)
    public void testInnerCumulativeProbability4() throws Throwable  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 2);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 409590262);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 409590260);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = 1;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = 0;
        try {
            innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testInnerCumulativeProbability5() throws Throwable  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 32837);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 2112547439);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 2054);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = 7;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = 0;
        try {
            innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testInnerCumulativeProbability6() throws Throwable  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -2);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2147483647);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method innerCumulativeProbabilityMethod = hypergeometricDistributionClazz.getDeclaredMethod("innerCumulativeProbability", intType, intType, intType);
        innerCumulativeProbabilityMethod.setAccessible(true);
        java.lang.Object[] innerCumulativeProbabilityMethodArguments = new java.lang.Object[3];
        innerCumulativeProbabilityMethodArguments[0] = Integer.MIN_VALUE;
        innerCumulativeProbabilityMethodArguments[1] = 0;
        innerCumulativeProbabilityMethodArguments[2] = 0;
        try {
            innerCumulativeProbabilityMethod.invoke(hypergeometricDistribution, innerCumulativeProbabilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getNumericalVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumericalVariance()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getNumericalVariance()}
 * @utbot.executesCondition {@code (!numericalVarianceIsCalculated): False}
 * @utbot.returnsFrom {@code return numericalVariance;}
 *  */
    @Test
    public void testGetNumericalVariance_NumericalVarianceIsCalculated() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numericalVariance", java.lang.Double.NaN);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numericalVarianceIsCalculated", true);
        
        double actual = hypergeometricDistribution.getNumericalVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getNumericalVariance()}
 * @utbot.executesCondition {@code (!numericalVarianceIsCalculated): True}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#calculateNumericalVariance()}
 * @utbot.returnsFrom {@code return numericalVariance;}
 *  */
    @Test
    public void testGetNumericalVariance_NotNumericalVarianceIsCalculated() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numericalVariance", 0.0);
        
        double actual = hypergeometricDistribution.getNumericalVariance();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
        
        double finalHypergeometricDistributionNumericalVariance = ((Double) getFieldValue(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numericalVariance"));
        boolean finalHypergeometricDistributionNumericalVarianceIsCalculated = ((Boolean) getFieldValue(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numericalVarianceIsCalculated"));
        
        org.junit.Assert.assertEquals(-0.0, finalHypergeometricDistributionNumericalVariance, 1.0E-6);
        
        assertTrue(finalHypergeometricDistributionNumericalVarianceIsCalculated);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.calculateNumericalVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method calculateNumericalVariance()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#calculateNumericalVariance()}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getPopulationSize()}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getNumberOfSuccesses()}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSampleSize()}
 * @utbot.returnsFrom {@code return (n * m * (N - n) * (N - m)) / (N * N * (N - 1));}
 *  */
    @Test
    public void testCalculateNumericalVariance_HypergeometricDistributionGetSampleSize() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -255);
        
        double actual = hypergeometricDistribution.calculateNumericalVariance();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getSupportUpperBound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSupportUpperBound()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSupportUpperBound()}
 * @utbot.returnsFrom {@code return FastMath.min(getNumberOfSuccesses(), getSampleSize());}
 *  */
    @Test
    public void testGetSupportUpperBound_ReturnFastMathMin() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -1);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2);
        
        int actual = hypergeometricDistribution.getSupportUpperBound();
        
        assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSupportUpperBound()}
 * @utbot.returnsFrom {@code return FastMath.min(getNumberOfSuccesses(), getSampleSize());}
 *  */
    @Test
    public void testGetSupportUpperBound_ReturnFastMathMin_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -255);
        
        int actual = hypergeometricDistribution.getSupportUpperBound();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getSampleSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSampleSize()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSampleSize()}
 * @utbot.returnsFrom {@code return sampleSize;}
 *  */
    @Test
    public void testGetSampleSize_ReturnSampleSize() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -255);
        
        int actual = hypergeometricDistribution.getSampleSize();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getPopulationSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPopulationSize()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getPopulationSize()}
 * @utbot.returnsFrom {@code return populationSize;}
 *  */
    @Test
    public void testGetPopulationSize_ReturnPopulationSize() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -255);
        
        int actual = hypergeometricDistribution.getPopulationSize();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getLowerDomain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLowerDomain(int, int, int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getLowerDomain(int,int,int)}
 * @utbot.returnsFrom {@code return FastMath.max(0, m - (n - k));}
 *  */
    @Test
    public void testGetLowerDomain_ReturnFastMathMax() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getLowerDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getLowerDomain", intType, intType, intType);
        getLowerDomainMethod.setAccessible(true);
        java.lang.Object[] getLowerDomainMethodArguments = new java.lang.Object[3];
        getLowerDomainMethodArguments[0] = 2;
        getLowerDomainMethodArguments[1] = 2;
        getLowerDomainMethodArguments[2] = 0;
        int actual = ((Integer) getLowerDomainMethod.invoke(hypergeometricDistribution, getLowerDomainMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getLowerDomain(int,int,int)}
 * @utbot.returnsFrom {@code return FastMath.max(0, m - (n - k));}
 *  */
    @Test
    public void testGetLowerDomain_ReturnFastMathMax_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getLowerDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getLowerDomain", intType, intType, intType);
        getLowerDomainMethod.setAccessible(true);
        java.lang.Object[] getLowerDomainMethodArguments = new java.lang.Object[3];
        getLowerDomainMethodArguments[0] = 192;
        getLowerDomainMethodArguments[1] = 127;
        getLowerDomainMethodArguments[2] = 64;
        int actual = ((Integer) getLowerDomainMethod.invoke(hypergeometricDistribution, getLowerDomainMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getNumericalMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumericalMean()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getNumericalMean()}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getSampleSize()}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getNumberOfSuccesses()}
 * @utbot.invokes {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getPopulationSize()}
 * @utbot.returnsFrom {@code return (double) (getSampleSize() * getNumberOfSuccesses()) / (double) getPopulationSize();}
 *  */
    @Test
    public void testGetNumericalMean_HypergeometricDistributionGetPopulationSize() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -255);
        
        double actual = hypergeometricDistribution.getNumericalMean();
        
        org.junit.Assert.assertEquals(-255.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.isSupportConnected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportConnected()
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#isSupportConnected()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportConnected_ReturnTrue() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        boolean actual = hypergeometricDistribution.isSupportConnected();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.getUpperDomain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUpperDomain(int, int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getUpperDomain(int,int)}
 * @utbot.returnsFrom {@code return FastMath.min(k, m);}
 *  */
    @Test
    public void testGetUpperDomain_ReturnFastMathMin() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getUpperDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getUpperDomain", intType, intType);
        getUpperDomainMethod.setAccessible(true);
        java.lang.Object[] getUpperDomainMethodArguments = new java.lang.Object[2];
        getUpperDomainMethodArguments[0] = -255;
        getUpperDomainMethodArguments[1] = -255;
        int actual = ((Integer) getUpperDomainMethod.invoke(hypergeometricDistribution, getUpperDomainMethodArguments));
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#getUpperDomain(int,int)}
 * @utbot.returnsFrom {@code return FastMath.min(k, m);}
 *  */
    @Test
    public void testGetUpperDomain_ReturnFastMathMin_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        
        Class hypergeometricDistributionClazz = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class intType = int.class;
        Method getUpperDomainMethod = hypergeometricDistributionClazz.getDeclaredMethod("getUpperDomain", intType, intType);
        getUpperDomainMethod.setAccessible(true);
        java.lang.Object[] getUpperDomainMethodArguments = new java.lang.Object[2];
        getUpperDomainMethodArguments[0] = -2;
        getUpperDomainMethodArguments[1] = -1;
        int actual = ((Integer) getUpperDomainMethod.invoke(hypergeometricDistribution, getUpperDomainMethodArguments));
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.HypergeometricDistribution.probability
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method probability(int)
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#probability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XLessThan0OfDomain() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 127);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 127);
        
        double actual = hypergeometricDistribution.probability(-1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#probability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): False}
 * @utbot.executesCondition {@code (x > domain[1]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XGreaterThan1OfDomain() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -1);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -1);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -1);
        
        double actual = hypergeometricDistribution.probability(0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#probability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XLessThan0OfDomain_1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", -3);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -4);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2);
        
        double actual = hypergeometricDistribution.probability(-1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link HypergeometricDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.HypergeometricDistribution#probability(int)}
 * @utbot.executesCondition {@code (x < domain[0]): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testProbability_XLessThan0OfDomain_2() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 127);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 255);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 128);
        
        double actual = hypergeometricDistribution.probability(-1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method probability(int)
    
    @Test
    public void testProbability1() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 4);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", 913833986);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 913833983);
        
        double actual = hypergeometricDistribution.probability(1);
        
        org.junit.Assert.assertEquals(3.144917999222516E-26, actual, 1.0E-6);
    }
    
    @Test
    public void testProbability2() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -2);
        
        double actual = hypergeometricDistribution.probability(0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testProbability3() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", Integer.MIN_VALUE);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", -2147483645);
        
        double actual = hypergeometricDistribution.probability(1073741824);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method probability(int)
    
    @Test
    public void testProbability4() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 738197504);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -2078932226);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 2014838789);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.probability] produces [java.lang.ArrayIndexOutOfBoundsException] */
        hypergeometricDistribution.probability(603979777);
    }
    
    @Test
    public void testProbability5() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 8);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -1499507204);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 1478526664);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.probability] produces [java.lang.ArrayIndexOutOfBoundsException] */
        hypergeometricDistribution.probability(2);
    }
    
    @Test
    public void testProbability6() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 273219653);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -1993779235);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 143972278);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.probability] produces [java.lang.ArrayIndexOutOfBoundsException] */
        hypergeometricDistribution.probability(9754551);
    }
    
    @Test
    public void testProbability7() throws Exception  {
        HypergeometricDistribution hypergeometricDistribution = ((HypergeometricDistribution) createInstance("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "numberOfSuccesses", 671088640);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "populationSize", -805306370);
        setField(hypergeometricDistribution, "org.apache.commons.math3.distribution.HypergeometricDistribution", "sampleSize", 671088645);
        
        /* This test fails because method [org.apache.commons.math3.distribution.HypergeometricDistribution.probability] produces [java.lang.ArrayIndexOutOfBoundsException] */
        hypergeometricDistribution.probability(536870913);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields706334030625700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields706334030625700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass706334030635700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields706334030625700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass706334030635700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields706334030976600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields706334030976600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass706334030982900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields706334030976600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass706334030982900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


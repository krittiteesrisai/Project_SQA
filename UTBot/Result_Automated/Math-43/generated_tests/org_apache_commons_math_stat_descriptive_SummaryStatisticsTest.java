package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import java.lang.reflect.Method;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.MathIllegalStateException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_stat_descriptive_SummaryStatisticsTest {
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValue(double)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): False}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 *  */
    @Test
    public void testAddValue_NotGeoMeanImplInstanceOfGeometricMean() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumsqImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumsqImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Variance varianceImpl = ((Variance) createInstance("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(java.lang.Double.NaN);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment5 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment5, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        double finalSummaryStatisticsSumImplValue = ((Double) getFieldValue(summaryStatisticsSumImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        double finalSummaryStatisticsSumsqImplValue = ((Double) getFieldValue(summaryStatisticsSumsqImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        double finalSummaryStatisticsMaxImplValue = ((Double) getFieldValue(summaryStatisticsMaxImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsSumImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSumImplValue, 1.0E-6);
        
        assertEquals(3L, finalSummaryStatisticsSumsqImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSumsqImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMaxImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMaxImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): False}
 *  */
    @Test
    public void testAddValue_GeoMeanImplNotInstanceOfGeometricMean_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        GeometricMean geoMeanImpl = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = minImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(java.lang.Double.NaN);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment5 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment5, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        double finalSummaryStatisticsSumImplValue = ((Double) getFieldValue(summaryStatisticsSumImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        double finalSummaryStatisticsSumsqImplValue = ((Double) getFieldValue(summaryStatisticsSumsqImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        long finalSummaryStatisticsMinImplN = ((Long) getFieldValue(summaryStatisticsMinImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        double finalSummaryStatisticsMinImplValue = ((Double) getFieldValue(summaryStatisticsMinImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        double finalSummaryStatisticsMaxImplValue = ((Double) getFieldValue(summaryStatisticsMaxImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsSumImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSumImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumsqImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSumsqImplValue, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsMinImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMinImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMaxImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMaxImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 *  */
    @Test
    public void testAddValue_NotGeoMeanImplInstanceOfGeometricMean_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum sumLogImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Max geoMeanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", -3.560118173611523E-307);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = sumLogImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(1.5274681817498023E-151);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        double finalSummaryStatisticsSumImplValue = ((Double) getFieldValue(summaryStatisticsSumImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        double finalSummaryStatisticsSumsqImplValue = ((Double) getFieldValue(summaryStatisticsSumsqImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        long finalSummaryStatisticsMinImplN = ((Long) getFieldValue(summaryStatisticsMinImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        double finalSummaryStatisticsMinImplValue = ((Double) getFieldValue(summaryStatisticsMinImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        double finalSummaryStatisticsMaxImplValue = ((Double) getFieldValue(summaryStatisticsMaxImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumLogImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumLogImpl"));
        long finalSummaryStatisticsSumLogImplN = ((Long) getFieldValue(summaryStatisticsSumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumLogImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumLogImpl"));
        double finalSummaryStatisticsSumLogImplValue = ((Double) getFieldValue(summaryStatisticsSumLogImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsGeoMeanImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "geoMeanImpl"));
        long finalSummaryStatisticsGeoMeanImplN = ((Long) getFieldValue(summaryStatisticsGeoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n"));
        StorelessUnivariateStatistic summaryStatisticsGeoMeanImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "geoMeanImpl"));
        double finalSummaryStatisticsGeoMeanImplValue = ((Double) getFieldValue(summaryStatisticsGeoMeanImpl1, "org.apache.commons.math.stat.descriptive.rank.Max", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        assertEquals(1L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(1.5274681817498023E-151, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.5274681817498023E-151, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.5274681817498023E-151, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumImplN);
        
        org.junit.Assert.assertEquals(2.3331590462580472E-302, finalSummaryStatisticsSumImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumsqImplN);
        
        org.junit.Assert.assertEquals(1.5274681817498023E-151, finalSummaryStatisticsSumsqImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMinImplN);
        
        org.junit.Assert.assertEquals(2.3331590462580472E-302, finalSummaryStatisticsMinImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMaxImplN);
        
        org.junit.Assert.assertEquals(1.5274681817498023E-151, finalSummaryStatisticsMaxImplValue, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsSumLogImplN);
        
        org.junit.Assert.assertEquals(3.0549363634996047E-151, finalSummaryStatisticsSumLogImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsGeoMeanImplN);
        
        org.junit.Assert.assertEquals(1.5274681817498023E-151, finalSummaryStatisticsGeoMeanImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): False}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 *  */
    @Test
    public void testAddValue_NotGeoMeanImplInstanceOfGeometricMean_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", -9223372036854775806L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Variance varianceImpl = ((Variance) createInstance("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(java.lang.Double.NaN);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment5 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment5, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        double finalSummaryStatisticsSumImplValue = ((Double) getFieldValue(summaryStatisticsSumImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        double finalSummaryStatisticsSumsqImplValue = ((Double) getFieldValue(summaryStatisticsSumsqImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        long finalSummaryStatisticsMinImplN = ((Long) getFieldValue(summaryStatisticsMinImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        double finalSummaryStatisticsMinImplValue = ((Double) getFieldValue(summaryStatisticsMinImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        double finalSummaryStatisticsMaxImplValue = ((Double) getFieldValue(summaryStatisticsMaxImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsGeoMeanImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "geoMeanImpl"));
        long finalSummaryStatisticsGeoMeanImplN = ((Long) getFieldValue(summaryStatisticsGeoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsGeoMeanImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "geoMeanImpl"));
        double finalSummaryStatisticsGeoMeanImplValue = ((Double) getFieldValue(summaryStatisticsGeoMeanImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        assertEquals(-9223372036854775805L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(2L, finalSummaryStatisticsSumImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSumImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumsqImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSumsqImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMinImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMinImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMaxImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMaxImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsGeoMeanImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsGeoMeanImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): False}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)}
 *  */
    @Test
    public void testAddValue_NotMeanImplInstanceOfMean() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        GeometricMean geoMeanImpl = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(-0.0);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        long finalSummaryStatisticsMinImplN = ((Long) getFieldValue(summaryStatisticsMinImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMeanImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "meanImpl"));
        long finalSummaryStatisticsMeanImplN = ((Long) getFieldValue(summaryStatisticsMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n"));
        StorelessUnivariateStatistic summaryStatisticsMeanImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "meanImpl"));
        double finalSummaryStatisticsMeanImplValue = ((Double) getFieldValue(summaryStatisticsMeanImpl1, "org.apache.commons.math.stat.descriptive.rank.Min", "value"));
        StorelessUnivariateStatistic summaryStatisticsVarianceImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "varianceImpl"));
        int finalSummaryStatisticsVarianceImplN = ((Integer) getFieldValue(summaryStatisticsVarianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "n"));
        StorelessUnivariateStatistic summaryStatisticsVarianceImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "varianceImpl"));
        double finalSummaryStatisticsVarianceImplValue = ((Double) getFieldValue(summaryStatisticsVarianceImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        assertEquals(2L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(-0.0, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumImplN);
        
        assertEquals(1L, finalSummaryStatisticsSumsqImplN);
        
        assertEquals(1L, finalSummaryStatisticsMinImplN);
        
        assertEquals(2L, finalSummaryStatisticsMaxImplN);
        
        assertEquals(1L, finalSummaryStatisticsMeanImplN);
        
        org.junit.Assert.assertEquals(-0.0, finalSummaryStatisticsMeanImplValue, 1.0E-6);
        
        assertEquals(1, finalSummaryStatisticsVarianceImplN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalSummaryStatisticsVarianceImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): False}
 *  */
    @Test
    public void testAddValue_GeoMeanImplNotInstanceOfGeometricMean() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", -9223372036854775806L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum sumLogImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        GeometricMean geoMeanImpl = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Min varianceImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 2.225073858507202E-308);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(-8.589934592E9);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment5 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment5, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        double finalSummaryStatisticsSumImplValue = ((Double) getFieldValue(summaryStatisticsSumImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        double finalSummaryStatisticsSumsqImplValue = ((Double) getFieldValue(summaryStatisticsSumsqImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        long finalSummaryStatisticsMinImplN = ((Long) getFieldValue(summaryStatisticsMinImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        double finalSummaryStatisticsMinImplValue = ((Double) getFieldValue(summaryStatisticsMinImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        double finalSummaryStatisticsMaxImplValue = ((Double) getFieldValue(summaryStatisticsMaxImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumLogImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumLogImpl"));
        long finalSummaryStatisticsSumLogImplN = ((Long) getFieldValue(summaryStatisticsSumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumLogImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumLogImpl"));
        double finalSummaryStatisticsSumLogImplValue = ((Double) getFieldValue(summaryStatisticsSumLogImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsVarianceImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "varianceImpl"));
        long finalSummaryStatisticsVarianceImplN = ((Long) getFieldValue(summaryStatisticsVarianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n"));
        StorelessUnivariateStatistic summaryStatisticsVarianceImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "varianceImpl"));
        double finalSummaryStatisticsVarianceImplValue = ((Double) getFieldValue(summaryStatisticsVarianceImpl1, "org.apache.commons.math.stat.descriptive.rank.Min", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(7.378697629483821E19, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        assertEquals(-9223372036854775805L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(9.313225746154785E-10, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(-8.589934592E9, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(9.313225746154785E-10, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumImplN);
        
        org.junit.Assert.assertEquals(7.378697629483821E19, finalSummaryStatisticsSumImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumsqImplN);
        
        org.junit.Assert.assertEquals(-8.589934592E9, finalSummaryStatisticsSumsqImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMinImplN);
        
        org.junit.Assert.assertEquals(7.378697629483821E19, finalSummaryStatisticsMinImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMaxImplN);
        
        org.junit.Assert.assertEquals(-8.589934592E9, finalSummaryStatisticsMaxImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumLogImplN);
        
        org.junit.Assert.assertEquals(-8.589934592E9, finalSummaryStatisticsSumLogImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsVarianceImplN);
        
        org.junit.Assert.assertEquals(-8.589934592E9, finalSummaryStatisticsVarianceImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): False}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 *  */
    @Test
    public void testAddValue_NotGeoMeanImplInstanceOfGeometricMean_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum sumLogImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Min geoMeanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 3.66378881482709E-302);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Variance varianceImpl = ((Variance) createInstance("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.addValue(-2192.0625);
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        long finalSummaryStatisticsSecondMomentN = ((Long) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        long finalSummaryStatisticsSumImplN = ((Long) getFieldValue(summaryStatisticsSumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumImpl"));
        double finalSummaryStatisticsSumImplValue = ((Double) getFieldValue(summaryStatisticsSumImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        long finalSummaryStatisticsSumsqImplN = ((Long) getFieldValue(summaryStatisticsSumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumsqImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumsqImpl"));
        double finalSummaryStatisticsSumsqImplValue = ((Double) getFieldValue(summaryStatisticsSumsqImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        long finalSummaryStatisticsMinImplN = ((Long) getFieldValue(summaryStatisticsMinImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n"));
        StorelessUnivariateStatistic summaryStatisticsMinImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "minImpl"));
        double finalSummaryStatisticsMinImplValue = ((Double) getFieldValue(summaryStatisticsMinImpl1, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        long finalSummaryStatisticsMaxImplN = ((Long) getFieldValue(summaryStatisticsMaxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsMaxImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "maxImpl"));
        double finalSummaryStatisticsMaxImplValue = ((Double) getFieldValue(summaryStatisticsMaxImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsSumLogImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumLogImpl"));
        long finalSummaryStatisticsSumLogImplN = ((Long) getFieldValue(summaryStatisticsSumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n"));
        StorelessUnivariateStatistic summaryStatisticsSumLogImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "sumLogImpl"));
        double finalSummaryStatisticsSumLogImplValue = ((Double) getFieldValue(summaryStatisticsSumLogImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value"));
        StorelessUnivariateStatistic summaryStatisticsGeoMeanImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "geoMeanImpl"));
        long finalSummaryStatisticsGeoMeanImplN = ((Long) getFieldValue(summaryStatisticsGeoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n"));
        StorelessUnivariateStatistic summaryStatisticsGeoMeanImpl1 = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "geoMeanImpl"));
        double finalSummaryStatisticsGeoMeanImplValue = ((Double) getFieldValue(summaryStatisticsGeoMeanImpl1, "org.apache.commons.math.stat.descriptive.rank.Min", "value"));
        
        assertEquals(1L, finalSummaryStatisticsN);
        
        assertEquals(1L, finalSummaryStatisticsSecondMomentN);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumImplN);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsSumImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumsqImplN);
        
        org.junit.Assert.assertEquals(4805138.00390625, finalSummaryStatisticsSumsqImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMinImplN);
        
        org.junit.Assert.assertEquals(4805138.00390625, finalSummaryStatisticsMinImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsMaxImplN);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsMaxImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsSumLogImplN);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsSumLogImplValue, 1.0E-6);
        
        assertEquals(1L, finalSummaryStatisticsGeoMeanImplN);
        
        org.junit.Assert.assertEquals(-2192.0625, finalSummaryStatisticsGeoMeanImplValue, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValue(double)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:150) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:151) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: minImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:152) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_19() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:151) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_28() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min sumImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 4.9E-324);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:151) */
        summaryStatistics.addValue(-2.2250738585072014E-308);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: minImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_5() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:152) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_6() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:153) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_7() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumsqImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumsqImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:155) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_20() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumsqImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumsqImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:155) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: minImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_27() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Min sumsqImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 4.1238235186830395E41);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:152) */
        summaryStatistics.addValue(-2.4421537288765683E174);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: minImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_30() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Max sumsqImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 7.57153399146736E-270);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:152) */
        summaryStatistics.addValue(3.6893488147419103E19);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_8() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = sumImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:162) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumLogImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_13() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Min maxImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 4.9E-324);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:154) */
        summaryStatistics.addValue(-2.2250738585072014E-308);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumLogImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_25() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Max maxImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", -4.450147717014404E-308);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:154) */
        summaryStatistics.addValue(262144.0);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_26() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Max minImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 6.237000967296001E290);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:153) */
        summaryStatistics.addValue(5.3575430359313366E300);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_29() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Min minImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 1.843460578178956E-303);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:153) */
        summaryStatistics.addValue(-7.477348590932804E79);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Min sumLogImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", -32.00012207031251);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:155) */
        summaryStatistics.addValue(-8.920349121767287E43);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumsqImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Max sumLogImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", -4.666326992811529E-302);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:155) */
        summaryStatistics.addValue(1.7592219598848E13);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_9() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = minImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:162) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: meanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_10() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.FourthMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        setField(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "secondMoment", secondMoment);
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:159) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: meanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_21() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:159) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: meanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_24() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.FourthMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", -9223372036854775806L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        setField(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "secondMoment", secondMoment);
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:159) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_11() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 4.9E-324);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:162) */
        summaryStatistics.addValue(4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_12() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.ThirdMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        setField(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "secondMoment", secondMoment);
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares sumLogImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:162) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_22() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:162) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_14() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Max meanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 4.9E-324);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:162) */
        summaryStatistics.addValue(4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): False}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_15() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Max meanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Variance varianceImpl = ((Variance) createInstance("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:165) */
        summaryStatistics.addValue(java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): False}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_23() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Variance varianceImpl = ((Variance) createInstance("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:165) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_17() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:165) */
        summaryStatistics.addValue(java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): True}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_18() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum sumLogImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:165) */
        summaryStatistics.addValue(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)}
 * @utbot.executesCondition {@code (!(meanImpl instanceof Mean)): False}
 * @utbot.executesCondition {@code (!(varianceImpl instanceof Variance)): True}
 * @utbot.executesCondition {@code (!(geoMeanImpl instanceof GeometricMean)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.increment(value);
 *  */
    @Test
    public void testAddValue_ThrowNullPointerException_16() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", -9223372036854775806L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum sumLogImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Mean meanImpl = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Max varianceImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", -2.225073858507202E-308);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(SummaryStatistics.java:165) */
        summaryStatistics.addValue(2.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Object() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        
        boolean actual = summaryStatistics.equals(summaryStatistics);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof SummaryStatistics == false): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_ObjectInstanceOfSummaryStatisticsEqualsFalse() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        
        boolean actual = summaryStatistics.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof SummaryStatistics == false): False}
 * @utbot.returnsFrom {@code return Precision.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean()) && Precision.equalsIncludingNaN(stat.getMax(), getMax()) && Precision.equalsIncludingNaN(stat.getMean(), getMean()) && Precision.equalsIncludingNaN(stat.getMin(), getMin()) && Precision.equalsIncludingNaN(stat.getN(), getN()) && Precision.equalsIncludingNaN(stat.getSum(), getSum()) && Precision.equalsIncludingNaN(stat.getSumsq(), getSumsq()) && Precision.equalsIncludingNaN(stat.getVariance(), getVariance());}
 *  */
    @Test
    public void testEquals_PrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaN() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", -2.0000000000000004);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Object aggregatingSummaryStatistics = createInstance("org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics$AggregatingSummaryStatistics");
        Sum geoMeanImpl1 = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        java.lang.Object[] setGeoMeanImplMethodArguments1 = new java.lang.Object[1];
        setGeoMeanImplMethodArguments1[0] = geoMeanImpl1;
        setGeoMeanImplMethod.invoke(aggregatingSummaryStatistics, setGeoMeanImplMethodArguments1);
        
        boolean actual = summaryStatistics.equals(aggregatingSummaryStatistics);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof SummaryStatistics == false): False}
 * @utbot.returnsFrom {@code return Precision.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean()) && Precision.equalsIncludingNaN(stat.getMax(), getMax()) && Precision.equalsIncludingNaN(stat.getMean(), getMean()) && Precision.equalsIncludingNaN(stat.getMin(), getMin()) && Precision.equalsIncludingNaN(stat.getN(), getN()) && Precision.equalsIncludingNaN(stat.getSum(), getSum()) && Precision.equalsIncludingNaN(stat.getSumsq(), getSumsq()) && Precision.equalsIncludingNaN(stat.getVariance(), getVariance());}
 *  */
    @Test
    public void testEquals_PrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaNAndPrecisionEqualsIncludingNaN_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SynchronizedSummaryStatistics synchronizedSummaryStatistics = ((SynchronizedSummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics"));
        Sum geoMeanImpl1 = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -2.0000000000000004);
        java.lang.Object[] setGeoMeanImplMethodArguments1 = new java.lang.Object[1];
        setGeoMeanImplMethodArguments1[0] = geoMeanImpl1;
        setGeoMeanImplMethod.invoke(synchronizedSummaryStatistics, setGeoMeanImplMethodArguments1);
        
        boolean actual = summaryStatistics.equals(synchronizedSummaryStatistics);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof SummaryStatistics == false): False}
 * @utbot.executesCondition {@code (Precision.equalsIncludingNaN(stat.getMax(), getMax())): False}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.invokes {@link org.apache.commons.math.util.Precision#equalsIncludingNaN(double,double)}
 * @utbot.returnsFrom {@code return Precision.equalsIncludingNaN(stat.getGeometricMean(), getGeometricMean()) && Precision.equalsIncludingNaN(stat.getMax(), getMax()) && Precision.equalsIncludingNaN(stat.getMean(), getMean()) && Precision.equalsIncludingNaN(stat.getMin(), getMin()) && Precision.equalsIncludingNaN(stat.getN(), getN()) && Precision.equalsIncludingNaN(stat.getSum(), getSum()) && Precision.equalsIncludingNaN(stat.getSumsq(), getSumsq()) && Precision.equalsIncludingNaN(stat.getVariance(), getVariance());}
 *  */
    @Test
    public void testEquals_NotPrecisionEqualsIncludingNaN() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", maxImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SummaryStatistics summaryStatistics1 = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum maxImpl1 = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -2.0000000000000004);
        java.lang.Object[] setMaxImplMethodArguments1 = new java.lang.Object[1];
        setMaxImplMethodArguments1[0] = maxImpl1;
        setMaxImplMethod.invoke(summaryStatistics1, setMaxImplMethodArguments1);
        Sum geoMeanImpl1 = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl1, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        java.lang.Object[] setGeoMeanImplMethodArguments1 = new java.lang.Object[1];
        setGeoMeanImplMethodArguments1[0] = geoMeanImpl1;
        setGeoMeanImplMethod.invoke(summaryStatistics1, setGeoMeanImplMethodArguments1);
        
        boolean actual = summaryStatistics.equals(summaryStatistics1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs geoMeanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax(SummaryStatistics.java:264)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:395) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs maxImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum geoMeanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", maxImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean(SummaryStatistics.java:205)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:396) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs maxImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", maxImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean(SummaryStatistics.java:205)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:396) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum geoMeanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -2.0);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", maxImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfLogs meanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", maxImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin(SummaryStatistics.java:275)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:397) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs minImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", minImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", minImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = maxImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum(SummaryStatistics.java:183)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:399) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 2.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", maxImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfLogs meanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", maxImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin(SummaryStatistics.java:275)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:397) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max minImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 3.2379E-319);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", minImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", minImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = maxImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum(SummaryStatistics.java:183)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:399) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode8() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs minImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -2.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum geoMeanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", minImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", -2.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", minImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum(SummaryStatistics.java:183)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:399) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode9() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs minImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum geoMeanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -0.0);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", minImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Sum meanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -2.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", minImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum(SummaryStatistics.java:183)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:399) */
        summaryStatistics.hashCode();
    }
    
    @Test
    public void testHashCode10() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max minImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", -2.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Sum geoMeanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", minImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", minImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum(SummaryStatistics.java:183)
            org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode(SummaryStatistics.java:399) */
        summaryStatistics.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.executesCondition {@code (varianceImpl != variance): True}
 *  */
    @Test
    public void testClear_VarianceImplNotEqualsVariance_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Mean mean = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        summaryStatistics.mean = mean;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Min varianceImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsVarianceImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "varianceImpl"));
        double finalSummaryStatisticsVarianceImplValue = ((Double) getFieldValue(summaryStatisticsVarianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsVarianceImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): False}
 * @utbot.executesCondition {@code (varianceImpl != variance): True}
 *  */
    @Test
    public void testClear_VarianceImplNotEqualsVariance() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.executesCondition {@code (varianceImpl != variance): False}
 *  */
    @Test
    public void testClear_VarianceImplEqualsVariance() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Sum meanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): False}
 * @utbot.executesCondition {@code (varianceImpl != variance): True}
 *  */
    @Test
    public void testClear_VarianceImplNotEqualsVariance_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.executesCondition {@code (varianceImpl != variance): False}
 *  */
    @Test
    public void testClear_VarianceImplEqualsVariance_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Max meanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsMeanImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "meanImpl"));
        double finalSummaryStatisticsMeanImplValue = ((Double) getFieldValue(summaryStatisticsMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMeanImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.executesCondition {@code (varianceImpl != variance): False}
 *  */
    @Test
    public void testClear_VarianceImplEqualsVariance_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsMeanImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "meanImpl"));
        double finalSummaryStatisticsMeanImplValue = ((Double) getFieldValue(summaryStatisticsMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsMeanImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): False}
 * @utbot.executesCondition {@code (varianceImpl != variance): True}
 *  */
    @Test
    public void testClear_VarianceImplNotEqualsVariance_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        Max varianceImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        StorelessUnivariateStatistic summaryStatisticsVarianceImpl = ((StorelessUnivariateStatistic) getFieldValue(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "varianceImpl"));
        double finalSummaryStatisticsVarianceImplValue = ((Double) getFieldValue(summaryStatisticsVarianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsVarianceImplValue, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.executesCondition {@code (varianceImpl != variance): False}
 *  */
    @Test
    public void testClear_VarianceImplEqualsVariance_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfLogs meanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): False}
 * @utbot.executesCondition {@code (varianceImpl != variance): True}
 *  */
    @Test
    public void testClear_VarianceImplNotEqualsVariance_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.FourthMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        setField(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "secondMoment", secondMoment);
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        summaryStatistics.clear();
        
        long finalSummaryStatisticsN = summaryStatistics.n;
        SecondMoment secondMoment1 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM4 = ((Double) getFieldValue(secondMoment1, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4"));
        SecondMoment secondMoment2 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM3 = ((Double) getFieldValue(secondMoment2, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3"));
        SecondMoment secondMoment3 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDevSq = ((Double) getFieldValue(secondMoment3, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq"));
        SecondMoment secondMoment4 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM2 = ((Double) getFieldValue(secondMoment4, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2"));
        SecondMoment secondMoment5 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentM1 = ((Double) getFieldValue(secondMoment5, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1"));
        SecondMoment secondMoment6 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentDev = ((Double) getFieldValue(secondMoment6, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev"));
        SecondMoment secondMoment7 = summaryStatistics.secondMoment;
        double finalSummaryStatisticsSecondMomentNDev = ((Double) getFieldValue(secondMoment7, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev"));
        
        assertEquals(0L, finalSummaryStatisticsN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM4, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM3, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDevSq, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM2, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentM1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentDev, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalSummaryStatisticsSecondMomentNDev, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clear()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: minImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:346) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:347) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:347) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_25() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Min minImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:347) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_27() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Max minImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:347) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maxImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_29() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfLogs minImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:347) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:348) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumLogImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:349) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_5() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = minImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:350) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_6() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:351) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_9() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumsqImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:352) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_12() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:348) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumLogImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_19() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Min sumImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:349) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_24() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Min maxImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:348) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_26() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Max maxImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:348) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_28() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfLogs maxImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:348) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_10() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Max sumLogImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:350) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_11() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfLogs sumLogImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:350) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_13() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumsqImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Min geoMeanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:352) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_15() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Max sumsqImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = maxImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:351) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumLogImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_16() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Max sumImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:349) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumLogImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_17() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfLogs sumImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:349) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_18() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Min sumsqImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = minImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:351) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMeanImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_20() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfLogs sumsqImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = minImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:351) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sumsqImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_21() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Min sumLogImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 0L);
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:350) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_22() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Max geoMeanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:352) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: secondMoment.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_23() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        SumOfLogs geoMeanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:352) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: meanImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_7() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Mean mean = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        summaryStatistics.mean = mean;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:354) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: meanImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_14() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.ThirdMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "nDevSq", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        setField(summaryStatistics, "org.apache.commons.math.stat.descriptive.SummaryStatistics", "secondMoment", secondMoment);
        Mean mean = ((Mean) createInstance("org.apache.commons.math.stat.descriptive.moment.Mean"));
        summaryStatistics.mean = mean;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:354) */
        summaryStatistics.clear();
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()}
 * @utbot.executesCondition {@code (meanImpl != mean): False}
 * @utbot.executesCondition {@code (varianceImpl != variance): True}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varianceImpl.clear();
 *  */
    @Test
    public void testClear_ThrowNullPointerException_8() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "m1", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "dev", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "nDev", 0.0);
        summaryStatistics.secondMoment = secondMoment;
        Variance variance = ((Variance) createInstance("org.apache.commons.math.stat.descriptive.moment.Variance"));
        summaryStatistics.variance = variance;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumsqImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", sumImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = sumImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.clear] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.clear(SummaryStatistics.java:357) */
        summaryStatistics.clear();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.copy
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(source);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testCopy_ThrowNullArgumentException() {
        SummaryStatistics.copy(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(dest);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testCopy_ThrowNullArgumentException_1() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        
        SummaryStatistics.copy(summaryStatistics, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.maxImpl = source.maxImpl.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SynchronizedSummaryStatistics synchronizedSummaryStatistics = new SynchronizedSummaryStatistics();
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(SummaryStatistics.java:672) */
        SummaryStatistics.copy(summaryStatistics, synchronizedSummaryStatistics);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.minImpl = source.minImpl.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SynchronizedSummaryStatistics synchronizedSummaryStatistics = ((SynchronizedSummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(SummaryStatistics.java:673) */
        SummaryStatistics.copy(summaryStatistics, synchronizedSummaryStatistics);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.minImpl = source.minImpl.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SynchronizedSummaryStatistics synchronizedSummaryStatistics = ((SynchronizedSummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(SummaryStatistics.java:673) */
        SummaryStatistics.copy(summaryStatistics, synchronizedSummaryStatistics);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.sumImpl = source.sumImpl.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_2() throws Throwable  {
        Object aggregatingSummaryStatistics = createInstance("org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics$AggregatingSummaryStatistics");
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(aggregatingSummaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        double[] storedData = {1.69759663277E-313};
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData", storedData);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(aggregatingSummaryStatistics, setMaxImplMethodArguments);
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(SummaryStatistics.java:674) */
        Method copyMethod = summaryStatisticsClazz.getDeclaredMethod("copy", summaryStatisticsClazz, summaryStatisticsClazz);
        copyMethod.setAccessible(true);
        java.lang.Object[] copyMethodArguments = new java.lang.Object[2];
        copyMethodArguments[0] = aggregatingSummaryStatistics;
        copyMethodArguments[1] = summaryStatistics;
        try {
            copyMethod.invoke(null, copyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dest.sumImpl = source.sumImpl.copy();
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_4() throws Exception  {
        SynchronizedSummaryStatistics synchronizedSummaryStatistics = ((SynchronizedSummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics"));
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(synchronizedSummaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 0L);
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        double[] storedData = {2.0522684006491886E-289};
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", "storedData", storedData);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", minImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(synchronizedSummaryStatistics, setMaxImplMethodArguments);
        SynchronizedSummaryStatistics synchronizedSummaryStatistics1 = ((SynchronizedSummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(SummaryStatistics.java:674) */
        SummaryStatistics.copy(synchronizedSummaryStatistics, synchronizedSummaryStatistics1);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics}
     * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#copy(org.apache.commons.math.stat.descriptive.SummaryStatistics,org.apache.commons.math.stat.descriptive.SummaryStatistics)}
     */
    @Test(expected = NullArgumentException.class)
    public void testCopyThrowsNAE() {
        SummaryStatistics.copy(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSum()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()}
 * @utbot.returnsFrom {@code return sumImpl.getResult();}
 *  */
    @Test
    public void testGetSum_ReturnSumImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        double actual = summaryStatistics.getSum();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()}
 * @utbot.returnsFrom {@code return sumImpl.getResult();}
 *  */
    @Test
    public void testGetSum_ReturnSumImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        double actual = summaryStatistics.getSum();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()}
 * @utbot.returnsFrom {@code return sumImpl.getResult();}
 *  */
    @Test
    public void testGetSum_ReturnSumImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min sumImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        double actual = summaryStatistics.getSum();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()}
 * @utbot.returnsFrom {@code return sumImpl.getResult();}
 *  */
    @Test
    public void testGetSum_ReturnSumImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max sumImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        double actual = summaryStatistics.getSum();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()}
 * @utbot.returnsFrom {@code return sumImpl.getResult();}
 *  */
    @Test
    public void testGetSum_ReturnSumImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs sumImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        
        double actual = summaryStatistics.getSum();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSum()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return sumImpl.getResult();
 *  */
    @Test
    public void testGetSum_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum(SummaryStatistics.java:183) */
        summaryStatistics.getSum();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMin()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()}
 * @utbot.returnsFrom {@code return minImpl.getResult();}
 *  */
    @Test
    public void testGetMin_ReturnMinImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        double actual = summaryStatistics.getMin();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()}
 * @utbot.returnsFrom {@code return minImpl.getResult();}
 *  */
    @Test
    public void testGetMin_ReturnMinImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        double actual = summaryStatistics.getMin();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()}
 * @utbot.returnsFrom {@code return minImpl.getResult();}
 *  */
    @Test
    public void testGetMin_ReturnMinImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min minImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        double actual = summaryStatistics.getMin();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()}
 * @utbot.returnsFrom {@code return minImpl.getResult();}
 *  */
    @Test
    public void testGetMin_ReturnMinImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max minImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        double actual = summaryStatistics.getMin();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()}
 * @utbot.returnsFrom {@code return minImpl.getResult();}
 *  */
    @Test
    public void testGetMin_ReturnMinImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs minImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class minImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", minImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        
        double actual = summaryStatistics.getMin();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMin()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return minImpl.getResult();
 *  */
    @Test
    public void testGetMin_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin(SummaryStatistics.java:275) */
        summaryStatistics.getMin();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMax()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.returnsFrom {@code return maxImpl.getResult();}
 *  */
    @Test
    public void testGetMax_ReturnMaxImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        double actual = summaryStatistics.getMax();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.returnsFrom {@code return maxImpl.getResult();}
 *  */
    @Test
    public void testGetMax_ReturnMaxImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        double actual = summaryStatistics.getMax();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.returnsFrom {@code return maxImpl.getResult();}
 *  */
    @Test
    public void testGetMax_ReturnMaxImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min maxImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        double actual = summaryStatistics.getMax();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.returnsFrom {@code return maxImpl.getResult();}
 *  */
    @Test
    public void testGetMax_ReturnMaxImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max maxImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        double actual = summaryStatistics.getMax();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.returnsFrom {@code return maxImpl.getResult();}
 *  */
    @Test
    public void testGetMax_ReturnMaxImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs maxImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class maxImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", maxImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        
        double actual = summaryStatistics.getMax();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMax()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return maxImpl.getResult();
 *  */
    @Test
    public void testGetMax_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax(SummaryStatistics.java:264) */
        summaryStatistics.getMax();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVariance()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()}
 * @utbot.returnsFrom {@code return varianceImpl.getResult();}
 *  */
    @Test
    public void testGetVariance_ReturnVarianceImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()}
 * @utbot.returnsFrom {@code return varianceImpl.getResult();}
 *  */
    @Test
    public void testGetVariance_ReturnVarianceImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()}
 * @utbot.returnsFrom {@code return varianceImpl.getResult();}
 *  */
    @Test
    public void testGetVariance_ReturnVarianceImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min varianceImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()}
 * @utbot.returnsFrom {@code return varianceImpl.getResult();}
 *  */
    @Test
    public void testGetVariance_ReturnVarianceImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max varianceImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()}
 * @utbot.returnsFrom {@code return varianceImpl.getResult();}
 *  */
    @Test
    public void testGetVariance_ReturnVarianceImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVariance()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return varianceImpl.getResult();
 *  */
    @Test
    public void testGetVariance_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance(SummaryStatistics.java:239) */
        summaryStatistics.getVariance();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStandardDeviation()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): True}
 * @utbot.executesCondition {@code (getN() > 1): True}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNGreaterThan1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 2L;
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): True}
 * @utbot.executesCondition {@code (getN() > 1): True}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNGreaterThan1_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 2L;
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): True}
 * @utbot.executesCondition {@code (getN() > 1): True}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNGreaterThan1_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 2L;
        Min varianceImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): True}
 * @utbot.executesCondition {@code (getN() > 1): True}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNGreaterThan1_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 2L;
        Max varianceImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): True}
 * @utbot.executesCondition {@code (getN() > 1): True}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNGreaterThan1_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 2L;
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class varianceImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", varianceImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): False}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNLessOrEqualZero() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 0L;
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()}
 * @utbot.executesCondition {@code (getN() > 0): True}
 * @utbot.executesCondition {@code (getN() > 1): False}
 * @utbot.returnsFrom {@code return stdDev;}
 *  */
    @Test
    public void testGetStandardDeviation_GetNLessOrEqual1() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        double actual = summaryStatistics.getStandardDeviation();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getPopulationVariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPopulationVariance()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getPopulationVariance()}
 * @utbot.returnsFrom {@code return populationVariance.getResult();}
 *  */
    @Test
    public void testGetPopulationVariance_ReturnPopulationVarianceGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        summaryStatistics.secondMoment = secondMoment;
        
        double actual = summaryStatistics.getPopulationVariance();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getPopulationVariance()}
 * @utbot.returnsFrom {@code return populationVariance.getResult();}
 *  */
    @Test
    public void testGetPopulationVariance_ReturnPopulationVarianceGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", 0.0);
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", -254L);
        summaryStatistics.secondMoment = secondMoment;
        
        double actual = summaryStatistics.getPopulationVariance();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getPopulationVariance()}
 * @utbot.returnsFrom {@code return populationVariance.getResult();}
 *  */
    @Test
    public void testGetPopulationVariance_ReturnPopulationVarianceGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        summaryStatistics.secondMoment = secondMoment;
        
        double actual = summaryStatistics.getPopulationVariance();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumOfLogs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumOfLogs()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumOfLogs()}
 * @utbot.returnsFrom {@code return sumLogImpl.getResult();}
 *  */
    @Test
    public void testGetSumOfLogs_ReturnSumLogImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumLogImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumLogImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumLogImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        double actual = summaryStatistics.getSumOfLogs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumOfLogs()}
 * @utbot.returnsFrom {@code return sumLogImpl.getResult();}
 *  */
    @Test
    public void testGetSumOfLogs_ReturnSumLogImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumLogImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumLogImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumLogImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        double actual = summaryStatistics.getSumOfLogs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumOfLogs()}
 * @utbot.returnsFrom {@code return sumLogImpl.getResult();}
 *  */
    @Test
    public void testGetSumOfLogs_ReturnSumLogImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min sumLogImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumLogImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumLogImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        double actual = summaryStatistics.getSumOfLogs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumOfLogs()}
 * @utbot.returnsFrom {@code return sumLogImpl.getResult();}
 *  */
    @Test
    public void testGetSumOfLogs_ReturnSumLogImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max sumLogImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumLogImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumLogImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        double actual = summaryStatistics.getSumOfLogs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumOfLogs()}
 * @utbot.returnsFrom {@code return sumLogImpl.getResult();}
 *  */
    @Test
    public void testGetSumOfLogs_ReturnSumLogImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs sumLogImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumLogImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumLogImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumLogImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumLogImpl", sumLogImplType);
        setSumLogImplMethod.setAccessible(true);
        java.lang.Object[] setSumLogImplMethodArguments = new java.lang.Object[1];
        setSumLogImplMethodArguments[0] = sumLogImpl;
        setSumLogImplMethod.invoke(summaryStatistics, setSumLogImplMethodArguments);
        
        double actual = summaryStatistics.getSumOfLogs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSumOfLogs()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumOfLogs()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return sumLogImpl.getResult();
 *  */
    @Test
    public void testGetSumOfLogs_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumOfLogs] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumOfLogs(SummaryStatistics.java:298) */
        summaryStatistics.getSumOfLogs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSecondMoment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSecondMoment()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSecondMoment()}
 * @utbot.returnsFrom {@code return secondMoment.getResult();}
 *  */
    @Test
    public void testGetSecondMoment_ReturnSecondMomentGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SecondMoment secondMoment = ((SecondMoment) createInstance("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.SecondMoment", "m2", java.lang.Double.NaN);
        summaryStatistics.secondMoment = secondMoment;
        
        double actual = summaryStatistics.getSecondMoment();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSecondMoment()}
 * @utbot.returnsFrom {@code return secondMoment.getResult();}
 *  */
    @Test
    public void testGetSecondMoment_ReturnSecondMomentGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.FourthMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.FourthMoment", "m4", java.lang.Double.NaN);
        summaryStatistics.secondMoment = secondMoment;
        
        double actual = summaryStatistics.getSecondMoment();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSecondMoment()}
 * @utbot.returnsFrom {@code return secondMoment.getResult();}
 *  */
    @Test
    public void testGetSecondMoment_ReturnSecondMomentGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        Object secondMoment = createInstance("org.apache.commons.math.stat.descriptive.moment.ThirdMoment");
        setField(secondMoment, "org.apache.commons.math.stat.descriptive.moment.ThirdMoment", "m3", java.lang.Double.NaN);
        summaryStatistics.secondMoment = secondMoment;
        
        double actual = summaryStatistics.getSecondMoment();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSecondMoment()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSecondMoment()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.moment.SecondMoment#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return secondMoment.getResult();
 *  */
    @Test
    public void testGetSecondMoment_ThrowNullPointerException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.secondMoment = null;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getSecondMoment] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSecondMoment(SummaryStatistics.java:313) */
        summaryStatistics.getSecondMoment();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumImpl()}
 * @utbot.returnsFrom {@code return sumImpl;}
 *  */
    @Test
    public void testGetSumImpl_ReturnSumImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getSumImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetSumImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setSumImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetSumImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setSumImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSummary()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = sumImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Max maxImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = meanImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_5() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = maxImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_6() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Min sumImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = minImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, java.lang.Double.NaN);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_7() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Max minImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = sumImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = sumImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_8() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Min maxImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = sumImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_9() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Max sumImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = minImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, java.lang.Double.NaN);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_10() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Min varianceImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_11() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SumOfLogs sumImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = minImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Min varianceImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, java.lang.Double.NaN);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_12() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = minImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_13() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = sumImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Max varianceImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_14() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Max meanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfSquares varianceImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_17() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfLogs meanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = sumImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_18() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = sumImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = sumImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfLogs meanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        SumOfLogs varianceImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, 0.0);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 4.9E-324);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 3.78576699573368E-270);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = minImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(java.lang.Double.NaN, java.lang.Double.NaN, -255L, 3.78576699573368E-270, 3.78576699573368E-270, 4.9E-324);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 4.9E-324);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Min minImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 4.9E-324);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        Sum maxImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = maxImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(java.lang.Double.NaN, java.lang.Double.NaN, -255L, java.lang.Double.NaN, 4.9E-324, 4.9E-324);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_15() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfLogs minImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Max meanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = maxImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, java.lang.Double.NaN);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_16() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        SumOfSquares sumImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        Sum minImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfLogs maxImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", 0.0);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", 0.0);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = minImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(0.0, 0.0, 0L, 0.0, 0.0, java.lang.Double.NaN);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()}
 * @utbot.returnsFrom {@code return new StatisticalSummaryValues(getMean(), getVariance(), getN(), getMax(), getMin(), getSum());}
 *  */
    @Test
    public void testGetSummary_Return_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = -255L;
        Sum sumImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumImpl", sumImplType);
        setSumImplMethod.setAccessible(true);
        java.lang.Object[] setSumImplMethodArguments = new java.lang.Object[1];
        setSumImplMethodArguments[0] = sumImpl;
        setSumImplMethod.invoke(summaryStatistics, setSumImplMethodArguments);
        SumOfSquares minImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(minImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", 0.0);
        Method setMinImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMinImpl", sumImplType);
        setMinImplMethod.setAccessible(true);
        java.lang.Object[] setMinImplMethodArguments = new java.lang.Object[1];
        setMinImplMethodArguments[0] = minImpl;
        setMinImplMethod.invoke(summaryStatistics, setMinImplMethodArguments);
        SumOfSquares maxImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(maxImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMaxImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMaxImpl", sumImplType);
        setMaxImplMethod.setAccessible(true);
        java.lang.Object[] setMaxImplMethodArguments = new java.lang.Object[1];
        setMaxImplMethodArguments[0] = maxImpl;
        setMaxImplMethod.invoke(summaryStatistics, setMaxImplMethodArguments);
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", sumImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        Sum varianceImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(varianceImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Method setVarianceImplMethod = summaryStatisticsClazz.getDeclaredMethod("setVarianceImpl", sumImplType);
        setVarianceImplMethod.setAccessible(true);
        java.lang.Object[] setVarianceImplMethodArguments = new java.lang.Object[1];
        setVarianceImplMethodArguments[0] = varianceImpl;
        setVarianceImplMethod.invoke(summaryStatistics, setVarianceImplMethodArguments);
        
        StatisticalSummaryValues actual = ((StatisticalSummaryValues) summaryStatistics.getSummary());
        
        StatisticalSummaryValues expected = new StatisticalSummaryValues(java.lang.Double.NaN, java.lang.Double.NaN, -255L, java.lang.Double.NaN, 0.0, java.lang.Double.NaN);
        
        // org.apache.commons.math.stat.descriptive.StatisticalSummaryValues has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getN()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getN()}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testGetN_ReturnN() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        long actual = summaryStatistics.getN();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsqImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumsqImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsqImpl()}
 * @utbot.returnsFrom {@code return sumsqImpl;}
 *  */
    @Test
    public void testGetSumsqImpl_ReturnSumsqImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getSumsqImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGeometricMean()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()}
 * @utbot.returnsFrom {@code return geoMeanImpl.getResult();}
 *  */
    @Test
    public void testGetGeometricMean_ReturnGeoMeanImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum geoMeanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        double actual = summaryStatistics.getGeometricMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()}
 * @utbot.returnsFrom {@code return geoMeanImpl.getResult();}
 *  */
    @Test
    public void testGetGeometricMean_ReturnGeoMeanImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares geoMeanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        double actual = summaryStatistics.getGeometricMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()}
 * @utbot.returnsFrom {@code return geoMeanImpl.getResult();}
 *  */
    @Test
    public void testGetGeometricMean_ReturnGeoMeanImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min geoMeanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        double actual = summaryStatistics.getGeometricMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()}
 * @utbot.returnsFrom {@code return geoMeanImpl.getResult();}
 *  */
    @Test
    public void testGetGeometricMean_ReturnGeoMeanImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max geoMeanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        double actual = summaryStatistics.getGeometricMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()}
 * @utbot.returnsFrom {@code return geoMeanImpl.getResult();}
 *  */
    @Test
    public void testGetGeometricMean_ReturnGeoMeanImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs geoMeanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(geoMeanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class geoMeanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setGeoMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setGeoMeanImpl", geoMeanImplType);
        setGeoMeanImplMethod.setAccessible(true);
        java.lang.Object[] setGeoMeanImplMethodArguments = new java.lang.Object[1];
        setGeoMeanImplMethodArguments[0] = geoMeanImpl;
        setGeoMeanImplMethod.invoke(summaryStatistics, setGeoMeanImplMethodArguments);
        
        double actual = summaryStatistics.getGeometricMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGeometricMean()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return geoMeanImpl.getResult();
 *  */
    @Test
    public void testGetGeometricMean_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean(SummaryStatistics.java:286) */
        summaryStatistics.getGeometricMean();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumsq()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()}
 * @utbot.returnsFrom {@code return sumsqImpl.getResult();}
 *  */
    @Test
    public void testGetSumsq_ReturnSumsqImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum sumsqImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumsqImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumsqImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        double actual = summaryStatistics.getSumsq();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()}
 * @utbot.returnsFrom {@code return sumsqImpl.getResult();}
 *  */
    @Test
    public void testGetSumsq_ReturnSumsqImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares sumsqImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumsqImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumsqImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        double actual = summaryStatistics.getSumsq();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()}
 * @utbot.returnsFrom {@code return sumsqImpl.getResult();}
 *  */
    @Test
    public void testGetSumsq_ReturnSumsqImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min sumsqImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumsqImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumsqImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        double actual = summaryStatistics.getSumsq();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()}
 * @utbot.returnsFrom {@code return sumsqImpl.getResult();}
 *  */
    @Test
    public void testGetSumsq_ReturnSumsqImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max sumsqImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumsqImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumsqImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        double actual = summaryStatistics.getSumsq();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()}
 * @utbot.returnsFrom {@code return sumsqImpl.getResult();}
 *  */
    @Test
    public void testGetSumsq_ReturnSumsqImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs sumsqImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(sumsqImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class sumsqImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setSumsqImplMethod = summaryStatisticsClazz.getDeclaredMethod("setSumsqImpl", sumsqImplType);
        setSumsqImplMethod.setAccessible(true);
        java.lang.Object[] setSumsqImplMethodArguments = new java.lang.Object[1];
        setSumsqImplMethodArguments[0] = sumsqImpl;
        setSumsqImplMethod.invoke(summaryStatistics, setSumsqImplMethodArguments);
        
        double actual = summaryStatistics.getSumsq();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSumsq()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return sumsqImpl.getResult();
 *  */
    @Test
    public void testGetSumsq_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq(SummaryStatistics.java:194) */
        summaryStatistics.getSumsq();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMean()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()}
 * @utbot.returnsFrom {@code return meanImpl.getResult();}
 *  */
    @Test
    public void testGetMean_ReturnMeanImplGetResult() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Sum meanImpl = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.Sum", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class meanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", meanImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        double actual = summaryStatistics.getMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()}
 * @utbot.returnsFrom {@code return meanImpl.getResult();}
 *  */
    @Test
    public void testGetMean_ReturnMeanImplGetResult_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfSquares meanImpl = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class meanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", meanImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        double actual = summaryStatistics.getMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()}
 * @utbot.returnsFrom {@code return meanImpl.getResult();}
 *  */
    @Test
    public void testGetMean_ReturnMeanImplGetResult_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Min meanImpl = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Min", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class meanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", meanImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        double actual = summaryStatistics.getMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()}
 * @utbot.returnsFrom {@code return meanImpl.getResult();}
 *  */
    @Test
    public void testGetMean_ReturnMeanImplGetResult_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Max meanImpl = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.rank.Max", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class meanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", meanImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        double actual = summaryStatistics.getMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()}
 * @utbot.returnsFrom {@code return meanImpl.getResult();}
 *  */
    @Test
    public void testGetMean_ReturnMeanImplGetResult_4() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        SumOfLogs meanImpl = ((SumOfLogs) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setField(meanImpl, "org.apache.commons.math.stat.descriptive.summary.SumOfLogs", "value", java.lang.Double.NaN);
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class meanImplType = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Method setMeanImplMethod = summaryStatisticsClazz.getDeclaredMethod("setMeanImpl", meanImplType);
        setMeanImplMethod.setAccessible(true);
        java.lang.Object[] setMeanImplMethodArguments = new java.lang.Object[1];
        setMeanImplMethodArguments[0] = meanImpl;
        setMeanImplMethod.invoke(summaryStatistics, setMeanImplMethodArguments);
        
        double actual = summaryStatistics.getMean();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMean()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()}
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return meanImpl.getResult();
 *  */
    @Test
    public void testGetMean_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean(SummaryStatistics.java:205) */
        summaryStatistics.getMean();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.checkEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkEmpty()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()}
 * @utbot.executesCondition {@code (n > 0): False}
 *  */
    @Test
    public void testCheckEmpty_NLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 0L;
        
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Method checkEmptyMethod = summaryStatisticsClazz.getDeclaredMethod("checkEmpty");
        checkEmptyMethod.setAccessible(true);
        java.lang.Object[] checkEmptyMethodArguments = new java.lang.Object[0];
        checkEmptyMethod.invoke(summaryStatistics, checkEmptyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkEmpty()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()}
 * @utbot.executesCondition {@code (n > 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: LocalizedFormats.VALUES_ADDED_BEFORE_CONFIGURING_STATISTIC
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testCheckEmpty_ThrowMathIllegalStateException() throws Throwable  {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        Class summaryStatisticsClazz = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Method checkEmptyMethod = summaryStatisticsClazz.getDeclaredMethod("checkEmpty");
        checkEmptyMethod.setAccessible(true);
        java.lang.Object[] checkEmptyMethodArguments = new java.lang.Object[0];
        try {
            checkEmptyMethod.invoke(summaryStatistics, checkEmptyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumsqImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetSumsqImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setSumsqImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetSumsqImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setSumsqImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setMeanImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetMeanImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setMeanImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetMeanImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setMeanImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 *  */
    @Test
    public void testSetSumLogImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        GeometricMean geoMean = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object sumOfLogs = createInstance("org.apache.commons.math.stat.descriptive.moment.FourthMoment");
        setField(sumOfLogs, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 0L);
        setField(geoMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs", sumOfLogs);
        summaryStatistics.geoMean = geoMean;
        
        summaryStatistics.setSumLogImpl(null);
        
        GeometricMean geometricMean = summaryStatistics.geoMean;
        StorelessUnivariateStatistic finalSummaryStatisticsGeoMeanSumOfLogs = ((StorelessUnivariateStatistic) getFieldValue(geometricMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs"));
        
        assertNull(finalSummaryStatisticsGeoMeanSumOfLogs);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 *  */
    @Test
    public void testSetSumLogImpl_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        GeometricMean geoMean = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Sum sumOfLogs = ((Sum) createInstance("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setField(sumOfLogs, "org.apache.commons.math.stat.descriptive.summary.Sum", "n", 0L);
        setField(geoMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs", sumOfLogs);
        summaryStatistics.geoMean = geoMean;
        
        summaryStatistics.setSumLogImpl(null);
        
        GeometricMean geometricMean = summaryStatistics.geoMean;
        StorelessUnivariateStatistic finalSummaryStatisticsGeoMeanSumOfLogs = ((StorelessUnivariateStatistic) getFieldValue(geometricMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs"));
        
        assertNull(finalSummaryStatisticsGeoMeanSumOfLogs);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 *  */
    @Test
    public void testSetSumLogImpl_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        GeometricMean geoMean = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Max sumOfLogs = ((Max) createInstance("org.apache.commons.math.stat.descriptive.rank.Max"));
        setField(sumOfLogs, "org.apache.commons.math.stat.descriptive.rank.Max", "n", 0L);
        setField(geoMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs", sumOfLogs);
        summaryStatistics.geoMean = geoMean;
        
        summaryStatistics.setSumLogImpl(null);
        
        GeometricMean geometricMean = summaryStatistics.geoMean;
        StorelessUnivariateStatistic finalSummaryStatisticsGeoMeanSumOfLogs = ((StorelessUnivariateStatistic) getFieldValue(geometricMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs"));
        
        assertNull(finalSummaryStatisticsGeoMeanSumOfLogs);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.invokes {@link org.apache.commons.math.stat.descriptive.moment.GeometricMean#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: geoMean.setSumLogImpl(sumLogImpl);
 *  */
    @Test
    public void testSetSumLogImpl_ThrowNullPointerException() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        /* This test fails because method [org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl(SummaryStatistics.java:549) */
        summaryStatistics.setSumLogImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setSumLogImpl(null);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: geoMean.setSumLogImpl(sumLogImpl);
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImpl_ThrowMathIllegalStateException_1() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        GeometricMean geoMean = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object sumOfLogs = createInstance("org.apache.commons.math.stat.descriptive.moment.FourthMoment");
        setField(sumOfLogs, "org.apache.commons.math.stat.descriptive.moment.FirstMoment", "n", 1L);
        setField(geoMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs", sumOfLogs);
        summaryStatistics.geoMean = geoMean;
        
        summaryStatistics.setSumLogImpl(null);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: geoMean.setSumLogImpl(sumLogImpl);
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImpl_ThrowMathIllegalStateException_2() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        GeometricMean geoMean = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        SumOfSquares sumOfLogs = ((SumOfSquares) createInstance("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        setField(sumOfLogs, "org.apache.commons.math.stat.descriptive.summary.SumOfSquares", "n", 1L);
        setField(geoMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs", sumOfLogs);
        summaryStatistics.geoMean = geoMean;
        
        summaryStatistics.setSumLogImpl(null);
    }
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: geoMean.setSumLogImpl(sumLogImpl);
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImpl_ThrowMathIllegalStateException_3() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        GeometricMean geoMean = ((GeometricMean) createInstance("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Min sumOfLogs = ((Min) createInstance("org.apache.commons.math.stat.descriptive.rank.Min"));
        setField(sumOfLogs, "org.apache.commons.math.stat.descriptive.rank.Min", "n", 1L);
        setField(geoMean, "org.apache.commons.math.stat.descriptive.moment.GeometricMean", "sumOfLogs", sumOfLogs);
        summaryStatistics.geoMean = geoMean;
        
        summaryStatistics.setSumLogImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setMaxImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetMaxImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setMaxImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetMaxImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setMaxImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setGeoMeanImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetGeoMeanImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setGeoMeanImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetGeoMeanImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setGeoMeanImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumLogImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSumLogImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumLogImpl()}
 * @utbot.returnsFrom {@code return sumLogImpl;}
 *  */
    @Test
    public void testGetSumLogImpl_ReturnSumLogImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getSumLogImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getMeanImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMeanImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMeanImpl()}
 * @utbot.returnsFrom {@code return meanImpl;}
 *  */
    @Test
    public void testGetMeanImpl_ReturnMeanImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getMeanImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getMaxImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMaxImpl()}
 * @utbot.returnsFrom {@code return maxImpl;}
 *  */
    @Test
    public void testGetMaxImpl_ReturnMaxImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getMaxImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeoMeanImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGeoMeanImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeoMeanImpl()}
 * @utbot.returnsFrom {@code return geoMeanImpl;}
 *  */
    @Test
    public void testGetGeoMeanImpl_ReturnGeoMeanImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getGeoMeanImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setMinImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetMinImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setMinImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetMinImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setMinImpl(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getVarianceImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVarianceImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getVarianceImpl()}
 * @utbot.returnsFrom {@code return varianceImpl;}
 *  */
    @Test
    public void testGetVarianceImpl_ReturnVarianceImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getVarianceImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.getMinImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinImpl()
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#getMinImpl()}
 * @utbot.returnsFrom {@code return minImpl;}
 *  */
    @Test
    public void testGetMinImpl_ReturnMinImpl() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        
        StorelessUnivariateStatistic actual = summaryStatistics.getMinImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.descriptive.SummaryStatistics.setVarianceImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 *  */
    @Test
    public void testSetVarianceImpl_SummaryStatisticsCheckEmpty() throws Exception  {
        SummaryStatistics summaryStatistics = ((SummaryStatistics) createInstance("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        summaryStatistics.n = 0L;
        
        summaryStatistics.setVarianceImpl(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)
    
    /**
    @utbot.classUnderTest {@link SummaryStatistics}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.descriptive.SummaryStatistics#setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)}
 * @utbot.invokes org.apache.commons.math.stat.descriptive.SummaryStatistics#checkEmpty()
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathIllegalStateException} in: checkEmpty();
 *  */
    @Test(expected = MathIllegalStateException.class)
    public void testSetVarianceImpl_ThrowMathIllegalStateException() {
        SummaryStatistics summaryStatistics = new SummaryStatistics();
        summaryStatistics.n = 1L;
        
        summaryStatistics.setVarianceImpl(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields728599891866900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields728599891866900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass728599891875200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields728599891866900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass728599891875200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields728599893194100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields728599893194100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass728599893196500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields728599893194100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass728599893196500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


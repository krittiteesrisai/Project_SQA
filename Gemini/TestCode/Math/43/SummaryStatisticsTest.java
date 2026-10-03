package org.apache.commons.math.stat.descriptive;

import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SummaryStatisticsTest {

    private SummaryStatistics u;
    private static final double TOLERANCE = 10E-15;

    @Before
    public void setUp() {
        u = new SummaryStatistics();
    }

    /** Custom StorelessUnivariateStatistic เพื่อทดสอบ non-standard implementation */
    private static class CustomStorelessStatistic extends AbstractStorelessUnivariateStatistic {
        private double val = 0.0;
        private long n = 0;

        @Override
        public void increment(double d) {
            val += d;
            n++;
        }

        @Override
        public double getResult() {
            return n == 0 ? Double.NaN : val;
        }

        @Override
        public long getN() {
            return n;
        }

        @Override
        public void clear() {
            val = 0.0;
            n = 0;
        }

        @Override
        public StorelessUnivariateStatistic copy() {
            CustomStorelessStatistic copy = new CustomStorelessStatistic();
            copy.val = this.val;
            copy.n = this.n;
            return copy;
        }
    }

    @Test
    public void testEmptyAndBoundaryStatistics() {
        Assert.assertEquals(0, u.getN());
        Assert.assertTrue(Double.isNaN(u.getMean()));
        Assert.assertTrue(Double.isNaN(u.getGeometricMean()));
        Assert.assertTrue(Double.isNaN(u.getVariance()));
        Assert.assertTrue(Double.isNaN(u.getPopulationVariance()));
        Assert.assertTrue(Double.isNaN(u.getStandardDeviation()));
        Assert.assertTrue(Double.isNaN(u.getMin()));
        Assert.assertTrue(Double.isNaN(u.getMax()));
        Assert.assertTrue(Double.isNaN(u.getSum()));
        Assert.assertTrue(Double.isNaN(u.getSumsq()));
        Assert.assertTrue(Double.isNaN(u.getSumOfLogs()));
        Assert.assertTrue(Double.isNaN(u.getSecondMoment()));
    }

    @Test
    public void testStandardDeviationBranches() {
        // Branch 1: n = 0 -> NaN
        Assert.assertTrue(Double.isNaN(u.getStandardDeviation()));

        // Branch 2: n = 1 -> 0.0
        u.addValue(5.0);
        Assert.assertEquals(1, u.getN());
        Assert.assertEquals(0.0, u.getStandardDeviation(), TOLERANCE);
        Assert.assertEquals(0.0, u.getVariance(), TOLERANCE);
        Assert.assertEquals(0.0, u.getSecondMoment(), TOLERANCE);

        // Branch 3: n > 1 -> FastMath.sqrt(getVariance())
        u.addValue(7.0);
        Assert.assertEquals(2, u.getN());
        Assert.assertEquals(2.0, u.getVariance(), TOLERANCE);
        Assert.assertEquals(Math.sqrt(2.0), u.getStandardDeviation(), TOLERANCE);
    }

    @Test
    public void testStatisticalCalculations() {
        double[] values = {1.0, 2.0, 4.0, 8.0};
        for (double v : values) {
            u.addValue(v);
        }

        Assert.assertEquals(4, u.getN());
        Assert.assertEquals(15.0, u.getSum(), TOLERANCE);
        Assert.assertEquals(85.0, u.getSumsq(), TOLERANCE);
        Assert.assertEquals(1.0, u.getMin(), TOLERANCE);
        Assert.assertEquals(8.0, u.getMax(), TOLERANCE);
        Assert.assertEquals(3.75, u.getMean(), TOLERANCE);
        Assert.assertEquals(2.8284271247461903, u.getGeometricMean(), 1E-14);
        Assert.assertEquals(9.583333333333334, u.getVariance(), 1E-14);
        Assert.assertEquals(7.1875, u.getPopulationVariance(), 1E-14);
        Assert.assertEquals(4.1588830833596715, u.getSumOfLogs(), 1E-14);
        Assert.assertEquals(28.75, u.getSecondMoment(), 1E-14);

        StatisticalSummary summary = u.getSummary();
        Assert.assertEquals(u.getMean(), summary.getMean(), TOLERANCE);
        Assert.assertEquals(u.getVariance(), summary.getVariance(), TOLERANCE);
        Assert.assertEquals(u.getN(), summary.getN());
        Assert.assertEquals(u.getMax(), summary.getMax(), TOLERANCE);
        Assert.assertEquals(u.getMin(), summary.getMin(), TOLERANCE);
        Assert.assertEquals(u.getSum(), summary.getSum(), TOLERANCE);
    }

    @Test
    public void testClearWithDefaultAndCustomImplementations() {
        u.addValue(10.0);
        u.clear();
        Assert.assertEquals(0, u.getN());
        Assert.assertTrue(Double.isNaN(u.getMean()));

        // Override implementations
        StorelessUnivariateStatistic customMean = new CustomStorelessStatistic();
        StorelessUnivariateStatistic customVariance = new CustomStorelessStatistic();
        u.setMeanImpl(customMean);
        u.setVarianceImpl(customVariance);

        u.addValue(10.0);
        Assert.assertEquals(1, u.getN());
        u.clear();
        Assert.assertEquals(0, u.getN());
        Assert.assertTrue(Double.isNaN(u.getMean()));
        Assert.assertTrue(Double.isNaN(u.getVariance()));
    }

    @Test
    public void testCustomImplementationAddValue() {
        // Defects4J Math-43 target: testing overridden Mean, Variance, and GeoMean
        Mean customMean = new Mean();
        Variance customVariance = new Variance();
        GeometricMean customGeoMean = new GeometricMean();

        u.setMeanImpl(customMean);
        u.setVarianceImpl(customVariance);
        u.setGeoMeanImpl(customGeoMean);

        u.addValue(2.0);
        u.addValue(4.0);

        Assert.assertEquals(2, u.getN());
        Assert.assertEquals(3.0, u.getMean(), TOLERANCE);
        Assert.assertEquals(2.0, u.getVariance(), TOLERANCE);
        Assert.assertEquals(Math.sqrt(8.0), u.getGeometricMean(), TOLERANCE);
    }

    @Test
    public void testAllSettersBeforeAddValue() {
        u.setSumImpl(new CustomStorelessStatistic());
        u.setSumsqImpl(new CustomStorelessStatistic());
        u.setMinImpl(new CustomStorelessStatistic());
        u.setMaxImpl(new CustomStorelessStatistic());
        u.setSumLogImpl(new CustomStorelessStatistic());
        u.setGeoMeanImpl(new CustomStorelessStatistic());
        u.setMeanImpl(new CustomStorelessStatistic());
        u.setVarianceImpl(new CustomStorelessStatistic());

        Assert.assertTrue(u.getSumImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getSumsqImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getMinImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getMaxImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getSumLogImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getGeoMeanImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getMeanImpl() instanceof CustomStorelessStatistic);
        Assert.assertTrue(u.getVarianceImpl() instanceof CustomStorelessStatistic);

        u.addValue(5.0);
        Assert.assertEquals(5.0, u.getSum(), TOLERANCE);
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setSumImpl(new Sum());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumsqImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setSumsqImpl(new CustomStorelessStatistic());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMinImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setMinImpl(new CustomStorelessStatistic());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMaxImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setMaxImpl(new CustomStorelessStatistic());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetSumLogImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setSumLogImpl(new CustomStorelessStatistic());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetGeoMeanImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setGeoMeanImpl(new CustomStorelessStatistic());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetMeanImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setMeanImpl(new CustomStorelessStatistic());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetVarianceImplAfterAddValueThrows() {
        u.addValue(1.0);
        u.setVarianceImpl(new CustomStorelessStatistic());
    }

    @Test
    public void testEqualsAndHashCode() {
        Assert.assertTrue(u.equals(u));
        Assert.assertFalse(u.equals(null));
        Assert.assertFalse(u.equals("String Object"));

        SummaryStatistics other = new SummaryStatistics();
        Assert.assertTrue(u.equals(other));
        Assert.assertEquals(u.hashCode(), other.hashCode());

        u.addValue(10.0);
        Assert.assertFalse(u.equals(other));
        Assert.assertFalse(u.hashCode() == other.hashCode());

        other.addValue(10.0);
        Assert.assertTrue(u.equals(other));
        Assert.assertEquals(u.hashCode(), other.hashCode());

        other.addValue(20.0);
        Assert.assertFalse(u.equals(other));
    }

    @Test
    public void testCopyAndCopyConstructors() {
        u.addValue(2.0);
        u.addValue(4.0);

        // Copy constructor
        SummaryStatistics copyConstructed = new SummaryStatistics(u);
        Assert.assertEquals(u, copyConstructed);

        // copy() method
        SummaryStatistics clone = u.copy();
        Assert.assertEquals(u, clone);

        // Copy with overridden implementations (test non-default branch inside copy)
        SummaryStatistics customSource = new SummaryStatistics();
        customSource.setMeanImpl(new CustomStorelessStatistic());
        customSource.setVarianceImpl(new CustomStorelessStatistic());
        customSource.setGeoMeanImpl(new CustomStorelessStatistic());
        customSource.setMinImpl(new CustomStorelessStatistic());
        customSource.setMaxImpl(new CustomStorelessStatistic());
        customSource.setSumImpl(new CustomStorelessStatistic());
        customSource.setSumLogImpl(new CustomStorelessStatistic());
        customSource.setSumsqImpl(new CustomStorelessStatistic());
        customSource.addValue(3.0);

        SummaryStatistics customDest = new SummaryStatistics();
        SummaryStatistics.copy(customSource, customDest);
        Assert.assertEquals(customSource.getN(), customDest.getN());
        Assert.assertEquals(customSource.getMean(), customDest.getMean(), TOLERANCE);
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyNullSourceThrows() {
        SummaryStatistics.copy(null, new SummaryStatistics());
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyNullDestThrows() {
        SummaryStatistics.copy(new SummaryStatistics(), null);
    }

    @Test
    public void testToString() {
        String str = u.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("SummaryStatistics:"));
        Assert.assertTrue(str.contains("n: 0"));

        u.addValue(1.0);
        String str2 = u.toString();
        Assert.assertTrue(str2.contains("n: 1"));
        Assert.assertTrue(str2.contains("min: 1.0"));
        Assert.assertTrue(str2.contains("max: 1.0"));
    }
}
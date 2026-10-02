package org.apache.commons.math.stat.descriptive;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.Sum;

/**
 * JUnit 4 test suite for {@link SummaryStatistics} (Defects4J Math-43b)
 *
 * หมายเหตุ: บางค่าที่ใช้ assert อิงจากพฤติกรรมที่รู้กันทั่วไปของคลาสลูก
 * (Mean, Variance, Sum, Min, Max, SumOfLogs, GeometricMean, SecondMoment)
 * ซึ่งไม่ได้อยู่ใน source ของ SummaryStatistics ที่ให้มาโดยตรง
 * - จะกำกับด้วยคอมเมนต์ "// known lib behavior" ในจุดที่เกี่ยวข้อง
 */
public class SummaryStatisticsTest {

    private static final double DELTA = 1e-9;

    /**
     * Custom StorelessUnivariateStatistic สำหรับทดสอบ branch ที่ override
     * meanImpl / varianceImpl / geoMeanImpl (ต้องไม่ใช่ instance ของ
     * Mean/Variance/GeometricMean เพื่อให้ branch "!(impl instanceof X)" เป็น true)
     *
     * หมายเหตุ: interface signature อนุมานจากรูปแบบมาตรฐานของ
     * StorelessUnivariateStatistic ใน commons-math (ไม่ได้ระบุไว้ใน source ที่ให้มา)
     */
    private static class CustomStorelessStatistic implements StorelessUnivariateStatistic {
        private double sum = 0d;
        private long n = 0L;

        public void increment(double d) {
            sum += d;
            n++;
        }

        public void incrementAll(double[] values) {
            for (double v : values) {
                increment(v);
            }
        }

        public void incrementAll(double[] values, int start, int length) {
            for (int i = start; i < start + length; i++) {
                increment(values[i]);
            }
        }

        public double getResult() {
            return sum;
        }

        public long getN() {
            return n;
        }

        public void clear() {
            sum = 0d;
            n = 0L;
        }

        public double evaluate(double[] values) {
            return 0d;
        }

        public double evaluate(double[] values, int begin, int length) {
            return 0d;
        }

        public StorelessUnivariateStatistic copy() {
            CustomStorelessStatistic c = new CustomStorelessStatistic();
            c.sum = this.sum;
            c.n = this.n;
            return c;
        }
    }

    // ---------------------------------------------------------------
    // 1. Empty / boundary state (n == 0)
    // ---------------------------------------------------------------

    @Test
    public void testInitialState() {
        SummaryStatistics stats = new SummaryStatistics();
        assertEquals(0L, stats.getN());
        assertEquals(0d, stats.getSum(), DELTA);          // known lib behavior (Sum init = 0)
        assertEquals(0d, stats.getSumsq(), DELTA);        // known lib behavior
        assertTrue(Double.isNaN(stats.getMean()));        // known lib behavior
        assertTrue(Double.isNaN(stats.getVariance()));    // known lib behavior
        assertTrue(Double.isNaN(stats.getMin()));         // known lib behavior
        assertTrue(Double.isNaN(stats.getMax()));         // known lib behavior
        assertTrue(Double.isNaN(stats.getGeometricMean()));// known lib behavior
        assertTrue(Double.isNaN(stats.getSumOfLogs()));   // known lib behavior
        assertTrue(Double.isNaN(stats.getSecondMoment())); // known lib behavior
        assertTrue(Double.isNaN(stats.getPopulationVariance()));
    }

    // ---------------------------------------------------------------
    // 2. getStandardDeviation() - ครอบคลุม if(n>0) / if(n>1) ทุก branch
    // ---------------------------------------------------------------

    @Test
    public void testGetStandardDeviation_NoValues() {
        SummaryStatistics stats = new SummaryStatistics();
        assertTrue(Double.isNaN(stats.getStandardDeviation())); // n==0 branch
    }

    @Test
    public void testGetStandardDeviation_OneValue() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        assertEquals(0.0, stats.getStandardDeviation(), DELTA); // n==1 branch -> 0.0
    }

    @Test
    public void testGetStandardDeviation_MultipleValues() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(2.0);
        stats.addValue(4.0);
        stats.addValue(6.0);
        // variance (sample) = 4.0 -> sqrt = 2.0 (n>1 branch)
        assertEquals(2.0, stats.getStandardDeviation(), DELTA);
    }

    // ---------------------------------------------------------------
    // 3. addValue() - ค่าพื้นฐานกับ default implementations
    // ---------------------------------------------------------------

    @Test
    public void testAddValueSingle() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(5.0);
        assertEquals(1L, stats.getN());
        assertEquals(5.0, stats.getSum(), DELTA);
        assertEquals(25.0, stats.getSumsq(), DELTA);
        assertEquals(5.0, stats.getMean(), DELTA);
        assertEquals(5.0, stats.getMin(), DELTA);
        assertEquals(5.0, stats.getMax(), DELTA);
        assertEquals(0.0, stats.getVariance(), DELTA);
        assertEquals(0.0, stats.getSecondMoment(), DELTA);
        assertEquals(5.0, stats.getGeometricMean(), DELTA);
        assertEquals(Math.log(5.0), stats.getSumOfLogs(), DELTA);
    }

    @Test
    public void testAddValueMultiple() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(2.0);
        stats.addValue(4.0);
        stats.addValue(6.0);

        assertEquals(3L, stats.getN());
        assertEquals(12.0, stats.getSum(), DELTA);
        assertEquals(56.0, stats.getSumsq(), DELTA);
        assertEquals(4.0, stats.getMean(), DELTA);
        assertEquals(2.0, stats.getMin(), DELTA);
        assertEquals(6.0, stats.getMax(), DELTA);
        assertEquals(4.0, stats.getVariance(), DELTA);             // sample variance (n-1)
        assertEquals(8.0, stats.getSecondMoment(), DELTA);
        assertEquals(8.0 / 3.0, stats.getPopulationVariance(), DELTA);
        assertEquals(Math.pow(48.0, 1.0 / 3.0), stats.getGeometricMean(), 1e-6);
    }

    // ---------------------------------------------------------------
    // 4. addValue() - branch: custom meanImpl/varianceImpl/geoMeanImpl
    //    ที่ไม่ใช่ instance ของ Mean/Variance/GeometricMean
    // ---------------------------------------------------------------

    @Test
    public void testAddValue_CustomMeanImplIsIncremented() {
        SummaryStatistics stats = new SummaryStatistics();
        CustomStorelessStatistic customMean = new CustomStorelessStatistic();
        stats.setMeanImpl(customMean);

        stats.addValue(3.0);
        stats.addValue(7.0);

        // branch !(meanImpl instanceof Mean) == true -> custom.increment ถูกเรียก
        assertEquals(2L, customMean.getN());
        assertEquals(10.0, customMean.getResult(), DELTA);
        assertEquals(10.0, stats.getMean(), DELTA); // ค่าที่ได้มาจาก custom, ไม่ใช่ mean จริง
    }

    @Test
    public void testAddValue_CustomVarianceImplIsIncremented() {
        SummaryStatistics stats = new SummaryStatistics();
        CustomStorelessStatistic customVariance = new CustomStorelessStatistic();
        stats.setVarianceImpl(customVariance);

        stats.addValue(1.0);
        stats.addValue(2.0);
        stats.addValue(3.0);

        assertEquals(3L, customVariance.getN());
        assertEquals(6.0, customVariance.getResult(), DELTA);
        assertEquals(6.0, stats.getVariance(), DELTA);
    }

    @Test
    public void testAddValue_CustomGeoMeanImplIsIncremented() {
        SummaryStatistics stats = new SummaryStatistics();
        CustomStorelessStatistic customGeoMean = new CustomStorelessStatistic();
        stats.setGeoMeanImpl(customGeoMean);

        stats.addValue(1.0);
        stats.addValue(4.0);

        assertEquals(2L, customGeoMean.getN());
        assertEquals(5.0, customGeoMean.getResult(), DELTA);
        assertEquals(5.0, stats.getGeometricMean(), DELTA);
    }

    // ---------------------------------------------------------------
    // 5. clear() - ครอบคลุม branch meanImpl!=mean, varianceImpl!=variance
    // ---------------------------------------------------------------

    @Test
    public void testClear_DefaultImpls() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(10.0);
        stats.addValue(20.0);
        stats.clear(); // branch meanImpl==mean, varianceImpl==variance -> false, skip extra clear()

        assertEquals(0L, stats.getN());
        assertEquals(0d, stats.getSum(), DELTA);
        assertTrue(Double.isNaN(stats.getMean()));
        assertTrue(Double.isNaN(stats.getVariance()));
        assertTrue(Double.isNaN(stats.getMin()));
        assertTrue(Double.isNaN(stats.getMax()));
    }

    @Test
    public void testClear_CustomMeanAndVarianceImpls() {
        SummaryStatistics stats = new SummaryStatistics();
        CustomStorelessStatistic customMean = new CustomStorelessStatistic();
        CustomStorelessStatistic customVariance = new CustomStorelessStatistic();
        stats.setMeanImpl(customMean);
        stats.setVarianceImpl(customVariance);

        stats.addValue(5.0);
        stats.addValue(15.0);
        assertEquals(2L, customMean.getN());

        stats.clear(); // branch meanImpl!=mean, varianceImpl!=variance -> true, clear() ถูกเรียกตรง

        assertEquals(0L, stats.getN());
        assertEquals(0L, customMean.getN());
        assertEquals(0d, customMean.getResult(), DELTA);
        assertEquals(0L, customVariance.getN());
    }

    // ---------------------------------------------------------------
    // 6. checkEmpty() - ครอบคลุม n>0 (throw) / n==0 (ไม่ throw)
    // ---------------------------------------------------------------

    @Test
    public void testSetImplBeforeAddValue_NoException() {
        SummaryStatistics stats = new SummaryStatistics();
        // n == 0 -> checkEmpty() ไม่ throw
        stats.setSumImpl(new Sum());
        stats.setMinImpl(new Min());
        // ไม่ throw ถือว่าผ่าน
        assertEquals(0L, stats.getN());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testSetImplAfterAddValue_Throws() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(1.0);
        // n > 0 -> checkEmpty() ต้อง throw MathIllegalStateException
        stats.setMinImpl(new Min());
    }

    // ---------------------------------------------------------------
    // 7. equals() - ครอบคลุมทุก branch
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameReference() {
        SummaryStatistics stats = new SummaryStatistics();
        assertTrue(stats.equals(stats)); // object == this -> true
    }

    @Test
    public void testEquals_DifferentType() {
        SummaryStatistics stats = new SummaryStatistics();
        assertFalse(stats.equals("not a SummaryStatistics")); // instanceof == false
    }

    @Test
    public void testEquals_Null() {
        SummaryStatistics stats = new SummaryStatistics();
        assertFalse(stats.equals(null)); // null instanceof X == false -> branch true -> return false
    }

    @Test
    public void testEquals_SameValues() {
        SummaryStatistics a = new SummaryStatistics();
        SummaryStatistics b = new SummaryStatistics();
        a.addValue(1.0);
        a.addValue(2.0);
        a.addValue(3.0);
        b.addValue(1.0);
        b.addValue(2.0);
        b.addValue(3.0);

        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testEquals_DifferentValues() {
        SummaryStatistics a = new SummaryStatistics();
        SummaryStatistics b = new SummaryStatistics();
        a.addValue(1.0);
        b.addValue(2.0);

        assertFalse(a.equals(b));
    }

    // ---------------------------------------------------------------
    // 8. toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_WithValues() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(2.0);
        stats.addValue(4.0);
        String s = stats.toString();

        assertTrue(s.contains("SummaryStatistics:"));
        assertTrue(s.contains("n: 2"));
        assertTrue(s.contains("min:"));
        assertTrue(s.contains("max:"));
        assertTrue(s.contains("mean:"));
        assertTrue(s.contains("geometric mean:"));
        assertTrue(s.contains("variance:"));
        assertTrue(s.contains("sum of squares:"));
        assertTrue(s.contains("standard deviation:"));
        assertTrue(s.contains("sum of logs:"));
    }

    @Test
    public void testToString_Empty() {
        SummaryStatistics stats = new SummaryStatistics();
        String s = stats.toString();
        assertTrue(s.contains("n: 0"));
        assertTrue(s.contains("NaN")); // mean/standard deviation ฯลฯ เป็น NaN
    }

    // ---------------------------------------------------------------
    // 9. getSummary()
    // ---------------------------------------------------------------

    @Test
    public void testGetSummary() {
        SummaryStatistics stats = new SummaryStatistics();
        stats.addValue(2.0);
        stats.addValue(4.0);
        stats.addValue(6.0);

        StatisticalSummary summary = stats.getSummary();
        assertEquals(stats.getMean(), summary.getMean(), DELTA);
        assertEquals(stats.getVariance(), summary.getVariance(), DELTA);
        assertEquals(stats.getN(), summary.getN());
        assertEquals(stats.getMax(), summary.getMax(), DELTA);
        assertEquals(stats.getMin(), summary.getMin(), DELTA);
        assertEquals(stats.getSum(), summary.getSum(), DELTA);
    }

    // ---------------------------------------------------------------
    // 10. Copy constructor
    // ---------------------------------------------------------------

    @Test
    public void testCopyConstructor_IndependentCopy() {
        SummaryStatistics original = new SummaryStatistics();
        original.addValue(2.0);
        original.addValue(4.0);
        original.addValue(6.0);

        SummaryStatistics copyInstance = new SummaryStatistics(original);

        assertEquals(original.getN(), copyInstance.getN());
        assertEquals(original.getMean(), copyInstance.getMean(), DELTA);
        assertTrue(original.equals(copyInstance));

        // ต้องเป็น deep copy ไม่ใช่ reference เดียวกัน
        copyInstance.addValue(100.0);
        assertEquals(3L, original.getN());
        assertEquals(4L, copyInstance.getN());
    }

    // ---------------------------------------------------------------
    // 11. copy() instance method
    // ---------------------------------------------------------------

    @Test
    public void testCopyMethod() {
        SummaryStatistics original = new SummaryStatistics();
        original.addValue(10.0);
        SummaryStatistics copyInstance = original.copy();
        assertTrue(original.equals(copyInstance));
    }

    // ---------------------------------------------------------------
    // 12. static copy(source, dest) - null checks
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testCopyStatic_NullSourceThrows() {
        SummaryStatistics.copy(null, new SummaryStatistics());
    }

    @Test(expected = NullArgumentException.class)
    public void testCopyStatic_NullDestThrows() {
        SummaryStatistics.copy(new SummaryStatistics(), null);
    }

    // ---------------------------------------------------------------
    // 13. static copy(source, dest) - default impls
    //     (source.max==source.maxImpl ฯลฯ -> true branch,
    //      source.getVarianceImpl() instanceof Variance -> true branch)
    // ---------------------------------------------------------------

    @Test
    public void testCopyStatic_DefaultImpls() {
        SummaryStatistics source = new SummaryStatistics();
        source.addValue(1.0);
        source.addValue(2.0);
        source.addValue(3.0);

        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);

        assertEquals(source.getN(), dest.getN());
        assertEquals(source.getMean(), dest.getMean(), DELTA);
        assertEquals(source.getVariance(), dest.getVariance(), DELTA);
        assertEquals(source.getGeometricMean(), dest.getGeometricMean(), DELTA);
        assertEquals(source.getSum(), dest.getSum(), DELTA);
        assertEquals(source.getMax(), dest.getMax(), DELTA);
        assertEquals(source.getMin(), dest.getMin(), DELTA);
    }

    // ---------------------------------------------------------------
    // 14. static copy(source, dest) - custom impls
    //     (instanceof checks -> false branch,
    //      identity checks source.X==source.XImpl -> false branch)
    // ---------------------------------------------------------------

    @Test
    public void testCopyStatic_CustomImpls() {
        SummaryStatistics source = new SummaryStatistics();

        CustomStorelessStatistic customSum = new CustomStorelessStatistic();
        CustomStorelessStatistic customMean = new CustomStorelessStatistic();
        CustomStorelessStatistic customVariance = new CustomStorelessStatistic();
        CustomStorelessStatistic customGeoMean = new CustomStorelessStatistic();

        source.setSumImpl(customSum);
        source.setMeanImpl(customMean);
        source.setVarianceImpl(customVariance);
        source.setGeoMeanImpl(customGeoMean);

        source.addValue(5.0);
        source.addValue(10.0);

        SummaryStatistics dest = new SummaryStatistics();
        SummaryStatistics.copy(source, dest);

        assertEquals(source.getN(), dest.getN());
        assertEquals(source.getSumImpl().getResult(), dest.getSumImpl().getResult(), DELTA);
        assertEquals(source.getMeanImpl().getResult(), dest.getMeanImpl().getResult(), DELTA);
        assertEquals(source.getVarianceImpl().getResult(), dest.getVarianceImpl().getResult(), DELTA);
        assertEquals(source.getGeoMeanImpl().getResult(), dest.getGeoMeanImpl().getResult(), DELTA);

        // dest ต้องเป็น copy คนละ instance จาก source
        assertNotSame(source.getSumImpl(), dest.getSumImpl());
        assertNotSame(source.getMeanImpl(), dest.getMeanImpl());
        assertNotSame(source.getVarianceImpl(), dest.getVarianceImpl());
        assertNotSame(source.getGeoMeanImpl(), dest.getGeoMeanImpl());
    }

    // ---------------------------------------------------------------
    // 15. Getters/Setters implementations (sanity, เผื่อ fault ในการ assign field)
    // ---------------------------------------------------------------

    @Test
    public void testGetterSetter_SumImpl() {
        SummaryStatistics stats = new SummaryStatistics();
        Sum customSum = new Sum();
        stats.setSumImpl(customSum);
        assertSame(customSum, stats.getSumImpl());
    }

    @Test
    public void testGetterSetter_MinImpl() {
        SummaryStatistics stats = new SummaryStatistics();
        Min customMin = new Min();
        stats.setMinImpl(customMin);
        assertSame(customMin, stats.getMinImpl());
    }
}

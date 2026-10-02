package org.apache.commons.math.stat.descriptive.moment;

import static org.junit.Assert.*;

import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Test;

public class VarianceTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        Variance v = new Variance();
        assertTrue(v.isBiasCorrected());
        // moment.n == 0 branch
        assertEquals(Double.NaN, v.getResult(), DELTA);
        assertEquals(0L, v.getN());
    }

    @Test
    public void testBiasCorrectedConstructorFalse() {
        Variance v = new Variance(false);
        assertFalse(v.isBiasCorrected());
    }

    @Test
    public void testConstructorWithExternalSecondMoment() {
        SecondMoment sm = new SecondMoment();
        sm.increment(2.0);
        sm.increment(4.0);
        sm.increment(6.0);

        Variance v = new Variance(sm);
        // isBiasCorrected default true -> m2/(n-1)
        // m2 = (2-4)^2+(4-4)^2+(6-4)^2 = 8 ; n=3 -> 8/2 = 4.0
        assertEquals(4.0, v.getResult(), DELTA);

        // incMoment == false -> increment() ต้องไม่ส่งผลต่อ moment ภายนอก
        v.increment(100.0);
        assertEquals(3L, sm.getN());
        assertEquals(4.0, v.getResult(), DELTA);
    }

    @Test
    public void testConstructorBiasCorrectedWithExternalMoment() {
        SecondMoment sm = new SecondMoment();
        sm.increment(2.0);
        sm.increment(4.0);
        sm.increment(6.0);

        Variance v = new Variance(false, sm);
        assertFalse(v.isBiasCorrected());
        // m2/n = 8/3
        assertEquals(8.0 / 3.0, v.getResult(), DELTA);

        // incMoment == false -> clear() ต้องไม่ clear moment ภายนอก
        v.clear();
        assertEquals(3L, sm.getN());
    }

    @Test
    public void testCopyConstructorAndStaticCopy() {
        Variance original = new Variance();
        original.increment(1.0);
        original.increment(2.0);
        original.increment(3.0);
        original.setBiasCorrected(false);

        Variance copyViaConstructor = new Variance(original);
        assertEquals(original.getResult(), copyViaConstructor.getResult(), DELTA);
        assertEquals(original.isBiasCorrected(), copyViaConstructor.isBiasCorrected());

        // ยืนยันว่าเป็น deep copy ไม่ใช่ reference เดียวกัน
        original.increment(100.0);
        assertNotEquals(original.getN(), copyViaConstructor.getN());
    }

    @Test(expected = NullArgumentException.class)
    public void testStaticCopyNullSourceThrows() {
        Variance dest = new Variance();
        Variance.copy(null, dest);
    }

    @Test(expected = NullArgumentException.class)
    public void testStaticCopyNullDestThrows() {
        Variance source = new Variance();
        Variance.copy(source, null);
    }

    @Test
    public void testInstanceCopyMethod() {
        Variance v = new Variance();
        v.increment(5.0);
        v.increment(10.0);
        Variance copied = v.copy();
        assertEquals(v.getResult(), copied.getResult(), DELTA);
        assertNotSame(v, copied);
    }

    // ---------------------------------------------------------------
    // increment / clear / getResult / getN
    // ---------------------------------------------------------------

    @Test
    public void testIncrementAndGetResultSampleVariance() {
        Variance v = new Variance(); // isBiasCorrected = true (default)
        double[] data = {1, 2, 3, 4, 5};
        for (double d : data) {
            v.increment(d);
        }
        // sample variance = 2.5
        assertEquals(2.5, v.getResult(), DELTA);
        assertEquals(5L, v.getN());
    }

    @Test
    public void testGetResultNZeroBranch() {
        Variance v = new Variance();
        assertEquals(Double.NaN, v.getResult(), DELTA);
    }

    @Test
    public void testGetResultNOneBranch() {
        Variance v = new Variance();
        v.increment(42.0);
        assertEquals(0.0, v.getResult(), DELTA);
    }

    @Test
    public void testGetResultBiasCorrectedFalseBranch() {
        Variance v = new Variance();
        v.setBiasCorrected(false);
        double[] data = {1, 2, 3, 4, 5};
        for (double d : data) {
            v.increment(d);
        }
        // population variance = 2.0
        assertEquals(2.0, v.getResult(), DELTA);
    }

    @Test
    public void testClearWithIncMomentTrue() {
        Variance v = new Variance();
        v.increment(1.0);
        v.increment(2.0);
        assertEquals(2L, v.getN());
        v.clear();
        assertEquals(0L, v.getN());
        assertEquals(Double.NaN, v.getResult(), DELTA);
    }

    // ---------------------------------------------------------------
    // isBiasCorrected / setBiasCorrected
    // ---------------------------------------------------------------

    @Test
    public void testSetAndGetBiasCorrected() {
        Variance v = new Variance();
        assertTrue(v.isBiasCorrected());
        v.setBiasCorrected(false);
        assertFalse(v.isBiasCorrected());
        v.setBiasCorrected(true);
        assertTrue(v.isBiasCorrected());
    }

    // ---------------------------------------------------------------
    // evaluate(double[])
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testEvaluateNullArrayThrows() {
        Variance v = new Variance();
        v.evaluate((double[]) null);
    }

    @Test
    public void testEvaluateEmptyArrayReturnsNaN() {
        Variance v = new Variance();
        // length == 0 branch -> var ยังเป็น NaN (ไม่เข้า if/else if ใดเลย)
        assertEquals(Double.NaN, v.evaluate(new double[0]), DELTA);
    }

    @Test
    public void testEvaluateSingleValueArray() {
        Variance v = new Variance();
        assertEquals(0.0, v.evaluate(new double[]{7.0}), DELTA);
    }

    @Test
    public void testEvaluateMultiValueArray() {
        Variance v = new Variance();
        double[] data = {1, 2, 3, 4, 5};
        assertEquals(2.5, v.evaluate(data), DELTA);
    }

    // ---------------------------------------------------------------
    // evaluate(double[], begin, length)
    // ---------------------------------------------------------------

    @Test
    public void testEvaluateBeginLengthSubarray() {
        Variance v = new Variance();
        double[] data = {999, 1, 2, 3, 4, 5, -999};
        // subarray {1,2,3,4,5} -> variance = 2.5
        assertEquals(2.5, v.evaluate(data, 1, 5), DELTA);
    }

    @Test
    public void testEvaluateBeginLengthZeroLength() {
        Variance v = new Variance();
        double[] data = {1, 2, 3};
        assertEquals(Double.NaN, v.evaluate(data, 0, 0), DELTA);
    }

    @Test
    public void testEvaluateBeginLengthOneLength() {
        Variance v = new Variance();
        double[] data = {1, 2, 3};
        assertEquals(0.0, v.evaluate(data, 1, 1), DELTA);
    }

    // ไม่แน่ใจ exception type ที่แน่นอนจาก test() ของ superclass (ไม่มีซอร์สให้)
    @Test(expected = Exception.class)
    public void testEvaluateInvalidBeginLengthThrows() {
        Variance v = new Variance();
        double[] data = {1, 2, 3};
        v.evaluate(data, 0, 10); // length เกินขนาดอาเรย์
    }

    // ---------------------------------------------------------------
    // evaluate(double[], mean) / evaluate(double[], mean, begin, length)
    // ---------------------------------------------------------------

    @Test
    public void testEvaluateWithPrecomputedMeanMatchesPlainEvaluate() {
        Variance v = new Variance();
        double[] data = {1, 2, 3, 4, 5};
        double mean = 3.0;
        assertEquals(v.evaluate(data), v.evaluate(data, mean), DELTA);
    }

    @Test
    public void testEvaluateMeanBeginLengthSubarray() {
        Variance v = new Variance();
        double[] data = {999, 1, 2, 3, 4, 5, -999};
        assertEquals(2.5, v.evaluate(data, 3.0, 1, 5), DELTA);
    }

    @Test
    public void testEvaluateMeanZeroLengthReturnsNaN() {
        Variance v = new Variance();
        double[] data = {1, 2, 3};
        assertEquals(Double.NaN, v.evaluate(data, 2.0, 0, 0), DELTA);
    }

    @Test
    public void testEvaluateMeanSingleLengthReturnsZero() {
        Variance v = new Variance();
        double[] data = {1, 2, 3};
        assertEquals(0.0, v.evaluate(data, 1.0, 1, 1), DELTA);
    }

    @Test
    public void testEvaluateMeanBiasCorrectedFalseBranch() {
        Variance v = new Variance();
        v.setBiasCorrected(false);
        double[] data = {1, 2, 3, 4, 5};
        // population variance = 2.0
        assertEquals(2.0, v.evaluate(data, 3.0), DELTA);
    }

    // ---------------------------------------------------------------
    // evaluate(double[], double[] weights) / weights,begin,length
    // ---------------------------------------------------------------

    @Test
    public void testEvaluateWeightsAllOnesEqualsUnweighted() {
        Variance v = new Variance();
        double[] values = {1, 2, 3, 4, 5};
        double[] weights = {1, 1, 1, 1, 1};
        // ตาม Javadoc: เมื่อ weight ทั้งหมด = 1 ผลลัพธ์ต้องเท่ากับ unweighted variance
        assertEquals(v.evaluate(values), v.evaluate(values, weights), DELTA);
    }

    @Test
    public void testEvaluateWeightsSingleLength() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, 1, 1};
        assertEquals(0.0, v.evaluate(values, weights, 1, 1), DELTA);
    }

    @Test
    public void testEvaluateWeightsZeroLengthReturnsNaN() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, 1, 1};
        assertEquals(Double.NaN, v.evaluate(values, weights, 0, 0), DELTA);
    }

    // ค่า null ของ values ใน evaluate(values, weights) -> values.length ถูกเรียกก่อนเข้า test()
    // จึงเกิด NullPointerException ไม่ใช่ NullArgumentException ตาม Javadoc
    // (พฤติกรรมนี้อนุมานได้ตรงจาก source: `evaluate(values, weights, 0, values.length)`)
    @Test(expected = NullPointerException.class)
    public void testEvaluateWeightsNullValuesCausesNPE() {
        Variance v = new Variance();
        double[] weights = {1, 1, 1};
        v.evaluate((double[]) null, weights);
    }

    // ไม่แน่ใจ exception type แน่ชัดจาก test(values, weights, begin, length) (ไม่มีซอร์สให้)
    @Test(expected = Exception.class)
    public void testEvaluateWeightsNullWeightsThrows() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        v.evaluate(values, (double[]) null);
    }

    @Test(expected = Exception.class)
    public void testEvaluateWeightsLengthMismatchThrows() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, 1}; // length mismatch
        v.evaluate(values, weights);
    }

    @Test(expected = Exception.class)
    public void testEvaluateWeightsNegativeValueThrows() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, -1, 1};
        v.evaluate(values, weights);
    }

    @Test(expected = Exception.class)
    public void testEvaluateWeightsNaNThrows() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, Double.NaN, 1};
        v.evaluate(values, weights);
    }

    @Test(expected = Exception.class)
    public void testEvaluateWeightsInfiniteThrows() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, Double.POSITIVE_INFINITY, 1};
        v.evaluate(values, weights);
    }

    // ---------------------------------------------------------------
    // evaluate(double[], weights, mean, begin, length)
    // ---------------------------------------------------------------

    @Test
    public void testEvaluateWeightsMeanSingleLength() {
        Variance v = new Variance();
        double[] values = {1, 2, 3};
        double[] weights = {1, 1, 1};
        assertEquals(0.0, v.evaluate(values, weights, 1.0, 1, 1), DELTA);
    }

    @Test
    public void testEvaluateWeightsMeanBiasCorrectedFalseFullArray() {
        // ใช้ begin=0,length=values.length เพื่อเลี่ยง fault ของ sumWts (ดูเทสถัดไป)
        // และทดสอบ branch isBiasCorrected == false ของ weighted evaluate
        Variance v = new Variance();
        v.setBiasCorrected(false);
        double[] values = {1, 2, 3, 4, 5};
        double[] weights = {1, 1, 1, 1, 1};
        double mean = 3.0;
        // accum = 4+1+0+1+4=10, accum2=0, sumWts=5 -> var = 10/5 = 2.0
        assertEquals(2.0, v.evaluate(values, weights, mean, 0, values.length), DELTA);
    }

    /**
     * FAULT-DETECTION TEST
     * ตาม Javadoc ของ evaluate(values, weights, mean, begin, length):
     * "Returns the weighted variance of the entries in the specified portion ..."
     * สูตร: Σ(weights[i]*(values[i]-mean)^2)/(Σ(weights[i]) - 1)
     * โดย Σ(weights[i]) ควรหมายถึง weight เฉพาะในช่วง [begin, begin+length) เท่านั้น
     *
     * แต่ใน source ที่ให้มา loop คำนวณ sumWts วนตั้งแต่ i=0 ถึง weights.length
     * (ทั้งอาเรย์) โดยไม่สนใจ begin/length เลย ซึ่งขัดกับคำอธิบาย "specified portion"
     * ในเอกสาร -> เทสนี้ถูกออกแบบมาเพื่อดักจับ fault ดังกล่าวโดยตรง
     *
     * ค่าที่คาดหวัง (ถูกต้องตามสูตรบน subarray):
     *   values  = {1,2,3,4,5,100}
     *   weights = {1,1,1,1,1,1000}
     *   begin=0, length=5, mean=3.0 (คำนวณจาก {1,2,3,4,5})
     *   accum  = 10, accum2 = 0, sumWts(ถูกต้อง) = 5
     *   var(ถูกต้อง) = (10-0)/(5-1) = 2.5
     *
     * ถ้า source มี fault, sumWts จะถูกคำนวณจากทั้งอาเรย์ = 1005
     * -> var(ผิด) = 10/1004 ≈ 0.00996 ซึ่งไม่เท่ากับ 2.5
     */
    @Test
    public void testEvaluateWeightsMeanSubarrayDetectsSumWeightsFault() {
        Variance v = new Variance();
        double[] values = {1, 2, 3, 4, 5, 100};
        double[] weights = {1, 1, 1, 1, 1, 1000};
        double mean = 3.0;

        double result = v.evaluate(values, weights, mean, 0, 5);
        assertEquals(2.5, result, DELTA);
    }

    @Test
    public void testEvaluateWeightsBeginLengthWrapperAlsoAffectedByFault() {
        // ทดสอบ wrapper evaluate(values,weights,begin,length) ที่เรียกผ่าน
        // evaluate(values,weights,mean,begin,length) ภายใน - ควรได้รับผลกระทบจาก fault เดียวกัน
        Variance v = new Variance();
        double[] values = {1, 2, 3, 4, 5, 100};
        double[] weights = {1, 1, 1, 1, 1, 1000};

        double result = v.evaluate(values, weights, 0, 5);
        assertEquals(2.5, result, DELTA);
    }
}

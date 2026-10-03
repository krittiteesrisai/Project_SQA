package org.apache.commons.math3.distribution;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class DiscreteDistributionTest {

    private static final double EPSILON = 1e-10;

    /**
     * ทดสอบ Constructor กรณีปกติ และการ Normalize ผลรวมความน่าจะเป็นให้ได้ 1.0
     */
    @Test
    public void testConstructorAndGetSamples() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 2.0));
        samples.add(new Pair<String, Double>("B", 3.0));

        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);
        final List<Pair<String, Double>> resultSamples = distribution.getSamples();

        Assert.assertEquals(2, resultSamples.size());
        Assert.assertEquals("A", resultSamples.get(0).getKey());
        Assert.assertEquals(0.4, resultSamples.get(0).getValue(), EPSILON);
        Assert.assertEquals("B", resultSamples.get(1).getKey());
        Assert.assertEquals(0.6, resultSamples.get(1).getValue(), EPSILON);
    }

    /**
     * ทดสอบ Constructor เมื่อมีค่าความน่าจะเป็นติดลบ (< 0) -> NotPositiveException
     */
    @Test(expected = NotPositiveException.class)
    public void testConstructorNegativeProbability() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", -0.5));

        new DiscreteDistribution<String>(samples);
    }

    /**
     * ทดสอบ Constructor เมื่อผลรวมของความน่าจะเป็นทั้งหมดเป็น 0 -> MathArithmeticException
     */
    @Test(expected = MathArithmeticException.class)
    public void testConstructorAllZeroProbabilities() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.0));
        samples.add(new Pair<String, Double>("B", 0.0));

        new DiscreteDistribution<String>(samples);
    }

    /**
     * ทดสอบ Constructor เมื่อค่าความน่าจะเป็นเป็น Infinite -> MathIllegalArgumentException
     */
    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorInfiniteProbability() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", Double.POSITIVE_INFINITY));

        new DiscreteDistribution<String>(samples);
    }

    /**
     * ทดสอบ Constructor เมื่อค่าความน่าจะเป็นเป็น NaN -> MathIllegalArgumentException
     */
    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorNaNProbability() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", Double.NaN));

        new DiscreteDistribution<String>(samples);
    }

    /**
     * ทดสอบเมธอด probability(T x) ครอบคลุมทุกเงื่อนไข:
     * 1. x != null ตรงกับค่าใน Singletons
     * 2. x != null แต่ไม่ตรงกับค่าใดเลย
     * 3. x == null ตรงกับ Singleton ที่เป็น null
     * 4. x == null แต่ไม่มี Singleton ที่เป็น null
     * 5. ค่า Singleton ที่ซ้ำกันหลายตำแหน่ง (Probability Accumulation)
     */
    @Test
    public void testProbabilityBranches() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", 2.0));
        samples.add(new Pair<String, Double>(null, 3.0));
        samples.add(new Pair<String, Double>("A", 4.0)); // ซ้ำกับตัวแรก

        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        // ผลรวมทั้งหมด = 1 + 2 + 3 + 4 = 10
        // 'A' มี 2 ตัว: 1/10 + 4/10 = 0.5
        Assert.assertEquals(0.5, distribution.probability("A"), EPSILON);

        // 'B' มี 1 ตัว: 2/10 = 0.2
        Assert.assertEquals(0.2, distribution.probability("B"), EPSILON);

        // null มี 1 ตัว: 3/10 = 0.3
        Assert.assertEquals(0.3, distribution.probability(null), EPSILON);

        // 'C' ไม่มีอยู่ใน Distribution -> 0.0
        Assert.assertEquals(0.0, distribution.probability("C"), EPSILON);
    }

    /**
     * ทดสอบ probability(null) เมื่อไม่มี null อยู่ใน Singletons เลย
     */
    @Test
    public void testProbabilityNullWhenNoNullSingleton() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        samples.add(new Pair<String, Double>("B", 1.0));

        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);
        Assert.assertEquals(0.0, distribution.probability(null), EPSILON);
    }

    /**
     * ทดสอบการทำงานของ sample() และ reseedRandomGenerator()
     */
    @Test
    public void testSampleAndReseed() {
        final List<Pair<Integer, Double>> samples = new ArrayList<Pair<Integer, Double>>();
        samples.add(new Pair<Integer, Double>(1, 0.2));
        samples.add(new Pair<Integer, Double>(2, 0.8));

        final RandomGenerator rng = new Well19937c(42L);
        final DiscreteDistribution<Integer> distribution = new DiscreteDistribution<Integer>(rng, samples);

        final int sample1 = distribution.sample();
        final int sample2 = distribution.sample();

        // Reseed ด้วยค่าเดิม ต้องได้ผลลัพธ์การสุ่มเหมือนเดิม
        distribution.reseedRandomGenerator(42L);
        Assert.assertEquals(sample1, (int) distribution.sample());
        Assert.assertEquals(sample2, (int) distribution.sample());
    }

    /**
     * ทดสอบ sample(sampleSize) เมื่อ sampleSize <= 0 (Invalid state/Boundary: 0)
     */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleSizeZero() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        distribution.sample(0);
    }

    /**
     * ทดสอบ sample(sampleSize) เมื่อ sampleSize < 0 (Invalid state/Boundary: negative)
     */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleSizeNegative() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        distribution.sample(-5);
    }

    /**
     * ทดสอบ sample(sampleSize) กรณีปกติ
     */
    @Test
    public void testSampleSizeValid() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 1.0));
        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(samples);

        final String[] result = distribution.sample(5);
        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.length);
        for (String val : result) {
            Assert.assertEquals("A", val);
        }
    }

    /**
     * [Defects4J Math-8 Fault Demonstration]:
     * ทดสอบ sample(sampleSize) เมื่อประเภทข้อมูลเป็น Subtype ที่แตกต่างกันภายใต้ Supertype เดียวกัน
     * โค้ดที่ติดบั๊กจะสร้าง Array โดยอิงตาม singletons.get(0).getClass() (กลายเป็น Integer[])
     * เมื่อสุ่มได้ค่า Double จะโยน ArrayStoreException
     */
    @Test
    public void testSampleWithSubtypesDiscrepancy() {
        final List<Pair<Object, Double>> samples = new ArrayList<Pair<Object, Double>>();
        samples.add(new Pair<Object, Double>(Integer.valueOf(1), 0.5));
        samples.add(new Pair<Object, Double>(Double.valueOf(2.5), 0.5));

        final DiscreteDistribution<Object> distribution = new DiscreteDistribution<Object>(new Well19937c(12345L), samples);

        try {
            final Object[] result = distribution.sample(10);
            Assert.assertNotNull(result);
            Assert.assertEquals(10, result.length);
        } catch (ArrayStoreException e) {
            Assert.fail("ArrayStoreException caught: Math-8 bug detected in Array.newInstance with concrete subtype");
        }
    }

    /**
     * [Defects4J Math-8 Fault Demonstration]:
     * ทดสอบ sample(sampleSize) เมื่อ element ตัวแรกเป็น null
     * โค้ดที่ติดบั๊กจะเกิด NullPointerException เพราะพยายามเรียก singletons.get(0).getClass()
     */
    @Test
    public void testSampleWithNullFirstElement() {
        final List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>(null, 0.5));
        samples.add(new Pair<String, Double>("Valid", 0.5));

        final DiscreteDistribution<String> distribution = new DiscreteDistribution<String>(new Well19937c(12345L), samples);

        try {
            final String[] result = distribution.sample(2);
            Assert.assertNotNull(result);
            Assert.assertEquals(2, result.length);
        } catch (NullPointerException e) {
            Assert.fail("NullPointerException caught: singletons.get(0) is null when creating array");
        }
    }
}
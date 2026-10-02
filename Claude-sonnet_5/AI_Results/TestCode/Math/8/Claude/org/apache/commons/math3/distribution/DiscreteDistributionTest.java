package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.Pair;
import org.junit.Before;
import org.junit.Test;

public class DiscreteDistributionTest {

    /**
     * Stub RandomGenerator: ควบคุมค่า nextDouble() และ track การเรียก setSeed()
     * เพื่อทดสอบ branch ต่าง ๆ ของ sample() และ reseedRandomGenerator() แบบ deterministic
     */
    private static class StubRandomGenerator implements RandomGenerator {
        private double nextDoubleValue;
        private long lastSeedLong = Long.MIN_VALUE;
        private boolean setSeedCalled = false;

        StubRandomGenerator(double nextDoubleValue) {
            this.nextDoubleValue = nextDoubleValue;
        }

        @Override
        public void setSeed(int seed) {
            setSeedCalled = true;
        }

        @Override
        public void setSeed(int[] seed) {
            setSeedCalled = true;
        }

        @Override
        public void setSeed(long seed) {
            setSeedCalled = true;
            lastSeedLong = seed;
        }

        @Override
        public void nextBytes(byte[] bytes) {
        }

        @Override
        public int nextInt() {
            return 0;
        }

        @Override
        public int nextInt(int n) {
            return 0;
        }

        @Override
        public long nextLong() {
            return 0;
        }

        @Override
        public boolean nextBoolean() {
            return false;
        }

        @Override
        public float nextFloat() {
            return 0;
        }

        @Override
        public double nextDouble() {
            return nextDoubleValue;
        }

        @Override
        public double nextGaussian() {
            return 0;
        }
    }

    private List<Pair<String, Double>> validSamples;

    @Before
    public void setUp() {
        validSamples = new ArrayList<Pair<String, Double>>();
        validSamples.add(new Pair<String, Double>("A", 1.0));
        validSamples.add(new Pair<String, Double>("B", 1.0));
        validSamples.add(new Pair<String, Double>("C", 2.0));
        // normalized: A=0.25, B=0.25, C=0.5
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructorDefaultRandomGeneratorValidSamples() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        assertEquals(0.25, dist.probability("A"), 1e-9);
        assertEquals(0.25, dist.probability("B"), 1e-9);
        assertEquals(0.5, dist.probability("C"), 1e-9);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorNegativeProbabilityThrowsNotPositiveException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", -1.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorAllZeroProbabilitiesThrowsMathArithmeticException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", 0.0));
        samples.add(new Pair<String, Double>("B", 0.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorInfiniteProbabilityThrowsMathIllegalArgumentException() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>("A", Double.POSITIVE_INFINITY));
        samples.add(new Pair<String, Double>("B", 1.0));
        new DiscreteDistribution<String>(samples);
    }

    @Test
    public void testConstructorWithCustomRandomGenerator() {
        StubRandomGenerator rng = new StubRandomGenerator(0.1);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        assertEquals("A", dist.sample());
    }

    // ---------- reseedRandomGenerator ----------

    @Test
    public void testReseedRandomGeneratorCallsSetSeed() {
        StubRandomGenerator rng = new StubRandomGenerator(0.0);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        dist.reseedRandomGenerator(12345L);
        assertTrue(rng.setSeedCalled);
        assertEquals(12345L, rng.lastSeedLong);
    }

    // ---------- probability(x) ----------

    @Test
    public void testProbabilityMatchingSingleton() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        assertEquals(0.5, dist.probability("C"), 1e-9);
    }

    @Test
    public void testProbabilityNonMatchingSingleton() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        assertEquals(0.0, dist.probability("Z"), 1e-9);
    }

    @Test
    public void testProbabilityNullMatchesNullSingleton() {
        List<Pair<String, Double>> samples = new ArrayList<Pair<String, Double>>();
        samples.add(new Pair<String, Double>(null, 1.0));
        samples.add(new Pair<String, Double>("B", 1.0));
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(samples);
        assertEquals(0.5, dist.probability(null), 1e-9);
    }

    @Test
    public void testProbabilityNullNoMatch() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        assertEquals(0.0, dist.probability(null), 1e-9);
    }

    // ---------- getSamples() ----------

    @Test
    public void testGetSamplesReturnsNormalizedProbabilities() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        List<Pair<String, Double>> samples = dist.getSamples();
        assertEquals(3, samples.size());
        assertEquals("A", samples.get(0).getKey());
        assertEquals(0.25, samples.get(0).getValue(), 1e-9);
        assertEquals("B", samples.get(1).getKey());
        assertEquals(0.25, samples.get(1).getValue(), 1e-9);
        assertEquals("C", samples.get(2).getKey());
        assertEquals(0.5, samples.get(2).getValue(), 1e-9);
    }

    // ---------- sample() ----------

    @Test
    public void testSampleReturnsFirstElementWhenRandomValueSmall() {
        // cumulative: A=0.25 -> randomValue=0.1 < 0.25 -> match on i=0 (loop exits early)
        StubRandomGenerator rng = new StubRandomGenerator(0.1);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        assertEquals("A", dist.sample());
    }

    @Test
    public void testSampleReturnsSecondElementWhenRandomValueMid() {
        // cumulative: A=0.25, B=0.5 -> randomValue=0.3 falls on i=1
        StubRandomGenerator rng = new StubRandomGenerator(0.3);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        assertEquals("B", dist.sample());
    }

    @Test
    public void testSampleReturnsLastElementWhenRandomValueHigh() {
        // cumulative: A=0.25, B=0.5, C=1.0 -> randomValue=0.9 falls on i=2 (last normal iteration)
        StubRandomGenerator rng = new StubRandomGenerator(0.9);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        assertEquals("C", dist.sample());
    }

    @Test
    public void testSampleFallbackWhenRandomValueEqualsOne() {
        // randomValue == 1.0: "randomValue < sum" ไม่เป็นจริงสำหรับ cumulative ใด ๆ เลย
        // (max cumulative sum = 1.0, 1.0 < 1.0 เป็น false) -> ต้องตกไปใช้ fallback return
        StubRandomGenerator rng = new StubRandomGenerator(1.0);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        assertEquals("C", dist.sample());
    }

    // ---------- sample(int) ----------

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleIntThrowsForZeroSampleSize() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        dist.sample(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleIntThrowsForNegativeSampleSize() {
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(validSamples);
        dist.sample(-5);
    }

    @Test
    public void testSampleIntReturnsArrayOfRequestedSize() {
        StubRandomGenerator rng = new StubRandomGenerator(0.1);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        String[] result = dist.sample(5);
        assertEquals(5, result.length);
        for (String s : result) {
            assertEquals("A", s);
        }
    }

    @Test
    public void testSampleIntSizeOne() {
        StubRandomGenerator rng = new StubRandomGenerator(0.9);
        DiscreteDistribution<String> dist = new DiscreteDistribution<String>(rng, validSamples);
        String[] result = dist.sample(1);
        assertEquals(1, result.length);
        assertEquals("C", result[0]);
    }
}

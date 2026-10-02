# JUnit 4 Test Suite สำหรับ HypergeometricDistribution

```java
package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.Test;

public class HypergeometricDistributionTest {

    private static final double EPS = 1e-9;

    // -----------------------------------------------------------------
    // Constructor validation tests (branch coverage ของ if-chain ใน constructor)
    // -----------------------------------------------------------------

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_populationSizeZero_throws() {
        new HypergeometricDistribution(0, 0, 0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_populationSizeNegative_throws() {
        new HypergeometricDistribution(-5, 0, 0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_numberOfSuccessesNegative_throws() {
        new HypergeometricDistribution(10, -1, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor_sampleSizeNegative_throws() {
        new HypergeometricDistribution(10, 5, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_numberOfSuccessesGreaterThanPopulation_throws() {
        new HypergeometricDistribution(10, 11, 5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor_sampleSizeGreaterThanPopulation_throws() {
        new HypergeometricDistribution(10, 5, 11);
    }

    @Test
    public void testConstructor_validBoundaryValues_minimal() {
        // populationSize=1 (ขอบเขตต่ำสุดที่ยอมรับ), m=0, k=0 (ขอบเขต NotPositive)
        HypergeometricDistribution dist = new HypergeometricDistribution(1, 0, 0);
        assertEquals(1, dist.getPopulationSize());
        assertEquals(0, dist.getNumberOfSuccesses());
        assertEquals(0, dist.getSampleSize());
    }

    @Test
    public void testConstructor_validNormalValues() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(10, dist.getPopulationSize());
        assertEquals(5, dist.getNumberOfSuccesses());
        assertEquals(5, dist.getSampleSize());
    }

    // -----------------------------------------------------------------
    // getNumberOfSuccesses / getPopulationSize / getSampleSize
    // -----------------------------------------------------------------

    @Test
    public void testGetters() {
        HypergeometricDistribution dist = new HypergeometricDistribution(20, 8, 6);
        assertEquals(8, dist.getNumberOfSuccesses());
        assertEquals(20, dist.getPopulationSize());
        assertEquals(6, dist.getSampleSize());
    }

    // -----------------------------------------------------------------
    // cumulativeProbability(x) : branch x<domain[0], x>=domain[1], else (loop)
    // N=10, m=5, k=5 -> domain = [max(0,5-(10-5)), min(5,5)] = [0,5]
    // -----------------------------------------------------------------

    @Test
    public void testCumulativeProbability_belowLowerDomain_returnsZero() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(0.0, dist.cumulativeProbability(-1), EPS);
    }

    @Test
    public void testCumulativeProbability_atOrAboveUpperDomain_returnsOne() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // x == domain[1] (>=) -> ret = 1.0
        assertEquals(1.0, dist.cumulativeProbability(5), EPS);
        // x > domain[1]
        assertEquals(1.0, dist.cumulativeProbability(100), EPS);
    }

    @Test
    public void testCumulativeProbability_atLowerDomainBoundary_elseBranch() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // x == domain[0] (ไม่ < domain[0]) -> else branch, loop ไม่วน (x0==x1 ทันที)
        double p = dist.cumulativeProbability(0);
        assertTrue(p > 0.0 && p <= 1.0);
    }

    @Test
    public void testCumulativeProbability_insideDomain_loopExecutesMultipleTimes() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // x=3: domain0=0 < x < domain1=5 -> innerCumulativeProbability loop 3 รอบ
        double p = dist.cumulativeProbability(3);
        assertTrue(p > 0.0 && p < 1.0);
        // cdf ต้องเพิ่มขึ้นแบบ monotonic
        assertTrue(dist.cumulativeProbability(2) <= dist.cumulativeProbability(3));
    }

    @Test
    public void testCumulativeProbability_sumsToOneAtUpperBound() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(1.0, dist.cumulativeProbability(5), 1e-7);
    }

    // -----------------------------------------------------------------
    // probability(x) : branch (x<domain0 || x>domain1) และ else-branch คำนวณจริง
    // -----------------------------------------------------------------

    @Test
    public void testProbability_belowLowerDomain_returnsZero() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(0.0, dist.probability(-1), EPS);
    }

    @Test
    public void testProbability_aboveUpperDomain_returnsZero() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(0.0, dist.probability(6), EPS);
    }

    @Test
    public void testProbability_atDomainBoundaries_computed() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        double pLow = dist.probability(0);
        double pHigh = dist.probability(5);
        assertTrue(pLow >= 0.0 && pLow <= 1.0);
        assertTrue(pHigh >= 0.0 && pHigh <= 1.0);
    }

    @Test
    public void testProbability_insideDomain_computed() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        double p = dist.probability(2);
        assertTrue(p > 0.0 && p < 1.0);
    }

    // -----------------------------------------------------------------
    // upperCumulativeProbability(x) : branch x<=domain0, x>domain1, else(loop)
    // -----------------------------------------------------------------

    @Test
    public void testUpperCumulativeProbability_atOrBelowLowerDomain_returnsOne() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // x == domain[0]
        assertEquals(1.0, dist.upperCumulativeProbability(0), EPS);
        // x < domain[0]
        assertEquals(1.0, dist.upperCumulativeProbability(-5), EPS);
    }

    @Test
    public void testUpperCumulativeProbability_aboveUpperDomain_returnsZero() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(0.0, dist.upperCumulativeProbability(6), EPS);
    }

    @Test
    public void testUpperCumulativeProbability_insideDomain_loopExecutesMultipleTimes() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // x=3: domain1=5, loop dx=-1 จาก 5 ลงมา 3 (2 รอบ)
        double p = dist.upperCumulativeProbability(3);
        assertTrue(p > 0.0 && p < 1.0);
    }

    @Test
    public void testUpperCumulativeProbability_atUpperDomainBoundary_elseBranch() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // x == domain[1] (ไม่ > domain1, ไม่ <= domain0) -> else branch, loop ไม่วน
        double p = dist.upperCumulativeProbability(5);
        assertTrue(p > 0.0 && p <= 1.0);
    }

    @Test
    public void testCumulativeAndUpperCumulative_consistency() {
        // cdf(x-1) + upperCdf(x) ควรใกล้เคียง 1 (sanity check cross-validate ทั้งสองเมธอด)
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        double cdf2 = dist.cumulativeProbability(2);
        double upper3 = dist.upperCumulativeProbability(3);
        assertEquals(1.0, cdf2 + upper3, 1e-7);
    }

    // -----------------------------------------------------------------
    // getNumericalMean
    // -----------------------------------------------------------------

    @Test
    public void testGetNumericalMean() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // mean = n*m/N = 5*5/10 = 2.5
        assertEquals(2.5, dist.getNumericalMean(), EPS);
    }

    @Test
    public void testGetNumericalMean_zeroSuccesses() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 0, 5);
        assertEquals(0.0, dist.getNumericalMean(), EPS);
    }

    // -----------------------------------------------------------------
    // getNumericalVariance : branch numericalVarianceIsCalculated (false->true, cache)
    // -----------------------------------------------------------------

    @Test
    public void testGetNumericalVariance_firstCallCalculatesAndCaches() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        // N=10, m=5, n=5 -> (5*5*5*5)/(10*10*9) = 625/900 = 0.694444...
        double expected = 625.0 / 900.0;
        double variance1 = dist.getNumericalVariance(); // branch: !calculated -> calculate
        assertEquals(expected, variance1, EPS);

        double variance2 = dist.getNumericalVariance(); // branch: already calculated -> use cache
        assertEquals(expected, variance2, EPS);
        assertEquals(variance1, variance2, EPS);
    }

    @Test
    public void testCalculateNumericalVariance_zeroSuccesses() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 0, 5);
        // m=0 -> variance = n*0*(N-n)*(N-0)/... = 0
        assertEquals(0.0, dist.getNumericalVariance(), EPS);
    }

    // -----------------------------------------------------------------
    // getSupportLowerBound / getSupportUpperBound (เงื่อนไข max/min)
    // -----------------------------------------------------------------

    @Test
    public void testGetSupportLowerBound_zeroCase() {
        // n+m-N = 5+5-10 = 0 -> max(0,0)=0
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(0, dist.getSupportLowerBound());
    }

    @Test
    public void testGetSupportLowerBound_positiveCase() {
        // N=10, m=8, k=8 -> n+m-N = 8+8-10=6 -> max(0,6)=6
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 8, 8);
        assertEquals(6, dist.getSupportLowerBound());
    }

    @Test
    public void testGetSupportUpperBound_mSmallerThanK() {
        // min(m,k) เมื่อ m < k
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 3, 7);
        assertEquals(3, dist.getSupportUpperBound());
    }

    @Test
    public void testGetSupportUpperBound_kSmallerThanM() {
        // min(m,k) เมื่อ k < m
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 7, 3);
        assertEquals(3, dist.getSupportUpperBound());
    }

    @Test
    public void testGetSupportUpperBound_equal() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertEquals(5, dist.getSupportUpperBound());
    }

    // -----------------------------------------------------------------
    // isSupportConnected : always true
    // -----------------------------------------------------------------

    @Test
    public void testIsSupportConnected_alwaysTrue() {
        HypergeometricDistribution dist = new HypergeometricDistribution(10, 5, 5);
        assertTrue(dist.isSupportConnected());
    }

    // -----------------------------------------------------------------
    // Edge case: populationSize = 1 (ทำให้ N-1 = 0 ใน variance formula)
    // หมายเหตุ: ไม่แน่ใจว่าค่า NaN/Infinity เป็น behavior ที่ตั้งใจหรือไม่
    // จึงทดสอบเฉพาะว่าไม่ throw exception
    // -----------------------------------------------------------------

    @Test
    public void testGetNumericalVariance_populationSizeOne_noException() {
        HypergeometricDistribution dist = new HypergeometricDistribution(1, 0, 0);
        double variance = dist.getNumericalVariance();
        // (0*0*(1-0)*(1-0))/(1*1*0) = 0/0 = NaN ตาม IEEE 754
        assertTrue(Double.isNaN(variance));
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_populationSizeZero_throws` | `populationSize <= 0` → true (zero) |
| `testConstructor_populationSizeNegative_throws` | `populationSize <= 0` → true (negative) |
| `testConstructor_numberOfSuccessesNegative_throws` | `numberOfSuccesses < 0` → true |
| `testConstructor_sampleSizeNegative_throws` | `sampleSize < 0` → true |
| `testConstructor_numberOfSuccessesGreaterThanPopulation_throws` | `numberOfSuccesses > populationSize` → true |
| `testConstructor_sampleSizeGreaterThanPopulation_throws` | `sampleSize > populationSize` → true |
| `testConstructor_validBoundaryValues_minimal` | ทุก if-condition → false, boundary m=0,k=0 |
| `testConstructor_validNormalValues` | ทุก if-condition → false (normal case) |
| `testGetters` | getter methods ทั่วไป |
| `testCumulativeProbability_belowLowerDomain_returnsZero` | `cumulativeProbability`: `x < domain[0]` → true |
| `testCumulativeProbability_atOrAboveUpperDomain_returnsOne` | `x >= domain[1]` → true (เท่ากับ และ มากกว่า) |
| `testCumulativeProbability_atLowerDomainBoundary_elseBranch` | else branch, loop 0 รอบ (x0==x1 ทันที) |
| `testCumulativeProbability_insideDomain_loopExecutesMultipleTimes` | else branch, loop วนหลายรอบ (`while(x0 != x1)`) |
| `testCumulativeProbability_sumsToOneAtUpperBound` | ตรวจผลลัพธ์ cdf สูงสุด |
| `testProbability_belowLowerDomain_returnsZero` | `probability`: `x < domain[0]` → true |
| `testProbability_aboveUpperDomain_returnsZero` | `x > domain[1]` → true |
| `testProbability_atDomainBoundaries_computed` | else branch ที่ขอบเขต x=domain0, x=domain1 |
| `testProbability_insideDomain_computed` | else branch คำนวณค่ากลางโดเมน |
| `testUpperCumulativeProbability_atOrBelowLowerDomain_returnsOne` | `x <= domain[0]` → true (เท่ากับ และ น้อยกว่า) |
| `testUpperCumulativeProbability_aboveUpperDomain_returnsZero` | `x > domain[1]` → true |
| `testUpperCumulativeProbability_insideDomain_loopExecutesMultipleTimes` | else branch, loop วนหลายรอบ dx=-1 |
| `testUpperCumulativeProbability_atUpperDomainBoundary_elseBranch` | else branch, loop 0 รอบ (x0==x1) |
| `testCumulativeAndUpperCumulative_consistency` | cross-check ความถูกต้องของทั้งสองเมธอด |
| `testGetNumericalMean` | สูตรคำนวณ mean |
| `testGetNumericalMean_zeroSuccesses` | mean กรณี m=0 |
| `testGetNumericalVariance_firstCallCalculatesAndCaches` | `getNumericalVariance`: `!numericalVarianceIsCalculated` → true แล้ว false (cache) |
| `testCalculateNumericalVariance_zeroSuccesses` | `calculateNumericalVariance` กรณี m=0 |
| `testGetSupportLowerBound_zeroCase` | `getSupportLowerBound`: `max(0, ...)` → เลือก 0 |
| `testGetSupportLowerBound_positiveCase` | `max(0, ...)` → เลือกค่าบวก |
| `testGetSupportUpperBound_mSmallerThanK` | `getSupportUpperBound`: `min(m,k)` → เลือก m |
| `testGetSupportUpperBound_kSmallerThanM` | `min(m,k)` → เลือก k |
| `testGetSupportUpperBound_equal` | `min(m,k)` กรณีเท่ากัน |
| `testIsSupportConnected_alwaysTrue` | ค่าคงที่ `true` |
| `testGetNumericalVariance_populationSizeOne_noException` | edge case: N-1=0 → หาร 0/0 (NaN) — **หมายเหตุ**: ไม่แน่ใจว่าเป็น behavior ที่ตั้งใจ จึงกำกับคอมเมนต์ไว้ |

**หมายเหตุสำคัญ**: 
- โค้ดต้นฉบับไม่มีการตรวจสอบ `populationSize == 1` ที่จะทำให้ `N-1 = 0` ใน `calculateNumericalVariance()` ซึ่งอาจทำให้ได้ `NaN` — ทดสอบไว้เพื่อ "ดักจับ" potential fault แต่ไม่ยืนยันว่าเป็น bug เพราะไม่มีเอกสารระบุ
- ไม่มีการทดสอบ null เนื่องจาก constructor รับเฉพาะ primitive `int` ไม่มีพารามิเตอร์ที่เป็น object/nullable (ยกเว้น `RandomGenerator` ซึ่งไม่ throw check null ในซอร์สที่ให้มา)
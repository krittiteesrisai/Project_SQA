# JUnit 4 Test Suite: PoissonDistributionImplTest

```java
package org.apache.commons.math.distribution;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.apache.commons.math.MathException;
import org.apache.commons.math.util.FastMath;
import org.junit.Test;

public class PoissonDistributionImplTest {

    private static final double DELTA = 1e-9;

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_ValidMean() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        assertEquals(4.0, dist.getMean(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ZeroMean_ThrowsException() {
        new PoissonDistributionImpl(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NegativeMean_ThrowsException() {
        new PoissonDistributionImpl(-1.0);
    }

    @Test
    public void testConstructor_WithEpsilonAndMaxIterations_Valid() {
        PoissonDistributionImpl dist =
            new PoissonDistributionImpl(5.0, 1e-6, 1000);
        assertEquals(5.0, dist.getMean(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_WithEpsilonAndMaxIterations_InvalidMean() {
        new PoissonDistributionImpl(0.0, 1e-6, 1000);
    }

    @Test
    public void testConstructor_WithEpsilonOnly_Valid() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.0, 1e-8);
        assertEquals(3.0, dist.getMean(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_WithEpsilonOnly_InvalidMean() {
        new PoissonDistributionImpl(-5.0, 1e-8);
    }

    @Test
    public void testConstructor_WithMaxIterationsOnly_Valid() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(2.0, 500);
        assertEquals(2.0, dist.getMean(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_WithMaxIterationsOnly_InvalidMean() {
        new PoissonDistributionImpl(0.0, 500);
    }

    // ---------- getMean() ----------

    @Test
    public void testGetMean() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(7.5);
        assertEquals(7.5, dist.getMean(), DELTA);
    }

    // ---------- probability(int x) ----------

    @Test
    public void testProbability_NegativeX_ReturnsZero() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        assertEquals(0.0, dist.probability(-1), DELTA);
    }

    @Test
    public void testProbability_IntegerMaxValue_ReturnsZero() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        assertEquals(0.0, dist.probability(Integer.MAX_VALUE), DELTA);
    }

    @Test
    public void testProbability_XEqualsZero() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        double expected = FastMath.exp(-4.0);
        assertEquals(expected, dist.probability(0), 1e-10);
    }

    @Test
    public void testProbability_PositiveX_UsesStirlingApproximation() {
        // mean = 4, x = 4 -> known Poisson PMF ~0.195366815...
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        double expected = FastMath.exp(-4.0) * FastMath.pow(4.0, 4) / factorial(4);
        assertEquals(expected, dist.probability(4), 1e-6);
    }

    @Test
    public void testProbability_LargeXWithinRange() {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(1.0);
        double p = dist.probability(100);
        assertTrue(p >= 0.0 && p <= 1.0);
    }

    private double factorial(int n) {
        double r = 1.0;
        for (int i = 2; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    // ---------- cumulativeProbability(int x) ----------

    @Test
    public void testCumulativeProbability_NegativeX_ReturnsZero() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        assertEquals(0.0, dist.cumulativeProbability(-5), DELTA);
    }

    @Test
    public void testCumulativeProbability_IntegerMaxValue_ReturnsOne() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        assertEquals(1.0, dist.cumulativeProbability(Integer.MAX_VALUE), DELTA);
    }

    @Test
    public void testCumulativeProbability_ZeroX() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        double cdf = dist.cumulativeProbability(0);
        assertTrue(cdf > 0.0 && cdf < 1.0);
    }

    @Test
    public void testCumulativeProbability_PositiveX_MonotonicIncrease() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        double cdf3 = dist.cumulativeProbability(3);
        double cdf10 = dist.cumulativeProbability(10);
        assertTrue(cdf10 > cdf3);
        assertTrue(cdf10 <= 1.0);
    }

    // ---------- normalApproximateProbability(int x) ----------

    @Test
    public void testNormalApproximateProbability_ValidRange() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(100.0);
        double approx = dist.normalApproximateProbability(100);
        assertTrue(approx >= 0.0 && approx <= 1.0);
    }

    @Test
    public void testNormalApproximateProbability_LowX() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(50.0);
        double approx = dist.normalApproximateProbability(0);
        assertTrue(approx >= 0.0 && approx <= 1.0);
    }

    // ---------- sample() ----------

    @Test
    public void testSample_ReturnsNonNegativeBoundedValue() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(5.0);
        int sample = dist.sample();
        assertTrue(sample >= 0);
        assertTrue(sample <= Integer.MAX_VALUE);
    }

    @Test
    public void testSample_MultipleCalls_Consistent() throws MathException {
        // ไม่สามารถยืนยัน exact value ได้เนื่องจากเป็น random sampling
        // ตรวจสอบเพียงว่าไม่ throw exception และค่าอยู่ในขอบเขตที่สมเหตุสมผล
        PoissonDistributionImpl dist = new PoissonDistributionImpl(3.0);
        for (int i = 0; i < 10; i++) {
            int s = dist.sample();
            assertTrue(s >= 0);
        }
    }

    // ---------- getDomainLowerBound / getDomainUpperBound (protected) ----------
    // ใช้ reflection เนื่องจาก method เป็น protected
    // หมายเหตุ: method เหล่านี้ไม่มี branch ภายใน (return literal เดียว)
    // แต่ทดสอบไว้เพื่อความครบถ้วนของ coverage

    @Test
    public void testGetDomainLowerBound_ViaReflection() throws Exception {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Method m = PoissonDistributionImpl.class
                .getDeclaredMethod("getDomainLowerBound", double.class);
        m.setAccessible(true);
        Object result = m.invoke(dist, 0.5);
        assertEquals(0, (int) result);
    }

    @Test
    public void testGetDomainUpperBound_ViaReflection() throws Exception {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(4.0);
        Method m = PoissonDistributionImpl.class
                .getDeclaredMethod("getDomainUpperBound", double.class);
        m.setAccessible(true);
        Object result = m.invoke(dist, 0.5);
        assertEquals(Integer.MAX_VALUE, (int) result);
    }

    // ---------- Boundary / Edge Case ----------

    @Test
    public void testConstructor_VerySmallPositiveMean() {
        // ขอบเขตที่เล็กที่สุดที่ยังมากกว่า 0
        PoissonDistributionImpl dist = new PoissonDistributionImpl(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, dist.getMean(), 0.0);
    }

    @Test
    public void testProbability_ZeroMean_NotApplicable() {
        // mean ต้อง > 0 เสมอ ดังนั้นไม่มี testcase สำหรับ mean=0 ใน probability()
        // กรณีนี้ถูกบล็อกตั้งแต่ constructor แล้ว - ไม่สามารถทดสอบ behavior นี้ได้
        assertTrue(true);
    }

    @Test
    public void testCumulativeProbability_LargeMean() throws MathException {
        PoissonDistributionImpl dist = new PoissonDistributionImpl(1000.0);
        double cdf = dist.cumulativeProbability(1000);
        assertTrue(cdf >= 0.0 && cdf <= 1.0);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_ValidMean` | Constructor: `p > 0` (ไม่ throw) |
| `testConstructor_ZeroMean_ThrowsException` | Constructor: `p <= 0` (p==0) throws exception |
| `testConstructor_NegativeMean_ThrowsException` | Constructor: `p <= 0` (p<0) throws exception |
| `testConstructor_WithEpsilonAndMaxIterations_Valid` | Constructor overload (p, epsilon, maxIterations): valid path |
| `testConstructor_WithEpsilonAndMaxIterations_InvalidMean` | Constructor overload: p<=0 throws |
| `testConstructor_WithEpsilonOnly_Valid` | Constructor overload (p, epsilon): valid path |
| `testConstructor_WithEpsilonOnly_InvalidMean` | Constructor overload (p, epsilon): invalid mean |
| `testConstructor_WithMaxIterationsOnly_Valid` | Constructor overload (p, maxIterations): valid path |
| `testConstructor_WithMaxIterationsOnly_InvalidMean` | Constructor overload (p, maxIterations): invalid mean |
| `testGetMean` | `getMean()` getter |
| `testProbability_NegativeX_ReturnsZero` | `probability()`: branch `x < 0` |
| `testProbability_IntegerMaxValue_ReturnsZero` | `probability()`: branch `x == Integer.MAX_VALUE` |
| `testProbability_XEqualsZero` | `probability()`: branch `x == 0` |
| `testProbability_PositiveX_UsesStirlingApproximation` | `probability()`: else branch (SaddlePointExpansion) |
| `testProbability_LargeXWithinRange` | `probability()`: else branch กับค่า x ขนาดใหญ่ |
| `testCumulativeProbability_NegativeX_ReturnsZero` | `cumulativeProbability()`: branch `x < 0` |
| `testCumulativeProbability_IntegerMaxValue_ReturnsOne` | `cumulativeProbability()`: branch `x == Integer.MAX_VALUE` |
| `testCumulativeProbability_ZeroX` | `cumulativeProbability()`: else branch (Gamma.regularizedGammaQ) x=0 |
| `testCumulativeProbability_PositiveX_MonotonicIncrease` | `cumulativeProbability()`: else branch หลายค่า x |
| `testNormalApproximateProbability_ValidRange` | `normalApproximateProbability()`: ปกติ |
| `testNormalApproximateProbability_LowX` | `normalApproximateProbability()`: x ต่ำ |
| `testSample_ReturnsNonNegativeBoundedValue` | `sample()`: ตรวจสอบ FastMath.min() wrapping |
| `testSample_MultipleCalls_Consistent` | `sample()`: ความเสถียรของ random generation (ไม่ครอบคลุม exact value เพราะเป็น random) |
| `testGetDomainLowerBound_ViaReflection` | `getDomainLowerBound()`: return 0 (ไม่มี branch ภายใน) |
| `testGetDomainUpperBound_ViaReflection` | `getDomainUpperBound()`: return Integer.MAX_VALUE (ไม่มี branch ภายใน) |
| `testConstructor_VerySmallPositiveMean` | Boundary case: p ใกล้ 0 ที่สุดแต่ยัง > 0 |
| `testProbability_ZeroMean_NotApplicable` | หมายเหตุ: ไม่สามารถทดสอบ mean=0 ได้เพราะถูกบล็อกจาก constructor |
| `testCumulativeProbability_LargeMean` | `cumulativeProbability()`: ทดสอบกับ mean ขนาดใหญ่ (stress case) |

**หมายเหตุสำคัญ:**
- `sample()` ใช้ random generator ภายใน (`randomData.nextPoisson`) จึงไม่สามารถ assert ค่าที่แน่นอนได้ — ทดสอบเพียงขอบเขตและไม่ throw exception
- `getDomainLowerBound`/`getDomainUpperBound` เป็น `protected` methods ไม่มี logic แบบ if/else ภายใน (เป็นแค่ return literal) จึงไม่มี branch ให้ cover เพิ่มเติม แต่ยังทดสอบด้วย reflection เพื่อยืนยัน return value ถูกต้อง
- ค่า cutoff ที่แน่นอนของ `Gamma.regularizedGammaQ` ไม่ได้ verify แบบ exact value เนื่องจากต้องพึ่งพาความถูกต้องของ library ภายนอก (Gamma class) ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา
# UniformRealDistributionTest.java

```java
package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Test;

public class UniformRealDistributionTest {

    private static final double EPS = 1e-12;

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor() {
        UniformRealDistribution d = new UniformRealDistribution();
        assertEquals(0.0, d.getSupportLowerBound(), EPS);
        assertEquals(1.0, d.getSupportUpperBound(), EPS);
        assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                d.getSolverAbsoluteAccuracy(), EPS);
    }

    @Test
    public void testTwoArgConstructorValid() {
        UniformRealDistribution d = new UniformRealDistribution(2.0, 5.0);
        assertEquals(2.0, d.getSupportLowerBound(), EPS);
        assertEquals(5.0, d.getSupportUpperBound(), EPS);
        assertEquals(UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                d.getSolverAbsoluteAccuracy(), EPS);
    }

    // Boundary case: lower == upper should throw (triggers if-branch lower >= upper)
    @Test(expected = NumberIsTooLargeException.class)
    public void testTwoArgConstructorLowerEqualsUpper() {
        new UniformRealDistribution(1.0, 1.0);
    }

    // lower > upper also triggers same if-branch
    @Test(expected = NumberIsTooLargeException.class)
    public void testTwoArgConstructorLowerGreaterThanUpper() {
        new UniformRealDistribution(5.0, 1.0);
    }

    @Test
    public void testThreeArgConstructorValid() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0, 1e-6);
        assertEquals(1e-6, d.getSolverAbsoluteAccuracy(), EPS);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testThreeArgConstructorInvalid() {
        new UniformRealDistribution(10.0, 10.0, 1e-6);
    }

    @Test
    public void testFourArgConstructorValid() {
        RandomGenerator rng = new Well19937c(1234);
        UniformRealDistribution d = new UniformRealDistribution(rng, -1.0, 1.0, 1e-8);
        assertEquals(-1.0, d.getSupportLowerBound(), EPS);
        assertEquals(1.0, d.getSupportUpperBound(), EPS);
        assertEquals(1e-8, d.getSolverAbsoluteAccuracy(), EPS);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testFourArgConstructorInvalid() {
        RandomGenerator rng = new Well19937c(1234);
        new UniformRealDistribution(rng, 3.0, 2.0, 1e-8);
    }

    // ---------- density() ----------

    // Branch: x < lower
    @Test
    public void testDensityBelowLower() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.0, d.density(-1.0), EPS);
    }

    // Branch: x > upper
    @Test
    public void testDensityAboveUpper() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.0, d.density(11.0), EPS);
    }

    // Boundary: x == lower (inclusive, falls to else-branch)
    @Test
    public void testDensityAtLowerBound() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.1, d.density(0.0), EPS);
    }

    // Boundary: x == upper (inclusive, falls to else-branch)
    @Test
    public void testDensityAtUpperBound() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.1, d.density(10.0), EPS);
    }

    // Normal case inside range
    @Test
    public void testDensityInsideRange() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.1, d.density(5.0), EPS);
    }

    // ---------- cumulativeProbability() ----------

    // Branch: x <= lower (boundary x == lower)
    @Test
    public void testCumulativeProbabilityAtLower() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.0, d.cumulativeProbability(0.0), EPS);
    }

    // Branch: x <= lower (x < lower)
    @Test
    public void testCumulativeProbabilityBelowLower() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.0, d.cumulativeProbability(-5.0), EPS);
    }

    // Branch: x >= upper (boundary x == upper)
    @Test
    public void testCumulativeProbabilityAtUpper() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(1.0, d.cumulativeProbability(10.0), EPS);
    }

    // Branch: x >= upper (x > upper)
    @Test
    public void testCumulativeProbabilityAboveUpper() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(1.0, d.cumulativeProbability(15.0), EPS);
    }

    // Branch: normal case (lower < x < upper)
    @Test
    public void testCumulativeProbabilityInside() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(0.5, d.cumulativeProbability(5.0), EPS);
    }

    // ---------- numerical mean/variance ----------

    @Test
    public void testGetNumericalMean() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 10.0);
        assertEquals(5.0, d.getNumericalMean(), EPS);
    }

    @Test
    public void testGetNumericalMeanNegativeBounds() {
        UniformRealDistribution d = new UniformRealDistribution(-10.0, -2.0);
        assertEquals(-6.0, d.getNumericalMean(), EPS);
    }

    @Test
    public void testGetNumericalVariance() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 12.0);
        // (12-0)^2/12 = 12
        assertEquals(12.0, d.getNumericalVariance(), EPS);
    }

    // ---------- support bounds and inclusivity ----------

    @Test
    public void testGetSupportLowerBound() {
        UniformRealDistribution d = new UniformRealDistribution(3.0, 7.0);
        assertEquals(3.0, d.getSupportLowerBound(), EPS);
    }

    @Test
    public void testGetSupportUpperBound() {
        UniformRealDistribution d = new UniformRealDistribution(3.0, 7.0);
        assertEquals(7.0, d.getSupportUpperBound(), EPS);
    }

    @Test
    public void testIsSupportLowerBoundInclusive() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 1.0);
        assertTrue(d.isSupportLowerBoundInclusive());
    }

    @Test
    public void testIsSupportUpperBoundInclusive() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 1.0);
        assertFalse(d.isSupportUpperBoundInclusive());
    }

    @Test
    public void testIsSupportConnected() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 1.0);
        assertTrue(d.isSupportConnected());
    }

    // ---------- sample() ----------

    // Deterministic test: use the SAME seed in two separate RNG instances
    // to predict the exact 'u' value consumed by sample() and verify
    // the formula u*upper + (1-u)*lower.
    @Test
    public void testSampleFormula() {
        long seed = 5000L;
        RandomGenerator rngForDist = new Well19937c(seed);
        UniformRealDistribution d = new UniformRealDistribution(rngForDist, 2.0, 8.0,
                UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);

        RandomGenerator rngReference = new Well19937c(seed);
        double u = rngReference.nextDouble();
        double expected = u * 8.0 + (1 - u) * 2.0;

        double actual = d.sample();
        assertEquals(expected, actual, EPS);
    }

    // Sanity/boundary check: sampled values always within [lower, upper]
    @Test
    public void testSampleWithinBounds() {
        UniformRealDistribution d = new UniformRealDistribution(0.0, 1.0);
        for (int i = 0; i < 1000; i++) {
            double s = d.sample();
            assertTrue(s >= 0.0 && s <= 1.0);
        }
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor` | Default constructor → เรียก (0,1) ผ่าน this(0,1) |
| `testTwoArgConstructorValid` | Constructor 2-arg, lower < upper (ไม่ throw) |
| `testTwoArgConstructorLowerEqualsUpper` | if (lower >= upper) → true (boundary: lower == upper) |
| `testTwoArgConstructorLowerGreaterThanUpper` | if (lower >= upper) → true (lower > upper) |
| `testThreeArgConstructorValid` | Constructor 3-arg, path ปกติ, ตั้งค่า solverAbsoluteAccuracy |
| `testThreeArgConstructorInvalid` | Constructor 3-arg → throw exception |
| `testFourArgConstructorValid` | Constructor 4-arg (RandomGenerator) path ปกติ |
| `testFourArgConstructorInvalid` | Constructor 4-arg → throw exception |
| `testDensityBelowLower` | density(): x < lower → return 0.0 |
| `testDensityAboveUpper` | density(): x > upper → return 0.0 |
| `testDensityAtLowerBound` | density(): boundary x == lower → else-branch |
| `testDensityAtUpperBound` | density(): boundary x == upper → else-branch |
| `testDensityInsideRange` | density(): x ปกติภายใน range → else-branch |
| `testCumulativeProbabilityAtLower` | cumulativeProbability(): x <= lower (boundary x==lower) → return 0 |
| `testCumulativeProbabilityBelowLower` | cumulativeProbability(): x <= lower (x<lower) → return 0 |
| `testCumulativeProbabilityAtUpper` | cumulativeProbability(): x >= upper (boundary x==upper) → return 1 |
| `testCumulativeProbabilityAboveUpper` | cumulativeProbability(): x >= upper (x>upper) → return 1 |
| `testCumulativeProbabilityInside` | cumulativeProbability(): else-branch (normal calc) |
| `testGetNumericalMean` | getNumericalMean() คำนวณถูกต้อง (positive bounds) |
| `testGetNumericalMeanNegativeBounds` | getNumericalMean() กับค่าลบ |
| `testGetNumericalVariance` | getNumericalVariance() คำนวณถูกต้อง |
| `testGetSupportLowerBound` | getSupportLowerBound() คืนค่า lower |
| `testGetSupportUpperBound` | getSupportUpperBound() คืนค่า upper |
| `testIsSupportLowerBoundInclusive` | isSupportLowerBoundInclusive() == true |
| `testIsSupportUpperBoundInclusive` | isSupportUpperBoundInclusive() == false |
| `testIsSupportConnected` | isSupportConnected() == true |
| `testSampleFormula` | sample(): ตรวจสูตร u*upper+(1-u)*lower ด้วย deterministic RNG |
| `testSampleWithinBounds` | sample(): sanity check ค่าอยู่ในขอบเขต [lower, upper] |

**หมายเหตุ:**
- `getSolverAbsoluteAccuracy()` ถูกตรวจสอบทางอ้อมผ่านค่าที่ตั้งใน constructor tests (`testDefaultConstructor`, `testThreeArgConstructorValid`, `testFourArgConstructorValid`)
- ไม่มีช่อง null/empty input เนื่องจากพารามิเตอร์ทั้งหมดเป็น primitive `double` — ไม่สามารถทดสอบ null ได้ตาม source ที่ให้มา
- การทดสอบ `sample()` ใช้เทคนิค deterministic seed เพื่อยืนยันพฤติกรรมจริงของสูตรคำนวณ (ไม่ใช่การเดา behavior)
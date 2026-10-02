# FDistributionTest.java

```java
package org.apache.commons.math3.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link FDistribution} (Defects4J: Math-22b).
 *
 * หมายเหตุ: ทดสอบผ่าน public API เป็นหลัก
 * สำหรับ getSolverAbsoluteAccuracy() (protected) จะเข้าถึงได้โดยตรง
 * เพราะ test class ถูกวางไว้ใน package เดียวกัน (org.apache.commons.math3.distribution)
 */
public class FDistributionTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // Constructor tests - boundary & invalid input
    // ---------------------------------------------------------------

    @Test
    public void testConstructorValidParameters() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertEquals(5.0, fd.getNumeratorDegreesOfFreedom(), DELTA);
        assertEquals(10.0, fd.getDenominatorDegreesOfFreedom(), DELTA);
    }

    @Test
    public void testConstructorDefaultAccuracy() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertEquals(FDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY,
                     fd.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testConstructorCustomAccuracy() {
        double customAccuracy = 1e-6;
        FDistribution fd = new FDistribution(5.0, 10.0, customAccuracy);
        assertEquals(customAccuracy, fd.getSolverAbsoluteAccuracy(), 0.0);
    }

    @Test
    public void testConstructorWithRandomGenerator() {
        RandomGenerator rng = new Well19937c();
        FDistribution fd = new FDistribution(rng, 2.0, 2.0, 1e-9);
        assertEquals(2.0, fd.getNumeratorDegreesOfFreedom(), DELTA);
        assertEquals(2.0, fd.getDenominatorDegreesOfFreedom(), DELTA);
    }

    @Test
    public void testConstructorNumeratorZero_throwsException() {
        try {
            new FDistribution(0.0, 10.0);
            fail("Expected NotStrictlyPositiveException when numeratorDegreesOfFreedom == 0");
        } catch (NotStrictlyPositiveException e) {
            // expected - branch: numeratorDegreesOfFreedom <= 0 (== 0 boundary)
        }
    }

    @Test
    public void testConstructorNumeratorNegative_throwsException() {
        try {
            new FDistribution(-1.0, 10.0);
            fail("Expected NotStrictlyPositiveException when numeratorDegreesOfFreedom < 0");
        } catch (NotStrictlyPositiveException e) {
            // expected - branch: numeratorDegreesOfFreedom <= 0 (negative)
        }
    }

    @Test
    public void testConstructorDenominatorZero_throwsException() {
        try {
            new FDistribution(5.0, 0.0);
            fail("Expected NotStrictlyPositiveException when denominatorDegreesOfFreedom == 0");
        } catch (NotStrictlyPositiveException e) {
            // expected - branch: denominatorDegreesOfFreedom <= 0 (== 0 boundary)
        }
    }

    @Test
    public void testConstructorDenominatorNegative_throwsException() {
        try {
            new FDistribution(5.0, -3.0);
            fail("Expected NotStrictlyPositiveException when denominatorDegreesOfFreedom < 0");
        } catch (NotStrictlyPositiveException e) {
            // expected - branch: denominatorDegreesOfFreedom <= 0 (negative)
        }
    }

    // ---------------------------------------------------------------
    // Getter tests
    // ---------------------------------------------------------------

    @Test
    public void testGetNumeratorDegreesOfFreedom() {
        FDistribution fd = new FDistribution(7.5, 12.3);
        assertEquals(7.5, fd.getNumeratorDegreesOfFreedom(), DELTA);
    }

    @Test
    public void testGetDenominatorDegreesOfFreedom() {
        FDistribution fd = new FDistribution(7.5, 12.3);
        assertEquals(12.3, fd.getDenominatorDegreesOfFreedom(), DELTA);
    }

    // ---------------------------------------------------------------
    // cumulativeProbability() - if/else branches
    // ---------------------------------------------------------------

    @Test
    public void testCumulativeProbability_XEqualsZero() {
        // branch: x <= 0 -> ret = 0
        FDistribution fd = new FDistribution(2.0, 2.0);
        assertEquals(0.0, fd.cumulativeProbability(0.0), DELTA);
    }

    @Test
    public void testCumulativeProbability_XNegative() {
        // branch: x <= 0 -> ret = 0
        FDistribution fd = new FDistribution(2.0, 2.0);
        assertEquals(0.0, fd.cumulativeProbability(-5.0), DELTA);
    }

    @Test
    public void testCumulativeProbability_XPositive_knownFormula() {
        // branch: x > 0 -> compute via regularizedBeta
        // สำหรับ F(2,2): CDF(x) = x/(1+x) (ค่าที่คำนวณได้จากสูตรปิดของ F-distribution นี้)
        FDistribution fd = new FDistribution(2.0, 2.0);
        assertEquals(0.5, fd.cumulativeProbability(1.0), DELTA);
        assertEquals(0.75, fd.cumulativeProbability(3.0), DELTA);
    }

    @Test
    public void testCumulativeProbability_SmallPositiveX() {
        // ตรวจ boundary ใกล้ 0 ที่ยังเข้า branch x > 0
        FDistribution fd = new FDistribution(2.0, 2.0);
        double expected = 0.0001 / (1.0 + 0.0001);
        assertEquals(expected, fd.cumulativeProbability(0.0001), 1e-6);
    }

    // ---------------------------------------------------------------
    // density()
    // ---------------------------------------------------------------

    @Test
    public void testDensity_KnownValues_F2_2() {
        // สำหรับ F(2,2): pdf(x) = 1/(1+x)^2 (สูตรปิดเฉพาะกรณีนี้)
        FDistribution fd = new FDistribution(2.0, 2.0);
        assertEquals(0.25, fd.density(1.0), DELTA);
        assertEquals(0.0625, fd.density(3.0), DELTA);
    }

    @Test
    public void testDensity_DifferentDegreesOfFreedom() {
        // ตรวจว่าค่าที่ได้เป็นบวกและ finite สำหรับ parameter อื่น ๆ
        FDistribution fd = new FDistribution(5.0, 10.0);
        double d = fd.density(2.0);
        assertTrue(d > 0);
        assertFalse(Double.isNaN(d));
        assertFalse(Double.isInfinite(d));
    }

    // ---------------------------------------------------------------
    // getNumericalMean() - if/else branch (denominatorDF > 2)
    // ---------------------------------------------------------------

    @Test
    public void testGetNumericalMean_DenominatorGreaterThanTwo() {
        // branch: denominatorDF > 2 -> b/(b-2)
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertEquals(10.0 / 8.0, fd.getNumericalMean(), DELTA);
    }

    @Test
    public void testGetNumericalMean_DenominatorEqualsTwo_NaN() {
        // boundary: denominatorDF == 2 -> ไม่เข้าเงื่อนไข (> 2) -> NaN
        FDistribution fd = new FDistribution(5.0, 2.0);
        assertTrue(Double.isNaN(fd.getNumericalMean()));
    }

    @Test
    public void testGetNumericalMean_DenominatorLessThanTwo_NaN() {
        // branch: denominatorDF <= 2 -> NaN
        FDistribution fd = new FDistribution(5.0, 1.0);
        assertTrue(Double.isNaN(fd.getNumericalMean()));
    }

    // ---------------------------------------------------------------
    // getNumericalVariance() / calculateNumericalVariance() - branch + caching
    // ---------------------------------------------------------------

    @Test
    public void testGetNumericalVariance_DenominatorGreaterThanFour() {
        // branch: denominatorDF > 4 -> compute formula
        FDistribution fd = new FDistribution(5.0, 10.0);
        double expected = (2.0 * (10.0 * 10.0) * (5.0 + 10.0 - 2.0))
                / (5.0 * ((10.0 - 2.0) * (10.0 - 2.0)) * (10.0 - 4.0));
        assertEquals(expected, fd.getNumericalVariance(), DELTA);
    }

    @Test
    public void testGetNumericalVariance_DenominatorEqualsFour_NaN() {
        // boundary: denominatorDF == 4 -> ไม่เข้าเงื่อนไข (> 4) -> NaN
        FDistribution fd = new FDistribution(5.0, 4.0);
        assertTrue(Double.isNaN(fd.getNumericalVariance()));
    }

    @Test
    public void testGetNumericalVariance_DenominatorLessThanFour_NaN() {
        // branch: denominatorDF <= 4 -> NaN
        FDistribution fd = new FDistribution(5.0, 3.0);
        assertTrue(Double.isNaN(fd.getNumericalVariance()));
    }

    @Test
    public void testGetNumericalVariance_Caching() {
        // เรียกซ้ำเพื่อครอบคลุม branch numericalVarianceIsCalculated (true/false)
        FDistribution fd = new FDistribution(5.0, 10.0);
        double firstCall = fd.getNumericalVariance();
        double secondCall = fd.getNumericalVariance();
        assertEquals(firstCall, secondCall, 0.0);
    }

    // ---------------------------------------------------------------
    // Support bounds & inclusivity
    // ---------------------------------------------------------------

    @Test
    public void testGetSupportLowerBound() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertEquals(0.0, fd.getSupportLowerBound(), 0.0);
    }

    @Test
    public void testGetSupportUpperBound() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertEquals(Double.POSITIVE_INFINITY, fd.getSupportUpperBound(), 0.0);
    }

    @Test
    public void testIsSupportLowerBoundInclusive() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertTrue(fd.isSupportLowerBoundInclusive());
    }

    @Test
    public void testIsSupportUpperBoundInclusive() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertFalse(fd.isSupportUpperBoundInclusive());
    }

    @Test
    public void testIsSupportConnected() {
        FDistribution fd = new FDistribution(5.0, 10.0);
        assertTrue(fd.isSupportConnected());
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorValidParameters` | Constructor path ผ่านทั้งสองเงื่อนไข (ไม่ throw) |
| `testConstructorDefaultAccuracy` | Constructor 2-arg → เรียก 3-arg ด้วยค่า default accuracy |
| `testConstructorCustomAccuracy` | Constructor 3-arg กำหนด accuracy เอง |
| `testConstructorWithRandomGenerator` | Constructor 4-arg (RandomGenerator) |
| `testConstructorNumeratorZero_throwsException` | `numeratorDegreesOfFreedom <= 0` (boundary = 0) → throw |
| `testConstructorNumeratorNegative_throwsException` | `numeratorDegreesOfFreedom <= 0` (ค่าลบ) → throw |
| `testConstructorDenominatorZero_throwsException` | `denominatorDegreesOfFreedom <= 0` (boundary = 0) → throw |
| `testConstructorDenominatorNegative_throwsException` | `denominatorDegreesOfFreedom <= 0` (ค่าลบ) → throw |
| `testGetNumeratorDegreesOfFreedom` | getter path |
| `testGetDenominatorDegreesOfFreedom` | getter path |
| `testCumulativeProbability_XEqualsZero` | `cumulativeProbability`: `x <= 0` (boundary 0) → ret=0 |
| `testCumulativeProbability_XNegative` | `cumulativeProbability`: `x <= 0` (ค่าลบ) → ret=0 |
| `testCumulativeProbability_XPositive_knownFormula` | `cumulativeProbability`: `x > 0` → คำนวณ regularizedBeta |
| `testCumulativeProbability_SmallPositiveX` | boundary ใกล้ 0 แต่ยัง `x > 0` |
| `testDensity_KnownValues_F2_2` | `density()` คำนวณค่าปกติ (x>0) เทียบสูตรปิด |
| `testDensity_DifferentDegreesOfFreedom` | `density()` กับพารามิเตอร์ต่างกัน ตรวจ finite/positive |
| `testGetNumericalMean_DenominatorGreaterThanTwo` | `getNumericalMean`: `denominatorDF > 2` → ค่าจริง |
| `testGetNumericalMean_DenominatorEqualsTwo_NaN` | boundary `denominatorDF == 2` → NaN |
| `testGetNumericalMean_DenominatorLessThanTwo_NaN` | `denominatorDF <= 2` (ค่าน้อยกว่า) → NaN |
| `testGetNumericalVariance_DenominatorGreaterThanFour` | `calculateNumericalVariance`: `denominatorDF > 4` → ค่าจริง |
| `testGetNumericalVariance_DenominatorEqualsFour_NaN` | boundary `denominatorDF == 4` → NaN |
| `testGetNumericalVariance_DenominatorLessThanFour_NaN` | `denominatorDF <= 4` (ค่าน้อยกว่า) → NaN |
| `testGetNumericalVariance_Caching` | `numericalVarianceIsCalculated` flag: false→true branch และ cached (true) branch |
| `testGetSupportLowerBound` | `getSupportLowerBound()` คงที่ 0 |
| `testGetSupportUpperBound` | `getSupportUpperBound()` คงที่ +Infinity |
| `testIsSupportLowerBoundInclusive` | คงที่ true |
| `testIsSupportUpperBoundInclusive` | คงที่ false |
| `testIsSupportConnected` | คงที่ true |

**หมายเหตุสำคัญ:**
- `density(0.0)` และ `cumulativeProbability` ที่ `x` เป็นค่าพิเศษ (เช่น `NaN`, `Infinity`) ไม่ได้ทดสอบ เพราะซอร์สโค้ดไม่มีการ handle กรณีเหล่านี้อย่างชัดเจน (ไม่มี if/else แยก) จึงไม่ assert behavior ที่ไม่มีอยู่ในซอร์ส
- สูตรปิด (`pdf = 1/(1+x)^2`, `cdf = x/(1+x)`) ที่ใช้ตรวจสอบ `density()`/`cumulativeProbability()` สำหรับกรณี F(2,2) เป็นค่าที่ได้จากการอินทิเกรตสูตร PDF มาตรฐานของ F-distribution (ไม่ใช่การ re-implement โค้ดเป้าหมาย) จึงใช้เป็น oracle ที่เป็นอิสระได้
- `getSolverAbsoluteAccuracy()` เป็น `protected` method เข้าถึงได้เนื่องจาก test class อยู่ใน package เดียวกัน (`org.apache.commons.math3.distribution`)
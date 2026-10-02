# FDistributionImplTest.java

```java
package org.apache.commons.math.distribution;

import static org.junit.Assert.*;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for FDistributionImpl (Defects4J Math-95b).
 *
 * หมายเหตุ:
 * - พารามิเตอร์ทั้งหมดเป็น primitive double จึงไม่มีกรณี null
 * - AbstractContinuousDistribution (super class) ไม่มี source ให้ตรวจสอบ
 *   จึงหลีกเลี่ยงการเดา behavior ของ super.inverseCumulativeProbability(p)
 *   กรณี p < 0 หรือ p > 1 (ไม่เขียนเทสสำหรับกรณีเหล่านี้เพราะไม่แน่ใจว่า
 *   super class จะ throw exception ชนิดใด)
 */
public class FDistributionImplTest {

    private FDistributionImpl dist;

    @Before
    public void setUp() {
        dist = new FDistributionImpl(5.0, 10.0);
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructorAndGetters() {
        assertEquals(5.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
        assertEquals(10.0, dist.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidNumeratorZero() {
        new FDistributionImpl(0.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidNumeratorNegative() {
        new FDistributionImpl(-1.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDenominatorZero() {
        new FDistributionImpl(5.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDenominatorNegative() {
        new FDistributionImpl(5.0, -5.0);
    }

    // ---------- setNumeratorDegreesOfFreedom ----------

    @Test
    public void testSetNumeratorDegreesOfFreedomValid() {
        dist.setNumeratorDegreesOfFreedom(20.0);
        assertEquals(20.0, dist.getNumeratorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedomZero() {
        dist.setNumeratorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNumeratorDegreesOfFreedomNegative() {
        dist.setNumeratorDegreesOfFreedom(-3.0);
    }

    // ---------- setDenominatorDegreesOfFreedom ----------

    @Test
    public void testSetDenominatorDegreesOfFreedomValid() {
        dist.setDenominatorDegreesOfFreedom(15.0);
        assertEquals(15.0, dist.getDenominatorDegreesOfFreedom(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedomZero() {
        dist.setDenominatorDegreesOfFreedom(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDenominatorDegreesOfFreedomNegative() {
        dist.setDenominatorDegreesOfFreedom(-2.0);
    }

    // ---------- cumulativeProbability ----------

    @Test
    public void testCumulativeProbability_XZero() throws MathException {
        // boundary: x <= 0.0 branch (x == 0)
        assertEquals(0.0, dist.cumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testCumulativeProbability_XNegative() throws MathException {
        // x <= 0.0 branch (x < 0)
        assertEquals(0.0, dist.cumulativeProbability(-5.0), 0.0);
    }

    @Test
    public void testCumulativeProbability_XPositive() throws MathException {
        // else branch: x > 0
        double p = dist.cumulativeProbability(1.0);
        assertTrue(p > 0.0 && p < 1.0);
    }

    @Test
    public void testCumulativeProbability_LargeX() throws MathException {
        // else branch, large x -> probability close to 1
        double p = dist.cumulativeProbability(1000.0);
        assertTrue(p > 0.9 && p <= 1.0);
    }

    // ---------- inverseCumulativeProbability ----------

    @Test
    public void testInverseCumulativeProbability_PZero() throws MathException {
        // if (p == 0) branch
        assertEquals(0.0, dist.inverseCumulativeProbability(0.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_POne() throws MathException {
        // if (p == 1) branch
        assertEquals(Double.POSITIVE_INFINITY,
            dist.inverseCumulativeProbability(1.0), 0.0);
    }

    @Test
    public void testInverseCumulativeProbability_Normal() throws MathException {
        // else branch -> delegates to super.inverseCumulativeProbability(p)
        double p = 0.5;
        double x = dist.inverseCumulativeProbability(p);
        double back = dist.cumulativeProbability(x);
        assertEquals(p, back, 1e-4);
    }

    // ---------- protected: getDomainLowerBound / getDomainUpperBound ----------

    @Test
    public void testGetDomainLowerBound() {
        // ไม่มี branch ภายในเมธอดนี้ แต่ทดสอบค่า input หลายแบบเพื่อยืนยันค่าคงที่
        assertEquals(0.0, dist.getDomainLowerBound(0.0), 0.0);
        assertEquals(0.0, dist.getDomainLowerBound(0.5), 0.0);
        assertEquals(0.0, dist.getDomainLowerBound(1.0), 0.0);
    }

    @Test
    public void testGetDomainUpperBound() {
        assertEquals(Double.MAX_VALUE, dist.getDomainUpperBound(0.5), 0.0);
    }

    // ---------- protected: getInitialDomain ----------

    @Test
    public void testGetInitialDomain_NormalDenominator() {
        // denominatorDF = 10 -> d/(d-2) = 10/8 = 1.25
        double initial = dist.getInitialDomain(0.5);
        assertEquals(1.25, initial, 1e-10);
    }

    @Test
    public void testGetInitialDomain_DenominatorEqualsTwo() {
        // d - 2 == 0 -> division by zero -> +Infinity (IEEE 754 behavior)
        dist.setDenominatorDegreesOfFreedom(2.0);
        double initial = dist.getInitialDomain(0.5);
        assertTrue(Double.isInfinite(initial));
    }

    @Test
    public void testGetInitialDomain_DenominatorLessThanTwo() {
        // d - 2 < 0 -> ผลลัพธ์เป็นค่าลบ (edge-case ที่อาจเป็นสาเหตุของ defect)
        dist.setDenominatorDegreesOfFreedom(1.0);
        double initial = dist.getInitialDomain(0.5);
        assertTrue(initial < 0.0);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndGetters` | Constructor ปกติ + getter ทั้งสอง |
| `testConstructorInvalidNumeratorZero/Negative` | `setNumeratorDegreesOfFreedom`: `degreesOfFreedom <= 0.0` == true (ผ่าน constructor) |
| `testConstructorInvalidDenominatorZero/Negative` | `setDenominatorDegreesOfFreedom`: `degreesOfFreedom <= 0.0` == true (ผ่าน constructor) |
| `testSetNumeratorDegreesOfFreedomValid` | `setNumeratorDegreesOfFreedom`: else-branch (ค่า > 0) |
| `testSetNumeratorDegreesOfFreedomZero/Negative` | `setNumeratorDegreesOfFreedom`: if-branch throw IllegalArgumentException |
| `testSetDenominatorDegreesOfFreedomValid` | `setDenominatorDegreesOfFreedom`: else-branch |
| `testSetDenominatorDegreesOfFreedomZero/Negative` | `setDenominatorDegreesOfFreedom`: if-branch throw IllegalArgumentException |
| `testCumulativeProbability_XZero` | `cumulativeProbability`: `x <= 0.0` true (x = 0 boundary) |
| `testCumulativeProbability_XNegative` | `cumulativeProbability`: `x <= 0.0` true (x < 0) |
| `testCumulativeProbability_XPositive` | `cumulativeProbability`: else-branch (คำนวณ Beta.regularizedBeta) |
| `testCumulativeProbability_LargeX` | `cumulativeProbability`: else-branch, boundary ค่าสูง |
| `testInverseCumulativeProbability_PZero` | `inverseCumulativeProbability`: `p == 0` true |
| `testInverseCumulativeProbability_POne` | `inverseCumulativeProbability`: `p == 1` true |
| `testInverseCumulativeProbability_Normal` | `inverseCumulativeProbability`: else-branch เรียก `super.inverseCumulativeProbability(p)` |
| `testGetDomainLowerBound` | `getDomainLowerBound`: ค่าคงที่ (ไม่มี branch) |
| `testGetDomainUpperBound` | `getDomainUpperBound`: ค่าคงที่ (ไม่มี branch) |
| `testGetInitialDomain_NormalDenominator` | `getInitialDomain`: คำนวณปกติ (d > 2) |
| `testGetInitialDomain_DenominatorEqualsTwo` | `getInitialDomain`: boundary d = 2 (หารด้วยศูนย์) |
| `testGetInitialDomain_DenominatorLessThanTwo` | `getInitialDomain`: d < 2 (ผลลัพธ์เป็นค่าลบ, edge-case) |

**หมายเหตุเพิ่มเติม:** ไม่ได้เขียนเทสสำหรับ `inverseCumulativeProbability(p)` ที่ `p < 0` หรือ `p > 1` เนื่องจาก behavior ของ `super.inverseCumulativeProbability(p)` (คลาส `AbstractContinuousDistribution`) ไม่มีอยู่ใน source ที่ให้มา จึงไม่สามารถยืนยัน exception/behavior ที่ถูกต้องได้ตามข้อกำหนดที่ 4
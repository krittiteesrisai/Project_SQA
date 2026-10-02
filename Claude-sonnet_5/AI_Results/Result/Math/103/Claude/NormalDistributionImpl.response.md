# การวิเคราะห์โค้ดและจุดที่ต้อง Cover

จากซอร์สโค้ด `NormalDistributionImpl` มี branch/condition หลักดังนี้:

1. **Constructor** - เรียก `setMean()` และ `setStandardDeviation()`
2. **setStandardDeviation(sd)** - `if (sd <= 0.0)` throw exception / else ตั้งค่าปกติ
3. **inverseCumulativeProbability(p)** - `if (p == 0)` / `if (p == 1)` / else เรียก `super.inverseCumulativeProbability(p)`
4. **getDomainLowerBound(p)** - `if (p < .5)` / else
5. **getDomainUpperBound(p)** - `if (p < .5)` / else
6. **getInitialDomain(p)** - `if (p < .5)` / `else if (p > .5)` / else (p==.5)

เนื่องจาก `getDomainLowerBound`, `getDomainUpperBound`, `getInitialDomain` เป็น `protected` จึงต้องวาง test class ไว้ใน package เดียวกัน (`org.apache.commons.math.distribution`) เพื่อเข้าถึงได้โดยตรง (ไม่ใช้ reflection)

```java
package org.apache.commons.math.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.MathException;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link NormalDistributionImpl} (Defects4J Math-103b)
 *
 * Test class ถูกวางไว้ใน package เดียวกับคลาสเป้าหมาย
 * เพื่อให้สามารถเรียกใช้ protected methods ได้โดยตรง
 */
public class NormalDistributionImplTest {

    private static final double DELTA = 1e-9;

    private NormalDistributionImpl standardNormal; // mean=0, sd=1

    @Before
    public void setUp() {
        standardNormal = new NormalDistributionImpl();
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        assertEquals(0.0, standardNormal.getMean(), DELTA);
        assertEquals(1.0, standardNormal.getStandardDeviation(), DELTA);
    }

    @Test
    public void testParamConstructorValidValues() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(5.0, dist.getMean(), DELTA);
        assertEquals(2.0, dist.getStandardDeviation(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParamConstructorInvalidSdZero() {
        // sd == 0 -> ต้อง throw ตาม setStandardDeviation branch (sd <= 0.0)
        new NormalDistributionImpl(0.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParamConstructorInvalidSdNegative() {
        // sd < 0 -> ต้อง throw
        new NormalDistributionImpl(0.0, -1.0);
    }

    // ---------------------------------------------------------------
    // getMean / setMean
    // ---------------------------------------------------------------

    @Test
    public void testSetMean() {
        standardNormal.setMean(10.0);
        assertEquals(10.0, standardNormal.getMean(), DELTA);
    }

    @Test
    public void testSetMeanNegativeValue() {
        standardNormal.setMean(-10.0);
        assertEquals(-10.0, standardNormal.getMean(), DELTA);
    }

    @Test
    public void testSetMeanZero() {
        standardNormal.setMean(0.0);
        assertEquals(0.0, standardNormal.getMean(), DELTA);
    }

    // ---------------------------------------------------------------
    // getStandardDeviation / setStandardDeviation
    //   branch: sd <= 0.0 -> throw / else -> set value
    // ---------------------------------------------------------------

    @Test
    public void testSetStandardDeviationValid() {
        standardNormal.setStandardDeviation(3.5);
        assertEquals(3.5, standardNormal.getStandardDeviation(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviationZero() {
        // boundary: sd == 0.0 -> throw (sd <= 0.0 เป็น true)
        standardNormal.setStandardDeviation(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStandardDeviationNegative() {
        standardNormal.setStandardDeviation(-5.0);
    }

    @Test
    public void testSetStandardDeviationSmallPositive() {
        // boundary: sd ค่าน้อยที่สุดที่ยังมากกว่า 0 -> ไม่ throw
        standardNormal.setStandardDeviation(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, standardNormal.getStandardDeviation(), DELTA);
    }

    // ---------------------------------------------------------------
    // cumulativeProbability(x)
    //   ไม่มี branch ในโค้ด แต่ทดสอบความถูกต้องของผลลัพธ์
    // ---------------------------------------------------------------

    @Test
    public void testCumulativeProbabilityAtMean() throws MathException {
        // CDF ที่ mean ของ standard normal ต้องเท่ากับ 0.5
        double result = standardNormal.cumulativeProbability(0.0);
        assertEquals(0.5, result, 1e-6);
    }

    @Test
    public void testCumulativeProbabilityPositive() throws MathException {
        double result = standardNormal.cumulativeProbability(1.0);
        // ค่าทางทฤษฎี ~ 0.8413
        assertEquals(0.8413447, result, 1e-6);
    }

    @Test
    public void testCumulativeProbabilityNegative() throws MathException {
        double result = standardNormal.cumulativeProbability(-1.0);
        // ค่าทางทฤษฎี ~ 0.1587
        assertEquals(0.1586553, result, 1e-6);
    }

    @Test
    public void testCumulativeProbabilityWithCustomMeanAndSd() throws MathException {
        NormalDistributionImpl dist = new NormalDistributionImpl(10.0, 2.0);
        double result = dist.cumulativeProbability(10.0);
        assertEquals(0.5, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // inverseCumulativeProbability(p)
    //   branch: p==0 -> NEGATIVE_INFINITY
    //           p==1 -> POSITIVE_INFINITY
    //           else -> super.inverseCumulativeProbability(p)
    // ---------------------------------------------------------------

    @Test
    public void testInverseCumulativeProbabilityPZero() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(0.0);
        assertEquals(Double.NEGATIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityPOne() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityPHalf() throws MathException {
        // p=0.5 ไม่ตรงเงื่อนไข p==0 หรือ p==1 -> ไปที่ branch else (เรียก super)
        // ผลลัพธ์ที่คาดหวังคือ mean ของ distribution (0.0)
        double result = standardNormal.inverseCumulativeProbability(0.5);
        assertEquals(0.0, result, 1e-5);
    }

    @Test
    public void testInverseCumulativeProbabilityPBetweenZeroAndHalf() throws MathException {
        // p < 0.5 -> เข้า else branch, เรียก super ซึ่งใช้ getDomainLowerBound/UpperBound/InitialDomain
        double result = standardNormal.inverseCumulativeProbability(0.25);
        assertTrue(result < 0.0);
    }

    @Test
    public void testInverseCumulativeProbabilityPBetweenHalfAndOne() throws MathException {
        double result = standardNormal.inverseCumulativeProbability(0.75);
        assertTrue(result > 0.0);
    }

    // หมายเหตุ: ซอร์สโค้ดที่ให้มาไม่ได้แสดง validate ของ p<0 หรือ p>1 อย่างชัดเจน
    // (อยู่ใน super class ที่ไม่ได้ให้มา) จึงไม่ assert behavior ของกรณีนี้
    // เพื่อไม่ guess behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา
    // หากต้องการทดสอบ ควร verify ด้วยซอร์สของ superclass จริง

    // ---------------------------------------------------------------
    // getDomainLowerBound(p)
    //   branch: p < 0.5 -> -Double.MAX_VALUE
    //           else    -> getMean()
    // ---------------------------------------------------------------

    @Test
    public void testGetDomainLowerBoundPLessThanHalf() {
        double result = standardNormal.getDomainLowerBound(0.3);
        assertEquals(-Double.MAX_VALUE, result, 0.0);
    }

    @Test
    public void testGetDomainLowerBoundPEqualHalf() {
        // p == 0.5 ไม่ < 0.5 -> else branch -> คืนค่า mean
        double result = standardNormal.getDomainLowerBound(0.5);
        assertEquals(standardNormal.getMean(), result, DELTA);
    }

    @Test
    public void testGetDomainLowerBoundPGreaterThanHalf() {
        double result = standardNormal.getDomainLowerBound(0.8);
        assertEquals(standardNormal.getMean(), result, DELTA);
    }

    // ---------------------------------------------------------------
    // getDomainUpperBound(p)
    //   branch: p < 0.5 -> getMean()
    //           else    -> Double.MAX_VALUE
    // ---------------------------------------------------------------

    @Test
    public void testGetDomainUpperBoundPLessThanHalf() {
        double result = standardNormal.getDomainUpperBound(0.3);
        assertEquals(standardNormal.getMean(), result, DELTA);
    }

    @Test
    public void testGetDomainUpperBoundPEqualHalf() {
        double result = standardNormal.getDomainUpperBound(0.5);
        assertEquals(Double.MAX_VALUE, result, 0.0);
    }

    @Test
    public void testGetDomainUpperBoundPGreaterThanHalf() {
        double result = standardNormal.getDomainUpperBound(0.8);
        assertEquals(Double.MAX_VALUE, result, 0.0);
    }

    // ---------------------------------------------------------------
    // getInitialDomain(p)
    //   branch: p < 0.5  -> mean - sd
    //           p > 0.5  -> mean + sd
    //           else (p==0.5) -> mean
    // ---------------------------------------------------------------

    @Test
    public void testGetInitialDomainPLessThanHalf() {
        double result = standardNormal.getInitialDomain(0.3);
        assertEquals(standardNormal.getMean() - standardNormal.getStandardDeviation(),
                result, DELTA);
    }

    @Test
    public void testGetInitialDomainPGreaterThanHalf() {
        double result = standardNormal.getInitialDomain(0.7);
        assertEquals(standardNormal.getMean() + standardNormal.getStandardDeviation(),
                result, DELTA);
    }

    @Test
    public void testGetInitialDomainPEqualHalf() {
        // p == 0.5 -> ไม่เข้า if หรือ else if -> เข้า else สุดท้าย -> คืนค่า mean
        double result = standardNormal.getInitialDomain(0.5);
        assertEquals(standardNormal.getMean(), result, DELTA);
    }

    @Test
    public void testGetInitialDomainWithCustomMeanAndSd() {
        NormalDistributionImpl dist = new NormalDistributionImpl(5.0, 2.0);
        assertEquals(3.0, dist.getInitialDomain(0.3), DELTA);  // mean - sd
        assertEquals(7.0, dist.getInitialDomain(0.7), DELTA);  // mean + sd
        assertEquals(5.0, dist.getInitialDomain(0.5), DELTA);  // mean
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor` | Default constructor -> setMean(0), setStandardDeviation(1) |
| `testParamConstructorValidValues` | Parametrized constructor กับค่าถูกต้อง |
| `testParamConstructorInvalidSdZero` | Constructor -> setStandardDeviation(sd<=0) throw (boundary sd=0) |
| `testParamConstructorInvalidSdNegative` | Constructor -> setStandardDeviation(sd<=0) throw (sd<0) |
| `testSetMean`, `testSetMeanNegativeValue`, `testSetMeanZero` | setMean() กับค่าบวก/ลบ/ศูนย์ |
| `testSetStandardDeviationValid` | setStandardDeviation: else branch (sd > 0) |
| `testSetStandardDeviationZero` | setStandardDeviation: if branch (sd == 0, boundary) throw |
| `testSetStandardDeviationNegative` | setStandardDeviation: if branch (sd < 0) throw |
| `testSetStandardDeviationSmallPositive` | boundary sd = Double.MIN_VALUE -> else branch |
| `testCumulativeProbabilityAtMean/Positive/Negative/WithCustomMeanAndSd` | cumulativeProbability คำนวณถูกต้อง (ไม่มี branch แต่ validate ค่า) |
| `testInverseCumulativeProbabilityPZero` | inverseCumulativeProbability: if (p==0) |
| `testInverseCumulativeProbabilityPOne` | inverseCumulativeProbability: if (p==1) |
| `testInverseCumulativeProbabilityPHalf/PBetweenZeroAndHalf/PBetweenHalfAndOne` | inverseCumulativeProbability: else -> super(...) ทั้ง p<0.5 และ p>0.5 |
| `testGetDomainLowerBoundPLessThanHalf` | getDomainLowerBound: if (p<0.5) -> -MAX_VALUE |
| `testGetDomainLowerBoundPEqualHalf`, `testGetDomainLowerBoundPGreaterThanHalf` | getDomainLowerBound: else -> mean (boundary p=0.5 และ p>0.5) |
| `testGetDomainUpperBoundPLessThanHalf` | getDomainUpperBound: if (p<0.5) -> mean |
| `testGetDomainUpperBoundPEqualHalf`, `testGetDomainUpperBoundPGreaterThanHalf` | getDomainUpperBound: else -> MAX_VALUE |
| `testGetInitialDomainPLessThanHalf` | getInitialDomain: if (p<0.5) -> mean-sd |
| `testGetInitialDomainPGreaterThanHalf` | getInitialDomain: else if (p>0.5) -> mean+sd |
| `testGetInitialDomainPEqualHalf` | getInitialDomain: else (p==0.5) -> mean |
| `testGetInitialDomainWithCustomMeanAndSd` | getInitialDomain ครบทั้ง 3 branch กับ mean/sd ที่ไม่ใช่ default |

**หมายเหตุสำคัญ:** โค้ดที่ให้มาไม่มีการ validate ค่า `p` ที่ไม่ใช่ `[0,1]` โดยตรงใน `inverseCumulativeProbability` (การ validate อยู่ใน superclass ที่ไม่ได้ให้มา) จึงไม่ได้เขียนเทสกรณี invalid p (เช่น p<0 หรือ p>1) เพื่อหลีกเลี่ยงการ guess behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา
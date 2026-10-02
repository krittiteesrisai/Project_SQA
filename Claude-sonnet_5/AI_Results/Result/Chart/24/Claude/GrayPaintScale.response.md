# GrayPaintScaleTest.java

```java
package org.jfree.chart.renderer;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Paint;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link GrayPaintScale} (Defects4J Chart-24b).
 *
 * หมายเหตุ: โค้ดต้นฉบับมี bug ที่เมธอด getPaint(double) — มีการคำนวณค่า
 * clamp (v) แต่ไม่ได้นำ v ไปใช้ในการคำนวณ g เลย (ใช้ value ดิบแทน)
 * ทำให้เมื่อ value อยู่นอกช่วง [lowerBound, upperBound] ค่า g จะออกนอก
 * ช่วง 0-255 และ constructor ของ Color จะโยน IllegalArgumentException
 * ซึ่งเป็น "actual behavior" ของซอร์สที่ให้มา จึงเขียนเทสตามพฤติกรรมจริงนี้
 * (ไม่ได้เดาว่าโค้ดควร clamp ค่าให้ถูกต้อง)
 */
public class GrayPaintScaleTest {

    private GrayPaintScale defaultScale;

    @Before
    public void setUp() {
        defaultScale = new GrayPaintScale();
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        // default ควรได้ lowerBound=0.0, upperBound=1.0
        assertEquals(0.0, defaultScale.getLowerBound(), 0.0000001);
        assertEquals(1.0, defaultScale.getUpperBound(), 0.0000001);
    }

    @Test
    public void testConstructorWithValidBounds() {
        GrayPaintScale scale = new GrayPaintScale(-5.0, 5.0);
        assertEquals(-5.0, scale.getLowerBound(), 0.0000001);
        assertEquals(5.0, scale.getUpperBound(), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLowerEqualsUpper_throws() {
        // boundary case: lowerBound == upperBound -> ต้อง throw
        new GrayPaintScale(1.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLowerGreaterThanUpper_throws() {
        // lowerBound > upperBound -> ต้อง throw
        new GrayPaintScale(10.0, 5.0);
    }

    // ---------------------------------------------------------------
    // getLowerBound / getUpperBound
    // ---------------------------------------------------------------

    @Test
    public void testGetLowerBound() {
        GrayPaintScale scale = new GrayPaintScale(2.0, 8.0);
        assertEquals(2.0, scale.getLowerBound(), 0.0000001);
    }

    @Test
    public void testGetUpperBound() {
        GrayPaintScale scale = new GrayPaintScale(2.0, 8.0);
        assertEquals(8.0, scale.getUpperBound(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // getPaint(double) tests - ค่าขอบเขตปกติ (ภายในช่วง)
    // ---------------------------------------------------------------

    @Test
    public void testGetPaintAtLowerBound_returnsBlack() {
        // value == lowerBound -> g = 0 -> Color(0,0,0)
        Paint paint = defaultScale.getPaint(0.0);
        assertTrue(paint instanceof Color);
        Color c = (Color) paint;
        assertEquals(0, c.getRed());
        assertEquals(0, c.getGreen());
        assertEquals(0, c.getBlue());
    }

    @Test
    public void testGetPaintAtUpperBound_returnsWhite() {
        // value == upperBound -> g = 255 -> Color(255,255,255)
        Paint paint = defaultScale.getPaint(1.0);
        assertTrue(paint instanceof Color);
        Color c = (Color) paint;
        assertEquals(255, c.getRed());
        assertEquals(255, c.getGreen());
        assertEquals(255, c.getBlue());
    }

    @Test
    public void testGetPaintAtMidPoint() {
        // value = 0.5 -> g = (int)(0.5*255) = 127
        Paint paint = defaultScale.getPaint(0.5);
        assertTrue(paint instanceof Color);
        Color c = (Color) paint;
        assertEquals(127, c.getRed());
        assertEquals(127, c.getGreen());
        assertEquals(127, c.getBlue());
    }

    @Test
    public void testGetPaintWithCustomBounds_midValue() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 10.0);
        // value = 5.0 -> g = (int)(5/10*255) = 127
        Paint paint = scale.getPaint(5.0);
        Color c = (Color) paint;
        assertEquals(127, c.getRed());
        assertEquals(127, c.getGreen());
        assertEquals(127, c.getBlue());
    }

    // ---------------------------------------------------------------
    // getPaint(double) - ค่านอกขอบเขต (fault detection: bug ใน clamp)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetPaintBelowLowerBound_throwsDueToBug() {
        // value ต่ำกว่า lowerBound -> g จะติดลบ (เพราะ code ไม่ clamp จริง)
        // -> Color constructor throw IllegalArgumentException
        GrayPaintScale scale = new GrayPaintScale(0.0, 10.0);
        scale.getPaint(-5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPaintAboveUpperBound_throwsDueToBug() {
        // value สูงกว่า upperBound -> g เกิน 255 (เพราะ code ไม่ clamp จริง)
        // -> Color constructor throw IllegalArgumentException
        GrayPaintScale scale = new GrayPaintScale(0.0, 10.0);
        scale.getPaint(15.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPaintFarBelowLowerBound_throwsDueToBug() {
        Paint p = null;
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        // value ต่ำกว่ามาก -> g ติดลบมาก
        p = scale.getPaint(-100.0);
        // ไม่ควรมาถึงบรรทัดนี้ ถ้า exception ถูกโยนถูกต้อง
        fail("Expected IllegalArgumentException but got: " + p);
    }

    // ---------------------------------------------------------------
    // equals(Object) tests
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        assertTrue(defaultScale.equals(defaultScale));
    }

    @Test
    public void testEquals_null() {
        assertFalse(defaultScale.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        assertFalse(defaultScale.equals("Not a GrayPaintScale"));
    }

    @Test
    public void testEquals_equalBounds() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale1.equals(scale2));
        assertTrue(scale2.equals(scale1));
    }

    @Test
    public void testEquals_differentLowerBound() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.1, 1.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEquals_differentUpperBound() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 2.0);
        assertFalse(scale1.equals(scale2));
    }

    // ---------------------------------------------------------------
    // clone() tests
    // ---------------------------------------------------------------

    @Test
    public void testClone_notSameReferenceButEqual() throws CloneNotSupportedException {
        GrayPaintScale original = new GrayPaintScale(1.0, 5.0);
        Object clonedObj = original.clone();

        assertNotSame(original, clonedObj);
        assertTrue(clonedObj instanceof GrayPaintScale);

        GrayPaintScale cloned = (GrayPaintScale) clonedObj;
        assertEquals(original.getLowerBound(), cloned.getLowerBound(), 0.0000001);
        assertEquals(original.getUpperBound(), cloned.getUpperBound(), 0.0000001);
        assertTrue(original.equals(cloned));
    }
}
```

## ตารางสรุป Test coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor` | Constructor เปล่า → เรียก `this(0.0, 1.0)` |
| `testConstructorWithValidBounds` | Constructor(double,double) กรณี `lowerBound < upperBound` (else-path ของ if) |
| `testConstructorLowerEqualsUpper_throws` | if `lowerBound >= upperBound` → true (boundary: equal) |
| `testConstructorLowerGreaterThanUpper_throws` | if `lowerBound >= upperBound` → true (lower > upper) |
| `testGetLowerBound` | `getLowerBound()` return path |
| `testGetUpperBound` | `getUpperBound()` return path |
| `testGetPaintAtLowerBound_returnsBlack` | `getPaint()` ที่ value = lowerBound (boundary ต่ำสุด, g=0) |
| `testGetPaintAtUpperBound_returnsWhite` | `getPaint()` ที่ value = upperBound (boundary สูงสุด, g=255) |
| `testGetPaintAtMidPoint` | `getPaint()` ค่าอยู่กึ่งกลางช่วง default |
| `testGetPaintWithCustomBounds_midValue` | `getPaint()` ค่ากึ่งกลางกับ custom bounds |
| `testGetPaintBelowLowerBound_throwsDueToBug` | Fault detection: value < lowerBound → g ติดลบ → `Color` constructor throw (bug: v ไม่ถูกใช้จริง) |
| `testGetPaintAboveUpperBound_throwsDueToBug` | Fault detection: value > upperBound → g > 255 → `Color` constructor throw |
| `testGetPaintFarBelowLowerBound_throwsDueToBug` | Fault detection เพิ่มเติม กรณี value ต่ำกว่ามาก |
| `testEquals_sameInstance` | `equals()` เงื่อนไข `obj == this` → true |
| `testEquals_null` | `equals()` เงื่อนไข `!(obj instanceof GrayPaintScale)` เมื่อ obj=null |
| `testEquals_differentClass` | `equals()` เงื่อนไข `!(obj instanceof GrayPaintScale)` เมื่อ obj เป็นคลาสอื่น |
| `testEquals_equalBounds` | `equals()` ผ่านทุกเงื่อนไข → return true |
| `testEquals_differentLowerBound` | `equals()` เงื่อนไข `lowerBound != that.lowerBound` → true → return false |
| `testEquals_differentUpperBound` | `equals()` เงื่อนไข `upperBound != that.upperBound` → true → return false |
| `testClone_notSameReferenceButEqual` | `clone()` เรียก `super.clone()` และตรวจสอบผลลัพธ์ |

**หมายเหตุสำคัญ:** เทส `testGetPaintBelowLowerBound_throwsDueToBug`, `testGetPaintAboveUpperBound_throwsDueToBug`, และ `testGetPaintFarBelowLowerBound_throwsDueToBug` ถูกออกแบบมาเพื่อดักจับ **fault จริง** ในเมธอด `getPaint()` — ตัวแปร `v` ที่ทำการ clamp ค่าไม่ได้ถูกนำไปใช้คำนวณ `g` เลย (ยังใช้ `value` ดิบ) ทำให้เมื่อ input อยู่นอกขอบเขต จะเกิด `IllegalArgumentException` จาก `Color` constructor ซึ่งเป็นพฤติกรรมจริงของซอร์สที่ให้มา (Defects4J Chart-24 buggy version)
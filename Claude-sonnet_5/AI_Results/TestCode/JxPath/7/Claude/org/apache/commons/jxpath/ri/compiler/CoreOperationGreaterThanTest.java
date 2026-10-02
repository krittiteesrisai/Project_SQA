package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test สำหรับ CoreOperationGreaterThan (JxPath-7b)
 *
 * ใช้คลาส Constant (มีอยู่แล้วใน org.apache.commons.jxpath.ri.compiler)
 * เป็น Expression ที่คืนค่าคงที่เมื่อถูกเรียก computeValue()
 * เพื่อหลีกเลี่ยงการเดา behavior ของ abstract class Expression เอง
 *
 * EvalContext ส่งเป็น null ได้ เนื่องจาก Constant.computeValue()
 * ไม่มีการใช้งาน context (ไม่ได้ depend on context)
 */
public class CoreOperationGreaterThanTest {

    @Test
    public void testGetSymbol() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(1), new Constant(2));
        assertEquals(">", op.getSymbol());
    }

    // ---------- กรณีปกติ: l > r (branch TRUE) ----------

    @Test
    public void testLeftGreaterThanRight_ReturnsTrue() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(5), new Constant(3));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testNegativeNumbers_LeftGreater_ReturnsTrue() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(-1), new Constant(-5));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testDecimalValues_LeftGreater_ReturnsTrue() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(3.14), new Constant(3.13));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testStringNumericValues_LeftGreater_ReturnsTrue() {
        // คาดว่า InfoSetUtil.doubleValue จะแปลงสตริงตัวเลขเป็น double ได้
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("10"), new Constant("5"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    // ---------- กรณี l <= r (branch FALSE) ----------

    @Test
    public void testLeftLessThanRight_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(3), new Constant(5));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testNegativeNumbers_LeftLess_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(-5), new Constant(-1));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testDecimalValues_LeftLess_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(3.13), new Constant(3.14));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---------- กรณีขอบเขต (boundary): ค่าเท่ากัน ----------

    @Test
    public void testEqualValues_BoundaryReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(5), new Constant(5));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testZeroBoundary_ReturnsFalse() {
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(0), new Constant(0));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // ---------- กรณีอินพุตผิดรูปแบบ / ว่าง (เดาจาก behavior ที่น่าเป็นไปได้ของ NaN) ----------

    @Test
    public void testInvalidStringInput_LeftIsNaN_ReturnsFalse() {
        // สมมติฐาน: InfoSetUtil.doubleValue("abc") คืนค่า NaN
        // NaN > x จะเป็น false เสมอ ไม่ว่า x จะเป็นค่าใด
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("abc"), new Constant("5"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testInvalidStringInput_RightIsNaN_ReturnsFalse() {
        // สมมติฐาน: x > NaN เป็น false เสมอ
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("5"), new Constant("abc"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testEmptyStringInput_ReturnsFalse() {
        // สมมติฐาน: สตริงว่าง -> doubleValue คืน NaN เช่นเดียวกับ string ผิดรูปแบบ
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant(""), new Constant("1"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testBothInvalidStrings_ReturnsFalse() {
        // NaN > NaN ก็ควรเป็น false เสมอตามกฎ IEEE 754
        CoreOperationGreaterThan op =
            new CoreOperationGreaterThan(new Constant("abc"), new Constant("xyz"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }
}

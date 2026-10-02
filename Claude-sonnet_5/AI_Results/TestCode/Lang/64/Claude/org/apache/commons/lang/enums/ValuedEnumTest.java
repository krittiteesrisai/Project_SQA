package org.apache.commons.lang.enums;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link ValuedEnum}.
 *
 * NOTE: ValuedEnum เป็น abstract class ที่ extends org.apache.commons.lang.enums.Enum
 * ซึ่งไม่มี source ให้วิเคราะห์ในโจทย์นี้ ดังนั้นพฤติกรรมของ superclass (เช่น
 * Enum.getEnumList(Class), การ register instance ผ่าน constructor, getEnumClass())
 * ถูกสมมติ (ASSUMPTION) ตามตัวอย่างใน Javadoc ของ ValuedEnum เท่านั้น
 * ไม่ได้เดา behavior อื่นที่ไม่มีหลักฐานอ้างอิง
 */
public class ValuedEnumTest {

    /**
     * Enum subclass จำลองตามตัวอย่างใน Javadoc ของ ValuedEnum (JavaVersionEnum)
     */
    public static final class ColorEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        public static final int RED_VALUE = 0;
        public static final int GREEN_VALUE = 1;
        public static final int BLUE_VALUE = 2;

        public static final ColorEnum RED = new ColorEnum("Red", RED_VALUE);
        public static final ColorEnum GREEN = new ColorEnum("Green", GREEN_VALUE);
        public static final ColorEnum BLUE = new ColorEnum("Blue", BLUE_VALUE);

        private ColorEnum(String name, int value) {
            super(name, value);
        }
    }

    /**
     * ValuedEnum subclass อีกตัวที่ไม่เกี่ยวข้องกับ ColorEnum
     * ใช้ทดสอบ compareTo ข้าม subclass (โค้ดปัจจุบันไม่ validate ว่าเป็น type เดียวกัน)
     */
    public static final class ShapeEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        public static final int CIRCLE_VALUE = 5;
        public static final ShapeEnum CIRCLE = new ShapeEnum("Circle", CIRCLE_VALUE);

        private ShapeEnum(String name, int value) {
            super(name, value);
        }
    }

    /**
     * Enum subclass ที่ไม่มีการสร้าง instance ใด ๆ
     * ASSUMPTION: Enum.getEnumList(EmptyEnum.class) จะคืน list ที่ว่างเปล่า (ไม่ใช่ null)
     * เมื่อไม่มี instance ของ subclass นี้ถูก register เลย
     */
    public static final class EmptyEnum extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        private EmptyEnum(String name, int value) {
            super(name, value);
        }
    }

    // ---------------------------------------------------------
    // Constructor / getValue() / getName()
    // ---------------------------------------------------------

    @Test
    public void testConstructorSetsValueAndName() {
        assertEquals(0, ColorEnum.RED.getValue());
        assertEquals("Red", ColorEnum.RED.getName());
    }

    @Test
    public void testGetValueForAllInstances() {
        assertEquals(ColorEnum.RED_VALUE, ColorEnum.RED.getValue());
        assertEquals(ColorEnum.GREEN_VALUE, ColorEnum.GREEN.getValue());
        assertEquals(ColorEnum.BLUE_VALUE, ColorEnum.BLUE.getValue());
    }

    // ---------------------------------------------------------
    // getEnum(Class, int) — static protected method
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetEnumNullClassThrowsIllegalArgumentException() {
        // Branch: enumClass == null -> throw IllegalArgumentException
        ValuedEnum.getEnum(null, 0);
    }

    @Test
    public void testGetEnumFindsMatchOnFirstIteration() {
        // Branch: loop matches at first element (boundary value = 0)
        Enum result = ValuedEnum.getEnum(ColorEnum.class, ColorEnum.RED_VALUE);
        assertNotNull(result);
        assertSame(ColorEnum.RED, result);
    }

    @Test
    public void testGetEnumFindsMatchAfterSeveralIterations() {
        // Branch: loop ต้อง iterate ผ่าน element ที่ไม่ match ก่อนเจอ match
        Enum result = ValuedEnum.getEnum(ColorEnum.class, ColorEnum.BLUE_VALUE);
        assertNotNull(result);
        assertSame(ColorEnum.BLUE, result);
    }

    @Test
    public void testGetEnumNoMatchReturnsNull() {
        // Branch: loop วิ่งจบโดยไม่พบ match -> return null
        Enum result = ValuedEnum.getEnum(ColorEnum.class, 999);
        assertNull(result);
    }

    @Test
    public void testGetEnumNegativeValueNoMatchReturnsNull() {
        // Boundary / malformed input: ค่าติดลบไม่ควร match อะไรเลย
        Enum result = ValuedEnum.getEnum(ColorEnum.class, -1);
        assertNull(result);
    }

    @Test
    public void testGetEnumEmptyListReturnsNull() {
        // Branch: list ว่าง -> loop ไม่ execute เลย -> return null
        Enum result = ValuedEnum.getEnum(EmptyEnum.class, 0);
        assertNull(result);
    }

    // ---------------------------------------------------------
    // compareTo(Object)
    // ---------------------------------------------------------

    @Test
    public void testCompareToLessThan() {
        int result = ColorEnum.RED.compareTo(ColorEnum.GREEN);
        assertTrue("Expected negative result", result < 0);
    }

    @Test
    public void testCompareToGreaterThan() {
        int result = ColorEnum.BLUE.compareTo(ColorEnum.RED);
        assertTrue("Expected positive result", result > 0);
    }

    @Test
    public void testCompareToEqual() {
        int result = ColorEnum.GREEN.compareTo(ColorEnum.GREEN);
        assertEquals(0, result);
    }

    @Test(expected = NullPointerException.class)
    public void testCompareToNullThrowsNullPointerException() {
        // other == null -> NPE จากการ cast/dereference (((ValuedEnum) other).iValue)
        ColorEnum.RED.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareToNonValuedEnumThrowsClassCastException() {
        // other ไม่ใช่ ValuedEnum เลย -> cast ล้มเหลว
        ColorEnum.RED.compareTo("not a ValuedEnum");
    }

    @Test
    public void testCompareToAcrossDifferentValuedEnumSubclasses() {
        // หมายเหตุ: โค้ดปัจจุบันไม่ตรวจสอบว่า other เป็น ValuedEnum subclass เดียวกันหรือไม่
        // เพียง cast เป็น ValuedEnum แล้วคำนวณผลต่างของ iValue เท่านั้น
        // เทสนี้บันทึก (document) พฤติกรรมที่สังเกตได้จริง ไม่ได้ยืนยันว่าถูกต้องตาม design
        int result = ColorEnum.BLUE.compareTo(ShapeEnum.CIRCLE);
        assertEquals(ColorEnum.BLUE_VALUE - ShapeEnum.CIRCLE_VALUE, result);
    }

    // ---------------------------------------------------------
    // toString()
    // ---------------------------------------------------------

    @Test
    public void testToStringContainsNameAndValue() {
        // Branch: iToString == null -> true -> คำนวณใหม่
        String str = ColorEnum.RED.toString();
        assertNotNull(str);
        assertTrue(str.contains("Red=0"));
    }

    @Test
    public void testToStringIsCachedOnSecondCall() {
        // First call: iToString == null -> true -> compute + cache
        String first = ColorEnum.GREEN.toString();
        // Second call: iToString == null -> false -> return cached reference
        String second = ColorEnum.GREEN.toString();
        assertEquals(first, second);
        assertSame("Expected same cached String instance", first, second);
    }

    @Test
    public void testToStringDifferentInstancesProduceDifferentStrings() {
        String redStr = ColorEnum.RED.toString();
        String blueStr = ColorEnum.BLUE.toString();
        assertNotEquals(redStr, blueStr);
    }
}

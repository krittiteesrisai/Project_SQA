package org.apache.commons.math.stat;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;

public class FrequencyTest {

    private Frequency frequency;

    @Before
    public void setUp() {
        frequency = new Frequency();
    }

    @Test
    public void testAddValueTypesAndOverloads() {
        // ทดสอบการเพิ่มค่าหลากหลาย Type ครอบคลุม int, long, Integer, Long, char, Character และ Object
        frequency.addValue(1);          // int
        frequency.addValue(Integer.valueOf(2)); // Integer
        frequency.addValue(3L);         // long
        frequency.addValue(Long.valueOf(4L)); // Long
        frequency.addValue('a');        // char
        frequency.addValue(Character.valueOf('b')); // Character
        frequency.addValue((Object) 5L); // Object ที่เป็น Comparable

        assertEquals(1L, frequency.getCount(1));
        assertEquals(1L, frequency.getCount(2L));
        assertEquals(1L, frequency.getCount(3));
        assertEquals(1L, frequency.getCount(4));
        assertEquals(1L, frequency.getCount('a'));
        assertEquals(1L, frequency.getCount('b'));
        assertEquals(1L, frequency.getCount(5L));
        assertEquals(7L, frequency.getSumFreq());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueNonComparable() {
        // Edge Case: ส่ง Object ที่ไม่ implement Comparable เข้าไป
        frequency.addValue(new Object());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueTypeMismatch() {
        // Edge Case: ผสมประเภทข้อมูลที่ไม่สามารถเทียบเคียงกันได้ (Long กับ String)
        frequency.addValue(10L);
        frequency.addValue("NotAComparableNumber");
    }

    @Test
    public void testGetCountEdgeCases() {
        // ทดสอบ getCount เมื่อยังไม่มีข้อมูล และค้นหาค่าที่ไม่มีอยู่จริง หรือเทียบชนิดไม่ได้
        assertEquals(0L, frequency.getCount(100));
        assertEquals(0L, frequency.getCount('z'));
        
        frequency.addValue(10);
        assertEquals(1L, frequency.getCount(10));
        assertEquals(0L, frequency.getCount(20)); // ค่าไม่มีในตาราง
        assertEquals(0L, frequency.getCount("IncompatibleType")); // ClassCastException ต้องถูก catch และคืนค่า 0
    }

    @Test
    public void testGetPctEmptyAndNormal() {
        // Edge Case: ตารางว่างต้องคืนค่า NaN
        assertTrue(Double.isNaN(frequency.getPct(10)));
        assertTrue(Double.isNaN(frequency.getPct(10L)));
        assertTrue(Double.isNaN(frequency.getPct('a')));

        frequency.addValue(10);
        frequency.addValue(10);
        frequency.addValue(20);

        // ทดสอบ Pct ปกติ (รวม int, long overload)
        assertEquals(2.0 / 3.0, frequency.getPct(10), 0.0001);
        assertEquals(2.0 / 3.0, frequency.getPct(10L), 0.0001);
        assertEquals(1.0 / 3.0, frequency.getPct(20), 0.0001);
        assertEquals(0.0, frequency.getPct(30), 0.0001); // ไม่มีค่านี้
        assertTrue(Double.isNaN(frequency.getPct("String"))); // เปรียบเทียบไม่ได้
    }

    @Test
    public void testGetCumFreqBranches() {
        // ตารางว่าง คืนค่า 0
        assertEquals(0L, frequency.getCumFreq(10));

        frequency.addValue(10);
        frequency.addValue(20);
        frequency.addValue(30);
        frequency.addValue(30);

        // 1. v น้อยกว่าค่าแรกสุด (< 10) -> คืนค่า 0
        assertEquals(0L, frequency.getCumFreq(5));

        // 2. v เท่ากับหรือมากกว่าค่าสุดท้าย (>= 30) -> คืนค่า sumFreq (5)
        assertEquals(4L, frequency.getCumFreq(30));
        assertEquals(4L, frequency.getCumFreq(40));

        // 3. v อยู่ตรงกลาง (เช่น 20) -> สะสมค่าถึงจุดนั้น
        assertEquals(3L, frequency.getCumFreq(20));

        // 4. v เทียบเคียงไม่ได้ -> คืนค่า 0
        assertEquals(0L, frequency.getCumFreq("Invalid"));
    }

    @Test
    public void testGetCumPctEdgeCases() {
        // ตารางว่าง คืนค่า NaN
        assertTrue(Double.isNaN(frequency.getCumPct(10)));

        frequency.addValue(10);
        frequency.addValue(20);

        // ค่าน้อยกว่าค่าแรกสุด คืน 0.0
        assertEquals(0.0, frequency.getCumPct(5), 0.0001);
        // ค่ามากกว่าค่าสุดท้าย คืน 1.0
        assertEquals(1.0, frequency.getCumPct(30), 0.0001);
        // ค่าปกติ
        assertEquals(0.5, frequency.getCumPct(10), 0.0001);
        // เทียบเคียงไม่ได้ คืน 0.0
        assertEquals(0.0, frequency.getCumPct("Invalid"), 0.0001);
    }

    @Test
    public void testCustomComparatorConstructor() {
        // ทดสอบ Constructor ที่รับ Comparator แบบกำหนดเอง (Reverse Order)
        Comparator<Comparable<?>> reverseComparator = new Comparator<Comparable<?>>() {
            @SuppressWarnings({ "rawtypes", "unchecked" })
            @Override
            public int compare(Comparable o1, Comparable o2) {
                return o2.compareTo(o1);
            }
        };

        Frequency revFreq = new Frequency(reverseComparator);
        revFreq.addValue(10);
        revFreq.addValue(20);

        // ตรวจสอบการทำงานร่วมกับ Custom Comparator ใน CumFreq
        assertEquals(2L, revFreq.getSumFreq());
        assertEquals(1L, revFreq.getCount(10));
    }

    @Test
    public void testClearAndValuesIterator() {
        frequency.addValue(1);
        frequency.addValue(2);
        assertFalse(!frequency.valuesIterator().hasNext());

        frequency.clear();
        assertEquals(0L, frequency.getSumFreq());
        assertFalse(frequency.valuesIterator().hasNext());
    }

    @Test
    public void testToStringAndEqualsAndHashCode() {
        frequency.addValue(10);
        
        Frequency freq2 = new Frequency();
        freq2.addValue(10);

        Frequency freq3 = new Frequency();
        freq3.addValue(20);

        // ทดสอบ equals และ hashCode
        assertTrue(frequency.equals(frequency)); // reflexive
        assertTrue(frequency.equals(freq2));
        assertFalse(frequency.equals(null));
        assertFalse(frequency.equals("SomeString"));
        assertFalse(frequency.equals(freq3));
        assertEquals(frequency.hashCode(), freq2.hashCode());

        // ทดสอบ toString ไม่เป็น null และมีข้อมูล
        assertNotNull(frequency.toString());
        assertTrue(frequency.toString().contains("10"));
    }
}
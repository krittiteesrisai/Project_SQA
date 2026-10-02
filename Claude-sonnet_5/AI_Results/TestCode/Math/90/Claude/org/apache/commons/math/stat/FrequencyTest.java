package org.apache.commons.math.stat;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

/**
 * Unit tests for org.apache.commons.math.stat.Frequency
 * เป้าหมาย: ครอบคลุม branch/condition ของทุกเมธอดใน Frequency ให้มากที่สุด
 */
public class FrequencyTest {

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructorEmpty() {
        Frequency f = new Frequency();
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(1));
        assertTrue(Double.isNaN(f.getPct(1)));
    }

    // ---------------------------------------------------------------
    // addValue(Object) [deprecated] branches
    // ---------------------------------------------------------------

    @Test
    public void testAddValueObjectIntegerConversionBranch() {
        // v instanceof Integer -> branch true, converted to Long
        Frequency f = new Frequency();
        f.addValue((Object) Integer.valueOf(7));
        assertEquals(1L, f.getCount(7));
    }

    @Test
    public void testAddValueObjectNonIntegerBranch() {
        // v instanceof Integer -> branch false (String kept as-is)
        Frequency f = new Frequency();
        f.addValue((Object) "apple");
        assertEquals(1L, f.getCount("apple"));
    }

    @Test
    public void testAddValueSameValueIncrementsCount() {
        // ครอบคลุมทั้ง count==null (first put) และ count!=null (increment) branch
        Frequency f = new Frequency();
        f.addValue(5);
        f.addValue(5);
        f.addValue(5);
        assertEquals(3L, f.getCount(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueNonComparableThrowsIllegalArgumentException() {
        // ClassCastException ภายใน catch -> แปลงเป็น IllegalArgumentException
        Frequency f = new Frequency();
        f.addValue("apple");
        f.addValue(5); // Long vs String -> CCE ภายใน TreeMap.put
    }

    // ---------------------------------------------------------------
    // addValue(int/Integer/long/char) overloads
    // ---------------------------------------------------------------

    @Test
    public void testAddValueIntOverload() {
        Frequency f = new Frequency();
        f.addValue(10);
        assertEquals(1L, f.getCount(10));
    }

    @Test
    public void testAddValueIntegerOverload() {
        Frequency f = new Frequency();
        f.addValue(Integer.valueOf(20));
        assertEquals(1L, f.getCount(20));
    }

    @Test
    public void testAddValueLongOverload() {
        Frequency f = new Frequency();
        f.addValue(30L);
        assertEquals(1L, f.getCount(30L));
    }

    @Test
    public void testAddValueCharOverload() {
        Frequency f = new Frequency();
        f.addValue('a');
        assertEquals(1L, f.getCount('a'));
    }

    // ---------------------------------------------------------------
    // clear() and valuesIterator()
    // ---------------------------------------------------------------

    @Test
    public void testClearResetsFrequency() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testValuesIteratorOrder() {
        Frequency f = new Frequency();
        f.addValue(3);
        f.addValue(1);
        f.addValue(2);
        Iterator it = f.valuesIterator();
        assertEquals(1L, ((Long) it.next()).longValue());
        assertEquals(2L, ((Long) it.next()).longValue());
        assertEquals(3L, ((Long) it.next()).longValue());
        assertFalse(it.hasNext());
    }

    // ---------------------------------------------------------------
    // getSumFreq()
    // ---------------------------------------------------------------

    @Test
    public void testGetSumFreqEmpty() {
        Frequency f = new Frequency();
        assertEquals(0L, f.getSumFreq());
    }

    @Test
    public void testGetSumFreqMultipleValues() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(3L, f.getSumFreq());
    }

    // ---------------------------------------------------------------
    // getCount(Object) / overloads
    // ---------------------------------------------------------------

    @Test
    public void testGetCountObjectIntegerBranch() {
        Frequency f = new Frequency();
        f.addValue(5);
        assertEquals(1L, f.getCount((Object) Integer.valueOf(5)));
    }

    @Test
    public void testGetCountObjectValueNotFoundReturnsZero() {
        Frequency f = new Frequency();
        f.addValue(1);
        assertEquals(0L, f.getCount(2));
    }

    @Test
    public void testGetCountObjectNonComparableReturnsZero() {
        // ClassCastException ภายใน getCount(Object) -> ignore, return 0
        Frequency f = new Frequency();
        f.addValue(1);
        assertEquals(0L, f.getCount("not comparable to Long"));
    }

    @Test
    public void testGetCountIntLongCharOverloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1L);
        f.addValue('x');
        assertEquals(2L, f.getCount(1));
        assertEquals(2L, f.getCount(1L));
        assertEquals(1L, f.getCount('x'));
    }

    // ---------------------------------------------------------------
    // getPct(Object) / overloads
    // ---------------------------------------------------------------

    @Test
    public void testGetPctEmptyReturnsNaN() {
        Frequency f = new Frequency();
        assertTrue(Double.isNaN(f.getPct(1)));
    }

    @Test
    public void testGetPctNormal() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(2.0 / 3.0, f.getPct(1), 1e-9);
        assertEquals(1.0 / 3.0, f.getPct(2), 1e-9);
    }

    @Test
    public void testGetPctIntLongCharOverloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue('a');
        assertEquals(0.5, f.getPct(1), 1e-9);
        assertEquals(0.5, f.getPct(1L), 1e-9);
        assertEquals(0.5, f.getPct('a'), 1e-9);
    }

    // ---------------------------------------------------------------
    // getCumFreq(Object) / overloads -- ครอบคลุมทุก branch
    // ---------------------------------------------------------------

    @Test
    public void testGetCumFreqEmptyReturnsZero() {
        // sumFreq == 0 -> return 0
        Frequency f = new Frequency();
        assertEquals(0L, f.getCumFreq(5));
    }

    @Test
    public void testGetCumFreqIntegerBranch() {
        // v instanceof Integer -> recurse ด้วย long
        Frequency f = new Frequency();
        f.addValue(5);
        assertEquals(1L, f.getCumFreq((Object) Integer.valueOf(5)));
    }

    @Test
    public void testGetCumFreqLessThanFirstReturnsZero() {
        // c.compare(v, firstKey) < 0 -> return 0
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(5);
        f.addValue(10);
        assertEquals(0L, f.getCumFreq(0));
    }

    @Test
    public void testGetCumFreqGreaterOrEqualLastReturnsSumFreq() {
        // c.compare(v, lastKey) >= 0 -> return sumFreq
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(5);
        f.addValue(10);
        assertEquals(f.getSumFreq(), f.getCumFreq(10));
        assertEquals(f.getSumFreq(), f.getCumFreq(999)); // ทดสอบค่ามากกว่า last ด้วย
    }

    @Test
    public void testGetCumFreqMiddleValueNotPresent() {
        // ค่าที่ query ไม่อยู่ใน map, อยู่กึ่งกลาง -> loop สะสมหลายรอบ, จบด้วย else-branch
        Frequency f = new Frequency();
        f.addValue(1); // x2
        f.addValue(1);
        f.addValue(5); // x3
        f.addValue(5);
        f.addValue(5);
        f.addValue(10); // x4
        f.addValue(10);
        f.addValue(10);
        f.addValue(10);
        // getCumFreq(7): count(1)+count(5) = 2+3 = 5
        assertEquals(5L, f.getCumFreq(7));
    }

    @Test
    public void testGetCumFreqValuePresentFirst() {
        // ค่าที่ query อยู่ใน map พอดีเป็นค่าแรก -> else-branch คืนค่าทันที (loop รอบแรก)
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(5);
        f.addValue(10);
        assertEquals(2L, f.getCumFreq(1));
    }

    @Test
    public void testGetCumFreqNonComparableReturnsZero() {
        // ClassCastException ภายใน try -> catch -> return 0 (v is not comparable)
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        assertEquals(0L, f.getCumFreq("not comparable to Long"));
    }

    @Test
    public void testGetCumFreqIntLongCharOverloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue('a');
        f.addValue('b');
        assertEquals(1L, f.getCumFreq(1));
        assertEquals(2L, f.getCumFreq(2L));
        assertEquals(1L, f.getCumFreq('a'));
        assertEquals(2L, f.getCumFreq('b'));
    }

    @Test
    public void testGetCumFreqWithCustomComparatorNonNullBranch() {
        // ใช้ comparator ที่ไม่เป็น null -> ข้าม branch การสร้าง NaturalComparator
        Comparator reverseComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) o2).compareTo(o1); // reverse natural order
            }
        };
        Frequency f = new Frequency(reverseComparator);
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        // ภายใต้ reverse order: iteration order คือ 3,2,1 (3 ถือเป็น "น้อยที่สุด")
        // getCumFreq(2): result(init=count(2)=1) + count(3)=1 เมื่อ compare(2,3)>0 ตาม comparator นี้ -> 2
        assertEquals(2L, f.getCumFreq(2));
    }

    // ---------------------------------------------------------------
    // getCumPct(Object) / overloads
    // ---------------------------------------------------------------

    @Test
    public void testGetCumPctEmptyReturnsNaN() {
        Frequency f = new Frequency();
        assertTrue(Double.isNaN(f.getCumPct(1)));
    }

    @Test
    public void testGetCumPctNormal() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        f.addValue(4);
        // cumFreq(2)=2, sumFreq=4 -> 0.5
        assertEquals(0.5, f.getCumPct(2), 1e-9);
    }

    @Test
    public void testGetCumPctNonComparableReturnsZero() {
        // sumFreq != 0 แต่ v ไม่ comparable -> getCumFreq คืน 0 -> getCumPct คืน 0
        Frequency f = new Frequency();
        f.addValue(1);
        assertEquals(0.0, f.getCumPct("non comparable"), 1e-9);
    }

    @Test
    public void testGetCumPctIntLongCharOverloads() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue('a');
        assertEquals(0.5, f.getCumPct(1), 1e-9);
        assertEquals(0.5, f.getCumPct(1L), 1e-9);
        // 'a' > 1 ในการเปรียบเทียบ natural order ไม่ได้ (คนละ type) แต่เนื่องจาก
        // เราเพิ่มแยก key กันคนละชนิด (Long กับ Character) การ query 'a' จะ throw CCE
        // ภายในและ return 0 ตาม branch non-comparable
        assertEquals(0.0, f.getCumPct('a'), 1e-9);
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToStringEmpty() {
        Frequency f = new Frequency();
        String s = f.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

    @Test
    public void testToStringWithValues() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        String s = f.toString();
        assertNotNull(s);
        assertTrue(s.contains("Value"));
        assertTrue(s.contains("1"));
        assertTrue(s.contains("2"));
    }
}

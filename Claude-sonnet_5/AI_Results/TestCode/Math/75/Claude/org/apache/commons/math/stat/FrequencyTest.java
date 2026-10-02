package org.apache.commons.math.stat;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 tests for org.apache.commons.math.stat.Frequency (Defects4J: Math-75b)
 *
 * หมายเหตุ: บาง behavior ในซอร์ส (เช่น getPct(Object) ที่เรียก getCumPct ภายใน)
 * ดูเหมือนจะเป็นข้อบกพร่อง (bug) แต่ตาม requirement ห้ามเดา behavior ที่ไม่มีในซอร์ส
 * จึงทดสอบตาม logic จริงที่เขียนไว้ และคอมเมนต์กำกับไว้ให้ชัดเจน
 */
public class FrequencyTest {

    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    // ---------- helper class: Comparable แต่ไม่ compatible กับ String/Integer ----------
    private static class Foo implements Comparable<Foo> {
        public int compareTo(Foo o) {
            return 0;
        }
    }

    // ---------- helper class: ไม่ implement Comparable เลย ----------
    private static class NotComparable {
    }

    // =====================================================================
    // Constructor tests
    // =====================================================================

    @Test
    public void testDefaultConstructorEmpty() {
        assertEquals(0L, f.getSumFreq());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testComparatorConstructor() {
        Comparator<Long> reverse = new Comparator<Long>() {
            public int compare(Long a, Long b) {
                return b.compareTo(a);
            }
        };
        Frequency fc = new Frequency(reverse);
        fc.addValue(1);
        fc.addValue(2);
        Iterator<Comparable<?>> it = fc.valuesIterator();
        // reverse order -> first should be 2
        assertEquals(Long.valueOf(2), it.next());
        assertEquals(Long.valueOf(1), it.next());
    }

    // =====================================================================
    // addValue(Object) [deprecated] - instanceof Comparable branch true/false
    // =====================================================================

    @Test
    public void testAddValueObjectComparable() {
        f.addValue((Object) Integer.valueOf(5));
        assertEquals(1L, f.getCount(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueObjectNotComparableThrows() {
        f.addValue((Object) new NotComparable());
    }

    // =====================================================================
    // addValue(Comparable) - instanceof Integer branch, count null/not null,
    // ClassCastException branch
    // =====================================================================

    @Test
    public void testAddValueIntegerConvertedToLong() {
        // Integer ถูกแปลงเป็น Long ภายใน -> ต้องนับรวมกับ addValue(int)/addValue(long)
        f.addValue((Comparable<?>) Integer.valueOf(3));
        f.addValue(3L);
        assertEquals(2L, f.getCount(3));
    }

    @Test
    public void testAddValueCountNullBranch() {
        // ค่าแรกที่ใส่ -> count==null -> put(1)
        f.addValue(10);
        assertEquals(1L, f.getCount(10));
    }

    @Test
    public void testAddValueCountExistingBranch() {
        // ใส่ซ้ำ -> count!=null -> count+1
        f.addValue(10);
        f.addValue(10);
        assertEquals(2L, f.getCount(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueClassCastExceptionThrows() {
        f.addValue("a");
        // Foo ไม่ compatible กับ String -> ClassCastException ภายใน TreeMap
        f.addValue(new Foo());
    }

    // =====================================================================
    // addValue overloads: int, Integer(deprecated), long, char
    // =====================================================================

    @Test
    public void testAddValueIntLongCharUnifyProperly() {
        f.addValue(1);       // int
        f.addValue(1L);      // long
        f.addValue(Integer.valueOf(1)); // deprecated Integer overload
        assertEquals(3L, f.getCount(1));
    }

    @Test
    public void testAddValueCharStoredSeparately() {
        f.addValue('a');
        assertEquals(1L, f.getCount('a'));
        // char ไม่ comparable กับ int/Long ตาม javadoc
        assertEquals(0L, f.getCount(97)); // 'a' == 97 แต่คนละ type จึงไม่ match
    }

    // =====================================================================
    // clear() / valuesIterator()
    // =====================================================================

    @Test
    public void testClear() {
        f.addValue(1);
        f.addValue(2);
        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testValuesIteratorOrder() {
        f.addValue(3);
        f.addValue(1);
        f.addValue(2);
        Iterator<Comparable<?>> it = f.valuesIterator();
        assertEquals(Long.valueOf(1), it.next());
        assertEquals(Long.valueOf(2), it.next());
        assertEquals(Long.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

    // =====================================================================
    // getSumFreq() - loop: 0 iterations, multiple iterations
    // =====================================================================

    @Test
    public void testGetSumFreqEmpty() {
        assertEquals(0L, f.getSumFreq());
    }

    @Test
    public void testGetSumFreqMultiple() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        assertEquals(3L, f.getSumFreq());
    }

    // =====================================================================
    // getCount(...) overloads
    // =====================================================================

    @Test
    public void testGetCountObjectDeprecated() {
        f.addValue(5);
        assertEquals(1L, f.getCount((Object) Long.valueOf(5)));
    }

    @Test
    public void testGetCountComparableIntegerBranch() {
        f.addValue(7);
        // เรียกผ่าน Comparable overload ด้วย Integer -> เข้า branch instanceof Integer
        assertEquals(1L, f.getCount((Comparable<?>) Integer.valueOf(7)));
    }

    @Test
    public void testGetCountNotFoundReturnsZero() {
        f.addValue(1);
        assertEquals(0L, f.getCount(999));
    }

    @Test
    public void testGetCountClassCastExceptionReturnsZero() {
        f.addValue("a");
        // Foo ไม่ compatible กับ String -> ClassCastException ถูก catch คืน 0
        assertEquals(0L, f.getCount(new Foo()));
    }

    @Test
    public void testGetCountIntLongChar() {
        f.addValue(4);
        f.addValue('x');
        assertEquals(1L, f.getCount(4));
        assertEquals(1L, f.getCount(4L));
        assertEquals(1L, f.getCount('x'));
    }

    // =====================================================================
    // getPct(...) - sumFreq==0 branch (NaN) vs normal branch
    // =====================================================================

    @Test
    public void testGetPctEmptyReturnsNaN() {
        assertTrue(Double.isNaN(f.getPct(1)));
    }

    @Test
    public void testGetPctNormal() {
        f.addValue(1);
        f.addValue(2);
        assertEquals(0.5d, f.getPct(1), 1e-9);
        assertEquals(0.5d, f.getPct(2), 1e-9);
    }

    @Test
    public void testGetPctCharAndLong() {
        f.addValue('a');
        f.addValue('a');
        f.addValue('b');
        assertEquals(2.0d / 3.0d, f.getPct('a'), 1e-9);
        f.clear();
        f.addValue(1L);
        f.addValue(2L);
        assertEquals(0.5d, f.getPct(1L), 1e-9);
    }

    @Test
    public void testGetPctObjectDeprecatedDelegatesToCumPct() {
        // หมายเหตุสำคัญ: ตามซอร์สจริง getPct(Object) เรียก getCumPct ภายใน (ไม่ใช่ getPct)
        // จึงไม่ใช่ simple percentage แต่เป็น cumulative percentage - ทดสอบตาม behavior จริง
        f.addValue(1);
        f.addValue(2);
        double result = f.getPct((Object) Long.valueOf(1));
        double expectedCumPct = f.getCumPct(1); // ควรเท่ากับ cumPct ไม่ใช่ pct ปกติ
        assertEquals(expectedCumPct, result, 1e-9);
    }

    // =====================================================================
    // getCumFreq(...) - sumFreq==0, instanceof Integer, ClassCastException,
    // compare<firstKey, compare>=lastKey, loop (>0 / else)
    // =====================================================================

    @Test
    public void testGetCumFreqEmptyReturnsZero() {
        assertEquals(0L, f.getCumFreq(5));
    }

    @Test
    public void testGetCumFreqIntegerBranch() {
        f.addValue(1);
        f.addValue(2);
        // เรียกผ่าน Comparable overload ด้วย Integer -> instanceof Integer branch
        long result = f.getCumFreq((Comparable<?>) Integer.valueOf(1));
        assertEquals(1L, result);
    }

    @Test
    public void testGetCumFreqClassCastExceptionReturnsZero() {
        f.addValue("a");
        f.addValue("b");
        // sumFreq != 0 แล้ว, Foo ไม่ comparable กับ String -> catch คืน 0 ทันที
        assertEquals(0L, f.getCumFreq(new Foo()));
    }

    @Test
    public void testGetCumFreqLessThanFirstKeyReturnsZero() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        f.addValue(3);
        assertEquals(0L, f.getCumFreq(0)); // น้อยกว่า firstKey=1
    }

    @Test
    public void testGetCumFreqGreaterOrEqualLastKeyReturnsSumFreq() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        f.addValue(3);
        long sum = f.getSumFreq();
        assertEquals(sum, f.getCumFreq(3)); // == lastKey
        assertEquals(sum, f.getCumFreq(10)); // > lastKey
    }

    @Test
    public void testGetCumFreqLoopAccumulationBranches() {
        // ข้อมูล: 1(x1), 2(x2), 3(x1) -> sumFreq=4
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        f.addValue(3);

        // v=1: loop แรก compare(1,1)=0 -> else branch -> return result(=count(1)=1)
        assertEquals(1L, f.getCumFreq(1));

        // v=2: loop nextValue=1 -> compare(2,1)>0 -> accumulate (+count(1))
        //      nextValue=2 -> compare(2,2)=0 -> else branch -> return
        assertEquals(3L, f.getCumFreq(2));
    }

    @Test
    public void testGetCumFreqIntLongChar() {
        f.addValue(1);
        f.addValue(2);
        assertEquals(f.getCumFreq(1L), f.getCumFreq(1));
        f.clear();
        f.addValue('a');
        f.addValue('b');
        assertTrue(f.getCumFreq('b') >= f.getCumFreq('a'));
    }

    @Test
    public void testGetCumFreqObjectDeprecated() {
        f.addValue(1);
        f.addValue(2);
        assertEquals(f.getCumFreq(1), f.getCumFreq((Object) Long.valueOf(1)));
    }

    // =====================================================================
    // getCumPct(...) - sumFreq==0 (NaN) vs normal
    // =====================================================================

    @Test
    public void testGetCumPctEmptyReturnsNaN() {
        assertTrue(Double.isNaN(f.getCumPct(1)));
    }

    @Test
    public void testGetCumPctNormal() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        f.addValue(3);
        assertEquals(0.25d, f.getCumPct(1), 1e-9);
        assertEquals(0.75d, f.getCumPct(2), 1e-9);
        assertEquals(1.0d, f.getCumPct(3), 1e-9);
    }

    @Test
    public void testGetCumPctIntLongChar() {
        f.addValue(1);
        f.addValue(2);
        assertEquals(f.getCumPct(1L), f.getCumPct(1), 1e-9);
        f.clear();
        f.addValue('a');
        f.addValue('b');
        assertTrue(f.getCumPct('b') >= f.getCumPct('a'));
    }

    @Test
    public void testGetCumPctObjectDeprecated() {
        f.addValue(1);
        f.addValue(2);
        assertEquals(f.getCumPct(1), f.getCumPct((Object) Long.valueOf(1)), 1e-9);
    }

    // =====================================================================
    // toString()
    // =====================================================================

    @Test
    public void testToStringEmpty() {
        String s = f.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        // ไม่มี loop iteration เพิ่มเติม -> เหลือแค่ header
        assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", s);
    }

    @Test
    public void testToStringNonEmpty() {
        f.addValue(1);
        f.addValue(2);
        String s = f.toString();
        assertNotNull(s);
        assertTrue(s.contains("1"));
        assertTrue(s.contains("2"));
        assertTrue(s.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

    // =====================================================================
    // equals() / hashCode()
    // =====================================================================

    @Test
    public void testEqualsSameReference() {
        assertTrue(f.equals(f));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(f.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(f.equals("not a frequency"));
    }

    @Test
    public void testEqualsSameContent() {
        Frequency f1 = new Frequency();
        Frequency f2 = new Frequency();
        f1.addValue(1);
        f2.addValue(1);
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testEqualsDifferentContent() {
        Frequency f1 = new Frequency();
        Frequency f2 = new Frequency();
        f1.addValue(1);
        f2.addValue(2);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testHashCodeConsistent() {
        f.addValue(1);
        int h1 = f.hashCode();
        int h2 = f.hashCode();
        assertEquals(h1, h2);
    }
}

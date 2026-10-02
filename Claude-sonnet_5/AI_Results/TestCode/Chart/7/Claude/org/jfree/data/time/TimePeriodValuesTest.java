package org.jfree.data.time;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for org.jfree.data.time.TimePeriodValues (Chart-7b)
 *
 * หมายเหตุทั่วไป:
 * - ใช้ SimpleTimePeriod (มีอยู่ใน org.jfree.data.time) เพื่อควบคุมค่า start/end millis
 *   ได้แม่นยำสำหรับทดสอบ updateBounds()
 * - บางเทส (testUpdateBounds_MaxMiddleIndex_KnownBug) เขียนตาม "พฤติกรรมที่ถูกต้องตาม Javadoc"
 *   ซึ่งคาดว่าจะ FAIL บนซอร์ส Chart-7b ที่มีบั๊ก (ตาม changelog ของคลาสเอง) — เป็นความตั้งใจ
 *   เพื่อดักจับ fault ตามข้อกำหนด
 */
public class TimePeriodValuesTest {

    private TimePeriodValues series;

    @Before
    public void setUp() {
        series = new TimePeriodValues("Test Series");
    }

    private TimePeriod period(long startMillis, long endMillis) {
        return new SimpleTimePeriod(new Date(startMillis), new Date(endMillis));
    }

    // ---------------------------------------------------------------
    // Constructors / description getter-setter
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_DefaultDescriptions() {
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testConstructor_CustomDescriptions() {
        TimePeriodValues s = new TimePeriodValues("S", "Domain-X", "Range-Y");
        assertEquals("Domain-X", s.getDomainDescription());
        assertEquals("Range-Y", s.getRangeDescription());
    }

    @Test
    public void testSetDomainDescription() {
        series.setDomainDescription("NewDomain");
        assertEquals("NewDomain", series.getDomainDescription());
        // boundary: null permitted ตาม Javadoc
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription() {
        series.setRangeDescription("NewRange");
        assertEquals("NewRange", series.getRangeDescription());
        series.setRangeDescription(null);
        assertNull(series.getRangeDescription());
    }

    @Test
    public void testInitialIndices_EmptySeries() {
        assertEquals(-1, series.getMinStartIndex());
        assertEquals(-1, series.getMaxStartIndex());
        assertEquals(-1, series.getMinMiddleIndex());
        assertEquals(-1, series.getMaxMiddleIndex());
        assertEquals(-1, series.getMinEndIndex());
        assertEquals(-1, series.getMaxEndIndex());
    }

    // ---------------------------------------------------------------
    // add()
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullItem_ThrowsException() {
        series.add((TimePeriodValue) null);
    }

    @Test
    public void testAdd_SingleItem_UpdatesAllIndicesToZero() {
        TimePeriodValue item = new TimePeriodValue(period(1000L, 2000L), 42.0);
        series.add(item);

        assertEquals(1, series.getItemCount());
        assertEquals(item.getPeriod(), series.getTimePeriod(0));
        assertEquals(42.0, series.getValue(0).doubleValue(), 0.0001);

        // first item -> ทุก index ต้องชี้ที่ 0 (ผ่านสาขา else ของทุก if ใน updateBounds)
        assertEquals(0, series.getMinStartIndex());
        assertEquals(0, series.getMaxStartIndex());
        assertEquals(0, series.getMinMiddleIndex());
        assertEquals(0, series.getMaxMiddleIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(0, series.getMaxEndIndex());
    }

    @Test
    public void testAdd_PeriodDoubleOverload() {
        series.add(period(0L, 100L), 3.14);
        assertEquals(1, series.getItemCount());
        assertEquals(3.14, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_PeriodNumberOverload_NullValueAllowed() {
        // Javadoc: value permitted null
        series.add(period(0L, 100L), (Number) null);
        assertEquals(1, series.getItemCount());
        assertNull(series.getValue(0));
    }

    // ---------------------------------------------------------------
    // updateBounds() ผ่าน add() - ครอบคลุม if/else ของ start/middle/end
    // ---------------------------------------------------------------

    @Test
    public void testUpdateBounds_StartMiddleEndIndices_ThreeItems() {
        // A: start=1000,end=5000 (mid=3000)
        // B: start=500, end=6000 (mid=3250)
        // C: start=1500,end=4000 (mid=2750)
        series.add(period(1000L, 5000L), 1.0); // index 0 (A)
        series.add(period(500L, 6000L), 2.0);  // index 1 (B)
        series.add(period(1500L, 4000L), 3.0); // index 2 (C)

        // minStart: true branch เกิดตอนเพิ่ม B (500<1000), false branch ตอนเพิ่ม C (1500<500 false)
        assertEquals(1, series.getMinStartIndex());
        // maxStart: false branch ตอนเพิ่ม B (500>1000 false), true branch ตอนเพิ่ม C (1500>1000 true)
        assertEquals(2, series.getMaxStartIndex());
        // minMiddle: false ตอน B (3250<3000 false), true ตอน C (2750<3000 true)
        assertEquals(2, series.getMinMiddleIndex());
        // minEnd: false ตอน B (6000<5000 false), true ตอน C (4000<5000 true)
        assertEquals(2, series.getMinEndIndex());
        // maxEnd: true ตอน B (6000>5000 true), false ตอน C (4000>6000 false)
        assertEquals(1, series.getMaxEndIndex());
    }

    /**
     * ทดสอบ maxMiddleIndex ตาม "พฤติกรรมที่ถูกต้องตาม Javadoc" (index ของช่วงเวลาที่มี
     * middle-milliseconds มากที่สุด)
     *
     * ตามที่ระบุใน changelog ของคลาสนี้เอง:
     *   "07-Apr-2008 : Fixed bug with maxMiddleIndex in updateBounds() (DG)"
     * เวอร์ชัน Chart-7b คือ "ก่อน" การแก้บั๊กนี้ ดังนั้นเทสนี้ "คาดว่าจะ FAIL"
     * บนซอร์สที่ให้มา เนื่องจาก updateBounds() อ่านค่า s,e จาก
     * getDataItem(this.minMiddleIndex) แทนที่จะเป็น this.maxMiddleIndex
     *
     * item0: mid=100, item1: mid=50, item2: mid=75
     * ค่าที่ถูกต้องตาม spec: maxMiddleIndex ต้องเป็น 0 (mid=100 คือค่ามากสุด)
     */
    @Test
    public void testUpdateBounds_MaxMiddleIndex_KnownBug() {
        series.add(period(0L, 200L), 1.0); // index0 mid=100
        series.add(period(0L, 100L), 2.0); // index1 mid=50
        series.add(period(0L, 150L), 3.0); // index2 mid=75

        // Expected ตาม spec ที่ถูกต้อง -> อาจ FAIL บนโค้ดที่มีบั๊ก (ตั้งใจดักจับ fault)
        assertEquals(0, series.getMaxMiddleIndex());
    }

    // ---------------------------------------------------------------
    // update()
    // ---------------------------------------------------------------

    @Test
    public void testUpdate_ChangesValue() {
        series.add(period(0L, 10L), 1.0);
        series.update(0, new Double(99.0));
        assertEquals(99.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdate_InvalidIndex_ThrowsException() {
        series.update(0, new Double(1.0)); // ไม่มี item ใด ๆ
    }

    // ---------------------------------------------------------------
    // delete()
    // ---------------------------------------------------------------

    @Test
    public void testDelete_SingleItem() {
        series.add(period(0L, 10L), 1.0);
        series.add(period(0L, 20L), 2.0);
        series.delete(0, 0);
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testDelete_RangeMultipleItems_RecalculatesBounds() {
        series.add(period(1000L, 5000L), 1.0); // A index0
        series.add(period(500L, 6000L), 2.0);  // B index1
        series.add(period(1500L, 4000L), 3.0); // C index2

        series.delete(2, 2); // ลบ C -> เหลือ A,B

        assertEquals(2, series.getItemCount());
        // recalculateBounds ต้องคำนวณใหม่จาก A,B เท่านั้น
        assertEquals(1, series.getMinStartIndex()); // B start=500 < A start=1000
        assertEquals(0, series.getMaxStartIndex()); // A start=1000 > B start=500
        assertEquals(0, series.getMinMiddleIndex()); // A mid=3000 < B mid=3250
        assertEquals(0, series.getMinEndIndex());    // A end=5000 < B end=6000
        assertEquals(1, series.getMaxEndIndex());    // B end=6000 > A end=5000
    }

    @Test
    public void testDelete_AllItems_ResetsIndices() {
        series.add(period(0L, 10L), 1.0);
        series.add(period(5L, 20L), 2.0);
        series.add(period(2L, 8L), 3.0);

        series.delete(0, 2);

        assertEquals(0, series.getItemCount());
        assertEquals(-1, series.getMinStartIndex());
        assertEquals(-1, series.getMaxStartIndex());
        assertEquals(-1, series.getMinMiddleIndex());
        assertEquals(-1, series.getMaxMiddleIndex());
        assertEquals(-1, series.getMinEndIndex());
        assertEquals(-1, series.getMaxEndIndex());
    }

    @Test
    public void testDelete_EndLessThanStart_NoItemsRemoved() {
        // boundary: end < start -> for-loop (i=0; i<=(end-start); i++) ไม่ทำงานเลย
        series.add(period(0L, 10L), 1.0);
        series.add(period(1L, 11L), 2.0);
        series.add(period(2L, 12L), 3.0);

        series.delete(2, 1); // end(1) < start(2)

        assertEquals(3, series.getItemCount()); // ไม่มีการลบเกิดขึ้น
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDelete_InvalidIndex_ThrowsException() {
        series.add(period(0L, 10L), 1.0);
        series.delete(5, 5); // out of range
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameInstance() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEquals_Null() {
        // obj null -> !(obj instanceof TimePeriodValues) เป็น true -> false
        assertFalse(series.equals(null));
    }

    @Test
    public void testEquals_DifferentClassType() {
        assertFalse(series.equals("not a series"));
    }

    @Test
    public void testEquals_DifferentDomainDescription() {
        TimePeriodValues s1 = new TimePeriodValues("Same", "D1", "R");
        TimePeriodValues s2 = new TimePeriodValues("Same", "D2", "R");
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentRangeDescription() {
        TimePeriodValues s1 = new TimePeriodValues("Same", "D", "R1");
        TimePeriodValues s2 = new TimePeriodValues("Same", "D", "R2");
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentItemCount() {
        TimePeriodValues s1 = new TimePeriodValues("Same");
        TimePeriodValues s2 = new TimePeriodValues("Same");
        s1.add(period(0L, 10L), 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentItemValues() {
        TimePeriodValues s1 = new TimePeriodValues("Same");
        TimePeriodValues s2 = new TimePeriodValues("Same");
        s1.add(period(0L, 10L), 1.0);
        s2.add(period(0L, 10L), 999.0); // ค่าต่างกัน
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_EqualObjects() {
        TimePeriodValues s1 = new TimePeriodValues("Same");
        TimePeriodValues s2 = new TimePeriodValues("Same");
        s1.add(period(0L, 10L), 1.0);
        s2.add(period(0L, 10L), 1.0);
        assertTrue(s1.equals(s2));
    }

    // หมายเหตุ: การทดสอบ branch "!super.equals(obj)" ให้เป็น true (เช่น กรณีชื่อ series
    // ต่างกัน) ต้องพึ่งพา behavior ของ Series.equals() ซึ่งไม่มีซอร์สโค้ดให้ตรวจสอบ
    // จึงไม่เขียนเทสที่เดา behavior นี้ตามข้อกำหนด

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_ConsistentForEqualObjects() {
        TimePeriodValues s1 = new TimePeriodValues("Same");
        TimePeriodValues s2 = new TimePeriodValues("Same");
        s1.add(period(0L, 10L), 1.0);
        s2.add(period(0L, 10L), 1.0);

        assertTrue(s1.equals(s2));
        assertEquals(s1.hashCode(), s2.hashCode());
        // เรียกซ้ำต้องได้ค่าเดิม (consistency)
        assertEquals(s1.hashCode(), s1.hashCode());
    }

    // ---------------------------------------------------------------
    // clone() / createCopy()
    // ---------------------------------------------------------------

    @Test
    public void testClone_EmptySeries() throws CloneNotSupportedException {
        // ครอบคลุม branch false ของ "if (this.data.size() > 0)" ใน createCopy()
        Object clone = series.clone();
        assertTrue(clone instanceof TimePeriodValues);
        TimePeriodValues cloned = (TimePeriodValues) clone;
        assertNotSame(series, cloned);
        assertEquals(0, cloned.getItemCount());
        assertEquals(-1, cloned.getMinStartIndex());
    }

    @Test
    public void testClone_WithItems_NotSameReference() throws CloneNotSupportedException {
        series.add(period(0L, 10L), 1.0);
        series.add(period(5L, 20L), 2.0);

        Object clone = series.clone();
        TimePeriodValues cloned = (TimePeriodValues) clone;

        assertNotSame(series, cloned);
        assertEquals(series.getItemCount(), cloned.getItemCount());
        assertTrue(series.equals(cloned));
        // item ที่ clone มาต้อง "เท่ากัน" แต่ไม่ใช่ reference เดียวกัน
        assertNotSame(series.getDataItem(0), cloned.getDataItem(0));
    }

    @Test
    public void testCreateCopy_Subset() throws CloneNotSupportedException {
        series.add(period(0L, 10L), 1.0);  // index0
        series.add(period(5L, 20L), 2.0);  // index1
        series.add(period(2L, 8L), 3.0);   // index2

        TimePeriodValues copy = series.createCopy(1, 2); // เอาแค่ index1,2

        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getValue(0).doubleValue(), 0.0001);
        assertEquals(3.0, copy.getValue(1).doubleValue(), 0.0001);
        // bounds ต้องคำนวณใหม่ตาม subset (ไม่ใช่ของ series เดิม)
        assertTrue(copy.getMinStartIndex() >= 0);
    }

    // หมายเหตุ: try/catch(SeriesException) ภายใน createCopy() ไม่สามารถ trigger ได้จาก
    // public API ที่ให้มา เนื่องจาก add(TimePeriodValue) โยนเพียง IllegalArgumentException
    // เท่านั้น (ไม่ใช่ SeriesException) จึงไม่สามารถเขียนเทสสำหรับ branch นี้ได้โดยไม่เดา
    // การแก้ไขซอร์สโค้ดหรือ mock ที่ไม่มีอยู่จริง
}

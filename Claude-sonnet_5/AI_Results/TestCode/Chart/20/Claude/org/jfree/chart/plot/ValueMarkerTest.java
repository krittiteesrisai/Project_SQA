package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.junit.Test;

public class ValueMarkerTest {

    // ---------------------------------------------------------------
    // Constructor: ValueMarker(double)
    // ---------------------------------------------------------------
    @Test
    public void testConstructorValueOnly_PositiveValue() {
        ValueMarker m = new ValueMarker(10.5);
        assertEquals(10.5, m.getValue(), 0.0000001);
    }

    @Test
    public void testConstructorValueOnly_ZeroValue() {
        // ค่าขอบเขต: 0.0
        ValueMarker m = new ValueMarker(0.0);
        assertEquals(0.0, m.getValue(), 0.0000001);
    }

    @Test
    public void testConstructorValueOnly_NegativeValue() {
        ValueMarker m = new ValueMarker(-99.99);
        assertEquals(-99.99, m.getValue(), 0.0000001);
    }

    @Test
    public void testConstructorValueOnly_NaN() {
        // ค่าอินพุตผิดรูปแบบ: NaN
        ValueMarker m = new ValueMarker(Double.NaN);
        assertTrue(Double.isNaN(m.getValue()));
    }

    @Test
    public void testConstructorValueOnly_Infinity() {
        ValueMarker m = new ValueMarker(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, m.getValue(), 0.0);
    }

    // ---------------------------------------------------------------
    // Constructor: ValueMarker(double, Paint, Stroke) - delegate ไปยัง full ctor
    // ---------------------------------------------------------------
    @Test
    public void testConstructorWithPaintAndStroke() {
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(2.0f);
        ValueMarker m = new ValueMarker(3.5, paint, stroke);

        assertEquals(3.5, m.getValue(), 0.0000001);
        // ตรวจสอบว่า delegate ส่ง paint/stroke ไปเป็นทั้ง paint และ outlinePaint,
        // stroke และ outlineStroke, alpha = 1.0f ตามที่ระบุใน source
        assertEquals(paint, m.getPaint());
        assertEquals(stroke, m.getStroke());
        assertEquals(paint, m.getOutlinePaint());
        assertEquals(stroke, m.getOutlineStroke());
        assertEquals(1.0f, m.getAlpha(), 0.0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithPaintAndStroke_NullPaint() {
        // ค่า null: ตาม javadoc paint ไม่อนุญาตให้เป็น null
        // คาดว่า super constructor จะ throw IllegalArgumentException
        // (พึ่งพา behavior ของ Marker ที่ไม่ได้เห็น source ตรง ๆ - คอมเมนต์กำกับตามข้อกำหนด)
        new ValueMarker(1.0, null, new BasicStroke(1.0f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithPaintAndStroke_NullStroke() {
        new ValueMarker(1.0, Color.BLUE, null);
    }

    // ---------------------------------------------------------------
    // Constructor: ValueMarker(double, Paint, Stroke, Paint, Stroke, float) - full
    // ---------------------------------------------------------------
    @Test
    public void testConstructorFull_AllFieldsSetCorrectly() {
        Paint paint = Color.GREEN;
        Stroke stroke = new BasicStroke(1.0f);
        Paint outlinePaint = Color.BLACK;
        Stroke outlineStroke = new BasicStroke(3.0f);
        float alpha = 0.5f;

        ValueMarker m = new ValueMarker(7.0, paint, stroke, outlinePaint,
                outlineStroke, alpha);

        assertEquals(7.0, m.getValue(), 0.0000001);
        assertEquals(paint, m.getPaint());
        assertEquals(stroke, m.getStroke());
        assertEquals(outlinePaint, m.getOutlinePaint());
        assertEquals(outlineStroke, m.getOutlineStroke());
        assertEquals(alpha, m.getAlpha(), 0.0f);
    }

    @Test
    public void testConstructorFull_AlphaBoundaryZero() {
        // ค่าขอบเขต alpha = 0.0f
        ValueMarker m = new ValueMarker(1.0, Color.RED, new BasicStroke(1.0f),
                Color.BLUE, new BasicStroke(1.0f), 0.0f);
        assertEquals(0.0f, m.getAlpha(), 0.0f);
    }

    @Test
    public void testConstructorFull_AlphaBoundaryOne() {
        // ค่าขอบเขต alpha = 1.0f
        ValueMarker m = new ValueMarker(1.0, Color.RED, new BasicStroke(1.0f),
                Color.BLUE, new BasicStroke(1.0f), 1.0f);
        assertEquals(1.0f, m.getAlpha(), 0.0f);
    }

    // ---------------------------------------------------------------
    // getValue()
    // ---------------------------------------------------------------
    @Test
    public void testGetValue_ReturnsConstructorValue() {
        ValueMarker m = new ValueMarker(42.0);
        assertEquals(42.0, m.getValue(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // setValue(double)
    // ---------------------------------------------------------------
    @Test
    public void testSetValue_UpdatesValue() {
        ValueMarker m = new ValueMarker(1.0);
        m.setValue(99.0);
        assertEquals(99.0, m.getValue(), 0.0000001);
    }

    @Test
    public void testSetValue_NotifiesListeners() {
        ValueMarker m = new ValueMarker(1.0);
        final boolean[] listenerCalled = {false};
        final MarkerChangeEvent[] capturedEvent = new MarkerChangeEvent[1];

        MarkerChangeListener listener = new MarkerChangeListener() {
            public void markerChanged(MarkerChangeEvent event) {
                listenerCalled[0] = true;
                capturedEvent[0] = event;
            }
        };
        m.addChangeListener(listener);

        m.setValue(5.0);

        assertTrue("Listener ควรถูกเรียกหลังจาก setValue()", listenerCalled[0]);
        assertNotNull(capturedEvent[0]);
        assertEquals(m, capturedEvent[0].getMarker());
        assertEquals(5.0, m.getValue(), 0.0000001);
    }

    @Test
    public void testSetValue_NoListenerRegistered_NoException() {
        // ไม่มี listener ลงทะเบียน ควรไม่มี exception เกิดขึ้น
        ValueMarker m = new ValueMarker(1.0);
        m.setValue(2.0);
        assertEquals(2.0, m.getValue(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // equals(Object)
    // ---------------------------------------------------------------
    @Test
    public void testEquals_SameReference() {
        // branch: obj == this -> true
        ValueMarker m = new ValueMarker(1.0);
        assertTrue(m.equals(m));
    }

    @Test
    public void testEquals_Null() {
        // branch: super.equals(null) คาดว่า false (Marker.equals ควรจัดการ null อย่างปลอดภัย)
        // หมายเหตุ: พึ่งพา behavior ของ Marker.equals ที่ไม่มีใน source ที่ให้มา
        ValueMarker m = new ValueMarker(1.0);
        assertFalse(m.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_NotMarkerAtAll() {
        // branch: super.equals(obj) -> false เพราะ obj ไม่ใช่ Marker เลย
        ValueMarker m = new ValueMarker(1.0);
        assertFalse(m.equals("a string, not a marker"));
    }

    @Test
    public void testEquals_SameFieldsButNotValueMarkerInstance() {
        // branch: super.equals(obj) == true แต่ !(obj instanceof ValueMarker) -> false
        // หมายเหตุ: สมมติว่า Marker.equals() เปรียบเทียบเฉพาะ field paint/stroke/
        // outlinePaint/outlineStroke/alpha (ไม่ตรวจสอบ runtime class) ตาม JFreeChart
        // ปกติ - เป็น assumption ที่ไม่ได้เห็นจาก source ของ Marker ตรง ๆ
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(1.0f);
        ValueMarker m = new ValueMarker(1.0, paint, stroke);

        Marker plainMarker = new Marker(paint, stroke, paint, stroke, 1.0f) { };

        assertFalse(m.equals(plainMarker));
    }

    @Test
    public void testEquals_DifferentValue_SamePaintStroke() {
        // branch: this.value != that.value -> false
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(1.0f);
        ValueMarker m1 = new ValueMarker(1.0, paint, stroke);
        ValueMarker m2 = new ValueMarker(2.0, paint, stroke);

        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_SameValue_DifferentPaint() {
        // branch: super.equals(obj) -> false เพราะ paint ไม่ตรง
        ValueMarker m1 = new ValueMarker(1.0, Color.RED, new BasicStroke(1.0f));
        ValueMarker m2 = new ValueMarker(1.0, Color.BLUE, new BasicStroke(1.0f));

        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_AllFieldsEqual_ReturnsTrue() {
        // branch: ผ่านทุกเงื่อนไข -> true
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(1.0f);
        Paint outlinePaint = Color.BLACK;
        Stroke outlineStroke = new BasicStroke(2.0f);
        float alpha = 0.8f;

        ValueMarker m1 = new ValueMarker(5.0, paint, stroke, outlinePaint,
                outlineStroke, alpha);
        ValueMarker m2 = new ValueMarker(5.0, paint, stroke, outlinePaint,
                outlineStroke, alpha);

        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1)); // symmetric check
    }

    @Test
    public void testEquals_BoundaryValueZeroEqual() {
        // ค่าขอบเขต value = 0.0 ทั้งสองฝั่ง
        ValueMarker m1 = new ValueMarker(0.0);
        ValueMarker m2 = new ValueMarker(0.0);
        assertTrue(m1.equals(m2));
    }
}

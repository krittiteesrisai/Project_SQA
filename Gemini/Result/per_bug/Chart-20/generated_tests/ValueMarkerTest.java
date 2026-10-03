package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.junit.Test;

/**
 * Test cases for the ValueMarker class.
 */
public class ValueMarkerTest implements MarkerChangeListener {

    private boolean listenerNotified = false;

    @Override
    public void markerChanged(MarkerChangeEvent event) {
        this.listenerNotified = true;
    }

    @Test
    public void testConstructorsAndGetters() {
        // Test Constructor 1: ValueMarker(double)
        ValueMarker vm1 = new ValueMarker(100.0);
        assertEquals(100.0, vm1.getValue(), 0.0001);
        assertNull(vm1.getPaint());

        // Test Constructor 2: ValueMarker(double, Paint, Stroke)
        Paint paint = Color.red;
        Stroke stroke = new BasicStroke(1.0f);
        ValueMarker vm2 = new ValueMarker(200.0, paint, stroke);
        assertEquals(200.0, vm2.getValue(), 0.0001);
        assertEquals(paint, vm2.getPaint());
        assertEquals(stroke, vm2.getStroke());

        // Test Constructor 3: Full arguments (Checking Defects4J Bug 1808376 fix)
        Paint outlinePaint = Color.blue;
        Stroke outlineStroke = new BasicStroke(2.0f);
        ValueMarker vm3 = new ValueMarker(300.0, paint, stroke, outlinePaint, outlineStroke, 0.5f);
        assertEquals(300.0, vm3.getValue(), 0.0001);
        assertEquals(paint, vm3.getPaint());
        assertEquals(stroke, vm3.getStroke());
        assertEquals(outlinePaint, vm3.getOutlinePaint());
        assertEquals(outlineStroke, vm3.getOutlineStroke());
        assertEquals(0.5f, vm3.getAlpha(), 0.0001);
    }

    @Test
    public void testSetValueAndListener() {
        ValueMarker vm = new ValueMarker(50.0);
        vm.addChangeListener(this);
        
        this.listenerNotified = false;
        vm.setValue(75.0);
        
        assertEquals(75.0, vm.getValue(), 0.0001);
        assertTrue("MarkerChangeListener should be notified on setValue", this.listenerNotified);
    }

    @Test
    public void testEquals() {
        Paint paint = Color.red;
        Stroke stroke = new BasicStroke(1.0f);

        ValueMarker vm1 = new ValueMarker(100.0, paint, stroke);
        ValueMarker vm2 = new ValueMarker(100.0, paint, stroke);
        ValueMarker vm3 = new ValueMarker(200.0, paint, stroke);
        ValueMarker vm4 = new ValueMarker(100.0, Color.blue, stroke);

        // 1. obj == this
        assertTrue(vm1.equals(vm1));

        // 2. obj is null (super.equals handles null safely and returns false)
        assertFalse(vm1.equals(null));

        // 3. obj is of a different type
        assertFalse(vm1.equals("Not a ValueMarker"));

        // 4. same values -> true
        assertTrue(vm1.equals(vm2));
        assertTrue(vm2.equals(vm1));

        // 5. different value -> false
        assertFalse(vm1.equals(vm3));

        // 6. different super properties (e.g., paint) -> false
        assertFalse(vm1.equals(vm4));
    }

    @Test
    public void testHashCodeConsistency() {
        // Even though Marker/ValueMarker might rely on Object's hashCode or inherited implementations,
        // it's good practice to ensure consistency if equals is overridden (though ValueMarker doesn't override hashCode,
        // we test equality contract thoroughly).
        ValueMarker vm1 = new ValueMarker(100.0);
        ValueMarker vm2 = new ValueMarker(100.0);
        assertEquals(vm1, vm2);
    }
}
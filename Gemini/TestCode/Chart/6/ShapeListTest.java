package org.jfree.chart.util;

import static org.junit.Assert.*;

import java.awt.Rectangle;
import java.awt.Shape;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for ShapeList (Defects4J Chart-6b).
 */
public class ShapeListTest {

    @Test
    public void testConstructorAndBasicGetSet() {
        ShapeList list = new ShapeList();
        assertNull(list.getShape(0));

        Shape rect = new Rectangle(1, 2, 3, 4);
        list.setShape(0, rect);
        assertEquals(rect, list.getShape(0));

        // Test setting at a higher index to trigger auto-expansion of the list
        Shape rect2 = new ShapeListTestShape(); // dummy shape or another shape
        list.setShape(10, rect);
        assertEquals(rect, list.getShape(10));
        assertNull(list.getShape(5)); // intermediate should be null
    }

    @Test
    public void testEquals_Self() {
        ShapeList list = new ShapeList();
        assertTrue("Should be equal to itself", list.equals(list));
    }

    @Test
    public void testEquals_NullAndDifferentClass() {
        ShapeList list = new ShapeList();
        assertFalse("Should not be equal to null", list.equals(null));
        assertFalse("Should not be equal to different class", list.equals("NotAShapeList"));
    }

    @Test
    public void testEquals_StructuralEquality() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();

        assertTrue("Empty lists should be equal", list1.equals(list2));

        Shape rect1 = new Rectangle(0, 0, 10, 10);
        Shape rect2 = new Rectangle(0, 0, 10, 10);

        list1.setShape(0, rect1);
        assertFalse("Lists with different content should not be equal", list1.equals(list2));

        list2.setShape(0, rect2);
        assertTrue("Lists with equivalent content should be equal", list1.equals(list2));

        // Test with null element inside
        list1.setShape(1, null);
        list2.setShape(1, null);
        assertTrue("Lists with null elements at same index should be equal", list1.equals(list2));
    }

    @Test
    public void testHashCode() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        assertEquals("Equal objects must have equal hashcodes", list1.hashCode(), list2.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        ShapeList list1 = new ShapeList();
        list1.setShape(0, new Rectangle(5, 5));

        ShapeList list2 = (ShapeList) list1.clone();
        assertNotSame("Clone should be a distinct instance", list1, list2);
        assertEquals("Clone content should match original", list1, list2);
    }

    @Test
    public void testSerializationWithNonNullAndNullShapes() throws Exception {
        ShapeList list1 = new ShapeList();
        list1.setShape(0, new Rectangle(1, 1, 10, 10));
        list1.setShape(1, null); // Triggers the 'else { stream.writeInt(-1); }' branch
        list1.setShape(5, new Rectangle(2, 2, 20, 20));

        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(list1);
        oos.flush();

        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ShapeList list2 = (ShapeList) ois.readObject();

        assertEquals("Deserialized object must equal original", list1, list2);
        assertEquals(list1.getShape(0), list2.getShape(0));
        assertNull(list2.getShape(1));
        assertEquals(list1.getShape(5), list2.getShape(5));
    }

    /**
     * Helper dummy class implementing Shape just in case, though java.awt.Rectangle is sufficient.
     */
    private static class ShapeListTestShape extends Rectangle {
        private static final long serialVersionUID = 1L;
    }
}
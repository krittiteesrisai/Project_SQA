package org.jfree.chart.util;

import static org.junit.Assert.*;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link ShapeList} (Defects4J: Chart-6b).
 * ครอบคลุม getShape/setShape, clone, equals, hashCode, และ
 * private writeObject/readObject (ทดสอบผ่าน serialization round-trip)
 */
public class ShapeListTest {

    // ---------------------------------------------------------------
    // getShape / setShape
    // ---------------------------------------------------------------

    @Test
    public void testSetAndGetShape_basic() {
        ShapeList list = new ShapeList();
        Shape rect = new Rectangle2D.Double(1, 2, 3, 4);
        list.setShape(0, rect);
        assertEquals(rect, list.getShape(0));
    }

    @Test
    public void testSetShape_nullValueStored() {
        ShapeList list = new ShapeList();
        list.setShape(0, null);
        assertNull(list.getShape(0));
    }

    // Boundary: negative index
    // ASSUMPTION: AbstractObjectList.get() จะโยน IndexOutOfBoundsException
    // เมื่อ index < 0 (ตาม pattern มาตรฐานของ List implementation ใน JFreeChart)
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetShape_negativeIndexThrowsException() {
        ShapeList list = new ShapeList();
        list.getShape(-1);
    }

    // Boundary: index beyond current size -> list ถูก "ขยาย" ตาม JavaDoc ของ setShape
    // ASSUMPTION: ตำแหน่งที่ยังไม่ถูก set จะเป็น null (ตาม pattern ทั่วไปของ AbstractObjectList)
    @Test
    public void testSetShape_expandsListWithNullPadding() {
        ShapeList list = new ShapeList();
        Shape s = new Rectangle2D.Double(0, 0, 1, 1);
        list.setShape(5, s);

        assertNull(list.getShape(0));   // ตำแหน่งก่อนหน้าที่ยังไม่ set
        assertEquals(s, list.getShape(5));
    }

    @Test
    public void testSetShape_overwriteExistingValue() {
        ShapeList list = new ShapeList();
        Shape s1 = new Rectangle2D.Double(0, 0, 1, 1);
        Shape s2 = new Rectangle2D.Double(1, 1, 2, 2);
        list.setShape(0, s1);
        list.setShape(0, s2);
        assertEquals(s2, list.getShape(0));
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------

    @Test
    public void testClone_returnsEqualButNotSameInstance()
            throws CloneNotSupportedException {
        ShapeList list = new ShapeList();
        list.setShape(0, new Rectangle2D.Double(1, 1, 1, 1));

        ShapeList clone = (ShapeList) list.clone();

        assertNotSame(list, clone);
        assertEquals(list, clone);
    }

    @Test
    public void testClone_modifyingOriginalDoesNotAffectClone()
            throws CloneNotSupportedException {
        ShapeList list = new ShapeList();
        Shape s1 = new Rectangle2D.Double(0, 0, 1, 1);
        list.setShape(0, s1);

        ShapeList clone = (ShapeList) list.clone();

        // ตั้งค่าใหม่ในของเดิม
        Shape s2 = new Rectangle2D.Double(9, 9, 9, 9);
        list.setShape(0, s2);

        // ASSUMPTION: clone() ทำ shallow copy ของ list array (underlying storage
        // ถูกแยกออกจากกัน แต่ Shape object เดิมยังถูกอ้างอิงร่วม)
        assertEquals(s1, clone.getShape(0));
        assertEquals(s2, list.getShape(0));
    }

    @Test
    public void testClone_emptyList() throws CloneNotSupportedException {
        ShapeList list = new ShapeList();
        ShapeList clone = (ShapeList) list.clone();
        assertEquals(list, clone);
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance() {
        ShapeList list = new ShapeList();
        assertTrue(list.equals(list)); // branch: obj == this -> true
    }

    @Test
    public void testEquals_nullObject() {
        ShapeList list = new ShapeList();
        // branch: !(null instanceof ShapeList) -> true -> return false
        assertFalse(list.equals(null));
    }

    @Test
    public void testEquals_differentType() {
        ShapeList list = new ShapeList();
        // branch: !(obj instanceof ShapeList) -> true -> return false
        assertFalse(list.equals("not a ShapeList"));
    }

    @Test
    public void testEquals_equalListsWithSameShape() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        Shape s = new Rectangle2D.Double(1, 2, 3, 4);
        list1.setShape(0, s);
        list2.setShape(0, s);

        // branch: obj instanceof ShapeList -> true -> super.equals(obj)
        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1)); // symmetry check
    }

    @Test
    public void testEquals_emptyLists() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        assertTrue(list1.equals(list2));
    }

    @Test
    public void testEquals_unequalLists_differentShapeValue() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        list1.setShape(0, new Rectangle2D.Double(1, 1, 1, 1));
        list2.setShape(0, new Rectangle2D.Double(2, 2, 2, 2));

        assertFalse(list1.equals(list2));
    }

    @Test
    public void testEquals_unequalLists_differentSize() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        Shape s = new Rectangle2D.Double(1, 1, 1, 1);
        list1.setShape(0, s);
        list2.setShape(0, s);
        list2.setShape(1, new Rectangle2D.Double(2, 2, 2, 2));

        assertFalse(list1.equals(list2));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_consistentAcrossCalls() {
        ShapeList list = new ShapeList();
        list.setShape(0, new Rectangle2D.Double(1, 1, 1, 1));
        int h1 = list.hashCode();
        int h2 = list.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_equalObjectsHaveSameHashCode() {
        ShapeList list1 = new ShapeList();
        ShapeList list2 = new ShapeList();
        Shape s = new Rectangle2D.Double(3, 3, 3, 3);
        list1.setShape(0, s);
        list2.setShape(0, s);

        assertTrue(list1.equals(list2));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    // ---------------------------------------------------------------
    // Serialization: writeObject / readObject (private methods)
    // ---------------------------------------------------------------

    @Test
    public void testSerialization_nonNullShape() throws IOException,
            ClassNotFoundException {
        ShapeList list = new ShapeList();
        Shape s = new Rectangle2D.Double(1, 2, 3, 4);
        list.setShape(0, s);

        ShapeList result = serializeAndDeserialize(list);

        // branch: shape != null -> writeInt(i); writeShape(...)
        //         index != -1  -> setShape(index, readShape(...))
        assertNotNull(result.getShape(0));
        assertEquals(list, result);
    }

    @Test
    public void testSerialization_nullShape() throws IOException,
            ClassNotFoundException {
        ShapeList list = new ShapeList();
        list.setShape(0, null);

        ShapeList result = serializeAndDeserialize(list);

        // branch: shape == null -> writeInt(-1)
        //         index == -1  -> skip setShape
        assertNull(result.getShape(0));
    }

    @Test
    public void testSerialization_mixedNullAndNonNullShapes()
            throws IOException, ClassNotFoundException {
        ShapeList list = new ShapeList();
        list.setShape(0, new Rectangle2D.Double(0, 0, 1, 1));
        list.setShape(1, null);
        list.setShape(2, new Rectangle2D.Double(2, 2, 2, 2));

        ShapeList result = serializeAndDeserialize(list);

        assertNotNull(result.getShape(0));
        assertNull(result.getShape(1));
        assertNotNull(result.getShape(2));
        assertEquals(list, result);
    }

    @Test
    public void testSerialization_emptyList() throws IOException,
            ClassNotFoundException {
        // ครอบคลุม loop count == 0 -> ไม่มีการ iterate เลยทั้งใน
        // writeObject และ readObject
        ShapeList list = new ShapeList();
        ShapeList result = serializeAndDeserialize(list);
        assertEquals(list, result);
    }

    // ---------------------------------------------------------------
    // Helper
    // ---------------------------------------------------------------

    private ShapeList serializeAndDeserialize(ShapeList list)
            throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(list);
        oos.close();

        ByteArrayInputStream bais =
                new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ShapeList result = (ShapeList) ois.readObject();
        ois.close();

        return result;
    }
}

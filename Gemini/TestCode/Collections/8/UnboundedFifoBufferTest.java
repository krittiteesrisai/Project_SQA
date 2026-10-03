package org.apache.commons.collections.buffer;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections.BufferUnderflowException;
import org.junit.Test;

public class UnboundedFifoBufferTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithZeroSize() {
        new UnboundedFifoBuffer(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeSize() {
        new UnboundedFifoBuffer(-5);
    }

    @Test
    public void testDefaultConstructorAndInitialState() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        assertTrue(buffer.isEmpty());
        assertEquals(0, buffer.size());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullThrowsException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add(null);
    }

    @Test(expected = BufferUnderflowException.class)
    public void testGetOnEmptyBufferThrowsException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.get();
    }

    @Test(expected = BufferUnderflowException.class)
    public void testRemoveOnEmptyBufferThrowsException() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.remove();
    }

    @Test
    public void testAddAndRemoveBasic() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        assertTrue(buffer.add("A"));
        assertTrue(buffer.add("B"));
        assertFalse(buffer.isEmpty());
        assertEquals(2, buffer.size());

        assertEquals("A", buffer.get());
        assertEquals("A", buffer.remove());
        assertEquals(1, buffer.size());

        assertEquals("B", buffer.remove());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testBufferResizeAndWrapAround() {
        // กำหนดขนาดเล็กเพื่อบังคับให้เกิด resize และ wrap-around (tail < head scenario)
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(2);
        buffer.add("One");
        buffer.add("Two");
        
        // เอาออกหนึ่งตัวเพื่อให้ head ขยับไปอยู่ที่ index 1
        assertEquals("One", buffer.remove());
        
        // เพิ่มตัวที่สามและสี่ เพื่อบังคับให้เกิดการขยายขนาด (Resize) และจัดเรียงใหม่
        buffer.add("Three");
        buffer.add("Four");
        
        assertEquals(3, buffer.size());
        assertEquals("Two", buffer.remove());
        assertEquals("Three", buffer.remove());
        assertEquals("Four", buffer.remove());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIteratorOperations() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer(5);
        buffer.add("X");
        buffer.add("Y");
        buffer.add("Z");

        Iterator it = buffer.iterator();
        assertTrue(it.hasNext());
        assertEquals("X", it.next());
        assertEquals("Y", it.next());
        assertEquals("Z", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextBeyondLimit() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        Iterator it = buffer.iterator();
        it.next();
    }

    @Test(expected = IllegalStateException.class)
    public void testIteratorRemoveWithoutNext() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        Iterator it = buffer.iterator();
        it.remove(); // ยังไม่ได้เรียก next()
    }

    @Test
    public void testIteratorRemoveHeadElement() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        
        Iterator it = buffer.iterator();
        assertEquals("A", it.next());
        it.remove(); // ลบตัว head (A)
        
        assertEquals(1, buffer.size());
        assertEquals("B", buffer.get());
    }

    @Test
    public void testIteratorRemoveMiddleElement() {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("A");
        buffer.add("B");
        buffer.add("C");
        
        Iterator it = buffer.iterator();
        assertEquals("A", it.next());
        assertEquals("B", it.next());
        it.remove(); // ลบตัวตรงกลาง (B) ซึ่งต้องทำการ shift ข้อมูล
        
        assertEquals(2, buffer.size());
        assertEquals("A", buffer.remove());
        assertEquals("C", buffer.remove());
    }

    @Test
    public void testSerialization() throws Exception {
        UnboundedFifoBuffer buffer = new UnboundedFifoBuffer();
        buffer.add("Serial1");
        buffer.add("Serial2");

        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(buffer);
        oos.close();

        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        UnboundedFifoBuffer deserialized = (UnboundedFifoBuffer) ois.readObject();
        ois.close();

        assertEquals(2, deserialized.size());
        assertEquals("Serial1", deserialized.remove());
        assertEquals("Serial2", deserialized.remove());
    }
}
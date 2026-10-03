package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BeanPropertyMapTest {

    // --- Mock Helper สำหรับ SettableBeanProperty ---
    private SettableBeanProperty createMockProperty(String name) {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn(name);
        return prop;
    }

    private SettableBeanProperty createMockPropertyWithIndex(String name, int index) {
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getName()).thenReturn(name);
        when(prop.getPropertyIndex()).thenReturn(index);
        return prop;
    }

    @Test
    public void testConstructorAndSizeEdgeCases() {
        // ทดสอบ size <= 5 (hashSize = 8) และ size <= 12 (hashSize = 16) รวมถึงมี null property แทรก
        List<SettableBeanProperty> smallList = new ArrayList<>();
        smallList.add(createMockProperty("prop1"));
        smallList.add(null); // ทดสอบ prop == null branch ใน init()
        smallList.add(createMockProperty("prop2"));

        BeanPropertyMap map = new BeanPropertyMap(false, smallList);
        assertEquals(3, map.size()); // size นับจาก props.size() ตอนสร้าง
        assertNotNull(map.find("prop1"));
        assertNull(map.find("nonExistent"));

        // ทดสอบขนาดใหญ่เพื่อกระตุ้น hash expansion (> 12)
        List<SettableBeanProperty> largeList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            largeList.add(createMockProperty("prop" + i));
        }
        BeanPropertyMap largeMap = new BeanPropertyMap(true, largeList);
        assertEquals(20, largeMap.size());
        assertNotNull(largeMap.find("PROP5")); // Case insensitive check
    }

    @Test
    public void testWithCaseInsensitivity() {
        List<SettableBeanProperty> props = Collections.singletonList(createMockProperty("TestProp"));
        BeanPropertyMap map = new BeanPropertyMap(false, props);

        // กรณี state เดิม คืนค่าเดิม (this)
        assertSame(map, map.withCaseInsensitivity(false));

        // กรณีเปลี่ยน state สร้างใหม่
        BeanPropertyMap insensitiveMap = map.withCaseInsensitivity(true);
        assertNotSame(map, insensitiveMap);
        assertNotNull(insensitiveMap.find("testprop"));
    }

    @Test
    public void testWithPropertyAddAndReplace() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("a"));
        props.add(createMockProperty("b"));
        BeanPropertyMap map = new BeanPropertyMap(false, props);

        // แทนที่ Property เดิม (replace existing)
        SettableBeanProperty newA = createMockProperty("a");
        BeanPropertyMap updatedMap = map.withProperty(newA);
        assertSame(newA, updatedMap.find("a"));

        // เพิ่ม Property ใหม่ (append & spillover test ถ้าข้อมูลเยอะ)
        SettableBeanProperty propC = createMockProperty("c");
        updatedMap.withProperty(propC);
        assertNotNull(updatedMap.find("c"));
        assertEquals(3, updatedMap.size());
    }

    @Test
    public void testAssignIndexes() {
        SettableBeanProperty p1 = createMockPropertyWithIndex("p1", -1);
        SettableBeanProperty p2 = createMockPropertyWithIndex("p2", -1);
        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, p2));

        map.assignIndexes();
        verify(p1).assignIndex(0);
        verify(p2).assignIndex(1);
    }

    @Test
    public void testRenameAll() {
        SettableBeanProperty p1 = createMockProperty("prop");
        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, null)); // รวม null hole

        // Transformer เป็น null หรือ NOP คืนค่าเดิม
        assertSame(map, map.renameAll(null));
        assertSame(map, map.renameAll(NameTransformer.NOP));

        // ทดสอบ rename จริง
        BeanPropertyMap renamed = map.renameAll(NameTransformer.simpleTransformer("pre_", "_post"));
        assertNotNull(renamed);
    }

    @Test
    public void testWithoutProperties() {
        List<SettableBeanProperty> props = Arrays.asList(createMockProperty("p1"), createMockProperty("p2"));
        BeanPropertyMap map = new BeanPropertyMap(false, props);

        // คอลเลกชันว่าง คืนค่าเดิม
        assertSame(map, map.withoutProperties(Collections.emptyList()));

        // กรอง Property ออก
        BeanPropertyMap filtered = map.withoutProperties(Collections.singletonList("p1"));
        assertNull(filtered.find("p1"));
        assertNotNull(filtered.find("p2"));
    }

    @Test
    public void testReplaceSuccessAndException() {
        SettableBeanProperty p1 = createMockProperty("p1");
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        SettableBeanProperty p1New = createMockProperty("p1");
        map.replace(p1New);
        assertSame(p1New, map.find("p1"));

        // แทนที่ตัวที่ไม่มีอยู่จริงต้องโยน NoSuchElementException
        try {
            map.replace(createMockProperty("missing"));
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertTrue(e.getMessage().contains("No entry"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindNullKeyThrowsException() {
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(createMockProperty("p1")));
        map.find(null);
    }

    @Test
    public void testFindIndexAndSecondarySpill() {
        // สร้างสถานการณ์ที่ทำให้เกิด Primary, Secondary และ Spill ใน find(String)
        List<SettableBeanProperty> props = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            props.add(createMockProperty("key" + i));
        }
        BeanPropertyMap map = new BeanPropertyMap(false, props);
        assertNotNull(map.find("key0"));
        assertNull(map.find("non_existent_key_12345"));
        
        // ทดสอบ find(int index)
        SettableBeanProperty indexedProp = createMockPropertyWithIndex("target", 99);
        BeanPropertyMap idxMap = new BeanPropertyMap(false, Collections.singletonList(indexedProp));
        assertEquals(indexedProp, idxMap.find(99));
        assertNull(idxMap.find(100));
    }

    @Test
    public void testRemoveProperty() {
        SettableBeanProperty p1 = createMockProperty("p1");
        SettableBeanProperty p2 = createMockProperty("p2");
        BeanPropertyMap map = new BeanPropertyMap(false, Arrays.asList(p1, p2));

        map.remove(p1);
        assertNull(map.find("p1"));
        assertNotNull(map.find("p2"));

        // ลบตัวที่ไม่มีอยู่จริง
        try {
            map.remove(createMockProperty("unknown"));
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertTrue(e.getMessage().contains("No entry"));
        }
    }

    @Test
    public void testFindDeserializeAndSet() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();
        
        SettableBeanProperty p1 = createMockProperty("target");
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));

        // หาไม่เจอ คืนค่า false
        assertFalse(map.findDeserializeAndSet(jp, ctxt, bean, "notFound"));

        // หาเจอและเรียกใช้งานสำเร็จ คืนค่า true
        assertTrue(map.findDeserializeAndSet(jp, ctxt, bean, "target"));
        verify(p1).deserializeAndSet(jp, ctxt, bean);

        // กรณีเกิด Exception ระหว่าง deserializeAndSet จะถูกห่อหุ้ม
        doThrow(new RuntimeException("Deserialization error")).when(p1).deserializeAndSet(jp, ctxt, bean);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        when(ctxt.getConfig()).thenReturn(null);

        try {
            map.findDeserializeAndSet(jp, ctxt, bean, "target");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testToStringOutput() {
        SettableBeanProperty p1 = createMockProperty("name");
        JavaType type = mock(JavaType.class);
        when(p1.getType()).thenReturn(type);
        when(type.toString()).thenReturn("String");

        BeanPropertyMap map = new BeanPropertyMap(false, Collections.singletonList(p1));
        String str = map.toString();
        assertTrue(str.contains("Properties=[name(String)]"));
    }

    // --- Test cases สำหรับ wrapAndThrow edge cases ผ่าน Test subclass หรือพฤติกรรม ---
    @Test
    public void testWrapAndThrowScenarios() throws Throwable {
        BeanPropertyMap map = new BeanPropertyMap(false, Collections.emptyList());
        
        // ทดสอบ Error ส่งผ่านตรงๆ
        Error err = new Error("Fatal Error");
        try {
            invokeWrapAndThrow(map, err, new Object(), "field", null);
            fail("Expected Error");
        } catch (Error e) {
            assertSame(err, e);
        }

        // ทดสอบ IOException ที่ไม่ใช่ JsonProcessingException เมื่อ wrap เปิดอยู่
        IOException ioEx = new IOException("IO error");
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        try {
            invokeWrapAndThrow(map, ioEx, new Object(), "field", ctxt);
            fail("Expected IOException");
        } catch (IOException e) {
            assertSame(ioEx, e);
        }
    }

    //Helper สะท้อนเรียก protected wrapAndThrow
    private void invokeWrapAndThrow(BeanPropertyMap map, Throwable t, Object bean, String fieldName, DeserializationContext ctxt) throws Throwable {
        java.lang.reflect.Method m = BeanPropertyMap.class.getDeclaredMethod("wrapAndThrow", Throwable.class, Object.class, String.class, DeserializationContext.class);
        m.setAccessible(true);
        try {
            m.invoke(map, t, bean, fieldName, ctxt);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
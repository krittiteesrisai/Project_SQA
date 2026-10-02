package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

public class AnyGetterWriterTest {

    private AnnotatedMember accessor;
    private MapSerializer mapSerializer;
    private BeanProperty property;
    private JsonGenerator generator;
    private SerializerProvider provider;
    private PropertyFilter filter;
    private Object bean;

    @Before
    public void setUp() {
        accessor = mock(AnnotatedMember.class);
        mapSerializer = mock(MapSerializer.class);
        property = mock(BeanProperty.class);
        generator = mock(JsonGenerator.class);
        provider = mock(SerializerProvider.class);
        filter = mock(PropertyFilter.class);
        bean = new Object();
    }

    // ---------------------------------------------------------------
    // getAndSerialize()
    // ---------------------------------------------------------------

    @Test
    public void getAndSerialize_valueNull_returnsWithoutException() throws Exception {
        when(accessor.getValue(bean)).thenReturn(null);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);
        // ไม่ควร throw exception และไม่ควรเรียก mapSerializer เลย
        writer.getAndSerialize(bean, generator, provider);

        verify(mapSerializer, never()).serializeFields(any(Map.class), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void getAndSerialize_valueNotMap_throwsJsonMappingException() throws Exception {
        when(accessor.getValue(bean)).thenReturn("not-a-map"); // String ไม่ใช่ Map
        when(accessor.getName()).thenReturn("myAnyGetter");

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);

        try {
            writer.getAndSerialize(bean, generator, provider);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            // ตรวจสอบ message ว่ามีชื่อ accessor และ class name ของ value ผิดรูป
            assertTrue(e.getMessage().contains("myAnyGetter"));
            assertTrue(e.getMessage().contains("java.lang.String"));
        }
    }

    @Test
    public void getAndSerialize_valueIsMap_withMapSerializer_callsSerializeFields() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("k", "v");
        when(accessor.getValue(bean)).thenReturn(map);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);
        writer.getAndSerialize(bean, generator, provider);

        verify(mapSerializer, times(1)).serializeFields(eq(map), eq(generator), eq(provider));
    }

    @Test
    public void getAndSerialize_valueIsMap_withNullMapSerializer_noExceptionNoCall() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        when(accessor.getValue(bean)).thenReturn(map);

        // สร้าง writer โดยไม่มี mapSerializer (null) -> เข้า branch else ของ if (_mapSerializer != null)
        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, null);

        // ไม่ควร throw exception ใด ๆ แม้ _mapSerializer เป็น null
        writer.getAndSerialize(bean, generator, provider);
        // ไม่มี mapSerializer ให้ verify แต่ทดสอบว่าไม่ throw ก็เพียงพอสำหรับ branch นี้
    }

    // ---------------------------------------------------------------
    // getAndFilter()
    // ---------------------------------------------------------------

    @Test
    public void getAndFilter_valueNull_returnsWithoutException() throws Exception {
        when(accessor.getValue(bean)).thenReturn(null);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);
        writer.getAndFilter(bean, generator, provider, filter);

        verify(mapSerializer, never())
                .serializeFilteredFields(any(Map.class), any(JsonGenerator.class),
                        any(SerializerProvider.class), any(PropertyFilter.class), isNull());
    }

    @Test
    public void getAndFilter_valueNotMap_throwsJsonMappingException() throws Exception {
        when(accessor.getValue(bean)).thenReturn(Integer.valueOf(123)); // ไม่ใช่ Map
        when(accessor.getName()).thenReturn("anyFilterGetter");

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);

        try {
            writer.getAndFilter(bean, generator, provider, filter);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("anyFilterGetter"));
            assertTrue(e.getMessage().contains("java.lang.Integer"));
        }
    }

    @Test
    public void getAndFilter_valueIsMap_withMapSerializer_callsSerializeFilteredFields() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", 1);
        when(accessor.getValue(bean)).thenReturn(map);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);
        writer.getAndFilter(bean, generator, provider, filter);

        verify(mapSerializer, times(1))
                .serializeFilteredFields(eq(map), eq(generator), eq(provider), eq(filter), isNull());
    }

    @Test
    public void getAndFilter_valueIsMap_withNullMapSerializer_noExceptionNoCall() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        when(accessor.getValue(bean)).thenReturn(map);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, null);

        // ไม่ควร throw exception แม้ _mapSerializer เป็น null (branch else ของ if)
        writer.getAndFilter(bean, generator, provider, filter);
    }

    // ---------------------------------------------------------------
    // resolve()
    // ---------------------------------------------------------------

    @Test
    public void resolve_updatesMapSerializer_andNewSerializerIsUsedAfterward() throws Exception {
        MapSerializer resolvedSerializer = mock(MapSerializer.class);
        when(provider.handlePrimaryContextualization(eq(mapSerializer), eq(property)))
                .thenReturn(resolvedSerializer);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);
        writer.resolve(provider);

        verify(provider, times(1)).handlePrimaryContextualization(mapSerializer, property);

        // ตรวจสอบทางอ้อมว่า _mapSerializer ถูกแทนที่ด้วย resolvedSerializer
        Map<String, Object> map = new HashMap<String, Object>();
        when(accessor.getValue(bean)).thenReturn(map);

        writer.getAndSerialize(bean, generator, provider);

        verify(resolvedSerializer, times(1)).serializeFields(eq(map), eq(generator), eq(provider));
        verify(mapSerializer, never()).serializeFields(any(Map.class), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void resolve_whenReturnsNull_setsMapSerializerToNull() throws Exception {
        // สมมติ handlePrimaryContextualization คืน null (edge case ตาม signature)
        when(provider.handlePrimaryContextualization(eq(mapSerializer), eq(property)))
                .thenReturn(null);

        AnyGetterWriter writer = new AnyGetterWriter(property, accessor, mapSerializer);
        writer.resolve(provider);

        // หาก _mapSerializer กลายเป็น null แล้ว getAndSerialize ไม่ควร throw
        Map<String, Object> map = new HashMap<String, Object>();
        when(accessor.getValue(bean)).thenReturn(map);

        writer.getAndSerialize(bean, generator, provider);
        // ไม่มี exception = ผ่าน branch _mapSerializer == null หลัง resolve
    }
}

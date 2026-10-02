package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.PropertyReferring;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit test สำหรับ ObjectIdReferenceProperty (Defects4J: JacksonDatabind-111b)
 *
 * หมายเหตุสำคัญ (ตามข้อกำหนดห้ามเดา behavior ที่ไม่มีในซอร์ส):
 * - SettableBeanProperty เป็น abstract class ที่ไม่มีซอร์สให้ จึง mock ด้วย Mockito
 *   และใช้ subclass ภายใน (TestableProperty) เพื่อ override deserialize(...)
 *   (สมมติฐาน: deserialize(JsonParser, DeserializationContext) เป็น public method
 *   ที่ไม่ final ตาม API มาตรฐานของ Jackson ที่ใช้กันแพร่หลาย)
 * - ชื่อ field _forward, _objectIdInfo, _type, _valueDeserializer, _nullProvider
 *   ถูกอ้างถึงตรง ๆ ในซอร์สของ ObjectIdReferenceProperty ที่ให้มา จึงมั่นใจในชื่อ field จริง
 * - Referring.hasId(...) (superclass ของ PropertyReferring) ไม่มีซอร์สให้
 *   จึงไม่ assert ผลลัพธ์ที่แน่นอนของ branch นั้น แต่ครอบคลุมทั้งสองความเป็นไปได้
 */
public class ObjectIdReferencePropertyTest {

    private SettableBeanProperty forward;
    private ObjectIdInfo objectIdInfo;

    @Before
    public void setUp() {
        forward = mock(SettableBeanProperty.class);
        objectIdInfo = mock(ObjectIdInfo.class);
    }

    // ---------- reflection helpers (ใช้เฉพาะ field ที่ private และเข้าถึงไม่ได้ตรง ๆ) ----------

    private static void setField(Object target, String name, Object value) throws Exception {
        Class<?> c = target.getClass();
        while (c != null) {
            try {
                Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                f.set(target, value);
                return;
            } catch (NoSuchFieldException e) {
                c = c.getSuperclass();
            }
        }
        throw new NoSuchFieldException(name);
    }

    private static Object getField(Object target, String name) throws Exception {
        Class<?> c = target.getClass();
        while (c != null) {
            try {
                Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                return f.get(target);
            } catch (NoSuchFieldException e) {
                c = c.getSuperclass();
            }
        }
        throw new NoSuchFieldException(name);
    }

    /**
     * Subclass ช่วยทดสอบ: override deserialize(...) เพื่อควบคุม flow ของ
     * deserializeSetAndReturn โดยไม่ต้องพึ่งพา internal implementation ของ
     * SettableBeanProperty.deserialize(...) ที่ไม่มีซอร์สให้
     * และสามารถ set protected field (_type, _valueDeserializer) ได้ตรง ๆ
     * เพราะเป็น subclass ของ ObjectIdReferenceProperty (เหมือนที่ตัวจริงทำ)
     */
    static class TestableProperty extends ObjectIdReferenceProperty {
        private static final long serialVersionUID = 1L;
        private final Object normalResult;
        private final UnresolvedForwardReference toThrow;

        TestableProperty(SettableBeanProperty forward, ObjectIdInfo info,
                Object normalResult, UnresolvedForwardReference toThrow,
                JavaType typeOverride, JsonDeserializer<?> deserOverride) {
            super(forward, info);
            this.normalResult = normalResult;
            this.toThrow = toThrow;
            if (typeOverride != null) {
                this._type = typeOverride;
            }
            if (deserOverride != null) {
                this._valueDeserializer = deserOverride;
            }
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (toThrow != null) {
                throw toThrow;
            }
            return normalResult;
        }
    }

    // ==================== Constructor ====================

    @Test
    public void testConstructor_WithNullObjectIdInfo_NoException() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, null);
        assertNotNull(prop);
    }

    // ==================== withName ====================

    @Test
    public void testWithName_ReturnsNewInstanceWithNewName() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty result = prop.withName(newName);
        assertNotSame(prop, result);
        assertTrue(result instanceof ObjectIdReferenceProperty);
        // getName() เป็น API มาตรฐานของ BeanProperty/SettableBeanProperty
        assertEquals("newName", result.getName());
    }

    // ==================== withValueDeserializer ====================

    @Test
    public void testWithValueDeserializer_SameDeserializer_ReturnsSameInstance() {
        // _valueDeserializer เริ่มต้นเป็น null (คัดลอกจาก forward mock ที่ยังไม่ stub)
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        SettableBeanProperty result = prop.withValueDeserializer(null);
        assertSame(prop, result);
    }

    @Test
    public void testWithValueDeserializer_DifferentDeserializer_ReturnsNewInstance() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        SettableBeanProperty result = prop.withValueDeserializer(deser);
        assertNotSame(prop, result);
        assertTrue(result instanceof ObjectIdReferenceProperty);
    }

    @Test
    public void testWithValueDeserializer_KeepsNullProviderInSync() throws Exception {
        // ตรวจ branch ตามคอมเมนต์ใน source: [databind#2303] ต้องคง NullValueProvider เดิมไว้
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        NullValueProvider nva = mock(NullValueProvider.class);
        ObjectIdReferenceProperty prop2 = (ObjectIdReferenceProperty) prop.withNullProvider(nva);

        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        ObjectIdReferenceProperty prop3 = (ObjectIdReferenceProperty) prop2.withValueDeserializer(deser);

        assertSame(nva, getField(prop3, "_nullProvider"));
        assertSame(deser, getField(prop3, "_valueDeserializer"));
    }

    // ==================== withNullProvider ====================

    @Test
    public void testWithNullProvider_ReturnsNewInstance() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        NullValueProvider nva = mock(NullValueProvider.class);
        SettableBeanProperty result = prop.withNullProvider(nva);
        assertNotSame(prop, result);
        assertTrue(result instanceof ObjectIdReferenceProperty);
    }

    // ==================== fixAccess ====================

    @Test
    public void testFixAccess_ForwardNotNull_DelegatesToForward() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        DeserializationConfig config = mock(DeserializationConfig.class);
        prop.fixAccess(config);
        verify(forward, times(1)).fixAccess(config);
    }

    @Test
    public void testFixAccess_ForwardNull_NoDelegate() throws Exception {
        // บังคับ _forward = null ผ่าน reflection เพื่อทดสอบ branch "else" (if (_forward != null))
        // หมายเหตุ: ในการใช้งานจริง forward param ไม่ควรเป็น null แต่ source มีการเช็คไว้
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        setField(prop, "_forward", null);
        DeserializationConfig config = mock(DeserializationConfig.class);
        prop.fixAccess(config); // ต้องไม่ throw exception
        verify(forward, never()).fixAccess(any(DeserializationConfig.class));
    }

    // ==================== getAnnotation / getMember / getCreatorIndex ====================

    @Test
    public void testGetAnnotation_DelegatesToForward() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        Deprecated dep = mock(Deprecated.class);
        when(forward.getAnnotation(Deprecated.class)).thenReturn(dep);
        assertSame(dep, prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember_DelegatesToForward() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(forward.getMember()).thenReturn(member);
        assertSame(member, prop.getMember());
    }

    @Test
    public void testGetCreatorIndex_DelegatesToForward() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        when(forward.getCreatorIndex()).thenReturn(7);
        assertEquals(7, prop.getCreatorIndex());
    }

    @Test
    public void testGetCreatorIndex_BoundaryNegativeOne() {
        // ค่าขอบเขต: -1 มักใช้แทน "ไม่มี creator index"
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        when(forward.getCreatorIndex()).thenReturn(-1);
        assertEquals(-1, prop.getCreatorIndex());
    }

    // ==================== set / setAndReturn ====================

    @Test
    public void testSet_DelegatesToForward() throws IOException {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        Object instance = new Object();
        Object value = "value";
        prop.set(instance, value);
        verify(forward, times(1)).set(instance, value);
    }

    @Test
    public void testSet_WithNullValue_DelegatesToForward() throws IOException {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        Object instance = new Object();
        prop.set(instance, null);
        verify(forward, times(1)).set(instance, null);
    }

    @Test
    public void testSetAndReturn_DelegatesToForward() throws IOException {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        Object instance = new Object();
        Object value = "value";
        Object expected = "returned";
        when(forward.setAndReturn(instance, value)).thenReturn(expected);
        assertSame(expected, prop.setAndReturn(instance, value));
    }

    // ==================== deserializeSetAndReturn / deserializeAndSet ====================

    @Test
    public void testDeserializeSetAndReturn_NormalPath_NoException() throws IOException {
        Object instance = new Object();
        Object deserializedValue = "deserialized";
        Object returnedValue = "returned";
        TestableProperty prop = new TestableProperty(forward, objectIdInfo,
                deserializedValue, null, null, null);
        when(forward.setAndReturn(instance, deserializedValue)).thenReturn(returnedValue);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertSame(returnedValue, result);
        verify(forward, times(1)).setAndReturn(instance, deserializedValue);
    }

    @Test
    public void testDeserializeAndSet_NormalPath_DelegatesCorrectly() throws IOException {
        // deserializeAndSet เรียก deserializeSetAndReturn ภายใน -> ตรวจ effect เดียวกัน
        Object instance = new Object();
        Object deserializedValue = "v2";
        TestableProperty prop = new TestableProperty(forward, objectIdInfo,
                deserializedValue, null, null, null);
        when(forward.setAndReturn(instance, deserializedValue)).thenReturn("ignored");

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, instance);

        verify(forward, times(1)).setAndReturn(instance, deserializedValue);
    }

    @Test
    public void testDeserializeSetAndReturn_UnresolvedForwardReference_WithObjectIdInfo() throws Exception {
        // branch: usingIdentityInfo = true เพราะ _objectIdInfo != null (short-circuit, ไม่เรียก _valueDeserializer)
        Object instance = new Object();
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ref.getRoid()).thenReturn(roid);

        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        TestableProperty prop = new TestableProperty(forward, objectIdInfo, null, ref, type, null);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertNull(result);
        verify(roid, times(1)).appendReferring(any(PropertyReferring.class));
    }

    @Test
    public void testDeserializeSetAndReturn_UnresolvedForwardReference_WithValueDeserializerObjectIdReader()
            throws Exception {
        // branch: usingIdentityInfo = true เพราะ _objectIdInfo == null แต่
        // _valueDeserializer.getObjectIdReader() != null
        Object instance = new Object();
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        when(ref.getRoid()).thenReturn(roid);

        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        ObjectIdReader oidReader = mock(ObjectIdReader.class);
        when(deser.getObjectIdReader()).thenReturn(oidReader);

        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        TestableProperty prop = new TestableProperty(forward, null, null, ref, type, deser);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertNull(result);
        verify(roid, times(1)).appendReferring(any(PropertyReferring.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeSetAndReturn_UnresolvedForwardReference_NoIdentityInfo_Throws() throws Exception {
        // branch: usingIdentityInfo = false -> throw JsonMappingException
        Object instance = new Object();
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);

        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.getObjectIdReader()).thenReturn(null);

        TestableProperty prop = new TestableProperty(forward, null, null, ref, null, deser);

        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeSetAndReturn(p, ctxt, instance);
    }

    // ==================== PropertyReferring ====================

    @Test
    public void testPropertyReferring_Construction_DoesNotThrow() {
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        Object pojo = new Object();

        PropertyReferring referring = new PropertyReferring(prop, ref, Object.class, pojo);

        assertNotNull(referring);
        assertSame(pojo, referring._pojo);
    }

    @Test
    public void testPropertyReferring_HandleResolvedForwardReference_BestEffort() throws IOException {
        // หมายเหตุสำคัญ: hasId(id) มาจาก ReadableObjectId.Referring ซึ่งไม่มีซอร์สให้
        // จึงไม่ทราบแน่ชัดว่า id แบบใดจะทำให้ hasId() คืน true/false
        // ทดสอบนี้ครอบคลุมทั้งสอง branch ที่เป็นไปได้ตาม logic ที่ระบุใน source ของ
        // ObjectIdReferenceProperty.PropertyReferring.handleResolvedForwardReference:
        //   - ถ้า hasId() == true  -> ต้องเรียก _parent.set(pojo, value) (ซึ่ง delegate ไปที่ forward.set)
        //   - ถ้า hasId() == false -> ต้อง throw IllegalArgumentException
        ObjectIdReferenceProperty prop = new ObjectIdReferenceProperty(forward, objectIdInfo);
        UnresolvedForwardReference ref = mock(UnresolvedForwardReference.class);
        Object pojo = new Object();
        PropertyReferring referring = new PropertyReferring(prop, ref, Object.class, pojo);

        try {
            referring.handleResolvedForwardReference(new Object(), "someValue");
            // ไม่ throw แปลว่า hasId() คืน true -> ต้องมีการ set ค่าจริง
            verify(forward, times(1)).set(eq(pojo), eq("someValue"));
        } catch (IllegalArgumentException expectedWhenIdNotSeen) {
            assertTrue(expectedWhenIdNotSeen.getMessage().contains("Trying to resolve"));
        }
    }
}

package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link AtomicReferenceDeserializer}.
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น "thin wrapper" รอบ ReferenceTypeDeserializer
 * ไม่มี if/else หรือ loop ภายในตัวมันเอง (ยกเว้น logic ที่สืบทอดจาก superclass
 * ซึ่งไม่ได้แสดงในซอร์สที่ให้มา) ดังนั้นเทสนี้จะเน้นที่
 * - boundary / null / empty ของแต่ละเมธอด public ที่ override
 * - การตรวจสอบ identity/state ของ AtomicReference ที่ถูกสร้าง/แก้ไข
 * - การเรียก withResolved เพื่อสร้าง instance ใหม่ (รวมกรณี null parameter)
 */
public class AtomicReferenceDeserializerTest {

    private JavaType fullType;
    private ValueInstantiator mockInstantiator;
    private TypeDeserializer mockTypeDeserializer;
    private JsonDeserializer<Object> mockValueDeserializer;
    private DeserializationContext mockContext;
    private DeserializationConfig mockConfig;

    private AtomicReferenceDeserializer deserializer;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        // ใช้ TypeFactory จริงเพื่อสร้าง JavaType ของ AtomicReference
        fullType = TypeFactory.defaultInstance().constructType(AtomicReference.class);

        mockInstantiator = mock(ValueInstantiator.class);
        mockTypeDeserializer = mock(TypeDeserializer.class);
        mockValueDeserializer = mock(JsonDeserializer.class);
        mockContext = mock(DeserializationContext.class);
        mockConfig = mock(DeserializationConfig.class);

        deserializer = new AtomicReferenceDeserializer(
                fullType, mockInstantiator, mockTypeDeserializer, mockValueDeserializer);
    }

    // ---------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------

    @Test
    public void testConstructorWithNullTypeDeserializerAndValueDeserializer() {
        // edge case: typeDeser และ deser อาจเป็น null ได้ตามการออกแบบของ Jackson
        AtomicReferenceDeserializer d = new AtomicReferenceDeserializer(
                fullType, mockInstantiator, null, null);
        assertNotNull(d);
    }

    // ---------------------------------------------------------
    // getNullValue
    // ---------------------------------------------------------

    @Test
    public void testGetNullValueReturnsNewAtomicReferenceWithNullContent() throws Exception {
        AtomicReference<Object> result = deserializer.getNullValue(mockContext);
        assertNotNull("ควรได้ AtomicReference ใหม่ ไม่ใช่ null", result);
        assertNull("ค่าภายในควรเป็น null", result.get());
    }

    @Test
    public void testGetNullValueReturnsDistinctInstancesEachCall() throws Exception {
        // ตรวจสอบว่าไม่ได้ cache instance เดิม (branch: new AtomicReference ทุกครั้ง)
        AtomicReference<Object> r1 = deserializer.getNullValue(mockContext);
        AtomicReference<Object> r2 = deserializer.getNullValue(mockContext);
        assertNotSame(r1, r2);
    }

    // ---------------------------------------------------------
    // getEmptyValue
    // ---------------------------------------------------------

    @Test
    public void testGetEmptyValueReturnsAtomicReferenceInstanceWithNullContent() {
        Object result = deserializer.getEmptyValue(mockContext);
        assertTrue("ผลลัพธ์ควรเป็น AtomicReference", result instanceof AtomicReference);
        @SuppressWarnings("unchecked")
        AtomicReference<Object> ref = (AtomicReference<Object>) result;
        assertNull(ref.get());
    }

    @Test
    public void testGetEmptyValueReturnsDistinctInstancesEachCall() {
        Object r1 = deserializer.getEmptyValue(mockContext);
        Object r2 = deserializer.getEmptyValue(mockContext);
        assertNotSame(r1, r2);
    }

    // ---------------------------------------------------------
    // referenceValue
    // ---------------------------------------------------------

    @Test
    public void testReferenceValueWithNonNullContent() {
        AtomicReference<Object> ref = deserializer.referenceValue("hello");
        assertNotNull(ref);
        assertEquals("hello", ref.get());
    }

    @Test
    public void testReferenceValueWithNullContent() {
        // boundary: contents == null
        AtomicReference<Object> ref = deserializer.referenceValue(null);
        assertNotNull(ref);
        assertNull(ref.get());
    }

    @Test
    public void testReferenceValueCreatesNewInstanceEachCall() {
        AtomicReference<Object> r1 = deserializer.referenceValue("a");
        AtomicReference<Object> r2 = deserializer.referenceValue("a");
        assertNotSame(r1, r2);
    }

    // ---------------------------------------------------------
    // getReferenced
    // ---------------------------------------------------------

    @Test
    public void testGetReferencedReturnsUnderlyingValue() {
        AtomicReference<Object> ref = new AtomicReference<Object>("content");
        Object result = deserializer.getReferenced(ref);
        assertEquals("content", result);
    }

    @Test
    public void testGetReferencedWithNullUnderlyingValue() {
        // boundary: ค่าภายใน AtomicReference เป็น null
        AtomicReference<Object> ref = new AtomicReference<Object>(null);
        Object result = deserializer.getReferenced(ref);
        assertNull(result);
    }

    // ---------------------------------------------------------
    // updateReference
    // ---------------------------------------------------------

    @Test
    public void testUpdateReferenceSetsNewValueAndReturnsSameInstance() {
        AtomicReference<Object> ref = new AtomicReference<Object>("old");
        AtomicReference<Object> result = deserializer.updateReference(ref, "new");

        assertSame("ควร return instance เดิม (อัปเดต in-place)", ref, result);
        assertEquals("new", ref.get());
    }

    @Test
    public void testUpdateReferenceWithNullContent() {
        // boundary: contents == null -> ตั้งค่าภายในเป็น null ได้
        AtomicReference<Object> ref = new AtomicReference<Object>("old");
        AtomicReference<Object> result = deserializer.updateReference(ref, null);

        assertSame(ref, result);
        assertNull(ref.get());
    }

    @Test
    public void testUpdateReferenceFromNullToValue() {
        // boundary: reference เดิมมีค่า null แล้วอัปเดตเป็นค่าใหม่
        AtomicReference<Object> ref = new AtomicReference<Object>(null);
        AtomicReference<Object> result = deserializer.updateReference(ref, "value");

        assertSame(ref, result);
        assertEquals("value", ref.get());
    }

    // ---------------------------------------------------------
    // supportsUpdate
    // ---------------------------------------------------------

    @Test
    public void testSupportsUpdateAlwaysReturnsTrue() {
        Boolean result = deserializer.supportsUpdate(mockConfig);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testSupportsUpdateWithNullConfigStillReturnsTrue() {
        // edge case: config เป็น null; เมธอดไม่ได้ใช้ config เลยตามซอร์ส
        // ดังนั้นควร return TRUE โดยไม่มี NullPointerException
        Boolean result = deserializer.supportsUpdate(null);
        assertEquals(Boolean.TRUE, result);
    }

    // ---------------------------------------------------------
    // withResolved
    // ---------------------------------------------------------

    @SuppressWarnings("unchecked")
    @Test
    public void testWithResolvedReturnsNewInstanceOfCorrectType() {
        TypeDeserializer newTypeDeser = mock(TypeDeserializer.class);
        JsonDeserializer<Object> newValueDeser = mock(JsonDeserializer.class);

        AtomicReferenceDeserializer result =
                deserializer.withResolved(newTypeDeser, newValueDeser);

        assertNotNull(result);
        assertNotSame("ควรเป็น instance ใหม่เสมอ", deserializer, result);
        assertTrue(result instanceof AtomicReferenceDeserializer);
    }

    @Test
    public void testWithResolvedAcceptsNullArguments() {
        // edge case: ค่า typeDeser/valueDeser ที่ส่งเข้าไปเป็น null
        AtomicReferenceDeserializer result = deserializer.withResolved(null, null);
        assertNotNull(result);
        assertNotSame(deserializer, result);
    }

    @Test
    public void testWithResolvedPreservesBehaviorOfNewInstance() throws Exception {
        // ตรวจสอบว่า instance ใหม่ที่ได้ยังทำงานตาม contract เดิมได้ถูกต้อง
        TypeDeserializer newTypeDeser = mock(TypeDeserializer.class);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> newValueDeser = mock(JsonDeserializer.class);

        AtomicReferenceDeserializer result =
                deserializer.withResolved(newTypeDeser, newValueDeser);

        AtomicReference<Object> nullVal = result.getNullValue(mockContext);
        assertNotNull(nullVal);
        assertNull(nullVal.get());

        AtomicReference<Object> refVal = result.referenceValue("x");
        assertEquals("x", refVal.get());
    }
}

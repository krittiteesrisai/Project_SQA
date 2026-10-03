package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class AtomicReferenceDeserializerTest {

    private AtomicReferenceDeserializer deserializer;
    private JavaType fullType;
    private ValueInstantiator valueInstantiator;
    private TypeDeserializer typeDeserializer;
    @SuppressWarnings("unchecked")
    private JsonDeserializer<Object> valueDeserializer;

    @Before
    public void setUp() {
        fullType = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        valueInstantiator = Mockito.mock(ValueInstantiator.class);
        typeDeserializer = Mockito.mock(TypeDeserializer.class);
        valueDeserializer = (JsonDeserializer<Object>) Mockito.mock(JsonDeserializer.class);

        deserializer = new AtomicReferenceDeserializer(fullType, valueInstantiator, typeDeserializer, valueDeserializer);
    }

    @Test
    public void testConstructorAndWithResolved() {
        // ทดสอบ withResolved เมื่อรับค่าปกติ
        AtomicReferenceDeserializer resolved = deserializer.withResolved(typeDeserializer, valueDeserializer);
        assertNotNull("Resolved deserializer should not be null", resolved);
        assertNotSame("Resolved deserializer should be a new instance", deserializer, resolved);

        // ทดสอบ withResolved เมื่อพารามิเตอร์เป็น null (Edge Case)
        AtomicReferenceDeserializer nullResolved = deserializer.withResolved(null, null);
        assertNotNull("Resolved deserializer with nulls should not be null", nullResolved);
    }

    @Test
    public void testGetNullValue() throws Exception {
        DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        AtomicReference<Object> nullRef = deserializer.getNullValue(ctxt);
        
        assertNotNull("Null value reference wrapper should not be null", nullRef);
        assertNull("Inner value of null reference should be null", nullRef.get());
    }

    @Test
    public void testGetEmptyValue() {
        DeserializationContext ctxt = Mockito.mock(DeserializationContext.class);
        Object emptyVal = deserializer.getEmptyValue(ctxt);
        
        assertNotNull("Empty value should not be null", emptyVal);
        assertTrue("Empty value should be an instance of AtomicReference", emptyVal instanceof AtomicReference);
        assertNull("Inner value of empty AtomicReference should be null", ((AtomicReference<?>) emptyVal).get());
    }

    @Test
    public void testReferenceValue_EdgeCases() {
        // กรณีปกติ: มีค่า Non-null
        String content = "Hello Jackson";
        AtomicReference<Object> refWithContent = deserializer.referenceValue(content);
        assertNotNull(refWithContent);
        assertEquals(content, refWithContent.get());

        // Edge Case: ค่าเป็น null
        AtomicReference<Object> refWithNull = deserializer.referenceValue(null);
        assertNotNull(refWithNull);
        assertNull(refWithNull.get());
    }

    @Test
    public void testGetReferenced() {
        AtomicReference<Object> reference = new AtomicReference<Object>("TestReference");
        Object referenced = deserializer.getReferenced(reference);
        assertEquals("TestReference", referenced);

        // Edge Case: Reference ภายในเก็บค่า null
        AtomicReference<Object> nullContentRef = new AtomicReference<Object>(null);
        assertNull(deserializer.getReferenced(nullContentRef));
    }

    @Test
    public void testUpdateReference() {
        AtomicReference<Object> reference = new AtomicReference<Object>("OldValue");
        String newValue = "NewValue";
        
        AtomicReference<Object> updatedRef = deserializer.updateReference(reference, newValue);
        
        assertSame("Should return the exact same reference instance", reference, updatedRef);
        assertEquals(newValue, updatedRef.get());

        // Edge Case: อัปเดตค่าด้วย null
        AtomicReference<Object> updatedNullRef = deserializer.updateReference(reference, null);
        assertSame(reference, updatedNullRef);
        assertNull(updatedNullRef.get());
    }

    @Test(expected = NullPointerException.class)
    public void testUpdateReference_NullReferenceException() {
        // Edge Case: ส่ง reference เป็น null เพื่อตรวจสอบความทนทานต่อ Fault (ตามพฤติกรรมดั้งเดิมของ reference.set())
        deserializer.updateReference(null, "Value");
    }

    @Test
    public void testSupportsUpdate() {
        DeserializationConfig config = Mockito.mock(DeserializationConfig.class);
        Boolean supports = deserializer.supportsUpdate(config);
        
        assertNotNull(supports);
        assertTrue("AtomicReferenceDeserializer must support update", supports);

        // Edge Case: ส่ง config เป็น null
        assertTrue(deserializer.supportsUpdate(null));
    }
}
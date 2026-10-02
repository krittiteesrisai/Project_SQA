package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * หมายเหตุข้อสมมติ (assumptions) ที่ไม่สามารถตรวจสอบได้ 100% จากซอร์สที่ให้มา
 * เนื่องจากต้องพึ่งพา public API ของ jackson-databind รุ่นที่เกี่ยวข้อง:
 *  - ObjectIdReader.construct(JavaType, PropertyName, ObjectIdGenerator<?>,
 *        JsonDeserializer<?>, SettableBeanProperty, ObjectIdResolver)
 *  - PropertyMetadata.STD_REQUIRED_OR_OPTIONAL (ค่าคงที่ static)
 *  - SettableBeanProperty#getFullName(), #getType(), #getValueDeserializer()
 *  - ReadableObjectId เป็น final class ที่มี constructor public ReadableObjectId(Object id)
 *    (จึงไม่สามารถ mock ได้ด้วย Mockito มาตรฐาน -> ใช้ instance จริงแทน)
 */
@SuppressWarnings("unchecked")
public class ObjectIdValuePropertyTest {

    private JavaType idType;
    private PropertyName propName;
    private JsonDeserializer<Object> baseDeser;
    private ObjectIdGenerator<Object> generator;
    private ObjectIdResolver resolver;

    @Before
    public void setUp() {
        idType = TypeFactory.defaultInstance().constructType(Object.class);
        propName = new PropertyName("id");
        baseDeser = mock(JsonDeserializer.class);
        generator = mock(ObjectIdGenerator.class);
        resolver = mock(ObjectIdResolver.class);
    }

    private ObjectIdReader buildReader(SettableBeanProperty idProp) {
        return ObjectIdReader.construct(idType, propName, generator, baseDeser, idProp, resolver);
    }

    private ObjectIdValueProperty newProperty(SettableBeanProperty idProp) {
        ObjectIdReader reader = buildReader(idProp);
        return new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
    }

    // ---------- Constructor / basic field copy ----------

    @Test
    public void testConstructorFromReaderCopiesCoreFields() {
        ObjectIdValueProperty prop = newProperty(null);
        assertEquals(propName, prop.getFullName());
        assertEquals(idType, prop.getType());
        assertSame(baseDeser, prop.getValueDeserializer());
    }

    // ---------- getAnnotation / getMember override ----------

    @Test
    public void testGetAnnotationAlwaysReturnsNull() {
        ObjectIdValueProperty prop = newProperty(null);
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMemberAlwaysReturnsNull() {
        ObjectIdValueProperty prop = newProperty(null);
        assertNull(prop.getMember());
    }

    // ---------- withName ----------

    @Test
    public void testWithNameReturnsNewInstanceWithUpdatedName() {
        ObjectIdValueProperty prop = newProperty(null);
        PropertyName newName = new PropertyName("newId");

        SettableBeanProperty renamed = prop.withName(newName);

        assertNotSame(prop, renamed);
        assertTrue(renamed instanceof ObjectIdValueProperty);
        assertEquals(newName, renamed.getFullName());
    }

    // ---------- withValueDeserializer: branch same-instance ----------

    @Test
    public void testWithValueDeserializerSameInstanceReturnsSameObject() {
        ObjectIdValueProperty prop = newProperty(null);

        SettableBeanProperty result = prop.withValueDeserializer(baseDeser);

        assertSame(prop, result); // ตรง if (_valueDeserializer == deser) return this;
    }

    // ---------- withValueDeserializer: branch different-instance ----------

    @Test
    public void testWithValueDeserializerDifferentInstanceReturnsNewObject() {
        ObjectIdValueProperty prop = newProperty(null);
        JsonDeserializer<Object> otherDeser = mock(JsonDeserializer.class);

        SettableBeanProperty result = prop.withValueDeserializer(otherDeser);

        assertNotSame(prop, result);
        assertSame(otherDeser, result.getValueDeserializer());
    }

    // ---------- withNullProvider: ไม่มี short-circuit เสมอ new instance ----------

    @Test
    public void testWithNullProviderAlwaysReturnsNewInstance() {
        ObjectIdValueProperty prop = newProperty(null);
        NullValueProvider nva = mock(NullValueProvider.class);

        SettableBeanProperty result = prop.withNullProvider(nva);

        assertNotSame(prop, result);
        // deserializer ต้องคงเดิม ไม่ถูกเปลี่ยนแปลงโดย withNullProvider
        assertSame(baseDeser, result.getValueDeserializer());
    }

    // ---------- deserializeSetAndReturn: branch hasToken(VALUE_NULL) == true ----------

    @Test
    public void testDeserializeSetAndReturn_NullToken_ReturnsNull() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);

        Object result = prop.deserializeSetAndReturn(p, ctxt, new Object());

        assertNull(result);
        verifyZeroInteractions(baseDeser); // ไม่ควรเรียก deserializer เมื่อเป็น null token
    }

    @Test
    public void testDeserializeAndSet_NullToken_NoException() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(true);

        // ไม่ควร throw exception เมื่อ token เป็น null
        prop.deserializeAndSet(p, ctxt, new Object());
    }

    // ---------- deserializeSetAndReturn: branch hasToken==false, idProp == null ----------

    @Test
    public void testDeserializeSetAndReturn_IdPropertyNull_ReturnsInstance() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object idValue = "the-id";
        Object instance = new Object();
        // ReadableObjectId เป็น final class -> ใช้ instance จริง
        ReadableObjectId roid = new ReadableObjectId(idValue);

        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        when(baseDeser.deserialize(p, ctxt)).thenReturn(idValue);
        when(ctxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertSame(instance, result); // idProp == null -> return instance
    }

    // ---------- deserializeSetAndReturn: branch hasToken==false, idProp != null ----------

    @Test
    public void testDeserializeSetAndReturn_IdPropertyPresent_ReturnsSetAndReturnResult() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        ObjectIdValueProperty prop = newProperty(idProp);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object idValue = "id-123";
        Object instance = new Object();
        Object expectedReturn = new Object();
        ReadableObjectId roid = new ReadableObjectId(idValue);

        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        when(baseDeser.deserialize(p, ctxt)).thenReturn(idValue);
        when(ctxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);
        when(idProp.setAndReturn(instance, idValue)).thenReturn(expectedReturn);

        Object result = prop.deserializeSetAndReturn(p, ctxt, instance);

        assertSame(expectedReturn, result);
        verify(idProp).setAndReturn(instance, idValue);
    }

    @Test
    public void testDeserializeAndSet_IdPropertyPresent_InvokesSetAndReturn() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        ObjectIdValueProperty prop = newProperty(idProp);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object idValue = "abc";
        Object instance = new Object();
        ReadableObjectId roid = new ReadableObjectId(idValue);

        when(p.hasToken(JsonToken.VALUE_NULL)).thenReturn(false);
        when(baseDeser.deserialize(p, ctxt)).thenReturn(idValue);
        when(ctxt.findObjectId(eq(idValue), eq(generator), eq(resolver))).thenReturn(roid);

        prop.deserializeAndSet(p, ctxt, instance);

        verify(idProp).setAndReturn(instance, idValue);
    }

    // ---------- setAndReturn: branch idProp == null -> throw ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_IdPropertyNull_ThrowsUnsupportedOperationException() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        prop.setAndReturn(new Object(), "value");
    }

    // ---------- setAndReturn: branch idProp != null -> delegate ----------

    @Test
    public void testSetAndReturn_IdPropertyPresent_DelegatesToIdProperty() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        ObjectIdValueProperty prop = newProperty(idProp);
        Object instance = new Object();
        Object value = "val";
        Object expected = new Object();
        when(idProp.setAndReturn(instance, value)).thenReturn(expected);

        Object result = prop.setAndReturn(instance, value);

        assertSame(expected, result);
    }

    // ---------- set(): delegate ไปยัง setAndReturn ----------

    @Test
    public void testSet_IdPropertyPresent_DelegatesToSetAndReturn() throws IOException {
        SettableBeanProperty idProp = mock(SettableBeanProperty.class);
        ObjectIdValueProperty prop = newProperty(idProp);
        Object instance = new Object();
        Object value = "val2";

        prop.set(instance, value);

        verify(idProp).setAndReturn(instance, value);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_IdPropertyNull_ThrowsUnsupportedOperationException() throws IOException {
        ObjectIdValueProperty prop = newProperty(null);
        prop.set(new Object(), "x");
    }
}

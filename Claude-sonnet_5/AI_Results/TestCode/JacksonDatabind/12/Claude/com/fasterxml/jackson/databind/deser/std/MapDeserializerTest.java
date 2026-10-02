package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@SuppressWarnings("unchecked")
public class MapDeserializerTest {

    private JavaType mapType;
    private JavaType keyType;
    private JavaType contentType;
    private ValueInstantiator valueInstantiator;
    private KeyDeserializer keyDeserializer;
    private JsonDeserializer<Object> valueDeserializer;
    private TypeDeserializer typeDeserializer;
    private JsonParser jp;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        mapType = mock(JavaType.class);
        keyType = mock(JavaType.class);
        contentType = mock(JavaType.class);
        valueInstantiator = mock(ValueInstantiator.class);
        keyDeserializer = mock(KeyDeserializer.class);
        valueDeserializer = mock(JsonDeserializer.class);
        typeDeserializer = mock(TypeDeserializer.class);
        jp = mock(JsonParser.class);
        ctxt = mock(DeserializationContext.class);

        when(mapType.getContentType()).thenReturn(contentType);
        when(mapType.getKeyType()).thenReturn(keyType);
        doReturn(HashMap.class).when(mapType).getRawClass();
        doReturn(Object.class).when(contentType).getRawClass();
        when(valueInstantiator.canCreateUsingDefault()).thenReturn(true);
    }

    private MapDeserializer newDefaultDeserializer() {
        // keyDeser = null -> _isStdKeyDeser trivially true (branch 1 of _isStdKeyDeser)
        return new MapDeserializer(mapType, valueInstantiator, null, valueDeserializer, null);
    }

    /* ================================================================
     * Constructor / _isStdKeyDeser
     * ================================================================ */

    @Test
    public void testConstructor_StandardStringKey_WhenKeyDeserializerNull() {
        MapDeserializer d = newDefaultDeserializer();
        assertTrue(d._standardStringKey);
        assertTrue(d._hasDefaultCreator);
    }

    @Test
    public void testIsStdKeyDeser_KeyDeserializerNull_ReturnsTrueDirectCall() {
        MapDeserializer d = newDefaultDeserializer();
        assertTrue(d._isStdKeyDeser(mapType, null));
    }

    @Test
    public void testIsStdKeyDeser_KeyTypeNull_ReturnsTrue() {
        when(mapType.getKeyType()).thenReturn(null);
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        assertTrue(d._isStdKeyDeser(mapType, keyDeserializer));
    }

    @Test
    public void testIsStdKeyDeser_StringKeyType_NonDefaultDeserializer_ReturnsFalse() {
        // สมมติ: keyDeserializer เป็น Mockito mock จึงไม่ใช่ instance ของ default key deserializer จริง
        // ทำให้ isDefaultKeyDeserializer(...) (ซึ่งไม่ได้แสดงใน source ที่ให้มา) คืน false
        doReturn(String.class).when(keyType).getRawClass();
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        assertFalse(d._isStdKeyDeser(mapType, keyDeserializer));
    }

    @Test
    public void testIsStdKeyDeser_ObjectKeyType_NonDefaultDeserializer_ReturnsFalse() {
        doReturn(Object.class).when(keyType).getRawClass();
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        assertFalse(d._isStdKeyDeser(mapType, keyDeserializer));
    }

    @Test
    public void testIsStdKeyDeser_OtherKeyType_ReturnsFalse() {
        doReturn(Integer.class).when(keyType).getRawClass();
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        assertFalse(d._isStdKeyDeser(mapType, keyDeserializer));
    }

    /* ================================================================
     * setIgnorableProperties
     * ================================================================ */

    @Test
    public void testSetIgnorableProperties_Null() {
        MapDeserializer d = newDefaultDeserializer();
        d.setIgnorableProperties(null);
        assertNull(d._ignorableProperties);
    }

    @Test
    public void testSetIgnorableProperties_Empty() {
        MapDeserializer d = newDefaultDeserializer();
        d.setIgnorableProperties(new String[0]);
        assertNull(d._ignorableProperties);
    }

    @Test
    public void testSetIgnorableProperties_NonEmpty() {
        MapDeserializer d = newDefaultDeserializer();
        d.setIgnorableProperties(new String[] { "a", "b" });
        assertNotNull(d._ignorableProperties);
        assertTrue(d._ignorableProperties.contains("a"));
        assertTrue(d._ignorableProperties.contains("b"));
    }

    @Test
    public void testSetIgnorableProperties_ArrayWithEmptyStringElement() {
        // boundary: length == 1 แต่ element เป็น "" (ไม่ใช่ empty array)
        MapDeserializer d = newDefaultDeserializer();
        d.setIgnorableProperties(new String[] { "" });
        assertNotNull(d._ignorableProperties);
        assertTrue(d._ignorableProperties.contains(""));
    }

    /* ================================================================
     * isCachable
     * ================================================================ */

    @Test
    public void testIsCachable_True_NoTypeDeserializer_NoIgnorable() {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        assertTrue(d.isCachable());
    }

    @Test
    public void testIsCachable_False_WithTypeDeserializer() {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, typeDeserializer);
        assertFalse(d.isCachable());
    }

    @Test
    public void testIsCachable_False_WithIgnorableProperties() {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        d.setIgnorableProperties(new String[] { "x" });
        assertFalse(d.isCachable());
    }

    /* ================================================================
     * Simple accessors
     * ================================================================ */

    @Test
    public void testAccessors() {
        MapDeserializer d = newDefaultDeserializer();
        assertSame(contentType, d.getContentType());
        assertSame(valueDeserializer, d.getContentDeserializer());
        assertEquals(HashMap.class, d.getMapClass());
        assertSame(mapType, d.getValueType());
    }

    @Test
    public void testDeserializeWithType_DelegatesToTypeDeserializer() throws IOException {
        MapDeserializer d = newDefaultDeserializer();
        Object expected = new HashMap<Object, Object>();
        when(typeDeserializer.deserializeTypedFromObject(jp, ctxt)).thenReturn(expected);

        Object result = d.deserializeWithType(jp, ctxt, typeDeserializer);

        assertSame(expected, result);
        verify(typeDeserializer).deserializeTypedFromObject(jp, ctxt);
    }

    /* ================================================================
     * wrapAndThrow
     * ================================================================ */

    @Test(expected = Error.class)
    public void testWrapAndThrow_Error_Rethrown() throws IOException {
        MapDeserializer d = newDefaultDeserializer();
        d.wrapAndThrow(new OutOfMemoryError("boom"), new Object(), "field");
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrow_PlainIOException_Rethrown() throws IOException {
        MapDeserializer d = newDefaultDeserializer();
        d.wrapAndThrow(new IOException("io problem"), new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow_RuntimeException_WrappedAsJsonMappingException() throws IOException {
        MapDeserializer d = newDefaultDeserializer();
        d.wrapAndThrow(new RuntimeException("bad"), new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow_InvocationTargetException_UnwrapsCause() throws IOException {
        MapDeserializer d = newDefaultDeserializer();
        InvocationTargetException ite = new InvocationTargetException(new RuntimeException("root"));
        d.wrapAndThrow(ite, new Object(), "field");
    }

    /* ================================================================
     * _readAndBind (non-standard-key path)
     * ================================================================ */

    @Test
    public void testReadAndBind_EmptyObject() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();
        when(jp.getCurrentToken()).thenReturn(JsonToken.END_OBJECT);
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);

        d._readAndBind(jp, ctxt, result);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testReadAndBind_SingleEntry() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.deserialize(jp, ctxt)).thenReturn("V1");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);

        d._readAndBind(jp, ctxt, result);

        assertEquals(1, result.size());
        assertEquals("V1", result.get("K1"));
    }

    @Test
    public void testReadAndBind_StartObjectToken_AdvancesFirst() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.deserialize(jp, ctxt)).thenReturn("V1");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);

        d._readAndBind(jp, ctxt, result);

        assertEquals("V1", result.get("K1"));
    }

    @Test
    public void testReadAndBind_NullValue_UsesGetNullValue() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_NULL, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.getNullValue()).thenReturn("NULLVAL");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);

        d._readAndBind(jp, ctxt, result);

        assertEquals("NULLVAL", result.get("K1"));
        verify(valueDeserializer, never()).deserialize(jp, ctxt);
    }

    @Test
    public void testReadAndBind_WithTypeDeserializer_UsesDeserializeWithType() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, typeDeserializer);
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.deserializeWithType(jp, ctxt, typeDeserializer)).thenReturn("TYPEDVAL");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);

        d._readAndBind(jp, ctxt, result);

        assertEquals("TYPEDVAL", result.get("K1"));
        verify(valueDeserializer, never()).deserialize(jp, ctxt);
    }

    @Test
    public void testReadAndBind_IgnorableProperty_Skipped() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        d.setIgnorableProperties(new String[] { "k1" });
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        // ตาม source: key ถูก deserialize ก่อนเช็ค ignorable เสมอ
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);

        d._readAndBind(jp, ctxt, result);

        verify(jp).skipChildren();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testReadAndBind_UseObjectId_EmptyAccumulator_PutsDirectlyInResult() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();

        ObjectIdReader oidReader = mock(ObjectIdReader.class);
        when(valueDeserializer.getObjectIdReader()).thenReturn(oidReader);

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.deserialize(jp, ctxt)).thenReturn("V1");

        d._readAndBind(jp, ctxt, result);

        // เมื่อ accumulator ยังว่าง MapReferringAccumulator.put จะ put ตรงเข้า result
        assertEquals("V1", result.get("K1"));
    }

    @Test(expected = JsonMappingException.class)
    public void testReadAndBind_ValueDeserializerThrowsRuntimeException_WrappedAsJsonMappingException() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null);
        when(valueDeserializer.deserialize(jp, ctxt)).thenThrow(new RuntimeException("boom"));

        d._readAndBind(jp, ctxt, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testReadAndBind_UnresolvedForwardReference_NoAccumulator_Throws() throws IOException {
        MapDeserializer d = new MapDeserializer(mapType, valueInstantiator, keyDeserializer, valueDeserializer, null);
        Map<Object, Object> result = new HashMap<Object, Object>();

        when(jp.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(jp.getCurrentName()).thenReturn("k1");
        when(jp.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        when(keyDeserializer.deserializeKey("k1", ctxt)).thenReturn("K1");
        when(valueDeserializer.getObjectIdReader()).thenReturn(null); // useObjectId = false -> accumulator == null
        when(jp.getCurrentLocation()).thenReturn(JsonLocation.NA);

        UnresolvedForwardReference ufr = m
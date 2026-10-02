# วิเคราะห์และแผนการทดสอบ

จาก source code ของ `CollectionDeserializer` ผมได้ระบุ branch/condition หลักที่ควร cover:

- `isCachable()` – 4 combination ของ null/non-null fields
- `deserialize(p, ctxt)` – delegate != null, empty string, non-empty string (fallback), normal array
- `deserialize(p, ctxt, result)` – not-start-array, VALUE_NULL, typeDeser null/non-null, ObjectIdReader null/non-null, UnresolvedForwardReference (มี/ไม่มี accumulator), Exception (wrap true/false, RuntimeException/checked)
- `handleNonArray()` – canWrap false/true (ผ่าน unwrapSingle TRUE, ผ่าน feature enabled), VALUE_NULL, typeDeser, exception wrap
- `deserializeWithType()`
- `createContextual()` – เฉพาะ branch ที่ deterministic (delegateType null → throw) เพราะ branch อื่นพึ่งพา internal helper ของ jackson-databind ที่ไม่ได้แสดงใน source (คอมเมนต์กำกับไว้)
- `withResolved()` – same/different params
- `CollectionReferringAccumulator` – add() กรณี empty, resolveForwardReference() กรณีไม่พบ id

**หมายเหตุสำคัญ:** โปรเจกต์นี้เป็น Defects4J `JacksonDatabind-62b` ซึ่งคลาส `CollectionDeserializer` และ dependency ทั้งหมด (JsonDeserializer, DeserializationContext, ValueInstantiator ฯลฯ) เป็นส่วนหนึ่งของ source ที่ถูกทดสอบเอง (compile อยู่แล้วใน classpath ของโปรเจกต์) ไม่ใช่ jar ภายนอกที่ระบุมา ดังนั้นจึงสามารถ import และใช้ mock ผ่าน Mockito ได้ตามปกติ

```java
package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer; // redundant (same package) แต่ระบุตามข้อกำหนด
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.CollectionReferringAccumulator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests สำหรับ {@link CollectionDeserializer}
 *
 * หมายเหตุ: บาง branch ของ {@code createContextual} (เช่น path ที่ต้องพึ่ง
 * findFormatFeature/findConvertingContentDeserializer ภายใน) ไม่ได้ถูกทดสอบแบบ
 * ครบถ้วน เนื่องจากพฤติกรรมภายในของ helper เหล่านั้นไม่ได้แสดงอยู่ใน source
 * ที่ให้มา จึงทดสอบเฉพาะ branch ที่ deterministic และอิงจาก source ตรง ๆ
 * (delegateType == null -> IllegalArgumentException)
 */
@SuppressWarnings({"unchecked", "deprecation"})
public class CollectionDeserializerTest
{
    private JavaType listType;
    private JsonDeserializer<Object> valueDeser;
    private TypeDeserializer typeDeser;
    private ValueInstantiator valueInstantiator;
    private JsonParser parser;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        listType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        valueDeser = mock(JsonDeserializer.class);
        typeDeser = mock(TypeDeserializer.class);
        valueInstantiator = mock(ValueInstantiator.class);
        parser = mock(JsonParser.class);
        ctxt = mock(DeserializationContext.class);
    }

    private CollectionDeserializer newDeserializer(TypeDeserializer td) {
        return new CollectionDeserializer(listType, valueDeser, td, valueInstantiator);
    }

    // ------------------------------------------------------------------
    // isCachable()
    // ------------------------------------------------------------------

    @Test
    public void testIsCachable_AllNull_ReturnsTrue() {
        CollectionDeserializer deser = new CollectionDeserializer(listType, null, null, null);
        assertTrue(deser.isCachable());
    }

    @Test
    public void testIsCachable_ValueDeserializerNonNull_ReturnsFalse() {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null, null);
        assertFalse(deser.isCachable());
    }

    @Test
    public void testIsCachable_ValueTypeDeserializerNonNull_ReturnsFalse() {
        CollectionDeserializer deser = new CollectionDeserializer(listType, null, typeDeser, null);
        assertFalse(deser.isCachable());
    }

    @Test
    public void testIsCachable_DelegateDeserializerNonNull_ReturnsFalse() {
        // ใช้ protected constructor ได้เพราะ test class อยู่ package เดียวกัน
        CollectionDeserializer deser =
                new CollectionDeserializer(listType, null, null, null, valueDeser, null);
        assertFalse(deser.isCachable());
    }

    // ------------------------------------------------------------------
    // getContentType() / getContentDeserializer()
    // ------------------------------------------------------------------

    @Test
    public void testGetContentType() {
        CollectionDeserializer deser = newDeserializer(null);
        assertEquals(listType.getContentType(), deser.getContentType());
    }

    @Test
    public void testGetContentDeserializer() {
        CollectionDeserializer deser = newDeserializer(null);
        assertSame(valueDeser, deser.getContentDeserializer());
    }

    // ------------------------------------------------------------------
    // deserialize(JsonParser, DeserializationContext)
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize_WithDelegateDeserializer() throws IOException {
        JsonDeserializer<Object> delegateDeser = mock(JsonDeserializer.class);
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null,
                valueInstantiator, delegateDeser, null);

        Object delegateValue = new Object();
        Collection<Object> expected = new ArrayList<Object>();
        expected.add("delegated");

        when(delegateDeser.deserialize(parser, ctxt)).thenReturn(delegateValue);
        when(valueInstantiator.createUsingDelegate(ctxt, delegateValue)).thenReturn(expected);

        Collection<Object> result = deser.deserialize(parser, ctxt);
        assertSame(expected, result);
    }

    @Test
    public void testDeserialize_EmptyStringValue_UsesCreateFromString() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        when(parser.hasToken(JsonToken.VALUE_STRING)).thenReturn(true);
        when(parser.getText()).thenReturn("");
        Collection<Object> expected = new ArrayList<Object>();
        when(valueInstantiator.createFromString(ctxt, "")).thenReturn(expected);

        Collection<Object> result = deser.deserialize(parser, ctxt);
        assertSame(expected, result);
    }

    @Test
    public void testDeserialize_NonEmptyStringValue_FallsToHandleNonArray() throws IOException {
        // unwrapSingle = TRUE เพื่อให้ canWrap เป็น true ใน handleNonArray
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null,
                valueInstantiator, null, Boolean.TRUE);

        when(parser.hasToken(JsonToken.VALUE_STRING)).thenReturn(true);
        when(parser.getText()).thenReturn("abc"); // non-empty -> ไม่เข้า createFromString
        Collection<Object> base = new ArrayList<Object>();
        when(valueInstantiator.createUsingDefault(ctxt)).thenReturn(base);
        when(parser.isExpectedStartArrayToken()).thenReturn(false);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(valueDeser.deserialize(parser, ctxt)).thenReturn("abc");

        Collection<Object> result = deser.deserialize(parser, ctxt);
        assertEquals(1, result.size());
        assertTrue(result.contains("abc"));
    }

    @Test
    public void testDeserialize_NormalArray_Empty() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        when(parser.hasToken(JsonToken.VALUE_STRING)).thenReturn(false);
        Collection<Object> base = new ArrayList<Object>();
        when(valueInstantiator.createUsingDefault(ctxt)).thenReturn(base);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.END_ARRAY);
        when(valueDeser.getObjectIdReader()).thenReturn(null);

        Collection<Object> result = deser.deserialize(parser, ctxt);
        assertTrue(result.isEmpty());
    }

    // ------------------------------------------------------------------
    // deserialize(JsonParser, DeserializationContext, Collection<Object>)
    // ------------------------------------------------------------------

    @Test
    public void testDeserialize3Arg_NotStartArray_DelegatesToHandleNonArray() throws IOException {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null,
                valueInstantiator, null, Boolean.TRUE);
        Collection<Object> result = new ArrayList<Object>();

        when(parser.isExpectedStartArrayToken()).thenReturn(false);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(valueDeser.deserialize(parser, ctxt)).thenReturn("val");

        Collection<Object> out = deser.deserialize(parser, ctxt, result);
        assertEquals(1, out.size());
        assertEquals("val", out.iterator().next());
    }

    @Test
    public void testDeserialize3Arg_NullToken_UsesGetNullValue() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_NULL, JsonToken.END_ARRAY);
        when(valueDeser.getNullValue(ctxt)).thenReturn(null);

        Collection<Object> out = deser.deserialize(parser, ctxt, result);
        assertEquals(1, out.size());
        assertNull(out.iterator().next());
        verify(valueDeser).getNullValue(ctxt);
    }

    @Test
    public void testDeserialize3Arg_TypeDeserializerPresent_UsesDeserializeWithType() throws IOException {
        CollectionDeserializer deser = newDeserializer(typeDeser);
        Collection<Object> result = new ArrayList<Object>();

        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(valueDeser.deserializeWithType(parser, ctxt, typeDeser)).thenReturn("typed");

        Collection<Object> out = deser.deserialize(parser, ctxt, result);
        assertEquals(1, out.size());
        assertEquals("typed", out.iterator().next());
    }

    @Test
    public void testDeserialize3Arg_NoTypeDeserializer_UsesDeserialize() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(valueDeser.deserialize(parser, ctxt)).thenReturn("plain");

        Collection<Object> out = deser.deserialize(parser, ctxt, result);
        assertEquals(1, out.size());
        assertEquals("plain", out.iterator().next());
    }

    @Test
    public void testDeserialize3Arg_WithObjectIdReader_UsesAccumulator() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        ObjectIdReader oir = mock(ObjectIdReader.class);
        when(valueDeser.getObjectIdReader()).thenReturn(oir);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(valueDeser.deserialize(parser, ctxt)).thenReturn("withRef");

        Collection<Object> out = deser.deserialize(parser, ctxt, result);
        // accumulator ว่างตอนแรก -> add() เพิ่มตรงเข้า result
        assertEquals(1, out.size());
        assertEquals("withRef", out.iterator().next());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize3Arg_UnresolvedForwardReference_NoAccumulator_Throws() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        UnresolvedForwardReference ufr = mock(UnresolvedForwardReference.class);
        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(valueDeser.deserialize(parser, ctxt)).thenThrow(ufr);

        deser.deserialize(parser, ctxt, result);
    }

    /**
     * หมายเหตุ: สมมติว่า constructor ภายในของ Referring (base class ของ
     * CollectionReferring) ไม่เรียก method อื่นของ mock reference ที่ยังไม่ stub
     * จนเกิด NullPointerException — เป็น assumption เนื่องจาก source ของ
     * Referring ไม่ได้แสดงในไฟล์ที่ให้มา
     */
    @Test
    public void testDeserialize3Arg_UnresolvedForwardReference_WithAccumulator_AppendsReferring() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        ObjectIdReader oir = mock(ObjectIdReader.class);
        ReadableObjectId roid = mock(ReadableObjectId.class);
        UnresolvedForwardReference ufr = mock(UnresolvedForwardReference.class);
        when(ufr.getRoid()).thenReturn(roid);

        when(valueDeser.getObjectIdReader()).thenReturn(oir);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(valueDeser.deserialize(parser, ctxt)).thenThrow(ufr);

        Collection<Object> out = deser.deserialize(parser, ctxt, result);

        verify(roid).appendReferring(any(Referring.class));
        assertTrue(out.isEmpty()); // ค่ายังไม่ resolve จริง จึงไม่ถูกเพิ่มเข้า result
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize3Arg_Exception_WrapEnabled_ThrowsJsonMappingException() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        when(valueDeser.deserialize(parser, ctxt)).thenThrow(new IllegalStateException("boom"));

        deser.deserialize(parser, ctxt, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserialize3Arg_Exception_WrapDisabled_RuntimeException_Rethrown() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        when(valueDeser.deserialize(parser, ctxt)).thenThrow(new IllegalStateException("boom"));

        deser.deserialize(parser, ctxt, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize3Arg_Exception_WrapDisabled_CheckedException_StillWrapped() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Collection<Object> result = new ArrayList<Object>();

        when(valueDeser.getObjectIdReader()).thenReturn(null);
        when(parser.isExpectedStartArrayToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.VALUE_STRING, JsonToken.END_ARRAY);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        when(valueDeser.deserialize(parser, ctxt)).thenThrow(new IOException("checked boom"));

        deser.deserialize(parser, ctxt, result);
    }

    // ------------------------------------------------------------------
    // handleNonArray()
    // ------------------------------------------------------------------

    @Test(expected = JsonMappingException.class)
    public void testHandleNonArray_CannotWrap_Throws() throws IOException {
        CollectionDeserializer deser = newDeserializer(null); // _unwrapSingle == null
        Collection<Object> result = new ArrayList<Object>();
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(false);
        when(ctxt.mappingException(any(Class.class))).thenReturn(mock(JsonMappingException.class));

        deser.handleNonArray(parser, ctxt, result);
    }

    @Test
    public void testHandleNonArray_UnwrapSingleTrue_Success() throws IOException {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null,
                valueInstantiator, null, Boolean.TRUE);
        Collection<Object> result = new ArrayList<Object>();
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(valueDeser.deserialize(parser, ctxt)).thenReturn("single");

        Collection<Object> out = deser.handleNonArray(parser, ctxt, result);
        assertEquals(1, out.size());
        assertEquals("single", out.iterator().next());
    }

    @Test
    public void testHandleNonArray_UnwrapSingleNull_FeatureEnabled_Success() throws IOException {
        CollectionDeserializer deser = newDeserializer(null); // unwrapSingle == null
        Collection<Object> result = new ArrayList<Object>();
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(true);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(valueDeser.deserialize(parser, ctxt)).thenReturn("single2");

        Collection<Object> out = deser.handleNonArray(parser, ctxt, result);
        assertEquals(1, out.size());
        assertEquals("single2", out.iterator().next());
    }

    @Test
    public void testHandleNonArray_NullToken_UsesGetNullValue() throws IOException {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null,
                valueInstantiator, null, Boolean.TRUE);
        Collection<Object> result = new ArrayList<Object>();
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        when(valueDeser.getNullValue(ctxt)).thenReturn(null);

        Collection<Object> out = deser.handleNonArray(parser, ctxt, result);
        assertEquals(1, out.size());
        assertNull(out.iterator().next());
        verify(valueDeser).getNullValue(ctxt);
    }

    @Test
    public void testHandleNonArray_TypeDeserializerPresent() throws IOException {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, typeDeser,
                valueInstantiator, null, Boolean.TRUE);
        Collection<Object> result = new ArrayList<Object>();
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(valueDeser.deserializeWithType(parser, ctxt, typeDeser)).thenReturn("typedSingle");

        Collection<Object> out = deser.handleNonArray(parser, ctxt, result);
        assertEquals(1, out.size());
        assertEquals("typedSingle", out.iterator().next());
    }

    @Test(expected = JsonMappingException.class)
    public void testHandleNonArray_ExceptionWrapped() throws IOException {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, null,
                valueInstantiator, null, Boolean.TRUE);
        Collection<Object> result = new ArrayList<Object>();
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        when(valueDeser.deserialize(parser, ctxt)).thenThrow(new IllegalStateException("fail"));

        deser.handleNonArray(parser, ctxt, result);
    }

    // ------------------------------------------------------------------
    // deserializeWithType()
    // ------------------------------------------------------------------

    @Test
    public void testDeserializeWithType() throws IOException {
        CollectionDeserializer deser = newDeserializer(null);
        Object expected = new Object();
        when(typeDeser.deserializeTypedFromArray(parser, ctxt)).thenReturn(expected);

        Object result = deser.deserializeWithType(parser, ctxt, typeDeser);
        assertSame(expected, result);
    }

    // ------------------------------------------------------------------
    // createContextual()
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextual_DelegateTypeNull_ThrowsIllegalArgumentException() throws Exception {
        CollectionDeserializer deser = newDeserializer(null);
        when(valueInstantiator.canCreateUsingDelegate()).thenReturn(true);
        DeserializationConfig config = mock(DeserializationConfig.class);
        when(ctxt.getConfig()).thenReturn(config);
        when(valueInstantiator.getDelegateType(config)).thenReturn(null);

        deser.createContextual(ctxt, null);
    }

    // ------------------------------------------------------------------
    // withResolved()
    // ------------------------------------------------------------------

    @Test
    public void testWithResolved_SameParams_ReturnsSameInstance() {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, typeDeser,
                valueInstantiator, null, Boolean.TRUE);
        CollectionDeserializer result = deser.withResolved(null, valueDeser, typeDeser, Boolean.TRUE);
        assertSame(deser, result);
    }

    @Test
    public void testWithResolved_DifferentParams_ReturnsNewInstance() {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, typeDeser,
                valueInstantiator, null, Boolean.TRUE);
        JsonDeserializer<Object> newValueDeser = mock(JsonDeserializer.class);
        CollectionDeserializer result = deser.withResolved(null, newValueDeser, typeDeser, Boolean.TRUE);
        assertNotSame(deser, result);
        assertSame(newValueDeser, result.getContentDeserializer());
    }

    @Test
    public void testWithResolved_Deprecated3Arg_DelegatesTo4Arg() {
        CollectionDeserializer deser = new CollectionDeserializer(listType, valueDeser, typeDeser,
                valueInstantiator, null, Boolean.TRUE);
        CollectionDeserializer result = deser.withResolved(null, valueDeser, typeDeser);
        assertSame(deser, result); // _unwrapSingle ถูกส่งผ่านโดยไม่เปลี่ยนแปลง
    }

    // ------------------------------------------------------------------
    // CollectionReferringAccumulator
    // ------------------------------------------------------------------

    @Test
    public void testCollectionReferringAccumulator_Add_EmptyAccumulator_AddsToResult() {
        Collection<Object> result = new ArrayList<Object>();
        CollectionReferringAccumulator accumulator =
                new CollectionReferringAccumulator(String.class, result);
        accumulator.add("value1");
        assertEquals(1, result.size());
        assertEquals("value1", result.iterator().next());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollectionReferringAccumulator_ResolveForwardReference_NotFound_ThrowsIllegalArgumentException()
            throws IOException {
        Collection<Object> result = new ArrayList<Object>();
        CollectionReferringAccumulator accumulator =
                new CollectionReferringAccumulator(String.class, result);
        // accumulator ว่าง -> while loop ไม่ทำงาน -> ตก throw ตามท้าย method
        accumulator.resolveForwardReference("unknownId", "someValue");
    }
}
```

## สรุปตาราง Test coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testIsCachable_AllNull_ReturnsTrue | isCachable(): ทุกฟิลด์ null → true |
| testIsCachable_ValueDeserializerNonNull_ReturnsFalse | isCachable(): `_valueDeserializer != null` → false |
| testIsCachable_ValueTypeDeserializerNonNull_ReturnsFalse | isCachable(): `_valueTypeDeserializer != null` → false |
| testIsCachable_DelegateDeserializerNonNull_ReturnsFalse | isCachable(): `_delegateDeserializer != null` → false |
| testGetContentType / testGetContentDeserializer | getContentType(), getContentDeserializer() getter |
| testDeserialize_WithDelegateDeserializer | deserialize(p,ctxt): `_delegateDeserializer != null` branch |
| testDeserialize_EmptyStringValue_UsesCreateFromString | deserialize(p,ctxt): hasToken(VALUE_STRING) + str.length()==0 |
| testDeserialize_NonEmptyStringValue_FallsToHandleNonArray | deserialize(p,ctxt): VALUE_STRING ไม่ว่าง → ตก default → handleNonArray path |
| testDeserialize_NormalArray_Empty | deserialize(p,ctxt): default path, isExpectedStartArrayToken true, loop 0 รอบ |
| testDeserialize3Arg_NotStartArray_DelegatesToHandleNonArray | !isExpectedStartArrayToken() → handleNonArray |
| testDeserialize3Arg_NullToken_UsesGetNullValue | loop: `t == VALUE_NULL` → getNullValue |
| testDeserialize3Arg_TypeDeserializerPresent_UsesDeserializeWithType | loop: `typeDeser != null` → deserializeWithType |
| testDeserialize3Arg_NoTypeDeserializer_UsesDeserialize | loop: `typeDeser == null` → deserialize |
| testDeserialize3Arg_WithObjectIdReader_UsesAccumulator | `getObjectIdReader() != null` → referringAccumulator path |
| testDeserialize3Arg_UnresolvedForwardReference_NoAccumulator_Throws | catch UnresolvedForwardReference, accumulator==null → throw |
| testDeserialize3Arg_UnresolvedForwardReference_WithAccumulator_AppendsReferring | catch UnresolvedForwardReference, accumulator!=null → appendReferring |
| testDeserialize3Arg_Exception_WrapEnabled_ThrowsJsonMappingException | catch Exception: wrap==true → wrap |
| testDeserialize3Arg_Exception_WrapDisabled_RuntimeException_Rethrown | catch Exception: wrap==false && RuntimeException → rethrow |
| testDeserialize3Arg_Exception_WrapDisabled_CheckedException_StillWrapped | catch Exception: wrap==false, ไม่ใช่ RuntimeException → ยัง wrap |
| testHandleNonArray_CannotWrap_Throws | canWrap==false → throw mappingException |
| testHandleNonArray_UnwrapSingleTrue_Success | `_unwrapSingle==TRUE` → canWrap true, VALUE_STRING |
| testHandleNonArray_UnwrapSingleNull_FeatureEnabled_Success | `_unwrapSingle==null` + feature enabled → canWrap true |
| testHandleNonArray_NullToken_UsesGetNullValue | `t==VALUE_NULL` → getNullValue |
| testHandleNonArray_TypeDeserializerPresent | `typeDeser != null` → deserializeWithType |
| testHandleNonArray_ExceptionWrapped | catch Exception → wrapWithPath |
| testDeserializeWithType | deserializeWithType() delegate ไปยัง typeDeserializer |
| testCreateContextual_DelegateTypeNull_ThrowsIllegalArgumentException | createContextual(): canCreateUsingDelegate true, delegateType null → throw |
| testWithResolved_SameParams_ReturnsSameInstance | withResolved(): เงื่อนไข all-equal → return this |
| testWithResolved_DifferentParams_ReturnsNewInstance | withResolved(): ไม่เท่ากัน → new instance |
| testWithResolved_Deprecated3Arg_DelegatesTo4Arg | withResolved(deprecated 3-arg) delegate ไป 4-arg |
| testCollectionReferringAccumulator_Add_EmptyAccumulator_AddsToResult | add(): `_accumulator.isEmpty()` → result.add |
| testCollectionReferringAccumulator_ResolveForwardReference_NotFound_ThrowsIllegalArgumentException | resolveForwardReference(): ไม่พบ id → throw |

**ข้อจำกัดที่ระบุไว้ (ไม่ได้เดา behavior):** branch อื่นของ `createContextual()` (เช่น การ resolve `findFormatFeature`, `findConvertingContentDeserializer`, `findDeserializer`) และ branch `CollectionReferringAccumulator.add()` กรณี accumulator ไม่ว่าง (ต้องพึ่ง internal ของ `Referring`) ไม่ได้ทดสอบ เนื่องจากต้องอาศัยพฤติกรรมภายในของ jackson-databind ที่ไม่ได้แสดงอยู่ใน source ที่ให้มา
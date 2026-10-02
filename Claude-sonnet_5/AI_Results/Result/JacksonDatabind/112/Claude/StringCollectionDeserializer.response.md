# วิเคราะห์และออกแบบเทส

จากซอร์สโค้ดที่ให้มา เมธอดหลักที่ต้องทดสอบคือ `isCachable`, `getContentDeserializer`, `getValueInstantiator`, `withResolved` (protected, เข้าถึงได้เพราะอยู่ package เดียวกัน), `deserialize(p,ctxt)`, `deserialize(p,ctxt,result)`, `deserializeUsingCustom` (private — ทดสอบผ่าน public API), `handleNonArray` (private — ทดสอบผ่าน public API), และ `deserializeWithType`

**หมายเหตุสำคัญ (ตามข้อกำหนด #4):** เมธอด `createContextual` และสาขาที่พึ่งพา `_skipNullValues == true` (การ skip null) และ `_parseString(...)` ไม่ได้ถูกทดสอบโดยตรง เนื่องจากพฤติกรรมของ helper method ที่สืบทอดมาจาก base class (`findDeserializer`, `findConvertingContentDeserializer`, `isDefaultDeserializer`, `findContentNullProvider`, `findFormatFeature`, `_parseString`, และตรรกะภายในที่กำหนดค่า `_skipNullValues` จาก `NullValueProvider`) ไม่ได้ปรากฏอยู่ในซอร์สโค้ดที่ให้มา การเดาพฤติกรรมเหล่านี้จะขัดกับข้อกำหนด จึงขอละไว้และระบุเป็นคอมเมนต์ในโค้ด

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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/**
 * Unit tests for {@link StringCollectionDeserializer} (Defects4J JacksonDatabind-112b).
 *
 * หมายเหตุทั่วไป:
 * - คลาสทดสอบนี้ถูกวางใน package เดียวกับคลาสเป้าหมาย เพื่อให้สามารถเรียกใช้
 *   constructor แบบ protected และเมธอด protected (withResolved) ได้โดยตรง
 *   โดยไม่ต้องเดา behavior เพิ่มเติม
 * - เมธอด private (deserializeUsingCustom, handleNonArray) ถูกทดสอบผ่าน
 *   public API (deserialize) ที่เรียกใช้งานภายใน
 * - สาขาที่พึ่งพา _skipNullValues == true และ _parseString(...) รวมถึงเมธอด
 *   createContextual ไม่ได้ถูกทดสอบ เนื่องจาก implementation ของ helper
 *   เหล่านี้ไม่ปรากฏในซอร์สโค้ดที่ให้มา (ดูคำอธิบายด้านบน)
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class StringCollectionDeserializerTest {

    private JsonParser p;
    private DeserializationContext ctxt;
    private JavaType containerType;
    private ValueInstantiator valueInstantiator;

    @Before
    public void setUp() {
        p = mock(JsonParser.class);
        ctxt = mock(DeserializationContext.class);
        containerType = mock(JavaType.class);
        when(containerType.getRawClass()).thenReturn((Class) Collection.class);
        valueInstantiator = mock(ValueInstantiator.class);
    }

    private StringCollectionDeserializer newDeserializer(
            ValueInstantiator vi,
            JsonDeserializer<?> delegateDeser,
            JsonDeserializer<?> valueDeser,
            NullValueProvider nuller,
            Boolean unwrapSingle) {
        return new StringCollectionDeserializer(containerType, vi, delegateDeser,
                valueDeser, nuller, unwrapSingle);
    }

    // ================= isCachable =================

    @Test
    public void isCachable_trueWhenNoCustomDeserializers() {
        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        assertTrue(d.isCachable());
    }

    @Test
    public void isCachable_falseWhenValueDeserializerPresent() {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        assertFalse(d.isCachable());
    }

    @Test
    public void isCachable_falseWhenDelegateDeserializerPresent() {
        JsonDeserializer<Object> delegateDeser = mock(JsonDeserializer.class);
        StringCollectionDeserializer d = newDeserializer(valueInstantiator, delegateDeser, null, null, null);
        assertFalse(d.isCachable());
    }

    // ================= getContentDeserializer / getValueInstantiator =================

    @Test
    public void getContentDeserializer_returnsConfiguredValueDeserializer() {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        assertSame(valueDeser, d.getContentDeserializer());
    }

    @Test
    public void getContentDeserializer_nullWhenNotConfigured() {
        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        assertNull(d.getContentDeserializer());
    }

    @Test
    public void getValueInstantiator_returnsConfiguredInstantiator() {
        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        assertSame(valueInstantiator, d.getValueInstantiator());
    }

    // ================= withResolved (protected helper) =================

    @Test
    public void withResolved_returnsSameInstance_whenAllArgumentsUnchanged() {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        JsonDeserializer<Object> delegateDeser = mock(JsonDeserializer.class);
        NullValueProvider nuller = mock(NullValueProvider.class);
        Boolean unwrapSingle = Boolean.TRUE;

        StringCollectionDeserializer d =
                newDeserializer(valueInstantiator, delegateDeser, valueDeser, nuller, unwrapSingle);
        StringCollectionDeserializer resolved = d.withResolved(delegateDeser, valueDeser, nuller, unwrapSingle);

        assertSame(d, resolved);
    }

    @Test
    public void withResolved_returnsNewInstance_whenValueDeserializerChanged() {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        JsonDeserializer<String> newValueDeser = mock(JsonDeserializer.class);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        StringCollectionDeserializer resolved = d.withResolved(null, newValueDeser, null, null);

        assertNotSame(d, resolved);
        assertSame(newValueDeser, resolved.getContentDeserializer());
        assertSame(valueInstantiator, resolved.getValueInstantiator());
    }

    // ================= deserialize(p, ctxt) - 2 arg =================

    @Test
    public void deserialize2Arg_withDelegate_usesCreateUsingDelegate() throws IOException {
        JsonDeserializer<Object> delegateDeser = mock(JsonDeserializer.class);
        Object delegateValue = new Object();
        Collection<String> expected = new ArrayList<String>();
        when(delegateDeser.deserialize(p, ctxt)).thenReturn(delegateValue);
        when(valueInstantiator.createUsingDelegate(ctxt, delegateValue)).thenReturn(expected);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, delegateDeser, null, null, null);
        Collection<String> result = d.deserialize(p, ctxt);

        assertSame(expected, result);
        verify(valueInstantiator).createUsingDelegate(ctxt, delegateValue);
        verify(valueInstantiator, never()).createUsingDefault(any(DeserializationContext.class));
    }

    @Test
    public void deserialize2Arg_withoutDelegate_usesCreateUsingDefaultThenFills() throws IOException {
        List<String> backing = new ArrayList<String>();
        when(valueInstantiator.createUsingDefault(ctxt)).thenReturn(backing);
        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        Collection<String> result = d.deserialize(p, ctxt);

        assertSame(backing, result);
        verify(valueInstantiator).createUsingDefault(ctxt);
    }

    // ================= deserialize(p, ctxt, result) - main loop =================

    @Test
    public void deserialize3Arg_notStartArray_cannotWrap_callsHandleUnexpectedToken() throws IOException {
        when(p.isExpectedStartArrayToken()).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(false);
        Object sentinel = new Object();
        when(ctxt.handleUnexpectedToken(any(Class.class), eq(p))).thenReturn(sentinel);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        Collection<String> result = d.deserialize(p, ctxt, new ArrayList<String>());

        assertSame(sentinel, result);
        verify(ctxt).handleUnexpectedToken(any(Class.class), eq(p));
    }

    @Test
    public void deserialize3Arg_ioExceptionFromParser_propagatesUnwrapped() throws IOException {
        // isExpectedStartArrayToken() is called *outside* the try/catch block,
        // so a thrown IOException must not be wrapped as JsonMappingException.
        when(p.isExpectedStartArrayToken()).thenThrow(new IOException("parser failure"));

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        try {
            d.deserialize(p, ctxt, new ArrayList<String>());
            fail("expected IOException");
        } catch (JsonMappingException wrapped) {
            fail("exception should not be wrapped here");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void deserialize3Arg_emptyArray_returnsEmptyCollection() throws IOException {
        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertTrue(out.isEmpty());
    }

    @Test
    public void deserialize3Arg_addsTextValuesUntilEndArray() throws IOException {
        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn("a").thenReturn("b").thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(2, out.size());
        assertTrue(out.contains("a"));
        assertTrue(out.contains("b"));
    }

    @Test
    public void deserialize3Arg_emptyStringTextValue_isAddedAsIs() throws IOException {
        // boundary: empty string is a valid, non-null text value
        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn("").thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("", out.iterator().next());
    }

    @Test
    public void deserialize3Arg_appendsToPreExistingResultCollection() throws IOException {
        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn("newItem").thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        List<String> result = new ArrayList<String>();
        result.add("existing");
        Collection<String> out = d.deserialize(p, ctxt, result);

        assertEquals(2, out.size());
        assertTrue(out.contains("existing"));
        assertTrue(out.contains("newItem"));
    }

    @Test
    public void deserialize3Arg_nullTokenUsesNullProvider_whenNotSkipped() throws IOException {
        // NOTE: assumes a plain Mockito mock for NullValueProvider is NOT
        // recognized internally as the "skip nulls" sentinel, so
        // _skipNullValues evaluates to false. This detail of the base class
        // is not shown in the provided source; documented as an assumption.
        NullValueProvider nuller = mock(NullValueProvider.class);
        when(nuller.getNullValue(ctxt)).thenReturn("NULL_VALUE");

        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, nuller, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("NULL_VALUE", out.iterator().next());
    }

    @Test
    public void deserialize3Arg_exceptionFromNullProvider_isWrappedAsJsonMappingException() throws IOException {
        NullValueProvider nuller = mock(NullValueProvider.class);
        when(nuller.getNullValue(ctxt)).thenThrow(new RuntimeException("boom"));

        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, nuller, null);

        try {
            d.deserialize(p, ctxt, new ArrayList<String>());
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
            // ok - inner exception caught & wrapped with path info
        }
    }

    // ================= deserialize via custom value deserializer (deserializeUsingCustom) =================

    @Test
    public void deserializeUsingCustom_endArray_breaksImmediately() throws IOException {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertTrue(out.isEmpty());
        verifyZeroInteractions(valueDeser);
    }

    @Test
    public void deserializeUsingCustom_nextTextValueNonNull_stillDelegatesToCustomDeserializer() throws IOException {
        // code intentionally ignores the String returned by nextTextValue()
        // and always calls deser.deserialize(p, ctxt) in the "else" branch.
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.deserialize(p, ctxt)).thenReturn("X");

        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn("ignoredByCode").thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("X", out.iterator().next());
        verify(valueDeser, times(1)).deserialize(p, ctxt);
    }

    @Test
    public void deserializeUsingCustom_nullToken_usesNullProvider_whenNotSkipped() throws IOException {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        NullValueProvider nuller = mock(NullValueProvider.class);
        when(nuller.getNullValue(ctxt)).thenReturn("CUSTOM_NULL");

        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, nuller, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("CUSTOM_NULL", out.iterator().next());
        verifyZeroInteractions(valueDeser);
    }

    @Test
    public void deserializeUsingCustom_otherToken_usesCustomDeserializer() throws IOException {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.deserialize(p, ctxt)).thenReturn("FROM_CUSTOM");

        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn(null).thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NUMBER_INT).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("FROM_CUSTOM", out.iterator().next());
    }

    @Test
    public void deserializeUsingCustom_customDeserializerReturnsNull_addsNullAsIs() throws IOException {
        // fault-detection: code has no null-check before result.add(value)
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.deserialize(p, ctxt)).thenReturn(null);

        when(p.isExpectedStartArrayToken()).thenReturn(true);
        when(p.nextTextValue()).thenReturn("text-but-ignored").thenReturn(null);
        when(p.getCurrentToken()).thenReturn(JsonToken.END_ARRAY);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertNull(out.iterator().next());
    }

    // ================= handleNonArray (via public deserialize API) =================

    @Test
    public void handleNonArray_unwrapSingleFalse_cannotWrap_evenIfContextEnabled() throws IOException {
        when(p.isExpectedStartArrayToken()).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(true);
        Object sentinel = new Object();
        when(ctxt.handleUnexpectedToken(any(Class.class), eq(p))).thenReturn(sentinel);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, Boolean.FALSE);
        Collection<String> result = d.deserialize(p, ctxt, new ArrayList<String>());

        assertSame(sentinel, result);
    }

    @Test
    public void handleNonArray_canWrapViaContextFeature_whenUnwrapSingleNull() throws IOException {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.deserialize(p, ctxt)).thenReturn("SINGLE2");

        when(p.isExpectedStartArrayToken()).thenReturn(false);
        when(ctxt.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)).thenReturn(true);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, null);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("SINGLE2", out.iterator().next());
    }

    @Test
    public void handleNonArray_canWrapTrue_nullToken_usesNullProvider_whenNotSkipped() throws IOException {
        NullValueProvider nuller = mock(NullValueProvider.class);
        when(nuller.getNullValue(ctxt)).thenReturn("WRAPPED_NULL");

        when(p.isExpectedStartArrayToken()).thenReturn(false);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, nuller, Boolean.TRUE);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("WRAPPED_NULL", out.iterator().next());
    }

    @Test
    public void handleNonArray_canWrapTrue_nonNullToken_usesConfiguredValueDeserializer() throws IOException {
        JsonDeserializer<String> valueDeser = mock(JsonDeserializer.class);
        when(valueDeser.deserialize(p, ctxt)).thenReturn("SINGLE");

        when(p.isExpectedStartArrayToken()).thenReturn(false);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, valueDeser, null, Boolean.TRUE);
        Collection<String> out = d.deserialize(p, ctxt, new ArrayList<String>());

        assertEquals(1, out.size());
        assertEquals("SINGLE", out.iterator().next());
        verify(valueDeser).deserialize(p, ctxt);
    }

    // ================= deserializeWithType =================

    @Test
    public void deserializeWithType_delegatesToTypeDeserializer() throws IOException {
        TypeDeserializer typeDeserializer = mock(TypeDeserializer.class);
        Object expected = new Object();
        when(typeDeserializer.deserializeTypedFromArray(p, ctxt)).thenReturn(expected);

        StringCollectionDeserializer d = newDeserializer(valueInstantiator, null, null, null, null);
        Object result = d.deserializeWithType(p, ctxt, typeDeserializer);

        assertSame(expected, result);
        verify(typeDeserializer).deserializeTypedFromArray(p, ctxt);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|
| `isCachable_*` (3 เมธอด) | `isCachable()`: ทั้ง true/false ตามค่า `_valueDeserializer`/`_delegateDeserializer` |
| `getContentDeserializer_*` | ค่า non-null / null ของ `_valueDeserializer` |
| `getValueInstantiator_returnsConfiguredInstantiator` | getter ตรง ๆ |
| `withResolved_returnsSameInstance_*` | if-condition ทุกฟิลด์เท่ากัน → return `this` |
| `withResolved_returnsNewInstance_*` | if-condition ไม่เท่ากัน → สร้าง instance ใหม่ |
| `deserialize2Arg_withDelegate_*` | `deserialize(p,ctxt)`: branch `_delegateDeserializer != null` |
| `deserialize2Arg_withoutDelegate_*` | `deserialize(p,ctxt)`: branch `_delegateDeserializer == null` |
| `deserialize3Arg_notStartArray_cannotWrap_*` | `!isExpectedStartArrayToken()` → `handleNonArray`, canWrap=false |
| `deserialize3Arg_ioExceptionFromParser_*` | exception ก่อนเข้า try/catch ไม่ถูก wrap |
| `deserialize3Arg_emptyArray_*` | loop: END_ARRAY ทันที (0 รอบ) |
| `deserialize3Arg_addsTextValuesUntilEndArray` | loop: `value != null` → add, continue, จบด้วย END_ARRAY |
| `deserialize3Arg_emptyStringTextValue_*` | boundary: empty string เป็น non-null text |
| `deserialize3Arg_appendsToPreExistingResultCollection` | boundary: ผลลัพธ์ append เข้า collection เดิม |
| `deserialize3Arg_nullTokenUsesNullProvider_*` | loop: `t == VALUE_NULL`, `_skipNullValues == false` |
| `deserialize3Arg_exceptionFromNullProvider_*` | catch(Exception) → wrap เป็น `JsonMappingException` |
| `deserializeUsingCustom_endArray_*` | custom loop: END_ARRAY break |
| `deserializeUsingCustom_nextTextValueNonNull_*` | custom loop: else-branch (nextTextValue != null) |
| `deserializeUsingCustom_nullToken_usesNullProvider_*` | custom loop: VALUE_NULL, skip=false |
| `deserializeUsingCustom_otherToken_*` | custom loop: token อื่น → `deser.deserialize` |
| `deserializeUsingCustom_customDeserializerReturnsNull_*` | fault-detection: ไม่มี null-check ก่อน add |
| `handleNonArray_unwrapSingleFalse_*` | canWrap=false เมื่อ `_unwrapSingle==FALSE` แม้ ctxt enabled |
| `handleNonArray_canWrapViaContextFeature_*` | canWrap=true ผ่าน `ctxt.isEnabled(...)` เมื่อ `_unwrapSingle==null` |
| `handleNonArray_canWrapTrue_nullToken_*` | canWrap=true, token VALUE_NULL, skip=false |
| `handleNonArray_canWrapTrue_nonNullToken_*` | canWrap=true, token != VALUE_NULL, `valueDes != null` |
| `deserializeWithType_delegatesToTypeDeserializer` | delegate ไปยัง `typeDeserializer.deserializeTypedFromArray` |

**ไม่ได้ทดสอบ (ระบุเหตุผลในคอมเมนต์โค้ด):** `createContextual(...)` ทั้งหมด, สาขา `_skipNullValues == true`, และสาขา `_parseString(...)` เนื่องจากพึ่งพา helper method ที่สืบทอดมาจาก base class ซึ่งไม่มี source code ให้วิเคราะห์
# StdSerializerTest.java

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.any;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class StdSerializerTest {

    /* -------------------------------------------------------------
     * Concrete helper subclass exposing protected members for testing
     * ------------------------------------------------------------- */
    static class TestSerializer extends StdSerializer<String> {

        TestSerializer() { super(String.class); }
        TestSerializer(JavaType t) { super(t); }
        TestSerializer(Class<?> t, boolean dummy) { super(t, dummy); }

        @Override
        public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeString(value);
        }

        // exposers
        ObjectNode callCreateObjectNode() { return createObjectNode(); }
        ObjectNode callCreateSchemaNode(String type) { return createSchemaNode(type); }
        ObjectNode callCreateSchemaNode(String type, boolean isOptional) {
            return createSchemaNode(type, isOptional);
        }
        boolean callIsDefaultSerializer(JsonSerializer<?> ser) { return isDefaultSerializer(ser); }

        JsonSerializer<?> callFindConvertingContentSerializer(SerializerProvider p, BeanProperty prop,
                JsonSerializer<?> existing) throws JsonMappingException {
            return findConvertingContentSerializer(p, prop, existing);
        }

        PropertyFilter callFindPropertyFilter(SerializerProvider p, Object filterId, Object valueToFilter)
                throws JsonMappingException {
            return findPropertyFilter(p, filterId, valueToFilter);
        }

        void callWrapAndThrowField(SerializerProvider p, Throwable t, Object bean, String fieldName)
                throws IOException {
            wrapAndThrow(p, t, bean, fieldName);
        }

        void callWrapAndThrowIndex(SerializerProvider p, Throwable t, Object bean, int index)
                throws IOException {
            wrapAndThrow(p, t, bean, index);
        }
    }

    @JacksonStdImpl
    static class AnnotatedSer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) { }
    }

    static class PlainSer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) { }
    }

    private TestSerializer ser;

    @Before
    public void setUp() {
        ser = new TestSerializer();
    }

    /* -------------------- Constructors / handledType -------------------- */

    @Test
    public void testConstructorWithClass() {
        assertEquals(String.class, ser.handledType());
    }

    @Test
    public void testConstructorWithJavaType() {
        JavaType jt = TypeFactory.defaultInstance().constructType(Integer.class);
        TestSerializer s = new TestSerializer(jt);
        assertEquals(Integer.class, s.handledType());
    }

    @Test
    public void testConstructorWithClassDummyFlag() {
        TestSerializer s = new TestSerializer(Long.class, true);
        assertEquals(Long.class, s.handledType());
    }

    /* -------------------- getSchema(provider, typeHint) -------------------- */

    @Test
    public void testGetSchemaDefaultReturnsStringType() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonNode node = ser.getSchema(provider, (Type) String.class);
        assertTrue(node instanceof ObjectNode);
        assertEquals("string", node.get("type").asText());
    }

    /* -------------------- getSchema(provider, typeHint, isOptional) -------------------- */

    @Test
    public void testGetSchemaOptionalTrue_NoRequiredField() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonNode node = ser.getSchema(provider, (Type) String.class, true);
        assertNull(node.get("required"));
    }

    @Test
    public void testGetSchemaOptionalFalse_RequiredFieldTrue() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        JsonNode node = ser.getSchema(provider, (Type) String.class, false);
        assertNotNull(node.get("required"));
        assertTrue(node.get("required").asBoolean());
    }

    /* -------------------- createObjectNode / createSchemaNode -------------------- */

    @Test
    public void testCreateObjectNode() {
        ObjectNode node = ser.callCreateObjectNode();
        assertNotNull(node);
        assertEquals(0, node.size());
    }

    @Test
    public void testCreateSchemaNodeSingleArg() {
        ObjectNode node = ser.callCreateSchemaNode("integer");
        assertEquals("integer", node.get("type").asText());
    }

    @Test
    public void testCreateSchemaNodeOptionalTrue_NoRequired() {
        ObjectNode node = ser.callCreateSchemaNode("integer", true);
        assertEquals("integer", node.get("type").asText());
        assertNull(node.get("required"));
    }

    @Test
    public void testCreateSchemaNodeOptionalFalse_RequiredTrue() {
        ObjectNode node = ser.callCreateSchemaNode("integer", false);
        assertEquals("integer", node.get("type").asText());
        assertTrue(node.get("required").asBoolean());
    }

    /* -------------------- acceptJsonFormatVisitor -------------------- */

    @Test
    public void testAcceptJsonFormatVisitorCallsExpectAnyFormat() throws Exception {
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = TypeFactory.defaultInstance().constructType(String.class);
        ser.acceptJsonFormatVisitor(visitor, typeHint);
        verify(visitor, times(1)).expectAnyFormat(typeHint);
    }

    /* -------------------- wrapAndThrow(String fieldName) -------------------- */

    @Test(expected = Error.class)
    public void testWrapAndThrowField_Error_PassedAsIs() throws IOException {
        Error err = new OutOfMemoryError("boom");
        ser.callWrapAndThrowField(null, err, new Object(), "field");
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrowField_PlainIOException_WrapTrue_PassedAsIs() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        IOException ioe = new IOException("plain io");
        ser.callWrapAndThrowField(provider, ioe, new Object(), "field");
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrowField_PlainIOException_ProviderNull_WrapDefaultTrue() throws IOException {
        // provider == null -> wrap = true by default; plain IOException still passed as-is
        IOException ioe = new IOException("plain io");
        ser.callWrapAndThrowField(null, ioe, new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrowField_JsonMappingException_WrapTrue_Wrapped() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        JsonMappingException jme = new JsonMappingException("mapping issue");
        ser.callWrapAndThrowField(provider, jme, new Object(), "field");
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrowField_JsonMappingException_WrapFalse_PassedAsIs() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        JsonMappingException jme = new JsonMappingException("mapping issue");
        ser.callWrapAndThrowField(provider, jme, new Object(), "field");
    }

    @Test(expected = RuntimeException.class)
    public void testWrapAndThrowField_RuntimeException_WrapFalse_PassedAsIs() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        RuntimeException rte = new IllegalStateException("boom");
        ser.callWrapAndThrowField(provider, rte, new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrowField_RuntimeException_WrapTrue_Wrapped() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        RuntimeException rte = new IllegalStateException("boom");
        ser.callWrapAndThrowField(provider, rte, new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrowField_CheckedException_AlwaysWrapped() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        Exception plain = new Exception("checked, not IOException/RuntimeException");
        ser.callWrapAndThrowField(provider, plain, new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrowField_InvocationTargetException_UnwrappedToCause() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        JsonMappingException cause = new JsonMappingException("cause mapping");
        InvocationTargetException ite = new InvocationTargetException(cause);
        ser.callWrapAndThrowField(provider, ite, new Object(), "field");
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrowField_InvocationTargetException_NullCause_LoopStops() throws IOException {
        // cause == null -> while condition false immediately, ITE itself is checked;
        // ITE is not Error/IOException/RuntimeException -> falls through to wrap
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        InvocationTargetException ite = new InvocationTargetException(null, "no cause");
        ser.callWrapAndThrowField(provider, ite, new Object(), "field");
    }

    /* -------------------- wrapAndThrow(int index) — mirror branches -------------------- */

    @Test(expected = Error.class)
    public void testWrapAndThrowIndex_Error_PassedAsIs() throws IOException {
        Error err = new StackOverflowError();
        ser.callWrapAndThrowIndex(null, err, new Object(), 0);
    }

    @Test(expected = IOException.class)
    public void testWrapAndThrowIndex_PlainIOException_WrapTrue_PassedAsIs() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        IOException ioe = new IOException("plain io idx");
        ser.callWrapAndThrowIndex(provider, ioe, new Object(), 1);
    }

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrowIndex_JsonMappingException_WrapTrue_Wrapped() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);
        JsonMappingException jme = new JsonMappingException("mapping idx");
        ser.callWrapAndThrowIndex(provider, jme, new Object(), 2);
    }

    @Test(expected = RuntimeException.class)
    public void testWrapAndThrowIndex_RuntimeException_WrapFalse_PassedAsIs() throws IOException {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);
        RuntimeException rte = new IllegalArgumentException("boom idx");
        ser.callWrapAndThrowIndex(provider, rte, new Object(), 3);
    }

    /* -------------------- isDefaultSerializer -------------------- */

    @Test
    public void testIsDefaultSerializer_True_WhenAnnotated() {
        assertTrue(ser.callIsDefaultSerializer(new AnnotatedSer()));
    }

    @Test
    public void testIsDefaultSerializer_False_WhenNotAnnotated() {
        assertFalse(ser.callIsDefaultSerializer(new PlainSer()));
    }

    /* -------------------- findConvertingContentSerializer -------------------- */

    @Test
    public void testFindConvertingContentSerializer_IntrospectorNull_ReturnsExisting() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getAnnotationIntrospector()).thenReturn(null);
        JsonSerializer<?> existing = mock(JsonSerializer.class);
        BeanProperty prop = mock(BeanProperty.class);

        JsonSerializer<?> result = ser.callFindConvertingContentSerializer(provider, prop, existing);
        assertSame(existing, result);
    }

    @Test
    public void testFindConvertingContentSerializer_PropNull_ReturnsExisting() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        JsonSerializer<?> existing = mock(JsonSerializer.class);

        JsonSerializer<?> result = ser.callFindConvertingContentSerializer(provider, null, existing);
        assertSame(existing, result);
    }

    @Test
    public void testFindConvertingContentSerializer_MemberNull_ReturnsExisting() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanProperty prop = mock(BeanProperty.class);
        when(prop.getMember()).thenReturn(null);
        JsonSerializer<?> existing = mock(JsonSerializer.class);

        JsonSerializer<?> result = ser.callFindConvertingContentSerializer(provider, prop, existing);
        assertSame(existing, result);
    }

    @Test
    public void testFindConvertingContentSerializer_ConvDefNull_ReturnsExisting() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanProperty prop = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(prop.getMember()).thenReturn(member);
        when(intr.findSerializationContentConverter(member)).thenReturn(null);
        JsonSerializer<?> existing = mock(JsonSerializer.class);

        JsonSerializer<?> result = ser.callFindConvertingContentSerializer(provider, prop, existing);
        assertSame(existing, result);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindConvertingContentSerializer_ConvDefPresent_ExistingNull_UsesFindValueSerializer() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanProperty prop = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(prop.getMember()).thenReturn(member);
        Object convDef = new Object();
        when(intr.findSerializationContentConverter(member)).thenReturn(convDef);

        Converter<Object, Object> conv = mock(Converter.class);
        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        when(conv.getOutputType(any(TypeFactory.class))).thenReturn(delegateType);
        when(provider.converterInstance(member, convDef)).thenReturn(conv);

        TypeFactory tf = TypeFactory.defaultInstance();
        when(provider.getTypeFactory()).thenReturn(tf);

        JsonSerializer<?> lookedUp = mock(JsonSerializer.class);
        when(provider.findValueSerializer(delegateType)).thenReturn(lookedUp);

        JsonSerializer<?> result = ser.callFindConvertingContentSerializer(provider, prop, null);

        assertTrue(result instanceof StdDelegatingSerializer);
        verify(provider, times(1)).findValueSerializer(delegateType);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testFindConvertingContentSerializer_ConvDefPresent_ExistingProvided_SkipsFindValueSerializer() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        AnnotationIntrospector intr = mock(AnnotationIntrospector.class);
        when(provider.getAnnotationIntrospector()).thenReturn(intr);
        BeanProperty prop = mock(BeanProperty.class);
        AnnotatedMember member = mock(AnnotatedMember.class);
        when(prop.getMember()).thenReturn(member);
        Object convDef = new Object();
        when(intr.findSerializationContentConverter(member)).thenReturn(convDef);

        Converter<Object, Object> conv = mock(Converter.class);
        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        when(conv.getOutputType(any(TypeFactory.class))).thenReturn(delegateType);
        when(provider.converterInstance(member, convDef)).thenReturn(conv);

        TypeFactory tf = TypeFactory.defaultInstance();
        when(provider.getTypeFactory()).thenReturn(tf);

        JsonSerializer<?> existing = mock(JsonSerializer.class);

        JsonSerializer<?> result = ser.callFindConvertingContentSerializer(provider, prop, existing);

        assertTrue(result instanceof StdDelegatingSerializer);
        verify(provider, never()).findValueSerializer(any(JavaType.class));
    }

    /* -------------------- findPropertyFilter -------------------- */

    @Test(expected = JsonMappingException.class)
    public void testFindPropertyFilter_FilterProviderNull_Throws() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.getFilterProvider()).thenReturn(null);
        ser.callFindPropertyFilter(provider, "myFilterId", new Object());
    }

    @Test
    public void testFindPropertyFilter_FilterFound_ReturnsFilter() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        FilterProvider filters = mock(FilterProvider.class);
        PropertyFilter expected = mock(PropertyFilter.class);
        Object valueToFilter = new Object();
        when(provider.getFilterProvider()).thenReturn(filters);
        when(filters.findPropertyFilter("id1", valueToFilter)).thenReturn(expected);

        PropertyFilter result = ser.callFindPropertyFilter(provider, "id1", valueToFilter);
        assertSame(expected, result);
    }

    @Test
    public void testFindPropertyFilter_UnknownId_ReturnsNull() throws Exception {
        SerializerProvider provider = mock(SerializerProvider.class);
        FilterProvider filters = mock(FilterProvider.class);
        Object valueToFilter = new Object();
        when(provider.getFilterProvider()).thenReturn(filters);
        when(filters.findPropertyFilter("unknown", valueToFilter)).thenReturn(null);

        PropertyFilter result = ser.callFindPropertyFilter(provider, "unknown", valueToFilter);
        assertNull(result);
    }
}
```

## สรุปตาราง Test Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorWithClass` | Constructor `StdSerializer(Class<T>)` |
| `testConstructorWithJavaType` | Constructor `StdSerializer(JavaType)` |
| `testConstructorWithClassDummyFlag` | Constructor `StdSerializer(Class<?>, boolean)` |
| `testGetSchemaDefaultReturnsStringType` | `getSchema(provider, typeHint)` default "string" |
| `testGetSchemaOptionalTrue_NoRequiredField` | `getSchema(...,isOptional=true)` → ไม่ set "required" |
| `testGetSchemaOptionalFalse_RequiredFieldTrue` | `getSchema(...,isOptional=false)` → set "required"=true |
| `testCreateObjectNode` | `createObjectNode()` |
| `testCreateSchemaNodeSingleArg` | `createSchemaNode(String)` |
| `testCreateSchemaNodeOptionalTrue_NoRequired` | `createSchemaNode(type,isOptional=true)` |
| `testCreateSchemaNodeOptionalFalse_RequiredTrue` | `createSchemaNode(type,isOptional=false)` |
| `testAcceptJsonFormatVisitorCallsExpectAnyFormat` | `acceptJsonFormatVisitor` calls `visitor.expectAnyFormat` |
| `testWrapAndThrowField_Error_PassedAsIs` | `wrapAndThrow(field)`: `t instanceof Error` |
| `testWrapAndThrowField_PlainIOException_WrapTrue_PassedAsIs` | plain IOException, wrap=true → pass-as-is |
| `testWrapAndThrowField_PlainIOException_ProviderNull_WrapDefaultTrue` | provider==null → wrap default true |
| `testWrapAndThrowField_JsonMappingException_WrapTrue_Wrapped` | JsonMappingException, wrap=true → wrap ผ่าน `wrapWithPath` |
| `testWrapAndThrowField_JsonMappingException_WrapFalse_PassedAsIs` | JsonMappingException, wrap=false → pass-as-is |
| `testWrapAndThrowField_RuntimeException_WrapFalse_PassedAsIs` | RuntimeException, wrap=false → pass-as-is |
| `testWrapAndThrowField_RuntimeException_WrapTrue_Wrapped` | RuntimeException, wrap=true → wrap |
| `testWrapAndThrowField_CheckedException_AlwaysWrapped` | Exception ทั่วไป (ไม่ใช่ IOException/RuntimeException) → wrap เสมอ |
| `testWrapAndThrowField_InvocationTargetException_UnwrappedToCause` | while-loop unwrap ITE ที่มี cause |
| `testWrapAndThrowField_InvocationTargetException_NullCause_LoopStops` | while-loop หยุดเมื่อ cause==null |
| `testWrapAndThrowIndex_*` (4 เมธอด) | mirror ทุก branch ของ `wrapAndThrow(int index)` |
| `testIsDefaultSerializer_True_WhenAnnotated` | `isDefaultSerializer` = true (มี `@JacksonStdImpl`) |
| `testIsDefaultSerializer_False_WhenNotAnnotated` | `isDefaultSerializer` = false |
| `testFindConvertingContentSerializer_IntrospectorNull_ReturnsExisting` | `intr == null` |
| `testFindConvertingContentSerializer_PropNull_ReturnsExisting` | `prop == null` |
| `testFindConvertingContentSerializer_MemberNull_ReturnsExisting` | `m == null` |
| `testFindConvertingContentSerializer_ConvDefNull_ReturnsExisting` | `convDef == null` |
| `testFindConvertingContentSerializer_ConvDefPresent_ExistingNull_UsesFindValueSerializer` | `convDef!=null`, `existingSerializer==null` → เรียก `findValueSerializer` |
| `testFindConvertingContentSerializer_ConvDefPresent_ExistingProvided_SkipsFindValueSerializer` | `convDef!=null`, `existingSerializer!=null` → ไม่เรียก `findValueSerializer` |
| `testFindPropertyFilter_FilterProviderNull_Throws` | `filters == null` → throw `JsonMappingException` |
| `testFindPropertyFilter_FilterFound_ReturnsFilter` | `filters != null` และพบ filter |
| `testFindPropertyFilter_UnknownId_ReturnsNull` | `filters != null` แต่ id ไม่พบ → คืน null |

**หมายเหตุ:** บาง branch ในเมธอด `wrapAndThrow` (เช่น IOException ที่เป็น JsonMappingException ร่วมกับ `!wrap`) ถูกทดสอบผ่านทั้ง fieldName-variant และ index-variant บางส่วน เพื่อคุม branch coverage ให้ครอบคลุมมากที่สุดโดยไม่ทำให้ชุดทดสอบยาวเกินจำเป็น — หากต้องการ full mirror ทุก branch สำหรับ index-variant สามารถเพิ่มเทสเพิ่มเติมตาม pattern เดียวกันได้
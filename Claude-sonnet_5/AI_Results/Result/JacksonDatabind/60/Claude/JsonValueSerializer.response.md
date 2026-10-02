# วิเคราะห์และแผนการทดสอบ

คลาส `JsonValueSerializer` มี dependency เป็นคลาส abstract/concrete ของ jackson-databind เอง (เป็น source ที่ถูกคอมไพล์อยู่ใน classpath ของโปรเจกต์ Defects4J นี้แล้ว ไม่ใช่ jar แยก) จึงสามารถ mock ด้วย Mockito ได้ตามปกติ

**ข้อสมมติที่ต้องระวัง (คอมเมนต์กำกับไว้ในโค้ด):**
- สมมติว่า method ของ `AnnotatedMethod` (`getType/getValue/callOn/getName/getDeclaringClass`) ไม่ได้เป็น `final` จึง mock ได้
- สมมติว่า `JsonMappingException.wrapWithPath(...)` เก็บ throwable ต้นทางไว้เป็น `cause` (ตาม pattern ปกติของ jackson-databind)
- ใช้ `TypeFactory` จริงสร้าง `JavaType` (ไม่ mock) เพื่อเลี่ยงปัญหา final-method ที่อาจมีใน `JavaType`

```java
package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests สำหรับ {@link JsonValueSerializer} (JacksonDatabind-60b)
 * อยู่ใน package เดียวกับคลาสเป้าหมาย เพื่อเข้าถึง protected field/method ได้โดยตรง
 */
@SuppressWarnings({"unchecked", "deprecation", "rawtypes"})
public class JsonValueSerializerTest {

    /** คลาสช่วยที่ไม่ final ใช้ทดสอบ branch ที่ JavaType.isFinal() == false */
    static class Plain { }

    private enum SampleEnum { A, B }

    // ---------- helpers ----------

    private AnnotatedMethod mockAccessor(JavaType type) {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getType()).thenReturn(type);
        when(am.getName()).thenReturn("value");
        doReturn(Object.class).when(am).getDeclaringClass();
        return am;
    }

    private JsonSerializer<Object> mockValueSerializer() {
        return (JsonSerializer<Object>) mock(JsonSerializer.class);
    }

    // =====================================================================
    // _notNullClass (private static) - ผ่าน reflection
    // =====================================================================

    @Test
    public void testNotNullClass_nullInput_returnsObjectClass() throws Exception {
        Method m = JsonValueSerializer.class.getDeclaredMethod("_notNullClass", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(null, (Class<?>) null);
        assertEquals(Object.class, result);
    }

    @Test
    public void testNotNullClass_nonNullInput_returnsSameClass() throws Exception {
        Method m = JsonValueSerializer.class.getDeclaredMethod("_notNullClass", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(null, String.class);
        assertEquals(String.class, result);
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testConstructor_withNullSerializer_setsFieldsCorrectly() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        assertSame(am, ser._accessorMethod);
        assertNull(ser._valueSerializer);
        assertNull(ser._property);
        assertTrue(ser._forceTypeInformation);
        assertEquals(String.class, ser.handledType());
    }

    @Test
    public void testConstructor_withProvidedSerializer_setsFieldsCorrectly() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonSerializer<Object> valSer = mockValueSerializer();
        JsonValueSerializer ser = new JsonValueSerializer(am, valSer);

        assertSame(valSer, ser._valueSerializer);
    }

    // =====================================================================
    // withResolved / copy-constructor
    // =====================================================================

    @Test
    public void testWithResolved_sameValues_returnsSameInstance() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer src = new JsonValueSerializer(am, null); // property=null, ser=null, force=true

        JsonValueSerializer result = src.withResolved(null, null, true);
        assertSame(src, result);
    }

    @Test
    public void testWithResolved_differentProperty_returnsNewInstanceWithHandledTypePreserved() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer src = new JsonValueSerializer(am, null);
        assertEquals(Integer.class, src.handledType());

        BeanProperty prop = mock(BeanProperty.class);
        JsonSerializer<Object> newSer = mockValueSerializer();
        JsonValueSerializer resolved = src.withResolved(prop, newSer, false);

        assertNotSame(src, resolved);
        assertEquals(Integer.class, resolved.handledType()); // _notNullClass: cls != null branch
        assertSame(prop, resolved._property);
        assertSame(newSer, resolved._valueSerializer);
        assertFalse(resolved._forceTypeInformation);
    }

    // =====================================================================
    // createContextual
    // =====================================================================

    @Test
    public void testCreateContextual_serializerNull_staticTypingEnabled_resolvesSerializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Plain.class); // ไม่ final
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer src = new JsonValueSerializer(am, null);

        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(MapperFeature.USE_STATIC_TYPING)).thenReturn(true);
        JsonSerializer<Object> found = mockValueSerializer();
        when(provider.findPrimaryPropertySerializer(eq(type), any())).thenReturn(found);
        BeanProperty prop = mock(BeanProperty.class);

        JsonSerializer<?> result = src.createContextual(provider, prop);
        assertTrue(result instanceof JsonValueSerializer);
        JsonValueSerializer rc = (JsonValueSerializer) result;
        assertSame(found, rc._valueSerializer);
        assertSame(prop, rc._property);
        assertFalse(rc._forceTypeInformation); // Plain ไม่ใช่ natural type
    }

    @Test
    public void testCreateContextual_serializerNull_typeIsFinal_resolvesSerializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class); // final
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer src = new JsonValueSerializer(am, null);

        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(MapperFeature.USE_STATIC_TYPING)).thenReturn(false);
        JsonSerializer<Object> found = mockValueSerializer(); // ไม่มี @JacksonStdImpl
        when(provider.findPrimaryPropertySerializer(eq(type), any())).thenReturn(found);
        BeanProperty prop = mock(BeanProperty.class);

        JsonSerializer<?> result = src.createContextual(provider, prop);
        verify(provider).findPrimaryPropertySerializer(eq(type), eq(prop));
        JsonValueSerializer rc = (JsonValueSerializer) result;
        assertSame(found, rc._valueSerializer);
        assertFalse(rc._forceTypeInformation); // found ไม่ใช่ default serializer
    }

    @Test
    public void testCreateContextual_serializerNull_neitherStaticNorFinal_returnsThis() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Plain.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer src = new JsonValueSerializer(am, null);

        SerializerProvider provider = mock(SerializerProvider.class);
        when(provider.isEnabled(MapperFeature.USE_STATIC_TYPING)).thenReturn(false);
        BeanProperty prop = mock(BeanProperty.class);

        JsonSerializer<?> result = src.createContextual(provider, prop);
        assertSame(src, result);
        verify(provider, never()).findPrimaryPropertySerializer(any(), any());
    }

    @Test
    public void testCreateContextual_serializerProvided_delegatesToHandlePrimaryContextualization() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonSerializer<Object> existing = mockValueSerializer();
        JsonValueSerializer src = new JsonValueSerializer(am, existing);

        SerializerProvider provider = mock(SerializerProvider.class);
        JsonSerializer<Object> contextualized = mockValueSerializer();
        BeanProperty prop = mock(BeanProperty.class);
        when(provider.handlePrimaryContextualization(eq(existing), eq(prop))).thenReturn(contextualized);

        JsonSerializer<?> result = src.createContextual(provider, prop);
        JsonValueSerializer rc = (JsonValueSerializer) result;
        assertSame(contextualized, rc._valueSerializer);
        assertSame(prop, rc._property);
        assertTrue(rc._forceTypeInformation); // ค่าเดิมไม่เปลี่ยน
    }

    // =====================================================================
    // isNaturalTypeWithStdHandling
    // =====================================================================

    @Test
    public void testIsNaturalTypeWithStdHandling_primitiveIntWithDefaultSerializer_true() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer probe = new JsonValueSerializer(am, null); // instance นี้มี @JacksonStdImpl
        assertTrue(probe.isNaturalTypeWithStdHandling(int.class, probe));
    }

    @Test
    public void testIsNaturalTypeWithStdHandling_primitiveNonNaturalType_false() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer probe = new JsonValueSerializer(am, null);
        assertFalse(probe.isNaturalTypeWithStdHandling(long.class, probe));
    }

    @Test
    public void testIsNaturalTypeWithStdHandling_nonPrimitiveStringWithDefaultSerializer_true() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer probe = new JsonValueSerializer(am, null);
        assertTrue(probe.isNaturalTypeWithStdHandling(String.class, probe));
    }

    @Test
    public void testIsNaturalTypeWithStdHandling_nonPrimitiveNonNaturalClass_false() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer probe = new JsonValueSerializer(am, null);
        assertFalse(probe.isNaturalTypeWithStdHandling(Object.class, probe));
    }

    @Test
    public void testIsNaturalTypeWithStdHandling_primitiveBooleanWithNonDefaultSerializer_false() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer probe = new JsonValueSerializer(am, null);
        JsonSerializer<Object> plain = mockValueSerializer();
        assertFalse(probe.isNaturalTypeWithStdHandling(boolean.class, plain));
    }

    // =====================================================================
    // serialize()
    // =====================================================================

    @Test
    public void testSerialize_valueNull_callsDefaultSerializeNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        when(am.getValue(bean)).thenReturn(null);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(bean, gen, prov);
        verify(prov).defaultSerializeNull(gen);
    }

    @Test
    public void testSerialize_valueNonNull_serializerNull_findsTypedValueSerializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        when(am.getValue(bean)).thenReturn("hello");
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        JsonSerializer<Object> found = mockValueSerializer();
        when(prov.findTypedValueSerializer(eq(String.class), eq(true), isNull())).thenReturn(found);

        ser.serialize(bean, gen, prov);
        verify(found).serialize("hello", gen, prov);
    }

    @Test
    public void testSerialize_valueNonNull_serializerProvided_directSerialize() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        when(am.getValue(bean)).thenReturn("world");
        JsonSerializer<Object> given = mockValueSerializer();
        JsonValueSerializer ser = new JsonValueSerializer(am, given);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        ser.serialize(bean, gen, prov);
        verify(given).serialize("world", gen, prov);
        verify(prov, never()).findTypedValueSerializer(any(), anyBoolean(), any());
    }

    @Test
    public void testSerialize_getValueThrowsIOException_rethrown() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        IOException io = new IOException("io-fail");
        when(am.getValue(bean)).thenThrow(io);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        try {
            ser.serialize(bean, gen, prov);
            fail("Expected IOException");
        } catch (IOException e) {
            assertSame(io, e);
        }
    }

    @Test
    public void testSerialize_getValueThrowsRuntimeException_wrappedAsJsonMappingException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        RuntimeException cause = new RuntimeException("boom");
        when(am.getValue(bean)).thenThrow(cause);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        try {
            ser.serialize(bean, gen, prov);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // สมมติ wrapWithPath เก็บ cause ต้นทาง
            assertSame(cause, e.getCause());
        }
    }

    @Test
    public void testSerialize_getValueThrowsError_rethrownDirectly() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        Error err = new AssertionError("fail-error");
        when(am.getValue(bean)).thenThrow(err);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        try {
            ser.serialize(bean, gen, prov);
            fail("Expected Error");
        } catch (Error e) {
            assertSame(err, e);
        }
    }

    @Test
    public void testSerialize_getValueThrowsInvocationTargetException_unwrapsCauseAndWraps() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        RuntimeException inner = new RuntimeException("inner-boom");
        InvocationTargetException ite = new InvocationTargetException(inner);
        when(am.getValue(bean)).thenThrow(ite);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);

        try {
            ser.serialize(bean, gen, prov);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(inner, e.getCause());
        }
    }

    // =====================================================================
    // serializeWithType()
    // =====================================================================

    @Test
    public void testSerializeWithType_valueNull_callsDefaultSerializeNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        when(am.getValue(bean)).thenReturn(null);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        ser.serializeWithType(bean, gen, prov, typeSer);
        verify(prov).defaultSerializeNull(gen);
    }

    @Test
    public void testSerializeWithType_serializerNull_usesFindValueSerializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        when(am.getValue(bean)).thenReturn("val");
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);
        JsonSerializer<Object> found = mockValueSerializer();
        when(prov.findValueSerializer(eq(String.class), isNull())).thenReturn(found);

        ser.serializeWithType(bean, gen, prov, typeSer);
        verify(found).serializeWithType("val", gen, prov, typeSer);
    }

    @Test
    public void testSerializeWithType_serializerProvidedForceTypeInfoTrue_writesScalarPrefixAndSuffix() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        when(am.getValue(bean)).thenReturn("scalar");
        JsonSerializer<Object> given = mockValueSerializer();
        JsonValueSerializer ser = new JsonValueSerializer(am, given); // force=true (ค่าเริ่มต้น)
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        ser.serializeWithType(bean, gen, prov, typeSer);

        InOrder order = inOrder(typeSer, given);
        order.verify(typeSer).writeTypePrefixForScalar(bean, gen);
        order.verify(given).serialize("scalar", gen, prov);
        order.verify(typeSer).writeTypeSuffixForScalar(bean, gen);
        verify(given, never()).serializeWithType(any(), any(), any(), any());
    }

    @Test
    public void testSerializeWithType_serializerProvidedForceTypeInfoFalse_callsSerializeWithType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        JsonSerializer<Object> given = mockValueSerializer();
        JsonValueSerializer base = new JsonValueSerializer(am, given);
        JsonValueSerializer ser = base.withResolved(null, given, false); // force=false

        when(am.getValue(bean)).thenReturn("val2");
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        ser.serializeWithType(bean, gen, prov, typeSer);
        verify(given).serializeWithType("val2", gen, prov, typeSer);
        verify(typeSer, never()).writeTypePrefixForScalar(any(), any());
    }

    @Test
    public void testSerializeWithType_getValueThrowsRuntimeException_wrapped() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        Object bean = new Object();
        RuntimeException cause = new RuntimeException("boom2");
        when(am.getValue(bean)).thenThrow(cause);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonGenerator gen = mock(JsonGenerator.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        try {
            ser.serializeWithType(bean, gen, prov, typeSer);
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(cause, e.getCause());
        }
    }

    // =====================================================================
    // getSchema()
    // =====================================================================

    @Test
    public void testGetSchema_valueSerializerIsSchemaAware_delegatesToIt() throws Exception {
        JsonSerializer<Object> schemaAwareSer =
                (JsonSerializer<Object>) mock(JsonSerializer.class, withSettings().extraInterfaces(SchemaAware.class));
        JsonNode expectedNode = mock(JsonNode.class);
        when(((SchemaAware) schemaAwareSer).getSchema(any(SerializerProvider.class), isNull())).thenReturn(expectedNode);

        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer ser = new JsonValueSerializer(am, schemaAwareSer);
        SerializerProvider prov = mock(SerializerProvider.class);

        JsonNode result = ser.getSchema(prov, null);
        assertSame(expectedNode, result);
    }

    @Test
    public void testGetSchema_valueSerializerNotSchemaAware_returnsDefaultSchemaNode() throws Exception {
        JsonSerializer<Object> plain = mockValueSerializer(); // ไม่ implement SchemaAware
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer ser = new JsonValueSerializer(am, plain);
        SerializerProvider prov = mock(SerializerProvider.class);

        JsonNode result = ser.getSchema(prov, null);
        JsonNode expectedDefault = JsonSchema.getDefaultSchemaNode();
        assertEquals(expectedDefault, result);
    }

    // =====================================================================
    // acceptJsonFormatVisitor()
    // =====================================================================

    @Test
    public void testAcceptJsonFormatVisitor_declaringClassIsEnum_delegatesAndReturns() throws Exception {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getType()).thenReturn(TypeFactory.defaultInstance().constructType(String.class));
        doReturn(SampleEnum.class).when(am).getDeclaringClass();
        when(am.getName()).thenReturn("value");
        when(am.callOn(any())).thenReturn("X");

        JsonValueSerializer ser = new JsonValueSerializer(am, null);
        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        when(visitor.expectStringFormat(any())).thenReturn(stringVisitor);

        ser.acceptJsonFormatVisitor(visitor, null);

        verify(stringVisitor).enumTypes(anySet());
        // ควร return ก่อนถึง logic ของ _valueSerializer/provider เพราะ enum helper คืน true เสมอ
        verify(visitor, never()).getProvider();
    }

    @Test
    public void testAcceptJsonFormatVisitor_serializerNullFound_delegatesToFoundSerializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod am = mockAccessor(type); // getDeclaringClass = Object.class (ไม่ใช่ enum)
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(prov);
        JsonSerializer<Object> found = mockValueSerializer();
        when(prov.findTypedValueSerializer(eq(String.class), eq(false), isNull())).thenReturn(found);

        ser.acceptJsonFormatVisitor(visitor, null);
        verify(found).acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testAcceptJsonFormatVisitor_serializerNullNotFound_callsExpectAnyFormat() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        SerializerProvider prov = mock(SerializerProvider.class);
        when(visitor.getProvider()).thenReturn(prov);
        when(prov.findTypedValueSerializer(eq(String.class), eq(false), isNull())).thenReturn(null);

        ser.acceptJsonFormatVisitor(visitor, null);
        verify(visitor).expectAnyFormat(null);
    }

    @Test
    public void testAcceptJsonFormatVisitor_serializerProvided_delegatesDirectly() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonSerializer<Object> given = mockValueSerializer();
        JsonValueSerializer ser = new JsonValueSerializer(am, given);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        ser.acceptJsonFormatVisitor(visitor, null);

        verify(given).acceptJsonFormatVisitor(visitor, null);
        verify(visitor, never()).getProvider();
    }

    // =====================================================================
    // _acceptJsonFormatVisitorForEnum() - เรียกตรงเพราะ protected + same package
    // =====================================================================

    @Test
    public void testAcceptJsonFormatVisitorForEnum_stringVisitorNull_returnsTrueWithoutEnumTypes() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedMethod am = mockAccessor(type);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.expectStringFormat(any())).thenReturn(null);

        boolean result = ser._acceptJsonFormatVisitorForEnum(visitor, null, SampleEnum.class);
        assertTrue(result);
    }

    @Test
    public void testAcceptJsonFormatVisitorForEnum_stringVisitorNonNull_aggregatesEnumValues() throws Exception {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getType()).thenReturn(TypeFactory.defaultInstance().constructType(String.class));
        when(am.callOn(SampleEnum.A)).thenReturn("a");
        when(am.callOn(SampleEnum.B)).thenReturn("b");
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        when(visitor.expectStringFormat(any())).thenReturn(stringVisitor);

        boolean result = ser._acceptJsonFormatVisitorForEnum(visitor, null, SampleEnum.class);
        assertTrue(result);

        ArgumentCaptor<Set> captor = ArgumentCaptor.forClass(Set.class);
        verify(stringVisitor).enumTypes(captor.capture());
        Set<String> expected = new LinkedHashSet<String>(Arrays.asList("a", "b"));
        assertEquals(expected, captor.getValue());
    }

    @Test
    public void testAcceptJsonFormatVisitorForEnum_callOnThrows_wrapsException() throws Exception {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getType()).thenReturn(TypeFactory.defaultInstance().constructType(String.class));
        when(am.getName()).thenReturn("value");
        RuntimeException failCause = new RuntimeException("enum-fail");
        when(am.callOn(any())).thenThrow(failCause);
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        when(visitor.expectStringFormat(any())).thenReturn(stringVisitor);

        try {
            ser._acceptJsonFormatVisitorForEnum(visitor, null, SampleEnum.class);
            fail("expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertSame(failCause, e.getCause());
        }
    }

    // =====================================================================
    // toString()
    // =====================================================================

    @Test
    public void testToString_formatsCorrectly() throws Exception {
        AnnotatedMethod am = mock(AnnotatedMethod.class);
        when(am.getType()).thenReturn(TypeFactory.defaultInstance().constructType(Object.class));
        doReturn(String.class).when(am).getDeclaringClass();
        when(am.getName()).thenReturn("toStringMethod");
        JsonValueSerializer ser = new JsonValueSerializer(am, null);

        String expected = "(@JsonValue serializer for method " + String.class + "#toStringMethod)";
        assertEquals(expected, ser.toString());
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testNotNullClass_nullInput_returnsObjectClass | `_notNullClass`: cls == null → Object.class |
| testNotNullClass_nonNullInput_returnsSameClass | `_notNullClass`: cls != null → คืน class เดิม |
| testConstructor_withNullSerializer_setsFieldsCorrectly | Constructor(2-arg): ser==null, field defaults |
| testConstructor_withProvidedSerializer_setsFieldsCorrectly | Constructor(2-arg): ser!=null |
| testWithResolved_sameValues_returnsSameInstance | `withResolved`: เงื่อนไขเท่ากันทั้งหมด → return this |
| testWithResolved_differentProperty_returnsNewInstanceWithHandledTypePreserved | `withResolved`: ต่างกัน → copy constructor, handledType != null |
| testCreateContextual_serializerNull_staticTypingEnabled_resolvesSerializer | `createContextual`: ser==null, USE_STATIC_TYPING=true (OR ซ้าย true) |
| testCreateContextual_serializerNull_typeIsFinal_resolvesSerializer | `createContextual`: ser==null, isEnabled=false, t.isFinal()=true (OR ขวา true) |
| testCreateContextual_serializerNull_neitherStaticNorFinal_returnsThis | `createContextual`: ser==null, ทั้งสองเงื่อนไข false → return this |
| testCreateContextual_serializerProvided_delegatesToHandlePrimaryContextualization | `createContextual`: ser!=null (else branch) |
| testIsNaturalTypeWithStdHandling_primitiveIntWithDefaultSerializer_true | primitive + int/boolean/double + default ser → true |
| testIsNaturalTypeWithStdHandling_primitiveNonNaturalType_false | primitive แต่ไม่ใช่ int/boolean/double → false |
| testIsNaturalTypeWithStdHandling_nonPrimitiveStringWithDefaultSerializer_true | non-primitive natural class + default ser → true |
| testIsNaturalTypeWithStdHandling_nonPrimitiveNonNaturalClass_false | non-primitive ไม่ใช่ natural class → false |
| testIsNaturalTypeWithStdHandling_primitiveBooleanWithNonDefaultSerializer_false | primitive natural แต่ isDefaultSerializer=false |
| testSerialize_valueNull_callsDefaultSerializeNull | `serialize`: value==null |
| testSerialize_valueNonNull_serializerNull_findsTypedValueSerializer | `serialize`: value!=null, _valueSerializer==null |
| testSerialize_valueNonNull_serializerProvided_directSerialize | `serialize`: value!=null, _valueSerializer!=null |
| testSerialize_getValueThrowsIOException_rethrown | catch(IOException) branch |
| testSerialize_getValueThrowsRuntimeException_wrappedAsJsonMappingException | catch(Exception) → wrapWithPath |
| testSerialize_getValueThrowsError_rethrownDirectly | t instanceof Error → rethrow |
| testSerialize_getValueThrowsInvocationTargetException_unwrapsCauseAndWraps | while(t instanceof ITE) unwrap loop |
| testSerializeWithType_valueNull_callsDefaultSerializeNull | `serializeWithType`: value==null |
| testSerializeWithType_serializerNull_usesFindValueSerializer | ser==null → findValueSerializer, fallthrough serializeWithType |
| testSerializeWithType_serializerProvidedForceTypeInfoTrue_writesScalarPrefixAndSuffix | ser!=null, _forceTypeInformation=true → early return |
| testSerializeWithType_serializerProvidedForceTypeInfoFalse_callsSerializeWithType | ser!=null, _forceTypeInformation=false → fallthrough |
| testSerializeWithType_getValueThrowsRuntimeException_wrapped | exception wrap ใน serializeWithType |
| testGetSchema_valueSerializerIsSchemaAware_delegatesToIt | `getSchema`: instanceof SchemaAware=true |
| testGetSchema_valueSerializerNotSchemaAware_returnsDefaultSchemaNode | `getSchema`: instanceof SchemaAware=false |
| testAcceptJsonFormatVisitor_declaringClassIsEnum_delegatesAndReturns | declaring.isEnum()=true → early return |
| testAcceptJsonFormatVisitor_serializerNullFound_delegatesToFoundSerializer | ser==null, found!=null |
| testAcceptJsonFormatVisitor_serializerNullNotFound_callsExpectAnyFormat | ser==null, found==null → expectAnyFormat |
| testAcceptJsonFormatVisitor_serializerProvided_delegatesDirectly | ser!=null (skip provider lookup) |
| testAcceptJsonFormatVisitorForEnum_stringVisitorNull_returnsTrueWithoutEnumTypes | stringVisitor==null → skip loop |
| testAcceptJsonFormatVisitorForEnum_stringVisitorNonNull_aggregatesEnumValues | stringVisitor!=null → loop ผ่าน enum constants |
| testAcceptJsonFormatVisitorForEnum_callOnThrows_wrapsException | catch(Exception) ภายใน loop → wrapWithPath |
| testToString_formatsCorrectly | `toString()` format |
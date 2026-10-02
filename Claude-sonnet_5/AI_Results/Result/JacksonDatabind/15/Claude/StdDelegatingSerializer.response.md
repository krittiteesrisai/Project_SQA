# วิเคราะห์ Branch/Condition ที่ต้องทดสอบ

จากซอร์สโค้ด `StdDelegatingSerializer` พบเงื่อนไขสำคัญดังนี้:
- `withDelegate`: `getClass() != StdDelegatingSerializer.class` (true/false)
- `resolve`: `_delegateSerializer != null && instanceof ResolvableSerializer` (3 combination: null / not-instance / instance)
- `createContextual`: `delSer==null` → `delegateType==null` (ซ้อนกัน), `delSer instanceof ContextualSerializer`, `delSer == _delegateSerializer` (return this / withDelegate)
- `serialize`: `delegateValue == null`
- `getSchema(2-arg)` และ `getSchema(3-arg)`: `_delegateSerializer instanceof SchemaAware`

```java
package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Type;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Unit tests for {@link StdDelegatingSerializer}.
 * ใช้ Mockito mock สำหรับ Converter / JavaType / JsonSerializer / SerializerProvider
 * เนื่องจากคลาสเหล่านี้เป็น interface/abstract class ที่ไม่มี logic ให้ต้อง setup ซับซ้อน
 */
@SuppressWarnings("unchecked")
public class StdDelegatingSerializerTest {

    private Converter<Object, Object> converter;
    private SerializerProvider provider;
    private JsonGenerator gen;
    private BeanProperty property;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        converter = mock(Converter.class);
        provider = mock(SerializerProvider.class);
        gen = mock(JsonGenerator.class);
        property = mock(BeanProperty.class);
        typeFactory = mock(TypeFactory.class);
        when(provider.getTypeFactory()).thenReturn(typeFactory);
    }

    // ---------------------------------------------------------------
    // withDelegate()
    // ---------------------------------------------------------------

    @Test
    public void testWithDelegate_baseClass_returnsNewInstance() {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer base =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        StdDelegatingSerializer result = base.withDelegate(converter, delegateType, delegateSer);

        assertNotNull(result);
        assertNotSame(base, result);
        assertTrue(result.getClass() == StdDelegatingSerializer.class);
    }

    @Test
    public void testWithDelegate_subclassNotOverriding_throwsIllegalStateException() {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        // anonymous subclass ไม่ override withDelegate -> ต้อง throw ตามเงื่อนไข getClass() != base class
        StdDelegatingSerializer sub =
                new StdDelegatingSerializer(converter, delegateType, delegateSer) { };

        try {
            sub.withDelegate(converter, delegateType, delegateSer);
            fail("ควร throw IllegalStateException เมื่อ subclass ไม่ override withDelegate");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // resolve()
    // ---------------------------------------------------------------

    @Test
    public void testResolve_delegateSerializerNull_doesNothing() throws Exception {
        // constructor แบบ 1-arg -> _delegateSerializer เป็น null เสมอ
        StdDelegatingSerializer sut = new StdDelegatingSerializer(converter);
        sut.resolve(provider); // ไม่ควร throw และไม่ควรมี interaction กับ provider
        verifyZeroInteractions(provider);
    }

    @Test
    public void testResolve_delegateSerializerNotResolvable_doesNothing() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> plainSer = mock(JsonSerializer.class); // ไม่ implement ResolvableSerializer
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, plainSer);
        sut.resolve(provider); // ต้องไม่ throw ClassCastException หรืออื่นๆ
    }

    @Test
    public void testResolve_delegateSerializerResolvable_callsResolve() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> resolvableSer = (JsonSerializer<Object>) mock(
                JsonSerializer.class, withSettings().extraInterfaces(ResolvableSerializer.class));
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, resolvableSer);

        sut.resolve(provider);

        verify((ResolvableSerializer) resolvableSer, times(1)).resolve(provider);
    }

    // ---------------------------------------------------------------
    // createContextual()
    // ---------------------------------------------------------------

    @Test
    public void testCreateContextual_delegateSerializerNullAndDelegateTypeNull_lookupType() throws Exception {
        // 1-arg constructor -> _delegateSerializer == null, _delegateType == null
        JavaType resolvedType = mock(JavaType.class);
        JsonSerializer<Object> foundSer = mock(JsonSerializer.class); // ไม่ ContextualSerializer

        when(converter.getOutputType(typeFactory)).thenReturn(resolvedType);
        when(provider.findValueSerializer(resolvedType)).thenReturn((JsonSerializer<Object>) foundSer);

        StdDelegatingSerializer sut = new StdDelegatingSerializer(converter);
        JsonSerializer<?> result = sut.createContextual(provider, property);

        verify(converter, times(1)).getOutputType(typeFactory);
        verify(provider, times(1)).findValueSerializer(resolvedType);
        // delSer เปลี่ยนจาก null -> foundSer จึงต้อง withDelegate (คืน instance ใหม่)
        assertNotSame(sut, result);
        assertTrue(result instanceof StdDelegatingSerializer);
    }

    @Test
    public void testCreateContextual_delegateSerializerNullButDelegateTypeSet_skipsGetOutputType() throws Exception {
        // 3-arg constructor แต่ delegateSerializer เป็น null, delegateType ถูกกำหนดไว้แล้ว
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> foundSer = mock(JsonSerializer.class);
        when(provider.findValueSerializer(delegateType)).thenReturn((JsonSerializer<Object>) foundSer);

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, null);

        sut.createContextual(provider, property);

        verify(converter, never()).getOutputType(any(TypeFactory.class));
        verify(provider, times(1)).findValueSerializer(delegateType);
    }

    @Test
    public void testCreateContextual_delegateSerializerAlreadySet_notContextual_returnsSameInstance() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> plainSer = mock(JsonSerializer.class); // ไม่ implement ContextualSerializer

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, plainSer);

        JsonSerializer<?> result = sut.createContextual(provider, property);

        // ไม่ควรเข้า branch การ lookup type ใหม่เลย
        verify(converter, never()).getOutputType(any(TypeFactory.class));
        verify(provider, never()).findValueSerializer(any(JavaType.class));
        verify(provider, never()).handleSecondaryContextualization(any(JsonSerializer.class), any(BeanProperty.class));
        assertSame(sut, result); // delSer == _delegateSerializer -> return this
    }

    @Test
    public void testCreateContextual_delegateSerializerIsContextual_changedResult_returnsNewInstance() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> contextualSer = (JsonSerializer<Object>) mock(
                JsonSerializer.class, withSettings().extraInterfaces(ContextualSerializer.class));
        JsonSerializer<Object> newSer = mock(JsonSerializer.class);

        when(provider.handleSecondaryContextualization(contextualSer, property))
                .thenReturn((JsonSerializer<Object>) newSer);

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, contextualSer);

        JsonSerializer<?> result = sut.createContextual(provider, property);

        verify(provider, times(1)).handleSecondaryContextualization(contextualSer, property);
        assertNotSame(sut, result);
        assertTrue(result instanceof StdDelegatingSerializer);
    }

    @Test
    public void testCreateContextual_delegateSerializerIsContextual_sameResult_returnsThis() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> contextualSer = (JsonSerializer<Object>) mock(
                JsonSerializer.class, withSettings().extraInterfaces(ContextualSerializer.class));

        // handleSecondaryContextualization คืนตัวเดิม -> delSer == _delegateSerializer
        when(provider.handleSecondaryContextualization(contextualSer, property))
                .thenReturn(contextualSer);

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, contextualSer);

        JsonSerializer<?> result = sut.createContextual(provider, property);

        assertSame(sut, result);
    }

    // ---------------------------------------------------------------
    // Accessors
    // ---------------------------------------------------------------

    @Test
    public void testGetConverterAndGetDelegatee() {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        assertSame(converter, sut.getConverter());
        assertSame(delegateSer, sut.getDelegatee());
    }

    // ---------------------------------------------------------------
    // serialize()
    // ---------------------------------------------------------------

    @Test
    public void testSerialize_delegateValueNull_callsDefaultSerializeNull() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        when(converter.convert(null)).thenReturn(null); // boundary: null input value

        sut.serialize(null, gen, provider);

        verify(provider, times(1)).defaultSerializeNull(gen);
        verify(delegateSer, never()).serialize(any(), any(JsonGenerator.class), any(SerializerProvider.class));
    }

    @Test
    public void testSerialize_delegateValueNonNull_callsDelegateSerialize() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        Object input = "source";
        Object converted = "converted";
        when(converter.convert(input)).thenReturn(converted);

        sut.serialize(input, gen, provider);

        verify(delegateSer, times(1)).serialize(converted, gen, provider);
        verify(provider, never()).defaultSerializeNull(any(JsonGenerator.class));
    }

    // ---------------------------------------------------------------
    // serializeWithType()
    // ---------------------------------------------------------------

    @Test
    public void testSerializeWithType_callsDelegate() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);
        TypeSerializer typeSer = mock(TypeSerializer.class);

        Object input = "value";
        Object converted = "convertedValue";
        when(converter.convert(input)).thenReturn(converted);

        sut.serializeWithType(input, gen, provider, typeSer);

        verify(delegateSer, times(1)).serializeWithType(converted, gen, provider, typeSer);
    }

    // ---------------------------------------------------------------
    // isEmpty() overloads
    // ---------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testIsEmptyDeprecated_delegatesToSerializer() {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        Object input = "v";
        Object converted = "c";
        when(converter.convert(input)).thenReturn(converted);
        when(delegateSer.isEmpty(converted)).thenReturn(true);

        boolean result = sut.isEmpty(input);

        assertTrue(result);
        verify(delegateSer, times(1)).isEmpty(converted);
    }

    @Test
    public void testIsEmptyWithProvider_delegatesToSerializer() {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        Object input = "v";
        Object converted = "c";
        when(converter.convert(input)).thenReturn(converted);
        when(delegateSer.isEmpty(provider, converted)).thenReturn(false);

        boolean result = sut.isEmpty(provider, input);

        assertFalse(result);
        verify(delegateSer, times(1)).isEmpty(provider, converted);
    }

    // ---------------------------------------------------------------
    // getSchema() overloads
    // ---------------------------------------------------------------

    @Test
    public void testGetSchemaTwoArg_delegateIsSchemaAware_callsDelegateSchema() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> schemaAwareSer = (JsonSerializer<Object>) mock(
                JsonSerializer.class, withSettings().extraInterfaces(SchemaAware.class));
        JsonNode expectedNode = mock(JsonNode.class);
        Type typeHint = Object.class;

        when(((SchemaAware) schemaAwareSer).getSchema(provider, typeHint)).thenReturn(expectedNode);

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, schemaAwareSer);

        JsonNode result = sut.getSchema(provider, typeHint);

        assertSame(expectedNode, result);
        verify((SchemaAware) schemaAwareSer, times(1)).getSchema(provider, typeHint);
    }

    @Test
    public void testGetSchemaTwoArg_delegateNotSchemaAware_fallsBackToSuper() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> plainSer = mock(JsonSerializer.class); // ไม่ implement SchemaAware
        Type typeHint = Object.class;

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, plainSer);

        // ไม่ทราบ behavior แน่ชัดของ super.getSchema() จาก source ที่ให้มา
        // จึงตรวจสอบเพียงว่าไม่ throw exception (ไม่เดา return value)
        sut.getSchema(provider, typeHint);
    }

    @Test
    public void testGetSchemaThreeArg_delegateIsSchemaAware_callsDelegateSchemaWithOptionalFlag() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> schemaAwareSer = (JsonSerializer<Object>) mock(
                JsonSerializer.class, withSettings().extraInterfaces(SchemaAware.class));
        JsonNode expectedNode = mock(JsonNode.class);
        Type typeHint = Object.class;

        when(((SchemaAware) schemaAwareSer).getSchema(provider, typeHint, true)).thenReturn(expectedNode);

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, schemaAwareSer);

        JsonNode result = sut.getSchema(provider, typeHint, true);

        assertSame(expectedNode, result);
        verify((SchemaAware) schemaAwareSer, times(1)).getSchema(provider, typeHint, true);
    }

    @Test
    public void testGetSchemaThreeArg_delegateNotSchemaAware_fallsBackToSuperTwoArg() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> plainSer = mock(JsonSerializer.class);
        Type typeHint = Object.class;

        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, plainSer);

        // หมายเหตุ: source เรียก super.getSchema(provider, typeHint) แบบ 2 arg (ไม่ส่ง isOptional ต่อ)
        // ทดสอบเพียงว่าไม่ throw exception ตาม behavior จริงของโค้ด
        sut.getSchema(provider, typeHint, false);
    }

    // ---------------------------------------------------------------
    // acceptJsonFormatVisitor()
    // ---------------------------------------------------------------

    @Test
    public void testAcceptJsonFormatVisitor_delegatesCall() throws Exception {
        JavaType delegateType = mock(JavaType.class);
        JsonSerializer<Object> delegateSer = mock(JsonSerializer.class);
        StdDelegatingSerializer sut =
                new StdDelegatingSerializer(converter, delegateType, delegateSer);

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        JavaType typeHint = mock(JavaType.class);

        sut.acceptJsonFormatVisitor(visitor, typeHint);

        verify(delegateSer, times(1)).acceptJsonFormatVisitor(visitor, typeHint);
    }

    // ---------------------------------------------------------------
    // Constructors (boundary / class-based ctor)
    // ---------------------------------------------------------------

    @Test
    public void testClassConverterConstructor_createsInstanceWithNullDelegate() {
        Converter<String, ?> stringConverter = mock(Converter.class);
        StdDelegatingSerializer sut = new StdDelegatingSerializer(String.class, stringConverter);

        assertNull(sut.getDelegatee()); // _delegateSerializer ต้องเป็น null ตาม constructor
    }
}
```

# สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testWithDelegate_baseClass_returnsNewInstance` | `withDelegate`: `getClass() == StdDelegatingSerializer.class` → false ของ throw condition |
| `testWithDelegate_subclassNotOverriding_throwsIllegalStateException` | `withDelegate`: `getClass() != StdDelegatingSerializer.class` → true → throw |
| `testResolve_delegateSerializerNull_doesNothing` | `resolve`: `_delegateSerializer != null` = false |
| `testResolve_delegateSerializerNotResolvable_doesNothing` | `resolve`: not-null แต่ `instanceof ResolvableSerializer` = false |
| `testResolve_delegateSerializerResolvable_callsResolve` | `resolve`: ทั้งสองเงื่อนไข true → เรียก resolve() |
| `testCreateContextual_delegateSerializerNullAndDelegateTypeNull_lookupType` | `createContextual`: `delSer==null` & `delegateType==null` → เรียก `getOutputType` และ `findValueSerializer` |
| `testCreateContextual_delegateSerializerNullButDelegateTypeSet_skipsGetOutputType` | `createContextual`: `delSer==null` แต่ `delegateType!=null` → skip getOutputType |
| `testCreateContextual_delegateSerializerAlreadySet_notContextual_returnsSameInstance` | `delSer!=null` (skip lookup), `!(instanceof ContextualSerializer)`, `delSer==_delegateSerializer` → return this |
| `testCreateContextual_delegateSerializerIsContextual_changedResult_returnsNewInstance` | `instanceof ContextualSerializer`=true, ผลเปลี่ยน → withDelegate |
| `testCreateContextual_delegateSerializerIsContextual_sameResult_returnsThis` | `instanceof ContextualSerializer`=true, ผลเดิม → return this |
| `testGetConverterAndGetDelegatee` | Accessor coverage (`getConverter`, `getDelegatee`) |
| `testSerialize_delegateValueNull_callsDefaultSerializeNull` | `serialize`: `delegateValue==null` = true, ค่า null (boundary) |
| `testSerialize_delegateValueNonNull_callsDelegateSerialize` | `serialize`: `delegateValue==null` = false |
| `testSerializeWithType_callsDelegate` | `serializeWithType` (ไม่มี branch แต่ทดสอบ path หลัก) |
| `testIsEmptyDeprecated_delegatesToSerializer` | `isEmpty(Object)` deprecated overload |
| `testIsEmptyWithProvider_delegatesToSerializer` | `isEmpty(provider, value)` overload |
| `testGetSchemaTwoArg_delegateIsSchemaAware_callsDelegateSchema` | `getSchema(2-arg)`: `instanceof SchemaAware`=true |
| `testGetSchemaTwoArg_delegateNotSchemaAware_fallsBackToSuper` | `getSchema(2-arg)`: `instanceof SchemaAware`=false → super |
| `testGetSchemaThreeArg_delegateIsSchemaAware_callsDelegateSchemaWithOptionalFlag` | `getSchema(3-arg)`: `instanceof SchemaAware`=true |
| `testGetSchemaThreeArg_delegateNotSchemaAware_fallsBackToSuperTwoArg` | `getSchema(3-arg)`: `instanceof SchemaAware`=false → super (2-arg call ตาม source) |
| `testAcceptJsonFormatVisitor_delegatesCall` | `acceptJsonFormatVisitor` path หลัก |
| `testClassConverterConstructor_createsInstanceWithNullDelegate` | Constructor `(Class, Converter)` boundary: `_delegateSerializer==null` |

**หมายเหตุสำคัญ:** สำหรับ `getSchema` กรณี `!(instanceof SchemaAware)` ไม่สามารถยืนยัน return value ที่แน่ชัดได้เนื่องจาก implementation ของ `super.getSchema(...)` (จาก `StdSerializer`) ไม่ได้อยู่ในซอร์สที่ให้มา จึงทดสอบเพียงว่าไม่เกิด exception ตามข้อกำหนดห้ามเดา behavior ที่ไม่มีในซอร์ส
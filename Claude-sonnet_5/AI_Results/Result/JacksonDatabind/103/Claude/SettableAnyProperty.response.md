# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `SettableAnyProperty`

**หมายเหตุสำคัญก่อนเริ่ม:**
- `AnnotatedMethod` / `AnnotatedField` อาจเป็น `final class` ในซอร์ส jackson-databind จริง (ไม่ได้แสดงในซอร์สที่ให้มา) จึงเลือกใช้ **PowerMockito** (มี jar `powermock-*`, `javassist-*` ให้ใช้ในโจทย์) เพื่อ mock คลาสเหล่านี้ให้ปลอดภัยไม่ว่าจะ final หรือไม่
- `DeserializationConfig` สันนิษฐานว่าเป็น final class เช่นกัน จึงใช้ `ObjectMapper` จริงสร้าง instance แทนการ mock
- ไม่พบ loop (`for`/`while`) ในซอร์สโค้ดเป้าหมาย จึงไม่มี test ที่ครอบคลุม loop
- `AnySetterReferring.handleResolvedForwardReference()` และ `hasId()` ของ `ReadableObjectId.Referring` **ไม่ได้ทดสอบ logic ภายใน** เพราะซอร์สของ `Referring` ไม่ได้ให้มา (ไม่ต้องการเดา behavior) — มีการทดสอบเพียงว่า `AnySetterReferring` ถูกสร้างและเรียก `appendReferring` ถูกต้องเท่านั้น
- ตำแหน่ง package ของ `ObjectIdReader` (`com.fasterxml.jackson.databind.deser.impl.ObjectIdReader`) เป็นการสันนิษฐานจากโครงสร้างทั่วไป

```java
package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/**
 * หมายเหตุสมมติฐาน (assumptions) ที่ไม่ปรากฏชัดในซอร์สโค้ดเป้าหมาย:
 * 1) AnnotatedMethod#callOnWith(Object, Object...) - สมมติ signature เป็น varargs
 *    ตามคอมเมนต์ในซอร์ส "note: cannot use 'setValue()' due to taking 2 args"
 * 2) AnnotatedMethod/AnnotatedField อาจเป็น final class จึงใช้ PowerMockito mock
 *    เพื่อให้ปลอดภัยทั้งกรณี final และไม่ final
 * 3) ObjectIdReader สันนิษฐานว่าอยู่ package com.fasterxml.jackson.databind.deser.impl
 * 4) ไม่ได้ทดสอบ logic ภายในของ ReadableObjectId.Referring#hasId()/handleResolvedForwardReference()
 *    เพราะซอร์สของ Referring ไม่ได้ให้มาในโจทย์ (เพื่อไม่เดา behavior)
 * 5) DeserializationConfig สันนิษฐานเป็น final class จึงใช้ ObjectMapper จริงสร้าง instance
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
    AnnotatedMethod.class,
    AnnotatedField.class,
    UnresolvedForwardReference.class,
    ReadableObjectId.class,
    ObjectIdReader.class
})
public class SettableAnyPropertyTest {

    private BeanProperty property;
    private JavaType type;
    @SuppressWarnings("unchecked")
    private JsonDeserializer<Object> valueDeser;

    @Before
    public void setUp() {
        property = mock(BeanProperty.class);
        type = mock(JavaType.class);
        valueDeser = mock(JsonDeserializer.class);
    }

    // ================= Constructors =================

    @Test
    public void testConstructor_setterIsMethod_setterIsFieldFalse() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);

        assertFalse(prop._setterIsField);
        assertSame(property, prop._property);
        assertSame(methodMock, prop._setter);
        assertSame(type, prop._type);
        assertNull(prop._keyDeserializer);
        assertSame(valueDeser, prop._valueDeserializer);
        assertNull(prop._valueTypeDeserializer);
    }

    @Test
    public void testConstructor_setterIsField_setterIsFieldTrue() throws Exception {
        AnnotatedField fieldMock = PowerMockito.mock(AnnotatedField.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, fieldMock, type, null, valueDeser, null);
        assertTrue(prop._setterIsField);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_keyDeserializerIsNull() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, valueDeser, null);
        assertNull(prop._keyDeserializer);
        assertSame(property, prop._property);
        assertSame(valueDeser, prop._valueDeserializer);
    }

    // ================= withValueDeserializer =================

    @Test
    public void testWithValueDeserializer_createsCopyWithNewDeserializer() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        KeyDeserializer keyDeser = mock(KeyDeserializer.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        SettableAnyProperty original = new SettableAnyProperty(property, methodMock, type, keyDeser, valueDeser, typeDeser);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> newDeser = mock(JsonDeserializer.class);
        SettableAnyProperty copy = original.withValueDeserializer(newDeser);

        assertNotSame(original, copy);
        assertSame(property, copy._property);
        assertSame(methodMock, copy._setter);
        assertSame(type, copy._type);
        assertSame(keyDeser, copy._keyDeserializer);
        assertSame(newDeser, copy._valueDeserializer);
        assertSame(typeDeser, copy._valueTypeDeserializer);
    }

    // ================= fixAccess =================

    @Test
    public void testFixAccess_featureEnabled_callsSetterFixAccessTrue() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig()
                .with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config);
        verify(methodMock).fixAccess(true);
    }

    @Test
    public void testFixAccess_featureDisabled_callsSetterFixAccessFalse() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig()
                .without(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config);
        verify(methodMock).fixAccess(false);
    }

    // ================= readResolve =================

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_nullSetter_throwsIllegalArgumentException() throws Exception {
        SettableAnyProperty prop = new SettableAnyProperty(property, null, type, null, valueDeser, null);
        prop.readResolve();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_annotatedIsNull_throwsIllegalArgumentException() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        PowerMockito.when(methodMock.getAnnotated()).thenReturn(null);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        prop.readResolve();
    }

    @Test
    public void testReadResolve_valid_returnsThis() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        Method dummyMethod = Object.class.getMethod("toString");
        PowerMockito.when(methodMock.getAnnotated()).thenReturn(dummyMethod);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);

        Object result = prop.readResolve();
        assertSame(prop, result);
    }

    // ================= Getters =================

    @Test
    public void testGetters_basic() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        assertSame(property, prop.getProperty());
        assertSame(type, prop.getType());
        assertTrue(prop.hasValueDeserializer());
    }

    @Test
    public void testHasValueDeserializer_falseWhenNull() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, null, null);
        assertFalse(prop.hasValueDeserializer());
    }

    // ================= toString / getClassName (ทางอ้อม) =================

    @Test
    public void testToString_containsDeclaringClassName() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        Class<?> declClass = SettableAnyProperty.class;
        PowerMockito.when(methodMock.getDeclaringClass()).thenReturn(declClass);

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        String s = prop.toString();
        assertEquals("[any property on class " + SettableAnyProperty.class.getName() + "]", s);
    }

    // ================= deserialize =================

    @Test
    public void testDeserialize_nullToken_returnsNullValueFromDeserializer() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_NULL);
        Object nullVal = new Object();
        when(valueDeser.getNullValue(ctxt)).thenReturn(nullVal);

        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);

        Object result = prop.deserialize(p, ctxt);
        assertSame(nullVal, result);
        verify(valueDeser).getNullValue(ctxt);
        verify(valueDeser, never()).deserialize(any(JsonParser.class), any(DeserializationContext.class));
    }

    @Test
    public void testDeserialize_withTypeDeserializer_callsDeserializeWithType() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.START_OBJECT);
        Object expected = new Object();
        when(valueDeser.deserializeWithType(p, ctxt, typeDeser)).thenReturn(expected);

        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, typeDeser);

        Object result = prop.deserialize(p, ctxt);
        assertSame(expected, result);
    }

    @Test
    public void testDeserialize_noTypeDeserializer_callsPlainDeserialize() throws Exception {
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        Object expected = "hello";
        when(valueDeser.deserialize(p, ctxt)).thenReturn(expected);

        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);

        Object result = prop.deserialize(p, ctxt);
        assertEquals(expected, result);
    }

    // ================= set() : field branch =================

    @Test
    public void testSet_fieldBranch_mapNotNull_putsKeyValue() throws Exception {
        AnnotatedField fieldMock = PowerMockito.mock(AnnotatedField.class);
        Map<Object, Object> map = new HashMap<Object, Object>();
        PowerMockito.when(fieldMock.getValue(any())).thenReturn(map);

        SettableAnyProperty prop = new SettableAnyProperty(property, fieldMock, type, null, valueDeser, null);
        Object instance = new Object();
        prop.set(instance, "key1", "val1");

        assertEquals("val1", map.get("key1"));
    }

    @Test
    public void testSet_fieldBranch_mapIsNull_doesNothingNoException() throws Exception {
        AnnotatedField fieldMock = PowerMockito.mock(AnnotatedField.class);
        PowerMockito.when(fieldMock.getValue(any())).thenReturn(null);

        SettableAnyProperty prop = new SettableAnyProperty(property, fieldMock, type, null, valueDeser, null);
        Object instance = new Object();
        // ต้องไม่มี exception ใด ๆ ถูก throw เมื่อ field value เป็น null (ตามคอมเมนต์ในซอร์ส)
        prop.set(instance, "key1", "val1");
    }

    @Test
    public void testSet_fieldBranch_getValueThrowsRuntimeException_rethrownAsIs() throws Exception {
        AnnotatedField fieldMock = PowerMockito.mock(AnnotatedField.class);
        RuntimeException rte = new RuntimeException("field fail");
        PowerMockito.when(fieldMock.getValue(any())).thenThrow(rte);

        SettableAnyProperty prop = new SettableAnyProperty(property, fieldMock, type, null, valueDeser, null);
        try {
            prop.set(new Object(), "k", "v");
            fail("Expected RuntimeException to be rethrown as-is");
        } catch (RuntimeException e) {
            assertSame(rte, e);
        }
    }

    // ================= set() : method branch =================

    @Test
    public void testSet_methodBranch_callsCallOnWith() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Object instance = new Object();
        prop.set(instance, "key2", "val2");
        verify(methodMock).callOnWith(instance, "key2", "val2");
    }

    @Test
    public void testSet_methodBranch_illegalArgumentException_wrapsToJsonMappingException() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        PowerMockito.when(methodMock.callOnWith(any(), any(), any()))
                .thenThrow(new IllegalArgumentException("bad arg"));

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        try {
            prop.set(new Object(), "propY", "valY");
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("propY"));
            assertTrue(e.getMessage().contains("bad arg"));
        }
    }

    // ================= _throwAsIOE (ทดสอบตรง: protected, same package) =================

    @Test
    public void testThrowAsIOE_illegalArgumentException_withMessage() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        try {
            prop._throwAsIOE(new IllegalArgumentException("oops"), "pName", "pValue");
            fail("Expected JsonMappingException");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
            String msg = e.getMessage();
            assertTrue(msg.contains("pName"));
            assertTrue(msg.contains("oops"));
            assertTrue(msg.contains("problem:"));
        }
    }

    @Test
    public void testThrowAsIOE_illegalArgumentException_withNullMessage() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        try {
            prop._throwAsIOE(new IllegalArgumentException(), "pName2", 123);
            fail("Expected JsonMappingException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no error message provided"));
        }
    }

    @Test
    public void testThrowAsIOE_illegalArgumentException_nullValue_doesNotCrash() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        try {
            prop._throwAsIOE(new IllegalArgumentException("bad"), "propNull", null);
            fail("Expected JsonMappingException");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("propNull"));
        }
    }

    @Test
    public void testThrowAsIOE_ioExceptionRethrownAsIs() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        IOException original = new IOException("io fail");
        try {
            prop._throwAsIOE(original, "p", "v");
            fail("Expected original IOException to be rethrown");
        } catch (IOException e) {
            assertSame(original, e);
        }
    }

    @Test
    public void testThrowAsIOE_runtimeExceptionRethrownAsIs() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        RuntimeException original = new RuntimeException("rt fail");
        try {
            prop._throwAsIOE(original, "p", "v");
            fail("Expected original RuntimeException to be rethrown");
        } catch (IOException ioe) {
            fail("Should not wrap RuntimeException as IOException");
        } catch (RuntimeException e) {
            assertSame(original, e);
        }
    }

    @Test
    public void testThrowAsIOE_otherCheckedException_wrapsRootCause() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Exception root = new Exception("root cause msg");
        Exception wrapper = new Exception("wrapper msg", root);
        try {
            prop._throwAsIOE(wrapper, "p", "v");
            fail("Expected JsonMappingException wrapping root cause");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
            assertEquals("root cause msg", e.getMessage());
        }
    }

    // ================= deserializeAndSet =================

    @Test
    public void testDeserializeAndSet_withoutKeyDeserializer_usesPropNameDirectly() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        Object val = "theValue";
        when(valueDeser.deserialize(p, ctxt)).thenReturn(val);

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance, "myProp");

        verify(methodMock).callOnWith(instance, "myProp", val);
    }

    @Test
    public void testDeserializeAndSet_withKeyDeserializer_usesDeserializedKey() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        KeyDeserializer keyDeser = mock(KeyDeserializer.class);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        Object val = "theValue";
        when(valueDeser.deserialize(p, ctxt)).thenReturn(val);
        Object keyObj = new Object();
        when(keyDeser.deserializeKey("myProp", ctxt)).thenReturn(keyObj);

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, keyDeser, valueDeser, null);
        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance, "myProp");

        verify(methodMock).callOnWith(instance, keyObj, val);
    }

    @Test
    public void testDeserializeAndSet_emptyPropName_boundaryCase() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        Object val = "v";
        when(valueDeser.deserialize(p, ctxt)).thenReturn(val);

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance, "");

        verify(methodMock).callOnWith(instance, "", val);
    }

    @Test
    public void testDeserializeAndSet_nullPropName_withoutKeyDeserializer() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(p.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        Object val = "v";
        when(valueDeser.deserialize(p, ctxt)).thenReturn(val);

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance, null);

        verify(methodMock).callOnWith(instance, null, val);
    }

    @Test
    public void testDeserializeAndSet_unresolvedForwardReference_withObjectIdReader_appendsReferring() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        UnresolvedForwardReference ufr = PowerMockito.mock(UnresolvedForwardReference.class);
        ReadableObjectId roid = PowerMockito.mock(ReadableObjectId.class);
        PowerMockito.when(ufr.getRoid()).thenReturn(roid);

        when(valueDeser.deserialize(p, ctxt)).thenThrow(ufr);

        ObjectIdReader oir = PowerMockito.mock(ObjectIdReader.class);
        when(valueDeser.getObjectIdReader()).thenReturn(oir);

        doReturn(Object.class).when(type).getRawClass();

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Object instance = new Object();

        // ไม่ควร throw exception เพราะมี ObjectIdReader อยู่
        prop.deserializeAndSet(p, ctxt, instance, "myProp");

        verify(roid).appendReferring(any(ReadableObjectId.Referring.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeAndSet_unresolvedForwardReference_noObjectIdReader_throwsJsonMappingException() throws Exception {
        AnnotatedMethod methodMock = PowerMockito.mock(AnnotatedMethod.class);
        JsonParser p = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        UnresolvedForwardReference ufr = PowerMockito.mock(UnresolvedForwardReference.class);
        when(valueDeser.deserialize(p, ctxt)).thenThrow(ufr);
        // ไม่ stub valueDeser.getObjectIdReader() -> คืนค่า null โดย default ของ mock

        SettableAnyProperty prop = new SettableAnyProperty(property, methodMock, type, null, valueDeser, null);
        Object instance = new Object();
        prop.deserializeAndSet(p, ctxt, instance, "myProp");
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_setterIsMethod_setterIsFieldFalse` | constructor: `setter instanceof AnnotatedField` → false |
| `testConstructor_setterIsField_setterIsFieldTrue` | constructor: `setter instanceof AnnotatedField` → true |
| `testDeprecatedConstructor_keyDeserializerIsNull` | deprecated constructor delegate, `_keyDeserializer=null` |
| `testWithValueDeserializer_createsCopyWithNewDeserializer` | `withValueDeserializer` สร้าง instance ใหม่ |
| `testFixAccess_featureEnabled_*` / `testFixAccess_featureDisabled_*` | `fixAccess`: `isEnabled(...)` true/false |
| `testReadResolve_nullSetter_*` | `readResolve`: `_setter == null` → throw |
| `testReadResolve_annotatedIsNull_*` | `readResolve`: `_setter.getAnnotated() == null` → throw |
| `testReadResolve_valid_returnsThis` | `readResolve`: ทั้งสองเงื่อนไขเป็น false → return this |
| `testGetters_basic` | `getProperty/getType/hasValueDeserializer` true |
| `testHasValueDeserializer_falseWhenNull` | `hasValueDeserializer` → false |
| `testToString_containsDeclaringClassName` | `toString()`/`getClassName()` |
| `testDeserialize_nullToken_*` | `deserialize`: `t == VALUE_NULL` → true |
| `testDeserialize_withTypeDeserializer_*` | `deserialize`: `_valueTypeDeserializer != null` → true |
| `testDeserialize_noTypeDeserializer_*` | `deserialize`: else branch (plain deserialize) |
| `testSet_fieldBranch_mapNotNull_*` | `set`: `_setterIsField==true`, `val != null` → put |
| `testSet_fieldBranch_mapIsNull_*` | `set`: `_setterIsField==true`, `val == null` → skip |
| `testSet_fieldBranch_getValueThrowsRuntimeException_*` | `set` field-branch + `_throwAsIOE` RTE passthrough |
| `testSet_methodBranch_callsCallOnWith` | `set`: `_setterIsField==false` → callOnWith |
| `testSet_methodBranch_illegalArgumentException_*` | `set` catch(Exception) → `_throwAsIOE` (IAE branch) |
| `testThrowAsIOE_illegalArgumentException_withMessage` | `_throwAsIOE`: `e instanceof IAE`, origMsg != null |
| `testThrowAsIOE_illegalArgumentException_withNullMessage` | `_throwAsIOE`: IAE, origMsg == null |
| `testThrowAsIOE_illegalArgumentException_nullValue_*` | `_throwAsIOE`: value=null (boundary) |
| `testThrowAsIOE_ioExceptionRethrownAsIs` | `_throwAsIOE`: `ClassUtil.throwIfIOE` branch |
| `testThrowAsIOE_runtimeExceptionRethrownAsIs` | `_throwAsIOE`: `ClassUtil.throwIfRTE` branch |
| `testThrowAsIOE_otherCheckedException_wrapsRootCause` | `_throwAsIOE`: fallback wrap root cause |
| `testDeserializeAndSet_withoutKeyDeserializer_*` | `deserializeAndSet`: `_keyDeserializer==null` |
| `testDeserializeAndSet_withKeyDeserializer_*` | `deserializeAndSet`: `_keyDeserializer!=null` |
| `testDeserializeAndSet_emptyPropName_*` | boundary: propName = "" |
| `testDeserializeAndSet_nullPropName_*` | boundary/null: propName = null |
| `testDeserializeAndSet_unresolvedForwardReference_withObjectIdReader_*` | catch `UnresolvedForwardReference`, `getObjectIdReader()!=null` → append referring |
| `testDeserializeAndSet_unresolvedForwardReference_noObjectIdReader_*` | catch `UnresolvedForwardReference`, `getObjectIdReader()==null` → throw `JsonMappingException` |

**ข้อจำกัดที่ยังไม่ครอบคลุม (ตามข้อกำหนดห้ามเดา behavior):** logic ภายในของ `AnySetterReferring.handleResolvedForwardReference()` และ `hasId()` เนื่องจากซอร์สของ `ReadableObjectId.Referring` ไม่ได้ถูกให้มาในโจทย์
# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญก่อนโค้ด:**
- ผม**จงใจวางคลาสทดสอบไว้ใน package เดียวกัน** (`com.fasterxml.jackson.databind.deser.impl`) กับคลาสเป้าหมาย เพื่อให้สามารถเรียก method `readResolve()` (package-private) และเข้าถึงฟิลด์ `protected` ได้ตรงตามเจตนาของการทดสอบแบบ white-box — เพราะฉะนั้นจึง**ไม่ต้องมีคำสั่ง `import` สำหรับ `FieldProperty`** (อยู่ package เดียวกันแล้ว) แต่ยัง import ของอื่น ๆ ที่จำเป็นครบถ้วน
- ฟิลด์ `_annotated`, `_field` เป็น `final` ดังนั้นแม้อยู่ package เดียวกันก็ยังต้องใช้ reflection เพื่อ "บังคับ" ค่า null สำหรับทดสอบ branch ที่ปกติ reach ไม่ถึง (คอมเมนต์กำกับไว้ในโค้ด)
- ใช้ `NullsConstantProvider.skipper()` / `isSkipper()` ซึ่งเป็น public API จริงของคลาส dependency (ไม่ได้เดา behavior ของ `FieldProperty` เอง) — คอมเมนต์กำกับไว้
- สมมติฐานเรื่อง `SettableBeanProperty` copy-constructor ว่าคง `_valueTypeDeserializer` เดิมไว้เวลาเรียก `withValueDeserializer`/`withNullProvider` — คอมเมนต์กำกับไว้ว่าเป็น assumption เพราะไม่มี source ให้

```java
package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;

/**
 * Unit tests for {@link FieldProperty}.
 *
 * หมายเหตุ: คลาสทดสอบนี้ถูกวางไว้ใน package เดียวกับ FieldProperty (ไม่ต้อง import
 * ตัวคลาสเป้าหมาย) เพื่อให้เข้าถึง protected field และ package-private method
 * (readResolve) ได้โดยตรง ซึ่งจำเป็นสำหรับการไล่ branch coverage ของบาง method
 */
public class FieldPropertyTest
{
    // ---------------------------------------------------------------
    // Fixture bean classes
    // ---------------------------------------------------------------

    static class SimpleBean {
        public String value;
    }

    static class PrivateFieldBean {
        @JsonProperty
        private String value;
    }

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private static BeanPropertyDefinition findPropertyDefinition(Class<?> beanClass, String propName) {
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.constructType(beanClass);
        BeanDescription desc = mapper.getDeserializationConfig().introspect(javaType);
        for (BeanPropertyDefinition def : desc.findProperties()) {
            if (propName.equals(def.getName())) {
                return def;
            }
        }
        throw new IllegalStateException("Property not found: " + propName + " in " + beanClass);
    }

    private static FieldProperty newFieldProperty(Class<?> beanClass, String propName,
            TypeDeserializer typeDeser) {
        BeanPropertyDefinition propDef = findPropertyDefinition(beanClass, propName);
        AnnotatedField field = propDef.getField();
        assertNotNull("AnnotatedField must be found for " + propName, field);
        JavaType type = new ObjectMapper().constructType(String.class);
        Annotations contextAnnotations = mock(Annotations.class);
        return new FieldProperty(propDef, type, typeDeser, contextAnnotations, field);
    }

    private static FieldProperty newFieldProperty(Class<?> beanClass, String propName) {
        return newFieldProperty(beanClass, propName, null);
    }

    // =================================================================
    // Construction / getMember / getAnnotation
    // =================================================================

    @Test
    public void testGetMemberReturnsAnnotatedField() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        assertTrue(prop.getMember() instanceof AnnotatedField);
        AnnotatedField af = (AnnotatedField) prop.getMember();
        assertEquals("value", af.getName());
    }

    @Test
    public void testGetAnnotation_annotatedFieldPresent_noAnnotation_returnsNull() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        // SimpleBean.value has no annotations -> covers "_annotated != null" branch, result null
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetAnnotation_annotatedFieldPresent_withAnnotation_returnsIt() {
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        JsonProperty ann = prop.getAnnotation(JsonProperty.class);
        assertNotNull("Expected to find @JsonProperty annotation on field", ann);
    }

    @Test
    public void testGetAnnotation_annotatedFieldIsNull_returnsNull() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        // สถานการณ์นี้ไม่สามารถเกิดได้จากการ construct ปกติ (constructor จะ NPE ก่อนสำเร็จ)
        // จึงบังคับ (force) ด้วย reflection เพื่อให้ได้ครอบคลุม branch (_annotated == null)
        Field annotatedField = FieldProperty.class.getDeclaredField("_annotated");
        annotatedField.setAccessible(true);
        annotatedField.set(prop, null);
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    // =================================================================
    // withName / withValueDeserializer / withNullProvider
    // =================================================================

    @Test
    public void testWithName_createsNewInstanceWithNewName() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        SettableBeanProperty renamed = prop.withName(new PropertyName("renamedValue"));
        assertNotSame(prop, renamed);
        assertTrue(renamed instanceof FieldProperty);
        assertEquals("renamedValue", renamed.getName());
    }

    @Test
    public void testWithValueDeserializer_sameInstance_returnsThis() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);

        SettableBeanProperty withDeser = prop.withValueDeserializer(deser);
        // ครั้งแรก deser ต่างจาก default -> ต้องได้ instance ใหม่ (else branch)
        assertNotSame(prop, withDeser);

        SettableBeanProperty withSameDeser = withDeser.withValueDeserializer(deser);
        // ครั้งที่สอง deser เท่าเดิม -> ต้อง return this (if branch)
        assertSame(withDeser, withSameDeser);
    }

    @Test
    public void testWithValueDeserializer_differentInstance_returnsNewInstance() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser1 = mock(JsonDeserializer.class);
        JsonDeserializer<?> deser2 = mock(JsonDeserializer.class);

        SettableBeanProperty withDeser1 = prop.withValueDeserializer(deser1);
        SettableBeanProperty withDeser2 = withDeser1.withValueDeserializer(deser2);
        assertNotSame(withDeser1, withDeser2);
    }

    @Test
    public void testWithNullProvider_createsNewInstance() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        NullValueProvider nvp = mock(NullValueProvider.class);
        SettableBeanProperty withNvp = prop.withNullProvider(nvp);
        assertNotSame(prop, withNvp);
        assertTrue(withNvp instanceof FieldProperty);
    }

    // =================================================================
    // fixAccess
    // =================================================================

    @Test
    public void testFixAccess_withOverrideEnabled_doesNotThrow() {
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig()
                .with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config); // ไม่ควร throw
    }

    @Test
    public void testFixAccess_withOverrideDisabled_doesNotThrowForAlreadyAccessible() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig()
                .without(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config); // public field อยู่แล้ว ไม่ควร throw
    }

    @Test
    public void testFixAccess_thenSet_succeedsOnPrivateField() throws Exception {
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig()
                .with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config);

        PrivateFieldBean bean = new PrivateFieldBean();
        prop.set(bean, "afterFix");

        Field f = PrivateFieldBean.class.getDeclaredField("value");
        f.setAccessible(true);
        assertEquals("afterFix", f.get(bean));
    }

    // =================================================================
    // deserializeAndSet
    // =================================================================

    @Test
    public void testDeserializeAndSet_nullToken_skipNullsTrue_fieldUnchanged() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        // ใช้ NullsConstantProvider.skipper() (public API จริงของ dependency class)
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        SimpleBean bean = new SimpleBean();
        bean.value = "original";

        JsonParser p = new JsonFactory().createParser("null");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, bean);

        assertEquals("Skip-nulls provider should leave the field untouched", "original", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_nullToken_skipNullsFalse_usesNullProvider() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        NullValueProvider nvp = mock(NullValueProvider.class);
        when(nvp.getNullValue(any(DeserializationContext.class))).thenReturn("replacement");
        prop = (FieldProperty) prop.withNullProvider(nvp);

        SimpleBean bean = new SimpleBean();
        bean.value = "original";

        JsonParser p = new JsonFactory().createParser("null");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, bean);

        assertEquals("replacement", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_noTypeDeserializer_normalValue() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("hello");
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        SimpleBean bean = new SimpleBean();
        JsonParser p = new JsonFactory().createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, bean);

        assertEquals("hello", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_noTypeDeserializer_valueNull_skipNullsTrue() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn(null);
        prop = (FieldProperty) prop.withValueDeserializer(deser);
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        SimpleBean bean = new SimpleBean();
        bean.value = "original";
        JsonParser p = new JsonFactory().createParser("\"irrelevant\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, bean);

        assertEquals("original", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_noTypeDeserializer_valueNull_skipNullsFalse() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn(null);
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        NullValueProvider nvp = mock(NullValueProvider.class);
        when(nvp.getNullValue(any(DeserializationContext.class))).thenReturn("fallback");
        prop = (FieldProperty) prop.withNullProvider(nvp);

        SimpleBean bean = new SimpleBean();
        JsonParser p = new JsonFactory().createParser("\"irrelevant\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, bean);

        assertEquals("fallback", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_withTypeDeserializer_usesDeserializeWithType() throws Exception {
        TypeDeserializer typeDeser = mock(TypeDeserializer.class);
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value", typeDeser);

        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        // สมมติฐาน: with* copy-constructor ของ SettableBeanProperty คง _valueTypeDeserializer เดิมไว้
        when(deser.deserializeWithType(any(JsonParser.class), any(DeserializationContext.class), eq(typeDeser)))
                .thenReturn("typed-value");
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        SimpleBean bean = new SimpleBean();
        JsonParser p = new JsonFactory().createParser("\"irrelevant\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        prop.deserializeAndSet(p, ctxt, bean);

        assertEquals("typed-value", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_fieldSetThrows_resultsInIOException() throws Exception {
        // private field, ไม่ได้เรียก fixAccess() -> reflection set ควร fail
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("hello");
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        PrivateFieldBean bean = new PrivateFieldBean();
        JsonParser p = new JsonFactory().createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        try {
            prop.deserializeAndSet(p, ctxt, bean);
            fail("Expected an IOException due to inaccessible field");
        } catch (IOException expected) {
            // ok - exact subtype ขึ้นกับ SettableBeanProperty#_throwAsIOE (ไม่มี source ให้) จึงไม่ยืนยัน type ย่อย
        } finally {
            p.close();
        }
    }

    @Test
    public void testDeserializeAndSet_deserializerThrowsIOException_propagatesUnwrapped() throws Exception {
        // try/catch ใน deserializeAndSet ครอบเฉพาะ _field.set(...) เท่านั้น
        // exception จาก _valueDeserializer.deserialize ควรหลุดออกไปตรง ๆ โดยไม่ถูก wrap
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        IOException boom = new IOException("malformed input");
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class))).thenThrow(boom);
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        SimpleBean bean = new SimpleBean();
        JsonParser p = new JsonFactory().createParser("\"bad\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        try {
            prop.deserializeAndSet(p, ctxt, bean);
            fail("Expected the IOException thrown by the delegate deserializer to propagate");
        } catch (IOException e) {
            assertSame(boom, e);
        } finally {
            p.close();
        }
    }

    // =================================================================
    // deserializeSetAndReturn
    // =================================================================

    @Test
    public void testDeserializeSetAndReturn_nullToken_skipNullsTrue_returnsInstanceUnchanged() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        SimpleBean bean = new SimpleBean();
        bean.value = "original";
        JsonParser p = new JsonFactory().createParser("null");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        Object result = prop.deserializeSetAndReturn(p, ctxt, bean);

        assertSame(bean, result);
        assertEquals("original", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_normalValue_setsAndReturnsInstance() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("hello");
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        SimpleBean bean = new SimpleBean();
        JsonParser p = new JsonFactory().createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        Object result = prop.deserializeSetAndReturn(p, ctxt, bean);

        assertSame(bean, result);
        assertEquals("hello", bean.value);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_fieldSetThrows_resultsInIOException() throws Exception {
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);
        when(deser.deserialize(any(JsonParser.class), any(DeserializationContext.class)))
                .thenReturn("hello");
        prop = (FieldProperty) prop.withValueDeserializer(deser);

        PrivateFieldBean bean = new PrivateFieldBean();
        JsonParser p = new JsonFactory().createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        try {
            prop.deserializeSetAndReturn(p, ctxt, bean);
            fail("Expected an IOException due to inaccessible field");
        } catch (IOException expected) {
            // ok
        } finally {
            p.close();
        }
    }

    // =================================================================
    // set / setAndReturn
    // =================================================================

    @Test
    public void testSet_normal() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        SimpleBean bean = new SimpleBean();
        prop.set(bean, "directValue");
        assertEquals("directValue", bean.value);
    }

    @Test
    public void testSet_fieldThrows_resultsInIOException() {
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        PrivateFieldBean bean = new PrivateFieldBean();
        try {
            prop.set(bean, "x");
            fail("Expected an IOException due to inaccessible field");
        } catch (IOException expected) {
            // ok
        }
    }

    @Test
    public void testSetAndReturn_normal() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        SimpleBean bean = new SimpleBean();
        Object result = prop.setAndReturn(bean, "directValue2");
        assertSame(bean, result);
        assertEquals("directValue2", bean.value);
    }

    @Test
    public void testSetAndReturn_fieldThrows_resultsInIOException() {
        FieldProperty prop = newFieldProperty(PrivateFieldBean.class, "value");
        PrivateFieldBean bean = new PrivateFieldBean();
        try {
            prop.setAndReturn(bean, "x");
            fail("Expected an IOException due to inaccessible field");
        } catch (IOException expected) {
            // ok
        }
    }

    // =================================================================
    // readResolve (JDK serialization)
    // =================================================================

    @Test
    public void testReadResolve_normal_createsNewEquivalentInstance() {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");
        // readResolve() เป็น package-private เรียกตรงได้เพราะอยู่ package เดียวกัน
        Object resolved = prop.readResolve();

        assertNotNull(resolved);
        assertTrue(resolved instanceof FieldProperty);
        assertNotSame(prop, resolved);
        assertEquals(prop.getName(), ((FieldProperty) resolved).getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_missingUnderlyingField_throwsIllegalArgumentException() throws Exception {
        FieldProperty prop = newFieldProperty(SimpleBean.class, "value");

        // บังคับให้ AnnotatedField.getAnnotated() คืน null เพื่อให้เข้า branch "Missing field"
        // ของ copy-constructor ที่ใช้ใน readResolve() — ใช้ reflection หา field ชนิด
        // java.lang.reflect.Field ภายใน AnnotatedField โดยไม่ผูกกับชื่อฟิลด์ที่แน่นอน
        // (เพราะ source ของ AnnotatedField ไม่ได้ให้มา)
        AnnotatedField annotated = (AnnotatedField) prop.getMember();
        boolean nulled = false;
        for (Field f : AnnotatedField.class.getDeclaredFields()) {
            if (f.getType() == Field.class) {
                f.setAccessible(true);
                f.set(annotated, null);
                nulled = true;
                break;
            }
        }
        assertTrue("Could not locate underlying java.lang.reflect.Field in AnnotatedField", nulled);

        prop.readResolve(); // คาดหวัง IllegalArgumentException("Missing field ...")
    }
}
```

# สรุปตาราง Test Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testGetMemberReturnsAnnotatedField | `getMember()` คืนค่า `_annotated` ที่ถูกต้อง |
| testGetAnnotation_annotatedFieldPresent_noAnnotation_returnsNull | `getAnnotation`: `_annotated != null`, ผล annotation = null |
| testGetAnnotation_annotatedFieldPresent_withAnnotation_returnsIt | `getAnnotation`: `_annotated != null`, ผล annotation != null |
| testGetAnnotation_annotatedFieldIsNull_returnsNull | `getAnnotation`: branch `_annotated == null` (บังคับด้วย reflection) |
| testWithName_createsNewInstanceWithNewName | `withName()` สร้าง instance ใหม่ |
| testWithValueDeserializer_sameInstance_returnsThis | `withValueDeserializer`: if-true (`_valueDeserializer == deser`) และ else (ครั้งแรก) |
| testWithValueDeserializer_differentInstance_returnsNewInstance | `withValueDeserializer`: else branch ซ้ำยืนยัน |
| testWithNullProvider_createsNewInstance | `withNullProvider()` สร้าง instance ใหม่ |
| testFixAccess_withOverrideEnabled_doesNotThrow | `fixAccess()` กับ config=true |
| testFixAccess_withOverrideDisabled_doesNotThrowForAlreadyAccessible | `fixAccess()` กับ config=false |
| testFixAccess_thenSet_succeedsOnPrivateField | ผลของ `fixAccess()` ทำให้ `set()` สำเร็จกับ private field |
| testDeserializeAndSet_nullToken_skipNullsTrue_fieldUnchanged | VALUE_NULL token + `_skipNulls==true` → early return |
| testDeserializeAndSet_nullToken_skipNullsFalse_usesNullProvider | VALUE_NULL token + `_skipNulls==false` → ใช้ `_nullProvider` |
| testDeserializeAndSet_noTypeDeserializer_normalValue | `_valueTypeDeserializer==null`, value != null |
| testDeserializeAndSet_noTypeDeserializer_valueNull_skipNullsTrue | `_valueTypeDeserializer==null`, value==null, skipNulls=true |
| testDeserializeAndSet_noTypeDeserializer_valueNull_skipNullsFalse | `_valueTypeDeserializer==null`, value==null, skipNulls=false |
| testDeserializeAndSet_withTypeDeserializer_usesDeserializeWithType | else branch: `_valueTypeDeserializer != null` |
| testDeserializeAndSet_fieldSetThrows_resultsInIOException | try/catch: `_field.set` throws → `_throwAsIOE` |
| testDeserializeAndSet_deserializerThrowsIOException_propagatesUnwrapped | exception จาก deserializer ไม่ถูกครอบ try/catch |
| testDeserializeSetAndReturn_nullToken_skipNullsTrue_returnsInstanceUnchanged | เหมือน deserializeAndSet แต่ return instance |
| testDeserializeSetAndReturn_normalValue_setsAndReturnsInstance | path ปกติ + return instance |
| testDeserializeSetAndReturn_fieldSetThrows_resultsInIOException | exception path ของ `deserializeSetAndReturn` |
| testSet_normal / testSet_fieldThrows_resultsInIOException | try/catch ของ `set()` ทั้งสอง branch |
| testSetAndReturn_normal / testSetAndReturn_fieldThrows_resultsInIOException | try/catch ของ `setAndReturn()` ทั้งสอง branch |
| testReadResolve_normal_createsNewEquivalentInstance | `readResolve()` → constructor ปกติ (`f != null`) |
| testReadResolve_missingUnderlyingField_throwsIllegalArgumentException | `readResolve()` → branch `f == null` throw `IllegalArgumentException` |
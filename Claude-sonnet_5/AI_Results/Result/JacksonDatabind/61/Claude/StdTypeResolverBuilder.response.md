# StdTypeResolverBuilderTest — JUnit 4 Test Suite

## หมายเหตุสำคัญก่อนโค้ด

- คลาสเป้าหมาย (`StdTypeResolverBuilder`) เป็นส่วนหนึ่งของโมดูล `jackson-databind` เอง ดังนั้น dependency ภายใน (เช่น `JavaType`, `MapperConfig`, `ClassNameIdResolver`, `TypeNameIdResolver`, `NamedType`, `TypeIdResolver` ฯลฯ) จะถูก compile มาพร้อมกับ source ของโปรเจกต์ที่ถูกทดสอบอยู่แล้ว (ไม่ใช่ jar ภายนอกที่ระบุในรายการ) — จึงสามารถใช้ `ObjectMapper` จริงเพื่อสร้าง `SerializationConfig`/`DeserializationConfig`/`JavaType` ได้โดยไม่ผิดข้อกำหนด (เราใช้เฉพาะ JUnit4 + Mockito จากรายการ jar สำหรับเครื่องมือทดสอบ)
- Method `idResolver(...)` เป็น `protected` — ใช้ reflection เพื่อเข้าถึงโดยตรง เพื่อ isolate branch coverage ของมันแยกจาก `buildType*` 
- บาง branch (เช่น switch บน `_includeAs == null`) จะทำให้เกิด `NullPointerException` ตาม JLS (ไม่ใช่ `IllegalStateException`) — จึงระบุคอมเมนต์กำกับไว้ว่าเป็น edge-case ที่มาจากพฤติกรรมมาตรฐานของ Java ไม่ใช่การเดา behavior ของ source

```java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class StdTypeResolverBuilderTest {

    private ObjectMapper mapper;
    private SerializationConfig serConfig;
    private DeserializationConfig deserConfig;
    private JavaType baseType;
    private Collection<NamedType> subtypes;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        serConfig = mapper.getSerializationConfig();
        deserConfig = mapper.getDeserializationConfig();
        baseType = mapper.getTypeFactory().constructType(Object.class);
        subtypes = new ArrayList<NamedType>();
    }

    // Helper: เรียก protected idResolver() ผ่าน reflection
    private TypeIdResolver invokeIdResolver(StdTypeResolverBuilder b,
            MapperConfig<?> config, JavaType bt, Collection<NamedType> st,
            boolean forSer, boolean forDeser) throws Exception {
        Method m = StdTypeResolverBuilder.class.getDeclaredMethod(
                "idResolver", MapperConfig.class, JavaType.class,
                Collection.class, boolean.class, boolean.class);
        m.setAccessible(true);
        return (TypeIdResolver) m.invoke(b, config, bt, st, forSer, forDeser);
    }

    // ================== init() ==================

    @Test
    public void testInit_nullIdType_throwsIllegalArgumentException() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        try {
            b.init(null, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInit_validIdType_setsTypePropertyAndReturnsSelf() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        StdTypeResolverBuilder result = b.init(JsonTypeInfo.Id.CLASS, null);
        assertSame(b, result);
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), b.getTypeProperty());
    }

    @Test
    public void testNoTypeInfoBuilder_idTypeNone() {
        StdTypeResolverBuilder b = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNotNull(b);
        assertNull(b.buildTypeSerializer(serConfig, baseType, subtypes));
        assertNull(b.buildTypeDeserializer(deserConfig, baseType, subtypes));
    }

    // ================== inclusion() ==================

    @Test
    public void testInclusion_null_throwsIllegalArgumentException() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        try {
            b.inclusion(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInclusion_validValue_setsAndReturnsSelf() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        StdTypeResolverBuilder result = b.inclusion(JsonTypeInfo.As.PROPERTY);
        assertSame(b, result);
    }

    // ================== typeProperty() ==================

    @Test
    public void testTypeProperty_null_usesIdTypeDefault() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.typeProperty(null);
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), b.getTypeProperty());
    }

    @Test
    public void testTypeProperty_empty_usesIdTypeDefault() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.typeProperty("");
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), b.getTypeProperty());
    }

    @Test
    public void testTypeProperty_customValue_used() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.typeProperty("myType");
        assertEquals("myType", b.getTypeProperty());
    }

    // Edge-case: idType ไม่ถูก init (ยังเป็น null) แล้วเรียก typeProperty(null)
    // -> _idType.getDefaultPropertyName() บน null จะ throw NPE ตามพฤติกรรมมาตรฐานของ Java
    @Test(expected = NullPointerException.class)
    public void testTypeProperty_nullValue_uninitializedIdType_throwsNPE() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        b.typeProperty(null);
    }

    // ================== defaultImpl() / typeIdVisibility() / getters ==================

    @Test
    public void testDefaultImpl_setterGetter() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        assertNull(b.getDefaultImpl());
        StdTypeResolverBuilder result = b.defaultImpl(String.class);
        assertSame(b, result);
        assertEquals(String.class, b.getDefaultImpl());
    }

    @Test
    public void testDefaultImpl_null_allowed() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        b.defaultImpl(null);
        assertNull(b.getDefaultImpl());
    }

    @Test
    public void testTypeIdVisibility_setterGetter() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        assertFalse(b.isTypeIdVisible());
        StdTypeResolverBuilder result = b.typeIdVisibility(true);
        assertSame(b, result);
        assertTrue(b.isTypeIdVisible());
    }

    // ================== buildTypeSerializer() ==================

    @Test
    public void testBuildTypeSerializer_idTypeNone_returnsNull() {
        StdTypeResolverBuilder b = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNull(b.buildTypeSerializer(serConfig, baseType, subtypes));
    }

    @Test
    public void testBuildTypeSerializer_wrapperArray() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.WRAPPER_ARRAY);
        TypeSerializer ts = b.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsArrayTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_property() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeSerializer ts = b.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsPropertyTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_wrapperObject() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.WRAPPER_OBJECT);
        TypeSerializer ts = b.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsWrapperTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_externalProperty() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.EXTERNAL_PROPERTY);
        TypeSerializer ts = b.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsExternalTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_existingProperty() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.EXISTING_PROPERTY);
        TypeSerializer ts = b.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsExistingPropertyTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_idTypeName() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NAME, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeSerializer ts = b.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
    }

    // Edge-case: _includeAs ไม่ถูกตั้งค่า (เป็น null) -> switch(null) ของ Java จะ throw NPE
    // (ไม่ใช่ IllegalStateException ตามที่คอมเมนต์ใน source บอกไว้ว่า "throw IllegalStateException"
    //  เพราะ branch นั้นจะไปไม่ถึงถ้า _includeAs เป็น null)
    @Test(expected = NullPointerException.class)
    public void testBuildTypeSerializer_includeAsNotSet_throwsNPE() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.buildTypeSerializer(serConfig, baseType, subtypes);
    }

    // idResolver() ภายในถูกเรียกก่อน switch -> ถ้า idType=CUSTOM และไม่มี customResolver จะ throw ก่อนถึง switch
    @Test(expected = IllegalStateException.class)
    public void testBuildTypeSerializer_customIdTypeNoResolver_throwsIllegalState() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CUSTOM, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        b.buildTypeSerializer(serConfig, baseType, subtypes);
    }

    // ================== buildTypeDeserializer() ==================

    @Test
    public void testBuildTypeDeserializer_idTypeNone_returnsNull() {
        StdTypeResolverBuilder b = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNull(b.buildTypeDeserializer(deserConfig, baseType, subtypes));
    }

    @Test
    public void testBuildTypeDeserializer_defaultImplNull() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsPropertyTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_defaultImplVoidClass() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        b.defaultImpl(Void.class);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
    }

    @Test
    public void testBuildTypeDeserializer_defaultImplNoClass() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        b.defaultImpl(NoClass.class);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
    }

    @Test
    public void testBuildTypeDeserializer_defaultImplSpecialized() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        b.defaultImpl(ArrayList.class);
        JavaType listBase = mapper.getTypeFactory().constructType(List.class);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, listBase, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsPropertyTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_wrapperArray() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.WRAPPER_ARRAY);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsArrayTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_existingProperty_sameClassAsProperty() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.EXISTING_PROPERTY);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsPropertyTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_wrapperObject() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.WRAPPER_OBJECT);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsWrapperTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_externalProperty() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.inclusion(JsonTypeInfo.As.EXTERNAL_PROPERTY);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsExternalTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_idTypeName() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NAME, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeDeserializer td = b.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
    }

    // Edge-case เช่นเดียวกับ buildTypeSerializer: _includeAs เป็น null -> NPE
    @Test(expected = NullPointerException.class)
    public void testBuildTypeDeserializer_includeAsNotSet_throwsNPE() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        b.buildTypeDeserializer(deserConfig, baseType, subtypes);
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildTypeDeserializer_customIdTypeNoResolver_throwsIllegalState() {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CUSTOM, null);
        b.inclusion(JsonTypeInfo.As.PROPERTY);
        b.buildTypeDeserializer(deserConfig, baseType, subtypes);
    }

    // ================== idResolver() (protected, ผ่าน reflection) ==================

    @Test
    public void testIdResolver_customResolver_takesPriority() throws Exception {
        TypeIdResolver custom = mock(TypeIdResolver.class);
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, custom);
        TypeIdResolver result = invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
        assertSame(custom, result);
    }

    @Test
    public void testIdResolver_classId() throws Exception {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        TypeIdResolver result = invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
        assertTrue(result instanceof ClassNameIdResolver);
    }

    @Test
    public void testIdResolver_minimalClassId() throws Exception {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.MINIMAL_CLASS, null);
        TypeIdResolver result = invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
        assertTrue(result instanceof MinimalClassNameIdResolver);
    }

    @Test
    public void testIdResolver_nameId() throws Exception {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NAME, null);
        TypeIdResolver result = invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
        assertNotNull(result);
        assertTrue(result instanceof TypeNameIdResolver);
    }

    @Test
    public void testIdResolver_noneId_returnsNull() throws Exception {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NONE, null);
        TypeIdResolver result = invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
        assertNull(result);
    }

    @Test
    public void testIdResolver_idTypeNull_throwsIllegalState() throws Exception {
        // ไม่เรียก init() เลย -> _idType เป็น null
        StdTypeResolverBuilder b = new StdTypeResolverBuilder();
        try {
            invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
            fail("Expected IllegalStateException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof IllegalStateException);
        }
    }

    @Test
    public void testIdResolver_customEnum_noResolver_throwsIllegalState() throws Exception {
        StdTypeResolverBuilder b = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CUSTOM, null);
        try {
            invokeIdResolver(b, serConfig, baseType, subtypes, true, false);
            fail("Expected IllegalStateException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof IllegalStateException);
        }
    }
}
```

## ตารางสรุปความครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInit_nullIdType_throwsIllegalArgumentException` | `init()`: `idType == null` → throw |
| `testInit_validIdType_setsTypePropertyAndReturnsSelf` | `init()`: idType ไม่ null → set field, return this |
| `testNoTypeInfoBuilder_idTypeNone` | `noTypeInfoBuilder()` + `_idType==NONE` ใน `buildTypeSerializer`/`buildTypeDeserializer` |
| `testInclusion_null_throwsIllegalArgumentException` | `inclusion()`: `includeAs==null` → throw |
| `testInclusion_validValue_setsAndReturnsSelf` | `inclusion()`: path ปกติ |
| `testTypeProperty_null_usesIdTypeDefault` | `typeProperty()`: `typeIdPropName==null` |
| `testTypeProperty_empty_usesIdTypeDefault` | `typeProperty()`: `typeIdPropName.length()==0` |
| `testTypeProperty_customValue_used` | `typeProperty()`: else branch |
| `testTypeProperty_nullValue_uninitializedIdType_throwsNPE` | edge-case: `_idType` เป็น null (boundary) |
| `testDefaultImpl_setterGetter` / `_null_allowed` | `defaultImpl()` setter/getter, ค่า null |
| `testTypeIdVisibility_setterGetter` | `typeIdVisibility()` setter/getter |
| `testBuildTypeSerializer_idTypeNone_returnsNull` | `buildTypeSerializer()`: `_idType==NONE` |
| `testBuildTypeSerializer_wrapperArray/property/wrapperObject/externalProperty/existingProperty` | switch(`_includeAs`) ทุก case ใน `buildTypeSerializer` |
| `testBuildTypeSerializer_idTypeName` | เรียก `idResolver` ผ่าน public API ด้วย `Id.NAME` |
| `testBuildTypeSerializer_includeAsNotSet_throwsNPE` | edge-case: `_includeAs==null` → NPE (ไม่ใช่ IllegalStateException) |
| `testBuildTypeSerializer_customIdTypeNoResolver_throwsIllegalState` | `idResolver()` CUSTOM branch เรียกผ่าน `buildTypeSerializer` |
| `testBuildTypeDeserializer_idTypeNone_returnsNull` | `buildTypeDeserializer()`: `_idType==NONE` |
| `testBuildTypeDeserializer_defaultImplNull` | `_defaultImpl==null` branch |
| `testBuildTypeDeserializer_defaultImplVoidClass` / `_defaultImplNoClass` | compound condition `_defaultImpl==Void.class \|\| ==NoClass.class` (ทั้งสอง operand) |
| `testBuildTypeDeserializer_defaultImplSpecialized` | else branch: `constructSpecializedType` |
| `testBuildTypeDeserializer_wrapperArray/existingProperty/wrapperObject/externalProperty` | switch(`_includeAs`) ทุก case ใน `buildTypeDeserializer` (รวม fallthrough PROPERTY/EXISTING_PROPERTY) |
| `testBuildTypeDeserializer_idTypeName` | integration กับ `Id.NAME` |
| `testBuildTypeDeserializer_includeAsNotSet_throwsNPE` | edge-case switch(null) |
| `testBuildTypeDeserializer_customIdTypeNoResolver_throwsIllegalState` | `idResolver()` CUSTOM branch ผ่าน `buildTypeDeserializer` |
| `testIdResolver_customResolver_takesPriority` | `idResolver()`: `_customIdResolver != null` |
| `testIdResolver_classId` / `_minimalClassId` / `_nameId` / `_noneId_returnsNull` | switch(`_idType`) ทุก case: CLASS, MINIMAL_CLASS, NAME, NONE |
| `testIdResolver_idTypeNull_throwsIllegalState` | `_idType==null` → throw |
| `testIdResolver_customEnum_noResolver_throwsIllegalState` | `CUSTOM` case (fallthrough ไม่มี return) → throw ที่ท้าย method |

**หมายเหตุ:** บางเทสใช้ reflection เข้าถึง `idResolver()` (protected) เพื่อแยกทดสอบ branch ของมันโดยไม่ผูกกับ `buildTypeSerializer/Deserializer` เท่านั้น และบางเทสจงใจทดสอบผ่าน public API เพื่อยืนยัน integration path ที่ใช้งานจริง
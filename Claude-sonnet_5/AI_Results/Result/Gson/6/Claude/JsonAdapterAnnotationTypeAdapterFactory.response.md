# JUnit 4 Test Suite: JsonAdapterAnnotationTypeAdapterFactoryTest

## การวิเคราะห์ Branch ในซอร์สโค้ด

**`create()`**
1. `annotation == null` → `true` (return null)
2. `annotation == null` → `false` (เรียก getTypeAdapter)

**`getTypeAdapter()`**
1. `TypeAdapter.class.isAssignableFrom(value)` → `true`
2. `TypeAdapterFactory.class.isAssignableFrom(value)` → `true` (else-if)
3. ทั้งสองเป็น `false` → throw `IllegalArgumentException`
4. `typeAdapter.nullSafe()` ถูกเรียกทุก path ที่ไม่ throw

## โค้ดชุดทดสอบ

```java
package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * ต้องอยู่ package เดียวกับ target class (com.google.gson.internal.bind)
 * เพื่อเข้าถึง static method package-private getTypeAdapter() ได้โดยตรง
 */
public class JsonAdapterAnnotationTypeAdapterFactoryTest {

  private ConstructorConstructor constructorConstructor;
  private Gson gson;
  private JsonAdapterAnnotationTypeAdapterFactory factory;

  @Before
  public void setUp() {
    Map<Type, InstanceCreator<?>> instanceCreators = Collections.emptyMap();
    constructorConstructor = new ConstructorConstructor(instanceCreators);
    gson = new Gson();
    factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
  }

  // ---------------------------------------------------------------------
  // Test fixtures
  // ---------------------------------------------------------------------

  /** คลาสที่ไม่มี @JsonAdapter annotation */
  static class PlainClass {
    String value;
  }

  /** TypeAdapter dummy สำหรับทดสอบ branch แรก (isAssignableFrom TypeAdapter.class) */
  static class DummyTypeAdapter extends TypeAdapter<Object> {
    @Override
    public void write(JsonWriter out, Object value) throws IOException {
      out.value("dummy");
    }

    @Override
    public Object read(JsonReader in) throws IOException {
      in.nextString();
      return "dummy";
    }
  }

  @JsonAdapter(DummyTypeAdapter.class)
  static class WithTypeAdapterAnnotation {
  }

  /** TypeAdapterFactory dummy สำหรับทดสอบ branch ที่สอง (isAssignableFrom TypeAdapterFactory.class) */
  static class DummyTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      return (TypeAdapter<T>) new DummyTypeAdapter();
    }
  }

  @JsonAdapter(DummyTypeAdapterFactory.class)
  static class WithTypeAdapterFactoryAnnotation {
  }

  /** คลาสที่ไม่ implement ทั้ง TypeAdapter และ TypeAdapterFactory -> ต้องเข้า else branch */
  static class NotAdapterOrFactory {
  }

  @JsonAdapter(NotAdapterOrFactory.class)
  static class WithInvalidAnnotationValue {
  }

  // ---------------------------------------------------------------------
  // Tests for create()
  // ---------------------------------------------------------------------

  @Test
  public void testCreate_NoAnnotation_ReturnsNull() {
    // Branch: annotation == null -> true
    TypeToken<PlainClass> typeToken = TypeToken.get(PlainClass.class);
    TypeAdapter<PlainClass> result = factory.create(gson, typeToken);
    assertNull("ควรได้ null เมื่อคลาสไม่มี @JsonAdapter", result);
  }

  @Test
  public void testCreate_WithTypeAdapterAnnotation_ReturnsNonNullAdapter() {
    // Branch: annotation == null -> false -> เข้า getTypeAdapter -> if(TypeAdapter) true
    TypeToken<WithTypeAdapterAnnotation> typeToken = TypeToken.get(WithTypeAdapterAnnotation.class);
    TypeAdapter<WithTypeAdapterAnnotation> result = factory.create(gson, typeToken);
    assertNotNull("ควรได้ adapter ที่ไม่ null เมื่อ @JsonAdapter อ้าง TypeAdapter", result);
  }

  @Test
  public void testCreate_WithTypeAdapterFactoryAnnotation_ReturnsNonNullAdapter() {
    // Branch: annotation == null -> false -> เข้า getTypeAdapter -> else if(TypeAdapterFactory) true
    TypeToken<WithTypeAdapterFactoryAnnotation> typeToken =
        TypeToken.get(WithTypeAdapterFactoryAnnotation.class);
    TypeAdapter<WithTypeAdapterFactoryAnnotation> result = factory.create(gson, typeToken);
    assertNotNull("ควรได้ adapter ที่ไม่ null เมื่อ @JsonAdapter อ้าง TypeAdapterFactory", result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreate_WithInvalidAnnotationValue_ThrowsIllegalArgumentException() {
    // Branch: ทั้ง if และ else-if เป็น false -> throw IllegalArgumentException
    TypeToken<WithInvalidAnnotationValue> typeToken =
        TypeToken.get(WithInvalidAnnotationValue.class);
    factory.create(gson, typeToken);
  }

  @Test(expected = NullPointerException.class)
  public void testCreate_NullTargetType_ThrowsNPE() {
    // NOTE: ไม่มี null-check ในซอร์สโค้ด, targetType.getRawType() จะ throw NPE โดยธรรมชาติ
    // (พฤติกรรมนี้อนุมานตรงจาก source ไม่ใช่การเดา)
    factory.create(gson, null);
  }

  // ---------------------------------------------------------------------
  // Tests for static getTypeAdapter() โดยตรง
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypeAdapter_TypeAdapterBranch_ReturnsNonNull() {
    JsonAdapter annotation = WithTypeAdapterAnnotation.class.getAnnotation(JsonAdapter.class);
    TypeToken<?> fieldType = TypeToken.get(WithTypeAdapterAnnotation.class);
    TypeAdapter<?> result = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, fieldType, annotation);
    assertNotNull(result);
  }

  @Test
  public void testGetTypeAdapter_TypeAdapterFactoryBranch_ReturnsNonNull() {
    JsonAdapter annotation = WithTypeAdapterFactoryAnnotation.class.getAnnotation(JsonAdapter.class);
    TypeToken<?> fieldType = TypeToken.get(WithTypeAdapterFactoryAnnotation.class);
    TypeAdapter<?> result = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, fieldType, annotation);
    assertNotNull(result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeAdapter_InvalidValue_ThrowsIllegalArgumentException() {
    JsonAdapter annotation = WithInvalidAnnotationValue.class.getAnnotation(JsonAdapter.class);
    TypeToken<?> fieldType = TypeToken.get(WithInvalidAnnotationValue.class);
    JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, fieldType, annotation);
  }

  @Test(expected = NullPointerException.class)
  public void testGetTypeAdapter_NullAnnotation_ThrowsNPE() {
    // NOTE: annotation.value() จะ throw NPE ทันทีเมื่อ annotation == null
    // (พฤติกรรมโดยธรรมชาติของ null dereference, ไม่ใช่การเดา behavior เพิ่มเติม)
    TypeToken<?> fieldType = TypeToken.get(PlainClass.class);
    JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, fieldType, null);
  }

  // ---------------------------------------------------------------------
  // Tests เพื่อยืนยันว่า nullSafe() ถูกเรียกจริง (functional check)
  // ---------------------------------------------------------------------

  @Test
  public void testCreate_TypeAdapterAnnotation_NullSafeWrite_DoesNotThrow() throws IOException {
    TypeToken<WithTypeAdapterAnnotation> typeToken = TypeToken.get(WithTypeAdapterAnnotation.class);
    TypeAdapter<WithTypeAdapterAnnotation> result = factory.create(gson, typeToken);
    assertNotNull(result);

    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    result.write(writer, null);
    writer.close();

    // nullSafe() ควรเขียนค่า null literal โดยไม่ throw exception
    assertEquals("null", sw.toString());
  }

  @Test
  public void testCreate_TypeAdapterAnnotation_NullSafeRead_ReturnsNull() throws IOException {
    TypeToken<WithTypeAdapterAnnotation> typeToken = TypeToken.get(WithTypeAdapterAnnotation.class);
    TypeAdapter<WithTypeAdapterAnnotation> result = factory.create(gson, typeToken);
    assertNotNull(result);

    JsonReader reader = new JsonReader(new StringReader("null"));
    Object value = result.read(reader);

    assertNull("nullSafe() ควร return null เมื่อ JSON value เป็น null", value);
  }

  @Test
  public void testCreate_TypeAdapterFactoryAnnotation_NullSafeRead_ReturnsNull() throws IOException {
    TypeToken<WithTypeAdapterFactoryAnnotation> typeToken =
        TypeToken.get(WithTypeAdapterFactoryAnnotation.class);
    TypeAdapter<WithTypeAdapterFactoryAnnotation> result = factory.create(gson, typeToken);
    assertNotNull(result);

    JsonReader reader = new JsonReader(new StringReader("null"));
    Object value = result.read(reader);

    assertNull("nullSafe() ควร return null แม้ adapter มาจาก TypeAdapterFactory branch", value);
  }
}
```

## ตารางสรุป Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreate_NoAnnotation_ReturnsNull` | `create()`: `annotation == null` → `true` |
| `testCreate_WithTypeAdapterAnnotation_ReturnsNonNullAdapter` | `create()`: `annotation == null` → `false`; `getTypeAdapter()`: `if (TypeAdapter.class.isAssignableFrom(value))` → `true` |
| `testCreate_WithTypeAdapterFactoryAnnotation_ReturnsNonNullAdapter` | `create()`: `annotation == null` → `false`; `getTypeAdapter()`: `else if (TypeAdapterFactory.class.isAssignableFrom(value))` → `true` |
| `testCreate_WithInvalidAnnotationValue_ThrowsIllegalArgumentException` | `getTypeAdapter()`: ทั้งสอง condition เป็น `false` → `else` throw `IllegalArgumentException` |
| `testCreate_NullTargetType_ThrowsNPE` | Null/edge input: `targetType == null` (NPE จากธรรมชาติของโค้ด, ไม่มี null-check) |
| `testGetTypeAdapter_TypeAdapterBranch_ReturnsNonNull` | ทดสอบ static method ตรง: `if` branch แรก |
| `testGetTypeAdapter_TypeAdapterFactoryBranch_ReturnsNonNull` | ทดสอบ static method ตรง: `else if` branch ที่สอง |
| `testGetTypeAdapter_InvalidValue_ThrowsIllegalArgumentException` | ทดสอบ static method ตรง: `else` branch (throw exception) |
| `testGetTypeAdapter_NullAnnotation_ThrowsNPE` | Null input: `annotation == null` → NPE ที่ `annotation.value()` |
| `testCreate_TypeAdapterAnnotation_NullSafeWrite_DoesNotThrow` | ตรวจสอบว่า `typeAdapter.nullSafe()` มีผลจริงตอน `write(null)` |
| `testCreate_TypeAdapterAnnotation_NullSafeRead_ReturnsNull` | ตรวจสอบว่า `nullSafe()` มีผลจริงตอน `read()` รับ JSON null (TypeAdapter branch) |
| `testCreate_TypeAdapterFactoryAnnotation_NullSafeRead_ReturnsNull` | ตรวจสอบว่า `nullSafe()` มีผลจริงตอน `read()` รับ JSON null (TypeAdapterFactory branch) |

**หมายเหตุ:**
- Test `testCreate_NullTargetType_ThrowsNPE` และ `testGetTypeAdapter_NullAnnotation_ThrowsNPE` เป็นพฤติกรรมที่อนุมานได้ตรงจาก NullPointerException ธรรมชาติของ Java เมื่อ dereference null object ไม่ใช่ behavior ที่เดาเพิ่มเติมจากซอร์สโค้ด
- สมมติว่า `ConstructorConstructor` มี public constructor รับ `Map<Type, InstanceCreator<?>>` ตามที่ import มาในซอร์สโค้ดต้นฉบับ (Gson-6b/2.3) — หากเวอร์ชัน classpath จริงมี constructor signature ต่างออกไป ต้องปรับการสร้าง instance ให้ตรงกัน
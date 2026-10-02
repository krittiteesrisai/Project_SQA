# ReflectiveTypeAdapterFactoryTest.java

หมายเหตุสำคัญ:
- `static boolean excludeField(Field, boolean, Excluder)` เป็น package-private จึงต้องวางไฟล์เทสไว้ใน package เดียวกัน (`com.google.gson.internal.bind`)
- `getFieldNames`, `createBoundField`, `getBoundFields` เป็น `private` จึงทดสอบผ่านพฤติกรรมสาธารณะ (`create()`, `read()`, `write()`) แทนการเรียกตรง
- กรณี `isPrimitive == true && fieldValue == null` ในเมธอด `read()` ของ `BoundField` ไม่ได้ทดสอบ เพราะพฤติกรรมของ built-in numeric TypeAdapter ต่อ JSON null ไม่ได้ระบุไว้ในคลาสเป้าหมายนี้ (ขึ้นกับ TypeAdapter อื่นที่ไม่ได้ให้ซอร์สมา) — ไม่ขอเดา behavior ตามข้อกำหนดที่ 4

```java
package com.google.gson.internal.bind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;

public class ReflectiveTypeAdapterFactoryTest {

  private Gson gson;

  @Before
  public void setUp() {
    gson = new Gson();
  }

  // ---------- helpers ----------

  private ReflectiveTypeAdapterFactory newFactory(FieldNamingStrategy strategy, Excluder excluder) {
    ConstructorConstructor cc =
        new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
    return new ReflectiveTypeAdapterFactory(cc, strategy, excluder);
  }

  private ReflectiveTypeAdapterFactory defaultFactory() {
    return newFactory(FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);
  }

  private static <T> String toJson(TypeAdapter<T> adapter, T value) throws IOException {
    StringWriter sw = new StringWriter();
    JsonWriter writer = new JsonWriter(sw);
    adapter.write(writer, value);
    writer.close();
    return sw.toString();
  }

  private static <T> T fromJson(TypeAdapter<T> adapter, String json) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(json));
    return adapter.read(reader);
  }

  // ---------- model classes ----------

  static class SimplePojo {
    String name;
    int age;
  }

  static class Named {
    String value = "v";
  }

  static class PrefixNamingStrategy implements FieldNamingStrategy {
    @Override public String translateName(Field f) {
      return "pre_" + f.getName();
    }
  }

  static class SerName {
    @SerializedName("custom") String field = "abc";
  }

  static class AltName {
    @SerializedName(value = "main", alternate = {"alt1", "alt2"}) String field;
  }

  static class DupName {
    @SerializedName(value = "dup", alternate = {"dup"}) String field;
  }

  static class Base {
    String baseField = "base";
  }

  static class Derived extends Base {
    String derivedField = "derived";
  }

  static class SelfRef {
    SelfRef self;
    String name = "n";
  }

  static class ExcludeFieldsModel {
    transient String t = "t";
    static String s = "s";
    String normal = "normal";
  }

  static class ExposeSerializeOnly {
    @Expose(serialize = true, deserialize = false) String onlySerialize = "init";
  }

  static class ExposeDeserializeOnly {
    @Expose(serialize = false, deserialize = true) String onlyDeserialize = "init";
  }

  static class NullableString {
    String value = "default";
  }

  interface EmptyInterface {}

  static class EmptyImpl implements EmptyInterface {}

  // ---------- create(): primitive vs object ----------

  @Test
  public void testCreate_PrimitiveType_ReturnsNull() {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<Integer> adapter = factory.create(gson, TypeToken.get(int.class));
    assertNull(adapter); // !Object.class.isAssignableFrom(int.class) == true -> return null
  }

  @Test
  public void testCreate_NonPrimitiveType_ReturnsAdapter() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SimplePojo> adapter = factory.create(gson, TypeToken.get(SimplePojo.class));
    assertTrue(adapter instanceof ReflectiveTypeAdapterFactory.Adapter);
    SimplePojo p = new SimplePojo();
    p.name = "foo";
    p.age = 10;
    String json = toJson(adapter, p);
    assertTrue(json.contains("\"name\":\"foo\""));
    assertTrue(json.contains("\"age\":10"));
  }

  // ---------- excludeField (static & instance) ----------

  @Test
  public void testExcludeField_NormalFieldIncluded() throws NoSuchFieldException {
    Field f = ExcludeFieldsModel.class.getDeclaredField("normal");
    assertTrue(ReflectiveTypeAdapterFactory.excludeField(f, true, Excluder.DEFAULT));
    assertTrue(ReflectiveTypeAdapterFactory.excludeField(f, false, Excluder.DEFAULT));
  }

  @Test
  public void testExcludeField_TransientFieldExcluded() throws NoSuchFieldException {
    Field f = ExcludeFieldsModel.class.getDeclaredField("t");
    assertFalse(ReflectiveTypeAdapterFactory.excludeField(f, true, Excluder.DEFAULT));
    assertFalse(ReflectiveTypeAdapterFactory.excludeField(f, false, Excluder.DEFAULT));
  }

  @Test
  public void testExcludeField_StaticFieldExcluded() throws NoSuchFieldException {
    Field f = ExcludeFieldsModel.class.getDeclaredField("s");
    assertFalse(ReflectiveTypeAdapterFactory.excludeField(f, true, Excluder.DEFAULT));
  }

  @Test
  public void testExcludeField_InstanceMethodDelegatesToStatic() throws NoSuchFieldException {
    Field f = ExcludeFieldsModel.class.getDeclaredField("normal");
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    assertEquals(
        ReflectiveTypeAdapterFactory.excludeField(f, true, Excluder.DEFAULT),
        factory.excludeField(f, true));
  }

  @Test
  public void testExcludedFields_NotSerializedNorDeserialized() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<ExcludeFieldsModel> adapter =
        factory.create(gson, TypeToken.get(ExcludeFieldsModel.class));
    ExcludeFieldsModel obj = new ExcludeFieldsModel();
    obj.normal = "X";
    String json = toJson(adapter, obj);
    assertEquals("{\"normal\":\"X\"}", json); // transient/static ไม่ถูก serialize

    ExcludeFieldsModel result =
        fromJson(adapter, "{\"t\":\"changed\",\"normal\":\"Y\"}");
    assertEquals("t", result.t);      // ไม่ถูกเปลี่ยน เพราะ field==null ใน boundFields -> skipValue
    assertEquals("Y", result.normal);
  }

  // ---------- getFieldNames branches (ผ่าน create()+write/read) ----------

  @Test
  public void testFieldNaming_DefaultPolicyApplied() throws IOException {
    ReflectiveTypeAdapterFactory factory = newFactory(new PrefixNamingStrategy(), Excluder.DEFAULT);
    TypeAdapter<Named> adapter = factory.create(gson, TypeToken.get(Named.class));
    String json = toJson(adapter, new Named());
    assertEquals("{\"pre_value\":\"v\"}", json); // annotation == null -> fieldNamingPolicy.translateName
  }

  @Test
  public void testFieldNaming_SerializedNameOverridesDefault_NoAlternate() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SerName> adapter = factory.create(gson, TypeToken.get(SerName.class));
    String json = toJson(adapter, new SerName());
    assertEquals("{\"custom\":\"abc\"}", json); // alternates.length == 0
  }

  @Test
  public void testFieldNaming_AlternateNames_SerializeUsesOnlyPrimary() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<AltName> adapter = factory.create(gson, TypeToken.get(AltName.class));
    AltName obj = new AltName();
    obj.field = "v1";
    String json = toJson(adapter, obj);
    assertEquals("{\"main\":\"v1\"}", json); // i != 0 -> serialize = false สำหรับ alt1, alt2
  }

  @Test
  public void testFieldNaming_AlternateNames_DeserializeAcceptsAllNames() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<AltName> adapter = factory.create(gson, TypeToken.get(AltName.class));

    assertEquals("from-main", fromJson(adapter, "{\"main\":\"from-main\"}").field);
    assertEquals("from-alt1", fromJson(adapter, "{\"alt1\":\"from-alt1\"}").field);
    assertEquals("from-alt2", fromJson(adapter, "{\"alt2\":\"from-alt2\"}").field);
  }

  @Test
  public void testGetBoundFields_DuplicateNames_ThrowsIllegalArgumentException() {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    try {
      factory.create(gson, TypeToken.get(DupName.class));
      fail("expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // previous != null -> throw
    }
  }

  // ---------- getBoundFields: interface & inheritance ----------

  @Test
  public void testGetBoundFields_Interface_ReturnsEmptyMap_NoThrow() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<EmptyInterface> adapter = factory.create(gson, TypeToken.get(EmptyInterface.class));
    assertTrue(adapter instanceof ReflectiveTypeAdapterFactory.Adapter);
    String json = toJson(adapter, new EmptyImpl());
    assertEquals("{}", json); // raw.isInterface() -> result ว่าง
  }

  @Test
  public void testGetBoundFields_Inheritance_IncludesSuperclassFields() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<Derived> adapter = factory.create(gson, TypeToken.get(Derived.class));

    Derived obj = new Derived();
    String json = toJson(adapter, obj);
    assertTrue(json.contains("\"derivedField\":\"derived\""));
    assertTrue(json.contains("\"baseField\":\"base\""));

    Derived result = fromJson(adapter, "{\"derivedField\":\"D2\",\"baseField\":\"B2\"}");
    assertEquals("D2", result.derivedField);
    assertEquals("B2", result.baseField);
  }

  // ---------- Adapter.read branches ----------

  @Test
  public void testAdapterRead_NullToken_ReturnsNull() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SimplePojo> adapter = factory.create(gson, TypeToken.get(SimplePojo.class));
    SimplePojo result = fromJson(adapter, "null");
    assertNull(result); // in.peek() == JsonToken.NULL
  }

  @Test
  public void testAdapterRead_UnknownField_SkipsValue() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SimplePojo> adapter = factory.create(gson, TypeToken.get(SimplePojo.class));
    SimplePojo result = fromJson(adapter, "{\"unknown\":\"x\",\"name\":\"foo\",\"age\":5}");
    assertEquals("foo", result.name);
    assertEquals(5, result.age); // field == null -> in.skipValue() ไม่ทำให้ parse ล้ม
  }

  @Test(expected = JsonSyntaxException.class)
  public void testAdapterRead_MalformedInput_ThrowsJsonSyntaxException() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SimplePojo> adapter = factory.create(gson, TypeToken.get(SimplePojo.class));
    fromJson(adapter, "[]"); // in.beginObject() -> IllegalStateException -> wrapped
  }

  @Test
  public void testAdapterRead_NullableField_IsPrimitiveFalse_SetsNull() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<NullableString> adapter = factory.create(gson, TypeToken.get(NullableString.class));
    NullableString result = fromJson(adapter, "{\"value\":null}");
    assertNull(result.value); // fieldValue == null but !isPrimitive -> field.set ยังถูกเรียก
  }

  // ---------- field.deserialized == false branch (Expose) ----------

  @Test
  public void testExposeSerializeOnly_WriteIncludesField_ReadSkipsField() throws IOException {
    Excluder excluder = Excluder.DEFAULT.excludeFieldsWithoutExposeAnnotation();
    ReflectiveTypeAdapterFactory factory = newFactory(FieldNamingPolicy.IDENTITY, excluder);
    TypeAdapter<ExposeSerializeOnly> adapter =
        factory.create(gson, TypeToken.get(ExposeSerializeOnly.class));

    ExposeSerializeOnly obj = new ExposeSerializeOnly();
    obj.onlySerialize = "hello";
    String json = toJson(adapter, obj);
    assertEquals("{\"onlySerialize\":\"hello\"}", json); // serialized == true -> writeField true

    ExposeSerializeOnly result = fromJson(adapter, "{\"onlySerialize\":\"changed\"}");
    assertEquals("init", result.onlySerialize); // field != null แต่ !field.deserialized -> skipValue
  }

  @Test
  public void testExposeDeserializeOnly_WriteExcludesField_ReadIncludesField() throws IOException {
    Excluder excluder = Excluder.DEFAULT.excludeFieldsWithoutExposeAnnotation();
    ReflectiveTypeAdapterFactory factory = newFactory(FieldNamingPolicy.IDENTITY, excluder);
    TypeAdapter<ExposeDeserializeOnly> adapter =
        factory.create(gson, TypeToken.get(ExposeDeserializeOnly.class));

    ExposeDeserializeOnly obj = new ExposeDeserializeOnly();
    obj.onlyDeserialize = "hello";
    String json = toJson(adapter, obj);
    assertEquals("{}", json); // writeField: !serialized -> return false ก่อนอ่านค่า

    ExposeDeserializeOnly result = fromJson(adapter, "{\"onlyDeserialize\":\"changed\"}");
    assertEquals("changed", result.onlyDeserialize); // deserialized == true -> field.read ถูกเรียก
  }

  // ---------- Adapter.write branches ----------

  @Test
  public void testAdapterWrite_NullValue_WritesJsonNull() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SimplePojo> adapter = factory.create(gson, TypeToken.get(SimplePojo.class));
    String json = toJson(adapter, null);
    assertEquals("null", json); // value == null -> out.nullValue()
  }

  @Test
  public void testAdapterWrite_SelfReferencingField_AvoidsRecursion() throws IOException {
    ReflectiveTypeAdapterFactory factory = defaultFactory();
    TypeAdapter<SelfRef> adapter = factory.create(gson, TypeToken.get(SelfRef.class));

    SelfRef obj = new SelfRef();
    obj.self = obj; // fieldValue == value

    String json = toJson(adapter, obj);
    assertTrue(json.contains("\"name\":\"n\""));
    assertFalse(json.contains("\"self\"")); // writeField: fieldValue != value -> false -> ข้าม field
  }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testCreate_PrimitiveType_ReturnsNull | `create()`: `!Object.class.isAssignableFrom(raw)` == true → return null |
| testCreate_NonPrimitiveType_ReturnsAdapter | `create()`: เงื่อนไขข้างบน == false → สร้าง Adapter ปกติ |
| testExcludeField_NormalFieldIncluded | `excludeField(static)`: ทั้งสองเงื่อนไข (`!excludeClass`, `!excludeField`) เป็น true |
| testExcludeField_TransientFieldExcluded | `excludeField(static)`: `excluder.excludeField` == true → ผลลัพธ์ false (ทั้ง serialize/deserialize) |
| testExcludeField_StaticFieldExcluded | เหมือนด้านบนแต่กรณี static modifier |
| testExcludeField_InstanceMethodDelegatesToStatic | instance `excludeField(f,serialize)` เรียก static ถูกต้อง |
| testExcludedFields_NotSerializedNorDeserialized | `getBoundFields`: `if (!serialize && !deserialize) continue;` == true; `read()`: field==null → skipValue |
| testFieldNaming_DefaultPolicyApplied | `getFieldNames`: `annotation == null` branch |
| testFieldNaming_SerializedNameOverridesDefault_NoAlternate | `getFieldNames`: `annotation != null`, `alternates.length == 0` |
| testFieldNaming_AlternateNames_SerializeUsesOnlyPrimary | `getBoundFields`: loop `for i` กับ `if (i != 0) serialize=false` (true branch) |
| testFieldNaming_AlternateNames_DeserializeAcceptsAllNames | boundFields map มีทุกชื่อ alternate สำหรับ deserialize |
| testGetBoundFields_DuplicateNames_ThrowsIllegalArgumentException | `if (previous != null) throw ...` |
| testGetBoundFields_Interface_ReturnsEmptyMap_NoThrow | `if (raw.isInterface()) return result;` |
| testGetBoundFields_Inheritance_IncludesSuperclassFields | `while (raw != Object.class)` loop วนหลายรอบ (superclass traversal) |
| testAdapterRead_NullToken_ReturnsNull | `Adapter.read()`: `in.peek() == JsonToken.NULL` == true |
| testAdapterRead_UnknownField_SkipsValue | `Adapter.read()`: `field == null` → skipValue |
| testAdapterRead_MalformedInput_ThrowsJsonSyntaxException | `catch (IllegalStateException e) → JsonSyntaxException` |
| testAdapterRead_NullableField_IsPrimitiveFalse_SetsNull | `BoundField.read()`: `fieldValue != null || !isPrimitive` (กรณี `!isPrimitive` true) |
| testExposeSerializeOnly_WriteIncludesField_ReadSkipsField | `Adapter.read()`: `field != null` แต่ `!field.deserialized` → skipValue; `writeField`: serialized==true |
| testExposeDeserializeOnly_WriteExcludesField_ReadIncludesField | `writeField`: `if (!serialized) return false;`; `read()`: deserialized==true |
| testAdapterWrite_NullValue_WritesJsonNull | `Adapter.write()`: `value == null` → nullValue |
| testAdapterWrite_SelfReferencingField_AvoidsRecursion | `writeField`: `fieldValue != value` == false → return false (ป้องกัน recursion) |

**หมายเหตุ**: ไม่ได้ทดสอบกรณี `IllegalAccessException` ถูก wrap เป็น `AssertionError` เนื่องจากต้องใช้ SecurityManager หรือเงื่อนไขพิเศษที่ไม่สามารถจำลองได้อย่างปลอดภัยในบริบทนี้ และไม่ได้ทดสอบ `isPrimitive==true && fieldValue==null` ตามที่ระบุไว้ด้านบน เพราะพฤติกรรมขึ้นกับ TypeAdapter ภายนอกที่ไม่ได้ให้ซอร์สมา
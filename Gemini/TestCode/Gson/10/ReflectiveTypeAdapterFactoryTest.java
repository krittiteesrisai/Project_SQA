package com.google.gson.internal.bind;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
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
import java.util.Collections;

import static org.junit.Assert.*;

public class ReflectiveTypeAdapterFactoryTest {

    private ReflectiveTypeAdapterFactory factory;
    private Gson gson;

    @Before
    public void setUp() {
        gson = new Gson();
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(Collections.emptyMap());
        factory = new ReflectiveTypeAdapterFactory(
                constructorConstructor,
                FieldNamingPolicy.IDENTITY,
                Excluder.DEFAULT
        );
    }

    // --- Mock Classes สำหรับทดสอบ Edge Cases ---
    private interface DummyInterface {
        int getId();
    }

    private static class SimpleClass {
        String name = "test";
        int value = 42;
    }

    private static class AlternateNameClass {
        @SerializedName(value = "primaryName", alternate = {"alt1", "alt2"})
        String data;
    }

    private static class DuplicateAlternateClass {
        @SerializedName(value = "name", alternate = {"name"})
        String name1;
        String name = "conflict";
    }

    private static class PrimitiveTarget {
        int primitiveInt;
    }

    private static class RecursiveClass {
        @SuppressWarnings("unused")
        RecursiveClass self = this;
    }

    private static class CustomAdapterAnnotatedClass {
        @JsonAdapter(CustomStringAdapter.class)
        String customField;
    }

    public static class CustomStringAdapter extends TypeAdapter<String> {
        @Override
        public void write(JsonWriter out, String value) throws IOException {
            out.value("CUSTOM_" + value);
        }
        @Override
        public String read(JsonReader in) throws IOException {
            return "READ_" + in.nextString();
        }
    }

    // --- Test Cases ---

    @Test
    public void testCreateWithPrimitiveTypeShouldReturnNull() {
        TypeAdapter<Integer> adapter = factory.create(gson, TypeToken.get(int.class));
        assertNull("Primitive type should return null adapter", adapter);
    }

    @Test
    public void testCreateWithInterfaceShouldReturnEmptyBoundFields() {
        TypeAdapter<DummyInterface> adapter = factory.create(gson, TypeToken.get(DummyInterface.class));
        assertNotNull("Interface should still return an adapter instance", adapter);
    }

    @Test
    public void testSerializeAndDeserializeSimpleClass() throws IOException {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
        assertNotNull(adapter);

        SimpleClass obj = new SimpleClass();
        obj.name = "hello";
        obj.value = 100;

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, obj);

        String json = writer.toString();
        assertTrue(json.contains("hello"));
        assertTrue(json.contains("100"));

        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleClass parsed = adapter.read(reader);
        assertNotNull(parsed);
        assertEquals("hello", parsed.name);
        assertEquals(100, parsed.value);
    }

    @Test
    public void testDeserializeNullObject() throws IOException {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
        JsonReader reader = new JsonReader(new StringReader("null"));
        SimpleClass parsed = adapter.read(reader);
        assertNull("Reading null token should return null instance", parsed);
    }

    @Test
    public void testSerializeNullObject() throws IOException {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, null);
        assertEquals("null", writer.toString());
    }

    @Test
    public void testSerializedNameWithAlternates() throws IOException {
        TypeAdapter<AlternateNameClass> adapter = factory.create(gson, TypeToken.get(AlternateNameClass.class));
        assertNotNull(adapter);

        // ทดสอบการอ่านจากชื่อ Alternate ตัวแรก (alt1)
        JsonReader reader1 = new JsonReader(new StringReader("{\"alt1\":\"worked\"}"));
        AlternateNameClass obj1 = adapter.read(reader1);
        assertEquals("worked", obj1.data);

        // ทดสอบการอ่านจากชื่อ Alternate ตัวที่สอง (alt2)
        JsonReader reader2 = new JsonReader(new StringReader("{\"alt2\":\"worked2\"}"));
        AlternateNameClass obj2 = adapter.read(reader2);
        assertEquals("worked2", obj2.data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateFieldNamesShouldThrowException() {
        factory.create(gson, TypeToken.get(DuplicateAlternateClass.class));
    }

    @Test
    public void testPrimitiveFieldSetNullShouldNotThrowOrOverwriteIfPrimitive() throws IOException {
        TypeAdapter<PrimitiveTarget> adapter = factory.create(gson, TypeToken.get(PrimitiveTarget.class));
        JsonReader reader = new JsonReader(new StringReader("{\"primitiveInt\": null}"));
        PrimitiveTarget target = adapter.read(reader);
        // สำหรับ primitive, ถ้าเจอค่า null ใน json จะไม่ทับค่าเดิมที่เป็น 0
        assertEquals(0, target.primitiveInt);
    }

    @Test
    public void testRecursiveFieldWritingExclusion() throws IOException {
        TypeAdapter<RecursiveClass> adapter = factory.create(gson, TypeToken.get(RecursiveClass.class));
        RecursiveClass obj = new RecursiveClass();
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        // ป้องกัน infinite recursion / self reference โดย field.get(value) == value
        adapter.write(jsonWriter, obj);
        assertEquals("{}", writer.toString());
    }

    @Test
    public void testJsonAdapterAnnotationOnField() throws IOException {
        TypeAdapter<CustomAdapterAnnotatedClass> adapter = factory.create(gson, TypeToken.get(CustomAdapterAnnotatedClass.class));
        assertNotNull(adapter);

        CustomAdapterAnnotatedClass obj = new CustomAdapterAnnotatedClass();
        obj.customField = "val";

        StringWriter writer = new StringWriter();
        adapter.write(new JsonWriter(writer), obj);
        assertTrue(writer.toString().contains("CUSTOM_val"));

        JsonReader reader = new JsonReader(new StringReader("{\"customField\":\"val\"}"));
        CustomAdapterAnnotatedClass parsed = adapter.read(reader);
        assertEquals("READ_val", parsed.customField);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testAdapterReadInvalidJsonSyntaxThrowsException() throws IOException {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
        // ส่ง JSON ผิดรูปแบบเพื่อให้เกิด IllegalStateException ใน JsonReader แล้วแปลงเป็น JsonSyntaxException
        JsonReader reader = new JsonReader(new StringReader("INVALID_JSON"));
        adapter.read(reader);
    }

    @Test
    public void testUnknownFieldInJsonIsSkipped() throws IOException {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
        JsonReader reader = new JsonReader(new StringReader("{\"unknownKey\":\"someValue\", \"name\":\"validName\"}"));
        SimpleClass obj = adapter.read(reader);
        assertEquals("validName", obj.name);
    }

    @Test
    public void testExcludeFieldDirectly() throws NoSuchFieldException {
        Field field = SimpleClass.class.getDeclaredField("name");
        boolean excludedSerialize = ReflectiveTypeAdapterFactory.excludeField(field, true, Excluder.DEFAULT);
        assertTrue("Standard field should be included for serialization", excludedSerialize);
    }
}
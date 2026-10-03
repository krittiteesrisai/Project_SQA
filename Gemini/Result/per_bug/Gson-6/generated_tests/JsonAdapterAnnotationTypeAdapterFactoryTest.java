package com.google.gson.internal.bind;

import com.google.gson.Gson;
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
import java.util.Collections;

import static org.junit.Assert.*;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

    ConstructorConstructor constructorConstructor;
    JsonAdapterAnnotationTypeAdapterFactory factory;
    Gson gson;

    @Before
    public void setUp() {
        constructorConstructor = new ConstructorConstructor(Collections.emptyMap());
        factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        gson = new Gson();
    }

    // --- Dummy Classes for Testing ---

    private static class PlainClass {
    }

    @JsonAdapter(ValidTypeAdapter.class)
    private static class AnnotatedWithTypeAdapter {
    }

    @JsonAdapter(ValidTypeAdapterFactory.class)
    private static class AnnotatedWithTypeAdapterFactory {
    }

    @JsonAdapter(InvalidValueClass.class)
    private static class AnnotatedWithInvalidClass {
    }

    private static class ValidTypeAdapter extends TypeAdapter<Object> {
        @Override
        public void write(JsonWriter out, Object value) throws IOException {
            out.nullValue();
        }

        @Override
        public Object read(JsonReader in) throws IOException {
            in.skipValue();
            return null;
        }
    }

    private static class ValidTypeAdapterFactory implements TypeAdapterFactory {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            return new ValidTypeAdapter();
        }
    }

    private static class InvalidValueClass {
    }

    // --- Test Cases ---

    @Test
    public void testCreate_NullAnnotation() {
        // Test Branch: annotation == null -> returns null
        TypeToken<PlainClass> typeToken = TypeToken.get(PlainClass.class);
        TypeAdapter<PlainClass> adapter = factory.create(gson, typeToken);
        assertNull(adapter);
    }

    @Test
    public void testCreate_WithTypeAdapterAnnotation() {
        // Test Branch: annotation != null && TypeAdapter.class.isAssignableFrom(value)
        TypeToken<AnnotatedWithTypeAdapter> typeToken = TypeToken.get(AnnotatedWithTypeAdapter.class);
        TypeAdapter<AnnotatedWithTypeAdapter> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    public void testCreate_WithTypeAdapterFactoryAnnotation() {
        // Test Branch: annotation != null && TypeAdapterFactory.class.isAssignableFrom(value)
        TypeToken<AnnotatedWithTypeAdapterFactory> typeToken = TypeToken.get(AnnotatedWithTypeAdapterFactory.class);
        TypeAdapter<AnnotatedWithTypeAdapterFactory> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTypeAdapter_InvalidAnnotationValue() {
        // Test Branch: Else -> throws IllegalArgumentException
        TypeToken<AnnotatedWithInvalidClass> typeToken = TypeToken.get(AnnotatedWithInvalidClass.class);
        factory.create(gson, typeToken);
    }

    @Test
    public void testGetTypeAdapter_DirectStaticCall() {
        // Direct test of static helper method getTypeAdapter with TypeAdapter
        JsonAdapter annotation = AnnotatedWithTypeAdapter.class.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                constructorConstructor, gson, TypeToken.get(AnnotatedWithTypeAdapter.class), annotation
        );
        assertNotNull(adapter);
    }

    @Test
    public void testGetTypeAdapter_DirectStaticCallFactory() {
        // Direct test of static helper method getTypeAdapter with TypeAdapterFactory
        JsonAdapter annotation = AnnotatedWithTypeAdapterFactory.class.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
                constructorConstructor, gson, TypeToken.get(AnnotatedWithTypeAdapterFactory.class), annotation
        );
        assertNotNull(adapter);
    }
}
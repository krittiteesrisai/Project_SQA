package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ClassNameIdResolverTest {

    private TypeFactory typeFactory;
    private JavaType baseType;
    private ObjectMapper objectMapper;
    private ClassNameIdResolver resolver;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        typeFactory = objectMapper.getTypeFactory();
        baseType = typeFactory.constructType(Object.class);
        resolver = new ClassNameIdResolver(baseType, typeFactory);
    }

    @Test
    public void testGetMechanism() {
        assertEquals(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, resolver.getMechanism());
    }

    @Test
    public void testGetDescForKnownTypeIds() {
        assertEquals("class name used as type id", resolver.getDescForKnownTypeIds());
    }

    @Test
    public void testRegisterSubtypeDoesNothing() {
        // Method is a no-op, just ensuring it executes without error
        resolver.registerSubtype(String.class, "string");
    }

    @Test
    public void testIdFromValueBasic() {
        String id = resolver.idFromValue("TestString");
        assertEquals(String.class.getName(), id);
    }

    @Test
    public void testIdFromValueAndType() {
        String id = resolver.idFromValueAndType(123, Integer.class);
        assertEquals(Integer.class.getName(), id);
    }

    @Test
    public void testTypeFromIdGenericCanonical() throws Exception {
        DatabindContext context = objectMapper.getDeserializationContext();
        String canonicalId = "java.util.List<java.lang.String>";
        JavaType type = resolver.typeFromId(context, canonicalId);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testTypeFromIdStandardClass() throws Exception {
        DatabindContext context = objectMapper.getDeserializationContext();
        JavaType type = resolver.typeFromId(context, "java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testTypeFromIdClassNotFoundWithDeserializationContext() throws Exception {
        DeserializationContext context = mock(DeserializationContext.class);
        JavaType expectedType = typeFactory.constructType(String.class);
        when(context.handleUnknownTypeId(eq(baseType), eq("com.nonexistent.Class"), eq(resolver), anyString()))
                .thenReturn(expectedType);

        JavaType type = resolver._typeFromId("com.nonexistent.Class", context);
        assertEquals(expectedType, type);
    }

    @Test
    public void testTypeFromIdClassNotFoundWithNonDeserializationContext() throws Exception {
        DatabindContext context = mock(DatabindContext.class); // Not DeserializationContext
        JavaType type = resolver._typeFromId("com.nonexistent.Class", context);
        assertNull(type);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromIdInvalidTypeThrowsException() throws Exception {
        DatabindContext context = objectMapper.getDeserializationContext();
        // Passing something structurally invalid to trigger general exception in findClass
        resolver.typeFromId(context, "[invalid-class-name]");
    }

    @Test
    public void testIdFromValueEnumSubclass() {
        // Create an anonymous subclass of an enum to trigger !cls.isEnum() and Enum.class.isAssignableFrom(cls)
        Enum<?> anonymousEnum = new Enum<Thread.State>("CUSTOM_STATE", 0) {
            // Anonymous subclass body
        };
        String id = resolver.idFromValue(anonymousEnum);
        assertEquals(Thread.State.class.getName(), id);
    }

    @Test
    public void testIdFromValueEnumSet() {
        EnumSet<Thread.State> enumSet = EnumSet.noneOf(Thread.State.class);
        String id = resolver.idFromValue(enumSet);
        assertTrue(id.contains("EnumSet"));
    }

    @Test
    public void testIdFromValueEnumMap() {
        EnumMap<Thread.State, String> enumMap = new EnumMap<>(Thread.State.class);
        String id = resolver.idFromValue(enumMap);
        assertTrue(id.contains("EnumMap"));
    }

    @Test
    public void testIdFromValueArraysAsList() {
        List<String> list = Arrays.asList("a", "b");
        String id = resolver.idFromValue(list);
        // Arrays.asList returns java.util.Arrays$ArrayList which should map to java.util.ArrayList
        assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void testIdFromValueInnerClassWithStaticBase() {
        // Inner class scenario
        JavaType innerBaseType = typeFactory.constructType(OuterClass.InnerClass.class);
        ClassNameIdResolver innerResolver = new ClassNameIdResolver(innerBaseType, typeFactory);

        OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();
        String id = innerResolver.idFromValue(innerObj);
        // Since baseType outer is null, it should generalize to baseType raw class
        assertEquals(OuterClass.InnerClass.class.getName(), id);
    }

    // Helper classes for inner class tests
    public static class OuterClass {
        public class InnerClass {
        }
    }
}
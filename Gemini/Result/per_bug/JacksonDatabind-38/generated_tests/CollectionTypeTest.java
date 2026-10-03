package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionTypeTest {

    private JavaType createMockElementType() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        return SimpleType.constructUnsafe(String.class);
    }

    @Test
    public void testConstructWithBindings() {
        JavaType elemT = createMockElementType();
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] superInts = new JavaType[0];

        CollectionType type = CollectionType.construct(List.class, bindings, superClass, superInts, elemT);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(elemT, type.getContentType());
    }

    @Test
    public void testConstructDeprecated() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(elemT, type.getContentType());
    }

    @Test
    public void testNarrow() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        JavaType narrowed = type._narrow(ArrayList.class);
        
        assertNotNull(narrowed);
        assertEquals(ArrayList.class, narrowed.getRawClass());
        assertTrue(narrowed instanceof CollectionType);
    }

    @Test
    public void testWithContentType_SameInstance() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        
        // Branch: _elementType == contentType
        JavaType result = type.withContentType(elemT);
        assertSame(type, result);
    }

    @Test
    public void testWithContentType_DifferentInstance() {
        JavaType elemT1 = createMockElementType();
        JavaType elemT2 = SimpleType.constructUnsafe(Integer.class);
        CollectionType type = CollectionType.construct(List.class, elemT1);
        
        // Branch: _elementType != contentType
        JavaType result = type.withContentType(elemT2);
        assertNotSame(type, result);
        assertEquals(Integer.class, result.getContentType().getRawClass());
    }

    @Test
    public void testWithTypeHandler() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        Object handler = new Object();
        
        CollectionType result = type.withTypeHandler(handler);
        assertNotNull(result);
        assertEquals(handler, result.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        Object handler = new Object();
        
        CollectionType result = type.withContentTypeHandler(handler);
        assertNotNull(result);
        assertEquals(handler, result.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        Object handler = new Object();
        
        CollectionType result = type.withValueHandler(handler);
        assertNotNull(result);
        assertEquals(handler, result.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        Object handler = new Object();
        
        CollectionType result = type.withContentValueHandler(handler);
        assertNotNull(result);
        assertEquals(handler, result.getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_FalseToTrue() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        
        assertFalse(type.useStaticType());
        JavaType result = type.withStaticTyping();
        assertTrue(result.useStaticType());
        assertNotSame(type, result);
    }

    @Test
    public void testWithStaticTyping_AlreadyTrue() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        
        JavaType staticType1 = type.withStaticTyping();
        JavaType staticType2 = staticType1.withStaticTyping();
        
        // Branch: _asStatic is true -> returns this
        assertSame(staticType1, staticType2);
    }

    @Test
    public void testRefine() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] superInts = new JavaType[0];

        JavaType refined = type.refine(ArrayList.class, bindings, superClass, superInts);
        assertNotNull(refined);
        assertEquals(ArrayList.class, refined.getRawClass());
        assertEquals(elemT, refined.getContentType());
    }

    @Test
    public void testToString() {
        JavaType elemT = createMockElementType();
        CollectionType type = CollectionType.construct(List.class, elemT);
        String str = type.toString();
        
        assertNotNull(str);
        assertTrue(str.contains("java.util.List"));
        assertTrue(str.contains("collection type"));
    }
}
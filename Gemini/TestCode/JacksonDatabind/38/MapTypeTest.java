package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class MapTypeTest {

    private TypeFactory typeFactory;
    private JavaType keyType;
    private JavaType valueType;
    private MapType mapType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        keyType = typeFactory.constructType(String.class);
        valueType = typeFactory.constructType(Integer.class);
        mapType = MapType.construct(Map.class, null, null, null, keyType, valueType);
    }

    @Test
    public void testConstructAndToString() {
        assertNotNull(mapType);
        assertEquals(Map.class, mapType.getRawClass());
        assertEquals(keyType, mapType.getKeyType());
        assertEquals(valueType, mapType.getContentType());
        
        String str = mapType.toString();
        assertNotNull(str);
        assertTrue(str.contains("map type"));
        assertTrue(str.contains("java.util.Map"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstruct() {
        MapType deprecatedMap = MapType.construct(Map.class, keyType, valueType);
        assertNotNull(deprecatedMap);
        assertEquals(Map.class, deprecatedMap.getRawClass());
        assertEquals(keyType, deprecatedMap.getKeyType());
        assertEquals(valueType, deprecatedMap.getContentType());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testNarrow() {
        JavaType narrowed = mapType._narrow(java.util.HashMap.class);
        assertNotNull(narrowed);
        assertTrue(narrowed instanceof MapType);
        assertEquals(java.util.HashMap.class, narrowed.getRawClass());
    }

    @Test
    public void testWithHandlers() {
        Object handler = new Object();
        
        MapType withTypeH = mapType.withTypeHandler(handler);
        assertEquals(handler, withTypeH.getTypeHandler());

        MapType withContentH = mapType.withContentTypeHandler(handler);
        assertNotNull(withContentH);

        MapType withValueH = mapType.withValueHandler(handler);
        assertEquals(handler, withValueH.getValueHandler());

        MapType withContentValH = mapType.withContentValueHandler(handler);
        assertNotNull(withContentValH);

        MapType withKeyTypeH = mapType.withKeyTypeHandler(handler);
        assertNotNull(withKeyTypeH);

        MapType withKeyValH = mapType.withKeyValueHandler(handler);
        assertNotNull(withKeyValH);
    }

    @Test
    public void testWithStaticTypingBranches() {
        // Branch 1: _asStatic is false -> becomes true
        MapType staticMap = (MapType) mapType.withStaticTyping();
        assertTrue(staticMap.useStaticType());

        // Branch 2: _asStatic is already true -> returns 'this'
        MapType staticMapAgain = (MapType) staticMap.withStaticTyping();
        assertSame(staticMap, staticMapAgain);
    }

    @Test
    public void testWithContentTypeBranches() {
        // Branch 1: contentType equals _valueType (same reference)
        JavaType sameContent = mapType.getContentType();
        JavaType resultSame = mapType.withContentType(sameContent);
        assertSame(mapType, resultSame);

        // Branch 2: contentType differs
        JavaType newContent = typeFactory.constructType(String.class);
        JavaType resultDiff = mapType.withContentType(newContent);
        assertNotSame(mapType, resultDiff);
        assertEquals(newContent, resultDiff.getContentType());
    }

    @Test
    public void testWithKeyTypeBranches() {
        // Branch 1: keyType equals _keyType (same reference)
        JavaType sameKey = mapType.getKeyType();
        MapType resultSame = mapType.withKeyType(sameKey);
        assertSame(mapType, resultSame);

        // Branch 2: keyType differs
        JavaType newKey = typeFactory.constructType(Integer.class);
        MapType resultDiff = mapType.withKeyType(newKey);
        assertNotSame(mapType, resultDiff);
        assertEquals(newKey, resultDiff.getKeyType());
    }

    @Test
    public void testRefine() {
        JavaType[] interfaces = new JavaType[0];
        JavaType refined = mapType.refine(java.util.LinkedHashMap.class, mapType.getBindings(), mapType.getSuperClass(), interfaces);
        assertNotNull(refined);
        assertTrue(refined instanceof MapType);
        assertEquals(java.util.LinkedHashMap.class, refined.getRawClass());
    }
}
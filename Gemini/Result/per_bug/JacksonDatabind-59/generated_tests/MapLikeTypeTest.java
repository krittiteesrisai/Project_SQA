package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapLikeTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType intType;
    private MapLikeType mapLikeType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        intType = typeFactory.constructType(Integer.class);
        
        // สร้าง MapLikeType พื้นฐานสำหรับการทดสอบ
        mapLikeType = MapLikeType.construct(HashMap.class, stringType, intType);
    }

    @Test
    public void testUpgradeFrom_ValidTypeBase() {
        JavaType baseType = typeFactory.constructType(HashMap.class);
        MapLikeType upgraded = MapLikeType.upgradeFrom(baseType, stringType, intType);
        assertNotNull(upgraded);
        assertEquals(HashMap.class, upgraded.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_InvalidNonTypeBase() {
        // ใช้ Object.class ซึ่ง TypeFactory มักสร้าง SimpleType แต่เพื่อให้หลุดจาก TypeBase หรือจำลองเคสไม่ตรง
        // ในที่นี้เราสามารถส่งคลาสที่ไม่สืบทอด TypeBase หากทำได้ หรือใช้ Mock/Anonymous JavaType ที่ไม่ใช่ TypeBase
        JavaType invalidBase = new JavaType(Object.class, 0, null, null, false) {
            @Override
            protected JavaType _narrow(Class<?> subclass) { return this; }
            @Override
            public JavaType withContentType(JavaType contentType) { return this; }
            @Override
            public JavaType withTyping(TypeBindings bindings) { return this; }
            @Override
            public JavaType withValueHandler(Object h) { return this; }
            @Override
            public JavaType withTypeHandler(Object h) { return this; }
            @Override
            public boolean isContainerType() { return false; }
            @Override
            public String getErasedSignature(StringBuilder sb) { return sb; }
            @Override
            public String getGenericSignature(StringBuilder sb) { return sb; }
            @Override
            public MapLikeType withContentTypeHandler(Object h) { return this; }
            @Override
            public MapLikeType withContentValueHandler(Object h) { return this; }
        };
        
        MapLikeType.upgradeFrom(invalidBase, stringType, intType);
    }

    @Test
    public void testConstruct_WithTwoTypeParameters() {
        // HashMap มี 2 type parameters (K, V) -> เข้า branch ที่สร้าง bindings ผ่าน TypeBindings.create
        MapLikeType type = MapLikeType.construct(HashMap.class, stringType, intType);
        assertNotNull(type);
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(stringType, type.getKeyType());
        assertEquals(intType, type.getContentType());
    }

    @Test
    public void testConstruct_WithZeroOrOneTypeParameter() {
        // String มี 0 type parameters -> เข้า branch emptyBindings()
        MapLikeType type = MapLikeType.construct(String.class, stringType, intType);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testWithKeyType_SameInstance() {
        // กรณี keyType == _keyType ควรคืนค่าเดิม (this)
        MapLikeType result = mapLikeType.withKeyType(mapLikeType.getKeyType());
        assertSame(mapLikeType, result);
    }

    @Test
    public void testWithKeyType_NewInstance() {
        JavaType newKeyType = typeFactory.constructType(Boolean.class);
        MapLikeType result = mapLikeType.withKeyType(newKeyType);
        assertNotSame(mapLikeType, result);
        assertEquals(newKeyType, result.getKeyType());
    }

    @Test
    public void testWithContentType_SameInstance() {
        MapLikeType result = (MapLikeType) mapLikeType.withContentType(mapLikeType.getContentType());
        assertSame(mapLikeType, result);
    }

    @Test
    public void testWithContentType_NewInstance() {
        JavaType newContentType = typeFactory.constructType(Double.class);
        MapLikeType result = (MapLikeType) mapLikeType.withContentType(newContentType);
        assertNotSame(mapLikeType, result);
        assertEquals(newContentType, result.getContentType());
    }

    @Test
    public void testWithHandlersAndModifiers() {
        Object dummyHandler = new Object();

        assertNotNull(mapLikeType.withTypeHandler(dummyHandler));
        assertNotNull(mapLikeType.withContentTypeHandler(dummyHandler));
        assertNotNull(mapLikeType.withValueHandler(dummyHandler));
        assertNotNull(mapLikeType.withContentValueHandler(dummyHandler));
        assertNotNull(mapLikeType.withKeyTypeHandler(dummyHandler));
        assertNotNull(mapLikeType.withKeyValueHandler(dummyHandler));
        assertNotNull(mapLikeType.refine(HashMap.class, mapLikeType.getBindings(), null, null));
    }

    @Test
    public void testWithStaticTyping() {
        MapLikeType staticType = mapLikeType.withStaticTyping();
        assertTrue(staticType.isStaticType());
        
        // ทดสอบเรียกซ้ำเพื่อให้เข้า Branch ที่ _asStatic เป็น true อยู่แล้ว
        MapLikeType staticTypeAgain = staticType.withStaticTyping();
        assertSame(staticType, staticTypeAgain);
    }

    @Test
    public void testBuildCanonicalName() {
        // ทดสอบกรณี _keyType != null และเป็น null (ทางอ้อมผ่านโครงสร้าง)
        String canonical = mapLikeType.toCanonical();
        assertNotNull(canonical);
        assertTrue(canonical.contains("java.util.HashMap"));
    }

    @Test
    public void testPublicApiGetters() {
        assertTrue(mapLikeType.isContainerType());
        assertTrue(mapLikeType.isMapLikeType());
        assertTrue(mapLikeType.isTrueMapType());
        
        // ทดสอบคลาสที่ไม่ใช่ Map แท้ๆ แต่เป็น MapLike (เช่น Custom class ที่ไม่ใช่ Map.class โดนตรงแต่จำลอง)
        MapLikeType nonTrueMap = MapLikeType.construct(String.class, stringType, intType);
        assertFalse(nonTrueMap.isTrueMapType());

        assertNotNull(mapLikeType.getKeyType());
        assertNotNull(mapLikeType.getContentType());
        
        // Handler getters
        assertNull(mapLikeType.getContentValueHandler());
        assertNull(mapLikeType.getContentTypeHandler());
    }

    @Test
    public void testHasHandlers() {
        // พื้นฐานไม่มี handler
        assertFalse(mapLikeType.hasHandlers());

        // ใส่ handler ที่ valueType เพื่อให้ _valueType.hasHandlers() เป็น true
        JavaType valueWithHandler = intType.withTypeHandler(new Object());
        MapLikeType typeWithHandler = mapLikeType.withContentType(valueWithHandler);
        assertTrue(typeWithHandler.hasHandlers());
    }

    @Test
    public void testSignatures() {
        StringBuilder sbErased = new StringBuilder();
        assertNotNull(mapLikeType.getErasedSignature(sbErased));

        StringBuilder sbGeneric = new StringBuilder();
        assertNotNull(mapLikeType.getGenericSignature(sbGeneric));
    }

    @Test
    public void testToString() {
        String str = mapLikeType.toString();
        assertNotNull(str);
        assertTrue(str.contains("map-like type"));
    }

    @Test
    public void testEqualsEdgeCases() {
        // 1. o == this
        assertTrue(mapLikeType.equals(mapLikeType));

        // 2. o == null
        assertFalse(mapLikeType.equals(null));

        // 3. o.getClass() != getClass()
        assertFalse(mapLikeType.equals("Not a MapLikeType"));

        // 4. เปรียบเทียบกับ Object อื่นที่เป็น MapLikeType แต่ต่างกัน
        MapLikeType differentClass = MapLikeType.construct(Map.class, stringType, intType);
        assertFalse(mapLikeType.equals(differentClass));

        MapLikeType sameClass = MapLikeType.construct(HashMap.class, stringType, intType);
        assertTrue(mapLikeType.equals(sameClass));
    }
}
package com.fasterxml.jackson.databind.type.test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for {@link MapLikeType} (Defects4J JacksonDatabind-59b).
 *
 * หมายเหตุ: บางเมธอด/ฟิลด์เป็น protected หรืออยู่ใน package เดียวกัน
 * จึงใช้ reflection เพื่อเข้าถึงในบางเทส เนื่องจากคลาสทดสอบอยู่ต่างแพ็กเกจ
 */
public class MapLikeTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType intType;
    private JavaType stringType2; // another instance, logically equal to stringType

    /** คลาสง่าย ๆ ที่ไม่ implement Map ใช้ทดสอบ isTrueMapType()==false และ upgradeFrom */
    public static class DummyMapLike {
    }

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        intType = typeFactory.constructType(Integer.class);
        stringType2 = typeFactory.constructType(String.class);
    }

    // ---------------------------------------------------------------
    // construct() (deprecated) - ครอบคลุม if/else ของ TypeVariable length
    // ---------------------------------------------------------------

    @Test
    public void testConstruct_WithTwoTypeParams_Map() {
        // Map.class มี TypeVariable 2 ตัว -> ใช้ TypeBindings.create(...)
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertNotNull(type);
        assertEquals(stringType, type.getKeyType());
        assertEquals(intType, type.getContentType());
        assertTrue(type.isContainerType());
        assertTrue(type.isMapLikeType());
        assertTrue(type.isTrueMapType());
    }

    @Test
    public void testConstruct_WithoutTypeParams_ObjectClass() {
        // Object.class ไม่มี TypeVariable -> bindings = emptyBindings()
        MapLikeType type = MapLikeType.construct(Object.class, stringType, intType);
        assertNotNull(type);
        assertEquals(stringType, type.getKeyType());
        assertEquals(intType, type.getContentType());
        // Object ไม่ implement Map
        assertFalse(type.isTrueMapType());
    }

    @Test
    public void testConstruct_DummyMapLikeClass_NotTrueMap() {
        MapLikeType type = MapLikeType.construct(DummyMapLike.class, stringType, intType);
        assertFalse(type.isTrueMapType());
    }

    // ---------------------------------------------------------------
    // upgradeFrom()
    // ---------------------------------------------------------------

    @Test
    public void testUpgradeFrom_ValidBaseType() {
        JavaType baseType = typeFactory.constructType(DummyMapLike.class);
        MapLikeType upgraded = MapLikeType.upgradeFrom(baseType, stringType, intType);
        assertNotNull(upgraded);
        assertEquals(stringType, upgraded.getKeyType());
        assertEquals(intType, upgraded.getContentType());
        assertFalse(upgraded.isTrueMapType());
    }

    @Test
    public void testUpgradeFrom_InvalidBaseType_ThrowsException() {
        // JavaType ที่ไม่ extends TypeBase (mock abstract class)
        JavaType fakeType = Mockito.mock(JavaType.class);
        try {
            MapLikeType.upgradeFrom(fakeType, stringType, intType);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not upgrade"));
        }
    }

    @Test
    public void testUpgradeFrom_NullKeyType_CanonicalNameSkipsKey() {
        // ใช้ constructor (TypeBase, keyT, valueT) ผ่าน upgradeFrom เพื่อให้ _keyType == null
        // ครอบคลุมสาขา if(_keyType != null) == false ใน buildCanonicalName()
        JavaType baseType = typeFactory.constructType(DummyMapLike.class);
        MapLikeType upgraded = MapLikeType.upgradeFrom(baseType, null, intType);
        assertNull(upgraded.getKeyType());
        String canonical = upgraded.toCanonical();
        assertFalse(canonical.contains("<"));
        assertTrue(canonical.contains(DummyMapLike.class.getName()));
    }

    // ---------------------------------------------------------------
    // buildCanonicalName() - branch _keyType != null == true
    // ---------------------------------------------------------------

    @Test
    public void testBuildCanonicalName_WithKeyAndValue() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        String canonical = type.toCanonical();
        assertEquals("java.util.Map<java.lang.String,java.lang.Integer>", canonical);
    }

    // ---------------------------------------------------------------
    // _narrow() - protected method, ใช้ reflection
    // ---------------------------------------------------------------

    @Test
    public void testNarrow_CreatesNewInstanceWithSubclass() throws Exception {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Method m = MapLikeType.class.getDeclaredMethod("_narrow", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(type, HashMap.class);
        assertTrue(result instanceof MapLikeType);
        MapLikeType narrowed = (MapLikeType) result;
        assertEquals(HashMap.class, narrowed.getRawClass());
        assertEquals(stringType, narrowed.getKeyType());
        assertEquals(intType, narrowed.getContentType());
    }

    // ---------------------------------------------------------------
    // withKeyType() - branch keyType == _keyType (true/false)
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyType_SameReference_ReturnsThis() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType result = type.withKeyType(stringType); // same reference
        assertSame(type, result);
    }

    @Test
    public void testWithKeyType_DifferentReference_ReturnsNewInstance() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType result = type.withKeyType(stringType2); // different reference, equal value
        assertNotSame(type, result);
        assertEquals(stringType2, result.getKeyType());
        assertEquals(intType, result.getContentType());
    }

    // ---------------------------------------------------------------
    // withContentType() - branch _valueType == contentType (true/false)
    // ---------------------------------------------------------------

    @Test
    public void testWithContentType_SameReference_ReturnsThis() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        JavaType result = type.withContentType(intType); // same reference
        assertSame(type, result);
    }

    @Test
    public void testWithContentType_DifferentReference_ReturnsNewInstance() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        JavaType newValueType = typeFactory.constructType(Integer.class); // new instance
        JavaType result = type.withContentType(newValueType);
        assertNotSame(type, result);
        assertEquals(newValueType, result.getContentType());
    }

    // ---------------------------------------------------------------
    // withTypeHandler / withValueHandler / withContentTypeHandler / withContentValueHandler
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeHandler() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Object handler = new Object();
        MapLikeType result = type.withTypeHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getTypeHandler());
        // key/value ไม่เปลี่ยน
        assertEquals(stringType, result.getKeyType());
        assertEquals(intType, result.getContentType());
    }

    @Test
    public void testWithValueHandler() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Object handler = new Object();
        MapLikeType result = type.withValueHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getValueHandler());
    }

    @Test
    public void testWithContentTypeHandler() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Object handler = new Object();
        MapLikeType result = type.withContentTypeHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getContentTypeHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Object handler = new Object();
        MapLikeType result = type.withContentValueHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getContentValueHandler());
    }

    // ---------------------------------------------------------------
    // withKeyTypeHandler / withKeyValueHandler (Extended API)
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyTypeHandler() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Object handler = new Object();
        MapLikeType result = type.withKeyTypeHandler(handler);
        assertEquals(handler, result.getKeyType().getTypeHandler());
    }

    @Test
    public void testWithKeyValueHandler() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Object handler = new Object();
        MapLikeType result = type.withKeyValueHandler(handler);
        assertEquals(handler, result.getKeyType().getValueHandler());
    }

    // ---------------------------------------------------------------
    // withStaticTyping() - branch _asStatic true/false
    // ---------------------------------------------------------------

    @Test
    public void testWithStaticTyping_FromNonStatic_CreatesNewInstance() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertFalse(type.isContainerType() && false); // no-op sanity
        MapLikeType staticType = type.withStaticTyping();
        assertNotSame(type, staticType);
        assertTrue(staticType.useStaticType()); // _asStatic == true
    }

    @Test
    public void testWithStaticTyping_AlreadyStatic_ReturnsThis() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType staticType = type.withStaticTyping();
        MapLikeType staticAgain = staticType.withStaticTyping();
        assertSame(staticType, staticAgain);
    }

    // ---------------------------------------------------------------
    // refine()
    // ---------------------------------------------------------------

    @Test
    public void testRefine_CreatesNewInstanceWithGivenParams() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType refined = type.refine(HashMap.class, bindings, null, null);
        assertTrue(refined instanceof MapLikeType);
        MapLikeType refinedMap = (MapLikeType) refined;
        assertEquals(HashMap.class, refinedMap.getRawClass());
        assertEquals(stringType, refinedMap.getKeyType());
        assertEquals(intType, refinedMap.getContentType());
    }

    // ---------------------------------------------------------------
    // hasHandlers() - OR ของ 3 เงื่อนไข
    // ---------------------------------------------------------------

    @Test
    public void testHasHandlers_NoneSet_False() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertFalse(type.hasHandlers());
    }

    @Test
    public void testHasHandlers_SuperHandlerSet_True() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType withHandler = type.withValueHandler(new Object());
        assertTrue(withHandler.hasHandlers());
    }

    @Test
    public void testHasHandlers_ValueTypeHandlerSet_True() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType withHandler = type.withContentValueHandler(new Object());
        assertTrue(withHandler.hasHandlers());
    }

    @Test
    public void testHasHandlers_KeyTypeHandlerSet_True() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType withHandler = type.withKeyValueHandler(new Object());
        assertTrue(withHandler.hasHandlers());
    }

    // ---------------------------------------------------------------
    // getKeyType / getContentType / getContentValueHandler / getContentTypeHandler
    // ---------------------------------------------------------------

    @Test
    public void testGetters_Basic() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertEquals(stringType, type.getKeyType());
        assertEquals(intType, type.getContentType());
        assertNull(type.getContentValueHandler());
        assertNull(type.getContentTypeHandler());
    }

    // ---------------------------------------------------------------
    // getErasedSignature / getGenericSignature
    // ---------------------------------------------------------------

    @Test
    public void testGetErasedSignature_NotNullAndContainsClassName() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.toString().contains("Map"));
    }

    @Test
    public void testGetGenericSignature_ContainsAngleBracketsAndTypes() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertNotNull(result);
        String sig = result.toString();
        assertTrue(sig.contains("<"));
        assertTrue(sig.endsWith(">;"));
        assertTrue(sig.contains("String"));
        assertTrue(sig.contains("Integer"));
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_Format() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        String s = type.toString();
        assertTrue(s.startsWith("[map-like type; class java.util.Map"));
        assertTrue(s.contains("->"));
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_SameInstance_True() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_Null_False() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_False() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        assertFalse(type.equals("not a MapLikeType"));
    }

    @Test
    public void testEquals_SameFieldsDifferentInstance_True() {
        MapLikeType type1 = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType type2 = MapLikeType.construct(Map.class, stringType2, typeFactory.constructType(Integer.class));
        assertTrue(type1.equals(type2));
        assertTrue(type2.equals(type1));
    }

    @Test
    public void testEquals_DifferentKeyType_False() {
        MapLikeType type1 = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType type2 = MapLikeType.construct(Map.class, intType, intType); // key type differs
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_DifferentValueType_False() {
        MapLikeType type1 = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType type2 = MapLikeType.construct(Map.class, stringType, stringType); // value type differs
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_DifferentRawClass_False() {
        MapLikeType type1 = MapLikeType.construct(Map.class, stringType, intType);
        MapLikeType type2 = MapLikeType.construct(HashMap.class, stringType, intType);
        assertFalse(type1.equals(type2));
    }
}

package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Unit tests สำหรับ com.fasterxml.jackson.databind.type.MapType
 * (Defects4J: JacksonDatabind-38b)
 *
 * หมายเหตุ: ไม่มี source ของ MapLikeType/TypeBase/JavaType/TypeFactory ให้มา
 * จึงใช้เฉพาะ public API มาตรฐานที่ทราบแน่ชัด และหลีกเลี่ยงการเดา getter
 * ที่ไม่มีอยู่ในซอร์สที่ให้มา (เช่น getter สำหรับ field _asStatic ภายใน)
 */
public class MapTypeTest {

    private TypeFactory typeFactory;
    private MapType baseType; // Map<String,Integer>, _asStatic = false (default)

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        // constructMapType เป็น public API มาตรฐานของ Jackson TypeFactory
        baseType = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
    }

    // ---------------------------------------------------------------
    // construct() - full factory (2.7+)
    // ---------------------------------------------------------------

    @Test
    public void testConstructFullFactory_createsExpectedType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);

        MapType mt = MapType.construct(HashMap.class, baseType.getBindings(),
                baseType.getSuperClass(), new JavaType[0], keyType, valueType);

        assertNotNull(mt);
        assertEquals(HashMap.class, mt.getRawClass());
        assertEquals(keyType, mt.getKeyType());
        assertEquals(valueType, mt.getContentType());
        assertNull(mt.getTypeHandler());
        assertNull(mt.getValueHandler());
    }

    // ---------------------------------------------------------------
    // construct() - deprecated 2-arg factory
    // ---------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructDeprecatedTwoArg_createsExpectedType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);

        // ทดสอบ path ที่ bindings=null, superInterfaces=null ถูกส่งตรงเข้า constructor
        MapType mt = MapType.construct(HashMap.class, keyType, valueType);

        assertNotNull(mt);
        assertEquals(HashMap.class, mt.getRawClass());
        assertEquals(keyType, mt.getKeyType());
        assertEquals(valueType, mt.getContentType());
    }

    // ---------------------------------------------------------------
    // _narrow()
    // ---------------------------------------------------------------

    @Test
    public void testNarrow_changesRawClass_preservesKeyValueTypes() {
        JavaType narrowed = baseType._narrow(TreeMap.class);

        assertNotNull(narrowed);
        assertTrue(narrowed instanceof MapType);
        assertEquals(TreeMap.class, narrowed.getRawClass());
        assertEquals(baseType.getKeyType(), ((MapType) narrowed).getKeyType());
        assertEquals(baseType.getContentType(), narrowed.getContentType());
        // ต้องเป็น instance ใหม่ ไม่ใช่ตัวเดิม
        assertNotSame(baseType, narrowed);
    }

    // ---------------------------------------------------------------
    // withTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithTypeHandler_setsHandler_originalUnaffected() {
        Object handler = new Object();
        MapType mt = baseType.withTypeHandler(handler);

        assertNotSame(baseType, mt);
        assertSame(handler, mt.getTypeHandler());
        assertNull(baseType.getTypeHandler()); // original ไม่เปลี่ยน (immutability)
        assertEquals(baseType.getKeyType(), mt.getKeyType());
        assertEquals(baseType.getContentType(), mt.getContentType());
    }

    // ---------------------------------------------------------------
    // withContentTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithContentTypeHandler_setsHandlerOnValueType() {
        Object handler = new Object();
        MapType mt = baseType.withContentTypeHandler(handler);

        assertNotSame(baseType, mt);
        assertSame(handler, mt.getContentType().getTypeHandler());
        assertNull(baseType.getContentType().getTypeHandler()); // original unaffected
        assertEquals(baseType.getKeyType(), mt.getKeyType());    // key type ไม่ถูกกระทบ
    }

    // ---------------------------------------------------------------
    // withValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithValueHandler_setsHandler_originalUnaffected() {
        Object handler = new Object();
        MapType mt = baseType.withValueHandler(handler);

        assertNotSame(baseType, mt);
        assertSame(handler, mt.getValueHandler());
        assertNull(baseType.getValueHandler());
    }

    // ---------------------------------------------------------------
    // withContentValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithContentValueHandler_setsHandlerOnValueType() {
        Object handler = new Object();
        MapType mt = baseType.withContentValueHandler(handler);

        assertNotSame(baseType, mt);
        assertSame(handler, mt.getContentType().getValueHandler());
        assertNull(baseType.getContentType().getValueHandler());
    }

    // ---------------------------------------------------------------
    // withStaticTyping()  -- if (_asStatic) return this; else new instance
    // ---------------------------------------------------------------

    @Test
    public void testWithStaticTyping_fromNonStatic_createsNewInstance() {
        // baseType default _asStatic = false -> ควรได้ instance ใหม่ (else branch)
        MapType staticType = baseType.withStaticTyping();

        assertNotNull(staticType);
        assertNotSame(baseType, staticType);
        assertTrue(staticType instanceof MapType);
        // key/value ยังคง represent ชนิดเดิม (แม้ static-typing ถูกเปลี่ยน)
        assertEquals(baseType.getRawClass(), staticType.getRawClass());
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance() {
        MapType staticType = baseType.withStaticTyping(); // _asStatic = true แล้ว
        MapType staticAgain = staticType.withStaticTyping(); // if (_asStatic) return this;

        assertSame(staticType, staticAgain); // ตรวจ branch "return this" ตาม source
    }

    // ---------------------------------------------------------------
    // withContentType()  -- if (_valueType == contentType) return this;
    // ---------------------------------------------------------------

    @Test
    public void testWithContentType_sameReference_returnsThis() {
        JavaType sameContentType = baseType.getContentType();
        JavaType result = baseType.withContentType(sameContentType);

        assertSame(baseType, result); // reference equality branch
    }

    @Test
    public void testWithContentType_differentType_returnsNewInstance() {
        JavaType newContentType = typeFactory.constructType(Long.class);
        JavaType result = baseType.withContentType(newContentType);

        assertNotSame(baseType, result);
        assertTrue(result instanceof MapType);
        assertEquals(newContentType, result.getContentType());
        assertEquals(baseType.getKeyType(), ((MapType) result).getKeyType()); // key ไม่เปลี่ยน
    }

    // ---------------------------------------------------------------
    // withKeyType()  -- if (keyType == _keyType) return this;
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyType_sameReference_returnsThis() {
        JavaType sameKeyType = baseType.getKeyType();
        MapType result = baseType.withKeyType(sameKeyType);

        assertSame(baseType, result);
    }

    @Test
    public void testWithKeyType_differentType_returnsNewInstance() {
        JavaType newKeyType = typeFactory.constructType(Long.class);
        MapType result = baseType.withKeyType(newKeyType);

        assertNotSame(baseType, result);
        assertEquals(newKeyType, result.getKeyType());
        assertEquals(baseType.getContentType(), result.getContentType()); // value ไม่เปลี่ยน
    }

    // ---------------------------------------------------------------
    // refine()
    // ---------------------------------------------------------------

    @Test
    public void testRefine_changesRawClass_preservesKeyValueTypes() {
        JavaType refined = baseType.refine(TreeMap.class, baseType.getBindings(),
                baseType.getSuperClass(), new JavaType[0]);

        assertNotNull(refined);
        assertTrue(refined instanceof MapType);
        assertEquals(TreeMap.class, refined.getRawClass());
        assertEquals(baseType.getKeyType(), ((MapType) refined).getKeyType());
        assertEquals(baseType.getContentType(), refined.getContentType());
        assertNotSame(baseType, refined);
    }

    // ---------------------------------------------------------------
    // withKeyTypeHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyTypeHandler_setsHandlerOnKeyType() {
        Object handler = new Object();
        MapType mt = baseType.withKeyTypeHandler(handler);

        assertNotSame(baseType, mt);
        assertSame(handler, mt.getKeyType().getTypeHandler());
        assertNull(baseType.getKeyType().getTypeHandler());
        assertEquals(baseType.getContentType(), mt.getContentType()); // value ไม่เปลี่ยน
    }

    // ---------------------------------------------------------------
    // withKeyValueHandler()
    // ---------------------------------------------------------------

    @Test
    public void testWithKeyValueHandler_setsValueHandlerOnKeyType() {
        Object handler = new Object();
        MapType mt = baseType.withKeyValueHandler(handler);

        assertNotSame(baseType, mt);
        assertSame(handler, mt.getKeyType().getValueHandler());
        assertNull(baseType.getKeyType().getValueHandler());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_formatIsCorrect() {
        String s = baseType.toString();

        assertNotNull(s);
        assertTrue(s.startsWith("[map type; class "));
        assertTrue(s.contains(HashMap.class.getName()));
        assertTrue(s.contains(" -> "));
        assertTrue(s.endsWith("]"));
    }

    @Test
    public void testToString_reflectsKeyAndValueTypeToString() {
        String s = baseType.toString();
        // ค่า _keyType/_valueType toString ต้องปรากฏใน output
        assertTrue(s.contains(baseType.getKeyType().toString()));
        assertTrue(s.contains(baseType.getContentType().toString()));
    }
}

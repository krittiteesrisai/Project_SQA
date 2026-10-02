package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory; // อยู่ package เดียวกัน แต่ import ตามข้อกำหนด

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    // =========================================================
    // Helper generic holder class สำหรับสร้าง ParameterizedType /
    // GenericArrayType / TypeVariable / WildcardType ผ่าน reflection
    // =========================================================

    static class Box<T> {
        public T value;
        public T[] arr;
        public List<? extends Number> wildcardList;
        public List<String> plainList;
    }

    // ใช้เพื่อทดสอบ branch "subclass.getTypeParameters().length == 0"
    static class ConcreteStringList extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    private Type genericTypeOf(String fieldName) throws NoSuchFieldException {
        return Box.class.getField(fieldName).getGenericType();
    }

    // =========================================================
    // defaultInstance()
    // =========================================================

    @Test
    public void testDefaultInstanceIsSingleton() {
        TypeFactory a = TypeFactory.defaultInstance();
        TypeFactory b = TypeFactory.defaultInstance();
        assertSame(a, b);
        assertNotNull(a);
    }

    // =========================================================
    // unknownType()
    // =========================================================

    @Test
    public void testUnknownType() {
        JavaType t = TypeFactory.unknownType();
        assertNotNull(t);
        assertEquals(Object.class, t.getRawClass());
    }

    // =========================================================
    // rawClass(Type) - static
    // =========================================================

    @Test
    public void testRawClass_withClassInstance() {
        // branch: t instanceof Class<?> -> true
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testRawClass_withParameterizedType() throws Exception {
        // branch: t instanceof Class<?> -> false -> defaultInstance().constructType(t).getRawClass()
        Type pt = genericTypeOf("plainList"); // List<String>
        assertEquals(List.class, TypeFactory.rawClass(pt));
    }

    // =========================================================
    // findClass(String) / _findPrimitive(String)
    // =========================================================

    @Test
    public void testFindClass_primitiveInt() throws Exception {
        assertEquals(Integer.TYPE, typeFactory.findClass("int"));
    }

    @Test
    public void testFindClass_primitiveLong() throws Exception {
        assertEquals(Long.TYPE, typeFactory.findClass("long"));
    }

    @Test
    public void testFindClass_primitiveFloat() throws Exception {
        assertEquals(Float.TYPE, typeFactory.findClass("float"));
    }

    @Test
    public void testFindClass_primitiveDouble() throws Exception {
        assertEquals(Double.TYPE, typeFactory.findClass("double"));
    }

    @Test
    public void testFindClass_primitiveBoolean() throws Exception {
        assertEquals(Boolean.TYPE, typeFactory.findClass("boolean"));
    }

    @Test
    public void testFindClass_primitiveByte() throws Exception {
        assertEquals(Byte.TYPE, typeFactory.findClass("byte"));
    }

    @Test
    public void testFindClass_primitiveChar() throws Exception {
        assertEquals(Character.TYPE, typeFactory.findClass("char"));
    }

    @Test
    public void testFindClass_primitiveShort() throws Exception {
        assertEquals(Short.TYPE, typeFactory.findClass("short"));
    }

    @Test
    public void testFindClass_primitiveVoid() throws Exception {
        assertEquals(Void.TYPE, typeFactory.findClass("void"));
    }

    @Test
    public void testFindClass_nonPrimitiveNoDot() throws Exception {
        // ไม่มี '.' และไม่ตรงกับ primitive ใด ๆ -> ตกไป class-loading -> ล้มเหลว
        try {
            typeFactory.findClass("NoSuchClassWithoutDot");
            fail("Expected ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // expected
        }
    }

    @Test
    public void testFindClass_normalClassWithDot() throws Exception {
        assertEquals(String.class, typeFactory.findClass("java.lang.String"));
    }

    @Test
    public void testFindClass_unknownClassWithDot() throws Exception {
        try {
            typeFactory.findClass("com.nosuch.package.ClassXyz");
            fail("Expected ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // expected
        }
    }

    // =========================================================
    // withModifier / withClassLoader / getClassLoader
    // =========================================================

    @Test
    public void testWithModifier_null() {
        TypeFactory newFactory = typeFactory.withModifier(null);
        assertNotSame(typeFactory, newFactory);
        assertNull(newFactory._modifiers);
    }

    @Test
    public void testWithModifier_firstModifier() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory tf) {
                return type;
            }
        };
        TypeFactory newFactory = typeFactory.withModifier(mod);
        assertNotNull(newFactory._modifiers);
        assertEquals(1, newFactory._modifiers.length);
        assertSame(mod, newFactory._modifiers[0]);
    }

    @Test
    public void testWithModifier_addToExisting() {
        TypeModifier mod1 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory tf) {
                return type;
            }
        };
        TypeModifier mod2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory tf) {
                return type;
            }
        };
        TypeFactory f1 = typeFactory.withModifier(mod1);
        TypeFactory f2 = f1.withModifier(mod2);
        assertEquals(2, f2._modifiers.length);
    }

    @Test
    public void testWithClassLoaderAndGetClassLoader() {
        ClassLoader cl = new ClassLoader() { };
        TypeFactory newFactory = typeFactory.withClassLoader(cl);
        assertSame(cl, newFactory.getClassLoader());
        assertNull(typeFactory.getClassLoader()); // default instance ไม่มี classloader
    }

    // =========================================================
    // clearCache()
    // =========================================================

    @Test
    public void testClearCacheDoesNotThrow() {
        typeFactory.constructType(String.class);
        typeFactory.clearCache();
        JavaType t = typeFactory.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    // =========================================================
    // constructType(Type) / constructType(TypeReference)
    // =========================================================

    @Test
    public void testConstructType_simpleClass() {
        JavaType t = typeFactory.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_alreadyJavaType() {
        JavaType original = typeFactory.constructType(String.class);
        // branch: type instanceof JavaType -> คืน reference เดิม
        JavaType again = typeFactory.constructType(original);
        assertSame(original, again);
    }

    @Test
    public void testConstructType_parameterizedType() throws Exception {
        Type pt = genericTypeOf("plainList"); // List<String>
        JavaType t = typeFactory.constructType(pt);
        assertTrue(t.isContainerType());
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_genericArrayType() throws Exception {
        Type at = genericTypeOf("arr"); // T[]
        JavaType t = typeFactory.constructType(at);
        assertTrue(t.isArrayType());
        // T ไม่มี bound -> resolve เป็น Object
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_typeVariable() throws Exception {
        Type tv = genericTypeOf("value"); // T
        JavaType t = typeFactory.constructType(tv);
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testConstructType_wildcardType() throws Exception {
        Type pt = genericTypeOf("wildcardList"); // List<? extends Number>
        ParameterizedType parameterizedType = (ParameterizedType) pt;
        Type wildcard = parameterizedType.getActualTypeArguments()[0];
        assertTrue(wildcard instanceof WildcardType);
        JavaType t = typeFactory.constructType(wildcard);
        assertEquals(Number.class, t.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedType() {
        // null ไม่ตรง instanceof ใด ๆ -> เข้า else-branch "sanity check"
        typeFactory.constructType((Type) null);
    }

    @Test
    public void testConstructType_withTypeReference() {
        JavaType t = typeFactory.constructType(new TypeReference<List<String>>() { });
        assertTrue(t.isContainerType());
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_interfaceType() {
        JavaType t = typeFactory.constructType(Runnable.class);
        assertEquals(Runnable.class, t.getRawClass());
        assertTrue(t.isInterface());
    }

    @Test
    public void testConstructType_primitiveArray() {
        JavaType t = typeFactory.constructType(int[].class);
        assertTrue(t.isArrayType());
        assertEquals(int.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_wellKnownPrimitive() {
        JavaType t = typeFactory.constructType(Boolean.TYPE);
        assertEquals(boolean.class, t.getRawClass());
    }

    @Test
    public void testConstructType_atomicReference() {
        JavaType t = typeFactory.constructType(new TypeReference<AtomicReference<String>>() { });
        assertTrue(t instanceof ReferenceType);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    // =========================================================
    // Array / Collection / Map / Reference / Simple / Parametric constructors
    // =========================================================

    @Test
    public void testConstructArrayType_fromClass() {
        ArrayType t = typeFactory.constructArrayType(String.class);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType_fromJavaType() {
        JavaType elem = typeFactory.constructType(Integer.class);
        ArrayType t = typeFactory.constructArrayType(elem);
        assertSame(elem, t.getContentType());
    }

    @Test
    public void testConstructCollectionType_classes() {
        CollectionType t = typeFactory.constructCollectionType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_alreadyCollectionLikeType() {
        // NOTE: List.class ถูกจดจำเป็น CollectionType (ซึ่ง instanceof CollectionLikeType)
        // อยู่แล้ว จึงครอบคลุมเฉพาะ branch "instanceof true"; branch "upgradeFrom"
        // ต้องใช้ raw-type ที่ไม่ถูกจดจำเป็น CollectionLikeType ซึ่งหาไม่ได้ในซอร์สที่ให้มา
        // จึงไม่ทดสอบ branch นั้นเพื่อไม่ guess พฤติกรรม
        CollectionLikeType t = typeFactory.constructCollectionLikeType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_classes() {
        MapType t = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_propertiesSpecialCase() {
        // branch: mapClass == Properties.class -> kt = vt = CORE_TYPE_STRING เสมอ
        MapType t = typeFactory.constructMapType(Properties.class, Integer.class, Integer.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType_alreadyMapLikeType() {
        // เช่นเดียวกับ CollectionLikeType, Map.class ถูกจดจำเป็น MapType อยู่แล้ว
        MapLikeType t = typeFactory.constructMapLikeType(Map.class, String.class, Integer.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType referred = typeFactory.constructType(String.class);
        ReferenceType t = typeFactory.constructReferenceType(AtomicReference.class, referred);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleType() {
        JavaType t = typeFactory.constructSimpleType(String.class, new JavaType[0]);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType t = typeFactory.uncheckedSimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructParametricType_withClasses() {
        JavaType t = typeFactory.constructParametricType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricType_withJavaTypes() {
        JavaType elem = typeFactory.constructType(Integer.class);
        JavaType t = typeFactory.constructParametricType(List.class, elem);
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionType t = typeFactory.constructRawCollectionType(List.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapType t = typeFactory.constructRawMapType(Map.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType t = typeFactory.constructRawCollectionLikeType(List.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType t = typeFactory.constructRawMapLikeType(Map.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
    }

    // =========================================================
    // constructFromCanonical
    // =========================================================

    @Test
    public void testConstructFromCanonical_simple() {
        JavaType t = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_parametrized() {
        JavaType t = typeFactory.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformed() {
        // Javadoc ระบุชัดเจนว่า malformed canonical ต้อง throw IllegalArgumentException
        typeFactory.constructFromCanonical("this is not a valid $$$ type <<<");
    }

    // =========================================================
    // findTypeParameters
    // =========================================================

    @Test
    public void testFindTypeParameters_found() {
        JavaType listOfString = typeFactory.constructType(new TypeReference<ArrayList<String>>() { });
        JavaType[] params = typeFactory.findTypeParameters(listOfString, List.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_notFound() {
        JavaType stringType = typeFactory.constructType(String.class);
        // String ไม่ implement List -> findSuperType คืน null -> NO_TYPES
        JavaType[] params = typeFactory.findTypeParameters(stringType, List.class);
        assertEquals(0, params.length);
    }

    // =========================================================
    // moreSpecificType
    // =========================================================

    @Test
    public void testMoreSpecificType_firstNull() {
        JavaType t2 = typeFactory.constructType(String.class);
        assertSame(t2, typeFactory.moreSpecificType(null, t2));
    }

    @Test
    public void testMoreSpecificType_secondNull() {
        JavaType t1 = typeFactory.constructType(String.class);
        assertSame(t1, typeFactory.moreSpecificType(t1, null));
    }

    @Test
    public void testMoreSpecificType_sameRawClass() {
        JavaType t1 = typeFactory.constructType(String.class);
        JavaType t2 = typeFactory.constructType(String.class);
        assertSame(t1, typeFactory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificType_assignableFrom() {
        JavaType t1 = typeFactory.constructType(Number.class);
        JavaType t2 = typeFactory.constructType(Integer.class);
        // raw1(Number) isAssignableFrom raw2(Integer) -> คืน type2 (ชนิดที่เจาะจงกว่า)
        assertSame(t2, typeFactory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificType_notRelated() {
        JavaType t1 = typeFactory.constructType(String.class);
        JavaType t2 = typeFactory.constructType(Integer.class);
        // ไม่เกี่ยวข้องกัน -> คืน type1 (primary)
        assertSame(t1, typeFactory.moreSpecificType(t1, t2));
    }

    // =========================================================
    // constructSpecializedType
    // =========================================================

    @Test
    public void testConstructSpecializedType_sameRawClass() {
        JavaType base = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructSpecializedType(base, String.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructSpecializedType_fromObjectBase() {
        JavaType base = typeFactory.constructType(Object.class);
        JavaType result = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubtype() {
        JavaType base = typeFactory.constructType(Number.class);
        typeFactory.constructSpecializedType(base, String.class);
    }

    @Test
    public void testConstructSpecializedType_noGenericsShortCut() {
        // base มี bindings ว่าง (Number ไม่ generic), subclass ต่างจาก base
        JavaType base = typeFactory.constructType(Number.class);
        JavaType result = typeFactory.constructSpecializedType(base, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapLikeShortcut() {
        JavaType base = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = typeFactory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
        assertTrue(result instanceof MapType);
        MapType mt = (MapType) result;
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(Integer.class, mt.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedType_collectionLikeShortcut() {
        JavaType base = typeFactory.constructCollectionType(Collection.class, String.class);
        JavaType result = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
        assertTrue(result instanceof CollectionType);
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedType_subclassNoOwnTypeParams() {
        // ConcreteStringList ไม่ประกาศ type parameter ของตัวเอง -> length == 0 branch
        JavaType base = typeFactory.constructCollectionType(Collection.class, String.class);
        JavaType result = typeFactory.constructSpecializedType(base, ConcreteStringList.class);
        assertEquals(ConcreteStringList.class, result.getRawClass());
    }

    // NOTE: branch "EnumSet shortcut" และ branch "baseType.refine(...) คืน null แล้ว fallback"
    // ต้องการ setup ภายในที่ซับซ้อนมาก (เช่น อาศัย package-private subclass ของ EnumSet)
    // จึงไม่ทดสอบเพื่อป้องกันการ guess behavior ที่ไม่ปรากฏชัดในซอร์ส

    // =========================================================
    // constructGeneralizedType
    // =========================================================

    @Test
    public void testConstructGeneralizedType_sameRawClass() {
        JavaType base = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructGeneralizedType(base, String.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructGeneralizedType_toSuperClass() {
        JavaType base = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.constructGeneralizedType(base, List.class);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType() {
        JavaType base = typeFactory.constructType(String.class);
        typeFactory.constructGeneralizedType(base, List.class);
    }

    // NOTE: branch "Internal error: class not included as super-type" ปกติไม่ควรเกิดขึ้น
    // จากการเรียกใช้งานทั่วไป (ต้องมี bug ภายใน findSuperType) จึงไม่ทดสอบ
}

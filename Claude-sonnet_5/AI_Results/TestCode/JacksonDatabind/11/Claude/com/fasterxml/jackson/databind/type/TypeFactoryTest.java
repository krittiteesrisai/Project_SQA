package com.fasterxml.jackson.databind.type;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

/**
 * Unit test สำหรับ com.fasterxml.jackson.databind.type.TypeFactory
 * (Defects4J: JacksonDatabind-11b)
 *
 * หมายเหตุ: คลาสนี้อยู่ใน package เดียวกับ TypeFactory (com.fasterxml.jackson.databind.type)
 * เพื่อให้เข้าถึงฟิลด์/คลาส package-private เช่น _modifiers, TypeModifier, TypeBindings,
 * ArrayType, CollectionType, CollectionLikeType, MapType, MapLikeType, SimpleType ได้โดยตรง
 * (ทุกคลาสเหล่านี้ถูกใช้ในซอร์สของ TypeFactory โดยไม่มี import แสดงว่าอยู่ package เดียวกันจริง)
 */
public class TypeFactoryTest {

    private TypeFactory tf;

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
    }

    // ---------- Helper fixture classes ----------

    static class GenericHolder<T> {
        public List<String> listField;
        public Map<String, Integer> mapField;
        public List<String>[] arrayField;
        public T varField;
        public List<? extends Number> wildcardField;
    }

    static class NoParamHolder {}

    // คลาสที่ไม่ implements Map ใช้ทดสอบ constructMapLikeType/constructCollectionLikeType
    static class PlainMapLike {}

    // สมมติฐาน: TypeModifier มี abstract method เดียวคือ modifyType(JavaType,Type,TypeBindings,TypeFactory)
    // ตามลำดับพารามิเตอร์ที่ใช้จริงใน _constructType(): mod.modifyType(resultType, type, context, this)
    static class NoOpTypeModifier extends TypeModifier {
        @Override
        public JavaType modifyType(JavaType type, Type currentType, TypeBindings context, TypeFactory typeFactory) {
            return type;
        }
    }

    // ================= A. Singleton / cache =================

    @Test
    public void testDefaultInstance_isSingleton() {
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testClearCache_noExceptionAndStillWorks() {
        tf.constructType(String.class);
        tf.clearCache();
        JavaType t = tf.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    // ================= B. unknownType / rawClass =================

    @Test
    public void testUnknownType_isObjectSimpleType() {
        JavaType t = TypeFactory.unknownType();
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testRawClass_withClassInstance() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testRawClass_withNonClassType() throws Exception {
        Field f = GenericHolder.class.getDeclaredField("listField");
        Type generic = f.getGenericType(); // ParameterizedType
        assertEquals(List.class, TypeFactory.rawClass(generic));
    }

    // ================= C. constructSpecializedType =================

    @Test
    public void testConstructSpecializedType_sameRawClassReturnsSameInstance() {
        JavaType base = tf.constructType(String.class);
        JavaType result = tf.constructSpecializedType(base, String.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructSpecializedType_simpleTypeToArray() {
        JavaType base = tf.constructType(Object.class); // SimpleType
        JavaType result = tf.constructSpecializedType(base, String[].class);
        assertEquals(ArrayType.class, result.getClass());
        assertEquals(String[].class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_incompatibleSubclassThrows() {
        JavaType base = tf.constructType(String.class); // SimpleType
        try {
            tf.constructSpecializedType(base, ArrayList.class);
            fail("ควรโยน IllegalArgumentException เนื่องจาก String ไม่ compatible กับ ArrayList");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConstructSpecializedType_elseBranchNarrowBy() {
        JavaType base = tf.constructType(Number.class); // SimpleType, ไม่ใช่ array/map/collection subclass
        JavaType result = tf.constructSpecializedType(base, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_nonSimpleTypeGoesToNarrowBy() {
        JavaType base = tf.constructType(List.class); // CollectionType ไม่ใช่ SimpleType
        JavaType result = tf.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_copiesValueAndTypeHandlers() {
        Object valueHandler = new Object();
        Object typeHandler = new Object();
        JavaType base = tf.constructType(Object.class)
                .withValueHandler(valueHandler)
                .withTypeHandler(typeHandler);
        JavaType result = tf.constructSpecializedType(base, String[].class);
        assertSame(valueHandler, result.getValueHandler());
        assertSame(typeHandler, result.getTypeHandler());
    }

    // ================= D. constructFromCanonical =================

    @Test
    public void testConstructFromCanonical_simpleClass() {
        JavaType t = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_genericList() {
        // สมมติฐาน: รูปแบบ canonical string ใช้ <> ตามแนวทาง toCanonical() ทั่วไปของ Jackson
        JavaType t = tf.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_malformedThrows() {
        try {
            tf.constructFromCanonical("this.is.not.a.Real$$Class<<>>");
            fail("ควรโยน IllegalArgumentException เนื่องจาก canonical string ผิดรูปแบบ");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    // ================= E. findTypeParameters =================

    @Test
    public void testFindTypeParameters_classClass_arrayList() {
        JavaType[] pts = tf.findTypeParameters(ArrayList.class, Collection.class);
        assertNotNull(pts);
        assertEquals(1, pts.length);
    }

    @Test
    public void testFindTypeParameters_classClass_hashMap() {
        JavaType[] pts = tf.findTypeParameters(HashMap.class, Map.class);
        assertNotNull(pts);
        assertEquals(2, pts.length);
    }

    @Test
    public void testFindTypeParameters_notSubtypeThrows() {
        try {
            tf.findTypeParameters(String.class, List.class);
            fail("String ไม่ใช่ subtype ของ List ควรโยน exception");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testFindTypeParameters_hashMapCache_calledTwice() {
        JavaType[] first = tf.findTypeParameters(HashMap.class, Map.class);
        JavaType[] second = tf.findTypeParameters(HashMap.class, Map.class);
        assertEquals(first.length, second.length);
    }

    @Test
    public void testFindTypeParameters_arrayListCache_calledTwice() {
        JavaType[] first = tf.findTypeParameters(ArrayList.class, List.class);
        JavaType[] second = tf.findTypeParameters(ArrayList.class, List.class);
        assertEquals(first.length, second.length);
    }

    @Test
    public void testFindTypeParameters_superClassChain_notInterfaceTarget() {
        // AbstractList เป็น class ไม่ใช่ interface -> เข้า branch _findSuperClassChain
        JavaType[] pts = tf.findTypeParameters(ArrayList.class, AbstractList.class);
        assertNotNull(pts);
        assertEquals(1, pts.length);
    }

    @Test
    public void testFindTypeParameters_javaTypeOverload_directBranch_withCount() {
        JavaType strType = tf.constructType(String.class);
        JavaType ctx = tf.constructSimpleType(GenericHolder.class, GenericHolder.class,
                new JavaType[] { strType });
        JavaType[] result = tf.findTypeParameters(ctx, GenericHolder.class);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(String.class, result[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_javaTypeOverload_directBranch_zeroCountReturnsNull() {
        JavaType ctx = tf.constructSimpleType(NoParamHolder.class, NoParamHolder.class, new JavaType[0]);
        JavaType[] result = tf.findTypeParameters(ctx, NoParamHolder.class);
        assertNull(result);
    }

    @Test
    public void testFindTypeParameters_javaTypeOverload_elseBranch() {
        JavaType listType = tf.constructType(ArrayList.class);
        JavaType[] result = tf.findTypeParameters(listType, Collection.class);
        assertNotNull(result);
        assertEquals(1, result.length);
    }

    // ================= F. moreSpecificType =================

    @Test
    public void testMoreSpecificType_type1Null() {
        JavaType t2 = tf.constructType(String.class);
        assertSame(t2, tf.moreSpecificType(null, t2));
    }

    @Test
    public void testMoreSpecificType_type2Null() {
        JavaType t1 = tf.constructType(String.class);
        assertSame(t1, tf.moreSpecificType(t1, null));
    }

    @Test
    public void testMoreSpecificType_sameRawClass() {
        JavaType t1 = tf.constructType(String.class);
        JavaType t2 = tf.constructType(String.class);
        assertSame(t1, tf.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificType_assignableReturnsType2() {
        JavaType number = tf.constructType(Number.class);
        JavaType integer = tf.constructType(Integer.class);
        assertSame(integer, tf.moreSpecificType(number, integer));
    }

    @Test
    public void testMoreSpecificType_notAssignableReturnsType1() {
        JavaType integer = tf.constructType(Integer.class);
        JavaType number = tf.constructType(Number.class);
        // Integer.isAssignableFrom(Number) == false -> คืน type1 แม้จะ "เจาะจง" น้อยกว่า
        assertSame(integer, tf.moreSpecificType(integer, number));
    }

    @Test
    public void testMoreSpecificType_unrelatedReturnsType1() {
        JavaType str = tf.constructType(String.class);
        JavaType integer = tf.constructType(Integer.class);
        assertSame(str, tf.moreSpecificType(str, integer));
    }

    // ================= G. constructType / _constructType branches =================

    @Test
    public void testConstructType_class() {
        JavaType t = tf.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_typeReference() {
        JavaType t = tf.constructType(new TypeReference<List<String>>() {});
        assertEquals(List.class, t.getRawClass());
        assertEquals(CollectionType.class, t.getClass());
    }

    @Test
    public void testConstructType_withNullTypeBindings() {
        JavaType t = tf.constructType((Type) String.class, (TypeBindings) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withClassContext_nullAndNonNull() {
        JavaType t1 = tf.constructType(String.class, (Class<?>) null);
        assertEquals(String.class, t1.getRawClass());
        JavaType t2 = tf.constructType(String.class, Object.class);
        assertEquals(String.class, t2.getRawClass());
    }

    @Test
    public void testConstructType_withJavaTypeContext_nullAndNonNull() {
        JavaType ctx = tf.constructType(Object.class);
        JavaType t1 = tf.constructType(String.class, (JavaType) null);
        assertEquals(String.class, t1.getRawClass());
        JavaType t2 = tf.constructType(String.class, ctx);
        assertEquals(String.class, t2.getRawClass());
    }

    @Test
    public void testConstructType_javaTypeInstanceOfBranch() {
        JavaType original = tf.constructType(String.class);
        // สมมติฐาน: JavaType implements java.lang.reflect.Type (จำเป็นสำหรับ branch นี้ให้ถูกเรียกได้)
        Type asType = (Type) original;
        JavaType result = tf.constructType(asType);
        assertSame(original, result);
    }

    @Test
    public void testConstructType_genericArrayType() throws Exception {
        Field f = GenericHolder.class.getDeclaredField("arrayField");
        Type generic = f.getGenericType();
        assertTrue(generic instanceof GenericArrayType);
        JavaType result = tf.constructType(generic);
        assertEquals(ArrayType.class, result.getClass());
    }

    @Test
    public void testConstructType_typeVariable_noContext_returnsUnknown() throws Exception {
        Field f = GenericHolder.class.getDeclaredField("varField");
        Type generic = f.getGenericType();
        assertTrue(generic instanceof TypeVariable<?>);
        JavaType result = tf.constructType(generic); // context = null ภายใน constructType(Type)
        assertEquals(Object.class, result.getRawClass());
    }

    @Test
    public void testConstructType_wildcardType() throws Exception {
        Field f = GenericHolder.class.getDeclaredField("wildcardField");
        ParameterizedType pt = (ParameterizedType) f.getGenericType();
        Type wildcard = pt.getActualTypeArguments()[0];
        assertTrue(wildcard instanceof WildcardType);
        JavaType result = tf.constructType(wildcard);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test
    public void testConstructType_unrecognizedTypeThrows() {
        Type weird = new Type() {};
        try {
            tf.constructType(weird);
            fail("ควรโยน IllegalArgumentException สำหรับ Type ที่ไม่รู้จัก");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConstructType_nullTypeThrowsWithNullMessage() {
        try {
            tf.constructType((Type) null);
            fail("ควรโยน IllegalArgumentException เมื่อ type เป็น null");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("[null]"));
        }
    }

    // ================= H. Direct factory methods =================

    @Test
    public void testConstructArrayType_fromClass() {
        ArrayType t = tf.constructArrayType(String.class);
        assertEquals(String[].class, t.getRawClass());
    }

    @Test
    public void testConstructArrayType_fromJavaType() {
        JavaType elem = tf.constructType(String.class);
        ArrayType t = tf.constructArrayType(elem);
        assertEquals(String[].class, t.getRawClass());
    }

    @Test
    public void testConstructCollectionType_classClass() {
        CollectionType t = tf.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructCollectionType_classJavaType() {
        JavaType elem = tf.constructType(String.class);
        CollectionType t = tf.constructCollectionType(ArrayList.class, elem);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_classClass() {
        CollectionLikeType t = tf.constructCollectionLikeType(PlainMapLike.class, String.class);
        assertEquals(CollectionLikeType.class, t.getClass());
    }

    @Test
    public void testConstructCollectionLikeType_classJavaType() {
        JavaType elem = tf.constructType(String.class);
        CollectionLikeType t = tf.constructCollectionLikeType(PlainMapLike.class, elem);
        assertEquals(CollectionLikeType.class, t.getClass());
    }

    @Test
    public void testConstructMapType_classJavaTypeJavaType() {
        JavaType k = tf.constructType(String.class);
        JavaType v = tf.constructType(Integer.class);
        MapType t = tf.constructMapType(HashMap.class, k, v);
        assertEquals(HashMap.class, t.getRawClass());
    }

    @Test
    public void testConstructMapType_classClassClass() {
        MapType t = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, t.getRawClass());
    }

    @Test
    public void testConstructMapLikeType_classJavaTypeJavaType_correct() {
        JavaType k = tf.constructType(String.class);
        JavaType v = tf.constructType(Integer.class);
        MapLikeType t = tf.constructMapLikeType(PlainMapLike.class, k, v);
        assertEquals(MapLikeType.class, t.getClass());
    }

    @Test
    public void testConstructMapLikeType_classClassClass_FAULT_expectMapLikeTypeButGetsMapType() {
        // *** จุดที่คาดว่าเป็น fault (Defects4J bug) ***
        // constructMapLikeType(Class,Class,Class) ในซอร์สเรียก MapType.construct(...)
        // แทนที่จะเป็น MapLikeType.construct(...) ตาม contract ของ method (return type ประกาศเป็น
        // MapLikeType และ overload อื่น ๆ ของ constructMapLikeType เรียก MapLikeType.construct ถูกต้อง)
        // เทสนี้ยืนยันพฤติกรรมที่ "ควรจะเป็น" จึงคาดว่าจะ FAIL บนซอร์สที่มี fault นี้อยู่จริง
        MapLikeType t = tf.constructMapLikeType(PlainMapLike.class, String.class, Integer.class);
        assertEquals("constructMapLikeType(Class,Class,Class) ควรคืนค่าเป็น MapLikeType",
                MapLikeType.class, t.getClass());
    }

    @Test
    public void testConstructSimpleType_deprecatedTwoArg() {
        JavaType strType = tf.constructType(String.class);
        JavaType result = tf.constructSimpleType(GenericHolder.class, new JavaType[] { strType });
        assertEquals(GenericHolder.class, result.getRawClass());
    }

    @Test
    public void testConstructSimpleType_threeArg() {
        JavaType strType = tf.constructType(String.class);
        JavaType result = tf.constructSimpleType(GenericHolder.class, GenericHolder.class,
                new JavaType[] { strType });
        assertEquals(GenericHolder.class, result.getRawClass());
    }

    @Test
    public void testConstructSimpleType_parameterCountMismatchThrows() {
        try {
            tf.constructSimpleType(GenericHolder.class, GenericHolder.class, new JavaType[0]);
            fail("GenericHolder ต้องการ 1 type parameter ควรโยน exception เมื่อให้ 0");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testUncheckedSimpleType_bypassesCoreCache() {
        JavaType t = tf.uncheckedSimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
        assertEquals(SimpleType.class, t.getClass());
        JavaType cached = tf.constructType(String.class);
        assertNotSame(cached, t);
    }

    // ================= I. constructParametrizedType / constructParametricType =================

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_array() {
        JavaType elem = tf.constructType(String.class);
        JavaType result = tf.constructParametrizedType(String[].class, String[].class, elem);
        assertEquals(ArrayType.class, result.getClass());
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_array_wrongCountThrows() {
        JavaType elem = tf.constructType(String.class);
        try {
            tf.constructParametrizedType(String[].class, String[].class, elem, elem);
            fail("array ต้องการ parameter ตัวเดียว");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_map() {
        JavaType k = tf.constructType(String.class);
        JavaType v = tf.constructType(Integer.class);
        JavaType result = tf.constructParametrizedType(HashMap.class, HashMap.class, k, v);
        assertEquals(MapType.class, result.getClass());
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_map_wrongCountThrows() {
        JavaType k = tf.constructType(String.class);
        try {
            tf.constructParametrizedType(HashMap.class, HashMap.class, k);
            fail("Map ต้องการ parameter 2 ตัว");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_collection() {
        JavaType elem = tf.constructType(String.class);
        JavaType result = tf.constructParametrizedType(ArrayList.class, ArrayList.class, elem);
        assertEquals(CollectionType.class, result.getClass());
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_collection_wrongCountThrows() {
        JavaType elem = tf.constructType(String.class);
        try {
            tf.constructParametrizedType(ArrayList.class, ArrayList.class, elem, elem);
            fail("Collection ต้องการ parameter ตัวเดียว");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_simpleType() {
        JavaType strType = tf.constructType(String.class);
        JavaType result = tf.constructParametrizedType(GenericHolder.class, GenericHolder.class, strType);
        assertEquals(GenericHolder.class, result.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_classVarargs_collection() {
        JavaType result = tf.constructParametrizedType(ArrayList.class, ArrayList.class, String.class);
        assertEquals(CollectionType.class, result.getClass());
    }

    @Test
    public void testConstructParametrizedType_classVarargs_map() {
        JavaType result = tf.constructParametrizedType(HashMap.class, HashMap.class, String.class, Integer.class);
        assertEquals(MapType.class, result.getClass());
    }

    @Test
    public void testConstructParametricType_deprecated_classVarargs() {
        JavaType result = tf.constructParametricType(ArrayList.class, String.class);
        assertEquals(CollectionType.class, result.getClass());
    }

    @Test
    public void testConstructParametricType_deprecated_javaTypeVarargs() {
        JavaType elem = tf.constructType(String.class);
        JavaType result = tf.constructParametricType(ArrayList.class, elem);
        assertEquals(CollectionType.class, result.getClass());
    }

    // ================= J. raw variants =================

    @Test
    public void testConstructRawCollectionType() {
        CollectionType t = tf.constructRawCollectionType(ArrayList.class);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType t = tf.constructRawCollectionLikeType(PlainMapLike.class);
        assertEquals(CollectionLikeType.class, t.getClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapType t = tf.constructRawMapType(HashMap.class);
        assertEquals(HashMap.class, t.getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType t = tf.constructRawMapLikeType(PlainMapLike.class);
        assertEquals(MapLikeType.class, t.getClass());
    }

    // ================= K. withModifier =================

    @Test
    public void testWithModifier_null_createsNewInstanceWithSameNullModifiers() {
        TypeFactory modified = tf.withModifier(null);
        assertNotSame(tf, modified);
        assertNull(modified._modifiers);
    }

    @Test
    public void testWithModifier_addFirstModifier() {
        TypeModifier mod = new NoOpTypeModifier();
        TypeFactory modified = tf.withModifier(mod);
        assertNotNull(modified._modifiers);
        assertEquals(1, modified._modifiers.length);
        assertSame(mod, modified._modifiers[0]);
    }

    @Test
    public void testWithModifier_addSecondModifier() {
        TypeModifier mod1 = new NoOpTypeModifier();
        TypeModifier mod2 = new NoOpTypeModifier();
        TypeFactory withOne = tf.withModifier(mod1);
        TypeFactory withTwo = withOne.withModifier(mod2);
        assertEquals(2, withTwo._modifiers.length);
    }
}

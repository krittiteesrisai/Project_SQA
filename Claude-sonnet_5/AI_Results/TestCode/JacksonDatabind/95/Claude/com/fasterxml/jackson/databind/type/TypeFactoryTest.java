package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;

/**
 * JUnit4 test suite for {@link TypeFactory} (Defects4J JacksonDatabind-95b).
 * Test class ถูกวางใน package เดียวกับ target class เพื่อให้เข้าถึง
 * package-private helper classes (TypeModifier, TypeBindings ฯลฯ) ได้ตรงตามซอร์สที่ให้มา
 */
public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    /* ======================================================================
     * Helper generic/test classes
     * ====================================================================== */

    static class Box<T> { }

    static class ArrayBox<T> {
        public T[] items;
    }

    static class WildcardHolder {
        public List<? extends Number> wildcardList;
    }

    interface SelfContainer<T extends SelfContainer<T>> { }

    static class RecursiveImpl implements SelfContainer<RecursiveImpl> { }

    static class RecBound<T extends RecBound<T>> { }

    static class StringKeyMap<V> extends HashMap<String, V> { }

    static class NonGenericStringList extends ArrayList<String> { }

    static class GenericBox<T> implements Comparable<T> {
        @Override
        public int compareTo(T o) { return 0; }
    }

    static class GenBase<T> { }

    static class GenDerived extends GenBase<String> { }

    static class CountingModifier extends TypeModifier {
        int calls = 0;
        @Override
        public JavaType modifyType(JavaType type, Type currentType, TypeBindings bindings,
                TypeFactory typeFactory) {
            calls++;
            return type; // ไม่เปลี่ยนแปลงอะไร
        }
    }

    static class NullReturningModifier extends TypeModifier {
        @Override
        public JavaType modifyType(JavaType type, Type currentType, TypeBindings bindings,
                TypeFactory typeFactory) {
            return null;
        }
    }

    enum Color { RED, GREEN, BLUE }

    /* ======================================================================
     * Singleton / configuration methods
     * ====================================================================== */

    @Test
    public void testDefaultInstanceSingleton() {
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testGetClassLoaderDefaultNull() {
        assertNull(TypeFactory.defaultInstance().getClassLoader());
    }

    @Test
    public void testWithClassLoader() {
        ClassLoader cl = this.getClass().getClassLoader();
        TypeFactory tf2 = typeFactory.withClassLoader(cl);
        assertSame(cl, tf2.getClassLoader());
        // original ไม่เปลี่ยน (immutable pattern)
        assertNull(typeFactory.getClassLoader() == null ? null : typeFactory.getClassLoader());
    }

    @Test
    public void testWithModifierNull_createsNewInstanceNoException() {
        TypeFactory tf2 = typeFactory.withModifier(null);
        assertNotNull(tf2);
        // ยังใช้งานปกติได้
        JavaType t = tf2.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testWithModifierNonNull_isInvoked() {
        CountingModifier mod = new CountingModifier();
        TypeFactory tf2 = typeFactory.withModifier(mod);
        JavaType t = tf2.constructType(String.class);
        assertNotNull(t);
        assertTrue("modifier ต้องถูกเรียกใช้อย่างน้อย 1 ครั้ง", mod.calls > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithModifier_returningNull_throwsIllegalState() {
        TypeFactory tf2 = typeFactory.withModifier(new NullReturningModifier());
        tf2.constructType(String.class);
    }

    @Test
    public void testWithCache() {
        LRUMap<Object, JavaType> cache = new LRUMap<Object, JavaType>(4, 10);
        TypeFactory tf2 = typeFactory.withCache(cache);
        JavaType t = tf2.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testClearCache_noException() {
        typeFactory.constructType(Integer.class);
        typeFactory.clearCache();
        JavaType t2 = typeFactory.constructType(Integer.class);
        assertEquals(Integer.class, t2.getRawClass());
    }

    /* ======================================================================
     * Static helper methods: unknownType(), rawClass()
     * ====================================================================== */

    @Test
    public void testUnknownType_isObjectRawClass() {
        JavaType t = TypeFactory.unknownType();
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testUnknownType_isSingletonFlyweight() {
        assertSame(TypeFactory.unknownType(), TypeFactory.unknownType());
    }

    @Test
    public void testRawClass_withClassInstance() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testRawClass_withParameterizedType() throws Exception {
        Field f = ParamHolder.class.getField("list");
        Type generic = f.getGenericType(); // ParameterizedType: List<String>
        assertEquals(List.class, TypeFactory.rawClass(generic));
    }

    static class ParamHolder {
        public List<String> list;
    }

    /* ======================================================================
     * findClass() / _findPrimitive()
     * ====================================================================== */

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
    public void testFindClass_normalClassWithDot() throws Exception {
        assertEquals(String.class, typeFactory.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_noDotNotPrimitive_throws() throws Exception {
        // ไม่มี '.' และไม่ใช่ primitive ที่รู้จัก -> ต้อง lookup ผ่าน classloader แล้วไม่พบ
        typeFactory.findClass("NotARealPrimitiveOrClass123");
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_invalidClassWithDot_throws() throws Exception {
        typeFactory.findClass("com.foo.bar.NoSuchClassXYZ123");
    }

    /* ======================================================================
     * constructSpecializedType()
     * ====================================================================== */

    @Test
    public void testConstructSpecializedType_sameRawClass_returnsSameInstance() {
        JavaType base = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructSpecializedType(base, String.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructSpecializedType_fromObjectBase() {
        JavaType base = typeFactory.constructType(Object.class);
        JavaType result = typeFactory.constructSpecializedType(base, String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubtype_throws() {
        JavaType base = typeFactory.constructType(String.class);
        typeFactory.constructSpecializedType(base, Integer.class);
    }

    @Test
    public void testConstructSpecializedType_emptyBindingsBranch() {
        // base เป็น raw List (ไม่มี generic parameter) -> bindings.isEmpty() == true
        JavaType base = typeFactory.constructType(List.class);
        JavaType result = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapShortcut_HashMap() {
        JavaType base = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = typeFactory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapShortcut_LinkedHashMap() {
        JavaType base = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = typeFactory.constructSpecializedType(base, LinkedHashMap.class);
        assertEquals(LinkedHashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapShortcut_TreeMap() {
        JavaType base = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = typeFactory.constructSpecializedType(base, TreeMap.class);
        assertEquals(TreeMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_collectionShortcut_ArrayList() {
        JavaType base = typeFactory.constructCollectionType(List.class, String.class);
        JavaType result = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_collectionShortcut_HashSet() {
        JavaType base = typeFactory.constructCollectionType(Collection.class, String.class);
        JavaType result = typeFactory.constructSpecializedType(base, HashSet.class);
        assertEquals(HashSet.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_enumSet_returnsBaseUnchanged() throws Exception {
        JavaType base = typeFactory.constructParametricType(EnumSet.class, Color.class);
        // ใช้ subclass ภายในของ JDK (RegularEnumSet) ที่ไม่อยู่ใน shortcut list
        Class<?> regularEnumSetClass = Class.forName("java.util.RegularEnumSet");
        JavaType result = typeFactory.constructSpecializedType(base, regularEnumSetClass);
        // โค้ดมี "return baseType;" ตรง ๆ โดยไม่ผ่าน withHandlersFrom -> ต้องเป็น instance เดิม
        assertSame(base, result);
    }

    @Test
    public void testConstructSpecializedType_noTypeParamSubclass() {
        JavaType base = typeFactory.constructCollectionType(List.class, String.class);
        JavaType result = typeFactory.constructSpecializedType(base, NonGenericStringList.class);
        assertEquals(NonGenericStringList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_fullTraversal_withPlaceholders() {
        JavaType base = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = typeFactory.constructSpecializedType(base, StringKeyMap.class);
        assertEquals(StringKeyMap.class, result.getRawClass());
    }

    /* ======================================================================
     * constructGeneralizedType()
     * ====================================================================== */

    @Test
    public void testConstructGeneralizedType_sameRawClass() {
        JavaType base = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.constructGeneralizedType(base, ArrayList.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructGeneralizedType_normalSuperType() {
        JavaType base = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.constructGeneralizedType(base, List.class);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType_throws() {
        JavaType base = typeFactory.constructType(ArrayList.class);
        typeFactory.constructGeneralizedType(base, HashMap.class);
    }
    // หมายเหตุ: branch "internal error" (findSuperType null แต่ isAssignableFrom true)
    // ไม่สามารถ trigger ได้ผ่าน public API ตามปกติ จึงไม่ทดสอบ

    /* ======================================================================
     * constructFromCanonical()
     * ====================================================================== */

    @Test
    public void testConstructFromCanonical_simple() {
        JavaType t = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_generic() {
        JavaType t = typeFactory.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, t.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformed_throws() {
        typeFactory.constructFromCanonical("this is not !! valid <<>>");
    }

    /* ======================================================================
     * findTypeParameters()
     * ====================================================================== */

    @Test
    public void testFindTypeParameters_match() {
        JavaType listOfString = typeFactory.constructCollectionType(ArrayList.class, String.class);
        JavaType[] params = typeFactory.findTypeParameters(listOfString, List.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_noMatch_returnsEmpty() {
        JavaType stringType = typeFactory.constructType(String.class);
        JavaType[] params = typeFactory.findTypeParameters(stringType, List.class);
        assertEquals(0, params.length);
    }

    @Test
    public void testFindTypeParametersDeprecated_classExpType() {
        JavaType[] params = typeFactory.findTypeParameters(ArrayList.class, Collection.class);
        assertNotNull(params);
    }

    @Test
    public void testFindTypeParametersDeprecated_classExpTypeBindings() {
        JavaType[] params = typeFactory.findTypeParameters(ArrayList.class, Collection.class,
                TypeBindings.emptyBindings());
        assertNotNull(params);
    }

    /* ======================================================================
     * moreSpecificType()
     * ====================================================================== */

    @Test
    public void testMoreSpecificType_type1Null() {
        JavaType t2 = typeFactory.constructType(String.class);
        assertSame(t2, typeFactory.moreSpecificType(null, t2));
    }

    @Test
    public void testMoreSpecificType_type2Null() {
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
    public void testMoreSpecificType_assignableReturnsType2() {
        JavaType t1 = typeFactory.constructType(Number.class);
        JavaType t2 = typeFactory.constructType(Integer.class);
        assertSame(t2, typeFactory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificType_notRelated_returnsType1() {
        JavaType t1 = typeFactory.constructType(String.class);
        JavaType t2 = typeFactory.constructType(Integer.class);
        assertSame(t1, typeFactory.moreSpecificType(t1, t2));
    }

    /* ======================================================================
     * constructType() overloads
     * ====================================================================== */

    @Test
    public void testConstructType_Class() {
        assertEquals(String.class, typeFactory.constructType(String.class).getRawClass());
    }

    @Test
    public void testConstructType_withExistingJavaType_returnsIdentity() {
        JavaType existing = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructType((Type) existing); // instanceof JavaType branch
        assertSame(existing, result);
    }

    @Test
    public void testConstructType_TypeReference() {
        JavaType t = typeFactory.constructType(new TypeReference<List<String>>() {});
        assertEquals(List.class, t.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedType_throws() {
        Type weird = new Type() { }; // ไม่ใช่ Class/ParameterizedType/JavaType/GenericArrayType/TypeVariable/WildcardType
        typeFactory.constructType(weird);
    }

    @Test
    public void testConstructType_GenericArrayType() throws Exception {
        Field f = ArrayBox.class.getField("items");
        Type generic = f.getGenericType(); // GenericArrayType
        JavaType t = typeFactory.constructType(generic);
        assertTrue(t.isArrayType());
    }

    @Test
    public void testConstructType_WildcardType_viaParameterizedType() throws Exception {
        Field f = WildcardHolder.class.getField("wildcardList");
        Type generic = f.getGenericType(); // List<? extends Number> -> args[0] เป็น WildcardType
        JavaType t = typeFactory.constructType(generic);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeVariable_unbound_resolvesToObject() {
        TypeVariable<?> tv = Box.class.getTypeParameters()[0];
        JavaType t = typeFactory.constructType(tv);
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeVariable_withBindings_found() {
        TypeVariable<?> tv = Box.class.getTypeParameters()[0];
        JavaType boundTo = typeFactory.constructType(String.class);
        TypeBindings bindings = TypeBindings.create(Box.class, boundTo);
        JavaType t = typeFactory.constructType(tv, bindings);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeVariable_recursiveBound_hasUnboundBranch() {
        // T extends RecBound<T> ไม่มี binding ให้ -> ต้องผ่าน hasUnbound()==true branch
        // เพื่อป้องกัน infinite recursion; เราตรวจสอบเพียงว่าไม่มี exception/StackOverflow
        // และผลลัพธ์มี raw class ตรงกับ RecBound
        TypeVariable<?> tv = RecBound.class.getTypeParameters()[0];
        JavaType t = typeFactory.constructType(tv);
        assertEquals(RecBound.class, t.getRawClass());
    }

    @Test
    public void testConstructType_SelfReferentialInterface_noStackOverflow() {
        // ทดสอบ cycle-detection branch ใน _fromClass (context.find(rawType) != null)
        JavaType t = typeFactory.constructType(RecursiveImpl.class);
        assertEquals(RecursiveImpl.class, t.getRawClass());
    }

    @Test
    public void testConstructType_GenericInterfaceResolution_noException() {
        JavaType t = typeFactory.constructType(GenericBox.class);
        assertEquals(GenericBox.class, t.getRawClass());
    }

    /* ---- deprecated overloads ---- */

    @Test
    public void testConstructType_TypeAndClassContext_nullContext() {
        JavaType t = typeFactory.constructType((Type) String.class, (Class<?>) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeAndClassContext_nonNullContext() {
        JavaType t = typeFactory.constructType((Type) String.class, ArrayList.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeAndJavaTypeContext_nullContextType() {
        JavaType t = typeFactory.constructType((Type) String.class, (JavaType) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeAndJavaTypeContext_typeIsClass_skipWhileLoop() {
        JavaType context = typeFactory.constructType(GenDerived.class); // bindings ว่าง
        JavaType t = typeFactory.constructType((Type) String.class, context);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_TypeAndJavaTypeContext_traverseSuperClassForBindings() {
        JavaType context = typeFactory.constructType(GenDerived.class); // GenDerived bindings ว่าง
        TypeVariable<?> tv = GenBase.class.getTypeParameters()[0];
        JavaType t = typeFactory.constructType((Type) tv, context);
        // ต้อง traverse ขึ้น superclass (GenBase<String>) เพื่อหา binding ของ T
        assertEquals(String.class, t.getRawClass());
    }

    /* ======================================================================
     * constructArrayType()
     * ====================================================================== */

    @Test
    public void testConstructArrayType_fromClass() {
        ArrayType t = typeFactory.constructArrayType(int.class);
        assertTrue(t.isArrayType());
        assertEquals(int.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType_fromJavaType() {
        JavaType elem = typeFactory.constructType(String.class);
        ArrayType t = typeFactory.constructArrayType(elem);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    /* ======================================================================
     * constructCollectionType() / constructCollectionLikeType()
     * ====================================================================== */

    @Test
    public void testConstructCollectionType_ClassClass() {
        CollectionType t = typeFactory.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_ClassJavaType() {
        JavaType elem = typeFactory.constructType(Integer.class);
        CollectionType t = typeFactory.constructCollectionType(ArrayList.class, elem);
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_realCollection_directInstance() {
        // List เป็น Collection จริง -> ผลลัพธ์เป็น CollectionType (instanceof CollectionLikeType) โดยตรง
        CollectionLikeType t = typeFactory.constructCollectionLikeType(List.class, String.class);
        assertTrue(t instanceof CollectionType);
    }

    @Test
    public void testConstructCollectionLikeType_notRecognized_upgradeFromBranch() {
        // Iterable ไม่ถูก auto-detect เป็น CollectionLikeType ตามคอมเมนต์ในซอร์ส
        // -> ต้องผ่าน CollectionLikeType.upgradeFrom(...)
        CollectionLikeType t = typeFactory.constructCollectionLikeType(Iterable.class, String.class);
        assertEquals(Iterable.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    /* ======================================================================
     * constructMapType() / constructMapLikeType()
     * ====================================================================== */

    @Test
    public void testConstructMapType_PropertiesSpecialCase() {
        MapType t = typeFactory.constructMapType(Properties.class, Integer.class, Integer.class);
        // ตาม source: rawClass == Properties.class -> kt=vt=CORE_TYPE_STRING เสมอ ไม่ว่าจะส่ง Integer เข้ามา
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_Normal() {
        MapType t = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_JavaTypeOverload() {
        JavaType kt = typeFactory.constructType(String.class);
        JavaType vt = typeFactory.constructType(Integer.class);
        MapType t = typeFactory.constructMapType(HashMap.class, kt, vt);
        assertEquals(HashMap.class, t.getRawClass());
    }

    @Test
    public void testConstructMapLikeType_realMap_directInstance() {
        MapLikeType t = typeFactory.constructMapLikeType(Map.class, String.class, Integer.class);
        assertTrue(t instanceof MapType);
    }

    @Test
    public void testConstructMapLikeType_notRecognized_upgradeFromBranch() {
        // Map.Entry ไม่ถูก auto-detect เป็น MapLikeType ตามคอมเมนต์ในซอร์ส
        MapLikeType t = typeFactory.constructMapLikeType(Map.Entry.class, String.class, Integer.class);
        assertEquals(Map.Entry.class, t.getRawClass());
    }

    /* ======================================================================
     * constructSimpleType(), constructReferenceType(), uncheckedSimpleType()
     * ====================================================================== */

    @Test
    public void testConstructSimpleType_noParams() {
        JavaType t = typeFactory.constructSimpleType(Integer.class, new JavaType[0]);
        assertEquals(Integer.class, t.getRawClass());
    }

    @Test
    public void testConstructSimpleType_deprecatedOverload() {
        JavaType t = typeFactory.constructSimpleType(Integer.class, Object.class, new JavaType[0]);
        assertEquals(Integer.class, t.getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType referred = typeFactory.constructType(String.class);
        JavaType t = typeFactory.constructReferenceType(AtomicReference.class, referred);
        assertEquals(AtomicReference.class, t.getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType t = typeFactory.uncheckedSimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    /* ======================================================================
     * constructParametricType() / constructParametrizedType()
     * ====================================================================== */

    @Test
    public void testConstructParametricType_ClassVarargs() {
        JavaType t = typeFactory.constructParametricType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructParametricType_JavaTypeVarargs() {
        JavaType elem = typeFactory.constructType(String.class);
        JavaType t = typeFactory.constructParametricType(List.class, elem);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_JavaTypeVarargs_deprecated() {
        JavaType elem = typeFactory.constructType(String.class);
        JavaType t = typeFactory.constructParametrizedType(ArrayList.class, List.class, elem);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_ClassVarargs_deprecated() {
        JavaType t = typeFactory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    /* ======================================================================
     * constructRawXxxType()
     * ====================================================================== */

    @Test
    public void testConstructRawCollectionType() {
        CollectionType t = typeFactory.constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType t = typeFactory.constructRawCollectionLikeType(Iterable.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapType t = typeFactory.constructRawMapType(HashMap.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType t = typeFactory.constructRawMapLikeType(Map.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
    }
}

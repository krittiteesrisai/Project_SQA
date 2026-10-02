package com.fasterxml.jackson.databind.type;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
// อยู่ package เดียวกันอยู่แล้ว แต่ import แบบชัดเจนตามข้อกำหนด
import com.fasterxml.jackson.databind.type.TypeFactory;

@SuppressWarnings({"rawtypes", "unchecked"})
public class TypeFactoryTest
{
    // ---------------------------------------------------------------
    // Helper generic fields/methods used only via reflection
    // ---------------------------------------------------------------
    private List<String> listStringField;
    private Map<String, Integer> mapStringIntField;
    private AtomicReference<String> atomicRefStringField;
    private Map.Entry<String, Integer> mapEntryField;
    private List<String>[] arrayOfListField;
    private List<? extends Number> wildcardListField;
    private Box2<String> box2StringField;
    private Pair<String, Integer> pairField;

    private <T> T genericNoBoundMethod() { return null; }
    private <T extends Number> T genericBoundMethod() { return null; }

    private Type fieldType(String name) throws Exception {
        return getClass().getDeclaredField(name).getGenericType();
    }
    private Type methodReturnType(String name) throws Exception {
        return getClass().getDeclaredMethod(name).getGenericReturnType();
    }

    private TypeFactory newFactory() {
        // instance สดใหม่ ไม่มี cache ปนกับ test อื่น (parser=null เพราะไม่เรียก constructFromCanonical)
        return new TypeFactory(null, null);
    }

    // ---------------------------------------------------------------
    // Helper classes for generics/hierarchy scenarios
    // ---------------------------------------------------------------
    static class StringList extends ArrayList<String> {}
    static class RawList extends ArrayList {} // raw usage, ตัดสินใจไม่ parameterize

    static class Base {}
    static class Mid extends Base {}
    static class Leaf extends Mid {}

    static class GenBase<T> {}
    static class GenMid<T> extends GenBase<T> {}
    static class GenLeaf extends GenMid<String> {}

    static class StringIntEntry implements Map.Entry<String, Integer> {
        public String getKey() { return null; }
        public Integer getValue() { return null; }
        public Integer setValue(Integer v) { return null; }
    }
    static class RawEntry implements Map.Entry {
        public Object getKey() { return null; }
        public Object getValue() { return null; }
        public Object setValue(Object v) { return null; }
    }

    static class StringAtomicRefClass extends AtomicReference<String> {}
    static class RawAtomicRefClass extends AtomicReference {} // raw, ไม่ parameterize

    static class Box2<T> extends AtomicReference<T> {}
    static class Pair<K, V> implements Map.Entry<K, V> {
        public K getKey() { return null; }
        public V getValue() { return null; }
        public V setValue(V v) { return null; }
    }

    static class Box<T> {}

    // =================================================================
    // Singleton / withModifier
    // =================================================================

    @Test
    public void defaultInstance_returnsSingleton() {
        assertNotNull(TypeFactory.defaultInstance());
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void withModifier_null_returnsNewInstance() {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeFactory tf2 = tf.withModifier(null);
        assertNotNull(tf2);
        assertNotSame(tf, tf2);
        // ไม่ควร throw และควรยัง construct type ได้ปกติ
        JavaType t = tf2.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void withModifier_addFirstModifier_isInvokedForNonContainerType() {
        final boolean[] called = {false};
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory tf) {
                called[0] = true;
                return type;
            }
        };
        TypeFactory tf = TypeFactory.defaultInstance().withModifier(mod);
        // Integer.class -> SimpleType ธรรมดา ไม่ใช่ container -> ต้องเรียก modifier
        tf.constructType(Integer.class);
        assertTrue("modifier ควรถูกเรียกสำหรับ non-container type", called[0]);
    }

    @Test
    public void withModifier_notInvokedForContainerType() {
        final boolean[] called = {false};
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory tf) {
                called[0] = true;
                return type;
            }
        };
        TypeFactory tf = TypeFactory.defaultInstance().withModifier(mod);
        // ArrayList -> CollectionType -> container type ตามคอมเมนต์ในซอร์ส
        tf.constructType(ArrayList.class);
        assertFalse("modifier ไม่ควรถูกเรียกสำหรับ container type ตาม comment ในซอร์ส", called[0]);
    }

    @Test
    public void withModifier_addSecondModifier_elseBranch() {
        TypeModifier mod1 = new TypeModifier() {
            @Override public JavaType modifyType(JavaType type, Type jdkType, TypeBindings c, TypeFactory tf) { return type; }
        };
        TypeModifier mod2 = new TypeModifier() {
            @Override public JavaType modifyType(JavaType type, Type jdkType, TypeBindings c, TypeFactory tf) { return type; }
        };
        TypeFactory tf1 = TypeFactory.defaultInstance().withModifier(mod1);
        TypeFactory tf2 = tf1.withModifier(mod2); // _modifiers != null -> ArrayBuilders.insertInListNoDup branch
        assertNotNull(tf2);
        JavaType t = tf2.constructType(Long.class);
        assertEquals(Long.class, t.getRawClass());
    }

    @Test
    public void withModifier_null_preservesExistingModifiers() {
        final boolean[] called = {false};
        TypeModifier mod = new TypeModifier() {
            @Override public JavaType modifyType(JavaType type, Type jdkType, TypeBindings c, TypeFactory tf) {
                called[0] = true; return type;
            }
        };
        TypeFactory withMod = TypeFactory.defaultInstance().withModifier(mod);
        TypeFactory tf3 = withMod.withModifier(null); // mod==null branch, แต่ modifiers เดิมไม่ null
        tf3.constructType(Short.class);
        assertTrue("modifiers เดิมควรถูก preserve และเรียกใช้งานต่อ", called[0]);
    }

    // =================================================================
    // clearCache
    // =================================================================

    @Test
    public void clearCache_noExceptionAndStillWorks() {
        TypeFactory tf = newFactory();
        tf.constructType(String.class);
        tf.clearCache();
        JavaType t = tf.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    // =================================================================
    // unknownType / rawClass
    // =================================================================

    @Test
    public void unknownType_returnsObjectSimpleType() {
        JavaType t = TypeFactory.unknownType();
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void rawClass_withPlainClassInstance() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void rawClass_withParameterizedType() throws Exception {
        Type pt = fieldType("listStringField");
        assertTrue(pt instanceof ParameterizedType);
        assertEquals(List.class, TypeFactory.rawClass(pt));
    }

    // =================================================================
    // constructSpecializedType
    // =================================================================

    @Test
    public void constructSpecializedType_sameRawClass_returnsSameInstance() {
        TypeFactory tf = newFactory();
        JavaType base = tf.constructType(String.class);
        JavaType result = tf.constructSpecializedType(base, String.class);
        assertSame(base, result);
    }

    @Test
    public void constructSpecializedType_arraySubclassOfSimpleType() {
        TypeFactory tf = newFactory();
        JavaType base = tf.constructType(Object.class); // SimpleType
        JavaType result = tf.constructSpecializedType(base, String[].class);
        assertEquals(String[].class, result.getRawClass());
        assertEquals(1, result.containedTypeCount());
        assertEquals(String.class, result.containedType(0).getRawClass());
    }

    @Test
    public void constructSpecializedType_collectionSubclassOfSimpleType() {
        TypeFactory tf = newFactory();
        JavaType base = tf.constructType(Object.class); // SimpleType
        JavaType result = tf.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructSpecializedType_incompatibleSubclass_throws() {
        TypeFactory tf = newFactory();
        JavaType base = tf.constructType(String.class); // SimpleType, raw=String
        // ArrayList ไม่ compatible กับ String -> ควร throw
        tf.constructSpecializedType(base, ArrayList.class);
    }

    @Test
    public void constructSpecializedType_nonSimpleBaseType_usesNarrowBy() {
        TypeFactory tf = newFactory();
        JavaType base = tf.constructType(new TypeReference<List<String>>() {}); // CollectionType, ไม่ใช่ SimpleType
        JavaType result = tf.constructSpecializedType(base, ArrayList.class);
        // ไม่แน่ใจใน internal ของ narrowBy 100% แต่ตาม contract ควร narrow ไปยัง subclass ที่ระบุ
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void constructSpecializedType_copiesValueAndTypeHandlers() {
        TypeFactory tf = newFactory();
        JavaType base = tf.constructType(Object.class)
                .withValueHandler("VALUE_HANDLER")
                .withTypeHandler("TYPE_HANDLER");
        JavaType result = tf.constructSpecializedType(base, ArrayList.class);
        assertEquals("VALUE_HANDLER", result.getValueHandler());
        assertEquals("TYPE_HANDLER", result.getTypeHandler());
    }

    // =================================================================
    // constructFromCanonical
    // =================================================================

    @Test
    public void constructFromCanonical_simpleClass() {
        JavaType t = TypeFactory.defaultInstance().constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void constructFromCanonical_genericList() {
        JavaType t = TypeFactory.defaultInstance()
                .constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, t.getRawClass());
        assertEquals(1, t.containedTypeCount());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructFromCanonical_unknownClass_throws() {
        TypeFactory.defaultInstance().constructFromCanonical("com.example.NoSuchClassXyz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructFromCanonical_malformedSyntax_throws() {
        TypeFactory.defaultInstance().constructFromCanonical("java.util.List<java.lang.String");
    }

    // =================================================================
    // findTypeParameters
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void findTypeParameters_classNotSubtype_throws() {
        TypeFactory tf = newFactory();
        tf.findTypeParameters(String.class, List.class);
    }

    @Test
    public void findTypeParameters_classChain_nonGeneric_returnsNull() {
        TypeFactory tf = newFactory();
        // Base/Mid/Leaf ไม่มี generic เลย -> ควรได้ null (supertype.isGeneric()==false)
        JavaType[] result = tf.findTypeParameters(Leaf.class, Base.class);
        assertNull(result);
    }

    @Test
    public void findTypeParameters_classChain_genericResolved() {
        TypeFactory tf = newFactory();
        JavaType[] result = tf.findTypeParameters(GenLeaf.class, GenBase.class);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(String.class, result[0].getRawClass());
    }

    @Test
    public void findTypeParameters_interfaceChain_genericSubclass() {
        TypeFactory tf = newFactory();
        JavaType[] result = tf.findTypeParameters(StringList.class, Collection.class);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(String.class, result[0].getRawClass());
    }

    @Test
    public void findTypeParameters_hashMap_cachePath_missThenHit() {
        TypeFactory tf = newFactory();
        JavaType[] first = tf.findTypeParameters(HashMap.class, Map.class);  // cache miss (_cachedHashMapType==null)
        JavaType[] second = tf.findTypeParameters(HashMap.class, Map.class); // cache hit
        assertNotNull(first);
        assertNotNull(second);
        assertEquals(2, first.length);
        assertEquals(2, second.length);
    }

    @Test
    public void findTypeParameters_arrayList_cachePath_missThenHit() {
        TypeFactory tf = newFactory();
        JavaType[] first = tf.findTypeParameters(ArrayList.class, List.class);  // cache miss
        JavaType[] second = tf.findTypeParameters(ArrayList.class, List.class); // cache hit
        assertNotNull(first);
        assertNotNull(second);
        assertEquals(1, first.length);
        assertEquals(1, second.length);
    }

    @Test
    public void findTypeParameters_generalInterfacePath_notSpecialCased() {
        TypeFactory tf = newFactory();
        // LinkedHashMap != HashMap.class เป๊ะๆ ตาม reference-check ในซอร์ส -> ไปทาง _doFindSuperInterfaceChain ทั่วไป
        JavaType[] result = tf.findTypeParameters(LinkedHashMap.class, Map.class);
        assertNotNull(result);
        assertEquals(2, result.length);
    }

    // =================================================================
    // moreSpecificType
    // =================================================================

    @Test
    public void moreSpecificType_type1Null_returnsType2() {
        TypeFactory tf = newFactory();
        JavaType t2 = tf.constructType(String.class);
        assertSame(t2, tf.moreSpecificType(null, t2));
    }

    @Test
    public void moreSpecificType_type2Null_returnsType1() {
        TypeFactory tf = newFactory();
        JavaType t1 = tf.constructType(String.class);
        assertSame(t1, tf.moreSpecificType(t1, null));
    }

    @Test
    public void moreSpecificType_sameRawClass_returnsType1() {
        TypeFactory tf = newFactory();
        JavaType t1 = tf.constructType(String.class);
        JavaType t2 = tf.constructType(String.class);
        assertSame(t1, tf.moreSpecificType(t1, t2));
    }

    @Test
    public void moreSpecificType_raw1AssignableFromRaw2_returnsType2() {
        TypeFactory tf = newFactory();
        JavaType number = tf.constructType(Number.class);
        JavaType integerType = tf.constructType(Integer.class);
        JavaType result = tf.moreSpecificType(number, integerType);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void moreSpecificType_unrelated_returnsType1() {
        TypeFactory tf = newFactory();
        JavaType str = tf.constructType(String.class);
        JavaType integerType = tf.constructType(Integer.class);
        JavaType result = tf.moreSpecificType(str, integerType);
        assertEquals(String.class, result.getRawClass());
    }

    // =================================================================
    // constructType / _constructType branches
    // =================================================================

    @Test
    public void constructType_class() {
        JavaType t = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void constructType_typeReference() {
        JavaType t = TypeFactory.defaultInstance().constructType(new TypeReference<List<String>>() {});
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void constructType_withNullClassContext() {
        JavaType t = TypeFactory.defaultInstance().constructType(String.class, (Class<?>) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void constructType_withNonNullClassContext() {
        JavaType t = TypeFactory.defaultInstance().constructType(String.class, Object.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void constructType_withNullJavaTypeContext() {
        JavaType t = TypeFactory.defaultInstance().constructType(String.class, (JavaType) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void constructType_javaTypeInput_returnsSameInstance() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType original = tf.constructType(String.class);
        JavaType result = tf.constructType(original); // type instanceof JavaType branch
        assertSame(original, result);
    }

    @Test
    public void constructType_genericArrayType() throws Exception {
        Type t = fieldType("arrayOfListField"); // List<String>[]
        assertTrue(t instanceof GenericArrayType);
        JavaType result = TypeFactory.defaultInstance().constructType(t);
        assertEquals(1, result.containedTypeCount());
        JavaType comp = result.containedType(0);
        assertEquals(List.class, comp.getRawClass());
        assertEquals(String.class, comp.containedType(0).getRawClass());
    }

    @Test
    public void constructType_typeVariable_noContext_resolvesToObjectBound() throws Exception {
        Type t = methodReturnType("genericNoBoundMethod");
        assertTrue(t instanceof TypeVariable);
        JavaType result = TypeFactory.defaultInstance().constructType(t);
        assertEquals(Object.class, result.getRawClass());
    }

    @Test
    public void constructType_typeVariable_bounded_resolvesToBoundClass() throws Exception {
        Type t = methodReturnType("genericBoundMethod");
        assertTrue(t instanceof TypeVariable);
        JavaType result = TypeFactory.defaultInstance().constructType(t);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test
    public void constructType_wildcardType_resolvesUpperBound() throws Exception {
        Type pt = fieldType("wildcardListField"); // List<? extends Number>
        Type wildcard = ((ParameterizedType) pt).getActualTypeArguments()[0];
        assertTrue(wildcard instanceof WildcardType);
        JavaType result = TypeFactory.defaultInstance().constructType(wildcard);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructType_unrecognizedType_throws() {
        Type weird = new Type() { }; // ไม่ตรง instanceof ใดๆที่รู้จัก
        TypeFactory.defaultInstance().constructType(weird);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructType_null_throws() {
        TypeFactory.defaultInstance().constructType((Type) null);
    }

    // =================================================================
    // Direct factory methods
    // =================================================================

    @Test
    public void constructArrayType_fromClass() {
        JavaType t = TypeFactory.defaultInstance().constructArrayType(String.class);
        assertEquals(String[].class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructArrayType_fromJavaType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType elem = tf.constructType(Integer.class);
        JavaType t = tf.constructArrayType(elem);
        assertEquals(Integer[].class, t.getRawClass());
    }

    @Test
    public void constructCollectionType_classes() {
        JavaType t = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructCollectionType_javaType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructCollectionType(ArrayList.class, tf.constructType(Integer.class));
        assertEquals(Integer.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructCollectionLikeType_classes() {
        JavaType t = TypeFactory.defaultInstance().constructCollectionLikeType(Iterator.class, String.class);
        assertEquals(Iterator.class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructMapType_javaTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructMapType(HashMap.class, tf.constructType(String.class), tf.constructType(Integer.class));
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void constructMapType_classes() {
        JavaType t = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void constructMapLikeType_javaTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructMapLikeType(HashMap.class, tf.constructType(String.class), tf.constructType(Integer.class));
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void constructMapLikeType_classes_delegatesToMapTypeConstruct() {
        // หมายเหตุ: ตามซอร์ส method นี้เรียก MapType.construct(...) ไม่ใช่ MapLikeType.construct(...)
        // ทดสอบยืนยัน behavior จริงตามซอร์สโค้ดที่ให้มา (จุดสังเกตความไม่สมมาตรของ API)
        JavaType t = TypeFactory.defaultInstance().constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void constructSimpleType_deprecatedVariant_matchCount() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructSimpleType(List.class, new JavaType[]{ tf.constructType(String.class) });
        assertEquals(List.class, t.getRawClass());
        assertEquals(1, t.containedTypeCount());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructSimpleType_paramCountMismatch_throws() {
        TypeFactory.defaultInstance().constructSimpleType(List.class, new JavaType[0]);
    }

    @Test
    public void constructReferenceType_direct() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType ref = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        assertEquals(AtomicReference.class, ref.getRawClass());
        assertEquals(1, ref.containedTypeCount()); // สมมติฐาน: ReferenceType ใช้ pattern เดียวกับ container อื่นๆ
        assertEquals(String.class, ref.containedType(0).getRawClass());
    }

    @Test
    public void uncheckedSimpleType_basic() {
        JavaType t = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    // =================================================================
    // constructParametrizedType
    // =================================================================

    @Test
    public void constructParametrizedType_array_correctCount() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructParametrizedType(String[].class, String[].class, tf.constructType(String.class));
        assertEquals(String[].class, t.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructParametrizedType_array_wrongCount_throws() {
        TypeFactory tf = TypeFactory.defaultInstance();
        tf.constructParametrizedType(String[].class, String[].class,
                tf.constructType(String.class), tf.constructType(Integer.class));
    }

    @Test
    public void constructParametrizedType_map_correctCount() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructParametrizedType(HashMap.class, Map.class,
                tf.constructType(String.class), tf.constructType(Integer.class));
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructParametrizedType_map_wrongCount_throws() {
        TypeFactory tf = TypeFactory.defaultInstance();
        tf.constructParametrizedType(HashMap.class, Map.class, tf.constructType(String.class));
    }

    @Test
    public void constructParametrizedType_collection_correctCount() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructParametrizedType(ArrayList.class, List.class, tf.constructType(String.class));
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructParametrizedType_collection_wrongCount_throws() {
        TypeFactory tf = TypeFactory.defaultInstance();
        tf.constructParametrizedType(ArrayList.class, List.class,
                tf.constructType(String.class), tf.constructType(Integer.class));
    }

    @Test
    public void constructParametrizedType_simpleGenericClass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructParametrizedType(Box.class, Box.class, tf.constructType(String.class));
        assertEquals(Box.class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructParametrizedType_classVarargsOverload() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t = tf.constructParametrizedType(Box.class, Box.class, String.class);
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructParametricType_deprecatedOverloads() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType t1 = tf.constructParametricType(Box.class, String.class);
        assertEquals(String.class, t1.containedType(0).getRawClass());

        JavaType t2 = tf.constructParametricType(Box.class, tf.constructType(Integer.class));
        assertEquals(Integer.class, t2.containedType(0).getRawClass());
    }

    // =================================================================
    // Raw variants
    // =================================================================

    @Test
    public void constructRawCollectionType_unknownElement() {
        JavaType t = TypeFactory.defaultInstance().constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructRawMapType_unknownKeyValue() {
        JavaType t = TypeFactory.defaultInstance().constructRawMapType(HashMap.class);
        assertEquals(Object.class, t.containedType(0).getRawClass());
        assertEquals(Object.class, t.containedType(1).getRawClass());
    }

    @Test
    public void constructRawCollectionLikeType_unknownElement() {
        JavaType t = TypeFactory.defaultInstance().constructRawCollectionLikeType(Iterator.class);
        assertEquals(Object.class, t.containedType(0).getRawClass());
    }

    @Test
    public void constructRawMapLikeType_unknownKeyValue() {
        JavaType t = TypeFactory.defaultInstance().constructRawMapLikeType(Properties.class);
        assertEquals(Object.class, t.containedType(0).getRawClass());
        assertEquals(Object.class, t.containedType(1).getRawClass());
    }

    // =================================================================
    // _fromClass branches (ทดสอบผ่าน constructType(Class))
    // =================================================================

    @Test
    public void fromClass_coreString() {
        JavaType t = newFactory().constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void fromClass_corePrimitives() {
        TypeFactory tf = newFactory();
        assertEquals(Boolean.TYPE, tf.constructType(Boolean.TYPE).getRawClass());
        assertEquals(Integer.TYPE, tf.constructType(Integer.TYPE).getRawClass());
        assertEquals(Long.TYPE, tf.constructType(Long.TYPE).getRawClass());
    }

    @Test
    public void fromClass_cacheReturnsEqualResultOnSecondCall() {
        TypeFactory tf = newFactory();
        JavaType first = tf.constructType(GenLeaf.class);   // ครั้งแรก: cache miss
        JavaType second = tf.constructType(GenLeaf.class);  // ครั้งสอง: cache hit
        assertEquals(first.getRawClass(), second.getRawClass());
    }

    @Test
    public void fromClass_array() {
        JavaType t = newFactory().constructType(int[].class);
        assertEquals(int[].class, t.getRawClass());
        assertEquals(Integer.TYPE, t.containedType(0).getRawClass());
    }

    @Test
    public void fromClass_enum() {
        JavaType t = newFactory().constructType(java.util.concurrent.TimeUnit.class);
        assertEquals(java.util.concurrent.TimeUnit.class, t.getRawClass());
    }

    @Test
    public void fromClass_mapRawInterface() {
        JavaType t = newFactory().constructType(Map.class);
        assertEquals(Map.class, t.getRawClass());
    }

    @Test
    public void fromClass_collectionRawInterface() {
        JavaType t = newFactory().constructType(Collection.class);
        assertEquals(Collection.class, t.getRawClass());
    }

    @Test
    public void fromClass_atomicReference_classSubtype_resolvesCorrectly() {
        // ผ่าน _fromClass: ใช้ findTypeParameters(clz, AtomicReference.class) เงื่อนไข "!=1 ? unknown : pts[0]" (ถูกต้อง)
        JavaType t = newFactory().constructType(StringAtomicRefClass.class);
        assertEquals(1, t.containedTypeCount());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void fromClass_atomicReference_rawSubtype_noGenerics_unknown() {
        JavaType t = newFactory().constructType(RawAtomicRefClass.class);
        assertEquals(Object.class, t.containedType(0).getRawClass());
    }

    @Test
    public void fromClass_mapEntry_classImplementation_resolvesCorrectly() {
        JavaType t = newFactory().constructType(StringIntEntry.class);
        assertEquals(2, t.containedTypeCount());
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void fromClass_mapEntry_rawImplementation_unknown() {
        JavaType t = newFactory().constructType(RawEntry.class);
        assertEquals(Object.class, t.containedType(0).getRawClass());
        assertEquals(Object.class, t.containedType(1).getRawClass());
    }

    @Test
    public void fromClass_defaultSimpleType_forPlainClass() {
        JavaType t = newFactory().constructType(Box.class);
        assertEquals(Box.class, t.getRawClass());
    }

    // =================================================================
    // _fromParamType (ParameterizedType) branches - รวมจุดที่คาดว่าเป็น defect (19b)
    // =================================================================

    @Test
    public void fromParamType_mapDirect_resolvesKeyValue() throws Exception {
        Type pt = fieldType("mapStringIntField"); // Map<String,Integer>
        JavaType t = TypeFactory.defaultInstance().constructType(pt);
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void fromParamType_collectionDirect_resolvesElement() throws Exception {
        Type pt = fieldType("listStringField"); // List<String>
        JavaType t = TypeFactory.defaultInstance().constructType(pt);
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void fromParamType_atomicReferenceDirect_resolvesReferencedType() throws Exception {
        Type pt = fieldType("atomicRefStringField"); // AtomicReference<String> ; rawType==AtomicReference.class
        JavaType t = TypeFactory.defaultInstance().constructType(pt);
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void fromParamType_atomicReferenceSubtypeGeneric_currentSourceBehavior() throws Exception {
        // จุดที่คาดว่าเป็น known defect: เงื่อนไข "pts.length != 1" ทำให้ rt ไม่ถูก assign
        // เมื่อ pts.length == 1 (กรณีปกติ) จึง fallback เป็น unknownType() (Object)
        // เทสต์นี้ยืนยัน behavior จริงตามซอร์สโค้ดที่ให้มา ไม่ใช่ behavior ที่ "ถูกต้องตามสัญชาตญาณ"
        Type pt = fieldType("box2StringField"); // Box2<String> extends AtomicReference<T>
        JavaType t = TypeFactory.defaultInstance().constructType(pt);
        assertEquals(1, t.containedTypeCount());
        assertEquals(Object.class, t.containedType(0).getRawClass()); // ตามซอร์สโค้ดปัจจุบัน (ไม่ resolve เป็น String)
    }

    @Test
    public void fromParamType_mapEntryDirect_resolvesKeyValue() throws Exception {
        Type pt = fieldType("mapEntryField"); // Map.Entry<String,Integer> ; rawType==Map.Entry.class
        JavaType t = TypeFactory.defaultInstance().constructType(pt);
        assertEquals(2, t.containedTypeCount());
        assertEquals(String.class, t.containedType(0).getRawClass());
        assertEquals(Integer.class, t.containedType(1).getRawClass());
    }

    @Test
    public void fromParamType_mapEntrySubtypeGeneric_currentSourceBehavior() throws Exception {
        // เช่นเดียวกับ AtomicReference: เงื่อนไข "pts.length != 2" ทำให้ kt/vt ไม่ถูก assign
        // เมื่อ pts.length == 2 (กรณีปกติ) จึง fallback เป็น unknownType() ทั้งคู่
        Type pt = fieldType("pairField"); // Pair<String,Integer> implements Map.Entry<K,V>
        JavaType t = TypeFactory.defaultInstance().constructType(pt);
        assertEquals(2, t.containedTypeCount());
        assertEquals(Object.class, t.containedType(0).getRawClass()); // ตามซอร์สโค้ดปัจจุบัน
        assertEquals(Object.class, t.containedType(1).getRawClass()); // ตามซอร์สโค้ดปัจจุบัน
    }
}

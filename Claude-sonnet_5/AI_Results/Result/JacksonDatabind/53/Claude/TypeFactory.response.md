# TypeFactoryTest.java

หมายเหตุสำคัญ: วางคลาสทดสอบไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.type`) เพื่อให้สามารถเข้าถึง field/constructor ระดับ `protected`/package-private (เช่น `CORE_TYPE_STRING`, `_modifiers`) สำหรับใช้ตรวจสอบผลลัพธ์ภายใน ตามหลัก white-box testing โดยยังคง `import` คลาสเป้าหมายตามข้อกำหนด

```java
package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory; // import ตามข้อกำหนด (redundant เพราะ same package แต่ compile ได้)

public class TypeFactoryTest {

    private final TypeFactory factory = TypeFactory.defaultInstance();

    // ---------- Helper classes สำหรับ reflection-based generic tests ----------
    private static class GenHolder<T extends Number> {
        public List<String> listField;
        public T varField;
        public T[] arrField;
        public List<? extends Number> wildcardField;
    }

    private interface MyGenericIfc<T> { }
    private static class MyGenericImpl implements MyGenericIfc<String> { }
    private static class MyGenericGenericImpl<X> implements MyGenericIfc<X> { }
    private static abstract class MyAbstractGeneric<T> { }
    private static class MyConcreteGeneric<X> extends MyAbstractGeneric<X> { }

    private enum DummyEnum { A, B }

    // =========================================================
    // findClass / _findPrimitive
    // =========================================================

    @Test
    public void findClass_primitiveTypes_allBranches() throws Exception {
        assertEquals(Integer.TYPE, factory.findClass("int"));
        assertEquals(Long.TYPE, factory.findClass("long"));
        assertEquals(Float.TYPE, factory.findClass("float"));
        assertEquals(Double.TYPE, factory.findClass("double"));
        assertEquals(Boolean.TYPE, factory.findClass("boolean"));
        assertEquals(Byte.TYPE, factory.findClass("byte"));
        assertEquals(Character.TYPE, factory.findClass("char"));
        assertEquals(Short.TYPE, factory.findClass("short"));
        assertEquals(Void.TYPE, factory.findClass("void"));
    }

    @Test
    public void findClass_withDot_validClass() throws Exception {
        assertEquals(String.class, factory.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void findClass_withDot_invalidClass() throws Exception {
        factory.findClass("no.such.Class.Really");
    }

    @Test(expected = ClassNotFoundException.class)
    public void findClass_noDot_notPrimitive_invalid() throws Exception {
        factory.findClass("NotARealClassXYZ");
    }

    @Test
    public void findClass_withCustomClassLoader_fallbackSucceeds() throws Exception {
        // loader != null branch, loader.loadClass ล้มเหลว -> fallback ไป classForName(name) สำเร็จ
        ClassLoader throwing = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                throw new ClassNotFoundException("forced failure");
            }
        };
        TypeFactory withLoader = factory.withClassLoader(throwing);
        Class<?> c = withLoader.findClass("java.lang.String");
        assertEquals(String.class, c);
    }

    // =========================================================
    // withClassLoader / withModifier / defaultInstance / unknownType / rawClass / clearCache
    // =========================================================

    @Test
    public void withClassLoader_setsClassLoader() {
        ClassLoader cl = new ClassLoader() { };
        TypeFactory f2 = factory.withClassLoader(cl);
        assertSame(cl, f2.getClassLoader());
        assertNull(factory.getClassLoader()); // default instance ไม่มี classloader
    }

    @Test
    public void withModifier_nullMod_keepsModifiersAsIs() {
        TypeFactory f2 = factory.withModifier(null);
        assertNull(f2._modifiers); // default instance ไม่มี modifier -> ยังคง null
    }

    @Test
    public void withModifier_firstModifier_and_secondModifier_noDup() {
        TypeModifier mod1 = noOpModifier();
        TypeModifier mod2 = noOpModifier();

        TypeFactory f1 = factory.withModifier(mod1);
        assertNotNull(f1._modifiers);
        assertEquals(1, f1._modifiers.length);

        TypeFactory f2 = f1.withModifier(mod2);
        assertEquals(2, f2._modifiers.length);

        // เพิ่ม mod1 ซ้ำ -> ArrayBuilders.insertInListNoDup ไม่ควรเพิ่มซ้ำ
        TypeFactory f3 = f2.withModifier(mod1);
        assertEquals(2, f3._modifiers.length);
    }

    @Test
    public void modifier_noOp_doesNotBreakConstruction() {
        TypeFactory f = factory.withModifier(noOpModifier());
        JavaType t = f.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test(expected = IllegalStateException.class)
    public void modifier_returningNull_throwsIllegalState() {
        TypeModifier badMod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings,
                    TypeFactory tf) {
                return null; // ตาม source: ต้อง throw IllegalStateException
            }
        };
        TypeFactory f = factory.withModifier(badMod);
        f.constructType(String.class);
    }

    private TypeModifier noOpModifier() {
        return new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings,
                    TypeFactory tf) {
                return type;
            }
        };
    }

    @Test
    public void defaultInstance_and_unknownType() {
        assertSame(TypeFactory.instance, TypeFactory.defaultInstance());
        assertSame(TypeFactory.CORE_TYPE_OBJECT, TypeFactory.unknownType());
    }

    @Test
    public void rawClass_classInstance_directReturn() {
        assertSame(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void rawClass_nonClassType_resolvesViaConstructType() throws Exception {
        Type t = GenHolder.class.getField("listField").getGenericType(); // ParameterizedType
        assertEquals(List.class, TypeFactory.rawClass(t));
    }

    @Test
    public void clearCache_noException() {
        factory.clearCache(); // เพียงยืนยันไม่มี exception
    }

    // =========================================================
    // constructType(Type) - class / parameterized / array / variable / wildcard
    // =========================================================

    @Test
    public void constructType_class_simple() {
        JavaType t = factory.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void constructType_javaType_passthrough() {
        JavaType original = factory.constructType(String.class);
        // type instanceof JavaType -> คืนตัวเดิมทันที (ไม่ผ่าน modifier loop)
        JavaType result = factory.constructType((Type) original);
        assertSame(original, result);
    }

    @Test
    public void constructType_parameterizedType_viaReflection() throws Exception {
        Type t = GenHolder.class.getField("listField").getGenericType();
        JavaType jt = factory.constructType(t);
        assertEquals(List.class, jt.getRawClass());
        assertTrue(jt instanceof CollectionType);
        assertEquals(String.class, ((CollectionType) jt).getContentType().getRawClass());
    }

    @Test
    public void constructType_genericArrayType_viaReflection() throws Exception {
        Type t = GenHolder.class.getField("arrField").getGenericType(); // T[] ; T extends Number
        JavaType jt = factory.constructType(t);
        assertTrue(jt.isArrayType());
        // T ไม่มี binding -> ใช้ bound แรกคือ Number
        assertEquals(Number.class, ((ArrayType) jt).getContentType().getRawClass());
    }

    @Test
    public void constructType_typeVariable_resolvedViaBound() throws Exception {
        Type t = GenHolder.class.getField("varField").getGenericType(); // bare TypeVariable T
        JavaType jt = factory.constructType(t);
        assertEquals(Number.class, jt.getRawClass());
    }

    @Test
    public void constructType_wildcardType_resolvedViaUpperBound() throws Exception {
        Type listType = GenHolder.class.getField("wildcardField").getGenericType();
        Type wildcard = ((ParameterizedType) listType).getActualTypeArguments()[0];
        assertTrue(wildcard instanceof WildcardType);
        JavaType jt = factory.constructType(wildcard);
        assertEquals(Number.class, jt.getRawClass());
    }

    @Test
    public void constructType_listOfWildcard_contentResolved() throws Exception {
        Type listType = GenHolder.class.getField("wildcardField").getGenericType();
        JavaType jt = factory.constructType(listType);
        assertEquals(List.class, jt.getRawClass());
        assertEquals(Number.class, ((CollectionType) jt).getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromAny_unrecognizedType_throws() {
        // ไม่มี Type ชนิดแปลกให้สร้างง่าย ๆ ผ่าน public API โดยตรง
        // จึงจำลองด้วย custom Type implementation ที่ไม่ตรงกับ case ใดเลย
        Type strange = new Type() { };
        factory.constructType(strange);
    }

    @Test
    public void constructType_typeReference() {
        TypeReference<List<String>> ref = new TypeReference<List<String>>() { };
        JavaType jt = factory.constructType(ref);
        assertEquals(List.class, jt.getRawClass());
        assertEquals(String.class, ((CollectionType) jt).getContentType().getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void constructType_deprecated_withContextClass() {
        JavaType t1 = factory.constructType(String.class, (Class<?>) null);
        assertEquals(String.class, t1.getRawClass());
        JavaType t2 = factory.constructType(String.class, Object.class);
        assertEquals(String.class, t2.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void constructType_deprecated_withContextType() {
        JavaType t1 = factory.constructType(String.class, (JavaType) null);
        assertEquals(String.class, t1.getRawClass());
        JavaType t2 = factory.constructType(String.class, factory.constructType(Object.class));
        assertEquals(String.class, t2.getRawClass());
    }

    // =========================================================
    // constructSpecializedType
    // =========================================================

    @Test
    public void specializedType_sameRawClass_returnsBaseType() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType result = factory.constructSpecializedType(base, ArrayList.class);
        assertSame(base, result);
    }

    @Test
    public void specializedType_rawBaseIsObject() {
        JavaType base = factory.constructType(Object.class);
        JavaType result = factory.constructSpecializedType(base, String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void specializedType_notAssignable_throws() {
        JavaType base = factory.constructType(Number.class);
        factory.constructSpecializedType(base, String.class);
    }

    @Test
    public void specializedType_emptyBindings_shortcut() {
        JavaType base = factory.constructType(Number.class);
        JavaType result = factory.constructSpecializedType(base, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void specializedType_mapLikeShortcut() {
        JavaType base = factory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = factory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
        assertTrue(result instanceof MapLikeType);
        assertEquals(String.class, ((MapLikeType) result).getKeyType().getRawClass());
        assertEquals(Integer.class, ((MapLikeType) result).getContentType().getRawClass());
    }

    @Test
    public void specializedType_collectionLikeShortcut() {
        JavaType base = factory.constructCollectionType(List.class, String.class);
        JavaType result = factory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
        assertEquals(String.class, ((CollectionLikeType) result).getContentType().getRawClass());
    }

    @Test
    public void specializedType_enumSetShortcut_returnsBaseTypeRegardlessOfSubclass() {
        // ตาม source: ถ้า rawBase == EnumSet.class จะ return baseType ตรง ๆ
        // โดยไม่สนใจ subclass จริง (อาจดูเหมือน "แปลก" แต่เป็น behavior ที่ระบุใน source)
        JavaType base = factory.constructCollectionLikeType(EnumSet.class, DummyEnum.class);
        Class<?> concreteEnumSetImpl = EnumSet.noneOf(DummyEnum.class).getClass();
        JavaType result = factory.constructSpecializedType(base, concreteEnumSetImpl);
        assertSame(base, result);
    }

    @Test
    public void specializedType_typeParamCountZero_shortcut() {
        JavaType base = factory.constructParametricType(MyGenericIfc.class, String.class);
        JavaType result = factory.constructSpecializedType(base, MyGenericImpl.class);
        assertEquals(MyGenericImpl.class, result.getRawClass());
    }

    @Test
    public void specializedType_interfaceRefinePath_noException() {
        JavaType base = factory.constructParametricType(MyGenericIfc.class, String.class);
        // ไม่ mock ผลลัพธ์ภายในของ refine() แบบละเอียด เพราะไม่สามารถยืนยัน exact behavior
        // จาก source ได้ชัดเจน 100% (ส่วน "forward+backwards resolution" เป็น TODO ในซอร์ส)
        JavaType result = factory.constructSpecializedType(base, MyGenericGenericImpl.class);
        assertEquals(MyGenericGenericImpl.class, result.getRawClass());
    }

    @Test
    public void specializedType_nonInterfaceRefinePath_noException() {
        JavaType base = factory.constructParametricType(MyAbstractGeneric.class, String.class);
        JavaType result = factory.constructSpecializedType(base, MyConcreteGeneric.class);
        assertEquals(MyConcreteGeneric.class, result.getRawClass());
    }

    // =========================================================
    // constructGeneralizedType
    // =========================================================

    @Test
    public void generalizedType_sameClass_returnsBaseType() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType result = factory.constructGeneralizedType(base, ArrayList.class);
        assertSame(base, result);
    }

    @Test
    public void generalizedType_validSuperType() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType result = factory.constructGeneralizedType(base, List.class);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void generalizedType_notRelated_throws() {
        JavaType base = factory.constructType(String.class);
        factory.constructGeneralizedType(base, List.class);
    }

    // =========================================================
    // constructFromCanonical
    // =========================================================

    @Test
    public void canonical_simpleType() {
        JavaType t = factory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void canonical_parametrizedType() {
        JavaType t = factory.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, ((CollectionType) t).getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void canonical_malformed_throws() {
        factory.constructFromCanonical("java.util.List<java.lang.String"); // ไม่ปิด '>'
    }

    @Test(expected = IllegalArgumentException.class)
    public void canonical_unknownClass_throws() {
        factory.constructFromCanonical("some.totally.Unknown.ClassName");
    }

    // =========================================================
    // findTypeParameters
    // =========================================================

    @Test
    public void findTypeParameters_matchFound() {
        JavaType listOfString = factory.constructCollectionType(List.class, String.class);
        JavaType[] params = factory.findTypeParameters(listOfString, Collection.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void findTypeParameters_noMatch_returnsEmpty() {
        JavaType strType = factory.constructType(String.class);
        JavaType[] params = factory.findTypeParameters(strType, List.class);
        assertEquals(0, params.length);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void findTypeParameters_deprecatedOverloads() {
        JavaType[] p1 = factory.findTypeParameters(List.class, Collection.class);
        assertEquals(1, p1.length); // Object (raw List)
        JavaType[] p2 = factory.findTypeParameters(List.class, Collection.class,
                TypeFactory.EMPTY_BINDINGS);
        assertEquals(1, p2.length);
    }

    // =========================================================
    // moreSpecificType
    // =========================================================

    @Test
    public void moreSpecificType_firstNull() {
        JavaType t2 = factory.constructType(String.class);
        assertSame(t2, factory.moreSpecificType(null, t2));
    }

    @Test
    public void moreSpecificType_secondNull() {
        JavaType t1 = factory.constructType(String.class);
        assertSame(t1, factory.moreSpecificType(t1, null));
    }

    @Test
    public void moreSpecificType_sameRawClass() {
        JavaType t1 = factory.constructType(String.class);
        JavaType t2 = factory.constructType(String.class);
        assertSame(t1, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void moreSpecificType_assignable_returnsSecond() {
        JavaType t1 = factory.constructType(Number.class);
        JavaType t2 = factory.constructType(Integer.class);
        assertSame(t2, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void moreSpecificType_notAssignable_returnsFirst() {
        JavaType t1 = factory.constructType(Integer.class);
        JavaType t2 = factory.constructType(Number.class); // Integer ไม่ assignable from Number
        assertSame(t1, factory.moreSpecificType(t1, t2));
    }

    // =========================================================
    // Direct factory methods
    // =========================================================

    @Test
    public void constructArrayType_fromClass() {
        ArrayType t = factory.constructArrayType(String.class);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructArrayType_fromJavaType() {
        JavaType elem = factory.constructType(Integer.class);
        ArrayType t = factory.constructArrayType(elem);
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructCollectionType_classClass() {
        CollectionType t = factory.constructCollectionType(List.class, String.class);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructCollectionType_classJavaType() {
        CollectionType t = factory.constructCollectionType(List.class, factory.constructType(Integer.class));
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructCollectionLikeType_actualCollection_instanceofTrueBranch() {
        CollectionLikeType t = factory.constructCollectionLikeType(List.class, String.class);
        assertTrue(t instanceof CollectionType);
    }

    private static class MyBox<T> { } // ไม่ใช่ Collection จริง -> ใช้ทดสอบ upgradeFrom branch

    @Test
    public void constructCollectionLikeType_nonCollection_upgradeBranch() {
        CollectionLikeType t = factory.constructCollectionLikeType(MyBox.class, String.class);
        assertEquals(MyBox.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructMapType_properties_specialCase() {
        MapType t = factory.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructMapType_normalCase() {
        MapType t = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructMapType_javaTypeOverload() {
        MapType t = factory.constructMapType(HashMap.class,
                factory.constructType(String.class), factory.constructType(Integer.class));
        assertEquals(String.class, t.getKeyType().getRawClass());
    }

    private static class MyPair<K, V> { } // ไม่ใช่ Map จริง -> ใช้ทดสอบ upgradeFrom branch

    @Test
    public void constructMapLikeType_nonMap_upgradeBranch() {
        MapLikeType t = factory.constructMapLikeType(MyPair.class, String.class, Integer.class);
        assertEquals(MyPair.class, t.getRawClass());
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructMapLikeType_actualMap_instanceofTrueBranch() {
        MapLikeType t = factory.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertTrue(t instanceof MapType);
    }

    @Test
    public void constructSimpleType_basic() {
        JavaType t = factory.constructSimpleType(List.class,
                new JavaType[] { factory.constructType(String.class) });
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void constructSimpleType_deprecatedOverload() {
        JavaType t = factory.constructSimpleType(List.class, List.class,
                new JavaType[] { factory.constructType(String.class) });
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void constructReferenceType_basic() {
        ReferenceType t = factory.constructReferenceType(AtomicReference.class,
                factory.constructType(String.class));
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void uncheckedSimpleType_wellKnown_returnsSingleton() {
        JavaType t = factory.uncheckedSimpleType(String.class);
        assertSame(TypeFactory.CORE_TYPE_STRING, t);
    }

    private static class PlainClass { }

    @Test
    public void uncheckedSimpleType_nonWellKnown_createsNewSimpleType() {
        JavaType t = factory.uncheckedSimpleType(PlainClass.class);
        assertTrue(t instanceof SimpleType);
        assertEquals(PlainClass.class, t.getRawClass());
    }

    @Test
    public void constructParametricType_fromClasses() {
        JavaType t = factory.constructParametricType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void constructParametricType_fromJavaTypes() {
        JavaType t = factory.constructParametricType(Map.class,
                factory.constructType(String.class), factory.constructType(Integer.class));
        assertEquals(Map.class, t.getRawClass());
    }

    @Test
    public void constructParametrizedType_javaTypeVariant() {
        JavaType t = factory.constructParametrizedType(ArrayList.class, List.class,
                factory.constructType(String.class));
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void constructParametrizedType_classVariant() {
        JavaType t = factory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    // =========================================================
    // Raw (unparameterized) variants
    // =========================================================

    @Test
    public void constructRawCollectionType() {
        CollectionType t = factory.constructRawCollectionType(List.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructRawCollectionLikeType() {
        CollectionLikeType t = factory.constructRawCollectionLikeType(MyBox.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructRawMapType() {
        MapType t = factory.constructRawMapType(HashMap.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void constructRawMapLikeType() {
        MapLikeType t = factory.constructRawMapLikeType(MyPair.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
    }

    // =========================================================
    // _fromWellKnownClass / _fromWellKnownInterface (ผ่าน public API โดยอ้อม)
    // =========================================================

    @Test
    public void fromClass_rawMapInterface_unknownTypeParams() {
        JavaType t = factory.constructType(Map.class); // raw, ไม่มี generic -> typeParams.size()==0
        assertTrue(t instanceof MapType);
        assertEquals(Object.class, ((MapType) t).getKeyType().getRawClass());
    }

    @Test
    public void fromClass_rawCollectionInterface_unknownTypeParam() {
        JavaType t = factory.constructType(Collection.class);
        assertTrue(t instanceof CollectionType);
        assertEquals(Object.class, ((CollectionType) t).getContentType().getRawClass());
    }

    @Test
    public void fromClass_rawAtomicReference_unknownTypeParam() {
        JavaType t = factory.constructType(AtomicReference.class);
        assertTrue(t instanceof ReferenceType);
        assertEquals(Object.class, ((ReferenceType) t).getContentType().getRawClass());
    }

    // interface ที่ extends Map แบบ raw -> เข้า path _fromWellKnownInterface (loop superInterfaces)
    private interface MyMapIfc extends Map<String, Integer> { }
    private static class MyMapImpl implements MyMapIfc {
        public int size() { return 0; }
        public boolean isEmpty() { return true; }
        public boolean containsKey(Object k) { return false; }
        public boolean containsValue(Object v) { return false; }
        public Integer get(Object k) { return null; }
        public Integer put(String k, Integer v) { return null; }
        public Integer remove(Object k) { return null; }
        public void putAll(Map<? extends String, ? extends Integer> m) { }
        public void clear() { }
        public Set<String> keySet() { return null; }
        public Collection<Integer> values() { return null; }
        public Set<Entry<String, Integer>> entrySet() { return null; }
    }

    @Test
    public void fromClass_wellKnownInterfaceViaSuperInterfaceLoop() {
        // MyMapImpl ไม่ extends AbstractMap แต่ implements MyMapIfc (extends Map<String,Integer>)
        // คาดหวังว่า TypeFactory เดินทะลุ _fromWellKnownInterface loop เพื่อ refine เป็น MapType
        JavaType t = factory.constructType(MyMapImpl.class);
        assertEquals(MyMapImpl.class, t.getRawClass());
        // ไม่ assert ลึกกว่านี้เกี่ยวกับ key/value type เพราะ resolution ผ่าน interface hierarchy
        // มีความซับซ้อนภายในที่ไม่ได้ระบุชัดใน source (คอมเมนต์กำกับความไม่มั่นใจ)
    }

    // =========================================================
    // ArrayBuilders / recursive self-reference (ClassStack) - ทดสอบผ่าน constructType บน recursive generic
    // =========================================================

    private static class Node<T> {
        public Node<T> next; // self-referential generic -> ทดสอบ ClassStack self-reference path
    }

    @Test
    public void constructType_selfReferentialGeneric_noInfiniteLoop() {
        JavaType t = factory.constructType(Node.class);
        assertEquals(Node.class, t.getRawClass());
        // เพียงยืนยันว่าไม่เกิด StackOverflow/infinite loop จาก self-reference handling
    }
}
```

## ตารางสรุปการครอบคลุม (Branch/Condition Coverage)

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `findClass_primitiveTypes_allBranches` | `_findPrimitive` ทุก `if` (int,long,float,double,boolean,byte,char,short,void) |
| `findClass_withDot_validClass/invalidClass` | เงื่อนไข `className.indexOf('.') < 0` = false, success/failure path |
| `findClass_noDot_notPrimitive_invalid` | `indexOf('.')<0` = true, primitive=null, loader lookup fail ทั้งสองครั้ง |
| `findClass_withCustomClassLoader_fallbackSucceeds` | `loader != null` = true, lookup ล้มเหลว → fallback `classForName(name)` สำเร็จ |
| `withClassLoader_setsClassLoader` | สร้าง instance ใหม่พร้อม classLoader ที่กำหนด |
| `withModifier_nullMod_*` / `withModifier_firstModifier_*` | `mod==null`, `_modifiers==null`, `_modifiers!=null` (insertInListNoDup) |
| `modifier_noOp_*` / `modifier_returningNull_throws` | loop `for (TypeModifier mod : _modifiers)`, `t==null` throw `IllegalStateException` |
| `defaultInstance_and_unknownType` | static singleton, `_unknownType()` |
| `rawClass_*` | `t instanceof Class` true/false |
| `constructType_class_simple/javaType_passthrough/parameterizedType/genericArrayType/typeVariable/wildcardType` | ทุก branch ของ `_fromAny` (Class, ParameterizedType, JavaType, GenericArrayType, TypeVariable, WildcardType) |
| `fromAny_unrecognizedType_throws` | else-branch `throw new IllegalArgumentException` |
| `constructType_typeReference` / deprecated overloads | `constructType(TypeReference)`, `contextClass==null`/`!=null`, `contextType==null`/`!=null` |
| `specializedType_*` (9 tests) | ทุก branch ใน `constructSpecializedType`: same class, rawBase==Object, not-assignable throw, empty-bindings shortcut, map-like/collection-like shortcut, EnumSet shortcut, typeParamCount==0, interface refine, non-interface refine |
| `generalizedType_*` (3 tests) | same class, valid super, not-related throw |
| `canonical_*` (4 tests) | simple, parametrized, malformed throw, unknown-class throw |
| `findTypeParameters_*` (3 tests) | match found, no match (NO_TYPES), deprecated overloads |
| `moreSpecificType_*` (5 tests) | null type1/type2, same raw, assignable, not-assignable |
| `constructArrayType_*`, `constructCollectionType_*` | overload ทั้ง Class/JavaType |
| `constructCollectionLikeType_*` | `instanceof CollectionLikeType` true/false (upgradeFrom) |
| `constructMapType_*` | Properties special-case, normal case, JavaType overload |
| `constructMapLikeType_*` | `instanceof MapLikeType` true/false |
| `constructSimpleType_*`, `constructReferenceType_*` | basic + deprecated overload |
| `uncheckedSimpleType_*` | well-known (`_findWellKnownSimple` != null) และไม่ well-known |
| `constructParametricType_*`, `constructParametrizedType_*` | ทุก overload |
| `constructRaw*Type` | raw Collection/CollectionLike/Map/MapLike |
| `fromClass_rawMapInterface/_rawCollectionInterface/_rawAtomicReference` | `_fromWellKnownClass` ทุก `if` (Map, Collection, AtomicReference) และ `_mapType`/`_collectionType`/`_referenceType` case `typeParams.size()==0` |
| `fromClass_wellKnownInterfaceViaSuperInterfaceLoop` | `_fromWellKnownInterface` loop over `superInterfaces` |
| `constructType_selfReferentialGeneric_noInfiniteLoop` | `ClassStack` self-reference branch (`prev != null`) ใน `_fromClass` |

**คอมเมนต์กำกับความไม่แน่ใจ**: บางจุด (เช่น deep generic refine resolution ใน `constructSpecializedType` ช่วง "forward+backwards resolution" ที่ source เขียนว่า "TODO", และ branch "Internal error" ใน `constructGeneralizedType`) ไม่สามารถยืนยัน exact value ที่คืนได้ 100% จาก black-box test จึงเขียนแค่ assert ว่าไม่ throw exception และ `rawClass` ถูกต้อง พร้อมคอมเมนต์ในโค้ดตามที่กำหนด
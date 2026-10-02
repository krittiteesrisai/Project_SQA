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
 * Unit tests for {@link TypeFactory} (Defects4J JacksonDatabind-59b).
 * ทดสอบอยู่ package เดียวกับ target เพื่อเข้าถึง protected constant (CORE_TYPE_*, EMPTY_BINDINGS)
 */
public class TypeFactoryTest {

    private TypeFactory factory;

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
    }

    /* ==================== Helper generic-bearing classes ==================== */

    static class ListHolder {
        List<String> stringList;
    }

    static class ArrayHolder {
        List<String>[] arrayOfLists;
    }

    static class Boxed<T extends Number> {
        T value;
    }

    static class SelfBound<T extends SelfBound<T>> {
        T value;
    }

    static class WildcardHolder {
        void method(List<? extends Number> list) {}
    }

    static class MyStrings implements Iterable<String> {
        public Iterator<String> iterator() { return null; }
    }

    static class MyList<E> extends AbstractList<E> {
        public E get(int index) { return null; }
        public int size() { return 0; }
    }

    static class MyPairList<K, V> extends AbstractList<K> {
        public K get(int index) { return null; }
        public int size() { return 0; }
    }

    static class MyCollectionLike { }

    static class MyMapLike { }

    // java.lang.reflect.Type is a pure marker interface -> trivial to implement
    static class WeirdType implements Type { }

    /* ==================== defaultInstance / unknownType / rawClass ==================== */

    @Test
    public void testDefaultInstanceSingleton() {
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testUnknownTypeReturnsCachedObjectType() {
        JavaType t = TypeFactory.unknownType();
        assertNotNull(t);
        assertEquals(Object.class, t.getRawClass());
        // _unknownType() reuses singleton CORE_TYPE_OBJECT (protected, same-package access)
        assertSame(TypeFactory.CORE_TYPE_OBJECT, t);
    }

    @Test
    public void testRawClass_withClassInstance_shortCircuits() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testRawClass_withNonClassType() throws Exception {
        Type t = ListHolder.class.getDeclaredField("stringList").getGenericType();
        assertEquals(List.class, TypeFactory.rawClass(t));
    }

    /* ==================== findClass ==================== */

    @Test
    public void testFindClass_allPrimitives() throws Exception {
        assertEquals(int.class, factory.findClass("int"));
        assertEquals(long.class, factory.findClass("long"));
        assertEquals(float.class, factory.findClass("float"));
        assertEquals(double.class, factory.findClass("double"));
        assertEquals(boolean.class, factory.findClass("boolean"));
        assertEquals(byte.class, factory.findClass("byte"));
        assertEquals(char.class, factory.findClass("char"));
        assertEquals(short.class, factory.findClass("short"));
        assertEquals(void.class, factory.findClass("void"));
    }

    @Test
    public void testFindClass_normalClass() throws Exception {
        assertEquals(String.class, factory.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_invalidName() throws Exception {
        factory.findClass("no.such.Class$$Fake");
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_emptyString() throws Exception {
        // no '.' -> primitive check misses -> falls through to classForName("") -> fails
        factory.findClass("");
    }

    @Test(expected = NullPointerException.class)
    public void testFindClass_nullInput() throws Exception {
        // className.indexOf('.') on null -> NPE (derived directly from source, not guessed)
        factory.findClass(null);
    }

    @Test
    public void testFindClass_withExplicitClassLoader() throws Exception {
        TypeFactory f2 = factory.withClassLoader(getClass().getClassLoader());
        assertEquals(String.class, f2.findClass("java.lang.String"));
        assertSame(getClass().getClassLoader(), f2.getClassLoader());
    }

    @Test
    public void testGetClassLoaderDefaultIsNull() {
        assertNull(TypeFactory.defaultInstance().getClassLoader());
    }

    /* ==================== moreSpecificType ==================== */

    @Test
    public void testMoreSpecificType_firstNull() {
        JavaType t2 = factory.constructType(String.class);
        assertSame(t2, factory.moreSpecificType(null, t2));
    }

    @Test
    public void testMoreSpecificType_secondNull() {
        JavaType t1 = factory.constructType(String.class);
        assertSame(t1, factory.moreSpecificType(t1, null));
    }

    @Test
    public void testMoreSpecificType_sameRawClass() {
        JavaType t1 = factory.constructType(String.class);
        JavaType t2 = factory.constructType(String.class);
        assertSame(t1, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificType_assignableReturnsSecond() {
        JavaType t1 = factory.constructType(Number.class);
        JavaType t2 = factory.constructType(Integer.class);
        assertSame(t2, factory.moreSpecificType(t1, t2));
    }

    @Test
    public void testMoreSpecificType_unrelatedReturnsFirst() {
        JavaType t1 = factory.constructType(String.class);
        JavaType t2 = factory.constructType(Integer.class);
        assertSame(t1, factory.moreSpecificType(t1, t2));
    }

    /* ==================== constructType(Type) - all _fromAny branches ==================== */

    @Test
    public void testConstructType_class_wellKnownCached() {
        // _findWellKnownSimple shortcuts -> same cached instance
        assertSame(TypeFactory.CORE_TYPE_STRING, factory.constructType(String.class));
        assertSame(TypeFactory.CORE_TYPE_BOOL, factory.constructType(boolean.class));
        assertSame(TypeFactory.CORE_TYPE_INT, factory.constructType(int.class));
        assertSame(TypeFactory.CORE_TYPE_LONG, factory.constructType(long.class));
        assertSame(TypeFactory.CORE_TYPE_OBJECT, factory.constructType(Object.class));
    }

    @Test
    public void testConstructType_javaTypePassThrough() {
        JavaType t1 = factory.constructType(String.class);
        JavaType t2 = factory.constructType((Type) t1); // type instanceof JavaType branch
        assertSame(t1, t2);
    }

    @Test
    public void testConstructType_parameterizedType() throws Exception {
        Type t = ListHolder.class.getDeclaredField("stringList").getGenericType();
        JavaType jt = factory.constructType(t);
        assertEquals(List.class, jt.getRawClass());
        assertEquals(String.class, jt.containedType(0).getRawClass());
    }

    @Test
    public void testConstructType_genericArrayType() throws Exception {
        Type t = ArrayHolder.class.getDeclaredField("arrayOfLists").getGenericType();
        assertTrue(t instanceof GenericArrayType);
        JavaType jt = factory.constructType(t);
        assertTrue(jt.isArrayType());
        assertEquals(List.class, jt.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_typeVariable_resolvesViaBound() throws Exception {
        Type t = Boxed.class.getDeclaredField("value").getGenericType();
        assertTrue(t instanceof TypeVariable);
        JavaType jt = factory.constructType(t);
        assertEquals(Number.class, jt.getRawClass());
    }

    @Test
    public void testConstructType_selfBoundedVariable_hasUnboundBranch() throws Exception {
        // Exercises bindings.hasUnbound(name)==true branch inside recursive _fromVariable call
        Type t = SelfBound.class.getDeclaredField("value").getGenericType();
        JavaType jt = factory.constructType(t);
        assertEquals(SelfBound.class, jt.getRawClass());
    }

    @Test
    public void testConstructType_wildcardType_viaParameterized() throws Exception {
        Method m = WildcardHolder.class.getDeclaredMethod("method", List.class);
        Type pt = m.getGenericParameterTypes()[0];
        JavaType jt = factory.constructType(pt);
        assertEquals(List.class, jt.getRawClass());
        assertEquals(Number.class, jt.containedType(0).getRawClass());
    }

    @Test
    public void testConstructType_wildcardType_direct() throws Exception {
        Method m = WildcardHolder.class.getDeclaredMethod("method", List.class);
        ParameterizedType pt = (ParameterizedType) m.getGenericParameterTypes()[0];
        Type wildcard = pt.getActualTypeArguments()[0];
        assertTrue(wildcard instanceof WildcardType);
        JavaType jt = factory.constructType(wildcard);
        assertEquals(Number.class, jt.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_nullType_throws() {
        factory.constructType((Type) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedCustomType_throws() {
        factory.constructType(new WeirdType());
    }

    @Test
    public void testConstructType_withExplicitEmptyBindings() {
        JavaType t = factory.constructType(String.class, TypeFactory.EMPTY_BINDINGS);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withExplicitBindings_resolvesVariableDirectly() throws Exception {
        Type varType = Boxed.class.getDeclaredField("value").getGenericType();
        TypeBindings bindings = TypeBindings.create(Boxed.class, factory.constructType(String.class));
        JavaType jt = factory.constructType(varType, bindings);
        // bindings.findBoundType(name) != null branch short-circuits before using bound
        assertEquals(String.class, jt.getRawClass());
    }

    @Test
    public void testConstructType_typeReference() {
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        JavaType t = factory.constructType(ref);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    /* ==================== deprecated constructType overloads ==================== */

    @Test
    public void testConstructTypeDeprecated_contextClassNull() {
        JavaType t = factory.constructType(String.class, (Class<?>) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructTypeDeprecated_contextClassNonNull() throws Exception {
        Type t = Boxed.class.getDeclaredField("value").getGenericType();
        JavaType jt = factory.constructType(t, Boxed.class);
        assertEquals(Number.class, jt.getRawClass());
    }

    @Test
    public void testConstructTypeDeprecated_contextTypeNull() {
        JavaType t = factory.constructType(String.class, (JavaType) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructTypeDeprecated_contextTypeNonNull() throws Exception {
        Type t = Boxed.class.getDeclaredField("value").getGenericType();
        JavaType contextType = factory.constructType(Boxed.class);
        JavaType jt = factory.constructType(t, contextType);
        assertEquals(Number.class, jt.getRawClass());
    }

    /* ==================== constructSpecializedType ==================== */

    @Test
    public void testConstructSpecializedType_sameRawReturnsBaseType() {
        JavaType base = factory.constructType(String.class);
        assertSame(base, factory.constructSpecializedType(base, String.class));
    }

    @Test
    public void testConstructSpecializedType_baseIsObject() {
        JavaType base = factory.constructType(Object.class);
        JavaType result = factory.constructSpecializedType(base, String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notAssignable_throws() {
        JavaType base = factory.constructType(Number.class);
        factory.constructSpecializedType(base, String.class);
    }

    @Test
    public void testConstructSpecializedType_emptyBindingsShortcut() {
        JavaType base = factory.constructType(Number.class);
        JavaType result = factory.constructSpecializedType(base, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapShortcut() {
        JavaType base = factory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = factory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
        assertEquals(String.class, result.getKeyType().getRawClass());
        assertEquals(Integer.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedType_collectionShortcut() {
        JavaType base = factory.constructCollectionType(Collection.class, String.class);
        JavaType result = factory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedType_subclassNoTypeParams() {
        JavaType base = factory.constructParametricType(Iterable.class, String.class);
        JavaType result = factory.constructSpecializedType(base, MyStrings.class);
        assertEquals(MyStrings.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_fullResolution_interfaceBase() {
        JavaType base = factory.constructCollectionType(List.class, String.class);
        JavaType result = factory.constructSpecializedType(base, MyList.class);
        assertEquals(MyList.class, result.getRawClass());
        assertEquals(String.class, result.containedType(0).getRawClass());
    }

    @Test
    public void testConstructSpecializedType_fullResolution_nonInterfaceBase() {
        JavaType base = factory.constructCollectionType(AbstractList.class, String.class);
        JavaType result = factory.constructSpecializedType(base, MyList.class);
        assertEquals(MyList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mismatchedParamCount_emptyBindingsFallback() {
        JavaType base = factory.constructCollectionType(List.class, String.class);
        JavaType result = factory.constructSpecializedType(base, MyPairList.class);
        assertEquals(MyPairList.class, result.getRawClass());
        assertEquals(Object.class, result.getContentType().getRawClass());
    }

    /* ==================== constructGeneralizedType ==================== */

    @Test
    public void testConstructGeneralizedType_sameRaw() {
        JavaType base = factory.constructType(Integer.class);
        assertSame(base, factory.constructGeneralizedType(base, Integer.class));
    }

    @Test
    public void testConstructGeneralizedType_superFound() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType result = factory.constructGeneralizedType(base, List.class);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notAssignable_throws() {
        JavaType base = factory.constructType(ArrayList.class);
        factory.constructGeneralizedType(base, String.class);
    }

    /* ==================== constructFromCanonical ==================== */

    @Test
    public void testConstructFromCanonical_simple() {
        JavaType t = factory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_parametrized() {
        JavaType t = factory.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformed_throws() {
        factory.constructFromCanonical("java.util.List<");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_unknownClass_throws() {
        factory.constructFromCanonical("no.such.ClassXyz");
    }

    /* ==================== findTypeParameters ==================== */

    @Test
    public void testFindTypeParameters_found() {
        JavaType strList = factory.constructCollectionType(ArrayList.class, String.class);
        JavaType[] params = factory.findTypeParameters(strList, Collection.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_notFound_returnsEmpty() {
        JavaType strType = factory.constructType(String.class);
        JavaType[] params = factory.findTypeParameters(strType, Collection.class);
        assertEquals(0, params.length);
    }

    @Test
    public void testFindTypeParameters_deprecatedClassOverload() {
        JavaType[] params = factory.findTypeParameters(ArrayList.class, Collection.class);
        assertEquals(1, params.length);
    }

    @Test
    public void testFindTypeParameters_deprecatedClassBindingsOverload() {
        JavaType[] params = factory.findTypeParameters(ArrayList.class, Collection.class, TypeFactory.EMPTY_BINDINGS);
        assertEquals(1, params.length);
    }

    /* ==================== constructArrayType ==================== */

    @Test
    public void testConstructArrayType_fromClass() {
        ArrayType at = factory.constructArrayType(String.class);
        assertEquals(String.class, at.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType_fromJavaType() {
        JavaType elem = factory.constructType(Integer.class);
        ArrayType at = factory.constructArrayType(elem);
        assertSame(elem, at.getContentType());
    }

    /* ==================== constructCollectionType ==================== */

    @Test
    public void testConstructCollectionType_classElement() {
        CollectionType ct = factory.constructCollectionType(List.class, String.class);
        assertEquals(String.class, ct.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_javaTypeElement() {
        JavaType elem = factory.constructType(Integer.class);
        CollectionType ct = factory.constructCollectionType(ArrayList.class, elem);
        assertSame(elem, ct.getContentType());
    }

    /* ==================== constructCollectionLikeType ==================== */

    @Test
    public void testConstructCollectionLikeType_actualCollection_instanceofBranch() {
        CollectionLikeType clt = factory.constructCollectionLikeType(ArrayList.class, String.class);
        assertTrue(clt instanceof CollectionType);
    }

    @Test
    public void testConstructCollectionLikeType_upgradeFromSimple() {
        CollectionLikeType clt = factory.constructCollectionLikeType(MyCollectionLike.class, String.class);
        assertEquals(MyCollectionLike.class, clt.getRawClass());
        assertEquals(String.class, clt.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_classElementOverload() {
        CollectionLikeType clt = factory.constructCollectionLikeType(ArrayList.class, Integer.class);
        assertEquals(Integer.class, clt.getContentType().getRawClass());
    }

    /* ==================== constructMapType ==================== */

    @Test
    public void testConstructMapType_classKV() {
        MapType mt = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(Integer.class, mt.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_propertiesSpecialCase() {
        MapType mt = factory.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(String.class, mt.getKeyType().getRawClass());
        assertEquals(String.class, mt.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_javaTypeKV() {
        JavaType kt = factory.constructType(String.class);
        JavaType vt = factory.constructType(Integer.class);
        MapType mt = factory.constructMapType(HashMap.class, kt, vt);
        assertSame(kt, mt.getKeyType());
        assertSame(vt, mt.getContentType());
    }

    /* ==================== constructMapLikeType ==================== */

    @Test
    public void testConstructMapLikeType_actualMap_instanceofBranch() {
        MapLikeType mlt = factory.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertTrue(mlt instanceof MapType);
    }

    @Test
    public void testConstructMapLikeType_upgradeFromSimple() {
        MapLikeType mlt = factory.constructMapLikeType(MyMapLike.class, String.class, Integer.class);
        assertEquals(MyMapLike.class, mlt.getRawClass());
        assertEquals(String.class, mlt.getKeyType().getRawClass());
        assertEquals(Integer.class, mlt.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType_classKVOverload() {
        MapLikeType mlt = factory.constructMapLikeType(MyMapLike.class, String.class, Integer.class);
        assertEquals(String.class, mlt.getKeyType().getRawClass());
    }

    /* ==================== constructSimpleType / uncheckedSimpleType ==================== */

    @Test
    public void testConstructSimpleType() {
        JavaType t = factory.constructSimpleType(String.class, new JavaType[0]);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructSimpleType_deprecatedOverload() {
        JavaType t = factory.constructSimpleType(String.class, Object.class, new JavaType[0]);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType t = factory.uncheckedSimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    /* ==================== constructReferenceType / AtomicReference well-known branch ==================== */

    @Test
    public void testConstructReferenceType_direct() {
        JavaType refType = factory.constructType(Integer.class);
        ReferenceType rt = factory.constructReferenceType(AtomicReference.class, refType);
        assertEquals(AtomicReference.class, rt.getRawClass());
        assertSame(refType, rt.getContentType());
    }

    @Test
    public void testConstructType_atomicReferenceRaw_wellKnownClassBranch_emptyParams() {
        JavaType t = factory.constructType(AtomicReference.class);
        assertTrue(t instanceof ReferenceType);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricType_atomicReference_oneParam() {
        JavaType t = factory.constructParametricType(AtomicReference.class, String.class);
        assertTrue(t instanceof ReferenceType);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType_atomicReference_tooManyParams_throws() {
        factory.constructParametricType(AtomicReference.class, String.class, Integer.class);
    }

    /* ==================== _mapType / _collectionType switch branches via Map.class/Collection.class ==================== */

    @Test
    public void testConstructParametricType_mapInterface_noParams() {
        JavaType t = factory.constructParametricType(Map.class);
        assertTrue(t instanceof MapType);
        assertEquals(Object.class, t.getKeyType().getRawClass());
    }

    @Test
    public void testConstructParametricType_mapInterface_twoParams() {
        JavaType t = factory.constructParametricType(Map.class, String.class, Integer.class);
        assertTrue(t instanceof MapType);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType_mapInterface_wrongParamCount_throws() {
        factory.constructParametricType(Map.class, String.class); // 1 param -> not 0 or 2
    }

    @Test
    public void testConstructParametricType_collectionInterface_noParams() {
        JavaType t = factory.constructParametricType(Collection.class);
        assertTrue(t instanceof CollectionType);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType_collectionInterface_wrongParamCount_throws() {
        factory.constructParametricType(Collection.class, String.class, Integer.class); // 2 params -> not 0 or 1
    }

    /* ==================== constructParametricType / constructParametrizedType ==================== */

    @Test
    public void testConstructParametricType_classVarargs() {
        JavaType t = factory.constructParametricType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametricType_javaTypeVarargs() {
        JavaType elem = factory.constructType(Integer.class);
        JavaType t = factory.constructParametricType(List.class, elem);
        assertSame(elem, t.containedType(0));
    }

    @Test
    public void testConstructParametrizedType_javaTypeOverload() {
        JavaType elem = factory.constructType(String.class);
        JavaType t = factory.constructParametrizedType(ArrayList.class, List.class, elem);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_classOverload() {
        JavaType t = factory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    /* ==================== raw variants ==================== */

    @Test
    public void testConstructRawCollectionType() {
        CollectionType ct = factory.constructRawCollectionType(List.class);
        assertEquals(Object.class, ct.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType clt = factory.constructRawCollectionLikeType(MyCollectionLike.class);
        assertEquals(Object.class, clt.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapType mt = factory.constructRawMapType(Map.class);
        assertEquals(Object.class, mt.getKeyType().getRawClass());
        assertEquals(Object.class, mt.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType mlt = factory.constructRawMapLikeType(MyMapLike.class);
        assertEquals(Object.class, mlt.getKeyType().getRawClass());
    }

    /* ==================== withModifier / withClassLoader / withCache / clearCache ==================== */

    @Test
    public void testWithModifier_nullClearsModsAndCache() {
        TypeFactory f2 = factory.withModifier(null);
        assertNotSame(factory, f2);
        JavaType t = f2.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testWithModifier_addsSingleModifier_noOp() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type origType, TypeBindings context, TypeFactory tf) {
                return type; // no-op
            }
        };
        TypeFactory f2 = factory.withModifier(mod);
        JavaType t = f2.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testWithModifier_appendsToExistingModifiers() {
        TypeModifier mod1 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type origType, TypeBindings context, TypeFactory tf) {
                return type;
            }
        };
        TypeModifier mod2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type origType, TypeBindings context, TypeFactory tf) {
                return type;
            }
        };
        TypeFactory f1 = factory.withModifier(mod1);
        TypeFactory f2 = f1.withModifier(mod2); // _modifiers != null -> insertInListNoDup branch
        JavaType t = f2.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithModifier_returningNull_throws() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type origType, TypeBindings context, TypeFactory tf) {
                return null;
            }
        };
        TypeFactory f2 = factory.withModifier(mod);
        f2.constructType(String.class);
    }

    @Test
    public void testWithClassLoader() {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        TypeFactory f2 = factory.withClassLoader(cl);
        assertSame(cl, f2.getClassLoader());
    }

    @Test
    public void testWithCache() {
        LRUMap<Object, JavaType> cache = new LRUMap<Object, JavaType>(4, 4);
        TypeFactory f2 = factory.withCache(cache);
        JavaType t = f2.constructCollectionType(ArrayList.class, String.class);
        assertNotNull(t);
    }

    @Test
    public void testClearCache_doesNotThrow() {
        factory.constructCollectionType(List.class, String.class); // populate
        factory.clearCache();
        JavaType t = factory.constructCollectionType(List.class, String.class); // re-resolve after clear
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructType_cachingConsistency() {
        JavaType t1 = factory.constructCollectionType(ArrayList.class, String.class);
        JavaType t2 = factory.constructCollectionType(ArrayList.class, String.class);
        assertEquals(t1, t2);
    }
}

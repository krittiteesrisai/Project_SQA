# วิเคราะห์และออกแบบ Test

ผมวิเคราะห์ `GenericMetadataSupport` ซึ่งมี inner class หลายตัว (`FromClassGenericMetadataSupport`, `FromParameterizedTypeGenericMetadataSupport`, `ParameterizedReturnType`, `TypeVariableReturnType`, `NotGenericReturnTypeSupport`) ที่เป็น `private` จึงต้องทดสอบผ่าน public API: `inferFrom(Type)`, `resolveGenericReturnType(Method)`, `rawType()`, `actualTypeArguments()`, `extraInterfaces()`, `rawExtraInterfaces()`, `hasRawExtraInterfaces()` รวมถึง public nested class `BoundedType`, `TypeVarBoundedType`, `WildCardBoundedType`

ผมสร้าง fixture classes/interfaces จำลองตามตัวอย่างใน Javadoc ของคลาสเอง (ไม่เดา behavior ใหม่) และพบ **ข้อบกพร่องจริง**ใน `WildCardBoundedType.equals()` ที่ cast ผิดเป็น `TypeVarBoundedType` ทำให้เกิด `ClassCastException` เมื่อเทียบ `WildCardBoundedType` สองตัว — จึงเขียนเทสเพื่อดักจับพฤติกรรมนี้ไว้อย่างชัดเจน (พร้อมคอมเมนต์)

```java
package org.mockito.internal.util.reflection;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for {@link GenericMetadataSupport}.
 *
 * ทดสอบผ่าน public API เท่านั้น เพราะ implementation classes (FromClassGenericMetadataSupport,
 * ParameterizedReturnType, TypeVariableReturnType, ฯลฯ) เป็น private static nested class
 */
public class GenericMetadataSupportTest {

    // =========================================================================================
    // Fixtures - โมเดลตามตัวอย่างใน Javadoc ของ GenericMetadataSupport
    // =========================================================================================

    interface GenericsNest<K extends Comparable<K> & Cloneable> extends Map<K, Set<Number>> {
        Set<Number> remove(Object key);
        List<? super Integer> returning_wildcard_with_class_lower_bound();
        List<? super K> returning_wildcard_with_typeVar_lower_bound();
        List<? extends K> returning_wildcard_with_typeVar_upper_bound();
        K returningK();
        <O extends K> List<O> paramType_with_type_params();
        <S, T extends S> T two_type_params();
        <O extends K> O typeVar_with_type_params();
        Number returningNonGeneric();
        // เพิ่มเติมเพื่อทดสอบ MockitoException branch (GenericArrayType ไม่ถูก support)
        K[] returningArrayOfK();
    }

    static class SimpleGeneric<T> {
    }

    static class GParent<T> {
        public T get() { return null; }
    }

    static class Parent<E> extends GParent<E> {
    }

    static class Child extends Parent<String> {
    }

    static class PairHolder<E> extends GParent<List<E>> {
    }

    static class StrPairHolder extends PairHolder<String> {
    }

    interface IfaceA<X> { X getX(); }
    interface IfaceB<Y> { Y getY(); }

    static class MultiIface implements IfaceA<String>, IfaceB<Integer> {
        public String getX() { return null; }
        public Integer getY() { return null; }
    }

    static class Pair<A, B> {
    }

    static class Container {
        Pair<String, Integer> pair;
    }

    static class ArrayField<T> {
        T[] arr;
    }

    private GenericMetadataSupport genericsNestMetadata() {
        return GenericMetadataSupport.inferFrom(GenericsNest.class);
    }

    // =========================================================================================
    // inferFrom(Type)
    // =========================================================================================

    @Test
    public void testInferFrom_Class_SimpleGeneric() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(SimpleGeneric.class);

        assertEquals(SimpleGeneric.class, metadata.rawType());

        Map<TypeVariable, Type> ata = metadata.actualTypeArguments();
        assertEquals(1, ata.size());
        Type value = ata.values().iterator().next();
        assertTrue(value instanceof GenericMetadataSupport.TypeVarBoundedType);
        assertEquals(Object.class, ((GenericMetadataSupport.BoundedType) value).firstBound());

        // default (ไม่ override) -> emptyList / empty array / false
        assertTrue(metadata.extraInterfaces().isEmpty());
        assertEquals(0, metadata.rawExtraInterfaces().length);
        assertFalse(metadata.hasRawExtraInterfaces());
    }

    @Test
    public void testActualTypeArguments_NoTypeParameters_ReturnsEmptyMap() {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(String.class);
        assertEquals(String.class, metadata.rawType());
        assertTrue(metadata.actualTypeArguments().isEmpty());
    }

    @Test
    public void testInferFrom_ParameterizedType_Container() throws Exception {
        Field f = Container.class.getDeclaredField("pair");
        ParameterizedType pt = (ParameterizedType) f.getGenericType();

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(pt);
        assertEquals(Pair.class, metadata.rawType());

        Map<TypeVariable, Type> ata = metadata.actualTypeArguments();
        assertEquals(2, ata.size());
        java.util.Iterator<Type> it = ata.values().iterator();
        assertEquals(String.class, it.next());
        assertEquals(Integer.class, it.next());
    }

    @Test
    public void testInferFrom_Null_ThrowsException() {
        // หมายเหตุ: org.mockito.internal.util.Checks ไม่ได้อยู่ในซอร์สที่ให้มา
        // จึงไม่ยืนยัน exception type ที่แน่นอน เพียงยืนยันว่ามีการ throw เกิดขึ้นจริง
        try {
            GenericMetadataSupport.inferFrom(null);
            fail("Expected an exception to be thrown for null type (Checks.checkNotNull)");
        } catch (Throwable expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInferFrom_UnsupportedGenericArrayType_ThrowsMockitoException() throws Exception {
        Field f = ArrayField.class.getDeclaredField("arr");
        Type genericType = f.getGenericType(); // GenericArrayType - ไม่ใช่ Class/ParameterizedType
        try {
            GenericMetadataSupport.inferFrom(genericType);
            fail("Expected MockitoException");
        } catch (MockitoException expected) {
            // ok
        }
    }

    // =========================================================================================
    // resolveGenericReturnType(Method)
    // =========================================================================================

    @Test
    public void testResolveGenericReturnType_Remove_ParameterizedReturnType() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("remove", Object.class);
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(Set.class, result.rawType());
        // ParameterizedReturnType ไม่ override extraInterfaces() -> ใช้ default จาก base class
        assertTrue(result.extraInterfaces().isEmpty());
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces());
    }

    @Test
    public void testResolveGenericReturnType_WildcardClassLowerBound() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returning_wildcard_with_class_lower_bound");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(List.class, result.rawType());

        Type value = result.actualTypeArguments().values().iterator().next();
        assertTrue(value instanceof GenericMetadataSupport.WildCardBoundedType);
        GenericMetadataSupport.BoundedType bt = (GenericMetadataSupport.BoundedType) value;
        assertEquals(Integer.class, bt.firstBound()); // "? super Integer" -> lower bound ใช้งาน
        assertEquals(0, bt.interfaceBounds().length);
    }

    @Test
    public void testResolveGenericReturnType_WildcardTypeVarLowerBound() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returning_wildcard_with_typeVar_lower_bound");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(List.class, result.rawType());

        Type value = result.actualTypeArguments().values().iterator().next();
        // "? super K" -> firstBound เป็น TypeVariable -> boundsOf recurse ไปเป็น TypeVarBoundedType(K)
        assertTrue(value instanceof GenericMetadataSupport.TypeVarBoundedType);
        assertTrue(((GenericMetadataSupport.BoundedType) value).firstBound() instanceof ParameterizedType);
    }

    @Test
    public void testResolveGenericReturnType_WildcardTypeVarUpperBound() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returning_wildcard_with_typeVar_upper_bound");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(List.class, result.rawType());
        Type value = result.actualTypeArguments().values().iterator().next();
        assertTrue(value instanceof GenericMetadataSupport.TypeVarBoundedType);
    }

    @Test
    public void testResolveGenericReturnType_ReturningK_TypeVariableWithMultipleBounds() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returningK");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        // K extends Comparable<K> & Cloneable -> rawType = Comparable.class
        assertEquals(Comparable.class, result.rawType());
        assertEquals(Comparable.class, result.rawType()); // เรียกซ้ำเพื่อ cover branch cache (rawType != null)

        List<Type> extra = result.extraInterfaces();
        assertEquals(1, extra.size());
        assertEquals(Cloneable.class, extra.get(0));

        Class<?>[] rawExtra = result.rawExtraInterfaces();
        assertArrayEquals(new Class[]{Cloneable.class}, rawExtra);
        assertTrue(result.hasRawExtraInterfaces());
    }

    @Test
    public void testResolveGenericReturnType_ParamTypeWithTypeParams() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("paramType_with_type_params");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(List.class, result.rawType());
        Type value = result.actualTypeArguments().values().iterator().next();
        assertTrue(value instanceof GenericMetadataSupport.TypeVarBoundedType);
        Type firstBound = ((GenericMetadataSupport.BoundedType) value).firstBound();
        assertTrue(firstBound instanceof ParameterizedType);
        assertEquals(Comparable.class, ((ParameterizedType) firstBound).getRawType());
    }

    @Test
    public void testResolveGenericReturnType_TwoTypeParams_DefaultObjectBound() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("two_type_params");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        // <S, T extends S> T -> S unbounded -> Object.class
        assertEquals(Object.class, result.rawType());
        // interfaceBounds ของ S ว่าง (bounds=[Object]) -> extraInterfaces ว่าง
        assertTrue(result.extraInterfaces().isEmpty());
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces());
    }

    @Test
    public void testResolveGenericReturnType_TypeVarWithTypeParams() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("typeVar_with_type_params");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(Comparable.class, result.rawType());
        assertEquals(1, result.extraInterfaces().size());
        assertEquals(Cloneable.class, result.extraInterfaces().get(0));
    }

    @Test
    public void testResolveGenericReturnType_ReturningNonGeneric() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returningNonGeneric");
        GenericMetadataSupport result = genericsNestMetadata().resolveGenericReturnType(m);

        assertEquals(Number.class, result.rawType());
        assertTrue(result.extraInterfaces().isEmpty());
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces());
    }

    @Test(expected = MockitoException.class)
    public void testResolveGenericReturnType_UnsupportedGenericArrayType_ThrowsMockitoException() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returningArrayOfK");
        genericsNestMetadata().resolveGenericReturnType(m);
    }

    @Test(expected = NullPointerException.class)
    public void testResolveGenericReturnType_NullMethod_ThrowsNPE() {
        genericsNestMetadata().resolveGenericReturnType(null);
    }

    @Test
    public void testResolveGenericReturnType_MultipleInterfaces() throws Exception {
        Method gx = IfaceA.class.getDeclaredMethod("getX");
        Method gy = IfaceB.class.getDeclaredMethod("getY");

        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(MultiIface.class);

        assertEquals(String.class, metadata.resolveGenericReturnType(gx).rawType());
        assertEquals(Integer.class, metadata.resolveGenericReturnType(gy).rawType());
    }

    @Test
    public void testResolveGenericReturnType_ChainedTypeVariable_ThroughClassHierarchy() throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(Child.class);
        Method get = GParent.class.getDeclaredMethod("get");
        GenericMetadataSupport result = metadata.resolveGenericReturnType(get);

        // Child -> Parent<String> -> GParent<E> : T(GParent) -> E(Parent) -> String.class
        assertEquals(String.class, result.rawType());
        assertTrue(result.extraInterfaces().isEmpty()); // type ที่ resolve ได้เป็น Class -> emptyList
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces());
    }

    @Test
    public void testResolveGenericReturnType_ChainedParameterizedTypeThroughHierarchy_FiltersRawExtraInterfaces()
            throws Exception {
        GenericMetadataSupport metadata = GenericMetadataSupport.inferFrom(StrPairHolder.class);
        Method get = GParent.class.getDeclaredMethod("get");
        GenericMetadataSupport result = metadata.resolveGenericReturnType(get);

        // StrPairHolder -> PairHolder<String> -> GParent<List<E>> : T(GParent) -> List<E(PairHolder)>
        assertEquals(List.class, result.rawType());

        List<Type> extra = result.extraInterfaces();
        assertEquals(1, extra.size());
        assertTrue(extra.get(0) instanceof ParameterizedType);
        assertEquals(List.class, ((ParameterizedType) extra.get(0)).getRawType());

        // rawInterface (List.class) == rawType() (List.class) -> ถูกกรองออกใน rawExtraInterfaces()
        assertEquals(0, result.rawExtraInterfaces().length);
        assertFalse(result.hasRawExtraInterfaces()); // แม้ extraInterfaces() ไม่ว่าง!
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfaces_UnresolvedTypeVariable_ThrowsMockitoException() throws Exception {
        // สร้าง source metadata ที่ไม่มีการลงทะเบียน K เลย (plain Object.class)
        GenericMetadataSupport plain = GenericMetadataSupport.inferFrom(Object.class);
        Method m = GenericsNest.class.getDeclaredMethod("returningK");
        GenericMetadataSupport result = plain.resolveGenericReturnType(m);

        result.extraInterfaces(); // contextualActualTypeParameters.get(K) == null -> throw
    }

    @Test(expected = MockitoException.class)
    public void testRawType_UnresolvedTypeVariable_ThrowsMockitoException() throws Exception {
        GenericMetadataSupport plain = GenericMetadataSupport.inferFrom(Object.class);
        Method m = GenericsNest.class.getDeclaredMethod("returningK");
        GenericMetadataSupport result = plain.resolveGenericReturnType(m);

        result.rawType(); // extractRawTypeOf(null) -> "Raw extraction not supported" throw
    }

    // =========================================================================================
    // BoundedType implementations: TypeVarBoundedType / WildCardBoundedType
    // =========================================================================================

    @Test
    public void testTypeVarBoundedType_EqualsHashCodeAccessors() {
        TypeVariable<?> kVar = GenericsNest.class.getTypeParameters()[0]; // K

        GenericMetadataSupport.TypeVarBoundedType bt1 = new GenericMetadataSupport.TypeVarBoundedType(kVar);
        GenericMetadataSupport.TypeVarBoundedType bt2 = new GenericMetadataSupport.TypeVarBoundedType(kVar);

        assertTrue(bt1.equals(bt1));           // this == o
        assertTrue(bt1.equals(bt2));           // same typeVariable
        assertEquals(bt1.hashCode(), bt2.hashCode());
        assertFalse(bt1.equals(null));         // o == null
        assertFalse(bt1.equals("not-a-bounded-type")); // class mismatch
        assertEquals(kVar, bt1.typeVariable());

        assertTrue(bt1.firstBound() instanceof ParameterizedType);
        assertEquals(Comparable.class, ((ParameterizedType) bt1.firstBound()).getRawType());

        assertEquals(1, bt1.interfaceBounds().length);
        assertEquals(Cloneable.class, bt1.interfaceBounds()[0]);

        assertNotNull(bt1.toString());
        assertTrue(bt1.toString().contains("firstBound"));
    }

    @Test
    public void testWildCardBoundedType_Accessors() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returning_wildcard_with_class_lower_bound");
        WildcardType w = (WildcardType) ((ParameterizedType) m.getGenericReturnType())
                .getActualTypeArguments()[0]; // "? super Integer"

        GenericMetadataSupport.WildCardBoundedType wct = new GenericMetadataSupport.WildCardBoundedType(w);

        assertEquals(Integer.class, wct.firstBound()); // lowerBounds.length != 0 -> true branch
        assertEquals(0, wct.interfaceBounds().length); // ตามคำอธิบาย wildcard ไม่รองรับ multiple bound
        assertEquals(w, wct.wildCard());
        assertNotNull(wct.toString());
    }

    @Test
    public void testWildCardBoundedType_UpperBoundOnlyWildcard_FirstBoundIsTypeVariable() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returning_wildcard_with_typeVar_upper_bound");
        WildcardType w = (WildcardType) ((ParameterizedType) m.getGenericReturnType())
                .getActualTypeArguments()[0]; // "? extends K" -> ไม่มี lower bound

        GenericMetadataSupport.WildCardBoundedType wct = new GenericMetadataSupport.WildCardBoundedType(w);

        assertEquals(0, w.getLowerBounds().length);
        // lowerBounds.length == 0 -> ternary ใช้ upperBounds[0] (false branch ของเงื่อนไข)
        assertTrue(wct.firstBound() instanceof TypeVariable);
    }

    /**
     * ข้อบกพร่อง (fault) ที่พบในซอร์สโค้ด:
     * WildCardBoundedType.equals(Object o) cast ผิดเป็น (TypeVarBoundedType) o แทนที่จะเป็น
     * (WildCardBoundedType) o ทำให้เมื่อเทียบ WildCardBoundedType สองตัวที่ไม่ใช่ตัวเดียวกัน
     * (ผ่าน getClass() check แล้ว) จะเกิด ClassCastException เสมอ
     * เทสนี้ยืนยันพฤติกรรม "ที่เป็นอยู่จริง" ของซอร์สโค้ดที่ให้มา (ไม่ใช่การเดา)
     */
    @Test
    public void testWildCardBoundedType_Equals_KnownCastDefect() throws Exception {
        Method m = GenericsNest.class.getDeclaredMethod("returning_wildcard_with_class_lower_bound");
        WildcardType w = (WildcardType) ((ParameterizedType) m.getGenericReturnType())
                .getActualTypeArguments()[0];

        GenericMetadataSupport.WildCardBoundedType b1 = new GenericMetadataSupport.WildCardBoundedType(w);
        GenericMetadataSupport.WildCardBoundedType b2 = new GenericMetadataSupport.WildCardBoundedType(w);

        assertNotSame(b1, b2);
        try {
            b1.equals(b2);
            fail("Expected ClassCastException due to incorrect cast in " +
                    "WildCardBoundedType.equals(Object) as implemented in the provided source");
        } catch (ClassCastException expected) {
            // พฤติกรรมจริงของโค้ดต้นฉบับ (defect)
        }
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInferFrom_Class_SimpleGeneric` | `inferFrom`: `type instanceof Class` true; default `extraInterfaces/rawExtraInterfaces/hasRawExtraInterfaces`; `boundsOf(TypeVariable)` ไม่มี bound ระบุ (Object) |
| `testActualTypeArguments_NoTypeParameters_ReturnsEmptyMap` | `actualTypeArguments()` กรณี `typeParameters` ว่าง (loop 0 รอบ) |
| `testInferFrom_ParameterizedType_Container` | `inferFrom`: `type instanceof ParameterizedType` true; `registerTypeVariablesOn` branch `typeParameter != actualTypeArgument` (ไม่ wildcard) |
| `testInferFrom_Null_ThrowsException` | null input -> `Checks.checkNotNull` throw (boundary/null case) |
| `testInferFrom_UnsupportedGenericArrayType_ThrowsMockitoException` | `inferFrom`: ทั้งสอง `instanceof` เป็น false -> throw `MockitoException` |
| `testResolveGenericReturnType_Remove_ParameterizedReturnType` | `resolveGenericReturnType`: `genericReturnType instanceof ParameterizedType` true |
| `testResolveGenericReturnType_WildcardClassLowerBound` | `boundsOf(WildcardType)`: ternary true branch (`lowerBounds.length!=0`), `firstBound() not TypeVariable` |
| `testResolveGenericReturnType_WildcardTypeVarLowerBound` | `boundsOf(WildcardType)`: `firstBound() instanceof TypeVariable` -> recurse `boundsOf(TypeVariable)` |
| `testResolveGenericReturnType_WildcardTypeVarUpperBound` | ternary false branch (`upperBounds[0]`) + TypeVariable recursion |
| `testResolveGenericReturnType_ReturningK_TypeVariableWithMultipleBounds` | `genericReturnType instanceof TypeVariable`; `extractRawTypeOf`: BoundedType→ParameterizedType branch; `extraInterfaces` BoundedType branch; rawType cache (if-null) ทั้งจริง/เท็จ |
| `testResolveGenericReturnType_ParamTypeWithTypeParams` | method-level type param `O extends K`; `getActualTypeArgumentFor` recursive TypeVariable resolution 2 ชั้น |
| `testResolveGenericReturnType_TwoTypeParams_DefaultObjectBound` | unbounded type var (`S`) -> bound = Object; `interfaceBounds` ว่าง |
| `testResolveGenericReturnType_TypeVarWithTypeParams` | method type var ที่ extends class-level type var |
| `testResolveGenericReturnType_ReturningNonGeneric` | `genericReturnType instanceof Class` -> `NotGenericReturnTypeSupport` |
| `testResolveGenericReturnType_UnsupportedGenericArrayType_ThrowsMockitoException` | ทุก `instanceof` false -> throw `MockitoException` (GenericArrayType) |
| `testResolveGenericReturnType_NullMethod_ThrowsNPE` | null method -> NPE (ไม่มี null check) |
| `testResolveGenericReturnType_MultipleInterfaces` | loop `for (Type genericInterface : clazz.getGenericInterfaces())` หลายรอบ |
| `testResolveGenericReturnType_ChainedTypeVariable_ThroughClassHierarchy` | loop `for (currentExploredClass ...)` หลายชั้น; `extractRawTypeOf` TypeVariable→TypeVariable→Class; `extraInterfaces` Class branch |
| `testResolveGenericReturnType_ChainedParameterizedTypeThroughHierarchy_FiltersRawExtraInterfaces` | `extraInterfaces` ParameterizedType branch; `rawExtraInterfaces` filter `rawType().equals(rawInterface)` true (skip) |
| `testExtraInterfaces_UnresolvedTypeVariable_ThrowsMockitoException` | `extraInterfaces` default/exception branch (`throw MockitoException`) เมื่อ type เป็น null |
| `testRawType_UnresolvedTypeVariable_ThrowsMockitoException` | `extractRawTypeOf` สุดท้าย `throw MockitoException` (none of the instanceof matched) |
| `testTypeVarBoundedType_EqualsHashCodeAccessors` | `equals`: this==o, null, class mismatch, equal case; `interfaceBounds`, `firstBound`, `toString` |
| `testWildCardBoundedType_Accessors` | `firstBound` true branch, `interfaceBounds` ว่างเสมอ, accessor, toString |
| `testWildCardBoundedType_UpperBoundOnlyWildcard_FirstBoundIsTypeVariable` | `firstBound` false branch (ternary) |
| `testWildCardBoundedType_Equals_KnownCastDefect` | **Fault detection**: `equals` cast ผิด -> `ClassCastException` |

**หมายเหตุที่ไม่สามารถ cover ได้ 100%:** branch `typeParameter == actualTypeArgument` (identity เท่ากัน) ใน `registerTypeVariablesOn` ไม่สามารถสร้าง scenario ได้ง่ายจาก reflection ปกติ จึงไม่ได้ทดสอบโดยตรง (ไม่ขอเดา behavior เพิ่ม)
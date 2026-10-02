package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;

/**
 * Unit tests for {@link TypeBindings}.
 *
 * หมายเหตุ: JavaType/ResolvedRecursiveType ไม่มีซอร์สโค้ดให้ในโจทย์ จึงใช้ Mockito mock
 * และสมมติว่า hashCode()/equals()/getGenericSignature() เป็น non-final method
 * (เนื่องจาก TypeBindings เรียกใช้งาน polymorphic behavior เหล่านี้โดยตรง)
 */
public class TypeBindingsTest {

    // ---- Helper generic classes สำหรับทดสอบ reflection-based type parameter resolution ----
    static class NoParam {}
    static class OneParam<A> {}
    static class TwoParam<A, B> {}
    static class ThreeParam<A, B, C> {}

    private JavaType mockType(String genericSig) {
        JavaType t = mock(JavaType.class);
        if (genericSig != null) {
            when(t.getGenericSignature()).thenReturn(genericSig);
        }
        return t;
    }

    // ===================== emptyBindings() =====================

    @Test
    public void testEmptyBindings() {
        TypeBindings tb = TypeBindings.emptyBindings();
        assertTrue(tb.isEmpty());
        assertEquals(0, tb.size());
        assertEquals("<>", tb.toString());
    }

    // ===================== create(Class, List<JavaType>) =====================

    @Test
    public void testCreateFromList_nullList() {
        TypeBindings tb = TypeBindings.create(NoParam.class, (List<JavaType>) null);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateFromList_emptyList() {
        TypeBindings tb = TypeBindings.create(NoParam.class, new ArrayList<JavaType>());
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateFromList_oneElement() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, Arrays.asList(t1));
        assertEquals(1, tb.size());
        assertSame(t1, tb.getBoundType(0));
    }

    @Test
    public void testCreateFromList_twoElements() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        TypeBindings tb = TypeBindings.create(TwoParam.class, Arrays.asList(t1, t2));
        assertEquals(2, tb.size());
    }

    @Test
    public void testCreateFromList_threeElements() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        JavaType t3 = mockType(null);
        TypeBindings tb = TypeBindings.create(ThreeParam.class, Arrays.asList(t1, t2, t3));
        assertEquals(3, tb.size());
    }

    // ===================== create(Class, JavaType[]) =====================

    @Test
    public void testCreateFromArray_nullArray() {
        TypeBindings tb = TypeBindings.create(NoParam.class, (JavaType[]) null);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateFromArray_zeroLength_matching() {
        TypeBindings tb = TypeBindings.create(NoParam.class, new JavaType[0]);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateFromArray_oneLength_delegates() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, new JavaType[]{ t1 });
        assertEquals(1, tb.size());
    }

    @Test
    public void testCreateFromArray_twoLength_delegates() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        TypeBindings tb = TypeBindings.create(TwoParam.class, new JavaType[]{ t1, t2 });
        assertEquals(2, tb.size());
    }

    @Test
    public void testCreateFromArray_threeLength_matching() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        JavaType t3 = mockType(null);
        TypeBindings tb = TypeBindings.create(ThreeParam.class, new JavaType[]{ t1, t2, t3 });
        assertEquals(3, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateFromArray_lengthMismatch_throws() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        JavaType t3 = mockType(null);
        // TwoParam ต้องการ 2 params แต่ให้ 3 -> falls ไปที่ default switch branch แล้ว mismatch
        TypeBindings.create(TwoParam.class, new JavaType[]{ t1, t2, t3 });
    }

    // ===================== create(Class, JavaType) single =====================

    @Test
    public void testCreateSingleArg_success() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertEquals(1, tb.size());
        assertSame(t1, tb.getBoundType(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateSingleArg_wrongParamCount_throws() {
        JavaType t1 = mockType(null);
        TypeBindings.create(NoParam.class, t1);
    }

    @Test
    public void testCreateSingleArg_optimizedBranches() {
        JavaType t1 = mockType(null);
        // ครอบคลุม TypeParamStash.paramsFor1 ทุก special-case branch
        assertEquals(1, TypeBindings.create(Collection.class, t1).size());
        assertEquals(1, TypeBindings.create(List.class, t1).size());
        assertEquals(1, TypeBindings.create(ArrayList.class, t1).size());
        assertEquals(1, TypeBindings.create(AbstractList.class, t1).size());
        assertEquals(1, TypeBindings.create(Iterable.class, t1).size());
    }

    // ===================== create(Class, JavaType, JavaType) =====================

    @Test
    public void testCreateTwoArgs_success() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        TypeBindings tb = TypeBindings.create(TwoParam.class, t1, t2);
        assertEquals(2, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTwoArgs_wrongParamCount_throws() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        TypeBindings.create(OneParam.class, t1, t2);
    }

    @Test
    public void testCreateTwoArgs_optimizedBranches() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        // ครอบคลุม TypeParamStash.paramsFor2 ทุก special-case branch
        assertEquals(2, TypeBindings.create(Map.class, t1, t2).size());
        assertEquals(2, TypeBindings.create(HashMap.class, t1, t2).size());
        assertEquals(2, TypeBindings.create(LinkedHashMap.class, t1, t2).size());
    }

    // ===================== createIfNeeded(Class, JavaType) =====================

    @Test
    public void testCreateIfNeededSingle_zeroParams_returnsEmpty() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.createIfNeeded(NoParam.class, t1);
        assertTrue(tb.isEmpty());
        assertSame(TypeBindings.emptyBindings(), tb);
    }

    @Test
    public void testCreateIfNeededSingle_oneParam_success() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.createIfNeeded(OneParam.class, t1);
        assertEquals(1, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeededSingle_wrongParamCount_throws() {
        JavaType t1 = mockType(null);
        TypeBindings.createIfNeeded(TwoParam.class, t1);
    }

    // ===================== createIfNeeded(Class, JavaType[]) =====================

    @Test
    public void testCreateIfNeededArray_zeroParams_returnsEmpty() {
        TypeBindings tb = TypeBindings.createIfNeeded(NoParam.class, (JavaType[]) null);
        assertTrue(tb.isEmpty());
        assertSame(TypeBindings.emptyBindings(), tb);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeededArray_nullTypesWithParams_throws() {
        // OneParam มี 1 type-parameter; types=null -> NO_TYPES(len0) -> mismatch
        TypeBindings.createIfNeeded(OneParam.class, (JavaType[]) null);
    }

    @Test
    public void testCreateIfNeededArray_matchingLengths_success() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.createIfNeeded(OneParam.class, new JavaType[]{ t1 });
        assertEquals(1, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeededArray_mismatchedLengths_throws() {
        JavaType t1 = mockType(null);
        TypeBindings.createIfNeeded(TwoParam.class, new JavaType[]{ t1 });
    }

    // ===================== withUnboundVariable =====================

    @Test
    public void testWithUnboundVariable_firstCall() {
        TypeBindings tb = TypeBindings.emptyBindings();
        TypeBindings tb2 = tb.withUnboundVariable("X");
        assertTrue(tb2.hasUnbound("X"));
        assertFalse(tb2.hasUnbound("Y"));
    }

    @Test
    public void testWithUnboundVariable_secondCall_appendsArray() {
        TypeBindings tb = TypeBindings.emptyBindings();
        TypeBindings tb2 = tb.withUnboundVariable("X");
        TypeBindings tb3 = tb2.withUnboundVariable("Y");
        assertTrue(tb3.hasUnbound("X"));
        assertTrue(tb3.hasUnbound("Y"));
    }

    // ===================== findBoundType =====================

    @Test
    public void testFindBoundType_notFound() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertNull(tb.findBoundType("NOT_EXIST"));
    }

    @Test
    public void testFindBoundType_foundNormalType() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        String name = tb.getBoundName(0);
        assertSame(t1, tb.findBoundType(name));
    }

    @Test
    public void testFindBoundType_resolvedRecursiveType_withSelfRef() {
        ResolvedRecursiveType rrt = mock(ResolvedRecursiveType.class);
        JavaType selfRef = mockType(null);
        when(rrt.getSelfReferencedType()).thenReturn(selfRef);
        TypeBindings tb = TypeBindings.create(OneParam.class, rrt);
        String name = tb.getBoundName(0);
        assertSame(selfRef, tb.findBoundType(name));
    }

    @Test
    public void testFindBoundType_resolvedRecursiveType_withNullSelfRef() {
        ResolvedRecursiveType rrt = mock(ResolvedRecursiveType.class);
        when(rrt.getSelfReferencedType()).thenReturn(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, rrt);
        String name = tb.getBoundName(0);
        // เมื่อ self-ref เป็น null, ตัว rrt เองจะถูก return (ตาม comment ในซอร์ส)
        assertSame(rrt, tb.findBoundType(name));
    }

    // ===================== isEmpty / size =====================

    @Test
    public void testIsEmpty_trueForEmpty() {
        assertTrue(TypeBindings.emptyBindings().isEmpty());
    }

    @Test
    public void testIsEmpty_falseForNonEmpty() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertFalse(tb.isEmpty());
    }

    @Test
    public void testSize() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        assertEquals(0, TypeBindings.emptyBindings().size());
        assertEquals(2, TypeBindings.create(TwoParam.class, t1, t2).size());
    }

    // ===================== getBoundName =====================

    @Test
    public void testGetBoundName_validIndex() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertNotNull(tb.getBoundName(0));
    }

    @Test
    public void testGetBoundName_negativeIndex() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertNull(tb.getBoundName(-1));
    }

    @Test
    public void testGetBoundName_tooLargeIndex() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertNull(tb.getBoundName(5));
    }

    // ===================== getBoundType =====================

    @Test
    public void testGetBoundType_validIndex() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertSame(t1, tb.getBoundType(0));
    }

    @Test
    public void testGetBoundType_negativeIndex() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertNull(tb.getBoundType(-1));
    }

    @Test
    public void testGetBoundType_tooLargeIndex() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertNull(tb.getBoundType(5));
    }

    // ===================== getTypeParameters =====================

    @Test
    public void testGetTypeParameters_empty() {
        List<JavaType> list = TypeBindings.emptyBindings().getTypeParameters();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testGetTypeParameters_nonEmpty() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        List<JavaType> list = TypeBindings.create(TwoParam.class, t1, t2).getTypeParameters();
        assertEquals(2, list.size());
        assertSame(t1, list.get(0));
        assertSame(t2, list.get(1));
    }

    // ===================== hasUnbound =====================

    @Test
    public void testHasUnbound_nullUnboundVariables() {
        TypeBindings tb = TypeBindings.emptyBindings();
        assertFalse(tb.hasUnbound("ANY"));
    }

    @Test
    public void testHasUnbound_notContained() {
        TypeBindings tb = TypeBindings.emptyBindings().withUnboundVariable("X");
        assertFalse(tb.hasUnbound("Y"));
    }

    @Test
    public void testHasUnbound_contained() {
        TypeBindings tb = TypeBindings.emptyBindings().withUnboundVariable("X");
        assertTrue(tb.hasUnbound("X"));
    }

    // ===================== toString =====================

    @Test
    public void testToString_empty() {
        assertEquals("<>", TypeBindings.emptyBindings().toString());
    }

    @Test
    public void testToString_nonEmpty() {
        JavaType t1 = mockType("Ljava/lang/String;");
        JavaType t2 = mockType("Ljava/lang/Integer;");
        TypeBindings tb = TypeBindings.create(TwoParam.class, t1, t2);
        assertEquals("<Ljava/lang/String;,Ljava/lang/Integer;>", tb.toString());
    }

    // ===================== hashCode =====================

    @Test
    public void testHashCode() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        TypeBindings tb = TypeBindings.create(TwoParam.class, t1, t2);
        int expected = 1 + t1.hashCode() + t2.hashCode();
        assertEquals(expected, tb.hashCode());
    }

    // ===================== equals =====================

    @Test
    public void testEquals_sameInstance() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertTrue(tb.equals(tb));
    }

    @Test
    public void testEquals_null() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertFalse(tb.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        assertFalse(tb.equals("not a TypeBindings"));
    }

    @Test
    public void testEquals_differentSize() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        TypeBindings tb1 = TypeBindings.create(OneParam.class, t1);
        TypeBindings tb2 = TypeBindings.create(TwoParam.class, t1, t2);
        assertFalse(tb1.equals(tb2));
        assertFalse(tb2.equals(tb1));
    }

    @Test
    public void testEquals_sameSizeDifferentTypes() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null); // distinct mock -> ไม่ equal กัน (identity-based default)
        TypeBindings tb1 = TypeBindings.create(OneParam.class, t1);
        TypeBindings tb2 = TypeBindings.create(OneParam.class, t2);
        assertFalse(tb1.equals(tb2));
    }

    @Test
    public void testEquals_sameSizeSameTypes() {
        JavaType t1 = mockType(null);
        JavaType t2 = mockType(null);
        // ใช้ JavaType reference เดียวกันในทั้งสอง binding -> equal
        TypeBindings tb1 = TypeBindings.create(TwoParam.class, t1, t2);
        TypeBindings tb2 = TypeBindings.create(TwoParam.class, t1, t2);
        assertTrue(tb1.equals(tb2));
        assertTrue(tb2.equals(tb1));
    }

    // ===================== readResolve (protected, via reflection) =====================

    @Test
    public void testReadResolve_emptyReturnsEmptyInstance() throws Exception {
        TypeBindings tb = TypeBindings.emptyBindings();
        Method m = TypeBindings.class.getDeclaredMethod("readResolve");
        m.setAccessible(true);
        Object result = m.invoke(tb);
        assertSame(TypeBindings.emptyBindings(), result);
    }

    @Test
    public void testReadResolve_nonEmptyReturnsSameInstance() throws Exception {
        JavaType t1 = mockType(null);
        TypeBindings tb = TypeBindings.create(OneParam.class, t1);
        Method m = TypeBindings.class.getDeclaredMethod("readResolve");
        m.setAccessible(true);
        Object result = m.invoke(tb);
        assertSame(tb, result);
    }
}

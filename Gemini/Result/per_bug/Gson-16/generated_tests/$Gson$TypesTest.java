package com.google.gson.internal;

import org.junit.Test;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

import static org.junit.Assert.*;

public class $Gson$TypesTest {

    // Helper interfaces/classes for reflection testing
    private interface MyInterface<T> {}
    private static class MyClass implements MyInterface<String> {}
    private static class SubClass extends MyClass {}
    private static class GenericClass<T> {
        T field;
    }
    private class InnerClass {} // Non-static inner class for ownerType testing

    @Test
    public void testNewParameterizedTypeWithOwner() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertNotNull(pt);
        assertEquals(List.class, pt.getRawType());
        assertArrayEquals(new Type[]{String.class}, pt.getActualTypeArguments());
        assertNull(pt.getOwnerType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParameterizedTypeWithOwnerEdgeCase() {
        // Non-static inner class requires an owner type, passing null should throw IllegalArgumentException
        $Gson$Types.newParameterizedTypeWithOwner(null, InnerClass.class);
    }

    @Test
    public void testArrayOf() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertNotNull(gat);
        assertEquals(String.class, gat.getGenericComponentType());
    }

    @Test
    public void testSubtypeOf() {
        WildcardType wt1 = $Gson$Types.subtypeOf(CharSequence.class);
        assertEquals("? extends java.lang.CharSequence", wt1.toString());

        // Passing a WildcardType as bound
        WildcardType wt2 = $Gson$Types.subtypeOf(wt1);
        assertEquals("? extends java.lang.CharSequence", wt2.toString());
    }

    @Test
    public void testSupertypeOf() {
        WildcardType wt1 = $Gson$Types.supertypeOf(String.class);
        assertEquals("? super java.lang.String", wt1.toString());

        // Passing a WildcardType as bound
        WildcardType wt2 = $Gson$Types.supertypeOf(wt1);
        assertEquals("? super java.lang.String", wt2.toString());
    }

    @Test
    public void testCanonicalize() {
        Class<?> arrClass = String[].class;
        Type canonicalArr = $Gson$Types.canonicalize(arrClass);
        assertTrue(canonicalArr instanceof GenericArrayType);

        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(pt, $Gson$Types.canonicalize(pt));

        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertEquals(gat, $Gson$Types.canonicalize(gat));

        WildcardType wt = $Gson$Types.subtypeOf(String.class);
        assertEquals(wt, $Gson$Types.canonicalize(wt));

        Type plain = Integer.class;
        assertEquals(plain, $Gson$Types.canonicalize(plain));
    }

    @Test
    public void testGetRawType() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));

        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(List.class, $Gson$Types.getRawType(pt));

        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertEquals(String[].class, $Gson$Types.getRawType(gat));

        TypeVariable<?> tv = GenericClass.class.getTypeParameters()[0];
        assertEquals(Object.class, $Gson$Types.getRawType(tv));

        WildcardType wt = $Gson$Types.subtypeOf(String.class);
        assertEquals(String.class, $Gson$Types.getRawType(wt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawTypeInvalid() {
        $Gson$Types.getRawType($Gson$Types.subtypeOf(Object.class)); // Triggers unsupported or edge case via invalid type
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawTypeNullPointerExceptionHandling() {
        $Gson$Types.getRawType(null);
    }

    @Test
    public void testEqualsTypes() throws Exception {
        Type t1 = String.class;
        Type t2 = String.class;
        Type t3 = Integer.class;

        assertTrue($Gson$Types.equals(t1, t2));
        assertFalse($Gson$Types.equals(t1, t3));
        assertTrue($Gson$Types.equals(null, null));
        assertFalse($Gson$Types.equals(t1, null));
        assertFalse($Gson$Types.equals(null, t1));

        // ParameterizedType equals
        ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
        assertTrue($Gson$Types.equals(pt1, pt2));
        assertFalse($Gson$Types.equals(pt1, pt3));
        assertFalse($Gson$Types.equals(pt1, String.class));

        // GenericArrayType equals
        GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
        GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);
        assertTrue($Gson$Types.equals(gat1, gat2));
        assertFalse($Gson$Types.equals(gat1, gat3));
        assertFalse($Gson$Types.equals(gat1, String.class));

        // WildcardType equals
        WildcardType wt1 = $Gson$Types.subtypeOf(String.class);
        WildcardType wt2 = $Gson$Types.subtypeOf(String.class);
        WildcardType wt3 = $Gson$Types.supertypeOf(String.class);
        assertTrue($Gson$Types.equals(wt1, wt2));
        assertFalse($Gson$Types.equals(wt1, wt3));
        assertFalse($Gson$Types.equals(wt1, String.class));

        // TypeVariable equals
        TypeVariable<?> tv1 = GenericClass.class.getTypeParameters()[0];
        TypeVariable<?> tv2 = GenericClass.class.getTypeParameters()[0];
        TypeVariable<?> tv3 = SubClass.class.getTypeParameters().length > 0 ? SubClass.class.getTypeParameters()[0] : GenericClass.class.getTypeParameters()[0];
        assertTrue($Gson$Types.equals(tv1, tv2));
        assertFalse($Gson$Types.equals(tv1, String.class));
    }

    @Test
    public void testHashCodeOrZero() {
        assertEquals(0, $Gson$Types.hashCodeOrZero(null));
        assertEquals("test".hashCode(), $Gson$Types.hashCodeOrZero("test"));
    }

    @Test
    public void testTypeToString() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(pt.toString(), $Gson$Types.typeToString(pt));
    }

    @Test
    public void testGetCollectionElementType() {
        Type colType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(String.class, $Gson$Types.getCollectionElementType(colType, List.class));

        // Wildcard collection type branch
        WildcardType wt = $Gson$Types.subtypeOf(colType);
        // Fallback or object class cases
        assertEquals(Object.class, $Gson$Types.getCollectionElementType(String.class, String.class));
    }

    @Test
    public void testGetMapKeyAndValueTypes() {
        Type mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
        Type[] kv = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
        assertEquals(2, kv.length);
        assertEquals(String.class, kv[0]);
        assertEquals(Integer.class, kv[1]);

        // Properties special case
        Type[] propKv = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertEquals(String.class, propKv[0]);
        assertEquals(String.class, propKv[1]);

        // Non-parameterized map fallback
        Type[] defaultKv = $Gson$Types.getMapKeyAndValueTypes(HashMap.class, HashMap.class);
        assertEquals(Object.class, defaultKv[0]);
        assertEquals(Object.class, defaultKv[1]);
    }

    @Test
    public void testResolve() {
        TypeVariable<?> tv = GenericClass.class.getTypeParameters()[0];
        ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericClass.class, String.class);
        
        Type resolved = $Gson$Types.resolve(context, GenericClass.class, tv);
        assertEquals(String.class, resolved);

        // Array resolve
        Type resolvedArr = $Gson$Types.resolve(context, GenericClass.class, String[].class);
        assertEquals(String[].class, resolvedArr);

        // GenericArrayType resolve
        Type resolvedGat = $Gson$Types.resolve(context, GenericClass.class, $Gson$Types.arrayOf(tv));
        assertEquals($Gson$Types.arrayOf(String.class), resolvedGat);

        // WildcardType resolve bounds
        WildcardType wtLower = $Gson$Types.supertypeOf(tv);
        Type resolvedWtLower = $Gson$Types.resolve(context, GenericClass.class, wtLower);
        assertNotNull(resolvedWtLower);

        WildcardType wtUpper = $Gson$Types.subtypeOf(tv);
        Type resolvedWtUpper = $Gson$Types.resolve(context, GenericClass.class, wtUpper);
        assertNotNull(resolvedWtUpper);

        // Unresolvable TypeVariable
        TypeVariable<?> unresolvableTv = MyClass.class.getTypeParameters().length > 0 ? MyClass.class.getTypeParameters()[0] : tv;
        assertEquals(unresolvableTv, $Gson$Types.resolve(Object.class, Object.class, unresolvableTv));
    }

    @Test
    public void testCheckNotPrimitive() {
        $Gson$Types.checkNotPrimitive(String.class);
        // Primitive check should not throw for non-primitives
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckNotPrimitiveThrows() {
        $Gson$Types.checkNotPrimitive(int.class);
    }
}
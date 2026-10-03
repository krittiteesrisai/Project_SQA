package com.google.gson.internal;

import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static org.junit.Assert.*;

public class $Gson$TypesTest {

    private static class DummyClass<T> {
        T field;
    }

    private interface DummyInterface<T> extends Collection<T> {}

    @Test(expected = UnsupportedOperationException.class)
    public void testPrivateConstructor() throws Exception {
        java.lang.reflect.Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw (RuntimeException) e.getTargetException();
        }
    }

    @Test
    public void testCanonicalize() {
        // Class - non array
        Type t1 = $Gson$Types.canonicalize(String.class);
        assertEquals(String.class, t1);

        // Class - array
        Type t2 = $Gson$Types.canonicalize(String[].class);
        assertTrue(t2 instanceof GenericArrayType);

        // ParameterizedType
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type t3 = $Gson$Types.canonicalize(pt);
        assertEquals(pt, t3);

        // GenericArrayType
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        Type t4 = $Gson$Types.canonicalize(gat);
        assertEquals(gat, t4);

        // WildcardType
        WildcardType wt = $Gson$Types.subtypeOf(Number.class);
        Type t5 = $Gson$Types.canonicalize(wt);
        assertEquals(wt, t5);

        // Other type (Serializable as-is)
        Type t6 = $Gson$Types.canonicalize(int.class);
        assertEquals(int.class, t6);
    }

    @Test
    public void testGetRawType() {
        assertEquals(String.class, $Gson$Types.getRawType(String.class));

        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(List.class, $Gson$Types.getRawType(pt));

        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertEquals(String[].class, $Gson$Types.getRawType(gat));

        WildcardType wt = $Gson$Types.subtypeOf(String.class);
        assertEquals(String.class, $Gson$Types.getRawType(wt));

        TypeVariable<?> tv = DummyClass.class.getTypeParameters()[0];
        assertEquals(Object.class, $Gson$Types.getRawType(tv));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawTypeParameterizedInvalidRaw() {
        // Construct a weird parameterized type where raw type is not a Class
        ParameterizedType fakePt = new ParameterizedType() {
            public Type[] getActualTypeArguments() { return new Type[0]; }
            public Type getRawType() { return () -> null; } // Not a Class
            public Type getOwnerType() { return null; }
        };
        $Gson$Types.getRawType(fakePt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawTypeUnsupported() {
        $Gson$Types.getRawType(() -> null);
    }

    @Test
    public void testGetRawTypeNull() {
        try {
            $Gson$Types.getRawType(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("null"));
        }
    }

    @Test
    public void testEqualsTypes() {
        Type t1 = String.class;
        Type t2 = String.class;
        Type t3 = Integer.class;

        assertTrue($Gson$Types.equals(t1, t1));
        assertTrue($Gson$Types.equals(t1, t2));
        assertFalse($Gson$Types.equals(t1, t3));
        assertFalse($Gson$Types.equals(t1, null));
        assertFalse($Gson$Types.equals(null, t1));
        assertTrue($Gson$Types.equals(null, null));

        // ParameterizedType equals
        ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
        assertTrue($Gson$Types.equals(pt1, pt2));
        assertFalse($Gson$Types.equals(pt1, pt3));
        assertFalse($Gson$Types.equals(pt1, String.class)); // b is not ParameterizedType

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
        TypeVariable<?> tv1 = DummyClass.class.getTypeParameters()[0];
        TypeVariable<?> tv2 = DummyClass.class.getTypeParameters()[0];
        assertTrue($Gson$Types.equals(tv1, tv2));
        assertFalse($Gson$Types.equals(tv1, String.class));

        // Unsupported type equals
        Type unsupported = () -> null;
        assertFalse($Gson$Types.equals(unsupported, unsupported));
    }

    @Test
    public void testTypeToString() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(pt.toString(), $Gson$Types.typeToString(pt));
    }

    @Test
    public void testGetSupertypeAndGenericSupertype() {
        Type superType = $Gson$Types.getSupertype(
                $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class),
                ArrayList.class,
                Collection.class
        );
        assertNotNull(superType);

        // Test interface resolution path in getGenericSupertype
        Type interfaceSuper = $Gson$Types.getSupertype(
                $Gson$Types.newParameterizedTypeWithOwner(null, DummyInterface.class, String.class),
                DummyInterface.class,
                Collection.class
        );
        assertNotNull(interfaceSuper);
    }

    @Test
    public void testGetArrayComponentType() {
        assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, $Gson$Types.getArrayComponentType(gat));
    }

    @Test(expected = ClassCastException.class)
    public void testGetArrayComponentTypeInvalid() {
        $Gson$Types.getArrayComponentType(String.class);
    }

    @Test
    public void testGetCollectionElementType() {
        Type listType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(String.class, $Gson$Types.getCollectionElementType(listType, List.class));

        // Wildcard collection type branch
        WildcardType wt = $Gson$Types.subtypeOf(listType);
        assertEquals(String.class, $Gson$Types.getCollectionElementType(wt, Collection.class));

        // Non-parameterized collection fallback
        assertEquals(Object.class, $Gson$Types.getCollectionElementType(Collection.class, Collection.class));
    }

    @Test
    public void testGetMapKeyAndValueTypes() {
        // Properties edge case
        Type[] propsTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertEquals(2, propsTypes.length);
        assertEquals(String.class, propsTypes[0]);
        assertEquals(String.class, propsTypes[1]);

        // Parameterized Map
        Type mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
        Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
        assertEquals(String.class, mapTypes[0]);
        assertEquals(Integer.class, mapTypes[1]);

        // Non-parameterized Map fallback
        Type[] rawMapTypes = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
        assertEquals(Object.class, rawMapTypes[0]);
        assertEquals(Object.class, rawMapTypes[1]);
    }

    @Test
    public void testResolve() {
        // TypeVariable resolution
        TypeVariable<?> tv = DummyClass.class.getTypeParameters()[0];
        ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, DummyClass.class, String.class);
        Type resolved = $Gson$Types.resolve(context, DummyClass.class, tv);
        assertEquals(String.class, resolved);

        // Class array resolution
        Class<?> arrClass = String[].class;
        assertEquals(arrClass, $Gson$Types.resolve(String.class, String.class, arrClass));

        // GenericArrayType resolution
        GenericArrayType gat = $Gson$Types.arrayOf(tv);
        Type resolvedGat = $Gson$Types.resolve(context, DummyClass.class, gat);
        assertTrue(resolvedGat instanceof GenericArrayType);

        // ParameterizedType resolution with changes and without changes
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, tv);
        Type resolvedPt = $Gson$Types.resolve(context, DummyClass.class, pt);
        assertTrue(resolvedPt instanceof ParameterizedType);

        // WildcardType lower bound / upper bound resolution
        WildcardType wtLower = $Gson$Types.supertypeOf(tv);
        Type resolvedWtLower = $Gson$Types.resolve(context, DummyClass.class, wtLower);
        assertTrue(resolvedWtLower instanceof WildcardType);

        WildcardType wtUpper = $Gson$Types.subtypeOf(tv);
        Type resolvedWtUpper = $Gson$Types.resolve(context, DummyClass.class, wtUpper);
        assertTrue(resolvedWtUpper instanceof WildcardType);

        // Fallback / default resolution
        assertEquals(String.class, $Gson$Types.resolve(context, DummyClass.class, String.class));
    }

    @Test
    public void testWildcardTypeImplEdgeCases() {
        // Lower bounds case
        WildcardType superType = $Gson$Types.supertypeOf(String.class);
        assertNotNull(superType.getLowerBounds());
        assertEquals(1, superType.getLowerBounds().length);
        assertEquals("? super java.lang.String", superType.toString());
        assertNotNull(superType.hashCode());

        // Upper bounds case (Object.class)
        WildcardType wildcardAny = $Gson$Types.subtypeOf(Object.class);
        assertEquals("?", wildcardAny.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWildcardTypeMultipleLowerBounds() {
        new $Gson$TypesTest.WildcardTypeTestHelper(new Type[]{String.class, Integer.class}, new Type[]{Object.class});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWildcardTypeInvalidUpperBoundCount() {
        new $Gson$TypesTest.WildcardTypeTestHelper(new Type[0], new Type[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWildcardTypePrimitiveLowerBound() {
        $Gson$Types.supertypeOf(int.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParameterizedTypePrimitiveArgument() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
    }

    @Test
    public void testParameterizedTypeToStringAndHash() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
        assertTrue(pt.toString().contains("Map"));
        assertTrue(pt.hashCode() != 0);
        assertNotNull(pt.getActualTypeArguments());
        assertNotNull(pt.getRawType());
        assertNull(pt.getOwnerType());
    }

    @Test
    public void testGenericArrayTypeToStringAndHash() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertEquals("java.lang.String[]", gat.toString());
        assertTrue(gat.hashCode() != 0);
    }

    // Helper to test private constructors/validation of WildcardTypeImpl via reflection/package access if needed,
    // Or we can invoke it via $Gson$Types methods.
    private static class WildcardTypeTestHelper {
        WildcardTypeTestHelper(Type[] lower, Type[] upper) {
            // Uses reflection to invoke private WildcardTypeImpl constructor if necessary,
            // or we can test via standard methods if they expose it.
            try {
                Class<?> clazz = Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl");
                java.lang.reflect.Constructor<?> ctor = clazz.getDeclaredConstructor(Type[].class, Type[].class);
                ctor.setAccessible(true);
                ctor.newInstance(upper, lower);
            } catch (Exception e) {
                if (e.getCause() instanceof RuntimeException) {
                    throw (RuntimeException) e.getCause();
                }
                throw new RuntimeException(e);
            }
        }
    }
}
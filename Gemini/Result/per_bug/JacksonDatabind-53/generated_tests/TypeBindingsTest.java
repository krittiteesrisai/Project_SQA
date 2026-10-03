package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TypeBindingsTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final TypeFactory typeFactory = mapper.getTypeFactory();

    // Helper to create JavaType
    private JavaType constructType(Class<?> cls) {
        return typeFactory.constructType(cls);
    }

    @Test
    public void testEmptyBindings() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
        assertEquals("<>", bindings.toString());
        assertEquals(Collections.emptyList(), bindings.getTypeParameters());
        assertNull(bindings.getBoundName(0));
        assertNull(bindings.getBoundName(-1));
        assertNull(bindings.getBoundType(0));
        assertNull(bindings.getBoundType(-1));
    }

    @Test
    public void testReadResolve() throws Exception {
        // Test readResolve with null/empty names returning EMPTY static instance
        java.lang.reflect.Method m = TypeBindings.class.getDeclaredMethod("readResolve");
        m.setAccessible(true);
        
        TypeBindings emptyViaCreate = TypeBindings.create(List.class, (JavaType[]) null);
        // Using reflection to invoke readResolve
        Object resolved = m.invoke(emptyViaCreate);
        assertSame(TypeBindings.emptyBindings(), resolved);
    }

    @Test
    public void testCreateWithList() {
        List<JavaType> types = new ArrayList<>();
        types.add(constructType(String.class));
        
        TypeBindings bindings = TypeBindings.create(List.class, types);
        assertFalse(bindings.isEmpty());
        assertEquals(1, bindings.size());
        assertEquals("E", bindings.getBoundName(0));
        assertEquals(constructType(String.class), bindings.getBoundType(0));

        // Null list edge case
        TypeBindings nullBindings = TypeBindings.create(List.class, (List<JavaType>) null);
        assertTrue(nullBindings.isEmpty());
    }

    @Test
    public void testCreateArrayLengthBranches() {
        // Length 1 (triggers create(Class, JavaType))
        JavaType[] t1 = new JavaType[] { constructType(String.class) };
        TypeBindings b1 = TypeBindings.create(List.class, t1);
        assertEquals(1, b1.size());

        // Length 2 (triggers create(Class, JavaType, JavaType))
        JavaType[] t2 = new JavaType[] { constructType(String.class), constructType(Integer.class) };
        TypeBindings b2 = TypeBindings.create(Map.class, t2);
        assertEquals(2, b2.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMismatchLengthException() {
        // List expects 1 parameter, but we pass 2
        JavaType[] types = new JavaType[] { constructType(String.class), constructType(Integer.class) };
        TypeBindings.create(List.class, types);
    }

    @Test
    public void testCreate1And2ParamStash() {
        // Test TypeParamStash branches for common types (Collection, List, ArrayList, AbstractList, Iterable)
        assertNotNull(TypeBindings.create(Collection.class, constructType(String.class)));
        assertNotNull(TypeBindings.create(List.class, constructType(String.class)));
        assertNotNull(TypeBindings.create(ArrayList.class, constructType(String.class)));
        assertNotNull(TypeBindings.create(AbstractList.class, constructType(String.class)));
        assertNotNull(TypeBindings.create(Iterable.class, constructType(String.class)));

        // Test Map stash branches (Map, HashMap, LinkedHashMap)
        assertNotNull(TypeBindings.create(Map.class, constructType(String.class), constructType(String.class)));
        assertNotNull(TypeBindings.create(HashMap.class, constructType(String.class), constructType(String.class)));
        assertNotNull(TypeBindings.create(LinkedHashMap.class, constructType(String.class), constructType(String.class)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate1ParamInvalidVarLen() {
        // String.class has 0 type parameters, but we force 1
        TypeBindings.create(String.class, constructType(String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate2ParamInvalidVarLen() {
        // List.class has 1 parameter, but we force 2
        TypeBindings.create(List.class, constructType(String.class), constructType(String.class));
    }

    @Test
    public void testCreateIfNeeded() {
        // Class with 0 parameters (String.class) should return EMPTY
        TypeBindings b1 = TypeBindings.createIfNeeded(String.class, constructType(Integer.class));
        assertSame(TypeBindings.emptyBindings(), b1);

        // Class with 1 parameter (List.class) with correct types
        TypeBindings b2 = TypeBindings.createIfNeeded(List.class, constructType(String.class));
        assertEquals(1, b2.size());

        // Null types array with generic class
        TypeBindings b3 = TypeBindings.createIfNeeded(List.class, (JavaType[]) null);
        assertTrue(b3.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeededMismatch() {
        TypeBindings.createIfNeeded(List.class, new JavaType[]{});
    }

    @Test
    public void testWithUnboundVariable() {
        TypeBindings b = TypeBindings.emptyBindings();
        TypeBindings b1 = b.withUnboundVariable("T");
        assertTrue(b1.hasUnbound("T"));
        assertFalse(b1.hasUnbound("X"));

        TypeBindings b2 = b1.withUnboundVariable("U");
        assertTrue(b2.hasUnbound("T"));
        assertTrue(b2.hasUnbound("U"));
    }

    @Test
    public void testFindBoundTypeAndRecursive() {
        JavaType stringType = constructType(String.class);
        TypeBindings b = TypeBindings.create(List.class, stringType);
        
        assertEquals(stringType, b.findBoundType("E"));
        assertNull(b.findBoundType("NonExistent"));

        // Test ResolvedRecursiveType branch inside findBoundType
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        rrt.setReference(stringType);
        
        TypeBindings recursiveBindings = TypeBindings.create(List.class, rrt);
        assertEquals(stringType, recursiveBindings.findBoundType("E"));
    }

    @Test
    public void testEqualsAndHashCode() {
        TypeBindings b1 = TypeBindings.create(List.class, constructType(String.class));
        TypeBindings b2 = TypeBindings.create(List.class, constructType(String.class));
        TypeBindings b3 = TypeBindings.create(List.class, constructType(Integer.class));
        TypeBindings b4 = TypeBindings.create(Map.class, constructType(String.class), constructType(String.class));

        // Reflexive & Symmetry & Null & Different Class
        assertTrue(b1.equals(b1));
        assertTrue(b1.equals(b2));
        assertFalse(b1.equals(null));
        assertFalse(b1.equals("some string"));

        // Different types size or content
        assertFalse(b1.equals(b3));
        assertFalse(b1.equals(b4));

        assertEquals(b1.hashCode(), b2.hashCode());
    }

    @Test
    public void testToStringWithTypes() {
        TypeBindings b = TypeBindings.create(List.class, constructType(String.class));
        String str = b.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("<"));
        assertTrue(str.endsWith(">"));
    }
}
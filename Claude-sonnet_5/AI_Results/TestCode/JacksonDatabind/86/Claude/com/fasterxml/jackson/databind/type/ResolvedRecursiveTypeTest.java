package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้จะอยู่ package เดียวกัน)
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;

public class ResolvedRecursiveTypeTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    private ResolvedRecursiveType newRecursiveType(Class<?> erased) {
        return new ResolvedRecursiveType(erased, TypeBindings.emptyBindings());
    }

    // ---------------------------------------------------------------
    // Constructor / initial state
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_initialStateIsUnresolved() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertNull("New instance should have no referenced type yet", type.getSelfReferencedType());
    }

    // ---------------------------------------------------------------
    // setReference / getSelfReferencedType
    // ---------------------------------------------------------------

    @Test
    public void testSetReference_thenGetSelfReferencedType() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType ref = typeFactory.constructType(String.class);
        type.setReference(ref);
        assertSame(ref, type.getSelfReferencedType());
    }

    @Test
    public void testSetReference_withNullRef_doesNotThrow_staysNull() {
        // old value is null -> sanity check passes, new value (null) simply assigned
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        type.setReference(null);
        assertNull(type.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReference_calledTwice_throwsIllegalStateException() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType ref1 = typeFactory.constructType(String.class);
        JavaType ref2 = typeFactory.constructType(Integer.class);
        type.setReference(ref1);
        type.setReference(ref2); // must throw - old value already set
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReference_afterSet_thenSetNull_stillThrows() {
        // branch depends only on old value != null, regardless of new value
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        type.setReference(typeFactory.constructType(String.class));
        type.setReference(null);
    }

    @Test
    public void testSetReference_calledTwice_exceptionMessageContainsDetails() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType ref1 = typeFactory.constructType(String.class);
        JavaType ref2 = typeFactory.constructType(Integer.class);
        type.setReference(ref1);
        try {
            type.setReference(ref2);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Trying to re-set self reference"));
        }
    }

    // ---------------------------------------------------------------
    // getGenericSignature / getErasedSignature
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testGetGenericSignature_unresolved_throwsNPE() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        type.getGenericSignature(new StringBuilder());
    }

    @Test
    public void testGetGenericSignature_resolved_delegatesToReferencedType() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType ref = typeFactory.constructType(String.class);
        type.setReference(ref);
        String expected = ref.getGenericSignature(new StringBuilder()).toString();
        String actual = type.getGenericSignature(new StringBuilder()).toString();
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testGetErasedSignature_unresolved_throwsNPE() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        type.getErasedSignature(new StringBuilder());
    }

    @Test
    public void testGetErasedSignature_resolved_delegatesToReferencedType() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType ref = typeFactory.constructType(String.class);
        type.setReference(ref);
        String expected = ref.getErasedSignature(new StringBuilder()).toString();
        String actual = type.getErasedSignature(new StringBuilder()).toString();
        assertEquals(expected, actual);
    }

    // ---------------------------------------------------------------
    // with* methods -> all must return "this" unconditionally
    // ---------------------------------------------------------------

    @Test
    public void testWithContentType_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType contentType = typeFactory.constructType(String.class);
        assertSame(type, type.withContentType(contentType));
    }

    @Test
    public void testWithContentType_nullArg_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withContentType(null));
    }

    @Test
    public void testWithTypeHandler_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withTypeHandler(new Object()));
    }

    @Test
    public void testWithTypeHandler_nullArg_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withTypeHandler(null));
    }

    @Test
    public void testWithContentTypeHandler_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withContentTypeHandler(new Object()));
    }

    @Test
    public void testWithContentTypeHandler_nullArg_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withContentTypeHandler(null));
    }

    @Test
    public void testWithValueHandler_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withValueHandler(new Object()));
    }

    @Test
    public void testWithValueHandler_nullArg_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withValueHandler(null));
    }

    @Test
    public void testWithContentValueHandler_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withContentValueHandler(new Object()));
    }

    @Test
    public void testWithContentValueHandler_nullArg_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withContentValueHandler(null));
    }

    @Test
    public void testWithStaticTyping_returnsSameInstance() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertSame(type, type.withStaticTyping());
    }

    // ---------------------------------------------------------------
    // _narrow (protected, deprecated) - accessed via reflection
    // ---------------------------------------------------------------

    @Test
    public void testNarrow_returnsSameInstance() throws Exception {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        Method m = ResolvedRecursiveType.class.getDeclaredMethod("_narrow", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(type, String.class);
        assertSame(type, result);
    }

    @Test
    public void testNarrow_nullArg_returnsSameInstance() throws Exception {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        Method m = ResolvedRecursiveType.class.getDeclaredMethod("_narrow", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(type, new Object[]{ null });
        assertSame(type, result);
    }

    // ---------------------------------------------------------------
    // refine -> always null regardless of arguments
    // ---------------------------------------------------------------

    @Test
    public void testRefine_withValidArguments_alwaysReturnsNull() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType result = type.refine(String.class, TypeBindings.emptyBindings(),
                typeFactory.constructType(Object.class), new JavaType[0]);
        assertNull(result);
    }

    @Test
    public void testRefine_withAllNullArguments_returnsNull() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType result = type.refine(null, null, null, null);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // isContainerType -> always false
    // ---------------------------------------------------------------

    @Test
    public void testIsContainerType_alwaysFalse() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertFalse(type.isContainerType());
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToString_unresolved_containsUNRESOLVED() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        String s = type.toString();
        assertTrue(s.startsWith("[recursive type; "));
        assertTrue(s.contains("UNRESOLVED"));
    }

    @Test
    public void testToString_resolved_containsRawClassName() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        JavaType ref = typeFactory.constructType(String.class);
        type.setReference(ref);
        String s = type.toString();
        assertTrue(s.contains(String.class.getName()));
        assertFalse(s.contains("UNRESOLVED"));
    }

    // ---------------------------------------------------------------
    // equals
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_unresolvedReference_alwaysFalse_evenSameInstanceFields() {
        // _referencedType == null => must return false regardless of "o"
        ResolvedRecursiveType type1 = newRecursiveType(ArrayList.class);
        ResolvedRecursiveType type2 = newRecursiveType(ArrayList.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_differentRuntimeClass_returnsFalse() {
        ResolvedRecursiveType type = newRecursiveType(ArrayList.class);
        type.setReference(typeFactory.constructType(String.class));
        assertFalse(type.equals("not a ResolvedRecursiveType"));
    }

    @Test
    public void testEquals_sameClass_sameReferencedType_returnsTrue() {
        ResolvedRecursiveType type1 = newRecursiveType(ArrayList.class);
        ResolvedRecursiveType type2 = newRecursiveType(List.class);
        JavaType ref = typeFactory.constructType(String.class);
        type1.setReference(ref);
        type2.setReference(ref);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEquals_sameClass_differentReferencedType_returnsFalse() {
        ResolvedRecursiveType type1 = newRecursiveType(ArrayList.class);
        ResolvedRecursiveType type2 = newRecursiveType(ArrayList.class);
        type1.setReference(typeFactory.constructType(String.class));
        type2.setReference(typeFactory.constructType(Integer.class));
        assertFalse(type1.equals(type2));
    }
}

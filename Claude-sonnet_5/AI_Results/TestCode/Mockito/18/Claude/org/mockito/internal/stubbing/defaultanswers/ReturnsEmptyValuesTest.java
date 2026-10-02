package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    /**
     * Fake InvocationOnMock สร้างขึ้นเองเพื่อควบคุม getMethod()/getMock()/getArguments()
     * ให้ตรงกับที่ต้องการทดสอบแต่ละ branch ของ answer()
     * (ไม่ใช้ Mockito.mock(InvocationOnMock.class) เพื่อลด dependency ซ้อน)
     */
    private static class SimpleInvocation implements InvocationOnMock {
        private final Method method;
        private final Object mock;
        private final Object[] args;

        SimpleInvocation(Method method, Object mock, Object[] args) {
            this.method = method;
            this.mock = mock;
            this.args = args;
        }

        public Object getMock() {
            return mock;
        }

        public Method getMethod() {
            return method;
        }

        public Object[] getArguments() {
            return args;
        }

        public Object callRealMethod() throws Throwable {
            throw new UnsupportedOperationException("not used in this test");
        }
    }

    // Interface เสริมสำหรับทดสอบ return type ที่ไม่รู้จัก (เพื่อ hit branch "return null")
    interface CustomInterface {
        String getValue();
    }

    // ---------------------------------------------------------
    // returnValueFor(Class<?>) : primitive / wrapper branches
    // ---------------------------------------------------------

    @Test
    public void shouldReturnZeroForPrimitiveInt() {
        assertEquals(0, returnsEmptyValues.returnValueFor(int.class));
    }

    @Test
    public void shouldReturnFalseForPrimitiveBoolean() {
        assertEquals(false, returnsEmptyValues.returnValueFor(boolean.class));
    }

    @Test
    public void shouldReturnZeroForPrimitiveByte() {
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(byte.class));
    }

    @Test
    public void shouldReturnZeroForPrimitiveShort() {
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(short.class));
    }

    @Test
    public void shouldReturnZeroForPrimitiveLong() {
        assertEquals(0L, returnsEmptyValues.returnValueFor(long.class));
    }

    @Test
    public void shouldReturnZeroForPrimitiveFloat() {
        assertEquals(0f, returnsEmptyValues.returnValueFor(float.class));
    }

    @Test
    public void shouldReturnZeroForPrimitiveDouble() {
        assertEquals(0d, returnsEmptyValues.returnValueFor(double.class));
    }

    @Test
    public void shouldReturnZeroCharForPrimitiveChar() {
        assertEquals((char) 0, returnsEmptyValues.returnValueFor(char.class));
    }

    @Test
    public void shouldReturnZeroForWrapperInteger() {
        assertEquals(0, returnsEmptyValues.returnValueFor(Integer.class));
    }

    @Test
    public void shouldReturnFalseForWrapperBoolean() {
        assertEquals(Boolean.FALSE, returnsEmptyValues.returnValueFor(Boolean.class));
    }

    // ---------------------------------------------------------
    // returnValueFor(Class<?>) : collection / map branches
    // ---------------------------------------------------------

    @Test
    public void shouldReturnEmptyLinkedListForCollectionType() {
        Object result = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyHashSetForSetType() {
        Object result = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void shouldReturnEmptyHashSetForHashSetType() {
        assertTrue(returnsEmptyValues.returnValueFor(HashSet.class) instanceof HashSet);
    }

    @Test
    public void shouldReturnEmptyTreeSetForSortedSetType() {
        assertTrue(returnsEmptyValues.returnValueFor(SortedSet.class) instanceof TreeSet);
    }

    @Test
    public void shouldReturnEmptyTreeSetForTreeSetType() {
        assertTrue(returnsEmptyValues.returnValueFor(TreeSet.class) instanceof TreeSet);
    }

    @Test
    public void shouldReturnEmptyLinkedHashSetForLinkedHashSetType() {
        assertTrue(returnsEmptyValues.returnValueFor(LinkedHashSet.class) instanceof LinkedHashSet);
    }

    @Test
    public void shouldReturnEmptyLinkedListForListType() {
        assertTrue(returnsEmptyValues.returnValueFor(List.class) instanceof LinkedList);
    }

    @Test
    public void shouldReturnEmptyLinkedListForLinkedListType() {
        assertTrue(returnsEmptyValues.returnValueFor(LinkedList.class) instanceof LinkedList);
    }

    @Test
    public void shouldReturnEmptyArrayListForArrayListType() {
        assertTrue(returnsEmptyValues.returnValueFor(ArrayList.class) instanceof ArrayList);
    }

    @Test
    public void shouldReturnEmptyHashMapForMapType() {
        assertTrue(returnsEmptyValues.returnValueFor(Map.class) instanceof HashMap);
    }

    @Test
    public void shouldReturnEmptyHashMapForHashMapType() {
        assertTrue(returnsEmptyValues.returnValueFor(HashMap.class) instanceof HashMap);
    }

    @Test
    public void shouldReturnEmptyTreeMapForSortedMapType() {
        assertTrue(returnsEmptyValues.returnValueFor(SortedMap.class) instanceof TreeMap);
    }

    @Test
    public void shouldReturnEmptyTreeMapForTreeMapType() {
        assertTrue(returnsEmptyValues.returnValueFor(TreeMap.class) instanceof TreeMap);
    }

    @Test
    public void shouldReturnEmptyLinkedHashMapForLinkedHashMapType() {
        assertTrue(returnsEmptyValues.returnValueFor(LinkedHashMap.class) instanceof LinkedHashMap);
    }

    // ---------------------------------------------------------
    // returnValueFor(Class<?>) : fallback -> null
    // ---------------------------------------------------------

    @Test
    public void shouldReturnNullForUnrecognizedTypeString() {
        assertNull(returnsEmptyValues.returnValueFor(String.class));
    }

    @Test
    public void shouldReturnNullForUnrecognizedCollectionInterfaceQueue() {
        // Queue ไม่ได้ถูก handle ใน if-chain -> ต้อง return null
        assertNull(returnsEmptyValues.returnValueFor(Queue.class));
    }

    // ---------------------------------------------------------
    // answer(InvocationOnMock) : isToString branch
    // ---------------------------------------------------------

    @Test
    public void shouldReturnDefaultMockDescriptionForToString() throws Exception {
        List<?> mock = Mockito.mock(List.class);
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = new SimpleInvocation(toStringMethod, mock, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertTrue(result instanceof String);
        String str = (String) result;
        assertTrue(str.startsWith("Mock for List"));
        assertTrue(str.contains("hashCode"));
    }

    @Test
    public void shouldReturnCustomNameForToStringWhenMockIsNamed() throws Exception {
        List<?> mock = Mockito.mock(List.class, Mockito.withSettings().name("myCoolMock"));
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = new SimpleInvocation(toStringMethod, mock, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals("myCoolMock", result);
    }

    // ---------------------------------------------------------
    // answer(InvocationOnMock) : isCompareToMethod branch
    // ---------------------------------------------------------

    @Test
    public void shouldReturnZeroForCompareToWhenSameReference() throws Exception {
        Object mock = Mockito.mock(Comparable.class);
        Method compareTo = Comparable.class.getMethod("compareTo", Object.class);
        InvocationOnMock invocation = new SimpleInvocation(compareTo, mock, new Object[]{mock});

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnOneForCompareToWhenDifferentReference() throws Exception {
        Object mock = Mockito.mock(Comparable.class);
        Object other = new Object();
        Method compareTo = Comparable.class.getMethod("compareTo", Object.class);
        InvocationOnMock invocation = new SimpleInvocation(compareTo, mock, new Object[]{other});

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(1, result);
    }

    // ---------------------------------------------------------
    // answer(InvocationOnMock) : default branch -> returnValueFor()
    // ---------------------------------------------------------

    @Test
    public void shouldDelegateToReturnValueForOnOtherMethods() throws Exception {
        Object mock = Mockito.mock(List.class);
        Method size = List.class.getMethod("size");
        InvocationOnMock invocation = new SimpleInvocation(size, mock, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result); // int-returning method -> default primitive value
    }

    @Test
    public void shouldReturnNullWhenReturnTypeIsUnrecognized() throws Exception {
        Object mock = Mockito.mock(CustomInterface.class);
        Method getValue = CustomInterface.class.getMethod("getValue");
        InvocationOnMock invocation = new SimpleInvocation(getValue, mock, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertNull(result);
    }
}

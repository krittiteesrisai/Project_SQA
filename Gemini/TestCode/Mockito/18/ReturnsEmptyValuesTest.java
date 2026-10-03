package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.util.MockNameImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockName;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    // =========================================================================
    // 1. Tests for Primitives and Primitive Wrappers
    // =========================================================================

    @Test
    public void shouldReturnDefaultPrimitiveValues() {
        assertEquals(false, returnsEmptyValues.returnValueFor(boolean.class));
        assertEquals((char) 0, returnsEmptyValues.returnValueFor(char.class));
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(byte.class));
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(short.class));
        assertEquals(0, returnsEmptyValues.returnValueFor(int.class));
        assertEquals(0L, returnsEmptyValues.returnValueFor(long.class));
        assertEquals(0.0F, returnsEmptyValues.returnValueFor(float.class));
        assertEquals(0.0D, returnsEmptyValues.returnValueFor(double.class));
        assertNull(returnsEmptyValues.returnValueFor(void.class));
    }

    @Test
    public void shouldReturnDefaultPrimitiveWrapperValues() {
        assertEquals(Boolean.FALSE, returnsEmptyValues.returnValueFor(Boolean.class));
        assertEquals(Character.valueOf((char) 0), returnsEmptyValues.returnValueFor(Character.class));
        assertEquals(Byte.valueOf((byte) 0), returnsEmptyValues.returnValueFor(Byte.class));
        assertEquals(Short.valueOf((short) 0), returnsEmptyValues.returnValueFor(Short.class));
        assertEquals(Integer.valueOf(0), returnsEmptyValues.returnValueFor(Integer.class));
        assertEquals(Long.valueOf(0L), returnsEmptyValues.returnValueFor(Long.class));
        assertEquals(Float.valueOf(0.0F), returnsEmptyValues.returnValueFor(Float.class));
        assertEquals(Double.valueOf(0.0D), returnsEmptyValues.returnValueFor(Double.class));
        assertNull(returnsEmptyValues.returnValueFor(Void.class));
    }

    // =========================================================================
    // 2. Tests for Collections and Map Types (Branches 2 - 14)
    // =========================================================================

    @Test
    public void shouldReturnEmptyCollection() {
        Object result = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
        // Verify mutability
        ((Collection<Object>) result).add("item");
        assertEquals(1, ((Collection<?>) result).size());
    }

    @Test
    public void shouldReturnEmptySet() {
        Object result = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
        ((Set<Object>) result).add("item");
        assertEquals(1, ((Set<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyHashSet() {
        Object result = returnsEmptyValues.returnValueFor(HashSet.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((HashSet<?>) result).isEmpty());
        ((HashSet<Object>) result).add("item");
        assertEquals(1, ((HashSet<?>) result).size());
    }

    @Test
    public void shouldReturnEmptySortedSet() {
        Object result = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertTrue(result instanceof TreeSet);
        assertTrue(((SortedSet<?>) result).isEmpty());
        ((SortedSet<String>) result).add("item");
        assertEquals(1, ((SortedSet<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyTreeSet() {
        Object result = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertTrue(result instanceof TreeSet);
        assertTrue(((TreeSet<?>) result).isEmpty());
        ((TreeSet<String>) result).add("item");
        assertEquals(1, ((TreeSet<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyLinkedHashSet() {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertTrue(result instanceof LinkedHashSet);
        assertTrue(((LinkedHashSet<?>) result).isEmpty());
        ((LinkedHashSet<Object>) result).add("item");
        assertEquals(1, ((LinkedHashSet<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyList() {
        Object result = returnsEmptyValues.returnValueFor(List.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((List<?>) result).isEmpty());
        ((List<Object>) result).add("item");
        assertEquals(1, ((List<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((LinkedList<?>) result).isEmpty());
        ((LinkedList<Object>) result).add("item");
        assertEquals(1, ((LinkedList<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyArrayList() {
        Object result = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertTrue(result instanceof ArrayList);
        assertTrue(((ArrayList<?>) result).isEmpty());
        ((ArrayList<Object>) result).add("item");
        assertEquals(1, ((ArrayList<?>) result).size());
    }

    @Test
    public void shouldReturnEmptyMap() {
        Object result = returnsEmptyValues.returnValueFor(Map.class);
        assertTrue(result instanceof HashMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
        ((Map<Object, Object>) result).put("key", "value");
        assertEquals(1, ((Map<?, ?>) result).size());
    }

    @Test
    public void shouldReturnEmptyHashMap() {
        Object result = returnsEmptyValues.returnValueFor(HashMap.class);
        assertTrue(result instanceof HashMap);
        assertTrue(((HashMap<?, ?>) result).isEmpty());
        ((HashMap<Object, Object>) result).put("key", "value");
        assertEquals(1, ((HashMap<?, ?>) result).size());
    }

    @Test
    public void shouldReturnEmptySortedMap() {
        Object result = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertTrue(result instanceof TreeMap);
        assertTrue(((SortedMap<?, ?>) result).isEmpty());
        ((SortedMap<String, String>) result).put("key", "value");
        assertEquals(1, ((SortedMap<?, ?>) result).size());
    }

    @Test
    public void shouldReturnEmptyTreeMap() {
        Object result = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertTrue(result instanceof TreeMap);
        assertTrue(((TreeMap<?, ?>) result).isEmpty());
        ((TreeMap<String, String>) result).put("key", "value");
        assertEquals(1, ((TreeMap<?, ?>) result).size());
    }

    @Test
    public void shouldReturnEmptyLinkedHashMap() {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertTrue(result instanceof LinkedHashMap);
        assertTrue(((LinkedHashMap<?, ?>) result).isEmpty());
        ((LinkedHashMap<Object, Object>) result).put("key", "value");
        assertEquals(1, ((LinkedHashMap<?, ?>) result).size());
    }

    // =========================================================================
    // 3. Tests for Non-collection and Unknown Types (Branch 15)
    // =========================================================================

    @Test
    public void shouldReturnNullForOtherTypes() {
        assertNull(returnsEmptyValues.returnValueFor(Object.class));
        assertNull(returnsEmptyValues.returnValueFor(String.class));
        assertNull(returnsEmptyValues.returnValueFor(Comparable.class));
        assertNull(returnsEmptyValues.returnValueFor(java.util.Queue.class));
        assertNull(returnsEmptyValues.returnValueFor(java.util.Date.class));
    }

    // =========================================================================
    // 4. Tests for answer(InvocationOnMock)
    // =========================================================================

    interface DummySampleInterface extends Comparable<DummySampleInterface> {
        String customMethod();
        int primitiveMethod();
        List<String> listMethod();
    }

    private static class DummyInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        DummyInvocation(Object mock, Method method, Object... arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments != null ? arguments : new Object[0];
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    @Test
    public void shouldHandleToStringWithDefaultMockName() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        Object mock = new Object();

        MockUtil customMockUtil = new MockUtil() {
            @Override
            public MockName getMockName(Object m) {
                return new MockNameImpl(null, DummySampleInterface.class);
            }
            @Override
            public MockSettingsImpl getMockSettings(Object m) {
                MockSettingsImpl settings = new MockSettingsImpl();
                settings.defaultAnswer(new ReturnsEmptyValues());
                settings.setTypeToMock(DummySampleInterface.class);
                return settings;
            }
        };

        returnsEmptyValues.mockUtil = customMockUtil;
        InvocationOnMock invocation = new DummyInvocation(mock, toStringMethod);

        Object result = returnsEmptyValues.answer(invocation);
        assertNotNull(result);
        assertEquals("Mock for DummySampleInterface, hashCode: " + mock.hashCode(), result);
    }

    @Test
    public void shouldHandleToStringWithCustomMockName() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        Object mock = new Object();

        MockUtil customMockUtil = new MockUtil() {
            @Override
            public MockName getMockName(Object m) {
                return new MockNameImpl("myCustomMock");
            }
        };

        returnsEmptyValues.mockUtil = customMockUtil;
        InvocationOnMock invocation = new DummyInvocation(mock, toStringMethod);

        Object result = returnsEmptyValues.answer(invocation);
        assertEquals("myCustomMock", result);
    }

    @Test
    public void shouldHandleCompareToWhenSameInstance() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        DummySampleInterface mock = new DummySampleInterface() {
            @Override
            public String customMethod() { return null; }
            @Override
            public int primitiveMethod() { return 0; }
            @Override
            public List<String> listMethod() { return null; }
            @Override
            public int compareTo(DummySampleInterface o) { return 0; }
        };

        InvocationOnMock invocation = new DummyInvocation(mock, compareToMethod, mock);
        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void shouldHandleCompareToWhenDifferentInstance() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        DummySampleInterface mock1 = new DummySampleInterface() {
            @Override
            public String customMethod() { return null; }
            @Override
            public int primitiveMethod() { return 0; }
            @Override
            public List<String> listMethod() { return null; }
            @Override
            public int compareTo(DummySampleInterface o) { return 0; }
        };
        DummySampleInterface mock2 = new DummySampleInterface() {
            @Override
            public String customMethod() { return null; }
            @Override
            public int primitiveMethod() { return 0; }
            @Override
            public List<String> listMethod() { return null; }
            @Override
            public int compareTo(DummySampleInterface o) { return 0; }
        };

        InvocationOnMock invocation = new DummyInvocation(mock1, compareToMethod, mock2);
        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(1, result);
    }

    @Test
    public void shouldAnswerDefaultValuesForOrdinaryMethod() throws Exception {
        Method intMethod = DummySampleInterface.class.getMethod("primitiveMethod");
        DummyInvocation intInvocation = new DummyInvocation(new Object(), intMethod);
        assertEquals(0, returnsEmptyValues.answer(intInvocation));

        Method listMethod = DummySampleInterface.class.getMethod("listMethod");
        DummyInvocation listInvocation = new DummyInvocation(new Object(), listMethod);
        Object listResult = returnsEmptyValues.answer(listInvocation);
        assertTrue(listResult instanceof List);
        assertTrue(((List<?>) listResult).isEmpty());

        Method customMethod = DummySampleInterface.class.getMethod("customMethod");
        DummyInvocation customInvocation = new DummyInvocation(new Object(), customMethod);
        assertNull(returnsEmptyValues.answer(customInvocation));
    }

    // =========================================================================
    // 5. Test Serialization
    // =========================================================================

    @Test
    public void shouldBeSerializable() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsEmptyValues);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsEmptyValues);
    }
}
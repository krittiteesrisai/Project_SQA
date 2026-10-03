package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    // Helper method เพื่อสร้าง InvocationOnMock จำลอง
    private InvocationOnMock createDummyInvocation(final Object mock, final Method method, final Object[] args) {
        return new InvocationOnMock() {
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
                return args != null ? args : new Object[0];
            }

            @Override
            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    // อินเตอร์เฟซและคลาสตัวอย่างสำหรับใช้ทดสอบ Reflection
    private interface SampleInterface extends Comparable<SampleInterface> {
        List<String> listMethod();
        int intMethod();
        String stringMethod();
        void voidMethod();
    }

    // ==========================================
    // 1. Primitive & Wrapper Types Testing
    // ==========================================

    @Test
    public void testPrimitiveTypesReturnDefaultValues() {
        assertEquals(false, returnsEmptyValues.returnValueFor(boolean.class));
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(byte.class));
        assertEquals((char) 0, returnsEmptyValues.returnValueFor(char.class));
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(short.class));
        assertEquals(0, returnsEmptyValues.returnValueFor(int.class));
        assertEquals(0L, returnsEmptyValues.returnValueFor(long.class));
        assertEquals(0.0F, returnsEmptyValues.returnValueFor(float.class));
        assertEquals(0.0D, returnsEmptyValues.returnValueFor(double.class));
    }

    @Test
    public void testPrimitiveWrapperTypesReturnDefaultValues() {
        assertEquals(Boolean.FALSE, returnsEmptyValues.returnValueFor(Boolean.class));
        assertEquals(Byte.valueOf((byte) 0), returnsEmptyValues.returnValueFor(Byte.class));
        assertEquals(Character.valueOf((char) 0), returnsEmptyValues.returnValueFor(Character.class));
        assertEquals(Short.valueOf((short) 0), returnsEmptyValues.returnValueFor(Short.class));
        assertEquals(Integer.valueOf(0), returnsEmptyValues.returnValueFor(Integer.class));
        assertEquals(Long.valueOf(0L), returnsEmptyValues.returnValueFor(Long.class));
        assertEquals(Float.valueOf(0.0F), returnsEmptyValues.returnValueFor(Float.class));
        assertEquals(Double.valueOf(0.0D), returnsEmptyValues.returnValueFor(Double.class));
    }

    // ==========================================
    // 2. Collection & Map Types Testing (Mutable & Empty)
    // ==========================================

    @Test
    public void testCollectionTypesReturnEmptyInstances() {
        Object col = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue("Should be LinkedList instance", col instanceof LinkedList);
        assertTrue(((Collection<?>) col).isEmpty());

        Object list = returnsEmptyValues.returnValueFor(List.class);
        assertTrue("Should be LinkedList instance", list instanceof LinkedList);
        assertTrue(((List<?>) list).isEmpty());

        Object linkedList = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertTrue("Should be LinkedList instance", linkedList instanceof LinkedList);
        assertTrue(((LinkedList<?>) linkedList).isEmpty());

        Object arrayList = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertTrue("Should be ArrayList instance", arrayList instanceof ArrayList);
        assertTrue(((ArrayList<?>) arrayList).isEmpty());
    }

    @Test
    public void testSetTypesReturnEmptyInstances() {
        Object set = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue("Should be HashSet instance", set instanceof HashSet);
        assertTrue(((Set<?>) set).isEmpty());

        Object hashSet = returnsEmptyValues.returnValueFor(HashSet.class);
        assertTrue("Should be HashSet instance", hashSet instanceof HashSet);
        assertTrue(((HashSet<?>) hashSet).isEmpty());

        Object sortedSet = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertTrue("Should be TreeSet instance", sortedSet instanceof TreeSet);
        assertTrue(((SortedSet<?>) sortedSet).isEmpty());

        Object treeSet = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertTrue("Should be TreeSet instance", treeSet instanceof TreeSet);
        assertTrue(((TreeSet<?>) treeSet).isEmpty());

        Object linkedHashSet = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertTrue("Should be LinkedHashSet instance", linkedHashSet instanceof LinkedHashSet);
        assertTrue(((LinkedHashSet<?>) linkedHashSet).isEmpty());
    }

    @Test
    public void testMapTypesReturnEmptyInstances() {
        Object map = returnsEmptyValues.returnValueFor(Map.class);
        assertTrue("Should be HashMap instance", map instanceof HashMap);
        assertTrue(((Map<?, ?>) map).isEmpty());

        Object hashMap = returnsEmptyValues.returnValueFor(HashMap.class);
        assertTrue("Should be HashMap instance", hashMap instanceof HashMap);
        assertTrue(((HashMap<?, ?>) hashMap).isEmpty());

        Object sortedMap = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertTrue("Should be TreeMap instance", sortedMap instanceof TreeMap);
        assertTrue(((SortedMap<?, ?>) sortedMap).isEmpty());

        Object treeMap = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertTrue("Should be TreeMap instance", treeMap instanceof TreeMap);
        assertTrue(((TreeMap<?, ?>) treeMap).isEmpty());

        Object linkedHashMap = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertTrue("Should be LinkedHashMap instance", linkedHashMap instanceof LinkedHashMap);
        assertTrue(((LinkedHashMap<?, ?>) linkedHashMap).isEmpty());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testReturnedCollectionsAreMutable() {
        // ตรวจสอบว่า collection ที่ได้ไม่ใช่ Collections.emptyList() และสามารถ mutate ได้
        Collection<Object> list = (Collection<Object>) returnsEmptyValues.returnValueFor(List.class);
        assertNotNull(list);
        list.add("test-element");
        assertEquals(1, list.size());

        Map<Object, Object> map = (Map<Object, Object>) returnsEmptyValues.returnValueFor(Map.class);
        assertNotNull(map);
        map.put("key", "value");
        assertEquals(1, map.size());
    }

    // ==========================================
    // 3. Fallback, Non-Collection & Edge Cases
    // ==========================================

    @Test
    public void testUnsupportedTypesReturnNull() {
        assertNull(returnsEmptyValues.returnValueFor(String.class));
        assertNull(returnsEmptyValues.returnValueFor(Object.class));
        assertNull(returnsEmptyValues.returnValueFor(Iterable.class));
        assertNull(returnsEmptyValues.returnValueFor(Queue.class));
        assertNull(returnsEmptyValues.returnValueFor(void.class));
        assertNull(returnsEmptyValues.returnValueFor(Void.class));
        assertNull(returnsEmptyValues.returnValueFor(null));
    }

    // ==========================================
    // 4. InvocationOnMock Execution Branches
    // ==========================================

    @Test
    public void testAnswerForCompareToMethod() throws NoSuchMethodException {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        Object dummyMock = new Object();
        Object otherMock = new Object();

        // ทดสอบ compareTo กับ object อื่น
        InvocationOnMock invocationOther = createDummyInvocation(dummyMock, compareToMethod, new Object[]{otherMock});
        Object resultOther = returnsEmptyValues.answer(invocationOther);
        assertEquals(1, resultOther);

        // ทดสอบ compareTo กับ ตัวมันเอง (Edge case สำหรับ Mockito-24)
        InvocationOnMock invocationSelf = createDummyInvocation(dummyMock, compareToMethod, new Object[]{dummyMock});
        Object resultSelf = returnsEmptyValues.answer(invocationSelf);
        assertNotNull(resultSelf);
    }

    @Test
    public void testAnswerForRegularMethods() throws NoSuchMethodException {
        // ทดสอบ Method ที่คืนค่า List
        Method listMethod = SampleInterface.class.getMethod("listMethod");
        InvocationOnMock listInvocation = createDummyInvocation(new Object(), listMethod, new Object[0]);
        Object listResult = returnsEmptyValues.answer(listInvocation);
        assertTrue(listResult instanceof List);
        assertTrue(((List<?>) listResult).isEmpty());

        // ทดสอบ Method ที่คืนค่า Primitive int
        Method intMethod = SampleInterface.class.getMethod("intMethod");
        InvocationOnMock intInvocation = createDummyInvocation(new Object(), intMethod, new Object[0]);
        Object intResult = returnsEmptyValues.answer(intInvocation);
        assertEquals(0, intResult);

        // ทดสอบ Method ที่คืนค่า String (Reference Type ทั่วไป -> null)
        Method stringMethod = SampleInterface.class.getMethod("stringMethod");
        InvocationOnMock stringInvocation = createDummyInvocation(new Object(), stringMethod, new Object[0]);
        Object stringResult = returnsEmptyValues.answer(stringInvocation);
        assertNull(stringResult);
    }

    // ==========================================
    // 5. Serialization Testing
    // ==========================================

    @Test
    public void testSerializationSupport() throws Exception {
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
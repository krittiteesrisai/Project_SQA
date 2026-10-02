package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link TypeBasedCandidateFilter}.
 *
 * หมายเหตุ (ASSUMPTION): Interface {@code MockCandidateFilter} และ {@code OngoingInjecter}
 * ไม่มีซอร์สโค้ดแสดงในโจทย์ จึงสมมติโครงสร้างตามการใช้งานจริงใน TypeBasedCandidateFilter:
 *  - MockCandidateFilter.filterCandidate(Collection<Object>, Field, Object) -> OngoingInjecter
 *  - OngoingInjecter มีเมธอด Object thenInject() (ไม่ได้ถูกเรียกใช้โดยตรงในคลาสเป้าหมาย
 *    แต่ต้องมีเพื่อ implement interface ให้ compile ได้)
 * เนื่องจาก classpath ที่กำหนดไม่มี mocking framework จึงใช้ fake/stub แบบ manual แทน mock object
 */
public class TypeBasedCandidateFilterTest {

    // ---------- Fixtures: classes/fields used for reflection ----------
    private static class Animal {}
    private static class Dog extends Animal {}
    private static class Cat extends Animal {}

    private static class FieldHolder {
        Object objectField;
        String stringField;
        List<String> listField;
        ArrayList<String> arrayListField;
        CharSequence charSequenceField;
        Animal animalField;
    }

    private static class DogHolder {
        Dog dogField;
    }

    private Field objectField;
    private Field stringField;
    private Field listField;
    private Field arrayListField;
    private Field charSequenceField;
    private Field animalField;

    // ---------- Fake/stub implementations ----------

    /** Fake OngoingInjecter ที่คืนค่าคงที่ ใช้ตรวจสอบ identity ของผลลัพธ์ที่ส่งผ่าน */
    private static class FakeOngoingInjecter implements OngoingInjecter {
        public Object thenInject() {
            return "injected"; // ASSUMPTION: ไม่มีผลต่อ logic ของคลาสที่ทดสอบ
        }
    }

    /** Fake next filter ที่บันทึก argument ที่ได้รับ เพื่อตรวจสอบพฤติกรรมของ filter ภายใต้ทดสอบ */
    private static class RecordingNextFilter implements MockCandidateFilter {
        Collection<Object> capturedMocks;
        Field capturedField;
        Object capturedFieldInstance;
        final OngoingInjecter toReturn = new FakeOngoingInjecter();

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return toReturn;
        }
    }

    private RecordingNextFilter nextFilter;
    private TypeBasedCandidateFilter filterUnderTest;

    @Before
    public void setUp() throws Exception {
        objectField = FieldHolder.class.getDeclaredField("objectField");
        stringField = FieldHolder.class.getDeclaredField("stringField");
        listField = FieldHolder.class.getDeclaredField("listField");
        arrayListField = FieldHolder.class.getDeclaredField("arrayListField");
        charSequenceField = FieldHolder.class.getDeclaredField("charSequenceField");
        animalField = FieldHolder.class.getDeclaredField("animalField");

        nextFilter = new RecordingNextFilter();
        filterUnderTest = new TypeBasedCandidateFilter(nextFilter);
    }

    // ---------- Tests ----------

    @Test
    public void shouldPassEmptyListToNextFilter_whenMocksCollectionIsEmpty() {
        Collection<Object> mocks = new ArrayList<Object>();
        Object fieldInstance = new FieldHolder();

        OngoingInjecter result = filterUnderTest.filterCandidate(mocks, stringField, fieldInstance);

        assertNotNull(nextFilter.capturedMocks);
        assertTrue("expected empty list when mocks collection is empty", nextFilter.capturedMocks.isEmpty());
        assertSame(stringField, nextFilter.capturedField);
        assertSame(fieldInstance, nextFilter.capturedFieldInstance);
        assertSame(nextFilter.toReturn, result);
    }

    @Test
    public void shouldFilterOutNonMatchingTypes_whenNoMockMatchesFieldType() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(123); // Integer, not assignable to String field
        mocks.add(new Object());

        filterUnderTest.filterCandidate(mocks, stringField, null);

        assertTrue("expected no matches for String field with Integer/Object mocks",
                nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void shouldIncludeSingleMatchingMock_whenExactTypeMatches() {
        Collection<Object> mocks = new ArrayList<Object>();
        String theString = "hello";
        mocks.add(theString);

        filterUnderTest.filterCandidate(mocks, stringField, null);

        assertEquals(1, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(theString));
    }

    @Test
    public void shouldFilterMixedMocks_includingOnlyAssignableTypes() {
        Collection<Object> mocks = new ArrayList<Object>();
        String matchingString = "match";
        Integer nonMatchingInteger = 42;
        mocks.add(matchingString);
        mocks.add(nonMatchingInteger);

        filterUnderTest.filterCandidate(mocks, stringField, null);

        assertEquals(1, nextFilter.capturedMocks.size());
        assertSame(matchingString, nextFilter.capturedMocks.iterator().next());
    }

    @Test
    public void shouldIncludeAllMocks_whenAllMatchFieldType() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("one");
        mocks.add("two");
        mocks.add("three");

        filterUnderTest.filterCandidate(mocks, stringField, null);

        assertEquals(3, nextFilter.capturedMocks.size());
    }

    @Test
    public void shouldMatchSubclassInstance_whenFieldTypeIsSuperclass() {
        Collection<Object> mocks = new ArrayList<Object>();
        Dog dog = new Dog();
        mocks.add(dog);

        filterUnderTest.filterCandidate(mocks, animalField, null);

        assertEquals(1, nextFilter.capturedMocks.size());
        assertSame(dog, nextFilter.capturedMocks.iterator().next());
    }

    @Test
    public void shouldNotMatchSuperclassInstance_whenFieldTypeIsSubclass() throws Exception {
        // field type Dog, mock = Animal instance -> Dog.isAssignableFrom(Animal.class) == false
        Field dogField = DogHolder.class.getDeclaredField("dogField");
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Animal());

        filterUnderTest.filterCandidate(mocks, dogField, null);

        assertTrue(nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void shouldMatchDifferentSubclassesOfSameSuperclass_whenFieldTypeIsSuperclass() {
        Collection<Object> mocks = new ArrayList<Object>();
        Dog dog = new Dog();
        Cat cat = new Cat();
        mocks.add(dog);
        mocks.add(cat);

        filterUnderTest.filterCandidate(mocks, animalField, null);

        assertEquals(2, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(dog));
        assertTrue(nextFilter.capturedMocks.contains(cat));
    }

    @Test
    public void shouldMatchConcreteClass_whenFieldTypeIsImplementedInterface() {
        Collection<Object> mocks = new ArrayList<Object>();
        ArrayList<String> arrayList = new ArrayList<String>();
        mocks.add(arrayList);

        filterUnderTest.filterCandidate(mocks, listField, null); // field type = List

        assertEquals(1, nextFilter.capturedMocks.size());
        assertSame(arrayList, nextFilter.capturedMocks.iterator().next());
    }

    @Test
    public void shouldNotMatchDifferentImplementation_whenFieldTypeIsConcreteSubtype() {
        // field type = ArrayList (concrete), mock = LinkedList instance -> isAssignableFrom == false
        Collection<Object> mocks = new ArrayList<Object>();
        List<String> linkedList = new LinkedList<String>();
        mocks.add(linkedList);

        filterUnderTest.filterCandidate(mocks, arrayListField, null);

        assertTrue(nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void shouldMatchAnyObject_whenFieldTypeIsObject() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("a string");
        mocks.add(123);
        mocks.add(new Object());

        filterUnderTest.filterCandidate(mocks, objectField, null);

        assertEquals(3, nextFilter.capturedMocks.size());
    }

    @Test
    public void shouldMatchStringAsCharSequence_whenFieldTypeIsInterfaceImplementedByString() {
        Collection<Object> mocks = new ArrayList<Object>();
        String s = "charseq";
        mocks.add(s);

        filterUnderTest.filterCandidate(mocks, charSequenceField, null);

        assertEquals(1, nextFilter.capturedMocks.size());
        assertSame(s, nextFilter.capturedMocks.iterator().next());
    }

    @Test
    public void shouldPreserveIterationOrder_ofMatchingMocks() {
        List<Object> mocks = new ArrayList<Object>();
        mocks.add("first");
        mocks.add(999); // filtered out
        mocks.add("second");
        mocks.add("third");

        filterUnderTest.filterCandidate(mocks, stringField, null);

        List<Object> captured = new ArrayList<Object>(nextFilter.capturedMocks);
        assertEquals(Arrays.asList("first", "second", "third"), captured);
    }

    @Test
    public void shouldPassThroughFieldAndFieldInstanceUnchanged() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("value");
        Object fieldInstance = new FieldHolder();

        filterUnderTest.filterCandidate(mocks, stringField, fieldInstance);

        assertSame(stringField, nextFilter.capturedField);
        assertSame(fieldInstance, nextFilter.capturedFieldInstance);
    }

    @Test
    public void shouldReturnExactOngoingInjecterInstance_fromNextFilter() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("value");

        OngoingInjecter result = filterUnderTest.filterCandidate(mocks, stringField, null);

        assertSame(nextFilter.toReturn, result);
    }

    @Test
    public void shouldAllowNullFieldInstance() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("value");

        filterUnderTest.filterCandidate(mocks, stringField, null);

        assertNull(nextFilter.capturedFieldInstance);
        assertEquals(1, nextFilter.capturedMocks.size());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPE_whenMocksCollectionIsNull() {
        filterUnderTest.filterCandidate(null, stringField, null);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPE_whenFieldIsNull_andMocksCollectionNonEmpty() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("value");

        filterUnderTest.filterCandidate(mocks, null, null);
    }

    @Test
    public void shouldNotThrow_whenFieldIsNull_andMocksCollectionIsEmpty() {
        // boundary case: loop body ไม่ถูกเข้าเลยเพราะ mocks ว่าง -> field.getType() ไม่ถูกเรียก
        // จึงไม่เกิด NPE แม้ field เป็น null
        Collection<Object> mocks = new ArrayList<Object>();

        OngoingInjecter result = filterUnderTest.filterCandidate(mocks, null, null);

        assertNotNull(result);
        assertTrue(nextFilter.capturedMocks.isEmpty());
        assertNull(nextFilter.capturedField);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPE_whenMocksCollectionContainsNullElement() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(null);

        filterUnderTest.filterCandidate(mocks, stringField, null);
    }

    @Test
    public void shouldDelegateToNextFilter_providedViaConstructor() {
        RecordingNextFilter anotherNext = new RecordingNextFilter();
        TypeBasedCandidateFilter anotherFilter = new TypeBasedCandidateFilter(anotherNext);

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("value");

        anotherFilter.filterCandidate(mocks, stringField, null);

        assertNotNull(anotherNext.capturedMocks);
        assertEquals(1, anotherNext.capturedMocks.size());
    }
}

package org.mockito.internal.configuration;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.*;

import static org.junit.Assert.*;

public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine injectionEngine;

    @Before
    public void setUp() {
        injectionEngine = new DefaultInjectionEngine();
    }

    // ==========================================
    // Test Double Helper Classes
    // ==========================================
    
    public static class SuperService {}
    public static class SubService extends SuperService {}
    public static class OtherService {}

    public static class HierarchyTargetParent {
        private SuperService parentService;
        public SuperService getParentService() { return parentService; }
    }

    public static class HierarchyTargetChild extends HierarchyTargetParent {
        private SubService childService;
        public SubService getChildService() { return childService; }
    }

    public static class MultipleCandidatesTarget {
        private SuperService firstService;
        private SuperService secondService;

        public SuperService getFirstService() { return firstService; }
        public SuperService getSecondService() { return secondService; }
    }

    public static class SortingTarget {
        private SuperService superField;
        private SubService subField;
        private OtherService otherField;

        public SuperService getSuperField() { return superField; }
        public SubService getSubField() { return subField; }
        public OtherService getOtherField() { return otherField; }
    }

    public static class UnrelatedTypeTarget {
        private String stringField;
        private Integer intField;

        public String getStringField() { return stringField; }
        public Integer getIntField() { return intField; }
    }

    public interface InterfaceTarget {}

    public static class TestClassWithInterfaceField {
        private InterfaceTarget uninstantiableField;
    }

    public static class SimpleTestClass {
        private HierarchyTargetChild targetChild;
        private SortingTarget sortingTarget;
        private MultipleCandidatesTarget multipleTarget;
        private UnrelatedTypeTarget unrelatedTarget;
    }

    // ==========================================
    // Test Cases
    // ==========================================

    @Test
    public void shouldDoNothingWhenInjectMocksFieldsIsEmpty() {
        Set<Field> injectMocksFields = new HashSet<Field>();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new SubService());
        SimpleTestClass testInstance = new SimpleTestClass();

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNull(testInstance.targetChild);
    }

    @Test
    public void shouldInjectMockIntoSingleFieldSuccessfully() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field injectMocksField = SimpleTestClass.class.getDeclaredField("targetChild");
        Set<Field> injectMocksFields = Collections.singleton(injectMocksField);

        SubService mockSubService = new SubService();
        Set<Object> mocks = new HashSet<Object>(Collections.singletonList(mockSubService));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNotNull(testInstance.targetChild);
        assertSame(mockSubService, testInstance.targetChild.getChildService());
    }

    @Test
    public void shouldInjectIntoSuperClassAndSubClassHierarchy() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field injectMocksField = SimpleTestClass.class.getDeclaredField("targetChild");
        Set<Field> injectMocksFields = Collections.singleton(injectMocksField);

        SubService mockSubService = new SubService();
        SuperService mockSuperService = new SuperService();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList(mockSubService, mockSuperService));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNotNull(testInstance.targetChild);
        assertSame(mockSubService, testInstance.targetChild.getChildService());
        assertSame(mockSuperService, testInstance.targetChild.getParentService());
    }

    @Test
    public void shouldSortFieldsSoSubtypeComesBeforeSupertype() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field injectMocksField = SimpleTestClass.class.getDeclaredField("sortingTarget");
        Set<Field> injectMocksFields = Collections.singleton(injectMocksField);

        SubService mockSubService = new SubService();
        OtherService mockOtherService = new OtherService();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList(mockSubService, mockOtherService));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNotNull(testInstance.sortingTarget);
        // SubService is injected into SubService field first, not consumed by SuperService
        assertSame(mockSubService, testInstance.sortingTarget.getSubField());
        assertSame(mockOtherService, testInstance.sortingTarget.getOtherField());
        assertNull(testInstance.sortingTarget.getSuperField());
    }

    @Test
    public void shouldDisambiguateMultipleCandidatesByName() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field injectMocksField = SimpleTestClass.class.getDeclaredField("multipleTarget");
        Set<Field> injectMocksFields = Collections.singleton(injectMocksField);

        SuperService firstService = new SuperService();
        SuperService secondService = new SuperService();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList(firstService, secondService));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNotNull(testInstance.multipleTarget);
        // Both fields should receive mock instances matching their type
        assertNotNull(testInstance.multipleTarget.getFirstService());
        assertNotNull(testInstance.multipleTarget.getSecondService());
        assertNotSame(testInstance.multipleTarget.getFirstService(), testInstance.multipleTarget.getSecondService());
    }

    @Test
    public void shouldHandleUnrelatedTypesDuringFieldSorting() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field injectMocksField = SimpleTestClass.class.getDeclaredField("unrelatedTarget");
        Set<Field> injectMocksFields = Collections.singleton(injectMocksField);

        Set<Object> mocks = new HashSet<Object>(Arrays.asList("sampleString", 12345));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNotNull(testInstance.unrelatedTarget);
        assertEquals("sampleString", testInstance.unrelatedTarget.getStringField());
        assertEquals(Integer.valueOf(12345), testInstance.unrelatedTarget.getIntField());
    }

    @Test
    public void shouldNotInjectWhenNoMockMatchesTargetFieldType() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field injectMocksField = SimpleTestClass.class.getDeclaredField("sortingTarget");
        Set<Field> injectMocksFields = Collections.singleton(injectMocksField);

        Set<Object> mocks = new HashSet<Object>(Collections.singletonList("unrelatedStringMock"));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        assertNotNull(testInstance.sortingTarget);
        assertNull(testInstance.sortingTarget.getSuperField());
        assertNull(testInstance.sortingTarget.getSubField());
        assertNull(testInstance.sortingTarget.getOtherField());
    }

    @Test
    public void shouldThrowMockitoExceptionWhenInjectMocksFieldCannotBeInstantiated() throws Exception {
        TestClassWithInterfaceField testInstance = new TestClassWithInterfaceField();
        Field invalidField = TestClassWithInterfaceField.class.getDeclaredField("uninstantiableField");
        Set<Field> injectMocksFields = Collections.singleton(invalidField);

        Set<Object> mocks = new HashSet<Object>();

        try {
            injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);
            fail("Expected MockitoException due to inability to initialize interface field");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("uninstantiableField")
                    || expected.getMessage().contains("Cannot instantiate"));
        }
    }

    @Test
    public void shouldIsolateMocksCopyForEachInjectMocksField() throws Exception {
        SimpleTestClass testInstance = new SimpleTestClass();
        Field field1 = SimpleTestClass.class.getDeclaredField("targetChild");
        Field field2 = SimpleTestClass.class.getDeclaredField("sortingTarget");
        Set<Field> injectMocksFields = new HashSet<Field>(Arrays.asList(field1, field2));

        SubService mockSub = new SubService();
        Set<Object> mocks = new HashSet<Object>(Collections.singletonList(mockSub));

        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        // Both targetChild and sortingTarget should independently receive mockSub
        assertNotNull(testInstance.targetChild);
        assertSame(mockSub, testInstance.targetChild.getChildService());
        assertNotNull(testInstance.sortingTarget);
        assertSame(mockSub, testInstance.sortingTarget.getSubField());
    }
}
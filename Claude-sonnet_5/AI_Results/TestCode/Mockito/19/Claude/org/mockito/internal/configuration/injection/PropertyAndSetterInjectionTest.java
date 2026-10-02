package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection strategy;

    @Before
    public void setUp() {
        strategy = new PropertyAndSetterInjection();
    }

    // ---------------------- Fixtures ----------------------

    static class ServiceA {}
    static class ServiceB {}

    static class SimpleService {
        private ServiceA serviceA;
        public void setServiceA(ServiceA serviceA) { this.serviceA = serviceA; }
        public ServiceA getServiceA() { return serviceA; }
    }

    static class FieldInjectionTarget {
        private ServiceA serviceA; // ไม่มี setter -> ต้อง inject ผ่าน field โดยตรง
        public ServiceA getServiceA() { return serviceA; }
    }

    static class NoCandidateMatch {
        private ServiceB serviceB;
        public ServiceB getServiceB() { return serviceB; }
    }

    static class WithFinalAndStaticFields {
        private static ServiceA staticField;
        private final ServiceA finalField = null;
        private ServiceA normalField;
        public ServiceA getNormalField() { return normalField; }
    }

    static class SuperClass {
        private ServiceA superField;
        public ServiceA getSuperField() { return superField; }
    }

    static class SubClass extends SuperClass {
        private ServiceB subField;
        public ServiceB getSubField() { return subField; }
    }

    static class TwoFieldsSameType {
        private ServiceA primary;
        private ServiceA secondary;
        public ServiceA getPrimary() { return primary; }
        public ServiceA getSecondary() { return secondary; }
    }

    static class NoArgConstructorFails {
        public NoArgConstructorFails(int x) {} // ไม่มี default constructor -> initialize ล้มเหลว
    }

    static class Owner {
        SimpleService fieldToInject;
        FieldInjectionTarget fieldToInjectDirect;
        NoCandidateMatch noMatchTarget;
        WithFinalAndStaticFields withFinalStatic;
        SubClass subClassField;
        TwoFieldsSameType twoFieldsDisambiguate;
        TwoFieldsSameType twoFieldsAmbiguousNoMatch;
        NoArgConstructorFails badField;
        SimpleService preInitialized = new SimpleService();
        Object objField; // fieldClass == Object.class ทันที -> while loop ไม่เข้า
    }

    private Field getField(Class<?> clazz, String name) throws Exception {
        return clazz.getDeclaredField(name);
    }

    // ---------------------- Tests ----------------------

    @Test
    public void shouldInjectBySetterWhenFieldNeedsInitializationAndSetterAvailable() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "fieldToInject");
        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertTrue(result);
        assertNotNull(owner.fieldToInject);
        assertSame(mockA, owner.fieldToInject.getServiceA());
    }

    @Test
    public void shouldInjectByFieldWhenNoSetterAvailable() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "fieldToInjectDirect");
        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertTrue(result);
        assertNotNull(owner.fieldToInjectDirect);
        assertSame(mockA, owner.fieldToInjectDirect.getServiceA());
    }

    @Test
    public void shouldNotInjectWhenNoMatchingCandidate() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "noMatchTarget");
        ServiceA mismatchedMock = new ServiceA(); // ประเภทไม่ตรง
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mismatchedMock);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertFalse(result);
        assertNotNull(owner.noMatchTarget);
        assertNull(owner.noMatchTarget.getServiceB());
    }

    @Test
    public void shouldSkipFinalAndStaticFieldsDuringInjection() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "withFinalStatic");
        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertTrue(result);
        assertSame(mockA, owner.withFinalStatic.getNormalField());
        assertNull(WithFinalAndStaticFields.staticField); // static field ไม่ถูกแก้ไข
    }

    @Test
    public void shouldInjectAcrossClassHierarchySuperTypesLast() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "subClassField");
        ServiceA mockA = new ServiceA();
        ServiceB mockB = new ServiceB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);
        mocks.add(mockB);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertTrue(result);
        assertSame(mockB, owner.subClassField.getSubField());
        assertSame(mockA, owner.subClassField.getSuperField());
    }

    @Test
    public void shouldReturnFalseWhenMockCandidatesSetIsEmpty() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "fieldToInjectDirect");
        Set<Object> mocks = new HashSet<Object>();

        boolean result = strategy.processInjection(field, owner, mocks);

        assertFalse(result);
        assertNotNull(owner.fieldToInjectDirect);
        assertNull(owner.fieldToInjectDirect.getServiceA());
    }

    @Test
    public void shouldHandleAlreadyInitializedFieldReuseInstance() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "preInitialized");
        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        SimpleService existing = owner.preInitialized;
        boolean result = strategy.processInjection(field, owner, mocks);

        assertTrue(result);
        assertSame(existing, owner.preInitialized); // instance เดิมถูกใช้ซ้ำ ไม่สร้างใหม่
        assertSame(mockA, owner.preInitialized.getServiceA());
    }

    @Test
    public void shouldNotLoopWhenFieldClassIsObject() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "objField");
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new ServiceA());

        boolean result = strategy.processInjection(field, owner, mocks);

        // fieldClass เป็น Object.class ตั้งแต่ต้น -> while loop ไม่ execute เลย
        assertFalse(result);
    }

    @Test
    public void shouldDisambiguateByNameWhenMultipleCandidatesOfSameType() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "twoFieldsDisambiguate");

        // ตั้งชื่อ mock ให้ตรงกับชื่อ field เพื่อให้ NameBasedCandidateFilter แยกแยะได้
        ServiceA primaryMock = Mockito.mock(ServiceA.class, "primary");
        ServiceA otherMock = Mockito.mock(ServiceA.class, "other");
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(primaryMock);
        mocks.add(otherMock);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertTrue(result);
        assertSame(primaryMock, owner.twoFieldsDisambiguate.getPrimary());
        // field ที่สองไม่มีชื่อ mock ตรงกัน แต่หลังจาก primary ถูกลบออก
        // เหลือ candidate เดียวในรอบถัดไป (pass 2) จึงถูก inject โดยไม่ต้องอาศัยชื่อ
        assertSame(otherMock, owner.twoFieldsDisambiguate.getSecondary());
    }

    @Test
    public void shouldLeaveFieldsNullWhenAmbiguousAndNoNameMatchOnBothPasses() throws Exception {
        Owner owner = new Owner();
        Field field = getField(Owner.class, "twoFieldsAmbiguousNoMatch");

        // ตั้งชื่อ mock ที่ไม่ตรงกับชื่อ field ใดๆ เลย -> ambiguity ไม่ถูกคลี่คลาย
        ServiceA mock1 = Mockito.mock(ServiceA.class, "fooX");
        ServiceA mock2 = Mockito.mock(ServiceA.class, "barY");
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mock1);
        mocks.add(mock2);

        boolean result = strategy.processInjection(field, owner, mocks);

        assertFalse(result);
        assertNotNull(owner.twoFieldsAmbiguousNoMatch);
        assertNull(owner.twoFieldsAmbiguousNoMatch.getPrimary());
        assertNull(owner.twoFieldsAmbiguousNoMatch.getSecondary());
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowWhenFieldCannotBeInitialized() throws Exception {
        // NoArgConstructorFails ไม่มี default constructor -> FieldInitializer ล้มเหลว
        // และ Reporter().cannotInitializeForInjectMocksAnnotation(...) คาดว่าจะ throw ออกมา
        Owner owner = new Owner();
        Field field = getField(Owner.class, "badField");
        Set<Object> mocks = new HashSet<Object>();

        strategy.processInjection(field, owner, mocks);
    }
}

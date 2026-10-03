package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.*;

import static org.junit.Assert.*;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection injection;

    @Before
    public void setUp() {
        injection = new PropertyAndSetterInjection();
    }

    // ==========================================
    // Test Dummy Target Classes & Dependencies
    // ==========================================

    public static class DependencyA {}
    public static class DependencyB {}

    public static class TargetSimple {
        private DependencyA depA;

        public DependencyA getDepA() {
            return depA;
        }
    }

    public static class TargetWithSetter {
        private DependencyA depA;
        private boolean setterCalled = false;

        public void setDepA(DependencyA depA) {
            this.depA = depA;
            this.setterCalled = true;
        }

        public boolean isSetterCalled() {
            return setterCalled;
        }

        public DependencyA getDepA() {
            return depA;
        }
    }

    public static class TargetWithModifiers {
        public static DependencyA staticDep;
        public final DependencyA finalDep = new DependencyA();
        private DependencyB normalDep;

        public DependencyB getNormalDep() {
            return normalDep;
        }
    }

    public static class BaseTarget {
        protected DependencyA baseDep;

        public DependencyA getBaseDep() {
            return baseDep;
        }
    }

    public static class ChildTarget extends BaseTarget {
        private DependencyB childDep;

        public DependencyB getChildDep() {
            return childDep;
        }
    }

    public static class TargetWithMultipleSameTypes {
        private DependencyA firstDep;
        private DependencyA secondDep;

        public DependencyA getFirstDep() {
            return firstDep;
        }

        public DependencyA getSecondDep() {
            return secondDep;
        }
    }

    public static class TargetThrowingConstructor {
        public TargetThrowingConstructor() {
            throw new IllegalStateException("Constructor failed deliberately");
        }
    }

    public interface InterfaceTarget {}

    // Test Host Holders (InjectMocks Fields)
    public static class SimpleHost {
        public TargetSimple target;
    }

    public static class SetterHost {
        public TargetWithSetter target;
    }

    public static class ModifierHost {
        public TargetWithModifiers target;
    }

    public static class HierarchyHost {
        public ChildTarget target;
    }

    public static class MultipleTypesHost {
        public TargetWithMultipleSameTypes target;
    }

    public static class ExceptionHost {
        public TargetThrowingConstructor target;
    }

    public static class InterfaceHost {
        public InterfaceTarget target;
    }

    // ==========================================
    // Test Methods
    // ==========================================

    @Test
    public void shouldInjectByDirectFieldAccessWhenNoSetterAvailable() throws Exception {
        SimpleHost host = new SimpleHost();
        Field targetField = SimpleHost.class.getField("target");
        DependencyA mockA = new DependencyA();
        Set<Object> mocks = new HashSet<Object>(Collections.singletonList(mockA));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertTrue("Injection should occur", result);
        assertNotNull("Target should be instantiated", host.target);
        assertSame("Mock should be injected into field", mockA, host.target.getDepA());
    }

    @Test
    public void shouldInjectViaSetterWhenSetterIsAvailable() throws Exception {
        SetterHost host = new SetterHost();
        Field targetField = SetterHost.class.getField("target");
        DependencyA mockA = new DependencyA();
        Set<Object> mocks = new HashSet<Object>(Collections.singletonList(mockA));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertTrue("Injection should occur", result);
        assertNotNull("Target should be instantiated", host.target);
        assertTrue("Setter should be invoked", host.target.isSetterCalled());
        assertSame("Mock should be injected via setter", mockA, host.target.getDepA());
    }

    @Test
    public void shouldFilterOutStaticAndFinalFields() throws Exception {
        ModifierHost host = new ModifierHost();
        Field targetField = ModifierHost.class.getField("target");
        DependencyA mockA = new DependencyA();
        DependencyB mockB = new DependencyB();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList(mockA, mockB));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertTrue("Injection should occur for normal field", result);
        assertNotNull(host.target);
        assertNull("Static field should not be injected", TargetWithModifiers.staticDep);
        assertNotSame("Final field should not be overwritten", mockA, host.target.finalDep);
        assertSame("Normal field should receive mock", mockB, host.target.getNormalDep());
    }

    @Test
    public void shouldInjectIntoSuperClassHierarchyFields() throws Exception {
        HierarchyHost host = new HierarchyHost();
        Field targetField = HierarchyHost.class.getField("target");
        DependencyA mockA = new DependencyA();
        DependencyB mockB = new DependencyB();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList(mockA, mockB));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertTrue("Injection should occur across hierarchy", result);
        assertNotNull(host.target);
        assertSame("Base class field should receive mock", mockA, host.target.getBaseDep());
        assertSame("Child class field should receive mock", mockB, host.target.getChildDep());
    }

    @Test
    public void shouldReturnFalseWhenMockCandidatesIsEmpty() throws Exception {
        SimpleHost host = new SimpleHost();
        Field targetField = SimpleHost.class.getField("target");
        Set<Object> emptyMocks = Collections.emptySet();

        boolean result = injection.processInjection(targetField, host, emptyMocks);

        assertFalse("No injection should occur when candidates set is empty", result);
        assertNotNull("Host target should still be initialized", host.target);
        assertNull("Field should remain null", host.target.getDepA());
    }

    @Test
    public void shouldReturnFalseWhenNoCandidatesMatchFieldTypes() throws Exception {
        SimpleHost host = new SimpleHost();
        Field targetField = SimpleHost.class.getField("target");
        DependencyB nonMatchingMock = new DependencyB();
        Set<Object> mocks = new HashSet<Object>(Collections.singletonList(nonMatchingMock));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertFalse("No injection should occur for non-matching types", result);
        assertNotNull(host.target);
        assertNull("Field should remain null", host.target.getDepA());
    }

    @Test
    public void shouldResolveConflictByFieldNameWhenMultipleCandidatesHaveSameType() throws Exception {
        MultipleTypesHost host = new MultipleTypesHost();
        Field targetField = MultipleTypesHost.class.getField("target");

        DependencyA firstDepMock = new DependencyA();
        DependencyA secondDepMock = new DependencyA();
        Set<Object> mocks = new HashSet<Object>(Arrays.asList(firstDepMock, secondDepMock));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertTrue("Injection should occur for matching types", result);
        assertNotNull(host.target);
        assertNotNull(host.target.getFirstDep());
        assertNotNull(host.target.getSecondDep());
        assertNotSame(host.target.getFirstDep(), host.target.getSecondDep());
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowMockitoExceptionWhenConstructorThrowsException() throws Exception {
        ExceptionHost host = new ExceptionHost();
        Field targetField = ExceptionHost.class.getField("target");
        Set<Object> mocks = Collections.emptySet();

        injection.processInjection(targetField, host, mocks);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowMockitoExceptionWhenCannotInitializeInterface() throws Exception {
        InterfaceHost host = new InterfaceHost();
        Field targetField = InterfaceHost.class.getField("target");
        Set<Object> mocks = Collections.emptySet();

        injection.processInjection(targetField, host, mocks);
    }

    @Test
    public void shouldNotReinitializeFieldIfAlreadyInstantiated() throws Exception {
        SimpleHost host = new SimpleHost();
        TargetSimple existingInstance = new TargetSimple();
        host.target = existingInstance;

        Field targetField = SimpleHost.class.getField("target");
        DependencyA mockA = new DependencyA();
        Set<Object> mocks = new HashSet<Object>(Collections.singletonList(mockA));

        boolean result = injection.processInjection(targetField, host, mocks);

        assertTrue("Injection should succeed", result);
        assertSame("Should use already initialized instance", existingInstance, host.target);
        assertSame("Mock should be injected into existing instance", mockA, host.target.getDepA());
    }
}
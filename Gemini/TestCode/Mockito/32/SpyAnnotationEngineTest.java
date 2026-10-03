package org.mockito.internal.configuration;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

import static org.junit.Assert.*;

public class SpyAnnotationEngineTest {

    private SpyAnnotationEngine engine;
    private MockUtil mockUtil;

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
        mockUtil = new MockUtil();
    }

    // --- Dummy Test Fixtures ---

    private static class EmptyClass {
    }

    private static class ClassWithNoSpyAnnotation {
        private String normalField = "test";
        public Integer anotherField = 123;
    }

    private static class ClassWithValidSpy {
        @Spy
        List<String> list = new ArrayList<String>();
    }

    private static class ClassWithNullSpy {
        @Spy
        List<String> list = null;
    }

    private static class ClassWithAlreadySpiedField {
        @Spy
        List<String> spiedList = Mockito.spy(new ArrayList<String>());
    }

    private static class ClassWithSpyAndMock {
        @Spy
        @Mock
        List<String> invalidField = new ArrayList<String>();
    }

    private static class ClassWithSpyAndDeprecatedMock {
        @Spy
        @org.mockito.MockitoAnnotations.Mock
        List<String> invalidField = new ArrayList<String>();
    }

    private static class ClassWithSpyAndCaptor {
        @Spy
        @Captor
        List<String> invalidField = new ArrayList<String>();
    }

    private static class ClassWithPrivateSpy {
        @Spy
        private List<String> privateList = new ArrayList<String>();

        public List<String> getPrivateList() {
            return privateList;
        }
    }

    private static class ClassWithMultipleFields {
        private String ignored = "ignore";
        @Spy
        List<String> spy1 = new ArrayList<String>();
        @Spy
        List<String> spy2 = new LinkedList<String>();
    }

    // --- Unit Tests ---

    @Test
    public void createMockFor_shouldAlwaysReturnNull() {
        Object result = engine.createMockFor(null, null);
        assertNull("createMockFor should always return null according to contract", result);
    }

    @Test
    public void process_shouldDoNothingWhenContextHasNoFields() {
        EmptyClass testInstance = new EmptyClass();
        engine.process(EmptyClass.class, testInstance);
        // Verify no exception is thrown
    }

    @Test
    public void process_shouldIgnoreFieldsWithoutSpyAnnotation() {
        ClassWithNoSpyAnnotation testInstance = new ClassWithNoSpyAnnotation();
        engine.process(ClassWithNoSpyAnnotation.class, testInstance);

        assertFalse(mockUtil.isMock(testInstance.normalField));
        assertFalse(mockUtil.isMock(testInstance.anotherField));
    }

    @Test
    public void process_shouldCreateSpyForValidField() {
        ClassWithValidSpy testInstance = new ClassWithValidSpy();
        assertFalse(mockUtil.isMock(testInstance.list));

        engine.process(ClassWithValidSpy.class, testInstance);

        assertTrue("Field should be converted to a mock/spy", mockUtil.isMock(testInstance.list));
        testInstance.list.add("item");
        assertEquals(1, testInstance.list.size());
        Mockito.verify(testInstance.list).add("item");
    }

    @Test
    public void process_shouldThrowMockitoExceptionWhenSpyInstanceIsNull() {
        ClassWithNullSpy testInstance = new ClassWithNullSpy();

        try {
            engine.process(ClassWithNullSpy.class, testInstance);
            fail("Expected MockitoException because spy instance is null");
        } catch (MockitoException e) {
            assertTrue("Exception message must indicate instance is missing",
                    e.getMessage().contains("Cannot create a @Spy for 'list' field because the *instance* is missing"));
        }
    }

    @Test
    public void process_shouldResetExistingMockWhenFieldAlreadySpied() {
        ClassWithAlreadySpiedField testInstance = new ClassWithAlreadySpiedField();
        testInstance.spiedList.add("firstAction");
        Mockito.verify(testInstance.spiedList).add("firstAction");

        // Processing should reset the spy instead of wrapping it again
        engine.process(ClassWithAlreadySpiedField.class, testInstance);

        assertTrue("Field should still be a mock/spy", mockUtil.isMock(testInstance.spiedList));
        // Verification after reset should not see previous interactions
        Mockito.verifyZeroInteractions(testInstance.spiedList);
    }

    @Test(expected = MockitoException.class)
    public void process_shouldThrowExceptionWhenSpyAndMockCombined() {
        ClassWithSpyAndMock testInstance = new ClassWithSpyAndMock();
        engine.process(ClassWithSpyAndMock.class, testInstance);
    }

    @Test(expected = MockitoException.class)
    public void process_shouldThrowExceptionWhenSpyAndDeprecatedMockCombined() {
        ClassWithSpyAndDeprecatedMock testInstance = new ClassWithSpyAndDeprecatedMock();
        engine.process(ClassWithSpyAndDeprecatedMock.class, testInstance);
    }

    @Test(expected = MockitoException.class)
    public void process_shouldThrowExceptionWhenSpyAndCaptorCombined() {
        ClassWithSpyAndCaptor testInstance = new ClassWithSpyAndCaptor();
        engine.process(ClassWithSpyAndCaptor.class, testInstance);
    }

    @Test
    public void process_shouldRestoreFieldAccessibility() throws Exception {
        ClassWithPrivateSpy testInstance = new ClassWithPrivateSpy();
        Field privateField = ClassWithPrivateSpy.class.getDeclaredField("privateList");
        
        // Initial accessibility state
        boolean initialAccessible = privateField.isAccessible();

        engine.process(ClassWithPrivateSpy.class, testInstance);

        assertTrue(mockUtil.isMock(testInstance.getPrivateList()));
        assertEquals("Field accessibility must be restored to its original state",
                initialAccessible, privateField.isAccessible());
    }

    @Test
    public void process_shouldHandleMultipleFieldsCorrectly() {
        ClassWithMultipleFields testInstance = new ClassWithMultipleFields();

        engine.process(ClassWithMultipleFields.class, testInstance);

        assertFalse(mockUtil.isMock(testInstance.ignored));
        assertTrue(mockUtil.isMock(testInstance.spy1));
        assertTrue(mockUtil.isMock(testInstance.spy2));
    }
}
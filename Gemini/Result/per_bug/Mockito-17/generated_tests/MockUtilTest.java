package org.mockito.internal.util;

import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.NoOp;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MockUtilTest {

    private MockUtil mockUtil;

    // คลาสตัวอย่างสำหรับทดสอบ State และ Spy
    public static class SampleClass {
        private String value = "original";

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    // -------------------------------------------------------------
    // Constructor Coverage
    // -------------------------------------------------------------

    @Test
    public void testCustomConstructorWithCreationValidator() {
        CreationValidator customValidator = new CreationValidator();
        MockUtil customUtil = new MockUtil(customValidator);
        assertNotNull(customUtil);
    }

    // -------------------------------------------------------------
    // isMock(...) Coverage
    // -------------------------------------------------------------

    @Test
    public void isMock_shouldReturnFalse_whenNullProvided() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void isMock_shouldReturnFalse_whenRegularObjectProvided() {
        assertFalse(mockUtil.isMock(new Object()));
        assertFalse(mockUtil.isMock("standard string"));
        assertFalse(mockUtil.isMock(new ArrayList<String>()));
    }

    @Test
    public void isMock_shouldReturnFalse_whenCglibProxyIsNotMockitoMock() {
        // สร้าง CGLIB proxy โดยตรงที่ Callback ไม่ใช่ MethodInterceptorFilter
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object nonMockitoProxy = enhancer.create();

        assertTrue(Enhancer.isEnhanced(nonMockitoProxy.getClass()));
        assertFalse(mockUtil.isMock(nonMockitoProxy));
    }

    @Test
    public void isMock_shouldReturnTrue_whenValidMockitoMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertTrue(mockUtil.isMock(mock));
    }

    // -------------------------------------------------------------
    // getMockHandler(...) Coverage & Exceptions
    // -------------------------------------------------------------

    @Test(expected = NotAMockException.class)
    public void getMockHandler_shouldThrowException_whenNullProvided() {
        try {
            mockUtil.getMockHandler(null);
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument should be a mock, but is null!"));
            throw e;
        }
    }

    @Test(expected = NotAMockException.class)
    public void getMockHandler_shouldThrowException_whenNonMockProvided() {
        String nonMock = "Not a Mock";
        try {
            mockUtil.getMockHandler(nonMock);
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument should be a mock, but is: class java.lang.String"));
            throw e;
        }
    }

    @Test
    public void getMockHandler_shouldReturnHandler_whenValidMock() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        assertNotNull(handler.getMockSettings());
    }

    // -------------------------------------------------------------
    // createMock(...) Coverage (Branches for interfaces & spiedInstance)
    // -------------------------------------------------------------

    @Test
    public void createMock_withNullExtraInterfaces_andNullSpiedInstance() {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertNull(settings.getExtraInterfaces());
        assertNull(settings.getSpiedInstance());

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void createMock_withExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Serializable.class, Cloneable.class);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);
        assertNotNull(mock);
        assertTrue(mock instanceof Serializable);
        assertTrue(mock instanceof Cloneable);
    }

    @Test
    public void createMock_withSpiedInstance_shouldCopyFields() {
        SampleClass spied = new SampleClass();
        spied.setValue("custom_state_123");

        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(spied);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);
        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertEquals("custom_state_123", mock.getValue());
    }

    // -------------------------------------------------------------
    // resetMock(...) Coverage
    // -------------------------------------------------------------

    @Test
    public void resetMock_shouldResetHandlerSuccessfully() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> oldHandler = mockUtil.getMockHandler(mock);
        mockUtil.resetMock(mock);
        MockHandlerInterface<SampleClass> newHandler = mockUtil.getMockHandler(mock);

        assertNotNull(newHandler);
        assertNotSame(oldHandler, newHandler);
    }

    @Test(expected = NotAMockException.class)
    public void resetMock_shouldThrowException_whenNull() {
        mockUtil.resetMock(null);
    }

    @Test(expected = NotAMockException.class)
    public void resetMock_shouldThrowException_whenNotAMock() {
        mockUtil.resetMock(new Object());
    }

    // -------------------------------------------------------------
    // getMockName(...) Coverage
    // -------------------------------------------------------------

    @Test
    public void getMockName_shouldReturnCorrectName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("customMockName");
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);
        assertNotNull(mockName);
        assertEquals("customMockName", mockName.toString());
    }

    @Test(expected = NotAMockException.class)
    public void getMockName_shouldThrowException_whenNull() {
        mockUtil.getMockName(null);
    }
}
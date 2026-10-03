package org.mockito.internal.util;

import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.Factory;
import org.mockito.cglib.proxy.NoOp;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.*;

public class MockUtilTest {

    private MockUtil mockUtil;

    public static class SampleClass {
        private String value = "initial";

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public interface SampleInterface {
        void doSomething();
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @Test
    public void testIsMock_WithNull_ShouldReturnFalse() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_WithNonFactoryObject_ShouldReturnFalse() {
        assertFalse(mockUtil.isMock("This is a normal String, not a mock"));
        assertFalse(mockUtil.isMock(new Object()));
    }

    @Test
    public void testIsMock_WithCglibFactoryNonMockitoCallback_ShouldReturnFalse() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object cglibProxy = enhancer.create();

        assertTrue(cglibProxy instanceof Factory);
        assertFalse(mockUtil.isMock(cglibProxy));
    }

    @Test
    public void testIsMock_WithValidMock_ShouldReturnTrue() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertTrue(mockUtil.isMock(mock));
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_WithNull_ShouldThrowNotAMockException() {
        try {
            mockUtil.getMockHandler(null);
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument should be a mock, but is null!"));
            throw e;
        }
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_WithNonMockObject_ShouldThrowNotAMockException() {
        try {
            mockUtil.getMockHandler("not_a_mock");
        } catch (NotAMockException e) {
            assertTrue(e.getMessage().contains("Argument should be a mock, but is: " + String.class));
            throw e;
        }
    }

    @Test
    public void testGetMockHandler_WithValidMock_ShouldReturnMockHandler() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        assertNotNull(handler.getMockSettings());
    }

    @Test
    public void testGetMockName_WithValidMock_ShouldReturnMockName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);
        assertNotNull(mockName);
        assertTrue(mockName.toString().contains("sampleClass"));
    }

    @Test
    public void testCreateMock_StandardClass_NotSerializable_NoExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertFalse(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_NotSerializable_WithExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(SampleInterface.class);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof SampleInterface);
        assertFalse(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_Serializable_NoExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_Serializable_WithExtraInterfaces() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        settings.extraInterfaces(SampleInterface.class);

        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Serializable);
        assertTrue(mock instanceof SampleInterface);
    }

    @Test
    public void testCreateMock_WithSpiedInstance_ShouldCopyState() {
        SampleClass original = new SampleClass();
        original.setValue("spied-custom-value");

        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(original);

        SampleClass spyMock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(spyMock);
        assertTrue(mockUtil.isMock(spyMock));
        assertEquals("spied-custom-value", spyMock.getValue());
    }

    @Test
    public void testResetMock_ShouldRecreateMockHandlerAndCallback() {
        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> originalHandler = mockUtil.getMockHandler(mock);

        mockUtil.resetMock(mock);

        MockHandlerInterface<SampleClass> resetHandler = mockUtil.getMockHandler(mock);
        assertNotNull(resetHandler);
        assertNotSame(originalHandler, resetHandler);
    }

    @Test(expected = NotAMockException.class)
    public void testResetMock_WithNull_ShouldThrowException() {
        mockUtil.resetMock(null);
    }

    @Test(expected = NotAMockException.class)
    public void testResetMock_WithNonMock_ShouldThrowException() {
        mockUtil.resetMock("invalid_mock");
    }

    @Test
    public void testCustomConstructorWithCreationValidator() {
        MockCreationValidator validator = new MockCreationValidator();
        MockUtil customUtil = new MockUtil(validator);
        assertNotNull(customUtil);

        MockSettingsImpl settings = new MockSettingsImpl();
        SampleClass mock = customUtil.createMock(SampleClass.class, settings);
        assertTrue(customUtil.isMock(mock));
    }
}
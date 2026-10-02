package org.mockito.internal.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.withSettings;

import java.io.Serializable;

import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.Factory;
import org.mockito.cglib.proxy.NoOp;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

/**
 * Unit tests for {@link MockUtil}.
 * ใช้ public API ของ Mockito (Mockito.withSettings()) ร่วมกับ MockUtil
 * เพื่อสร้างสถานการณ์จริงของ mock object สำหรับทดสอบ branch ต่าง ๆ
 */
public class MockUtilTest {

    private MockUtil mockUtil;

    // Sample classes สำหรับใช้ทดสอบ mocking
    public static class SampleClass {
        public int value = 10;
        public String name = "original";
        public void doSomething() { }
    }

    public interface ExtraInterface {
        void extraMethod();
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    // ---------------------------------------------------------------
    // createMock() - ครอบคลุม isSerializable() x interfaces==null x spiedInstance
    // ---------------------------------------------------------------

    @Test
    public void createMock_basicSettings_notSerializable_noExtraInterfaces() {
        // isSerializable()=false, interfaces=null -> ancillaryTypes = new Class<?>[0]
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertFalse("ไม่ควร implement Serializable เมื่อไม่ได้ตั้งค่า serializable()",
                mock instanceof Serializable);
    }

    @Test
    public void createMock_serializable_interfacesNull() {
        // isSerializable()=true, interfaces=null
        // -> ancillaryTypes = new Class<?>[]{Serializable.class}
        MockSettingsImpl settings = (MockSettingsImpl) withSettings().serializable();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue("mock ควร implement Serializable เมื่อเรียก serializable()",
                mock instanceof Serializable);
    }

    @Test
    public void createMock_serializable_withExtraInterfaces() {
        // isSerializable()=true, interfaces!=null
        // -> ancillaryTypes = ArrayUtils().concat(interfaces, Serializable.class)
        MockSettingsImpl settings = (MockSettingsImpl) withSettings()
                .serializable()
                .extraInterfaces(ExtraInterface.class);
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mock instanceof Serializable);
        assertTrue(mock instanceof ExtraInterface);
    }

    @Test
    public void createMock_notSerializable_withExtraInterfaces() {
        // isSerializable()=false, interfaces!=null -> ancillaryTypes = interfaces
        MockSettingsImpl settings = (MockSettingsImpl) withSettings()
                .extraInterfaces(ExtraInterface.class);
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertFalse(mock instanceof Serializable);
        assertTrue(mock instanceof ExtraInterface);
    }

    @Test
    public void createMock_withSpiedInstance_copiesFieldsFromSpy() {
        // spiedInstance != null -> LenientCopyTool().copyToMock(...) ถูกเรียก
        SampleClass spied = new SampleClass();
        spied.value = 99;
        spied.name = "spiedName";

        MockSettingsImpl settings = (MockSettingsImpl) withSettings()
                .spiedInstance(spied);
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertEquals("ค่าของ field ควรถูก copy มาจาก spiedInstance", 99, mock.value);
        assertEquals("spiedName", mock.name);
    }

    @Test
    public void createMock_withoutSpiedInstance_doesNotThrow() {
        // spiedInstance == null -> ไม่เรียก LenientCopyTool
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        // ไม่ assert ค่า field เนื่องจากพฤติกรรมการเรียก constructor ของ cglib proxy
        // ไม่ได้ระบุไว้ชัดเจนในซอร์สโค้ดที่ให้มา (ไม่เดา behavior)
    }

    // ---------------------------------------------------------------
    // getMockHandler() - ครอบคลุม mock==null, isMockitoMock true/false
    // ---------------------------------------------------------------

    @Test(expected = NotAMockException.class)
    public void getMockHandler_nullMock_throwsNotAMockException() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void getMockHandler_plainNonMockObject_throwsNotAMockException() {
        mockUtil.getMockHandler(new SampleClass());
    }

    @Test
    public void getMockHandler_validMock_returnsHandler() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockHandlerInterface<SampleClass> handler = mockUtil.getMockHandler(mock);

        assertNotNull(handler);
    }

    // ---------------------------------------------------------------
    // isMock() / isMockitoMock() / getInterceptor()
    // ครอบคลุม: null, not-Factory, Factory+wrong-callback, Factory+correct-callback
    // ---------------------------------------------------------------

    @Test
    public void isMock_nullArgument_returnsFalse() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void isMock_plainObject_notFactory_returnsFalse() {
        // !(mock instanceof Factory) -> getInterceptor คืน null
        assertFalse(mockUtil.isMock(new SampleClass()));
    }

    @Test
    public void isMock_factoryWithNonInterceptorCallback_returnsFalse() {
        // instanceof Factory = true, แต่ callback ไม่ใช่ MethodInterceptorFilter
        // -> getInterceptor คืน null -> isMockitoMock false
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object proxy = enhancer.create();

        assertTrue("proxy ควรเป็น cglib Factory", proxy instanceof Factory);
        assertFalse(mockUtil.isMock(proxy));
    }

    @Test
    public void isMock_validMockitoMock_returnsTrue() {
        // instanceof Factory = true, callback instanceof MethodInterceptorFilter = true
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        assertTrue(mockUtil.isMock(mock));
    }

    // ---------------------------------------------------------------
    // getMockName()
    // ---------------------------------------------------------------

    @Test
    public void getMockName_validMock_returnsNonNullMockName() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        MockName mockName = mockUtil.getMockName(mock);

        assertNotNull(mockName);
    }

    @Test(expected = NotAMockException.class)
    public void getMockName_nonMock_throwsNotAMockException() {
        mockUtil.getMockName(new SampleClass());
    }

    // ---------------------------------------------------------------
    // resetMock()
    // ---------------------------------------------------------------

    @Test
    public void resetMock_validMock_doesNotThrowAndRemainsMock() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        SampleClass mock = mockUtil.createMock(SampleClass.class, settings);

        mockUtil.resetMock(mock);

        // หลัง reset มน็อคควรยังถูกจำแนกว่าเป็น mock อยู่
        // (callback ถูกแทนที่ด้วย MethodInterceptorFilter ใหม่)
        assertTrue(mockUtil.isMock(mock));
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void defaultConstructor_doesNotThrow() {
        MockUtil util = new MockUtil();
        assertNotNull(util);
    }

    @Test
    public void constructorWithValidator_doesNotThrow() {
        MockUtil util = new MockUtil(new MockCreationValidator());
        assertNotNull(util);
    }
}

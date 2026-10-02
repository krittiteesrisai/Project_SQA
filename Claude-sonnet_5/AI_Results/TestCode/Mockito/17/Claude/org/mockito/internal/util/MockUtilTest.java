package org.mockito.internal.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MockSettingsImpl;

public class MockUtilTest {

    private MockUtil mockUtil;

    // ---- Fixture classes ----
    // ต้องไม่ final, มี default constructor เพื่อให้ cglib proxy ได้
    public static class Foo {
        private String value = "real";
        public Foo() {}
        public String doSomething() { return value; }
        public void setValue(String v) { this.value = v; }
    }

    public interface Bar {
        void doSomethingElse();
    }

    public interface ExtraInterface {
        void extraMethod();
    }

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    // ===================== Constructor =====================

    @Test
    public void shouldCreateMockUtilWithDefaultConstructor() {
        MockUtil util = new MockUtil();
        assertNotNull(util);
    }

    @Test
    public void shouldCreateMockUtilWithCustomValidator() {
        // CreationValidator source ไม่ได้ให้มา - ใช้แค่ instantiate ปกติ
        MockUtil util = new MockUtil(new CreationValidator());
        assertNotNull(util);
    }

    // ===================== createMock =====================

    @Test
    public void shouldCreateMockForSimpleClass_defaultBranches() {
        // interfaces == null -> ancillaryTypes = new Class<?>[0]
        // spiedInstance == null -> ไม่เรียก LenientCopyTool
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        Foo mock = mockUtil.createMock(Foo.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertFalse("ไม่ควร implement extra interface เมื่อไม่ได้ระบุ",
                mock instanceof ExtraInterface);
    }

    @Test
    public void shouldCreateMockWithExtraInterfaces_nonNullBranch() {
        // interfaces != null -> ancillaryTypes = interfaces
        MockSettingsImpl settings =
                (MockSettingsImpl) withSettings().extraInterfaces(ExtraInterface.class);
        Foo mock = mockUtil.createMock(Foo.class, settings);

        assertTrue(mockUtil.isMock(mock));
        assertTrue("มอคควร implement extra interface ที่กำหนด",
                mock instanceof ExtraInterface);
    }

    @Test
    public void shouldCreateMockForInterfaceType() {
        MockSettingsImpl settings = (MockSettingsImpl) withSettings();
        Bar mock = mockUtil.createMock(Bar.class, settings);

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void shouldCopyFieldsWhenSpiedInstanceProvided_viaPublicSpyApi() {
        // ใช้ Mockito.spy() (public API) เพื่อทำให้ settings.getSpiedInstance() != null
        // แล้ว createMock ภายในจะเข้า branch: new LenientCopyTool().copyToMock(...)
        Foo real = new Foo();
        real.setValue("copied-value");

        Foo spy = spy(real);

        assertTrue(mockUtil.isMock(spy));
        // ค่าที่ถูกคัดลอกมาจาก real instance ควรยังอยู่ (พฤติกรรมของ spy ที่คาดหวังตาม Mockito ปกติ)
        assertEquals("copied-value", spy.doSomething());
    }

    // ===================== resetMock =====================

    @Test
    public void shouldResetMockAndKeepItAsMock() {
        Foo mock = mock(Foo.class);
        mockUtil.resetMock(mock);

        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void shouldClearPreviousStubbingAfterReset() {
        Foo mock = mock(Foo.class);
        when(mock.doSomething()).thenReturn("stubbed");
        assertEquals("stubbed", mock.doSomething());

        mockUtil.resetMock(mock);

        assertNotEquals("stubbed", mock.doSomething());
    }

    // ===================== getMockHandler =====================

    @Test(expected = NotAMockException.class)
    public void shouldThrowNotAMockException_whenArgumentIsNull() {
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrowNotAMockException_whenArgumentIsPlainObject() {
        mockUtil.getMockHandler(new Foo());
    }

    @Test
    public void shouldReturnHandler_whenArgumentIsValidMock() {
        Foo mock = mock(Foo.class);
        MockHandlerInterface<Foo> handler = mockUtil.getMockHandler(mock);

        assertNotNull(handler);
    }

    @Test
    public void shouldReturnHandler_whenArgumentIsValidInterfaceMock() {
        Bar mock = mock(Bar.class);
        MockHandlerInterface<Bar> handler = mockUtil.getMockHandler(mock);

        assertNotNull(handler);
    }

    // ===================== isMock =====================

    @Test
    public void shouldReturnFalse_whenMockIsNull() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void shouldReturnFalse_whenObjectIsNotCglibEnhanced() {
        assertFalse(mockUtil.isMock(new Foo()));
        assertFalse(mockUtil.isMock("plain string"));
    }

    @Test
    public void shouldReturnTrue_whenObjectIsRealMockitoMock() {
        Foo mock = mock(Foo.class);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void shouldReturnTrue_whenObjectIsRealMockitoInterfaceMock() {
        Bar mock = mock(Bar.class);
        assertTrue(mockUtil.isMock(mock));
    }

    // ===================== getMockName =====================

    @Test
    public void shouldReturnMockName_whenArgumentIsValidMock() {
        Foo mock = mock(Foo.class);
        MockName name = mockUtil.getMockName(mock);

        assertNotNull(name);
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrow_whenGettingMockNameOfNonMock() {
        mockUtil.getMockName(new Foo());
    }

    @Test(expected = NotAMockException.class)
    public void shouldThrow_whenGettingMockNameOfNullArgument() {
        mockUtil.getMockName(null);
    }
}

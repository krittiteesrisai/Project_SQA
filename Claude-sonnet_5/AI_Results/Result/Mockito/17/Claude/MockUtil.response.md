# การวิเคราะห์และชุดทดสอบ MockUtilTest

## หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4)

- คลาส `CreationValidator` และ `LenientCopyTool` ไม่มีซอร์สโค้ดให้ จึง**ไม่เดา exception type หรือ validation rule ที่แน่ชัด** ของมัน — ใช้แค่ instantiate ด้วยค่าที่ถูกต้องตามปกติ (happy path) เท่านั้น
- เพื่อทดสอบ branch `spiedInstance != null` ใน `createMock` อย่างปลอดภัยโดยไม่เดา method ของ `MockSettingsImpl` ที่ไม่ปรากฏในซอร์ส จะใช้ Public API `Mockito.spy()` ซึ่งภายในเรียก `createMock` พร้อม spiedInstance ตั้งค่าแล้ว (indirect coverage)
- branch ของ `getInterceptor()` ที่ `callback` ไม่ใช่ `MethodInterceptorFilter` (คืน `null`) **ไม่สามารถจำลองได้ง่าย** โดยไม่เขียน cglib proxy เอง — ระบุไว้เป็น known gap ในตารางสรุป

```java
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
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `shouldCreateMockUtilWithDefaultConstructor` | Constructor `MockUtil()` → เรียก `this(new CreationValidator())` |
| `shouldCreateMockUtilWithCustomValidator` | Constructor `MockUtil(CreationValidator)` โดยตรง |
| `shouldCreateMockForSimpleClass_defaultBranches` | `createMock`: `interfaces == null` → `ancillaryTypes = new Class<?>[0]`, `spiedInstance == null` (if ไม่เข้า) |
| `shouldCreateMockWithExtraInterfaces_nonNullBranch` | `createMock`: `interfaces != null` → `ancillaryTypes = interfaces` |
| `shouldCreateMockForInterfaceType` | `createMock` กับ interface type (validator + imposterise path) |
| `shouldCopyFieldsWhenSpiedInstanceProvided_viaPublicSpyApi` | `createMock`: `if (spiedInstance != null)` → เรียก `LenientCopyTool.copyToMock` |
| `shouldResetMockAndKeepItAsMock` | `resetMock`: สร้าง handler ใหม่ + ตั้ง callback ใหม่สำเร็จ |
| `shouldClearPreviousStubbingAfterReset` | `resetMock`: ยืนยันผลลัพธ์จริงหลัง reset (fault detection) |
| `shouldThrowNotAMockException_whenArgumentIsNull` | `getMockHandler`: `if (mock == null)` → throw |
| `shouldThrowNotAMockException_whenArgumentIsPlainObject` | `getMockHandler`: `isMockitoMock(mock) == false` → else throw |
| `shouldReturnHandler_whenArgumentIsValidMock` | `getMockHandler`: `isMockitoMock(mock) == true` → return handler |
| `shouldReturnHandler_whenArgumentIsValidInterfaceMock` | เหมือนด้านบนแต่กับ interface mock |
| `shouldReturnFalse_whenMockIsNull` | `isMock`: `mock != null` เป็น false → short-circuit |
| `shouldReturnFalse_whenObjectIsNotCglibEnhanced` | `isMock`/`isMockitoMock`: `Enhancer.isEnhanced(...) == false` |
| `shouldReturnTrue_whenObjectIsRealMockitoMock` | `isMock`/`isMockitoMock`: ทั้งสองเงื่อนไข `&&` เป็น true, `getInterceptor` คืนค่า non-null, `callback instanceof MethodInterceptorFilter == true` |
| `shouldReturnTrue_whenObjectIsRealMockitoInterfaceMock` | เหมือนด้านบนกับ interface mock |
| `shouldReturnMockName_whenArgumentIsValidMock` | `getMockName`: path สำเร็จ ผ่าน `getMockHandler` |
| `shouldThrow_whenGettingMockNameOfNonMock` | `getMockName` → `getMockHandler` throw ผ่านขึ้นมา (non-mock) |
| `shouldThrow_whenGettingMockNameOfNullArgument` | `getMockName` → `getMockHandler` throw ผ่านขึ้นมา (null) |

### Known Coverage Gap (ระบุตามข้อกำหนดที่ 4)
- `getInterceptor()` branch ที่ `callback instanceof MethodInterceptorFilter == false` (คืน `null`) **ไม่ได้ถูกทดสอบ** เนื่องจากต้องสร้าง cglib `Factory` ที่มี callback ชนิดอื่นโดยเฉพาะ ซึ่งไม่สามารถทำได้อย่างปลอดภัยโดยไม่เดา internal implementation เพิ่มเติม
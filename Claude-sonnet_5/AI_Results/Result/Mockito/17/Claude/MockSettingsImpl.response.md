# วิเคราะห์คลาสเป้าหมาย

จากซอร์สโค้ด `MockSettingsImpl` มีจุดที่ต้องทดสอบ:

1. **`extraInterfaces(...)`** มีเงื่อนไขซับซ้อนที่สุด:
   - `extraInterfaces == null || extraInterfaces.length == 0` (2 เงื่อนไข OR)
   - loop ตรวจสอบแต่ละ element: `i == null` (if), `!i.isInterface()` (else if), หรือผ่านทั้งคู่ (ไม่เข้า branch ใดเลย)
2. **`serializable()`** เรียก `extraInterfaces(Serializable.class)`
3. **`isSerializable()`** เงื่อนไข `extraInterfaces != null && contains(Serializable.class)` (short-circuit AND)
4. Getter/Setter ทั่วไป (`name`, `spiedInstance`, `defaultAnswer`) — ไม่มี branch แต่ควรทดสอบ fluent return และค่า null
5. `initiateMockName` — สร้าง `MockName` ใหม่

> **หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):** ซอร์สของ `org.mockito.exceptions.Reporter` และ `org.mockito.internal.util.MockName` ไม่ได้ให้มาในโจทย์นี้ จึงไม่สามารถยืนยัน behavior ภายในได้ 100% แต่จากพฤติกรรมจริงของ Mockito framework (ซึ่งต้องอยู่ใน classpath เดียวกันกับคลาสเป้าหมายเพื่อให้ compile ผ่าน) เมธอดของ `Reporter` จะ `throw` exception ภายในตัวเอง (ไม่ต้องมี `throw` ที่ call site) จึงสมมติฐานนี้ถูกใช้ในการเขียนเทสเคสที่เกี่ยวกับ exception — มีคอมเมนต์กำกับไว้ในโค้ดทุกจุดที่ใช้สมมติฐานนี้

```java
package org.mockito.internal.creation;

import org.junit.Before;
import org.junit.Test;

import org.mockito.MockSettings;
import org.mockito.internal.util.MockName;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link MockSettingsImpl} (Defects4J: Mockito-17b)
 *
 * หมายเหตุ: บางเทสเคสอาศัยสมมติฐานว่า org.mockito.exceptions.Reporter
 * จะ throw RuntimeException (เช่น MockitoException) เมื่อเรียกเมธอด validation
 * ที่เกี่ยวข้อง เนื่องจากซอร์สของ Reporter ไม่ได้ให้มาในโจทย์ จึงใช้ catch(RuntimeException)
 * แบบกว้าง ๆ เพื่อไม่เดา exception type ที่เฉพาะเจาะจงเกินไป
 */
public class MockSettingsImplTest {

    private MockSettingsImpl settings;

    @Before
    public void setUp() {
        settings = new MockSettingsImpl();
    }

    // ---------------------------------------------------------------
    // extraInterfaces() : null / empty -> validation branch (Reporter)
    // ---------------------------------------------------------------

    @Test
    public void testExtraInterfaces_nullArray_shouldTriggerValidationBranch() {
        // Branch: extraInterfaces == null -> true (OR short-circuit)
        try {
            settings.extraInterfaces((Class<?>[]) null);
            // ถ้า Reporter ไม่ throw จริง การวนลูปกับ null จะเกิด NullPointerException แทน
            fail("Expected an exception when extraInterfaces is null");
        } catch (RuntimeException e) {
            // assumption: Reporter#extraInterfacesRequiresAtLeastOneInterface() throws,
            // หรือ NPE จาก for-loop ถ้า Reporter ไม่ throw จริง (ทั้งคู่เป็น RuntimeException)
        }
    }

    @Test
    public void testExtraInterfaces_emptyArray_shouldTriggerValidationBranch() {
        // Branch: extraInterfaces.length == 0 -> true
        try {
            settings.extraInterfaces(); // varargs ไม่มี argument -> array length 0
            fail("Expected an exception when extraInterfaces is empty");
        } catch (RuntimeException e) {
            // assumption: Reporter#extraInterfacesRequiresAtLeastOneInterface() throws
        }
    }

    // ---------------------------------------------------------------
    // extraInterfaces() : loop - null element branch
    // ---------------------------------------------------------------

    @Test
    public void testExtraInterfaces_singleNullElement_shouldTriggerNullElementBranch() {
        // Branch: i == null -> true (first iteration)
        try {
            settings.extraInterfaces(new Class<?>[]{null});
            fail("Expected an exception when element is null");
        } catch (RuntimeException e) {
            // assumption: Reporter#extraInterfacesDoesNotAcceptNullParameters() throws
        }
    }

    @Test
    public void testExtraInterfaces_nullElementAfterValidElement_shouldTriggerOnSecondIteration() {
        // ทดสอบ loop หลาย iteration: element แรกผ่าน (interface), element ที่สอง null
        try {
            settings.extraInterfaces(Runnable.class, null);
            fail("Expected an exception when second element is null");
        } catch (RuntimeException e) {
            // assumption: validation throws on the null element in loop
        }
    }

    // ---------------------------------------------------------------
    // extraInterfaces() : loop - non-interface element branch
    // ---------------------------------------------------------------

    @Test
    public void testExtraInterfaces_nonInterfaceClass_shouldTriggerNotInterfaceBranch() {
        // Branch: !i.isInterface() -> true (concrete class)
        try {
            settings.extraInterfaces(String.class);
            fail("Expected an exception when element is not an interface");
        } catch (RuntimeException e) {
            // assumption: Reporter#extraInterfacesAcceptsOnlyInterfaces(i) throws
        }
    }

    @Test
    public void testExtraInterfaces_primitiveClass_shouldTriggerNotInterfaceBranch() {
        // boundary case: primitive type -> isInterface() == false เช่นกัน
        try {
            settings.extraInterfaces(int.class);
            fail("Expected an exception when element is a primitive type");
        } catch (RuntimeException e) {
            // assumption: primitive ไม่ใช่ interface -> validation throws
        }
    }

    // ---------------------------------------------------------------
    // extraInterfaces() : valid cases (ไม่ throw, ผ่าน loop ทุก element)
    // ---------------------------------------------------------------

    @Test
    public void testExtraInterfaces_singleValidInterface_shouldSetFieldAndReturnThis() {
        MockSettings result = settings.extraInterfaces(Runnable.class);
        assertSame("fluent API should return the same instance", settings, result);
        assertArrayEquals(new Class<?>[]{Runnable.class}, settings.getExtraInterfaces());
    }

    @Test
    public void testExtraInterfaces_multipleValidInterfaces_shouldSetFieldCorrectly() {
        Class<?>[] input = new Class<?>[]{Runnable.class, Comparable.class, Serializable.class};
        MockSettings result = settings.extraInterfaces(input);
        assertSame(settings, result);
        assertArrayEquals(input, settings.getExtraInterfaces());
    }

    // ---------------------------------------------------------------
    // serializable()
    // ---------------------------------------------------------------

    @Test
    public void testSerializable_shouldSetExtraInterfacesToSerializable() {
        MockSettings result = settings.serializable();
        assertSame(settings, result);
        assertArrayEquals(new Class<?>[]{Serializable.class}, settings.getExtraInterfaces());
        assertTrue(settings.isSerializable());
    }

    // ---------------------------------------------------------------
    // isSerializable()
    // ---------------------------------------------------------------

    @Test
    public void testIsSerializable_defaultFalse_whenExtraInterfacesNull() {
        // Branch: extraInterfaces != null -> false (short-circuit, ไม่ถึง contains())
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testIsSerializable_false_whenExtraInterfacesDoesNotContainSerializable() {
        settings.extraInterfaces(Runnable.class);
        // Branch: extraInterfaces != null -> true, contains(Serializable) -> false
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testIsSerializable_true_whenExtraInterfacesContainsSerializable() {
        settings.extraInterfaces(Runnable.class, Serializable.class);
        // Branch: extraInterfaces != null -> true, contains(Serializable) -> true
        assertTrue(settings.isSerializable());
    }

    // ---------------------------------------------------------------
    // getExtraInterfaces() default
    // ---------------------------------------------------------------

    @Test
    public void testGetExtraInterfaces_defaultNull() {
        assertNull(settings.getExtraInterfaces());
    }

    // ---------------------------------------------------------------
    // name()
    // ---------------------------------------------------------------

    @Test
    public void testName_shouldReturnThis() {
        MockSettings result = settings.name("myMock");
        assertSame(settings, result);
    }

    @Test
    public void testName_null_shouldNotThrow() {
        // ไม่มี validation ใน name() ตามซอร์สที่ให้มา
        MockSettings result = settings.name(null);
        assertSame(settings, result);
    }

    @Test
    public void testName_emptyString_shouldNotThrow() {
        MockSettings result = settings.name("");
        assertSame(settings, result);
    }

    // ---------------------------------------------------------------
    // spiedInstance()
    // ---------------------------------------------------------------

    @Test
    public void testGetSpiedInstance_defaultNull() {
        assertNull(settings.getSpiedInstance());
    }

    @Test
    public void testSpiedInstance_setAndGet() {
        Object spied = new Object();
        MockSettings result = settings.spiedInstance(spied);
        assertSame(settings, result);
        assertSame(spied, settings.getSpiedInstance());
    }

    @Test
    public void testSpiedInstance_null_shouldSetNull() {
        MockSettings result = settings.spiedInstance(null);
        assertSame(settings, result);
        assertNull(settings.getSpiedInstance());
    }

    // ---------------------------------------------------------------
    // defaultAnswer()
    // ---------------------------------------------------------------

    @Test
    public void testGetDefaultAnswer_defaultNull() {
        assertNull(settings.getDefaultAnswer());
    }

    @Test
    public void testDefaultAnswer_setAndGet() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "stubbed";
            }
        };
        MockSettings result = settings.defaultAnswer(answer);
        assertSame(settings, result);
        assertSame(answer, settings.getDefaultAnswer());
    }

    @Test
    public void testDefaultAnswer_null_shouldSetNull() {
        MockSettings result = settings.defaultAnswer(null);
        assertSame(settings, result);
        assertNull(settings.getDefaultAnswer());
    }

    // ---------------------------------------------------------------
    // getMockName() / initiateMockName()
    // ---------------------------------------------------------------

    @Test
    public void testGetMockName_defaultNull() {
        assertNull(settings.getMockName());
    }

    @Test
    public void testInitiateMockName_withoutCustomName_shouldCreateMockName() {
        // name field เป็น null เนื่องจากไม่ได้เรียก name(...) มาก่อน
        settings.initiateMockName(String.class);
        MockName mockName = settings.getMockName();
        // ไม่สามารถยืนยัน format ภายในของ MockName ได้ เนื่องจากไม่มีซอร์สให้
        // จึงตรวจสอบเพียงว่ามีการสร้าง object ขึ้นจริง
        assertNotNull(mockName);
    }

    @Test
    public void testInitiateMockName_withCustomName_shouldCreateMockName() {
        settings.name("customName");
        settings.initiateMockName(Object.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
    }
}
```

---

# สรุปตาราง Test Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testExtraInterfaces_nullArray_shouldTriggerValidationBranch` | `extraInterfaces == null` → true (OR เงื่อนไขแรก) |
| `testExtraInterfaces_emptyArray_shouldTriggerValidationBranch` | `extraInterfaces.length == 0` → true (OR เงื่อนไขที่สอง) |
| `testExtraInterfaces_singleNullElement_shouldTriggerNullElementBranch` | loop: `i == null` → true (iteration แรก) |
| `testExtraInterfaces_nullElementAfterValidElement_shouldTriggerOnSecondIteration` | loop หลาย iteration, element 1 ผ่าน, element 2 เข้า `i == null` |
| `testExtraInterfaces_nonInterfaceClass_shouldTriggerNotInterfaceBranch` | loop: `i == null` → false, `!i.isInterface()` → true |
| `testExtraInterfaces_primitiveClass_shouldTriggerNotInterfaceBranch` | boundary: primitive type ไม่ใช่ interface |
| `testExtraInterfaces_singleValidInterface_shouldSetFieldAndReturnThis` | loop ผ่านทั้งสอง condition (false/false), field ถูก set, fluent return |
| `testExtraInterfaces_multipleValidInterfaces_shouldSetFieldCorrectly` | loop วนหลายรอบโดยไม่เข้า branch ใดเลย |
| `testSerializable_shouldSetExtraInterfacesToSerializable` | เรียก `serializable()` → `extraInterfaces(Serializable.class)` branch สำเร็จ |
| `testIsSerializable_defaultFalse_whenExtraInterfacesNull` | `extraInterfaces != null` → false (short-circuit) |
| `testIsSerializable_false_whenExtraInterfacesDoesNotContainSerializable` | `!= null` → true, `contains(...)` → false |
| `testIsSerializable_true_whenExtraInterfacesContainsSerializable` | `!= null` → true, `contains(...)` → true |
| `testGetExtraInterfaces_defaultNull` | ค่าเริ่มต้นของ field `extraInterfaces` |
| `testName_shouldReturnThis` / `_null_` / `_emptyString_` | setter ไม่มี branch, ทดสอบ null/empty/ปกติ และ fluent return |
| `testGetSpiedInstance_defaultNull` / `testSpiedInstance_setAndGet` / `_null_` | ค่าเริ่มต้น, ค่าปกติ, ค่า null |
| `testGetDefaultAnswer_defaultNull` / `testDefaultAnswer_setAndGet` / `_null_` | ค่าเริ่มต้น, ค่าปกติ (anonymous Answer), ค่า null |
| `testGetMockName_defaultNull` | ค่าเริ่มต้นของ `mockName` |
| `testInitiateMockName_withoutCustomName_shouldCreateMockName` | สร้าง `MockName` โดยไม่มี custom name |
| `testInitiateMockName_withCustomName_shouldCreateMockName` | สร้าง `MockName` โดยมี custom name ที่ set ไว้ก่อน |

**ข้อควรระวัง:** กรณีทดสอบที่เกี่ยวกับ exception จาก `extraInterfaces(...)` ใช้ `catch (RuntimeException e)` แบบกว้าง เนื่องจากไม่มีซอร์สของ `Reporter` ให้ยืนยัน exception type ที่แน่ชัด — เป็นไปตามข้อกำหนดที่ 4 ที่ห้ามเดา behavior ที่ไม่มีในซอร์สที่ให้มา
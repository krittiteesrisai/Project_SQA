# วิเคราะห์คลาสเป้าหมาย

คลาส `CallsRealMethods` มีเพียง method เดียวคือ `answer(InvocationOnMock invocation)` ซึ่งมี statement เดียว:

```java
return invocation.callRealMethod();
```

ไม่มี `if/else` หรือ `loop` ในซอร์สโค้ดจริง (cyclomatic complexity = 1) ดังนั้น branch coverage ในเชิงโครงสร้างโค้ดจะเต็ม 100% ได้ด้วยการเรียก method เพียงครั้งเดียว แต่เพื่อ**เพิ่มโอกาสดักจับ fault** (เช่น การ swallow exception, การ return ค่าผิด, การไม่ propagate ค่า/ข้อยกเว้นตามจริง) จึงต้องทดสอบ "เส้นทางพฤติกรรม" ของ `callRealMethod()` หลายกรณี: คืนค่าปกติ, คืนค่า null, และโยน exception ประเภทต่าง ๆ (checked exception, RuntimeException, Error)

เนื่องจาก classpath ที่กำหนดไม่มี `mockito-core.jar` สำหรับสร้าง mock ด้วย `Mockito.mock()` จึงสร้าง **fake implementation ของ `InvocationOnMock`** ขึ้นมาเองเพื่อควบคุมพฤติกรรมของ `callRealMethod()` อย่างชัดเจน (ไม่ใช่การเดา behavior แต่เป็นการจำลอง interface ตามสัญญาที่ `CallsRealMethods` เรียกใช้จริง)

```java
package org.mockito.internal.stubbing.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Serializable;
import java.lang.reflect.Method;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class CallsRealMethodsTest {

    /**
     * Fake implementation ของ InvocationOnMock สำหรับควบคุมพฤติกรรมของ
     * callRealMethod() เพื่อทดสอบ CallsRealMethods.answer() โดยไม่พึ่ง
     * mockito-core mocking framework (ไม่มีอยู่ใน classpath ที่กำหนด)
     */
    private static class FakeInvocation implements InvocationOnMock, Serializable {
        private static final long serialVersionUID = 1L;
        private final Object returnValue;
        private final Throwable throwableToThrow;
        private boolean callRealMethodInvoked = false;

        FakeInvocation(Object returnValue) {
            this.returnValue = returnValue;
            this.throwableToThrow = null;
        }

        FakeInvocation(Throwable throwableToThrow) {
            this.returnValue = null;
            this.throwableToThrow = throwableToThrow;
        }

        boolean wasCallRealMethodInvoked() {
            return callRealMethodInvoked;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            callRealMethodInvoked = true;
            if (throwableToThrow != null) {
                throw throwableToThrow;
            }
            return returnValue;
        }

        // เมธอดด้านล่างไม่ถูกใช้โดย CallsRealMethods.answer() แต่ต้อง implement
        // ให้ครบตาม interface InvocationOnMock
        @Override
        public Object getMock() {
            throw new UnsupportedOperationException("not needed for this test");
        }

        @Override
        public Method getMethod() {
            throw new UnsupportedOperationException("not needed for this test");
        }

        @Override
        public Object[] getArguments() {
            throw new UnsupportedOperationException("not needed for this test");
        }
    }

    private final CallsRealMethods callsRealMethods = new CallsRealMethods();

    // ----- กรณีปกติ: callRealMethod() คืนค่าไม่เป็น null -----
    @Test
    public void testAnswer_ReturnsNonNullValueFromRealMethod() throws Throwable {
        String expected = "real-result";
        FakeInvocation invocation = new FakeInvocation((Object) expected);

        Object result = callsRealMethods.answer(invocation);

        assertSame("answer() ต้องคืนค่าเดียวกับที่ callRealMethod() คืนมา",
                expected, result);
        assertTrue("callRealMethod() ต้องถูกเรียกจริง",
                invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณีขอบ (boundary): callRealMethod() คืน null -----
    @Test
    public void testAnswer_ReturnsNullValueFromRealMethod() throws Throwable {
        FakeInvocation invocation = new FakeInvocation((Object) null);

        Object result = callsRealMethods.answer(invocation);

        assertNull("answer() ต้องคืน null ถ้า real method คืน null", result);
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณี exception: checked Exception ต้องถูก propagate โดยไม่ถูก wrap/swallow -----
    @Test
    public void testAnswer_PropagatesCheckedException() {
        Exception expected = new Exception("checked exception from real method");
        FakeInvocation invocation = new FakeInvocation(expected);

        try {
            callsRealMethods.answer(invocation);
            fail("คาดว่าจะมีการ throw exception ออกมา");
        } catch (Throwable t) {
            assertSame("exception ที่ throw ออกมาต้องเป็นตัวเดียวกับที่ real method throw",
                    expected, t);
        }
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณี exception: RuntimeException -----
    @Test
    public void testAnswer_PropagatesRuntimeException() {
        RuntimeException expected = new RuntimeException("runtime exception from real method");
        FakeInvocation invocation = new FakeInvocation(expected);

        try {
            callsRealMethods.answer(invocation);
            fail("คาดว่าจะมีการ throw RuntimeException ออกมา");
        } catch (Throwable t) {
            assertSame(expected, t);
        }
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณี exception: Error (ไม่ใช่ Exception) -----
    @Test
    public void testAnswer_PropagatesError() {
        Error expected = new Error("error from real method");
        FakeInvocation invocation = new FakeInvocation(expected);

        try {
            callsRealMethods.answer(invocation);
            fail("คาดว่าจะมีการ throw Error ออกมา");
        } catch (Throwable t) {
            assertSame(expected, t);
        }
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- กรณีค่าตัวแทนประเภทอื่น (wrapper type) เพื่อยืนยันความถูกต้องของ passthrough -----
    @Test
    public void testAnswer_ReturnsPrimitiveWrapperValue() throws Throwable {
        Integer expected = Integer.valueOf(42);
        FakeInvocation invocation = new FakeInvocation((Object) expected);

        Object result = callsRealMethods.answer(invocation);

        assertEquals(expected, result);
        assertTrue(invocation.wasCallRealMethodInvoked());
    }

    // ----- ตรวจสัญญา Serializable ของคลาสเป้าหมาย (ประกาศ implements Serializable) -----
    @Test
    public void testCallsRealMethods_isSerializable() {
        org.mockito.stubbing.Answer<Object> answer = callsRealMethods;
        assertTrue("CallsRealMethods ต้อง implement Serializable",
                answer instanceof Serializable);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | สิ่งที่ครอบคลุม |
|---|---|
| `testAnswer_ReturnsNonNullValueFromRealMethod` | Path ปกติ: `callRealMethod()` คืนค่าที่ไม่เป็น null และค่าถูกส่งผ่านกลับมาจาก `answer()` โดยไม่ถูกแปลง/สูญหาย |
| `testAnswer_ReturnsNullValueFromRealMethod` | ค่าขอบเขต (boundary/null case): `callRealMethod()` คืน `null` และ `answer()` ต้องคืน `null` ด้วย (ตรวจว่าไม่มีการแทรก logic เพิ่มเติมที่เปลี่ยนค่า null) |
| `testAnswer_PropagatesCheckedException` | เส้นทาง exception: checked `Exception` ที่ throw จาก `callRealMethod()` ต้องถูก propagate ออกจาก `answer()` โดยไม่ถูก catch/wrap/swallow |
| `testAnswer_PropagatesRuntimeException` | เส้นทาง exception: `RuntimeException` ต้อง propagate ตรงเหมือนกัน (กรณี unchecked) |
| `testAnswer_PropagatesError` | เส้นทาง exception: `Error` (non-Exception Throwable) ต้อง propagate ได้ตาม signature `throws Throwable` |
| `testAnswer_ReturnsPrimitiveWrapperValue` | กรณีตัวแทนค่าประเภทอื่น (Integer) เพื่อยืนยันว่า passthrough ทำงานถูกต้องกับชนิดข้อมูลหลากหลาย ไม่ใช่เฉพาะ String |
| `testCallsRealMethods_isSerializable` | ตรวจสัญญาการ implement `Serializable` ของคลาส (ตามที่ประกาศใน class signature) |

**หมายเหตุ:** เนื่องจากซอร์สโค้ดของ `answer()` ไม่มี `if/else` หรือ `loop` จริง (เป็น single return statement) จึงไม่มี branch เชิงโครงสร้างให้ cover เพิ่มเติมนอกจากกรณีพฤติกรรมของ `invocation.callRealMethod()` ที่ทดสอบไว้ข้างต้น ซึ่งเพียงพอต่อการยืนยันว่า `answer()` ทำหน้าที่ **pure delegation** ตามที่ซอร์สโค้ดระบุไว้จริง โดยไม่มีการดัดแปลงค่าหรือดักจับ exception ใด ๆ ที่ไม่มีอยู่ในซอร์ส
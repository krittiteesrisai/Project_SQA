# AnswersValidatorTest

## หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4)

คลาส `Invocation` (org.mockito.internal.invocation.Invocation) ที่ `AnswersValidator` ใช้งานเป็น **concrete class ภายในของ Mockito** และไม่ได้ถูกให้ source มาด้วย ในชุดทดสอบนี้จึง:

- **ไม่ใช้ mock framework** เพิ่มเติม (ไม่มี mockito-core/powermock-api อยู่ใน classpath ที่กำหนด) แต่สร้าง `Invocation` จริงโดยใช้ reflect `Method` จาก interface ตัวอย่าง (`SampleInterface`) ที่ควบคุม return type / throws-clause ได้เอง
- สมมติ constructor ของ `Invocation` เป็น `Invocation(Object mock, MockitoMethod mockitoMethod, Object[] args, int sequenceNumber, RealMethod realMethod)` และใช้ `DelegatingMethod` เป็น `MockitoMethod` implementation ตามพฤติกรรมมาตรฐานของ Mockito 1.9.x — **หากเวอร์ชันจริงต่างจากนี้ ต้องปรับ helper `invocationFor(...)`**
- method `isVoid()`, `returnsPrimitive()`, `isValidReturnType()`, `isValidException()`, `printMethodReturnType()`, `getMethodName()` ถูกอ้างอิงใน source ที่ให้มาอยู่แล้ว แต่ implementation จริงไม่ได้ให้มา จึงอิงพฤติกรรมมาตรฐาน (คำนวณจาก reflect Method จริง) — คอมเมนต์กำกับไว้ในโค้ด
- method ของ `Reporter` ทุกตัวสมมติว่า throw exception ที่เป็น (หรือสืบทอดจาก) `MockitoException` จึงใช้ `MockitoException` เป็น expected type (ปลอดภัยกว่าการเดา subclass เฉพาะ)

```java
package org.mockito.internal.stubbing.answers;

import org.junit.Before;
import org.junit.Test;

import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.DelegatingMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.stubbing.Answer;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Unit test สำหรับ AnswersValidator
 *
 * ดูหมายเหตุเกี่ยวกับการสร้าง Invocation ด้านบน (ก่อน code block) — ใช้ reflect Method
 * จาก SampleInterface แทนการ mock เพื่อให้ isVoid()/returnsPrimitive()/isValidReturnType()/
 * isValidException() คำนวณจากลักษณะ method จริง ไม่ต้องเดา behavior ของ Invocation เอง
 */
public class AnswersValidatorTest {

    private AnswersValidator validator;

    // interface ตัวอย่างใช้สร้าง Method ที่มี return type / throws clause ต่างกัน
    interface SampleInterface {
        void voidMethod();
        int intMethod();
        String stringMethod();
        void methodDeclaringIOException() throws IOException;
        void methodDeclaringNoCheckedException();
    }

    @Before
    public void setUp() {
        validator = new AnswersValidator();
    }

    /**
     * สร้าง Invocation จริงจาก reflect Method ของ SampleInterface
     * (ดูหมายเหตุเรื่อง constructor signature ที่สมมติไว้ด้านบน)
     */
    private Invocation invocationFor(String methodName, Class<?>... paramTypes) throws NoSuchMethodException {
        Method method = SampleInterface.class.getMethod(methodName, paramTypes);
        RealMethod realMethod = new RealMethod() {
            public Object invoke(Object target, Object[] arguments) throws Throwable {
                throw new UnsupportedOperationException("ไม่ถูกเรียกใช้ในชุดทดสอบนี้");
            }
        };
        // สมมติ parameter order: mock, mockitoMethod, args, sequenceNumber, realMethod
        return new Invocation(new Object(), new DelegatingMethod(method), new Object[0], 1, realMethod);
    }

    // ---------------- ThrowsException branches ----------------

    @Test(expected = MockitoException.class)
    public void shouldFailWhenThrowableIsNull() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        validator.validate(new ThrowsException(null), invocation); // throwable == null
    }

    @Test
    public void shouldPassWhenThrowableIsRuntimeException() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        // branch: throwable instanceof RuntimeException -> early return, ไม่ตรวจสอบต่อ
        validator.validate(new ThrowsException(new RuntimeException()), invocation);
    }

    @Test
    public void shouldPassWhenThrowableIsError() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        // branch: throwable instanceof Error -> early return
        validator.validate(new ThrowsException(new Error()), invocation);
    }

    @Test
    public void shouldPassWhenCheckedExceptionIsDeclaredByMethod() throws Exception {
        Invocation invocation = invocationFor("methodDeclaringIOException");
        // branch: !invocation.isValidException(throwable) == false -> ไม่ throw
        validator.validate(new ThrowsException(new IOException()), invocation);
    }

    @Test(expected = MockitoException.class)
    public void shouldFailWhenCheckedExceptionIsNotDeclaredByMethod() throws Exception {
        Invocation invocation = invocationFor("methodDeclaringNoCheckedException");
        // branch: !invocation.isValidException(throwable) == true -> throw
        validator.validate(new ThrowsException(new IOException()), invocation);
    }

    // ---------------- Returns branches ----------------

    @Test(expected = MockitoException.class)
    public void shouldFailWhenStubbingVoidMethodWithReturnValue() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        // branch: invocation.isVoid() == true
        validator.validate(new Returns("value"), invocation);
    }

    @Test(expected = MockitoException.class)
    public void shouldFailWhenReturningNullForPrimitiveReturnType() throws Exception {
        Invocation invocation = invocationFor("intMethod");
        // branch: answer.returnsNull() && invocation.returnsPrimitive() == true
        validator.validate(new Returns(null), invocation);
    }

    @Test
    public void shouldPassWhenReturningNullForObjectReturnType() throws Exception {
        Invocation invocation = invocationFor("stringMethod");
        // returnsNull()==true -> ข้าม branch ที่ 2 (ไม่ primitive) และ branch ที่ 3 (เพราะ !returnsNull()==false)
        validator.validate(new Returns(null), invocation);
    }

    @Test(expected = MockitoException.class)
    public void shouldFailWhenReturnTypeIsInvalid() throws Exception {
        Invocation invocation = invocationFor("stringMethod");
        // Integer ไม่ assignable กับ String -> isValidReturnType() ควรเป็น false
        validator.validate(new Returns(123), invocation);
    }

    @Test
    public void shouldPassWhenReturnTypeIsValid() throws Exception {
        Invocation invocation = invocationFor("stringMethod");
        // returnsNull()==false, isValidReturnType(String.class)==true -> ไม่ throw
        validator.validate(new Returns("hello"), invocation);
    }

    // ---------------- DoesNothing branches ----------------

    @Test(expected = MockitoException.class)
    public void shouldFailWhenDoesNothingUsedOnNonVoidMethod() throws Exception {
        Invocation invocation = invocationFor("stringMethod");
        // branch: !invocation.isVoid() == true
        validator.validate(DoesNothing.doesNothing(), invocation);
    }

    @Test
    public void shouldPassWhenDoesNothingUsedOnVoidMethod() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        // branch: !invocation.isVoid() == false -> ไม่ throw
        validator.validate(DoesNothing.doesNothing(), invocation);
    }

    // ---------------- dispatch / edge cases ----------------

    @Test
    public void shouldDoNothingWhenAnswerIsNotRecognizedType() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        Answer<Object> customAnswer = new Answer<Object>() {
            public Object answer(org.mockito.invocation.InvocationOnMock inv) throws Throwable {
                return null;
            }
        };
        // ไม่ตรงกับ ThrowsException/Returns/DoesNothing เลย -> ทุก if เป็น false, ไม่ throw
        validator.validate(customAnswer, invocation);
    }

    @Test
    public void shouldDoNothingWhenAnswerIsNull() throws Exception {
        Invocation invocation = invocationFor("voidMethod");
        // answer == null -> instanceof ทั้งหมดเป็น false -> ไม่ NPE, ไม่ throw
        validator.validate(null, invocation);
    }
}
```

## สรุป Branch/Condition coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `shouldFailWhenThrowableIsNull` | `validateException`: `throwable == null` → true |
| `shouldPassWhenThrowableIsRuntimeException` | `validateException`: `throwable instanceof RuntimeException` → true (early return) |
| `shouldPassWhenThrowableIsError` | `validateException`: `throwable instanceof Error` → true (early return) |
| `shouldPassWhenCheckedExceptionIsDeclaredByMethod` | `validateException`: ผ่าน early-return, `!isValidException()` → false |
| `shouldFailWhenCheckedExceptionIsNotDeclaredByMethod` | `validateException`: `!isValidException()` → true |
| `shouldFailWhenStubbingVoidMethodWithReturnValue` | `validateReturnValue`: `invocation.isVoid()` → true |
| `shouldFailWhenReturningNullForPrimitiveReturnType` | `validateReturnValue`: `isVoid()`→false; `returnsNull() && returnsPrimitive()` → true |
| `shouldPassWhenReturningNullForObjectReturnType` | `validateReturnValue`: `returnsNull()`→true, `returnsPrimitive()`→false; branch 3 ข้ามเพราะ `!returnsNull()`→false |
| `shouldFailWhenReturnTypeIsInvalid` | `validateReturnValue`: `!returnsNull() && !isValidReturnType()` → true |
| `shouldPassWhenReturnTypeIsValid` | `validateReturnValue`: ทุก if → false (กรณีปกติ/valid) |
| `shouldFailWhenDoesNothingUsedOnNonVoidMethod` | `validateDoNothing`: `!invocation.isVoid()` → true |
| `shouldPassWhenDoesNothingUsedOnVoidMethod` | `validateDoNothing`: `!invocation.isVoid()` → false |
| `shouldDoNothingWhenAnswerIsNotRecognizedType` | `validate`: ทุก `instanceof` → false (ไม่มี branch ใดถูกเรียก) |
| `shouldDoNothingWhenAnswerIsNull` | `validate`: ทดสอบ null-safety ของทุก `instanceof` check |

**ข้อควรระวัง**: เนื่องจากไม่มี source ของ `Invocation`, `Returns`, `ThrowsException`, `DoesNothing`, `Reporter` ให้มาโดยตรง การทดสอบนี้อ้างอิงพฤติกรรมมาตรฐานที่ `AnswersValidator` *ใช้งานอยู่แล้ว* ตาม source ที่ให้มาเท่านั้น (เช่น `isVoid()`, `returnsNull()`, `getThrowable()` ฯลฯ) หากพฤติกรรมจริงของ class เหล่านี้ต่างจากสมมติฐาน (เช่น constructor signature ของ `Invocation`) จำเป็นต้องปรับ helper method `invocationFor(...)` ให้ตรงกับ source จริงของโปรเจกต์
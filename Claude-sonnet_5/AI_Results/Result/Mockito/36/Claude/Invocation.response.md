# InvocationTest.java

```java
package org.mockito.internal.invocation;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.invocation.realmethod.RealMethod;

/**
 * Unit tests for {@link Invocation}.
 *
 * หมายเหตุสำคัญ:
 * - ใช้ {@code DelegatingMethod} (คลาสที่มีอยู่จริงในแพ็กเกจเดียวกันของซอร์สที่ทดสอบ
 *   เพราะ Invocation ใช้ MockitoMethod ซึ่งไม่ได้แสดงอินเทอร์เฟซแบบเต็มในซอร์สที่ให้มา)
 *   เพื่อสร้าง MockitoMethod จาก java.lang.reflect.Method จริง ๆ โดยไม่ต้องเดา
 *   รายละเอียดภายในของ DelegatingMethod เอง (ไม่ได้ทดสอบ behavior ของมันโดยตรง)
 * - ใช้ Mockito.mock(List.class) เป็นค่า "mock" เพื่อให้ MockUtil().getMockName(mock)
 *   (ที่ใช้ภายใน toString()) ทำงานได้โดยไม่ throw exception เนื่องจากต้องการ mock จริง
 * - ส่วนของ toString()/รูปแบบผลลัพธ์ที่แน่นอน (MatchersPrinter/PrintSettings) ไม่ได้อยู่ใน
 *   ซอร์สที่ให้มา จึงทดสอบแบบ smoke test / coverage-only เพื่อกระตุ้น branch โดยไม่ assert
 *   เนื้อหารายละเอียดที่ไม่แน่ใจ
 */
public class InvocationTest {

    // ---------- Helper sample class with various method signatures ----------
    static class Sample {
        public void voidMethod() {}
        public int intMethod() { return 0; }
        public Object objectMethod() { return null; }
        public String stringMethod() { return null; }
        public void varArgsMethod(String... args) {}
        public void methodWithIOException() throws IOException {}
        public void methodWithTwoExceptions() throws IllegalArgumentException, IOException {}
        public void methodNoException() {}
        public void singleArgMethod(String a) {}
        public void multiArgMethod(String a, String b, String c) {}
    }

    // ---------- Stub RealMethod to control/observe callRealMethod() ----------
    static class StubRealMethod implements RealMethod {
        Object toReturn;
        Throwable toThrow;
        Object capturedMock;
        Object[] capturedArgs;
        boolean called;

        public Object invoke(Object target, Object[] arguments) throws Throwable {
            called = true;
            capturedMock = target;
            capturedArgs = arguments;
            if (toThrow != null) {
                throw toThrow;
            }
            return toReturn;
        }
    }

    private int seq;
    private Object mockTarget;
    private StubRealMethod realMethod;

    @Before
    public void setUp() {
        seq = 0;
        // real mock so that MockUtil().getMockName(mock) used in toString() works
        mockTarget = Mockito.mock(List.class);
        realMethod = new StubRealMethod();
    }

    private MockitoMethod method(String name, Class<?>... paramTypes) throws NoSuchMethodException {
        Method m = Sample.class.getMethod(name, paramTypes);
        return new DelegatingMethod(m);
    }

    private MockitoMethod objectToStringMethod() throws NoSuchMethodException {
        Method m = Object.class.getMethod("toString");
        return new DelegatingMethod(m);
    }

    private Invocation newInvocation(MockitoMethod method, Object[] args) {
        return new Invocation(mockTarget, method, args, seq++, realMethod);
    }

    private Invocation newInvocation(MockitoMethod method, Object[] args, RealMethod rm) {
        return new Invocation(mockTarget, method, args, seq++, rm);
    }

    // ================= Constructor / expandVarArgs =================

    @Test
    public void shouldReturnEmptyArrayWhenNonVarArgsAndArgsNull() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, null);
        assertArrayEquals(new Object[0], inv.getArguments());
        assertEquals(0, inv.getArgumentsCount());
        assertNull(inv.getRawArguments());
    }

    @Test
    public void shouldKeepArgsUnchangedWhenNonVarArgs() throws Exception {
        MockitoMethod m = method("voidMethod");
        Object[] args = {"a", "b"};
        Invocation inv = newInvocation(m, args);
        assertArrayEquals(args, inv.getArguments());
        assertSame(args, inv.getRawArguments());
        assertEquals(2, inv.getArgumentsCount());
    }

    @Test
    public void shouldKeepArgsUnchangedWhenVarArgsAndLastArgIsNonArrayNonNull() throws Exception {
        MockitoMethod m = method("varArgsMethod", String[].class);
        Object[] args = {"x", "y"}; // last element is not array and not null
        Invocation inv = newInvocation(m, args);
        assertArrayEquals(new Object[]{"x", "y"}, inv.getArguments());
    }

    @Test
    public void shouldWrapNullIntoSingleElementArrayWhenVarArgsLastArgNull() throws Exception {
        MockitoMethod m = method("varArgsMethod", String[].class);
        Object[] args = {"x", null};
        Invocation inv = newInvocation(m, args);
        assertArrayEquals(new Object[]{"x", null}, inv.getArguments());
    }

    @Test
    public void shouldExpandArrayVarArgIntoIndividualElements() throws Exception {
        MockitoMethod m = method("varArgsMethod", String[].class);
        Object[] args = {"x", new String[]{"y", "z"}};
        Invocation inv = newInvocation(m, args);
        assertArrayEquals(new Object[]{"x", "y", "z"}, inv.getArguments());
        assertSame(args, inv.getRawArguments());
        assertEquals(3, inv.getArgumentsCount());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenVarArgsAndArgsArrayIsNull() throws Exception {
        // Edge case: isVarArgs==true -> code accesses args[args.length - 1] without
        // a prior null check, so args==null throws NPE here.
        MockitoMethod m = method("varArgsMethod", String[].class);
        newInvocation(m, null);
    }

    // ================= equals =================

    @Test
    public void shouldNotBeEqualToNull() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.equals(null));
    }

    @Test
    public void shouldNotBeEqualToDifferentClass() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.equals("not an invocation"));
    }

    @Test
    public void shouldNotBeEqualWhenMockDiffers() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv1 = new Invocation(Mockito.mock(List.class), m, new Object[0], 1, realMethod);
        Invocation inv2 = new Invocation(Mockito.mock(List.class), m, new Object[0], 2, realMethod);
        assertFalse(inv1.equals(inv2));
    }

    @Test
    public void shouldNotBeEqualWhenMethodDiffers() throws Exception {
        MockitoMethod m1 = method("voidMethod");
        MockitoMethod m2 = method("intMethod");
        Invocation inv1 = newInvocation(m1, new Object[0]);
        Invocation inv2 = newInvocation(m2, new Object[0]);
        assertFalse(inv1.equals(inv2));
    }

    @Test
    public void shouldNotBeEqualWhenArgumentsDiffer() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv1 = newInvocation(m, new Object[]{"a"});
        Invocation inv2 = newInvocation(m, new Object[]{"b"});
        assertFalse(inv1.equals(inv2));
    }

    @Test
    public void shouldBeEqualWhenMockMethodAndArgumentsAreSame() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv1 = new Invocation(mockTarget, m, new Object[]{"a"}, 1, realMethod);
        Invocation inv2 = new Invocation(mockTarget, m, new Object[]{"a"}, 2, realMethod);
        assertTrue(inv1.equals(inv2));
    }

    // ================= hashCode =================

    @Test(expected = RuntimeException.class)
    public void hashCodeShouldThrowRuntimeException() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        inv.hashCode();
    }

    // ================= verification flags =================

    @Test
    public void shouldTrackVerificationFlags() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);

        assertFalse(inv.isVerified());
        assertFalse(inv.isVerifiedInOrder());

        inv.markVerified();
        assertTrue(inv.isVerified());
        assertFalse(inv.isVerifiedInOrder());

        inv.markVerifiedInOrder();
        assertTrue(inv.isVerified());
        assertTrue(inv.isVerifiedInOrder());
    }

    // ================= isValidException =================

    @Test
    public void shouldBeValidExceptionWhenExactTypeDeclared() throws Exception {
        MockitoMethod m = method("methodWithIOException");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.isValidException(new IOException()));
    }

    @Test
    public void shouldBeValidExceptionWhenSubclassOfDeclaredType() throws Exception {
        MockitoMethod m = method("methodWithIOException");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.isValidException(new FileNotFoundException()));
    }

    @Test
    public void shouldNotBeValidExceptionWhenNotAssignable() throws Exception {
        MockitoMethod m = method("methodWithIOException");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.isValidException(new RuntimeException()));
    }

    @Test
    public void shouldNotBeValidExceptionWhenNoExceptionsDeclared() throws Exception {
        MockitoMethod m = method("methodNoException");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.isValidException(new RuntimeException()));
    }

    @Test
    public void shouldBeValidExceptionWhenMatchFoundAfterFirstMismatch() throws Exception {
        // exercises the for-loop continuing past a non-matching exception type
        MockitoMethod m = method("methodWithTwoExceptions");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.isValidException(new IOException()));
    }

    // ================= isValidReturnType =================

    @Test
    public void shouldBeValidReturnTypeForMatchingPrimitive() throws Exception {
        MockitoMethod m = method("intMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.isValidReturnType(Integer.class));
    }

    @Test
    public void shouldNotBeValidReturnTypeForMismatchingPrimitive() throws Exception {
        MockitoMethod m = method("intMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.isValidReturnType(String.class));
    }

    @Test
    public void shouldBeValidReturnTypeForAssignableNonPrimitive() throws Exception {
        MockitoMethod m = method("objectMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.isValidReturnType(String.class));
    }

    @Test
    public void shouldNotBeValidReturnTypeForNonAssignableNonPrimitive() throws Exception {
        MockitoMethod m = method("stringMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.isValidReturnType(Object.class));
    }

    // ================= isVoid =================

    @Test
    public void shouldBeVoidWhenReturnTypeIsVoid() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.isVoid());
    }

    @Test
    public void shouldNotBeVoidWhenReturnTypeIsNotVoid() throws Exception {
        MockitoMethod m = method("intMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.isVoid());
    }

    // ================= returnsPrimitive / printMethodReturnType / getMethodName ====

    @Test
    public void shouldReturnPrimitiveTrueForPrimitiveType() throws Exception {
        MockitoMethod m = method("intMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(inv.returnsPrimitive());
        assertEquals("int", inv.printMethodReturnType());
        assertEquals("intMethod", inv.getMethodName());
    }

    @Test
    public void shouldReturnPrimitiveFalseForNonPrimitiveType() throws Exception {
        MockitoMethod m = method("objectMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(inv.returnsPrimitive());
        assertEquals("Object", inv.printMethodReturnType());
        assertEquals("objectMethod", inv.getMethodName());
    }

    // ================= getMock / getMethod / getSequenceNumber =================

    @Test
    public void shouldExposeMockMethodAndSequenceNumber() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = new Invocation(mockTarget, m, new Object[0], 42, realMethod);
        assertSame(mockTarget, inv.getMock());
        assertSame(m, inv.getMethod());
        assertEquals(Integer.valueOf(42), inv.getSequenceNumber());
    }

    // ================= getLocation =================

    @Test
    public void shouldHaveNonNullLocation() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertNotNull(inv.getLocation());
        assertTrue(inv.getLocation() instanceof Location);
    }

    // ================= callRealMethod =================

    @Test
    public void shouldDelegateToRealMethodAndReturnItsValue() throws Exception {
        MockitoMethod m = method("objectMethod");
        Object[] args = {"raw"};
        StubRealMethod stub = new StubRealMethod();
        stub.toReturn = "result";
        Invocation inv = newInvocation(m, args, stub);

        Object result = inv.callRealMethod();

        assertEquals("result", result);
        assertTrue(stub.called);
        assertSame(mockTarget, stub.capturedMock);
        assertSame(args, stub.capturedArgs);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldPropagateExceptionFromRealMethod() throws Throwable {
        MockitoMethod m = method("objectMethod");
        StubRealMethod stub = new StubRealMethod();
        stub.toThrow = new IllegalStateException("boom");
        Invocation inv = newInvocation(m, new Object[0], stub);

        inv.callRealMethod();
    }

    // ================= isToString (static) =================

    @Test
    public void shouldRecognizeToStringMethod() throws Exception {
        MockitoMethod m = objectToStringMethod();
        Invocation inv = newInvocation(m, new Object[0]);
        assertTrue(Invocation.isToString(inv));
    }

    @Test
    public void shouldNotRecognizeNonToStringMethodAsToString() throws Exception {
        MockitoMethod m = method("intMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        assertFalse(Invocation.isToString(inv));
    }

    // ================= toString (smoke / branch-trigger only) =================
    // หมายเหตุ: รูปแบบผลลัพธ์ที่แน่นอน (inline vs block) ขึ้นกับ MatchersPrinter/
    // PrintSettings ที่ไม่ได้อยู่ในซอร์สที่ให้มา จึงทดสอบเพียงเพื่อกระตุ้น branch
    // (matchers ว่าง/ไม่ว่าง, length <=/> MAX_LINE_LENGTH) โดยไม่ assert เนื้อหารูปแบบ

    @Test
    public void toStringShouldWorkWithNoArguments() throws Exception {
        // matchers.isEmpty() == true -> else branch (inline) forced regardless of length
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        String s = inv.toString();
        assertNotNull(s);
        assertTrue(s.contains("voidMethod"));
    }

    @Test
    public void toStringShouldWorkWithShortArgument() throws Exception {
        // matchers nonempty but short -> length <= MAX_LINE_LENGTH -> inline branch
        MockitoMethod m = method("singleArgMethod", String.class);
        Invocation inv = newInvocation(m, new Object[]{"x"});
        String s = inv.toString();
        assertNotNull(s);
        assertTrue(s.contains("singleArgMethod"));
    }

    @Test
    public void toStringShouldWorkWithLongArguments() throws Exception {
        // matchers nonempty and long -> attempts to trigger length > MAX_LINE_LENGTH branch
        MockitoMethod m = method("multiArgMethod", String.class, String.class, String.class);
        Object[] args = {
                "aVeryLongArgumentValueNumberOne",
                "aVeryLongArgumentValueNumberTwo",
                "aVeryLongArgumentValueNumberThree"
        };
        Invocation inv = newInvocation(m, args);
        String s = inv.toString();
        assertNotNull(s);
        assertTrue(s.contains("multiArgMethod"));
    }

    @Test
    public void toStringWithPrintSettingsOverloadShouldWork() throws Exception {
        MockitoMethod m = method("voidMethod");
        Invocation inv = newInvocation(m, new Object[0]);
        String s = inv.toString(new org.mockito.internal.reporting.PrintSettings());
        assertNotNull(s);
        assertTrue(s.contains("voidMethod"));
    }
}
```

## สรุปตาราง Test Coverage

| กลุ่ม | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| expandVarArgs | shouldReturnEmptyArrayWhenNonVarArgsAndArgsNull | `!isVarArgs` true (short-circuit), `args==null` → empty array |
| expandVarArgs | shouldKeepArgsUnchangedWhenNonVarArgs | `!isVarArgs` true, `args!=null` → return args ตรง |
| expandVarArgs | shouldKeepArgsUnchangedWhenVarArgsAndLastArgIsNonArrayNonNull | `isVarArgs=true`, last arg not null & not array → true branch |
| expandVarArgs | shouldWrapNullIntoSingleElementArrayWhenVarArgsLastArgNull | `isVarArgs=true`, last arg == null → `varArgs = {null}` |
| expandVarArgs | shouldExpandArrayVarArgIntoIndividualElements | `isVarArgs=true`, last arg is array → `ArrayEquals.createObjectArray` path |
| expandVarArgs | shouldThrowNPEWhenVarArgsAndArgsArrayIsNull | edge case: `isVarArgs=true` + `args==null` → NPE (ไม่มี null-check) |
| equals | shouldNotBeEqualToNull | `o == null` → false |
| equals | shouldNotBeEqualToDifferentClass | `!o.getClass().equals(this.getClass())` → false |
| equals | shouldNotBeEqualWhenMockDiffers | `mock.equals` false |
| equals | shouldNotBeEqualWhenMethodDiffers | `method.equals` false |
| equals | shouldNotBeEqualWhenArgumentsDiffer | `equalArguments` false |
| equals | shouldBeEqualWhenMockMethodAndArgumentsAreSame | ทุกเงื่อนไข true |
| hashCode | hashCodeShouldThrowRuntimeException | throw RuntimeException เสมอ |
| verification flags | shouldTrackVerificationFlags | `markVerified()`, `markVerifiedInOrder()` ทุกสถานะ |
| isValidException | shouldBeValidExceptionWhenExactTypeDeclared | loop match ตัวแรก |
| isValidException | shouldBeValidExceptionWhenSubclassOfDeclaredType | `isAssignableFrom` subclass true |
| isValidException | shouldNotBeValidExceptionWhenNotAssignable | ไม่ match → false |
| isValidException | shouldNotBeValidExceptionWhenNoExceptionsDeclared | loop ไม่ execute (array ว่าง) |
| isValidException | shouldBeValidExceptionWhenMatchFoundAfterFirstMismatch | loop วนต่อหลัง mismatch ตัวแรก |
| isValidReturnType | shouldBeValidReturnTypeForMatchingPrimitive | primitive branch: match |
| isValidReturnType | shouldNotBeValidReturnTypeForMismatchingPrimitive | primitive branch: mismatch |
| isValidReturnType | shouldBeValidReturnTypeForAssignableNonPrimitive | non-primitive branch: assignable |
| isValidReturnType | shouldNotBeValidReturnTypeForNonAssignableNonPrimitive | non-primitive branch: ไม่ assignable |
| isVoid | shouldBeVoidWhenReturnTypeIsVoid / shouldNotBeVoidWhenReturnTypeIsNotVoid | true/false ทั้งสองสาขา |
| misc getters | shouldReturnPrimitiveTrue/FalseForXxxType | `returnsPrimitive`, `printMethodReturnType`, `getMethodName` |
| misc getters | shouldExposeMockMethodAndSequenceNumber | `getMock`, `getMethod`, `getSequenceNumber` |
| misc getters | shouldHaveNonNullLocation | `getLocation()` ไม่ null |
| callRealMethod | shouldDelegateToRealMethodAndReturnItsValue | ส่ง mock/rawArguments ถูกต้อง, คืนค่า |
| callRealMethod | shouldPropagateExceptionFromRealMethod | exception propagate ผ่าน `throws Throwable` |
| isToString | shouldRecognizeToStringMethod / shouldNotRecognizeNonToStringMethodAsToString | true/false ทั้งสองกรณี |
| toString | toStringShouldWorkWithNoArguments | matchers ว่าง → else (inline) branch |
| toString | toStringShouldWorkWithShortArgument | matchers ไม่ว่าง, length สั้น → inline |
| toString | toStringShouldWorkWithLongArguments | matchers ไม่ว่าง, length ยาว → พยายามกระตุ้น block branch |
| toString | toStringWithPrintSettingsOverloadShouldWork | overload `toString(PrintSettings)` |

**ข้อควรระวัง/ข้อจำกัด:** การทดสอบ `toString()` บางส่วนเป็น *smoke test* เนื่องจาก `MatchersPrinter`, `PrintSettings`, `MockUtil` ไม่ได้อยู่ในซอร์สที่ให้มา จึงไม่ assert เนื้อหารูปแบบผลลัพธ์แบบละเอียด — ทดสอบเพียงเพื่อกระตุ้น branch ตามเงื่อนไขที่ปรากฏจริงใน `Invocation.toString(List, PrintSettings)` เท่านั้น
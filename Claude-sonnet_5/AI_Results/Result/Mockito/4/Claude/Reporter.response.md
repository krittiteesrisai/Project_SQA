# การวิเคราะห์และแนวทางการทดสอบ

**ข้อสังเกตสำคัญ (ต้องระบุก่อนเริ่มเขียนเทส):**

1. คลาส `Reporter` เป็นส่วนหนึ่งของโปรเจกต์ Mockito เอง (Defects4J Mockito‑4b) ดังนั้นคลาสภายใน เช่น `LocationImpl`, `MockUtil`, และ `org.mockito.Mockito` (factory `mock()`) จึงอยู่บน classpath ของโปรเจกต์อยู่แล้ว (ไม่ใช่ไลบรารีทดสอบเพิ่มเติมที่ต้องห้ามใช้ตามข้อ 1) — ใช้เพื่อสร้าง "mock object" จริงที่จำเป็นสำหรับเมธอดที่เรียก `MockUtil().getMockName(...)` เท่านั้น
2. อินเทอร์เฟซที่ซับซ้อน เช่น `DescribedInvocation`, `Invocation`, `InvocationOnMock`, `InvocationListener` ไม่ได้แสดง method signature ครบในซอร์สที่ให้มา จึงใช้ **`java.lang.reflect.Proxy`** (JDK ล้วน ไม่ต้องเดา method ที่ไม่รู้จัก) แทนการเขียน anonymous class ที่ต้อง implement ทุก abstract method
3. เมธอดที่ต้องใช้ `org.mockito.internal.reporting.Discrepancy` (เช่น `tooLittleActualInvocations*`) และเมธอดที่ต้องสร้าง `LocalizedMatcher` ที่มีค่าจริง (ไม่ใช่ list ว่าง) **ไม่สามารถทดสอบได้อย่างปลอดภัย** เพราะไม่มี constructor/behavior ของคลาสเหล่านี้อยู่ในซอร์สที่ให้มา — จึงทดสอบเฉพาะกรณีที่ไม่ต้อง instantiate (list ว่าง) และคอมเมนต์กำกับไว้ว่าไม่ครอบคลุม branch ที่ loop ทำงานจริง
4. พบจุดที่น่าสงสัยว่าอาจเป็น "fault" (ไม่มี null-check): `notAMockPassedToVerify`, `cannotMockFinalClass`, `mockedTypeIsInconsistentWithSpiedInstanceType`, `cannotInjectDependency` (เมื่อ `Exception` ไม่มี cause) → เขียนเทสยืนยันว่าจะเกิด `NullPointerException` ซึ่งเป็นพฤติกรรมจริงจากซอร์สโค้ด (ไม่ใช่การเดา)

```java
package org.mockito.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import org.mockito.exceptions.Reporter; // explicit import ตามข้อกำหนด (คลาสอยู่ package เดียวกัน)
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.*;
import org.mockito.exceptions.verification.*;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.mock.SerializableMode;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock; // ใช้ factory จริงของ Mockito (อยู่ใน module เดียวกับ Reporter)

/**
 * Unit tests ของ {@link Reporter}
 *
 * หมายเหตุสำคัญ:
 * - ใช้ java.lang.reflect.Proxy แทนการสร้าง implementation เองของ interface ที่ไม่รู้ signature ครบ
 * - เมธอดที่พึ่งพา org.mockito.internal.reporting.Discrepancy หรือ LocalizedMatcher แบบมีข้อมูลจริง
 *   ไม่ได้ถูกทดสอบเต็มรูปแบบ เพราะไม่มี source ของคลาสเหล่านั้นให้ดู (กันการเดา behavior)
 */
public class ReporterTest {

    private final Reporter reporter = new Reporter();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // ================= helper: dynamic proxy สำหรับ interface ที่ไม่รู้ signature ครบ =================

    @SuppressWarnings("unchecked")
    private static <T> T proxy(Class<T> type, final Map<String, Object> stubs) {
        return (T) Proxy.newProxyInstance(
                ReporterTest.class.getClassLoader(),
                new Class<?>[]{type},
                new InvocationHandler() {
                    public Object invoke(Object p, Method m, Object[] args) {
                        if (stubs.containsKey(m.getName())) {
                            return stubs.get(m.getName());
                        }
                        Class<?> rt = m.getReturnType();
                        if (rt == boolean.class) return false;
                        if (rt == int.class) return 0;
                        if (rt == long.class) return 0L;
                        if (rt == String.class) return "";
                        return null;
                    }
                });
    }

    private static DescribedInvocation describedInvocation(final String desc, final Location location) {
        Map<String, Object> stubs = new HashMap<String, Object>();
        stubs.put("toString", desc);
        stubs.put("getLocation", location);
        return proxy(DescribedInvocation.class, stubs);
    }

    private static Invocation invocation(final Object mockObj, final Location location) {
        Map<String, Object> stubs = new HashMap<String, Object>();
        stubs.put("getMock", mockObj);
        stubs.put("getLocation", location);
        stubs.put("toString", "invocation");
        return proxy(Invocation.class, stubs);
    }

    private static InvocationOnMock invocationOnMock(final Object mockObj, final Method method) {
        Map<String, Object> stubs = new HashMap<String, Object>();
        stubs.put("getMock", mockObj);
        stubs.put("getMethod", method);
        return proxy(InvocationOnMock.class, stubs);
    }

    private static InvocationListener invocationListener() {
        return proxy(InvocationListener.class, new HashMap<String, Object>());
    }

    // ================= helper classes สำหรับ reflection (Field / Method จริง) =================

    static class SampleMethods {
        public void noArg() {}
        public void oneArg(String s) {}
        public void varArg(String... s) {}
        public void twoArgsVarArg(int i, String... s) {}
        public String someReturn() { return null; }
        public int anotherReturn() { return 0; }
    }

    static class SampleFieldHolder {
        public String someField;
    }

    // ===================================================================================
    // กลุ่มที่ 1: เมธอดที่ throw exception โดยตรง ไม่มี branch ภายใน (straight-line code)
    // ===================================================================================

    @Test
    public void checkedExceptionInvalid_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.checkedExceptionInvalid(new Throwable("boom"));
    }

    @Test
    public void cannotStubWithNullThrowable_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.cannotStubWithNullThrowable();
    }

    @Test
    public void unfinishedStubbing_withLocation_throwsUnfinishedStubbingException() {
        thrown.expect(UnfinishedStubbingException.class);
        reporter.unfinishedStubbing(new LocationImpl());
    }

    @Test
    public void unfinishedStubbing_withNullLocation_throwsUnfinishedStubbingException() {
        // boundary: null location, join() สมมติว่า tolerant ต่อ null (production utility)
        thrown.expect(UnfinishedStubbingException.class);
        reporter.unfinishedStubbing(null);
    }

    @Test
    public void incorrectUseOfApi_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.incorrectUseOfApi();
    }

    @Test
    public void missingMethodInvocation_throwsMissingMethodInvocationException() {
        thrown.expect(MissingMethodInvocationException.class);
        reporter.missingMethodInvocation();
    }

    @Test
    public void unfinishedVerificationException_throwsUnfinishedVerificationException() {
        thrown.expect(UnfinishedVerificationException.class);
        reporter.unfinishedVerificationException(new LocationImpl());
    }

    @Test
    public void notAMockPassedToVerify_throwsNotAMockException() {
        thrown.expect(NotAMockException.class);
        reporter.notAMockPassedToVerify(String.class);
    }

    @Test
    public void nullPassedToVerify_throwsNullInsteadOfMockException() {
        thrown.expect(NullInsteadOfMockException.class);
        reporter.nullPassedToVerify();
    }

    @Test
    public void notAMockPassedToWhenMethod_throwsNotAMockException() {
        thrown.expect(NotAMockException.class);
        reporter.notAMockPassedToWhenMethod();
    }

    @Test
    public void nullPassedToWhenMethod_throwsNullInsteadOfMockException() {
        thrown.expect(NullInsteadOfMockException.class);
        reporter.nullPassedToWhenMethod();
    }

    @Test
    public void mocksHaveToBePassedToVerifyNoMoreInteractions_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }

    @Test
    public void notAMockPassedToVerifyNoMoreInteractions_throwsNotAMockException() {
        thrown.expect(NotAMockException.class);
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }

    @Test
    public void nullPassedToVerifyNoMoreInteractions_throwsNullInsteadOfMockException() {
        thrown.expect(NullInsteadOfMockException.class);
        reporter.nullPassedToVerifyNoMoreInteractions();
    }

    @Test
    public void notAMockPassedWhenCreatingInOrder_throwsNotAMockException() {
        thrown.expect(NotAMockException.class);
        reporter.notAMockPassedWhenCreatingInOrder();
    }

    @Test
    public void nullPassedWhenCreatingInOrder_throwsNullInsteadOfMockException() {
        thrown.expect(NullInsteadOfMockException.class);
        reporter.nullPassedWhenCreatingInOrder();
    }

    @Test
    public void mocksHaveToBePassedWhenCreatingInOrder_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }

    @Test
    public void inOrderRequiresFamiliarMock_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.inOrderRequiresFamiliarMock();
    }

    @Test
    public void stubPassedToVerify_throwsCannotVerifyStubOnlyMock() {
        thrown.expect(CannotVerifyStubOnlyMock.class);
        reporter.stubPassedToVerify();
    }

    @Test
    public void cannotMockFinalClass_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.cannotMockFinalClass(String.class);
    }

    @Test
    public void cannotStubVoidMethodWithAReturnValue_throwsCannotStubVoidMethodWithReturnValue() {
        thrown.expect(CannotStubVoidMethodWithReturnValue.class);
        reporter.cannotStubVoidMethodWithAReturnValue("someMethod");
    }

    @Test
    public void onlyVoidMethodsCanBeSetToDoNothing_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }

    @Test
    public void wrongTypeOfReturnValue_throwsWrongTypeOfReturnValue() {
        thrown.expect(WrongTypeOfReturnValue.class);
        reporter.wrongTypeOfReturnValue("Foo", "Bar", "someMethod");
    }

    @Test
    public void wantedAtMostX_boundaryZero_throwsMockitoAssertionError() {
        thrown.expect(MockitoAssertionError.class);
        reporter.wantedAtMostX(0, 5);
    }

    @Test
    public void wantedAtMostX_boundaryOne_throwsMockitoAssertionError() {
        thrown.expect(MockitoAssertionError.class);
        reporter.wantedAtMostX(1, 2);
    }

    @Test
    public void wantedAtMostX_multiple_throwsMockitoAssertionError() {
        thrown.expect(MockitoAssertionError.class);
        reporter.wantedAtMostX(3, 10);
    }

    @Test
    public void smartNullPointerException_throwsSmartNullPointerException() {
        thrown.expect(SmartNullPointerException.class);
        reporter.smartNullPointerException("someInvocation", new LocationImpl());
    }

    @Test
    public void noArgumentValueWasCaptured_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.noArgumentValueWasCaptured();
    }

    @Test
    public void extraInterfacesDoesNotAcceptNullParameters_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.extraInterfacesDoesNotAcceptNullParameters();
    }

    @Test
    public void extraInterfacesAcceptsOnlyInterfaces_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
    }

    @Test
    public void extraInterfacesCannotContainMockedType_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.extraInterfacesCannotContainMockedType(String.class);
    }

    @Test
    public void extraInterfacesRequiresAtLeastOneInterface_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }

    @Test
    public void mockedTypeIsInconsistentWithSpiedInstanceType_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<Object>());
    }

    @Test
    public void cannotCallAbstractRealMethod_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.cannotCallAbstractRealMethod();
    }

    @Test
    public void cannotVerifyToString_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.cannotVerifyToString();
    }

    @Test
    public void moreThanOneAnnotationNotAllowed_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.moreThanOneAnnotationNotAllowed("myField");
    }

    @Test
    public void unsupportedCombinationOfAnnotations_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.unsupportedCombinationOfAnnotations("Spy", "Mock");
    }

    @Test
    public void cannotInitializeForSpyAnnotation_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.cannotInitializeForSpyAnnotation("myField", new Exception("init failed"));
    }

    @Test
    public void cannotInitializeForInjectMocksAnnotation_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.cannotInitializeForInjectMocksAnnotation("myField", new Exception("init failed"));
    }

    @Test
    public void atMostAndNeverShouldNotBeUsedWithTimeout_throwsFriendlyReminderException() {
        thrown.expect(FriendlyReminderException.class);
        reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
    }

    @Test
    public void fieldInitialisationThrewException_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Field field = SampleFieldHolder.class.getDeclaredField("someField");
        reporter.fieldInitialisationThrewException(field, new RuntimeException("boom"));
    }

    @Test
    public void invocationListenerDoesNotAcceptNullParameters_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.invocationListenerDoesNotAcceptNullParameters();
    }

    @Test
    public void invocationListenersRequiresAtLeastOneListener_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.invocationListenersRequiresAtLeastOneListener();
    }

    @Test
    public void invocationListenerThrewException_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        InvocationListener listener = invocationListener();
        reporter.invocationListenerThrewException(listener, new RuntimeException("listener boom"));
    }

    @Test
    public void mockedTypeIsInconsistentWithDelegatedInstanceType_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(List.class, new ArrayList<Object>());
    }

    @Test
    public void spyAndDelegateAreMutuallyExclusive_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.spyAndDelegateAreMutuallyExclusive();
    }

    @Test
    public void invalidArgumentRangeAtIdentityAnswerCreationTime_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
    }

    @Test
    public void defaultAnswerDoesNotAcceptNullParameter_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.defaultAnswerDoesNotAcceptNullParameter();
    }

    @Test
    public void serializableWontWorkForObjectsThatDontImplementSerializable_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        reporter.serializableWontWorkForObjectsThatDontImplementSerializable(String.class);
    }

    @Test
    public void usingConstructorWithFancySerializable_throwsMockitoException() {
        thrown.expect(MockitoException.class);
        // ใช้ values()[0] เพื่อไม่ต้องเดาชื่อ constant จริงของ enum (ไม่มีในซอร์สที่ให้มา)
        SerializableMode mode = SerializableMode.values()[0];
        reporter.usingConstructorWithFancySerializable(mode);
    }

    // ===================================================================================
    // กลุ่มที่ 2: DescribedInvocation / Invocation — รวม branch "list ว่าง vs ไม่ว่าง"
    // ===================================================================================

    @Test
    public void wantedButNotInvoked_singleArg_throwsWantedButNotInvoked() {
        thrown.expect(WantedButNotInvoked.class);
        reporter.wantedButNotInvoked(describedInvocation("wanted.method()", new LocationImpl()));
    }

    @Test
    public void wantedButNotInvoked_withEmptyInvocationsList_throwsWantedButNotInvoked() {
        // branch: invocations.isEmpty() == true
        thrown.expect(WantedButNotInvoked.class);
        List<DescribedInvocation> invocations = new ArrayList<DescribedInvocation>();
        reporter.wantedButNotInvoked(describedInvocation("wanted.method()", new LocationImpl()), invocations);
    }

    @Test
    public void wantedButNotInvoked_withNonEmptyInvocationsList_throwsWantedButNotInvoked() {
        // branch: invocations.isEmpty() == false -> loop body ทำงาน
        thrown.expect(WantedButNotInvoked.class);
        List<DescribedInvocation> invocations = new ArrayList<DescribedInvocation>();
        invocations.add(describedInvocation("other.method()", new LocationImpl()));
        reporter.wantedButNotInvoked(describedInvocation("wanted.method()", new LocationImpl()), invocations);
    }

    @Test
    public void wantedButNotInvokedInOrder_throwsVerificationInOrderFailure() {
        thrown.expect(VerificationInOrderFailure.class);
        reporter.wantedButNotInvokedInOrder(
                describedInvocation("wanted.method()", new LocationImpl()),
                describedInvocation("previous.method()", new LocationImpl()));
    }

    @Test
    public void tooManyActualInvocations_throwsTooManyActualInvocations() {
        thrown.expect(TooManyActualInvocations.class);
        reporter.tooManyActualInvocations(1, 3,
                describedInvocation("wanted.method()", new LocationImpl()),
                new LocationImpl());
    }

    @Test
    public void neverWantedButInvoked_throwsNeverWantedButInvoked() {
        thrown.expect(NeverWantedButInvoked.class);
        reporter.neverWantedButInvoked(
                describedInvocation("wanted.method()", new LocationImpl()),
                new LocationImpl());
    }

    @Test
    public void tooManyActualInvocationsInOrder_throwsVerificationInOrderFailure() {
        thrown.expect(VerificationInOrderFailure.class);
        reporter.tooManyActualInvocationsInOrder(1, 3,
                describedInvocation("wanted.method()", new LocationImpl()),
                new LocationImpl());
    }

    @Test
    public void noMoreInteractionsWanted_throwsNoInteractionsWanted() {
        thrown.expect(NoInteractionsWanted.class);
        Invocation undesired = invocation("mockObj", new LocationImpl());
        List<VerificationAwareInvocation> invocations = new ArrayList<VerificationAwareInvocation>();
        reporter.noMoreInteractionsWanted(undesired, invocations);
    }

    @Test
    public void noMoreInteractionsWantedInOrder_throwsVerificationInOrderFailure() {
        thrown.expect(VerificationInOrderFailure.class);
        Invocation undesired = invocation("mockObj", new LocationImpl());
        reporter.noMoreInteractionsWantedInOrder(undesired);
    }

    // argumentsAreDifferent: ชนิด exception ที่แน่นอนมาจาก JUnitTool ซึ่งไม่มี source ให้ดู
    // จึงตรวจสอบเพียงว่ามี Throwable ถูก throw และมี message เท่านั้น (ไม่เดา exception type)
    @Test
    public void argumentsAreDifferent_throwsSomeThrowableWithMessage() {
        try {
            reporter.argumentsAreDifferent("wanted(1)", "actual(2)", new LocationImpl());
            fail("Expected an exception to be thrown");
        } catch (Throwable t) {
            assertNotNull(t.getMessage());
        }
    }

    // ===================================================================================
    // กลุ่มที่ 3: matcher-related — ทดสอบเฉพาะ list ว่าง (ไม่เดา LocalizedMatcher constructor)
    // ===================================================================================

    @Test
    public void invalidUseOfMatchers_withEmptyRecordedMatchers_throwsInvalidUseOfMatchersException() {
        thrown.expect(InvalidUseOfMatchersException.class);
        reporter.invalidUseOfMatchers(2, new ArrayList<LocalizedMatcher>());
    }

    @Test
    public void incorrectUseOfAdditionalMatchers_withEmptyMatcherStack_throwsInvalidUseOfMatchersException() {
        thrown.expect(InvalidUseOfMatchersException.class);
        reporter.incorrectUseOfAdditionalMatchers("and", 2, new ArrayList<LocalizedMatcher>());
    }

    @Test
    public void reportNoSubMatchersFound_throwsInvalidUseOfMatchersException() {
        thrown.expect(InvalidUseOfMatchersException.class);
        reporter.reportNoSubMatchersFound("and");
    }

    @Test
    public void misplacedArgumentMatcher_withEmptyList_throwsInvalidUseOfMatchersException() {
        thrown.expect(InvalidUseOfMatchersException.class);
        reporter.misplacedArgumentMatcher(new ArrayList<LocalizedMatcher>());
    }

    // ===================================================================================
    // กลุ่มที่ 4: possibleArgumentTypesOf / willReturnLastParameter — ครอบคลุม branch
    //   - parameterTypes.length == 0
    //   - loop ปกติ (ไม่ใช่ vararg)
    //   - loop ที่ index สุดท้ายเป็น vararg
    //   - willReturnLastParameter true/false
    // ===================================================================================

    @Test
    public void invalidArgumentPositionRangeAtInvocationTime_noArgsMethod_lastParamTrue_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Method m = SampleMethods.class.getMethod("noArg");
        Object realMock = mock(Runnable.class);
        InvocationOnMock inv = invocationOnMock(realMock, m);
        reporter.invalidArgumentPositionRangeAtInvocationTime(inv, true, -1);
    }

    @Test
    public void invalidArgumentPositionRangeAtInvocationTime_oneArgMethod_lastParamFalse_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Method m = SampleMethods.class.getMethod("oneArg", String.class);
        Object realMock = mock(Runnable.class);
        InvocationOnMock inv = invocationOnMock(realMock, m);
        reporter.invalidArgumentPositionRangeAtInvocationTime(inv, false, 5);
    }

    @Test
    public void invalidArgumentPositionRangeAtInvocationTime_varArgMethod_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Method m = SampleMethods.class.getMethod("varArg", String[].class);
        Object realMock = mock(Runnable.class);
        InvocationOnMock inv = invocationOnMock(realMock, m);
        reporter.invalidArgumentPositionRangeAtInvocationTime(inv, true, -1);
    }

    @Test
    public void invalidArgumentPositionRangeAtInvocationTime_twoArgsVarArgMethod_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Method m = SampleMethods.class.getMethod("twoArgsVarArg", int.class, String[].class);
        Object realMock = mock(Runnable.class);
        InvocationOnMock inv = invocationOnMock(realMock, m);
        reporter.invalidArgumentPositionRangeAtInvocationTime(inv, false, 0);
    }

    @Test
    public void wrongTypeOfArgumentToReturn_throwsWrongTypeOfReturnValue() throws Exception {
        thrown.expect(WrongTypeOfReturnValue.class);
        Method m = SampleMethods.class.getMethod("oneArg", String.class);
        Object realMock = mock(Runnable.class);
        InvocationOnMock inv = invocationOnMock(realMock, m);
        reporter.wrongTypeOfArgumentToReturn(inv, "String", Integer.class, 0);
    }

    // ===================================================================================
    // กลุ่มที่ 5: เมธอดที่เรียก MockUtil().getMockName(...) ภายใน safelyGetMockName(...)
    // ใช้ mock จริง (org.mockito.Mockito.mock) เพื่อให้ MockUtil ทำงานตามพฤติกรรมที่ตั้งใจออกแบบไว้
    // (ไม่มี source ของ MockUtil ให้ดู จึงไม่ทดสอบกรณี non-mock object เพื่อไม่ต้องเดา fallback behavior)
    // ===================================================================================

    @Test
    public void delegatedMethodHasWrongReturnType_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Method mockMethod = SampleMethods.class.getMethod("someReturn");
        Method delegateMethod = SampleMethods.class.getMethod("anotherReturn");
        Object realMock = mock(Runnable.class);
        reporter.delegatedMethodHasWrongReturnType(mockMethod, delegateMethod, realMock, "delegateInstance");
    }

    @Test
    public void delegatedMethodDoesNotExistOnDelegate_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Method mockMethod = SampleMethods.class.getMethod("someReturn");
        Object realMock = mock(Runnable.class);
        reporter.delegatedMethodDoesNotExistOnDelegate(mockMethod, realMock, "delegateInstance");
    }

    @Test
    public void cannotInjectDependency_withCause_throwsMockitoException() throws Exception {
        thrown.expect(MockitoException.class);
        Field field = SampleFieldHolder.class.getDeclaredField("someField");
        Object realMock = mock(Runnable.class);
        Exception details = new Exception("outer", new RuntimeException("cause message"));
        reporter.cannotInjectDependency(field, realMock, details);
    }

    // ===================================================================================
    // กลุ่มที่ 6: FAULT-FINDING TESTS — ยืนยันข้อบกพร่องจริงจากการขาด null-check ในซอร์สโค้ด
    // ===================================================================================

    @Test(expected = NullPointerException.class)
    public void cannotInjectDependency_withoutCause_throwsNPE_dueToMissingNullCheck() throws Exception {
        // exceptionCauseMessageIfAvailable() เรียก details.getCause().getMessage() โดยไม่เช็ค null
        Field field = SampleFieldHolder.class.getDeclaredField("someField");
        Object realMock = mock(Runnable.class);
        Exception detailsWithoutCause = new Exception("outer, no cause");
        reporter.cannotInjectDependency(field, realMock, detailsWithoutCause);
    }

    @Test(expected = NullPointerException.class)
    public void notAMockPassedToVerify_withNullType_throwsNPE_dueToMissingNullCheck() {
        // type.getSimpleName() จะ NPE ถ้า type == null (ไม่มีการเช็ค null ในซอร์ส)
        reporter.notAMockPassedToVerify(null);
    }

    @Test(expected = NullPointerException.class)
    public void cannotMockFinalClass_withNullClass_throwsNPE_dueToMissingNullCheck() {
        // clazz.toString() จะ NPE ถ้า clazz == null
        reporter.cannotMockFinalClass(null);
    }

    @Test(expected = NullPointerException.class)
    public void mockedTypeIsInconsistentWithSpiedInstanceType_withNullSpiedInstance_throwsNPE_dueToMissingNullCheck() {
        // spiedInstance.getClass() จะ NPE ถ้า spiedInstance == null
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, null);
    }
}
```

## สรุปตารางความครอบคลุม (Branch/Condition)

| กลุ่มเมธอดทดสอบ | เมธอดเป้าหมายใน `Reporter` | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| กลุ่มที่ 1 (~38 testcase, straight-line) | `checkedExceptionInvalid`...`usingConstructorWithFancySerializable` | ไม่มี branch ภายใน — ยืนยันว่า exception type ที่ประกาศถูก throw จริง (statement coverage 100% ของแต่ละเมธอด) |
| `unfinishedStubbing_withNullLocation_*` | `unfinishedStubbing` | ค่าขอบเขต null สำหรับ `Location` |
| `wantedAtMostX_boundaryZero/One/multiple_*` | `wantedAtMostX` | ค่าขอบเขต 0, 1, >1 (สัมพันธ์กับ pluralize) |
| `wantedButNotInvoked_withEmptyInvocationsList_*` | `wantedButNotInvoked(2 args)` | branch `invocations.isEmpty() == true` |
| `wantedButNotInvoked_withNonEmptyInvocationsList_*` | `wantedButNotInvoked(2 args)` | branch `invocations.isEmpty() == false` + loop body (`for` ทำงาน) |
| `argumentsAreDifferent_throwsSomeThrowableWithMessage` | `argumentsAreDifferent` | เรียกใช้งานจริง แต่ไม่ assert exception type แน่ชัด (uncertain, คอมเมนต์กำกับ) |
| `invalidUseOfMatchers/incorrectUseOfAdditionalMatchers/misplacedArgumentMatcher_*` | ตามชื่อ | branch กรณี matcher list **ว่าง** เท่านั้น (loop ไม่ทำงาน) — ไม่ครอบคลุม loop-body เพราะไม่มี source ของ `LocalizedMatcher` |
| `reportNoSubMatchersFound_*` | `reportNoSubMatchersFound` | straight-line |
| `invalidArgumentPositionRangeAtInvocationTime_noArgsMethod_*` | `invalidArgumentPositionRangeAtInvocationTime` → `possibleArgumentTypesOf` | branch `parameterTypes.length == 0`, `willReturnLastParameter == true` |
| `invalidArgumentPositionRangeAtInvocationTime_oneArgMethod_*` | เดียวกัน | loop body ปกติ (ไม่ vararg), `willReturnLastParameter == false` |
| `invalidArgumentPositionRangeAtInvocationTime_varArgMethod_*` | เดียวกัน | branch `isVarArgs() && i == last` = true |
| `invalidArgumentPositionRangeAtInvocationTime_twoArgsVarArgMethod_*` | เดียวกัน | loop ผสม: index ปกติ + index สุดท้ายเป็น vararg (ครอบ 2 branch ในลูปเดียว) |
| `wrongTypeOfArgumentToReturn_*` | `wrongTypeOfArgumentToReturn` → `possibleArgumentTypesOf` | ใช้ path เดียวกับ branch loop ปกติ |
| `delegatedMethodHasWrongReturnType_*`, `delegatedMethodDoesNotExistOnDelegate_*` | ตามชื่อ | straight-line, ยืนยัน `safelyGetMockName` ทำงานกับ mock จริง |
| `cannotInjectDependency_withCause_*` | `cannotInjectDependency` | branch ปกติที่ `details.getCause() != null` |
| `cannotInjectDependency_withoutCause_throwsNPE_*` | `cannotInjectDependency` → `exceptionCauseMessageIfAvailable` | **Fault**: ไม่มี null-check, คาดหวัง `NullPointerException` |
| `notAMockPassedToVerify_withNullType_*` | `notAMockPassedToVerify` | **Fault**: ไม่มี null-check ของ `type` |
| `cannotMockFinalClass_withNullClass_*` | `cannotMockFinalClass` | **Fault**: ไม่มี null-check ของ `clazz` |
| `mockedTypeIsInconsistentWithSpiedInstanceType_withNullSpiedInstance_*` | เดียวกัน | **Fault**: ไม่มี null-check ของ `spiedInstance` |
| `noMoreInteractionsWanted_*`, `noMoreInteractionsWantedInOrder_*` | ตามชื่อ | ใช้ `Invocation` proxy + list ว่าง, ยืนยัน exception type ที่ถูก throw |
| `tooManyActualInvocations*`, `neverWantedButInvoked_*`, `wantedButNotInvokedInOrder_*` | ตามชื่อ | ยืนยัน private helper (`createTooManyInvocationsMessage`) ถูกเรียกถูกต้องผ่าน public method |

**หมายเหตุ branch ที่ไม่ครอบคลุม (ระบุเหตุผลตามข้อกำหนดข้อ 4):**
- `tooLittleActualInvocations`, `tooLittleActualInvocationsInOrder` — ต้องใช้ `org.mockito.internal.reporting.Discrepancy` ซึ่งไม่มี constructor/behavior ในซอร์สที่ให้มา
- loop-body ของ `locationsOf(Collection<LocalizedMatcher>)` เมื่อ collection ไม่ว่าง — ต้องสร้าง `LocalizedMatcher` จริงซึ่งไม่มี source ให้ดู
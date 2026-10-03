package org.mockito.internal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.answers.Returns;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.internal.verification.MockAwareVerificationMode;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationData;
import org.mockito.verification.VerificationMode;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MockHandlerTest {

    private MockHandler<SampleService> mockHandler;
    private MockSettingsImpl mockSettings;
    private MockingProgress mockingProgress;
    private SampleService mockInstance;
    private Method testMethod;

    public interface SampleService {
        String doSomething(String input);
        void doVoid(String input);
    }

    @Before
    public void setUp() throws Exception {
        mockSettings = new MockSettingsImpl();
        mockSettings.defaultAnswer(new Returns("default_value"));
        mockHandler = new MockHandler<SampleService>(mockSettings);
        mockingProgress = new ThreadSafeMockingProgress();
        mockingProgress.reset();
        mockInstance = new SampleService() {
            public String doSomething(String input) { return null; }
            public void doVoid(String input) {}
        };
        testMethod = SampleService.class.getMethod("doSomething", String.class);
    }

    @After
    public void tearDown() {
        mockingProgress.reset();
    }

    // --- Helper Method สร้าง Invocation จำลอง ---
    private Invocation createInvocation(Object mock, Method method, Object[] args) {
        final Method targetMethod = method;
        MockitoMethod mockitoMethod = new MockitoMethod() {
            public String getName() { return targetMethod.getName(); }
            public Class<?> getReturnType() { return targetMethod.getReturnType(); }
            public Class<?>[] getParameterTypes() { return targetMethod.getParameterTypes(); }
            public Class<?>[] getExceptionTypes() { return targetMethod.getExceptionTypes(); }
            public boolean isVarArgs() { return targetMethod.isVarArgs(); }
            public Method getJavaMethod() { return targetMethod; }
        };

        RealMethod realMethod = new RealMethod() {
            public Object invoke(Object target, Object[] arguments) {
                return null;
            }
        };

        return new Invocation(mock, mockitoMethod, args, 1, realMethod);
    }

    @Test
    public void testConstructors() {
        MockHandler<Object> defaultHandler = new MockHandler<Object>();
        assertNotNull(defaultHandler.getMockSettings());
        assertNotNull(defaultHandler.getInvocationContainer());

        MockHandler<SampleService> copyHandler = new MockHandler<SampleService>(mockHandler);
        assertSame(mockHandler.getMockSettings(), copyHandler.getMockSettings());
        assertNotNull(copyHandler.getInvocationContainer());
    }

    @Test
    public void testHandleWithAnswersForStubbing_Branch1() throws Throwable {
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Returns("stubbed_void"));
        mockHandler.setAnswersForStubbing(answers);

        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"test"});
        Object result = mockHandler.handle(invocation);

        assertNull("เมื่อมี AnswersForStubbing เมธอด handle ต้องคืนค่า null ทันที", result);
        assertFalse(mockHandler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testHandleVerificationModeMatchingMock_Branch2_1() throws Throwable {
        final boolean[] verified = new boolean[]{false};
        VerificationMode customVerificationMode = new VerificationMode() {
            public void verify(VerificationData data) {
                assertNotNull(data);
                assertTrue(data instanceof VerificationDataImpl);
                verified[0] = true;
            }
        };

        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(mockInstance, customVerificationMode);
        mockingProgress.setVerificationMode(mockAwareMode);

        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"verify-arg"});
        Object result = mockHandler.handle(invocation);

        assertNull("เมื่อทำการ verify สำเร็จต้องคืนค่า null", result);
        assertTrue("VerificationMode ต้องถูกเรียกทำงานเมื่อ mock instance ตรงกัน", verified[0]);
    }

    @Test
    public void testHandleVerificationModeDifferentMock_Branch2_2() throws Throwable {
        final boolean[] verified = new boolean[]{false};
        VerificationMode customVerificationMode = new VerificationMode() {
            public void verify(VerificationData data) {
                verified[0] = true;
            }
        };

        Object differentMock = new Object();
        MockAwareVerificationMode mockAwareMode = new MockAwareVerificationMode(differentMock, customVerificationMode);
        mockingProgress.setVerificationMode(mockAwareMode);

        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"call-different-mock"});
        Object result = mockHandler.handle(invocation);

        assertFalse("ไม่ควรเรียก verify หาก invocation เกิดขึ้นบนคนละ Mock", verified[0]);
        assertEquals("default_value", result);
    }

    @Test
    public void testHandleVerificationModeNotMockAware_Branch2_3() throws Throwable {
        final boolean[] verified = new boolean[]{false};
        VerificationMode nonMockAwareMode = new VerificationMode() {
            public void verify(VerificationData data) {
                verified[0] = true;
            }
        };

        mockingProgress.setVerificationMode(nonMockAwareMode);

        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"non-mock-aware"});
        Object result = mockHandler.handle(invocation);

        assertFalse("VerificationMode ที่ไม่ใช่ MockAwareVerificationMode จะไม่ถูก verify ใน branch นี้", verified[0]);
        assertEquals("default_value", result);
    }

    @Test
    public void testHandleStubbedInvocation_Branch3() throws Throwable {
        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"matched-param"});
        
        // จำลองการ Stub ค่าไว้ก่อนหน้า
        mockHandler.handle(invocation);
        mockHandler.invocationContainerImpl.addAnswer(new Returns("custom_answer"));

        // เรียกซ้ำด้วย invocation เดิม
        Object result = mockHandler.handle(invocation);
        assertEquals("custom_answer", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHandleStubbedInvocationThrowingException() throws Throwable {
        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"exception-param"});
        mockHandler.handle(invocation);
        mockHandler.invocationContainerImpl.addAnswer(new ThrowsException(new IllegalArgumentException("Stubbed error")));

        mockHandler.handle(invocation);
    }

    @Test
    public void testHandleDefaultAnswerFallback_Branch4() throws Throwable {
        Invocation invocation = createInvocation(mockInstance, testMethod, new Object[]{"unstubbed-call"});
        Object result = mockHandler.handle(invocation);

        assertEquals("default_value", result);
    }

    @Test
    public void testHandleNullAndEmptyArguments_EdgeCase() throws Throwable {
        // ทดสอบส่ง Argument เป็น Null
        Invocation nullArgInvocation = createInvocation(mockInstance, testMethod, new Object[]{null});
        Object resultNull = mockHandler.handle(nullArgInvocation);
        assertEquals("default_value", resultNull);

        // ทดสอบส่ง Argument เป็น Empty Array
        Method voidMethod = SampleService.class.getMethod("doVoid", String.class);
        Invocation emptyArgInvocation = createInvocation(mockInstance, voidMethod, new Object[]{});
        Object resultEmpty = mockHandler.handle(emptyArgInvocation);
        assertEquals("default_value", resultEmpty);
    }

    @Test
    public void testVoidMethodStubbable() {
        VoidMethodStubbable<SampleService> stubbable = mockHandler.voidMethodStubbable(mockInstance);
        assertNotNull(stubbable);
    }

    @Test
    public void testSetAnswersForStubbingEmptyList() {
        mockHandler.setAnswersForStubbing(Arrays.<Answer>asList());
        assertFalse(mockHandler.invocationContainerImpl.hasAnswersForStubbing());
    }
}
package org.mockito.internal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.stubbing.answers.Returns;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MockHandlerTest {

    private MockHandler<List<?>> mockHandler;
    private MockSettingsImpl mockSettings;
    private MockingProgress mockingProgress;

    @Before
    public void setUp() {
        mockingProgress = new ThreadSafeMockingProgress();
        mockingProgress.reset();
        mockSettings = new MockSettingsImpl();
        mockHandler = new MockHandler<List<?>>(mockSettings);
    }

    @After
    public void tearDown() {
        mockingProgress.reset();
    }

    // Helper ในการสร้าง Invocation จำลองโดยไม่ต้องพึ่ง external mock framework
    private Invocation createSampleInvocation(final Object mock, final String methodName, final Class<?>[] paramTypes, final Object[] args) throws Exception {
        final Method method = mock.getClass().getMethod(methodName, paramTypes);
        MockitoMethod mockitoMethod = new MockitoMethod() {
            public String getName() {
                return method.getName();
            }

            public Class<?> getReturnType() {
                return method.getReturnType();
            }

            public Class<?>[] getParameterTypes() {
                return method.getParameterTypes();
            }

            public Class<?>[] getExceptionTypes() {
                return method.getExceptionTypes();
            }

            public boolean isVarArgs() {
                return method.isVarArgs();
            }

            public Method getJavaMethod() {
                return method;
            }
        };

        RealMethod realMethod = new RealMethod() {
            public Object invoke(Object target, Object[] arguments) throws Throwable {
                return null;
            }
        };

        return new Invocation(mock, mockitoMethod, args, 1, realMethod);
    }

    @Test
    public void testConstructorsAndAccessors() {
        // Constructor 1: Default
        MockHandler<Object> defaultHandler = new MockHandler<Object>();
        assertNotNull(defaultHandler.getMockSettings());
        assertNotNull(defaultHandler.getInvocationContainer());

        // Constructor 2: With MockSettingsImpl
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> handlerWithSettings = new MockHandler<Object>(settings);
        assertSame(settings, handlerWithSettings.getMockSettings());
        assertNotNull(handlerWithSettings.getInvocationContainer());

        // Constructor 3: Copy Constructor from MockHandlerInterface
        MockHandler<Object> copiedHandler = new MockHandler<Object>(handlerWithSettings);
        assertSame(settings, copiedHandler.getMockSettings());

        // Test voidMethodStubbable creation
        List<String> dummyMock = new ArrayList<String>();
        VoidMethodStubbable<List<?>> stubbable = mockHandler.voidMethodStubbable(dummyMock);
        assertNotNull(stubbable);
    }

    @Test
    public void testHandle_WhenAnswersForStubbingAreSet_ShouldReturnNullAndSetMethodForStubbing() throws Throwable {
        // Branch 1: invocationContainerImpl.hasAnswersForStubbing() == true
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(new Returns("stubbed-value"));
        mockHandler.setAnswersForStubbing(answers);

        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "get", new Class<?>[]{int.class}, new Object[]{0});

        Object result = mockHandler.handle(invocation);

        assertNull("Should return null when setting up stubbing answers", result);
        assertFalse("Answers should have been consumed for stubbing setup",
                mockHandler.invocationContainerImpl.hasAnswersForStubbing());
    }

    @Test
    public void testHandle_WhenVerificationModeIsActive_ShouldPerformVerifyAndReturnNull() throws Throwable {
        // Branch 2: verificationMode != null
        final boolean[] verifyCalled = new boolean[]{false};
        VerificationMode dummyVerificationMode = new VerificationMode() {
            public void verify(VerificationData data) {
                verifyCalled[0] = true;
                assertNotNull(data);
            }
        };

        mockHandler.mockingProgress.verificationStarted(dummyVerificationMode);

        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "size", new Class<?>[]{}, new Object[]{});

        Object result = mockHandler.handle(invocation);

        assertNull("Verification call must return null", result);
        assertTrue("VerificationMode.verify() must be executed", verifyCalled[0]);
    }

    @Test
    public void testHandle_WhenStubbedAnswerExists_ShouldReturnStubbedAnswer() throws Throwable {
        // Branch 3: stubbedInvocation != null
        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "get", new Class<?>[]{int.class}, new Object[]{5});

        InvocationMatcher matcher = new InvocationMatcher(invocation);
        StubbedInvocationMatcher stubbedInvocationMatcher = new StubbedInvocationMatcher(matcher, new Returns("custom-element-5"));
        mockHandler.invocationContainerImpl.addAnswer(stubbedInvocationMatcher.getAnswer());
        mockHandler.invocationContainerImpl.setMethodForStubbing(matcher);

        Object result = mockHandler.handle(invocation);

        assertEquals("custom-element-5", result);
    }

    @Test(expected = RuntimeException.class)
    public void testHandle_WhenStubbedAnswerThrowsException_ShouldPropagateException() throws Throwable {
        // Branch 3 Exception Case
        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "get", new Class<?>[]{int.class}, new Object[]{99});

        InvocationMatcher matcher = new InvocationMatcher(invocation);
        StubbedInvocationMatcher stubbedInvocationMatcher = new StubbedInvocationMatcher(matcher, new ThrowsException(new RuntimeException("Stubbed error")));
        mockHandler.invocationContainerImpl.addAnswer(stubbedInvocationMatcher.getAnswer());
        mockHandler.invocationContainerImpl.setMethodForStubbing(matcher);

        mockHandler.handle(invocation);
    }

    @Test
    public void testHandle_WhenNoStubbedAnswer_ShouldFallbackToDefaultAnswer() throws Throwable {
        // Branch 4: stubbedInvocation == null
        // Default answer for MockSettings is ReturnsEmptyValues -> size() returns 0
        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "size", new Class<?>[]{}, new Object[]{});

        Object result = mockHandler.handle(invocation);

        assertEquals(0, result);
        assertNotNull(mockHandler.invocationContainerImpl.getInvocationForPotentialStubbing());
    }

    @Test
    public void testHandle_WithCustomDefaultAnswer() throws Throwable {
        // Branch 4 with Custom Default Answer
        mockSettings.defaultAnswer(new Returns("custom-default"));
        MockHandler<List<?>> customHandler = new MockHandler<List<?>>(mockSettings);

        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "toString", new Class<?>[]{}, new Object[]{});

        Object result = customHandler.handle(invocation);

        assertEquals("custom-default", result);
    }

    @Test(expected = MockitoException.class)
    public void testHandle_WhenMockingProgressStateIsInvalid_ShouldThrowException() throws Throwable {
        // Edge Case: Invalid state validation triggered
        mockHandler.mockingProgress.verificationStarted(VerificationModeFactory.atLeastOnce());
        // Triggering another verification start without pulling or finishing leads to invalid state
        mockHandler.mockingProgress.verificationStarted(VerificationModeFactory.times(1));

        List<String> mockObj = new ArrayList<String>();
        Invocation invocation = createSampleInvocation(mockObj, "size", new Class<?>[]{}, new Object[]{});

        mockHandler.handle(invocation);
    }
}
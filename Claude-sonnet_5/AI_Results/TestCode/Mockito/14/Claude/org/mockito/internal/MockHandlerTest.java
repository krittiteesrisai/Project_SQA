package org.mockito.internal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MatchersBinder;
import org.mockito.internal.progress.ArgumentMatcherStorage;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.stubbing.VoidMethodStubbableImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.verification.VerificationMode;

/**
 * Unit test สำหรับ {@link MockHandler}
 *
 * หมายเหตุ: ทดสอบอยู่ใน package เดียวกับ class เป้าหมาย (org.mockito.internal)
 * เพื่อให้สามารถเข้าถึง package-private fields (invocationContainerImpl, matchersBinder,
 * mockingProgress) ได้ตรง ๆ ตามรูปแบบที่ Mockito ใช้ทดสอบ internal class ของตัวเอง
 */
public class MockHandlerTest {

    private MockHandler<Object> handler;
    private MockingProgress mockingProgress;
    private InvocationContainerImpl invocationContainerImpl;
    private MatchersBinder matchersBinder;
    private MockSettingsImpl mockSettings;

    @Before
    public void setup() {
        mockSettings = new MockSettingsImpl();
        handler = new MockHandler<Object>(mockSettings);

        mockingProgress = mock(MockingProgress.class);
        matchersBinder = mock(MatchersBinder.class);
        invocationContainerImpl = mock(InvocationContainerImpl.class);

        // ฉีด mock collaborators เข้า field package-private โดยตรง
        handler.mockingProgress = mockingProgress;
        handler.matchersBinder = matchersBinder;
        handler.invocationContainerImpl = invocationContainerImpl;
    }

    // --------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------

    @Test
    public void shouldCreateHandlerWithGivenMockSettings() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandler<Object> h = new MockHandler<Object>(settings);

        assertSame(settings, h.getMockSettings());
        assertNotNull(h.invocationContainerImpl);
        assertNotNull(h.matchersBinder);
        assertNotNull(h.mockingProgress);
    }

    @Test
    public void shouldCreateHandlerWithDefaultPackagePrivateConstructor() {
        // package-private constructor: MockHandler() -> this(new MockSettingsImpl())
        MockHandler<Object> h = new MockHandler<Object>();

        assertNotNull(h.getMockSettings());
        assertNotNull(h.invocationContainerImpl);
        assertNotNull(h.matchersBinder);
        assertNotNull(h.mockingProgress);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void shouldCreateHandlerFromOldMockHandlerInterface() {
        MockSettingsImpl settings = new MockSettingsImpl();
        MockHandlerInterface<Object> oldHandler = mock(MockHandlerInterface.class);
        when(oldHandler.getMockSettings()).thenReturn(settings);

        MockHandler<Object> h = new MockHandler<Object>(oldHandler);

        assertSame(settings, h.getMockSettings());
        verify(oldHandler).getMockSettings();
    }

    // --------------------------------------------------------------
    // handle() : branch - hasAnswersForStubbing() == true
    // --------------------------------------------------------------

    @Test
    public void shouldSetMethodForStubbingWhenHasAnswersForStubbingIsTrue() throws Throwable {
        Invocation invocation = mock(Invocation.class);
        InvocationMatcher invocationMatcher = mock(InvocationMatcher.class);
        ArgumentMatcherStorage storage = mock(ArgumentMatcherStorage.class);

        when(invocationContainerImpl.hasAnswersForStubbing()).thenReturn(true);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(storage);
        when(matchersBinder.bindMatchers(storage, invocation)).thenReturn(invocationMatcher);

        Object result = handler.handle(invocation);

        assertNull(result);
        verify(invocationContainerImpl).setMethodForStubbing(invocationMatcher);
        // ส่วนที่เหลือของ method ต้องไม่ถูกเรียกเมื่อเข้า branch นี้
        verify(mockingProgress, never()).pullVerificationMode();
        verify(mockingProgress, never()).validateState();
        verify(invocationContainerImpl, never()).setInvocationForPotentialStubbing(any(InvocationMatcher.class));
        verify(invocationContainerImpl, never()).findAnswerFor(any(Invocation.class));
    }

    @Test
    public void shouldHandleNullInvocationWhenHasAnswersForStubbingTrue() throws Throwable {
        // NOTE: โค้ดจริงไม่มี null-check สำหรับ invocation พารามิเตอร์
        // เทสนี้เพียงยืนยันว่า เมื่อ collaborator ถูก mock ไว้ การเรียก handle(null)
        // จะไม่ throw NPE ใน branch นี้ (ไม่ได้ยืนยัน behavior อื่นที่ไม่มีในซอร์ส)
        when(invocationContainerImpl.hasAnswersForStubbing()).thenReturn(true);

        Object result = handler.handle(null);

        assertNull(result);
    }

    // --------------------------------------------------------------
    // handle() : branch - verificationMode != null
    // --------------------------------------------------------------

    @Test
    public void shouldCallVerifyWhenVerificationModeIsPulled() throws Throwable {
        Invocation invocation = mock(Invocation.class);
        InvocationMatcher invocationMatcher = mock(InvocationMatcher.class);
        ArgumentMatcherStorage storage = mock(ArgumentMatcherStorage.class);
        VerificationMode verificationMode = mock(VerificationMode.class);
        List<Invocation> invocations = new LinkedList<Invocation>();

        when(invocationContainerImpl.hasAnswersForStubbing()).thenReturn(false);
        when(mockingProgress.pullVerificationMode()).thenReturn(verificationMode);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(storage);
        when(matchersBinder.bindMatchers(storage, invocation)).thenReturn(invocationMatcher);
        when(invocationContainerImpl.getInvocations()).thenReturn(invocations);

        Object result = handler.handle(invocation);

        assertNull(result);
        verify(mockingProgress).validateState();
        // ใช้ anyObject() เพราะ parameter type (VerificationData) ไม่ได้ import ตรง ๆ
        // เพื่อลดความเสี่ยงเรื่อง package path ที่ไม่แน่ใจ
        verify(verificationMode).verify(anyObject());
        // เมื่อเข้า branch verify ต้อง "return null" ทันที ไม่ไปทำ stubbing ต่อ
        verify(invocationContainerImpl, never()).setInvocationForPotentialStubbing(any(InvocationMatcher.class));
        verify(mockingProgress, never()).reportOngoingStubbing(anyObject());
        verify(invocationContainerImpl, never()).findAnswerFor(any(Invocation.class));
    }

    // --------------------------------------------------------------
    // handle() : branch - verificationMode == null, findAnswerFor != null
    // --------------------------------------------------------------

    @Test
    public void shouldReturnStubbedAnswerWhenFoundAndNoVerificationMode() throws Throwable {
        Invocation invocation = mock(Invocation.class);
        InvocationMatcher invocationMatcher = mock(InvocationMatcher.class);
        ArgumentMatcherStorage storage = mock(ArgumentMatcherStorage.class);
        StubbedInvocationMatcher stubbedInvocationMatcher = mock(StubbedInvocationMatcher.class);
        List<Invocation> invocations = new LinkedList<Invocation>();

        when(invocationContainerImpl.hasAnswersForStubbing()).thenReturn(false);
        when(mockingProgress.pullVerificationMode()).thenReturn(null);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(storage);
        when(matchersBinder.bindMatchers(storage, invocation)).thenReturn(invocationMatcher);
        when(invocationContainerImpl.getInvocations()).thenReturn(invocations);
        when(invocationContainerImpl.findAnswerFor(invocation)).thenReturn(stubbedInvocationMatcher);
        when(stubbedInvocationMatcher.answer(invocation)).thenReturn("stubbed-result");

        Object result = handler.handle(invocation);

        assertEquals("stubbed-result", result);
        verify(invocationContainerImpl).setInvocationForPotentialStubbing(invocationMatcher);
        verify(mockingProgress).reportOngoingStubbing(anyObject());
        verify(stubbedInvocationMatcher).captureArgumentsFrom(invocation);
        verify(stubbedInvocationMatcher).answer(invocation);
        // ไม่ควรเข้า else-branch (default answer path)
        verify(invocationContainerImpl, never()).resetInvocationForPotentialStubbing(any(InvocationMatcher.class));
    }

    // --------------------------------------------------------------
    // handle() : branch - verificationMode == null, findAnswerFor == null (default answer)
    // --------------------------------------------------------------

    @Test
    public void shouldUseDefaultAnswerWhenNoStubbedAnswerFound() throws Throwable {
        Invocation invocation = mock(Invocation.class);
        InvocationMatcher invocationMatcher = mock(InvocationMatcher.class);
        ArgumentMatcherStorage storage = mock(ArgumentMatcherStorage.class);
        List<Invocation> invocations = new LinkedList<Invocation>();

        @SuppressWarnings("unchecked")
        Answer<Object> defaultAnswer = mock(Answer.class);
        when(defaultAnswer.answer(invocation)).thenReturn("default-result");

        MockSettingsImpl settingsSpy = spy(new MockSettingsImpl());
        doReturn(defaultAnswer).when(settingsSpy).getDefaultAnswer();

        MockHandler<Object> h = new MockHandler<Object>(settingsSpy);
        h.mockingProgress = mockingProgress;
        h.matchersBinder = matchersBinder;
        h.invocationContainerImpl = invocationContainerImpl;

        when(invocationContainerImpl.hasAnswersForStubbing()).thenReturn(false);
        when(mockingProgress.pullVerificationMode()).thenReturn(null);
        when(mockingProgress.getArgumentMatcherStorage()).thenReturn(storage);
        when(matchersBinder.bindMatchers(storage, invocation)).thenReturn(invocationMatcher);
        when(invocationContainerImpl.getInvocations()).thenReturn(invocations);
        when(invocationContainerImpl.findAnswerFor(invocation)).thenReturn(null);

        Object result = h.handle(invocation);

        assertEquals("default-result", result);
        verify(invocationContainerImpl).setInvocationForPotentialStubbing(invocationMatcher);
        verify(invocationContainerImpl).resetInvocationForPotentialStubbing(invocationMatcher);
    }

    // --------------------------------------------------------------
    // voidMethodStubbable()
    // --------------------------------------------------------------

    @Test
    public void shouldReturnVoidMethodStubbableImplInstance() {
        Object mockObj = new Object();

        VoidMethodStubbable<Object> stubbable = handler.voidMethodStubbable(mockObj);

        assertNotNull(stubbable);
        assertTrue(stubbable instanceof VoidMethodStubbableImpl);
    }

    // --------------------------------------------------------------
    // getMockSettings()
    // --------------------------------------------------------------

    @Test
    public void shouldReturnInjectedMockSettings() {
        assertSame(mockSettings, handler.getMockSettings());
    }

    // --------------------------------------------------------------
    // setAnswersForStubbing()
    // --------------------------------------------------------------

    @SuppressWarnings("unchecked")
    @Test
    public void shouldDelegateSetAnswersForStubbingWithNonEmptyList() {
        List<Answer> answers = new LinkedList<Answer>();
        answers.add(mock(Answer.class));

        handler.setAnswersForStubbing(answers);

        verify(invocationContainerImpl).setAnswersForStubbing(answers);
    }

    @Test
    public void shouldDelegateSetAnswersForStubbingWithEmptyList() {
        // boundary case: list ว่าง
        List<Answer> answers = new LinkedList<Answer>();

        handler.setAnswersForStubbing(answers);

        verify(invocationContainerImpl).setAnswersForStubbing(answers);
    }

    @Test
    public void shouldDelegateSetAnswersForStubbingWithNullList() {
        // NOTE: source ไม่มี null-check ใน setAnswersForStubbing
        // เทสนี้ยืนยันเพียงว่าค่า null ถูก forward ไปยัง invocationContainerImpl ตรง ๆ
        handler.setAnswersForStubbing(null);

        verify(invocationContainerImpl).setAnswersForStubbing(null);
    }

    // --------------------------------------------------------------
    // getInvocationContainer()
    // --------------------------------------------------------------

    @Test
    public void shouldReturnInjectedInvocationContainer() {
        assertSame(invocationContainerImpl, handler.getInvocationContainer());
    }
}

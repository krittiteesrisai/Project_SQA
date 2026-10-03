package org.mockito;

import org.junit.After;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MockitoTest {

    @After
    public void validate() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void testMockWithClass() {
        List<?> list = Mockito.mock(List.class);
        assertNotNull(list);
        assertNull(list.get(0));
    }

    @Test
    public void testMockWithName() {
        List<?> list = Mockito.mock(List.class, "customListName");
        assertNotNull(list);
        assertTrue(list.toString().contains("customListName"));
    }

    @Test
    public void testMockWithAnswer() {
        List<?> smartNullsList = Mockito.mock(List.class, Mockito.RETURNS_SMART_NULLS);
        assertNotNull(smartNullsList);
        assertNotNull(smartNullsList.toArray());

        List<?> mocksList = Mockito.mock(List.class, Mockito.RETURNS_MOCKS);
        assertNotNull(mocksList);
        assertNotNull(mocksList.iterator());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testMockWithDeprecatedReturnValues() {
        ReturnValues returnValues = new ReturnValues() {
            public Object valueFor(InvocationOnMock invocation) {
                return "customValue";
            }
        };
        List<?> list = Mockito.mock(List.class, returnValues);
        assertEquals("customValue", list.get(0));
    }

    @Test
    public void testMockWithSettings() {
        MockSettings settings = Mockito.withSettings().name("settingsMock").defaultAnswer(Mockito.RETURNS_DEFAULTS);
        List<?> list = Mockito.mock(List.class, settings);
        assertNotNull(list);
        assertTrue(list.toString().contains("settingsMock"));
    }

    @Test
    public void testSpyRealObject() {
        List<String> realList = new ArrayList<String>();
        List<String> spyList = Mockito.spy(realList);

        spyList.add("first");
        spyList.add("second");

        assertEquals(2, spyList.size());
        assertEquals("first", spyList.get(0));
        Mockito.verify(spyList).add("first");
        Mockito.verify(spyList).add("second");
    }

    @Test
    public void testWhenThenReturnAndConsecutive() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(0)).thenReturn("one", "two", "three");

        assertEquals("one", list.get(0));
        assertEquals("two", list.get(0));
        assertEquals("three", list.get(0));
        assertEquals("three", list.get(0)); // Last stubbing persists
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWhenThenThrow() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(99)).thenThrow(new IndexOutOfBoundsException());
        list.get(99);
    }

    @Test
    public void testWhenThenAnswer() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenAnswer(new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                return "item_" + args[0];
            }
        });

        assertEquals("item_5", list.get(5));
        assertEquals("item_10", list.get(10));
    }

    @Test
    public void testWhenThenCallRealMethod() {
        LinkedList<String> list = Mockito.mock(LinkedList.class);
        Mockito.when(list.size()).thenCallRealMethod();
        assertEquals(0, list.size());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedStub() {
        List<String> list = Mockito.mock(List.class);
        Mockito.stub(list.get(0)).toReturn("deprecated_one");
        assertEquals("deprecated_one", list.get(0));
    }

    @SuppressWarnings("deprecation")
    @Test(expected = RuntimeException.class)
    public void testDeprecatedStubVoid() {
        List<String> list = Mockito.mock(List.class);
        Mockito.stubVoid(list).toThrow(new RuntimeException()).on().clear();
        list.clear();
    }

    @Test
    public void testDoReturnWhen() {
        List<String> list = Mockito.mock(List.class);
        Mockito.doReturn("doReturnVal").when(list).get(0);
        assertEquals("doReturnVal", list.get(0));
    }

    @Test(expected = IllegalStateException.class)
    public void testDoThrowWhen() {
        List<String> list = Mockito.mock(List.class);
        Mockito.doThrow(new IllegalStateException()).when(list).clear();
        list.clear();
    }

    @Test
    public void testDoNothingWhen() {
        List<String> spyList = Mockito.spy(new ArrayList<String>());
        Mockito.doNothing().when(spyList).clear();

        spyList.add("stay");
        spyList.clear();

        assertEquals(1, spyList.size());
        assertEquals("stay", spyList.get(0));
    }

    @Test
    public void testDoAnswerWhen() {
        List<String> list = Mockito.mock(List.class);
        Mockito.doAnswer(new Answer<Object>() {
            public Object answer(InvocationOnMock invocation) {
                return "custom_answer";
            }
        }).when(list).get(1);

        assertEquals("custom_answer", list.get(1));
    }

    @Test
    public void testDoCallRealMethodWhen() {
        ArrayList<String> mockList = Mockito.mock(ArrayList.class);
        Mockito.doCallRealMethod().when(mockList).clear();
        mockList.clear();
        Mockito.verify(mockList).clear();
    }

    @Test
    public void testVerificationModes() {
        List<String> list = Mockito.mock(List.class);

        list.add("item");
        list.add("item");
        list.add("item");

        Mockito.verify(list, Mockito.times(3)).add("item");
        Mockito.verify(list, Mockito.atLeast(2)).add("item");
        Mockito.verify(list, Mockito.atLeastOnce()).add("item");
        Mockito.verify(list, Mockito.atMost(5)).add("item");
        Mockito.verify(list, Mockito.never()).add("nonExistent");
    }

    @Test
    public void testVerifyOnly() {
        List<String> list = Mockito.mock(List.class);
        list.add("onlyOneCall");
        Mockito.verify(list, Mockito.only()).add("onlyOneCall");
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testVerifyFailsWhenNotInvoked() {
        List<String> list = Mockito.mock(List.class);
        Mockito.verify(list).clear();
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void testVerifyFailsOnTooFewInvocations() {
        List<String> list = Mockito.mock(List.class);
        list.add("test");
        Mockito.verify(list, Mockito.times(2)).add("test");
    }

    @Test
    public void testInOrderVerificationSuccess() {
        List<String> firstMock = Mockito.mock(List.class);
        List<String> secondMock = Mockito.mock(List.class);

        firstMock.add("first");
        secondMock.add("second");

        InOrder inOrder = Mockito.inOrder(firstMock, secondMock);
        inOrder.verify(firstMock).add("first");
        inOrder.verify(secondMock).add("second");
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testInOrderVerificationFailure() {
        List<String> firstMock = Mockito.mock(List.class);
        List<String> secondMock = Mockito.mock(List.class);

        firstMock.add("first");
        secondMock.add("second");

        InOrder inOrder = Mockito.inOrder(firstMock, secondMock);
        inOrder.verify(secondMock).add("second");
        inOrder.verify(firstMock).add("first");
    }

    @Test
    public void testVerifyZeroInteractions() {
        List<?> first = Mockito.mock(List.class);
        List<?> second = Mockito.mock(List.class);
        Mockito.verifyZeroInteractions(first, second);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testVerifyZeroInteractionsFailsOnInteraction() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("action");
        Mockito.verifyZeroInteractions(mock);
    }

    @Test
    public void testVerifyNoMoreInteractions() {
        List<String> list = Mockito.mock(List.class);
        list.add("action");
        Mockito.verify(list).add("action");
        Mockito.verifyNoMoreInteractions(list);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void testVerifyNoMoreInteractionsFailsOnUnverifiedCall() {
        List<String> list = Mockito.mock(List.class);
        list.add("action1");
        list.add("action2");
        Mockito.verify(list).add("action1");
        Mockito.verifyNoMoreInteractions(list);
    }

    @Test
    public void testResetMock() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.size()).thenReturn(10);
        list.add("item");

        assertEquals(10, list.size());
        Mockito.reset(list);

        assertEquals(0, list.size()); // Stubbing reset to default
        Mockito.verifyZeroInteractions(list); // Interactions reset
    }

    @Test
    public void testDebug() {
        MockitoDebugger debugger = Mockito.debug();
        assertNotNull(debugger);
    }

    @Test(expected = MockitoException.class)
    public void testInvalidMockTargetThrowsException() {
        Mockito.verify("notAMock");
    }
}
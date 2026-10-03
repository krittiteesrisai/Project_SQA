package org.mockito.internal.creation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.stubbing.Answer;
import org.mockito.internal.stubbing.answers.Returns;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class MockSettingsImplTest {

    private MockSettingsImpl mockSettings;

    @Before
    public void setUp() {
        mockSettings = new MockSettingsImpl();
    }

    // --- Tests for extraInterfaces() & serializable() ---

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenExtraInterfacesIsNull() {
        mockSettings.extraInterfaces((Class<?>[]) null);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenExtraInterfacesIsEmpty() {
        mockSettings.extraInterfaces(new Class<?>[0]);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenExtraInterfacesContainsNullElement() {
        mockSettings.extraInterfaces(List.class, null);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenSingleExtraInterfaceIsNull() {
        mockSettings.extraInterfaces(new Class<?>[]{null});
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenExtraInterfaceIsNotAnInterface() {
        mockSettings.extraInterfaces(String.class);
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenOneOfMultipleExtraInterfacesIsNotAnInterface() {
        mockSettings.extraInterfaces(List.class, Integer.class, Set.class);
    }

    @Test
    public void shouldSetSingleExtraInterfaceSuccessfully() {
        MockSettings result = mockSettings.extraInterfaces(List.class);

        assertSame(mockSettings, result);
        assertNotNull(mockSettings.getExtraInterfaces());
        assertEquals(1, mockSettings.getExtraInterfaces().length);
        assertEquals(List.class, mockSettings.getExtraInterfaces()[0]);
    }

    @Test
    public void shouldSetMultipleExtraInterfacesSuccessfully() {
        mockSettings.extraInterfaces(List.class, Set.class);

        assertNotNull(mockSettings.getExtraInterfaces());
        assertEquals(2, mockSettings.getExtraInterfaces().length);
        assertEquals(List.class, mockSettings.getExtraInterfaces()[0]);
        assertEquals(Set.class, mockSettings.getExtraInterfaces()[1]);
    }

    @Test
    public void shouldSetSerializableCorrectly() {
        MockSettings result = mockSettings.serializable();

        assertSame(mockSettings, result);
        assertNotNull(mockSettings.getExtraInterfaces());
        assertEquals(1, mockSettings.getExtraInterfaces().length);
        assertEquals(Serializable.class, mockSettings.getExtraInterfaces()[0]);
    }

    // --- Tests for isSerializable() ---

    @Test
    public void shouldReturnFalseForIsSerializableWhenExtraInterfacesIsNull() {
        assertNull(mockSettings.getExtraInterfaces());
        assertFalse(mockSettings.isSerializable());
    }

    @Test
    public void shouldReturnFalseForIsSerializableWhenExtraInterfacesDoesNotContainSerializable() {
        mockSettings.extraInterfaces(List.class, Set.class);
        assertFalse(mockSettings.isSerializable());
    }

    @Test
    public void shouldReturnTrueForIsSerializableWhenExtraInterfacesContainsSerializableDirectly() {
        mockSettings.extraInterfaces(List.class, Serializable.class);
        assertTrue(mockSettings.isSerializable());
    }

    @Test
    public void shouldReturnTrueForIsSerializableWhenConfiguredViaSerializableMethod() {
        mockSettings.serializable();
        assertTrue(mockSettings.isSerializable());
    }

    // --- Tests for name() & initiateMockName() ---

    @Test
    public void shouldInitiateMockNameWithDefaultNameWhenNameIsNotSet() {
        mockSettings.initiateMockName(List.class);

        assertNotNull(mockSettings.getMockName());
        assertFalse(mockSettings.getMockName().isSurrogate());
        assertEquals("list", mockSettings.getMockName().toString());
    }

    @Test
    public void shouldInitiateMockNameWithCustomNameWhenNameIsSet() {
        MockSettings result = mockSettings.name("myCustomMock");
        assertSame(mockSettings, result);

        mockSettings.initiateMockName(List.class);

        assertNotNull(mockSettings.getMockName());
        assertEquals("myCustomMock", mockSettings.getMockName().toString());
    }

    // --- Tests for spiedInstance() ---

    @Test
    public void shouldSetAndGetSpiedInstance() {
        Object spyObject = new Object();
        MockSettings result = mockSettings.spiedInstance(spyObject);

        assertSame(mockSettings, result);
        assertSame(spyObject, mockSettings.getSpiedInstance());
    }

    @Test
    public void shouldAllowNullSpiedInstance() {
        mockSettings.spiedInstance(null);
        assertNull(mockSettings.getSpiedInstance());
    }

    // --- Tests for defaultAnswer() ---

    @Test
    public void shouldSetAndGetDefaultAnswer() {
        Answer<Object> answer = new Returns("test");
        MockSettings result = mockSettings.defaultAnswer(answer);

        assertSame(mockSettings, result);
        assertSame(answer, mockSettings.getDefaultAnswer());
    }

    @Test
    public void shouldAllowNullDefaultAnswer() {
        mockSettings.defaultAnswer(null);
        assertNull(mockSettings.getDefaultAnswer());
    }
}
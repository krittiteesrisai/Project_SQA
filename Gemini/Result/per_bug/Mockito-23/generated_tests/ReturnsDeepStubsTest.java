package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs returnsDeepStubs;

    // Interfaces for testing various return types and generic bounds
    interface SimpleInterface {
        ComplexInterface getComplex();
        final class FinalClass { }
        FinalClass getFinalClass();
        String getString();
        int getPrimitiveInt();
        void getVoid();
    }

    interface ComplexInterface {
        String getValue();
        NestedGenericInterface<?> getNested();
    }

    interface NestedGenericInterface<T extends List<String> & Serializable> {
        T getMultiBoundedType();
    }

    interface GenericContainer<K, V> {
        K getKey();
        V getValue();
    }

    interface ConcreteGenericContainer extends GenericContainer<ComplexInterface, String> {
    }

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
    }

    /**
     * Branch 1.1: Non-mockable return types (Primitives, Final Classes, String, Void)
     */
    @Test
    public void testAnswer_NonMockableReturnTypes_ShouldDelegateToEmptyValues() throws Throwable {
        SimpleInterface mock = mock(SimpleInterface.class, returnsDeepStubs);

        assertEquals(0, mock.getPrimitiveInt());
        assertEquals("", mock.getString());
        assertNull(mock.getFinalClass());
    }

    /**
     * Branch 1.2 & 2.2: Mockable return type creates a new deep stub mock
     */
    @Test
    public void testAnswer_MockableReturnType_ShouldCreateAndReturnMock() {
        SimpleInterface mock = mock(SimpleInterface.class, returnsDeepStubs);
        ComplexInterface complex = mock.getComplex();

        assertNotNull("Deep stub mock should not be null", complex);
        assertTrue("Created object must be a mock", new MockUtil().isMock(complex));
    }

    /**
     * Branch 2.1: Matching invocation should reuse previously created/stubbed mock
     */
    @Test
    public void testAnswer_SubsequentInvocations_ShouldReturnSameMockInstance() {
        SimpleInterface mock = mock(SimpleInterface.class, returnsDeepStubs);

        ComplexInterface firstCall = mock.getComplex();
        ComplexInterface secondCall = mock.getComplex();

        assertNotNull(firstCall);
        assertSame("Should return the exact same mock instance across calls", firstCall, secondCall);
    }

    /**
     * Branch 2.1: Explicitly stubbed invocation overrides deep stubbing
     */
    @Test
    public void testAnswer_ExplicitStubbedInvocation_ShouldReturnExplicitAnswer() {
        SimpleInterface mock = mock(SimpleInterface.class, returnsDeepStubs);
        ComplexInterface customMock = mock(ComplexInterface.class);
        
        when(mock.getComplex()).thenReturn(customMock);

        assertSame(customMock, mock.getComplex());
    }

    /**
     * Branch 3.1: Type with multiple bounds (extra interfaces)
     */
    @Test
    public void testAnswer_GenericWithMultipleBounds_ShouldApplyExtraInterfaces() {
        ComplexInterface mock = mock(ComplexInterface.class, returnsDeepStubs);
        NestedGenericInterface<?> nested = mock.getNested();
        
        assertNotNull(nested);
        Object multiBounded = nested.getMultiBoundedType();
        assertNotNull(multiBounded);
        assertTrue("Should implement List", multiBounded instanceof List);
        assertTrue("Should implement Serializable", multiBounded instanceof Serializable);
    }

    /**
     * Branch 3.2: Type without extra interfaces
     */
    @Test
    public void testAnswer_GenericWithoutExtraInterfaces_ShouldMockSuccessfully() {
        ConcreteGenericContainer container = mock(ConcreteGenericContainer.class, returnsDeepStubs);
        
        ComplexInterface key = container.getKey();
        String value = container.getValue();

        assertNotNull(key);
        assertTrue(new MockUtil().isMock(key));
        assertEquals("", value);
    }

    /**
     * Complex Scenario: Chained deep stubs resolution
     */
    @Test
    public void testAnswer_MultiLevelDeepStubbing_ShouldPropagateValues() {
        SimpleInterface mock = mock(SimpleInterface.class, returnsDeepStubs);

        when(mock.getComplex().getValue()).thenReturn("DeepStubResult");

        assertEquals("DeepStubResult", mock.getComplex().getValue());
    }

    /**
     * Edge Case / Defects4J Target: Serialization and Deserialization of ReturnsDeepStubs
     */
    @Test
    public void testSerialization_ReturnsDeepStubsInstance_ShouldBeSerializable() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        
        oos.writeObject(returnsDeepStubs);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsDeepStubs);
    }

    /**
     * Edge Case: Mock created with Serializable settings and ReturnsDeepStubs
     */
    @Test
    public void testSerialization_MockWithDeepStubs_ShouldRemainFunctionalAfterDeserialization() throws Exception {
        SimpleInterface mock = mock(SimpleInterface.class, withSettings().defaultAnswer(returnsDeepStubs).serializable());
        
        ComplexInterface complex = mock.getComplex();
        assertNotNull(complex);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(mock);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimpleInterface deserializedMock = (SimpleInterface) ois.readObject();

        assertNotNull(deserializedMock);
        assertNotNull(deserializedMock.getComplex());
    }

    /**
     * Edge Case: Verification after deep stubbing
     */
    @Test
    public void testDeepStub_Verification_ShouldPass() {
        SimpleInterface mock = mock(SimpleInterface.class, returnsDeepStubs);
        
        mock.getComplex().getValue();

        verify(mock).getComplex();
    }
}
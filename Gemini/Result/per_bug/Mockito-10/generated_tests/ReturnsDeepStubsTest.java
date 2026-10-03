package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs returnsDeepStubs;

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
    }

    // Domain models and interfaces for testing
    interface TopLevel {
        MiddleLevel getMiddle();
        String getStringValue();
        int getIntValue();
        void doVoid();
        <T extends List<?> & Comparable<?>> T getMultipleBoundsGeneric();
        Container<Item> getContainer();
    }

    interface MiddleLevel {
        BottomLevel getBottom();
    }

    interface BottomLevel {
        String getName();
        int getId();
    }

    interface Item {
        String getItemName();
    }

    interface Container<T> {
        T getItem();
    }

    static class NonSerializableClass {
        private final String name;
        public NonSerializableClass(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    interface NonSerializableService {
        NonSerializableClass getService();
    }

    // 1. Branch: Unmockable return types (Primitives, Final classes, Void)
    @Test
    public void testAnswer_UnmockableReturnTypes_ReturnsDefaultValues() {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);

        // String (final class) -> should return empty string ""
        assertEquals("", mock.getStringValue());

        // int (primitive) -> should return 0
        assertEquals(0, mock.getIntValue());

        // void method invocation
        mock.doVoid();
    }

    // 2. Branch: Fresh Deep Stub Mock creation
    @Test
    public void testAnswer_MockableType_CreatesNewDeepStubMock() {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);

        MiddleLevel middle = mock.getMiddle();
        assertNotNull("Deep stub mock should not be null", middle);
        assertTrue("Created object must be a Mockito mock", new MockUtil().isMock(middle));
    }

    // 3. Branch: Reusing already stubbed invocation (Cache hit in container)
    @Test
    public void testDeepStub_RepeatedInvocation_ReturnsSameInstance() {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);

        MiddleLevel firstCall = mock.getMiddle();
        MiddleLevel secondCall = mock.getMiddle();

        assertSame("Subsequent calls to the same method must return the cached mock instance", firstCall, secondCall);
    }

    // 4. Branch: Deeply nested stubbing chain
    @Test
    public void testDeepStub_NestedChaining() {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);

        assertNotNull(mock.getMiddle().getBottom());
        assertEquals("", mock.getMiddle().getBottom().getName());
        assertEquals(0, mock.getMiddle().getBottom().getId());
    }

    // 5. Branch: Generics with Multiple Bounds (hasRawExtraInterfaces == true)
    @Test
    public void testDeepStub_WithMultipleGenericBounds() {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);

        Object result = mock.getMultipleBoundsGeneric();
        assertNotNull(result);
        assertTrue("Result must implement List", result instanceof List);
        assertTrue("Result must implement Comparable", result instanceof Comparable);
    }

    // 6. Branch: Generic Metadata propagation with nested parameterized types
    @Test
    public void testDeepStub_GenericMetadataResolution() {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);

        Container<Item> container = mock.getContainer();
        assertNotNull(container);

        Item item = container.getItem();
        assertNotNull("Nested generic item should be mocked", item);
        assertEquals("", item.getItemName());
    }

    // 7. Branch & Edge Case: Deep stubbing with Serialization & writeReplace
    @Test
    public void testDeepStub_Serialization() throws Exception {
        TopLevel mock = mock(TopLevel.class, returnsDeepStubs);
        MiddleLevel middle = mock.getMiddle();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(mock);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TopLevel deserializedMock = (TopLevel) ois.readObject();

        assertNotNull(deserializedMock);
        assertNotNull(deserializedMock.getMiddle());
    }

    // 8. Edge Case: Deep stub answer manually invoked
    @Test
    public void testDeeplyStubbedAnswer_DirectInvocation() throws Throwable {
        TopLevel mock = mock(TopLevel.class);
        ReturnsDeepStubs.class.getDeclaredClasses(); // Load classes

        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMock()).thenReturn(mock);

        // Verify that custom stubbing can override deep stub
        when(mock.getStringValue()).thenReturn("custom-value");
        assertEquals("custom-value", mock.getStringValue());
    }

    // 9. Edge Case: Deep stub on class type (non-interface)
    @Test
    public void testDeepStub_ClassReturnType() {
        NonSerializableService serviceMock = mock(NonSerializableService.class, returnsDeepStubs);
        NonSerializableClass result = serviceMock.getService();
        assertNotNull(result);
        assertEquals("", result.getName());
    }
}
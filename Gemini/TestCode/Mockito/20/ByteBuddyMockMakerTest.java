package org.mockito.internal.creation.bytebuddy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.stubbing.InvocationContainer;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.MockName;
import org.mockito.mock.SerializableMode;
import org.mockito.stubbing.Answer;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ByteBuddyMockMakerTest {

    private ByteBuddyMockMaker mockMaker;

    @Before
    public void setUp() {
        mockMaker = new ByteBuddyMockMaker();
    }

    // --- Helper Classes & Interfaces ---

    public static class SampleClass {
        public String foo() {
            return "real_foo";
        }
    }

    public interface SampleInterface {
        void bar();
    }

    public interface ExtraInterface {
        void extra();
    }

    private static class DummyInternalMockHandler<T> implements InternalMockHandler<T> {
        private final MockCreationSettings<T> settings;

        public DummyInternalMockHandler(MockCreationSettings<T> settings) {
            this.settings = settings;
        }

        @Override
        public MockCreationSettings<T> getMockSettings() {
            return settings;
        }

        @Override
        public InvocationContainer getInvocationContainer() {
            return null;
        }

        @Override
        public Object handle(Invocation invocation) throws Throwable {
            return null;
        }

        @Override
        public void setAnswersForStubbing(List<Answer> answers) {
        }
    }

    private static class CustomMockHandler implements MockHandler {
        @Override
        public Object handle(Invocation invocation) throws Throwable {
            return null;
        }

        @Override
        public MockCreationSettings getMockSettings() {
            return null;
        }

        @Override
        public void setAnswersForStubbing(List<Answer> answers) {
        }
    }

    private static class DummySettings<T> implements MockCreationSettings<T> {
        private final Class<T> typeToMock;
        private final Set<Class> extraInterfaces;
        private SerializableMode serializableMode;

        public DummySettings(Class<T> typeToMock) {
            this(typeToMock, Collections.<Class>emptySet(), SerializableMode.NONE);
        }

        public DummySettings(Class<T> typeToMock, Set<Class> extraInterfaces, SerializableMode serializableMode) {
            this.typeToMock = typeToMock;
            this.extraInterfaces = extraInterfaces != null ? extraInterfaces : Collections.<Class>emptySet();
            this.serializableMode = serializableMode;
        }

        @Override
        public Class<T> getTypeToMock() {
            return typeToMock;
        }

        @Override
        public Set<Class> getExtraInterfaces() {
            return extraInterfaces;
        }

        @Override
        public MockName getMockName() {
            return null;
        }

        @Override
        public SerializableMode getSerializableMode() {
            return serializableMode;
        }

        @Override
        public Object getSpiedInstance() {
            return null;
        }

        @Override
        public boolean isStubOnly() {
            return false;
        }

        @Override
        public boolean isStripAnnotations() {
            return false;
        }

        @Override
        public Answer getDefaultAnswer() {
            return null;
        }

        @Override
        public List<org.mockito.stubbing.StubbedInvocationMatcher> getInvocationMappers() {
            return Collections.emptyList();
        }

        public void setSerializableMode(SerializableMode mode) {
            this.serializableMode = mode;
        }
    }

    // --- Tests ---

    @Test
    public void should_create_mock_for_class_successfully() {
        DummySettings<SampleClass> settings = new DummySettings<SampleClass>(SampleClass.class);
        DummyInternalMockHandler<SampleClass> handler = new DummyInternalMockHandler<SampleClass>(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);

        assertNotNull(mock);
        assertTrue(mock instanceof SampleClass);
        assertTrue(mock instanceof MockMethodInterceptor.MockAccess);
        assertEquals(handler, mockMaker.getHandler(mock));
    }

    @Test
    public void should_create_mock_for_interface_with_extra_interfaces() {
        Set<Class> extraInterfaces = new HashSet<Class>();
        extraInterfaces.add(ExtraInterface.class);
        extraInterfaces.add(Serializable.class);

        DummySettings<SampleInterface> settings = new DummySettings<SampleInterface>(
                SampleInterface.class, extraInterfaces, SerializableMode.NONE
        );
        DummyInternalMockHandler<SampleInterface> handler = new DummyInternalMockHandler<SampleInterface>(settings);

        SampleInterface mock = mockMaker.createMock(settings, handler);

        assertNotNull(mock);
        assertTrue(mock instanceof SampleInterface);
        assertTrue(mock instanceof ExtraInterface);
        assertTrue(mock instanceof Serializable);
        assertEquals(handler, mockMaker.getHandler(mock));
    }

    @Test(expected = MockitoException.class)
    public void should_throw_exception_when_serializable_across_classloaders_requested() {
        DummySettings<SampleClass> settings = new DummySettings<SampleClass>(
                SampleClass.class, Collections.<Class>emptySet(), SerializableMode.ACROSS_CLASSLOADERS
        );
        DummyInternalMockHandler<SampleClass> handler = new DummyInternalMockHandler<SampleClass>(settings);

        mockMaker.createMock(settings, handler);
    }

    @Test
    public void should_throw_exception_with_proper_message_when_handler_is_not_internal_mock_handler() {
        DummySettings<SampleClass> settings = new DummySettings<SampleClass>(SampleClass.class);
        CustomMockHandler nonInternalHandler = new CustomMockHandler();

        try {
            mockMaker.createMock(settings, nonInternalHandler);
            fail("Expected MockitoException to be thrown");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("At the moment you cannot provide own implementations of MockHandler"));
        }
    }

    @Test
    public void should_return_null_when_getting_handler_from_non_mock_or_null() {
        assertNull(mockMaker.getHandler(null));
        assertNull(mockMaker.getHandler("Regular String Object"));
        assertNull(mockMaker.getHandler(new Object()));
        assertNull(mockMaker.getHandler(new SampleClass()));
    }

    @Test
    public void should_reset_mock_handler_successfully() {
        DummySettings<SampleClass> settings = new DummySettings<SampleClass>(SampleClass.class);
        DummyInternalMockHandler<SampleClass> initialHandler = new DummyInternalMockHandler<SampleClass>(settings);

        SampleClass mock = mockMaker.createMock(settings, initialHandler);
        assertEquals(initialHandler, mockMaker.getHandler(mock));

        DummyInternalMockHandler<SampleClass> newHandler = new DummyInternalMockHandler<SampleClass>(settings);
        mockMaker.resetMock(mock, newHandler, settings);

        assertEquals(newHandler, mockMaker.getHandler(mock));
    }

    @Test(expected = MockitoException.class)
    public void should_throw_exception_when_resetting_mock_with_non_internal_handler() {
        DummySettings<SampleClass> settings = new DummySettings<SampleClass>(SampleClass.class);
        DummyInternalMockHandler<SampleClass> initialHandler = new DummyInternalMockHandler<SampleClass>(settings);

        SampleClass mock = mockMaker.createMock(settings, initialHandler);
        CustomMockHandler invalidHandler = new CustomMockHandler();

        mockMaker.resetMock(mock, invalidHandler, settings);
    }

    @Test(expected = ClassCastException.class)
    public void should_throw_exception_when_resetting_non_mock_object() {
        DummySettings<SampleClass> settings = new DummySettings<SampleClass>(SampleClass.class);
        DummyInternalMockHandler<SampleClass> handler = new DummyInternalMockHandler<SampleClass>(settings);

        mockMaker.resetMock(new Object(), handler, settings);
    }
}
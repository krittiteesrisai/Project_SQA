package org.mockito.internal.creation.bytebuddy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.creation.settings.CreationSettings; // คลาส concrete ที่มีอยู่จริงในโปรเจกต์ Mockito
import org.mockito.internal.handler.MockHandlerImpl;             // คลาส concrete ที่มีอยู่จริงในโปรเจกต์ Mockito
import org.mockito.invocation.Invocation;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.SerializableMode;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ByteBuddyMockMakerTest {

    private ByteBuddyMockMaker mockMaker;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // คลาสง่าย ๆ ไม่มี final เพื่อให้ ByteBuddy สามารถสร้าง subclass ได้
    public static class SampleClass {
        public SampleClass() { }
        public String foo() { return "real"; }
    }

    public interface ExtraInterface {
        String bar();
    }

    @Before
    public void setUp() {
        mockMaker = new ByteBuddyMockMaker();
    }

    private CreationSettings<SampleClass> newSettings() {
        CreationSettings<SampleClass> settings = new CreationSettings<SampleClass>();
        settings.setTypeToMock(SampleClass.class);
        settings.setExtraInterfaces(new HashSet<Class<?>>());
        return settings;
    }

    // =========================================================
    // Constructor
    // =========================================================

    @Test
    public void constructor_initializesFieldsProperly() throws Exception {
        // ครอบคลุม branch "success" ของ initializeClassInstantiator()
        // (branch "catch(Throwable)" ไม่สามารถบังคับให้เกิดได้ง่ายในสภาพแวดล้อมทดสอบ
        //  เพราะต้องทำให้ reflection โหลดคลาส ClassInstantiator$UsingObjenesis ล้มเหลวจริง ๆ)
        Field classInstantiatorField = ByteBuddyMockMaker.class.getDeclaredField("classInstantiator");
        classInstantiatorField.setAccessible(true);
        assertNotNull(classInstantiatorField.get(mockMaker));

        Field generatorField = ByteBuddyMockMaker.class.getDeclaredField("cachingMockBytecodeGenerator");
        generatorField.setAccessible(true);
        assertNotNull(generatorField.get(mockMaker));
    }

    // =========================================================
    // createMock()
    // =========================================================

    @Test
    public void createMock_throwsMockitoException_whenSerializableModeIsAcrossClassloaders() {
        CreationSettings<SampleClass> settings = newSettings();
        settings.setSerializableMode(SerializableMode.ACROSS_CLASSLOADERS);

        thrown.expect(MockitoException.class);
        thrown.expectMessage("Serialization across classloaders not yet supported");

        mockMaker.createMock(settings, null);
    }

    @Test
    public void createMock_returnsWorkingMockInstance_forNormalClass() {
        CreationSettings<SampleClass> settings = newSettings();
        InternalMockHandler handler = new MockHandlerImpl(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);

        assertNotNull(mock);
        assertTrue(mock instanceof SampleClass);
        assertTrue(mock instanceof MockMethodInterceptor.MockAccess);
    }

    @Test
    public void createMock_withExtraInterfaces_mockImplementsExtraInterface() {
        CreationSettings<SampleClass> settings = newSettings();
        Set<Class<?>> extra = new HashSet<Class<?>>();
        extra.add(ExtraInterface.class);
        settings.setExtraInterfaces(extra);
        InternalMockHandler handler = new MockHandlerImpl(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);

        assertNotNull(mock);
        assertTrue(mock instanceof ExtraInterface);
    }

    @Test
    public void createMock_throwsMockitoException_whenHandlerIsNotInternalMockHandler() {
        CreationSettings<SampleClass> settings = newSettings();
        // สมมติ signature ของ MockHandler.handle(Invocation) ตาม Mockito API ที่เป็นที่รู้กันทั่วไป
        MockHandler notInternal = new MockHandler() {
            public Object handle(Invocation invocation) throws Throwable {
                return null;
            }
        };

        thrown.expect(MockitoException.class);
        thrown.expectMessage("cannot provide own implementations of MockHandler");

        mockMaker.createMock(settings, notInternal);
    }

    @Test
    public void createMock_throwsMockitoException_whenHandlerIsNull() {
        CreationSettings<SampleClass> settings = newSettings();

        thrown.expect(MockitoException.class);

        mockMaker.createMock(settings, null);
    }

    // หมายเหตุ: catch(ClassCastException) และ catch(InstantiationException) ใน createMock()
    // ไม่สามารถบังคับให้เกิดผ่าน public API ได้ง่าย เนื่องจาก CachingMockBytecodeGenerator
    // จะสร้าง proxy type ที่เป็น subtype ของ typeToMock เสมอ และ Objenesis จะ bypass constructor
    // ได้เกือบทุกกรณี จึงทดสอบ logic ของ ensureMockIsAssignableToMockedType โดยตรงผ่าน reflection ด้านล่างแทน

    // =========================================================
    // getHandler()
    // =========================================================

    @Test
    public void getHandler_returnsNull_whenMockIsNotMockAccessInstance() {
        assertNull(mockMaker.getHandler("not a mock"));
    }

    @Test
    public void getHandler_returnsNull_whenMockIsNull() {
        // null instanceof MockAccess == false -> branch เดียวกันกับด้านบน แต่ทดสอบ edge case ค่า null
        assertNull(mockMaker.getHandler(null));
    }

    @Test
    public void getHandler_returnsHandler_whenMockIsMockAccessInstance() {
        CreationSettings<SampleClass> settings = newSettings();
        InternalMockHandler handler = new MockHandlerImpl(settings);
        SampleClass mock = mockMaker.createMock(settings, handler);

        MockHandler returned = mockMaker.getHandler(mock);

        assertNotNull(returned);
    }

    // =========================================================
    // resetMock()
    // =========================================================

    @Test
    public void resetMock_setsNewHandlerSuccessfully() {
        CreationSettings<SampleClass> settings = newSettings();
        InternalMockHandler handler = new MockHandlerImpl(settings);
        SampleClass mock = mockMaker.createMock(settings, handler);

        InternalMockHandler newHandler = new MockHandlerImpl(settings);
        mockMaker.resetMock(mock, newHandler, settings);

        MockHandler afterReset = mockMaker.getHandler(mock);
        // สมมติว่า getMockHandler() ของ MockMethodInterceptor คืนค่า handler ตัวเดิมที่ถูกเซ็ต
        assertSame(newHandler, afterReset);
    }

    @Test
    public void resetMock_throwsMockitoException_whenNewHandlerIsNotInternal() {
        CreationSettings<SampleClass> settings = newSettings();
        InternalMockHandler handler = new MockHandlerImpl(settings);
        SampleClass mock = mockMaker.createMock(settings, handler);

        MockHandler notInternal = new MockHandler() {
            public Object handle(Invocation invocation) throws Throwable {
                return null;
            }
        };

        thrown.expect(MockitoException.class);
        mockMaker.resetMock(mock, notInternal, settings);
    }

    @Test
    public void resetMock_throwsMockitoException_whenNewHandlerIsNull() {
        CreationSettings<SampleClass> settings = newSettings();
        InternalMockHandler handler = new MockHandlerImpl(settings);
        SampleClass mock = mockMaker.createMock(settings, handler);

        thrown.expect(MockitoException.class);
        mockMaker.resetMock(mock, null, settings);
    }

    // =========================================================
    // private: describeClass(Class) via reflection
    // =========================================================

    @Test
    public void describeClassForClass_returnsNullString_whenTypeIsNull() throws Exception {
        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("describeClass", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(null, new Object[]{null});
        assertEquals("null", result);
    }

    @Test
    public void describeClassForClass_returnsDescription_whenTypeIsNotNull() throws Exception {
        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("describeClass", Class.class);
        m.setAccessible(true);
        Object result = m.invoke(null, new Object[]{SampleClass.class});
        assertTrue(((String) result).contains("SampleClass"));
    }

    // =========================================================
    // private: describeClass(Object) via reflection
    // =========================================================

    @Test
    public void describeClassForObject_returnsNullString_whenInstanceIsNull() throws Exception {
        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("describeClass", Object.class);
        m.setAccessible(true);
        Object result = m.invoke(null, new Object[]{null});
        assertEquals("null", result);
    }

    @Test
    public void describeClassForObject_returnsDescription_whenInstanceIsNotNull() throws Exception {
        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("describeClass", Object.class);
        m.setAccessible(true);
        Object result = m.invoke(null, new Object[]{new SampleClass()});
        assertTrue(((String) result).contains("SampleClass"));
    }

    // =========================================================
    // private: ensureMockIsAssignableToMockedType via reflection
    // =========================================================

    @Test
    public void ensureMockIsAssignableToMockedType_returnsCastInstance_whenAssignable() throws Exception {
        CreationSettings<SampleClass> settings = newSettings();
        SampleClass instance = new SampleClass();

        Method m = ByteBuddyMockMaker.class.getDeclaredMethod(
                "ensureMockIsAssignableToMockedType", MockCreationSettings.class, Object.class);
        m.setAccessible(true);

        Object result = m.invoke(mockMaker, settings, instance);
        assertSame(instance, result);
    }

    @Test
    public void ensureMockIsAssignableToMockedType_throwsClassCastException_whenNotAssignable() throws Exception {
        CreationSettings<SampleClass> settings = newSettings();
        Object notAssignable = "a plain string, not a SampleClass";

        Method m = ByteBuddyMockMaker.class.getDeclaredMethod(
                "ensureMockIsAssignableToMockedType", MockCreationSettings.class, Object.class);
        m.setAccessible(true);

        try {
            m.invoke(mockMaker, settings, notAssignable);
            fail("Expected ClassCastException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof ClassCastException);
        }
    }

    // =========================================================
    // private static: asInternalMockHandler via reflection
    // =========================================================

    @Test
    public void asInternalMockHandler_returnsHandler_whenInternal() throws Exception {
        CreationSettings<SampleClass> settings = newSettings();
        InternalMockHandler handler = new MockHandlerImpl(settings);

        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("asInternalMockHandler", MockHandler.class);
        m.setAccessible(true);

        Object result = m.invoke(null, handler);
        assertSame(handler, result);
    }

    @Test
    public void asInternalMockHandler_throwsException_whenNotInternal() throws Exception {
        MockHandler notInternal = new MockHandler() {
            public Object handle(Invocation invocation) throws Throwable {
                return null;
            }
        };

        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("asInternalMockHandler", MockHandler.class);
        m.setAccessible(true);

        try {
            m.invoke(null, notInternal);
            fail("Expected MockitoException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof MockitoException);
        }
    }

    @Test
    public void asInternalMockHandler_throwsException_whenHandlerIsNull() throws Exception {
        Method m = ByteBuddyMockMaker.class.getDeclaredMethod("asInternalMockHandler", MockHandler.class);
        m.setAccessible(true);

        try {
            m.invoke(null, new Object[]{null});
            fail("Expected MockitoException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof MockitoException);
        }
    }
}

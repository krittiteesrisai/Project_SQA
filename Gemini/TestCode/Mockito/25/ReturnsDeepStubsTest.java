package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockCreationValidator;
import org.mockito.invocation.InvocationOnMock;

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

    // Interfaces และ Classes สำหรับจำลองสถานการณ์ทดสอบ
    interface Level3 {
        String getFinalValue();
        int getPrimitiveInt();
        final class FinalNestedClass {}
        FinalNestedClass getFinalClass();
    }

    interface Level2 {
        Level3 getLevel3();
        Level3 getLevel3WithArg(String key);
    }

    interface Level1 {
        Level2 getLevel2();
        String getName();
        int[] getIntArray();
        void doNothing();
    }

    interface GenericContainer<T, N extends Number> {
        T getFirst();
        N getNumber();
        List<T> getList();
        Map<String, Set<T>> getNestedMap();
    }

    interface DeepGenericsHierarchy extends GenericContainer<Level2, Integer> {
    }

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
    }

    /**
     * Branch 1: ทดสอบกรณี Non-mockable return type (Primitive, Final, Array, String)
     */
    @Test
    public void shouldReturnEmptyValuesForNonMockableTypes() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        // String (Final class)
        assertEquals("", mock.getName());

        // Array
        assertNotNull(mock.getIntArray());
        assertEquals(0, mock.getIntArray().length);

        // Chained non-mockable types
        assertEquals("", mock.getLevel2().getLevel3().getFinalValue());
        assertEquals(0, mock.getLevel2().getLevel3().getPrimitiveInt());
        assertNull(mock.getLevel2().getLevel3().getFinalClass());
    }

    /**
     * Branch 2 & 4: ทดสอบกรณี Mockable return type ที่เพิ่งถูกเรียกครั้งแรก (สร้าง Deep Mock ใหม่)
     */
    @Test
    public void shouldCreateNewMockForMockableReturnType() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        Level2 level2 = mock.getLevel2();
        assertNotNull(level2);
        assertTrue(new MockCreationValidator().isTypeMockable(Level2.class));

        Level3 level3 = level2.getLevel3();
        assertNotNull(level3);
        assertTrue(new MockCreationValidator().isTypeMockable(Level3.class));
    }

    /**
     * Branch 3: ทดสอบการคืนค่า Mock เดิมเมื่อเกิด Invocation ที่ตรงกับที่เคย Stub/บันทึกไว้
     */
    @Test
    public void shouldReturnSameMockInstanceForIdenticalInvocations() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        Level2 firstCall = mock.getLevel2();
        Level2 secondCall = mock.getLevel2();

        assertSame("Should return the exact same mock instance across calls", firstCall, secondCall);

        Level3 callWithArg1 = firstCall.getLevel3WithArg("paramA");
        Level3 callWithArg1Repeat = firstCall.getLevel3WithArg("paramA");
        Level3 callWithArg2 = firstCall.getLevel3WithArg("paramB");

        assertSame(callWithArg1, callWithArg1Repeat);
        assertNotSame("Different arguments should produce different mock instances", callWithArg1, callWithArg2);
    }

    /**
     * ทดสอบการ Override ค่า Deep Stub ด้วยการใช้ when(...).thenReturn(...)
     */
    @Test
    public void shouldAllowExplicitStubbingToOverrideDeepStub() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        when(mock.getLevel2().getLevel3().getFinalValue()).thenReturn("custom-value");
        assertEquals("custom-value", mock.getLevel2().getLevel3().getFinalValue());

        Level3 customLevel3 = mock(Level3.class);
        when(mock.getLevel2().getLevel3()).thenReturn(customLevel3);
        assertSame(customLevel3, mock.getLevel2().getLevel3());
    }

    /**
     * Generic Type Resolution: ทดสอบ Generics ซับซ้อนและการแปลงค่า Type Parameter
     */
    @Test
    public void shouldResolveGenericTypesCorrectlyInChainedMocks() {
        DeepGenericsHierarchy mock = mock(DeepGenericsHierarchy.class, returnsDeepStubs);

        // T -> Level2
        Level2 level2 = mock.getFirst();
        assertNotNull(level2);
        assertNotNull(level2.getLevel3());

        // N -> Integer (Non-mockable -> Returns 0)
        assertEquals(Integer.valueOf(0), mock.getNumber());

        // Nested List -> List mock
        List<Level2> list = mock.getList();
        assertNotNull(list);
        assertNotNull(list.iterator());

        // Map<String, Set<Level2>>
        Map<String, Set<Level2>> nestedMap = mock.getNestedMap();
        assertNotNull(nestedMap);
        Set<Level2> set = nestedMap.get("key");
        assertNotNull(set);
        Iterator<Level2> iterator = set.iterator();
        assertNotNull(iterator);
    }

    /**
     * Edge Case: Serialization & Deserialization ของ ReturnsDeepStubs
     */
    @Test
    public void shouldBeSerializable() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsDeepStubs);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsDeepStubs);
    }

    /**
     * Edge Case: ส่ง Invocation ที่ไม่ถูกต้อง หรือ Invocation บน Object ที่ไม่ใช่ Mockito Mock
     */
    @Test(expected = MockitoException.class)
    public void shouldThrowExceptionWhenMockIsNotMockitoMock() throws Throwable {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMock()).thenReturn(new Object()); // Raw non-mock instance

        returnsDeepStubs.actualParameterizedType(new Object());
    }
}
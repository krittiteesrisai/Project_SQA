package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import org.junit.Test;
import org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs;
import org.mockito.internal.util.MockUtil;

public class ReturnsDeepStubsTest {

    // ---------- Fixtures ----------

    interface SampleBase {
        SampleBase getNext();      // mockable return type -> deep stub branch
        String getName();          // final class, not mockable -> delegate branch (String)
        int getNumber();            // primitive, not mockable -> delegate branch (int)
        List<String> getList();     // mockable interface -> deep stub branch (collection)
    }

    interface SampleGeneric<K> {
        K getGenericValue();        // unresolved generic -> resolves to Object (mockable)
    }

    // K extends Comparable<K> & Serializable -> rawType=Comparable, extra interface=Serializable
    interface MultiBound<K extends Comparable<K> & Serializable> {
        K getValue();
    }

    // ---------- answer(): branch "!isTypeMockable(rawType)" => true (delegate) ----------

    @Test
    public void shouldReturnEmptyStringWhenReturnTypeIsFinalAndNotMockable() {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        // String เป็น final class -> isTypeMockable=false -> delegate().returnValueFor(String.class)
        assertEquals("", mock.getName());
    }

    @Test
    public void shouldReturnPrimitiveDefaultWhenReturnTypeIsPrimitive() {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        // int เป็น primitive -> isTypeMockable=false -> delegate().returnValueFor(int.class) == 0
        assertEquals(0, mock.getNumber());
    }

    // ---------- answer(): branch "!isTypeMockable(rawType)" => false (deepStub) ----------

    @Test
    public void shouldCreateDeepStubMockWhenReturnTypeIsMockable() {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase next = mock.getNext();
        assertNotNull(next);
        assertTrue(new MockUtil().isMock(next));
    }

    @Test
    public void shouldReturnSameCachedDeepStubMockOnSecondInvocation() {
        // ทดสอบ loop ใน deepStub(): ครั้งแรกไม่มี stubbedInvocations -> record ใหม่
        // ครั้งที่สอง loop เจอ match -> คืน answer เดิม (ไม่สร้าง mock ใหม่)
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase next1 = mock.getNext();
        SampleBase next2 = mock.getNext();
        assertSame(next1, next2);
    }

    @Test
    public void shouldSupportNestedDeepStubsAcrossMultipleLevels() {
        // ทดสอบ actualParameterizedType() override ผ่าน ReturnsDeepStubsSerializationFallback
        // ซึ่งถูกตั้งเป็น defaultAnswer ของ mock ที่สร้างในระดับที่สอง
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase level2 = mock.getNext();
        SampleBase level3 = level2.getNext();
        assertNotNull(level3);
        assertTrue(new MockUtil().isMock(level3));
    }

    @Test
    public void shouldCreateDeepStubForGenericCollectionReturnType() {
        // List เป็น interface -> mockable -> สร้าง deep stub mock แทน delegate's empty list
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        List<String> list = mock.getList();
        assertNotNull(list);
        assertTrue(new MockUtil().isMock(list));
    }

    // ---------- deepStub(): branch "match ใน stubbedInvocations" (user-defined stub) ----------

    @Test
    public void shouldHonorExistingUserStubbingOverAutoDeepStub() {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase stubbedNext = mock(SampleBase.class);
        when(mock.getNext()).thenReturn(stubbedNext);

        // loop ใน deepStub() ต้องเจอ stubbing นี้ก่อน แล้วคืนค่าที่ user กำหนด
        // ไม่ใช่ deep stub ที่ framework สร้างขึ้นเอง
        assertSame(stubbedNext, mock.getNext());
        assertSame(stubbedNext, mock.getNext()); // เรียกซ้ำ ยังต้อง match เดิมเสมอ
    }

    // ---------- withSettingsUsing(): branch hasRawExtraInterfaces() == false ----------

    @Test
    public void shouldNotAddExtraInterfacesWhenGenericHasSingleBound() {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase next = mock.getNext();
        // ไม่ควร implement interface อื่นนอกจาก SampleBase/ Mockito internals
        assertFalse(next instanceof Comparable);
    }

    // ---------- withSettingsUsing(): branch hasRawExtraInterfaces() == true ----------

    @Test
    public void shouldAddExtraInterfacesWhenGenericHasMultipleBounds() {
        @SuppressWarnings("unchecked")
        MultiBound<?> mock = mock(MultiBound.class, new ReturnsDeepStubs());
        Object value = mock.getValue();
        assertNotNull(value);
        assertTrue(new MockUtil().isMock(value));
        // K extends Comparable<K> & Serializable -> extraInterfaces ควรรวม Serializable
        assertTrue(value instanceof Serializable);
    }

    @Test
    public void shouldResolveUnresolvedGenericAsMockableObject() {
        // K ไม่ถูก bind -> resolve เป็น Object.class ซึ่ง mockable
        @SuppressWarnings("unchecked")
        SampleGeneric<Object> mock = mock(SampleGeneric.class, new ReturnsDeepStubs());
        Object value = mock.getGenericValue();
        assertNotNull(value);
        assertTrue(new MockUtil().isMock(value));
    }

    // ---------- Serializable deep stub mock: ReturnsDeepStubsSerializationFallback.writeReplace() ----------

    @Test
    public void shouldCreateSerializableDeepStubMockWithWriteReplaceFallback() throws Exception {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase next = mock.getNext();
        assertTrue(new MockUtil().isMock(next));

        // withSettingsUsing() เรียก mockSettings.serializable() เสมอ
        // และ defaultAnswer เป็น ReturnsDeepStubsSerializationFallback ซึ่งมี writeReplace()
        // คืนค่า Mockito.RETURNS_DEEP_STUBS -> ต้อง serialize ได้โดยไม่ throw exception
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(next);
        oos.flush();
        oos.close();

        assertTrue(baos.toByteArray().length > 0);
    }

    // ---------- Boundary: เรียกหลาย method ติดกันบน mock เดียว เพื่อยืนยัน container เก็บ stub หลายตัว ----------

    @Test
    public void shouldHandleMultipleDistinctStubbedInvocationsOnSameMock() {
        SampleBase mock = mock(SampleBase.class, new ReturnsDeepStubs());
        SampleBase next = mock.getNext();
        List<String> list = mock.getList();

        // แต่ละ invocation ต้องถูกจับคู่กับ answer ของตัวเอง ไม่ปนกัน
        assertNotSame(next, list);
        assertSame(next, mock.getNext());
        assertSame(list, mock.getList());
    }
}

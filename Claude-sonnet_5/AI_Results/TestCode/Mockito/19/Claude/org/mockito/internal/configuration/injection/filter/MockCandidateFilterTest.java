package org.mockito.internal.configuration.injection.filter;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

/**
 * หมายเหตุ:
 * MockCandidateFilter เป็น interface ล้วน ๆ ไม่มี method body/if-else/loop
 * ดังนั้นไม่มี branch จริงให้ cover ภายในคลาสนี้เอง
 * เทสชุดนี้จึงทดสอบ "contract" ของ interface ผ่าน test double ที่สร้างขึ้นเอง
 * เพื่อยืนยันว่า signature ของ method รับ/ส่งพารามิเตอร์ได้ถูกต้องตามที่ประกาศไว้
 * และครอบคลุมกรณี boundary/null ของพารามิเตอร์แต่ละตัว
 *
 * สำหรับ OngoingInjecter: ไม่มีซอร์สโค้ดให้ในโจทย์ จึงไม่ instantiate
 * concrete implementation ใด ๆ ของมัน ใช้เพียง null เป็นค่า return
 * เพื่อหลีกเลี่ยงการเดา behavior ที่ไม่มีหลักฐาน
 */
public class MockCandidateFilterTest {

    /** คลาสตัวอย่างสำหรับดึง java.lang.reflect.Field จริงผ่าน reflection */
    private static class SampleBean {
        @SuppressWarnings("unused")
        private Object injectedField;
    }

    private Field sampleField;

    @Before
    public void setUp() throws Exception {
        sampleField = SampleBean.class.getDeclaredField("injectedField");
    }

    /**
     * Stub implementation ที่บันทึกค่าพารามิเตอร์ที่ได้รับ และคืนค่า null เสมอ
     * (ไม่ guess ว่า implementation จริงควรคืนค่าอะไร)
     */
    private static class StubAlwaysNullFilter implements MockCandidateFilter {
        Collection<Object> receivedMocks;
        Field receivedField;
        Object receivedInstance;

        @Override
        public OngoingInjecter filterCandidate(Collection<Object> mocks,
                                                Field fieldToBeInjected,
                                                Object fieldInstance) {
            this.receivedMocks = mocks;
            this.receivedField = fieldToBeInjected;
            this.receivedInstance = fieldInstance;
            return null;
        }
    }

    @Test
    public void shouldAcceptEmptyMockCollection() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        Collection<Object> mocks = Collections.emptyList();
        SampleBean instance = new SampleBean();

        OngoingInjecter result = filter.filterCandidate(mocks, sampleField, instance);

        assertNull(result);
        assertSame(mocks, filter.receivedMocks);
        assertTrue(filter.receivedMocks.isEmpty());
        assertSame(sampleField, filter.receivedField);
        assertSame(instance, filter.receivedInstance);
    }

    @Test
    public void shouldAcceptNullMockCollection() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        SampleBean instance = new SampleBean();

        OngoingInjecter result = filter.filterCandidate(null, sampleField, instance);

        assertNull(result);
        assertNull(filter.receivedMocks);
        assertSame(sampleField, filter.receivedField);
        assertSame(instance, filter.receivedInstance);
    }

    @Test
    public void shouldAcceptSingleMockInCollection() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        Object mock = new Object();
        mocks.add(mock);
        SampleBean instance = new SampleBean();

        filter.filterCandidate(mocks, sampleField, instance);

        assertEquals(1, filter.receivedMocks.size());
        assertSame(mock, filter.receivedMocks.iterator().next());
    }

    @Test
    public void shouldAcceptMultipleMocksInCollection() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());
        mocks.add(new Object());
        mocks.add(new Object());
        SampleBean instance = new SampleBean();

        filter.filterCandidate(mocks, sampleField, instance);

        assertEquals(3, filter.receivedMocks.size());
    }

    @Test
    public void shouldAcceptNullField() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        Collection<Object> mocks = Collections.emptyList();
        SampleBean instance = new SampleBean();

        filter.filterCandidate(mocks, null, instance);

        assertNull(filter.receivedField);
    }

    @Test
    public void shouldAcceptNullFieldInstance() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        Collection<Object> mocks = Collections.emptyList();

        filter.filterCandidate(mocks, sampleField, null);

        assertNull(filter.receivedInstance);
    }

    @Test
    public void shouldAcceptAllArgumentsNull() {
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();

        OngoingInjecter result = filter.filterCandidate(null, null, null);

        assertNull(result);
        assertNull(filter.receivedMocks);
        assertNull(filter.receivedField);
        assertNull(filter.receivedInstance);
    }

    @Test
    public void shouldAcceptArbitraryObjectAsFieldInstance() {
        // กรณี fieldInstance เป็นชนิด Object ทั่วไป (ไม่ใช่ SampleBean) -> boundary ของชนิดข้อมูล
        StubAlwaysNullFilter filter = new StubAlwaysNullFilter();
        Collection<Object> mocks = Collections.singletonList(new Object());
        Object genericInstance = new Object();

        filter.filterCandidate(mocks, sampleField, genericInstance);

        assertSame(genericInstance, filter.receivedInstance);
    }
}

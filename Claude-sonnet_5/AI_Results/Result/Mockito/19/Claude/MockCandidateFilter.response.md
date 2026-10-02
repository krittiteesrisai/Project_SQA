## การวิเคราะห์ก่อนเขียนเทส

**ข้อสังเกตสำคัญ:** คลาสเป้าหมาย `MockCandidateFilter` ที่ให้มาเป็น **interface** ที่มีเพียง method signature (`filterCandidate`) โดย**ไม่มี method body, if/else, หรือ loop ใด ๆ อยู่ในซอร์สโค้ดเลย** ดังนั้นในทางเทคนิคจึง**ไม่มี branch/condition จริงให้ cover** ภายในคลาสนี้

เพื่อให้สามารถเขียน unit test ที่ compile/รันได้จริง และยังทดสอบ "contract" ของ interface (parameter handling, boundary ของ input) จึงสร้าง **test double (Stub)** ที่ implement interface นี้เองภายในไฟล์ทดสอบ โดย:
- ไม่ guess behavior ของ implementation จริงใน Mockito (เช่น `TypeBasedCandidateFilter`) เพราะไม่มีซอร์สโค้ดให้
- ไม่ instantiate `OngoingInjecter` แบบ concrete เพราะไม่รู้ method signature จริงของมัน (ไม่ได้ให้มาในโจทย์) → ใช้ `null` เป็น return value เท่านั้น เพื่อไม่ละเมิดข้อ 4

```java
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
```

## สรุปตาราง Coverage

| Test Method | สิ่งที่ครอบคลุม / เหตุผล |
|---|---|
| `shouldAcceptEmptyMockCollection` | boundary: collection ว่าง (`size=0`), ตรวจสอบพารามิเตอร์ทั้ง 3 ถูกส่งผ่านตรงตาม reference |
| `shouldAcceptNullMockCollection` | null input: พารามิเตอร์ `mocks` เป็น null |
| `shouldAcceptSingleMockInCollection` | boundary: collection มีสมาชิก 1 ตัว (`size=1`) |
| `shouldAcceptMultipleMocksInCollection` | กรณี collection มีหลายสมาชิก (`size=3`) จำลองสถานการณ์ loop ที่ implementation จริงอาจ iterate |
| `shouldAcceptNullField` | null input: พารามิเตอร์ `fieldToBeInjected` เป็น null |
| `shouldAcceptNullFieldInstance` | null input: พารามิเตอร์ `fieldInstance` เป็น null |
| `shouldAcceptAllArgumentsNull` | edge case: ทุกพารามิเตอร์เป็น null พร้อมกัน |
| `shouldAcceptArbitraryObjectAsFieldInstance` | อินพุตผิดรูปแบบ/ชนิดทั่วไป: `fieldInstance` เป็น `Object` ธรรมดาแทน type ที่คาดไว้ |

**หมายเหตุปิดท้าย:** เนื่องจาก `MockCandidateFilter` เป็น interface ที่ไม่มี logic ภายใน (ไม่มี if/else/loop ในซอร์สที่ให้มา) จึงไม่มี branch ที่สามารถ "miss" ได้จริงในแง่ของ tool coverage บน method `filterCandidate` เอง — เทสชุดนี้จึงเน้นทดสอบ **contract/signature correctness** ผ่าน test double ให้ครอบคลุมทุกรูปแบบอินพุต (null, empty, single, multiple, arbitrary type) ตามที่ระบุไว้ในข้อกำหนด โดยไม่เดา behavior ของ implementation จริงที่ไม่มีซอร์สโค้ดให้
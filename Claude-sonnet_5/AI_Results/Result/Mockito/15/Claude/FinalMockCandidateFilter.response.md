# JUnit 4 Test Suite สำหรับ `FinalMockCandidateFilter`

## การวิเคราะห์โค้ด

จากซอร์สโค้ด มี branch หลักดังนี้:
1. `if(mocks.size() == 1)` → true/false
2. ภายใน `thenInject()` ของกรณี size==1 มี `try/catch` → success path / exception path
3. กรณี size != 1 (0 หรือ >1) → `thenInject()` คืน `false` เสมอ

```java
package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Unit test สำหรับ FinalMockCandidateFilter (Defects4J: Mockito-15b)
 * ครอบคลุม branch: mocks.size()==1 (true/false), try/catch ภายใน thenInject()
 */
public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;

    @Before
    public void setUp() {
        filter = new FinalMockCandidateFilter();
    }

    // ---------- Fixture classes ----------

    /** คลาสที่มี setter -> ใช้ทดสอบ path "property setter" ของ FieldSetter */
    static class SimpleFieldHolder {
        private String stringField;

        public void setStringField(String stringField) {
            this.stringField = stringField;
        }

        public String getStringField() {
            return stringField;
        }
    }

    /** คลาสที่ไม่มี setter และชนิดข้อมูลไม่ตรงกับ mock -> ใช้บังคับให้เกิด exception */
    static class TypeMismatchHolder {
        private Integer intField;

        public Integer getIntField() {
            return intField;
        }
    }

    // ---------- Boundary: empty collection (size == 0) ----------

    @Test
    public void shouldReturnFalseInjecterWhenMocksCollectionIsEmpty() throws Exception {
        Collection<Object> mocks = Collections.emptyList();
        Field field = SimpleFieldHolder.class.getDeclaredField("stringField");
        SimpleFieldHolder fieldInstance = new SimpleFieldHolder();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertFalse(result);
        assertNull(fieldInstance.getStringField()); // ไม่มีการ inject เกิดขึ้น
    }

    // ---------- Boundary: multiple candidates (size > 1) ----------

    @Test
    public void shouldReturnFalseInjecterWhenMocksCollectionHasMoreThanOneElement() throws Exception {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mock1");
        mocks.add("mock2");

        Field field = SimpleFieldHolder.class.getDeclaredField("stringField");
        SimpleFieldHolder fieldInstance = new SimpleFieldHolder();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertFalse(result);
        assertNull(fieldInstance.getStringField());
    }

    // ---------- size == 1: successful injection (try path, no exception) ----------

    @Test
    public void shouldInjectSuccessfullyWhenSingleMatchingMock() throws Exception {
        String mockValue = "theMockValue";
        Collection<Object> mocks = Collections.singletonList((Object) mockValue);

        Field field = SimpleFieldHolder.class.getDeclaredField("stringField");
        SimpleFieldHolder fieldInstance = new SimpleFieldHolder();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertTrue(result);
        assertEquals(mockValue, fieldInstance.getStringField());
    }

    // ---------- size == 1: injection fails -> catch block + MockitoException ----------

    @Test
    public void shouldThrowMockitoExceptionWhenInjectionFailsDueToTypeMismatch() throws Exception {
        // ใส่ String ให้ field ที่ประกาศเป็น Integer เพื่อบังคับให้ FieldSetter โยน exception
        String incompatibleMock = "notAnInteger";
        Collection<Object> mocks = Collections.singletonList((Object) incompatibleMock);

        Field field = TypeMismatchHolder.class.getDeclaredField("intField");
        TypeMismatchHolder fieldInstance = new TypeMismatchHolder();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(injecter);
        try {
            injecter.thenInject();
            fail("คาดหวังว่าจะโยน MockitoException เนื่องจากชนิดข้อมูลไม่ตรงกัน");
        } catch (MockitoException e) {
            // ข้อความควรมีชื่อ field ตามโค้ด: "Problems injecting dependency in " + field.getName()
            assertTrue(e.getMessage().contains("intField"));
        }
        assertNull(fieldInstance.getIntField()); // ไม่ควรมีการตั้งค่าใด ๆ เมื่อเกิด exception
    }

    // ---------- size == 1: boundary - mock เป็น null ----------

    @Test
    public void shouldHandleSingleNullMockInCollection() throws Exception {
        // ทดสอบกรณีขอบเขต: collection มีขนาด 1 แต่ค่าภายในเป็น null
        Collection<Object> mocks = Collections.singletonList((Object) null);

        Field field = SimpleFieldHolder.class.getDeclaredField("stringField");
        SimpleFieldHolder fieldInstance = new SimpleFieldHolder();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertTrue(result); // ยัง return true เพราะไม่มี exception เกิดขึ้นจากการ set null
        assertNull(fieldInstance.getStringField());
    }

    // ---------- Sanity: ตรวจว่าแต่ละ call คืน OngoingInjecter ใหม่ (ไม่ throw ก่อนเรียก thenInject) ----------

    @Test
    public void filterCandidateShouldNotThrowBeforeThenInjectIsCalled() throws Exception {
        // ตรวจสอบว่าการสร้าง injecter ไม่ throw exception ทันที แม้ field/mock จะไม่ compatible
        Collection<Object> mocks = Collections.singletonList((Object) "incompatibleMock");
        Field field = TypeMismatchHolder.class.getDeclaredField("intField");
        TypeMismatchHolder fieldInstance = new TypeMismatchHolder();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, fieldInstance);
        assertNotNull(injecter); // ควรสร้างได้สำเร็จ exception จะเกิดเมื่อ thenInject() ถูกเรียกเท่านั้น
    }
}
```

## สรุปตาราง Coverage

| ชื่อเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `shouldReturnFalseInjecterWhenMocksCollectionIsEmpty` | `mocks.size() == 1` → **false** (size=0), ตรวจ `thenInject()` คืน `false`, ไม่มีการ inject |
| `shouldReturnFalseInjecterWhenMocksCollectionHasMoreThanOneElement` | `mocks.size() == 1` → **false** (size=2), ตรวจ `thenInject()` คืน `false` |
| `shouldInjectSuccessfullyWhenSingleMatchingMock` | `mocks.size() == 1` → **true**, path `try` สำเร็จ (ไม่มี exception), `thenInject()` คืน `true`, ค่าถูก set ถูกต้อง |
| `shouldThrowMockitoExceptionWhenInjectionFailsDueToTypeMismatch` | `mocks.size() == 1` → **true**, path `catch (Exception e)` ถูก trigger, ตรวจ `MockitoException` และข้อความ error ถูกครอบ (wrap) ถูกต้อง |
| `shouldHandleSingleNullMockInCollection` | `mocks.size() == 1` → **true** (boundary: ค่า mock เป็น `null`), path `try` สำเร็จ, ตรวจไม่เกิด exception เมื่อ set null |
| `filterCandidateShouldNotThrowBeforeThenInjectIsCalled` | ตรวจว่า method `filterCandidate` เอง (นอก `thenInject()`) ไม่โยน exception แม้ input จะไม่ compatible — แยก responsibility ของ object creation กับ lazy execution |

**หมายเหตุ:**
- การทดสอบ exception path (`TypeMismatchHolder`) อิงจากสมมติฐานว่า `FieldSetter` จะพยายาม direct field access เมื่อไม่มี setter method ที่ตรงกัน และจะโยน `IllegalArgumentException`/`Exception` เมื่อชนิดข้อมูลไม่ตรงกัน — ถ้า `FieldSetter` มี logic พิเศษอื่น (เช่น type coercion) อาจต้องปรับ fixture class เพิ่มเติม
- ไม่ได้ mock `FieldSetter` เพราะไม่มี Mockito mocking framework อยู่ใน classpath ที่กำหนด (มีแต่ hamcrest, assertj, fest, objenesis, powermock-reflect) จึงทดสอบแบบ integration กับ reflection จริง
# วิเคราะห์โค้ดเป้าหมาย

จุดที่ต้อง cover:
1. `if (mocks.size() > 1)` — true/false branch
2. ภายใน loop: `if (field.getName().equals(mockUtil.getMockName(mock).toString()))` — true/false branch (รวมถึงกรณี match หลายตัว)
3. boundary: `mocks.size() == 1` (false boundary), `mocks.size() == 2` (true boundary ขั้นต่ำ)
4. กรณี null: `mocks == null`, `field == null`
5. fieldInstance ไม่ถูกใช้ใน logic เลย แต่ต้องถูกส่งผ่านไปยัง `next` อย่างถูกต้อง

หมายเหตุสำคัญ: เนื่องจากคลาสนี้เป็นส่วนหนึ่งของ source code ของ Mockito เอง (Defects4J Mockito-19b) classpath การ build/compile โปรเจกต์จะรวม class ของ Mockito ทั้งหมด (เช่น `org.mockito.Mockito`, `OngoingInjecter`, `MockCandidateFilter`) อยู่แล้ว โดย jar list ที่ให้มาเป็น dependency เสริมสำหรับ testing framework เท่านั้น จึงใช้ `org.mockito.Mockito.mock(...)` เพื่อสร้าง mock object จริงที่ `MockUtil` รู้จักได้ และใช้ `withSettings().name(...)` เพื่อกำหนดชื่อ mock อย่างชัดเจน ป้องกันการเดา default naming convention

```java
package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class NameBasedCandidateFilterTest {

    // คลาสช่วยสำหรับดึง Field object จริงด้วย reflection (field.getName() ต้องมาจาก field จริง)
    static class FieldsHolder {
        Object matchingField;
        Object sameNameA;
    }

    // Fake OngoingInjecter สำหรับใช้เป็นค่า return ของ stub filter ถัดไป
    static class FakeOngoingInjecter implements OngoingInjecter {
        public Object inject() {
            // ไม่มีการใช้งานค่านี้ในเทสต์นี้ จึง return null
            return null;
        }
    }

    // Stub ของ MockCandidateFilter ที่บันทึกค่า argument ที่ถูกเรียกเข้ามา
    static class RecordingFilter implements MockCandidateFilter {
        Collection<Object> capturedMocks;
        Field capturedField;
        Object capturedFieldInstance;
        final OngoingInjecter toReturn = new FakeOngoingInjecter();

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return toReturn;
        }
    }

    private RecordingFilter recordingFilter;
    private NameBasedCandidateFilter filter;

    @Before
    public void setUp() {
        recordingFilter = new RecordingFilter();
        filter = new NameBasedCandidateFilter(recordingFilter);
    }

    private Field fieldNamed(String name) throws NoSuchFieldException {
        return FieldsHolder.class.getDeclaredField(name);
    }

    @Test
    public void shouldDelegateDirectlyWhenMocksCollectionIsEmpty() throws Exception {
        // mocks.size() == 0 -> เงื่อนไข mocks.size() > 1 เป็น false
        Collection<Object> mocks = new ArrayList<Object>();
        Field field = fieldNamed("matchingField");
        Object fieldInstance = new Object();

        OngoingInjecter result = filter.filterCandidate(mocks, field, fieldInstance);

        // ต้อง pass original mocks (ไม่ใช่ mockNameMatches) ไปที่ next โดยตรง
        assertSame(mocks, recordingFilter.capturedMocks);
        assertSame(field, recordingFilter.capturedField);
        assertSame(fieldInstance, recordingFilter.capturedFieldInstance);
        assertSame(recordingFilter.toReturn, result);
    }

    @Test
    public void shouldDelegateDirectlyWhenMocksCollectionHasExactlyOneElement() throws Exception {
        // boundary: mocks.size() == 1 -> เงื่อนไข mocks.size() > 1 ยังเป็น false
        Object mock1 = Mockito.mock(Object.class, Mockito.withSettings().name("someMockName"));
        Collection<Object> mocks = new ArrayList<Object>(Arrays.asList(mock1));
        Field field = fieldNamed("matchingField"); // ชื่อ field ไม่จำเป็นต้องตรง เพราะไม่ถูกตรวจในสาขานี้
        Object fieldInstance = new Object();

        filter.filterCandidate(mocks, field, fieldInstance);

        assertSame(mocks, recordingFilter.capturedMocks);
        assertEquals(1, recordingFilter.capturedMocks.size());
    }

    @Test
    public void shouldFilterByNameWhenMultipleMocksAndOneMatches() throws Exception {
        // boundary: mocks.size() == 2 (> 1 true) , loop: if-condition true 1 ครั้ง, false 1 ครั้ง
        Object matchingMock = Mockito.mock(Object.class, Mockito.withSettings().name("matchingField"));
        Object nonMatchingMock = Mockito.mock(Object.class, Mockito.withSettings().name("other"));
        Collection<Object> mocks = new ArrayList<Object>(Arrays.asList(matchingMock, nonMatchingMock));
        Field field = fieldNamed("matchingField");
        Object fieldInstance = new Object();

        filter.filterCandidate(mocks, field, fieldInstance);

        // ต้องส่ง mockNameMatches (list ใหม่) ไม่ใช่ mocks เดิม
        assertNotSame(mocks, recordingFilter.capturedMocks);
        assertEquals(1, recordingFilter.capturedMocks.size());
        assertTrue(recordingFilter.capturedMocks.contains(matchingMock));
        assertFalse(recordingFilter.capturedMocks.contains(nonMatchingMock));
        assertSame(field, recordingFilter.capturedField);
        assertSame(fieldInstance, recordingFilter.capturedFieldInstance);
    }

    @Test
    public void shouldReturnEmptyListWhenMultipleMocksAndNoneMatches() throws Exception {
        // mocks.size() > 1 true, loop: if-condition false ทุกครั้ง
        Object mock1 = Mockito.mock(Object.class, Mockito.withSettings().name("foo"));
        Object mock2 = Mockito.mock(Object.class, Mockito.withSettings().name("bar"));
        Collection<Object> mocks = new ArrayList<Object>(Arrays.asList(mock1, mock2));
        Field field = fieldNamed("matchingField"); // ไม่ตรงกับ "foo" หรือ "bar"
        Object fieldInstance = new Object();

        filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(recordingFilter.capturedMocks);
        assertTrue(recordingFilter.capturedMocks.isEmpty());
    }

    @Test
    public void shouldIncludeAllMocksWithSameMatchingName() throws Exception {
        // mocks.size() > 1 true, loop: if-condition true มากกว่า 1 ครั้ง (ชื่อซ้ำกัน)
        Object mock1 = Mockito.mock(Object.class, Mockito.withSettings().name("sameNameA"));
        Object mock2 = Mockito.mock(Object.class, Mockito.withSettings().name("sameNameA"));
        Collection<Object> mocks = new ArrayList<Object>(Arrays.asList(mock1, mock2));
        Field field = fieldNamed("sameNameA");
        Object fieldInstance = new Object();

        filter.filterCandidate(mocks, field, fieldInstance);

        assertEquals(2, recordingFilter.capturedMocks.size());
        assertTrue(recordingFilter.capturedMocks.contains(mock1));
        assertTrue(recordingFilter.capturedMocks.contains(mock2));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenFieldIsNullAndMultipleMocks() throws Exception {
        // field == null -> field.getName() ทำให้เกิด NPE ภายใน loop (ต้องมี mocks.size() > 1 เพื่อเข้า loop)
        Object mock1 = Mockito.mock(Object.class, Mockito.withSettings().name("foo"));
        Object mock2 = Mockito.mock(Object.class, Mockito.withSettings().name("bar"));
        Collection<Object> mocks = new ArrayList<Object>(Arrays.asList(mock1, mock2));

        filter.filterCandidate(mocks, null, new Object());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenMocksIsNull() throws Exception {
        // mocks == null -> mocks.size() ทำให้เกิด NPE ก่อนถึงเงื่อนไข if ใด ๆ
        Field field = fieldNamed("matchingField");
        filter.filterCandidate(null, field, new Object());
    }

    @Test
    public void shouldPassNullFieldInstanceThroughWhenMocksSizeNotGreaterThanOne() throws Exception {
        // fieldInstance == null: เนื่องจากไม่ถูกใช้ใน logic เลย ไม่ควรเกิด exception และต้องถูกส่งผ่านตรง ๆ
        Collection<Object> mocks = new ArrayList<Object>();
        Field field = fieldNamed("matchingField");

        filter.filterCandidate(mocks, field, null);

        assertNull(recordingFilter.capturedFieldInstance);
    }
}
```

# สรุปความครอบคลุม (Branch/Condition Coverage)

| เมธอดเทสต์ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `shouldDelegateDirectlyWhenMocksCollectionIsEmpty` | `mocks.size() > 1` → **false** (size=0), ส่ง `mocks` เดิมตรงไปที่ `next` |
| `shouldDelegateDirectlyWhenMocksCollectionHasExactlyOneElement` | boundary `mocks.size() == 1` → เงื่อนไข **false**, ยืนยันว่าไม่สร้าง `mockNameMatches` |
| `shouldFilterByNameWhenMultipleMocksAndOneMatches` | `mocks.size() > 1` → **true** (boundary size=2), loop: if-condition **true** 1 ครั้ง และ **false** 1 ครั้ง |
| `shouldReturnEmptyListWhenMultipleMocksAndNoneMatches` | `mocks.size() > 1` → **true**, loop: if-condition **false** ทุก iteration → ผลลัพธ์เป็น list ว่าง |
| `shouldIncludeAllMocksWithSameMatchingName` | `mocks.size() > 1` → **true**, loop: if-condition **true** หลายครั้ง (ชื่อซ้ำ) → list มีสมาชิกมากกว่า 1 |
| `shouldThrowNullPointerExceptionWhenFieldIsNullAndMultipleMocks` | กรณี `field == null` ภายใน loop (เข้าเงื่อนไข true branch ของ size>1) → NPE จาก `field.getName()` |
| `shouldThrowNullPointerExceptionWhenMocksIsNull` | กรณี `mocks == null` → NPE จาก `mocks.size()` ก่อนถึง if ใด ๆ |
| `shouldPassNullFieldInstanceThroughWhenMocksSizeNotGreaterThanOne` | ตรวจสอบว่า `fieldInstance` (รวมถึงค่า null) ถูกส่งผ่านตรงไปยัง `next` โดยไม่ถูกใช้ใน logic ใด ๆ |

**หมายเหตุกำกับ:** โค้ดต้นฉบับไม่มี null-check สำหรับ `mocks` หรือ `field` อย่างชัดเจน การคาดการณ์ว่าจะเกิด `NullPointerException` อ้างอิงจาก behavior ปกติของ Java (`Collection.size()` และ `Field.getName()` บน null reference) ไม่ได้เป็นการเดา business logic เพิ่มเติมที่ไม่มีในซอร์ส
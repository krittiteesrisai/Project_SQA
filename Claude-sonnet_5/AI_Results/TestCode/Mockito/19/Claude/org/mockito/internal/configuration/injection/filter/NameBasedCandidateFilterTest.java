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

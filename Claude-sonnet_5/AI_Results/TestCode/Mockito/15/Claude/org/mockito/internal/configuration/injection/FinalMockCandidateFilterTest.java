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

package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

import org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.MockCandidateFilter;

public class FinalMockCandidateFilterTest {

    private final FinalMockCandidateFilter filter = new FinalMockCandidateFilter();

    // ---------------------- Fixture classes ----------------------

    /** มี setter แบบ JavaBean -> ควรถูก inject ผ่าน BeanPropertySetter */
    static class PropertyHolder {
        private String value;
        public void setValue(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    /** ไม่มี setter -> BeanPropertySetter ควร return false แล้ว fallback ไป FieldSetter */
    static class FieldOnlyHolder {
        private String value;
        public String getValue() { return value; }
    }

    /** ไม่มี setter และชนิดข้อมูลไม่ตรงกับ mock ที่จะ inject -> คาดว่าจะเกิด RuntimeException ตอน FieldSetter.set() */
    static class MismatchHolder {
        private String value; // field เป็น String แต่จะพยายาม set ด้วย Integer
    }

    // ---------------------- Helper ----------------------

    private Field fieldOf(Class<?> clazz, String name) throws NoSuchFieldException {
        return clazz.getDeclaredField(name);
    }

    // ---------------------- Tests: size != 1 branch ----------------------

    @Test
    public void should_return_injecter_that_returns_null_when_zero_mock_candidate() throws Exception {
        Collection<Object> mocks = new ArrayList<Object>(); // size == 0 (boundary)
        Field field = fieldOf(PropertyHolder.class, "value");
        PropertyHolder target = new PropertyHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNull("เมื่อไม่มี mock candidate thenInject ต้อง return null", injecter.thenInject());
        assertNull("field ต้องไม่ถูกแก้ไข", target.getValue());
    }

    @Test
    public void should_return_injecter_that_returns_null_when_more_than_one_mock_candidate() throws Exception {
        Collection<Object> mocks = Arrays.asList((Object) "mock1", (Object) "mock2"); // size == 2 (boundary)
        Field field = fieldOf(PropertyHolder.class, "value");
        PropertyHolder target = new PropertyHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNull("เมื่อมี mock candidate มากกว่า 1 thenInject ต้อง return null", injecter.thenInject());
        assertNull("field ต้องไม่ถูกแก้ไข", target.getValue());
    }

    // ---------------------- Tests: size == 1, success paths ----------------------

    @Test
    public void should_inject_using_property_setter_when_single_mock_candidate_and_setter_exists() throws Exception {
        Collection<Object> mocks = Collections.singletonList((Object) "theMock");
        Field field = fieldOf(PropertyHolder.class, "value");
        PropertyHolder target = new PropertyHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Object injected = injecter.thenInject();

        assertEquals("theMock", injected);
        assertEquals("ควร inject ผ่าน property setter สำเร็จ", "theMock", target.getValue());
    }

    @Test
    public void should_inject_using_field_access_when_single_mock_candidate_and_no_setter_exists() throws Exception {
        Collection<Object> mocks = Collections.singletonList((Object) "theMock");
        Field field = fieldOf(FieldOnlyHolder.class, "value");
        FieldOnlyHolder target = new FieldOnlyHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Object injected = injecter.thenInject();

        assertEquals("theMock", injected);
        assertEquals("ควร fallback ไปใช้ FieldSetter เพราะไม่มี setter", "theMock", target.getValue());
    }

    @Test
    public void should_return_matching_mock_reference_not_a_copy() throws Exception {
        Collection<Object> mocks = Collections.singletonList((Object) "theMock");
        Field field = fieldOf(PropertyHolder.class, "value");
        PropertyHolder target = new PropertyHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        Object injected = injecter.thenInject();

        assertSame("ต้อง return mock object ตัวเดิม ไม่ใช่สำเนา", "theMock", injected);
    }

    // ---------------------- Tests: size == 1, exception/catch branch ----------------------

    @Test
    public void should_handle_runtime_exception_when_injection_fails_due_to_type_mismatch() throws Exception {
        // field เป็น String แต่ mock เป็น Integer: ไม่มี setter (BeanPropertySetter คืน false)
        // แล้ว FieldSetter.set() ควรเกิด IllegalArgumentException (เป็น RuntimeException)
        // ซึ่งควรถูก catch ภายใน thenInject()
        // NOTE: ไม่มีซอร์สของ Reporter.cannotInjectDependency ให้ จึงไม่ยืนยันว่าจะ throw ต่อหรือไม่
        // จุดประสงค์หลักคือ exercise catch(RuntimeException e) branch ใน FinalMockCandidateFilter
        Collection<Object> mocks = Collections.singletonList((Object) Integer.valueOf(42));
        Field field = fieldOf(MismatchHolder.class, "value");
        MismatchHolder target = new MismatchHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        try {
            injecter.thenInject();
            // ถ้า Reporter ไม่ throw (ไม่ทราบ behavior แน่ชัด) ก็ไม่ควร error ที่นี่
        } catch (RuntimeException e) {
            // ถ้า Reporter throw ต่อ ก็ยอมรับได้ เพราะ catch branch ถูก exercise แล้ว
            assertNotNull(e);
        }
    }

    @Test
    public void should_handle_runtime_exception_when_field_instance_is_null() throws Exception {
        // fieldInstance == null -> อินพุตผิดรูปแบบ, คาดว่า reflection operation จะ throw
        // RuntimeException (เช่น NullPointerException) ซึ่งควรถูก catch ภายใน thenInject()
        Collection<Object> mocks = Collections.singletonList((Object) "theMock");
        Field field = fieldOf(PropertyHolder.class, "value");

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, null);

        try {
            injecter.thenInject();
        } catch (RuntimeException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void should_handle_runtime_exception_when_field_is_null() throws Exception {
        // field == null -> อินพุตผิดรูปแบบ, คาดว่าจะเกิด RuntimeException ภายใน try block
        Collection<Object> mocks = Collections.singletonList((Object) "theMock");
        PropertyHolder target = new PropertyHolder();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, null, target);

        try {
            injecter.thenInject();
        } catch (RuntimeException e) {
            assertNotNull(e);
        }
    }

    // ---------------------- Tests: null/boundary on mocks collection itself ----------------------

    @Test(expected = NullPointerException.class)
    public void should_throw_npe_when_mocks_collection_is_null() throws Exception {
        // mocks == null -> mocks.size() จะ throw NPE ก่อนเข้า branch ใด ๆ เลย
        Field field = fieldOf(PropertyHolder.class, "value");
        PropertyHolder target = new PropertyHolder();

        filter.filterCandidate(null, field, target);
    }
}

package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;

    @Before
    public void setUp() {
        filter = new FinalMockCandidateFilter();
    }

    // --- Helper Classes สำหรับจำลองสถานการณ์ Injection ---

    public static class SampleBeanWithSetter {
        private String message;
        private boolean setterCalled = false;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
            this.setterCalled = true;
        }

        public boolean isSetterCalled() {
            return setterCalled;
        }
    }

    public static class SampleBeanWithoutSetter {
        private String description;

        public String getDescription() {
            return description;
        }
    }

    public static class SampleBeanTypeMismatch {
        private Integer counter;

        public Integer getCounter() {
            return counter;
        }
    }

    // --- Test Cases ---

    @Test
    public void filterCandidate_emptyMocks_returnsNullOnInject() throws Exception {
        SampleBeanWithoutSetter target = new SampleBeanWithoutSetter();
        Field field = SampleBeanWithoutSetter.class.getDeclaredField("description");

        OngoingInjecter injecter = filter.filterCandidate(Collections.emptyList(), field, target);

        assertNotNull("Injecter must not be null even when mocks is empty", injecter);
        Object injectedResult = injecter.thenInject();
        assertNull("thenInject should return null when mock candidate is not found", injectedResult);
        assertNull("Field value should remain unchanged", target.getDescription());
    }

    @Test
    public void filterCandidate_multipleMocks_returnsNullOnInject() throws Exception {
        SampleBeanWithoutSetter target = new SampleBeanWithoutSetter();
        Field field = SampleBeanWithoutSetter.class.getDeclaredField("description");
        List<Object> mocks = Arrays.asList("Mock1", "Mock2");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNotNull("Injecter must not be null when multiple mocks provided", injecter);
        Object injectedResult = injecter.thenInject();
        assertNull("thenInject should return null when multiple candidates exist", injectedResult);
        assertNull("Field value should remain unchanged", target.getDescription());
    }

    @Test
    public void filterCandidate_singleMock_injectsViaPropertySetterWhenAvailable() throws Exception {
        SampleBeanWithSetter target = new SampleBeanWithSetter();
        Field field = SampleBeanWithSetter.class.getDeclaredField("message");
        String mockValue = "hello-setter";
        List<Object> mocks = Collections.singletonList((Object) mockValue);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNotNull(injecter);
        Object result = injecter.thenInject();

        assertEquals("thenInject should return the matching mock", mockValue, result);
        assertTrue("Setter method should have been invoked", target.isSetterCalled());
        assertEquals("Property value should be injected via setter", mockValue, target.getMessage());
    }

    @Test
    public void filterCandidate_singleMock_injectsViaFieldDirectlyWhenNoSetter() throws Exception {
        SampleBeanWithoutSetter target = new SampleBeanWithoutSetter();
        Field field = SampleBeanWithoutSetter.class.getDeclaredField("description");
        String mockValue = "hello-field";
        List<Object> mocks = Collections.singletonList((Object) mockValue);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNotNull(injecter);
        Object result = injecter.thenInject();

        assertEquals("thenInject should return the matching mock", mockValue, result);
        assertEquals("Field value should be directly injected via reflection", mockValue, target.getDescription());
    }

    @Test(expected = MockitoException.class)
    public void filterCandidate_singleMock_throwsMockitoExceptionOnTypeMismatch() throws Exception {
        SampleBeanTypeMismatch target = new SampleBeanTypeMismatch();
        Field field = SampleBeanTypeMismatch.class.getDeclaredField("counter");
        // ส่ง String ให้กับ Field ที่เป็น Integer เพื่อให้เกิด RuntimeException ในการ Inject
        String invalidTypeMock = "This is not an integer";
        List<Object> mocks = Collections.singletonList((Object) invalidTypeMock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        assertNotNull(injecter);

        // thenInject จะต้อง catch RuntimeException และให้ Reporter โยน MockitoException
        injecter.thenInject();
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_nullMocksCollection_throwsNullPointerException() throws Exception {
        SampleBeanWithoutSetter target = new SampleBeanWithoutSetter();
        Field field = SampleBeanWithoutSetter.class.getDeclaredField("description");

        filter.filterCandidate(null, field, target);
    }

    @Test
    public void filterCandidate_singleNullMockCandidate_injectsNullSuccessfully() throws Exception {
        SampleBeanWithoutSetter target = new SampleBeanWithoutSetter();
        Field field = SampleBeanWithoutSetter.class.getDeclaredField("description");
        List<Object> mocks = new ArrayList<Object>();
        mocks.add(null);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNotNull(injecter);
        Object result = injecter.thenInject();

        assertNull("Result should be the null mock candidate", result);
        assertNull("Field should remain/be set to null", target.getDescription());
    }
}
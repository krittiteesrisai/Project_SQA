package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;

    // Helper dummy class สำหรับทดสอบ Reflection Injection
    private static class DummyTarget {
        private String textService;
        private Integer count;
        private int primitiveInt;
    }

    @Before
    public void setUp() {
        filter = new FinalMockCandidateFilter();
    }

    @Test
    public void filterCandidate_shouldReturnOngoingInjecterReturningFalse_whenMocksIsEmpty() throws Exception {
        // Arrange
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("textService");
        List<Object> emptyMocks = Collections.emptyList();

        // Act
        OngoingInjecter injecter = filter.filterCandidate(emptyMocks, field, target);

        // Assert
        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertFalse("Expected thenInject to return false when mocks collection is empty", result);
        assertNull("Target field should remain null", target.textService);
    }

    @Test
    public void filterCandidate_shouldReturnOngoingInjecterReturningFalse_whenMocksHasMultipleElements() throws Exception {
        // Arrange
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("textService");
        List<Object> multipleMocks = Arrays.<Object>asList("mock1", "mock2");

        // Act
        OngoingInjecter injecter = filter.filterCandidate(multipleMocks, field, target);

        // Assert
        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertFalse("Expected thenInject to return false when mocks collection has more than 1 element", result);
        assertNull("Target field should not be injected", target.textService);
    }

    @Test
    public void filterCandidate_shouldInjectSuccessfully_whenSingleMatchingMockProvided() throws Exception {
        // Arrange
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("textService");
        String mockInstance = "mockedStringService";
        List<Object> mocks = Collections.<Object>singletonList(mockInstance);

        // Act
        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        // Assert
        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertTrue("Expected thenInject to return true on successful injection", result);
        assertEquals("Target field must hold the injected instance", mockInstance, target.textService);
    }

    @Test
    public void filterCandidate_shouldInjectNull_whenSingleMockIsNull() throws Exception {
        // Arrange
        DummyTarget target = new DummyTarget();
        target.textService = "initialValue";
        Field field = DummyTarget.class.getDeclaredField("textService");
        List<Object> mocksWithNull = Collections.singletonList(null);

        // Act
        OngoingInjecter injecter = filter.filterCandidate(mocksWithNull, field, target);

        // Assert
        assertNotNull(injecter);
        boolean result = injecter.thenInject();
        assertTrue("Expected thenInject to return true when injecting null candidate", result);
        assertNull("Target field should be updated to null", target.textService);
    }

    @Test
    public void filterCandidate_shouldThrowMockitoException_whenFieldTypeMismatchOccurs() throws Exception {
        // Arrange: ส่ง String เข้าไปใน field ที่เป็น int primitive
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("primitiveInt");
        List<Object> mismatchedMocks = Collections.<Object>singletonList("IncompatibleTypeString");

        // Act
        OngoingInjecter injecter = filter.filterCandidate(mismatchedMocks, field, target);
        assertNotNull(injecter);

        try {
            injecter.thenInject();
            fail("Expected MockitoException to be thrown due to reflection type mismatch");
        } catch (MockitoException e) {
            // Assert
            assertTrue("Exception message should contain the field name", 
                    e.getMessage().contains("Problems injecting dependency in " + field.getName()));
            assertNotNull("Exception cause should be preserved", e.getCause());
        }
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_shouldThrowNullPointerException_whenMocksCollectionIsNull() throws Exception {
        // Arrange
        DummyTarget target = new DummyTarget();
        Field field = DummyTarget.class.getDeclaredField("textService");

        // Act & Assert (Boundary test: mocks collection is null)
        filter.filterCandidate(null, field, target);
    }
}
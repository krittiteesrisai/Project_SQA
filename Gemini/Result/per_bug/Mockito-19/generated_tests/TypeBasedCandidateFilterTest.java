package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TypeBasedCandidateFilterTest {

    // Dummy Target Class สำหรับสร้าง Field จำลอง
    private static class SampleTarget {
        private CharSequence charSequenceField;
        private String stringField;
        private List<?> listField;
        private Number numberField;
    }

    // Dummy MockCandidateFilter สำหรับดักจับค่าพารามิเตอร์ที่ถูกส่งต่อ
    private static class RecordingMockCandidateFilter implements MockCandidateFilter {
        Collection<Object> receivedMocks;
        Field receivedField;
        Object receivedFieldInstance;
        OngoingInjecter expectedInjecter = new OngoingInjecter() {
            public Object thenInject() {
                return null;
            }
        };

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.receivedMocks = mocks;
            this.receivedField = field;
            this.receivedFieldInstance = fieldInstance;
            return expectedInjecter;
        }
    }

    private RecordingMockCandidateFilter nextFilter;
    private TypeBasedCandidateFilter filter;
    private SampleTarget sampleTarget;

    @Before
    public void setUp() {
        nextFilter = new RecordingMockCandidateFilter();
        filter = new TypeBasedCandidateFilter(nextFilter);
        sampleTarget = new SampleTarget();
    }

    @Test
    public void shouldPassEmptyListWhenMocksCollectionIsEmpty() throws Exception {
        // Arrange
        Field field = SampleTarget.class.getDeclaredField("stringField");
        Collection<Object> emptyMocks = Collections.emptyList();

        // Act
        OngoingInjecter result = filter.filterCandidate(emptyMocks, field, sampleTarget);

        // Assert
        assertNotNull(result);
        assertSame(nextFilter.expectedInjecter, result);
        assertNotNull(nextFilter.receivedMocks);
        assertTrue("Expected received mocks to be empty", nextFilter.receivedMocks.isEmpty());
        assertSame(field, nextFilter.receivedField);
        assertSame(sampleTarget, nextFilter.receivedFieldInstance);
    }

    @Test
    public void shouldIncludeMockWhenExactTypeMatches() throws Exception {
        // Arrange
        Field field = SampleTarget.class.getDeclaredField("stringField");
        String matchingMock = "matchedString";
        Collection<Object> mocks = Collections.singletonList((Object) matchingMock);

        // Act
        filter.filterCandidate(mocks, field, sampleTarget);

        // Assert
        assertEquals(1, nextFilter.receivedMocks.size());
        assertTrue(nextFilter.receivedMocks.contains(matchingMock));
    }

    @Test
    public void shouldIncludeMockWhenSubtypeMatches() throws Exception {
        // Arrange (CharSequence is supertype of String)
        Field field = SampleTarget.class.getDeclaredField("charSequenceField");
        String subTypeMock = "hello";
        Collection<Object> mocks = Collections.singletonList((Object) subTypeMock);

        // Act
        filter.filterCandidate(mocks, field, sampleTarget);

        // Assert
        assertEquals(1, nextFilter.receivedMocks.size());
        assertTrue(nextFilter.receivedMocks.contains(subTypeMock));
    }

    @Test
    public void shouldExcludeMockWhenTypeDoesNotMatch() throws Exception {
        // Arrange (String field vs Integer mock)
        Field field = SampleTarget.class.getDeclaredField("stringField");
        Integer incompatibleMock = Integer.valueOf(123);
        Collection<Object> mocks = Collections.singletonList((Object) incompatibleMock);

        // Act
        filter.filterCandidate(mocks, field, sampleTarget);

        // Assert
        assertTrue("Incompatible mock should be excluded", nextFilter.receivedMocks.isEmpty());
    }

    @Test
    public void shouldFilterOnlyMatchingMocksFromMixedCollection() throws Exception {
        // Arrange (Number field accepts Integer and Double, but not String)
        Field field = SampleTarget.class.getDeclaredField("numberField");
        Integer intMock = Integer.valueOf(42);
        Double doubleMock = Double.valueOf(3.14);
        String stringMock = "notANumber";
        Collection<Object> mocks = Arrays.asList(intMock, stringMock, doubleMock);

        // Act
        filter.filterCandidate(mocks, field, sampleTarget);

        // Assert
        assertEquals(2, nextFilter.receivedMocks.size());
        List<Object> receivedList = new ArrayList<Object>(nextFilter.receivedMocks);
        assertSame(intMock, receivedList.get(0));
        assertSame(doubleMock, receivedList.get(1));
    }

    @Test
    public void shouldIncludeMultipleMatchingMocksOfSameType() throws Exception {
        // Arrange
        Field field = SampleTarget.class.getDeclaredField("stringField");
        String mock1 = "string1";
        String mock2 = "string2";
        Collection<Object> mocks = Arrays.asList((Object) mock1, mock2);

        // Act
        filter.filterCandidate(mocks, field, sampleTarget);

        // Assert
        assertEquals(2, nextFilter.receivedMocks.size());
        List<Object> receivedList = new ArrayList<Object>(nextFilter.receivedMocks);
        assertSame(mock1, receivedList.get(0));
        assertSame(mock2, receivedList.get(1));
    }

    @Test
    public void shouldPreserveTargetInstanceEvenIfNull() throws Exception {
        // Arrange
        Field field = SampleTarget.class.getDeclaredField("stringField");
        Collection<Object> mocks = Collections.emptyList();

        // Act
        filter.filterCandidate(mocks, field, null);

        // Assert
        assertSame(null, nextFilter.receivedFieldInstance);
    }

    // Edge Case: Null collection
    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenMocksCollectionIsNull() throws Exception {
        // Arrange
        Field field = SampleTarget.class.getDeclaredField("stringField");

        // Act
        filter.filterCandidate(null, field, sampleTarget);
    }

    // Edge Case: Collection containing null element
    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenMocksContainsNull() throws Exception {
        // Arrange
        Field field = SampleTarget.class.getDeclaredField("stringField");
        Collection<Object> mocks = Collections.singletonList(null);

        // Act
        filter.filterCandidate(mocks, field, sampleTarget);
    }

    // Edge Case: Field parameter is null
    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenFieldIsNull() {
        // Arrange
        Collection<Object> mocks = Collections.singletonList((Object) "dummy");

        // Act
        filter.filterCandidate(mocks, null, sampleTarget);
    }

    // Edge Case: next filter is null
    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenNextFilterIsNull() throws Exception {
        // Arrange
        TypeBasedCandidateFilter filterWithNullNext = new TypeBasedCandidateFilter(null);
        Field field = SampleTarget.class.getDeclaredField("stringField");
        Collection<Object> mocks = Collections.emptyList();

        // Act
        filterWithNullNext.filterCandidate(mocks, field, sampleTarget);
    }
}
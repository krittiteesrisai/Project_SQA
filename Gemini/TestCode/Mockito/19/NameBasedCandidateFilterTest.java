package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NameBasedCandidateFilterTest {

    // Dummy target class for reflection fields
    private static class SampleHolder {
        private String targetField;
        private String anotherField;
        private Object genericField;
    }

    private Field targetField;
    private Field anotherField;
    private Field genericField;
    private SampleHolder sampleHolderInstance;

    // Spy / Fake implementation of MockCandidateFilter to verify invocations
    private static class CapturingMockCandidateFilter implements MockCandidateFilter {
        Collection<Object> capturedMocks;
        Field capturedField;
        Object capturedFieldInstance;
        OngoingInjecter returnedInjecter = new OngoingInjecter() {
            public Object thenInject() {
                return null;
            }
        };

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return returnedInjecter;
        }
    }

    private CapturingMockCandidateFilter nextFilter;
    private NameBasedCandidateFilter candidateFilter;

    @Before
    public void setUp() throws Exception {
        nextFilter = new CapturingMockCandidateFilter();
        candidateFilter = new NameBasedCandidateFilter(nextFilter);

        targetField = SampleHolder.class.getDeclaredField("targetField");
        anotherField = SampleHolder.class.getDeclaredField("anotherField");
        genericField = SampleHolder.class.getDeclaredField("genericField");
        sampleHolderInstance = new SampleHolder();
    }

    @Test
    public void filterCandidate_shouldPassOriginalCollection_whenMocksIsEmpty() {
        // Arrange (Boundary: size == 0)
        Collection<Object> mocks = Collections.emptyList();

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, targetField, sampleHolderInstance);

        // Assert
        assertSame(nextFilter.returnedInjecter, result);
        assertSame(mocks, nextFilter.capturedMocks);
        assertSame(targetField, nextFilter.capturedField);
        assertSame(sampleHolderInstance, nextFilter.capturedFieldInstance);
        assertTrue(nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void filterCandidate_shouldPassOriginalCollection_whenSingleMockProvided() {
        // Arrange (Boundary: size == 1) - แม้ชื่อ mock จะไม่ตรงกับ field ก็จะไม่ถูกกรอง
        Object mockObj = Mockito.mock(Comparable.class, Mockito.withSettings().name("unrelatedName"));
        List<Object> mocks = Collections.singletonList(mockObj);

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, targetField, sampleHolderInstance);

        // Assert
        assertSame(nextFilter.returnedInjecter, result);
        assertSame(mocks, nextFilter.capturedMocks);
        assertEquals(1, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(mockObj));
    }

    @Test
    public void filterCandidate_shouldFilterMatchingMock_whenMultipleMocksProvidedAndOneMatches() {
        // Arrange (size > 1, 1 match)
        Object matchingMock = Mockito.mock(Comparable.class, Mockito.withSettings().name("targetField"));
        Object nonMatchingMock = Mockito.mock(Comparable.class, Mockito.withSettings().name("anotherField"));
        List<Object> mocks = Arrays.asList(matchingMock, nonMatchingMock);

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, targetField, sampleHolderInstance);

        // Assert
        assertSame(nextFilter.returnedInjecter, result);
        assertNotSame(mocks, nextFilter.capturedMocks); // New list created
        assertEquals(1, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(matchingMock));
        assertFalse(nextFilter.capturedMocks.contains(nonMatchingMock));
    }

    @Test
    public void filterCandidate_shouldReturnEmptyList_whenMultipleMocksProvidedAndNoneMatches() {
        // Arrange (size > 1, 0 matches)
        Object mockA = Mockito.mock(Comparable.class, Mockito.withSettings().name("mockA"));
        Object mockB = Mockito.mock(Comparable.class, Mockito.withSettings().name("mockB"));
        List<Object> mocks = Arrays.asList(mockA, mockB);

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, targetField, sampleHolderInstance);

        // Assert
        assertSame(nextFilter.returnedInjecter, result);
        assertNotNull(nextFilter.capturedMocks);
        assertTrue(nextFilter.capturedMocks.isEmpty());
    }

    @Test
    public void filterCandidate_shouldReturnAllMatchingMocks_whenMultipleMocksShareSameName() {
        // Arrange (size > 1, multiple matches for same field name)
        Object match1 = Mockito.mock(Comparable.class, Mockito.withSettings().name("targetField"));
        Object match2 = Mockito.mock(List.class, Mockito.withSettings().name("targetField"));
        Object other = Mockito.mock(Comparable.class, Mockito.withSettings().name("other"));
        List<Object> mocks = Arrays.asList(match1, other, match2);

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, targetField, sampleHolderInstance);

        // Assert
        assertSame(nextFilter.returnedInjecter, result);
        assertEquals(2, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(match1));
        assertTrue(nextFilter.capturedMocks.contains(match2));
        assertFalse(nextFilter.capturedMocks.contains(other));
    }

    @Test
    public void filterCandidate_shouldHandleNullFieldInstanceGracefully() {
        // Arrange (Edge Case: Null fieldInstance)
        Object matchingMock = Mockito.mock(Comparable.class, Mockito.withSettings().name("targetField"));
        Object nonMatchingMock = Mockito.mock(Comparable.class, Mockito.withSettings().name("nonMatching"));
        List<Object> mocks = Arrays.asList(matchingMock, nonMatchingMock);

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, targetField, null);

        // Assert
        assertSame(nextFilter.returnedInjecter, result);
        assertNull(nextFilter.capturedFieldInstance);
        assertEquals(1, nextFilter.capturedMocks.size());
        assertTrue(nextFilter.capturedMocks.contains(matchingMock));
    }
}
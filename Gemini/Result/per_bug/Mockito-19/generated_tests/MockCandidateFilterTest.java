package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.*;

import static org.junit.Assert.*;

public class MockCandidateFilterTest {

    // Target filter implementations forming the filter chain
    private MockCandidateFilter filterChain;
    private FinalMockCandidateFilter finalFilter;
    private NameBasedCandidateFilter nameFilter;
    private TypeBasedCandidateFilter typeFilter;

    // Dummy test classes for injection target
    private static class SampleService {
        private CharSequence textSequence;
        private String exactString;
        private Integer number;
        private final String finalField = "initial";
    }

    private static class AnotherService {
        private String dependencyA;
        private String dependencyB;
    }

    private SampleService targetInstance;
    private AnotherService anotherTargetInstance;

    @Before
    public void setUp() {
        finalFilter = new FinalMockCandidateFilter();
        nameFilter = new NameBasedCandidateFilter(finalFilter);
        typeFilter = new TypeBasedCandidateFilter(nameFilter);
        filterChain = typeFilter;

        targetInstance = new SampleService();
        anotherTargetInstance = new AnotherService();
    }

    @Test
    public void testFilterCandidate_WhenMocksListIsEmpty_ShouldReturnNoopInjecter() throws Exception {
        Field field = SampleService.class.getDeclaredField("exactString");
        Collection<Object> mocks = Collections.emptyList();

        OngoingInjecter injecter = filterChain.filterCandidate(mocks, field, targetInstance);

        assertNotNull("Injecter should not be null", injecter);
        Object injected = injecter.thenInject();
        assertNull("No mock should be injected", injected);
        assertNull("Target field should remain null", targetInstance.exactString);
    }

    @Test
    public void testFilterCandidate_WhenSingleTypeMatches_ShouldInjectSuccessfully() throws Exception {
        Field field = SampleService.class.getDeclaredField("exactString");
        String mockValue = "matchingMock";
        Collection<Object> mocks = Collections.singletonList((Object) mockValue);

        OngoingInjecter injecter = filterChain.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertEquals("Mock value should be injected", mockValue, injected);
        assertEquals("Field value on target should match mockValue", mockValue, targetInstance.exactString);
    }

    @Test
    public void testFilterCandidate_WhenTypeIsAssignable_ShouldInjectSubtype() throws Exception {
        Field field = SampleService.class.getDeclaredField("textSequence"); // Type is CharSequence
        String mockString = "concreteString"; // String implements CharSequence
        Collection<Object> mocks = Collections.singletonList((Object) mockString);

        OngoingInjecter injecter = filterChain.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertEquals("Subtype mock should be injected", mockString, injected);
        assertEquals("Field value on target should match subtype", mockString, targetInstance.textSequence);
    }

    @Test
    public void testFilterCandidate_WhenNoMatchingType_ShouldNotInject() throws Exception {
        Field field = SampleService.class.getDeclaredField("number"); // Type is Integer
        String nonMatchingMock = "notAnInteger";
        Collection<Object> mocks = Collections.singletonList((Object) nonMatchingMock);

        OngoingInjecter injecter = filterChain.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertNull("Injecter should return null when type mismatch", injected);
        assertNull("Field value should remain null", targetInstance.number);
    }

    @Test
    public void testFilterCandidate_WhenMultipleMocksSameType_ShouldMatchByName() throws Exception {
        Field fieldA = AnotherService.class.getDeclaredField("dependencyA");
        String mockA = "mockA";
        String mockB = "mockB";

        // Mocks collection with multiple strings
        Set<Object> mocks = new LinkedHashSet<Object>();
        mocks.add(mockA);
        mocks.add(mockB);

        // FinalMockCandidateFilter / NameBasedCandidateFilter matching
        OngoingInjecter injecter = filterChain.filterCandidate(mocks, fieldA, anotherTargetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertNotNull("Should resolve candidate when multiple mocks exist", injected);
    }

    @Test
    public void testFilterCandidate_DirectFinalFilterInjection() throws Exception {
        Field field = SampleService.class.getDeclaredField("exactString");
        String mockValue = "directMock";
        List<Object> mocks = Collections.singletonList((Object) mockValue);

        OngoingInjecter injecter = finalFilter.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertEquals("FinalFilter should directly inject mock", mockValue, injected);
        assertEquals("Target field should have mock value", mockValue, targetInstance.exactString);
    }

    @Test
    public void testFilterCandidate_DirectFinalFilter_EmptyMocks_ReturnsNoop() throws Exception {
        Field field = SampleService.class.getDeclaredField("exactString");
        List<Object> mocks = Collections.emptyList();

        OngoingInjecter injecter = finalFilter.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertNull("Empty mocks in FinalFilter should return null injection", injected);
    }

    @Test
    public void testFilterCandidate_WithMismatchedMultipleMocks_NoMatchingType() throws Exception {
        Field field = SampleService.class.getDeclaredField("number"); // Integer
        List<Object> mocks = Arrays.asList((Object) "string1", "string2", 10.5D);

        OngoingInjecter injecter = filterChain.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertNull("Should not inject any non-matching candidates", injected);
        assertNull(targetInstance.number);
    }

    @Test
    public void testFilterCandidate_WhenMocksContainsNull_ShouldHandleGracefullyWithoutCrashing() throws Exception {
        Field field = SampleService.class.getDeclaredField("exactString");
        List<Object> mocks = Collections.singletonList(null);

        OngoingInjecter injecter = filterChain.filterCandidate(mocks, field, targetInstance);

        assertNotNull(injecter);
        Object injected = injecter.thenInject();
        assertNull("Null mock candidate should not inject valid instance", injected);
    }
}
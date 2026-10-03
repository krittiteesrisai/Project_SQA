package org.mockito;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Any;
import org.mockito.internal.matchers.Contains;
import org.mockito.internal.matchers.EndsWith;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.InstanceOf;
import org.mockito.internal.matchers.Matches;
import org.mockito.internal.matchers.NotNull;
import org.mockito.internal.matchers.Null;
import org.mockito.internal.matchers.Same;
import org.mockito.internal.matchers.StartsWith;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class MatchersTest {

    private final MockingProgress progress = new ThreadSafeMockingProgress();

    @Before
    @After
    public void resetProgress() {
        progress.validateState();
        progress.reset();
    }

    private org.mockito.internal.matchers.LocalizedMatcher popLastMatcher() {
        List<org.mockito.internal.matchers.LocalizedMatcher> matchers =
                progress.getArgumentMatcherStorage().pullLocalizedMatchers();
        assertNotNull("Expected at least one matcher on storage stack", matchers);
        assertFalse("Expected non-empty matcher stack", matchers.isEmpty());
        return matchers.get(matchers.size() - 1);
    }

    @Test
    public void testAnyPrimitives() {
        assertFalse(Matchers.anyBoolean());
        assertEquals(0, Matchers.anyByte());
        assertEquals('\0', Matchers.anyChar());
        assertEquals(0, Matchers.anyInt());
        assertEquals(0L, Matchers.anyLong());
        assertEquals(0.0f, Matchers.anyFloat(), 0.0f);
        assertEquals(0.0d, Matchers.anyDouble(), 0.0d);
        assertEquals((short) 0, Matchers.anyShort());

        List<org.mockito.internal.matchers.LocalizedMatcher> matchers =
                progress.getArgumentMatcherStorage().pullLocalizedMatchers();
        assertEquals(8, matchers.size());
        for (org.mockito.internal.matchers.LocalizedMatcher m : matchers) {
            assertTrue(m.getMatcher() instanceof Any);
        }
    }

    @Test
    public void testAnyObjectsAndAliases() {
        assertNull(Matchers.anyObject());
        assertNull(Matchers.any());
        assertNull(Matchers.any(String.class));
        assertNull(Matchers.anyVararg());

        List<org.mockito.internal.matchers.LocalizedMatcher> matchers =
                progress.getArgumentMatcherStorage().pullLocalizedMatchers();
        assertEquals(4, matchers.size());
    }

    @Test
    public void testAnyCollectionsAndGenerics() {
        assertEquals("", Matchers.anyString());
        assertNotNull(Matchers.anyList());
        assertTrue(Matchers.anyList().isEmpty());

        List<String> typedList = Matchers.anyListOf(String.class);
        assertNotNull(typedList);
        assertTrue(typedList.isEmpty());

        Set<?> set = Matchers.anySet();
        assertNotNull(set);
        assertTrue(set.isEmpty());

        Set<Integer> typedSet = Matchers.anySetOf(Integer.class);
        assertNotNull(typedSet);
        assertTrue(typedSet.isEmpty());

        Map<?, ?> map = Matchers.anyMap();
        assertNotNull(map);
        assertTrue(map.isEmpty());

        Map<String, Integer> typedMap = Matchers.anyMapOf(String.class, Integer.class);
        assertNotNull(typedMap);
        assertTrue(typedMap.isEmpty());

        Collection<?> collection = Matchers.anyCollection();
        assertNotNull(collection);
        assertTrue(collection.isEmpty());

        Collection<Double> typedCollection = Matchers.anyCollectionOf(Double.class);
        assertNotNull(typedCollection);
        assertTrue(typedCollection.isEmpty());
    }

    @Test
    public void testEqPrimitivesWithBoundaries() {
        assertFalse(Matchers.eq(true));
        assertTrue(popLastMatcher().getMatcher().matches(true));
        assertFalse(popLastMatcher().getMatcher().matches(false));

        assertEquals(0, Matchers.eq(Byte.MIN_VALUE));
        assertTrue(popLastMatcher().getMatcher().matches(Byte.MIN_VALUE));
        assertFalse(popLastMatcher().getMatcher().matches(Byte.MAX_VALUE));

        assertEquals(0, Matchers.eq(Byte.MAX_VALUE));
        assertTrue(popLastMatcher().getMatcher().matches(Byte.MAX_VALUE));

        assertEquals('\0', Matchers.eq('a'));
        assertTrue(popLastMatcher().getMatcher().matches('a'));
        assertFalse(popLastMatcher().getMatcher().matches('b'));

        assertEquals(0.0d, Matchers.eq(Double.NaN), 0.0d);
        assertTrue(popLastMatcher().getMatcher().matches(Double.NaN));

        assertEquals(0.0d, Matchers.eq(Double.POSITIVE_INFINITY), 0.0d);
        assertTrue(popLastMatcher().getMatcher().matches(Double.POSITIVE_INFINITY));
        assertFalse(popLastMatcher().getMatcher().matches(Double.NEGATIVE_INFINITY));

        assertEquals(0.0f, Matchers.eq(Float.MAX_VALUE), 0.0f);
        assertTrue(popLastMatcher().getMatcher().matches(Float.MAX_VALUE));

        assertEquals(0, Matchers.eq(Integer.MIN_VALUE));
        assertTrue(popLastMatcher().getMatcher().matches(Integer.MIN_VALUE));

        assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
        assertTrue(popLastMatcher().getMatcher().matches(Long.MAX_VALUE));

        assertEquals((short) 0, Matchers.eq(Short.MIN_VALUE));
        assertTrue(popLastMatcher().getMatcher().matches(Short.MIN_VALUE));
    }

    @Test
    public void testEqObject() {
        String testVal = "mockito";
        assertEquals("mockito", Matchers.eq(testVal));
        Matcher<?> matcher = popLastMatcher().getMatcher();
        assertTrue(matcher instanceof Equals);
        assertTrue(matcher.matches("mockito"));
        assertFalse(matcher.matches("other"));
        assertFalse(matcher.matches(null));

        assertNull(Matchers.eq((Object) null));
        Matcher<?> nullMatcher = popLastMatcher().getMatcher();
        assertTrue(nullMatcher.matches(null));
        assertFalse(nullMatcher.matches("notNull"));
    }

    @Test
    public void testIsA() {
        assertNull(Matchers.isA(String.class));
        Matcher<?> matcher = popLastMatcher().getMatcher();
        assertTrue(matcher instanceof InstanceOf);
        assertTrue(matcher.matches("test"));
        assertFalse(matcher.matches(123));
        assertFalse(matcher.matches(null));
    }

    @Test
    public void testSameMatcher() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Object result = Matchers.same(obj1);
        assertEquals(obj1, result);
        Matcher<?> matcher = popLastMatcher().getMatcher();
        assertTrue(matcher instanceof Same);
        assertTrue(matcher.matches(obj1));
        assertFalse(matcher.matches(obj2));
        assertFalse(matcher.matches(null));

        assertNull(Matchers.same(null));
        Matcher<?> nullSameMatcher = popLastMatcher().getMatcher();
        assertTrue(nullSameMatcher.matches(null));
        assertFalse(nullSameMatcher.matches(obj1));
    }

    @Test
    public void testRefEq() {
        class Person {
            final String name;
            final int age;
            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Alice", 40);

        assertNull(Matchers.refEq(p1));
        Matcher<?> matcher = popLastMatcher().getMatcher();
        assertTrue(matcher instanceof ReflectionEquals);
        assertTrue(matcher.matches(p2));
        assertFalse(matcher.matches(p3));
        assertFalse(matcher.matches(null));

        assertNull(Matchers.refEq(p1, "age"));
        Matcher<?> matcherExcluded = popLastMatcher().getMatcher();
        assertTrue(matcherExcluded.matches(p3));
    }

    @Test
    public void testNullAndNotNullMatchers() {
        assertNull(Matchers.isNull());
        assertTrue(popLastMatcher().getMatcher() instanceof Null);

        assertNull(Matchers.isNull(String.class));
        assertTrue(popLastMatcher().getMatcher() instanceof Null);

        assertNull(Matchers.notNull());
        assertTrue(popLastMatcher().getMatcher() instanceof NotNull);

        assertNull(Matchers.notNull(Integer.class));
        assertTrue(popLastMatcher().getMatcher() instanceof NotNull);

        assertNull(Matchers.isNotNull());
        assertTrue(popLastMatcher().getMatcher() instanceof NotNull);

        assertNull(Matchers.isNotNull(Double.class));
        assertTrue(popLastMatcher().getMatcher() instanceof NotNull);
    }

    @Test
    public void testStringMatchers() {
        assertEquals("", Matchers.contains("sub"));
        Matcher<?> containsMatcher = popLastMatcher().getMatcher();
        assertTrue(containsMatcher instanceof Contains);
        assertTrue(containsMatcher.matches("super_sub_string"));
        assertFalse(containsMatcher.matches("other"));

        assertEquals("", Matchers.matches("^[0-9]+$"));
        Matcher<?> regexMatcher = popLastMatcher().getMatcher();
        assertTrue(regexMatcher instanceof Matches);
        assertTrue(regexMatcher.matches("12345"));
        assertFalse(regexMatcher.matches("123a"));

        assertEquals("", Matchers.endsWith("end"));
        Matcher<?> endsWithMatcher = popLastMatcher().getMatcher();
        assertTrue(endsWithMatcher instanceof EndsWith);
        assertTrue(endsWithMatcher.matches("the_end"));
        assertFalse(endsWithMatcher.matches("end_start"));

        assertEquals("", Matchers.startsWith("start"));
        Matcher<?> startsWithMatcher = popLastMatcher().getMatcher();
        assertTrue(startsWithMatcher instanceof StartsWith);
        assertTrue(startsWithMatcher.matches("start_here"));
        assertFalse(startsWithMatcher.matches("here_start"));
    }

    @Test
    public void testPrimitiveThatMatchers() {
        Matcher<Boolean> boolMatcher = new DummyMatcher<Boolean>(true);
        assertFalse(Matchers.booleanThat(boolMatcher));
        assertEquals(boolMatcher, popLastMatcher().getMatcher());

        Matcher<Byte> byteMatcher = new DummyMatcher<Byte>((byte) 1);
        assertEquals(0, Matchers.byteThat(byteMatcher));
        assertEquals(byteMatcher, popLastMatcher().getMatcher());

        Matcher<Character> charMatcher = new DummyMatcher<Character>('x');
        assertEquals('\0', Matchers.charThat(charMatcher));
        assertEquals(charMatcher, popLastMatcher().getMatcher());

        Matcher<Short> shortMatcher = new DummyMatcher<Short>((short) 1);
        assertEquals(0, Matchers.shortThat(shortMatcher));
        assertEquals(shortMatcher, popLastMatcher().getMatcher());

        Matcher<Integer> intMatcher = new DummyMatcher<Integer>(1);
        assertEquals(0, Matchers.intThat(intMatcher));
        assertEquals(intMatcher, popLastMatcher().getMatcher());

        Matcher<Long> longMatcher = new DummyMatcher<Long>(1L);
        assertEquals(0L, Matchers.longThat(longMatcher));
        assertEquals(longMatcher, popLastMatcher().getMatcher());

        Matcher<Float> floatMatcher = new DummyMatcher<Float>(1.0f);
        assertEquals(0.0f, Matchers.floatThat(floatMatcher), 0.0f);
        assertEquals(floatMatcher, popLastMatcher().getMatcher());

        Matcher<Double> doubleMatcher = new DummyMatcher<Double>(1.0d);
        assertEquals(0.0d, Matchers.doubleThat(doubleMatcher), 0.0d);
        assertEquals(doubleMatcher, popLastMatcher().getMatcher());

        Matcher<String> strMatcher = new DummyMatcher<String>("custom");
        assertNull(Matchers.argThat(strMatcher));
        assertEquals(strMatcher, popLastMatcher().getMatcher());
    }

    private static class DummyMatcher<T> extends BaseMatcher<T> {
        private final T expected;
        DummyMatcher(T expected) {
            this.expected = expected;
        }
        @Override
        public boolean matches(Object item) {
            return expected != null && expected.equals(item);
        }
        @Override
        public void describeTo(Description description) {
            description.appendText("matches " + expected);
        }
    }
}
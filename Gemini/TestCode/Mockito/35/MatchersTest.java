package org.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Any;
import org.mockito.internal.matchers.AnyVararg;
import org.mockito.internal.matchers.Contains;
import org.mockito.internal.matchers.EndsWith;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.InstanceOf;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.matchers.Matches;
import org.mockito.internal.matchers.NotNull;
import org.mockito.internal.matchers.Null;
import org.mockito.internal.matchers.Same;
import org.mockito.internal.matchers.StartsWith;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

public class MatchersTest {

    private MockingProgress mockingProgress;

    @Before
    public void setUp() {
        mockingProgress = new ThreadSafeMockingProgress();
        mockingProgress.reset();
        mockingProgress.getArgumentMatcherStorage().pullLocalizedMatchers();
    }

    @After
    public void tearDown() {
        mockingProgress.reset();
        mockingProgress.getArgumentMatcherStorage().pullLocalizedMatchers();
    }

    private Matcher<?> getLastReportedMatcher() {
        List<LocalizedMatcher> matchers = mockingProgress.getArgumentMatcherStorage().pullLocalizedMatchers();
        assertNotNull("Expected at least one matcher to be reported", matchers);
        assertFalse("Expected matcher list not to be empty", matchers.isEmpty());
        return matchers.get(matchers.size() - 1).getMatcher();
    }

    @Test
    public void testAnyPrimitives() {
        assertFalse(Matchers.anyBoolean());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals((byte) 0, Matchers.anyByte());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals((char) 0, Matchers.anyChar());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals(0, Matchers.anyInt());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals(0L, Matchers.anyLong());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals(0.0f, Matchers.anyFloat(), 0.0001f);
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals(0.0d, Matchers.anyDouble(), 0.0001d);
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals((short) 0, Matchers.anyShort());
        assertTrue(getLastReportedMatcher() instanceof Any);
    }

    @Test
    public void testAnyObjectsAndCollections() {
        assertNull(Matchers.anyObject());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertNull(Matchers.anyVararg());
        assertTrue(getLastReportedMatcher() instanceof AnyVararg);

        assertNull(Matchers.any(String.class));
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertNull(Matchers.any((Class<?>) null));
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertNull(Matchers.any());
        assertTrue(getLastReportedMatcher() instanceof Any);

        assertEquals("", Matchers.anyString());
        assertTrue(getLastReportedMatcher() instanceof Any);

        List<?> list = Matchers.anyList();
        assertNotNull(list);
        assertTrue(list.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);

        List<Integer> listOf = Matchers.anyListOf(Integer.class);
        assertNotNull(listOf);
        assertTrue(listOf.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);

        Set<?> set = Matchers.anySet();
        assertNotNull(set);
        assertTrue(set.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);

        Set<String> setOf = Matchers.anySetOf(String.class);
        assertNotNull(setOf);
        assertTrue(setOf.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);

        Map<?, ?> map = Matchers.anyMap();
        assertNotNull(map);
        assertTrue(map.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);

        Collection<?> collection = Matchers.anyCollection();
        assertNotNull(collection);
        assertTrue(collection.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);

        Collection<Double> collectionOf = Matchers.anyCollectionOf(Double.class);
        assertNotNull(collectionOf);
        assertTrue(collectionOf.isEmpty());
        assertTrue(getLastReportedMatcher() instanceof Any);
    }

    @Test
    public void testIsA() {
        assertNull(Matchers.isA(String.class));
        Matcher<?> matcher = getLastReportedMatcher();
        assertTrue(matcher instanceof InstanceOf);
        assertTrue(((InstanceOf) matcher).matches("Hello"));
        assertFalse(((InstanceOf) matcher).matches(123));

        // Edge case: null class
        assertNull(Matchers.isA(null));
        Matcher<?> nullClassMatcher = getLastReportedMatcher();
        assertTrue(nullClassMatcher instanceof InstanceOf);
    }

    @Test
    public void testEqPrimitivesAndBoundaries() {
        assertFalse(Matchers.eq(true));
        Matcher<?> boolMatcher = getLastReportedMatcher();
        assertTrue(boolMatcher instanceof Equals);
        assertTrue(((Equals) boolMatcher).matches(true));

        assertEquals((byte) 0, Matchers.eq(Byte.MAX_VALUE));
        Matcher<?> byteMatcher = getLastReportedMatcher();
        assertTrue(byteMatcher instanceof Equals);
        assertTrue(((Equals) byteMatcher).matches(Byte.MAX_VALUE));

        assertEquals((char) 0, Matchers.eq('Z'));
        Matcher<?> charMatcher = getLastReportedMatcher();
        assertTrue(charMatcher instanceof Equals);
        assertTrue(((Equals) charMatcher).matches('Z'));

        assertEquals(0.0d, Matchers.eq(Double.NaN), 0.0001d);
        Matcher<?> doubleMatcher = getLastReportedMatcher();
        assertTrue(doubleMatcher instanceof Equals);
        assertTrue(((Equals) doubleMatcher).matches(Double.NaN));

        assertEquals(0.0f, Matchers.eq(Float.MIN_VALUE), 0.0001f);
        Matcher<?> floatMatcher = getLastReportedMatcher();
        assertTrue(floatMatcher instanceof Equals);
        assertTrue(((Equals) floatMatcher).matches(Float.MIN_VALUE));

        assertEquals(0, Matchers.eq(Integer.MIN_VALUE));
        Matcher<?> intMatcher = getLastReportedMatcher();
        assertTrue(intMatcher instanceof Equals);
        assertTrue(((Equals) intMatcher).matches(Integer.MIN_VALUE));

        assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
        Matcher<?> longMatcher = getLastReportedMatcher();
        assertTrue(longMatcher instanceof Equals);
        assertTrue(((Equals) longMatcher).matches(Long.MAX_VALUE));

        assertEquals((short) 0, Matchers.eq(Short.MIN_VALUE));
        Matcher<?> shortMatcher = getLastReportedMatcher();
        assertTrue(shortMatcher instanceof Equals);
        assertTrue(((Equals) shortMatcher).matches(Short.MIN_VALUE));
    }

    @Test
    public void testEqObjectAndNull() {
        String testVal = "Mockito";
        assertNull(Matchers.eq(testVal));
        Matcher<?> objMatcher = getLastReportedMatcher();
        assertTrue(objMatcher instanceof Equals);
        assertTrue(((Equals) objMatcher).matches("Mockito"));
        assertFalse(((Equals) objMatcher).matches("Other"));

        // Null boundary
        assertNull(Matchers.eq((Object) null));
        Matcher<?> nullMatcher = getLastReportedMatcher();
        assertTrue(nullMatcher instanceof Equals);
        assertTrue(((Equals) nullMatcher).matches(null));
        assertFalse(((Equals) nullMatcher).matches("NotNull"));
    }

    @Test
    public void testRefEq() {
        class Person {
            String name;
            int age;
            Person(String name, int age) { this.name = name; this.age = age; }
        }

        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 40);

        assertNull(Matchers.refEq(p1, "age"));
        Matcher<?> refMatcher = getLastReportedMatcher();
        assertTrue(refMatcher instanceof ReflectionEquals);
        assertTrue(((ReflectionEquals) refMatcher).matches(p2));

        // refEq with null value and empty exclude fields
        assertNull(Matchers.refEq(null));
        assertTrue(getLastReportedMatcher() instanceof ReflectionEquals);
    }

    @Test
    public void testSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        assertNull(Matchers.same(obj1));
        Matcher<?> sameMatcher = getLastReportedMatcher();
        assertTrue(sameMatcher instanceof Same);
        assertTrue(((Same) sameMatcher).matches(obj1));
        assertFalse(((Same) sameMatcher).matches(obj2));

        // Same with null
        assertNull(Matchers.same(null));
        Matcher<?> sameNullMatcher = getLastReportedMatcher();
        assertTrue(sameNullMatcher instanceof Same);
        assertTrue(((Same) sameNullMatcher).matches(null));
        assertFalse(((Same) sameNullMatcher).matches(obj1));
    }

    @Test
    public void testNullAndNotNullMatchers() {
        assertNull(Matchers.isNull());
        assertTrue(getLastReportedMatcher() instanceof Null);

        assertNull(Matchers.notNull());
        assertTrue(getLastReportedMatcher() instanceof NotNull);

        assertNull(Matchers.isNotNull());
        assertTrue(getLastReportedMatcher() instanceof NotNull);
    }

    @Test
    public void testStringMatchers() {
        assertEquals("", Matchers.contains("target"));
        Matcher<?> containsMatcher = getLastReportedMatcher();
        assertTrue(containsMatcher instanceof Contains);
        assertTrue(((Contains) containsMatcher).matches("full_target_string"));
        assertFalse(((Contains) containsMatcher).matches("other"));

        assertEquals("", Matchers.matches("^[0-9]+$"));
        Matcher<?> matchesMatcher = getLastReportedMatcher();
        assertTrue(matchesMatcher instanceof Matches);
        assertTrue(((Matches) matchesMatcher).matches("12345"));
        assertFalse(((Matches) matchesMatcher).matches("abc"));

        assertEquals("", Matchers.startsWith("prefix"));
        Matcher<?> startsWithMatcher = getLastReportedMatcher();
        assertTrue(startsWithMatcher instanceof StartsWith);
        assertTrue(((StartsWith) startsWithMatcher).matches("prefixSuffix"));
        assertFalse(((StartsWith) startsWithMatcher).matches("pre"));

        assertEquals("", Matchers.endsWith("suffix"));
        Matcher<?> endsWithMatcher = getLastReportedMatcher();
        assertTrue(endsWithMatcher instanceof EndsWith);
        assertTrue(((EndsWith) endsWithMatcher).matches("prefixsuffix"));
        assertFalse(((EndsWith) endsWithMatcher).matches("fix"));
    }

    @Test
    public void testStringMatchersWithEmptyAndNull() {
        assertEquals("", Matchers.contains(""));
        assertTrue(getLastReportedMatcher() instanceof Contains);

        assertEquals("", Matchers.startsWith(""));
        assertTrue(getLastReportedMatcher() instanceof StartsWith);

        assertEquals("", Matchers.endsWith(""));
        assertTrue(getLastReportedMatcher() instanceof EndsWith);

        assertEquals("", Matchers.matches(".*"));
        assertTrue(getLastReportedMatcher() instanceof Matches);
    }

    @Test
    public void testArgThatAndPrimitiveThatMatchers() {
        Matcher<Object> dummyMatcher = new BaseMatcher<Object>() {
            @Override
            public boolean matches(Object item) {
                return "pass".equals(item);
            }
            @Override
            public void describeTo(Description description) {
                description.appendText("dummy matcher");
            }
        };

        assertNull(Matchers.argThat(dummyMatcher));
        assertEquals(dummyMatcher, getLastReportedMatcher());

        Matcher<Character> charMatcher = new BaseMatcher<Character>() {
            @Override
            public boolean matches(Object item) { return Character.valueOf('c').equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals((char) 0, Matchers.charThat(charMatcher));
        assertEquals(charMatcher, getLastReportedMatcher());

        Matcher<Boolean> boolMatcher = new BaseMatcher<Boolean>() {
            @Override public boolean matches(Object item) { return Boolean.TRUE.equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertFalse(Matchers.booleanThat(boolMatcher));
        assertEquals(boolMatcher, getLastReportedMatcher());

        Matcher<Byte> byteMatcher = new BaseMatcher<Byte>() {
            @Override public boolean matches(Object item) { return Byte.valueOf((byte) 1).equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals((byte) 0, Matchers.byteThat(byteMatcher));
        assertEquals(byteMatcher, getLastReportedMatcher());

        Matcher<Short> shortMatcher = new BaseMatcher<Short>() {
            @Override public boolean matches(Object item) { return Short.valueOf((short) 1).equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals((short) 0, Matchers.shortThat(shortMatcher));
        assertEquals(shortMatcher, getLastReportedMatcher());

        Matcher<Integer> intMatcher = new BaseMatcher<Integer>() {
            @Override public boolean matches(Object item) { return Integer.valueOf(1).equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals(0, Matchers.intThat(intMatcher));
        assertEquals(intMatcher, getLastReportedMatcher());

        Matcher<Long> longMatcher = new BaseMatcher<Long>() {
            @Override public boolean matches(Object item) { return Long.valueOf(1L).equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals(0L, Matchers.longThat(longMatcher));
        assertEquals(longMatcher, getLastReportedMatcher());

        Matcher<Float> floatMatcher = new BaseMatcher<Float>() {
            @Override public boolean matches(Object item) { return Float.valueOf(1.0f).equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals(0.0f, Matchers.floatThat(floatMatcher), 0.0001f);
        assertEquals(floatMatcher, getLastReportedMatcher());

        Matcher<Double> doubleMatcher = new BaseMatcher<Double>() {
            @Override public boolean matches(Object item) { return Double.valueOf(1.0d).equals(item); }
            @Override public void describeTo(Description description) {}
        };
        assertEquals(0.0d, Matchers.doubleThat(doubleMatcher), 0.0001d);
        assertEquals(doubleMatcher, getLastReportedMatcher());
    }

    @Test
    public void testArgThatWithNullMatcher() {
        assertNull(Matchers.argThat(null));
        assertNull(getLastReportedMatcher());
    }
}
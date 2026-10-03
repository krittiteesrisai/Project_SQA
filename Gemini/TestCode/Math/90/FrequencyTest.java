package org.apache.commons.math.stat;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Test cases for the {@link Frequency} class.
 * Designed for high branch coverage and edge case detection.
 */
public class FrequencyTest {

    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    @Test
    public void testEmptyFrequency() {
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(1));
        assertEquals(0L, f.getCount(1L));
        assertEquals(0L, f.getCount('a'));
        assertEquals(0L, f.getCount("test"));
        assertEquals(0L, f.getCumFreq(1));
        assertEquals(0L, f.getCumFreq(1L));
        assertEquals(0L, f.getCumFreq('a'));
        assertEquals(0L, f.getCumFreq("test"));
        assertTrue(Double.isNaN(f.getPct(1)));
        assertTrue(Double.isNaN(f.getPct(1L)));
        assertTrue(Double.isNaN(f.getPct('a')));
        assertTrue(Double.isNaN(f.getPct("test")));
        assertTrue(Double.isNaN(f.getCumPct(1)));
        assertTrue(Double.isNaN(f.getCumPct(1L)));
        assertTrue(Double.isNaN(f.getCumPct('a')));
        assertTrue(Double.isNaN(f.getCumPct("test")));
        assertNotNull(f.toString());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testIntegralAddAndCounts() {
        // Test unification of int, Integer, and long
        f.addValue(1);
        f.addValue(Integer.valueOf(1));
        f.addValue(1L);
        f.addValue(Long.valueOf(1));

        assertEquals(4L, f.getSumFreq());
        assertEquals(4L, f.getCount(1));
        assertEquals(4L, f.getCount(Integer.valueOf(1)));
        assertEquals(4L, f.getCount(1L));
        assertEquals(4L, f.getCount(Long.valueOf(1)));
        assertEquals(1.0, f.getPct(1), 1e-15);
        assertEquals(1.0, f.getCumPct(1), 1e-15);
        assertEquals(4L, f.getCumFreq(1));

        // Add distinct integral values
        f.addValue(2);
        f.addValue(3L);

        assertEquals(6L, f.getSumFreq());
        assertEquals(4L, f.getCount(1));
        assertEquals(1L, f.getCount(2));
        assertEquals(1L, f.getCount(3L));
        assertEquals(0L, f.getCount(4)); // value not present
    }

    @Test
    public void testCharAddAndCounts() {
        f.addValue('a');
        f.addValue('a');
        f.addValue('b');
        f.addValue('c');

        assertEquals(4L, f.getSumFreq());
        assertEquals(2L, f.getCount('a'));
        assertEquals(1L, f.getCount('b'));
        assertEquals(1L, f.getCount('c'));
        assertEquals(0L, f.getCount('z'));

        assertEquals(0.5, f.getPct('a'), 1e-15);
        assertEquals(0.25, f.getPct('b'), 1e-15);
        assertEquals(0.5, f.getCumPct('a'), 1e-15);
        assertEquals(0.75, f.getCumPct('b'), 1e-15);
        assertEquals(1.0, f.getCumPct('c'), 1e-15);

        assertEquals(2L, f.getCumFreq('a'));
        assertEquals(3L, f.getCumFreq('b'));
        assertEquals(4L, f.getCumFreq('c'));
    }

    @Test
    public void testCumFreqBranches() {
        // Elements: 10, 20, 30
        f.addValue(10L);
        f.addValue(20L);
        f.addValue(30L);

        // Value strictly less than firstKey
        assertEquals(0L, f.getCumFreq(5L));
        assertEquals(0.0, f.getCumPct(5L), 1e-15);

        // Value equal to firstKey
        assertEquals(1L, f.getCumFreq(10L));
        assertEquals(1.0 / 3.0, f.getCumPct(10L), 1e-15);

        // Value strictly between firstKey and lastKey, but not present
        assertEquals(1L, f.getCumFreq(15L));
        assertEquals(1.0 / 3.0, f.getCumPct(15L), 1e-15);

        // Value equal to intermediate element
        assertEquals(2L, f.getCumFreq(20L));
        assertEquals(2.0 / 3.0, f.getCumPct(20L), 1e-15);

        // Value between middle and lastKey
        assertEquals(2L, f.getCumFreq(25L));
        assertEquals(2.0 / 3.0, f.getCumPct(25L), 1e-15);

        // Value equal to lastKey
        assertEquals(3L, f.getCumFreq(30L));
        assertEquals(1.0, f.getCumPct(30L), 1e-15);

        // Value strictly greater than lastKey
        assertEquals(3L, f.getCumFreq(35L));
        assertEquals(1.0, f.getCumPct(35L), 1e-15);
    }

    @Test
    public void testCustomComparator() {
        // String case-insensitive comparator
        Frequency stringFreq = new Frequency(String.CASE_INSENSITIVE_ORDER);
        stringFreq.addValue("alpha");
        stringFreq.addValue("ALPHA");
        stringFreq.addValue("Beta");

        assertEquals(3L, stringFreq.getSumFreq());
        assertEquals(2L, stringFreq.getCount("Alpha"));
        assertEquals(1L, stringFreq.getCount("BETA"));

        assertEquals(2L, stringFreq.getCumFreq("alpha"));
        assertEquals(3L, stringFreq.getCumFreq("beta"));
        assertEquals(3L, stringFreq.getCumFreq("gamma"));
        assertEquals(0L, stringFreq.getCumFreq("aaaa"));
    }

    @Test
    public void testIncompatibleTypesInGetCountAndCumFreq() {
        f.addValue(10L);
        f.addValue(20L);

        // Searching with non-comparable / incompatible types should safely return 0
        assertEquals(0L, f.getCount("string"));
        assertEquals(0L, f.getCumFreq("string"));
        assertEquals(0.0, f.getCumPct("string"), 1e-15);
        assertEquals(0.0, f.getPct("string"), 1e-15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncompatibleTypeAddThrowsException() {
        f.addValue(10L);
        // Adding a type incompatible with Long should throw IllegalArgumentException
        f.addValue("A String");
    }

    @Test
    public void testClearAndValuesIterator() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);

        assertEquals(3L, f.getSumFreq());

        Iterator iter = f.valuesIterator();
        assertTrue(iter.hasNext());
        assertEquals(1L, iter.next());
        assertEquals(2L, iter.next());
        assertEquals(3L, iter.next());
        assertFalse(iter.hasNext());

        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testToString() {
        f.addValue("one");
        f.addValue("two");
        f.addValue("two");

        String result = f.toString();
        assertNotNull(result);
        assertTrue(result.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(result.contains("one"));
        assertTrue(result.contains("two"));
    }
}
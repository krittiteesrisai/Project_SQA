package org.apache.commons.math.stat;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Comprehensive JUnit 4 Test Case for Frequency class.
 * Targets maximum branch/condition coverage and edge-case faults.
 */
public class FrequencyTest {

    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    // ------------------------------------------------------------------------
    // Tests for addValue, Integer conversions, and primitive overloads
    // ------------------------------------------------------------------------

    @Test
    public void testAddValuePrimitivesAndIntegralConversions() {
        // Test int, Integer, long, Long consistency
        f.addValue(1);
        f.addValue(Integer.valueOf(1));
        f.addValue(1L);
        f.addValue(Long.valueOf(1L));

        assertEquals(4, f.getCount(1));
        assertEquals(4, f.getCount(Integer.valueOf(1)));
        assertEquals(4, f.getCount(1L));
        assertEquals(4, f.getCount(Long.valueOf(1L)));
        assertEquals(4, f.getSumFreq());

        // Test char overloads
        f.clear();
        f.addValue('a');
        f.addValue('a');
        f.addValue('b');
        assertEquals(2, f.getCount('a'));
        assertEquals(2, f.getCount(Character.valueOf('a')));
        assertEquals(1, f.getCount('b'));
        assertEquals(3, f.getSumFreq());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueIncompatibleTypes() {
        f.addValue(10);
        // String is not comparable with Long (int converted to Long)
        f.addValue("StringValue");
    }

    /**
     * Fault-detecting test for Defects4J Math-89:
     * addValue(Object) with a non-Comparable object must throw IllegalArgumentException.
     */
    @Test
    public void testAddNonComparableObject() {
        Object nonComparable = new Object();
        try {
            f.addValue(nonComparable);
            fail("Expected IllegalArgumentException when adding non-comparable object");
        } catch (IllegalArgumentException e) {
            // Expected
        } catch (ClassCastException e) {
            fail("Caught ClassCastException instead of IllegalArgumentException (Math-89 bug)");
        }
    }

    // ------------------------------------------------------------------------
    // Tests for Empty State & Boundaries (getPct, getCumPct, getCumFreq)
    // ------------------------------------------------------------------------

    @Test
    public void testEmptyFrequencyTable() {
        assertEquals(0, f.getSumFreq());
        assertEquals(0, f.getCount(10));
        assertEquals(0, f.getCount('a'));
        assertEquals(0, f.getCount("test"));
        assertEquals(0, f.getCumFreq(10));
        assertEquals(0, f.getCumFreq('a'));
        assertEquals(0, f.getCumFreq("test"));

        assertTrue(Double.isNaN(f.getPct(10)));
        assertTrue(Double.isNaN(f.getPct('a')));
        assertTrue(Double.isNaN(f.getPct("test")));
        assertTrue(Double.isNaN(f.getCumPct(10)));
        assertTrue(Double.isNaN(f.getCumPct('a')));
        assertTrue(Double.isNaN(f.getCumPct("test")));
    }

    // ------------------------------------------------------------------------
    // Tests for getPct and getCumPct calculations
    // ------------------------------------------------------------------------

    @Test
    public void testGetPctAndCumPct() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        f.addValue(30);

        // Sum = 4
        assertEquals(0.25, f.getPct(10), 1e-6);
        assertEquals(0.50, f.getPct(20), 1e-6);
        assertEquals(0.25, f.getPct(30), 1e-6);
        assertEquals(0.00, f.getPct(99), 1e-6);

        // Cumulative percentages
        assertEquals(0.25, f.getCumPct(10), 1e-6);
        assertEquals(0.75, f.getCumPct(20), 1e-6);
        assertEquals(1.00, f.getCumPct(30), 1e-6);
        assertEquals(1.00, f.getCumPct(40), 1e-6);
        assertEquals(0.00, f.getCumPct(5), 1e-6);

        // Primitive overloads
        assertEquals(0.50, f.getPct(20L), 1e-6);
        assertEquals(0.75, f.getCumPct(20L), 1e-6);
    }

    // ------------------------------------------------------------------------
    // Tests for getCumFreq Branches (less than first, greater than last, intermediate)
    // ------------------------------------------------------------------------

    @Test
    public void testGetCumFreqBranches() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        f.addValue(30);
        f.addValue(40);

        // Branch 1: v < firstKey()
        assertEquals(0, f.getCumFreq(5));
        assertEquals(0, f.getCumFreq(Long.valueOf(5)));

        // Branch 2: v >= lastKey()
        assertEquals(5, f.getCumFreq(40));
        assertEquals(5, f.getCumFreq(50));

        // Branch 3: v is an exact match in the middle
        assertEquals(3, f.getCumFreq(20));

        // Branch 4: v is in between middle values (e.g. 25 is between 20 and 30)
        assertEquals(3, f.getCumFreq(25));
    }

    @Test
    public void testGetCountAndGetCumFreqWithIncompatibleObject() {
        f.addValue("apple");
        f.addValue("banana");

        // Object of different type passed to getCount (swallows CCE and returns 0)
        assertEquals(0, f.getCount(123));

        // Object of different type passed to getCumFreq (swallows CCE and returns 0)
        assertEquals(0, f.getCumFreq(123));
    }

    // ------------------------------------------------------------------------
    // Tests for Custom Comparator
    // ------------------------------------------------------------------------

    @Test
    public void testCustomComparator() {
        // Case-insensitive comparator
        Frequency customF = new Frequency(String.CASE_INSENSITIVE_ORDER);
        customF.addValue("A");
        customF.addValue("b");
        customF.addValue("a");
        customF.addValue("C");

        assertEquals(2, customF.getCount("a"));
        assertEquals(2, customF.getCount("A"));
        assertEquals(1, customF.getCount("B"));
        assertEquals(4, customF.getSumFreq());

        // Reverse order comparator
        Comparator<Integer> reverseComp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        Frequency revF = new Frequency(reverseComp);
        revF.addValue(100);
        revF.addValue(50);
        revF.addValue(10);

        // In reverse order, firstKey is 100, lastKey is 10
        // Value 150 is "less" than 100 in reverse order -> returns 0
        assertEquals(0, revF.getCumFreq(150));
        // Value 5 is "greater" than 10 in reverse order -> returns sumFreq (3)
        assertEquals(3, revF.getCumFreq(5));
        // CumFreq for 50 (should cover 100 and 50)
        assertEquals(2, revF.getCumFreq(50));
    }

    // ------------------------------------------------------------------------
    // Tests for Iterator, Clear, and toString
    // ------------------------------------------------------------------------

    @Test
    public void testValuesIteratorAndClear() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(30);

        Iterator<?> it = f.valuesIterator();
        assertTrue(it.hasNext());
        assertEquals(10L, it.next());
        assertEquals(20L, it.next());
        assertEquals(30L, it.next());
        assertFalse(it.hasNext());

        f.clear();
        assertEquals(0, f.getSumFreq());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testToString() {
        // Empty state
        String emptyStr = f.toString();
        assertTrue(emptyStr.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));

        // Populated state
        f.addValue("alpha");
        f.addValue("beta");
        f.addValue("alpha");
        String populatedStr = f.toString();
        assertTrue(populatedStr.contains("alpha\t2\t67%"));
        assertTrue(populatedStr.contains("beta\t1\t33%"));
    }
}
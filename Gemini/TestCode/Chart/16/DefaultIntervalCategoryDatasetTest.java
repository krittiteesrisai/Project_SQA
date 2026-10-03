package org.jfree.data.category;

import static org.junit.Assert.*;

import java.util.List;

import org.jfree.data.UnknownKeyException;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for DefaultIntervalCategoryDataset (Defects4J Chart-16b).
 * Written by Senior Java Test Automation Engineer.
 */
public class DefaultIntervalCategoryDatasetTest {

    private static final double EPSILON = 0.0000001;

    // --- Constructor & Initialization Tests ---

    @Test
    public void testConstructorsWithPrimitiveArrays() {
        double[][] starts = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        double[][] ends = { { 1.5, 2.5 }, { 3.5, 4.5 } };

        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        assertEquals(2, dataset.getSeriesCount());
        assertEquals(2, dataset.getCategoryCount());
        assertEquals(1.0, dataset.getStartValue(0, 0).doubleValue(), EPSILON);
        assertEquals(1.5, dataset.getEndValue(0, 0).doubleValue(), EPSILON);
    }

    @Test
    public void testConstructorWithSeriesNamesAndNumberArrays() {
        String[] seriesNames = { "Series A", "Series B" };
        Number[][] starts = { { 1.0 }, { 2.0 } };
        Number[][] ends = { { 1.1 }, { 2.1 } };

        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(seriesNames, starts, ends);
        assertEquals(2, dataset.getRowCount());
        assertEquals("Series A", dataset.getRowKey(0));
        assertEquals("Series B", dataset.getRowKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSeriesLengthMismatchThrowsException() {
        Number[][] starts = { { 1.0 } };
        Number[][] ends = { { 1.0 }, { 2.0 } };
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSeriesCountMismatchBetweenStartsAndEndsThrowsException() {
        Number[][] starts = { { 1.0 }, { 2.0 } };
        Number[][] ends = { { 1.0 } };
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSeriesKeysLengthMismatchThrowsException() {
        Comparable[] seriesKeys = { "S1" };
        Number[][] starts = { { 1.0 }, { 2.0 } };
        Number[][] ends = { { 1.1 }, { 2.1 } };
        new DefaultIntervalCategoryDataset(seriesKeys, null, starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorCategoryLengthMismatchThrowsException() {
        Number[][] starts = { { 1.0, 2.0 } };
        Number[][] ends = { { 1.0 } };
        new DefaultIntervalCategoryDataset(starts, ends);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorCategoryKeysLengthMismatchThrowsException() {
        Comparable[] categoryKeys = { "C1" };
        Number[][] starts = { { 1.0, 2.0 } };
        Number[][] ends = { { 1.5, 2.5 } };
        new DefaultIntervalCategoryDataset(null, categoryKeys, starts, ends);
    }

    @Test
    public void testConstructorWithNullStartsAndEnds() {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(null, null);
        assertEquals(0, dataset.getSeriesCount());
        assertEquals(0, dataset.getCategoryCount());
        assertTrue(dataset.getRowKeys().isEmpty());
        assertTrue(dataset.getColumnKeys().isEmpty());
    }

    @Test
    public void testConstructorWithEmptyDataArrays() {
        Number[][] starts = new Number[0][0];
        Number[][] ends = new Number[0][0];
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends);
        assertEquals(0, dataset.getSeriesCount());
        assertEquals(0, dataset.getCategoryCount());
    }

    // --- Setters and Validations ---

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeysNullThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setSeriesKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeysLengthMismatchThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setSeriesKeys(new Comparable[] { "OnlyOne" });
    }

    @Test
    public void testSetSeriesKeysValid() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        Comparable[] newKeys = { "NewS1", "NewS2" };
        dataset.setSeriesKeys(newKeys);
        assertEquals("NewS1", dataset.getRowKey(0));
        assertEquals("NewS2", dataset.getRowKey(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysNullThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setCategoryKeys(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysLengthMismatchThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setCategoryKeys(new Comparable[] { "C1" });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysContainsNullThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setCategoryKeys(new Comparable[] { "C1", null });
    }

    @Test
    public void testSetCategoryKeysValid() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        Comparable[] newCats = { "CatX", "CatY" };
        dataset.setCategoryKeys(newCats);
        assertEquals("CatX", dataset.getColumnKey(0));
        assertEquals("CatY", dataset.getColumnKey(1));
    }

    // --- Value Getters and Setters (Index and Key based) ---

    @Test
    public void testGetValueByKeys() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        assertEquals(1.5, dataset.getValue("Series 1", "Category 1").doubleValue(), EPSILON);
        assertEquals(1.0, dataset.getStartValue("Series 1", "Category 1").doubleValue(), EPSILON);
        assertEquals(1.5, dataset.getEndValue("Series 1", "Category 1").doubleValue(), EPSILON);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownSeriesKeyThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getValue("UnknownSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueUnknownCategoryKeyThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getValue("Series 1", "UnknownCat");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValueUnknownSeriesKeyThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getStartValue("UnknownSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetStartValueUnknownCategoryKeyThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getStartValue("Series 1", "UnknownCat");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValueUnknownSeriesKeyThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getEndValue("UnknownSeries", "Category 1");
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetEndValueUnknownCategoryKeyThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getEndValue("Series 1", "UnknownCat");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueInvalidSeriesIndexLow() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getStartValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueInvalidSeriesIndexHigh() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getStartValue(5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueInvalidCategoryIndexLow() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getStartValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueInvalidCategoryIndexHigh() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getStartValue(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueInvalidSeriesIndexLow() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getEndValue(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueInvalidSeriesIndexHigh() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getEndValue(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueInvalidCategoryIndexLow() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getEndValue(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueInvalidCategoryIndexHigh() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getEndValue(0, 2);
    }

    @Test
    public void testSetStartAndEndValues() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setStartValue(0, "Category 1", 99.0);
        dataset.setEndValue(0, "Category 1", 100.0);

        assertEquals(99.0, dataset.getStartValue(0, 0).doubleValue(), EPSILON);
        assertEquals(100.0, dataset.getEndValue(0, 0).doubleValue(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValueInvalidSeriesLow() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setStartValue(-1, "Category 1", 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValueInvalidSeriesHigh() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setStartValue(5, "Category 1", 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValueUnrecognizedCategory() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setStartValue(0, "NonExistent", 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValueInvalidSeriesLow() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setEndValue(-1, "Category 1", 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValueInvalidSeriesHigh() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setEndValue(5, "Category 1", 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValueUnrecognizedCategory() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.setEndValue(0, "NonExistent", 10.0);
    }

    // --- Boundary & Miscellaneous Methods ---

    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndexNullArgumentThrowsException() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        dataset.getColumnIndex(null);
    }

    @Test
    public void testGetRowKeyOutOfBounds() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        try {
            dataset.getRowKey(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getRowKey(5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetSeriesKeyOutOfBounds() {
        DefaultIntervalCategoryDataset dataset = createStandardDataset();
        try {
            dataset.getSeriesKey(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getSeriesKey(10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetRowKeysEmptyDataset() {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(null, null);
        List keys = dataset.getRowKeys();
        assertNotNull(keys);
        assertTrue(keys.isEmpty());
    }

    @Test
    public void testGetColumnKeysEmptyDataset() {
        DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(null, null);
        List keys = dataset.getColumnKeys();
        assertNotNull(keys);
        assertTrue(keys.isEmpty());
    }

    // --- Equals and Clone Tests ---

    @Test
    public void testEqualsAndHashCodeContract() {
        DefaultIntervalCategoryDataset d1 = createStandardDataset();
        DefaultIntervalCategoryDataset d2 = createStandardDataset();

        assertTrue(d1.equals(d1)); // Reflexive
        assertTrue(d1.equals(d2)); // Symmetric

        // Different object type
        assertFalse(d1.equals("Some String"));

        // Null check
        assertFalse(d1.equals(null));

        // Different series keys
        DefaultIntervalCategoryDataset d3 = new DefaultIntervalCategoryDataset(
                new String[] { "DiffS1", "Series 2" },
                new Number[][] { { 1.0, 2.0 }, { 3.0, 4.0 } },
                new Number[][] { { 1.5, 2.5 }, { 3.5, 4.5 } }
        );
        assertFalse(d1.equals(d3));

        // Different category keys
        DefaultIntervalCategoryDataset d4 = new DefaultIntervalCategoryDataset(
                new String[] { "Series 1", "Series 2" },
                new Comparable[] { "DiffC1", "Category 2" },
                new Number[][] { { 1.0, 2.0 }, { 3.0, 4.0 } },
                new Number[][] { { 1.5, 2.5 }, { 3.5, 4.5 } }
        );
        assertFalse(d1.equals(d4));

        // Different startData
        DefaultIntervalCategoryDataset d5 = new DefaultIntervalCategoryDataset(
                new Number[][] { { 9.0, 2.0 }, { 3.0, 4.0 } },
                new Number[][] { { 1.5, 2.5 }, { 3.5, 4.5 } }
        );
        assertFalse(d1.equals(d5));

        // Different endData
        DefaultIntervalCategoryDataset d6 = new DefaultIntervalCategoryDataset(
                new Number[][] { { 1.0, 2.0 }, { 3.0, 4.0 } },
                new Number[][] { { 9.5, 2.5 }, { 3.5, 4.5 } }
        );
        assertFalse(d1.equals(d6));

        // Null startData comparison
        DefaultIntervalCategoryDataset d7 = new DefaultIntervalCategoryDataset(null, null);
        DefaultIntervalCategoryDataset d8 = new DefaultIntervalCategoryDataset(null, null);
        assertTrue(d7.equals(d8));
        assertFalse(d1.equals(d7));
        assertFalse(d7.equals(d1));

        // Different array lengths in equal check
        DefaultIntervalCategoryDataset d9 = new DefaultIntervalCategoryDataset(
                new Number[][] { { 1.0, 2.0 } },
                new Number[][] { { 1.5, 2.5 } }
        );
        assertFalse(d1.equals(d9));
    }

    @Test
    public void testCloneDataset() throws CloneNotSupportedException {
        DefaultIntervalCategoryDataset original = createStandardDataset();
        DefaultIntervalCategoryDataset clone = (DefaultIntervalCategoryDataset) original.clone();

        assertEquals(original, clone);
        assertNotSame(original, clone);
        assertNotSame(original.getRowKeys(), clone.getRowKeys());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCloneNullArrayInternalThrowsException() throws Exception {
        // สะท้อนการทดสอบ private static Number[][] clone(Number[][] array) กรณีส่งค่า null ผ่าน Reflection หรือทางอ้อม
        java.lang.reflect.Method method = DefaultIntervalCategoryDataset.class.getDeclaredMethod("clone", Number[][].class);
        method.setAccessible(true);
        try {
            method.invoke(null, (Object) null);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getTargetException() instanceof IllegalArgumentException) {
                throw (IllegalArgumentException) e.getTargetException();
            }
            throw e;
        }
    }

    // --- Helper Method ---
    private DefaultIntervalCategoryDataset createStandardDataset() {
        Number[][] starts = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        Number[][] ends = { { 1.5, 2.5 }, { 3.5, 4.5 } };
        return new DefaultIntervalCategoryDataset(starts, ends);
    }
}
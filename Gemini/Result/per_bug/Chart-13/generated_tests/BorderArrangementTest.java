package org.jfree.chart.block;

import static org.junit.Assert.*;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for BorderArrangement.
 */
public class BorderArrangementTest {

    private BorderArrangement arrangement;
    private BlockContainer container;
    private Graphics2D g2;

    @Before
    public void setUp() {
        this.arrangement = new BorderArrangement();
        this.container = new BlockContainer(new BorderArrangement());
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        this.g2 = img.createGraphics();
    }

    @Test
    public void testAddAndClear() {
        EmptyBlock block = new EmptyBlock(10, 10);
        arrangement.add(block, null); // Center
        arrangement.add(block, RectangleEdge.TOP);
        arrangement.add(block, RectangleEdge.BOTTOM);
        arrangement.add(block, RectangleEdge.LEFT);
        arrangement.add(block, RectangleEdge.RIGHT);
        arrangement.add(block, "INVALID_KEY"); // Edge case: invalid key type

        // Verify clear resets everything
        arrangement.clear();
        BorderArrangement emptyArrangement = new BorderArrangement();
        assertTrue(arrangement.equals(emptyArrangement));
    }

    @Test
    public void testArrange_NoneNone() {
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.RIGHT);
        arrangement.add(new EmptyBlock(10, 10), null);

        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);
        assertNotNull(size);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_NoneFixed_ThrowsException() {
        // w = NONE, h = FIXED
        RectangleConstraint constraint = new RectangleConstraint(0.0, null, LengthConstraintType.NONE, 
                                                                 100.0, null, LengthConstraintType.FIXED);
        arrangement.arrange(container, g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_NoneRange_ThrowsException() {
        // w = NONE, h = RANGE
        RectangleConstraint constraint = new RectangleConstraint(0.0, null, LengthConstraintType.NONE, 
                                                                 0.0, new Range(0, 100), LengthConstraintType.RANGE);
        arrangement.arrange(container, g2, constraint);
    }

    @Test
    public void testArrange_FixedNone() {
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.RIGHT);
        arrangement.add(new EmptyBlock(10, 10), null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, 0.0, LengthConstraintType.FIXED, 
                                                                 0.0, null, LengthConstraintType.NONE);
        Size2D size = arrangement.arrange(container, g2, constraint);
        assertNotNull(size);
    }

    @Test
    public void testArrange_FixedFixed() {
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.RIGHT);
        arrangement.add(new EmptyBlock(10, 10), null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, 100.0);
        Size2D size = arrangement.arrange(container, g2, constraint);
        assertNotNull(size);
    }

    @Test
    public void testArrange_FixedRange_InsideRange() {
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        // w = FIXED, h = RANGE
        RectangleConstraint constraint = new RectangleConstraint(100.0, new Range(0.0, 200.0));
        Size2D size = arrangement.arrange(container, g2, constraint);
        assertNotNull(size);
    }

    @Test
    public void testArrange_FixedRange_OutsideRange() {
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        // Force height constraint range that triggers constrain and re-arrange
        RectangleConstraint constraint = new RectangleConstraint(100.0, new Range(0.0, 5.0));
        Size2D size = arrangement.arrange(container, g2, constraint);
        assertNotNull(size);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_RangeNone_ThrowsException() {
        RectangleConstraint constraint = new RectangleConstraint(new Range(0, 100), null, LengthConstraintType.RANGE,
                                                                 0.0, null, LengthConstraintType.NONE);
        arrangement.arrange(container, g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_RangeFixed_ThrowsException() {
        RectangleConstraint constraint = new RectangleConstraint(new Range(0, 100), null, LengthConstraintType.RANGE,
                                                                 100.0, null, LengthConstraintType.FIXED);
        arrangement.arrange(container, g2, constraint);
    }

    @Test
    public void testArrange_RangeRange() {
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.RIGHT);
        arrangement.add(new EmptyBlock(10, 10), null);

        RectangleConstraint constraint = new RectangleConstraint(new Range(0, 200), new Range(0, 200));
        Size2D size = arrangement.arrange(container, g2, constraint);
        assertNotNull(size);
    }

    @Test
    public void testEqualsAndHashCodeEdges() {
        BorderArrangement arr1 = new BorderArrangement();
        BorderArrangement arr2 = new BorderArrangement();

        assertTrue(arr1.equals(arr1)); // Reflexive
        assertTrue(arr1.equals(arr2));
        assertFalse(arr1.equals(null)); // Null check
        assertFalse(arr1.equals("Some String")); // Different type check

        EmptyBlock b1 = new EmptyBlock(10, 10);
        EmptyBlock b2 = new EmptyBlock(20, 20);

        arr1.add(b1, RectangleEdge.TOP);
        assertFalse(arr1.equals(arr2));

        arr2.add(b1, RectangleEdge.TOP);
        assertTrue(arr1.equals(arr2));

        arr1.add(b2, RectangleEdge.BOTTOM);
        assertFalse(arr1.equals(arr2));
        arr2.add(b2, RectangleEdge.BOTTOM);
        assertTrue(arr1.equals(arr2));

        arr1.add(b2, RectangleEdge.LEFT);
        assertFalse(arr1.equals(arr2));
        arr2.add(b2, RectangleEdge.LEFT);
        assertTrue(arr1.equals(arr2));

        arr1.add(b2, RectangleEdge.RIGHT);
        assertFalse(arr1.equals(arr2));
        arr2.add(b2, RectangleEdge.RIGHT);
        assertTrue(arr1.equals(arr2));

        arr1.add(b2, null);
        assertFalse(arr1.equals(arr2));
        arr2.add(b2, null);
        assertTrue(arr1.equals(arr2));
    }
}
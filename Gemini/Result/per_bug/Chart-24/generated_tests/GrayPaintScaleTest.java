package org.jfree.chart.renderer;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Paint;

import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for GrayPaintScale.
 */
public class GrayPaintScaleTest {

    private static final double EPSILON = 0.0000001D;

    @Test
    public void testDefaultConstructor() {
        GrayPaintScale scale = new GrayPaintScale();
        assertEquals(0.0, scale.getLowerBound(), EPSILON);
        assertEquals(1.0, scale.getUpperBound(), EPSILON);
    }

    @Test
    public void testParameterizedConstructorValid() {
        GrayPaintScale scale = new GrayPaintScale(-10.0, 10.0);
        assertEquals(-10.0, scale.getLowerBound(), EPSILON);
        assertEquals(10.0, scale.getUpperBound(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLowerBoundGreaterThanUpperBound() {
        new GrayPaintScale(5.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBoundsEqual() {
        new GrayPaintScale(3.0, 3.0);
    }

    @Test
    public void testGetPaintWithinRange() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);
        // Midpoint should yield gray (127 or 128 depending on casting)
        Paint paint = scale.getPaint(50.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        assertEquals(127, color.getRed());
        assertEquals(127, color.getGreen());
        assertEquals(127, color.getBlue());
    }

    @Test
    public void testGetPaintAtLowerBoundary() {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(10.0);
        Color color = (Color) paint;
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaintAtUpperBoundary() {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        Paint paint = scale.getPaint(20.0);
        Color color = (Color) paint;
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    public void testGetPaintBelowLowerBound_Defects4J_Bug1767315() {
        // Ensures that values below lower bound are clamped correctly 
        // and do not cause negative color values (Bug 1767315 regression check)
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(-5.0);
        Color color = (Color) paint;
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaintAboveUpperBound() {
        // Ensures that values above upper bound are clamped correctly 
        // and do not cause IllegalArgumentException due to > 255 color values
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Paint paint = scale.getPaint(5.0);
        Color color = (Color) paint;
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    public void testEqualsSelf() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale.equals(scale));
    }

    @Test
    public void testEqualsNull() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertFalse(scale.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        assertFalse(scale.equals("NotAColorScale"));
    }

    @Test
    public void testEqualsDifferentLowerBound() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.1, 1.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEqualsDifferentUpperBound() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 2.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEqualsEquivalent() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale1.equals(scale2));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        GrayPaintScale scale1 = new GrayPaintScale(1.0, 5.0);
        Object objClone = scale1.clone();
        
        assertNotNull(objClone);
        assertTrue(objClone instanceof GrayPaintScale);
        GrayPaintScale scale2 = (GrayPaintScale) objClone;
        
        assertNotSame(scale1, scale2);
        assertEquals(scale1.getLowerBound(), scale2.getLowerBound(), EPSILON);
        assertEquals(scale1.getUpperBound(), scale2.getUpperBound(), EPSILON);
        assertTrue(scale1.equals(scale2));
    }
}
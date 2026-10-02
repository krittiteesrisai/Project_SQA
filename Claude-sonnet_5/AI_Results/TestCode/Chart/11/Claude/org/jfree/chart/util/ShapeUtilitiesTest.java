package org.jfree.chart.util;

import org.jfree.chart.util.ShapeUtilities;
import org.jfree.chart.util.RectangleAnchor;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 * JUnit 4 test suite for {@link ShapeUtilities} (Defects4J Chart-11b).
 *
 * NOTE: ObjectUtilities.equal() and RectangleAnchor.coordinates() source
 * code are not provided in the target class listing. Tests that rely on
 * these are annotated with an explicit "NOTE" comment describing the
 * assumed (standard JFreeChart) behaviour.
 */
public class ShapeUtilitiesTest {

    private static final double DELTA = 1e-6;

    // ===================== clone() =====================

    @Test
    public void testClone_NullShape_ReturnsNull() {
        assertNull(ShapeUtilities.clone(null));
    }

    @Test
    public void testClone_CloneableShape_ReturnsEqualButDifferentInstance() {
        Line2D original = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        Shape cloned = ShapeUtilities.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertTrue(cloned instanceof Line2D);
        assertTrue(ShapeUtilities.equal(original, (Line2D) cloned));
    }

    @Test
    public void testClone_NonCloneableShape_ReturnsNull() {
        // Anonymous Shape implementation that does NOT implement Cloneable
        Shape nonCloneable = new Shape() {
            public boolean contains(double x, double y) { return false; }
            public boolean contains(double x, double y, double w, double h) { return false; }
            public boolean contains(Point2D p) { return false; }
            public boolean contains(Rectangle2D r) { return false; }
            public java.awt.Rectangle getBounds() { return null; }
            public Rectangle2D getBounds2D() { return null; }
            public PathIterator getPathIterator(AffineTransform at) { return null; }
            public PathIterator getPathIterator(AffineTransform at, double flatness) { return null; }
            public boolean intersects(double x, double y, double w, double h) { return false; }
            public boolean intersects(Rectangle2D r) { return false; }
        };
        assertNull(ShapeUtilities.clone(nonCloneable));
    }

    // ===================== equal(Shape, Shape) dispatch =====================

    @Test
    public void testEqualShape_BothLine2D() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertTrue(ShapeUtilities.equal((Shape) l1, (Shape) l2));
    }

    @Test
    public void testEqualShape_BothEllipse2D() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 10, 10);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 10, 10);
        assertTrue(ShapeUtilities.equal((Shape) e1, (Shape) e2));
    }

    @Test
    public void testEqualShape_BothArc2D() {
        Arc2D a1 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 10, 10, 0, 90, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal((Shape) a1, (Shape) a2));
    }

    @Test
    public void testEqualShape_BothPolygon() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertTrue(ShapeUtilities.equal((Shape) p1, (Shape) p2));
    }

    @Test
    public void testEqualShape_BothGeneralPath() {
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        g1.lineTo(10, 10);
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        g2.lineTo(10, 10);
        assertTrue(ShapeUtilities.equal((Shape) g1, (Shape) g2));
    }

    @Test
    public void testEqualShape_FallbackRectangle2D_Equal() {
        // NOTE: assumes ObjectUtilities.equal() performs standard null-safe
        // .equals() comparison (common JFreeChart pattern).
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 5, 5);
        Rectangle2D r2 = new Rectangle2D.Double(0, 0, 5, 5);
        assertTrue(ShapeUtilities.equal((Shape) r1, (Shape) r2));
    }

    @Test
    public void testEqualShape_FallbackRectangle2D_NotEqual() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 5, 5);
        Rectangle2D r2 = new Rectangle2D.Double(0, 0, 6, 6);
        assertFalse(ShapeUtilities.equal((Shape) r1, (Shape) r2));
    }

    @Test
    public void testEqualShape_BothNull() {
        // NOTE: assumes ObjectUtilities.equal(null,null) == true
        assertTrue(ShapeUtilities.equal((Shape) null, (Shape) null));
    }

    @Test
    public void testEqualShape_OneNull() {
        Rectangle2D r1 = new Rectangle2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal((Shape) r1, (Shape) null));
    }

    // ===================== equal(Line2D, Line2D) =====================

    @Test
    public void testEqualLine_BothNull() {
        assertTrue(ShapeUtilities.equal((Line2D) null, (Line2D) null));
    }

    @Test
    public void testEqualLine_FirstNull() {
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertFalse(ShapeUtilities.equal((Line2D) null, l2));
    }

    @Test
    public void testEqualLine_SecondNull() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        assertFalse(ShapeUtilities.equal(l1, (Line2D) null));
    }

    @Test
    public void testEqualLine_DifferentP1() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(9, 9, 1, 1);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine_DifferentP2() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 9, 9);
        assertFalse(ShapeUtilities.equal(l1, l2));
    }

    @Test
    public void testEqualLine_Equal() {
        Line2D l1 = new Line2D.Double(0, 0, 1, 1);
        Line2D l2 = new Line2D.Double(0, 0, 1, 1);
        assertTrue(ShapeUtilities.equal(l1, l2));
    }

    // ===================== equal(Ellipse2D, Ellipse2D) =====================

    @Test
    public void testEqualEllipse_BothNull() {
        assertTrue(ShapeUtilities.equal((Ellipse2D) null, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse_FirstNull() {
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal((Ellipse2D) null, e2));
    }

    @Test
    public void testEqualEllipse_SecondNull() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 5, 5);
        assertFalse(ShapeUtilities.equal(e1, (Ellipse2D) null));
    }

    @Test
    public void testEqualEllipse_DifferentFrame() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 5, 5);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 6, 6);
        assertFalse(ShapeUtilities.equal(e1, e2));
    }

    @Test
    public void testEqualEllipse_SameFrame() {
        Ellipse2D e1 = new Ellipse2D.Double(0, 0, 5, 5);
        Ellipse2D e2 = new Ellipse2D.Double(0, 0, 5, 5);
        assertTrue(ShapeUtilities.equal(e1, e2));
    }

    // ===================== equal(Arc2D, Arc2D) =====================

    @Test
    public void testEqualArc_BothNull() {
        assertTrue(ShapeUtilities.equal((Arc2D) null, (Arc2D) null));
    }

    @Test
    public void testEqualArc_FirstNull() {
        Arc2D a2 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal((Arc2D) null, a2));
    }

    @Test
    public void testEqualArc_SecondNull() {
        Arc2D a1 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, (Arc2D) null));
    }

    @Test
    public void testEqualArc_DifferentFrame() {
        Arc2D a1 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 6, 6, 0, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_DifferentAngleStart() {
        Arc2D a1 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 5, 5, 10, 90, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_DifferentAngleExtent() {
        Arc2D a1 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 5, 5, 0, 45, Arc2D.OPEN);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_DifferentArcType() {
        Arc2D a1 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.CHORD);
        assertFalse(ShapeUtilities.equal(a1, a2));
    }

    @Test
    public void testEqualArc_AllEqual() {
        Arc2D a1 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        Arc2D a2 = new Arc2D.Double(0, 0, 5, 5, 0, 90, Arc2D.OPEN);
        assertTrue(ShapeUtilities.equal(a1, a2));
    }

    // ===================== equal(Polygon, Polygon) =====================

    @Test
    public void testEqualPolygon_BothNull() {
        assertTrue(ShapeUtilities.equal((Polygon) null, (Polygon) null));
    }

    @Test
    public void testEqualPolygon_FirstNull() {
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal((Polygon) null, p2));
    }

    @Test
    public void testEqualPolygon_SecondNull() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal(p1, (Polygon) null));
    }

    @Test
    public void testEqualPolygon_DifferentNPoints() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2, 3}, new int[]{0, 1, 2, 3}, 4);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygon_DifferentXPoints() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 9}, new int[]{0, 1, 2}, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygon_DifferentYPoints() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 9}, 3);
        assertFalse(ShapeUtilities.equal(p1, p2));
    }

    @Test
    public void testEqualPolygon_AllEqual() {
        Polygon p1 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        Polygon p2 = new Polygon(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 3);
        assertTrue(ShapeUtilities.equal(p1, p2));
    }

    // ===================== equal(GeneralPath, GeneralPath) =====================

    @Test
    public void testEqualGeneralPath_BothNull() {
        assertTrue(ShapeUtilities.equal((GeneralPath) null, (GeneralPath) null));
    }

    @Test
    public void testEqualGeneralPath_FirstNull() {
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal((GeneralPath) null, g2));
    }

    @Test
    public void testEqualGeneralPath_SecondNull() {
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal(g1, (GeneralPath) null));
    }

    @Test
    public void testEqualGeneralPath_DifferentWindingRule() {
        GeneralPath g1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        g1.moveTo(0, 0);
        GeneralPath g2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        g2.moveTo(0, 0);
        assertFalse(ShapeUtilities.equal(g1, g2));
    }

    @Test
    public void testEqualGeneralPath_IdenticalPaths() {
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        g1.lineTo(10, 10);
        g1.lineTo(20, 0);
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        g2.lineTo(10, 10);
        g2.lineTo(20, 0);
        assertTrue(ShapeUtilities.equal(g1, g2));
    }

    @Test
    public void testEqualGeneralPath_DifferentPaths_KnownDefect() {
        // KNOWN DEFECT (Defects4J Chart-11b): source builds iterator2 from
        // p1 instead of p2 ("PathIterator iterator2 = p1.getPathIterator(null);").
        // According to the documented contract, two GeneralPath objects with
        // different points MUST be unequal. This assertion is expected to
        // FAIL when run against the buggy source — this is intentional and
        // demonstrates the fault-finding capability of the test suite.
        GeneralPath g1 = new GeneralPath();
        g1.moveTo(0, 0);
        g1.lineTo(10, 10);
        GeneralPath g2 = new GeneralPath();
        g2.moveTo(0, 0);
        g2.lineTo(99, 99);
        assertFalse("Expected different paths to be unequal "
                + "(exposes iterator2/p1 bug)",
                ShapeUtilities.equal(g1, g2));
    }

    // ============ createTranslatedShape(Shape, double, double) ============

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_NullShape_Throws() {
        ShapeUtilities.createTranslatedShape(null, 1.0, 1.0);
    }

    @Test
    public void testCreateTranslatedShape_ValidTranslation() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(rect, 5.0, 3.0);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(5.0, bounds.getX(), DELTA);
        assertEquals(3.0, bounds.getY(), DELTA);
        assertEquals(10.0, bounds.getWidth(), DELTA);
        assertEquals(10.0, bounds.getHeight(), DELTA);
    }

    // === createTranslatedShape(Shape, RectangleAnchor, double, double) ===

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeAnchor_NullShape_Throws() {
        ShapeUtilities.createTranslatedShape(null, RectangleAnchor.CENTER, 1.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeAnchor_NullAnchor_Throws() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        ShapeUtilities.createTranslatedShape(rect, null, 1.0, 1.0);
    }

    @Test
    public void testCreateTranslatedShapeAnchor_ValidCenterAnchor() {
        // NOTE: assumes RectangleAnchor.coordinates() returns the geometric
        // center for RectangleAnchor.CENTER (standard JFreeChart behaviour).
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape translated = ShapeUtilities.createTranslatedShape(
                rect, RectangleAnchor.CENTER, 100.0, 100.0);
        Rectangle2D bounds = translated.getBounds2D();
        assertEquals(95.0, bounds.getX(), DELTA);
        assertEquals(95.0, bounds.getY(), DELTA);
    }

    // ===================== rotateShape =====================

    @Test
    public void testRotateShape_NullBase_ReturnsNull() {
        assertNull(ShapeUtilities.rotateShape(null, Math.PI / 2, 0f, 0f));
    }

    @Test
    public void testRotateShape_ZeroAngle_BoundsUnchanged() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        Shape rotated = ShapeUtilities.rotateShape(rect, 0.0, 0f, 0f);
        Rectangle2D bounds = rotated.getBounds2D();
        assertEquals(0.0, bounds.getX(), DELTA);
        assertEquals(0.0, bounds.getY(), DELTA);
        assertEquals(10.0, bounds.getWidth(), DELTA);
        assertEquals(10.0, bounds.getHeight(), DELTA);
    }

    @Test
    public void testRotateShape_NonZeroAngle_ProducesShape() {
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 0);
        Shape rotated = ShapeUtilities.rotateShape(rect, Math.PI / 2, 0f, 0f);
        assertNotNull(rotated);
        assertNotNull(rotated.getBounds2D());
    }

    // ===================== drawRotatedShape =====================

    @Test
    public void testDrawRotatedShape_RestoresOriginalTransform() {
        BufferedImage image = new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        AffineTransform before = g2.getTransform();
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 5, 5);
        ShapeUtilities.drawRotatedShape(g2, rect, Math.PI / 4, 2f, 2f);
        AffineTransform after = g2.getTransform();
        assertEquals(before, after);
        g2.dispose();
    }

    // ===================== createDiagonalCross =====================

    @Test
    public void testCreateDiagonalCross_NotNullAndHasBounds() {
        Shape shape = ShapeUtilities.createDiagonalCross(10f, 2f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    // ===================== createRegularCross =====================

    @Test
    public void testCreateRegularCross_NotNullAndHasBounds() {
        Shape shape = ShapeUtilities.createRegularCross(10f, 2f);
        assertNotNull(shape);
        Rectangle2D bounds = shape.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    // ===================== createDiamond =====================

    @Test
    public void testCreateDiamond_BoundsMatchSizeFactor() {
        Shape shape = ShapeUtilities.createDiamond(5f);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(-5.0, bounds.getMinX(), DELTA);
        assertEquals(-5.0, bounds.getMinY(), DELTA);
        assertEquals(5.0, bounds.getMaxX(), DELTA);
        assertEquals(5.0, bounds.getMaxY(), DELTA);
    }

    // ===================== createUpTriangle =====================

    @Test
    public void testCreateUpTriangle_BoundsMatchSizeFactor() {
        Shape shape = ShapeUtilities.createUpTriangle(5f);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(-5.0, bounds.getMinX(), DELTA);
        assertEquals(-5.0, bounds.getMinY(), DELTA);
        assertEquals(5.0, bounds.getMaxX(), DELTA);
        assertEquals(5.0, bounds.getMaxY(), DELTA);
    }

    // ===================== createDownTriangle =====================

    @Test
    public void testCreateDownTriangle_BoundsMatchSizeFactor() {
        Shape shape = ShapeUtilities.createDownTriangle(5f);
        Rectangle2D bounds = shape.getBounds2D();
        assertEquals(-5.0, bounds.getMinX(), DELTA);
        assertEquals(-5.0, bounds.getMinY(), DELTA);
        assertEquals(5.0, bounds.getMaxX(), DELTA);
        assertEquals(5.0, bounds.getMaxY(), DELTA);
    }

    // ===================== createLineRegion =====================

    @Test
    public void testCreateLineRegion_NonVerticalLine() {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 2f);
        assertNotNull(region);
        Rectangle2D bounds = region.getBounds2D();
        assertTrue(bounds.getWidth() > 0);
        assertTrue(bounds.getHeight() > 0);
    }

    @Test
    public void testCreateLineRegion_VerticalLine() {
        // x2 - x1 == 0 => triggers the "special case" (vertical line) branch
        Line2D line = new Line2D.Double(5, 0, 5, 10);
        Shape region = ShapeUtilities.createLineRegion(line, 4f);
        assertNotNull(region);
        Rectangle2D bounds = region.getBounds2D();
        assertEquals(3.0, bounds.getMinX(), DELTA);
        assertEquals(7.0, bounds.getMaxX(), DELTA);
        assertEquals(0.0, bounds.getMinY(), DELTA);
        assertEquals(10.0, bounds.getMaxY(), DELTA);
    }

    // ===================== getPointInRectangle =====================

    @Test
    public void testGetPointInRectangle_InsideBounds() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, 5, area);
        assertEquals(5.0, p.getX(), DELTA);
        assertEquals(5.0, p.getY(), DELTA);
    }

    @Test
    public void testGetPointInRectangle_XBelowMin() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(-5, 5, area);
        assertEquals(0.0, p.getX(), DELTA);
        assertEquals(5.0, p.getY(), DELTA);
    }

    @Test
    public void testGetPointInRectangle_XAboveMax() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(20, 5, area);
        assertEquals(10.0, p.getX(), DELTA);
        assertEquals(5.0, p.getY(), DELTA);
    }

    @Test
    public void testGetPointInRectangle_YBelowMin() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, -5, area);
        assertEquals(5.0, p.getX(), DELTA);
        assertEquals(0.0, p.getY(), DELTA);
    }

    @Test
    public void testGetPointInRectangle_YAboveMax() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(5, 20, area);
        assertEquals(5.0, p.getX(), DELTA);
        assertEquals(10.0, p.getY(), DELTA);
    }

    @Test
    public void testGetPointInRectangle_BoundaryValuesExactlyOnEdge() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 10, 10);
        Point2D p = ShapeUtilities.getPointInRectangle(0, 10, area);
        assertEquals(0.0, p.getX(), DELTA);
        assertEquals(10.0, p.getY(), DELTA);
    }

    // ===================== contains(Rectangle2D, Rectangle2D) =====================

    @Test
    public void testContains_Rect2FullyInsideRect1() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 10, 20, 20);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_Rect2XLessThanRect1X() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(-5, 10, 20, 20);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_Rect2YLessThanRect1Y() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(10, -5, 20, 20);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_Rect2ExceedsRightEdge() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(90, 10, 20, 20);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_Rect2ExceedsBottomEdge() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 90, 20, 20);
        assertFalse(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_ExactBoundaryMatch() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(0, 0, 100, 100);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    @Test
    public void testContains_ZeroWidthHeightRect2() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D rect2 = new Rectangle2D.Double(50, 50, 0, 0);
        assertTrue(ShapeUtilities.contains(rect1, rect2));
    }

    // ===================== intersects(Rectangle2D, Rectangle2D) =====================

    @Test
    public void testIntersects_Overlapping() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(5, 5, 10, 10);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_NoOverlap_Right() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(20, 0, 5, 5);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_NoOverlap_Below() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(0, 20, 5, 5);
        assertFalse(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_TouchingEdge() {
        Rectangle2D rect1 = new Rectangle2D.Double(10, 10, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(0, 10, 10, 10);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_TouchingOppositeEdge() {
        Rectangle2D rect1 = new Rectangle2D.Double(0, 0, 10, 10);
        Rectangle2D rect2 = new Rectangle2D.Double(10, 0, 5, 5);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }

    @Test
    public void testIntersects_NegativeCoordinates() {
        Rectangle2D rect1 = new Rectangle2D.Double(-10, -10, 5, 5);
        Rectangle2D rect2 = new Rectangle2D.Double(-8, -8, 2, 2);
        assertTrue(ShapeUtilities.intersects(rect1, rect2));
    }
}

package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.junit.Assert;
import org.junit.Test;

public class PolygonsSetTest {

    private static final double EPSILON = 1.0e-10;

    /**
     * ทดสอบกรณี Full Space (สร้างด้วย default constructor ไม่มีขอบเขต)
     */
    @Test
    public void testFullSpace() {
        PolygonsSet set = new PolygonsSet();
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getX()));
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getY()));
        Assert.assertEquals(0, set.getVertices().length);
        Assert.assertTrue(set.contains(new PolygonsSet()));
    }

    /**
     * ทดสอบกรณี Empty Space (สร้างจาก BSPTree ที่มี attribute เป็น Boolean.FALSE)
     */
    @Test
    public void testEmptySpace() {
        BSPTree<Euclidean2D> emptyTree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet set = new PolygonsSet(emptyTree);
        Assert.assertEquals(0.0, set.getSize(), EPSILON);
        Assert.assertEquals(0.0, set.getBarycenter().getX(), EPSILON);
        Assert.assertEquals(0.0, set.getBarycenter().getY(), EPSILON);
        Assert.assertEquals(0, set.getVertices().length);
    }

    /**
     * ทดสอบกรณี Closed Finite Box ปกติ (Finite Polygon: sum >= 0)
     */
    @Test
    public void testBox() {
        PolygonsSet box = new PolygonsSet(0.0, 4.0, 0.0, 2.0);
        Assert.assertEquals(8.0, box.getSize(), EPSILON);
        Assert.assertEquals(2.0, box.getBarycenter().getX(), EPSILON);
        Assert.assertEquals(1.0, box.getBarycenter().getY(), EPSILON);

        Vector2D[][] vertices = box.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertEquals(4, vertices[0].length);

        // ทดสอบ Caching branch ของ getVertices()
        Vector2D[][] cachedVertices = box.getVertices();
        Assert.assertEquals(vertices.length, cachedVertices.length);
    }

    /**
     * ทดสอบกรณี Half-Plane (Single Infinite Line: loop.size() < 2)
     */
    @Test
    public void testHalfPlaneSingleLine() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine subLine = new SubLine(line, new IntervalsSet());
        Collection<SubHyperplane<Euclidean2D>> boundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        boundaries.add(subLine);

        PolygonsSet set = new PolygonsSet(boundaries);
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(set.getBarycenter().getX()));

        Vector2D[][] vertices = set.getVertices();
        Assert.assertEquals(1, vertices.length);
        Assert.assertEquals(3, vertices[0].length);
        Assert.assertNull(vertices[0][0]); // เริ่มต้นด้วย null point
    }

    /**
     * ทดสอบกรณี Open Loop ที่มีจุดตัดจริงอย่างน้อย 1 จุด (Quarter Plane)
     */
    @Test
    public void testQuarterPlaneOpenLoopWithVertices() {
        Line l1 = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Line l2 = new Line(new Vector2D(0, 0), new Vector2D(0, 1));

        SubLine s1 = new SubLine(l1, new IntervalsSet(0.0, Double.POSITIVE_INFINITY));
        SubLine s2 = new SubLine(l2, new IntervalsSet(Double.NEGATIVE_INFINITY, 0.0));

        Collection<SubHyperplane<Euclidean2D>> boundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        boundaries.add(s1);
        boundaries.add(s2);

        PolygonsSet set = new PolygonsSet(boundaries);
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);

        Vector2D[][] vertices = set.getVertices();
        Assert.assertTrue(vertices.length > 0);
        Assert.assertNull(vertices[0][0]);
    }

    /**
     * ทดสอบกรณี Polygon With Hole (CSG Difference ระหว่างกล่องใหญ่และกล่องเล็ก)
     */
    @Test
    public void testPolygonWithHole() {
        PolygonsSet outer = new PolygonsSet(-5.0, 5.0, -5.0, 5.0);
        PolygonsSet inner = new PolygonsSet(-2.0, 2.0, -2.0, 2.0);

        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet holeSet = (PolygonsSet) factory.difference(outer, inner);

        // พื้นที่ 100 - 16 = 84
        Assert.assertEquals(84.0, holeSet.getSize(), EPSILON);
        Assert.assertEquals(0.0, holeSet.getBarycenter().getX(), EPSILON);
        Assert.assertEquals(0.0, holeSet.getBarycenter().getY(), EPSILON);

        Vector2D[][] vertices = holeSet.getVertices();
        Assert.assertEquals(2, vertices.length); // มี 2 loops (ด้านนอกและด้านใน)
    }

    /**
     * ทดสอบกรณี Inverted Closed Shape (sum < 0: Finite outside surrounded by infinite inside)
     */
    @Test
    public void testInvertedRegion() {
        PolygonsSet box = new PolygonsSet(0.0, 2.0, 0.0, 2.0);
        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet inverted = (PolygonsSet) factory.getComplement(box);

        Assert.assertEquals(Double.POSITIVE_INFINITY, inverted.getSize(), EPSILON);
        Assert.assertTrue(Double.isNaN(inverted.getBarycenter().getX()));
    }

    /**
     * ทดสอบกรณี Empty Boundary Collection
     */
    @Test
    public void testEmptyBoundaryCollection() {
        Collection<SubHyperplane<Euclidean2D>> emptyBoundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet set = new PolygonsSet(emptyBoundaries);
        Assert.assertEquals(Double.POSITIVE_INFINITY, set.getSize(), EPSILON);
    }

    /**
     * ทดสอบเมธอด buildNew()
     */
    @Test
    public void testBuildNew() {
        PolygonsSet box = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        PolygonsSet built = box.buildNew(box.getTree(false));
        Assert.assertNotNull(built);
        Assert.assertEquals(box.getSize(), built.getSize(), EPSILON);
    }

    /**
     * ทดสอบกรณี Degenerated Thin Loop (loop.size() == 2 && !open)
     */
    @Test
    public void testDegeneratedThinLoop() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine segment1 = new SubLine(line, new IntervalsSet(0.0, 2.0));
        SubLine segment2 = new SubLine(line.getReverse(), new IntervalsSet(-2.0, 0.0));

        Collection<SubHyperplane<Euclidean2D>> boundaries = new ArrayList<SubHyperplane<Euclidean2D>>();
        boundaries.add(segment1);
        boundaries.add(segment2);

        PolygonsSet set = new PolygonsSet(boundaries);
        Vector2D[][] vertices = set.getVertices();
        Assert.assertEquals(0, vertices.length);
    }
}
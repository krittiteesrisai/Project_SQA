package org.apache.commons.math3.geometry.euclidean.twod;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;

public class PolygonsSetTest {

    private static final double EPS = 1.0e-9;

    // ---------- 1) Default constructor: whole space (empty boundary) ----------
    @Test
    public void testDefaultConstructorWholeSpace() {
        PolygonsSet whole = new PolygonsSet();
        assertEquals(Double.POSITIVE_INFINITY, whole.getSize(), 0.0);
        Vector2D bary = whole.getBarycenter();
        assertTrue(Double.isNaN(bary.getX()));
        assertTrue(Double.isNaN(bary.getY()));

        Vector2D[][] vertices = whole.getVertices();
        assertEquals(0, vertices.length); // v.length == 0 branch
    }

    // ---------- 2) BSPTree constructor, attribute = TRUE (whole space) ----------
    @Test
    public void testBSPTreeConstructorAttributeTrue() {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        PolygonsSet region = new PolygonsSet(tree);
        assertEquals(Double.POSITIVE_INFINITY, region.getSize(), 0.0);
        assertTrue(Double.isNaN(region.getBarycenter().getX()));
    }

    // ---------- 3) BSPTree constructor, attribute = FALSE (empty region) ----------
    @Test
    public void testBSPTreeConstructorAttributeFalse() {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet region = new PolygonsSet(tree);
        assertEquals(0.0, region.getSize(), 0.0);
        Vector2D bary = region.getBarycenter();
        assertEquals(0.0, bary.getX(), 0.0);
        assertEquals(0.0, bary.getY(), 0.0);
    }

    // ---------- 4) Empty boundary collection -> whole space ----------
    @Test
    public void testEmptyBoundaryCollectionResultsInWholeSpace() {
        List<SubHyperplane<Euclidean2D>> boundary = new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet region = new PolygonsSet(boundary);
        assertEquals(Double.POSITIVE_INFINITY, region.getSize(), 0.0);
        assertEquals(0, region.getVertices().length);
    }

    // ---------- 5) Normal box: closed loop, positive area branch ----------
    @Test
    public void testBoxConstructorComputesSizeAndBarycenter() {
        PolygonsSet box = new PolygonsSet(0.0, 2.0, 0.0, 1.0);
        assertEquals(2.0, box.getSize(), EPS);
        Vector2D bary = box.getBarycenter();
        assertEquals(1.0, bary.getX(), EPS);
        assertEquals(0.5, bary.getY(), EPS);
    }

    @Test
    public void testBoxConstructorVerticesClosedLoop() {
        PolygonsSet box = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        Vector2D[][] vertices = box.getVertices();
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
        assertNotNull(vertices[0][0]); // closed loop -> first point not null
    }

    // ---------- 6) Single infinite line boundary -> open loop, loop.size()<2 branch ----------
    @Test
    public void testSingleLineBoundaryOpenLoopSingleSegment() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        List<SubHyperplane<Euclidean2D>> boundary = new ArrayList<SubHyperplane<Euclidean2D>>();
        boundary.add(line.wholeHyperplane());
        PolygonsSet halfPlane = new PolygonsSet(boundary);

        assertEquals(Double.POSITIVE_INFINITY, halfPlane.getSize(), 0.0);
        assertTrue(Double.isNaN(halfPlane.getBarycenter().getX()));

        Vector2D[][] vertices = halfPlane.getVertices();
        assertEquals(1, vertices.length);
        assertNull(vertices[0][0]);          // open loop marker
        assertEquals(3, vertices[0].length); // single infinite line -> 3-element array
    }

    // ---------- 7) Quadrant via intersection of two half planes -> open loop with real vertex ----------
    // ความเสี่ยง: branch นี้ใน getVertices() (loop.size()==2, open loop) มีโอกาสเกิด
    // NullPointerException จากการเรียก segment.getStart() บน segment ที่ start==null
    // เมื่อคำนวณ "last dummy point" — ถ้าพบ error/failure ในจุดนี้ ถือเป็นการตรวจพบ fault จริง
    @Test
    public void testQuadrantOpenLoopWithRealVertex() {
        Line lineX = new Line(new Vector2D(0, 1), new Vector2D(0, -1)); // inside x >= 0
        Line lineY = new Line(new Vector2D(-1, 0), new Vector2D(1, 0)); // inside y >= 0

        List<SubHyperplane<Euclidean2D>> bx = new ArrayList<SubHyperplane<Euclidean2D>>();
        bx.add(lineX.wholeHyperplane());
        List<SubHyperplane<Euclidean2D>> by = new ArrayList<SubHyperplane<Euclidean2D>>();
        by.add(lineY.wholeHyperplane());

        PolygonsSet halfX = new PolygonsSet(bx);
        PolygonsSet halfY = new PolygonsSet(by);

        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet quadrant = (PolygonsSet) factory.intersection(halfX, halfY);

        assertEquals(Double.POSITIVE_INFINITY, quadrant.getSize(), 0.0);

        Vector2D[][] vertices = quadrant.getVertices();
        assertEquals(1, vertices.length);
        assertNull(vertices[0][0]);
        assertTrue(vertices[0].length >= 3);
    }

    // ---------- 8) getVertices() caching & clone behaviour ----------
    @Test
    public void testGetVerticesCachingReturnsClonedArray() {
        PolygonsSet box = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        Vector2D[][] v1 = box.getVertices();
        Vector2D[][] v2 = box.getVertices();

        assertNotSame(v1, v2); // outer array is cloned every call
        assertEquals(v1.length, v2.length);
        for (int i = 0; i < v1.length; i++) {
            assertArrayEquals(v1[i], v2[i]); // inner content identical (cached)
        }
    }

    // ---------- 9) Degenerate box (xMin == xMax) - malformed boundary input ----------
    // สมมติฐาน: Line ไม่สามารถสร้างจากจุดซ้ำกันได้ (ทิศทางไม่ถูกกำหนด) จึงคาด
    // ว่าจะเกิด exception บางชนิด — ไม่ยืนยัน exact type เนื่องจากไม่มีซอร์ส Line
    @Test
    public void testDegenerateBoxWithZeroWidthThrows() {
        boolean exceptionThrown = false;
        try {
            new PolygonsSet(1.0, 1.0, 0.0, 1.0);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        assertTrue("Expected an exception for degenerate (zero width) box", exceptionThrown);
    }

    // ---------- 10) buildNew(...) override ----------
    @Test
    public void testBuildNewReturnsNewPolygonsSetInstance() {
        PolygonsSet original = new PolygonsSet();
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet rebuilt = original.buildNew(tree);
        assertNotNull(rebuilt);
        assertEquals(0.0, rebuilt.getSize(), 0.0);
    }

    // ---------- 11) Complement -> attempt to trigger "sum < 0" branch ----------
    // สมมติฐาน: RegionFactory#getComplement สลับ inside/outside ตาม contract สาธารณะ
    // ของ RegionFactory (ไม่ใช่ internal behavior ของ PolygonsSet เอง)
    @Test
    public void testComplementOfBoxIsInfiniteWithReversedOrientation() {
        PolygonsSet box = new PolygonsSet(0.0, 1.0, 0.0, 1.0);
        RegionFactory<Euclidean2D> factory = new RegionFactory<Euclidean2D>();
        PolygonsSet complement = (PolygonsSet) factory.getComplement(box);

        assertEquals(Double.POSITIVE_INFINITY, complement.getSize(), 0.0);
        assertTrue(Double.isNaN(complement.getBarycenter().getX()));
    }

    // ---------- 12) Box with reversed min/max args (boundary-order edge case) ----------
    // ไม่ยืนยัน sign ของ sum เนื่องจากขึ้นกับ orientation convention ของ Line
    // ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา — ตรวจสอบเพียงว่าไม่เกิด NaN/ไม่ throw โดยไม่คาดคิด
    @Test
    public void testBoxWithReversedMinMaxStillProducesAValidRegion() {
        PolygonsSet box = new PolygonsSet(2.0, 0.0, 0.0, 1.0);
        double size = box.getSize();
        assertFalse(Double.isNaN(size));
    }
}

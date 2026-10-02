package org.apache.commons.math3.geometry.euclidean.threed;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.junit.Test;

/**
 * Unit tests for {@link SubLine} (Apache Commons Math3, Defects4J Math-4b).
 *
 * หมายเหตุ: ไม่มีการทดสอบ null-input เนื่องจากซอร์สโค้ดที่ให้มาไม่มีการ validate
 * null อย่างชัดเจน และพฤติกรรมที่แน่นอน (เช่น NPE จาก Line หรือ Vector3D)
 * ไม่สามารถยืนยันได้จากซอร์สที่มี จึงไม่เขียนทดสอบเพื่อหลีกเลี่ยงการเดา behavior
 */
public class SubLineTest {

    private static final double EPS = 1.0e-9;

    // ---------------------------------------------------------------
    // Constructor: SubLine(Vector3D start, Vector3D end)
    // ---------------------------------------------------------------

    @Test
    public void testConstructorFromTwoPoints_valid() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(10, 0, 0);
        SubLine subLine = new SubLine(start, end);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorFromTwoPoints_samePoint_throwsException() {
        // boundary case: start == end -> buildIntervalSet ควร throw exception
        Vector3D p = new Vector3D(1, 1, 1);
        new SubLine(p, p);
    }

    // ---------------------------------------------------------------
    // Constructor: SubLine(Segment segment)
    // ---------------------------------------------------------------

    @Test
    public void testConstructorFromSegment_valid() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(5, 0, 0);
        Line line = new Line(start, end);
        Segment segment = new Segment(start, end, line);
        SubLine subLine = new SubLine(segment);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorFromSegment_samePoint_throwsException() {
        // สร้าง Line จากจุดที่ต่างกันเพื่อให้ Line constructor ไม่ throw
        // แต่ Segment เก็บ start==end ทำให้ buildIntervalSet(start,end)
        // ภายใน SubLine(Segment) throw exception เมื่อสร้าง Line ใหม่
        Vector3D p = new Vector3D(2, 2, 2);
        Line distinctLine = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Segment segment = new Segment(p, p, distinctLine);
        new SubLine(segment);
    }

    // ---------------------------------------------------------------
    // getSegments()
    // ---------------------------------------------------------------

    @Test
    public void testGetSegments_singleSegment_coordinatesMatch() {
        Vector3D start = new Vector3D(0, 0, 0);
        Vector3D end   = new Vector3D(10, 0, 0);
        SubLine subLine = new SubLine(start, end);
        List<Segment> segments = subLine.getSegments();
        assertEquals(1, segments.size());

        Segment seg = segments.get(0);
        // ไม่ยืนยันลำดับ start/end แน่นอน ใช้ min-distance แทน
        double dStart = Math.min(seg.getStart().distance(start), seg.getStart().distance(end));
        double dEnd   = Math.min(seg.getEnd().distance(start), seg.getEnd().distance(end));
        assertTrue(dStart < EPS);
        assertTrue(dEnd < EPS);
    }

    @Test
    public void testGetSegments_multipleSegments_loopMultipleIterations() {
        IntervalsSet set1 = new IntervalsSet(0, 1);
        IntervalsSet set2 = new IntervalsSet(3, 4);
        RegionFactory<Euclidean1D> factory = new RegionFactory<Euclidean1D>();
        Region<Euclidean1D> unionRegion = factory.union(set1, set2);
        IntervalsSet union = (IntervalsSet) unionRegion;

        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = new SubLine(line, union);
        List<Segment> segments = subLine.getSegments();
        assertEquals(2, segments.size());
    }

    @Test
    public void testGetSegments_emptyRegion_loopZeroIterations() {
        IntervalsSet set1 = new IntervalsSet(0, 1);
        IntervalsSet set2 = new IntervalsSet(3, 4);
        RegionFactory<Euclidean1D> factory = new RegionFactory<Euclidean1D>();
        // สอง interval ไม่ overlap -> intersection เป็น empty set
        Region<Euclidean1D> emptyRegion = factory.intersection(set1, set2);
        IntervalsSet empty = (IntervalsSet) emptyRegion;

        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine subLine = new SubLine(line, empty);
        List<Segment> segments = subLine.getSegments();
        assertEquals(0, segments.size());
    }

    // ---------------------------------------------------------------
    // intersection(SubLine, boolean)
    // ---------------------------------------------------------------

    @Test
    public void testIntersection_bothInside_includeEndpointsTrue_returnsPoint() {
        SubLine subA = new SubLine(new Vector3D(0, 0, 0), new Vector3D(10, 0, 0));
        SubLine subB = new SubLine(new Vector3D(5, -5, 0), new Vector3D(5, 5, 0));
        Vector3D result = subA.intersection(subB, true);
        assertNotNull(result);
        assertEquals(5.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
    }

    @Test
    public void testIntersection_bothInside_includeEndpointsFalse_returnsPoint() {
        SubLine subA = new SubLine(new Vector3D(0, 0, 0), new Vector3D(10, 0, 0));
        SubLine subB = new SubLine(new Vector3D(5, -5, 0), new Vector3D(5, 5, 0));
        Vector3D result = subA.intersection(subB, false);
        assertNotNull(result);
        assertEquals(5.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
    }

    @Test
    public void testIntersection_boundaryAndInside_includeEndpointsTrue_returnsPoint() {
        // subA endpoint อยู่ที่จุดตัดพอดี -> loc1 = BOUNDARY, loc2 = INSIDE
        SubLine subA = new SubLine(new Vector3D(5, 0, 0), new Vector3D(10, 0, 0));
        SubLine subB = new SubLine(new Vector3D(5, -5, 0), new Vector3D(5, 5, 0));
        Vector3D result = subA.intersection(subB, true);
        assertNotNull(result);
    }

    @Test
    public void testIntersection_boundaryAndInside_includeEndpointsFalse_returnsNull() {
        SubLine subA = new SubLine(new Vector3D(5, 0, 0), new Vector3D(10, 0, 0));
        SubLine subB = new SubLine(new Vector3D(5, -5, 0), new Vector3D(5, 5, 0));
        Vector3D result = subA.intersection(subB, false);
        assertNull(result);
    }

    @Test
    public void testIntersection_outside_includeEndpointsTrue_returnsNull() {
        // จุดตัด (x=5) อยู่นอก range [6,10] ของ subA -> loc1 = OUTSIDE
        SubLine subA = new SubLine(new Vector3D(6, 0, 0), new Vector3D(10, 0, 0));
        SubLine subB = new SubLine(new Vector3D(5, -5, 0), new Vector3D(5, 5, 0));
        Vector3D result = subA.intersection(subB, true);
        assertNull(result);
    }

    @Test
    public void testIntersection_outside_includeEndpointsFalse_returnsNull() {
        SubLine subA = new SubLine(new Vector3D(6, 0, 0), new Vector3D(10, 0, 0));
        SubLine subB = new SubLine(new Vector3D(5, -5, 0), new Vector3D(5, 5, 0));
        Vector3D result = subA.intersection(subB, false);
        assertNull(result);
    }
}

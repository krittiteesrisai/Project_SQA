package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SubLineTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testConstructorAndGetSegmentsSingleSegment() {
        Vector2D start = new Vector2D(0, 0);
        Vector2D end = new Vector2D(3, 4);
        SubLine subLine = new SubLine(start, end);

        List<Segment> segments = subLine.getSegments();
        Assert.assertNotNull(segments);
        Assert.assertEquals(1, segments.size());

        Segment segment = segments.get(0);
        Assert.assertEquals(0.0, start.distance(segment.getStart()), EPSILON);
        Assert.assertEquals(0.0, end.distance(segment.getEnd()), EPSILON);
    }

    @Test
    public void testConstructorFromSegment() {
        Vector2D start = new Vector2D(1, 2);
        Vector2D end = new Vector2D(4, 6);
        Line line = new Line(start, end);
        Segment segment = new Segment(start, end, line);

        SubLine subLine = new SubLine(segment);
        List<Segment> segments = subLine.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, start.distance(segments.get(0).getStart()), EPSILON);
        Assert.assertEquals(0.0, end.distance(segments.get(0).getEnd()), EPSILON);
    }

    @Test
    public void testGetSegmentsWholeLineAndEmpty() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        // Whole line subline
        SubLine wholeLine = new SubLine(line, new IntervalsSet());
        List<Segment> wholeSegments = wholeLine.getSegments();
        Assert.assertEquals(1, wholeSegments.size());
        Assert.assertTrue(Double.isInfinite(wholeSegments.get(0).getStart().getX()));
        Assert.assertTrue(Double.isInfinite(wholeSegments.get(0).getEnd().getX()));

        // Empty subline
        SubLine emptyLine = new SubLine(line, new IntervalsSet(new BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(Boolean.FALSE)));
        List<Segment> emptySegments = emptyLine.getSegments();
        Assert.assertEquals(0, emptySegments.size());
    }

    @Test
    public void testIntersectionParallelDisjointDefects4JMath4() {
        // Line 1: along y = 0 from x = 0 to 5
        SubLine line1 = new SubLine(new Vector2D(0, 0), new Vector2D(5, 0));
        // Line 2: along y = 1 from x = 0 to 5 (Parallel to line 1)
        SubLine line2 = new SubLine(new Vector2D(0, 1), new Vector2D(5, 1));

        // When parallel, line1.intersection(line2) is null. Must handle gracefully and return null.
        Assert.assertNull(line1.intersection(line2, true));
        Assert.assertNull(line1.intersection(line2, false));
    }

    @Test
    public void testIntersectionCollinearDisjoint() {
        // Collinear sub-lines that do not overlap
        SubLine line1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine line2 = new SubLine(new Vector2D(3, 0), new Vector2D(5, 0));

        Assert.assertNull(line1.intersection(line2, true));
        Assert.assertNull(line1.intersection(line2, false));
    }

    @Test
    public void testIntersectionInsideBoth() {
        // Crossing at (1, 1) strictly inside both sub-lines
        SubLine line1 = new SubLine(new Vector2D(0, 1), new Vector2D(2, 1));
        SubLine line2 = new SubLine(new Vector2D(1, 0), new Vector2D(1, 2));

        Vector2D ptIncluded = line1.intersection(line2, true);
        Vector2D ptExcluded = line1.intersection(line2, false);

        Assert.assertNotNull(ptIncluded);
        Assert.assertNotNull(ptExcluded);
        Assert.assertEquals(1.0, ptIncluded.getX(), EPSILON);
        Assert.assertEquals(1.0, ptIncluded.getY(), EPSILON);
        Assert.assertEquals(1.0, ptExcluded.getX(), EPSILON);
        Assert.assertEquals(1.0, ptExcluded.getY(), EPSILON);
    }

    @Test
    public void testIntersectionOnBoundary() {
        // line1: (0, 0) -> (2, 0); line2: (2, 0) -> (2, 2) [Boundary at (2,0)]
        SubLine line1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine line2 = new SubLine(new Vector2D(2, 0), new Vector2D(2, 2));

        // Boundary intersection should be accepted when includeEndPoints is true, null when false
        Vector2D ptIncluded = line1.intersection(line2, true);
        Vector2D ptExcluded = line1.intersection(line2, false);

        Assert.assertNotNull(ptIncluded);
        Assert.assertEquals(2.0, ptIncluded.getX(), EPSILON);
        Assert.assertEquals(0.0, ptIncluded.getY(), EPSILON);
        Assert.assertNull(ptExcluded);
    }

    @Test
    public void testIntersectionBoundaryOfOneInsideAnother() {
        // line1: (0, 1) -> (2, 1); line2: (1, 1) -> (1, 3) [Boundary of line2 meets interior of line1]
        SubLine line1 = new SubLine(new Vector2D(0, 1), new Vector2D(2, 1));
        SubLine line2 = new SubLine(new Vector2D(1, 1), new Vector2D(1, 3));

        Vector2D ptIncluded = line1.intersection(line2, true);
        Vector2D ptExcluded = line1.intersection(line2, false);

        Assert.assertNotNull(ptIncluded);
        Assert.assertEquals(1.0, ptIncluded.getX(), EPSILON);
        Assert.assertEquals(1.0, ptIncluded.getY(), EPSILON);
        Assert.assertNull(ptExcluded);
    }

    @Test
    public void testIntersectionOutsideRanges() {
        // Lines intersect in Euclidean space at (5, 5), but segments are outside this point
        SubLine line1 = new SubLine(new Vector2D(0, 5), new Vector2D(2, 5));
        SubLine line2 = new SubLine(new Vector2D(5, 0), new Vector2D(5, 2));

        Assert.assertNull(line1.intersection(line2, true));
        Assert.assertNull(line1.intersection(line2, false));
    }

    @Test
    public void testSideParallelLines() {
        // Base line along x-axis (y = 0)
        SubLine subLine = new SubLine(new Vector2D(0, 0), new Vector2D(5, 0));

        // Hyperplane parallel above (y = 1) -> offset is positive (> 1e-10)
        Line hyperAbove = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        Assert.assertEquals(Side.PLUS, subLine.side(hyperAbove));

        // Hyperplane parallel below (y = -1) -> offset is negative (< -1e-10)
        Line hyperBelow = new Line(new Vector2D(0, -1), new Vector2D(1, -1));
        Assert.assertEquals(Side.MINUS, subLine.side(hyperBelow));

        // Hyperplane coincident (y = 0) -> offset == 0 (-1e-10 <= global <= 1e-10)
        Line hyperCoincident = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Assert.assertEquals(Side.HYPER, subLine.side(hyperCoincident));
    }

    @Test
    public void testSideIntersectingDirectTrueAndFalse() {
        SubLine subLine = new SubLine(new Vector2D(1, 0), new Vector2D(5, 0));

        // Line intersecting right in the middle (x = 3) -> Side.BOTH
        Line hyperCrossing = new Line(new Vector2D(3, -2), new Vector2D(3, 2));
        Assert.assertEquals(Side.BOTH, subLine.side(hyperCrossing));

        // Line intersecting outside the subline segment (at x = 0, angle pi/2)
        Line hyperOutside1 = new Line(new Vector2D(0, -2), new Vector2D(0, 2));
        Side side1 = subLine.side(hyperOutside1);
        Assert.assertTrue(side1 == Side.PLUS || side1 == Side.MINUS);

        // Line intersecting at angle triggering opposite direct flag (FastMath.sin(angle diff) opposite sign)
        Line hyperOutside2 = new Line(new Vector2D(0, 2), new Vector2D(0, -2));
        Side side2 = subLine.side(hyperOutside2);
        Assert.assertTrue(side2 == Side.PLUS || side2 == Side.MINUS);
        Assert.assertNotEquals(side1, side2);
    }

    @Test
    public void testSplitParallel() {
        SubLine subLine = new SubLine(new Vector2D(0, 0), new Vector2D(5, 0));

        // Hyperplane parallel above (offset > 1e-10)
        Line hyperAbove = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        SplitSubHyperplane<Euclidean2D> splitAbove = subLine.split(hyperAbove);
        Assert.assertNotNull(splitAbove.getPlus());
        Assert.assertNull(splitAbove.getMinus());

        // Hyperplane parallel below (offset < -1e-10)
        Line hyperBelow = new Line(new Vector2D(0, -1), new Vector2D(1, -1));
        SplitSubHyperplane<Euclidean2D> splitBelow = subLine.split(hyperBelow);
        Assert.assertNull(splitBelow.getPlus());
        Assert.assertNotNull(splitBelow.getMinus());
    }

    @Test
    public void testSplitIntersectingInside() {
        SubLine subLine = new SubLine(new Vector2D(0, 0), new Vector2D(4, 0));
        Line cuttingLine = new Line(new Vector2D(2, -2), new Vector2D(2, 2));

        SplitSubHyperplane<Euclidean2D> split = subLine.split(cuttingLine);
        Assert.assertNotNull(split.getPlus());
        Assert.assertNotNull(split.getMinus());

        SubLine plusSub = (SubLine) split.getPlus();
        SubLine minusSub = (SubLine) split.getMinus();

        Assert.assertEquals(1, plusSub.getSegments().size());
        Assert.assertEquals(1, minusSub.getSegments().size());
    }

    @Test
    public void testSplitIntersectingOutsideSegment() {
        // Segment [2, 6] along x-axis, cut at x = 0
        SubLine subLine = new SubLine(new Vector2D(2, 0), new Vector2D(6, 0));
        Line cuttingLine = new Line(new Vector2D(0, -1), new Vector2D(0, 1));

        SplitSubHyperplane<Euclidean2D> split = subLine.split(cuttingLine);
        // Cutting line does not cross segment body -> one side empty tree
        boolean plusEmpty = split.getPlus() == null || ((SubLine) split.getPlus()).getSegments().isEmpty();
        boolean minusEmpty = split.getMinus() == null || ((SubLine) split.getMinus()).getSegments().isEmpty();

        Assert.assertTrue(plusEmpty ^ minusEmpty); // Exactly one side is empty
    }

    @Test
    public void testBuildNew() {
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        IntervalsSet intervals = new IntervalsSet(1.0, 3.0);
        SubLine original = new SubLine(line, intervals);

        Line newLine = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        IntervalsSet newIntervals = new IntervalsSet(2.0, 4.0);
        org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> created =
                original.buildNew(newLine, newIntervals);

        Assert.assertTrue(created instanceof SubLine);
        SubLine subLineCreated = (SubLine) created;
        Assert.assertEquals(1, subLineCreated.getSegments().size());
        Assert.assertEquals(2.0, subLineCreated.getSegments().get(0).getStart().getX(), EPSILON);
        Assert.assertEquals(4.0, subLineCreated.getSegments().get(0).getEnd().getX(), EPSILON);
    }
}
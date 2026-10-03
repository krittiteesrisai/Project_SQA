package org.apache.commons.math3.geometry.euclidean.threed;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class LineTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testConstructorAndGetters() {
        Vector3D p1 = new Vector3D(1, 1, 1);
        Vector3D p2 = new Vector3D(1, 1, 3);
        Line line = new Line(p1, p2);

        Assert.assertEquals(0.0, line.getDirection().distance(new Vector3D(0, 0, 1)), EPSILON);
        Assert.assertEquals(0.0, line.getOrigin().distance(new Vector3D(1, 1, 0)), EPSILON);

        // Copy constructor
        Line copy = new Line(line);
        Assert.assertEquals(0.0, copy.getDirection().distance(line.getDirection()), EPSILON);
        Assert.assertEquals(0.0, copy.getOrigin().distance(line.getOrigin()), EPSILON);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorIdenticalPointsThrowsException() {
        Vector3D p = new Vector3D(2.5, -1.0, 3.0);
        new Line(p, new Vector3D(2.5, -1.0, 3.0));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testResetIdenticalPointsThrowsException() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        Vector3D p = new Vector3D(1.0, 2.0, 3.0);
        line.reset(p, p);
    }

    @Test
    public void testRevert() {
        Vector3D p1 = new Vector3D(1, 2, 3);
        Vector3D p2 = new Vector3D(1, 2, 10);
        Line line = new Line(p1, p2);
        Line reverted = line.revert();

        Assert.assertEquals(0.0, reverted.getDirection().distance(line.getDirection().negate()), EPSILON);
        Assert.assertEquals(0.0, reverted.getOrigin().distance(line.getOrigin()), EPSILON);
        Assert.assertTrue(line.contains(reverted.getOrigin()));
    }

    @Test
    public void testAbscissaAndPointAt() {
        Vector3D p1 = new Vector3D(0, 0, 0);
        Vector3D p2 = new Vector3D(0, 0, 2);
        Line line = new Line(p1, p2);

        Vector3D testPoint = new Vector3D(0, 0, 5);
        double abscissa = line.getAbscissa(testPoint);
        Assert.assertEquals(5.0, abscissa, EPSILON);

        Vector3D reconstructed = line.pointAt(abscissa);
        Assert.assertEquals(0.0, reconstructed.distance(testPoint), EPSILON);
    }

    @Test
    public void testSubSpaceAndSpaceTransform() {
        Line line = new Line(new Vector3D(1, 0, 0), new Vector3D(1, 0, 5));
        Vector3D point3D = new Vector3D(1, 0, 3);

        Vector1D subSpace = line.toSubSpace(point3D);
        Assert.assertEquals(3.0, subSpace.getX(), EPSILON);

        Vector3D space3D = line.toSpace(subSpace);
        Assert.assertEquals(0.0, space3D.distance(point3D), EPSILON);
    }

    @Test
    public void testIsSimilarToSameDirection() {
        Line line1 = new Line(new Vector3D(1, 2, 3), new Vector3D(1, 2, 10));
        Line line2 = new Line(new Vector3D(1, 2, 0), new Vector3D(1, 2, 5));

        Assert.assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarToOppositeDirection() {
        Line line1 = new Line(new Vector3D(1, 2, 3), new Vector3D(1, 2, 10));
        Line line2 = new Line(new Vector3D(1, 2, 10), new Vector3D(1, 2, 3));

        Assert.assertTrue(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarToParallelDisjoint() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));
        Line line2 = new Line(new Vector3D(1, 0, 0), new Vector3D(1, 0, 1));

        Assert.assertFalse(line1.isSimilarTo(line2));
    }

    @Test
    public void testIsSimilarToNonParallel() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));

        Assert.assertFalse(line1.isSimilarTo(line2));
    }

    @Test
    public void testContains() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 1, 1));
        Assert.assertTrue(line.contains(new Vector3D(2, 2, 2)));
        Assert.assertTrue(line.contains(new Vector3D(-3, -3, -3)));
        Assert.assertFalse(line.contains(new Vector3D(1, 1, 2)));
    }

    @Test
    public void testPointDistance() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));

        // Point on line
        Assert.assertEquals(0.0, line.distance(new Vector3D(0, 0, 5)), EPSILON);

        // Point orthogonal distance
        Assert.assertEquals(3.0, line.distance(new Vector3D(3, 0, 10)), EPSILON);
        Assert.assertEquals(5.0, line.distance(new Vector3D(3, 4, 0)), EPSILON);
    }

    @Test
    public void testDistanceBetweenParallelLines() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));
        Line line2 = new Line(new Vector3D(3, 4, 0), new Vector3D(3, 4, 1));

        Assert.assertEquals(5.0, line1.distance(line2), EPSILON);
    }

    @Test
    public void testDistanceBetweenSkewLines() {
        // Line 1 along X axis at z = 0
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        // Line 2 along Y axis at z = 4
        Line line2 = new Line(new Vector3D(0, 0, 4), new Vector3D(0, 1, 4));

        Assert.assertEquals(4.0, line1.distance(line2), EPSILON);
    }

    @Test
    public void testDistanceBetweenIntersectingLines() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 1, 0));
        Line line2 = new Line(new Vector3D(0, 0, 0), new Vector3D(1, -1, 0));

        Assert.assertEquals(0.0, line1.distance(line2), EPSILON);
    }

    @Test
    public void testClosestPointParallelLines() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));
        Line line2 = new Line(new Vector3D(2, 0, 0), new Vector3D(2, 0, 1));

        // When lines are parallel, closestPoint returns line1.zero
        Vector3D closest = line1.closestPoint(line2);
        Assert.assertEquals(0.0, closest.distance(line1.getOrigin()), EPSILON);
    }

    @Test
    public void testClosestPointNonParallelLines() {
        Line line1 = new Line(new Vector3D(-1, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, -1, 2), new Vector3D(0, 1, 2));

        Vector3D closestOnLine1 = line1.closestPoint(line2);
        Assert.assertEquals(0.0, closestOnLine1.distance(new Vector3D(0, 0, 0)), EPSILON);

        Vector3D closestOnLine2 = line2.closestPoint(line1);
        Assert.assertEquals(0.0, closestOnLine2.distance(new Vector3D(0, 0, 2)), EPSILON);
    }

    @Test
    public void testIntersectionIntersectingLines() {
        Line line1 = new Line(new Vector3D(-1, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, -1, 0), new Vector3D(0, 1, 0));

        Vector3D intersection = line1.intersection(line2);
        Assert.assertNotNull(intersection);
        Assert.assertEquals(0.0, intersection.distance(new Vector3D(0, 0, 0)), EPSILON);
    }

    @Test
    public void testIntersectionSkewLines() {
        Line line1 = new Line(new Vector3D(-1, 0, 0), new Vector3D(1, 0, 0));
        Line line2 = new Line(new Vector3D(0, -1, 2), new Vector3D(0, 1, 2));

        Vector3D intersection = line1.intersection(line2);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersectionParallelNonCoincidentLines() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));
        Line line2 = new Line(new Vector3D(1, 0, 0), new Vector3D(1, 0, 1));

        Vector3D intersection = line1.intersection(line2);
        Assert.assertNull(intersection);
    }

    @Test
    public void testIntersectionCoincidentLines() {
        Line line1 = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 0, 1));
        Line line2 = new Line(new Vector3D(0, 0, 5), new Vector3D(0, 0, 10));

        Vector3D intersection = line1.intersection(line2);
        Assert.assertNotNull(intersection);
        Assert.assertTrue(line1.contains(intersection));
        Assert.assertTrue(line2.contains(intersection));
    }

    @Test
    public void testWholeLine() {
        Line line = new Line(new Vector3D(0, 0, 0), new Vector3D(1, 0, 0));
        SubLine wholeLine = line.wholeLine();
        Assert.assertNotNull(wholeLine);
        Assert.assertFalse(wholeLine.getRemainingRegion().isEmpty());
    }
}
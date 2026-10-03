package org.apache.commons.math.stat.clustering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Comprehensive JUnit 4 test suite for {@link KMeansPlusPlusClusterer}.
 */
public class KMeansPlusPlusClustererTest {

    /**
     * Custom Clusterable 2D Point implementation for flexible test control.
     */
    private static class Point implements Clusterable<Point> {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public double distanceFrom(Point p) {
            double dx = this.x - p.x;
            double dy = this.y - p.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public Point centroidOf(Collection<Point> points) {
            if (points == null || points.isEmpty()) {
                return this;
            }
            double sumX = 0;
            double sumY = 0;
            for (Point p : points) {
                sumX += p.x;
                sumY += p.y;
            }
            return new Point(sumX / points.size(), sumY / points.size());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Point)) return false;
            Point other = (Point) obj;
            return Double.compare(this.x, other.x) == 0 &&
                   Double.compare(this.y, other.y) == 0;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(new double[]{x, y});
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    @Test
    public void testDefaultConstructor() {
        KMeansPlusPlusClusterer<Point> clusterer = new KMeansPlusPlusClusterer<Point>(new Random(42));
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(1, 1));
        List<Cluster<Point>> result = clusterer.cluster(points, 1, 10);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(2, result.get(0).getPoints().size());
    }

    @Test
    public void testClusterWithNegativeMaxIterations() {
        // maxIterations < 0 sets max = Integer.MAX_VALUE
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42), EmptyClusterStrategy.LARGEST_VARIANCE);
        List<Point> points = Arrays.asList(
            new Point(0, 0), new Point(0, 1),
            new Point(10, 10), new Point(10, 11)
        );
        List<Cluster<Point>> result = clusterer.cluster(points, 2, -1);
        Assert.assertEquals(2, result.size());
        int totalPoints = result.get(0).getPoints().size() + result.get(1).getPoints().size();
        Assert.assertEquals(4, totalPoints);
    }

    @Test
    public void testClusterZeroMaxIterations() {
        // maxIterations = 0 loop does not execute, returns initial clusters
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42));
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(2, 2));
        List<Cluster<Point>> result = clusterer.cluster(points, 2, 0);
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void testEarlyConvergence() {
        // Points that instantly form centroids without changing in iteration 2
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42));
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(100, 100));
        List<Cluster<Point>> result = clusterer.cluster(points, 2, 100);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(1, result.get(0).getPoints().size());
        Assert.assertEquals(1, result.get(1).getPoints().size());
    }

    @Test(expected = ConvergenceException.class)
    public void testEmptyClusterStrategyErrorThrowsConvergenceException() {
        // Duplicate points assigned to the first cluster leaving the other empty
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42), EmptyClusterStrategy.ERROR);
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(0, 0));
        clusterer.cluster(points, 2, 10);
    }

    @Test
    public void testEmptyClusterStrategyLargestVariance() {
        // Trigger empty cluster handled by LARGEST_VARIANCE
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42), EmptyClusterStrategy.LARGEST_VARIANCE);
        List<Point> points = Arrays.asList(
            new Point(0, 0), new Point(0, 0),
            new Point(10, 10), new Point(20, 20)
        );
        List<Cluster<Point>> result = clusterer.cluster(points, 2, 10);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(4, result.get(0).getPoints().size() + result.get(1).getPoints().size());
    }

    @Test
    public void testEmptyClusterStrategyLargestPointsNumber() {
        // Trigger empty cluster handled by LARGEST_POINTS_NUMBER
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42), EmptyClusterStrategy.LARGEST_POINTS_NUMBER);
        List<Point> points = Arrays.asList(
            new Point(0, 0), new Point(0, 0), new Point(0, 0),
            new Point(5, 5), new Point(5, 5)
        );
        List<Cluster<Point>> result = clusterer.cluster(points, 2, 10);
        Assert.assertEquals(2, result.size());
        int total = result.get(0).getPoints().size() + result.get(1).getPoints().size();
        Assert.assertEquals(5, total);
    }

    @Test
    public void testEmptyClusterStrategyFarthestPoint() {
        // Trigger empty cluster handled by FARTHEST_POINT
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42), EmptyClusterStrategy.FARTHEST_POINT);
        List<Point> points = Arrays.asList(
            new Point(0, 0), new Point(0, 0),
            new Point(1, 1), new Point(100, 100)
        );
        List<Cluster<Point>> result = clusterer.cluster(points, 2, 10);
        Assert.assertEquals(2, result.size());
        int total = result.get(0).getPoints().size() + result.get(1).getPoints().size();
        Assert.assertEquals(4, total);
    }

    @Test
    public void testSmallDistanceInitialCenterSelectionMath57() {
        // Target bug in Math-57 where 'int sum' causes truncation of sub-integer distances
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(12345));
        List<Point> points = new ArrayList<Point>();
        for (int i = 0; i < 10; i++) {
            points.add(new Point(i * 0.01, i * 0.01));
        }
        List<Cluster<Point>> result = clusterer.cluster(points, 3, 20);
        Assert.assertEquals(3, result.size());
        int sumPoints = 0;
        for (Cluster<Point> c : result) {
            sumPoints += c.getPoints().size();
        }
        Assert.assertEquals(10, sumPoints);
    }

    @Test
    public void testSinglePointSingleCluster() {
        // Boundary limit: k = 1 and points.size() = 1
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42));
        List<Point> points = Collections.singletonList(new Point(5, 5));
        List<Cluster<Point>> result = clusterer.cluster(points, 1, 5);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).getPoints().size());
        Assert.assertEquals(new Point(5, 5), result.get(0).getCenter());
    }

    @Test
    public void testKEqualsNumberOfPoints() {
        // Boundary limit: k == points.size()
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42));
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        List<Cluster<Point>> result = clusterer.cluster(points, 3, 10);
        Assert.assertEquals(3, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyPointsInputThrowsException() {
        // Invalid state / Empty values: points collection is empty
        KMeansPlusPlusClusterer<Point> clusterer =
            new KMeansPlusPlusClusterer<Point>(new Random(42));
        List<Point> emptyPoints = Collections.emptyList();
        clusterer.cluster(emptyPoints, 1, 10);
    }
}
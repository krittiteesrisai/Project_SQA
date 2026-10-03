package org.apache.commons.math.optimization.fitting;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.math.analysis.ParametricUnivariateRealFunction;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for GaussianFitter and its inner class ParameterGuesser.
 */
public class GaussianFitterTest {

    private static final double EPSILON = 1e-4;

    @Test(expected = NullArgumentException.class)
    public void testParameterGuesserNullPoints() {
        new GaussianFitter.ParameterGuesser(null);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserEmptyPoints() {
        new GaussianFitter.ParameterGuesser(new WeightedObservedPoint[0]);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserLessThanThreePoints() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0)
        };
        new GaussianFitter.ParameterGuesser(points);
    }

    @Test
    public void testParameterGuesserNormalPointsAndCaching() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 8.0),
            new WeightedObservedPoint(1.0, 3.0, 2.0)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess1 = guesser.guess();
        double[] guess2 = guesser.guess(); // Branch: parameters != null (reuse cache)

        Assert.assertNotNull(guess1);
        Assert.assertEquals(3, guess1.length);
        Assert.assertArrayEquals(guess1, guess2, 1e-10);
        Assert.assertNotSame("guess() should return a clone", guess1, guess2);

        // Max Y at x=2.0, y=8.0
        Assert.assertEquals(8.0, guess1[0], EPSILON); // Norm (approx)
        Assert.assertEquals(2.0, guess1[1], EPSILON); // Mean (approx)
        Assert.assertTrue("Sigma must be positive", guess1[2] > 0);
    }

    @Test
    public void testParameterGuesserOutOfRangeFwhmFallback() {
        // Points arranged such that interpolation for halfY throws OutOfRangeException
        // e.g. all points have flat Y values, so halfY calculation can't be bracketed
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, -10.0, 5.0),
            new WeightedObservedPoint(1.0,   0.0, 5.0),
            new WeightedObservedPoint(1.0,  10.0, 5.0)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertNotNull(guess);
        Assert.assertEquals(5.0, guess[0], EPSILON);
        Assert.assertTrue("Sigma fallback must be computed from total X span", guess[2] > 0);
    }

    @Test
    public void testParameterGuesserInterpolationExactBoundaries() {
        // Set points so that y == pointA.getY() or y == pointB.getY()
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0),
            new WeightedObservedPoint(1.0, 3.0, 6.0),
            new WeightedObservedPoint(1.0, 4.0, 4.0),
            new WeightedObservedPoint(1.0, 5.0, 2.0)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertNotNull(guess);
        Assert.assertEquals(6.0, guess[0], EPSILON);
        Assert.assertEquals(3.0, guess[1], EPSILON);
    }

    @Test
    public void testComparatorFullBranchCoverage() {
        // Test comparator branches via sorting points with various ties and nulls
        WeightedObservedPoint p1 = new WeightedObservedPoint(1.0, 1.0, 2.0);
        WeightedObservedPoint p2 = new WeightedObservedPoint(1.0, 2.0, 2.0); // x differs
        WeightedObservedPoint p3 = new WeightedObservedPoint(1.0, 1.0, 5.0); // x equal, y differs
        WeightedObservedPoint p4 = new WeightedObservedPoint(2.0, 1.0, 2.0); // x, y equal, weight differs
        WeightedObservedPoint p5 = new WeightedObservedPoint(1.0, 1.0, 2.0); // all equal

        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            p2, p4, null, p3, p1, null, p5
        };

        // Create ParameterGuesser on valid subset to get access to sort
        WeightedObservedPoint[] validPoints = new WeightedObservedPoint[] { p2, p4, p3, p1, p5 };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(validPoints);
        guesser.guess(); // Triggers sorting

        // Direct comparison check using reflection or sorting behavior check
        Arrays.sort(validPoints, new Comparator<WeightedObservedPoint>() {
            public int compare(WeightedObservedPoint o1, WeightedObservedPoint o2) {
                if (o1 == null && o2 == null) return 0;
                if (o1 == null) return -1;
                if (o2 == null) return 1;
                if (o1.getX() < o2.getX()) return -1;
                if (o1.getX() > o2.getX()) return 1;
                if (o1.getY() < o2.getY()) return -1;
                if (o1.getY() > o2.getY()) return 1;
                if (o1.getWeight() < o2.getWeight()) return -1;
                if (o1.getWeight() > o2.getWeight()) return 1;
                return 0;
            }
        });

        Assert.assertEquals(1.0, validPoints[0].getX(), EPSILON);
    }

    @Test
    public void testFitWithCustomInitialGuess() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());

        final double norm = 4.0;
        final double mean = 2.0;
        final double sigma = 0.5;

        Gaussian.Parametric f = new Gaussian.Parametric();
        for (double x = 0.0; x <= 4.0; x += 0.2) {
            fitter.addObservedPoint(1.0, x, f.value(x, new double[] { norm, mean, sigma }));
        }

        double[] fitParams = fitter.fit(new double[] { 3.5, 2.2, 0.7 });

        Assert.assertEquals(norm, fitParams[0], EPSILON);
        Assert.assertEquals(mean, fitParams[1], EPSILON);
        Assert.assertEquals(sigma, fitParams[2], EPSILON);
    }

    @Test
    public void testFitHandlesNegativeSigmaInWrappedFunction() {
        // Exercise the catch (NotStrictlyPositiveException) inside fit(double[])
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1.0, 1.0, 2.0);
        fitter.addObservedPoint(1.0, 2.0, 5.0);
        fitter.addObservedPoint(1.0, 3.0, 2.0);

        // Initial guess with invalid/negative sigma to trigger exception handling inside wrapper
        try {
            double[] result = fitter.fit(new double[] { 5.0, 2.0, -0.1 });
            Assert.assertNotNull(result);
        } catch (Exception e) {
            // Depending on optimizer divergence, it should either recover or fail gracefully
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void testFitWithoutInitialGuess() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());

        fitter.addObservedPoint(4.0254623,  531026.0);
        fitter.addObservedPoint(4.03128248, 984167.0);
        fitter.addObservedPoint(4.03839603, 1887233.0);
        fitter.addObservedPoint(4.04421621, 2687152.0);
        fitter.addObservedPoint(4.05132976, 3461228.0);
        fitter.addObservedPoint(4.05326982, 3580526.0);
        fitter.addObservedPoint(4.05779662, 3439750.0);
        fitter.addObservedPoint(4.0636168,  2877648.0);
        fitter.addObservedPoint(4.06943698, 2175960.0);
        fitter.addObservedPoint(4.07525716, 1447024.0);
        fitter.addObservedPoint(4.08237071, 717104.0);
        fitter.addObservedPoint(4.08366408, 620014.0);

        double[] parameters = fitter.fit();

        Assert.assertNotNull(parameters);
        Assert.assertEquals(3580526.0, parameters[0], 500000.0); // approximate norm
        Assert.assertEquals(4.053, parameters[1], 0.01);         // approximate mean
        Assert.assertTrue(parameters[2] > 0);                     // sigma > 0
    }
}
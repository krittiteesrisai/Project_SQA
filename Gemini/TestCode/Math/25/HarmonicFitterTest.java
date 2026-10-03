package org.apache.commons.math3.optimization.fitting;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class HarmonicFitterTest {

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructorZeroPoints() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[0];
        new HarmonicFitter.ParameterGuesser(points);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructorThreePoints() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 0.0)
        };
        new HarmonicFitter.ParameterGuesser(points);
    }

    @Test
    public void testParameterGuesserSortAlreadySorted() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, -1.0),
            new WeightedObservedPoint(1.0, 3.0, 1.0),
            new WeightedObservedPoint(1.0, 4.0, 0.0)
        };
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();
        Assert.assertNotNull(guess);
        Assert.assertEquals(3, guess.length);
    }

    @Test
    public void testParameterGuesserSortReverseOrderAndDuplicates() {
        // ทดสอบ insertion sort เมื่อข้อมูลเรียงจากมากไปน้อยและมีค่า x เท่ากัน
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 10.0, 1.0),
            new WeightedObservedPoint(1.0, 8.0, 2.0),
            new WeightedObservedPoint(1.0, 8.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, -1.0),
            new WeightedObservedPoint(1.0, 1.0, 0.5)
        };
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();
        Assert.assertNotNull(guess);
        Assert.assertEquals(3, guess.length);
        Assert.assertTrue(guess[0] >= 0); // Amplitude
        Assert.assertTrue(guess[1] >= 0); // Omega
    }

    @Test(expected = ZeroException.class)
    public void testParameterGuesserZeroAbscissaRangeThrowsZeroException() {
        // จุด x ทั้งหมดมีค่าเท่ากัน ทำให้ xRange == 0 และตกเข้า fallback condition
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 5.0, 1.0),
            new WeightedObservedPoint(1.0, 5.0, 2.0),
            new WeightedObservedPoint(1.0, 5.0, -1.0),
            new WeightedObservedPoint(1.0, 5.0, 0.5)
        };
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        guesser.guess();
    }

    @Test
    public void testParameterGuesserNormalHarmonicCurve() {
        // ทดสอบคลื่นฮาร์มอนิกมาตรฐาน f(t) = 4.0 * cos(1.5 * t + 0.8)
        double a = 4.0;
        double omega = 1.5;
        double phi = 0.8;

        int numPoints = 25;
        WeightedObservedPoint[] points = new WeightedObservedPoint[numPoints];
        double step = 0.2;
        for (int i = 0; i < numPoints; ++i) {
            double x = i * step;
            double y = a * FastMath.cos(omega * x + phi);
            points[i] = new WeightedObservedPoint(1.0, x, y);
        }

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertEquals(a, guess[0], 0.2);
        Assert.assertEquals(omega, guess[1], 0.2);
        // Normalize phi difference
        double phiDiff = (guess[2] - phi) % (2 * FastMath.PI);
        if (phiDiff < 0) {
            phiDiff += 2 * FastMath.PI;
        }
        Assert.assertTrue(phiDiff < 0.2 || FastMath.abs(phiDiff - 2 * FastMath.PI) < 0.2);
    }

    @Test
    public void testParameterGuesserFallbackConditionPositiveRange() {
        // กรณีข้อมูลแบบเส้นตรงหรือข้อมูล ill-conditioned ทำให้ c1/c2 < 0 หรือ c2/c3 < 0
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 10.0),
            new WeightedObservedPoint(1.0, 1.0, 10.0),
            new WeightedObservedPoint(1.0, 2.0, 10.0),
            new WeightedObservedPoint(1.0, 3.0, 10.0)
        };

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertNotNull(guess);
        Assert.assertEquals(3, guess.length);
        // xRange = 3.0, omega = 2 * PI / 3.0
        double expectedOmega = 2.0 * FastMath.PI / 3.0;
        Assert.assertEquals(expectedOmega, guess[1], 1e-6);
        // yMax == yMin == 10.0 -> a = 0.0
        Assert.assertEquals(0.0, guess[0], 1e-6);
    }

    @Test
    public void testHarmonicFitterWithInitialGuess() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        double a = 2.0;
        double omega = 0.5;
        double phi = 0.2;

        for (int i = 0; i < 20; i++) {
            double x = i * 0.5;
            double y = a * FastMath.cos(omega * x + phi);
            fitter.addObservedPoint(1.0, x, y);
        }

        double[] fitted = fitter.fit(new double[] { 1.8, 0.6, 0.1 });
        Assert.assertEquals(a, fitted[0], 1e-4);
        Assert.assertEquals(omega, fitted[1], 1e-4);
        Assert.assertEquals(phi, fitted[2], 1e-4);
    }

    @Test
    public void testHarmonicFitterAutomaticGuessFit() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        double a = 3.0;
        double omega = 1.2;
        double phi = 0.5;

        for (int i = 0; i < 30; i++) {
            double x = i * 0.3;
            double y = a * FastMath.cos(omega * x + phi);
            fitter.addObservedPoint(1.0, x, y);
        }

        double[] fitted = fitter.fit();
        Assert.assertEquals(a, fitted[0], 1e-3);
        Assert.assertEquals(omega, fitted[1], 1e-3);
        Assert.assertEquals(phi, fitted[2], 1e-3);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testHarmonicFitterAutomaticGuessEmptyObservations() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        // ไม่มีการเพิ่ม observed points -> observations.length < 4
        fitter.fit();
    }
}
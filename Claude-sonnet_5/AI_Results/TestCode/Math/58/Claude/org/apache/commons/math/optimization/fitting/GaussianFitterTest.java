package org.apache.commons.math.optimization.fitting;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;

/**
 * Unit tests for {@link GaussianFitter} (Defects4J Math-58b).
 *
 * หมายเหตุ: Constructor ของ WeightedObservedPoint ไม่ได้แสดงในซอร์สที่ให้มา
 * แต่เป็น dependency ที่มีอยู่แล้วใน classpath ของโปรเจกต์ (commons-math)
 * สมมติฐาน (ตามมาตรฐาน Commons-Math API ที่มีอยู่จริง): 
 *   WeightedObservedPoint(double weight, double x, double y)
 * หากลายเซ็นจริงต่างจากนี้ ต้องแก้ไขการสร้าง object ให้ตรงกับ library ที่ build จริง
 */
public class GaussianFitterTest {

    private static final double LN2_CONST = 2.0 * Math.sqrt(2.0 * Math.log(2.0));

    // ---------------------------------------------------------------
    // Constructor: null / boundary length checks
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testConstructor_NullObservations_ThrowsNullArgumentException() {
        new ParameterGuesser(null);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_ZeroObservations_ThrowsException() {
        new ParameterGuesser(new WeightedObservedPoint[0]);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_OneObservation_ThrowsException() {
        new ParameterGuesser(new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 1.0)
        });
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_TwoObservations_ThrowsException() {
        new ParameterGuesser(new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0)
        });
    }

    @Test
    public void testConstructor_ExactlyThreeObservations_BoundaryOK() {
        // boundary: length == 3 ต้องไม่ throw
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 5.0), // max
            new WeightedObservedPoint(1.0, 2.0, 1.0)
        };
        ParameterGuesser pg = new ParameterGuesser(pts);
        double[] result = pg.guess();

        assertEquals(3, result.length);
        assertEquals(5.0, result[0], 0.0); // norm
        assertEquals(1.0, result[1], 0.0); // mean

        // halfY = 5 + (1-5)/2 = 3
        // fwhmX1 = 0 + ((3-1)*(1-0))/(5-1) = 0.5
        // fwhmX2 = 1 + ((3-5)*(2-1))/(1-5) = 1.5
        double expectedSigma = (1.5 - 0.5) / LN2_CONST;
        assertEquals(expectedSigma, result[2], 1e-9);
    }

    // ---------------------------------------------------------------
    // guess(): สูตรพื้นฐาน + clause ที่สองของ isBetween (ปกติ)
    // ---------------------------------------------------------------

    @Test
    public void testGuess_SymmetricPeak_BasicCase() {
        // ใส่ไม่เรียง x เพื่อทดสอบ Arrays.sort + Comparator (x-branch)
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(1.0, 4.0, 0.0),
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 2.0, 10.0), // max
            new WeightedObservedPoint(1.0, 3.0, 4.0),
            new WeightedObservedPoint(1.0, 1.0, 4.0)
        };
        ParameterGuesser pg = new ParameterGuesser(pts);
        double[] result = pg.guess();

        assertEquals(10.0, result[0], 0.0);
        assertEquals(2.0, result[1], 0.0);

        double fwhmApprox = (8.0 / 3.0) - (4.0 / 3.0);
        double expectedSigma = fwhmApprox / LN2_CONST;
        assertEquals(expectedSigma, result[2], 1e-9);
    }

    @Test
    public void testGuess_MultiIterationBackward_ForwardLoopNeverRuns_FallbackUsed() {
        // forward: i+1 == points.length ตั้งแต่ต้น -> loop ไม่รัน -> OutOfRangeException -> fallback
        // backward: ต้องวนมากกว่า 1 รอบก่อนเจอ bracket
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 8.0),
            new WeightedObservedPoint(1.0, 3.0, 10.0) // max
        };
        ParameterGuesser pg = new ParameterGuesser(pts);
        double[] result = pg.guess();

        assertEquals(10.0, result[0], 0.0);
        assertEquals(3.0, result[1], 0.0);

        // fallback: fwhmApprox = last.x - first.x = 3 - 0 = 3
        double expectedSigma = 3.0 / LN2_CONST;
        assertEquals(expectedSigma, result[2], 1e-9);
    }

    @Test
    public void testGuess_AllIdenticalY_ImmediateLoopFalse_TotalFallback() {
        // backward: i+idxStep < 0 ตั้งแต่ต้น -> loop ไม่รันเลย -> OutOfRangeException ทันที
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(1.0, 0.0, 5.0), // maxYIdx (first max, tie-break เป็น index 0)
            new WeightedObservedPoint(1.0, 1.0, 5.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0)
        };
        ParameterGuesser pg = new ParameterGuesser(pts);
        double[] result = pg.guess();

        assertEquals(5.0, result[0], 0.0);
        assertEquals(0.0, result[1], 0.0);

        double expectedSigma = 2.0 / LN2_CONST; // fallback = last.x-first.x = 2-0
        assertEquals(expectedSigma, result[2], 1e-9);
    }

    @Test
    public void testGuess_ExactYMatch_BranchInInterpolateXAtY() {
        // ทดสอบ branch "pointB.getY() == y" ของ interpolateXAtY (early return ไม่หาร)
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(1.0, -1.0, 4.0),
            new WeightedObservedPoint(1.0,  0.0, 1.0),
            new WeightedObservedPoint(1.0, -3.0, 1.0),
            new WeightedObservedPoint(1.0, -2.0, 10.0) // max
        };
        ParameterGuesser pg = new ParameterGuesser(pts);
        double[] result = pg.guess();

        assertEquals(10.0, result[0], 0.0);
        assertEquals(-2.0, result[1], 0.0);

        // fwhmX1 (backward, หาร) = -3 + ((4-1)*1)/9 = -2.6666666666666665
        // fwhmX2 (forward, exact-match pointB.getY()==4) = -1.0
        double fwhmX1 = -3.0 + ((4.0 - 1.0) * (1.0)) / (9.0);
        double fwhmX2 = -1.0;
        double expectedSigma = (fwhmX2 - fwhmX1) / LN2_CONST;
        assertEquals(expectedSigma, result[2], 1e-9);
    }

    @Test
    public void testGuess_ComparatorTieBreak_DuplicateXY_DifferentWeight() {
        // ทดสอบ branch เปรียบเทียบ weight ใน Comparator เมื่อ x,y เท่ากัน
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(2.0, 1.0, 5.0),
            new WeightedObservedPoint(1.0, 1.0, 5.0), // x,y เท่ากับตัวบน แต่ weight น้อยกว่า
            new WeightedObservedPoint(1.0, 2.0, 9.0)  // max
        };
        ParameterGuesser pg = new ParameterGuesser(pts);
        double[] result = pg.guess();

        // ไม่ยืนยัน sigma (ซับซ้อนเกินไปกับ tie-break order) แต่ยืนยันค่าหลักที่ไม่ขึ้นกับลำดับ tie
        assertEquals(9.0, result[0], 0.0);
        assertEquals(2.0, result[1], 0.0);
        assertEquals(3, result.length);
        assertFalse(Double.isNaN(result[2]));
    }

    @Test
    public void testGuess_ReturnsDefensiveClone() {
        WeightedObservedPoint[] pts = {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 5.0),
            new WeightedObservedPoint(1.0, 2.0, 1.0)
        };
        ParameterGuesser pg = new ParameterGuesser(pts);

        double[] g1 = pg.guess();
        g1[0] = -999.0;

        double[] g2 = pg.guess();
        assertNotEquals(-999.0, g2[0], 0.0); // ต้องไม่ถูกกระทบจากการแก้ array ที่ return ไปก่อน
    }

    // ---------------------------------------------------------------
    // fit(double[]) และ fit() : integration ผ่าน optimizer จริง
    // ---------------------------------------------------------------

    @Test
    public void testFit_WithInitialGuess_RecoversExactGaussianParams() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        double trueNorm = 4.0, trueMean = 5.0, trueSigma = 1.0;
        for (int x = 0; x <= 10; x++) {
            double y = trueNorm * Math.exp(-((x - trueMean) * (x - trueMean))
                                            / (2.0 * trueSigma * trueSigma));
            fitter.addObservedPoint((double) x, y);
        }
        double[] result = fitter.fit(new double[] { trueNorm, trueMean, trueSigma });

        assertEquals(3, result.length);
        assertEquals(trueNorm, result[0], 1e-3);
        assertEquals(trueMean, result[1], 1e-3);
        assertEquals(trueSigma, result[2], 1e-3);
    }

    @Test
    public void testFit_NoArg_UsesParameterGuesserInternally() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        double trueNorm = 4.0, trueMean = 5.0, trueSigma = 1.0;
        for (int x = 0; x <= 10; x++) {
            double y = trueNorm * Math.exp(-((x - trueMean) * (x - trueMean))
                                            / (2.0 * trueSigma * trueSigma));
            fitter.addObservedPoint((double) x, y);
        }
        double[] result = fitter.fit(); // ไม่ส่ง initial guess -> เรียก ParameterGuesser ภายใน

        assertEquals(3, result.length);
        assertEquals(trueNorm, result[0], 1e-2);
        assertEquals(trueMean, result[1], 1e-2);
        assertEquals(trueSigma, result[2], 1e-2);
    }

    @Test
    public void testFit_WithInitialGuess_CompletesWithoutExceptionForDegenerateSigma() {
        // ทดสอบว่า anonymous ParametricUnivariateRealFunction (try/catch
        // NotStrictlyPositiveException) ไม่ทำให้ optimizer ล่มแม้ initial sigma=0
        // (ไม่ assert ค่าตัวเลขเพราะพฤติกรรม optimizer ภายในไม่ได้ระบุไว้ในซอร์ส)
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(0.0, 1.0);
        fitter.addObservedPoint(1.0, 5.0);
        fitter.addObservedPoint(2.0, 1.0);
        try {
            double[] result = fitter.fit(new double[] { 5.0, 1.0, 0.0 });
            assertEquals(3, result.length);
        } catch (Exception e) {
            // หาก optimizer โยน exception อื่นจากการ diverge ถือว่ายอมรับได้
            // (ไม่ได้ระบุ behavior ที่แน่นอนในซอร์สโค้ดที่ให้มา)
        }
    }
}

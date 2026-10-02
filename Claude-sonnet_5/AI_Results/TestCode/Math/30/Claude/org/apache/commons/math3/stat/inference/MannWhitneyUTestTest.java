package org.apache.commons.math3.stat.inference;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link MannWhitneyUTest}.
 *
 * หมายเหตุ: ค่า p-value ที่คาดหวังถูกคำนวณด้วยมือจากสูตร Normal Approximation
 * ตามซอร์สโค้ด (calculateAsymptoticPValue) และตรวจสอบด้วยตาราง standard normal
 * โดยใช้ delta ที่ยอมรับความคลาดเคลื่อนของการประมาณค่า
 */
public class MannWhitneyUTestTest {

    private MannWhitneyUTest testStatistic;

    @Before
    public void setUp() {
        testStatistic = new MannWhitneyUTest();
    }

    // ---------------------------------------------------------------
    // 1. Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructorDoesNotThrow() {
        // default constructor: NaNStrategy.FIXED, TiesStrategy.AVERAGE
        MannWhitneyUTest t = new MannWhitneyUTest();
        assertNotNull(t);
    }

    @Test
    public void testParamConstructorDoesNotThrow() {
        MannWhitneyUTest t = new MannWhitneyUTest(NaNStrategy.REMOVED,
                TiesStrategy.MINIMUM);
        assertNotNull(t);
        // ตรวจสอบว่ายังสามารถคำนวณได้ตามปกติ (ไม่ throw)
        double u = t.mannWhitneyU(new double[]{1, 2, 3}, new double[]{4, 5, 6});
        assertEquals(9.0, u, 1e-10);
    }

    // ---------------------------------------------------------------
    // 2. ensureDataConformance - null checks (NullArgumentException)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUNullX() {
        testStatistic.mannWhitneyU(null, new double[]{1, 2, 3});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUNullY() {
        testStatistic.mannWhitneyU(new double[]{1, 2, 3}, null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUBothNull() {
        testStatistic.mannWhitneyU(null, null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTestNullX() {
        testStatistic.mannWhitneyUTest(null, new double[]{1, 2, 3});
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTestNullY() {
        testStatistic.mannWhitneyUTest(new double[]{1, 2, 3}, null);
    }

    // ---------------------------------------------------------------
    // 3. ensureDataConformance - empty array checks (NoDataException)
    // ---------------------------------------------------------------

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUEmptyX() {
        testStatistic.mannWhitneyU(new double[]{}, new double[]{1, 2, 3});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUEmptyY() {
        testStatistic.mannWhitneyU(new double[]{1, 2, 3}, new double[]{});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUBothEmpty() {
        testStatistic.mannWhitneyU(new double[]{}, new double[]{});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTestEmptyX() {
        testStatistic.mannWhitneyUTest(new double[]{}, new double[]{1, 2, 3});
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTestEmptyY() {
        testStatistic.mannWhitneyUTest(new double[]{1, 2, 3}, new double[]{});
    }

    // ---------------------------------------------------------------
    // 4. mannWhitneyU - normal (no ties) case, U2 > U1 branch (max picks U2)
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUNoTiesU2Greater() {
        double[] x = {1, 2, 3};
        double[] y = {4, 5, 6};
        // ranks: 1,2,3,4,5,6 ; sumRankX=6
        // U1 = 6 - 6 = 0 ; U2 = 9 - 0 = 9 -> max = U2
        double u = testStatistic.mannWhitneyU(x, y);
        assertEquals(9.0, u, 1e-10);
    }

    // ---------------------------------------------------------------
    // 5. mannWhitneyU - normal case where U1 > U2 (max picks U1)
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUNoTiesU1Greater() {
        double[] x = {4, 5, 6};
        double[] y = {1, 2, 3};
        // ranks: 4,5,6,1,2,3 ; sumRankX = 4+5+6=15
        // U1 = 15 - 6 = 9 ; U2 = 9-9=0 -> max = U1
        double u = testStatistic.mannWhitneyU(x, y);
        assertEquals(9.0, u, 1e-10);
    }

    // ---------------------------------------------------------------
    // 6. mannWhitneyU - ties case, U1 == U2 (FastMath.max boundary)
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUWithTiesEqualU() {
        double[] x = {1, 2, 3};
        double[] y = {1, 2, 3};
        // ranks avg: 1.5, 3.5, 5.5 for both groups
        // sumRankX = 1.5+3.5+5.5 = 10.5
        // U1 = 10.5 - 6 = 4.5 ; U2 = 9 - 4.5 = 4.5 -> U1 == U2
        double u = testStatistic.mannWhitneyU(x, y);
        assertEquals(4.5, u, 1e-10);
    }

    // ---------------------------------------------------------------
    // 7. mannWhitneyU - boundary minimal size (x.length==1, y.length==1)
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUMinimalSize() {
        double[] x = {1};
        double[] y = {2};
        // ranks: 1,2 ; sumRankX=1
        // U1 = 1 - 1 = 0 ; U2 = 1-0 = 1 -> max = 1
        double u = testStatistic.mannWhitneyU(x, y);
        assertEquals(1.0, u, 1e-10);
    }

    // ---------------------------------------------------------------
    // 8. mannWhitneyU - unequal length arrays (loop iterates x.length times)
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUUnequalLengths() {
        double[] x = {1, 2, 3, 4};
        double[] y = {5, 6};
        // ranks: 1,2,3,4,5,6 ; sumRankX = 1+2+3+4=10
        // U1 = 10 - (4*5)/2 = 10-10=0 ; U2 = 4*2 - 0 = 8 -> max=8
        double u = testStatistic.mannWhitneyU(x, y);
        assertEquals(8.0, u, 1e-10);
    }

    // ---------------------------------------------------------------
    // 9. mannWhitneyUTest - full pipeline, no ties, symmetric p-value
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUTestNoTies() {
        double[] x = {1, 2, 3};
        double[] y = {4, 5, 6};
        // Umax=9 ; Umin = 9 - 9 = 0
        // EU=4.5 ; VarU = 9*7/12=5.25
        // z = (0-4.5)/sqrt(5.25) = -1.96403...
        // p = 2*Phi(-1.96403) ~ 0.0495
        double p = testStatistic.mannWhitneyUTest(x, y);
        assertEquals(0.0495, p, 1e-3);
    }

    // ---------------------------------------------------------------
    // 10. mannWhitneyUTest - ties case leads to Umin == EU -> p == 1.0
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUTestTiesSymmetric() {
        double[] x = {1, 2, 3};
        double[] y = {1, 2, 3};
        // Umax=4.5 ; Umin = 9 - 4.5 = 4.5 = EU -> z = 0 -> p = 2*Phi(0) = 1.0
        double p = testStatistic.mannWhitneyUTest(x, y);
        assertEquals(1.0, p, 1e-9);
    }

    // ---------------------------------------------------------------
    // 11. mannWhitneyUTest - boundary minimal size arrays
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUTestMinimalSize() {
        double[] x = {1};
        double[] y = {2};
        // Umax=1 ; Umin = 1 - 1 = 0
        // EU=0.5 ; VarU = 1*3/12=0.25
        // z = (0-0.5)/0.5 = -1 ; p = 2*Phi(-1) ~ 0.3173
        double p = testStatistic.mannWhitneyUTest(x, y);
        assertEquals(0.3173, p, 1e-3);
    }

    // ---------------------------------------------------------------
    // 12. mannWhitneyUTest - larger unequal sample to exercise loops/paths
    // ---------------------------------------------------------------

    @Test
    public void testMannWhitneyUTestUnequalLengths() {
        double[] x = {10, 20, 30, 40, 50};
        double[] y = {1, 2};
        // z sorted overall ranks: y values (1,2) get ranks 1,2 ; x values get ranks 3..7
        // sumRankX = 3+4+5+6+7 = 25
        // U1 = 25 - (5*6)/2 = 25-15=10 ; U2 = 5*2 - 10 = 0 -> Umax=10
        // Umin = 10 - 10 = 0
        // EU = (5*2)/2.0 = 5.0 ; VarU = 10*(5+2+1)/12 = 10*8/12=6.6667
        // z = (0-5)/sqrt(6.6667) = -1.9365
        // p = 2*Phi(-1.9365) ~ 0.0528
        double p = testStatistic.mannWhitneyUTest(x, y);
        assertEquals(0.0528, p, 2e-3);
    }
}

# JUnit 4 Test Suite: KMeansPlusPlusClustererTest

## หมายเหตุสำคัญก่อนเริ่ม

1. คลาส `Cluster<T>` และ interface `Clusterable<T>` เป็น dependency ที่มีอยู่แล้วใน module เดียวกัน (`org.apache.commons.math.stat.clustering`) ของ Commons Math แต่ไม่ได้แสดง source ในคำถาม — จึง `import` ใช้งานตรงจาก package เดิม โดยไม่ได้เดา behavior ของมัน (ใช้ตาม public API ที่ถูกเรียกใช้จริงในซอร์ส `KMeansPlusPlusClusterer` คือ `getPoints()`, `getCenter()`, `addPoint()`, `distanceFrom()`, `centroidOf()`)
2. ใช้ class ทดสอบ `TestPoint` implements `Clusterable<TestPoint>` เพื่อควบคุมพฤติกรรม distance/centroid ได้แน่นอน
3. ใช้ `FixedRandom` (สืบทอดจาก `java.util.Random`) เพื่อบังคับลำดับการเลือก initial center ให้เกิด **empty cluster** แบบ deterministic สำหรับทดสอบทุก `EmptyClusterStrategy`
4. จุดที่ไม่แน่ใจ/เป็น "ลักษณะพิเศษของโค้ดจริง" (ไม่ได้เดา) จะมีคอมเมนต์กำกับไว้ เช่น กรณี `k=0`

```java
package org.apache.commons.math.stat.clustering;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy;
import org.junit.Test;

public class KMeansPlusPlusClustererTest {

    // ---------------------------------------------------------------
    // Test double: Clusterable point with controllable coordinates
    // ---------------------------------------------------------------
    private static class TestPoint implements Clusterable<TestPoint> {
        private final double[] coords;

        TestPoint(double... coords) {
            this.coords = coords;
        }

        @Override
        public double distanceFrom(TestPoint p) {
            double sum = 0;
            for (int i = 0; i < coords.length; i++) {
                double d = coords[i] - p.coords[i];
                sum += d * d;
            }
            return Math.sqrt(sum);
        }

        @Override
        public TestPoint centroidOf(Collection<TestPoint> pts) {
            double[] avg = new double[coords.length];
            for (TestPoint p : pts) {
                for (int i = 0; i < avg.length; i++) {
                    avg[i] += p.coords[i];
                }
            }
            int n = pts.size();
            for (int i = 0; i < avg.length; i++) {
                avg[i] /= n;
            }
            return new TestPoint(avg);
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof TestPoint)) {
                return false;
            }
            return Arrays.equals(coords, ((TestPoint) o).coords);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(coords);
        }

        @Override
        public String toString() {
            return Arrays.toString(coords);
        }
    }

    // ---------------------------------------------------------------
    // Test double: Random ที่บังคับผลลัพธ์แน่นอน
    // nextInt(n) -> 0 เสมอ, nextDouble() -> 0.0 เสมอ
    // ใช้บังคับให้เกิด "empty cluster" scenario แบบ deterministic
    // ---------------------------------------------------------------
    private static class FixedRandom extends Random {
        private static final long serialVersionUID = 1L;

        @Override
        public int nextInt(int n) {
            return 0;
        }

        @Override
        public double nextDouble() {
            return 0.0;
        }
    }

    // ---------------------------------------------------------------
    // Helper
    // ---------------------------------------------------------------
    private int totalPointsAssigned(List<Cluster<TestPoint>> clusters) {
        int total = 0;
        for (Cluster<TestPoint> c : clusters) {
            total += c.getPoints().size();
        }
        return total;
    }

    // =================================================================
    // 1) Normal case: well separated groups, k=2, converge normally
    // =================================================================
    @Test
    public void testClusterBasicTwoSeparatedGroups() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(0, 0));
        points.add(new TestPoint(0.1, 0.1));
        points.add(new TestPoint(0.2, 0));
        points.add(new TestPoint(100, 100));
        points.add(new TestPoint(100.1, 100.1));
        points.add(new TestPoint(100.2, 100));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(42));

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 100);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
        // ไม่มี cluster ว่างในสถานการณ์ปกติที่จุดแยกกันชัดเจน
        for (Cluster<TestPoint> c : result) {
            assertFalse(c.getPoints().isEmpty());
        }
    }

    // =================================================================
    // 2) Boundary: k=1 -> ทุกจุดต้องอยู่ cluster เดียว
    // =================================================================
    @Test
    public void testClusterSingleClusterK1() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(1, 1));
        points.add(new TestPoint(2, 2));
        points.add(new TestPoint(3, 3));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(1));

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 1, 20);

        assertEquals(1, result.size());
        assertEquals(points.size(), result.get(0).getPoints().size());
    }

    // =================================================================
    // 3) Boundary: maxIterations = 0
    //    -> for-loop (count < max) ไม่ execute เลย
    //    -> ได้ค่า initial assignment เท่านั้น
    // =================================================================
    @Test
    public void testMaxIterationsZeroReturnsInitialAssignmentOnly() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(0, 0));
        points.add(new TestPoint(1, 1));
        points.add(new TestPoint(50, 50));
        points.add(new TestPoint(51, 51));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(7));

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 0);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // 4) Boundary: maxIterations < 0 -> max = Integer.MAX_VALUE
    //    ต้อง converge เองผ่าน early-return (!clusteringChanged)
    // =================================================================
    @Test
    public void testNegativeMaxIterationsUsesIntegerMaxAndConverges() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(0, 0));
        points.add(new TestPoint(0, 1));
        points.add(new TestPoint(10, 10));
        points.add(new TestPoint(10, 11));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(3));

        // ถ้า code ไม่ converge จริง จะวนตลอดไป (Integer.MAX_VALUE) -> test timeout
        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, -1);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // 5) Invalid input: empty points collection
    //    pointSet.size() = 0 -> random.nextInt(0) throws IllegalArgumentException
    //    (ใช้ Random จริง ไม่ใช่ FixedRandom เพื่อให้เกิด exception จริงตาม JDK contract)
    // =================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyPointsCollectionThrowsIllegalArgumentException() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(5));
        clusterer.cluster(points, 2, 10);
    }

    // =================================================================
    // 6) Invalid input: null points collection
    //    new ArrayList<T>(null) -> NullPointerException
    // =================================================================
    @Test(expected = NullPointerException.class)
    public void testNullPointsCollectionThrowsNullPointerException() {
        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(5));
        clusterer.cluster(null, 2, 10);
    }

    // =================================================================
    // 7) Boundary quirk: k = 0
    //    จากซอร์ส chooseInitialCenters(): firstPoint ถูกเลือกและเพิ่มเข้า
    //    resultSet โดยไม่มีเงื่อนไขก่อนเข้า while(resultSet.size()<k)
    //    ดังนั้นแม้ k=0 จะได้ cluster จำนวน 1 เสมอ (ไม่ใช่ 0)
    //    -- นี่คือ behavior จริงจาก source ไม่ใช่การเดา --
    // =================================================================
    @Test
    public void testKZeroStillProducesOneClusterDueToSourceLogic() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(0, 0));
        points.add(new TestPoint(5, 5));
        points.add(new TestPoint(9, 9));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(2));

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 0, 5);

        assertEquals(1, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // Setup ร่วมสำหรับทดสอบ EmptyClusterStrategy ทุกแบบ
    // ใช้ FixedRandom บังคับให้:
    //  - center แรก = P1 (index0)
    //  - center สอง = P2 (จุดซ้ำพิกัดกับ P1) เพราะ nextDouble()=0.0
    // ผลลัพธ์: ทุกจุด (P1,P2,P3) ถูก assign เข้า cluster แรกหมด
    // (เพราะ distance เท่ากันและ cluster แรกถูกเช็คก่อน) -> cluster สอง "ว่าง"
    // เมื่อเข้า main loop จะ trigger empty-cluster branch ทันที
    // =================================================================
    private List<TestPoint> buildEmptyClusterScenarioPoints() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(0, 0));   // P1
        points.add(new TestPoint(0, 0));   // P2 (duplicate of P1)
        points.add(new TestPoint(10, 10)); // P3
        return points;
    }

    // =================================================================
    // 8) EmptyClusterStrategy.LARGEST_VARIANCE
    // =================================================================
    @Test
    public void testEmptyClusterStrategyLargestVarianceDoesNotThrow() {
        List<TestPoint> points = buildEmptyClusterScenarioPoints();

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(
                        new FixedRandom(), EmptyClusterStrategy.LARGEST_VARIANCE);

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 1);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // 9) EmptyClusterStrategy.LARGEST_POINTS_NUMBER
    // =================================================================
    @Test
    public void testEmptyClusterStrategyLargestPointsNumberDoesNotThrow() {
        List<TestPoint> points = buildEmptyClusterScenarioPoints();

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(
                        new FixedRandom(), EmptyClusterStrategy.LARGEST_POINTS_NUMBER);

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 1);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // 10) EmptyClusterStrategy.FARTHEST_POINT
    // =================================================================
    @Test
    public void testEmptyClusterStrategyFarthestPointDoesNotThrow() {
        List<TestPoint> points = buildEmptyClusterScenarioPoints();

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(
                        new FixedRandom(), EmptyClusterStrategy.FARTHEST_POINT);

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 1);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // 11) EmptyClusterStrategy.ERROR -> ต้อง throw ConvergenceException
    // =================================================================
    @Test(expected = ConvergenceException.class)
    public void testEmptyClusterStrategyErrorThrowsConvergenceException() {
        List<TestPoint> points = buildEmptyClusterScenarioPoints();

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(
                        new FixedRandom(), EmptyClusterStrategy.ERROR);

        clusterer.cluster(points, 2, 1);
    }

    // =================================================================
    // 12) Default constructor (single-arg) ต้องใช้ LARGEST_VARIANCE
    //     เป็น default strategy ตาม javadoc ของ constructor
    //     ทดสอบทางอ้อมว่า default constructor ไม่ throw บน empty-cluster scenario
    //     (ถ้า default เป็น ERROR จะ throw แทน)
    // =================================================================
    @Test
    public void testDefaultConstructorUsesLargestVarianceStrategy() {
        List<TestPoint> points = buildEmptyClusterScenarioPoints();

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new FixedRandom());

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 1);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }

    // =================================================================
    // 13) ตรวจสอบ branch "clusteringChanged" ผ่าน equals() ของ center
    //     ใช้จุดที่ identical กันทั้งหมด -> centroid เท่ากับ center เดิมเสมอ
    //     -> ควร converge ตั้งแต่ iteration แรก (early return)
    // =================================================================
    @Test
    public void testConvergenceWhenCentersDoNotChange() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(5, 5));
        points.add(new TestPoint(5, 5));
        points.add(new TestPoint(5, 5));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(9));

        // ใส่ maxIterations จำนวนมาก แต่คาดว่า algorithm จะ early-return
        // เพราะ center ไม่เปลี่ยนตั้งแต่รอบแรก (จุดทั้งหมดเหมือนกัน, k=1)
        List<Cluster<TestPoint>> result = clusterer.cluster(points, 1, 1000);

        assertEquals(1, result.size());
        assertEquals(points.size(), result.get(0).getPoints().size());
    }

    // =================================================================
    // 14) จำนวนจุด = k (จุดจำนวนน้อยพอดีกับจำนวน cluster ที่ขอ)
    //     ทดสอบ boundary ว่าไม่ error เมื่อ points.size() == k
    // =================================================================
    @Test
    public void testPointsCountEqualsK() {
        List<TestPoint> points = new ArrayList<TestPoint>();
        points.add(new TestPoint(0, 0));
        points.add(new TestPoint(100, 100));

        KMeansPlusPlusClusterer<TestPoint> clusterer =
                new KMeansPlusPlusClusterer<TestPoint>(new Random(11));

        List<Cluster<TestPoint>> result = clusterer.cluster(points, 2, 10);

        assertEquals(2, result.size());
        assertEquals(points.size(), totalPointsAssigned(result));
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testClusterBasicTwoSeparatedGroups` | `cluster()` main flow ปกติ, loop `for(count<max)`, `cluster.getPoints().isEmpty()` = false (else branch), `!newCenter.equals(center)` ทั้งสองทาง, `chooseInitialCenters` while-loop ปกติ, `getNearestCluster` distance comparison |
| `testClusterSingleClusterK1` | k=1 boundary, single-cluster assignment, while(resultSet.size()<k) ไม่ execute (k=1 พบตั้งแต่รอบแรก) |
| `testMaxIterationsZeroReturnsInitialAssignmentOnly` | `maxIterations=0` → `max=0` → for-loop ไม่ execute เลย (boundary ของ `count<max`) |
| `testNegativeMaxIterationsUsesIntegerMaxAndConverges` | `(maxIterations < 0) ? Integer.MAX_VALUE` ternary true-branch, early return ผ่าน `!clusteringChanged` |
| `testEmptyPointsCollectionThrowsIllegalArgumentException` | Invalid input: empty collection → `random.nextInt(0)` throws (fault-detection boundary) |
| `testNullPointsCollectionThrowsNullPointerException` | Invalid input: null collection → NPE จาก `new ArrayList<T>(points)` |
| `testKZeroStillProducesOneClusterDueToSourceLogic` | Boundary k=0: `firstPoint` ถูกเพิ่มแบบ unconditional, while-loop ไม่ execute |
| `testEmptyClusterStrategyLargestVarianceDoesNotThrow` | `switch(emptyStrategy)` case `LARGEST_VARIANCE`, `cluster.getPoints().isEmpty()`=true branch, loop ใน `getPointFromLargestVarianceCluster` (`variance>maxVariance`), `selected!=null` |
| `testEmptyClusterStrategyLargestPointsNumberDoesNotThrow` | `switch` case `LARGEST_POINTS_NUMBER`, loop ใน `getPointFromLargestNumberCluster` (`number>maxNumber`) |
| `testEmptyClusterStrategyFarthestPointDoesNotThrow` | `switch` case `FARTHEST_POINT`, nested loop ใน `getFarthestPoint` (`distance>maxDistance`) |
| `testEmptyClusterStrategyErrorThrowsConvergenceException` | `switch` `default` case → throw `ConvergenceException` |
| `testDefaultConstructorUsesLargestVarianceStrategy` | Constructor overload (1-arg) delegate ไปยัง `LARGEST_VARIANCE` default |
| `testConvergenceWhenCentersDoNotChange` | `!newCenter.equals(cluster.getCenter())` = false branch (center ไม่เปลี่ยน) → early `return clusters` |
| `testPointsCountEqualsK` | Boundary: `points.size() == k`, while-loop ของ `chooseInitialCenters` ครบทุกจุดพอดี |

**ข้อสังเกตเพิ่มเติม:** กรณี `testKZeroStillProducesOneClusterDueToSourceLogic` เป็นตัวอย่างการ "ดักจับพฤติกรรมที่อาจไม่ตรงกับความคาดหวังของผู้ใช้" (k=0 ควรได้ 0 clusters ตามสัญชาตญาณ แต่ source คืน 1 cluster) ซึ่งเป็นจุดที่ควรพิจารณาว่าเป็น fault หรือ by-design — ระบุไว้ตรงตามโค้ดจริงโดยไม่เดาเจตนาของผู้พัฒนา
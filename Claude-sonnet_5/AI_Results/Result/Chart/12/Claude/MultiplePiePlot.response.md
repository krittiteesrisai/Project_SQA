# JUnit 4 Test Suite: MultiplePiePlotTest

```java
package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

import org.junit.Test;

/**
 * Unit tests for {@link MultiplePiePlot} (Defects4J Chart-12b)
 *
 * หมายเหตุ: ทดสอบเฉพาะ behavior ที่มีอยู่จริงในซอร์สโค้ดที่ให้มา
 * ไม่มีการเดา behavior เพิ่มเติมนอกเหนือจากที่ปรากฏใน source
 */
public class MultiplePiePlotTest {

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructorValues() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertNull(plot.getDataset());
        assertEquals(TableOrder.BY_COLUMN, plot.getDataExtractOrder());
        assertEquals(0.0, plot.getLimit(), 0.0000001);
        assertEquals("Other", plot.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot.getAggregatedItemsPaint());
        assertNotNull(plot.getPieChart());
        assertTrue(plot.getPieChart().getPlot() instanceof PiePlot);
    }

    @Test
    public void testConstructorWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testConstructorWithNullDataset() {
        MultiplePiePlot plot = new MultiplePiePlot(null);
        assertNull(plot.getDataset());
    }

    // ---------------------------------------------------------------
    // getDataset / setDataset
    // ---------------------------------------------------------------

    @Test
    public void testSetAndGetDataset() {
        MultiplePiePlot plot = new MultiplePiePlot();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(2.0, "R1", "C1");
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetReplacingExisting() {
        // ครอบคลุม branch: this.dataset != null -> removeChangeListener
        DefaultCategoryDataset d1 = new DefaultCategoryDataset();
        d1.addValue(1.0, "R1", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(d1);

        DefaultCategoryDataset d2 = new DefaultCategoryDataset();
        d2.addValue(2.0, "R2", "C2");
        plot.setDataset(d2);

        assertSame(d2, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        // ครอบคลุม branch: dataset == null -> ไม่ setDatasetGroup/addChangeListener
        DefaultCategoryDataset d1 = new DefaultCategoryDataset();
        d1.addValue(1.0, "R1", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(d1);
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    // ---------------------------------------------------------------
    // setPieChart
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNullThrows() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartInvalidPlotThrows() {
        MultiplePiePlot plot = new MultiplePiePlot();
        // CategoryPlot ไม่ใช่ PiePlot -> ต้อง throw
        JFreeChart invalidChart = new JFreeChart(new CategoryPlot());
        plot.setPieChart(invalidChart);
    }

    @Test
    public void testSetPieChartValid() {
        MultiplePiePlot plot = new MultiplePiePlot();
        JFreeChart newChart = new JFreeChart(new PiePlot(null));
        plot.setPieChart(newChart);
        assertSame(newChart, plot.getPieChart());
    }

    // ---------------------------------------------------------------
    // setDataExtractOrder
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrderNullThrows() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testSetDataExtractOrderValid() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    // ---------------------------------------------------------------
    // limit
    // ---------------------------------------------------------------

    @Test
    public void testSetAndGetLimit() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(0.05);
        assertEquals(0.05, plot.getLimit(), 0.0000001);
    }

    @Test
    public void testSetLimitNegative() {
        // ไม่มีการตรวจสอบค่าติดลบในซอร์ส -> ควรตั้งค่าได้โดยไม่ throw
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(-1.0);
        assertEquals(-1.0, plot.getLimit(), 0.0000001);
    }

    @Test
    public void testSetLimitZeroBoundary() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(0.0);
        assertEquals(0.0, plot.getLimit(), 0.0000001);
    }

    // ---------------------------------------------------------------
    // aggregatedItemsKey
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKeyNullThrows() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey(null);
    }

    @Test
    public void testSetAndGetAggregatedItemsKey() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey("Misc");
        assertEquals("Misc", plot.getAggregatedItemsKey());
    }

    @Test
    public void testSetAggregatedItemsKeyEmptyString() {
        // ค่าว่าง (ไม่ null) ควรตั้งได้
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey("");
        assertEquals("", plot.getAggregatedItemsKey());
    }

    // ---------------------------------------------------------------
    // aggregatedItemsPaint
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaintNullThrows() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testSetAndGetAggregatedItemsPaint() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(Color.RED);
        assertEquals(Color.RED, plot.getAggregatedItemsPaint());
    }

    // ---------------------------------------------------------------
    // getPlotType
    // ---------------------------------------------------------------

    @Test
    public void testGetPlotType() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertEquals("Multiple Pie Plot", plot.getPlotType());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertFalse(plot.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        MultiplePiePlot plot = new MultiplePiePlot();
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsIdenticalDefaultInstances() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    @Test
    public void testEqualsDifferentDataExtractOrder() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        p2.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentLimit() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        p2.setLimit(0.1);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentAggregatedItemsKey() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        p2.setAggregatedItemsKey("Misc");
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentAggregatedItemsPaint() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        p2.setAggregatedItemsPaint(Color.BLUE);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentPieChart() {
        MultiplePiePlot p1 = new MultiplePiePlot();
        MultiplePiePlot p2 = new MultiplePiePlot();
        p2.setPieChart(new JFreeChart(new PiePlot(null))); // ไม่มี title เหมือน default
        assertFalse(p1.equals(p2));
    }

    // ---------------------------------------------------------------
    // getLegendItems()
    // ---------------------------------------------------------------

    @Test
    public void testGetLegendItemsNullDataset() {
        // ครอบคลุม branch: this.dataset == null -> คืน collection ว่าง
        MultiplePiePlot plot = new MultiplePiePlot();
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsByColumnOrderDefault() {
        // dataExtractOrder default = BY_COLUMN -> keys = rowKeys
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);

        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
        LegendItem item0 = items.get(0);
        assertEquals("R1", item0.getLabel());
    }

    @Test
    public void testGetLegendItemsByRowOrder() {
        // dataExtractOrder = BY_ROW -> keys = columnKeys
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);

        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount());
        LegendItem item0 = items.get(0);
        assertEquals("C1", item0.getLabel());
    }

    @Test
    public void testGetLegendItemsWithAggregationLimit() {
        // ครอบคลุม branch: this.limit > 0.0 -> เพิ่ม LegendItem สำหรับ aggregatedItemsKey
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setLimit(0.05);

        LegendItemCollection items = plot.getLegendItems();
        // 1 item จาก key R1 + 1 item สำหรับ aggregated key
        assertEquals(2, items.getItemCount());
        LegendItem lastItem = items.get(items.getItemCount() - 1);
        assertEquals("Other", lastItem.getLabel());
    }

    // ---------------------------------------------------------------
    // draw()
    // ---------------------------------------------------------------

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(400, 400,
                BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    @Test
    public void testDrawWithNullDataset() {
        // ครอบคลุม branch: DatasetUtilities.isEmptyOrNull == true -> drawNoDataMessage & return
        MultiplePiePlot plot = new MultiplePiePlot(null);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        // ไม่ควร throw exception
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawWithEmptyDataset() {
        // dataset ไม่ null แต่ไม่มีข้อมูล -> isEmptyOrNull == true
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawWithValidDatasetByColumn() {
        // ครอบคลุม branch: dataExtractOrder == BY_COLUMN (default) -> pieCount = columnCount
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawWithValidDatasetByRow() {
        // ครอบคลุม branch: dataExtractOrder == BY_ROW -> pieCount = rowCount
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R2", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawWithAggregationLimit() {
        // ครอบคลุม branch: this.limit > 0.0 -> ใช้ createConsolidatedPieDataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(100.0, "R1", "C2");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setLimit(0.5); // section C1 ควรถูก aggregate
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawSwapRowsColumnsBranch() {
        // ครอบคลุม branch: displayCols > displayRows && area.width < area.height
        // pieCount = 2 (BY_COLUMN) -> displayCols=2, displayRows=1 ก่อน swap
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Graphics2D g2 = createGraphics();
        // width (100) < height (400) เพื่อบังคับให้เกิดการสลับ
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 400);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawDiffOffsetBranch() {
        // ครอบคลุม branch: diff != 0 -> คำนวณ xoffset
        // pieCount = 3 -> displayCols=2, displayRows=2, diff = (2*2)-3 = 1
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        dataset.addValue(3.0, "R1", "C3");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawWithRenderingInfo() {
        // ครอบคลุม branch: info != null -> สร้าง subinfo และรวบรวม entity/plotInfo
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        dataset.addValue(2.0, "R1", "C2");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);

        ChartRenderingInfo chartInfo = new ChartRenderingInfo();
        PlotRenderingInfo plotInfo = chartInfo.getPlotInfo();
        // ไม่ควร throw NullPointerException
        plot.draw(g2, area, null, null, plotInfo);
    }

    @Test
    public void testDrawWithAnchorPoint() {
        // anchor permitted null หรือมีค่า -> ทดสอบกรณีมี anchor point
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        Point2D anchor = new Point2D.Double(10, 10);
        plot.draw(g2, area, anchor, null, null);
    }
}
```

---

## สรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorValues`, `testConstructorWithDataset`, `testConstructorWithNullDataset` | ค่า default ของ constructor ทั้ง 2 แบบ (มี/ไม่มี dataset) |
| `testSetAndGetDataset`, `testSetDatasetReplacingExisting` | branch `this.dataset != null` (removeChangeListener) |
| `testSetDatasetNull` | branch `dataset == null` (ไม่ setDatasetGroup/addChangeListener) |
| `testSetPieChartNullThrows` | if (pieChart == null) throw |
| `testSetPieChartInvalidPlotThrows` | if (!(plot instanceof PiePlot)) throw |
| `testSetPieChartValid` | เส้นทาง success ของ setPieChart |
| `testSetDataExtractOrderNullThrows` | if (order == null) throw |
| `testSetDataExtractOrderValid` | เส้นทาง success ของ setDataExtractOrder |
| `testSetAndGetLimit`, `testSetLimitNegative`, `testSetLimitZeroBoundary` | boundary ของ limit (0, negative, positive) |
| `testSetAggregatedItemsKeyNullThrows` | if (key == null) throw |
| `testSetAndGetAggregatedItemsKey`, `testSetAggregatedItemsKeyEmptyString` | ค่า key ปกติ/ค่าว่าง |
| `testSetAggregatedItemsPaintNullThrows` | if (paint == null) throw |
| `testSetAndGetAggregatedItemsPaint` | เส้นทาง success |
| `testGetPlotType` | คืนค่า string คงที่ |
| `testEqualsSameInstance`, `testEqualsNull`, `testEqualsDifferentClass` | if (obj==this) / if (!(obj instanceof ...)) |
| `testEqualsIdenticalDefaultInstances` | เส้นทาง equals ที่ทุก field ตรงกัน (return true) |
| `testEqualsDifferentDataExtractOrder` | if (dataExtractOrder != that.dataExtractOrder) |
| `testEqualsDifferentLimit` | if (limit != that.limit) |
| `testEqualsDifferentAggregatedItemsKey` | if (!aggregatedItemsKey.equals(...)) |
| `testEqualsDifferentAggregatedItemsPaint` | if (!PaintUtilities.equal(...)) |
| `testEqualsDifferentPieChart` | if (!ObjectUtilities.equal(pieChart,...)) |
| `testGetLegendItemsNullDataset` | if (this.dataset != null) == false |
| `testGetLegendItemsByColumnOrderDefault` | branch `dataExtractOrder == BY_COLUMN` -> keys=rowKeys |
| `testGetLegendItemsByRowOrder` | branch `dataExtractOrder == BY_ROW` -> keys=columnKeys |
| `testGetLegendItemsWithAggregationLimit` | if (this.limit > 0.0) เพิ่ม legend item พิเศษ |
| `testDrawWithNullDataset`, `testDrawWithEmptyDataset` | if (isEmptyOrNull(dataset)) -> drawNoDataMessage & return |
| `testDrawWithValidDatasetByColumn` | branch `dataExtractOrder == BY_COLUMN` ใน draw() (pieCount) |
| `testDrawWithValidDatasetByRow` | branch `dataExtractOrder == BY_ROW` ใน draw() (pieCount) |
| `testDrawWithAggregationLimit` | if (this.limit > 0.0) ใน draw() -> createConsolidatedPieDataset |
| `testDrawSwapRowsColumnsBranch` | if (displayCols > displayRows && width < height) -> swap |
| `testDrawDiffOffsetBranch` | if (row == displayRows-1 && diff != 0) -> xoffset |
| `testDrawWithRenderingInfo` | if (info != null) -> สร้าง subinfo/รวบรวม entity |
| `testDrawWithAnchorPoint` | ตรวจสอบ anchor parameter (permitted non-null) |

**หมายเหตุสำคัญ:**
- Loop ภายใน `piedataset.getItemCount()` (การกำหนดสี section) ถูกครอบคลุมโดยอ้อมผ่านทุก testDraw* ที่มี dataset จริง (ทั้งกรณี key ตรงกับ `aggregatedItemsKey` และไม่ตรง)
- เมธอด `prefetchSectionPaints()` เป็น private จึงไม่สามารถเทสตรงได้ ถูกครอบคลุมทางอ้อมผ่าน `draw()` และ `getLegendItems()`
- ไม่ได้เทส `writeObject`/`readObject` (serialization) เนื่องจากไม่มี requirement ชัดเจนและ exceeds scope ของ branch coverage หลัก แต่หากต้องการ full coverage ควรเพิ่ม test serialize/deserialize แยกในอนาคต
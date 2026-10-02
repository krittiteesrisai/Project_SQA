# StatisticalBarRendererTest.java

```java
package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.image.BufferedImage;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link StatisticalBarRenderer} (Chart-25b / Defects4J).
 *
 * หมายเหตุ: เนื่องจากไม่มี mocking framework (mockito) ในคลาสพาธที่กำหนด
 * (มีเพียง junit-4.12 + hamcrest, servlet.jar) การทดสอบ drawItem/drawHorizontalItem/
 * drawVerticalItem จึงใช้ "ของจริง" (real JFreeChart object graph: CategoryPlot,
 * NumberAxis, CategoryAxis, JFreeChart) แล้วเรียก chart.createBufferedImage(...)
 * เพื่อ trigger การ render จริง — เราตรวจสอบหลักๆ ว่า "ไม่ throw exception ที่ไม่คาดคิด"
 * (หรือ throw ตามที่ source code จริงกำหนดไว้ เช่น NPE เมื่อ meanValue เป็น null)
 * ซึ่งเพียงพอสำหรับให้ branch ต่างๆ ถูก exercise (เพื่อ branch coverage)
 * โดยไม่ได้เดา behavior ที่ไม่มีอยู่ใน source
 *
 * สมมติฐานที่ใช้ (ระบุไว้ชัดเจนเพราะไม่ 100% แน่ใจจาก source ที่ให้มาโดยตรง แต่เป็น
 * behavior มาตรฐานของ JFreeChart ValueAxis/BarRenderer ที่ getLowerClip()/getUpperClip()
 * สะท้อนค่าที่ตั้งด้วย rangeAxis.setRange(lower, upper) เมื่อปิด autoRange และตั้ง
 * upper/lowerMargin = 0):
 *  - ใช้เพื่อบังคับ path การคำนวณ clip (uclip<=0 / lclip<=0 / lclip>0) ให้ตรงเป้า
 */
public class StatisticalBarRendererTest {

    // ---------------------------------------------------------------
    // Helper สำหรับสร้างและ render bar เดี่ยว (1 series x 1 category)
    // ---------------------------------------------------------------
    private BufferedImage renderSingleItem(PlotOrientation orientation,
                                            StatisticalBarRenderer renderer,
                                            double lower, double upper,
                                            double mean, double stdDev,
                                            int width, int height,
                                            ChartRenderingInfo info) {
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(mean, stdDev, "Series1", "Category1");

        CategoryAxis domainAxis = new CategoryAxis("Cat");
        NumberAxis rangeAxis = new NumberAxis("Val");
        rangeAxis.setAutoRange(false);
        rangeAxis.setRange(lower, upper);
        rangeAxis.setUpperMargin(0.0);
        rangeAxis.setLowerMargin(0.0);

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot.setOrientation(orientation);

        JFreeChart chart = new JFreeChart(plot);
        if (info != null) {
            return chart.createBufferedImage(width, height, info);
        }
        return chart.createBufferedImage(width, height);
    }

    // helper สำหรับกรณี meanValue เป็น null (แถว/คอลัมน์ที่ไม่ได้ add ค่า)
    private BufferedImage renderWithNullMeanCell(PlotOrientation orientation) {
        DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset();
        // สร้าง key "Row0" และ "Row1" และ "Col0","Col1" แต่เติมค่าไม่ครบ
        // -> (Row1, Col0) จะไม่มีค่า -> getMeanValue(1,0) == null
        dataset.add(10.0, 1.0, "Row0", "Col0");
        dataset.add(20.0, 2.0, "Row1", "Col1");

        CategoryAxis domainAxis = new CategoryAxis("Cat");
        NumberAxis rangeAxis = new NumberAxis("Val");
        rangeAxis.setAutoRange(true);

        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot.setOrientation(orientation);

        JFreeChart chart = new JFreeChart(plot);
        return chart.createBufferedImage(200, 100);
    }

    // =================================================================
    // 1) Constructor / getter-setter ของ errorIndicatorPaint / Stroke
    // =================================================================

    @Test
    public void testDefaultConstructorValues() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertEquals(Color.gray, renderer.getErrorIndicatorPaint());
        assertEquals(new BasicStroke(0.5f), renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorPaint_NonNull() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Paint p = Color.RED;
        renderer.setErrorIndicatorPaint(p);
        assertEquals(p, renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetErrorIndicatorPaint_Null() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorPaint(null);
        assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetErrorIndicatorStroke_NonNull() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Stroke s = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(s);
        assertEquals(s, renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testSetErrorIndicatorStroke_Null() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorStroke(null);
        assertNull(renderer.getErrorIndicatorStroke());
    }

    // =================================================================
    // 2) equals()
    // =================================================================

    @Test
    public void testEquals_SameInstance() {
        StatisticalBarRenderer r = new StatisticalBarRenderer();
        assertTrue(r.equals(r));
    }

    @Test
    public void testEquals_NotInstanceOfClass() {
        StatisticalBarRenderer r = new StatisticalBarRenderer();
        assertFalse(r.equals("not a renderer"));
    }

    @Test
    public void testEquals_SuperNotEqual() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        // เปลี่ยนค่าที่ inherited equals (BarRenderer) เช่น itemMargin ให้ต่างกัน
        r2.setItemMargin(0.55);
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testEquals_ErrorIndicatorPaintDifferent() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        r2.setErrorIndicatorPaint(Color.BLUE);
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testEquals_FullyEqual() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        assertTrue(r1.equals(r2));
    }

    /**
     * ตาม source ที่ให้มา equals() ไม่ได้เปรียบเทียบ errorIndicatorStroke เลย
     * (มีเพียง errorIndicatorPaint เท่านั้นที่ถูกตรวจ) -> นี่คือ behavior จริงตาม source
     * (ไม่ใช่การเดา) จึงเขียน test นี้ไว้เพื่อ "ดักจับ" หากมีการแก้ไข logic ในอนาคต
     */
    @Test
    public void testEquals_ErrorIndicatorStrokeDifferent_StillEqualPerSource() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        r2.setErrorIndicatorStroke(new BasicStroke(5.0f));
        assertTrue(r1.equals(r2)); // ตาม source จริง stroke ไม่ถูกเช็คใน equals()
    }

    // =================================================================
    // 3) drawItem() - defensive check / dispatch ตาม orientation
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testDrawItem_InvalidDatasetType_ThrowsException() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        // ตาม source: การ check instanceof เป็นบรรทัดแรก ก่อนใช้ param อื่นๆ
        // จึงส่ง null สำหรับพารามิเตอร์ที่ยังไม่ถูกใช้ได้อย่างปลอดภัย
        renderer.drawItem(null, null, null, null, null, null, dataset, 0, 0, 0);
    }

    @Test
    public void testDrawItem_HorizontalOrientationDispatch() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testDrawItem_VerticalOrientationDispatch() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    // =================================================================
    // 4) drawHorizontalItem() - clip branch (uclip<=0 / lclip<=0 / lclip>0)
    // =================================================================

    // ---- uclip <= 0 (cases 1-4) ----
    @Test
    public void testHorizontal_UclipLE0_ValueGEUclip_BarInvisible() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -10, -1, 0, 1, 300, 200, null);
        assertNotNull(img); // return early ภายใน แต่ render โดยรวมไม่ throw
    }

    @Test
    public void testHorizontal_UclipLE0_ValueLEQlclip_ClipToLower() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -10, -1, -20, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testHorizontal_UclipLE0_ValueBetween_NoClip() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -10, -1, -5, 1, 300, 200, null);
        assertNotNull(img);
    }

    // ---- lclip <= 0 < uclip (cases 5-8) ----
    @Test
    public void testHorizontal_LclipLE0_ValueGEUclip_ClipTop() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -5, 10, 15, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testHorizontal_LclipLE0_ValueLEQlclip_ClipBottom() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -5, 10, -8, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testHorizontal_LclipLE0_ValueBetween_NoClip() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    // ---- lclip > 0 (cases 9-12) ----
    @Test
    public void testHorizontal_LclipGT0_ValueLEQlclip_BarInvisible() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testHorizontal_LclipGT0_ValueGEUclip_ClipTop() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                5, 10, 15, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testHorizontal_LclipGT0_ValueBetween_NoClip() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.HORIZONTAL, renderer,
                5, 10, 7, 1, 300, 200, null);
        assertNotNull(img);
    }

    // =================================================================
    // 5) drawVerticalItem() - clip branch (โครงสร้างเดียวกัน แต่เป็นคนละเมธอด)
    // =================================================================

    @Test
    public void testVertical_UclipLE0_ValueGEUclip_BarInvisible() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -10, -1, 0, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_UclipLE0_ValueLEQlclip_ClipToLower() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -10, -1, -20, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_UclipLE0_ValueBetween_NoClip() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -10, -1, -5, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_LclipLE0_ValueGEUclip_ClipTop() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 15, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_LclipLE0_ValueLEQlclip_ClipBottom() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, -8, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_LclipLE0_ValueBetween_NoClip() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_LclipGT0_ValueLEQlclip_BarInvisible() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_LclipGT0_ValueGEUclip_ClipTop() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                5, 10, 15, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testVertical_LclipGT0_ValueBetween_NoClip() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                5, 10, 7, 1, 300, 200, null);
        assertNotNull(img);
    }

    // =================================================================
    // 6) meanValue == null -> NullPointerException (ตรงตาม source ที่ให้มา
    //    ซึ่งไม่มีการเช็ค null ก่อน meanValue.doubleValue())
    // =================================================================

    @Test(expected = NullPointerException.class)
    public void testHorizontal_NullMeanValue_ThrowsNPE() {
        renderWithNullMeanCell(PlotOrientation.HORIZONTAL);
    }

    @Test(expected = NullPointerException.class)
    public void testVertical_NullMeanValue_ThrowsNPE() {
        renderWithNullMeanCell(PlotOrientation.VERTICAL);
    }

    // =================================================================
    // 7) isDrawBarOutline() && state.getBarWidth() > 3
    // =================================================================

    @Test
    public void testDrawBarOutline_FalseBranch() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setDrawBarOutline(false);
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 400, 300, null);
        assertNotNull(img);
    }

    @Test
    public void testDrawBarOutline_TrueBranch_LargeBarWidth() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setDrawBarOutline(true);
        // ใช้ภาพขนาดใหญ่ + dataset 1 series/1 category เพื่อให้ barWidth > 3 พิกเซล
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 400, 300, null);
        assertNotNull(img);
    }

    // =================================================================
    // 8) item label generator != null && isItemLabelVisible()
    // =================================================================

    @Test
    public void testItemLabelGenerator_VisibleBranch() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(Boolean.TRUE);
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    @Test
    public void testItemLabelGenerator_NullBranch_Default() {
        // default generator เป็น null -> เข้า else / condition false
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }

    // =================================================================
    // 9) entities != null (state.getEntityCollection())
    // =================================================================

    @Test
    public void testEntityCollection_NotNullBranch() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        ChartRenderingInfo info = new ChartRenderingInfo();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 300, 200, info);
        assertNotNull(img);
        assertNotNull(info.getEntityCollection());
    }

    @Test
    public void testEntityCollection_NullBranch_NoInfoPassed() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        BufferedImage img = renderSingleItem(PlotOrientation.VERTICAL, renderer,
                -5, 10, 3, 1, 300, 200, null);
        assertNotNull(img);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| กลุ่ม | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor/Getter-Setter | `testDefaultConstructorValues` | ค่า default ของ `errorIndicatorPaint`, `errorIndicatorStroke` |
| | `testSetErrorIndicatorPaint_NonNull/Null` | setter branch (ค่าไม่ null / null) |
| | `testSetErrorIndicatorStroke_NonNull/Null` | setter branch (ค่าไม่ null / null) |
| equals() | `testEquals_SameInstance` | `obj == this` → true |
| | `testEquals_NotInstanceOfClass` | `!(obj instanceof ...)` → true |
| | `testEquals_SuperNotEqual` | `!super.equals(obj)` → true |
| | `testEquals_ErrorIndicatorPaintDifferent` | paint ไม่เท่ากัน → false |
| | `testEquals_FullyEqual` | ทุกเงื่อนไข false → return true |
| | `testEquals_ErrorIndicatorStrokeDifferent_StillEqualPerSource` | ยืนยัน stroke ไม่ถูกใช้ใน equals() ตาม source จริง |
| drawItem dispatch | `testDrawItem_InvalidDatasetType_ThrowsException` | defensive check `instanceof` → throw |
| | `testDrawItem_HorizontalOrientationDispatch` | `orientation == HORIZONTAL` |
| | `testDrawItem_VerticalOrientationDispatch` | `orientation == VERTICAL` |
| drawHorizontalItem clip | `testHorizontal_UclipLE0_*` (3 methods) | uclip<=0: return / clip-lower / no-clip |
| | `testHorizontal_LclipLE0_*` (3 methods) | lclip<=0<uclip: clip-top / clip-bottom / no-clip |
| | `testHorizontal_LclipGT0_*` (3 methods) | lclip>0: return / clip-top / no-clip |
| drawVerticalItem clip | `testVertical_*` (9 methods) | โครงสร้าง branch เดียวกันแต่ใน `drawVerticalItem` |
| Null meanValue (fault) | `testHorizontal_NullMeanValue_ThrowsNPE` | `meanValue.doubleValue()` เมื่อ meanValue เป็น null (horizontal) |
| | `testVertical_NullMeanValue_ThrowsNPE` | เช่นเดียวกันใน vertical |
| drawBarOutline | `testDrawBarOutline_FalseBranch` | `isDrawBarOutline()` = false |
| | `testDrawBarOutline_TrueBranch_LargeBarWidth` | `isDrawBarOutline() && barWidth>3` = true |
| Item label | `testItemLabelGenerator_VisibleBranch` | generator != null && isItemLabelVisible() = true |
| | `testItemLabelGenerator_NullBranch_Default` | generator == null → false |
| Entity collection | `testEntityCollection_NotNullBranch` | `entities != null` = true |
| | `testEntityCollection_NullBranch_NoInfoPassed` | `entities != null` = false |

**หมายเหตุสำคัญ:**
- ไม่ได้ทดสอบ MC/DC แบบละเอียดทุก boundary (`>=`, `<=` ที่ค่าตรงขอบพอดี) เพราะขึ้นกับการ implement ภายในของ `getLowerClip()/getUpperClip()` และ margin ของ axis ซึ่งไม่ได้ระบุใน source ที่ให้มา — จึงใช้ค่าที่ห่างจากขอบพอสมควรเพื่อลด risk จาก assumption
- ไม่ได้ mock `Graphics2D`/`CategoryItemRendererState` เนื่องจากไม่มี mocking library ในคลาสพาธที่กำหนด จึงใช้ real object graph แทนเพื่อ trigger การ render จริง
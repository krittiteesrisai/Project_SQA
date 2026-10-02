# วิเคราะห์และแผนการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `AbstractCategoryItemRenderer` (Chart-1b) พบจุดที่น่าสงสัยว่าเป็น **fault** ในเมธอด `getLegendItems()`:

```java
CategoryDataset dataset = this.plot.getDataset(index);
if (dataset != null) {   // <-- ควรเป็น == null ตาม javadoc/สัญญาเมธอด
    return result;
}
```

เงื่อนไขนี้ดู "กลับข้าง" จาก logic ที่ควรจะเป็น (คืนค่า empty เมื่อ dataset เป็น null) ทำให้เมธอดนี้คืนค่า **empty collection เสมอเมื่อ dataset ไม่เป็น null** (กรณีใช้งานปกติ) — ผมจึงเขียนเทสที่ยึดตาม Javadoc ของเมธอด (`"Returns a (possibly empty) collection of legend items for the series that this renderer is responsible for drawing"`) เพื่อดักจับ fault นี้โดยเฉพาะ พร้อมคอมเมนต์กำกับชัดเจนว่าเทสนี้จะ "fail" บนซอร์สที่มีบั๊ก

**หมายเหตุสำคัญ:** เนื่องจากคลาสเป็น abstract และ implement `CategoryItemRenderer` (interface ที่ไม่ได้ให้มา) ผมจึงใช้ **`LineAndShapeRenderer`** ซึ่งเป็นคลาส concrete มาตรฐานใน JFreeChart ที่ extend คลาสนี้ เพื่อสามารถ instantiate ได้ — ไม่ใช่การเดา behavior ของคลาสเป้าหมาย แต่เป็นการเลือกใช้ concrete subclass ที่มีอยู่จริงเพื่อทดสอบเมธอดของ parent class

จุดที่ผมไม่มั่นใจ 100% ว่ามีอยู่จริงใน API (เช่น `addChangeListener`, `setSeriesVisible`, `setDataBoundsIncludesVisibleSeriesOnly`, `plot.setRangeCrosshairLockedOnData`) ผมได้ **คอมเมนต์กำกับไว้ชัดเจน** ตามข้อกำหนดที่ 4

```java
package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.junit.Before;
import org.junit.Test;

import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryCrosshairState;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * JUnit4 test suite for AbstractCategoryItemRenderer (Defects4J Chart-1b).
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น abstract และ implement interface CategoryItemRenderer
 * ซึ่งไม่ได้แสดงในซอร์สที่ให้มา จึงใช้ LineAndShapeRenderer (concrete subclass
 * มาตรฐานของ JFreeChart) เป็นตัวแทนในการทดสอบเมธอดทั้งหมดของ parent class
 * (ไม่ได้เดา behavior ของ AbstractCategoryItemRenderer เอง)
 */
public class AbstractCategoryItemRendererTest {

    private LineAndShapeRenderer renderer;
    private DefaultCategoryDataset dataset;
    private CategoryPlot plot;
    private CategoryAxis domainAxis;
    private NumberAxis rangeAxis;
    private Graphics2D g2;
    private Rectangle2D dataArea;

    /** ตัวช่วยนับจำนวนครั้งที่ RendererChangeEvent ถูกยิง */
    private static class TestRendererChangeListener
            implements RendererChangeListener {
        int count = 0;
        public void rendererChanged(RendererChangeEvent event) {
            count++;
        }
    }

    /** Annotation stub สำหรับตรวจสอบว่า draw() ถูกเรียกจริง */
    private static class DummyAnnotation implements CategoryAnnotation {
        boolean drawn = false;
        public void draw(Graphics2D g2, CategoryPlot plot,
                Rectangle2D dataArea, CategoryAxis domainAxis,
                ValueAxis rangeAxis, int index, PlotRenderingInfo info) {
            drawn = true;
        }
    }

    /** generator ที่ไม่ implement PublicCloneable เพื่อทดสอบ clone() ที่ throw */
    private static class NonCloneableItemLabelGenerator
            implements CategoryItemLabelGenerator {
        public String generateLabel(CategoryDataset dataset, int row,
                int column) {
            return "x";
        }
    }

    private static class NonCloneableToolTipGenerator
            implements CategoryToolTipGenerator {
        public String generateToolTip(CategoryDataset dataset, int row,
                int column) {
            return "x";
        }
    }

    private static class NonCloneableURLGenerator
            implements CategoryURLGenerator {
        public String generateURL(CategoryDataset dataset, int series,
                int category) {
            return "x";
        }
    }

    @Before
    public void setUp() {
        renderer = new LineAndShapeRenderer();
        dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "S1", "C1");
        dataset.addValue(20.0, "S1", "C2");
        dataset.addValue(30.0, "S2", "C1");
        dataset.addValue(40.0, "S2", "C2");
        domainAxis = new CategoryAxis("Category");
        rangeAxis = new NumberAxis("Value");
        plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        // เรียก setPlot() ตรง ๆ เพื่อไม่พึ่งพา behavior ของ constructor ของ CategoryPlot
        renderer.setPlot(plot);
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        g2 = img.createGraphics();
        dataArea = new Rectangle2D.Double(0, 0, 200, 200);
    }

    // ---------- Constructor / default state ----------

    @Test
    public void testDefaultState() {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        assertNull(r.getPlot());
        assertEquals(0, r.getRowCount());
        assertEquals(0, r.getColumnCount());
        assertNull(r.getBaseItemLabelGenerator());
        assertNull(r.getBaseToolTipGenerator());
        assertNull(r.getBaseURLGenerator());
        assertNotNull(r.getLegendItemLabelGenerator());
        assertNull(r.getLegendItemToolTipGenerator());
        assertNull(r.getLegendItemURLGenerator());
        assertEquals(1, r.getPassCount());
    }

    // ---------- setPlot ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSetPlotNullThrows() {
        new LineAndShapeRenderer().setPlot(null);
    }

    @Test
    public void testSetPlotValid() {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        r.setPlot(plot);
        assertSame(plot, r.getPlot());
    }

    // ---------- Item label generator ----------

    @Test
    public void testItemLabelGenerator_SeriesOverridesBase() {
        CategoryItemLabelGenerator base = new StandardCategoryItemLabelGenerator();
        CategoryItemLabelGenerator seriesGen = new StandardCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(base, false);
        renderer.setSeriesItemLabelGenerator(0, seriesGen, false);
        assertSame(seriesGen, renderer.getItemLabelGenerator(0, 0, false));
    }

    @Test
    public void testItemLabelGenerator_FallbackToBase() {
        CategoryItemLabelGenerator base = new StandardCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(base, false);
        assertSame(base, renderer.getItemLabelGenerator(5, 0, false));
    }

    @Test
    public void testItemLabelGenerator_NullWhenNoneSet() {
        assertNull(renderer.getItemLabelGenerator(0, 0, false));
    }

    @Test
    public void testGetSeriesItemLabelGenerator_NullByDefault() {
        assertNull(renderer.getSeriesItemLabelGenerator(0));
    }

    @Test
    public void testSetSeriesItemLabelGenerator_NotifyTrueByDefault() {
        // สมมติว่า AbstractRenderer มีเมธอด addChangeListener (ไม่ปรากฏในซอร์สที่ให้มา)
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetSeriesItemLabelGenerator_NotifyFalse() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setSeriesItemLabelGenerator(0,
                new StandardCategoryItemLabelGenerator(), false);
        assertEquals(0, l.count);
    }

    @Test
    public void testSetBaseItemLabelGenerator_NotifyTrueFalse() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        assertEquals(1, l.count);
        renderer.setBaseItemLabelGenerator(null, false);
        assertEquals(1, l.count);
        assertNull(renderer.getBaseItemLabelGenerator());
    }

    // ---------- Tool tip generator ----------

    @Test
    public void testToolTipGenerator_SeriesAndBaseFallback() {
        assertNull(renderer.getToolTipGenerator(0, 0, false));
        CategoryToolTipGenerator base = new StandardCategoryToolTipGenerator();
        renderer.setBaseToolTipGenerator(base, false);
        assertSame(base, renderer.getToolTipGenerator(0, 0, false));
        CategoryToolTipGenerator seriesGen = new StandardCategoryToolTipGenerator();
        renderer.setSeriesToolTipGenerator(0, seriesGen, false);
        assertSame(seriesGen, renderer.getToolTipGenerator(0, 0, false));
        assertNull(renderer.getSeriesToolTipGenerator(1));
    }

    @Test
    public void testSetSeriesToolTipGenerator_Notify() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setSeriesToolTipGenerator(0, new StandardCategoryToolTipGenerator());
        assertEquals(1, l.count);
        renderer.setSeriesToolTipGenerator(0, null, false);
        assertEquals(1, l.count);
    }

    @Test
    public void testBaseToolTipGenerator_Notify() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        assertEquals(1, l.count);
    }

    // ---------- URL generator ----------

    @Test
    public void testURLGenerator_SeriesAndBaseFallback() {
        assertNull(renderer.getURLGenerator(0, 0, false));
        CategoryURLGenerator base = new StandardCategoryURLGenerator();
        renderer.setBaseURLGenerator(base, false);
        assertSame(base, renderer.getURLGenerator(0, 0, false));
        CategoryURLGenerator seriesGen = new StandardCategoryURLGenerator();
        renderer.setSeriesURLGenerator(0, seriesGen, false);
        assertSame(seriesGen, renderer.getURLGenerator(0, 0, false));
    }

    @Test
    public void testSetSeriesURLGenerator_Notify() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setSeriesURLGenerator(0, new StandardCategoryURLGenerator());
        assertEquals(1, l.count);
    }

    @Test
    public void testBaseURLGenerator_Notify() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setBaseURLGenerator(new StandardCategoryURLGenerator());
        assertEquals(1, l.count);
    }

    // ---------- Annotations ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNullThrows() {
        renderer.addAnnotation(null);
    }

    @Test
    public void testAddAnnotationDefaultGoesToForeground() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        DummyAnnotation ann = new DummyAnnotation();
        renderer.addAnnotation(ann);
        assertEquals(1, l.count);
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis,
                Layer.FOREGROUND, null);
        assertTrue(ann.drawn);
    }

    @Test
    public void testAddAnnotationBackgroundLayer() {
        DummyAnnotation ann = new DummyAnnotation();
        renderer.addAnnotation(ann, Layer.BACKGROUND);
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis,
                Layer.BACKGROUND, null);
        assertTrue(ann.drawn);
    }

    @Test
    public void testAddAnnotationForegroundLayerExplicit() {
        DummyAnnotation ann = new DummyAnnotation();
        renderer.addAnnotation(ann, Layer.FOREGROUND);
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis,
                Layer.FOREGROUND, null);
        assertTrue(ann.drawn);
    }

    @Test
    public void testDrawAnnotations_BackgroundDoesNotTriggerForeground() {
        DummyAnnotation fg = new DummyAnnotation();
        DummyAnnotation bg = new DummyAnnotation();
        renderer.addAnnotation(fg, Layer.FOREGROUND);
        renderer.addAnnotation(bg, Layer.BACKGROUND);
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis,
                Layer.BACKGROUND, null);
        assertFalse(fg.drawn);
        assertTrue(bg.drawn);
    }

    @Test
    public void testRemoveAnnotation_OnlyInForeground_ReturnsFalseDueToAndLogic() {
        // ตามซอร์ส: removed = fg.remove(ann) & bg.remove(ann)
        // ถ้า annotation อยู่ใน foreground เท่านั้น bg.remove() คืน false
        // ทำให้ผลลัพธ์รวมเป็น false ทั้งที่ลบออกจาก foreground ได้จริง
        // (พฤติกรรมนี้อ่านได้ตรงจากซอร์ส ไม่ใช่การเดา)
        DummyAnnotation ann = new DummyAnnotation();
        renderer.addAnnotation(ann, Layer.FOREGROUND);
        boolean removed = renderer.removeAnnotation(ann);
        assertFalse(removed);
    }

    @Test
    public void testRemoveAnnotation_NotPresent_ReturnsFalse() {
        DummyAnnotation ann = new DummyAnnotation();
        assertFalse(renderer.removeAnnotation(ann));
    }

    @Test
    public void testRemoveAnnotations_ClearsBoth() {
        DummyAnnotation a1 = new DummyAnnotation();
        DummyAnnotation a2 = new DummyAnnotation();
        renderer.addAnnotation(a1, Layer.FOREGROUND);
        renderer.addAnnotation(a2, Layer.BACKGROUND);
        renderer.removeAnnotations();
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis,
                Layer.FOREGROUND, null);
        renderer.drawAnnotations(g2, dataArea, domainAxis, rangeAxis,
                Layer.BACKGROUND, null);
        assertFalse(a1.drawn);
        assertFalse(a2.drawn);
    }

    // ---------- Legend item generators ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemLabelGeneratorNullThrows() {
        renderer.setLegendItemLabelGenerator(null);
    }

    @Test
    public void testSetLegendItemLabelGeneratorValid() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        CategorySeriesLabelGenerator gen = new StandardCategorySeriesLabelGenerator();
        renderer.setLegendItemLabelGenerator(gen);
        assertSame(gen, renderer.getLegendItemLabelGenerator());
        assertEquals(1, l.count);
    }

    @Test
    public void testLegendItemToolTipGenerator_NullPermitted() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setLegendItemToolTipGenerator(null);
        assertNull(renderer.getLegendItemToolTipGenerator());
        assertEquals(1, l.count);
    }

    @Test
    public void testLegendItemURLGenerator_NullPermitted() {
        TestRendererChangeListener l = new TestRendererChangeListener();
        renderer.addChangeListener(l);
        renderer.setLegendItemURLGenerator(null);
        assertNull(renderer.getLegendItemURLGenerator());
        assertEquals(1, l.count);
    }

    // ---------- initialise() / createState() ----------

    @Test
    public void testInitialise_NullDataset() {
        CategoryItemRendererState state =
                renderer.initialise(g2, dataArea, plot, null, null);
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
        assertNotNull(state);
    }

    @Test
    public void testInitialise_ValidDataset() {
        CategoryItemRendererState state =
                renderer.initialise(g2, dataArea, plot, dataset, null);
        assertEquals(2, renderer.getRowCount());
        assertEquals(2, renderer.getColumnCount());
        assertNotNull(state);
    }

    @Test
    public void testInitialise_PlotRenderingInfoOwnerNull() {
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        CategoryItemRendererState state =
                renderer.initialise(g2, dataArea, plot, dataset, info);
        assertNotNull(state);
    }

    @Test
    public void testInitialise_VisibleSeriesArray_AllVisible() {
        CategoryItemRendererState state =
                renderer.initialise(g2, dataArea, plot, dataset, null);
        assertArrayEquals(new int[] {0, 1}, state.getVisibleSeriesArray());
    }

    @Test
    public void testInitialise_VisibleSeriesArray_SomeHidden() {
        // สมมติว่า setSeriesVisible มาจาก AbstractRenderer (ไม่ปรากฏในซอร์สที่ให้มา)
        renderer.setSeriesVisible(0, false);
        CategoryItemRendererState state =
                renderer.initialise(g2, dataArea, plot, dataset, null);
        assertArrayEquals(new int[] {1}, state.getVisibleSeriesArray());
    }

    @Test
    public void testCreateState_ZeroRowCountByDefault() {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        CategoryItemRendererState state = r.createState(null);
        assertArrayEquals(new int[] {}, state.getVisibleSeriesArray());
    }

    // ---------- findRangeBounds ----------

    @Test
    public void testFindRangeBounds_NullDataset() {
        assertNull(renderer.findRangeBounds(null));
    }

    @Test
    public void testFindRangeBounds_ValidDataset() {
        Range r = renderer.findRangeBounds(dataset);
        assertNotNull(r);
        assertEquals(10.0, r.getLowerBound(), 0.0001);
        assertEquals(40.0, r.getUpperBound(), 0.0001);
    }

    @Test
    public void testFindRangeBounds_VisibleSeriesOnly() {
        // สมมติว่า AbstractRenderer มี setDataBoundsIncludesVisibleSeriesOnly(boolean)
        renderer.setDataBoundsIncludesVisibleSeriesOnly(true);
        renderer.setSeriesVisible(0, false);
        Range r = renderer.findRangeBounds(dataset);
        assertNotNull(r);
        assertEquals(30.0, r.getLowerBound(), 0.0001);
        assertEquals(40.0, r.getUpperBound(), 0.0001);
    }

    // ---------- getItemMiddle ----------

    @Test
    public void testGetItemMiddle() {
        double mid = renderer.getItemMiddle("S1", "C1", dataset, domainAxis,
                dataArea, RectangleEdge.BOTTOM);
        assertTrue(mid >= dataArea.getMinX() && mid <= dataArea.getMaxX());
    }

    // ---------- drawBackground / drawOutline ----------

    @Test
    public void testDrawBackground_NoException() {
        renderer.drawBackground(g2, plot, dataArea);
    }

    @Test
    public void testDrawOutline_NoException() {
        renderer.drawOutline(g2, plot, dataArea);
    }

    // ---------- drawDomainLine ----------

    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainLine_NullPaint() {
        renderer.drawDomainLine(g2, plot, dataArea, 50, null, new BasicStroke(1f));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainLine_NullStroke() {
        renderer.drawDomainLine(g2, plot, dataArea, 50, Color.RED, null);
    }

    @Test
    public void testDrawDomainLine_Vertical() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawDomainLine(g2, plot, dataArea, 50, Color.RED, new BasicStroke(1f));
    }

    @Test
    public void testDrawDomainLine_Horizontal() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawDomainLine(g2, plot, dataArea, 50, Color.RED, new BasicStroke(1f));
    }

    // ---------- drawRangeLine ----------

    @Test
    public void testDrawRangeLine_OutOfRange_NoException() {
        rangeAxis.setRange(0, 100);
        renderer.drawRangeLine(g2, plot, rangeAxis, dataArea, 500, Color.BLUE,
                new BasicStroke(1f));
    }

    @Test
    public void testDrawRangeLine_InRange_Vertical() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawRangeLine(g2, plot, rangeAxis, dataArea, 50, Color.BLUE,
                new BasicStroke(1f));
    }

    @Test
    public void testDrawRangeLine_InRange_Horizontal() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawRangeLine(g2, plot, rangeAxis, dataArea, 50, Color.BLUE,
                new BasicStroke(1f));
    }

    // ---------- drawDomainMarker ----------

    @Test
    public void testDrawDomainMarker_ColumnNotFound_ReturnsSilently() {
        CategoryMarker marker = new CategoryMarker("NoSuchCategory");
        renderer.drawDomainMarker(g2, plot, domainAxis, marker, dataArea);
    }

    @Test
    public void testDrawDomainMarker_DrawAsLine() {
        CategoryMarker marker = new CategoryMarker("C1");
        marker.setDrawAsLine(true);
        renderer.drawDomainMarker(g2, plot, domainAxis, marker, dataArea);
    }

    @Test
    public void testDrawDomainMarker_DrawAsArea() {
        CategoryMarker marker = new CategoryMarker("C1");
        marker.setDrawAsLine(false);
        renderer.drawDomainMarker(g2, plot, domainAxis, marker, dataArea);
    }

    @Test
    public void testDrawDomainMarker_WithLabel() {
        CategoryMarker marker = new CategoryMarker("C1");
        marker.setLabel("Test");
        renderer.drawDomainMarker(g2, plot, domainAxis, marker, dataArea);
    }

    @Test
    public void testDrawDomainMarker_HorizontalOrientation() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        CategoryMarker marker = new CategoryMarker("C1");
        renderer.drawDomainMarker(g2, plot, domainAxis, marker, dataArea);
    }

    // ---------- drawRangeMarker : ValueMarker ----------

    @Test
    public void testDrawRangeMarker_ValueMarker_OutOfRange() {
        rangeAxis.setRange(0, 100);
        ValueMarker marker = new ValueMarker(500);
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_ValueMarker_InRange_Vertical() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.VERTICAL);
        ValueMarker marker = new ValueMarker(50);
        marker.setLabel("Mid");
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_ValueMarker_InRange_Horizontal() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        ValueMarker marker = new ValueMarker(50);
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    // ---------- drawRangeMarker : IntervalMarker ----------

    @Test
    public void testDrawRangeMarker_IntervalMarker_NoIntersect() {
        rangeAxis.setRange(0, 100);
        IntervalMarker marker = new IntervalMarker(200, 300);
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_IntervalMarker_Intersect_Vertical() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.VERTICAL);
        IntervalMarker marker = new IntervalMarker(20, 60);
        marker.setLabel("Interval");
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_IntervalMarker_Intersect_Horizontal() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        IntervalMarker marker = new IntervalMarker(20, 60);
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_IntervalMarker_GradientPaint() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.VERTICAL);
        IntervalMarker marker = new IntervalMarker(20, 60);
        marker.setPaint(new GradientPaint(0, 0, Color.RED, 10, 10, Color.BLUE));
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    @Test
    public void testDrawRangeMarker_IntervalMarker_OutlinePaintAndStroke() {
        rangeAxis.setRange(0, 100);
        plot.setOrientation(PlotOrientation.VERTICAL);
        IntervalMarker marker = new IntervalMarker(20, 60);
        marker.setOutlinePaint(Color.BLACK);
        marker.setOutlineStroke(new BasicStroke(2f));
        renderer.drawRangeMarker(g2, plot, rangeAxis, marker, dataArea);
    }

    // ---------- getLegendItem ----------

    @Test
    public void testGetLegendItem_PlotNull() {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        assertNull(r.getLegendItem(0, 0));
    }

    @Test
    public void testGetLegendItem_SeriesNotVisible() {
        renderer.setSeriesVisible(0, false);
        assertNull(renderer.getLegendItem(0, 0));
    }

    @Test
    public void testGetLegendItem_SeriesNotVisibleInLegend() {
        renderer.setSeriesVisibleInLegend(0, false);
        assertNull(renderer.getLegendItem(0, 0));
    }

    @Test
    public void testGetLegendItem_Normal() {
        LegendItem item = renderer.getLegendItem(0, 0);
        assertNotNull(item);
        assertEquals("S1", item.getSeriesKey());
        assertEquals(0, item.getDatasetIndex());
        assertEquals(0, item.getSeriesIndex());
    }

    @Test
    public void testGetLegendItem_WithToolTipAndURLGenerators() {
        renderer.setLegendItemToolTipGenerator(new StandardCategorySeriesLabelGenerator());
        renderer.setLegendItemURLGenerator(new StandardCategorySeriesLabelGenerator());
        LegendItem item = renderer.getLegendItem(0, 0);
        assertNotNull(item);
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_SameInstance() {
        assertTrue(renderer.equals(renderer));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(renderer.equals(null));
    }

    @Test
    public void testEquals_DifferentType() {
        assertFalse(renderer.equals("not a renderer"));
    }

    @Test
    public void testEquals_TwoDefaultRenderers() {
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        LineAndShapeRenderer r2 = new LineAndShapeRenderer();
        assertTrue(r1.equals(r2));
    }

    @Test
    public void testEquals_DifferentAfterModification() {
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        LineAndShapeRenderer r2 = new LineAndShapeRenderer();
        r1.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testHashCode_NoException() {
        renderer.hashCode();
    }

    // ---------- getDrawingSupplier ----------

    @Test
    public void testGetDrawingSupplier_PlotNull() {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        assertNull(r.getDrawingSupplier());
    }

    @Test
    public void testGetDrawingSupplier_PlotSet() {
        assertNotNull(renderer.getDrawingSupplier());
    }

    // ---------- updateCrosshairValues ----------

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateCrosshairValues_NullOrientationThrows() {
        renderer.updateCrosshairValues(null, "S1", "C1", 10, 0, 50, 50, null);
    }

    @Test
    public void testUpdateCrosshairValues_NullCrosshairState_NoException() {
        renderer.updateCrosshairValues(null, "S1", "C1", 10, 0, 50, 50,
                PlotOrientation.VERTICAL);
    }

    @Test
    public void testUpdateCrosshairValues_LockedOnData() {
        // สมมติว่า CategoryPlot มี setRangeCrosshairLockedOnData(boolean)
        // ตาม naming convention ของ getter isRangeCrosshairLockedOnData() ที่ใช้ในซอร์ส
        // และ CategoryCrosshairState มี constructor แบบ no-arg
        plot.setRangeCrosshairLockedOnData(true);
        CategoryCrosshairState state = new CategoryCrosshairState();
        renderer.updateCrosshairValues(state, "S1", "C1", 10, 0, 50, 50,
                PlotOrientation.VERTICAL);
    }

    @Test
    public void testUpdateCrosshairValues_NotLockedOnData() {
        plot.setRangeCrosshairLockedOnData(false);
        CategoryCrosshairState state = new CategoryCrosshairState();
        renderer.updateCrosshairValues(state, "S1", "C1", 10, 0, 50, 50,
                PlotOrientation.VERTICAL);
    }

    // ---------- drawItemLabel ----------

    @Test
    public void testDrawItemLabel_NullGenerator_NoException() {
        renderer.drawItemLabel(g2, PlotOrientation.VERTICAL, dataset, 0, 0,
                false, 50, 50, false);
    }

    @Test
    public void testDrawItemLabel_WithGenerator_Positive() {
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.drawItemLabel(g2, PlotOrientation.VERTICAL, dataset, 0, 0,
                false, 50, 50, false);
    }

    @Test
    public void testDrawItemLabel_WithGenerator_Negative() {
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.drawItemLabel(g2, PlotOrientation.VERTICAL, dataset, 0, 0,
                false, 50, 50, true);
    }

    // ---------- clone ----------

    @Test
    public void testClone_Basic() throws Exception {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        r.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        r.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
        r.setBaseURLGenerator(new StandardCategoryURLGenerator());
        LineAndShapeRenderer clone = (LineAndShapeRenderer) r.clone();
        assertNotSame(r, clone);
        assertNotSame(r.getBaseItemLabelGenerator(), clone.getBaseItemLabelGenerator());
    }

    @Test(expected = CloneNotSupportedException.class)
    public void testClone_BaseItemLabelGeneratorNotCloneableThrows() throws Exception {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        r.setBaseItemLabelGenerator(new NonCloneableItemLabelGenerator());
        r.clone();
    }

    @Test(expected = CloneNotSupportedException.class)
    public void testClone_BaseToolTipGeneratorNotCloneableThrows() throws Exception {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        r.setBaseToolTipGenerator(new NonCloneableToolTipGenerator());
        r.clone();
    }

    @Test(expected = CloneNotSupportedException.class)
    public void testClone_BaseURLGeneratorNotCloneableThrows() throws Exception {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        r.setBaseURLGenerator(new NonCloneableURLGenerator());
        r.clone();
    }

    // ---------- getDomainAxis / getRangeAxis ----------

    @Test
    public void testGetDomainAxis() {
        CategoryAxis axis = renderer.getDomainAxis(plot, dataset);
        assertSame(domainAxis, axis);
    }

    @Test
    public void testGetRangeAxis_ByIndex() {
        ValueAxis axis = renderer.getRangeAxis(plot, 0);
        assertNotNull(axis);
    }

    // ---------- getLegendItems (รวม FAULT-EXPOSING TEST) ----------

    @Test
    public void testGetLegendItems_PlotNull_ReturnsEmpty() {
        LineAndShapeRenderer r = new LineAndShapeRenderer();
        LegendItemCollection items = r.getLegendItems();
        assertEquals(0, items.getItemCount());
    }

    /**
     * FAULT-EXPOSING TEST (Defects4J Chart-1b)
     *
     * ตาม Javadoc ของ getLegendItems(): "Returns a (possibly empty) collection
     * of legend items for the series that this renderer is responsible for
     * drawing." เมื่อ plot และ dataset ถูกต้อง และมี series ที่ visible ใน legend
     * ควรได้ LegendItem กลับมาตามจำนวน series
     *
     * แต่ในซอร์สปัจจุบันมีเงื่อนไข:
     *     if (dataset != null) { return result; }
     * ซึ่งดูเหมือนกลับข้างจาก "if (dataset == null)" ตาม intent เดิม
     * ทำให้เมธอดคืนค่า EMPTY เสมอเมื่อ dataset ไม่เป็น null (กรณีใช้งานปกติ)
     *
     * เทสนี้ยึดตาม contract ที่ระบุใน Javadoc จึงคาดหวังผลลัพธ์ที่มี item
     * -> เทสนี้จะ FAIL บนซอร์สที่มีบั๊ก และ PASS หลังแก้ไขเงื่อนไขให้ถูกต้อง
     */
    @Test
    public void testGetLegendItems_ExpectedNonEmptyPerJavadoc() {
        LegendItemCollection items = renderer.getLegendItems();
        assertEquals("ตาม Javadoc ควรมี legend item เท่ากับจำนวน series ที่ visible "
                + "แต่ logic ปัจจุบันดูกลับข้าง (dataset != null) ทำให้ได้ empty เสมอ",
                2, items.getItemCount());
    }

    // ---------- addEntity ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddEntity_NullHotspot_ThreeArgOverloadThrows() {
        EntityCollection entities = new StandardEntityCollection();
        renderer.addEntity(entities, null, dataset, 0, 0, false);
    }

    @Test
    public void testAddEntity_WithExplicitHotspot() {
        EntityCollection entities = new StandardEntityCollection();
        Shape hotspot = new Rectangle2D.Double(10, 10, 5, 5);
        renderer.addEntity(entities, hotspot, dataset, 0, 0, false, 0, 0);
        assertEquals(1, entities.getEntityCount());
    }

    @Test
    public void testAddEntity_NullHotspot_DefaultShape_Vertical() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        EntityCollection entities = new StandardEntityCollection();
        renderer.addEntity(entities, null, dataset, 0, 0, false, 10, 10);
        assertEquals(1, entities.getEntityCount());
    }

    @Test
    public void testAddEntity_NullHotspot_DefaultShape_Horizontal() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        EntityCollection entities = new StandardEntityCollection();
        renderer.addEntity(entities, null, dataset, 0, 0, false, 10, 10);
        assertEquals(1, entities.getEntityCount());
    }

    // ---------- createHotSpotShape ----------

    @Test(expected = RuntimeException.class)
    public void testCreateHotSpotShape_NotImplementedThrows() {
        renderer.createHotSpotShape(g2, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, false, null);
    }

    // ---------- createHotSpotBounds ----------

    @Test
    public void testCreateHotSpotBounds_NullValue_ReturnsNull() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue((Number) null, "S1", "C1");
        Rectangle2D result = renderer.createHotSpotBounds(g2, dataArea, plot,
                domainAxis, rangeAxis, ds, 0, 0, false, null, null);
        assertNull(result);
    }

    @Test
    public void testCreateHotSpotBounds_ValidValue_ReturnsRectangle() {
        Rectangle2D result = renderer.createHotSpotBounds(g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null, null);
        assertNotNull(result);
        assertEquals(4.0, result.getWidth(), 0.0001);
        assertEquals(4.0, result.getHeight(), 0.0001);
    }

    @Test
    public void testCreateHotSpotBounds_ReusesGivenRectangleInstance() {
        Rectangle2D given = new Rectangle2D.Double();
        Rectangle2D result = renderer.createHotSpotBounds(g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null, given);
        assertSame(given, result);
    }

    // ---------- hitTest ----------

    @Test
    public void testHitTest_BoundsNull_ReturnsFalse() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue((Number) null, "S1", "C1");
        boolean hit = renderer.hitTest(0, 0, g2, dataArea, plot, domainAxis,
                rangeAxis, ds, 0, 0, false, null);
        assertFalse(hit);
    }

    @Test
    public void testHitTest_InsideBounds_ReturnsTrue() {
        Rectangle2D bounds = renderer.createHotSpotBounds(g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null, null);
        double cx = bounds.getCenterX();
        double cy = bounds.getCenterY();
        boolean hit = renderer.hitTest(cx, cy, g2, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, false, null);
        assertTrue(hit);
    }

    @Test
    public void testHitTest_OutsideBounds_ReturnsFalse() {
        boolean hit = renderer.hitTest(-1000, -1000, g2, dataArea, plot,
                domainAxis, rangeAxis, dataset, 0, 0, false, null);
        assertFalse(hit);
    }

    // ---------- calculateDomainMarkerTextAnchorPoint / RangeMarker ----------

    @Test
    public void testCalculateDomainMarkerTextAnchorPoint_Horizontal() {
        Rectangle2D markerArea = new Rectangle2D.Double(10, 10, 50, 50);
        Point2D p = renderer.calculateDomainMarkerTextAnchorPoint(g2,
                PlotOrientation.HORIZONTAL, dataArea, markerArea,
                new RectangleInsets(1, 1, 1, 1), LengthAdjustmentType.EXPAND,
                RectangleAnchor.CENTER);
        assertNotNull(p);
    }

    @Test
    public void testCalculateDomainMarkerTextAnchorPoint_Vertical() {
        Rectangle2D markerArea = new Rectangle2D.Double(10, 10, 50, 50);
        Point2D p = renderer.calculateDomainMarkerTextAnchorPoint(g2,
                PlotOrientation.VERTICAL, dataArea, markerArea,
                new RectangleInsets(1, 1, 1, 1), LengthAdjustmentType.EXPAND,
                RectangleAnchor.CENTER);
        assertNotNull(p);
    }

    @Test
    public void testCalculateRangeMarkerTextAnchorPoint_Horizontal() {
        Rectangle2D markerArea = new Rectangle2D.Double(10, 10, 50, 50);
        Point2D p = renderer.calculateRangeMarkerTextAnchorPoint(g2,
                PlotOrientation.HORIZONTAL, dataArea, markerArea,
                new RectangleInsets(1, 1, 1, 1), LengthAdjustmentType.EXPAND,
                RectangleAnchor.CENTER);
        assertNotNull(p);
    }

    @Test
    public void testCalculateRangeMarkerTextAnchorPoint_Vertical() {
        Rectangle2D markerArea = new Rectangle2D.Double(10, 10, 50, 50);
        Point2D p = renderer.calculateRangeMarkerTextAnchorPoint(g2,
                PlotOrientation.VERTICAL, dataArea, markerArea,
                new RectangleInsets(1, 1, 1, 1), LengthAdjustmentType.EXPAND,
                RectangleAnchor.CENTER);
        assertNotNull(p);
    }
}
```

## สรุป Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultState`, `testSetPlotNullThrows/Valid` | default state, `setPlot` null-check if/throw |
| `testItemLabelGenerator_*`, `testGetSeriesItemLabelGenerator_*` | `getItemLabelGenerator` if generator==null→base fallback, ทั้ง 2 กรณี |
| `testSetSeriesItemLabelGenerator_Notify*`, `testSetBaseItemLabelGenerator_*` | `notify` true/false branch |
| `testToolTipGenerator_*`, `testSetSeries/BaseToolTipGenerator_Notify` | fallback logic + notify branch ของ tooltip |
| `testURLGenerator_*`, `testSetSeries/BaseURLGenerator_Notify` | fallback logic + notify branch ของ URL |
| `testAddAnnotationNullThrows/Foreground/Background`, `testDrawAnnotations_*` | `addAnnotation` if null throw, if FOREGROUND, else if BACKGROUND, `drawAnnotations` iterator ทั้งสอง layer |
| `testRemoveAnnotation_*`, `testRemoveAnnotations_ClearsBoth` | logic ของ `&` ใน removeAnnotation, remove ทั้ง 2 list |
| `testSetLegendItemLabelGeneratorNullThrows/Valid`, `testLegendItem*ToolTip/URLGenerator_NullPermitted` | null-check throw vs null-permitted branch |
| `testInitialise_*`, `testCreateState_*` | dataset null/non-null branch, PlotRenderingInfo owner null branch, loop `isSeriesVisible` all/some/zero |
| `testFindRangeBounds_*` | dataset null, `getDataBoundsIncludesVisibleSeriesOnly` true/false |
| `testGetItemMiddle` | delegation call ปกติ |
| `testDrawBackground/Outline_NoException` | delegate ไปยัง plot |
| `testDrawDomainLine_*` | null paint/stroke throw, HORIZONTAL/VERTICAL branch |
| `testDrawRangeLine_*` | range.contains false (early return), HORIZONTAL/VERTICAL branch |
| `testDrawDomainMarker_*` | columnIndex<0 early return, drawAsLine true/false, orientation, label null/non-null |
| `testDrawRangeMarker_ValueMarker_*` / `IntervalMarker_*` | instanceof ValueMarker/IntervalMarker, range contains/intersects false, orientation, GradientPaint, outlinePaint/Stroke null/non-null, label null/non-null |
| `testGetLegendItem_*` | plot null, series visible/visible-in-legend false, tooltip/URL generator null/non-null |
| `testEquals_*`, `testHashCode_NoException` | equals same-ref, null, wrong type, equal fields, unequal field |
| `testGetDrawingSupplier_*` | plot null/non-null |
| `testUpdateCrosshairValues_*` | orientation null throw, crosshairState null no-op, isRangeCrosshairLockedOnData true/false |
| `testDrawItemLabel_*` | generator null, negative true/false branch |
| `testClone_*` | clone สำเร็จ, CloneNotSupportedException 3 กรณี (item label/tooltip/URL generator ไม่ cloneable) |
| `testGetDomainAxis`, `testGetRangeAxis_ByIndex` | delegation to plot |
| `testGetLegendItems_PlotNull_ReturnsEmpty`, **`testGetLegendItems_ExpectedNonEmptyPerJavadoc`** | plot null branch, **FAULT-EXPOSING: เงื่อนไข `dataset != null` ที่กลับข้าง (Chart-1b defect)** |
| `testAddEntity_*` | hotspot null throw (overload 6-args), hotspot null orientation VERTICAL/HORIZONTAL, hotspot ระบุมาแล้ว |
| `testCreateHotSpotShape_NotImplementedThrows` | RuntimeException เสมอ |
| `testCreateHotSpotBounds_*` | value null→return null, ค่าปกติ, result reuse |
| `testHitTest_*` | bounds null→false, inside/outside bounds |
| `testCalculate*MarkerTextAnchorPoint_*` | orientation HORIZONTAL/VERTICAL ทั้งสอง private helper |

**หมายเหตุจุดที่ไม่สามารถทดสอบได้/ข้ามไปเพราะข้อจำกัดของซอร์สที่ให้มา (ตามข้อกำหนดที่ 4):**
- `addAnnotation`/`drawAnnotations` branch "unknown layer → RuntimeException" ข้ามไป เพราะ `Layer` เป็นคลาสที่มีเพียง `FOREGROUND`/`BACKGROUND` เป็น instance ที่สร้างได้ตามปกติ
- `initialise()` กรณี `dataset instanceof SelectableCategoryDataset` และ `RenderingSource` ข้ามไป เพราะต้องพึ่งพา mock/interface ที่ไม่ปรากฏรายละเอียดในซอร์สที่ให้มา
- สมมติฐานเรื่อง API ที่ไม่ปรากฏในซอร์ส (`addChangeListener`, `setSeriesVisible`, `setDataBoundsIncludesVisibleSeriesOnly`, `setRangeCrosshairLockedOnData`, `CategoryCrosshairState()`) ถูกกำกับด้วยคอมเมนต์ในโค้ดทุกจุด
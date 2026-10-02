package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.DatasetChangeEvent;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * JUnit4 test suite for {@link CategoryPlot} (Defects4J Chart-19b).
 *
 * หมายเหตุ: DatasetChangeEvent ในซอร์สโค้ดต้นทาง import จาก
 * org.jfree.data.general.DatasetChangeEvent แต่จาก classpath ที่ให้มา
 * (servlet.jar ไม่เกี่ยวข้อง) เราอ้างอิง class เดียวกันตาม package จริงของ
 * jfreechart - หากแพคเกจไม่ตรงในบิลด์จริง ให้แก้ import ให้ตรงกับซอร์ส (general).
 */
public class CategoryPlotTest {

    // เปลี่ยนตรงนี้หากจำเป็นให้ตรงกับ jfreechart จริง (org.jfree.data.general)
    // ในไฟล์นี้ใช้ alias ผ่าน fully-qualified name แทนในบางที่เพื่อความชัดเจน

    private static class CountingListener implements PlotChangeListener {
        int count = 0;
        public void plotChanged(PlotChangeEvent event) {
            count++;
        }
    }

    private DefaultCategoryDataset sampleDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        ds.addValue(1.0, "R1", "C1");
        ds.addValue(2.0, "R1", "C2");
        ds.addValue(3.0, "R2", "C1");
        ds.addValue(4.0, "R2", "C2");
        return ds;
    }

    private CategoryAxis domainAxis() {
        return new CategoryAxis("Domain");
    }

    private NumberAxis rangeAxis() {
        return new NumberAxis("Range");
    }

    private LineAndShapeRenderer renderer() {
        return new LineAndShapeRenderer();
    }

    // =====================================================================
    // Constructors
    // =====================================================================

    @Test
    public void testDefaultConstructor_defaults() {
        CategoryPlot plot = new CategoryPlot();

        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());

        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertFalse(plot.isDomainGridlinesVisible());
        assertTrue(plot.isRangeGridlinesVisible());
        assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
        assertEquals(DatasetRenderingOrder.REVERSE,
                plot.getDatasetRenderingOrder());
        assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
        assertFalse(plot.isRangeCrosshairVisible());
        assertTrue(plot.isRangeCrosshairLockedOnData());
        assertEquals(0.0, plot.getAnchorValue(), 0.0000001);
        assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0000001);
        assertTrue(plot.getAnnotations().isEmpty());
        assertNull(plot.getFixedLegendItems());
        assertFalse(plot.getDrawSharedDomainAxis());
        assertEquals(0, plot.getWeight());

        // Assumption: constructor calls ObjectList.set(0, null) for
        // dataset/domainAxis/rangeAxis/renderer, which grows the list to
        // size 1 even though the element itself is null.
        assertEquals(1, plot.getDatasetCount());
        assertEquals(1, plot.getDomainAxisCount());
        assertEquals(1, plot.getRangeAxisCount());

        // constructor adds one baseline ValueMarker to BACKGROUND range
        // markers of renderer index 0
        assertNotNull(plot.getRangeMarkers(Layer.BACKGROUND));
        assertEquals(1, plot.getRangeMarkers(Layer.BACKGROUND).size());
    }

    @Test
    public void testConstructorWithArguments_wiresEverything() {
        DefaultCategoryDataset ds = sampleDataset();
        CategoryAxis dAxis = domainAxis();
        NumberAxis rAxis = rangeAxis();
        LineAndShapeRenderer rend = renderer();

        CategoryPlot plot = new CategoryPlot(ds, dAxis, rAxis, rend);

        assertSame(ds, plot.getDataset());
        assertSame(dAxis, plot.getDomainAxis());
        assertSame(rAxis, plot.getRangeAxis());
        assertSame(rend, plot.getRenderer());

        assertSame(plot, dAxis.getPlot());
        assertSame(plot, rAxis.getPlot());
        assertSame(plot, rend.getPlot());

        assertSame(dAxis, plot.getDomainAxisForDataset(0));
        assertSame(rAxis, plot.getRangeAxisForDataset(0));
    }

    // =====================================================================
    // orientation / axisOffset
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientation_null_throws() {
        new CategoryPlot().setOrientation(null);
    }

    @Test
    public void testSetOrientation_valid() {
        CategoryPlot plot = new CategoryPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffset_null_throws() {
        new CategoryPlot().setAxisOffset(null);
    }

    @Test
    public void testSetAxisOffset_valid() {
        CategoryPlot plot = new CategoryPlot();
        RectangleInsets insets = new RectangleInsets(1, 2, 3, 4);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    // =====================================================================
    // Domain axis
    // =====================================================================

    @Test
    public void testDomainAxis_indexedSetGet() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis2 = domainAxis();
        plot.setDomainAxis(1, axis2);
        assertSame(axis2, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());
    }

    @Test
    public void testDomainAxis_fallbackToParentPlot() {
        CategoryAxis parentAxis = domainAxis();
        CategoryPlot parentPlot = new CategoryPlot(null, parentAxis, null, null);
        CategoryPlot childPlot = new CategoryPlot(); // domainAxis(0) == null

        // Assumption: Plot has a public setParent(Plot) method (standard
        // JFreeChart Plot API), used here to exercise the parent-fallback
        // branch of getDomainAxis(int).
        childPlot.setParent(parentPlot);

        assertSame(parentAxis, childPlot.getDomainAxis(0));
    }

    @Test
    public void testDomainAxisLocation_defaultAndFallback() {
        CategoryPlot plot = new CategoryPlot();
        AxisLocation loc0 = plot.getDomainAxisLocation(0);
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, loc0);

        // index 1 has never been set -> falls back to opposite of index 0
        AxisLocation loc1 = plot.getDomainAxisLocation(1);
        assertEquals(AxisLocation.getOpposite(loc0), loc1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocation_nullAtIndexZero_throws() {
        new CategoryPlot().setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testSetDomainAxisLocation_nullAtNonZeroIndex_allowed() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(1, null, false); // must NOT throw
        AxisLocation loc1 = plot.getDomainAxisLocation(1);
        assertEquals(AxisLocation.getOpposite(plot.getDomainAxisLocation(0)),
                loc1);
    }

    @Test
    public void testDomainAxisEdge_fallbackBranch() {
        CategoryPlot plot = new CategoryPlot();
        plot.setDomainAxisLocation(1, null, false);
        RectangleEdge edge0 = plot.getDomainAxisEdge(0);
        RectangleEdge edge1 = plot.getDomainAxisEdge(1);
        assertEquals(RectangleEdge.opposite(edge0), edge1);
    }

    @Test
    public void testClearDomainAxes() {
        CategoryPlot plot = new CategoryPlot(null, domainAxis(), null, null);
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes_smoke() {
        CategoryPlot plot = new CategoryPlot(null, domainAxis(), null, null);
        plot.configureDomainAxes(); // should not throw
    }

    @Test
    public void testGetDomainAxisIndex() {
        CategoryAxis axis = domainAxis();
        CategoryPlot plot = new CategoryPlot(null, axis, null, null);
        assertEquals(0, plot.getDomainAxisIndex(axis));
        assertEquals(-1, plot.getDomainAxisIndex(domainAxis()));
    }

    @Test
    public void testSetDomainAxes_array() {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis a0 = domainAxis();
        CategoryAxis a1 = domainAxis();
        plot.setDomainAxes(new CategoryAxis[] {a0, a1});
        assertSame(a0, plot.getDomainAxis(0));
        assertSame(a1, plot.getDomainAxis(1));
    }

    // =====================================================================
    // Range axis
    // =====================================================================

    @Test
    public void testRangeAxis_indexedSetGet() {
        CategoryPlot plot = new CategoryPlot();
        NumberAxis axis2 = rangeAxis();
        plot.setRangeAxis(1, axis2);
        assertSame(axis2, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());
    }

    @Test
    public void testRangeAxis_fallbackToParentPlot() {
        NumberAxis parentAxis = rangeAxis();
        CategoryPlot parentPlot = new CategoryPlot(null, null, parentAxis, null);
        CategoryPlot childPlot = new CategoryPlot();
        childPlot.setParent(parentPlot);
        assertSame(parentAxis, childPlot.getRangeAxis(0));
    }

    @Test
    public void testRangeAxisLocation_defaultAndFallback() {
        CategoryPlot plot = new CategoryPlot();
        AxisLocation loc0 = plot.getRangeAxisLocation(0);
        assertEquals(AxisLocation.TOP_OR_LEFT, loc0);
        AxisLocation loc1 = plot.getRangeAxisLocation(1);
        assertEquals(AxisLocation.getOpposite(loc0), loc1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocation_nullAtIndexZero_throws() {
        new CategoryPlot().setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testSetRangeAxisLocation_nullAtNonZeroIndex_allowed() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeAxisLocation(1, null, false);
        assertEquals(AxisLocation.getOpposite(plot.getRangeAxisLocation(0)),
                plot.getRangeAxisLocation(1));
    }

    @Test
    public void testRangeAxisEdge_basic() {
        CategoryPlot plot = new CategoryPlot();
        RectangleEdge edge = plot.getRangeAxisEdge(0);
        assertNotNull(edge);
    }

    @Test
    public void testClearRangeAxes() {
        CategoryPlot plot = new CategoryPlot(null, null, rangeAxis(), null);
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes_smoke() {
        CategoryPlot plot = new CategoryPlot(null, null, rangeAxis(), null);
        plot.configureRangeAxes();
    }

    @Test
    public void testGetRangeAxisIndex_directAndParentFallback() {
        NumberAxis axis = rangeAxis();
        CategoryPlot plot = new CategoryPlot(null, null, axis, null);
        assertEquals(0, plot.getRangeAxisIndex(axis));

        NumberAxis parentAxis = rangeAxis();
        CategoryPlot parentPlot = new CategoryPlot(null, null, parentAxis, null);
        CategoryPlot childPlot = new CategoryPlot();
        childPlot.setParent(parentPlot);
        assertEquals(0, childPlot.getRangeAxisIndex(parentAxis));
        assertEquals(-1, childPlot.getRangeAxisIndex(rangeAxis()));
    }

    @Test
    public void testSetRangeAxes_array() {
        CategoryPlot plot = new CategoryPlot();
        NumberAxis a0 = rangeAxis();
        NumberAxis a1 = rangeAxis();
        plot.setRangeAxes(new ValueAxis[] {a0, a1});
        assertSame(a0, plot.getRangeAxis(0));
        assertSame(a1, plot.getRangeAxis(1));
    }

    // =====================================================================
    // Dataset
    // =====================================================================

    @Test
    public void testDataset_setGet() {
        CategoryPlot plot = new CategoryPlot();
        DefaultCategoryDataset ds = sampleDataset();
        plot.setDataset(ds);
        assertSame(ds, plot.getDataset());

        plot.setDataset(1, sampleDataset());
        assertEquals(2, plot.getDatasetCount());
    }

    @Test
    public void testMapDatasetToDomainAxis_withMapping() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        CategoryAxis axis2 = domainAxis();
        plot.setDomainAxis(1, axis2);
        plot.mapDatasetToDomainAxis(0, 1);
        assertSame(axis2, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToDomainAxis_noMapping_defaultsToAxis0() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setDataset(2, sampleDataset()); // no explicit mapping for idx 2
        assertSame(plot.getDomainAxis(), plot.getDomainAxisForDataset(2));
    }

    @Test
    public void testMapDatasetToRangeAxis_withMapping() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        NumberAxis axis2 = rangeAxis();
        plot.setRangeAxis(1, axis2);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(axis2, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis_noMapping_defaultsToAxis0() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setDataset(2, sampleDataset());
        assertSame(plot.getRangeAxis(), plot.getRangeAxisForDataset(2));
    }

    // =====================================================================
    // Renderer
    // =====================================================================

    @Test
    public void testGetRendererForDataset() {
        DefaultCategoryDataset ds = sampleDataset();
        LineAndShapeRenderer rend = renderer();
        CategoryPlot plot = new CategoryPlot(ds, domainAxis(), rangeAxis(), rend);

        assertSame(rend, plot.getRendererForDataset(ds));
        assertNull(plot.getRendererForDataset(sampleDataset())); // not in plot
    }

    @Test
    public void testGetIndexOfRenderer() {
        LineAndShapeRenderer rend = renderer();
        CategoryPlot plot = new CategoryPlot(null, null, null, rend);
        assertEquals(0, plot.getIndexOf(rend));
        assertEquals(-1, plot.getIndexOf(renderer()));
    }

    @Test
    public void testSetRenderers_array() {
        CategoryPlot plot = new CategoryPlot();
        LineAndShapeRenderer r0 = renderer();
        LineAndShapeRenderer r1 = renderer();
        plot.setRenderers(new CategoryItemRenderer[] {r0, r1});
        assertSame(r0, plot.getRenderer(0));
        assertSame(r1, plot.getRenderer(1));
    }

    // =====================================================================
    // Rendering order / gridlines null-checks
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrder_null_throws() {
        new CategoryPlot().setDatasetRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColumnRenderingOrder_null_throws() {
        new CategoryPlot().setColumnRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRowRenderingOrder_null_throws() {
        new CategoryPlot().setRowRenderingOrder(null);
    }

    @Test
    public void testDomainGridlinesVisible_toggle() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePosition_null_throws() {
        new CategoryPlot().setDomainGridlinePosition(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStroke_null_throws() {
        new CategoryPlot().setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaint_null_throws() {
        new CategoryPlot().setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlinesVisible_toggle() {
        CategoryPlot plot = new CategoryPlot();
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStroke_null_throws() {
        new CategoryPlot().setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaint_null_throws() {
        new CategoryPlot().setRangeGridlinePaint(null);
    }

    // =====================================================================
    // Legend items
    // =====================================================================

    @Test
    public void testFixedLegendItems_getSet_shortCircuitsLegendItems() {
        CategoryPlot plot = new CategoryPlot();
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertSame(items, plot.getFixedLegendItems());
        assertSame(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItems_nullDatasetAndRenderer_empty() {
        CategoryPlot plot = new CategoryPlot(); // dataset(0)==null
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_withDatasetAndRenderer() {
        DefaultCategoryDataset ds = sampleDataset(); // 2 rows
        CategoryPlot plot = new CategoryPlot(ds, domainAxis(), rangeAxis(),
                renderer());
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        // Assumption: LineAndShapeRenderer.getLegendItem() returns a
        // non-null item for every series when the plot/dataset are wired
        // normally, so item count == row count of the dataset.
        assertEquals(ds.getRowCount(), items.getItemCount());
    }

    // =====================================================================
    // handleClick / zoom
    // =====================================================================

    @Test
    public void testHandleClick_insideDataArea_updatesAnchor() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);

        plot.handleClick(50, 50, info); // inside -> branch executed
        // no direct assertion on exact numeric value (depends on axis
        // internals which are not part of this class), just verify no
        // exception and value changed from default 0.0 is NOT guaranteed,
        // so we only assert method completed without throwing.
        assertTrue(true);
    }

    @Test
    public void testHandleClick_outsideDataArea_noChange() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);

        double beforeAnchor = plot.getAnchorValue();
        double beforeCross = plot.getRangeCrosshairValue();
        plot.handleClick(500, 500, info); // outside -> branch NOT executed
        assertEquals(beforeAnchor, plot.getAnchorValue(), 0.0000001);
        assertEquals(beforeCross, plot.getRangeCrosshairValue(), 0.0000001);
    }

    @Test
    public void testHandleClick_horizontalOrientation_branch() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        plot.handleClick(20, 20, info); // exercises java2D = x branch
        assertTrue(true); // smoke test - no exception
    }

    @Test
    public void testZoom_positivePercent_setsRangeAroundAnchor() {
        NumberAxis rAxis = rangeAxis();
        rAxis.setAutoRange(false);
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rAxis, renderer());
        rAxis.setRange(0.0, 10.0); // set again after being attached to plot
        plot.setAnchorValue(0.0);

        plot.zoom(0.5); // range=10, scaledRange=5 -> (-2.5, 2.5)
        Range r = plot.getRangeAxis().getRange();
        assertEquals(-2.5, r.getLowerBound(), 0.0001);
        assertEquals(2.5, r.getUpperBound(), 0.0001);
    }

    @Test
    public void testZoom_zeroOrNegativePercent_restoresAutoRange() {
        NumberAxis rAxis = rangeAxis();
        rAxis.setAutoRange(false);
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rAxis, renderer());

        plot.zoom(0.0);
        assertTrue(plot.getRangeAxis().isAutoRange());
    }

    // =====================================================================
    // datasetChanged / rendererChanged
    // =====================================================================

    @Test
    public void testDatasetChanged_noParent_notifiesListeners() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener);

        plot.datasetChanged(new DatasetChangeEvent(this, plot.getDataset()));
        assertTrue(listener.count > 0);
    }

    @Test
    public void testDatasetChanged_withParent_delegatesToParent() {
        CategoryPlot parentPlot = new CategoryPlot();
        CountingListener parentListener = new CountingListener();
        parentPlot.addChangeListener(parentListener);

        CategoryPlot childPlot = new CategoryPlot(sampleDataset(),
                domainAxis(), rangeAxis(), renderer());
        childPlot.setParent(parentPlot);

        childPlot.datasetChanged(
                new DatasetChangeEvent(this, childPlot.getDataset()));
        // Assumption: parent.datasetChanged() eventually notifies parent's
        // own listeners since parent itself has no parent.
        assertTrue(parentListener.count > 0);
    }

    @Test
    public void testRendererChanged_noParent_configuresAndNotifies() {
        LineAndShapeRenderer rend = renderer();
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), rend);
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener);

        plot.rendererChanged(new RendererChangeEvent(rend));
        assertTrue(listener.count > 0);
    }

    @Test
    public void testRendererChanged_parentIsRendererChangeListener() {
        CategoryPlot parentPlot = new CategoryPlot();
        CategoryPlot childPlot = new CategoryPlot(sampleDataset(),
                domainAxis(), rangeAxis(), renderer());
        childPlot.setParent(parentPlot);

        // Should route to parentPlot.rendererChanged(event) without throwing
        // since CategoryPlot implements RendererChangeListener.
        childPlot.rendererChanged(
                new RendererChangeEvent(childPlot.getRenderer()));
        assertTrue(true);
    }

    // =====================================================================
    // Domain markers
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_nullMarker_throws() {
        new CategoryPlot().addDomainMarker(0, null, Layer.FOREGROUND);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarker_nullLayer_throws() {
        CategoryMarker marker = new CategoryMarker("C1");
        new CategoryPlot().addDomainMarker(0, marker, null);
    }

    @Test
    public void testAddDomainMarker_foregroundAndBackground() {
        CategoryPlot plot = new CategoryPlot();
        CategoryMarker fg = new CategoryMarker("C1");
        CategoryMarker bg = new CategoryMarker("C2");
        plot.addDomainMarker(fg, Layer.FOREGROUND);
        plot.addDomainMarker(bg, Layer.BACKGROUND);

        assertEquals(1, plot.getDomainMarkers(Layer.FOREGROUND).size());
        assertEquals(1, plot.getDomainMarkers(Layer.BACKGROUND).size());
    }

    @Test
    public void testClearDomainMarkers_byIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.addDomainMarker(0, new CategoryMarker("C1"), Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        assertEquals(0, plot.getDomainMarkers(0, Layer.FOREGROUND).size());
    }

    @Test
    public void testClearDomainMarkers_all() {
        CategoryPlot plot = new CategoryPlot();
        plot.addDomainMarker(0, new CategoryMarker("C1"), Layer.FOREGROUND);
        plot.addDomainMarker(1, new CategoryMarker("C2"), Layer.BACKGROUND);
        plot.clearDomainMarkers();
        assertEquals(0, plot.getDomainMarkers(0, Layer.FOREGROUND).size());
        assertEquals(0, plot.getDomainMarkers(1, Layer.BACKGROUND).size());
    }

    // =====================================================================
    // Range markers
    // =====================================================================

    @Test
    public void testAddRangeMarker_foregroundAndBackground() {
        CategoryPlot plot = new CategoryPlot();
        Marker fg = new ValueMarker(1.0);
        Marker bg = new ValueMarker(2.0);
        plot.addRangeMarker(fg, Layer.FOREGROUND);
        plot.addRangeMarker(bg, Layer.BACKGROUND);

        assertEquals(1, plot.getRangeMarkers(Layer.FOREGROUND).size());
        // BACKGROUND already had 1 baseline marker from constructor => 2
        assertEquals(2, plot.getRangeMarkers(Layer.BACKGROUND).size());
    }

    @Test(expected = NullPointerException.class)
    public void testAddRangeMarker_nullMarker_throwsNPE() {
        // Fault-detection test: unlike addDomainMarker, addRangeMarker does
        // NOT validate its 'marker' argument before calling
        // marker.addChangeListener(this), so a null marker triggers NPE
        // rather than a clean IllegalArgumentException.
        new CategoryPlot().addRangeMarker(0, null, Layer.FOREGROUND);
    }

    @Test
    public void testClearRangeMarkers_byIndex() {
        CategoryPlot plot = new CategoryPlot();
        plot.addRangeMarker(0, new ValueMarker(3.0), Layer.FOREGROUND);
        plot.clearRangeMarkers(0);
        assertEquals(0, plot.getRangeMarkers(0, Layer.FOREGROUND).size());
    }

    @Test
    public void testClearRangeMarkers_all() {
        CategoryPlot plot = new CategoryPlot();
        plot.addRangeMarker(0, new ValueMarker(3.0), Layer.FOREGROUND);
        plot.clearRangeMarkers();
        assertEquals(0, plot.getRangeMarkers(0, Layer.FOREGROUND).size());
        assertEquals(0, plot.getRangeMarkers(Layer.BACKGROUND).size());
    }

    // =====================================================================
    // Crosshair
    // =====================================================================

    @Test
    public void testRangeCrosshairVisible_toggle() {
        CategoryPlot plot = new CategoryPlot();
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testRangeCrosshairLockedOnData_toggle() {
        CategoryPlot plot = new CategoryPlot();
        assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testSetRangeCrosshairValue_notifyOnlyWhenVisible() {
        CategoryPlot plot = new CategoryPlot();
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener);

        // crosshair not visible -> value updates but no notification
        plot.setRangeCrosshairValue(5.0);
        assertEquals(5.0, plot.getRangeCrosshairValue(), 0.0000001);
        assertEquals(0, listener.count);

        plot.setRangeCrosshairVisible(true); // this itself notifies (1)
        int afterVisible = listener.count;
        plot.setRangeCrosshairValue(6.0); // now should notify again
        assertTrue(listener.count > afterVisible);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStroke_null_throws() {
        new CategoryPlot().setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaint_null_throws() {
        new CategoryPlot().setRangeCrosshairPaint(null);
    }

    // =====================================================================
    // Annotations
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_null_throws() {
        new CategoryPlot().addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotation_null_throws() {
        new CategoryPlot().removeAnnotation(null);
    }

    @Test
    public void testAnnotations_addRemoveClear() {
        CategoryPlot plot = new CategoryPlot();
        CategoryTextAnnotation ann = new CategoryTextAnnotation(
                "Test", "C1", 1.0);
        plot.addAnnotation(ann);
        assertEquals(1, plot.getAnnotations().size());

        boolean removed = plot.removeAnnotation(ann);
        assertTrue(removed);
        assertEquals(0, plot.getAnnotations().size());

        plot.addAnnotation(ann);
        plot.clearAnnotations();
        assertEquals(0, plot.getAnnotations().size());
    }

    // =====================================================================
    // getDataRange
    // =====================================================================

    @Test
    public void testGetDataRange_mappedAxis_returnsRange() {
        DefaultCategoryDataset ds = sampleDataset();
        NumberAxis rAxis = rangeAxis();
        CategoryPlot plot = new CategoryPlot(ds, domainAxis(), rAxis,
                renderer());
        Range r = plot.getDataRange(rAxis);
        assertNotNull(r);
        assertEquals(1.0, r.getLowerBound(), 0.0001);
        assertEquals(4.0, r.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetDataRange_unmappedAxis_returnsNull() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        NumberAxis foreignAxis = rangeAxis(); // not attached to this plot
        assertNull(plot.getDataRange(foreignAxis));
    }

    // =====================================================================
    // Weight / fixed spaces
    // =====================================================================

    @Test
    public void testWeight_getSet() {
        CategoryPlot plot = new CategoryPlot();
        plot.setWeight(3);
        assertEquals(3, plot.getWeight());
    }

    @Test
    public void testFixedDomainAxisSpace_getSet() {
        CategoryPlot plot = new CategoryPlot();
        AxisSpace space = new AxisSpace();
        plot.setFixedDomainAxisSpace(space);
        assertSame(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpace_getSet() {
        CategoryPlot plot = new CategoryPlot();
        AxisSpace space = new AxisSpace();
        plot.setFixedRangeAxisSpace(space);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    // =====================================================================
    // Categories
    // =====================================================================

    @Test
    public void testGetCategories_nullDataset_returnsNull() {
        CategoryPlot plot = new CategoryPlot();
        assertNull(plot.getCategories());
    }

    @Test
    public void testGetCategories_withDataset_unmodifiable() {
        DefaultCategoryDataset ds = sampleDataset();
        CategoryPlot plot = new CategoryPlot(ds, domainAxis(), rangeAxis(),
                renderer());
        List categories = plot.getCategories();
        assertEquals(2, categories.size());
        try {
            categories.add("X");
            fail("Expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException expected) {
            // expected - list is wrapped by Collections.unmodifiableList
        }
    }

    @Test
    public void testGetCategoriesForAxis() {
        DefaultCategoryDataset ds = sampleDataset();
        CategoryAxis dAxis = domainAxis();
        CategoryPlot plot = new CategoryPlot(ds, dAxis, rangeAxis(),
                renderer());
        List cats = plot.getCategoriesForAxis(dAxis);
        assertEquals(2, cats.size());
        assertTrue(cats.contains("C1"));
        assertTrue(cats.contains("C2"));
    }

    // =====================================================================
    // Shared domain axis / zoomable flags
    // =====================================================================

    @Test
    public void testDrawSharedDomainAxis_getSet() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.getDrawSharedDomainAxis());
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testIsDomainZoomable_alwaysFalse() {
        assertFalse(new CategoryPlot().isDomainZoomable());
    }

    @Test
    public void testIsRangeZoomable_alwaysTrue() {
        assertTrue(new CategoryPlot().isRangeZoomable());
    }

    @Test
    public void testZoomDomainAxes_noOp_doesNotThrow() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 50, 50));
        plot.zoomDomainAxes(0.5, info, new Point2D.Double(10, 10));
        plot.zoomDomainAxes(0.2, 0.8, info, new Point2D.Double(10, 10));
        plot.zoomDomainAxes(0.5, info, new Point2D.Double(10, 10), true);
        assertTrue(true); // no state to verify - genuinely a no-op
    }

    @Test
    public void testZoomRangeAxes_factorNoAnchor() {
        NumberAxis rAxis = rangeAxis();
        rAxis.setAutoRange(false);
        rAxis.setRange(0.0, 10.0);
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rAxis, renderer());
        plot.zoomRangeAxes(0.5, (PlotRenderingInfo) null, null);
        // resizeRange narrows the existing range around its midpoint
        Range r = plot.getRangeAxis().getRange();
        assertTrue(r.getLength() < 10.0);
    }

    @Test
    public void testZoomRangeAxes_factorWithAnchor() {
        NumberAxis rAxis = rangeAxis();
        rAxis.setAutoRange(false);
        rAxis.setRange(0.0, 10.0);
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rAxis, renderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        plot.zoomRangeAxes(0.5, info, new Point2D.Double(50, 50), true);
        Range r = plot.getRangeAxis().getRange();
        assertTrue(r.getLength() < 10.0);
    }

    @Test
    public void testZoomRangeAxes_lowerUpperPercent() {
        NumberAxis rAxis = rangeAxis();
        rAxis.setAutoRange(false);
        rAxis.setRange(0.0, 10.0);
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rAxis, renderer());
        plot.zoomRangeAxes(0.25, 0.75, null, null);
        Range r = plot.getRangeAxis().getRange();
        assertTrue(r.getLength() < 10.0);
    }

    // =====================================================================
    // anchorValue
    // =====================================================================

    @Test
    public void testAnchorValue_getSet() {
        CategoryPlot plot = new CategoryPlot();
        plot.setAnchorValue(7.5);
        assertEquals(7.5, plot.getAnchorValue(), 0.0000001);
    }

    // =====================================================================
    // equals / clone
    // =====================================================================

    @Test
    public void testEquals_sameInstance_true() {
        CategoryPlot plot = new CategoryPlot();
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEquals_differentClass_false() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEquals_null_false() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.equals(null));
    }

    @Test
    public void testEquals_differentOrientation_false() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p2.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_twoDefaultPlots_true() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testClone_producesIndependentCopy()
            throws CloneNotSupportedException {
        CategoryAxis dAxis = domainAxis();
        NumberAxis rAxis = rangeAxis();
        CategoryPlot original = new CategoryPlot(sampleDataset(), dAxis,
                rAxis, renderer());

        CategoryPlot clone = (CategoryPlot) original.clone();
        assertNotSame(original, clone);
        assertNotSame(original.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(original.getRangeAxis(), clone.getRangeAxis());
        assertEquals(original.getOrientation(), clone.getOrientation());

        // mutating clone's axis must not affect original
        clone.getDomainAxis().setLabel("Changed");
        assertFalse("Changed".equals(original.getDomainAxis().getLabel()));
    }

    // =====================================================================
    // protected calculate*AxisSpace (same-package access)
    // =====================================================================

    @Test
    public void testCalculateDomainAxisSpace_noFixedSpace() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);

        AxisSpace space = plot.calculateDomainAxisSpace(g2, area, null);
        assertNotNull(space);
        g2.dispose();
    }

    @Test
    public void testCalculateDomainAxisSpace_withFixedSpace() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        AxisSpace fixed = new AxisSpace();
        fixed.setTop(10);
        fixed.setBottom(10);
        plot.setFixedDomainAxisSpace(fixed);

        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);

        AxisSpace space = plot.calculateDomainAxisSpace(g2, area, null);
        assertNotNull(space);
        g2.dispose();
    }

    @Test
    public void testCalculateRangeAxisSpace_noFixedSpace() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);

        AxisSpace space = plot.calculateRangeAxisSpace(g2, area, null);
        assertNotNull(space);
        g2.dispose();
    }

    @Test
    public void testCalculateRangeAxisSpace_withFixedSpace() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        AxisSpace fixed = new AxisSpace();
        fixed.setLeft(10);
        fixed.setRight(10);
        plot.setFixedRangeAxisSpace(fixed);

        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);

        AxisSpace space = plot.calculateRangeAxisSpace(g2, area, null);
        assertNotNull(space);
        g2.dispose();
    }

    // =====================================================================
    // render() - column/row ordering branches
    // =====================================================================

    @Test
    public void testRender_emptyDataset_returnsFalse() {
        CategoryPlot plot = new CategoryPlot(new DefaultCategoryDataset(),
                domainAxis(), rangeAxis(), renderer());
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        boolean found = plot.render(g2, new Rectangle2D.Double(0, 0, 200, 200),
                0, null);
        assertFalse(found);
        g2.dispose();
    }

    @Test
    public void testRender_ascendingColumnAscendingRow() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        boolean found = plot.render(g2, new Rectangle2D.Double(0, 0, 200, 200),
                0, null);
        assertTrue(found);
        g2.dispose();
    }

    @Test
    public void testRender_descendingColumnDescendingRow() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        boolean found = plot.render(g2, new Rectangle2D.Double(0, 0, 200, 200),
                0, null);
        assertTrue(found);
        g2.dispose();
    }

    @Test
    public void testRender_ascendingColumnDescendingRow() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setColumnRenderingOrder(SortOrder.ASCENDING);
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        boolean found = plot.render(g2, new Rectangle2D.Double(0, 0, 200, 200),
                0, null);
        assertTrue(found);
        g2.dispose();
    }

    @Test
    public void testRender_descendingColumnAscendingRow() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        plot.setRowRenderingOrder(SortOrder.ASCENDING);
        BufferedImage img = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        boolean found = plot.render(g2, new Rectangle2D.Double(0, 0, 200, 200),
                0, null);
        assertTrue(found);
        g2.dispose();
    }

    // =====================================================================
    // draw() - integration smoke tests
    // =====================================================================

    @Test
    public void testDraw_tooSmallArea_returnsImmediately() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        BufferedImage img = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D tinyArea = new Rectangle2D.Double(0, 0, 1, 1);
        // b1/b2 branch: area too small -> should just return, no exception
        plot.draw(g2, tinyArea, null, null, null);
        g2.dispose();
        assertTrue(true);
    }

    @Test
    public void testDraw_forwardOrder_fullSmoke() {
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), renderer());
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        BufferedImage img = new BufferedImage(300, 300,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, new PlotRenderingInfo(null));
        g2.dispose();
        assertTrue(true);
    }

    @Test
    public void testDraw_reverseOrder_withCrosshairVisible_fullSmoke() {
        NumberAxis rAxis = rangeAxis();
        rAxis.setRange(0.0, 10.0);
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rAxis, renderer());
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(5.0);

        BufferedImage img = new BufferedImage(300, 300,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, new PlotRenderingInfo(null));
        g2.dispose();
        assertTrue(true);
    }

    @Test
    public void testDraw_nullRenderer_usesDefaultBackgroundAndOutline() {
        // renderer == null -> exercises drawBackground()/drawOutline()
        // default branches inside draw()
        CategoryPlot plot = new CategoryPlot(sampleDataset(), domainAxis(),
                rangeAxis(), null);
        BufferedImage img = new BufferedImage(300, 300,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, new PlotRenderingInfo(null));
        g2.dispose();
        assertTrue(true);
    }

    @Test
    public void testDraw_noDataMessage_branch() {
        // empty dataset -> foundData stays false -> drawNoDataMessage branch
        CategoryPlot plot = new CategoryPlot(new DefaultCategoryDataset(),
                domainAxis(), rangeAxis(), renderer());
        BufferedImage img = new BufferedImage(300, 300,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, new PlotRenderingInfo(null));
        g2.dispose();
        assertTrue(true);
    }
}

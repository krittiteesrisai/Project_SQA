package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class CategoryPlotTest {

    private CategoryPlot plot;

    @Before
    public void setUp() {
        plot = new CategoryPlot();
    }

    // ================= Constructor =================

    @Test
    public void testDefaultConstructor() {
        CategoryPlot p = new CategoryPlot();
        assertNull(p.getDataset());
        assertNull(p.getDomainAxis());
        assertNull(p.getRangeAxis());
        assertNull(p.getRenderer());
        assertEquals(PlotOrientation.VERTICAL, p.getOrientation());
    }

    @Test
    public void testFullConstructor() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryPlot p = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        assertSame(dataset, p.getDataset());
        assertSame(domainAxis, p.getDomainAxis());
        assertSame(rangeAxis, p.getRangeAxis());
        assertSame(renderer, p.getRenderer());
    }

    // ================= getPlotType =================

    @Test
    public void testGetPlotType() {
        assertNotNull(plot.getPlotType());
    }

    // ================= orientation =================

    @Test
    public void testSetOrientationNull() {
        try {
            plot.setOrientation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetOrientationValid() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    // ================= axisOffset =================

    @Test
    public void testSetAxisOffsetNull() {
        try {
            plot.setAxisOffset(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetAxisOffsetValid() {
        RectangleInsets insets = new RectangleInsets(1, 2, 3, 4);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    // ================= domain axis =================

    @Test
    public void testGetDomainAxisOutOfRangeNoParent() {
        assertNull(plot.getDomainAxis(5));
    }

    @Test
    public void testSetDomainAxisAndGet() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxis());
        assertSame(axis, plot.getDomainAxis(0));
    }

    @Test
    public void testSetDomainAxisNotifyFalse() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(0, axis, false);
        assertSame(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetDomainAxesArray() {
        CategoryAxis a0 = new CategoryAxis("A0");
        CategoryAxis a1 = new CategoryAxis("A1");
        plot.setDomainAxes(new CategoryAxis[] {a0, a1});
        assertSame(a0, plot.getDomainAxis(0));
        assertSame(a1, plot.getDomainAxis(1));
    }

    @Test
    public void testGetDomainAxisIndexNullArg() {
        try {
            plot.getDomainAxisIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetDomainAxisIndexFound() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(axis);
        assertEquals(0, plot.getDomainAxisIndex(axis));
    }

    @Test
    public void testGetDomainAxisIndexNotFound() {
        CategoryAxis axis = new CategoryAxis("Domain");
        assertEquals(-1, plot.getDomainAxisIndex(axis));
    }

    // ================= domain axis location =================

    @Test
    public void testGetDomainAxisLocationDefault() {
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
    }

    @Test
    public void testGetDomainAxisLocationFallbackOpposite() {
        // index 1 was never set -> falls back to opposite of index 0
        AxisLocation loc = plot.getDomainAxisLocation(1);
        assertEquals(AxisLocation.getOpposite(plot.getDomainAxisLocation(0)),
                loc);
    }

    @Test
    public void testSetDomainAxisLocationNullIndex0() {
        try {
            plot.setDomainAxisLocation(0, null, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetDomainAxisLocationNullIndexNonZeroFallsBack() {
        // per source, null check only applies to index==0
        plot.setDomainAxisLocation(1, null, true);
        // getDomainAxisLocation(1) still falls back to opposite of index0
        assertEquals(AxisLocation.getOpposite(plot.getDomainAxisLocation(0)),
                plot.getDomainAxisLocation(1));
    }

    @Test
    public void testSetDomainAxisLocationValid() {
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        assertEquals(AxisLocation.TOP_OR_RIGHT, plot.getDomainAxisLocation());
    }

    // ================= domain axis edge / count / clear / configure ====

    @Test
    public void testGetDomainAxisEdge() {
        assertNotNull(plot.getDomainAxisEdge());
    }

    @Test
    public void testGetDomainAxisCount() {
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testClearDomainAxes() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(axis);
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxes() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(axis);
        plot.configureDomainAxes(); // must not throw
    }

    // ================= range axis =================

    @Test
    public void testGetRangeAxisOutOfRangeNoParent() {
        assertNull(plot.getRangeAxis(5));
    }

    @Test
    public void testSetRangeAxisAndGet() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxis());
    }

    @Test
    public void testSetRangeAxesArray() {
        NumberAxis a0 = new NumberAxis("R0");
        NumberAxis a1 = new NumberAxis("R1");
        plot.setRangeAxes(new ValueAxis[] {a0, a1});
        assertSame(a0, plot.getRangeAxis(0));
        assertSame(a1, plot.getRangeAxis(1));
    }

    @Test
    public void testGetRangeAxisIndexNullArg() {
        try {
            plot.getRangeAxisIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetRangeAxisIndexFound() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        assertEquals(0, plot.getRangeAxisIndex(axis));
    }

    @Test
    public void testGetRangeAxisIndexNotFound() {
        NumberAxis axis = new NumberAxis("Range");
        assertEquals(-1, plot.getRangeAxisIndex(axis));
    }

    // ================= range axis location =================

    @Test
    public void testGetRangeAxisLocationDefault() {
        assertEquals(AxisLocation.TOP_OR_LEFT, plot.getRangeAxisLocation());
    }

    @Test
    public void testSetRangeAxisLocationNullIndex0() {
        try {
            plot.setRangeAxisLocation(0, null, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetRangeAxisLocationValid() {
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(AxisLocation.BOTTOM_OR_RIGHT, plot.getRangeAxisLocation());
    }

    // ================= range axis edge / count / clear / configure =====

    @Test
    public void testGetRangeAxisEdge() {
        assertNotNull(plot.getRangeAxisEdge());
    }

    @Test
    public void testGetRangeAxisCount() {
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testClearRangeAxes() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxes() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        plot.configureRangeAxes();
    }

    // ================= dataset =================

    @Test
    public void testGetDatasetOutOfRange() {
        assertNull(plot.getDataset(5));
    }

    @Test
    public void testSetDatasetAndGet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testSetDatasetNull() {
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testGetDatasetCount() {
        assertEquals(1, plot.getDatasetCount());
    }

    // ================= dataset->axis mapping =================

    @Test
    public void testMapDatasetToDomainAxis() {
        CategoryAxis axis0 = new CategoryAxis("A0");
        CategoryAxis axis1 = new CategoryAxis("A1");
        plot.setDomainAxis(0, axis0);
        plot.setDomainAxis(1, axis1);
        plot.mapDatasetToDomainAxis(0, 1);
        assertSame(axis1, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testGetDomainAxisForDatasetDefaultMapping() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxisForDataset(0));
    }

    @Test
    public void testMapDatasetToRangeAxis() {
        NumberAxis axis0 = new NumberAxis("R0");
        NumberAxis axis1 = new NumberAxis("R1");
        plot.setRangeAxis(0, axis0);
        plot.setRangeAxis(1, axis1);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(axis1, plot.getRangeAxisForDataset(0));
    }

    @Test
    public void testGetRangeAxisForDatasetDefaultMapping() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxisForDataset(0));
    }

    // ================= renderer =================

    @Test
    public void testGetRendererOutOfRange() {
        assertNull(plot.getRenderer(5));
    }

    @Test
    public void testSetRendererAndGet() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRendererNotifyFalse() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer, false);
        assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRenderersArray() {
        LineAndShapeRenderer r0 = new LineAndShapeRenderer();
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        plot.setRenderers(new CategoryItemRenderer[] {r0, r1});
        assertSame(r0, plot.getRenderer(0));
        assertSame(r1, plot.getRenderer(1));
    }

    @Test
    public void testGetRendererForDatasetFound() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRendererForDataset(dataset));
    }

    @Test
    public void testGetRendererForDatasetNotFound() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        assertNull(plot.getRendererForDataset(dataset));
    }

    @Test
    public void testGetIndexOfFound() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        assertEquals(0, plot.getIndexOf(renderer));
    }

    @Test
    public void testGetIndexOfNotFound() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        assertEquals(-1, plot.getIndexOf(renderer));
    }

    // ================= dataset rendering order =================

    @Test
    public void testDatasetRenderingOrderDefault() {
        assertEquals(DatasetRenderingOrder.REVERSE,
                plot.getDatasetRenderingOrder());
    }

    @Test
    public void testSetDatasetRenderingOrderNull() {
        try {
            plot.setDatasetRenderingOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetDatasetRenderingOrderValid() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    // ================= column / row rendering order =================

    @Test
    public void testColumnRenderingOrderDefault() {
        assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
    }

    @Test
    public void testSetColumnRenderingOrderNull() {
        try {
            plot.setColumnRenderingOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetColumnRenderingOrderValid() {
        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());
    }

    @Test
    public void testRowRenderingOrderDefault() {
        assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
    }

    @Test
    public void testSetRowRenderingOrderNull() {
        try {
            plot.setRowRenderingOrder(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetRowRenderingOrderValid() {
        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());
    }

    // ================= gridlines =================

    @Test
    public void testDomainGridlinesVisibleDefault() {
        assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlinesVisibleSameValueNoChange() {
        plot.setDomainGridlinesVisible(false); // same as current
        assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlinesVisibleToggle() {
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testDomainGridlinePositionDefault() {
        assertEquals(CategoryAnchor.MIDDLE, plot.getDomainGridlinePosition());
    }

    @Test
    public void testSetDomainGridlinePositionNull() {
        try {
            plot.setDomainGridlinePosition(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetDomainGridlinePositionValid() {
        plot.setDomainGridlinePosition(CategoryAnchor.START);
        assertEquals(CategoryAnchor.START, plot.getDomainGridlinePosition());
    }

    @Test
    public void testSetDomainGridlineStrokeNull() {
        try {
            plot.setDomainGridlineStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetDomainGridlineStrokeValid() {
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainGridlineStroke());
    }

    @Test
    public void testSetDomainGridlinePaintNull() {
        try {
            plot.setDomainGridlinePaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetDomainGridlinePaintValid() {
        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());
    }

    @Test
    public void testRangeGridlinesVisibleDefault() {
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlinesVisibleToggle() {
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlineStrokeNull() {
        try {
            plot.setRangeGridlineStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetRangeGridlineStrokeValid() {
        Stroke stroke = new BasicStroke(3.0f);
        plot.setRangeGridlineStroke(stroke);
        assertSame(stroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testSetRangeGridlinePaintNull() {
        try {
            plot.setRangeGridlinePaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetRangeGridlinePaintValid() {
        plot.setRangeGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());
    }

    // ================= legend items =================

    @Test
    public void testFixedLegendItemsDefaultNull() {
        assertNull(plot.getFixedLegendItems());
    }

    @Test
    public void testSetFixedLegendItems() {
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertSame(items, plot.getFixedLegendItems());
    }

    @Test
    public void testGetLegendItemsUsesFixedItemsWhenSet() {
        LegendItemCollection items = new LegendItemCollection();
        plot.setFixedLegendItems(items);
        assertSame(items, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsNoDatasetNoRenderer() {
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsWithDatasetAndRenderer() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        LegendItemCollection items = plot.getLegendItems();
        assertTrue(items.getItemCount() >= 1);
    }

    // ================= handleClick =================

    @Test
    public void testHandleClickInsideDataAreaVertical() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0, 100);
        plot.setRangeAxis(rangeAxis);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        plot.handleClick(50, 50, info);
        // no exception; anchor value updated somewhere in [0,100]
        assertTrue(plot.getAnchorValue() >= 0.0 && plot.getAnchorValue() <= 100.0);
    }

    @Test
    public void testHandleClickOutsideDataAreaNoChange() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        plot.setRangeAxis(rangeAxis);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        double before = plot.getAnchorValue();
        plot.handleClick(-10, -10, info);
        assertEquals(before, plot.getAnchorValue(), 0.0001);
    }

    @Test
    public void testHandleClickHorizontalOrientation() {
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0, 100);
        plot.setRangeAxis(rangeAxis);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        plot.handleClick(30, 30, info);
        assertTrue(plot.getAnchorValue() >= 0.0 && plot.getAnchorValue() <= 100.0);
    }

    // ================= zoom(percent) =================

    @Test
    public void testZoomPositivePercent() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);
        plot.setRangeAxis(axis);
        plot.setAnchorValue(50.0);
        plot.zoom(0.5);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomZeroPercentRestoresAutoRange() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setAutoRange(false);
        plot.setRangeAxis(axis);
        plot.zoom(0.0);
        assertTrue(plot.getRangeAxis().isAutoRange());
    }

    @Test
    public void testZoomNegativePercentRestoresAutoRange() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setAutoRange(false);
        plot.setRangeAxis(axis);
        plot.zoom(-0.5);
        assertTrue(plot.getRangeAxis().isAutoRange());
    }

    // ================= datasetChanged / rendererChanged =================

    @Test
    public void testDatasetChangedNotifiesListeners() {
        final boolean[] called = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                called[0] = true;
            }
        });
        plot.setDataset(new DefaultCategoryDataset());
        assertTrue(called[0]);
    }

    @Test
    public void testRendererChangedNoParentNotifiesListeners() {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        final boolean[] called = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                called[0] = true;
            }
        });
        plot.rendererChanged(new RendererChangeEvent(renderer));
        assertTrue(called[0]);
    }

    // ================= domain markers =================

    @Test
    public void testAddDomainMarkerNullMarker() {
        try {
            plot.addDomainMarker(0, null, Layer.FOREGROUND, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddDomainMarkerNullLayer() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        try {
            plot.addDomainMarker(0, marker, null, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddDomainMarkerForeground() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testAddDomainMarkerBackgroundWithIndex() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        plot.addDomainMarker(0, marker, Layer.BACKGROUND);
        Collection markers = plot.getDomainMarkers(0, Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testGetDomainMarkersNoneReturnsNull() {
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testClearDomainMarkersByIndex() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        Collection markers = plot.getDomainMarkers(0, Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testClearDomainMarkersAll() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        plot.clearDomainMarkers();
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testRemoveDomainMarkerExisting() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        assertTrue(plot.removeDomainMarker(marker));
    }

    /**
     * FAULT-DETECTION TEST (Chart-14 known defect):
     * removeDomainMarker() must not throw NullPointerException when no
     * marker has ever been added for the given index/layer. The buggy
     * implementation calls markers.remove(marker) without checking that
     * 'markers' is non-null first.
     */
    @Test
    public void testRemoveDomainMarkerNotAdded_ShouldNotThrowNPE() {
        CategoryMarker marker = new CategoryMarker("CatX");
        try {
            boolean removed = plot.removeDomainMarker(marker);
            assertFalse(removed);
        } catch (NullPointerException npe) {
            fail("removeDomainMarker() threw NPE for an index/layer with "
                    + "no markers - this is the known Chart-14 defect.");
        }
    }

    @Test
    public void testRemoveDomainMarkerUnusedIndex_ShouldNotThrowNPE() {
        CategoryMarker marker = new CategoryMarker("Cat1");
        plot.addDomainMarker(0, marker, Layer.FOREGROUND);
        try {
            boolean removed = plot.removeDomainMarker(1, marker, Layer.FOREGROUND);
            assertFalse(removed);
        } catch (NullPointerException npe) {
            fail("removeDomainMarker() threw NPE for unused index 1.");
        }
    }

    // ================= range markers =================

    @Test
    public void testAddRangeMarkerForeground() {
        ValueMarker marker = new ValueMarker(10.0);
        plot.addRangeMarker(marker, Layer.FOREGROUND);
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testAddRangeMarkerBackgroundWithIndex() {
        ValueMarker marker = new ValueMarker(20.0);
        plot.addRangeMarker(0, marker, Layer.BACKGROUND);
        Collection markers = plot.getRangeMarkers(0, Layer.BACKGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(marker));
    }

    @Test
    public void testGetRangeMarkersNoneAtUnusedIndexReturnsNull() {
        // note: constructor adds one baseline background range marker at
        // index 0, but index 1 is untouched
        assertNull(plot.getRangeMarkers(1, Layer.FOREGROUND));
    }

    @Test
    public void testClearRangeMarkersByIndex() {
        ValueMarker marker = new ValueMarker(30.0);
        plot.addRangeMarker(0, marker, Layer.FOREGROUND);
        plot.clearRangeMarkers(0);
        Collection markers = plot.getRangeMarkers(0, Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testClearRangeMarkersAll() {
        plot.clearRangeMarkers();
        Collection markers = plot.getRangeMarkers(0, Layer.BACKGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testRemoveRangeMarkerNullMarker() {
        try {
            plot.removeRangeMarker(0, null, Layer.FOREGROUND, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRemoveRangeMarkerExisting() {
        ValueMarker marker = new ValueMarker(40.0);
        plot.addRangeMarker(marker, Layer.FOREGROUND);
        assertTrue(plot.removeRangeMarker(marker));
    }

    /**
     * FAULT-DETECTION TEST (Chart-14 known defect, range-marker analogue):
     * removeRangeMarker() must not throw NPE when the foreground marker
     * list for this index/layer has never been populated.
     */
    @Test
    public void testRemoveRangeMarkerNotAdded_ShouldNotThrowNPE() {
        ValueMarker marker = new ValueMarker(99.0);
        try {
            boolean removed = plot.removeRangeMarker(marker, Layer.FOREGROUND);
            assertFalse(removed);
        } catch (NullPointerException npe) {
            fail("removeRangeMarker() threw NPE - known Chart-14 defect.");
        }
    }

    // ================= range crosshair =================

    @Test
    public void testRangeCrosshairVisibleDefault() {
        assertFalse(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testSetRangeCrosshairVisibleToggle() {
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testRangeCrosshairLockedOnDataDefault() {
        assertTrue(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testSetRangeCrosshairLockedOnDataToggle() {
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testRangeCrosshairValueDefault() {
        assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testSetRangeCrosshairValueNotVisible_NoNotifyBranch() {
        plot.setRangeCrosshairValue(5.0); // crosshair not visible -> no fire
        assertEquals(5.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testSetRangeCrosshairValueVisible_NotifyBranch() {
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(7.0);
        assertEquals(7.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test
    public void testSetRangeCrosshairStrokeNull() {
        try {
            plot.setRangeCrosshairStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetRangeCrosshairStrokeValid() {
        Stroke stroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(stroke);
        assertSame(stroke, plot.getRangeCrosshairStroke());
    }

    @Test
    public void testSetRangeCrosshairPaintNull() {
        try {
            plot.setRangeCrosshairPaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetRangeCrosshairPaintValid() {
        plot.setRangeCrosshairPaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getRangeCrosshairPaint());
    }

    // ================= annotations =================

    @Test
    public void testGetAnnotationsInitiallyEmpty() {
        List annotations = plot.getAnnotations();
        assertNotNull(annotations);
        assertTrue(annotations.isEmpty());
    }

    @Test
    public void testAddAnnotationNull() {
        try {
            plot.addAnnotation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddAnnotationValid() {
        CategoryTextAnnotation annotation =
                new CategoryTextAnnotation("test", "Cat1", 10.0);
        plot.addAnnotation(annotation);
        assertTrue(plot.getAnnotations().contains(annotation));
    }

    @Test
    public void testRemoveAnnotationNull() {
        try {
            plot.removeAnnotation(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRemoveAnnotationExisting() {
        CategoryTextAnnotation annotation =
                new CategoryTextAnnotation("test", "Cat1", 10.0);
        plot.addAnnotation(annotation);
        assertTrue(plot.removeAnnotation(annotation));
    }

    @Test
    public void testRemoveAnnotationNotExisting() {
        CategoryTextAnnotation annotation =
                new CategoryTextAnnotation("test", "Cat1", 10.0);
        assertFalse(plot.removeAnnotation(annotation));
    }

    @Test
    public void testClearAnnotations() {
        CategoryTextAnnotation annotation =
                new CategoryTextAnnotation("test", "Cat1", 10.0);
        plot.addAnnotation(annotation);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }

    // ================= getDataRange =================

    @Test
    public void testGetDataRangeNoDataset() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        assertNull(plot.getDataRange(axis));
    }

    @Test
    public void testGetDataRangeWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        NumberAxis axis = new NumberAxis("Range");
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        plot.setRangeAxis(axis);
        Range range = plot.getDataRange(axis);
        assertNotNull(range);
    }

    @Test
    public void testGetDataRangeAxisNotMapped() {
        // axis is not the plot's range axis and not in rangeAxes at all
        NumberAxis otherAxis = new NumberAxis("Other");
        assertNull(plot.getDataRange(otherAxis));
    }

    // ================= weight =================

    @Test
    public void testWeightDefaultIsZero() {
        assertEquals(0, plot.getWeight());
    }

    @Test
    public void testSetWeight() {
        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    // ================= fixed axis space =================

    @Test
    public void testFixedDomainAxisSpaceDefaultNull() {
        assertNull(plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testSetFixedDomainAxisSpace() {
        AxisSpace space = new AxisSpace();
        plot.setFixedDomainAxisSpace(space);
        assertSame(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testSetFixedDomainAxisSpaceNoNotify() {
        AxisSpace space = new AxisSpace();
        plot.setFixedDomainAxisSpace(space, false);
        assertSame(space, plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpaceDefaultNull() {
        assertNull(plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testSetFixedRangeAxisSpace() {
        AxisSpace space = new AxisSpace();
        plot.setFixedRangeAxisSpace(space);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testSetFixedRangeAxisSpaceNoNotify() {
        AxisSpace space = new AxisSpace();
        plot.setFixedRangeAxisSpace(space, false);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    // ================= categories =================

    @Test
    public void testGetCategoriesNullDataset() {
        assertNull(plot.getCategories());
    }

    @Test
    public void testGetCategoriesWithDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        plot.setDataset(dataset);
        List categories = plot.getCategories();
        assertEquals(2, categories.size());
    }

    @Test
    public void testGetCategoriesForAxis() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDataset(dataset);
        plot.setDomainAxis(axis);
        List categories = plot.getCategoriesForAxis(axis);
        assertEquals(1, categories.size());
        assertTrue(categories.contains("Col1"));
    }

    // ================= shared domain axis =================

    @Test
    public void testDrawSharedDomainAxisDefaultFalse() {
        assertFalse(plot.getDrawSharedDomainAxis());
    }

    @Test
    public void testSetDrawSharedDomainAxis() {
        plot.setDrawSharedDomainAxis(true);
        assertTrue(plot.getDrawSharedDomainAxis());
    }

    // ================= zoomable / zoom methods =================

    @Test
    public void testIsDomainZoomableFalse() {
        assertFalse(plot.isDomainZoomable());
    }

    @Test
    public void testIsRangeZoomableTrue() {
        assertTrue(plot.isRangeZoomable());
    }

    @Test
    public void testZoomDomainAxesNoOpVariants() {
        // all overloads are no-ops for CategoryPlot; must not throw
        plot.zoomDomainAxes(0.5, null, null);
        plot.zoomDomainAxes(0.2, 0.8, null, null);
        plot.zoomDomainAxes(0.5, null, null, true);
    }

    @Test
    public void testZoomRangeAxesFactorNoAnchor() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);
        plot.setRangeAxis(axis);
        plot.zoomRangeAxes(0.5, null, null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesWithAnchor() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);
        plot.setRangeAxis(axis);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        plot.zoomRangeAxes(0.5, info, new Point2D.Double(50, 50), true);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesLowerUpperPercent() {
        NumberAxis axis = new NumberAxis("Range");
        axis.setRange(0.0, 100.0);
        plot.setRangeAxis(axis);
        plot.zoomRangeAxes(0.2, 0.8, null, null);
        assertNotNull(plot.getRangeAxis().getRange());
    }

    @Test
    public void testZoomRangeAxesWithNullAxisInList() {
        // rangeAxes.get(i) may be null - covers the null-check branch
        plot.clearRangeAxes();
        plot.zoomRangeAxes(0.5, null, null); // no axes -> loop body skipped
    }

    // ================= anchor value =================

    @Test
    public void testAnchorValueDefault() {
        assertEquals(0.0, plot.getAnchorValue(), 0.0001);
    }

    @Test
    public void testSetAnchorValue() {
        plot.setAnchorValue(15.0);
        assertEquals(15.0, plot.getAnchorValue(), 0.0001);
    }

    @Test
    public void testSetAnchorValueNoNotify() {
        plot.setAnchorValue(25.0, false);
        assertEquals(25.0, plot.getAnchorValue(), 0.0001);
    }

    // ================= equals =================

    @Test
    public void testEqualsSameInstance() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsTwoDefaultPlots() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentOrientation() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p2.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentWeight() {
        CategoryPlot p1 = new CategoryPlot();
        CategoryPlot p2 = new CategoryPlot();
        p2.setWeight(99);
        assertFalse(p1.equals(p2));
    }

    // ================= clone =================

    @Test
    public void testClone() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        CategoryPlot p = new CategoryPlot(dataset, domainAxis, rangeAxis,
                renderer);
        CategoryPlot clone = (CategoryPlot) p.clone();
        assertNotSame(p, clone);
        assertEquals(p, clone);
        assertNotSame(p.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(p.getRangeAxis(), clone.getRangeAxis());
    }

    // ================= render() =================

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    @Test
    public void testRenderEmptyDatasetReturnsFalse() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); // empty
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 200);
        boolean found = plot.render(createGraphics(), dataArea, 0, null);
        assertFalse(found);
    }

    @Test
    public void testRenderAscendingColumnAscendingRow() {
        boolean found = renderWithOrders(SortOrder.ASCENDING, SortOrder.ASCENDING);
        assertTrue(found);
    }

    @Test
    public void testRenderDescendingColumnDescendingRow() {
        boolean found = renderWithOrders(SortOrder.DESCENDING, SortOrder.DESCENDING);
        assertTrue(found);
    }

    @Test
    public void testRenderAscendingColumnDescendingRow() {
        boolean found = renderWithOrders(SortOrder.ASCENDING, SortOrder.DESCENDING);
        assertTrue(found);
    }

    @Test
    public void testRenderDescendingColumnAscendingRow() {
        boolean found = renderWithOrders(SortOrder.DESCENDING, SortOrder.ASCENDING);
        assertTrue(found);
    }

    private boolean renderWithOrders(SortOrder columnOrder, SortOrder rowOrder) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        dataset.addValue(3.0, "Row2", "Col1");
        dataset.addValue(4.0, "Row2", "Col2");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);
        plot.setColumnRenderingOrder(columnOrder);
        plot.setRowRenderingOrder(rowOrder);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 200);
        return plot.render(createGraphics(), dataArea, 0, null);
    }

    // ================= draw() =================

    @Test
    public void testDrawAreaTooSmallReturnsWithoutException() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 1, 1);
        // must return quietly (b1 || b2 branch true)
        plot.draw(createGraphics(), area, null, null, null);
    }

    @Test
    public void testDrawNormalVerticalOrientation() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(createGraphics(), area, null, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testDrawNormalHorizontalOrientation() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(createGraphics(), area, null, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testDrawWithDatasetRenderingOrderForward() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(createGraphics(), area, null, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testDrawWithNoRenderer_UsesDefaultBackground() {
        // getRenderer() == null branch inside draw()
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        plot.setDataset(dataset);
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(createGraphics(), area, null, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testDrawWithRangeCrosshairVisible() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        CategoryAxis domainAxis = new CategoryAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        rangeAxis.setRange(0, 10);
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);
        plot.setRangeCrosshairVisible(true);
        plot.setRangeCrosshairValue(5.0);

        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(createGraphics(), area, null, null, info);
        assertNotNull(info.getDataArea());
    }
}
